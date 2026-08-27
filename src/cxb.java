import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class cxb implements cxc, AutoCloseable {
   public static final Codec<ajg<cxb>> g = ajg.a(kj.aN);
   public static final ajg<cxb> h = ajg.a(kj.aN, new ajh("overworld"));
   public static final ajg<cxb> i = ajg.a(kj.aN, new ajh("the_nether"));
   public static final ajg<cxb> j = ajg.a(kj.aN, new ajh("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<dlz> r = Lists.newArrayList();
   protected final ejr s;
   private final List<dlz> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = axd.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final axd z = axd.a();
   @Deprecated
   private final axd f = axd.b();
   private final il<dqo> D;
   protected final ekt A;
   private final Supplier<bjr> E;
   public final boolean B;
   private final dos F;
   private final cyc G;
   private final ajg<cxb> H;
   private final iz I;
   private final bnx J;
   private long K;

   protected cxb(ekt $$0, ajg<cxb> $$1, iz $$2, il<dqo> $$3, Supplier<bjr> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dqo $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dos() {
            @Override
            public double a() {
               return super.a() / $$9.k();
            }

            @Override
            public double b() {
               return super.b() / $$9.k();
            }
         };
      } else {
         this.F = new dos();
      }

      this.c = Thread.currentThread();
      this.G = new cyc(this, $$7);
      this.d = $$6;
      this.s = new ejp(this, $$8);
      this.I = $$2;
      this.J = new bnx($$2);
   }

   @Override
   public boolean x_() {
      return this.B;
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return null;
   }

   public boolean k(ib $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(ib $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(ib $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dpi m(ib $$0) {
      return this.d(je.a($$0.u()), je.a($$0.w()));
   }

   public dpi d(int $$0, int $$1) {
      return (dpi)this.a($$0, $$1, dpc.n);
   }

   @Nullable
   @Override
   public dox a(int $$0, int $$1, dpc $$2, boolean $$3) {
      dox $$4 = this.L().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(ib $$0, dnb $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(ib $$0, dnb $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ag()) {
         return false;
      } else {
         dpi $$4 = this.m($$0);
         dac $$5 = $$1.b();
         dnb $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dnb $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(aoy.c))) {
                  this.a($$0, $$6, $$1, $$2);
               }

               if (($$2 & 1) != 0) {
                  this.b($$0, $$6.b());
                  if (!this.B && $$1.n()) {
                     this.c($$0, $$5);
                  }
               }

               if (($$2 & 16) == 0 && $$3 > 0) {
                  int $$8 = $$2 & -34;
                  $$6.b(this, $$0, $$8, $$3 - 1);
                  $$1.a((cxc)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(ib $$0, dnb $$1, dnb $$2) {
   }

   @Override
   public boolean a(ib $$0, boolean $$1) {
      eip $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(ib $$0, boolean $$1, @Nullable box $$2, int $$3) {
      dnb $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         eip $$5 = this.b_($$0);
         if (!($$4.b() instanceof czp)) {
            this.c(2001, $$0, dac.i($$4));
         }

         if ($$1) {
            dki $$6 = $$4.t() ? this.c_($$0) : null;
            dac.a($$4, this, $$0, $$6, $$2, cqm.h);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(drp.f, $$0, drp.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(ib $$0, dnb $$1) {
   }

   public boolean b(ib $$0, dnb $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(ib var1, dnb var2, dnb var3, int var4);

   public void b(ib $$0, dnb $$1, dnb $$2) {
   }

   public void a(ib $$0, dac $$1) {
   }

   public void a(ib $$0, dac $$1, ih $$2) {
   }

   public void a(ib $$0, dac $$1, ib $$2) {
   }

   public void a(dnb $$0, ib $$1, dac $$2, ib $$3, boolean $$4) {
   }

   @Override
   public void a(ih $$0, dnb $$1, ib $$2, ib $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dso.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(je.a($$1), je.a($$2))) {
            $$4 = this.d(je.a($$1), je.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.z_() + 1;
      }

      return $$4;
   }

   @Override
   public eie y_() {
      return this.L().p();
   }

   @Override
   public dnb a_(ib $$0) {
      if (this.s($$0)) {
         return dae.nb.o();
      } else {
         dpi $$1 = this.d(je.a($$0.u()), je.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eip b_(ib $$0) {
      if (this.s($$0)) {
         return eiq.a.g();
      } else {
         dpi $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean P() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean Q() {
      return !this.D_().a() && !this.P();
   }

   public void a(@Nullable box $$0, ib $$1, atx $$2, atz $$3, float $$4, float $$5) {
      this.a($$0 instanceof ciu $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable ciu $$0, ib $$1, atx $$2, atz $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable ciu var1, double var2, double var4, double var6, il<atx> var8, atz var9, float var10, float var11, long var12);

   public void a(@Nullable ciu $$0, double $$1, double $$2, double $$3, atx $$4, atz $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, ki.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable ciu var1, box var2, il<atx> var3, atz var4, float var5, float var6, long var7);

   public void a(@Nullable ciu $$0, double $$1, double $$2, double $$3, atx $$4, atz $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable ciu $$0, double $$1, double $$2, double $$3, atx $$4, atz $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable ciu $$0, box $$1, atx $$2, atz $$3, float $$4, float $$5) {
      this.a($$0, $$1, ki.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(ib $$0, atx $$1, atz $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(box $$0, atx $$1, atz $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, atx $$3, atz $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(ka $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(ka $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(ka $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(ka $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dlz $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void R() {
      bjr $$0 = this.ae();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<dlz> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dlz $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends box> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(box $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(ib $$0) {
      return this.a(cwi.a($$0));
   }

   public cwt a(@Nullable box $$0, double $$1, double $$2, double $$3, float $$4, cxb.a $$5) {
      return this.a($$0, cwt.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, kc.x, kc.w, aty.jX);
   }

   public cwt a(@Nullable box $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, cxb.a $$6) {
      return this.a($$0, cwt.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, kc.x, kc.w, aty.jX);
   }

   public cwt a(@Nullable box $$0, @Nullable bnw $$1, @Nullable cwu $$2, ept $$3, float $$4, boolean $$5, cxb.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, kc.x, kc.w, aty.jX);
   }

   public cwt a(@Nullable box $$0, @Nullable bnw $$1, @Nullable cwu $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cxb.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, kc.x, kc.w, aty.jX);
   }

   public cwt a(
      @Nullable box $$0,
      @Nullable bnw $$1,
      @Nullable cwu $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      cxb.a $$8,
      ka $$9,
      ka $$10,
      il<atx> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public cwt a(
      @Nullable box $$0,
      @Nullable bnw $$1,
      @Nullable cwu $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      cxb.a $$8,
      boolean $$9,
      ka $$10,
      ka $$11,
      il<atx> $$12
   ) {
      cwt.a $$13 = switch ($$8) {
         case a -> cwt.a.a;
         case b -> this.a(cwx.Q);
         case c -> this.Z().b(cwx.c) ? this.a(cwx.R) : cwt.a.a;
         case d -> this.a(cwx.S);
         case e -> cwt.a.d;
      };
      cwt $$14 = new cwt(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private cwt.a a(cwx.e<cwx.a> $$0) {
      return this.Z().b($$0) ? cwt.a.c : cwt.a.b;
   }

   public abstract String H();

   @Nullable
   @Override
   public dki c_(ib $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dpi.b.a);
      }
   }

   public void a(dki $$0) {
      ib $$1 = $$0.aC_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(ib $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(ib $$0) {
      return this.s($$0) ? false : this.L().b(je.a($$0.u()), je.a($$0.w()));
   }

   public boolean a(ib $$0, box $$1, ih $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dox $$3 = this.a(je.a($$0.u()), je.a($$0.w()), dpc.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(ib $$0, box $$1) {
      return this.a($$0, $$1, ih.b);
   }

   public void S() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * aww.a((double)aww.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.L().a($$0, $$1);
   }

   public ib T() {
      ib $$0 = this.A.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(dso.a.e, ib.a(this.C_().a(), 0.0, this.C_().b()));
      }

      return $$0;
   }

   public float U() {
      return this.A.b();
   }

   protected void V() {
      if (this.A.i()) {
         this.w = 1.0F;
         if (this.A.g()) {
            this.y = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.L().close();
   }

   @Nullable
   @Override
   public cwh c(int $$0, int $$1) {
      return this.a($$0, $$1, dpc.n, false);
   }

   @Override
   public List<box> a(@Nullable box $$0, epo $$1, Predicate<? super box> $$2) {
      this.ae().d("getEntities");
      List<box> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cdy) {
            for (cdw $$4 : ((cdy)$$3x).gj()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends box> List<T> a(drd<box, T> $$0, epo $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends box> void a(drd<box, T> $$0, epo $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends box> void a(drd<box, T> $$0, epo $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ae().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return avj.a.b;
            }
         }

         if ($$4x instanceof cdy $$5) {
            for (cdw $$6 : $$5.gj()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return avj.a.b;
                  }
               }
            }
         }

         return avj.a.a;
      });
   }

   @Nullable
   public abstract box a(int var1);

   public void q(ib $$0) {
      if (this.B($$0)) {
         this.m($$0).a(true);
      }
   }

   @Override
   public int z_() {
      return 63;
   }

   public void W() {
   }

   public long X() {
      return this.A.c();
   }

   public long Y() {
      return this.A.d();
   }

   public boolean a(ciu $$0, ib $$1) {
      return true;
   }

   public void a(box $$0, byte $$1) {
   }

   public void a(box $$0, bnw $$1) {
   }

   public void a(ib $$0, dac $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public eki A_() {
      return this.A;
   }

   public cwx Z() {
      return this.A.o();
   }

   public abstract bno s();

   public float b(float $$0) {
      return aww.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = aww.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return aww.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = aww.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean aa() {
      return this.D_().g() && !this.D_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ab() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(ib $$0) {
      if (!this.ab()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(dso.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         cya $$1 = this.t($$0).a();
         return $$1.a($$0) == cya.c.b;
      }
   }

   @Nullable
   public abstract eka a(ejy var1);

   public abstract void a(ejy var1, eka var2);

   public abstract ejy v();

   public void b(int $$0, ib $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.x().size() + " total; " + this.x());
      $$1.a("Chunk stats", this.L()::e);
      $$1.a("Level dimension", () -> this.ad().a().toString());

      try {
         this.A.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, ib var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable ta $$6) {
   }

   public abstract eqx K();

   public void c(ib $$0, dac $$1) {
      for (ih $$2 : ih.c.a) {
         ib $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dnb $$4 = this.a_($$3);
            if ($$4.a(dae.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dae.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bnb d_(ib $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ao();
         $$1 = this.m($$0).u();
      }

      return new bnb(this.aj(), this.Y(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dos C_() {
      return this.F;
   }

   public void a(yb<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dqo D_() {
      return this.D.a();
   }

   public il<dqo> ac() {
      return this.D;
   }

   public ajg<cxb> ad() {
      return this.H;
   }

   @Override
   public axd E_() {
      return this.z;
   }

   @Override
   public boolean a(ib $$0, Predicate<dnb> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(ib $$0, Predicate<eip> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cts r();

   public ib a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new ib($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bjr ae() {
      return this.E.get();
   }

   public Supplier<bjr> af() {
      return this.E;
   }

   @Override
   public cyc F_() {
      return this.G;
   }

   public final boolean ag() {
      return this.d;
   }

   protected abstract drf<box> G();

   @Override
   public long G_() {
      return this.K++;
   }

   @Override
   public iz H_() {
      return this.I;
   }

   public bnx ah() {
      return this.J;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
