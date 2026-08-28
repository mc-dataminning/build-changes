import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgc extends cfb implements bum<cgc.b> {
   public static final String b = "BucketVariantTag";
   private static final ajv<Integer> d = ajz.a(cgc.class, ajx.b);
   public static final List<cgc.d> c = List.of(
      new cgc.d(cgc.b.h, ctg.b, ctg.h),
      new cgc.d(cgc.b.g, ctg.h, ctg.h),
      new cgc.d(cgc.b.g, ctg.h, ctg.l),
      new cgc.d(cgc.b.l, ctg.a, ctg.h),
      new cgc.d(cgc.b.b, ctg.l, ctg.h),
      new cgc.d(cgc.b.a, ctg.b, ctg.a),
      new cgc.d(cgc.b.f, ctg.g, ctg.d),
      new cgc.d(cgc.b.j, ctg.k, ctg.e),
      new cgc.d(cgc.b.l, ctg.a, ctg.o),
      new cgc.d(cgc.b.f, ctg.a, ctg.e),
      new cgc.d(cgc.b.i, ctg.a, ctg.h),
      new cgc.d(cgc.b.l, ctg.a, ctg.b),
      new cgc.d(cgc.b.d, ctg.j, ctg.g),
      new cgc.d(cgc.b.e, ctg.f, ctg.d),
      new cgc.d(cgc.b.k, ctg.o, ctg.a),
      new cgc.d(cgc.b.c, ctg.h, ctg.o),
      new cgc.d(cgc.b.j, ctg.o, ctg.a),
      new cgc.d(cgc.b.g, ctg.a, ctg.e),
      new cgc.d(cgc.b.a, ctg.o, ctg.a),
      new cgc.d(cgc.b.b, ctg.h, ctg.a),
      new cgc.d(cgc.b.d, ctg.j, ctg.e),
      new cgc.d(cgc.b.g, ctg.e, ctg.e)
   );
   private boolean e = true;

   public cgc(bsw<? extends cgc> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cgc.b $$0, ctg $$1, ctg $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static ctg s(int $$0) {
      return ctg.a($$0 >> 16 & 0xFF);
   }

   public static ctg t(int $$0) {
      return ctg.a($$0 >> 24 & 0xFF);
   }

   public static cgc.b u(int $$0) {
      return cgc.b.a($$0 & 65535);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", this.gy());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.v($$0.h("Variant"));
   }

   private void v(int $$0) {
      this.ao.a(d, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.e;
   }

   private int gy() {
      return this.ao.a(d);
   }

   public ctg gv() {
      return s(this.gy());
   }

   public ctg gw() {
      return t(this.gy());
   }

   public cgc.b gx() {
      return u(this.gy());
   }

   public void a(cgc.b $$0) {
      int $$1 = this.gy();
      ctg $$2 = s($$1);
      ctg $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void n(cuo $$0) {
      super.n($$0);
      cxf.a(kq.N, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gy()));
   }

   @Override
   public cuo b() {
      return new cuo(cur.qI);
   }

   @Override
   protected avn v() {
      return avo.zM;
   }

   @Override
   protected avn n_() {
      return avo.zN;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.zP;
   }

   @Override
   protected avn gn() {
      return avo.zO;
   }

   @Override
   public void c(ua $$0) {
      super.c($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.v($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayv $$4 = $$0.E_();
      cgc.d $$6;
      if ($$3 instanceof cgc.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ad.a(c, $$4);
         $$3 = new cgc.c(this, $$6);
      } else {
         this.e = false;
         cgc.b[] $$8 = cgc.b.values();
         ctg[] $$9 = ctg.values();
         cgc.b $$10 = ad.a($$8, $$4);
         ctg $$11 = ad.a($$9, $$4);
         ctg $$12 = ad.a($$9, $$4);
         $$6 = new cgc.d($$10, $$11, $$12);
      }

      this.v($$6.a());
      return $$3;
   }

   public static boolean b(bsw<cgc> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.b_($$3.d()).a(awj.a) && $$1.a_($$3.c()).a(dfy.G) && ($$1.t($$3).a(awc.an) || cge.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements azj {
      a("kob", cgc.a.a, 0),
      b("sunstreak", cgc.a.a, 1),
      c("snooper", cgc.a.a, 2),
      d("dasher", cgc.a.a, 3),
      e("brinely", cgc.a.a, 4),
      f("spotty", cgc.a.a, 5),
      g("flopper", cgc.a.b, 0),
      h("stripey", cgc.a.b, 1),
      i("glitter", cgc.a.b, 2),
      j("blockfish", cgc.a.b, 3),
      k("betty", cgc.a.b, 4),
      l("clayfish", cgc.a.b, 5);

      public static final Codec<cgc.b> m = azj.a(cgc.b::values);
      private static final IntFunction<cgc.b> n = axd.a(cgc.b::b, values(), a);
      private final String o;
      private final wy p;
      private final cgc.a q;
      private final int r;

      private b(final String $$0, final cgc.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wy.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cgc.b a(int $$0) {
         return n.apply($$0);
      }

      public cgc.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public wy d() {
         return this.p;
      }
   }

   static class c extends cfb.a {
      final cgc.d b;

      c(cgc $$0, cgc.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cgc.b b, ctg c, ctg d) {
      public static final Codec<cgc.d> a = Codec.INT.xmap(cgc.d::new, cgc.d::a);

      public d(int $$0) {
         this(cgc.u($$0), cgc.s($$0), cgc.t($$0));
      }

      public int a() {
         return cgc.a(this.b, this.c, this.d);
      }
   }
}
