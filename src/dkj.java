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

public abstract class dkj implements dkk, egi<bxe>, AutoCloseable {
   public static final Codec<alq<dkj>> h = alq.a(mi.bp);
   public static final alq<dkj> i = alq.a(mi.bp, alr.b("overworld"));
   public static final alq<dkj> j = alq.a(mi.bp, alr.b("the_nether"));
   public static final alq<dkj> k = alq.a(mi.bp, alr.b("the_end"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<eam> s = Lists.newArrayList();
   protected final ezh t;
   private final List<eam> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int u = bai.a().f();
   protected final int v = 1013904223;
   protected float w;
   protected float x;
   protected float y;
   protected float z;
   public final bai A = bai.a();
   @Deprecated
   private final bai f = bai.b();
   private final jg<efn> E;
   protected final fao B;
   public final boolean C;
   private final edi F;
   private final dlo G;
   private final alq<dkj> H;
   private final ju I;
   private final bvu J;
   private long K;

   protected dkj(fao $$0, alq<dkj> $$1, ju $$2, jg<efn> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
      this.B = $$0;
      this.E = $$3;
      final efn $$8 = $$3.a();
      this.H = $$1;
      this.C = $$4;
      if ($$8.k() != 1.0) {
         this.F = new edi() {
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
         this.F = new edi();
      }

      this.c = Thread.currentThread();
      this.G = new dlo(this, $$6);
      this.d = $$5;
      this.t = new ezc(this, $$7);
      this.I = $$2;
      this.J = new bvu($$2);
   }

   @Override
   public boolean A_() {
      return this.C;
   }

   @Nullable
   @Override
   public MinecraftServer p() {
      return null;
   }

   public boolean k(iw $$0) {
      return !this.t($$0) && g($$0);
   }

   public static boolean l(iw $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(iw $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public edx m(iw $$0) {
      return this.d(jz.a($$0.u()), jz.a($$0.w()));
   }

   public edx d(int $$0, int $$1) {
      return (edx)this.a($$0, $$1, eeo.n);
   }

   @Nullable
   @Override
   public edn a(int $$0, int $$1, eeo $$2, boolean $$3) {
      edn $$4 = this.S().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(iw $$0, ebq $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(iw $$0, ebq $$1, int $$2, int $$3) {
      if (this.t($$0)) {
         return false;
      } else if (!this.C && this.ak()) {
         return false;
      } else {
         edx $$4 = this.m($$0);
         dno $$5 = $$1.b();
         ebq $$6 = $$4.a($$0, $$1, $$2);
         if ($$6 == null) {
            return false;
         } else {
            ebq $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.F() != null && $$4.F().a(arp.c))) {
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
                  $$1.a((dkk)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(iw $$0, ebq $$1, ebq $$2) {
   }

   @Override
   public boolean a(iw $$0, boolean $$1) {
      eya $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(iw $$0, boolean $$1, @Nullable bxe $$2, int $$3) {
      ebq $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         eya $$5 = this.b_($$0);
         if (!($$4.b() instanceof dnb)) {
            this.c(2001, $$0, dno.j($$4));
         }

         if ($$1) {
            dyo $$6 = $$4.x() ? this.c_($$0) : null;
            dno.a($$4, this, $$0, $$6, $$2, dak.l);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(egq.f, $$0, egq.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(iw $$0, ebq $$1) {
   }

   public boolean b(iw $$0, ebq $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(iw var1, ebq var2, ebq var3, int var4);

   public void b(iw $$0, ebq $$1, ebq $$2) {
   }

   public void a(iw $$0, dno $$1, @Nullable ezi $$2) {
   }

   public void a(iw $$0, dno $$1, jc $$2, @Nullable ezi $$3) {
   }

   public void b(iw $$0, dno $$1, @Nullable ezi $$2) {
   }

   public void a(ebq $$0, iw $$1, dno $$2, @Nullable ezi $$3, boolean $$4) {
   }

   @Override
   public void a(jc $$0, iw $$1, iw $$2, ebq $$3, int $$4, int $$5) {
      this.t.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(ehp.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(jz.a($$1), jz.a($$2))) {
            $$4 = this.d(jz.a($$1), jz.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.K_();
         }
      } else {
         $$4 = this.P() + 1;
      }

      return $$4;
   }

   @Override
   public exp B_() {
      return this.S().q();
   }

   @Override
   public ebq a_(iw $$0) {
      if (this.t($$0)) {
         return dnq.nH.m();
      } else {
         edx $$1 = this.d(jz.a($$0.u()), jz.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eya b_(iw $$0) {
      if (this.t($$0)) {
         return eyb.a.g();
      } else {
         edx $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean V() {
      return !this.F_().a() && this.e < 4;
   }

   public boolean W() {
      return !this.F_().a() && !this.V();
   }

   public boolean X() {
      if (!this.F_().j()) {
         return false;
      } else {
         int $$0 = (int)(this.af() % 24000L);
         return $$0 >= 12600 && $$0 <= 23400;
      }
   }

   @Override
   public void a(@Nullable bxe $$0, iw $$1, awx $$2, awz $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable bxe var1, double var2, double var4, double var6, jg<awx> var8, awz var9, float var10, float var11, long var12);

   public void a(@Nullable bxe $$0, double $$1, double $$2, double $$3, awx $$4, awz $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, mh.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable bxe var1, bxe var2, jg<awx> var3, awz var4, float var5, float var6, long var7);

   public void a(@Nullable bxe $$0, double $$1, double $$2, double $$3, awx $$4, awz $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable bxe $$0, double $$1, double $$2, double $$3, awx $$4, awz $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable bxe $$0, double $$1, double $$2, double $$3, jg<awx> $$4, awz $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable bxe $$0, bxe $$1, awx $$2, awz $$3, float $$4, float $$5) {
      this.a($$0, $$1, mh.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(iw $$0, awx $$1, awz $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bxe $$0, awx $$1, awz $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, awx $$3, awz $$4, float $$5, float $$6, boolean $$7) {
   }

   public void a(awx $$0, awz $$1, float $$2, float $$3) {
   }

   @Override
   public void a(lx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lx $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
   }

   public void b(lx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lx $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(eam $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void Y() {
      brm $$0 = brl.a();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<eam> $$1 = this.s.iterator();
      boolean $$2 = this.u().i();

      while ($$1.hasNext()) {
         eam $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bxe> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         p $$3 = p.a(var6, "Ticking entity");
         q $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new aa($$3);
      }
   }

   public boolean h(bxe $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(iw $$0) {
      return this.a(djo.a($$0));
   }

   public void a(@Nullable bxe $$0, double $$1, double $$2, double $$3, float $$4, dkj.a $$5) {
      this.a($$0, dkc.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, lz.w, lz.v, awy.kI);
   }

   public void a(@Nullable bxe $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dkj.a $$6) {
      this.a($$0, dkc.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, lz.w, lz.v, awy.kI);
   }

   public void a(@Nullable bxe $$0, @Nullable bvt $$1, @Nullable dkd $$2, fgc $$3, float $$4, boolean $$5, dkj.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, lz.w, lz.v, awy.kI);
   }

   public void a(@Nullable bxe $$0, @Nullable bvt $$1, @Nullable dkd $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dkj.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, lz.w, lz.v, awy.kI);
   }

   public abstract void a(
      @Nullable bxe var1,
      @Nullable bvt var2,
      @Nullable dkd var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      dkj.a var12,
      lx var13,
      lx var14,
      jg<awx> var15
   );

   public abstract String J();

   @Nullable
   @Override
   public dyo c_(iw $$0) {
      if (this.t($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, edx.b.a);
      }
   }

   public void a(dyo $$0) {
      iw $$1 = $$0.aC_();
      if (!this.t($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(iw $$0) {
      if (!this.t($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(iw $$0) {
      return this.t($$0) ? false : this.S().b(jz.a($$0.u()), jz.a($$0.w()));
   }

   public boolean a(iw $$0, bxe $$1, jc $$2) {
      if (this.t($$0)) {
         return false;
      } else {
         edn $$3 = this.a(jz.a($$0.u()), jz.a($$0.w()), eeo.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(iw $$0, bxe $$1) {
      return this.a($$0, $$1, jc.b);
   }

   public void Z() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * azz.a((double)azz.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void a(boolean $$0) {
      this.S().b($$0);
   }

   public iw aa() {
      iw $$0 = this.B.a();
      if (!this.E_().a($$0)) {
         $$0 = this.a(ehp.a.e, iw.a(this.E_().a(), 0.0, this.E_().b()));
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
   public djn c(int $$0, int $$1) {
      return this.a($$0, $$1, eeo.n, false);
   }

   @Override
   public List<bxe> a(@Nullable bxe $$0, ffx $$1, Predicate<? super bxe> $$2) {
      brl.a().f("getEntities");
      List<bxe> $$3 = Lists.newArrayList();
      this.H().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }
      });

      for (cnd $$4 : this.s()) {
         if ($$4 != $$0 && $$4.a != $$0 && $$2.test($$4) && $$1.c($$4.cR())) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   @Override
   public <T extends bxe> List<T> a(egc<bxe, T> $$0, ffx $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bxe> void a(egc<bxe, T> $$0, ffx $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bxe> void a(egc<bxe, T> $$0, ffx $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      brl.a().f("getEntities");
      this.H().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return ayi.a.b;
            }
         }

         if ($$4x instanceof cng $$5) {
            for (cnd $$6 : $$5.q()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return ayi.a.b;
                  }
               }
            }
         }

         return ayi.a.a;
      });
   }

   public List<bxe> i(bxe $$0, ffx $$1) {
      return this.a($$0, $$1, bxl.a($$0));
   }

   @Nullable
   public abstract bxe a(int var1);

   @Nullable
   public bxe b(UUID $$0) {
      return this.H().a($$0);
   }

   public abstract Collection<cnd> s();

   public void q(iw $$0) {
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

   public boolean a(bxe $$0, iw $$1) {
      return true;
   }

   public void a(bxe $$0, byte $$1) {
   }

   public void a(bxe $$0, bvt $$1) {
   }

   public void a(iw $$0, dno $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public fad C_() {
      return this.B;
   }

   public abstract bvl u();

   public float b(float $$0) {
      return azz.h($$0, this.y, this.z) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = azz.a($$0, 0.0F, 1.0F);
      this.y = $$1;
      this.z = $$1;
   }

   public float d(float $$0) {
      return azz.h($$0, this.w, this.x);
   }

   public void e(float $$0) {
      float $$1 = azz.a($$0, 0.0F, 1.0F);
      this.w = $$1;
      this.x = $$1;
   }

   private boolean a() {
      return this.F_().g() && !this.F_().h();
   }

   public boolean ag() {
      return this.a() && (double)this.b(1.0F) > 0.9;
   }

   public boolean ah() {
      return this.a() && (double)this.d(1.0F) > 0.2;
   }

   public boolean r(iw $$0) {
      if (!this.ah()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(ehp.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dlm $$1 = this.u($$0).a();
         return $$1.a($$0, this.P()) == dlm.c.b;
      }
   }

   @Nullable
   public abstract ezv a(ezt var1);

   public abstract void a(ezt var1, ezv var2);

   public abstract ezt x();

   public void b(int $$0, iw $$1, int $$2) {
   }

   public q a(p $$0) {
      q $$1 = $$0.a("Affected level", 1);
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

   public abstract void a(int var1, iw var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<dcy> $$6) {
   }

   public abstract fhh R();

   public void b(iw $$0, dno $$1) {
      for (jc $$2 : jc.c.a) {
         iw $$3 = $$0.a($$2);
         if (this.C($$3)) {
            ebq $$4 = this.a_($$3);
            if ($$4.a(dnq.hz)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dnq.hz)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public bva d_(iw $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.C($$0)) {
         $$2 = this.as();
         $$1 = this.m($$0).w();
      }

      return new bva(this.an(), this.af(), $$1, $$2);
   }

   @Override
   public int D_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public edi E_() {
      return this.F;
   }

   public void a(zo<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public efn F_() {
      return this.E.a();
   }

   public jg<efn> ai() {
      return this.E;
   }

   public alq<dkj> aj() {
      return this.H;
   }

   @Override
   public bai G_() {
      return this.A;
   }

   @Override
   public boolean a(iw $$0, Predicate<ebq> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(iw $$0, Predicate<eya> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract dfc Q();

   public iw a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new iw($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean v() {
      return false;
   }

   @Override
   public dlo H_() {
      return this.G;
   }

   public final boolean ak() {
      return this.d;
   }

   protected abstract ege<bxe> H();

   @Override
   public long I_() {
      return this.K++;
   }

   @Override
   public ju J_() {
      return this.I;
   }

   public bvu al() {
      return this.J;
   }

   public abstract dcf L();

   public abstract dzn M();

   public int s(iw $$0) {
      return 0;
   }

   public static enum a implements bax {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dkj.a> f = bax.a(dkj.a::values);
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
