import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cix extends chv implements bxg<cix.b> {
   public static final String a = "BucketVariantTag";
   private static final alc<Integer> c = alg.a(cix.class, ale.b);
   public static final List<cix.d> b = List.of(
      new cix.d(cix.b.h, cwm.b, cwm.h),
      new cix.d(cix.b.g, cwm.h, cwm.h),
      new cix.d(cix.b.g, cwm.h, cwm.l),
      new cix.d(cix.b.l, cwm.a, cwm.h),
      new cix.d(cix.b.b, cwm.l, cwm.h),
      new cix.d(cix.b.a, cwm.b, cwm.a),
      new cix.d(cix.b.f, cwm.g, cwm.d),
      new cix.d(cix.b.j, cwm.k, cwm.e),
      new cix.d(cix.b.l, cwm.a, cwm.o),
      new cix.d(cix.b.f, cwm.a, cwm.e),
      new cix.d(cix.b.i, cwm.a, cwm.h),
      new cix.d(cix.b.l, cwm.a, cwm.b),
      new cix.d(cix.b.d, cwm.j, cwm.g),
      new cix.d(cix.b.e, cwm.f, cwm.d),
      new cix.d(cix.b.k, cwm.o, cwm.a),
      new cix.d(cix.b.c, cwm.h, cwm.o),
      new cix.d(cix.b.j, cwm.o, cwm.a),
      new cix.d(cix.b.g, cwm.a, cwm.e),
      new cix.d(cix.b.a, cwm.o, cwm.a),
      new cix.d(cix.b.b, cwm.h, cwm.a),
      new cix.d(cix.b.d, cwm.j, cwm.e),
      new cix.d(cix.b.g, cwm.e, cwm.e)
   );
   private boolean bZ = true;

   public cix(bvr<? extends cix> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cix.b $$0, cwm $$1, cwm $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cwm c(int $$0) {
      return cwm.a($$0 >> 16 & 0xFF);
   }

   public static cwm r(int $$0) {
      return cwm.a($$0 >> 24 & 0xFF);
   }

   public static cix.b s(int $$0) {
      return cix.b.a($$0 & 65535);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.u($$0.h("Variant"));
   }

   private void u(int $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean q(int $$0) {
      return !this.bZ;
   }

   private int gz() {
      return this.al.a(c);
   }

   public cwm gw() {
      return c(this.gz());
   }

   public cwm gx() {
      return r(this.gz());
   }

   public cix.b gy() {
      return s(this.gz());
   }

   public void a(cix.b $$0) {
      int $$1 = this.gz();
      cwm $$2 = c($$1);
      cwm $$3 = r($$1);
      this.u(a($$0, $$2, $$3));
   }

   @Override
   public void i(cxp $$0) {
      super.i($$0);
      czy.a(ku.X, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gz()));
   }

   @Override
   public cxp X_() {
      return new cxp(cxt.rg);
   }

   @Override
   protected axe u() {
      return axf.Al;
   }

   @Override
   protected axe o_() {
      return axf.Am;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.Ao;
   }

   @Override
   protected axe go() {
      return axf.An;
   }

   @Override
   public void h(ux $$0) {
      super.h($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.u($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bam $$4 = $$0.H_();
      cix.d $$6;
      if ($$3 instanceof cix.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ae.a(b, $$4);
         $$3 = new cix.c(this, $$6);
      } else {
         this.bZ = false;
         cix.b[] $$8 = cix.b.values();
         cwm[] $$9 = cwm.values();
         cix.b $$10 = ae.a($$8, $$4);
         cwm $$11 = ae.a($$9, $$4);
         cwm $$12 = ae.a($$9, $$4);
         $$6 = new cix.d($$10, $$11, $$12);
      }

      this.u($$6.a());
      return $$3;
   }

   public static boolean b(bvr<cix> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return $$1.b_($$3.e()).a(aya.a) && $$1.a_($$3.d()).a(dko.J) && ($$1.t($$3).a(axt.an) || ciz.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements bba {
      a("kob", cix.a.a, 0),
      b("sunstreak", cix.a.a, 1),
      c("snooper", cix.a.a, 2),
      d("dasher", cix.a.a, 3),
      e("brinely", cix.a.a, 4),
      f("spotty", cix.a.a, 5),
      g("flopper", cix.a.b, 0),
      h("stripey", cix.a.b, 1),
      i("glitter", cix.a.b, 2),
      j("blockfish", cix.a.b, 3),
      k("betty", cix.a.b, 4),
      l("clayfish", cix.a.b, 5);

      public static final Codec<cix.b> m = bba.a(cix.b::values);
      private static final IntFunction<cix.b> n = ayv.a(cix.b::b, values(), a);
      private final String o;
      private final xv p;
      private final cix.a q;
      private final int r;

      private b(final String $$0, final cix.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xv.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cix.b a(int $$0) {
         return n.apply($$0);
      }

      public cix.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public xv d() {
         return this.p;
      }
   }

   static class c extends chv.a {
      final cix.d b;

      c(cix $$0, cix.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cix.b b, cwm c, cwm d) {
      public static final Codec<cix.d> a = Codec.INT.xmap(cix.d::new, cix.d::a);

      public d(int $$0) {
         this(cix.s($$0), cix.c($$0), cix.r($$0));
      }

      public int a() {
         return cix.a(this.b, this.c, this.d);
      }
   }
}
