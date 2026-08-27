import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cmw implements cmf {
   final String a;
   final cme b;
   final cjl c;
   final hn<cmm> d;

   public cmw(String $$0, cme $$1, cjl $$2, hn<cmm> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cms<?> an_() {
      return cms.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cme d() {
      return this.b;
   }

   @Override
   public cjl a(hr $$0) {
      return this.c;
   }

   @Override
   public hn<cmm> a() {
      return this.d;
   }

   public boolean a(cff $$0, cqb $$1) {
      cce $$2 = new cce();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
         if (!$$5.b()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cjl a(cff $$0, hr $$1) {
      return this.c.p();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cms<cmw> {
      private static final Codec<cmw> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  arj.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cme.e.fieldOf("category").orElse(cme.d).forGetter($$0x -> $$0x.b),
                  cmg.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cmm.c.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cmm[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cmm[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(hn.a(cmm.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cmw::new)
      );

      @Override
      public Codec<cmw> a() {
         return x;
      }

      public cmw b(so $$0) {
         String $$1 = $$0.s();
         cme $$2 = $$0.b(cme.class);
         int $$3 = $$0.n();
         hn<cmm> $$4 = hn.a($$3, cmm.a);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, cmm.b($$0));
         }

         cjl $$6 = $$0.r();
         return new cmw($$1, $$2, $$6, $$4);
      }

      public void a(so $$0, cmw $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cmm $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
