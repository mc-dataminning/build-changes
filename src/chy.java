import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chy extends cgw implements bwh<chy.b> {
   public static final String a = "BucketVariantTag";
   private static final akm<Integer> c = akq.a(chy.class, ako.b);
   public static final List<chy.d> b = List.of(
      new chy.d(chy.b.h, cvj.b, cvj.h),
      new chy.d(chy.b.g, cvj.h, cvj.h),
      new chy.d(chy.b.g, cvj.h, cvj.l),
      new chy.d(chy.b.l, cvj.a, cvj.h),
      new chy.d(chy.b.b, cvj.l, cvj.h),
      new chy.d(chy.b.a, cvj.b, cvj.a),
      new chy.d(chy.b.f, cvj.g, cvj.d),
      new chy.d(chy.b.j, cvj.k, cvj.e),
      new chy.d(chy.b.l, cvj.a, cvj.o),
      new chy.d(chy.b.f, cvj.a, cvj.e),
      new chy.d(chy.b.i, cvj.a, cvj.h),
      new chy.d(chy.b.l, cvj.a, cvj.b),
      new chy.d(chy.b.d, cvj.j, cvj.g),
      new chy.d(chy.b.e, cvj.f, cvj.d),
      new chy.d(chy.b.k, cvj.o, cvj.a),
      new chy.d(chy.b.c, cvj.h, cvj.o),
      new chy.d(chy.b.j, cvj.o, cvj.a),
      new chy.d(chy.b.g, cvj.a, cvj.e),
      new chy.d(chy.b.a, cvj.o, cvj.a),
      new chy.d(chy.b.b, cvj.h, cvj.a),
      new chy.d(chy.b.d, cvj.j, cvj.e),
      new chy.d(chy.b.g, cvj.e, cvj.e)
   );
   private boolean bY = true;

   public chy(bus<? extends chy> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(chy.b $$0, cvj $$1, cvj $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cvj c(int $$0) {
      return cvj.a($$0 >> 16 & 0xFF);
   }

   public static cvj r(int $$0) {
      return cvj.a($$0 >> 24 & 0xFF);
   }

   public static chy.b s(int $$0) {
      return chy.b.a($$0 & 65535);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Variant", this.gy());
   }

   @Override
   public void a(ul $$0) {
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

   private int gy() {
      return this.al.a(c);
   }

   public cvj gv() {
      return c(this.gy());
   }

   public cvj gw() {
      return r(this.gy());
   }

   public chy.b gx() {
      return s(this.gy());
   }

   public void a(chy.b $$0) {
      int $$1 = this.gy();
      cvj $$2 = c($$1);
      cvj $$3 = r($$1);
      this.u(a($$0, $$2, $$3));
   }

   @Override
   public void i(cwm $$0) {
      super.i($$0);
      cyv.a(ku.X, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gy()));
   }

   @Override
   public cwm V_() {
      return new cwm(cwq.qJ);
   }

   @Override
   protected awm t() {
      return awn.zQ;
   }

   @Override
   protected awm n_() {
      return awn.zR;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.zT;
   }

   @Override
   protected awm gn() {
      return awn.zS;
   }

   @Override
   public void h(ul $$0) {
      super.h($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.u($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azu $$4 = $$0.G_();
      chy.d $$6;
      if ($$3 instanceof chy.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ae.a(b, $$4);
         $$3 = new chy.c(this, $$6);
      } else {
         this.bY = false;
         chy.b[] $$8 = chy.b.values();
         cvj[] $$9 = cvj.values();
         chy.b $$10 = ae.a($$8, $$4);
         cvj $$11 = ae.a($$9, $$4);
         cvj $$12 = ae.a($$9, $$4);
         $$6 = new chy.d($$10, $$11, $$12);
      }

      this.u($$6.a());
      return $$3;
   }

   public static boolean b(bus<chy> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.b_($$3.e()).a(axi.a) && $$1.a_($$3.d()).a(dis.G) && ($$1.t($$3).a(axb.an) || cia.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements bai {
      a("kob", chy.a.a, 0),
      b("sunstreak", chy.a.a, 1),
      c("snooper", chy.a.a, 2),
      d("dasher", chy.a.a, 3),
      e("brinely", chy.a.a, 4),
      f("spotty", chy.a.a, 5),
      g("flopper", chy.a.b, 0),
      h("stripey", chy.a.b, 1),
      i("glitter", chy.a.b, 2),
      j("blockfish", chy.a.b, 3),
      k("betty", chy.a.b, 4),
      l("clayfish", chy.a.b, 5);

      public static final Codec<chy.b> m = bai.a(chy.b::values);
      private static final IntFunction<chy.b> n = ayd.a(chy.b::b, values(), a);
      private final String o;
      private final xj p;
      private final chy.a q;
      private final int r;

      private b(final String $$0, final chy.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xj.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static chy.b a(int $$0) {
         return n.apply($$0);
      }

      public chy.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public xj d() {
         return this.p;
      }
   }

   static class c extends cgw.a {
      final chy.d b;

      c(chy $$0, chy.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(chy.b b, cvj c, cvj d) {
      public static final Codec<chy.d> a = Codec.INT.xmap(chy.d::new, chy.d::a);

      public d(int $$0) {
         this(chy.s($$0), chy.c($$0), chy.r($$0));
      }

      public int a() {
         return chy.a(this.b, this.c, this.d);
      }
   }
}
