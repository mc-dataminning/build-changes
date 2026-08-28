import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cha extends cfy implements bvj<cha.b> {
   public static final String b = "BucketVariantTag";
   private static final akg<Integer> d = akk.a(cha.class, aki.b);
   public static final List<cha.d> c = List.of(
      new cha.d(cha.b.h, cuj.b, cuj.h),
      new cha.d(cha.b.g, cuj.h, cuj.h),
      new cha.d(cha.b.g, cuj.h, cuj.l),
      new cha.d(cha.b.l, cuj.a, cuj.h),
      new cha.d(cha.b.b, cuj.l, cuj.h),
      new cha.d(cha.b.a, cuj.b, cuj.a),
      new cha.d(cha.b.f, cuj.g, cuj.d),
      new cha.d(cha.b.j, cuj.k, cuj.e),
      new cha.d(cha.b.l, cuj.a, cuj.o),
      new cha.d(cha.b.f, cuj.a, cuj.e),
      new cha.d(cha.b.i, cuj.a, cuj.h),
      new cha.d(cha.b.l, cuj.a, cuj.b),
      new cha.d(cha.b.d, cuj.j, cuj.g),
      new cha.d(cha.b.e, cuj.f, cuj.d),
      new cha.d(cha.b.k, cuj.o, cuj.a),
      new cha.d(cha.b.c, cuj.h, cuj.o),
      new cha.d(cha.b.j, cuj.o, cuj.a),
      new cha.d(cha.b.g, cuj.a, cuj.e),
      new cha.d(cha.b.a, cuj.o, cuj.a),
      new cha.d(cha.b.b, cuj.h, cuj.a),
      new cha.d(cha.b.d, cuj.j, cuj.e),
      new cha.d(cha.b.g, cuj.e, cuj.e)
   );
   private boolean bY = true;

   public cha(btv<? extends cha> $$0, deg $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cha.b $$0, cuj $$1, cuj $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cuj c(int $$0) {
      return cuj.a($$0 >> 16 & 0xFF);
   }

   public static cuj s(int $$0) {
      return cuj.a($$0 >> 24 & 0xFF);
   }

   public static cha.b t(int $$0) {
      return cha.b.a($$0 & 65535);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Variant", this.gB());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.v($$0.h("Variant"));
   }

   private void v(int $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public boolean r(int $$0) {
      return !this.bY;
   }

   private int gB() {
      return this.am.a(d);
   }

   public cuj gy() {
      return c(this.gB());
   }

   public cuj gz() {
      return s(this.gB());
   }

   public cha.b gA() {
      return t(this.gB());
   }

   public void a(cha.b $$0) {
      int $$1 = this.gB();
      cuj $$2 = c($$1);
      cuj $$3 = s($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void m(cvp $$0) {
      super.m($$0);
      cye.a(kr.S, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gB()));
   }

   @Override
   public cvp V_() {
      return new cvp(cvt.qJ);
   }

   @Override
   protected awd w() {
      return awe.zS;
   }

   @Override
   protected awd n_() {
      return awe.zT;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.zV;
   }

   @Override
   protected awd gq() {
      return awe.zU;
   }

   @Override
   public void h(uf $$0) {
      super.h($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.v($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azl $$4 = $$0.C_();
      cha.d $$6;
      if ($$3 instanceof cha.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ad.a(c, $$4);
         $$3 = new cha.c(this, $$6);
      } else {
         this.bY = false;
         cha.b[] $$8 = cha.b.values();
         cuj[] $$9 = cuj.values();
         cha.b $$10 = ad.a($$8, $$4);
         cuj $$11 = ad.a($$9, $$4);
         cuj $$12 = ad.a($$9, $$4);
         $$6 = new cha.d($$10, $$11, $$12);
      }

      this.v($$6.a());
      return $$3;
   }

   public static boolean b(btv<cha> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.b_($$3.e()).a(awz.a) && $$1.a_($$3.d()).a(dhl.G) && ($$1.t($$3).a(aws.an) || chc.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements azz {
      a("kob", cha.a.a, 0),
      b("sunstreak", cha.a.a, 1),
      c("snooper", cha.a.a, 2),
      d("dasher", cha.a.a, 3),
      e("brinely", cha.a.a, 4),
      f("spotty", cha.a.a, 5),
      g("flopper", cha.a.b, 0),
      h("stripey", cha.a.b, 1),
      i("glitter", cha.a.b, 2),
      j("blockfish", cha.a.b, 3),
      k("betty", cha.a.b, 4),
      l("clayfish", cha.a.b, 5);

      public static final Codec<cha.b> m = azz.a(cha.b::values);
      private static final IntFunction<cha.b> n = axu.a(cha.b::b, values(), a);
      private final String o;
      private final xd p;
      private final cha.a q;
      private final int r;

      private b(final String $$0, final cha.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xd.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cha.b a(int $$0) {
         return n.apply($$0);
      }

      public cha.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public xd d() {
         return this.p;
      }
   }

   static class c extends cfy.a {
      final cha.d b;

      c(cha $$0, cha.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cha.b b, cuj c, cuj d) {
      public static final Codec<cha.d> a = Codec.INT.xmap(cha.d::new, cha.d::a);

      public d(int $$0) {
         this(cha.t($$0), cha.c($$0), cha.s($$0));
      }

      public int a() {
         return cha.a(this.b, this.c, this.d);
      }
   }
}
