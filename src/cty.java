import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cty implements ctg {
   final String a;
   final ctf b;
   final cqm c;
   final iu<ctm> d;

   public cty(String $$0, ctf $$1, cqm $$2, iu<ctm> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public ctt<?> ar_() {
      return ctt.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public ctf d() {
      return this.b;
   }

   @Override
   public cqm a(iz $$0) {
      return this.c;
   }

   @Override
   public iu<ctm> a() {
      return this.d;
   }

   public boolean a(cmg $$0, cxb $$1) {
      ciy $$2 = new ciy();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqm $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cqm a(cmg $$0, iz $$1) {
      return this.c.q();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements ctt<cty> {
      private static final Codec<cty> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awe.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  ctf.e.fieldOf("category").orElse(ctf.d).forGetter($$0x -> $$0x.b),
                  cqm.c.fieldOf("result").forGetter($$0x -> $$0x.c),
                  ctm.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     ctm[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(ctm[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(iu.a(ctm.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cty::new)
      );
      public static final xs<vf, cty> x = xs.a(cty.a::a, cty.a::a);

      @Override
      public Codec<cty> a() {
         return y;
      }

      @Override
      public xs<vf, cty> b() {
         return x;
      }

      private static cty a(vf $$0) {
         String $$1 = $$0.p();
         ctf $$2 = $$0.b(ctf.class);
         int $$3 = $$0.l();
         iu<ctm> $$4 = iu.a($$3, ctm.a);
         $$4.replaceAll($$1x -> ctm.b.decode($$0));
         cqm $$5 = cqm.f.decode($$0);
         return new cty($$1, $$2, $$5, $$4);
      }

      private static void a(vf $$0, cty $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (ctm $$2 : $$1.d) {
            ctm.b.encode($$0, $$2);
         }

         cqm.f.encode($$0, $$1.c);
      }
   }
}
