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

public class djk extends dwu implements dgf {
   public static final MapCodec<djk> p = b(djk::new);
   private static final Logger a = LogUtils.getLogger();
   private final jr.c<djk> b = mb.e.f(this);
   public static final jx<dwv> q = new jx<>();
   private static final LoadingCache<fbs, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fbs, Boolean>() {
      public Boolean a(fbs $$0) {
         return !fbp.c(fbp.b(), $$0, fbc.g);
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
   protected final dww<djk, dwv> F;
   private dwv d;
   @Nullable
   private cwj e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<djk.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<djk.a> $$0 = new Object2ByteLinkedOpenHashMap<djk.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends djk> a() {
      return p;
   }

   public static int j(@Nullable dwv $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dwv a(int $$0) {
      dwv $$1 = q.a($$0);
      return $$1 == null ? djm.a.m() : $$1;
   }

   public static djk a(@Nullable cwj $$0) {
      return $$0 instanceof cut ? ((cut)$$0).d() : djm.a;
   }

   public static dwv a(dwv $$0, dwv $$1, dgh $$2, ji $$3) {
      fbs $$4 = fbp.b($$0.g($$2, $$3), $$1.g($$2, $$3), fbc.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (buj $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fbp.a(jn.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fbs a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fbp.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dwv b(dwv $$0, dgh $$1, ji $$2) {
      dwv $$3 = $$0;
      ji.a $$4 = new ji.a();

      for (jn $$5 : aG) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.H_());
      }

      return $$3;
   }

   public static void a(dwv $$0, dwv $$1, dgh $$2, ji $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dwv $$0, dwv $$1, dgh $$2, ji $$3, int $$4, int $$5) {
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

   public djk(dwu.d $$0) {
      super($$0);
      dww.a<djk, dwv> $$1 = new dww.a<>(this);
      this.a($$1);
      this.F = $$1.a(djk::m, dwv::new);
      this.l(this.F.b());
      if (ab.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dwv $$0) {
      return $$0.b() instanceof dnw || $$0.a(djm.iu) || $$0.a(djm.er) || $$0.a(djm.es) || $$0.a(djm.fo) || $$0.a(djm.fn) || $$0.a(awo.am);
   }

   public static boolean a(dwv $$0, dwv $$1, jn $$2) {
      fbs $$3 = $$1.a($$2.g());
      if ($$3 == fbp.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fbp.a()) {
         return true;
      } else {
         fbs $$4 = $$0.a($$2);
         if ($$4 == fbp.a()) {
            return true;
         } else {
            djk.a $$5 = new djk.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<djk.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fbp.c($$4, $$3, fbc.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dfl $$0, ji $$1) {
      return $$0.a_($$1).a($$0, $$1, jn.b, drq.c);
   }

   public static boolean a(dgj $$0, ji $$1, jn $$2) {
      dwv $$3 = $$0.a_($$1);
      return $$2 == jn.a && $$3.a(awo.bb) ? false : $$3.a($$0, $$1, $$2, drq.b);
   }

   public static boolean a(fbs $$0, jn $$1) {
      fbs $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fbs $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
   }

   public void a(dgh $$0, ji $$1, dwv $$2) {
   }

   public static List<cwn> a(dwv $$0, arc $$1, ji $$2, @Nullable dtx $$3) {
      evs.a $$4 = new evs.a($$1).a(eyj.f, fay.b($$2)).a(eyj.i, cwn.j).b(eyj.h, $$3);
      return $$0.a($$4);
   }

   public static List<cwn> a(dwv $$0, arc $$1, ji $$2, @Nullable dtx $$3, @Nullable buj $$4, cwn $$5) {
      evs.a $$6 = new evs.a($$1).a(eyj.f, fay.b($$2)).a(eyj.i, $$5).b(eyj.a, $$4).b(eyj.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dwv $$0, dgg $$1, ji $$2) {
      if ($$1 instanceof arc) {
         a($$0, (arc)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arc)$$1, $$2, cwn.j, true);
      }
   }

   public static void a(dwv $$0, dgh $$1, ji $$2, @Nullable dtx $$3) {
      if ($$1 instanceof arc) {
         a($$0, (arc)$$1, $$2, $$3).forEach($$2x -> a((dgg)((arc)$$1), $$2, $$2x));
         $$0.a((arc)$$1, $$2, cwn.j, true);
      }
   }

   public static void a(dwv $$0, dgg $$1, ji $$2, @Nullable dtx $$3, @Nullable buj $$4, cwn $$5) {
      if ($$1 instanceof arc) {
         a($$0, (arc)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arc)$$1, $$2, $$5, true);
      }
   }

   public static void a(dgg $$0, ji $$1, cwn $$2) {
      double $$3 = (double)buq.aq.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayy.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayy.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayy.a($$0.A, -0.25, 0.25);
      a($$0, () -> new cla($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dgg $$0, ji $$1, jn $$2, cwn $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)buq.aq.l() / 2.0;
      double $$8 = (double)buq.aq.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayy.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayy.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayy.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayy.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayy.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayy.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cla($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dgg $$0, Supplier<cla> $$1, cwn $$2) {
      if ($$0 instanceof arc $$3 && !$$2.f() && $$3.O().b(dgc.h)) {
         cla $$5 = $$1.get();
         $$5.s();
         $$0.b($$5);
         return;
      }
   }

   protected void a(arc $$0, ji $$1, int $$2) {
      if ($$0.O().b(dgc.h)) {
         buv.a($$0, fay.b($$1), $$2);
      }
   }

   public float e() {
      return this.aI;
   }

   public void a(arc $$0, ji $$1, dfy $$2) {
   }

   public void a(dgg $$0, ji $$1, dwv $$2, buj $$3) {
   }

   @Nullable
   public dwv a(dae $$0) {
      return this.m();
   }

   public void a(dgg $$0, cov $$1, ji $$2, dwv $$3, @Nullable dtx $$4, cwn $$5) {
      $$1.b(awj.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dgg $$0, ji $$1, dwv $$2, @Nullable bvf $$3, cwn $$4) {
   }

   public boolean a(dwv $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xc f() {
      return wo.c(this.v());
   }

   public void a(dgg $$0, dwv $$1, ji $$2, buj $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dX().l());
   }

   public void a(dfl $$0, buj $$1) {
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

   protected void a(dgg $$0, cov $$1, ji $$2, dwv $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dwv a(dgg $$0, ji $$1, dwv $$2, cov $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awo.aY) && $$0 instanceof arc $$4) {
         cnk.a($$4, $$3, false);
      }

      $$0.a(ebr.f, $$1, ebr.a.a($$3, $$2));
      return $$2;
   }

   public void a(dwv $$0, dgg $$1, ji $$2, dhi.c $$3) {
   }

   public boolean a(dfy $$0) {
      return true;
   }

   protected void a(dww.a<djk, dwv> $$0) {
   }

   public dww<djk, dwv> l() {
      return this.F;
   }

   protected final void l(dwv $$0) {
      this.d = $$0;
   }

   public final dwv m() {
      return this.d;
   }

   public final dwv m(dwv $$0) {
      dwv $$1 = this.m();

      for (dxx<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dwv a(dwv $$0, dwv $$1, dxx<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cwj j() {
      if (this.e == null) {
         this.e = cwj.a(this);
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

   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
   }

   @Override
   protected djk o() {
      return this;
   }

   protected ImmutableMap<dwv, fbs> a(Function<dwv, fbs> $$0) {
      return this.F.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jr.c<djk> p() {
      return this.b;
   }

   protected void a(arc $$0, ji $$1, cwn $$2, brn $$3) {
      int $$4 = dcz.b($$0, $$2, $$3.a($$0.H_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fbs a, fbs b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof djk.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
