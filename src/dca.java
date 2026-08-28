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

public abstract class dca implements dcb, AutoCloseable {
   public static final Codec<ale<dca>> g = ale.a(lq.aS);
   public static final ale<dca> h = ale.a(lq.aS, new alf("overworld"));
   public static final ale<dca> i = ale.a(lq.aS, new alf("the_nether"));
   public static final ale<dca> j = ale.a(lq.aS, new alf("the_end"));
   public static final int k = 30000000;
   public static final int l = 512;
   public static final int m = 32;
   public static final int n = 15;
   public static final int o = 24000;
   public static final int p = 20000000;
   public static final int q = -20000000;
   protected final List<drb> r = Lists.newArrayList();
   protected final epb s;
   private final List<drb> a = Lists.newArrayList();
   private boolean b;
   private final Thread c;
   private final boolean d;
   private int e;
   protected int t = azh.a().f();
   protected final int u = 1013904223;
   protected float v;
   protected float w;
   protected float x;
   protected float y;
   public final azh z = azh.a();
   @Deprecated
   private final azh f = azh.b();
   private final ji<dvw> D;
   protected final eqf A;
   private final Supplier<bnk> E;
   public final boolean B;
   private final dtv F;
   private final ddb G;
   private final ale<dca> H;
   private final jw I;
   private final brq J;
   private long K;

