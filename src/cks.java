import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cks extends cjk {
   public static final cks.d a = new cks.d(cks.b.a, cyy.a, cyy.a);
   private static final akn<Integer> c = akr.a(cks.class, akp.b);
   public static final List<cks.d> b = List.of(
      new cks.d(cks.b.h, cyy.b, cyy.h),
      new cks.d(cks.b.g, cyy.h, cyy.h),
      new cks.d(cks.b.g, cyy.h, cyy.l),
      new cks.d(cks.b.l, cyy.a, cyy.h),
      new cks.d(cks.b.b, cyy.l, cyy.h),
      new cks.d(cks.b.a, cyy.b, cyy.a),
      new cks.d(cks.b.f, cyy.g, cyy.d),
      new cks.d(cks.b.j, cyy.k, cyy.e),
      new cks.d(cks.b.l, cyy.a, cyy.o),
      new cks.d(cks.b.f, cyy.a, cyy.e),
      new cks.d(cks.b.i, cyy.a, cyy.h),
      new cks.d(cks.b.l, cyy.a, cyy.b),
      new cks.d(cks.b.d, cyy.j, cyy.g),
      new cks.d(cks.b.e, cyy.f, cyy.d),
      new cks.d(cks.b.k, cyy.o, cyy.a),
      new cks.d(cks.b.c, cyy.h, cyy.o),
      new cks.d(cks.b.j, cyy.o, cyy.a),
      new cks.d(cks.b.g, cyy.a, cyy.e),
      new cks.d(cks.b.a, cyy.o, cyy.a),
      new cks.d(cks.b.b, cyy.h, cyy.a),
      new cks.d(cks.b.d, cyy.j, cyy.e),
      new cks.d(cks.b.g, cyy.e, cyy.e)
   );
   private boolean e = true;

   public cks(bxe<? extends cks> $$0, djz $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cks.b $$0, cyy $$1, cyy $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cyy c(int $$0) {
      return cyy.a($$0 >> 16 & 0xFF);
   }

   public static cyy r(int $$0) {
      return cyy.a($$0 >> 24 & 0xFF);
   }

   public static cks.b s(int $$0) {
      return cks.b.a($$0 & 65535);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(c, a.a());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", cks.d.a, new cks.d(this.gD()));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      cks.d $$1 = $$0.<cks.d>a("Variant", cks.d.a).orElse(a);
      this.t($$1.a());
   }

   private void t(int $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean q(int $$0) {
      return !this.e;
   }

   private int gD() {
      return this.al.a(c);
   }

   public cyy gA() {
      return c(this.gD());
   }

   public cyy gB() {
      return r(this.gD());
   }

   public cks.b gC() {
      return s(this.gD());
   }

   private void a(cks.b $$0) {
      int $$1 = this.gD();
      cyy $$2 = c($$1);
      cyy $$3 = r($$1);
      this.t(a($$0, $$2, $$3));
   }

   private void a(cyy $$0) {
      int $$1 = this.gD();
      cks.b $$2 = s($$1);
      cyy $$3 = r($$1);
      this.t(a($$2, $$0, $$3));
   }

   private void b(cyy $$0) {
      int $$1 = this.gD();
      cks.b $$2 = s($$1);
      cyy $$3 = c($$1);
      this.t(a($$2, $$3, $$0));
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      if ($$0 == kl.aC) {
         return c((kk<T>)$$0, this.gC());
      } else if ($$0 == kl.aD) {
         return c((kk<T>)$$0, this.gA());
      } else {
         return $$0 == kl.aE ? c((kk<T>)$$0, this.gB()) : super.a($$0);
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
   public void a_(daa $$0) {
      super.a_($$0);
      $$0.a(kl.aC, this);
      $$0.a(kl.aD, this);
      $$0.a(kl.aE, this);
   }

   @Override
   public daa W_() {
      return new daa(dae.ry);
   }

   @Override
   protected awq u() {
      return awr.AQ;
   }

   @Override
   protected awq l_() {
      return awr.AR;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.AT;
   }

   @Override
   protected awq t() {
      return awr.AS;
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azz $$4 = $$0.G_();
      cks.d $$6;
      if ($$3 instanceof cks.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ag.a(b, $$4);
         $$3 = new cks.c(this, $$6);
      } else {
         this.e = false;
         cks.b[] $$8 = cks.b.values();
         cyy[] $$9 = cyy.values();
         cks.b $$10 = ag.a($$8, $$4);
         cyy $$11 = ag.a($$9, $$4);
         cyy $$12 = ag.a($$9, $$4);
         $$6 = new cks.d($$10, $$11, $$12);
      }

      this.t($$6.a());
      return $$3;
   }

   public static boolean b(bxe<cks> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.b_($$3.e()).a(axl.a) && $$1.a_($$3.d()).a(dng.J) && ($$1.u($$3).a(axf.ap) || cku.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements bao, ddf {
      a("kob", cks.a.a, 0),
      b("sunstreak", cks.a.a, 1),
      c("snooper", cks.a.a, 2),
      d("dasher", cks.a.a, 3),
      e("brinely", cks.a.a, 4),
      f("spotty", cks.a.a, 5),
      g("flopper", cks.a.b, 0),
      h("stripey", cks.a.b, 1),
      i("glitter", cks.a.b, 2),
      j("blockfish", cks.a.b, 3),
      k("betty", cks.a.b, 4),
      l("clayfish", cks.a.b, 5);

      public static final Codec<cks.b> m = bao.a(cks.b::values);
      private static final IntFunction<cks.b> o = ayg.a(cks.b::b, values(), a);
      public static final za<ByteBuf, cks.b> n = yy.a(o, cks.b::b);
      private final String p;
      private final xc q;
      private final cks.a r;
      private final int s;

      private b(final String $$0, final cks.a $$1, final int $$2) {
         this.p = $$0;
         this.r = $$1;
         this.s = $$1.c | $$2 << 8;
         this.q = xc.c("entity.minecraft.tropical_fish.type." + this.p);
      }

      public static cks.b a(int $$0) {
         return o.apply($$0);
      }

      public cks.a a() {
         return this.r;
      }

      public int b() {
         return this.s;
      }

      @Override
      public String c() {
         return this.p;
      }

      public xc d() {
         return this.q;
      }

      @Override
      public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
         cyy $$4 = $$3.a(kl.aD, cks.a.c());
         cyy $$5 = $$3.a(kl.aE, cks.a.d());
         o[] $$6 = new o[]{o.u, o.h};
         int $$7 = cks.b.indexOf(new cks.d(this, $$4, $$5));
         if ($$7 != -1) {
            $$1.accept(xc.c(cks.b($$7)).a($$6));
         } else {
            $$1.accept(this.q.e().a($$6));
            xq $$8 = xc.c("color.minecraft." + $$4.b());
            if ($$4 != $$5) {
               $$8.f(", ").b(xc.c("color.minecraft." + $$5.b()));
            }

            $$8.a($$6);
            $$1.accept($$8);
         }
      }
   }

   static class c extends cjk.a {
      final cks.d b;

      c(cks $$0, cks.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cks.b b, cyy c, cyy d) {
      public static final Codec<cks.d> a = Codec.INT.xmap(cks.d::new, cks.d::a);

      public d(int $$0) {
         this(cks.s($$0), cks.c($$0), cks.r($$0));
      }

      public int a() {
         return cks.a(this.b, this.c, this.d);
      }
   }
}
