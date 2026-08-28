import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chw extends cgu implements bwf<chw.b> {
   public static final String a = "BucketVariantTag";
   private static final ajx<Integer> c = akb.a(chw.class, ajz.b);
   public static final List<chw.d> b = List.of(
      new chw.d(chw.b.h, cvk.b, cvk.h),
      new chw.d(chw.b.g, cvk.h, cvk.h),
      new chw.d(chw.b.g, cvk.h, cvk.l),
      new chw.d(chw.b.l, cvk.a, cvk.h),
      new chw.d(chw.b.b, cvk.l, cvk.h),
      new chw.d(chw.b.a, cvk.b, cvk.a),
      new chw.d(chw.b.f, cvk.g, cvk.d),
      new chw.d(chw.b.j, cvk.k, cvk.e),
      new chw.d(chw.b.l, cvk.a, cvk.o),
      new chw.d(chw.b.f, cvk.a, cvk.e),
      new chw.d(chw.b.i, cvk.a, cvk.h),
      new chw.d(chw.b.l, cvk.a, cvk.b),
      new chw.d(chw.b.d, cvk.j, cvk.g),
      new chw.d(chw.b.e, cvk.f, cvk.d),
      new chw.d(chw.b.k, cvk.o, cvk.a),
      new chw.d(chw.b.c, cvk.h, cvk.o),
      new chw.d(chw.b.j, cvk.o, cvk.a),
      new chw.d(chw.b.g, cvk.a, cvk.e),
      new chw.d(chw.b.a, cvk.o, cvk.a),
      new chw.d(chw.b.b, cvk.h, cvk.a),
      new chw.d(chw.b.d, cvk.j, cvk.e),
      new chw.d(chw.b.g, cvk.e, cvk.e)
   );
   private boolean bY = true;

   public chw(buq<? extends chw> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(chw.b $$0, cvk $$1, cvk $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cvk c(int $$0) {
      return cvk.a($$0 >> 16 & 0xFF);
   }

   public static cvk r(int $$0) {
      return cvk.a($$0 >> 24 & 0xFF);
   }

   public static chw.b s(int $$0) {
      return chw.b.a($$0 & 65535);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.gA());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.u($$0.h("Variant"));
   }

   private void u(int $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean q(int $$0) {
      return !this.bY;
   }

   private int gA() {
      return this.al.a(c);
   }

   public cvk gx() {
      return c(this.gA());
   }

   public cvk gy() {
      return r(this.gA());
   }

   public chw.b gz() {
      return s(this.gA());
   }

   public void a(chw.b $$0) {
      int $$1 = this.gA();
      cvk $$2 = c($$1);
      cvk $$3 = r($$1);
      this.u(a($$0, $$2, $$3));
   }

   @Override
   public void i(cwn $$0) {
      super.i($$0);
      cyw.a(kv.X, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gA()));
   }

   @Override
   public cwn W_() {
      return new cwn(cwr.rp);
   }

   @Override
   protected avy u() {
      return avz.AA;
   }

   @Override
   protected avy o_() {
      return avz.AB;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.AD;
   }

   @Override
   protected avy gp() {
      return avz.AC;
   }

   @Override
   public void h(tq $$0) {
      super.h($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.u($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azg $$4 = $$0.H_();
      chw.d $$6;
      if ($$3 instanceof chw.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = af.a(b, $$4);
         $$3 = new chw.c(this, $$6);
      } else {
         this.bY = false;
         chw.b[] $$8 = chw.b.values();
         cvk[] $$9 = cvk.values();
         chw.b $$10 = af.a($$8, $$4);
         cvk $$11 = af.a($$9, $$4);
         cvk $$12 = af.a($$9, $$4);
         $$6 = new chw.d($$10, $$11, $$12);
      }

      this.u($$6.a());
      return $$3;
   }

   public static boolean b(buq<chw> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.b_($$3.e()).a(awu.a) && $$1.a_($$3.d()).a(djm.J) && ($$1.t($$3).a(awn.an) || chy.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements azu {
      a("kob", chw.a.a, 0),
      b("sunstreak", chw.a.a, 1),
      c("snooper", chw.a.a, 2),
      d("dasher", chw.a.a, 3),
      e("brinely", chw.a.a, 4),
      f("spotty", chw.a.a, 5),
      g("flopper", chw.a.b, 0),
      h("stripey", chw.a.b, 1),
      i("glitter", chw.a.b, 2),
      j("blockfish", chw.a.b, 3),
      k("betty", chw.a.b, 4),
      l("clayfish", chw.a.b, 5);

      public static final Codec<chw.b> m = azu.a(chw.b::values);
      private static final IntFunction<chw.b> n = axp.a(chw.b::b, values(), a);
      private final String o;
      private final wo p;
      private final chw.a q;
      private final int r;

      private b(final String $$0, final chw.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wo.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static chw.b a(int $$0) {
         return n.apply($$0);
      }

      public chw.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public wo d() {
         return this.p;
      }
   }

   static class c extends cgu.a {
      final chw.d b;

      c(chw $$0, chw.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(chw.b b, cvk c, cvk d) {
      public static final Codec<chw.d> a = Codec.INT.xmap(chw.d::new, chw.d::a);

      public d(int $$0) {
         this(chw.s($$0), chw.c($$0), chw.r($$0));
      }

      public int a() {
         return chw.a(this.b, this.c, this.d);
      }
   }
}
