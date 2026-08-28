import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyz implements cyh {
   final String a;
   final cyg b;
   final cuk c;
   final jr<cyn> d;

   public cyz(String $$0, cyg $$1, cuk $$2, jr<cyn> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cyu<?> ap_() {
      return cyu.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cyg d() {
      return this.b;
   }

   @Override
   public cuk a(jk.a $$0) {
      return this.c;
   }

   @Override
   public jr<cyn> a() {
      return this.d;
   }

   public boolean a(cqf $$0, dbt $$1) {
      cmw $$2 = new cmw();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         if (!$$5.e()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cuk a(cqf $$0, jk.a $$1) {
      return this.c.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cyu<cyz> {
      private static final MapCodec<cyz> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  cyg.e.fieldOf("category").orElse(cyg.d).forGetter($$0x -> $$0x.b),
                  cuk.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cyn.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cyn[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cyn[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(jr.a(cyn.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cyz::new)
      );
      public static final zj<ww, cyz> x = zj.a(cyz.a::a, cyz.a::a);

      @Override
      public MapCodec<cyz> a() {
         return y;
      }

      @Override
      public zj<ww, cyz> b() {
         return x;
      }

      private static cyz a(ww $$0) {
         String $$1 = $$0.p();
         cyg $$2 = $$0.b(cyg.class);
         int $$3 = $$0.l();
         jr<cyn> $$4 = jr.a($$3, cyn.a);
         $$4.replaceAll($$1x -> cyn.b.decode($$0));
         cuk $$5 = cuk.i.decode($$0);
         return new cyz($$1, $$2, $$5, $$4);
      }

      private static void a(ww $$0, cyz $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cyn $$2 : $$1.d) {
            cyn.b.encode($$0, $$2);
         }

         cuk.i.encode($$0, $$1.c);
      }
   }
}
