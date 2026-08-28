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

public class dhm extends dur implements dei {
   public static final MapCodec<dhm> p = b(dhm::new);
   private static final Logger a = LogUtils.getLogger();
   private final jo.c<dhm> b = lv.e.f(this);
   public static final ju<dus> q = new ju<>();
   private static final LoadingCache<ezq, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ezq, Boolean>() {
      public Boolean a(ezq $$0) {
         return !ezn.c(ezn.b(), $$0, eza.g);
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
   protected final dut<dhm, dus> F;
   private dus d;
   @Nullable
   private cvn e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dhm.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dhm.a> $$0 = new Object2ByteLinkedOpenHashMap<dhm.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dhm> a() {
      return p;
   }

   public static int j(@Nullable dus $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dus a(int $$0) {
      dus $$1 = q.a($$0);
      return $$1 == null ? dho.a.n() : $$1;
   }

   public static dhm a(@Nullable cvn $$0) {
      return $$0 instanceof ctu ? ((ctu)$$0).d() : dho.a;
   }

   public static dus a(dus $$0, dus $$1, dek $$2, jf $$3) {
      ezq $$4 = ezn.b($$0.g($$2, $$3), $$1.g($$2, $$3), eza.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (btr $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ezn.a(jk.a.b, $$6.cO().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ezq a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ezn.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dus b(dus $$0, dek $$1, jf $$2) {
      dus $$3 = $$0;
      jf.a $$4 = new jf.a();

      for (jk $$5 : aG) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dus $$0, dus $$1, dek $$2, jf $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dus $$0, dus $$1, dek $$2, jf $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.l()) {
            if (!$$2.x_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public dhm(dur.d $$0) {
      super($$0);
      dut.a<dhm, dus> $$1 = new dut.a<>(this);
      this.a($$1);
      this.F = $$1.a(dhm::n, dus::new);
      this.l(this.F.b());
      if (ab.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dus $$0) {
      return $$0.b() instanceof dlw || $$0.a(dho.hW) || $$0.a(dho.ee) || $$0.a(dho.ef) || $$0.a(dho.fa) || $$0.a(dho.eZ) || $$0.a(awv.aS);
   }

   public static boolean a(dus $$0, dus $$1, jk $$2) {
      ezq $$3 = $$1.a($$2.g());
      if ($$3 == ezn.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == ezn.a()) {
         return true;
      } else {
         ezq $$4 = $$0.a($$2);
         if ($$4 == ezn.a()) {
            return true;
         } else {
            dhm.a $$5 = new dhm.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dhm.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = ezn.c($$4, $$3, eza.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(ddo $$0, jf $$1) {
      return $$0.a_($$1).a($$0, $$1, jk.b, dpo.c);
   }

   public static boolean a(dem $$0, jf $$1, jk $$2) {
      dus $$3 = $$0.a_($$1);
      return $$2 == jk.a && $$3.a(awv.ba) ? false : $$3.a($$0, $$1, $$2, dpo.b);
   }

   public static boolean a(ezq $$0, jk $$1) {
      ezq $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ezq $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
   }

   public void a(dek $$0, jf $$1, dus $$2) {
   }

   public static List<cvs> a(dus $$0, arj $$1, jf $$2, @Nullable drv $$3) {
      eto.a $$4 = new eto.a($$1).a(ewh.f, eyw.b($$2)).a(ewh.i, cvs.k).b(ewh.h, $$3);
      return $$0.a($$4);
   }

   public static List<cvs> a(dus $$0, arj $$1, jf $$2, @Nullable drv $$3, @Nullable btr $$4, cvs $$5) {
      eto.a $$6 = new eto.a($$1).a(ewh.f, eyw.b($$2)).a(ewh.i, $$5).b(ewh.a, $$4).b(ewh.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dus $$0, dej $$1, jf $$2) {
      if ($$1 instanceof arj) {
         a($$0, (arj)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arj)$$1, $$2, cvs.k, true);
      }
   }

   public static void a(dus $$0, dek $$1, jf $$2, @Nullable drv $$3) {
      if ($$1 instanceof arj) {
         a($$0, (arj)$$1, $$2, $$3).forEach($$2x -> a((dej)((arj)$$1), $$2, $$2x));
         $$0.a((arj)$$1, $$2, cvs.k, true);
      }
   }

   public static void a(dus $$0, dej $$1, jf $$2, @Nullable drv $$3, @Nullable btr $$4, cvs $$5) {
      if ($$1 instanceof arj) {
         a($$0, (arj)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arj)$$1, $$2, $$5, true);
      }
   }

   public static void a(dej $$0, jf $$1, cvs $$2) {
      double $$3 = (double)bty.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azf.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azf.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azf.a($$0.z, -0.25, 0.25);
      a($$0, () -> new ckh($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dej $$0, jf $$1, jk $$2, cvs $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bty.ag.l() / 2.0;
      double $$8 = (double)bty.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azf.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azf.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azf.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azf.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azf.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azf.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new ckh($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dej $$0, Supplier<ckh> $$1, cvs $$2) {
      if (!$$0.B && !$$2.f() && $$0.ac().b(def.h)) {
         ckh $$3 = $$1.get();
         $$3.q();
         $$0.b($$3);
      }
   }

   protected void a(arj $$0, jf $$1, int $$2) {
      if ($$0.ac().b(def.h)) {
         bud.a($$0, eyw.b($$1), $$2);
      }
   }

   public float e() {
      return this.aI;
   }

   public void a(arj $$0, jf $$1, deb $$2) {
   }

   public void a(dej $$0, jf $$1, dus $$2, btr $$3) {
   }

   @Nullable
   public dus a(czn $$0) {
      return this.n();
   }

   public void a(dej $$0, cnx $$1, jf $$2, dus $$3, @Nullable drv $$4, cvs $$5) {
      $$1.b(awq.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dej $$0, jf $$1, dus $$2, @Nullable bun $$3, cvs $$4) {
   }

   public boolean a(dus $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xs f() {
      return xe.c(this.v());
   }

   public void a(dej $$0, dus $$1, jf $$2, btr $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dT().l());
   }

   public void a(ddo $$0, btr $$1) {
      $$1.h($$1.dv().d(1.0, 0.0, 1.0));
   }

   public cvs a(dem $$0, jf $$1, dus $$2) {
      return new cvs(this);
   }

   public float g() {
      return this.aL;
   }

   public float h() {
      return this.aM;
   }

   public float j() {
      return this.aN;
   }

   protected void a(dej $$0, cnx $$1, jf $$2, dus $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dus a(dej $$0, jf $$1, dus $$2, cnx $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awv.aX)) {
         cmo.a($$3, false);
      }

      $$0.a(dzp.f, $$1, dzp.a.a($$3, $$2));
      return $$2;
   }

   public void a(dus $$0, dej $$1, jf $$2, dfk.c $$3) {
   }

   public boolean a(deb $$0) {
      return true;
   }

   protected void a(dut.a<dhm, dus> $$0) {
   }

   public dut<dhm, dus> k() {
      return this.F;
   }

   protected final void l(dus $$0) {
      this.d = $$0;
   }

   public final dus n() {
      return this.d;
   }

   public final dus m(dus $$0) {
      dus $$1 = this.n();

      for (dvv<?> $$2 : $$0.b().k().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dus a(dus $$0, dus $$1, dvv<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cvn q() {
      if (this.e == null) {
         this.e = cvn.a(this);
      }

      return this.e;
   }

   public boolean o() {
      return this.aO;
   }

   @Override
   public String toString() {
      return "Block{" + lv.e.e(this).g() + "}";
   }

   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
   }

   @Override
   protected dhm p() {
      return this;
   }

   protected ImmutableMap<dus, ezq> a(Function<dus, ezq> $$0) {
      return this.F.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jo.c<dhm> r() {
      return this.b;
   }

   protected void a(arj $$0, jf $$1, cvs $$2, bqx $$3) {
      int $$4 = dbp.b($$0, $$2, $$3.a($$0.D_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(ezq a, ezq b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dhm.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
