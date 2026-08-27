import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfe extends ced implements btn<cfe.b> {
   public static final String b = "BucketVariantTag";
   private static final ajy<Integer> d = akc.a(cfe.class, aka.b);
   public static final List<cfe.d> c = List.of(
      new cfe.d(cfe.b.h, csy.b, csy.h),
      new cfe.d(cfe.b.g, csy.h, csy.h),
      new cfe.d(cfe.b.g, csy.h, csy.l),
      new cfe.d(cfe.b.l, csy.a, csy.h),
      new cfe.d(cfe.b.b, csy.l, csy.h),
      new cfe.d(cfe.b.a, csy.b, csy.a),
      new cfe.d(cfe.b.f, csy.g, csy.d),
      new cfe.d(cfe.b.j, csy.k, csy.e),
      new cfe.d(cfe.b.l, csy.a, csy.o),
      new cfe.d(cfe.b.f, csy.a, csy.e),
      new cfe.d(cfe.b.i, csy.a, csy.h),
      new cfe.d(cfe.b.l, csy.a, csy.b),
      new cfe.d(cfe.b.d, csy.j, csy.g),
      new cfe.d(cfe.b.e, csy.f, csy.d),
      new cfe.d(cfe.b.k, csy.o, csy.a),
      new cfe.d(cfe.b.c, csy.h, csy.o),
      new cfe.d(cfe.b.j, csy.o, csy.a),
      new cfe.d(cfe.b.g, csy.a, csy.e),
      new cfe.d(cfe.b.a, csy.o, csy.a),
      new cfe.d(cfe.b.b, csy.h, csy.a),
      new cfe.d(cfe.b.d, csy.j, csy.e),
      new cfe.d(cfe.b.g, csy.e, csy.e)
   );
   private boolean e = true;

   public cfe(bsb<? extends cfe> $$0, dca $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cfe.b $$0, csy $$1, csy $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static csy u(int $$0) {
      return csy.a($$0 >> 16 & 0xFF);
   }

   public static csy v(int $$0) {
      return csy.a($$0 >> 24 & 0xFF);
   }

   public static cfe.b w(int $$0) {
      return cfe.b.a($$0 & 65535);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Variant", this.gK());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.as.a(d, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.e;
   }

   private int gK() {
      return this.as.a(d);
   }

   public csy gH() {
      return u(this.gK());
   }

   public csy gI() {
      return v(this.gK());
   }

   public cfe.b gJ() {
      return w(this.gK());
   }

   public void a(cfe.b $$0) {
      int $$1 = this.gK();
      csy $$2 = u($$1);
      csy $$3 = v($$1);
      this.x(a($$0, $$2, $$3));
   }

   @Override
   public void n(cuh $$0) {
      super.n($$0);
      cxf.a(ke.N, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gK()));
   }

   @Override
   public cuh b() {
      return new cuh(cuk.sf);
   }

   @Override
   protected avn u() {
      return avo.Ah;
   }

   @Override
   protected avn n_() {
      return avo.Ai;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.Ak;
   }

   @Override
   protected avn gz() {
      return avo.Aj;
   }

   @Override
   public void c(uk $$0) {
      super.c($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.x($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayt $$4 = $$0.F_();
      cfe.d $$6;
      if ($$3 instanceof cfe.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ad.a(c, $$4);
         $$3 = new cfe.c(this, $$6);
      } else {
         this.e = false;
         cfe.b[] $$8 = cfe.b.values();
         csy[] $$9 = csy.values();
         cfe.b $$10 = ad.a($$8, $$4);
         csy $$11 = ad.a($$9, $$4);
         csy $$12 = ad.a($$9, $$4);
         $$6 = new cfe.d($$10, $$11, $$12);
      }

      this.x($$6.a());
      return $$3;
   }

   public static boolean b(bsb<cfe> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.b_($$3.d()).a(awj.a) && $$1.a_($$3.c()).a(dfe.al) && ($$1.t($$3).a(awd.ar) || cfg.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements azg {
      a("kob", cfe.a.a, 0),
      b("sunstreak", cfe.a.a, 1),
      c("snooper", cfe.a.a, 2),
      d("dasher", cfe.a.a, 3),
      e("brinely", cfe.a.a, 4),
      f("spotty", cfe.a.a, 5),
      g("flopper", cfe.a.b, 0),
      h("stripey", cfe.a.b, 1),
      i("glitter", cfe.a.b, 2),
      j("blockfish", cfe.a.b, 3),
      k("betty", cfe.a.b, 4),
      l("clayfish", cfe.a.b, 5);

      public static final Codec<cfe.b> m = azg.a(cfe.b::values);
      private static final IntFunction<cfe.b> n = axd.a(cfe.b::b, values(), a);
      private final String o;
      private final xe p;
      private final cfe.a q;
      private final int r;

      private b(String $$0, cfe.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xe.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cfe.b a(int $$0) {
         return n.apply($$0);
      }

      public cfe.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public xe d() {
         return this.p;
      }
   }

   static class c extends ced.a {
      final cfe.d b;

      c(cfe $$0, cfe.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cfe.b b, csy c, csy d) {
      public static final Codec<cfe.d> a = Codec.INT.xmap(cfe.d::new, cfe.d::a);

      public d(int $$0) {
         this(cfe.w($$0), cfe.u($$0), cfe.v($$0));
      }

      public int a() {
         return cfe.a(this.b, this.c, this.d);
      }
   }
}
