import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqt implements cqb {
   final String a;
   final cqa b;
   final cng c;
   final iq<cqh> d;

   public cqt(String $$0, cqa $$1, cng $$2, iq<cqh> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cqo<?> at_() {
      return cqo.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cqa d() {
      return this.b;
   }

   @Override
   public cng a(iu $$0) {
      return this.c;
   }

   @Override
   public iq<cqh> a() {
      return this.d;
   }

   public boolean a(ciz $$0, ctx $$1) {
      cfu $$2 = new cfu();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cng a(ciz $$0, iu $$1) {
      return this.c.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cqo<cqt> {
      private static final Codec<cqt> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atx.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cqa.e.fieldOf("category").orElse(cqa.d).forGetter($$0x -> $$0x.b),
                  cng.c.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cqh.c.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cqh[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cqh[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(iq.a(cqh.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cqt::new)
      );

      @Override
      public Codec<cqt> a() {
         return x;
      }

      public cqt b(uj $$0) {
         String $$1 = $$0.s();
         cqa $$2 = $$0.b(cqa.class);
         int $$3 = $$0.n();
         iq<cqh> $$4 = iq.a($$3, cqh.a);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, cqh.b($$0));
         }

         cng $$6 = $$0.r();
         return new cqt($$1, $$2, $$6, $$4);
      }

      public void a(uj $$0, cqt $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cqh $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
