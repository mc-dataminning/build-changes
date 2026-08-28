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

public class dhj extends dun implements def {
   public static final MapCodec<dhj> p = b(dhj::new);
   private static final Logger a = LogUtils.getLogger();
   private final jn.c<dhj> b = lu.e.f(this);
   public static final jt<duo> q = new jt<>();
   private static final LoadingCache<ezm, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ezm, Boolean>() {
      public Boolean a(ezm $$0) {
         return !ezj.c(ezj.b(), $$0, eyw.g);
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
   protected final dup<dhj, duo> F;
   private duo d;
   @Nullable
   private String e;
   @Nullable
   private cvk f;
   private static final int g = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dhj.b>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dhj.b> $$0 = new Object2ByteLinkedOpenHashMap<dhj.b>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dhj> a() {
      return p;
   }

   public static int j(@Nullable duo $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static duo a(int $$0) {
      duo $$1 = q.a($$0);
      return $$1 == null ? dhl.a.o() : $$1;
   }

   public static dhj a(@Nullable cvk $$0) {
      return $$0 instanceof ctr ? ((ctr)$$0).d() : dhl.a;
   }

   public static duo a(duo $$0, duo $$1, deh $$2, je $$3) {
      ezm $$4 = ezj.b($$0.g($$2, $$3), $$1.g($$2, $$3), eyw.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bto $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ezj.a(jj.a.b, $$6.cO().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ezm a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ezj.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static duo b(duo $$0, deh $$1, je $$2) {
      duo $$3 = $$0;
      je.a $$4 = new je.a();

      for (jj $$5 : aG) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(duo $$0, duo $$1, deh $$2, je $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(duo $$0, duo $$1, deh $$2, je $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.l()) {
            if (!$$2.w_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public dhj(dun.d $$0) {
      super($$0);
      dup.a<dhj, duo> $$1 = new dup.a<>(this);
      this.a($$1);
      this.F = $$1.a(dhj::o, duo::new);
      this.l(this.F.b());
      if (ab.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(duo $$0) {
      return $$0.b() instanceof dlt || $$0.a(dhl.hW) || $$0.a(dhl.ee) || $$0.a(dhl.ef) || $$0.a(dhl.fa) || $$0.a(dhl.eZ) || $$0.a(awt.aS);
   }

   public static boolean a(duo $$0, duo $$1, jj $$2) {
      ezm $$3 = $$1.a($$2.g());
      if ($$3 == ezj.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == ezj.a()) {
         return true;
      } else {
         ezm $$4 = $$0.a($$2);
         if ($$4 == ezj.a()) {
            return true;
         } else {
            dhj.b $$5 = new dhj.b($$4, $$3);
            Object2ByteLinkedOpenHashMap<dhj.b> $$6 = h.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = ezj.c($$4, $$3, eyw.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(ddl $$0, je $$1) {
      return $$0.a_($$1).a($$0, $$1, jj.b, dpl.c);
   }

   public static boolean a(dej $$0, je $$1, jj $$2) {
      duo $$3 = $$0.a_($$1);
      return $$2 == jj.a && $$3.a(awt.ba) ? false : $$3.a($$0, $$1, $$2, dpl.b);
   }

   public static boolean a(ezm $$0, jj $$1) {
      ezm $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ezm $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
   }

   public void a(deh $$0, je $$1, duo $$2) {
   }

   public static List<cvp> a(duo $$0, arh $$1, je $$2, @Nullable drs $$3) {
      etk.a $$4 = new etk.a($$1).a(ewd.f, eys.b($$2)).a(ewd.i, cvp.k).b(ewd.h, $$3);
      return $$0.a($$4);
   }

   public static List<cvp> a(duo $$0, arh $$1, je $$2, @Nullable drs $$3, @Nullable bto $$4, cvp $$5) {
      etk.a $$6 = new etk.a($$1).a(ewd.f, eys.b($$2)).a(ewd.i, $$5).b(ewd.a, $$4).b(ewd.h, $$3);
      return $$0.a($$6);
   }

   public static void c(duo $$0, deg $$1, je $$2) {
      if ($$1 instanceof arh) {
         a($$0, (arh)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arh)$$1, $$2, cvp.k, true);
      }
   }

   public static void a(duo $$0, deh $$1, je $$2, @Nullable drs $$3) {
      if ($$1 instanceof arh) {
         a($$0, (arh)$$1, $$2, $$3).forEach($$2x -> a((deg)((arh)$$1), $$2, $$2x));
         $$0.a((arh)$$1, $$2, cvp.k, true);
      }
   }

   public static void a(duo $$0, deg $$1, je $$2, @Nullable drs $$3, @Nullable bto $$4, cvp $$5) {
      if ($$1 instanceof arh) {
         a($$0, (arh)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arh)$$1, $$2, $$5, true);
      }
   }

   public static void a(deg $$0, je $$1, cvp $$2) {
      double $$3 = (double)btv.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azd.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azd.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azd.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cke($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(deg $$0, je $$1, jj $$2, cvp $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)btv.ag.l() / 2.0;
      double $$8 = (double)btv.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azd.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azd.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azd.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azd.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azd.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azd.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cke($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(deg $$0, Supplier<cke> $$1, cvp $$2) {
      if (!$$0.B && !$$2.f() && $$0.ac().b(dec.h)) {
         cke $$3 = $$1.get();
         $$3.q();
         $$0.b($$3);
      }
   }

   protected void a(arh $$0, je $$1, int $$2) {
      if ($$0.ac().b(dec.h)) {
         bua.a($$0, eys.b($$1), $$2);
      }
   }

   public float e() {
      return this.aI;
   }

   public void a(arh $$0, je $$1, ddy $$2) {
   }

   public void a(deg $$0, je $$1, duo $$2, bto $$3) {
   }

   @Nullable
   public duo a(czk $$0) {
      return this.o();
   }

   public void a(deg $$0, cnu $$1, je $$2, duo $$3, @Nullable drs $$4, cvp $$5) {
      $$1.b(awo.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(deg $$0, je $$1, duo $$2, @Nullable buk $$3, cvp $$4) {
   }

   public boolean a(duo $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xr f() {
      return xd.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ad.a("block", lu.e.b(this));
      }

      return this.e;
   }

   public void a(deg $$0, duo $$1, je $$2, bto $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dT().l());
   }

   public void a(ddl $$0, bto $$1) {
      $$1.h($$1.dv().d(1.0, 0.0, 1.0));
   }

   public cvp a(dej $$0, je $$1, duo $$2) {
      return new cvp(this);
   }

   public float h() {
      return this.aL;
   }

   public float j() {
      return this.aM;
   }

   public float k() {
      return this.aN;
   }

   protected void a(deg $$0, cnu $$1, je $$2, duo $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public duo a(deg $$0, je $$1, duo $$2, cnu $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awt.aX)) {
         cml.a($$3, false);
      }

      $$0.a(dzl.f, $$1, dzl.a.a($$3, $$2));
      return $$2;
   }

   public void a(duo $$0, deg $$1, je $$2, dfh.c $$3) {
   }

   public boolean a(ddy $$0) {
      return true;
   }

   protected void a(dup.a<dhj, duo> $$0) {
   }

   public dup<dhj, duo> n() {
      return this.F;
   }

   protected final void l(duo $$0) {
      this.d = $$0;
   }

   public final duo o() {
      return this.d;
   }

   public final duo m(duo $$0) {
      duo $$1 = this.o();

      for (dvr<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> duo a(duo $$0, duo $$1, dvr<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cvk q() {
      if (this.f == null) {
         this.f = cvk.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aO;
   }

   @Override
   public String toString() {
      return "Block{" + lu.e.e(this).g() + "}";
   }

   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
   }

   @Override
   protected dhj r() {
      return this;
   }

   protected ImmutableMap<duo, ezm> a(Function<duo, ezm> $$0) {
      return this.F.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jn.c<dhj> s() {
      return this.b;
   }

   protected void a(arh $$0, je $$1, cvp $$2, bqu $$3) {
      int $$4 = dbm.b($$0, $$2, $$3.a($$0.C_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   public static final class a {
      private final duo a;
      private final duo b;
      private final jj c;

      public a(duo $$0, duo $$1, jj $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dhj.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.a.hashCode();
         $$0 = 31 * $$0 + this.b.hashCode();
         return 31 * $$0 + this.c.hashCode();
      }
   }

   static record b(ezm a, ezm b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dhj.b $$1 && this.a == $$1.a && this.b == $$1.b) {
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
