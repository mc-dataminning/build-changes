import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cze implements cym {
   final String a;
   final cyl b;
   final cup c;
   final jr<cys> d;

   public cze(String $$0, cyl $$1, cup $$2, jr<cys> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cyz<?> ao_() {
      return cyz.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cyl d() {
      return this.b;
   }

   @Override
   public cup a(jk.a $$0) {
      return this.c;
   }

   @Override
   public jr<cys> a() {
      return this.d;
   }

   public boolean a(cqk $$0, dby $$1) {
      cnb $$2 = new cnb();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         if (!$$5.e()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cup a(cqk $$0, jk.a $$1) {
      return this.c.s();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cyz<cze> {
      private static final MapCodec<cze> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.a),
                  cyl.e.fieldOf("category").orElse(cyl.d).forGetter($$0x -> $$0x.b),
                  cup.d.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cys.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cys[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cys[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(jr.a(cys.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cze::new)
      );
      public static final zn<xa, cze> x = zn.a(cze.a::a, cze.a::a);

      @Override
      public MapCodec<cze> a() {
         return y;
      }

      @Override
      public zn<xa, cze> b() {
         return x;
      }

      private static cze a(xa $$0) {
         String $$1 = $$0.p();
         cyl $$2 = $$0.b(cyl.class);
         int $$3 = $$0.l();
         jr<cys> $$4 = jr.a($$3, cys.a);
         $$4.replaceAll($$1x -> cys.b.decode($$0));
         cup $$5 = cup.i.decode($$0);
         return new cze($$1, $$2, $$5, $$4);
      }

      private static void a(xa $$0, cze $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cys $$2 : $$1.d) {
            cys.b.encode($$0, $$2);
         }

         cup.i.encode($$0, $$1.c);
      }
   }
}
