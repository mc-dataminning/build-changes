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

public class dhy extends dvc implements deu {
   public static final MapCodec<dhy> p = b(dhy::new);
   private static final Logger a = LogUtils.getLogger();
   private final jp.c<dhy> b = lx.e.f(this);
   public static final jv<dvd> q = new jv<>();
   private static final LoadingCache<fab, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fab, Boolean>() {
      public Boolean a(fab $$0) {
         return !ezy.c(ezy.b(), $$0, ezl.g);
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
   protected final dve<dhy, dvd> F;
   private dvd d;
   @Nullable
   private cvt e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dhy.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dhy.a> $$0 = new Object2ByteLinkedOpenHashMap<dhy.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dhy> a() {
      return p;
   }

   public static int j(@Nullable dvd $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dvd a(int $$0) {
      dvd $$1 = q.a($$0);
      return $$1 == null ? dia.a.m() : $$1;
   }

   public static dhy a(@Nullable cvt $$0) {
      return $$0 instanceof cuc ? ((cuc)$$0).d() : dia.a;
   }

   public static dvd a(dvd $$0, dvd $$1, dew $$2, jg $$3) {
      fab $$4 = ezy.b($$0.g($$2, $$3), $$1.g($$2, $$3), ezl.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (btz $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ezy.a(jl.a.b, $$6.cS().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fab a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ezy.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dvd b(dvd $$0, dew $$1, jg $$2) {
      dvd $$3 = $$0;
      jg.a $$4 = new jg.a();

      for (jl $$5 : aG) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dvd $$0, dvd $$1, dew $$2, jg $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dvd $$0, dvd $$1, dew $$2, jg $$3, int $$4, int $$5) {
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

   public dhy(dvc.d $$0) {
      super($$0);
      dve.a<dhy, dvd> $$1 = new dve.a<>(this);
      this.a($$1);
      this.F = $$1.a(dhy::m, dvd::new);
      this.l(this.F.b());
      if (ab.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dvd $$0) {
      return $$0.b() instanceof dmh || $$0.a(dia.hW) || $$0.a(dia.ee) || $$0.a(dia.ef) || $$0.a(dia.fa) || $$0.a(dia.eZ) || $$0.a(awz.aS);
   }

   public static boolean a(dvd $$0, dvd $$1, jl $$2) {
      fab $$3 = $$1.a($$2.g());
      if ($$3 == ezy.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == ezy.a()) {
         return true;
      } else {
         fab $$4 = $$0.a($$2);
         if ($$4 == ezy.a()) {
            return true;
         } else {
            dhy.a $$5 = new dhy.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dhy.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = ezy.c($$4, $$3, ezl.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dea $$0, jg $$1) {
      return $$0.a_($$1).a($$0, $$1, jl.b, dpz.c);
   }

   public static boolean a(dey $$0, jg $$1, jl $$2) {
      dvd $$3 = $$0.a_($$1);
      return $$2 == jl.a && $$3.a(awz.ba) ? false : $$3.a($$0, $$1, $$2, dpz.b);
   }

   public static boolean a(fab $$0, jl $$1) {
      fab $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fab $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
   }

   public void a(dew $$0, jg $$1, dvd $$2) {
   }

   public static List<cvx> a(dvd $$0, arm $$1, jg $$2, @Nullable dsg $$3) {
      etz.a $$4 = new etz.a($$1).a(ews.f, ezh.b($$2)).a(ews.i, cvx.k).b(ews.h, $$3);
      return $$0.a($$4);
   }

   public static List<cvx> a(dvd $$0, arm $$1, jg $$2, @Nullable dsg $$3, @Nullable btz $$4, cvx $$5) {
      etz.a $$6 = new etz.a($$1).a(ews.f, ezh.b($$2)).a(ews.i, $$5).b(ews.a, $$4).b(ews.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dvd $$0, dev $$1, jg $$2) {
      if ($$1 instanceof arm) {
         a($$0, (arm)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arm)$$1, $$2, cvx.k, true);
      }
   }

   public static void a(dvd $$0, dew $$1, jg $$2, @Nullable dsg $$3) {
      if ($$1 instanceof arm) {
         a($$0, (arm)$$1, $$2, $$3).forEach($$2x -> a((dev)((arm)$$1), $$2, $$2x));
         $$0.a((arm)$$1, $$2, cvx.k, true);
      }
   }

   public static void a(dvd $$0, dev $$1, jg $$2, @Nullable dsg $$3, @Nullable btz $$4, cvx $$5) {
      if ($$1 instanceof arm) {
         a($$0, (arm)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arm)$$1, $$2, $$5, true);
      }
   }

   public static void a(dev $$0, jg $$1, cvx $$2) {
      double $$3 = (double)bug.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azj.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azj.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azj.a($$0.A, -0.25, 0.25);
      a($$0, () -> new ckq($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dev $$0, jg $$1, jl $$2, cvx $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bug.ag.l() / 2.0;
      double $$8 = (double)bug.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azj.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azj.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azj.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azj.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azj.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azj.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new ckq($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dev $$0, Supplier<ckq> $$1, cvx $$2) {
      if (!$$0.C && !$$2.f() && $$0.ac().b(der.h)) {
         ckq $$3 = $$1.get();
         $$3.q();
         $$0.b($$3);
      }
   }

   protected void a(arm $$0, jg $$1, int $$2) {
      if ($$0.ac().b(der.h)) {
         bul.a($$0, ezh.b($$1), $$2);
      }
   }

   public float e() {
      return this.aI;
   }

   public void a(arm $$0, jg $$1, den $$2) {
   }

   public void a(dev $$0, jg $$1, dvd $$2, btz $$3) {
   }

   @Nullable
   public dvd a(czm $$0) {
      return this.m();
   }

   public void a(dev $$0, coh $$1, jg $$2, dvd $$3, @Nullable dsg $$4, cvx $$5) {
      $$1.b(awu.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dev $$0, jg $$1, dvd $$2, @Nullable buv $$3, cvx $$4) {
   }

   public boolean a(dvd $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xv f() {
      return xh.c(this.v());
   }

   public void a(dev $$0, dvd $$1, jg $$2, btz $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dY().l());
   }

   public void a(dea $$0, btz $$1) {
      $$1.h($$1.dA().d(1.0, 0.0, 1.0));
   }

   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return new cvx(this);
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

   protected void a(dev $$0, coh $$1, jg $$2, dvd $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dvd a(dev $$0, jg $$1, dvd $$2, coh $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awz.aX)) {
         cmx.a($$3, false);
      }

      $$0.a(eaa.f, $$1, eaa.a.a($$3, $$2));
      return $$2;
   }

   public void a(dvd $$0, dev $$1, jg $$2, dfw.c $$3) {
   }

   public boolean a(den $$0) {
      return true;
   }

   protected void a(dve.a<dhy, dvd> $$0) {
   }

   public dve<dhy, dvd> l() {
      return this.F;
   }

   protected final void l(dvd $$0) {
      this.d = $$0;
   }

   public final dvd m() {
      return this.d;
   }

   public final dvd m(dvd $$0) {
      dvd $$1 = this.m();

      for (dwg<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dvd a(dvd $$0, dvd $$1, dwg<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cvt j() {
      if (this.e == null) {
         this.e = cvt.a(this);
      }

      return this.e;
   }

   public boolean n() {
      return this.aO;
   }

   @Override
   public String toString() {
      return "Block{" + lx.e.e(this).g() + "}";
   }

   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
   }

   @Override
   protected dhy o() {
      return this;
   }

   protected ImmutableMap<dvd, fab> a(Function<dvd, fab> $$0) {
      return this.F.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jp.c<dhy> p() {
      return this.b;
   }

   protected void a(arm $$0, jg $$1, cvx $$2, brd $$3) {
      int $$4 = dbo.b($$0, $$2, $$3.a($$0.E_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fab a, fab b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dhy.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
