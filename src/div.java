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

public abstract class div implements diw, eer<bwd>, AutoCloseable {
   public static final Codec<alf<div>> h = alf.a(mg.bn);
   public static final alf<div> i = alf.a(mg.bn, alg.b("overworld"));
   public static final alf<div> j = alf.a(mg.bn, alg.b("the_nether"));
   public static final alf<div> k = alf.a(mg.bn, alg.b("the_end"));
   public static final int l = 30000000;
   public static final int m = 512;
   public static final int n = 32;
   public static final int o = 15;
   public static final int p = 24000;
   public static final int q = 20000000;
   public static final int r = -20000000;
   protected final List<dyv> s = Lists.newArrayList();
   protected final exn t;
   private final List<dyv> a = Lists.newArrayList();
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
   private final je<edw> E;
   protected final eyu B;
   public final boolean C;
   private final ebr F;
   private final dka G;
   private final alf<div> H;
   private final js I;
   private final but J;
   private long K;

   protected div(eyu $$0, alf<div> $$1, js $$2, je<edw> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
      this.B = $$0;
      this.E = $$3;
      final edw $$8 = $$3.a();
      this.H = $$1;
      this.C = $$4;
      if ($$8.k() != 1.0) {
         this.F = new ebr() {
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
         this.F = new ebr();
      }

      this.c = Thread.currentThread();
      this.G = new dka(this, $$6);
      this.d = $$5;
      this.t = new exi(this, $$7);
      this.I = $$2;
      this.J = new but($$2);
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

   public ecg m(iu $$0) {
      return this.d(jx.a($$0.u()), jx.a($$0.w()));
   }

   public ecg d(int $$0, int $$1) {
      return (ecg)this.a($$0, $$1, ecx.n);
   }

   @Nullable
   @Override
   public ebw a(int $$0, int $$1, ecx $$2, boolean $$3) {
      ebw $$4 = this.S().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(iu $$0, dzz $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(iu $$0, dzz $$1, int $$2, int $$3) {
      if (this.t($$0)) {
         return false;
      } else if (!this.C && this.ak()) {
         return false;
      } else {
         ecg $$4 = this.m($$0);
         dma $$5 = $$1.b();
         dzz $$6 = $$4.a($$0, $$1, $$2);
         if ($$6 == null) {
            return false;
         } else {
            dzz $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.C || ($$2 & 4) == 0) && (this.C || $$4.F() != null && $$4.F().a(are.c))) {
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
                  $$1.a((diw)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(iu $$0, dzz $$1, dzz $$2) {
   }

   @Override
   public boolean a(iu $$0, boolean $$1) {
      ewg $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(iu $$0, boolean $$1, @Nullable bwd $$2, int $$3) {
      dzz $$4 = this.a_($$0);
      if ($$4.l()) {
         return false;
      } else {
         ewg $$5 = this.b_($$0);
         if (!($$4.b() instanceof dln)) {
            this.c(2001, $$0, dma.j($$4));
         }

         if ($$1) {
            dwx $$6 = $$4.x() ? this.c_($$0) : null;
            dma.a($$4, this, $$0, $$6, $$2, cyy.k);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(eez.f, $$0, eez.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(iu $$0, dzz $$1) {
   }

   public boolean b(iu $$0, dzz $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(iu var1, dzz var2, dzz var3, int var4);

   public void b(iu $$0, dzz $$1, dzz $$2) {
   }

   public void a(iu $$0, dma $$1, @Nullable exo $$2) {
   }

   public void a(iu $$0, dma $$1, ja $$2, @Nullable exo $$3) {
   }

   public void b(iu $$0, dma $$1, @Nullable exo $$2) {
   }

   public void a(dzz $$0, iu $$1, dma $$2, @Nullable exo $$3, boolean $$4) {
   }

   @Override
   public void a(ja $$0, iu $$1, iu $$2, dzz $$3, int $$4, int $$5) {
      this.t.a($$0, $$3, $$1, $$2, $$4, $$5);
   }

   @Override
   public int a(efy.a $$0, int $$1, int $$2) {
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
   public evv x_() {
      return this.S().q();
   }

   @Override
   public dzz a_(iu $$0) {
      if (this.t($$0)) {
         return dmc.nE.m();
      } else {
         ecg $$1 = this.d(jx.a($$0.u()), jx.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public ewg b_(iu $$0) {
      if (this.t($$0)) {
         return ewh.a.g();
      } else {
         ecg $$1 = this.m($$0);
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
   public void a(@Nullable bwd $$0, iu $$1, awm $$2, awo $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable bwd var1, double var2, double var4, double var6, je<awm> var8, awo var9, float var10, float var11, long var12);

   public void a(@Nullable bwd $$0, double $$1, double $$2, double $$3, awm $$4, awo $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, mf.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable bwd var1, bwd var2, je<awm> var3, awo var4, float var5, float var6, long var7);

   public void a(@Nullable bwd $$0, double $$1, double $$2, double $$3, awm $$4, awo $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable bwd $$0, double $$1, double $$2, double $$3, awm $$4, awo $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable bwd $$0, double $$1, double $$2, double $$3, je<awm> $$4, awo $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable bwd $$0, bwd $$1, awm $$2, awo $$3, float $$4, float $$5) {
      this.a($$0, $$1, mf.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(iu $$0, awm $$1, awo $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bwd $$0, awm $$1, awo $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, awm $$3, awo $$4, float $$5, float $$6, boolean $$7) {
   }

   public void a(awm $$0, awo $$1, float $$2, float $$3) {
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

   public void a(dyv $$0) {
      (this.b ? this.a : this.s).add($$0);
   }

   protected void Y() {
      bqm $$0 = bql.a();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.s.addAll(this.a);
         this.a.clear();
      }

      Iterator<dyv> $$1 = this.s.iterator();
      boolean $$2 = this.u().i();

      while ($$1.hasNext()) {
         dyv $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bwd> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(bwd $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(iu $$0) {
      return this.a(dic.a($$0));
   }

   public void a(@Nullable bwd $$0, double $$1, double $$2, double $$3, float $$4, div.a $$5) {
      this.a($$0, dio.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, lx.w, lx.v, awn.kF);
   }

   public void a(@Nullable bwd $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, div.a $$6) {
      this.a($$0, dio.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, lx.w, lx.v, awn.kF);
   }

   public void a(@Nullable bwd $$0, @Nullable bus $$1, @Nullable dip $$2, fei $$3, float $$4, boolean $$5, div.a $$6) {
      this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, lx.w, lx.v, awn.kF);
   }

   public void a(@Nullable bwd $$0, @Nullable bus $$1, @Nullable dip $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, div.a $$8) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, lx.w, lx.v, awn.kF);
   }

   public abstract void a(
      @Nullable bwd var1,
      @Nullable bus var2,
      @Nullable dip var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      div.a var12,
      lv var13,
      lv var14,
      je<awm> var15
   );

   public abstract String J();

   @Nullable
   @Override
   public dwx c_(iu $$0) {
      if (this.t($$0)) {
         return null;
      } else {
         return !this.C && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, ecg.b.a);
      }
   }

   public void a(dwx $$0) {
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

   public boolean a(iu $$0, bwd $$1, ja $$2) {
      if (this.t($$0)) {
         return false;
      } else {
         ebw $$3 = this.a(jx.a($$0.u()), jx.a($$0.w()), ecx.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(iu $$0, bwd $$1) {
      return this.a($$0, $$1, ja.b);
   }

   public void Z() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * azm.a((double)azm.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void a(boolean $$0) {
      this.S().b($$0);
   }

   public iu aa() {
      iu $$0 = this.B.a();
      if (!this.A_().a($$0)) {
         $$0 = this.a(efy.a.e, iu.a(this.A_().a(), 0.0, this.A_().b()));
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
   public dib c(int $$0, int $$1) {
      return this.a($$0, $$1, ecx.n, false);
   }

   @Override
   public List<bwd> a(@Nullable bwd $$0, fed $$1, Predicate<? super bwd> $$2) {
      bql.a().f("getEntities");
      List<bwd> $$3 = Lists.newArrayList();
      this.H().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }
      });

      for (clt $$4 : this.s()) {
         if ($$4 != $$0 && $$4.a != $$0 && $$2.test($$4) && $$1.c($$4.cR())) {
            $$3.add($$4);
         }
      }

      return $$3;
   }

   @Override
   public <T extends bwd> List<T> a(eel<bwd, T> $$0, fed $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bwd> void a(eel<bwd, T> $$0, fed $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bwd> void a(eel<bwd, T> $$0, fed $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      bql.a().f("getEntities");
      this.H().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axx.a.b;
            }
         }

         if ($$4x instanceof clw $$5) {
            for (clt $$6 : $$5.q()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return axx.a.b;
                  }
               }
            }
         }

         return axx.a.a;
      });
   }

   public List<bwd> i(bwd $$0, fed $$1) {
      return this.a($$0, $$1, bwk.a($$0));
   }

   @Nullable
   public abstract bwd a(int var1);

   @Nullable
   public bwd b(UUID $$0) {
      return this.H().a($$0);
   }

   public abstract Collection<clt> s();

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

   public boolean a(bwd $$0, iu $$1) {
      return true;
   }

   public void a(bwd $$0, byte $$1) {
   }

   public void a(bwd $$0, bus $$1) {
   }

   public void a(iu $$0, dma $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public eyj y_() {
      return this.B;
   }

   public abstract buk u();

   public float b(float $$0) {
      return azm.h($$0, this.y, this.z) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = azm.a($$0, 0.0F, 1.0F);
      this.y = $$1;
      this.z = $$1;
   }

   public float d(float $$0) {
      return azm.h($$0, this.w, this.x);
   }

   public void e(float $$0) {
      float $$1 = azm.a($$0, 0.0F, 1.0F);
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
      } else if (this.a(efy.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         djy $$1 = this.u($$0).a();
         return $$1.a($$0, this.P()) == djy.c.b;
      }
   }

   @Nullable
   public abstract eyb a(exz var1);

   public abstract void a(exz var1, eyb var2);

   public abstract exz x();

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

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<dbm> $$6) {
   }

   public abstract ffn R();

   public void b(iu $$0, dma $$1) {
      for (ja $$2 : ja.c.a) {
         iu $$3 = $$0.a($$2);
         if (this.C($$3)) {
            dzz $$4 = this.a_($$3);
            if ($$4.a(dmc.hw)) {
               this.a($$4, $$3, $$1, null, false);
            } else if ($$4.d(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dmc.hw)) {
                  this.a($$4, $$3, $$1, null, false);
               }
            }
         }
      }
   }

   @Override
   public btz d_(iu $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.C($$0)) {
         $$2 = this.as();
         $$1 = this.m($$0).w();
      }

      return new btz(this.an(), this.af(), $$1, $$2);
   }

   @Override
   public int z_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public ebr A_() {
      return this.F;
   }

   public void a(zf<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public edw B_() {
      return this.E.a();
   }

   public je<edw> ai() {
      return this.E;
   }

   public alf<div> aj() {
      return this.H;
   }

   @Override
   public azv C_() {
      return this.A;
   }

   @Override
   public boolean a(iu $$0, Predicate<dzz> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(iu $$0, Predicate<ewg> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract ddq Q();

   public iu a(int $$0, int $$1, int $$2, int $$3) {
      this.u = this.u * 3 + 1013904223;
      int $$4 = this.u >> 2;
      return new iu($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean v() {
      return false;
   }

   @Override
   public dka D_() {
      return this.G;
   }

   public final boolean ak() {
      return this.d;
   }

   protected abstract een<bwd> H();

   @Override
   public long E_() {
      return this.K++;
   }

   @Override
   public js F_() {
      return this.I;
   }

   public but al() {
      return this.J;
   }

   public abstract dat L();

   public abstract dxw M();

   public int s(iu $$0) {
      return 0;
   }

   public static enum a implements bak {
      a("none"),
      b("block"),
      c("mob"),
      d("tnt"),
      e("trigger");

      public static final Codec<div.a> f = bak.a(div.a::values);
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
