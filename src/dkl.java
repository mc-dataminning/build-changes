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

public class dkl extends dxt implements dhg {
   public static final MapCodec<dkl> p = b(dkl::new);
   private static final Logger a = LogUtils.getLogger();
   private final jq.c<dkl> b = ma.e.f(this);
   public static final jw<dxu> q = new jw<>();
   private static final LoadingCache<fcr, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fcr, Boolean>() {
      public Boolean a(fcr $$0) {
         return !fco.c(fco.b(), $$0, fcb.g);
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
   protected final dxv<dkl, dxu> F;
   private dxu d;
   @Nullable
   private cxk e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dkl.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dkl.a> $$0 = new Object2ByteLinkedOpenHashMap<dkl.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dkl> a() {
      return p;
   }

   public static int j(@Nullable dxu $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dxu a(int $$0) {
      dxu $$1 = q.a($$0);
      return $$1 == null ? dkn.a.m() : $$1;
   }

   public static dkl a(@Nullable cxk $$0) {
      return $$0 instanceof cvu ? ((cvu)$$0).d() : dkn.a;
   }

   public static dxu a(dxu $$0, dxu $$1, dhi $$2, jh $$3) {
      fcr $$4 = fco.b($$0.g($$2, $$3), $$1.g($$2, $$3), fcb.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bvj $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fco.a(jm.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fcr a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fco.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dxu b(dxu $$0, dhi $$1, jh $$2) {
      dxu $$3 = $$0;
      jh.a $$4 = new jh.a();

      for (jm $$5 : aG) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.H_());
      }

      return $$3;
   }

   public static void a(dxu $$0, dxu $$1, dhi $$2, jh $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dxu $$0, dxu $$1, dhi $$2, jh $$3, int $$4, int $$5) {
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

   public dkl(dxt.d $$0) {
      super($$0);
      dxv.a<dkl, dxu> $$1 = new dxv.a<>(this);
      this.a($$1);
      this.F = $$1.a(dkl::m, dxu::new);
      this.l(this.F.b());
      if (ab.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dxu $$0) {
      return $$0.b() instanceof dox || $$0.a(dkn.in) || $$0.a(dkn.er) || $$0.a(dkn.es) || $$0.a(dkn.fo) || $$0.a(dkn.fn) || $$0.a(axu.am);
   }

   public static boolean a(dxu $$0, dxu $$1, jm $$2) {
      fcr $$3 = $$1.a($$2.g());
      if ($$3 == fco.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fco.a()) {
         return true;
      } else {
         fcr $$4 = $$0.a($$2);
         if ($$4 == fco.a()) {
            return true;
         } else {
            dkl.a $$5 = new dkl.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dkl.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fco.c($$4, $$3, fcb.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dgm $$0, jh $$1) {
      return $$0.a_($$1).a($$0, $$1, jm.b, dsp.c);
   }

   public static boolean a(dhk $$0, jh $$1, jm $$2) {
      dxu $$3 = $$0.a_($$1);
      return $$2 == jm.a && $$3.a(axu.bb) ? false : $$3.a($$0, $$1, $$2, dsp.b);
   }

   public static boolean a(fcr $$0, jm $$1) {
      fcr $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fcr $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
   }

   public void a(dhi $$0, jh $$1, dxu $$2) {
   }

   public static List<cxo> a(dxu $$0, ash $$1, jh $$2, @Nullable duw $$3) {
      ewr.a $$4 = new ewr.a($$1).a(ezi.f, fbx.b($$2)).a(ezi.i, cxo.k).b(ezi.h, $$3);
      return $$0.a($$4);
   }

   public static List<cxo> a(dxu $$0, ash $$1, jh $$2, @Nullable duw $$3, @Nullable bvj $$4, cxo $$5) {
      ewr.a $$6 = new ewr.a($$1).a(ezi.f, fbx.b($$2)).a(ezi.i, $$5).b(ezi.a, $$4).b(ezi.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dxu $$0, dhh $$1, jh $$2) {
      if ($$1 instanceof ash) {
         a($$0, (ash)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ash)$$1, $$2, cxo.k, true);
      }
   }

   public static void a(dxu $$0, dhi $$1, jh $$2, @Nullable duw $$3) {
      if ($$1 instanceof ash) {
         a($$0, (ash)$$1, $$2, $$3).forEach($$2x -> a((dhh)((ash)$$1), $$2, $$2x));
         $$0.a((ash)$$1, $$2, cxo.k, true);
      }
   }

   public static void a(dxu $$0, dhh $$1, jh $$2, @Nullable duw $$3, @Nullable bvj $$4, cxo $$5) {
      if ($$1 instanceof ash) {
         a($$0, (ash)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ash)$$1, $$2, $$5, true);
      }
   }

   public static void a(dhh $$0, jh $$1, cxo $$2) {
      double $$3 = (double)bvq.ar.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + bae.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + bae.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + bae.a($$0.A, -0.25, 0.25);
      a($$0, () -> new cma($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dhh $$0, jh $$1, jm $$2, cxo $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bvq.ar.l() / 2.0;
      double $$8 = (double)bvq.ar.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? bae.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? bae.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? bae.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? bae.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? bae.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? bae.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cma($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dhh $$0, Supplier<cma> $$1, cxo $$2) {
      if ($$0 instanceof ash $$3 && !$$2.f() && $$3.N().b(dhd.h)) {
         cma $$5 = $$1.get();
         $$5.s();
         $$0.b($$5);
         return;
      }
   }

   protected void a(ash $$0, jh $$1, int $$2) {
      if ($$0.N().b(dhd.h)) {
         bvv.a($$0, fbx.b($$1), $$2);
      }
   }

   public float e() {
      return this.aI;
   }

   public void a(ash $$0, jh $$1, dgz $$2) {
   }

   public void a(dhh $$0, jh $$1, dxu $$2, bvj $$3) {
   }

   @Nullable
   public dxu a(dbf $$0) {
      return this.m();
   }

   public void a(dhh $$0, cpw $$1, jh $$2, dxu $$3, @Nullable duw $$4, cxo $$5) {
      $$1.b(axp.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dhh $$0, jh $$1, dxu $$2, @Nullable bwf $$3, cxo $$4) {
   }

   public boolean a(dxu $$0) {
      return !$$0.e() && !$$0.n();
   }

   public yj f() {
      return xv.c(this.v());
   }

   public void a(dhh $$0, dxu $$1, jh $$2, bvj $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dW().l());
   }

   public void a(dgm $$0, bvj $$1) {
      $$1.h($$1.dy().d(1.0, 0.0, 1.0));
   }

   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return new cxo(this);
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

   protected void a(dhh $$0, cpw $$1, jh $$2, dxu $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dxu a(dhh $$0, jh $$1, dxu $$2, cpw $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axu.aY) && $$0 instanceof ash $$4) {
         col.a($$4, $$3, false);
      }

      $$0.a(ecq.f, $$1, ecq.a.a($$3, $$2));
      return $$2;
   }

   public void a(dxu $$0, dhh $$1, jh $$2, dij.c $$3) {
   }

   public boolean a(dgz $$0) {
      return true;
   }

   protected void a(dxv.a<dkl, dxu> $$0) {
   }

   public dxv<dkl, dxu> l() {
      return this.F;
   }

   protected final void l(dxu $$0) {
      this.d = $$0;
   }

   public final dxu m() {
      return this.d;
   }

   public final dxu m(dxu $$0) {
      dxu $$1 = this.m();

      for (dyw<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dxu a(dxu $$0, dxu $$1, dyw<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cxk j() {
      if (this.e == null) {
         this.e = cxk.a(this);
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

   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
   }

   @Override
   protected dkl o() {
      return this;
   }

   protected ImmutableMap<dxu, fcr> a(Function<dxu, fcr> $$0) {
      return this.F.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jq.c<dkl> p() {
      return this.b;
   }

   protected void a(ash $$0, jh $$1, cxo $$2, bsn $$3) {
      int $$4 = dea.b($$0, $$2, $$3.a($$0.H_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fcr a, fcr b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dkl.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
