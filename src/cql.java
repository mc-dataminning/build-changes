import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cql implements cpt {
   final String a;
   final cps b;
   final cmy c;
   final iq<cpz> d;

   public cql(String $$0, cps $$1, cmy $$2, iq<cpz> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cqg<?> ar_() {
      return cqg.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cps d() {
      return this.b;
   }

   @Override
   public cmy a(iu $$0) {
      return this.c;
   }

   @Override
   public iq<cpz> a() {
      return this.d;
   }

   public boolean a(cir $$0, ctp $$1) {
      cfm $$2 = new cfm();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cmy a(cir $$0, iu $$1) {
      return this.c.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cqg<cql> {
      private static final Codec<cql> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atw.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cps.e.fieldOf("category").orElse(cps.d).forGetter($$0x -> $$0x.b),
                  cmy.c.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cpz.c.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cpz[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cpz[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(iq.a(cpz.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cql::new)
      );

      @Override
      public Codec<cql> a() {
         return x;
      }

      public cql b(ui $$0) {
         String $$1 = $$0.s();
         cps $$2 = $$0.b(cps.class);
         int $$3 = $$0.n();
         iq<cpz> $$4 = iq.a($$3, cpz.a);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, cpz.b($$0));
         }

         cmy $$6 = $$0.r();
         return new cql($$1, $$2, $$6, $$4);
      }

      public void a(ui $$0, cql $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cpz $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
