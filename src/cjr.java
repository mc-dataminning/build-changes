import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjr extends cim {
   public static final cjr.d a = new cjr.d(cjr.b.a, cxq.a, cxq.a);
   private static final akh<Integer> c = akl.a(cjr.class, akj.b);
   public static final List<cjr.d> b = List.of(
      new cjr.d(cjr.b.h, cxq.b, cxq.h),
      new cjr.d(cjr.b.g, cxq.h, cxq.h),
      new cjr.d(cjr.b.g, cxq.h, cxq.l),
      new cjr.d(cjr.b.l, cxq.a, cxq.h),
      new cjr.d(cjr.b.b, cxq.l, cxq.h),
      new cjr.d(cjr.b.a, cxq.b, cxq.a),
      new cjr.d(cjr.b.f, cxq.g, cxq.d),
      new cjr.d(cjr.b.j, cxq.k, cxq.e),
      new cjr.d(cjr.b.l, cxq.a, cxq.o),
      new cjr.d(cjr.b.f, cxq.a, cxq.e),
      new cjr.d(cjr.b.i, cxq.a, cxq.h),
      new cjr.d(cjr.b.l, cxq.a, cxq.b),
      new cjr.d(cjr.b.d, cxq.j, cxq.g),
      new cjr.d(cjr.b.e, cxq.f, cxq.d),
      new cjr.d(cjr.b.k, cxq.o, cxq.a),
      new cjr.d(cjr.b.c, cxq.h, cxq.o),
      new cjr.d(cjr.b.j, cxq.o, cxq.a),
      new cjr.d(cjr.b.g, cxq.a, cxq.e),
      new cjr.d(cjr.b.a, cxq.o, cxq.a),
      new cjr.d(cjr.b.b, cxq.h, cxq.a),
      new cjr.d(cjr.b.d, cxq.j, cxq.e),
      new cjr.d(cjr.b.g, cxq.e, cxq.e)
   );
   private boolean bF = true;

   public cjr(bwj<? extends cjr> $$0, dip $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cjr.b $$0, cxq $$1, cxq $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cxq c(int $$0) {
      return cxq.a($$0 >> 16 & 0xFF);
   }

   public static cxq r(int $$0) {
      return cxq.a($$0 >> 24 & 0xFF);
   }

   public static cjr.b s(int $$0) {
      return cjr.b.a($$0 & 65535);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(c, a.a());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz());
   }

   @Override
   public void a(tx $$0) {
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

   public cxq gw() {
      return c(this.gz());
   }

   public cxq gx() {
      return r(this.gz());
   }

   public cjr.b gy() {
      return s(this.gz());
   }

   private void a(cjr.b $$0) {
      int $$1 = this.gz();
      cxq $$2 = c($$1);
      cxq $$3 = r($$1);
      this.t(a($$0, $$2, $$3));
   }

   private void a(cxq $$0) {
      int $$1 = this.gz();
      cjr.b $$2 = s($$1);
      cxq $$3 = r($$1);
      this.t(a($$2, $$0, $$3));
   }

   private void b(cxq $$0) {
      int $$1 = this.gz();
      cjr.b $$2 = s($$1);
      cxq $$3 = c($$1);
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
   public void j(cys $$0) {
      super.j($$0);
      $$0.a(kj.aB, this);
      $$0.a(kj.aC, this);
      $$0.a(kj.aD, this);
   }

   @Override
   public cys R_() {
      return new cys(cyw.rt);
   }

   @Override
   protected awk u() {
      return awl.AK;
   }

   @Override
   protected awk l_() {
      return awl.AL;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.AN;
   }

   @Override
   protected awk t() {
      return awl.AM;
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azt $$4 = $$0.C_();
      cjr.d $$6;
      if ($$3 instanceof cjr.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = af.a(b, $$4);
         $$3 = new cjr.c(this, $$6);
      } else {
         this.bF = false;
         cjr.b[] $$8 = cjr.b.values();
         cxq[] $$9 = cxq.values();
         cjr.b $$10 = af.a($$8, $$4);
         cxq $$11 = af.a($$9, $$4);
         cxq $$12 = af.a($$9, $$4);
         $$6 = new cjr.d($$10, $$11, $$12);
      }

      this.t($$6.a());
      return $$3;
   }

   public static boolean b(bwj<cjr> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.b_($$3.e()).a(axf.a) && $$1.a_($$3.d()).a(dlw.J) && ($$1.u($$3).a(awz.ap) || cjt.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements bai, dbx {
      a("kob", cjr.a.a, 0),
      b("sunstreak", cjr.a.a, 1),
      c("snooper", cjr.a.a, 2),
      d("dasher", cjr.a.a, 3),
      e("brinely", cjr.a.a, 4),
      f("spotty", cjr.a.a, 5),
      g("flopper", cjr.a.b, 0),
      h("stripey", cjr.a.b, 1),
      i("glitter", cjr.a.b, 2),
      j("blockfish", cjr.a.b, 3),
      k("betty", cjr.a.b, 4),
      l("clayfish", cjr.a.b, 5);

      public static final Codec<cjr.b> m = bai.a(cjr.b::values);
      private static final IntFunction<cjr.b> o = aya.a(cjr.b::b, values(), a);
      public static final yu<ByteBuf, cjr.b> n = ys.a(o, cjr.b::b);
      private final String p;
      private final ww q;
      private final cjr.a r;
      private final int s;

      private b(final String $$0, final cjr.a $$1, final int $$2) {
         this.p = $$0;
         this.r = $$1;
         this.s = $$1.c | $$2 << 8;
         this.q = ww.c("entity.minecraft.tropical_fish.type." + this.p);
      }

      public static cjr.b a(int $$0) {
         return o.apply($$0);
      }

      public cjr.a a() {
         return this.r;
      }

      public int b() {
         return this.s;
      }

      @Override
      public String c() {
         return this.p;
      }

      public ww d() {
         return this.q;
      }

      @Override
      public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
         cxq $$4 = $$3.a(kj.aC, cjr.a.c());
         cxq $$5 = $$3.a(kj.aD, cjr.a.d());
         n[] $$6 = new n[]{n.u, n.h};
         int $$7 = cjr.b.indexOf(new cjr.d(this, $$4, $$5));
         if ($$7 != -1) {
            $$1.accept(ww.c(cjr.b($$7)).a($$6));
         } else {
            $$1.accept(this.q.e().a($$6));
            xk $$8 = ww.c("color.minecraft." + $$4.b());
            if ($$4 != $$5) {
               $$8.f(", ").b(ww.c("color.minecraft." + $$5.b()));
            }

            $$8.a($$6);
            $$1.accept($$8);
         }
      }
   }

   static class c extends cim.a {
      final cjr.d b;

      c(cjr $$0, cjr.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cjr.b b, cxq c, cxq d) {
      public static final Codec<cjr.d> a = Codec.INT.xmap(cjr.d::new, cjr.d::a);

      public d(int $$0) {
         this(cjr.s($$0), cjr.c($$0), cjr.r($$0));
      }

      public int a() {
         return cjr.a(this.b, this.c, this.d);
      }
   }
}
