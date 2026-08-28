import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czd implements cyl {
   final String a;
   final cyk b;
   final cuo c;
   final jr<cyr> d;

   public czd(String $$0, cyk $$1, cuo $$2, jr<cyr> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cyy<?> ao_() {
      return cyy.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cyk d() {
      return this.b;
   }

   @Override
   public cuo a(jk.a $$0) {
      return this.c;
   }

   @Override
   public jr<cyr> a() {
      return this.d;
   }

   public boolean a(cqj $$0, dbx $$1) {
      cna $$2 = new cna();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cuo a(cqj $$0, jk.a $$1) {
      return this.c.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cyy<czd> {
      private static final MapCodec<czd> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  cyk.e.fieldOf("category").orElse(cyk.d).forGetter($$0x -> $$0x.b),
                  cuo.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cyr.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cyr[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cyr[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(jr.a(cyr.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czd::new)
      );
      public static final zm<wz, czd> x = zm.a(czd.a::a, czd.a::a);

      @Override
      public MapCodec<czd> a() {
         return y;
      }

      @Override
      public zm<wz, czd> b() {
         return x;
      }

      private static czd a(wz $$0) {
         String $$1 = $$0.p();
         cyk $$2 = $$0.b(cyk.class);
         int $$3 = $$0.l();
         jr<cyr> $$4 = jr.a($$3, cyr.a);
         $$4.replaceAll($$1x -> cyr.b.decode($$0));
         cuo $$5 = cuo.i.decode($$0);
         return new czd($$1, $$2, $$5, $$4);
      }

      private static void a(wz $$0, czd $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cyr $$2 : $$1.d) {
            cyr.b.encode($$0, $$2);
         }

         cuo.i.encode($$0, $$1.c);
      }
   }
}
