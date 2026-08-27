import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqk implements cps {
   final String a;
   final cpr b;
   final cmx c;
   final iq<cpy> d;

   public cqk(String $$0, cpr $$1, cmx $$2, iq<cpy> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cqf<?> ar_() {
      return cqf.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cpr d() {
      return this.b;
   }

   @Override
   public cmx a(iu $$0) {
      return this.c;
   }

   @Override
   public iq<cpy> a() {
      return this.d;
   }

   public boolean a(ciq $$0, cto $$1) {
      cfl $$2 = new cfl();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmx $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cmx a(ciq $$0, iu $$1) {
      return this.c.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cqf<cqk> {
      private static final Codec<cqk> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atv.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cpr.e.fieldOf("category").orElse(cpr.d).forGetter($$0x -> $$0x.b),
                  cmx.c.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cpy.c.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cpy[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cpy[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(iq.a(cpy.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cqk::new)
      );

      @Override
      public Codec<cqk> a() {
         return x;
      }

      public cqk b(ui $$0) {
         String $$1 = $$0.s();
         cpr $$2 = $$0.b(cpr.class);
         int $$3 = $$0.n();
         iq<cpy> $$4 = iq.a($$3, cpy.a);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, cpy.b($$0));
         }

         cmx $$6 = $$0.r();
         return new cqk($$1, $$2, $$6, $$4);
      }

      public void a(ui $$0, cqk $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cpy $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
