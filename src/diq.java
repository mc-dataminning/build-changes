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

public class diq extends dvu implements dfl {
   public static final MapCodec<diq> p = b(diq::new);
   private static final Logger a = LogUtils.getLogger();
   private final jq.c<diq> b = lz.e.f(this);
   public static final jw<dvv> q = new jw<>();
   private static final LoadingCache<fas, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fas, Boolean>() {
      public Boolean a(fas $$0) {
         return !fap.c(fap.b(), $$0, fac.g);
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
   protected final dvw<diq, dvv> F;
   private dvv d;
   @Nullable
   private cwi e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<diq.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<diq.a> $$0 = new Object2ByteLinkedOpenHashMap<diq.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends diq> a() {
      return p;
   }

   public static int j(@Nullable dvv $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dvv a(int $$0) {
      dvv $$1 = q.a($$0);
      return $$1 == null ? dis.a.m() : $$1;
   }

   public static diq a(@Nullable cwi $$0) {
      return $$0 instanceof cus ? ((cus)$$0).d() : dis.a;
   }

   public static dvv a(dvv $$0, dvv $$1, dfn $$2, jh $$3) {
      fas $$4 = fap.b($$0.g($$2, $$3), $$1.g($$2, $$3), fac.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bul $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fap.a(jm.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fas a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fap.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dvv b(dvv $$0, dfn $$1, jh $$2) {
      dvv $$3 = $$0;
      jh.a $$4 = new jh.a();

      for (jm $$5 : aG) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.G_());
      }

      return $$3;
   }

   public static void a(dvv $$0, dvv $$1, dfn $$2, jh $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dvv $$0, dvv $$1, dfn $$2, jh $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.l()) {
            if (!$$2.A_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public diq(dvu.d $$0) {
      super($$0);
      dvw.a<diq, dvv> $$1 = new dvw.a<>(this);
      this.a($$1);
      this.F = $$1.a(diq::m, dvv::new);
      this.l(this.F.b());
      if (ab.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dvv $$0) {
      return $$0.b() instanceof dmz || $$0.a(dis.hW) || $$0.a(dis.ee) || $$0.a(dis.ef) || $$0.a(dis.fa) || $$0.a(dis.eZ) || $$0.a(axc.al);
   }

   public static boolean a(dvv $$0, dvv $$1, jm $$2) {
      fas $$3 = $$1.a($$2.g());
      if ($$3 == fap.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fap.a()) {
         return true;
      } else {
         fas $$4 = $$0.a($$2);
         if ($$4 == fap.a()) {
            return true;
         } else {
            diq.a $$5 = new diq.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<diq.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fap.c($$4, $$3, fac.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(der $$0, jh $$1) {
      return $$0.a_($$1).a($$0, $$1, jm.b, dqr.c);
   }

   public static boolean a(dfp $$0, jh $$1, jm $$2) {
      dvv $$3 = $$0.a_($$1);
      return $$2 == jm.a && $$3.a(axc.ba) ? false : $$3.a($$0, $$1, $$2, dqr.b);
   }

   public static boolean a(fas $$0, jm $$1) {
      fas $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fas $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
   }

   public void a(dfn $$0, jh $$1, dvv $$2) {
   }

   public static List<cwm> a(dvv $$0, arp $$1, jh $$2, @Nullable dsy $$3) {
      euq.a $$4 = new euq.a($$1).a(exj.f, ezy.b($$2)).a(exj.i, cwm.k).b(exj.h, $$3);
      return $$0.a($$4);
   }

   public static List<cwm> a(dvv $$0, arp $$1, jh $$2, @Nullable dsy $$3, @Nullable bul $$4, cwm $$5) {
      euq.a $$6 = new euq.a($$1).a(exj.f, ezy.b($$2)).a(exj.i, $$5).b(exj.a, $$4).b(exj.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dvv $$0, dfm $$1, jh $$2) {
      if ($$1 instanceof arp) {
         a($$0, (arp)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arp)$$1, $$2, cwm.k, true);
      }
   }

   public static void a(dvv $$0, dfn $$1, jh $$2, @Nullable dsy $$3) {
      if ($$1 instanceof arp) {
         a($$0, (arp)$$1, $$2, $$3).forEach($$2x -> a((dfm)((arp)$$1), $$2, $$2x));
         $$0.a((arp)$$1, $$2, cwm.k, true);
      }
   }

   public static void a(dvv $$0, dfm $$1, jh $$2, @Nullable dsy $$3, @Nullable bul $$4, cwm $$5) {
      if ($$1 instanceof arp) {
         a($$0, (arp)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arp)$$1, $$2, $$5, true);
      }
   }

   public static void a(dfm $$0, jh $$1, cwm $$2) {
      double $$3 = (double)bus.ap.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azm.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azm.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azm.a($$0.A, -0.25, 0.25);
      a($$0, () -> new clc($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dfm $$0, jh $$1, jm $$2, cwm $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bus.ap.l() / 2.0;
      double $$8 = (double)bus.ap.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azm.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azm.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azm.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azm.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azm.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azm.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new clc($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dfm $$0, Supplier<clc> $$1, cwm $$2) {
      if ($$0 instanceof arp $$3 && !$$2.f() && $$3.N().b(dfi.h)) {
         clc $$5 = $$1.get();
         $$5.n();
         $$0.b($$5);
         return;
      }
   }

   protected void a(arp $$0, jh $$1, int $$2) {
      if ($$0.N().b(dfi.h)) {
         bux.a($$0, ezy.b($$1), $$2);
      }
   }

   public float e() {
      return this.aI;
   }

   public void a(arp $$0, jh $$1, dfe $$2) {
   }

   public void a(dfm $$0, jh $$1, dvv $$2, bul $$3) {
   }

   @Nullable
   public dvv a(dad $$0) {
      return this.m();
   }

   public void a(dfm $$0, cou $$1, jh $$2, dvv $$3, @Nullable dsy $$4, cwm $$5) {
      $$1.b(awx.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dfm $$0, jh $$1, dvv $$2, @Nullable bvh $$3, cwm $$4) {
   }

   public boolean a(dvv $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xx f() {
      return xj.c(this.v());
   }

   public void a(dfm $$0, dvv $$1, jh $$2, bul $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dW().l());
   }

   public void a(der $$0, bul $$1) {
      $$1.h($$1.dy().d(1.0, 0.0, 1.0));
   }

   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return new cwm(this);
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

   protected void a(dfm $$0, cou $$1, jh $$2, dvv $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dvv a(dfm $$0, jh $$1, dvv $$2, cou $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axc.aX) && $$0 instanceof arp $$4) {
         cnj.a($$4, $$3, false);
      }

      $$0.a(ear.f, $$1, ear.a.a($$3, $$2));
      return $$2;
   }

   public void a(dvv $$0, dfm $$1, jh $$2, dgo.c $$3) {
   }

   public boolean a(dfe $$0) {
      return true;
   }

   protected void a(dvw.a<diq, dvv> $$0) {
   }

   public dvw<diq, dvv> l() {
      return this.F;
   }

   protected final void l(dvv $$0) {
      this.d = $$0;
   }

   public final dvv m() {
      return this.d;
   }

   public final dvv m(dvv $$0) {
      dvv $$1 = this.m();

      for (dwx<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dvv a(dvv $$0, dvv $$1, dwx<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cwi j() {
      if (this.e == null) {
         this.e = cwi.a(this);
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

   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
   }

   @Override
   protected diq o() {
      return this;
   }

   protected ImmutableMap<dvv, fas> a(Function<dvv, fas> $$0) {
      return this.F.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jq.c<diq> p() {
      return this.b;
   }

   protected void a(arp $$0, jh $$1, cwm $$2, brp $$3) {
      int $$4 = dcf.b($$0, $$2, $$3.a($$0.G_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fas a, fas b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof diq.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
