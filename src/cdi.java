import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cdi extends cch implements brs<cdi.b> {
   public static final String b = "BucketVariantTag";
   private static final aja<Integer> d = aje.a(cdi.class, ajc.b);
   public static final List<cdi.d> c = List.of(
      new cdi.d(cdi.b.h, cql.b, cql.h),
      new cdi.d(cdi.b.g, cql.h, cql.h),
      new cdi.d(cdi.b.g, cql.h, cql.l),
      new cdi.d(cdi.b.l, cql.a, cql.h),
      new cdi.d(cdi.b.b, cql.l, cql.h),
      new cdi.d(cdi.b.a, cql.b, cql.a),
      new cdi.d(cdi.b.f, cql.g, cql.d),
      new cdi.d(cdi.b.j, cql.k, cql.e),
      new cdi.d(cdi.b.l, cql.a, cql.o),
      new cdi.d(cdi.b.f, cql.a, cql.e),
      new cdi.d(cdi.b.i, cql.a, cql.h),
      new cdi.d(cdi.b.l, cql.a, cql.b),
      new cdi.d(cdi.b.d, cql.j, cql.g),
      new cdi.d(cdi.b.e, cql.f, cql.d),
      new cdi.d(cdi.b.k, cql.o, cql.a),
      new cdi.d(cdi.b.c, cql.h, cql.o),
      new cdi.d(cdi.b.j, cql.o, cql.a),
      new cdi.d(cdi.b.g, cql.a, cql.e),
      new cdi.d(cdi.b.a, cql.o, cql.a),
      new cdi.d(cdi.b.b, cql.h, cql.a),
      new cdi.d(cdi.b.d, cql.j, cql.e),
      new cdi.d(cdi.b.g, cql.e, cql.e)
   );
   private boolean e = true;

   public cdi(bqg<? extends cdi> $$0, czg $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cdi.b $$0, cql $$1, cql $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cql t(int $$0) {
      return cql.a($$0 >> 16 & 0xFF);
   }

   public static cql u(int $$0) {
      return cql.a($$0 >> 24 & 0xFF);
   }

   public static cdi.b v(int $$0) {
      return cdi.b.a($$0 & 65535);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.an.a(d, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.e;
   }

   private int gz() {
      return this.an.a(d);
   }

   public cql gw() {
      return t(this.gz());
   }

   public cql gx() {
      return u(this.gz());
   }

   public cdi.b gy() {
      return v(this.gz());
   }

   public void a(cdi.b $$0) {
      int $$1 = this.gz();
      cql $$2 = t($$1);
      cql $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(crs $$0) {
      super.n($$0);
      cuc.a(jr.E, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gz()));
   }

   @Override
   public crs b() {
      return new crs(crv.qH);
   }

   @Override
   protected aun v() {
      return auo.zq;
   }

   @Override
   protected aun o_() {
      return auo.zr;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.zt;
   }

   @Override
   protected aun go() {
      return auo.zs;
   }

   @Override
   public void c(to $$0) {
      super.c($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.w($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      axt $$4 = $$0.E_();
      cdi.d $$6;
      if ($$3 instanceof cdi.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cdi.c(this, $$6);
      } else {
         this.e = false;
         cdi.b[] $$8 = cdi.b.values();
         cql[] $$9 = cql.values();
         cdi.b $$10 = ac.a($$8, $$4);
         cql $$11 = ac.a($$9, $$4);
         cql $$12 = ac.a($$9, $$4);
         $$6 = new cdi.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(bqg<cdi> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.b_($$3.d()).a(avj.a) && $$1.a_($$3.c()).a(dcj.G) && ($$1.t($$3).a(avd.an) || cdk.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements ayg {
      a("kob", cdi.a.a, 0),
      b("sunstreak", cdi.a.a, 1),
      c("snooper", cdi.a.a, 2),
      d("dasher", cdi.a.a, 3),
      e("brinely", cdi.a.a, 4),
      f("spotty", cdi.a.a, 5),
      g("flopper", cdi.a.b, 0),
      h("stripey", cdi.a.b, 1),
      i("glitter", cdi.a.b, 2),
      j("blockfish", cdi.a.b, 3),
      k("betty", cdi.a.b, 4),
      l("clayfish", cdi.a.b, 5);

      public static final Codec<cdi.b> m = ayg.a(cdi.b::values);
      private static final IntFunction<cdi.b> n = awd.a(cdi.b::b, values(), a);
      private final String o;
      private final wi p;
      private final cdi.a q;
      private final int r;

      private b(String $$0, cdi.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wi.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cdi.b a(int $$0) {
         return n.apply($$0);
      }

      public cdi.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public wi d() {
         return this.p;
      }
   }

   static class c extends cch.a {
      final cdi.d b;

      c(cdi $$0, cdi.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cdi.b b, cql c, cql d) {
      public static final Codec<cdi.d> a = Codec.INT.xmap(cdi.d::new, cdi.d::a);

      public d(int $$0) {
         this(cdi.v($$0), cdi.t($$0), cdi.u($$0));
      }

      public int a() {
         return cdi.a(this.b, this.c, this.d);
      }
   }
}
