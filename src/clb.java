import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class clb extends cjt {
   public static final clb.d a = new clb.d(clb.b.a, czi.a, czi.a);
   private static final aku<Integer> c = aky.a(clb.class, akw.b);
   public static final List<clb.d> b = List.of(
      new clb.d(clb.b.h, czi.b, czi.h),
      new clb.d(clb.b.g, czi.h, czi.h),
      new clb.d(clb.b.g, czi.h, czi.l),
      new clb.d(clb.b.l, czi.a, czi.h),
      new clb.d(clb.b.b, czi.l, czi.h),
      new clb.d(clb.b.a, czi.b, czi.a),
      new clb.d(clb.b.f, czi.g, czi.d),
      new clb.d(clb.b.j, czi.k, czi.e),
      new clb.d(clb.b.l, czi.a, czi.o),
      new clb.d(clb.b.f, czi.a, czi.e),
      new clb.d(clb.b.i, czi.a, czi.h),
      new clb.d(clb.b.l, czi.a, czi.b),
      new clb.d(clb.b.d, czi.j, czi.g),
      new clb.d(clb.b.e, czi.f, czi.d),
      new clb.d(clb.b.k, czi.o, czi.a),
      new clb.d(clb.b.c, czi.h, czi.o),
      new clb.d(clb.b.j, czi.o, czi.a),
      new clb.d(clb.b.g, czi.a, czi.e),
      new clb.d(clb.b.a, czi.o, czi.a),
      new clb.d(clb.b.b, czi.h, czi.a),
      new clb.d(clb.b.d, czi.j, czi.e),
      new clb.d(clb.b.g, czi.e, czi.e)
   );
   private boolean e = true;

   public clb(bxn<? extends clb> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(clb.b $$0, czi $$1, czi $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static czi c(int $$0) {
      return czi.a($$0 >> 16 & 0xFF);
   }

   public static czi r(int $$0) {
      return czi.a($$0 >> 24 & 0xFF);
   }

   public static clb.b s(int $$0) {
      return clb.b.a($$0 & 65535);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(c, a.a());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", clb.d.a, new clb.d(this.gG()));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      clb.d $$1 = $$0.<clb.d>a("Variant", clb.d.a).orElse(a);
      this.t($$1.a());
   }

   private void t(int $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean q(int $$0) {
      return !this.e;
   }

   private int gG() {
      return this.al.a(c);
   }

   public czi gD() {
      return c(this.gG());
   }

   public czi gE() {
      return r(this.gG());
   }

   public clb.b gF() {
      return s(this.gG());
   }

   private void a(clb.b $$0) {
      int $$1 = this.gG();
      czi $$2 = c($$1);
      czi $$3 = r($$1);
      this.t(a($$0, $$2, $$3));
   }

   private void a(czi $$0) {
      int $$1 = this.gG();
      clb.b $$2 = s($$1);
      czi $$3 = r($$1);
      this.t(a($$2, $$0, $$3));
   }

   private void b(czi $$0) {
      int $$1 = this.gG();
      clb.b $$2 = s($$1);
      czi $$3 = c($$1);
      this.t(a($$2, $$3, $$0));
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      if ($$0 == kl.aC) {
         return c((kk<T>)$$0, this.gF());
      } else if ($$0 == kl.aD) {
         return c((kk<T>)$$0, this.gD());
      } else {
         return $$0 == kl.aE ? c((kk<T>)$$0, this.gE()) : super.a($$0);
      }
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aC);
      this.a($$0, kl.aD);
      this.a($$0, kl.aE);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aC) {
         this.a(c(kl.aC, $$1));
         return true;
      } else if ($$0 == kl.aD) {
         this.a(c(kl.aD, $$1));
         return true;
      } else if ($$0 == kl.aE) {
         this.b(c(kl.aE, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a_(dak $$0) {
      super.a_($$0);
      $$0.a(kl.aC, this);
      $$0.a(kl.aD, this);
      $$0.a(kl.aE, this);
   }

   @Override
   public dak a() {
      return new dak(dao.ry);
   }

   @Override
   protected awx s() {
      return awy.AQ;
   }

   @Override
   protected awx j_() {
      return awy.AR;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.AT;
   }

   @Override
   protected awx gv() {
      return awy.AS;
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      bai $$4 = $$0.G_();
      clb.d $$6;
      if ($$3 instanceof clb.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ag.a(b, $$4);
         $$3 = new clb.c(this, $$6);
      } else {
         this.e = false;
         clb.b[] $$8 = clb.b.values();
         czi[] $$9 = czi.values();
         clb.b $$10 = ag.a($$8, $$4);
         czi $$11 = ag.a($$9, $$4);
         czi $$12 = ag.a($$9, $$4);
         $$6 = new clb.d($$10, $$11, $$12);
      }

      this.t($$6.a());
      return $$3;
   }

   public static boolean b(bxn<clb> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.b_($$3.e()).a(axs.a) && $$1.a_($$3.d()).a(dnq.J) && ($$1.u($$3).a(axm.ap) || cld.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements bax, ddp {
      a("kob", clb.a.a, 0),
      b("sunstreak", clb.a.a, 1),
      c("snooper", clb.a.a, 2),
      d("dasher", clb.a.a, 3),
      e("brinely", clb.a.a, 4),
      f("spotty", clb.a.a, 5),
      g("flopper", clb.a.b, 0),
      h("stripey", clb.a.b, 1),
      i("glitter", clb.a.b, 2),
      j("blockfish", clb.a.b, 3),
      k("betty", clb.a.b, 4),
      l("clayfish", clb.a.b, 5);

      public static final Codec<clb.b> m = bax.a(clb.b::values);
      private static final IntFunction<clb.b> o = ayo.a(clb.b::b, values(), a);
      public static final ze<ByteBuf, clb.b> n = zc.a(o, clb.b::b);
      private final String p;
      private final xg q;
      private final clb.a r;
      private final int s;

      private b(final String $$0, final clb.a $$1, final int $$2) {
         this.p = $$0;
         this.r = $$1;
         this.s = $$1.c | $$2 << 8;
         this.q = xg.c("entity.minecraft.tropical_fish.type." + this.p);
      }

      public static clb.b a(int $$0) {
         return o.apply($$0);
      }

      public clb.a a() {
         return this.r;
      }

      public int b() {
         return this.s;
      }

      @Override
      public String c() {
         return this.p;
      }

      public xg d() {
         return this.q;
      }

      @Override
      public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
         czi $$4 = $$3.a(kl.aD, clb.a.c());
         czi $$5 = $$3.a(kl.aE, clb.a.d());
         o[] $$6 = new o[]{o.u, o.h};
         int $$7 = clb.b.indexOf(new clb.d(this, $$4, $$5));
         if ($$7 != -1) {
            $$1.accept(xg.c(clb.b($$7)).a($$6));
         } else {
            $$1.accept(this.q.e().a($$6));
            xu $$8 = xg.c("color.minecraft." + $$4.b());
            if ($$4 != $$5) {
               $$8.f(", ").b(xg.c("color.minecraft." + $$5.b()));
            }

            $$8.a($$6);
            $$1.accept($$8);
         }
      }
   }

   static class c extends cjt.a {
      final clb.d b;

      c(clb $$0, clb.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(clb.b b, czi c, czi d) {
      public static final Codec<clb.d> a = Codec.INT.xmap(clb.d::new, clb.d::a);

      public d(int $$0) {
         this(clb.s($$0), clb.c($$0), clb.r($$0));
      }

      public int a() {
         return clb.a(this.b, this.c, this.d);
      }
   }
}
