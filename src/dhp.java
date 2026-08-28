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

public abstract class dhp implements dhq, ede<bvs>, AutoCloseable {
   public static final Codec<alc<dhp>> h = alc.a(me.bl);
   public static final alc<dhp> i = alc.a(me.bl, ald.b("overworld"));
   public static final alc<dhp> j = alc.a(me.bl, ald.b("the_nether"));
   public static final alc<dhp> k = alc.a(me.bl, ald.b("the_end"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<dxj> s = Lists.newArrayList();
   protected final ewa t;
   private final List<dxj> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int u = azs.a().f();
   protected final int v = 1013904223;
   protected float w;
   protected float x;
   protected float y;
   protected float z;
   public final azs A = azs.a();
   @Deprecated
   private final azs f = azs.b();
   private final js<ecj> E;
   protected final exg B;
   public final boolean C;
   private final eae F;
   private final diu G;
   private final alc<dhp> H;
   private final kg I;
   private final bui J;
   private long K;

   protected dhp(exg $$0, alc<dhp> $$1, kg $$2, js<ecj> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
      this.B = $$0;
      this.E = $$3;
      final ecj $$8 = $$3.a();
      this.H = $$1;
      this.C = $$4;
      if ($$8.k() != 1.0) {
         this.F = new eae() {
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
         this.F = new eae();
      }

      this.c = Thread.currentThread();
      this.G = new diu(this, $$6);
      this.d = $$5;
      this.t = new evv(this, $$7);
      this.I = $$2;
      this.J = new bui($$2);
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

   public boolean k(jj $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(jj $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(jj $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public eat m(jj $$0) {
      return this.d(kl.a($$0.u()), kl.a($$0.w()));
   }

   public eat d(int $$0, int $$1) {
      return (eat)this.a($$0, $$1, ebk.n);
   }

   @Nullable
   @Override
   public eaj a(int $$0, int $$1, ebk $$2, boolean $$3) {
      eaj $$4 = this.S().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(jj $$0, dym $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(jj $$0, dym $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.C && this.ak()) {
         return false;
      } else {
         eat $$4 = this.m($$0);
         dku $$5 = $$1.b();
         dym $$6 = $$4.a($$0, $$1, $$2);
         if ($$6 == null) {
            return false;
         } else {
            dym $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.F() != null && $$4.F().a(arb.c))) {
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
                  $$1.a((dhq)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(jj $$0, dym $$1, dym $$2) {
   }

   @Override
   public boolean a(jj $$0, boolean $$1) {
      eut $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(jj $$0, boolean $$1, @Nullable bvs $$2, int $$3) {
      dym $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         eut $$5 = this.b_($$0);
         if (!($$4.b() instanceof dkh)) {
            this.c(2001, $$0, dku.j($$4));
         }

         if ($$1) {
            dvl $$6 = $$4.x() ? this.c_($$0) : null;
            dku.a($$4, this, $$0, $$6, $$2, cxy.k);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(edm.f, $$0, edm.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(jj $$0, dym $$1) {
   }

   public boolean b(jj $$0, dym $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(jj var1, dym var2, dym var3, int var4);

   public void b(jj $$0, dym $$1, dym $$2) {
   }

   public void a(jj $$0, dku $$1, @Nullable ewb $$2) {
   }

   public void a(jj $$0, dku $$1, jo $$2, @Nullable ewb $$3) {
   }

   public void b(jj $$0, dku $$1, @Nullable ewb $$2) {
   }

   public void a(dym $$0, jj $$1, dku $$2, @Nullable ewb $$3, boolean $$4) {
   }

   @Override
   public void a(jo $$0, jj $$1, jj $$2, dym $$3, int $$4, int $$5) {
      this.t.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(eel.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(kl.a($$1), kl.a($$2))) {
            $$4 = this.d(kl.a($$1), kl.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.G_();
         }
      } else {
         $$4 = this.P() + 1;
      }

      return $$4;
   }

   @Override
   public eui x_() {
      return this.S().q();
   }

   @Override
   public dym a_(jj $$0) {
      if (this.s($$0)) {
         return dkw.nD.m();
      } else {
         eat $$1 = this.d(kl.a($$0.u()), kl.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public eut b_(jj $$0) {
      if (this.s($$0)) {
         return euu.a.g();
      } else {
         eat $$1 = this.m($$0);
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
   public void a(@Nullable bvs $$0, jj $$1, awj $$2, awl $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable bvs var1, double var2, double var4, double var6, js<awj> var8, awl var9, float var10, float var11, long var12);

   public void a(@Nullable bvs $$0, double $$1, double $$2, double $$3, awj $$4, awl $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, md.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable bvs var1, bvs var2, js<awj> var3, awl var4, float var5, float var6, long var7);

   public void a(@Nullable bvs $$0, double $$1, double $$2, double $$3, awj $$4, awl $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable bvs $$0, double $$1, double $$2, double $$3, awj $$4, awl $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable bvs $$0, double $$1, double $$2, double $$3, js<awj> $$4, awl $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable bvs $$0, bvs $$1, awj $$2, awl $$3, float $$4, float $$5) {
      this.a($$0, $$1, md.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(jj $$0, awj $$1, awl $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bvs $$0, awj $$1, awl $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, awj $$3, awl $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(lt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lt $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
   }

   public void b(lt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lt $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(dxj $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void Y() {
      bqb $$0 = bqa.a();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<dxj> $$1 = this.s.iterator();
      boolean $$2 = this.u().i();

      while ($$1.hasNext()) {
         dxj $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bvs> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(bvs $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(jj $$0) {
      return this.a(dgw.a($$0));
   }

   public void a(@Nullable bvs $$0, double $$1, double $$2, double $$3, float $$4, dhp.a $$5) {
      this.a($$0, dhi.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, lv.w, lv.v, awk.kE);
   }

   public void a(@Nullable bvs $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dhp.a $$6) {
      this.a($$0, dhi.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, lv.w, lv.v, awk.kE);
   }

   public void a(@Nullable bvs $$0, @Nullable buh $$1, @Nullable dhj $$2, fcu $$3, float $$4, boolean $$5, dhp.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, lv.w, lv.v, awk.kE);
   }

   public void a(@Nullable bvs $$0, @Nullable buh $$1, @Nullable dhj $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dhp.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, lv.w, lv.v, awk.kE);
   }

   public abstract void a(
      @Nullable bvs var1,
      @Nullable buh var2,
      @Nullable dhj var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      dhp.a var12,
      lt var13,
      lt var14,
      js<awj> var15
   );

   public abstract String J();

   @Nullable
   @Override
   public dvl c_(jj $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, eat.b.a);
      }
   }

   public void a(dvl $$0) {
      jj $$1 = $$0.aw_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(jj $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(jj $$0) {
      return this.s($$0) ? false : this.S().b(kl.a($$0.u()), kl.a($$0.w()));
   }

   public boolean a(jj $$0, bvs $$1, jo $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         eaj $$3 = this.a(kl.a($$0.u()), kl.a($$0.w()), ebk.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(jj $$0, bvs $$1) {
      return this.a($$0, $$1, jo.b);
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

   public jj aa() {
      jj $$0 = this.B.a();
      if (!this.A_().a($$0)) {
         $$0 = this.a(eel.a.e, jj.a(this.A_().a(), 0.0, this.A_().b()));
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
   public dgv c(int $$0, int $$1) {
      return this.a($$0, $$1, ebk.n, false);
   }

   @Override
   public List<bvs> a(@Nullable bvs $$0, fcp $$1, Predicate<? super bvs> $$2) {
      bqa.a().f("getEntities");
      List<bvs> $$3 = Lists.newArrayList();
      this.H().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }
      });

      for (cld $$4 : this.s()) {
         if ($$4 != $$0 && $$4.a != $$0 && $$2.test($$4) && $$1.c($$4.cR())) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   @Override
   public <T extends bvs> List<T> a(ecy<bvs, T> $$0, fcp $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bvs> void a(ecy<bvs, T> $$0, fcp $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bvs> void a(ecy<bvs, T> $$0, fcp $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      bqa.a().f("getEntities");
      this.H().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axv.a.b;
            }
         }

         if ($$4x instanceof clg $$5) {
            for (cld $$6 : $$5.q()) {
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

   public List<bvs> i(bvs $$0, fcp $$1) {
      return this.a($$0, $$1, bvz.a($$0));
   }

   @Nullable
   public abstract bvs a(int var1);

   @Nullable
   public bvs b(UUID $$0) {
      return this.H().a($$0);
   }

   public abstract Collection<cld> s();

   public void q(jj $$0) {
      if (this.B($$0)) {
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

   public boolean a(bvs $$0, jj $$1) {
      return true;
   }

   public void a(bvs $$0, byte $$1) {
   }

   public void a(bvs $$0, buh $$1) {
   }

   public void a(jj $$0, dku $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public ewv y_() {
      return this.B;
   }

   public abstract btz u();

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

   public boolean r(jj $$0) {
      if (!this.ah()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(eel.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dis $$1 = this.t($$0).a();
         return $$1.a($$0, this.P()) == dis.c.b;
      }
   }

   @Nullable
   public abstract ewn a(ewl var1);

   public abstract void a(ewl var1, ewn var2);

   public abstract ewl x();

   public void b(int $$0, jj $$1, int $$2) {
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

   public abstract void a(int var1, jj var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<dak> $$6) {
   }

   public abstract fdz R();

   public void b(jj $$0, dku $$1) {
      for (jo $$2 : jo.c.a) {
         jj $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dym $$4 = this.a_($$3);
            if ($$4.a(dkw.hv)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dkw.hv)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public bto d_(jj $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.as();
         $$1 = this.m($$0).w();
      }

      return new bto(this.an(), this.af(), $$1, $$2);
   }

   @Override
   public int z_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public eae A_() {
      return this.F;
   }

   public void a(zc<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public ecj B_() {
      return this.E.a();
   }

   public js<ecj> ai() {
      return this.E;
   }

   public alc<dhp> aj() {
      return this.H;
   }

   @Override
   public azs C_() {
      return this.A;
   }

   @Override
   public boolean a(jj $$0, Predicate<dym> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(jj $$0, Predicate<eut> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract dcm Q();

   public jj a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new jj($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean v() {
      return false;
   }

   @Override
   public diu D_() {
      return this.G;
   }

   public final boolean ak() {
      return this.d;
   }

   protected abstract eda<bvs> H();

   @Override
   public long E_() {
      return this.K++;
   }

   @Override
   public kg F_() {
      return this.I;
   }

   public bui al() {
      return this.J;
   }

   public abstract czt L();

   public abstract dwk M();

   public static enum a implements bag {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<dhp.a> f = bag.a(dhp.a::values);
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
