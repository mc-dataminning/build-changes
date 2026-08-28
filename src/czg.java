import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czg implements cyo {
   final String a;
   final cyn b;
   final cur c;
   final jr<cyu> d;

   public czg(String $$0, cyn $$1, cur $$2, jr<cyu> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public czb<?> ao_() {
      return czb.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cyn d() {
      return this.b;
   }

   @Override
   public cur a(jk.a $$0) {
      return this.c;
   }

   @Override
   public jr<cyu> a() {
      return this.d;
   }

   public boolean a(cqm $$0, dca $$1) {
      cnd $$2 = new cnd();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         if (!$$5.e()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cur a(cqm $$0, jk.a $$1) {
      return this.c.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements czb<czg> {
      private static final MapCodec<czg> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  cyn.e.fieldOf("category").orElse(cyn.d).forGetter($$0x -> $$0x.b),
                  cur.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cyu.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cyu[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cyu[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(jr.a(cyu.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, czg::new)
      );
      public static final zn<xa, czg> x = zn.a(czg.a::a, czg.a::a);

      @Override
      public MapCodec<czg> a() {
         return y;
      }

      @Override
      public zn<xa, czg> b() {
         return x;
      }

      private static czg a(xa $$0) {
         String $$1 = $$0.p();
         cyn $$2 = $$0.b(cyn.class);
         int $$3 = $$0.l();
         jr<cyu> $$4 = jr.a($$3, cyu.a);
         $$4.replaceAll($$1x -> cyu.b.decode($$0));
         cur $$5 = cur.i.decode($$0);
         return new czg($$1, $$2, $$5, $$4);
      }

      private static void a(xa $$0, czg $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cyu $$2 : $$1.d) {
            cyu.b.encode($$0, $$2);
         }

         cur.i.encode($$0, $$1.c);
      }
   }
}
