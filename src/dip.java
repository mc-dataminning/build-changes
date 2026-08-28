import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dip implements diq, eeg<bwa>, AutoCloseable {
   public static final Codec<ald<dip>> h = ald.a(mg.bm);
   public static final ald<dip> i = ald.a(mg.bm, ale.b("overworld"));
   public static final ald<dip> j = ald.a(mg.bm, ale.b("the_nether"));
   public static final ald<dip> k = ald.a(mg.bm, ale.b("the_end"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<dyl> s = Lists.newArrayList();
   protected final exc t;
   private final List<dyl> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int u = azt.a().f();
   protected final int v = 1013904223;
   protected float w;
   protected float x;
   protected float y;
   protected float z;
   public final azt A = azt.a();
   @Deprecated
   private final azt f = azt.b();
   private final je<edl> E;
   protected final eyi B;
   public final boolean C;
   private final ebg F;
   private final dju G;
   private final ald<dip> H;
   private final js I;
   private final buq J;
   private long K;

   protected dip(eyi $$0, ald<dip> $$1, js $$2, je<edl> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
      this.B = $$0;
      this.E = $$3;
      final edl $$8 = $$3.a();
      this.H = $$1;
      this.C = $$4;
      if ($$8.k() != 1.0) {
         this.F = new ebg() {
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
         this.F = new ebg();
      }

      this.c = Thread.currentThread();
      this.G = new dju(this, $$6);
      this.d = $$5;
      this.t = new ewx(this, $$7);
      this.I = $$2;
      this.J = new buq($$2);
   }

   @Override
   public boolean w_() {
      return this.C;
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return null;
   }

   public boolean k(iu $$0) {
      return !this.t($$0) && g($$0);
   }

   public static boolean l(iu $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(iu $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public ebv m(iu $$0) {
      return this.d(jx.a($$0.u()), jx.a($$0.w()));
   }

   public ebv d(int $$0, int $$1) {
      return (ebv)this.a($$0, $$1, ecm.n);
   }

   @Nullable
   @Override
   public ebl a(int $$0, int $$1, ecm $$2, boolean $$3) {
      ebl $$4 = this.S().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(iu $$0, dzo $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(iu $$0, dzo $$1, int $$2, int $$3) {
      if (this.t($$0)) {
         return false;
      } else if (!this.C && this.ak()) {
         return false;
      } else {
         ebv $$4 = this.m($$0);
         dlu $$5 = $$1.b();
         dzo $$6 = $$4.a($$0, $$1, $$2);
         if ($$6 == null) {
            return false;
         } else {
            dzo $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.F() != null && $$4.F().a(arc.c))) {
                  this.a($$0, $$6, $$1, $$2);
               }

               if (($$2 & 1) != 0) {
                  this.a($$0, $$6.b());
                  if (!this.C && $$1.q()) {
                     this.b($$0, $$5);
                  }
               }

               if (($$2 & 16) == 0 && $$3 > 0) {
                  int $$8 = $$2 & -34;
                  $$6.b(this, $$0, $$8, $$3 - 1);
                  $$1.a((diq)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(iu $$0, dzo $$1, dzo $$2) {
   }

   @Override
   public boolean a(iu $$0, boolean $$1) {
      evv $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(iu $$0, boolean $$1, @Nullable bwa $$2, int $$3) {
      dzo $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         evv $$5 = this.b_($$0);
         if (!($$4.b() instanceof dlh)) {
            this.c(2001, $$0, dlu.j($$4));
         }

         if ($$1) {
            dwn $$6 = $$4.x() ? this.c_($$0) : null;
            dlu.a($$4, this, $$0, $$6, $$2, cys.k);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(eeo.f, $$0, eeo.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(iu $$0, dzo $$1) {
   }

   public boolean b(iu $$0, dzo $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(iu var1, dzo var2, dzo var3, int var4);

   public void b(iu $$0, dzo $$1, dzo $$2) {
   }

   public void a(iu $$0, dlu $$1, @Nullable exd $$2) {
   }

   public void a(iu $$0, dlu $$1, ja $$2, @Nullable exd $$3) {
   }

   public void b(iu $$0, dlu $$1, @Nullable exd $$2) {
   }

   public void a(dzo $$0, iu $$1, dlu $$2, @Nullable exd $$3, boolean $$4) {
   }

   @Override
   public void a(ja $$0, iu $$1, iu $$2, dzo $$3, int $$4, int $$5) {
      this.t.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(efn.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(jx.a($$1), jx.a($$2))) {
            $$4 = this.d(jx.a($$1), jx.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.G_();
         }
      } else {
         $$4 = this.P() + 1;
      }

      return $$4;
   }

   @Override
   public evk x_() {
      return this.S().q();
   }

   @Override
   public dzo a_(iu $$0) {
      if (this.t($$0)) {
         return dlw.nD.m();
      } else {
         ebv $$1 = this.d(jx.a($$0.u()), jx.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public evv b_(iu $$0) {
      if (this.t($$0)) {
         return evw.a.g();
      } else {
         ebv $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean V() {
      return !this.B_().a() && this.e < 4;
   }

   public boolean W() {
      return !this.B_().a() && !this.V();
   }

   public boolean X() {
      if (!this.B_().j()) {
         return false;
      } else {
         int $$0 = (int)(this.af() % 24000L);
         return $$0 >= 12600 && $$0 <= 23400;
      }
   }

   @Override
   public void a(@Nullable bwa $$0, iu $$1, awk $$2, awm $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable bwa var1, double var2, double var4, double var6, je<awk> var8, awm var9, float var10, float var11, long var12);

   public void a(@Nullable bwa $$0, double $$1, double $$2, double $$3, awk $$4, awm $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, mf.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable bwa var1, bwa var2, je<awk> var3, awm var4, float var5, float var6, long var7);

   public void a(@Nullable bwa $$0, double $$1, double $$2, double $$3, awk $$4, awm $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable bwa $$0, double $$1, double $$2, double $$3, awk $$4, awm $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable bwa $$0, double $$1, double $$2, double $$3, je<awk> $$4, awm $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable bwa $$0, bwa $$1, awk $$2, awm $$3, float $$4, float $$5) {
      this.a($$0, $$1, mf.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(iu $$0, awk $$1, awm $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bwa $$0, awk $$1, awm $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, awk $$3, awm $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(lv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lv $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
   }

   public void b(lv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dyl $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void Y() {
      bqj $$0 = bqi.a();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<dyl> $$1 = this.s.iterator();
      boolean $$2 = this.u().i();

      while ($$1.hasNext()) {
         dyl $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bwa> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(bwa $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(iu $$0) {
      return this.a(dhw.a($$0));
   }

   public void a(@Nullable bwa $$0, double $$1, double $$2, double $$3, float $$4, dip.a $$5) {
      this.a($$0, dii.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, lx.w, lx.v, awl.kE);
   }

   public void a(@Nullable bwa $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dip.a $$6) {
      this.a($$0, dii.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, lx.w, lx.v, awl.kE);
   }

   public void a(@Nullable bwa $$0, @Nullable bup $$1, @Nullable dij $$2, fdw $$3, float $$4, boolean $$5, dip.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, lx.w, lx.v, awl.kE);
   }

   public void a(@Nullable bwa $$0, @Nullable bup $$1, @Nullable dij $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dip.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, lx.w, lx.v, awl.kE);
   }

   public abstract void a(
      @Nullable bwa var1,
      @Nullable bup var2,
      @Nullable dij var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      dip.a var12,
      lv var13,
      lv var14,
      je<awk> var15
   );

   public abstract String J();

   @Nullable
   @Override
   public dwn c_(iu $$0) {
      if (this.t($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, ebv.b.a);
      }
   }

   public void a(dwn $$0) {
      iu $$1 = $$0.aw_();
      if (!this.t($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(iu $$0) {
      if (!this.t($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(iu $$0) {
      return this.t($$0) ? false : this.S().b(jx.a($$0.u()), jx.a($$0.w()));
   }

   public boolean a(iu $$0, bwa $$1, ja $$2) {
      if (this.t($$0)) {
         return false;
      } else {
         ebl $$3 = this.a(jx.a($$0.u()), jx.a($$0.w()), ecm.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(iu $$0, bwa $$1) {
      return this.a($$0, $$1, ja.b);
   }

   public void Z() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * azk.a((double)azk.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void a(boolean $$0) {
      this.S().b($$0);
   }

   public iu aa() {
      iu $$0 = this.B.a();
      if (!this.A_().a($$0)) {
         $$0 = this.a(efn.a.e, iu.a(this.A_().a(), 0.0, this.A_().b()));
      }

      return $$0;
   }

   public float ab() {
      return this.B.b();
   }

   protected void ac() {
      if (this.B.i()) {
         this.x = 1.0F;
         if (this.B.g()) {
            this.z = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.S().close();
   }

   @Nullable
   @Override
   public dhv c(int $$0, int $$1) {
      return this.a($$0, $$1, ecm.n, false);
   }

   @Override
   public List<bwa> a(@Nullable bwa $$0, fdr $$1, Predicate<? super bwa> $$2) {
      bqi.a().f("getEntities");
      List<bwa> $$3 = Lists.newArrayList();
      this.H().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }
      });

      for (cln $$4 : this.s()) {
         if ($$4 != $$0 && $$4.a != $$0 && $$2.test($$4) && $$1.c($$4.cR())) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   @Override
   public <T extends bwa> List<T> a(eea<bwa, T> $$0, fdr $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bwa> void a(eea<bwa, T> $$0, fdr $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bwa> void a(eea<bwa, T> $$0, fdr $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      bqi.a().f("getEntities");
      this.H().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axv.a.b;
            }
         }

         if ($$4x instanceof clq $$5) {
            for (cln $$6 : $$5.q()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return axv.a.b;
                  }
               }
            }
         }

         return axv.a.a;
      });
   }

   public List<bwa> i(bwa $$0, fdr $$1) {
      return this.a($$0, $$1, bwh.a($$0));
   }

   @Nullable
   public abstract bwa a(int var1);

   @Nullable
   public bwa b(UUID $$0) {
      return this.H().a($$0);
   }

   public abstract Collection<cln> s();

   public void q(iu $$0) {
      if (this.C($$0)) {
         this.m($$0).i();
      }
   }

   public void ad() {
   }

   public long ae() {
      return this.B.c();
   }

   public long af() {
      return this.B.d();
   }

   public boolean a(bwa $$0, iu $$1) {
      return true;
   }

   public void a(bwa $$0, byte $$1) {
   }

   public void a(bwa $$0, bup $$1) {
   }

   public void a(iu $$0, dlu $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public exx y_() {
      return this.B;
   }

   public abstract buh u();

   public float b(float $$0) {
      return azk.h($$0, this.y, this.z) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = azk.a($$0, 0.0F, 1.0F);
      this.y = $$1;
      this.z = $$1;
   }

   public float d(float $$0) {
      return azk.h($$0, this.w, this.x);
   }

   public void e(float $$0) {
      float $$1 = azk.a($$0, 0.0F, 1.0F);
      this.w = $$1;
      this.x = $$1;
   }

   private boolean a() {
      return this.B_().g() && !this.B_().h();
   }

   public boolean ag() {
      return this.a() && (double)this.b(1.0F) > 0.9;
   }

   public boolean ah() {
      return this.a() && (double)this.d(1.0F) > 0.2;
   }

   public boolean r(iu $$0) {
      if (!this.ah()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(efn.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         djs $$1 = this.u($$0).a();
         return $$1.a($$0, this.P()) == djs.c.b;
      }
   }

   @Nullable
   public abstract exp a(exn var1);

   public abstract void a(exn var1, exp var2);

   public abstract exn x();

   public void b(int $$0, iu $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.z().size() + " total; " + this.z());
      $$1.a("Chunk stats", this.S()::e);
      $$1.a("Level dimension", () -> this.aj().a().toString());

      try {
         this.B.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, iu var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<dbg> $$6) {
   }

   public abstract ffb R();

   public void b(iu $$0, dlu $$1) {
      for (ja $$2 : ja.c.a) {
         iu $$3 = $$0.a($$2);
         if (this.C($$3)) {
            dzo $$4 = this.a_($$3);
            if ($$4.a(dlw.hv)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dlw.hv)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public btw d_(iu $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.C($$0)) {
         $$2 = this.as();
         $$1 = this.m($$0).w();
      }

      return new btw(this.an(), this.af(), $$1, $$2);
   }

   @Override
   public int z_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public ebg A_() {
      return this.F;
   }

   public void a(zd<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public edl B_() {
      return this.E.a();
   }

   public je<edl> ai() {
      return this.E;
   }

   public ald<dip> aj() {
      return this.H;
   }

   @Override
   public azt C_() {
      return this.A;
   }

   @Override
   public boolean a(iu $$0, Predicate<dzo> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(iu $$0, Predicate<evv> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract ddk Q();

   public iu a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new iu($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean v() {
      return false;
   }

   @Override
   public dju D_() {
      return this.G;
   }

   public final boolean ak() {
      return this.d;
   }

   protected abstract eec<bwa> H();

   @Override
   public long E_() {
      return this.K++;
   }

   @Override
   public js F_() {
      return this.I;
   }

   public buq al() {
      return this.J;
   }

   public abstract dan L();

   public abstract dxm M();

   public int s(iu $$0) {
      return 0;
   }

   public static enum a implements bai {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dip.a> f = bai.a(dip.a::values);
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
