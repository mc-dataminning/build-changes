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

public class dcv extends dpx implements czt {
   public static final MapCodec<dcv> p = b(dcv::new);
   private static final Logger a = LogUtils.getLogger();
   private final iv.c<dcv> b = lc.e.f(this);
   public static final jb<dpy> q = new jb<>();
   private static final LoadingCache<ety, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ety, Boolean>() {
      public Boolean a(ety $$0) {
         return !etv.c(etv.b(), $$0, etj.g);
      }
   });
   public static final int r = 1;
   public static final int s = 2;
   public static final int t = 4;
   public static final int u = 8;
   public static final int v = 16;
   public static final int w = 32;
   public static final int x = 64;
   public static final int y = 4;
   public static final int z = 3;
   public static final int A = 11;
   public static final float B = -1.0F;
   public static final float C = 0.0F;
   public static final int D = 512;
   protected final dpz<dcv, dpy> E;
   private dpy d;
   @Nullable
   private String e;
   @Nullable
   private cry f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dcv.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dcv.a> $$0 = new Object2ByteLinkedOpenHashMap<dcv.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dcv> a() {
      return p;
   }

   public static int i(@Nullable dpy $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dpy a(int $$0) {
      dpy $$1 = q.a($$0);
      return $$1 == null ? dcx.a.n() : $$1;
   }

   public static dcv a(@Nullable cry $$0) {
      return $$0 instanceof cqb ? ((cqb)$$0).d() : dcx.a;
   }

   public static dpy a(dpy $$0, dpy $$1, czv $$2, im $$3) {
      ety $$4 = etv.b($$0.k($$2, $$3), $$1.k($$2, $$3), etj.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bql $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = etv.a(ir.a.b, $$6.cI().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ety a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return etv.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dpy b(dpy $$0, czv $$1, im $$2) {
      dpy $$3 = $$0;
      im.a $$4 = new im.a();

      for (ir $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dpy $$0, dpy $$1, czv $$2, im $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dpy $$0, dpy $$1, czv $$2, im $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.i()) {
            if (!$$2.x_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public dcv(dpx.d $$0) {
      super($$0);
      dpz.a<dcv, dpy> $$1 = new dpz.a<>(this);
      this.a($$1);
      this.E = $$1.a(dcv::n, dpy::new);
      this.k(this.E.b());
      if (aa.aX) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dpy $$0) {
      return $$0.b() instanceof dhf || $$0.a(dcx.hW) || $$0.a(dcx.ee) || $$0.a(dcx.ef) || $$0.a(dcx.fa) || $$0.a(dcx.eZ) || $$0.a(avo.aR);
   }

   public static boolean a(dpy $$0, cza $$1, im $$2, ir $$3, im $$4) {
      dpy $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dcv.a $$6 = new dcv.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dcv.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ety $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ety $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = etv.c($$9, $$10, etj.e);
               if ($$7.size() == 2048) {
                  $$7.removeLastByte();
               }

               $$7.putAndMoveToFirst($$6, (byte)($$11 ? 1 : 0));
               return $$11;
            }
         }
      } else {
         return true;
      }
   }

   public static boolean c(cza $$0, im $$1) {
      return $$0.a_($$1).a($$0, $$1, ir.b, dkw.c);
   }

   public static boolean a(czx $$0, im $$1, ir $$2) {
      dpy $$3 = $$0.a_($$1);
      return $$2 == ir.a && $$3.a(avo.aZ) ? false : $$3.a($$0, $$1, $$2, dkw.b);
   }

   public static boolean a(ety $$0, ir $$1) {
      ety $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ety $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
   }

   public void a(czv $$0, im $$1, dpy $$2) {
   }

   public static List<csd> a(dpy $$0, aqe $$1, im $$2, @Nullable dnd $$3) {
      eog.a $$4 = new eog.a($$1).a(eqt.f, etf.b($$2)).a(eqt.i, csd.i).b(eqt.h, $$3);
      return $$0.a($$4);
   }

   public static List<csd> a(dpy $$0, aqe $$1, im $$2, @Nullable dnd $$3, @Nullable bql $$4, csd $$5) {
      eog.a $$6 = new eog.a($$1).a(eqt.f, etf.b($$2)).a(eqt.i, $$5).b(eqt.a, $$4).b(eqt.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dpy $$0, czu $$1, im $$2) {
      if ($$1 instanceof aqe) {
         a($$0, (aqe)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqe)$$1, $$2, csd.i, true);
      }
   }

   public static void a(dpy $$0, czv $$1, im $$2, @Nullable dnd $$3) {
      if ($$1 instanceof aqe) {
         a($$0, (aqe)$$1, $$2, $$3).forEach($$2x -> a((czu)((aqe)$$1), $$2, $$2x));
         $$0.a((aqe)$$1, $$2, csd.i, true);
      }
   }

   public static void a(dpy $$0, czu $$1, im $$2, @Nullable dnd $$3, @Nullable bql $$4, csd $$5) {
      if ($$1 instanceof aqe) {
         a($$0, (aqe)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqe)$$1, $$2, $$5, true);
      }
   }

   public static void a(czu $$0, im $$1, csd $$2) {
      double $$3 = (double)bqr.ag.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + axw.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + axw.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + axw.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cgv($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(czu $$0, im $$1, ir $$2, csd $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bqr.ag.k() / 2.0;
      double $$8 = (double)bqr.ag.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? axw.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? axw.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? axw.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? axw.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? axw.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? axw.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cgv($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(czu $$0, Supplier<cgv> $$1, csd $$2) {
      if (!$$0.B && !$$2.d() && $$0.aa().b(czq.h)) {
         cgv $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(aqe $$0, im $$1, int $$2) {
      if ($$0.aa().b(czq.h)) {
         bqu.a($$0, etf.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(czu $$0, im $$1, czm $$2) {
   }

   public void a(czu $$0, im $$1, dpy $$2, bql $$3) {
   }

   @Nullable
   public dpy a(cvl $$0) {
      return this.n();
   }

   public void a(czu $$0, ckl $$1, im $$2, dpy $$3, @Nullable dnd $$4, csd $$5) {
      $$1.b(avj.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(czu $$0, im $$1, dpy $$2, @Nullable bre $$3, csd $$4) {
   }

   public boolean a(dpy $$0) {
      return !$$0.e() && !$$0.k();
   }

   public xg f() {
      return ws.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ac.a("block", lc.e.b(this));
      }

      return this.e;
   }

   public void a(czu $$0, dpy $$1, im $$2, bql $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dO().k());
   }

   public void a(cza $$0, bql $$1) {
      $$1.g($$1.dq().d(1.0, 0.0, 1.0));
   }

   public csd a(czx $$0, im $$1, dpy $$2) {
      return new csd(this);
   }

   public float h() {
      return this.aK;
   }

   public float i() {
      return this.aL;
   }

   public float j() {
      return this.aM;
   }

   protected void a(czu $$0, ckl $$1, im $$2, dpy $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dpy a(czu $$0, im $$1, dpy $$2, ckl $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(avo.aW)) {
         cjc.a($$3, false);
      }

      $$0.a(dur.f, $$1, dur.a.a($$3, $$2));
      return $$2;
   }

   public void a(dpy $$0, czu $$1, im $$2, dat.c $$3) {
   }

   public boolean a(czm $$0) {
      return true;
   }

   protected void a(dpz.a<dcv, dpy> $$0) {
   }

   public dpz<dcv, dpy> l() {
      return this.E;
   }

   protected final void k(dpy $$0) {
      this.d = $$0;
   }

   public final dpy n() {
      return this.d;
   }

   public final dpy l(dpy $$0) {
      dpy $$1 = this.n();

      for (drb<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dpy a(dpy $$0, dpy $$1, drb<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cry p() {
      if (this.f == null) {
         this.f = cry.a(this);
      }

      return this.f;
   }

   public boolean o() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + lc.e.b(this) + "}";
   }

   public void a(csd $$0, @Nullable cza $$1, List<ws> $$2, ctu $$3, @Nullable jj $$4) {
   }

   @Override
   protected dcv q() {
      return this;
   }

   protected ImmutableMap<dpy, ety> a(Function<dpy, ety> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public iv.c<dcv> r() {
      return this.b;
   }

   protected void a(aqe $$0, im $$1, csd $$2, bnv $$3) {
      if (cxo.a(cxq.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dpy a;
      private final dpy b;
      private final ir c;

      public a(dpy $$0, dpy $$1, ir $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dcv.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.a.hashCode();
         $$0 = 31 * $$0 + this.b.hashCode();
         return 31 * $$0 + this.c.hashCode();
      }
   }
}
