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

public class djn extends dwx implements dgi {
   public static final MapCodec<djn> p = b(djn::new);
   private static final Logger a = LogUtils.getLogger();
   private final jr.c<djn> b = mb.e.f(this);
   public static final jx<dwy> q = new jx<>();
   private static final LoadingCache<fbv, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fbv, Boolean>() {
      public Boolean a(fbv $$0) {
         return !fbs.c(fbs.b(), $$0, fbf.g);
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
   protected final dwz<djn, dwy> F;
   private dwy d;
   @Nullable
   private cwm e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<djn.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<djn.a> $$0 = new Object2ByteLinkedOpenHashMap<djn.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends djn> a() {
      return p;
   }

   public static int j(@Nullable dwy $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dwy a(int $$0) {
      dwy $$1 = q.a($$0);
      return $$1 == null ? djp.a.m() : $$1;
   }

   public static djn a(@Nullable cwm $$0) {
      return $$0 instanceof cuw ? ((cuw)$$0).d() : djp.a;
   }

   public static dwy a(dwy $$0, dwy $$1, dgk $$2, ji $$3) {
      fbv $$4 = fbs.b($$0.g($$2, $$3), $$1.g($$2, $$3), fbf.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bum $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fbs.a(jn.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fbv a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fbs.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dwy b(dwy $$0, dgk $$1, ji $$2) {
      dwy $$3 = $$0;
      ji.a $$4 = new ji.a();

      for (jn $$5 : aG) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.H_());
      }

      return $$3;
   }

   public static void a(dwy $$0, dwy $$1, dgk $$2, ji $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dwy $$0, dwy $$1, dgk $$2, ji $$3, int $$4, int $$5) {
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

   public djn(dwx.d $$0) {
      super($$0);
      dwz.a<djn, dwy> $$1 = new dwz.a<>(this);
      this.a($$1);
      this.F = $$1.a(djn::m, dwy::new);
      this.l(this.F.b());
      if (ab.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dwy $$0) {
      return $$0.b() instanceof dnz || $$0.a(djp.iu) || $$0.a(djp.er) || $$0.a(djp.es) || $$0.a(djp.fo) || $$0.a(djp.fn) || $$0.a(awp.am);
   }

   public static boolean a(dwy $$0, dwy $$1, jn $$2) {
      fbv $$3 = $$1.a($$2.g());
      if ($$3 == fbs.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fbs.a()) {
         return true;
      } else {
         fbv $$4 = $$0.a($$2);
         if ($$4 == fbs.a()) {
            return true;
         } else {
            djn.a $$5 = new djn.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<djn.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fbs.c($$4, $$3, fbf.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dfo $$0, ji $$1) {
      return $$0.a_($$1).a($$0, $$1, jn.b, drt.c);
   }

   public static boolean a(dgm $$0, ji $$1, jn $$2) {
      dwy $$3 = $$0.a_($$1);
      return $$2 == jn.a && $$3.a(awp.bb) ? false : $$3.a($$0, $$1, $$2, drt.b);
   }

   public static boolean a(fbv $$0, jn $$1) {
      fbv $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fbv $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
   }

   public void a(dgk $$0, ji $$1, dwy $$2) {
   }

   public static List<cwq> a(dwy $$0, ard $$1, ji $$2, @Nullable dua $$3) {
      evv.a $$4 = new evv.a($$1).a(eym.f, fbb.b($$2)).a(eym.i, cwq.j).b(eym.h, $$3);
      return $$0.a($$4);
   }

   public static List<cwq> a(dwy $$0, ard $$1, ji $$2, @Nullable dua $$3, @Nullable bum $$4, cwq $$5) {
      evv.a $$6 = new evv.a($$1).a(eym.f, fbb.b($$2)).a(eym.i, $$5).b(eym.a, $$4).b(eym.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dwy $$0, dgj $$1, ji $$2) {
      if ($$1 instanceof ard) {
         a($$0, (ard)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ard)$$1, $$2, cwq.j, true);
      }
   }

   public static void a(dwy $$0, dgk $$1, ji $$2, @Nullable dua $$3) {
      if ($$1 instanceof ard) {
         a($$0, (ard)$$1, $$2, $$3).forEach($$2x -> a((dgj)((ard)$$1), $$2, $$2x));
         $$0.a((ard)$$1, $$2, cwq.j, true);
      }
   }

   public static void a(dwy $$0, dgj $$1, ji $$2, @Nullable dua $$3, @Nullable bum $$4, cwq $$5) {
      if ($$1 instanceof ard) {
         a($$0, (ard)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ard)$$1, $$2, $$5, true);
      }
   }

   public static void a(dgj $$0, ji $$1, cwq $$2) {
      double $$3 = (double)but.aq.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayz.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayz.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayz.a($$0.A, -0.25, 0.25);
      a($$0, () -> new cld($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dgj $$0, ji $$1, jn $$2, cwq $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)but.aq.l() / 2.0;
      double $$8 = (double)but.aq.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayz.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayz.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayz.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayz.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayz.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayz.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cld($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dgj $$0, Supplier<cld> $$1, cwq $$2) {
      if ($$0 instanceof ard $$3 && !$$2.f() && $$3.O().b(dgf.h)) {
         cld $$5 = $$1.get();
         $$5.s();
         $$0.b($$5);
         return;
      }
   }

   protected void a(ard $$0, ji $$1, int $$2) {
      if ($$0.O().b(dgf.h)) {
         buy.a($$0, fbb.b($$1), $$2);
      }
   }

   public float e() {
      return this.aI;
   }

   public void a(ard $$0, ji $$1, dgb $$2) {
   }

   public void a(dgj $$0, ji $$1, dwy $$2, bum $$3) {
   }

   @Nullable
   public dwy a(dah $$0) {
      return this.m();
   }

   public void a(dgj $$0, coy $$1, ji $$2, dwy $$3, @Nullable dua $$4, cwq $$5) {
      $$1.b(awk.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dgj $$0, ji $$1, dwy $$2, @Nullable bvi $$3, cwq $$4) {
   }

   public boolean a(dwy $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xd f() {
      return wp.c(this.v());
   }

   public void a(dgj $$0, dwy $$1, ji $$2, bum $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dW().l());
   }

   public void a(dfo $$0, bum $$1) {
      $$1.i($$1.dy().d(1.0, 0.0, 1.0));
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

   protected void a(dgj $$0, coy $$1, ji $$2, dwy $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dwy a(dgj $$0, ji $$1, dwy $$2, coy $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awp.aY) && $$0 instanceof ard $$4) {
         cnn.a($$4, $$3, false);
      }

      $$0.a(ebu.f, $$1, ebu.a.a($$3, $$2));
      return $$2;
   }

   public void a(dwy $$0, dgj $$1, ji $$2, dhl.c $$3) {
   }

   public boolean a(dgb $$0) {
      return true;
   }

   protected void a(dwz.a<djn, dwy> $$0) {
   }

   public dwz<djn, dwy> l() {
      return this.F;
   }

   protected final void l(dwy $$0) {
      this.d = $$0;
   }

   public final dwy m() {
      return this.d;
   }

   public final dwy m(dwy $$0) {
      dwy $$1 = this.m();

      for (dya<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dwy a(dwy $$0, dwy $$1, dya<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cwm j() {
      if (this.e == null) {
         this.e = cwm.a(this);
      }

      return this.e;
   }

   public boolean n() {
      return this.aO;
   }

   @Override
   public String toString() {
      return "Block{" + mb.e.e(this).g() + "}";
   }

   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
   }

   @Override
   protected djn o() {
      return this;
   }

   protected ImmutableMap<dwy, fbv> a(Function<dwy, fbv> $$0) {
      return this.F.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jr.c<djn> p() {
      return this.b;
   }

   protected void a(ard $$0, ji $$1, cwq $$2, brq $$3) {
      int $$4 = ddc.b($$0, $$2, $$3.a($$0.H_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fbv a, fbv b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof djn.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
