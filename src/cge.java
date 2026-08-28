import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cge extends cfd implements buo<cge.b> {
   public static final String b = "BucketVariantTag";
   private static final ajw<Integer> d = aka.a(cge.class, ajy.b);
   public static final List<cge.d> c = List.of(
      new cge.d(cge.b.h, cti.b, cti.h),
      new cge.d(cge.b.g, cti.h, cti.h),
      new cge.d(cge.b.g, cti.h, cti.l),
      new cge.d(cge.b.l, cti.a, cti.h),
      new cge.d(cge.b.b, cti.l, cti.h),
      new cge.d(cge.b.a, cti.b, cti.a),
      new cge.d(cge.b.f, cti.g, cti.d),
      new cge.d(cge.b.j, cti.k, cti.e),
      new cge.d(cge.b.l, cti.a, cti.o),
      new cge.d(cge.b.f, cti.a, cti.e),
      new cge.d(cge.b.i, cti.a, cti.h),
      new cge.d(cge.b.l, cti.a, cti.b),
      new cge.d(cge.b.d, cti.j, cti.g),
      new cge.d(cge.b.e, cti.f, cti.d),
      new cge.d(cge.b.k, cti.o, cti.a),
      new cge.d(cge.b.c, cti.h, cti.o),
      new cge.d(cge.b.j, cti.o, cti.a),
      new cge.d(cge.b.g, cti.a, cti.e),
      new cge.d(cge.b.a, cti.o, cti.a),
      new cge.d(cge.b.b, cti.h, cti.a),
      new cge.d(cge.b.d, cti.j, cti.e),
      new cge.d(cge.b.g, cti.e, cti.e)
   );
   private boolean e = true;

   public cge(bsx<? extends cge> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cge.b $$0, cti $$1, cti $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cti s(int $$0) {
      return cti.a($$0 >> 16 & 0xFF);
   }

   public static cti t(int $$0) {
      return cti.a($$0 >> 24 & 0xFF);
   }

   public static cge.b u(int $$0) {
      return cge.b.a($$0 & 65535);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Variant", this.gw());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.v($$0.h("Variant"));
   }

   private void v(int $$0) {
      this.ao.a(d, $$0);
   }

   @Override
   public boolean r(int $$0) {
      return !this.e;
   }

   private int gw() {
      return this.ao.a(d);
   }

   public cti gt() {
      return s(this.gw());
   }

   public cti gu() {
      return t(this.gw());
   }

   public cge.b gv() {
      return u(this.gw());
   }

   public void a(cge.b $$0) {
      int $$1 = this.gw();
      cti $$2 = s($$1);
      cti $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void n(cuq $$0) {
      super.n($$0);
      cxh.a(kq.N, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gw()));
   }

   @Override
   public cuq b() {
      return new cuq(cut.qI);
   }

   @Override
   protected avo v() {
      return avp.zM;
   }

   @Override
   protected avo n_() {
      return avp.zN;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.zP;
   }

   @Override
   protected avo gl() {
      return avp.zO;
   }

   @Override
   public void h(ub $$0) {
      super.h($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.v($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayw $$4 = $$0.E_();
      cge.d $$6;
      if ($$3 instanceof cge.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ad.a(c, $$4);
         $$3 = new cge.c(this, $$6);
      } else {
         this.e = false;
         cge.b[] $$8 = cge.b.values();
         cti[] $$9 = cti.values();
         cge.b $$10 = ad.a($$8, $$4);
         cti $$11 = ad.a($$9, $$4);
         cti $$12 = ad.a($$9, $$4);
         $$6 = new cge.d($$10, $$11, $$12);
      }

      this.v($$6.a());
      return $$3;
   }

   public static boolean b(bsx<cge> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.b_($$3.e()).a(awk.a) && $$1.a_($$3.d()).a(dga.G) && ($$1.t($$3).a(awd.an) || cgg.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements azk {
      a("kob", cge.a.a, 0),
      b("sunstreak", cge.a.a, 1),
      c("snooper", cge.a.a, 2),
      d("dasher", cge.a.a, 3),
      e("brinely", cge.a.a, 4),
      f("spotty", cge.a.a, 5),
      g("flopper", cge.a.b, 0),
      h("stripey", cge.a.b, 1),
      i("glitter", cge.a.b, 2),
      j("blockfish", cge.a.b, 3),
      k("betty", cge.a.b, 4),
      l("clayfish", cge.a.b, 5);

      public static final Codec<cge.b> m = azk.a(cge.b::values);
      private static final IntFunction<cge.b> n = axe.a(cge.b::b, values(), a);
      private final String o;
      private final wz p;
      private final cge.a q;
      private final int r;

      private b(final String $$0, final cge.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wz.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cge.b a(int $$0) {
         return n.apply($$0);
      }

      public cge.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public wz d() {
         return this.p;
      }
   }

   static class c extends cfd.a {
      final cge.d b;

      c(cge $$0, cge.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cge.b b, cti c, cti d) {
      public static final Codec<cge.d> a = Codec.INT.xmap(cge.d::new, cge.d::a);

      public d(int $$0) {
         this(cge.u($$0), cge.s($$0), cge.t($$0));
      }

      public int a() {
         return cge.a(this.b, this.c, this.d);
      }
   }
}
