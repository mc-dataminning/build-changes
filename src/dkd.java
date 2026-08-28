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

public class dkd extends dxn implements dgy {
   public static final MapCodec<dkd> p = b(dkd::new);
   private static final Logger a = LogUtils.getLogger();
   private final jq.c<dkd> b = ma.e.f(this);
   public static final jw<dxo> q = new jw<>();
   private static final LoadingCache<fcl, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fcl, Boolean>() {
      public Boolean a(fcl $$0) {
         return !fci.c(fci.b(), $$0, fbv.g);
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
   protected final dxp<dkd, dxo> F;
   private dxo d;
   @Nullable
   private cxc e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dkd.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dkd.a> $$0 = new Object2ByteLinkedOpenHashMap<dkd.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dkd> a() {
      return p;
   }

   public static int j(@Nullable dxo $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dxo a(int $$0) {
      dxo $$1 = q.a($$0);
      return $$1 == null ? dkf.a.m() : $$1;
   }

   public static dkd a(@Nullable cxc $$0) {
      return $$0 instanceof cvm ? ((cvm)$$0).d() : dkf.a;
   }

   public static dxo a(dxo $$0, dxo $$1, dha $$2, jh $$3) {
      fcl $$4 = fci.b($$0.g($$2, $$3), $$1.g($$2, $$3), fbv.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bvb $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fci.a(jm.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fcl a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fci.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dxo b(dxo $$0, dha $$1, jh $$2) {
      dxo $$3 = $$0;
      jh.a $$4 = new jh.a();

      for (jm $$5 : aG) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.H_());
      }

      return $$3;
   }

   public static void a(dxo $$0, dxo $$1, dha $$2, jh $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dxo $$0, dxo $$1, dha $$2, jh $$3, int $$4, int $$5) {
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

   public dkd(dxn.d $$0) {
      super($$0);
      dxp.a<dkd, dxo> $$1 = new dxp.a<>(this);
      this.a($$1);
      this.F = $$1.a(dkd::m, dxo::new);
      this.l(this.F.b());
      if (ab.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dxo $$0) {
      return $$0.b() instanceof dop || $$0.a(dkf.iu) || $$0.a(dkf.er) || $$0.a(dkf.es) || $$0.a(dkf.fo) || $$0.a(dkf.fn) || $$0.a(axk.am);
   }

   public static boolean a(dxo $$0, dxo $$1, jm $$2) {
      fcl $$3 = $$1.a($$2.g());
      if ($$3 == fci.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fci.a()) {
         return true;
      } else {
         fcl $$4 = $$0.a($$2);
         if ($$4 == fci.a()) {
            return true;
         } else {
            dkd.a $$5 = new dkd.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dkd.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fci.c($$4, $$3, fbv.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dge $$0, jh $$1) {
      return $$0.a_($$1).a($$0, $$1, jm.b, dsj.c);
   }

   public static boolean a(dhc $$0, jh $$1, jm $$2) {
      dxo $$3 = $$0.a_($$1);
      return $$2 == jm.a && $$3.a(axk.bb) ? false : $$3.a($$0, $$1, $$2, dsj.b);
   }

   public static boolean a(fcl $$0, jm $$1) {
      fcl $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fcl $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
   }

   public void a(dha $$0, jh $$1, dxo $$2) {
   }

   public static List<cxg> a(dxo $$0, arx $$1, jh $$2, @Nullable duq $$3) {
      ewl.a $$4 = new ewl.a($$1).a(ezc.f, fbr.b($$2)).a(ezc.i, cxg.j).b(ezc.h, $$3);
      return $$0.a($$4);
   }

   public static List<cxg> a(dxo $$0, arx $$1, jh $$2, @Nullable duq $$3, @Nullable bvb $$4, cxg $$5) {
      ewl.a $$6 = new ewl.a($$1).a(ezc.f, fbr.b($$2)).a(ezc.i, $$5).b(ezc.a, $$4).b(ezc.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dxo $$0, dgz $$1, jh $$2) {
      if ($$1 instanceof arx) {
         a($$0, (arx)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arx)$$1, $$2, cxg.j, true);
      }
   }

   public static void a(dxo $$0, dha $$1, jh $$2, @Nullable duq $$3) {
      if ($$1 instanceof arx) {
         a($$0, (arx)$$1, $$2, $$3).forEach($$2x -> a((dgz)((arx)$$1), $$2, $$2x));
         $$0.a((arx)$$1, $$2, cxg.j, true);
      }
   }

   public static void a(dxo $$0, dgz $$1, jh $$2, @Nullable duq $$3, @Nullable bvb $$4, cxg $$5) {
      if ($$1 instanceof arx) {
         a($$0, (arx)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arx)$$1, $$2, $$5, true);
      }
   }

   public static void a(dgz $$0, jh $$1, cxg $$2) {
      double $$3 = (double)bvi.ar.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azu.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azu.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azu.a($$0.A, -0.25, 0.25);
      a($$0, () -> new cls($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dgz $$0, jh $$1, jm $$2, cxg $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bvi.ar.l() / 2.0;
      double $$8 = (double)bvi.ar.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azu.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azu.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azu.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azu.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azu.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azu.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cls($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dgz $$0, Supplier<cls> $$1, cxg $$2) {
      if ($$0 instanceof arx $$3 && !$$2.f() && $$3.O().b(dgv.h)) {
         cls $$5 = $$1.get();
         $$5.s();
         $$0.b($$5);
         return;
      }
   }

   protected void a(arx $$0, jh $$1, int $$2) {
      if ($$0.O().b(dgv.h)) {
         bvn.a($$0, fbr.b($$1), $$2);
      }
   }

   public float e() {
      return this.aI;
   }

   public void a(arx $$0, jh $$1, dgr $$2) {
   }

   public void a(dgz $$0, jh $$1, dxo $$2, bvb $$3) {
   }

   @Nullable
   public dxo a(dax $$0) {
      return this.m();
   }

   public void a(dgz $$0, cpo $$1, jh $$2, dxo $$3, @Nullable duq $$4, cxg $$5) {
      $$1.b(axf.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dgz $$0, jh $$1, dxo $$2, @Nullable bvx $$3, cxg $$4) {
   }

   public boolean a(dxo $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xy f() {
      return xk.c(this.v());
   }

   public void a(dgz $$0, dxo $$1, jh $$2, bvb $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dX().l());
   }

   public void a(dge $$0, bvb $$1) {
      $$1.h($$1.dz().d(1.0, 0.0, 1.0));
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

   protected void a(dgz $$0, cpo $$1, jh $$2, dxo $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dxo a(dgz $$0, jh $$1, dxo $$2, cpo $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axk.aY) && $$0 instanceof arx $$4) {
         cod.a($$4, $$3, false);
      }

      $$0.a(eck.f, $$1, eck.a.a($$3, $$2));
      return $$2;
   }

   public void a(dxo $$0, dgz $$1, jh $$2, dib.c $$3) {
   }

   public boolean a(dgr $$0) {
      return true;
   }

   protected void a(dxp.a<dkd, dxo> $$0) {
   }

   public dxp<dkd, dxo> l() {
      return this.F;
   }

   protected final void l(dxo $$0) {
      this.d = $$0;
   }

   public final dxo m() {
      return this.d;
   }

   public final dxo m(dxo $$0) {
      dxo $$1 = this.m();

      for (dyq<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dxo a(dxo $$0, dxo $$1, dyq<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cxc j() {
      if (this.e == null) {
         this.e = cxc.a(this);
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

   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
   }

   @Override
   protected dkd o() {
      return this;
   }

   protected ImmutableMap<dxo, fcl> a(Function<dxo, fcl> $$0) {
      return this.F.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jq.c<dkd> p() {
      return this.b;
   }

   protected void a(arx $$0, jh $$1, cxg $$2, bsf $$3) {
      int $$4 = dds.b($$0, $$2, $$3.a($$0.H_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fcl a, fcl b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dkd.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
