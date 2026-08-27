import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cso implements crw {
   final String a;
   final crv b;
   final cpd c;
   final is<csc> d;

   public cso(String $$0, crv $$1, cpd $$2, is<csc> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public csj<?> at_() {
      return csj.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public crv d() {
      return this.b;
   }

   @Override
   public cpd a(iw $$0) {
      return this.c;
   }

   @Override
   public is<csc> a() {
      return this.d;
   }

   public boolean a(ckv $$0, cvr $$1) {
      chp $$2 = new chp();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpd $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cpd a(ckv $$0, iw $$1) {
      return this.c.q();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements csj<cso> {
      private static final Codec<cso> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avq.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  crv.e.fieldOf("category").orElse(crv.d).forGetter($$0x -> $$0x.b),
                  cpd.c.fieldOf("result").forGetter($$0x -> $$0x.c),
                  csc.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     csc[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(csc[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(is.a(csc.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cso::new)
      );
      public static final xo<vb, cso> x = xo.a(cso.a::a, cso.a::a);

      @Override
      public Codec<cso> a() {
         return y;
      }

      @Override
      public xo<vb, cso> b() {
         return x;
      }

      private static cso a(vb $$0) {
         String $$1 = $$0.r();
         crv $$2 = $$0.b(crv.class);
         int $$3 = $$0.n();
         is<csc> $$4 = is.a($$3, csc.a);
         $$4.replaceAll($$1x -> csc.b.decode($$0));
         cpd $$5 = cpd.f.decode($$0);
         return new cso($$1, $$2, $$5, $$4);
      }

      private static void a(vb $$0, cso $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (csc $$2 : $$1.d) {
            csc.b.encode($$0, $$2);
         }

         cpd.f.encode($$0, $$1.c);
      }
   }
}
