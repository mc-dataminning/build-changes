import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjx extends ciq {
   public static final cjx.d a = new cjx.d(cjx.b.a, cxw.a, cxw.a);
   private static final akj<Integer> c = akn.a(cjx.class, akl.b);
   public static final List<cjx.d> b = List.of(
      new cjx.d(cjx.b.h, cxw.b, cxw.h),
      new cjx.d(cjx.b.g, cxw.h, cxw.h),
      new cjx.d(cjx.b.g, cxw.h, cxw.l),
      new cjx.d(cjx.b.l, cxw.a, cxw.h),
      new cjx.d(cjx.b.b, cxw.l, cxw.h),
      new cjx.d(cjx.b.a, cxw.b, cxw.a),
      new cjx.d(cjx.b.f, cxw.g, cxw.d),
      new cjx.d(cjx.b.j, cxw.k, cxw.e),
      new cjx.d(cjx.b.l, cxw.a, cxw.o),
      new cjx.d(cjx.b.f, cxw.a, cxw.e),
      new cjx.d(cjx.b.i, cxw.a, cxw.h),
      new cjx.d(cjx.b.l, cxw.a, cxw.b),
      new cjx.d(cjx.b.d, cxw.j, cxw.g),
      new cjx.d(cjx.b.e, cxw.f, cxw.d),
      new cjx.d(cjx.b.k, cxw.o, cxw.a),
      new cjx.d(cjx.b.c, cxw.h, cxw.o),
      new cjx.d(cjx.b.j, cxw.o, cxw.a),
      new cjx.d(cjx.b.g, cxw.a, cxw.e),
      new cjx.d(cjx.b.a, cxw.o, cxw.a),
      new cjx.d(cjx.b.b, cxw.h, cxw.a),
      new cjx.d(cjx.b.d, cxw.j, cxw.e),
      new cjx.d(cjx.b.g, cxw.e, cxw.e)
   );
   private boolean bF = true;

   public cjx(bwm<? extends cjx> $$0, div $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cjx.b $$0, cxw $$1, cxw $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cxw c(int $$0) {
      return cxw.a($$0 >> 16 & 0xFF);
   }

   public static cxw r(int $$0) {
      return cxw.a($$0 >> 24 & 0xFF);
   }

   public static cjx.b s(int $$0) {
      return cjx.b.a($$0 & 65535);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, a.a());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.t($$0.h("Variant"));
   }

   private void t(int $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean q(int $$0) {
      return !this.bF;
   }

   private int gz() {
      return this.al.a(c);
   }

   public cxw gw() {
      return c(this.gz());
   }

   public cxw gx() {
      return r(this.gz());
   }

   public cjx.b gy() {
      return s(this.gz());
   }

   private void a(cjx.b $$0) {
      int $$1 = this.gz();
      cxw $$2 = c($$1);
      cxw $$3 = r($$1);
      this.t(a($$0, $$2, $$3));
   }

   private void a(cxw $$0) {
      int $$1 = this.gz();
      cjx.b $$2 = s($$1);
      cxw $$3 = r($$1);
      this.t(a($$2, $$0, $$3));
   }

   private void b(cxw $$0) {
      int $$1 = this.gz();
      cjx.b $$2 = s($$1);
      cxw $$3 = c($$1);
      this.t(a($$2, $$3, $$0));
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      if ($$0 == kj.aB) {
         return c((ki<T>)$$0, this.gy());
      } else if ($$0 == kj.aC) {
         return c((ki<T>)$$0, this.gw());
      } else {
         return $$0 == kj.aD ? c((ki<T>)$$0, this.gx()) : super.a($$0);
      }
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aB);
      this.a($$0, kj.aC);
      this.a($$0, kj.aD);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aB) {
         this.a(c(kj.aB, $$1));
         return true;
      } else if ($$0 == kj.aC) {
         this.a(c(kj.aC, $$1));
         return true;
      } else if ($$0 == kj.aD) {
         this.b(c(kj.aD, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a_(cyy $$0) {
      super.a_($$0);
      $$0.a(kj.aB, this);
      $$0.a(kj.aC, this);
      $$0.a(kj.aD, this);
   }

   @Override
   public cyy R_() {
      return new cyy(czc.rv);
   }

   @Override
   protected awm u() {
      return awn.AN;
   }

   @Override
   protected awm l_() {
      return awn.AO;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.AQ;
   }

   @Override
   protected awm t() {
      return awn.AP;
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azv $$4 = $$0.C_();
      cjx.d $$6;
      if ($$3 instanceof cjx.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = af.a(b, $$4);
         $$3 = new cjx.c(this, $$6);
      } else {
         this.bF = false;
         cjx.b[] $$8 = cjx.b.values();
         cxw[] $$9 = cxw.values();
         cjx.b $$10 = af.a($$8, $$4);
         cxw $$11 = af.a($$9, $$4);
         cxw $$12 = af.a($$9, $$4);
         $$6 = new cjx.d($$10, $$11, $$12);
      }

      this.t($$6.a());
      return $$3;
   }

   public static boolean b(bwm<cjx> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.b_($$3.e()).a(axh.a) && $$1.a_($$3.d()).a(dmc.J) && ($$1.u($$3).a(axb.ap) || cjz.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements bak, dcd {
      a("kob", cjx.a.a, 0),
      b("sunstreak", cjx.a.a, 1),
      c("snooper", cjx.a.a, 2),
      d("dasher", cjx.a.a, 3),
      e("brinely", cjx.a.a, 4),
      f("spotty", cjx.a.a, 5),
      g("flopper", cjx.a.b, 0),
      h("stripey", cjx.a.b, 1),
      i("glitter", cjx.a.b, 2),
      j("blockfish", cjx.a.b, 3),
      k("betty", cjx.a.b, 4),
      l("clayfish", cjx.a.b, 5);

      public static final Codec<cjx.b> m = bak.a(cjx.b::values);
      private static final IntFunction<cjx.b> o = ayc.a(cjx.b::b, values(), a);
      public static final yw<ByteBuf, cjx.b> n = yu.a(o, cjx.b::b);
      private final String p;
      private final wy q;
      private final cjx.a r;
      private final int s;

      private b(final String $$0, final cjx.a $$1, final int $$2) {
         this.p = $$0;
         this.r = $$1;
         this.s = $$1.c | $$2 << 8;
         this.q = wy.c("entity.minecraft.tropical_fish.type." + this.p);
      }

      public static cjx.b a(int $$0) {
         return o.apply($$0);
      }

      public cjx.a a() {
         return this.r;
      }

      public int b() {
         return this.s;
      }

      @Override
      public String c() {
         return this.p;
      }

      public wy d() {
         return this.q;
      }

      @Override
      public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
         cxw $$4 = $$3.a(kj.aC, cjx.a.c());
         cxw $$5 = $$3.a(kj.aD, cjx.a.d());
         n[] $$6 = new n[]{n.u, n.h};
         int $$7 = cjx.b.indexOf(new cjx.d(this, $$4, $$5));
         if ($$7 != -1) {
            $$1.accept(wy.c(cjx.b($$7)).a($$6));
         } else {
            $$1.accept(this.q.e().a($$6));
            xm $$8 = wy.c("color.minecraft." + $$4.b());
            if ($$4 != $$5) {
               $$8.f(", ").b(wy.c("color.minecraft." + $$5.b()));
            }

            $$8.a($$6);
            $$1.accept($$8);
         }
      }
   }

   static class c extends ciq.a {
      final cjx.d b;

      c(cjx $$0, cjx.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cjx.b b, cxw c, cxw d) {
      public static final Codec<cjx.d> a = Codec.INT.xmap(cjx.d::new, cjx.d::a);

      public d(int $$0) {
         this(cjx.s($$0), cjx.c($$0), cjx.r($$0));
      }

      public int a() {
         return cjx.a(this.b, this.c, this.d);
      }
   }
}
