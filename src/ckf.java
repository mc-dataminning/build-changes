import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckf extends cix {
   public static final ckf.d a = new ckf.d(ckf.b.a, cyi.a, cyi.a);
   private static final akj<Integer> c = akn.a(ckf.class, akl.b);
   public static final List<ckf.d> b = List.of(
      new ckf.d(ckf.b.h, cyi.b, cyi.h),
      new ckf.d(ckf.b.g, cyi.h, cyi.h),
      new ckf.d(ckf.b.g, cyi.h, cyi.l),
      new ckf.d(ckf.b.l, cyi.a, cyi.h),
      new ckf.d(ckf.b.b, cyi.l, cyi.h),
      new ckf.d(ckf.b.a, cyi.b, cyi.a),
      new ckf.d(ckf.b.f, cyi.g, cyi.d),
      new ckf.d(ckf.b.j, cyi.k, cyi.e),
      new ckf.d(ckf.b.l, cyi.a, cyi.o),
      new ckf.d(ckf.b.f, cyi.a, cyi.e),
      new ckf.d(ckf.b.i, cyi.a, cyi.h),
      new ckf.d(ckf.b.l, cyi.a, cyi.b),
      new ckf.d(ckf.b.d, cyi.j, cyi.g),
      new ckf.d(ckf.b.e, cyi.f, cyi.d),
      new ckf.d(ckf.b.k, cyi.o, cyi.a),
      new ckf.d(ckf.b.c, cyi.h, cyi.o),
      new ckf.d(ckf.b.j, cyi.o, cyi.a),
      new ckf.d(ckf.b.g, cyi.a, cyi.e),
      new ckf.d(ckf.b.a, cyi.o, cyi.a),
      new ckf.d(ckf.b.b, cyi.h, cyi.a),
      new ckf.d(ckf.b.d, cyi.j, cyi.e),
      new ckf.d(ckf.b.g, cyi.e, cyi.e)
   );
   private boolean bG = true;

   public ckf(bwr<? extends ckf> $$0, djh $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(ckf.b $$0, cyi $$1, cyi $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cyi c(int $$0) {
      return cyi.a($$0 >> 16 & 0xFF);
   }

   public static cyi r(int $$0) {
      return cyi.a($$0 >> 24 & 0xFF);
   }

   public static ckf.b s(int $$0) {
      return ckf.b.a($$0 & 65535);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, a.a());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", ckf.d.a, new ckf.d(this.gC()));
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ckf.d $$1 = $$0.<ckf.d>a("Variant", ckf.d.a).orElse(a);
      this.t($$1.a());
   }

   private void t(int $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean q(int $$0) {
      return !this.bG;
   }

   private int gC() {
      return this.al.a(c);
   }

   public cyi gz() {
      return c(this.gC());
   }

   public cyi gA() {
      return r(this.gC());
   }

   public ckf.b gB() {
      return s(this.gC());
   }

   private void a(ckf.b $$0) {
      int $$1 = this.gC();
      cyi $$2 = c($$1);
      cyi $$3 = r($$1);
      this.t(a($$0, $$2, $$3));
   }

   private void a(cyi $$0) {
      int $$1 = this.gC();
      ckf.b $$2 = s($$1);
      cyi $$3 = r($$1);
      this.t(a($$2, $$0, $$3));
   }

   private void b(cyi $$0) {
      int $$1 = this.gC();
      ckf.b $$2 = s($$1);
      cyi $$3 = c($$1);
      this.t(a($$2, $$3, $$0));
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      if ($$0 == kk.aB) {
         return c((kj<T>)$$0, this.gB());
      } else if ($$0 == kk.aC) {
         return c((kj<T>)$$0, this.gz());
      } else {
         return $$0 == kk.aD ? c((kj<T>)$$0, this.gA()) : super.a($$0);
      }
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aB);
      this.a($$0, kk.aC);
      this.a($$0, kk.aD);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aB) {
         this.a(c(kk.aB, $$1));
         return true;
      } else if ($$0 == kk.aC) {
         this.a(c(kk.aC, $$1));
         return true;
      } else if ($$0 == kk.aD) {
         this.b(c(kk.aD, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a_(czk $$0) {
      super.a_($$0);
      $$0.a(kk.aB, this);
      $$0.a(kk.aC, this);
      $$0.a(kk.aD, this);
   }

   @Override
   public czk S_() {
      return new czk(czo.ry);
   }

   @Override
   protected awm u() {
      return awn.AQ;
   }

   @Override
   protected awm l_() {
      return awn.AR;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.AT;
   }

   @Override
   protected awm t() {
      return awn.AS;
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azv $$4 = $$0.C_();
      ckf.d $$6;
      if ($$3 instanceof ckf.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ag.a(b, $$4);
         $$3 = new ckf.c(this, $$6);
      } else {
         this.bG = false;
         ckf.b[] $$8 = ckf.b.values();
         cyi[] $$9 = cyi.values();
         ckf.b $$10 = ag.a($$8, $$4);
         cyi $$11 = ag.a($$9, $$4);
         cyi $$12 = ag.a($$9, $$4);
         $$6 = new ckf.d($$10, $$11, $$12);
      }

      this.t($$6.a());
      return $$3;
   }

   public static boolean b(bwr<ckf> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.b_($$3.e()).a(axh.a) && $$1.a_($$3.d()).a(dmo.J) && ($$1.u($$3).a(axb.ap) || ckh.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements bak, dcp {
      a("kob", ckf.a.a, 0),
      b("sunstreak", ckf.a.a, 1),
      c("snooper", ckf.a.a, 2),
      d("dasher", ckf.a.a, 3),
      e("brinely", ckf.a.a, 4),
      f("spotty", ckf.a.a, 5),
      g("flopper", ckf.a.b, 0),
      h("stripey", ckf.a.b, 1),
      i("glitter", ckf.a.b, 2),
      j("blockfish", ckf.a.b, 3),
      k("betty", ckf.a.b, 4),
      l("clayfish", ckf.a.b, 5);

      public static final Codec<ckf.b> m = bak.a(ckf.b::values);
      private static final IntFunction<ckf.b> o = ayc.a(ckf.b::b, values(), a);
      public static final yw<ByteBuf, ckf.b> n = yu.a(o, ckf.b::b);
      private final String p;
      private final wy q;
      private final ckf.a r;
      private final int s;

      private b(final String $$0, final ckf.a $$1, final int $$2) {
         this.p = $$0;
         this.r = $$1;
         this.s = $$1.c | $$2 << 8;
         this.q = wy.c("entity.minecraft.tropical_fish.type." + this.p);
      }

      public static ckf.b a(int $$0) {
         return o.apply($$0);
      }

      public ckf.a a() {
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
      public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
         cyi $$4 = $$3.a(kk.aC, ckf.a.c());
         cyi $$5 = $$3.a(kk.aD, ckf.a.d());
         o[] $$6 = new o[]{o.u, o.h};
         int $$7 = ckf.b.indexOf(new ckf.d(this, $$4, $$5));
         if ($$7 != -1) {
            $$1.accept(wy.c(ckf.b($$7)).a($$6));
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

   static class c extends cix.a {
      final ckf.d b;

      c(ckf $$0, ckf.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(ckf.b b, cyi c, cyi d) {
      public static final Codec<ckf.d> a = Codec.INT.xmap(ckf.d::new, ckf.d::a);

      public d(int $$0) {
         this(ckf.s($$0), ckf.c($$0), ckf.r($$0));
      }

      public int a() {
         return ckf.a(this.b, this.c, this.d);
      }
   }
}
