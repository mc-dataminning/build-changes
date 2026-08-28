import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czc implements cyk {
   final String a;
   final cyj b;
   final cun c;
   final jr<cyq> d;

   public czc(String $$0, cyj $$1, cun $$2, jr<cyq> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cyx<?> ap_() {
      return cyx.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cyj d() {
      return this.b;
   }

   @Override
   public cun a(jk.a $$0) {
      return this.c;
   }

   @Override
   public jr<cyq> a() {
      return this.d;
   }

   public boolean a(cqi $$0, dbw $$1) {
      cmz $$2 = new cmz();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cun $$5 = $$0.a($$4);
         if (!$$5.e()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cun a(cqi $$0, jk.a $$1) {
      return this.c.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cyx<czc> {
      private static final MapCodec<czc> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  cyj.e.fieldOf("category").orElse(cyj.d).forGetter($$0x -> $$0x.b),
                  cun.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cyq.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cyq[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cyq[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(jr.a(cyq.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czc::new)
      );
      public static final zm<wz, czc> x = zm.a(czc.a::a, czc.a::a);

      @Override
      public MapCodec<czc> a() {
         return y;
      }

      @Override
      public zm<wz, czc> b() {
         return x;
      }

      private static czc a(wz $$0) {
         String $$1 = $$0.p();
         cyj $$2 = $$0.b(cyj.class);
         int $$3 = $$0.l();
         jr<cyq> $$4 = jr.a($$3, cyq.a);
         $$4.replaceAll($$1x -> cyq.b.decode($$0));
         cun $$5 = cun.i.decode($$0);
         return new czc($$1, $$2, $$5, $$4);
      }

      private static void a(wz $$0, czc $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cyq $$2 : $$1.d) {
            cyq.b.encode($$0, $$2);
         }

         cun.i.encode($$0, $$1.c);
      }
   }
}
