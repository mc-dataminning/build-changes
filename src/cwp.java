import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwp implements cvx {
   final String a;
   final cvw b;
   final csd c;
   final je<cwd> d;

   public cwp(String $$0, cvw $$1, csd $$2, je<cwd> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cwk<?> ao_() {
      return cwk.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cvw d() {
      return this.b;
   }

   @Override
   public csd a(jj $$0) {
      return this.c;
   }

   @Override
   public je<cwd> a() {
      return this.d;
   }

   public boolean a(cnx $$0, czu $$1) {
      ckp $$2 = new ckp();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public csd a(cnx $$0, jj $$1) {
      return this.c.r();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cwk<cwp> {
      private static final Codec<cwp> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cvw.e.fieldOf("category").orElse(cvw.d).forGetter($$0x -> $$0x.b),
                  csd.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cwd.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cwd[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cwd[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(je.a(cwd.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cwp::new)
      );
      public static final yq<wd, cwp> x = yq.a(cwp.a::a, cwp.a::a);

      @Override
      public Codec<cwp> a() {
         return y;
      }

      @Override
      public yq<wd, cwp> b() {
         return x;
      }

      private static cwp a(wd $$0) {
         String $$1 = $$0.p();
         cvw $$2 = $$0.b(cvw.class);
         int $$3 = $$0.l();
         je<cwd> $$4 = je.a($$3, cwd.a);
         $$4.replaceAll($$1x -> cwd.b.decode($$0));
         csd $$5 = csd.f.decode($$0);
         return new cwp($$1, $$2, $$5, $$4);
      }

      private static void a(wd $$0, cwp $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cwd $$2 : $$1.d) {
            cwd.b.encode($$0, $$2);
         }

         csd.f.encode($$0, $$1.c);
      }
   }
}
