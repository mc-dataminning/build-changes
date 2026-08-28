import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ciw extends chu implements bxf<ciw.b> {
   public static final String a = "BucketVariantTag";
   private static final alc<Integer> c = alg.a(ciw.class, ale.b);
   public static final List<ciw.d> b = List.of(
      new ciw.d(ciw.b.h, cwl.b, cwl.h),
      new ciw.d(ciw.b.g, cwl.h, cwl.h),
      new ciw.d(ciw.b.g, cwl.h, cwl.l),
      new ciw.d(ciw.b.l, cwl.a, cwl.h),
      new ciw.d(ciw.b.b, cwl.l, cwl.h),
      new ciw.d(ciw.b.a, cwl.b, cwl.a),
      new ciw.d(ciw.b.f, cwl.g, cwl.d),
      new ciw.d(ciw.b.j, cwl.k, cwl.e),
      new ciw.d(ciw.b.l, cwl.a, cwl.o),
      new ciw.d(ciw.b.f, cwl.a, cwl.e),
      new ciw.d(ciw.b.i, cwl.a, cwl.h),
      new ciw.d(ciw.b.l, cwl.a, cwl.b),
      new ciw.d(ciw.b.d, cwl.j, cwl.g),
      new ciw.d(ciw.b.e, cwl.f, cwl.d),
      new ciw.d(ciw.b.k, cwl.o, cwl.a),
      new ciw.d(ciw.b.c, cwl.h, cwl.o),
      new ciw.d(ciw.b.j, cwl.o, cwl.a),
      new ciw.d(ciw.b.g, cwl.a, cwl.e),
      new ciw.d(ciw.b.a, cwl.o, cwl.a),
      new ciw.d(ciw.b.b, cwl.h, cwl.a),
      new ciw.d(ciw.b.d, cwl.j, cwl.e),
      new ciw.d(ciw.b.g, cwl.e, cwl.e)
   );
   private boolean bZ = true;

   public ciw(bvq<? extends ciw> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(ciw.b $$0, cwl $$1, cwl $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cwl c(int $$0) {
      return cwl.a($$0 >> 16 & 0xFF);
   }

   public static cwl r(int $$0) {
      return cwl.a($$0 >> 24 & 0xFF);
   }

   public static ciw.b s(int $$0) {
      return ciw.b.a($$0 & 65535);
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

   public cwl gu() {
      return c(this.gx());
   }

   public cwl gv() {
      return r(this.gx());
   }

   public ciw.b gw() {
      return s(this.gx());
   }

   public void a(ciw.b $$0) {
      int $$1 = this.gx();
      cwl $$2 = c($$1);
      cwl $$3 = r($$1);
      this.u(a($$0, $$2, $$3));
   }

   @Override
   public void i(cxo $$0) {
      super.i($$0);
      czx.a(ku.X, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gx()));
   }

   @Override
   public cxo X_() {
      return new cxo(cxs.rg);
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
   protected axe e(btz $$0) {
      return axf.Ao;
   }

   @Override
   protected axe gm() {
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
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bam $$4 = $$0.H_();
      ciw.d $$6;
      if ($$3 instanceof ciw.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ae.a(b, $$4);
         $$3 = new ciw.c(this, $$6);
      } else {
         this.bZ = false;
         ciw.b[] $$8 = ciw.b.values();
         cwl[] $$9 = cwl.values();
         ciw.b $$10 = ae.a($$8, $$4);
         cwl $$11 = ae.a($$9, $$4);
         cwl $$12 = ae.a($$9, $$4);
         $$6 = new ciw.d($$10, $$11, $$12);
      }

      this.u($$6.a());
      return $$3;
   }

   public static boolean b(bvq<ciw> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.b_($$3.e()).a(aya.a) && $$1.a_($$3.d()).a(dkn.J) && ($$1.t($$3).a(axt.an) || ciy.c($$0, $$1, $$2, $$3, $$4));
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
      a("kob", ciw.a.a, 0),
      b("sunstreak", ciw.a.a, 1),
      c("snooper", ciw.a.a, 2),
      d("dasher", ciw.a.a, 3),
      e("brinely", ciw.a.a, 4),
      f("spotty", ciw.a.a, 5),
      g("flopper", ciw.a.b, 0),
      h("stripey", ciw.a.b, 1),
      i("glitter", ciw.a.b, 2),
      j("blockfish", ciw.a.b, 3),
      k("betty", ciw.a.b, 4),
      l("clayfish", ciw.a.b, 5);

      public static final Codec<ciw.b> m = bba.a(ciw.b::values);
      private static final IntFunction<ciw.b> n = ayv.a(ciw.b::b, values(), a);
      private final String o;
      private final xv p;
      private final ciw.a q;
      private final int r;

      private b(final String $$0, final ciw.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xv.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static ciw.b a(int $$0) {
         return n.apply($$0);
      }

      public ciw.a a() {
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

   static class c extends chu.a {
      final ciw.d b;

      c(ciw $$0, ciw.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(ciw.b b, cwl c, cwl d) {
      public static final Codec<ciw.d> a = Codec.INT.xmap(ciw.d::new, ciw.d::a);

      public d(int $$0) {
         this(ciw.s($$0), ciw.c($$0), ciw.r($$0));
      }

      public int a() {
         return ciw.a(this.b, this.c, this.d);
      }
   }
}
