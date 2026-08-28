import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dff implements dfg, AutoCloseable {
   public static final Codec<alk<dff>> h = alk.a(ma.bb);
   public static final alk<dff> i = alk.a(ma.bb, all.b("overworld"));
   public static final alk<dff> j = alk.a(ma.bb, all.b("the_nether"));
   public static final alk<dff> k = alk.a(ma.bb, all.b("the_end"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<dul> s = Lists.newArrayList();
   protected final esv t;
   private final List<dul> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int u = azv.a().f();
   protected final int v = 1013904223;
   protected float w;
   protected float x;
   protected float y;
   protected float z;
   public final azv A = azv.a();
   @Deprecated
   private final azv f = azv.b();
   private final jq<dzj> E;
   protected final eub B;
   public final boolean C;
   private final dxe F;
   private final dgj G;
   private final alk<dff> H;
   private final ke I;
   private final bsz J;
   private long K;

   protected dff(eub $$0, alk<dff> $$1, ke $$2, jq<dzj> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
      this.B = $$0;
      this.E = $$3;
      final dzj $$8 = $$3.a();
      this.H = $$1;
      this.C = $$4;
      if ($$8.k() != 1.0) {
         this.F = new dxe() {
            @Override
            public double a() {
               return super.a() / $$8.k();
            }

            @Override
            public double b() {
               return super.b() / $$8.k();
            }
         };
      } else {
         this.F = new dxe();
      }

      this.c = Thread.currentThread();
      this.G = new dgj(this, $$6);
      this.d = $$5;
      this.t = new esq(this, $$7);
      this.I = $$2;
      this.J = new bsz($$2);
   }

   @Override
   public boolean y_() {
      return this.C;
   }

   @Nullable
   @Override
   public MinecraftServer o() {
      return null;
   }

   public boolean k(jh $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(jh $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(jh $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public dxt m(jh $$0) {
      return this.d(kj.a($$0.u()), kj.a($$0.w()));
   }

   public dxt d(int $$0, int $$1) {
      return (dxt)this.a($$0, $$1, dyk.n);
   }

   @Nullable
   @Override
   public dxj a(int $$0, int $$1, dyk $$2, boolean $$3) {
      dxj $$4 = this.P().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(jh $$0, dvo $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(jh $$0, dvo $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.C && this.ah()) {
         return false;
      } else {
         dxt $$4 = this.m($$0);
         dij $$5 = $$1.b();
         dvo $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dvo $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.C() != null && $$4.C().a(arg.c))) {
                  this.a($$0, $$6, $$1, $$2);
               }

               if (($$2 & 1) != 0) {
                  this.b($$0, $$6.b());
                  if (!this.C && $$1.q()) {
                     this.c($$0, $$5);
                  }
               }

               if (($$2 & 16) == 0 && $$3 > 0) {
                  int $$8 = $$2 & -34;
                  $$6.b(this, $$0, $$8, $$3 - 1);
                  $$1.a((dfg)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(jh $$0, dvo $$1, dvo $$2) {
   }

   @Override
   public boolean a(jh $$0, boolean $$1) {
      ero $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(jh $$0, boolean $$1, @Nullable bui $$2, int $$3) {
      dvo $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         ero $$5 = this.b_($$0);
         if (!($$4.b() instanceof dhw)) {
            this.c(2001, $$0, dij.j($$4));
         }

         if ($$1) {
            dsr $$6 = $$4.x() ? this.c_($$0) : null;
            dij.a($$4, this, $$0, $$6, $$2, cwf.k);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(eak.f, $$0, eak.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(jh $$0, dvo $$1) {
   }

   public boolean b(jh $$0, dvo $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(jh var1, dvo var2, dvo var3, int var4);

   public void b(jh $$0, dvo $$1, dvo $$2) {
   }

   public void a(jh $$0, dij $$1) {
   }

   public void a(jh $$0, dij $$1, @Nullable esw $$2) {
   }

   public void a(jh $$0, dij $$1, jm $$2, @Nullable esw $$3) {
   }

   public void b(jh $$0, dij $$1, @Nullable esw $$2) {
   }

   public void a(dvo $$0, jh $$1, dij $$2, @Nullable esw $$3, boolean $$4) {
   }

   @Override
   public void a(jm $$0, jh $$1, jh $$2, dvo $$3, int $$4, int $$5) {
      this.t.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(ebj.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(kj.a($$1), kj.a($$2))) {
            $$4 = this.d(kj.a($$1), kj.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.N() + 1;
      }

      return $$4;
   }

   @Override
   public erd z_() {
      return this.P().p();
   }

   @Override
   public dvo a_(jh $$0) {
      if (this.s($$0)) {
         return dil.nb.m();
      } else {
         dxt $$1 = this.d(kj.a($$0.u()), kj.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public ero b_(jh $$0) {
      if (this.s($$0)) {
         return erp.a.g();
      } else {
         dxt $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean S() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean T() {
      return !this.D_().a() && !this.S();
   }

   public void a(@Nullable bui $$0, jh $$1, awn $$2, awp $$3, float $$4, float $$5) {
      this.a($$0 instanceof cor $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cor $$0, jh $$1, awn $$2, awp $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cor var1, double var2, double var4, double var6, jq<awn> var8, awp var9, float var10, float var11, long var12);

   public void a(@Nullable cor $$0, double $$1, double $$2, double $$3, awn $$4, awp $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, lz.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cor var1, bui var2, jq<awn> var3, awp var4, float var5, float var6, long var7);

   public void a(@Nullable cor $$0, double $$1, double $$2, double $$3, awn $$4, awp $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cor $$0, double $$1, double $$2, double $$3, awn $$4, awp $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cor $$0, double $$1, double $$2, double $$3, jq<awn> $$4, awp $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cor $$0, bui $$1, awn $$2, awp $$3, float $$4, float $$5) {
      this.a($$0, $$1, lz.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(jh $$0, awn $$1, awp $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bui $$0, awn $$1, awp $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, awn $$3, awp $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(lq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dul $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void U() {
      bor $$0 = boq.a();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<dul> $$1 = this.s.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         dul $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bui> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(bui $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(jh $$0) {
      return this.a(del.a($$0));
   }

   public void a(@Nullable bui $$0, double $$1, double $$2, double $$3, float $$4, dff.a $$5) {
      this.a($$0, dex.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, ls.w, ls.v, awo.kf);
   }

   public void a(@Nullable bui $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dff.a $$6) {
      this.a($$0, dex.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, ls.w, ls.v, awo.kf);
   }

   public void a(@Nullable bui $$0, @Nullable bsy $$1, @Nullable dey $$2, ezr $$3, float $$4, boolean $$5, dff.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, ls.w, ls.v, awo.kf);
   }

   public void a(@Nullable bui $$0, @Nullable bsy $$1, @Nullable dey $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dff.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, ls.w, ls.v, awo.kf);
   }

   public abstract void a(
      @Nullable bui var1,
      @Nullable bsy var2,
      @Nullable dey var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      dff.a var12,
      lq var13,
      lq var14,
      jq<awn> var15
   );

   public abstract String I();

   @Nullable
   @Override
   public dsr c_(jh $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, dxt.b.a);
      }
   }

   public void a(dsr $$0) {
      jh $$1 = $$0.aB_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(jh $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(jh $$0) {
      return this.s($$0) ? false : this.P().b(kj.a($$0.u()), kj.a($$0.w()));
   }

   public boolean a(jh $$0, bui $$1, jm $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dxj $$3 = this.a(kj.a($$0.u()), kj.a($$0.w()), dyk.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(jh $$0, bui $$1) {
      return this.a($$0, $$1, jm.b);
   }

   public void V() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * azn.a((double)azn.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void a(boolean $$0) {
      this.P().b($$0);
   }

   public jh W() {
      jh $$0 = this.B.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(ebj.a.e, jh.a(this.C_().a(), 0.0, this.C_().b()));
      }

      return $$0;
   }

   public float X() {
      return this.B.b();
   }

   protected void Y() {
      if (this.B.i()) {
         this.x = 1.0F;
         if (this.B.g()) {
            this.z = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.P().close();
   }

   @Nullable
   @Override
   public dek c(int $$0, int $$1) {
      return this.a($$0, $$1, dyk.n, false);
   }

   @Override
   public List<bui> a(@Nullable bui $$0, ezm $$1, Predicate<? super bui> $$2) {
      boq.a().f("getEntities");
      List<bui> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cjs) {
            for (cjp $$4 : ((cjs)$$3x).gr()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bui> List<T> a(dzy<bui, T> $$0, ezm $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bui> void a(dzy<bui, T> $$0, ezm $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bui> void a(dzy<bui, T> $$0, ezm $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      boq.a().f("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axz.a.b;
            }
         }

         if ($$4x instanceof cjs $$5) {
            for (cjp $$6 : $$5.gr()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return axz.a.b;
                  }
               }
            }
         }

         return axz.a.a;
      });
   }

   @Nullable
   public abstract bui a(int var1);

   public void q(jh $$0) {
      if (this.B($$0)) {
         this.m($$0).a(true);
      }
   }

   public void Z() {
   }

   public long aa() {
      return this.B.c();
   }

   public long ab() {
      return this.B.d();
   }

   public boolean a(cor $$0, jh $$1) {
      return true;
   }

   public void a(bui $$0, byte $$1) {
   }

   public void a(bui $$0, bsy $$1) {
   }

   public void a(jh $$0, dij $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public etq A_() {
      return this.B;
   }

   public dfb ac() {
      return this.B.o();
   }

   public abstract bsq s();

   public float b(float $$0) {
      return azn.h($$0, this.y, this.z) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = azn.a($$0, 0.0F, 1.0F);
      this.y = $$1;
      this.z = $$1;
   }

   public float d(float $$0) {
      return azn.h($$0, this.w, this.x);
   }

   public void e(float $$0) {
      float $$1 = azn.a($$0, 0.0F, 1.0F);
      this.w = $$1;
      this.x = $$1;
   }

   private boolean a() {
      return this.D_().g() && !this.D_().h();
   }

   public boolean ad() {
      return this.a() && (double)this.b(1.0F) > 0.9;
   }

   public boolean ae() {
      return this.a() && (double)this.d(1.0F) > 0.2;
   }

   public boolean r(jh $$0) {
      if (!this.ae()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(ebj.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dgh $$1 = this.t($$0).a();
         return $$1.a($$0, this.N()) == dgh.c.b;
      }
   }

   @Nullable
   public abstract eti a(etg var1);

   public abstract void a(etg var1, eti var2);

   public abstract etg v();

   public void b(int $$0, jh $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.x().size() + " total; " + this.x());
      $$1.a("Chunk stats", this.P()::e);
      $$1.a("Level dimension", () -> this.ag().a().toString());

      try {
         this.B.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, jh var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cyu> $$6) {
   }

   public abstract faw O();

   public void c(jh $$0, dij $$1) {
      for (jm $$2 : jm.c.a) {
         jh $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dvo $$4 = this.a_($$3);
            if ($$4.a(dil.gY)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dil.gY)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public bsf d_(jh $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.ap();
         $$1 = this.m($$0).t();
      }

      return new bsf(this.ak(), this.ab(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dxe C_() {
      return this.F;
   }

   public void a(zs<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dzj D_() {
      return this.E.a();
   }

   public jq<dzj> af() {
      return this.E;
   }

   public alk<dff> ag() {
      return this.H;
   }

   @Override
   public azv E_() {
      return this.A;
   }

   @Override
   public boolean a(jh $$0, Predicate<dvo> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jh $$0, Predicate<ero> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract dax r();

   public jh a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new jh($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   @Override
   public dgj F_() {
      return this.G;
   }

   public final boolean ah() {
      return this.d;
   }

   protected abstract eaa<bui> G();

   @Override
   public long G_() {
      return this.K++;
   }

   @Override
   public ke H_() {
      return this.I;
   }

   public bsz ai() {
      return this.J;
   }

   public abstract cyd K();

   public abstract dto L();

   public static enum a implements baj {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dff.a> f = baj.a(dff.a::values);
      private final String g;

      private a(final String $$0) {
         this.g = $$0;
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
