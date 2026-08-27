import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqe implements cpm {
   final String a;
   final cpl b;
   final cmr c;
   final iq<cps> d;

   public cqe(String $$0, cpl $$1, cmr $$2, iq<cps> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cpz<?> ar_() {
      return cpz.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cpl d() {
      return this.b;
   }

   @Override
   public cmr a(iu $$0) {
      return this.c;
   }

   @Override
   public iq<cps> a() {
      return this.d;
   }

   public boolean a(cik $$0, cti $$1) {
      cff $$2 = new cff();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmr $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cmr a(cik $$0, iu $$1) {
      return this.c.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cpz<cqe> {
      private static final Codec<cqe> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atq.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cpl.e.fieldOf("category").orElse(cpl.d).forGetter($$0x -> $$0x.b),
                  cmr.c.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cps.c.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cps[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cps[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(iq.a(cps.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cqe::new)
      );

      @Override
      public Codec<cqe> a() {
         return x;
      }

      public cqe b(ug $$0) {
         String $$1 = $$0.s();
         cpl $$2 = $$0.b(cpl.class);
         int $$3 = $$0.n();
         iq<cps> $$4 = iq.a($$3, cps.a);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, cps.b($$0));
         }

         cmr $$6 = $$0.r();
         return new cqe($$1, $$2, $$6, $$4);
      }

      public void a(ug $$0, cqe $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cps $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
