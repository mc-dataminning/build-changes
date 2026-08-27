import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cmq implements clz {
   final String a;
   final cly b;
   final cjf c;
   final hp<cmg> d;

   public cmq(String $$0, cly $$1, cjf $$2, hp<cmg> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cmm<?> an_() {
      return cmm.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cly d() {
      return this.b;
   }

   @Override
   public cjf a(hu $$0) {
      return this.c;
   }

   @Override
   public hp<cmg> a() {
      return this.d;
   }

   public boolean a(cez $$0, cpv $$1) {
      cby $$2 = new cby();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjf $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cjf a(cez $$0, hu $$1) {
      return this.c.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cmm<cmq> {
      private static final Codec<cmq> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  arg.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cly.e.fieldOf("category").orElse(cly.d).forGetter($$0x -> $$0x.b),
                  cma.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cmg.c.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cmg[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cmg[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(hp.a(cmg.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cmq::new)
      );

      @Override
      public Codec<cmq> a() {
         return x;
      }

      public cmq b(sp $$0) {
         String $$1 = $$0.r();
         cly $$2 = $$0.b(cly.class);
         int $$3 = $$0.m();
         hp<cmg> $$4 = hp.a($$3, cmg.a);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, cmg.b($$0));
         }

         cjf $$6 = $$0.q();
         return new cmq($$1, $$2, $$6, $$4);
      }

      public void a(sp $$0, cmq $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cmg $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
