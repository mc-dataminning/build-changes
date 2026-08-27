import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bvj extends bui implements bjw<bvj.b> {
   public static final String b = "BucketVariantTag";
   private static final adz<Integer> d = aec.a(bvj.class, aeb.b);
   public static final List<bvj.d> c = List.of(
      new bvj.d(bvj.b.h, chl.b, chl.h),
      new bvj.d(bvj.b.g, chl.h, chl.h),
      new bvj.d(bvj.b.g, chl.h, chl.l),
      new bvj.d(bvj.b.l, chl.a, chl.h),
      new bvj.d(bvj.b.b, chl.l, chl.h),
      new bvj.d(bvj.b.a, chl.b, chl.a),
      new bvj.d(bvj.b.f, chl.g, chl.d),
      new bvj.d(bvj.b.j, chl.k, chl.e),
      new bvj.d(bvj.b.l, chl.a, chl.o),
      new bvj.d(bvj.b.f, chl.a, chl.e),
      new bvj.d(bvj.b.i, chl.a, chl.h),
      new bvj.d(bvj.b.l, chl.a, chl.b),
      new bvj.d(bvj.b.d, chl.j, chl.g),
      new bvj.d(bvj.b.e, chl.f, chl.d),
      new bvj.d(bvj.b.k, chl.o, chl.a),
      new bvj.d(bvj.b.c, chl.h, chl.o),
      new bvj.d(bvj.b.j, chl.o, chl.a),
      new bvj.d(bvj.b.g, chl.a, chl.e),
      new bvj.d(bvj.b.a, chl.o, chl.a),
      new bvj.d(bvj.b.b, chl.h, chl.a),
      new bvj.d(bvj.b.d, chl.j, chl.e),
      new bvj.d(bvj.b.g, chl.e, chl.e)
   );
   private boolean e = true;

   public bvj(bim<? extends bvj> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bvj.b $$0, chl $$1, chl $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static chl s(int $$0) {
      return chl.a($$0 >> 16 & 0xFF);
   }

   public static chl t(int $$0) {
      return chl.a($$0 >> 24 & 0xFF);
   }

   public static bvj.b u(int $$0) {
      return bvj.b.a($$0 & 65535);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, 0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm());
   }

   @Override
   public void a(qr $$0) {
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

   private int gm() {
      return this.an.b(d);
   }

   public chl gj() {
      return s(this.gm());
   }

   public chl gk() {
      return t(this.gm());
   }

   public bvj.b gl() {
      return u(this.gm());
   }

   public void a(bvj.b $$0) {
      int $$1 = this.gm();
      chl $$2 = s($$1);
      chl $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(cix $$0) {
      super.l($$0);
      qr $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gm());
   }

   @Override
   public cix b() {
      return new cix(cja.pU);
   }

   @Override
   protected aov r() {
      return aow.xZ;
   }

   @Override
   protected aov h_() {
      return aow.ya;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.yc;
   }

   @Override
   protected aov gb() {
      return aow.yb;
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bjc.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         aru $$5 = $$0.y_();
         bvj.d $$7;
         if ($$3 instanceof bvj.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bvj.c(this, $$7);
         } else {
            this.e = false;
            bvj.b[] $$9 = bvj.b.values();
            chl[] $$10 = chl.values();
            bvj.b $$11 = ac.a($$9, $$5);
            chl $$12 = ac.a($$10, $$5);
            chl $$13 = ac.a($$10, $$5);
            $$7 = new bvj.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(bim<bvj> $$0, cpm $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.b_($$3.d()).a(apq.a) && $$1.a_($$3.c()).a(csm.G) && ($$1.s($$3).a(apk.am) || bvl.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements ash {
      a("kob", bvj.a.a, 0),
      b("sunstreak", bvj.a.a, 1),
      c("snooper", bvj.a.a, 2),
      d("dasher", bvj.a.a, 3),
      e("brinely", bvj.a.a, 4),
      f("spotty", bvj.a.a, 5),
      g("flopper", bvj.a.b, 0),
      h("stripey", bvj.a.b, 1),
      i("glitter", bvj.a.b, 2),
      j("blockfish", bvj.a.b, 3),
      k("betty", bvj.a.b, 4),
      l("clayfish", bvj.a.b, 5);

      public static final Codec<bvj.b> m = ash.a(bvj.b::values);
      private static final IntFunction<bvj.b> n = aqk.a(bvj.b::b, values(), a);
      private final String o;
      private final tf p;
      private final bvj.a q;
      private final int r;

      private b(String $$0, bvj.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = tf.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bvj.b a(int $$0) {
         return n.apply($$0);
      }

      public bvj.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public tf d() {
         return this.p;
      }
   }

   static class c extends bui.a {
      final bvj.d b;

      c(bvj $$0, bvj.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bvj.b a, chl b, chl c) {
      public int a() {
         return bvj.a(this.a, this.b, this.c);
      }

      public bvj.b b() {
         return this.a;
      }

      public chl c() {
         return this.b;
      }

      public chl d() {
         return this.c;
      }
   }
}
