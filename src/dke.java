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

public class dke extends dxm implements dgz {
   public static final MapCodec<dke> p = b(dke::new);
   private static final Logger a = LogUtils.getLogger();
   private final jq.c<dke> b = ma.e.f(this);
   public static final jw<dxn> q = new jw<>();
   private static final LoadingCache<fcm, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fcm, Boolean>() {
      public Boolean a(fcm $$0) {
         return !fcj.c(fcj.b(), $$0, fbw.g);
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
   protected final dxo<dke, dxn> F;
   private dxn d;
   @Nullable
   private cxg e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dke.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dke.a> $$0 = new Object2ByteLinkedOpenHashMap<dke.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dke> a() {
      return p;
   }

   public static int j(@Nullable dxn $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dxn a(int $$0) {
      dxn $$1 = q.a($$0);
      return $$1 == null ? dkg.a.m() : $$1;
   }

   public static dke a(@Nullable cxg $$0) {
      return $$0 instanceof cvq ? ((cvq)$$0).d() : dkg.a;
   }

   public static dxn a(dxn $$0, dxn $$1, dhb $$2, jh $$3) {
      fcm $$4 = fcj.b($$0.g($$2, $$3), $$1.g($$2, $$3), fbw.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bvf $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fcj.a(jm.a.b, $$6.cR().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fcm a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fcj.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dxn b(dxn $$0, dhb $$1, jh $$2) {
      dxn $$3 = $$0;
      jh.a $$4 = new jh.a();

      for (jm $$5 : aG) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.H_());
      }

      return $$3;
   }

   public static void a(dxn $$0, dxn $$1, dhb $$2, jh $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dxn $$0, dxn $$1, dhb $$2, jh $$3, int $$4, int $$5) {
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

   public dke(dxm.d $$0) {
      super($$0);
      dxo.a<dke, dxn> $$1 = new dxo.a<>(this);
      this.a($$1);
      this.F = $$1.a(dke::m, dxn::new);
      this.l(this.F.b());
      if (ab.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dxn $$0) {
      return $$0.b() instanceof doq || $$0.a(dkg.in) || $$0.a(dkg.er) || $$0.a(dkg.es) || $$0.a(dkg.fo) || $$0.a(dkg.fn) || $$0.a(axu.am);
   }

   public static boolean a(dxn $$0, dxn $$1, jm $$2) {
      fcm $$3 = $$1.a($$2.g());
      if ($$3 == fcj.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fcj.a()) {
         return true;
      } else {
         fcm $$4 = $$0.a($$2);
         if ($$4 == fcj.a()) {
            return true;
         } else {
            dke.a $$5 = new dke.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dke.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fcj.c($$4, $$3, fbw.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dgf $$0, jh $$1) {
      return $$0.a_($$1).a($$0, $$1, jm.b, dsi.c);
   }

   public static boolean a(dhd $$0, jh $$1, jm $$2) {
      dxn $$3 = $$0.a_($$1);
      return $$2 == jm.a && $$3.a(axu.bb) ? false : $$3.a($$0, $$1, $$2, dsi.b);
   }

   public static boolean a(fcm $$0, jm $$1) {
      fcm $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fcm $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
   }

   public void a(dhb $$0, jh $$1, dxn $$2) {
   }

   public static List<cxk> a(dxn $$0, ash $$1, jh $$2, @Nullable dup $$3) {
      ewk.a $$4 = new ewk.a($$1).a(ezd.f, fbs.b($$2)).a(ezd.i, cxk.k).b(ezd.h, $$3);
      return $$0.a($$4);
   }

   public static List<cxk> a(dxn $$0, ash $$1, jh $$2, @Nullable dup $$3, @Nullable bvf $$4, cxk $$5) {
      ewk.a $$6 = new ewk.a($$1).a(ezd.f, fbs.b($$2)).a(ezd.i, $$5).b(ezd.a, $$4).b(ezd.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dxn $$0, dha $$1, jh $$2) {
      if ($$1 instanceof ash) {
         a($$0, (ash)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ash)$$1, $$2, cxk.k, true);
      }
   }

   public static void a(dxn $$0, dhb $$1, jh $$2, @Nullable dup $$3) {
      if ($$1 instanceof ash) {
         a($$0, (ash)$$1, $$2, $$3).forEach($$2x -> a((dha)((ash)$$1), $$2, $$2x));
         $$0.a((ash)$$1, $$2, cxk.k, true);
      }
   }

   public static void a(dxn $$0, dha $$1, jh $$2, @Nullable dup $$3, @Nullable bvf $$4, cxk $$5) {
      if ($$1 instanceof ash) {
         a($$0, (ash)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ash)$$1, $$2, $$5, true);
      }
   }

   public static void a(dha $$0, jh $$1, cxk $$2) {
      double $$3 = (double)bvm.ar.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + bae.a($$0.A, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + bae.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + bae.a($$0.A, -0.25, 0.25);
      a($$0, () -> new clw($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dha $$0, jh $$1, jm $$2, cxk $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bvm.ar.l() / 2.0;
      double $$8 = (double)bvm.ar.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? bae.a($$0.A, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? bae.a($$0.A, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? bae.a($$0.A, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? bae.a($$0.A, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? bae.a($$0.A, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? bae.a($$0.A, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new clw($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dha $$0, Supplier<clw> $$1, cxk $$2) {
      if ($$0 instanceof ash $$3 && !$$2.f() && $$3.N().b(dgw.h)) {
         clw $$5 = $$1.get();
         $$5.s();
         $$0.b($$5);
         return;
      }
   }

   protected void a(ash $$0, jh $$1, int $$2) {
      if ($$0.N().b(dgw.h)) {
         bvr.a($$0, fbs.b($$1), $$2);
      }
   }

   public float e() {
      return this.aI;
   }

   public void a(ash $$0, jh $$1, dgs $$2) {
   }

   public void a(dha $$0, jh $$1, dxn $$2, bvf $$3) {
   }

   @Nullable
   public dxn a(dbb $$0) {
      return this.m();
   }

   public void a(dha $$0, cps $$1, jh $$2, dxn $$3, @Nullable dup $$4, cxk $$5) {
      $$1.b(axp.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dha $$0, jh $$1, dxn $$2, @Nullable bwb $$3, cxk $$4) {
   }

   public boolean a(dxn $$0) {
      return !$$0.e() && !$$0.n();
   }

   public yj f() {
      return xv.c(this.v());
   }

   public void a(dha $$0, dxn $$1, jh $$2, bvf $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dW().l());
   }

   public void a(dgf $$0, bvf $$1) {
      $$1.h($$1.dy().d(1.0, 0.0, 1.0));
   }

   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return new cxk(this);
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

   protected void a(dha $$0, cps $$1, jh $$2, dxn $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dxn a(dha $$0, jh $$1, dxn $$2, cps $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(axu.aY) && $$0 instanceof ash $$4) {
         coh.a($$4, $$3, false);
      }

      $$0.a(ecj.f, $$1, ecj.a.a($$3, $$2));
      return $$2;
   }

   public void a(dxn $$0, dha $$1, jh $$2, dic.c $$3) {
   }

   public boolean a(dgs $$0) {
      return true;
   }

   protected void a(dxo.a<dke, dxn> $$0) {
   }

   public dxo<dke, dxn> l() {
      return this.F;
   }

   protected final void l(dxn $$0) {
      this.d = $$0;
   }

   public final dxn m() {
      return this.d;
   }

   public final dxn m(dxn $$0) {
      dxn $$1 = this.m();

      for (dyp<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dxn a(dxn $$0, dxn $$1, dyp<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cxg j() {
      if (this.e == null) {
         this.e = cxg.a(this);
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

   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
   }

   @Override
   protected dke o() {
      return this;
   }

   protected ImmutableMap<dxn, fcm> a(Function<dxn, fcm> $$0) {
      return this.F.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jq.c<dke> p() {
      return this.b;
   }

   protected void a(ash $$0, jh $$1, cxk $$2, bsj $$3) {
      int $$4 = ddt.b($$0, $$2, $$3.a($$0.H_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   static record a(fcm a, fcm b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dke.a $$1 && this.a == $$1.a && this.b == $$1.b) {
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
