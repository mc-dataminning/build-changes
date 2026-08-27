import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bvi extends buh implements bjv<bvi.b> {
   public static final String b = "BucketVariantTag";
   private static final adx<Integer> d = aea.a(bvi.class, adz.b);
   public static final List<bvi.d> c = List.of(
      new bvi.d(bvi.b.h, chk.b, chk.h),
      new bvi.d(bvi.b.g, chk.h, chk.h),
      new bvi.d(bvi.b.g, chk.h, chk.l),
      new bvi.d(bvi.b.l, chk.a, chk.h),
      new bvi.d(bvi.b.b, chk.l, chk.h),
      new bvi.d(bvi.b.a, chk.b, chk.a),
      new bvi.d(bvi.b.f, chk.g, chk.d),
      new bvi.d(bvi.b.j, chk.k, chk.e),
      new bvi.d(bvi.b.l, chk.a, chk.o),
      new bvi.d(bvi.b.f, chk.a, chk.e),
      new bvi.d(bvi.b.i, chk.a, chk.h),
      new bvi.d(bvi.b.l, chk.a, chk.b),
      new bvi.d(bvi.b.d, chk.j, chk.g),
      new bvi.d(bvi.b.e, chk.f, chk.d),
      new bvi.d(bvi.b.k, chk.o, chk.a),
      new bvi.d(bvi.b.c, chk.h, chk.o),
      new bvi.d(bvi.b.j, chk.o, chk.a),
      new bvi.d(bvi.b.g, chk.a, chk.e),
      new bvi.d(bvi.b.a, chk.o, chk.a),
      new bvi.d(bvi.b.b, chk.h, chk.a),
      new bvi.d(bvi.b.d, chk.j, chk.e),
      new bvi.d(bvi.b.g, chk.e, chk.e)
   );
   private boolean e = true;

   public bvi(bik<? extends bvi> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bvi.b $$0, chk $$1, chk $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static chk s(int $$0) {
      return chk.a($$0 >> 16 & 0xFF);
   }

   public static chk t(int $$0) {
      return chk.a($$0 >> 24 & 0xFF);
   }

   public static bvi.b u(int $$0) {
      return bvi.b.a($$0 & 65535);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, 0);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Variant", this.gl());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.v($$0.h("Variant"));
   }

   private void v(int $$0) {
      this.an.b(d, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.e;
   }

   private int gl() {
      return this.an.b(d);
   }

   public chk gi() {
      return s(this.gl());
   }

   public chk gj() {
      return t(this.gl());
   }

   public bvi.b gk() {
      return u(this.gl());
   }

   public void a(bvi.b $$0) {
      int $$1 = this.gl();
      chk $$2 = s($$1);
      chk $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(ciw $$0) {
      super.l($$0);
      qs $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gl());
   }

   @Override
   public ciw b() {
      return new ciw(ciz.pU);
   }

   @Override
   protected aot r() {
      return aou.xU;
   }

   @Override
   protected aot h_() {
      return aou.xV;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.xX;
   }

   @Override
   protected aot ga() {
      return aou.xW;
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bja.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         art $$5 = $$0.y_();
         bvi.d $$7;
         if ($$3 instanceof bvi.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bvi.c(this, $$7);
         } else {
            this.e = false;
            bvi.b[] $$9 = bvi.b.values();
            chk[] $$10 = chk.values();
            bvi.b $$11 = ac.a($$9, $$5);
            chk $$12 = ac.a($$10, $$5);
            chk $$13 = ac.a($$10, $$5);
            $$7 = new bvi.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(bik<bvi> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.b_($$3.d()).a(apo.a) && $$1.a_($$3.c()).a(csl.G) && ($$1.s($$3).a(api.am) || bvk.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements asf {
      a("kob", bvi.a.a, 0),
      b("sunstreak", bvi.a.a, 1),
      c("snooper", bvi.a.a, 2),
      d("dasher", bvi.a.a, 3),
      e("brinely", bvi.a.a, 4),
      f("spotty", bvi.a.a, 5),
      g("flopper", bvi.a.b, 0),
      h("stripey", bvi.a.b, 1),
      i("glitter", bvi.a.b, 2),
      j("blockfish", bvi.a.b, 3),
      k("betty", bvi.a.b, 4),
      l("clayfish", bvi.a.b, 5);

      public static final Codec<bvi.b> m = asf.a(bvi.b::values);
      private static final IntFunction<bvi.b> n = aqi.a(bvi.b::b, values(), a);
      private final String o;
      private final te p;
      private final bvi.a q;
      private final int r;

      private b(String $$0, bvi.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = te.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bvi.b a(int $$0) {
         return n.apply($$0);
      }

      public bvi.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public te d() {
         return this.p;
      }
   }

   static class c extends buh.a {
      final bvi.d b;

      c(bvi $$0, bvi.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bvi.b a, chk b, chk c) {
      public int a() {
         return bvi.a(this.a, this.b, this.c);
      }

      public bvi.b b() {
         return this.a;
      }

      public chk c() {
         return this.b;
      }

      public chk d() {
         return this.c;
      }
   }
}