   protected dca(eqf $$0, ale<dca> $$1, jw $$2, ji<dvw> $$3, Supplier<bnk> $$4, boolean $$5, boolean $$6, long $$7, int $$8) {
      this.E = $$4;
      this.A = $$0;
      this.D = $$3;
      final dvw $$9 = $$3.a();
      this.H = $$1;
      this.B = $$5;
      if ($$9.k() != 1.0) {
         this.F = new dtv() {
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
         this.F = new dtv();
      }

      this.c = Thread.currentThread();
      this.G = new ddb(this, $$7);
      this.d = $$6;
      this.s = new eoz(this, $$8);
      this.I = $$2;
      this.J = new brq($$2);
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

   public boolean k(iz $$0) {
      return !this.s($$0) && g($$0);
   }

   public static boolean l(iz $$0) {
      return !b($$0.v()) && g($$0);
   }

   private static boolean g(iz $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public duk m(iz $$0) {
      return this.d(kb.a($$0.u()), kb.a($$0.w()));
   }

   public duk d(int $$0, int $$1) {
      return (duk)this.a($$0, $$1, duz.n);
   }

   @Nullable
   @Override
   public dua a(int $$0, int $$1, duz $$2, boolean $$3) {
      dua $$4 = this.N().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(iz $$0, dse $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(iz $$0, dse $$1, int $$2, int $$3) {
      if (this.s($$0)) {
         return false;
      } else if (!this.B && this.ai()) {
         return false;
      } else {
         duk $$4 = this.m($$0);
         dfb $$5 = $$1.b();
         dse $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            dse $$7 = this.a_($$0);
            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.B || ($$2 & 4) == 0) && (this.B || $$4.D() != null && $$4.D().a(aqy.c))) {
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
                  $$1.a((dcb)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(iz $$0, dse $$1, dse $$2) {
   }

   @Override
   public boolean a(iz $$0, boolean $$1) {
      enx $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(iz $$0, boolean $$1, @Nullable bsw $$2, int $$3) {
      dse $$4 = this.a_($$0);
      if ($$4.i()) {
         return false;
      } else {
         enx $$5 = this.b_($$0);
         if (!($$4.b() instanceof deo)) {
            this.c(2001, $$0, dfb.i($$4));
         }

         if ($$1) {
            dpj $$6 = $$4.t() ? this.c_($$0) : null;
            dfb.a($$4, this, $$0, $$6, $$2, cur.l);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(dwx.f, $$0, dwx.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(iz $$0, dse $$1) {
   }

   public boolean b(iz $$0, dse $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(iz var1, dse var2, dse var3, int var4);

   public void b(iz $$0, dse $$1, dse $$2) {
   }

   public void a(iz $$0, dfb $$1) {
   }

   public void a(iz $$0, dfb $$1, je $$2) {
   }

   public void a(iz $$0, dfb $$1, iz $$2) {
   }

   public void a(dse $$0, iz $$1, dfb $$2, iz $$3, boolean $$4) {
   }

   @Override
   public void a(je $$0, dse $$1, iz $$2, iz $$3, int $$4, int $$5) {
      this.s.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dxw.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(kb.a($$1), kb.a($$2))) {
            $$4 = this.d(kb.a($$1), kb.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.I_();
         }
      } else {
         $$4 = this.z_() + 1;
      }

      return $$4;
   }

   @Override
   public enm y_() {
      return this.N().p();
   }

   @Override
   public dse a_(iz $$0) {
      if (this.s($$0)) {
         return dfd.nb.o();
      } else {
         duk $$1 = this.d(kb.a($$0.u()), kb.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public enx b_(iz $$0) {
      if (this.s($$0)) {
         return eny.a.g();
      } else {
         duk $$1 = this.m($$0);
         return $$1.b_($$0);
      }
   }

   public boolean R() {
      return !this.D_().a() && this.e < 4;
   }

   public boolean S() {
      return !this.D_().a() && !this.R();
   }

   public void a(@Nullable bsw $$0, iz $$1, avz $$2, awb $$3, float $$4, float $$5) {
      this.a($$0 instanceof cmz $$6 ? $$6 : null, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(@Nullable cmz $$0, iz $$1, avz $$2, awb $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable cmz var1, double var2, double var4, double var6, ji<avz> var8, awb var9, float var10, float var11, long var12);

   public void a(@Nullable cmz $$0, double $$1, double $$2, double $$3, avz $$4, awb $$5, float $$6, float $$7, long $$8) {
      this.a($$0, $$1, $$2, $$3, lp.b.e($$4), $$5, $$6, $$7, $$8);
   }

   public abstract void a(@Nullable cmz var1, bsw var2, ji<avz> var3, awb var4, float var5, float var6, long var7);

   public void a(@Nullable cmz $$0, double $$1, double $$2, double $$3, avz $$4, awb $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, 1.0F, 1.0F);
   }

   public void a(@Nullable cmz $$0, double $$1, double $$2, double $$3, avz $$4, awb $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.f.g());
   }

   public void a(@Nullable cmz $$0, bsw $$1, avz $$2, awb $$3, float $$4, float $$5) {
      this.a($$0, $$1, lp.b.e($$2), $$3, $$4, $$5, this.f.g());
   }

   public void a(iz $$0, avz $$1, awb $$2, float $$3, float $$4, boolean $$5) {
      this.a((double)$$0.u() + 0.5, (double)$$0.v() + 0.5, (double)$$0.w() + 0.5, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(bsw $$0, avz $$1, awb $$2, float $$3, float $$4) {
   }

   public void a(double $$0, double $$1, double $$2, avz $$3, awb $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(lg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(lg $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(lg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(lg $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(drb $$0) {
      (this.b ? this.a : this.r).add($$0);
   }

   protected void T() {
      bnk $$0 = this.ag();
      $$0.a("blockEntities");
      this.b = true;
      if (!this.a.isEmpty()) {
         this.r.addAll(this.a);
         this.a.clear();
      }

      Iterator<drb> $$1 = this.r.iterator();
      boolean $$2 = this.s().i();

      while ($$1.hasNext()) {
         drb $$3 = $$1.next();
         if ($$3.b()) {
            $$1.remove();
         } else if ($$2 && this.n($$3.c())) {
            $$3.a();
         }
      }

      this.b = false;
      $$0.c();
   }

   public <T extends bsw> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         o $$3 = o.a(var6, "Ticking entity");
         p $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new y($$3);
      }
   }

   public boolean h(bsw $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean n(iz $$0) {
      return this.a(dbh.a($$0));
   }

   public dbs a(@Nullable bsw $$0, double $$1, double $$2, double $$3, float $$4, dca.a $$5) {
      return this.a($$0, dbs.a(this, $$0), null, $$1, $$2, $$3, $$4, false, $$5, li.w, li.v, awa.ke);
   }

   public dbs a(@Nullable bsw $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, dca.a $$6) {
      return this.a($$0, dbs.a(this, $$0), null, $$1, $$2, $$3, $$4, $$5, $$6, li.w, li.v, awa.ke);
   }

   public dbs a(@Nullable bsw $$0, @Nullable brp $$1, @Nullable dbt $$2, evt $$3, float $$4, boolean $$5, dca.a $$6) {
      return this.a($$0, $$1, $$2, $$3.a(), $$3.b(), $$3.c(), $$4, $$5, $$6, li.w, li.v, awa.ke);
   }

   public dbs a(@Nullable bsw $$0, @Nullable brp $$1, @Nullable dbt $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dca.a $$8) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, li.w, li.v, awa.ke);
   }

   public dbs a(
      @Nullable bsw $$0,
      @Nullable brp $$1,
      @Nullable dbt $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dca.a $$8,
      lg $$9,
      lg $$10,
      ji<avz> $$11
   ) {
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, true, $$9, $$10, $$11);
   }

   public dbs a(
      @Nullable bsw $$0,
      @Nullable brp $$1,
      @Nullable dbt $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dca.a $$8,
      boolean $$9,
      lg $$10,
      lg $$11,
      ji<avz> $$12
   ) {
      dbs.a $$13 = switch ($$8) {
         case a -> dbs.a.a;
         case b -> this.a(dbw.Q);
         case c -> this.ab().b(dbw.c) ? this.a(dbw.R) : dbs.a.a;
         case d -> this.a(dbw.S);
         case e -> dbs.a.d;
      };
      dbs $$14 = new dbs(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$13, $$10, $$11, $$12);
      $$14.c();
      $$14.a($$9);
      return $$14;
   }

   private dbs.a a(dbw.e<dbw.a> $$0) {
      return this.ab().b($$0) ? dbs.a.c : dbs.a.b;
   }

   public abstract String I();

   @Nullable
   @Override
   public dpj c_(iz $$0) {
      if (this.s($$0)) {
         return null;
      } else {
         return !this.B && Thread.currentThread() != this.c ? null : this.m($$0).a($$0, duk.b.a);
      }
   }

   public void a(dpj $$0) {
      iz $$1 = $$0.ay_();
      if (!this.s($$1)) {
         this.m($$1).b($$0);
      }
   }

   public void o(iz $$0) {
      if (!this.s($$0)) {
         this.m($$0).d($$0);
      }
   }

   public boolean p(iz $$0) {
      return this.s($$0) ? false : this.N().b(kb.a($$0.u()), kb.a($$0.w()));
   }

   public boolean a(iz $$0, bsw $$1, je $$2) {
      if (this.s($$0)) {
         return false;
      } else {
         dua $$3 = this.a(kb.a($$0.u()), kb.a($$0.w()), duz.n, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(iz $$0, bsw $$1) {
      return this.a($$0, $$1, je.b);
   }

   public void U() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * ayz.a((double)ayz.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.e = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.N().a($$0, $$1);
   }

   public iz V() {
      iz $$0 = this.A.a();
      if (!this.C_().a($$0)) {
         $$0 = this.a(dxw.a.e, iz.a(this.C_().a(), 0.0, this.C_().b()));
      }

      return $$0;
   }

   public float W() {
      return this.A.b();
   }

   protected void X() {
      if (this.A.i()) {
         this.w = 1.0F;
         if (this.A.g()) {
            this.y = 1.0F;
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.N().close();
   }

   @Nullable
   @Override
   public dbg c(int $$0, int $$1) {
      return this.a($$0, $$1, duz.n, false);
   }

   @Override
   public List<bsw> a(@Nullable bsw $$0, evo $$1, Predicate<? super bsw> $$2) {
      this.ag().d("getEntities");
      List<bsw> $$3 = Lists.newArrayList();
      this.G().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof cid) {
            for (cib $$4 : ((cid)$$3x).gm()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }
      });
      return $$3;
   }

   @Override
   public <T extends bsw> List<T> a(dwl<bsw, T> $$0, evo $$1, Predicate<? super T> $$2) {
      List<T> $$3 = Lists.newArrayList();
      this.a($$0, $$1, $$2, $$3);
      return $$3;
   }

   public <T extends bsw> void a(dwl<bsw, T> $$0, evo $$1, Predicate<? super T> $$2, List<? super T> $$3) {
      this.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE);
   }

   public <T extends bsw> void a(dwl<bsw, T> $$0, evo $$1, Predicate<? super T> $$2, List<? super T> $$3, int $$4) {
      this.ag().d("getEntities");
      this.G().a($$0, $$1, $$4x -> {
         if ($$2.test((T)$$4x)) {
            $$3.add((T)$$4x);
            if ($$3.size() >= $$4) {
               return axl.a.b;
            }
         }

         if ($$4x instanceof cid $$5) {
            for (cib $$6 : $$5.gm()) {
               T $$7 = $$0.a($$6);
               if ($$7 != null && $$2.test($$7)) {
                  $$3.add($$7);
                  if ($$3.size() >= $$4) {
                     return axl.a.b;
                  }
               }
            }
         }

         return axl.a.a;
      });
   }

   @Nullable
   public abstract bsw a(int var1);

   public void q(iz $$0) {
      if (this.B($$0)) {
         this.m($$0).a(true);
      }
   }

   @Override
   public int z_() {
      return 63;
   }

   public void Y() {
   }

   public long Z() {
      return this.A.c();
   }

   public long aa() {
      return this.A.d();
   }

   public boolean a(cmz $$0, iz $$1) {
      return true;
   }

   public void a(bsw $$0, byte $$1) {
   }

   public void a(bsw $$0, brp $$1) {
   }

   public void a(iz $$0, dfb $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public epu A_() {
      return this.A;
   }

   public dbw ab() {
      return this.A.o();
   }

   public abstract brh s();

   public float b(float $$0) {
      return ayz.i($$0, this.x, this.y) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = ayz.a($$0, 0.0F, 1.0F);
      this.x = $$1;
      this.y = $$1;
   }

   public float d(float $$0) {
      return ayz.i($$0, this.v, this.w);
   }

   public void e(float $$0) {
      float $$1 = ayz.a($$0, 0.0F, 1.0F);
      this.v = $$1;
      this.w = $$1;
   }

   public boolean ac() {
      return this.D_().g() && !this.D_().h() ? (double)this.b(1.0F) > 0.9 : false;
   }

   public boolean ad() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean r(iz $$0) {
      if (!this.ad()) {
         return false;
      } else if (!this.h($$0)) {
         return false;
      } else if (this.a(dxw.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         dcz $$1 = this.t($$0).a();
         return $$1.a($$0) == dcz.c.b;
      }
   }

   @Nullable
   public abstract epm a(epk var1);

   public abstract void a(epk var1, epm var2);

   public abstract epk v();

   public void b(int $$0, iz $$1, int $$2) {
   }

   public p a(o $$0) {
      p $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", () -> this.x().size() + " total; " + this.x());
      $$1.a("Chunk stats", this.N()::e);
      $$1.a("Level dimension", () -> this.af().a().toString());

      try {
         this.A.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, iz var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cxk> $$6) {
   }

   public abstract ewx M();

   public void c(iz $$0, dfb $$1) {
      for (je $$2 : je.c.a) {
         iz $$3 = $$0.a($$2);
         if (this.B($$3)) {
            dse $$4 = this.a_($$3);
            if ($$4.a(dfd.gY)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(dfd.gY)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }
   }

   @Override
   public bqu d_(iz $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.B($$0)) {
         $$2 = this.aq();
         $$1 = this.m($$0).u();
      }

      return new bqu(this.al(), this.aa(), $$1, $$2);
   }

   @Override
   public int B_() {
      return this.e;
   }

   public void c(int $$0) {
   }

   @Override
   public dtv C_() {
      return this.F;
   }

   public void a(zw<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public dvw D_() {
      return this.D.a();
   }

   public ji<dvw> ae() {
      return this.D;
   }

   public ale<dca> af() {
      return this.H;
   }

   @Override
   public azh E_() {
      return this.z;
   }

   @Override
   public boolean a(iz $$0, Predicate<dse> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(iz $$0, Predicate<enx> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cza r();

   public iz a(int $$0, int $$1, int $$2, int $$3) {
      this.t = this.t * 3 + 1013904223;
      int $$4 = this.t >> 2;
      return new iz($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean t() {
      return false;
   }

   public bnk ag() {
      return this.E.get();
   }

   public Supplier<bnk> ah() {
      return this.E;
   }

   @Override
   public ddb F_() {
      return this.G;
   }

   public final boolean ai() {
      return this.d;
   }

   protected abstract dwn<bsw> G();

   @Override
   public long G_() {
      return this.K++;
   }

   @Override
   public jw H_() {
      return this.I;
   }

   public brq aj() {
      return this.J;
   }

   public abstract cwr K();

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
