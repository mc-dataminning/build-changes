import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bvk extends buj implements bjx<bvk.b> {
   public static final String b = "BucketVariantTag";
   private static final adz<Integer> d = aec.a(bvk.class, aeb.b);
   public static final List<bvk.d> c = List.of(
      new bvk.d(bvk.b.h, chm.b, chm.h),
      new bvk.d(bvk.b.g, chm.h, chm.h),
      new bvk.d(bvk.b.g, chm.h, chm.l),
      new bvk.d(bvk.b.l, chm.a, chm.h),
      new bvk.d(bvk.b.b, chm.l, chm.h),
      new bvk.d(bvk.b.a, chm.b, chm.a),
      new bvk.d(bvk.b.f, chm.g, chm.d),
      new bvk.d(bvk.b.j, chm.k, chm.e),
      new bvk.d(bvk.b.l, chm.a, chm.o),
      new bvk.d(bvk.b.f, chm.a, chm.e),
      new bvk.d(bvk.b.i, chm.a, chm.h),
      new bvk.d(bvk.b.l, chm.a, chm.b),
      new bvk.d(bvk.b.d, chm.j, chm.g),
      new bvk.d(bvk.b.e, chm.f, chm.d),
      new bvk.d(bvk.b.k, chm.o, chm.a),
      new bvk.d(bvk.b.c, chm.h, chm.o),
      new bvk.d(bvk.b.j, chm.o, chm.a),
      new bvk.d(bvk.b.g, chm.a, chm.e),
      new bvk.d(bvk.b.a, chm.o, chm.a),
      new bvk.d(bvk.b.b, chm.h, chm.a),
      new bvk.d(bvk.b.d, chm.j, chm.e),
      new bvk.d(bvk.b.g, chm.e, chm.e)
   );
   private boolean e = true;

   public bvk(bim<? extends bvk> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bvk.b $$0, chm $$1, chm $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static chm s(int $$0) {
      return chm.a($$0 >> 16 & 0xFF);
   }

   public static chm t(int $$0) {
      return chm.a($$0 >> 24 & 0xFF);
   }

   public static bvk.b u(int $$0) {
      return bvk.b.a($$0 & 65535);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, 0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Variant", this.gl());
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

   private int gl() {
      return this.an.b(d);
   }

   public chm gi() {
      return s(this.gl());
   }

   public chm gj() {
      return t(this.gl());
   }

   public bvk.b gk() {
      return u(this.gl());
   }

   public void a(bvk.b $$0) {
      int $$1 = this.gl();
      chm $$2 = s($$1);
      chm $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(ciy $$0) {
      super.l($$0);
      qr $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gl());
   }

   @Override
   public ciy b() {
      return new ciy(cjb.pU);
   }

   @Override
   protected aov r() {
      return aow.xU;
   }

   @Override
   protected aov h_() {
      return aow.xV;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.xX;
   }

   @Override
   protected aov ga() {
      return aow.xW;
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bjc.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         aru $$5 = $$0.y_();
         bvk.d $$7;
         if ($$3 instanceof bvk.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bvk.c(this, $$7);
         } else {
            this.e = false;
            bvk.b[] $$9 = bvk.b.values();
            chm[] $$10 = chm.values();
            bvk.b $$11 = ac.a($$9, $$5);
            chm $$12 = ac.a($$10, $$5);
            chm $$13 = ac.a($$10, $$5);
            $$7 = new bvk.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(bim<bvk> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.b_($$3.d()).a(apq.a) && $$1.a_($$3.c()).a(csn.G) && ($$1.s($$3).a(apk.am) || bvm.c($$0, $$1, $$2, $$3, $$4));
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
      a("kob", bvk.a.a, 0),
      b("sunstreak", bvk.a.a, 1),
      c("snooper", bvk.a.a, 2),
      d("dasher", bvk.a.a, 3),
      e("brinely", bvk.a.a, 4),
      f("spotty", bvk.a.a, 5),
      g("flopper", bvk.a.b, 0),
      h("stripey", bvk.a.b, 1),
      i("glitter", bvk.a.b, 2),
      j("blockfish", bvk.a.b, 3),
      k("betty", bvk.a.b, 4),
      l("clayfish", bvk.a.b, 5);

      public static final Codec<bvk.b> m = ash.a(bvk.b::values);
      private static final IntFunction<bvk.b> n = aqk.a(bvk.b::b, values(), a);
      private final String o;
      private final tf p;
      private final bvk.a q;
      private final int r;

      private b(String $$0, bvk.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = tf.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bvk.b a(int $$0) {
         return n.apply($$0);
      }

      public bvk.a a() {
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

   static class c extends buj.a {
      final bvk.d b;

      c(bvk $$0, bvk.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bvk.b a, chm b, chm c) {
      public int a() {
         return bvk.a(this.a, this.b, this.c);
      }

      public bvk.b b() {
         return this.a;
      }

      public chm c() {
         return this.b;
      }

      public chm d() {
         return this.c;
      }
   }
}
