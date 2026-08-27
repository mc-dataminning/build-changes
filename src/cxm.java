import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxm implements cwu {
   final String a;
   final cwt b;
   final csz c;
   final jf<cxa> d;

   public cxm(String $$0, cwt $$1, csz $$2, jf<cxa> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cxh<?> ao_() {
      return cxh.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cwt d() {
      return this.b;
   }

   @Override
   public csz a(iy.a $$0) {
      return this.c;
   }

   @Override
   public jf<cxa> a() {
      return this.d;
   }

   public boolean a(cou $$0, dad $$1) {
      cll $$2 = new cll();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csz $$5 = $$0.a($$4);
         if (!$$5.d()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public csz a(cou $$0, iy.a $$1) {
      return this.c.r();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cxh<cxm> {
      private static final Codec<cxm> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cwt.e.fieldOf("category").orElse(cwt.d).forGetter($$0x -> $$0x.b),
                  csz.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cxa.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cxa[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cxa[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(jf.a(cxa.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cxm::new)
      );
      public static final ys<wf, cxm> x = ys.a(cxm.a::a, cxm.a::a);

      @Override
      public Codec<cxm> a() {
         return y;
      }

      @Override
      public ys<wf, cxm> b() {
         return x;
      }

      private static cxm a(wf $$0) {
         String $$1 = $$0.p();
         cwt $$2 = $$0.b(cwt.class);
         int $$3 = $$0.l();
         jf<cxa> $$4 = jf.a($$3, cxa.a);
         $$4.replaceAll($$1x -> cxa.b.decode($$0));
         csz $$5 = csz.f.decode($$0);
         return new cxm($$1, $$2, $$5, $$4);
      }

      private static void a(wf $$0, cxm $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cxa $$2 : $$1.d) {
            cxa.b.encode($$0, $$2);
         }

         csz.f.encode($$0, $$1.c);
      }
   }
}
