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

public class dij extends dvn implements dfe {
   public static final MapCodec<dij> p = b(dij::new);
   private static final Logger a = LogUtils.getLogger();
   private final jq.c<dij> b = lz.e.f(this);
   public static final jw<dvo> q = new jw<>();
   private static final LoadingCache<fal, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fal, Boolean>() {
      public Boolean a(fal $$0) {
         return !fai.c(fai.b(), $$0, ezv.g);
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
   protected final dvp<dij, dvo> F;
   private dvo d;
   @Nullable
   private cwb e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dij.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dij.a> $$0 = new Object2ByteLinkedOpenHashMap<dij.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dij> a() {
      return p;
   }

   public static int j(@Nullable dvo $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dvo a(int $$0) {
      dvo $$1 = q.a($$0);
      return $$1 == null ? dil.a.m() : $$1;
   }

   public static dij a(@Nullable cwb $$0) {
      return $$0 instanceof cul ? ((cul)$$0).d() : dil.a;
   }

   public static dvo a(dvo $$0, dvo $$1, dfg $$2, jh $$3) {
      fal $$4 = fai.b($$0.g($$2, $$3), $$1.g($$2, $$3), ezv.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bui $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fai.a(jm.a.b, $$6.cT().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fal a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fai.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dvo b(dvo $$0, dfg $$1, jh $$2) {
      dvo $$3 = $$0;
      jh.a $$4 = new jh.a();

      for (jm $$5 : aG) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.E_());
      }

      return $$3;
   }

   public static void a(dvo $$0, dvo $$1, dfg $$2, jh $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dvo $$0, dvo $$1, dfg $$2, jh $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.l()) {
            if (!$$2.y_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public dij(dvn.d $$0) {
      super($$0);
      dvp.a<dij, dvo> $$1 = new dvp.a<>(this);
      this.a($$1);
      this.F = $$1.a(dij::m, dvo::new);
      this.l(this.F.b());
      if (ab.aV) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dvo $$0) {
      return $$0.b() instanceof dms || $$0.a(dil.hW) || $$0.a(dil.ee) || $$0.a(dil.ef) || $$0.a(dil.fa) || $$0.a(dil.eZ) || $$0.a(axd.al);
   }

   public static boolean a(dvo $$0, dvo $$1, jm $$2) {
      fal $$3 = $$1.a($$2.g());
      if ($$3 == fai.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fai.a()) {
         return true;
      } else {
         fal $$4 = $$0.a($$2);
         if ($$4 == fai.a()) {
            return true;
         } else {
            dij.a $$5 = new dij.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dij.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fai.c($$4, $$3, ezv.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dek $$0, jh $$1) {
      return $$0.a_($$1).a($$0, $$1, jm.b, dqk.c);
   }

   public static boolean a(dfi $$0, jh $$1, jm $$2) {
      dvo $$3 = $$0.a_($$1);
      return $$2 == jm.a && $$3.a(axd.ba) ? false : $$3.a($$0, $$1, $$2, dqk.b);
   }

   public static boolean a(fal $$0, jm $$1) {
      fal $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fal $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
   }

   public void a(dfg $$0, jh $$1, dvo $$2) {
   }

   public static List<cwf> a(dvo $$0, arq $$1, jh $$2, @Nullable dsr $$3) {
      euj.a $$4 = new euj.a($$1).a(exc.f, ezr.b($$2)).a(exc.i, cwf.k).b(exc.h, $$3);
      return $$0.a($$4);
   }

   public static List<cwf> a(dvo $$0, arq $$1, jh $$2, @Nullable dsr $$3, @Nullable bui $$4, cwf $$5) {
      euj.a $$6 = new euj.a($$1).a(exc.f, ezr.b($$2)).a(exc.i, $$5).b(exc.a, $$4).b(exc.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dvo $$0, dff $$1, jh $$2) {
      if ($$1 instanceof arq) {
         a($$0, (arq)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arq)$$1, $$2, cwf.k, true);
      }
   }

   public static void a(dvo $$0, dfg $$1, jh $$2, @Nullable dsr $$3) {
      if ($$1 instanceof arq) {
         a($$0, (arq)$$1, $$2, $$3).forEach($$2x -> a((dff)((arq)$$1), $$2, $$2x));
         $$0.a((arq)$$1, $$2, cwf.k, true);
      }
   }

   public static void a(dvo $$0, dff $$1, jh $$2, @Nullable dsr $$3, @Nullable bui $$4, cwf $$5) {
      if ($$1 instanceof arq) {
         a($$0, (arq)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arq)$$1, $$2, $$5, true);
      }
   }

   public static void a(dff $$0, jh $$1, cwf $$2) {
      double $$3 = (double)bup.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azn.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azn.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azn.a($$0.A, -0.25, 0.25);
      a($$0, () -> new ckz($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dff $$0, jh $$1, jm $$2, cwf $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bup.ag.l() / 2.0;
      double $$8 = (double)bup.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azn.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azn.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azn.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azn.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azn.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azn.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new ckz($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dff $$0, Supplier<ckz> $$1, cwf $$2) {
      if (!$$0.C && !$$2.f() && $$0.ac().b(dfb.h)) {
         ckz $$3 = $$1.get();
         $$3.q();
         $$0.b($$3);
      }
   }

   protected void a(arq $$0, jh $$1, int $$2) {
      if ($$0.ac().b(dfb.h)) {
         buu.a($$0, ezr.b($$1), $$2);
      }
   }

   public float e() {
      return this.aI;
   }

   public void a(arq $$0, jh $$1, dex $$2) {
   }

   public void a(dff $$0, jh $$1, dvo $$2, bui $$3) {
   }

   @Nullable
   public dvo a(czw $$0) {
      return this.m();
   }

   public void a(dff $$0, cor $$1, jh $$2, dvo $$3, @Nullable dsr $$4, cwf $$5) {
      $$1.b(awy.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dff $$0, jh $$1, dvo $$2, @Nullable bve $$3, cwf $$4) {
   }

   public boolean a(dvo $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xz f() {
      return xl.c(this.v());
   }

   public void a(dff $$0, dvo $$1, jh $$2, bui $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dZ().l());
   }

   public void a(dek $$0, bui $$1) {
      $$1.h($$1.dB().d(1.0, 0.0, 1.0));
   }

   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return new cwf(this);
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

   protected void a(dff $$0, cor $$1, jh $$2, dvo $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dvo a(dff $$0, jh $$1, dvo $$2, cor $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axd.aX)) {
         cng.a($$3, false);
      }

      $$0.a(eak.f, $$1, eak.a.a($$3, $$2));
      return $$2;
   }

   public void a(dvo $$0, dff $$1, jh $$2, dgh.c $$3) {
   }

   public boolean a(dex $$0) {
      return true;
   }

   protected void a(dvp.a<dij, dvo> $$0) {
   }

   public dvp<dij, dvo> l() {
      return this.F;
   }

   protected final void l(dvo $$0) {
      this.d = $$0;
   }

   public final dvo m() {
      return this.d;
   }

   public final dvo m(dvo $$0) {
      dvo $$1 = this.m();

      for (dwq<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dvo a(dvo $$0, dvo $$1, dwq<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cwb j() {
      if (this.e == null) {
         this.e = cwb.a(this);
      }

      return this.e;
   }

   public boolean n() {
      return this.aO;
   }

   @Override
   public String toString() {
      return "Block{" + lz.e.e(this).g() + "}";
   }

   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
   }

   @Override
   protected dij o() {
      return this;
   }

   protected ImmutableMap<dvo, fal> a(Function<dvo, fal> $$0) {
      return this.F.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jq.c<dij> p() {
      return this.b;
   }

   protected void a(arq $$0, jh $$1, cwf $$2, brm $$3) {
      int $$4 = dby.b($$0, $$2, $$3.a($$0.E_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fal a, fal b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dij.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
