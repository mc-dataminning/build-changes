import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkm extends dxu implements dhh {
   public static final MapCodec<dkm> p = b(dkm::new);
   private static final Logger a = LogUtils.getLogger();
   private final jq.c<dkm> b = ma.e.f(this);
   public static final jw<dxv> q = new jw<>();
   private static final LoadingCache<fcs, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fcs, Boolean>() {
      public Boolean a(fcs $$0) {
         return !fcp.c(fcp.b(), $$0, fcc.g);
      }
   });
   public static final int r = 1;
   public static final int s = 2;
   public static final int t = 4;
   public static final int u = 8;
   public static final int v = 16;
   public static final int w = 32;
   public static final int x = 64;
   public static final int y = 128;
   public static final int z = 4;
   public static final int A = 3;
   public static final int B = 11;
   public static final float C = -1.0F;
   public static final float D = 0.0F;
   public static final int E = 512;
   protected final dxw<dkm, dxv> F;
   private dxv d;
   @Nullable
   private cxl e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dkm.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dkm.a> $$0 = new Object2ByteLinkedOpenHashMap<dkm.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dkm> a() {
      return p;
   }

   public static int j(@Nullable dxv $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dxv a(int $$0) {
      dxv $$1 = q.a($$0);
      return $$1 == null ? dko.a.m() : $$1;
   }

   public static dkm a(@Nullable cxl $$0) {
      return $$0 instanceof cvv ? ((cvv)$$0).d() : dko.a;
   }

   public static dxv a(dxv $$0, dxv $$1, dhj $$2, jh $$3) {
      fcs $$4 = fcp.b($$0.g($$2, $$3), $$1.g($$2, $$3), fcc.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bvk $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fcp.a(jm.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fcs a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fcp.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dxv b(dxv $$0, dhj $$1, jh $$2) {
      dxv $$3 = $$0;
      jh.a $$4 = new jh.a();

      for (jm $$5 : aG) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.H_());
      }

      return $$3;
   }

   public static void a(dxv $$0, dxv $$1, dhj $$2, jh $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dxv $$0, dxv $$1, dhj $$2, jh $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.l()) {
            if (!$$2.B_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public dkm(dxu.d $$0) {
      super($$0);
      dxw.a<dkm, dxv> $$1 = new dxw.a<>(this);
      this.a($$1);
      this.F = $$1.a(dkm::m, dxv::new);
      this.l(this.F.b());
      if (ab.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dxv $$0) {
      return $$0.b() instanceof doy || $$0.a(dko.in) || $$0.a(dko.er) || $$0.a(dko.es) || $$0.a(dko.fo) || $$0.a(dko.fn) || $$0.a(axu.am);
   }

   public static boolean a(dxv $$0, dxv $$1, jm $$2) {
      fcs $$3 = $$1.a($$2.g());
      if ($$3 == fcp.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fcp.a()) {
         return true;
      } else {
         fcs $$4 = $$0.a($$2);
         if ($$4 == fcp.a()) {
            return true;
         } else {
            dkm.a $$5 = new dkm.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dkm.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fcp.c($$4, $$3, fcc.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dgn $$0, jh $$1) {
      return $$0.a_($$1).a($$0, $$1, jm.b, dsq.c);
   }

   public static boolean a(dhl $$0, jh $$1, jm $$2) {
      dxv $$3 = $$0.a_($$1);
      return $$2 == jm.a && $$3.a(axu.bb) ? false : $$3.a($$0, $$1, $$2, dsq.b);
   }

   public static boolean a(fcs $$0, jm $$1) {
      fcs $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fcs $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
   }

   public void a(dhj $$0, jh $$1, dxv $$2) {
   }

   public static List<cxp> a(dxv $$0, ash $$1, jh $$2, @Nullable dux $$3) {
      ews.a $$4 = new ews.a($$1).a(ezj.f, fby.b($$2)).a(ezj.i, cxp.j).b(ezj.h, $$3);
      return $$0.a($$4);
   }

   public static List<cxp> a(dxv $$0, ash $$1, jh $$2, @Nullable dux $$3, @Nullable bvk $$4, cxp $$5) {
      ews.a $$6 = new ews.a($$1).a(ezj.f, fby.b($$2)).a(ezj.i, $$5).b(ezj.a, $$4).b(ezj.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dxv $$0, dhi $$1, jh $$2) {
      if ($$1 instanceof ash) {
         a($$0, (ash)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ash)$$1, $$2, cxp.j, true);
      }
   }

   public static void a(dxv $$0, dhj $$1, jh $$2, @Nullable dux $$3) {
      if ($$1 instanceof ash) {
         a($$0, (ash)$$1, $$2, $$3).forEach($$2x -> a((dhi)((ash)$$1), $$2, $$2x));
         $$0.a((ash)$$1, $$2, cxp.j, true);
      }
   }

   public static void a(dxv $$0, dhi $$1, jh $$2, @Nullable dux $$3, @Nullable bvk $$4, cxp $$5) {
      if ($$1 instanceof ash) {
         a($$0, (ash)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ash)$$1, $$2, $$5, true);
      }
   }

   public static void a(dhi $$0, jh $$1, cxp $$2) {
      double $$3 = (double)bvr.ar.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + bae.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + bae.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + bae.a($$0.A, -0.25, 0.25);
      a($$0, () -> new cmb($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dhi $$0, jh $$1, jm $$2, cxp $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bvr.ar.l() / 2.0;
      double $$8 = (double)bvr.ar.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? bae.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? bae.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? bae.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? bae.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? bae.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? bae.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cmb($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dhi $$0, Supplier<cmb> $$1, cxp $$2) {
      if ($$0 instanceof ash $$3 && !$$2.f() && $$3.N().b(dhe.h)) {
         cmb $$5 = $$1.get();
         $$5.s();
         $$0.b($$5);
         return;
      }
   }

   protected void a(ash $$0, jh $$1, int $$2) {
      if ($$0.N().b(dhe.h)) {
         bvw.a($$0, fby.b($$1), $$2);
      }
   }

   public float e() {
      return this.aI;
   }

   public void a(ash $$0, jh $$1, dha $$2) {
   }

   public void a(dhi $$0, jh $$1, dxv $$2, bvk $$3) {
   }

   @Nullable
   public dxv a(dbg $$0) {
      return this.m();
   }

   public void a(dhi $$0, cpx $$1, jh $$2, dxv $$3, @Nullable dux $$4, cxp $$5) {
      $$1.b(axp.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dhi $$0, jh $$1, dxv $$2, @Nullable bwg $$3, cxp $$4) {
   }

   public boolean a(dxv $$0) {
      return !$$0.e() && !$$0.n();
   }

   public yj f() {
      return xv.c(this.v());
   }

   public void a(dhi $$0, dxv $$1, jh $$2, bvk $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dX().l());
   }

   public void a(dgn $$0, bvk $$1) {
      $$1.h($$1.dz().d(1.0, 0.0, 1.0));
   }

   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return new cxp(this);
   }

   public float g() {
      return this.aL;
   }

   public float h() {
      return this.aM;
   }

   public float k() {
      return this.aN;
   }

   protected void a(dhi $$0, cpx $$1, jh $$2, dxv $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dxv a(dhi $$0, jh $$1, dxv $$2, cpx $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axu.aY) && $$0 instanceof ash $$4) {
         com.a($$4, $$3, false);
      }

      $$0.a(ecr.f, $$1, ecr.a.a($$3, $$2));
      return $$2;
   }

   public void a(dxv $$0, dhi $$1, jh $$2, dik.c $$3) {
   }

   public boolean a(dha $$0) {
      return true;
   }

   protected void a(dxw.a<dkm, dxv> $$0) {
   }

   public dxw<dkm, dxv> l() {
      return this.F;
   }

   protected final void l(dxv $$0) {
      this.d = $$0;
   }

   public final dxv m() {
      return this.d;
   }

   public final dxv m(dxv $$0) {
      dxv $$1 = this.m();

      for (dyx<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dxv a(dxv $$0, dxv $$1, dyx<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cxl j() {
      if (this.e == null) {
         this.e = cxl.a(this);
      }

      return this.e;
   }

   public boolean n() {
      return this.aO;
   }

   @Override
   public String toString() {
      return "Block{" + ma.e.e(this).g() + "}";
   }

   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
   }

   @Override
   protected dkm o() {
      return this;
   }

   protected ImmutableMap<dxv, fcs> a(Function<dxv, fcs> $$0) {
      return this.F.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jq.c<dkm> p() {
      return this.b;
   }

   protected void a(ash $$0, jh $$1, cxp $$2, bso $$3) {
      int $$4 = deb.b($$0, $$2, $$3.a($$0.H_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fcs a, fcs b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dkm.a $$1 && this.a == $$1.a && this.b == $$1.b) {
            return true;
         }

         return false;
      }

      @Override
      public int hashCode() {
         return System.identityHashCode(this.a) * 31 + System.identityHashCode(this.b);
      }
   }
}
