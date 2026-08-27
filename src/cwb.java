import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwb implements cvj {
   final String a;
   final cvi b;
   final crs c;
   final iw<cvp> d;

   public cwb(String $$0, cvi $$1, crs $$2, iw<cvp> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public cvw<?> ao_() {
      return cvw.b;
   }

   @Override
   public String c() {
      return this.a;
   }

   @Override
   public cvi d() {
      return this.b;
   }

   @Override
   public crs a(jb $$0) {
      return this.c;
   }

   @Override
   public iw<cvp> a() {
      return this.d;
   }

   public boolean a(cnm $$0, czg $$1) {
      cke $$2 = new cke();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
            $$3++;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public crs a(cnm $$0, jb $$1) {
      return this.c.r();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cvw<cwb> {
      private static final Codec<cwb> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awu.a(Codec.STRING, "group", "").forGetter($$0x -> $$0x.a),
                  cvi.e.fieldOf("category").orElse(cvi.d).forGetter($$0x -> $$0x.b),
                  crs.a.fieldOf("result").forGetter($$0x -> $$0x.c),
                  cvp.d.listOf().fieldOf("ingredients").flatXmap($$0x -> {
                     cvp[] $$1 = $$0x.stream().filter($$0xx -> !$$0xx.c()).toArray(cvp[]::new);
                     if ($$1.length == 0) {
                        return DataResult.error(() -> "No ingredients for shapeless recipe");
                     } else {
                        return $$1.length > 9 ? DataResult.error(() -> "Too many ingredients for shapeless recipe") : DataResult.success(iw.a(cvp.a, $$1));
                     }
                  }, DataResult::success).forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cwb::new)
      );
      public static final yg<vt, cwb> x = yg.a(cwb.a::a, cwb.a::a);

      @Override
      public Codec<cwb> a() {
         return y;
      }

      @Override
      public yg<vt, cwb> b() {
         return x;
      }

      private static cwb a(vt $$0) {
         String $$1 = $$0.p();
         cvi $$2 = $$0.b(cvi.class);
         int $$3 = $$0.l();
         iw<cvp> $$4 = iw.a($$3, cvp.a);
         $$4.replaceAll($$1x -> cvp.b.decode($$0));
         crs $$5 = crs.f.decode($$0);
         return new cwb($$1, $$2, $$5, $$4);
      }

      private static void a(vt $$0, cwb $$1) {
         $$0.a($$1.a);
         $$0.a($$1.b);
         $$0.c($$1.d.size());

         for (cvp $$2 : $$1.d) {
            cvp.b.encode($$0, $$2);
         }

         crs.f.encode($$0, $$1.c);
      }
   }
}
