import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cis extends chq implements bxb<cis.b> {
   public static final String a = "BucketVariantTag";
   private static final alc<Integer> c = alg.a(cis.class, ale.b);
   public static final List<cis.d> b = List.of(
      new cis.d(cis.b.h, cwh.b, cwh.h),
      new cis.d(cis.b.g, cwh.h, cwh.h),
      new cis.d(cis.b.g, cwh.h, cwh.l),
      new cis.d(cis.b.l, cwh.a, cwh.h),
      new cis.d(cis.b.b, cwh.l, cwh.h),
      new cis.d(cis.b.a, cwh.b, cwh.a),
      new cis.d(cis.b.f, cwh.g, cwh.d),
      new cis.d(cis.b.j, cwh.k, cwh.e),
      new cis.d(cis.b.l, cwh.a, cwh.o),
      new cis.d(cis.b.f, cwh.a, cwh.e),
      new cis.d(cis.b.i, cwh.a, cwh.h),
      new cis.d(cis.b.l, cwh.a, cwh.b),
      new cis.d(cis.b.d, cwh.j, cwh.g),
      new cis.d(cis.b.e, cwh.f, cwh.d),
      new cis.d(cis.b.k, cwh.o, cwh.a),
      new cis.d(cis.b.c, cwh.h, cwh.o),
      new cis.d(cis.b.j, cwh.o, cwh.a),
      new cis.d(cis.b.g, cwh.a, cwh.e),
      new cis.d(cis.b.a, cwh.o, cwh.a),
      new cis.d(cis.b.b, cwh.h, cwh.a),
      new cis.d(cis.b.d, cwh.j, cwh.e),
      new cis.d(cis.b.g, cwh.e, cwh.e)
   );
   private boolean bZ = true;

   public cis(bvm<? extends cis> $$0, dha $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cis.b $$0, cwh $$1, cwh $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cwh c(int $$0) {
      return cwh.a($$0 >> 16 & 0xFF);
   }

   public static cwh r(int $$0) {
      return cwh.a($$0 >> 24 & 0xFF);
   }

   public static cis.b s(int $$0) {
      return cis.b.a($$0 & 65535);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Variant", this.gx());
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

   private int gx() {
      return this.al.a(c);
   }

   public cwh gu() {
      return c(this.gx());
   }

   public cwh gv() {
      return r(this.gx());
   }

   public cis.b gw() {
      return s(this.gx());
   }

   public void a(cis.b $$0) {
      int $$1 = this.gx();
      cwh $$2 = c($$1);
      cwh $$3 = r($$1);
      this.u(a($$0, $$2, $$3));
   }

   @Override
   public void i(cxk $$0) {
      super.i($$0);
      czt.a(ku.X, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gx()));
   }

   @Override
   public cxk X_() {
      return new cxk(cxo.rg);
   }

   @Override
   protected axe u() {
      return axf.Ak;
   }

   @Override
   protected axe o_() {
      return axf.Al;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.An;
   }

   @Override
   protected axe gm() {
      return axf.Am;
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
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bam $$4 = $$0.H_();
      cis.d $$6;
      if ($$3 instanceof cis.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ae.a(b, $$4);
         $$3 = new cis.c(this, $$6);
      } else {
         this.bZ = false;
         cis.b[] $$8 = cis.b.values();
         cwh[] $$9 = cwh.values();
         cis.b $$10 = ae.a($$8, $$4);
         cwh $$11 = ae.a($$9, $$4);
         cwh $$12 = ae.a($$9, $$4);
         $$6 = new cis.d($$10, $$11, $$12);
      }

      this.u($$6.a());
      return $$3;
   }

   public static boolean b(bvm<cis> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.b_($$3.e()).a(aya.a) && $$1.a_($$3.d()).a(dkg.J) && ($$1.t($$3).a(axt.an) || ciu.c($$0, $$1, $$2, $$3, $$4));
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
      a("kob", cis.a.a, 0),
      b("sunstreak", cis.a.a, 1),
      c("snooper", cis.a.a, 2),
      d("dasher", cis.a.a, 3),
      e("brinely", cis.a.a, 4),
      f("spotty", cis.a.a, 5),
      g("flopper", cis.a.b, 0),
      h("stripey", cis.a.b, 1),
      i("glitter", cis.a.b, 2),
      j("blockfish", cis.a.b, 3),
      k("betty", cis.a.b, 4),
      l("clayfish", cis.a.b, 5);

      public static final Codec<cis.b> m = bba.a(cis.b::values);
      private static final IntFunction<cis.b> n = ayv.a(cis.b::b, values(), a);
      private final String o;
      private final xv p;
      private final cis.a q;
      private final int r;

      private b(final String $$0, final cis.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xv.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cis.b a(int $$0) {
         return n.apply($$0);
      }

      public cis.a a() {
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

   static class c extends chq.a {
      final cis.d b;

      c(cis $$0, cis.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cis.b b, cwh c, cwh d) {
      public static final Codec<cis.d> a = Codec.INT.xmap(cis.d::new, cis.d::a);

      public d(int $$0) {
         this(cis.s($$0), cis.c($$0), cis.r($$0));
      }

      public int a() {
         return cis.a(this.b, this.c, this.d);
      }
   }
}
