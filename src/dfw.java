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

public class dfw extends dsz implements dct {
   public static final MapCodec<dfw> p = b(dfw::new);
   private static final Logger a = LogUtils.getLogger();
   private final jm.c<dfw> b = lt.e.f(this);
   public static final js<dta> q = new js<>();
   private static final LoadingCache<exp, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<exp, Boolean>() {
      public Boolean a(exp $$0) {
         return !exm.c(exm.b(), $$0, exa.g);
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
   protected final dtb<dfw, dta> E;
   private dta d;
   @Nullable
   private String e;
   @Nullable
   private cuj f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dfw.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dfw.a> $$0 = new Object2ByteLinkedOpenHashMap<dfw.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dfw> a() {
      return p;
   }

   public static int i(@Nullable dta $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dta a(int $$0) {
      dta $$1 = q.a($$0);
      return $$1 == null ? dfy.a.o() : $$1;
   }

   public static dfw a(@Nullable cuj $$0) {
      return $$0 instanceof csm ? ((csm)$$0).d() : dfy.a;
   }

   public static dta a(dta $$0, dta $$1, dcv $$2, jd $$3) {
      exp $$4 = exm.b($$0.k($$2, $$3), $$1.k($$2, $$3), exa.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bsq $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = exm.a(ji.a.b, $$6.cL().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static exp a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return exm.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dta b(dta $$0, dcv $$1, jd $$2) {
      dta $$3 = $$0;
      jd.a $$4 = new jd.a();

      for (ji $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dta $$0, dta $$1, dcv $$2, jd $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dta $$0, dta $$1, dcv $$2, jd $$3, int $$4, int $$5) {
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

   public dfw(dsz.d $$0) {
      super($$0);
      dtb.a<dfw, dta> $$1 = new dtb.a<>(this);
      this.a($$1);
      this.E = $$1.a(dfw::o, dta::new);
      this.k(this.E.b());
      if (ab.aV) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dta $$0) {
      return $$0.b() instanceof dkg || $$0.a(dfy.hW) || $$0.a(dfy.ee) || $$0.a(dfy.ef) || $$0.a(dfy.fa) || $$0.a(dfy.eZ) || $$0.a(awd.aR);
   }

   public static boolean a(dta $$0, dca $$1, jd $$2, ji $$3, jd $$4) {
      dta $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dfw.a $$6 = new dfw.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dfw.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            exp $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               exp $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = exm.c($$9, $$10, exa.e);
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

   public static boolean c(dca $$0, jd $$1) {
      return $$0.a_($$1).a($$0, $$1, ji.b, dny.c);
   }

   public static boolean a(dcx $$0, jd $$1, ji $$2) {
      dta $$3 = $$0.a_($$1);
      return $$2 == ji.a && $$3.a(awd.aZ) ? false : $$3.a($$0, $$1, $$2, dny.b);
   }

   public static boolean a(exp $$0, ji $$1) {
      exp $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(exp $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
   }

   public void a(dcv $$0, jd $$1, dta $$2) {
   }

   public static List<cuo> a(dta $$0, aqt $$1, jd $$2, @Nullable dqf $$3) {
      ero.a $$4 = new ero.a($$1).a(euh.f, eww.b($$2)).a(euh.i, cuo.l).b(euh.h, $$3);
      return $$0.a($$4);
   }

   public static List<cuo> a(dta $$0, aqt $$1, jd $$2, @Nullable dqf $$3, @Nullable bsq $$4, cuo $$5) {
      ero.a $$6 = new ero.a($$1).a(euh.f, eww.b($$2)).a(euh.i, $$5).b(euh.a, $$4).b(euh.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dta $$0, dcu $$1, jd $$2) {
      if ($$1 instanceof aqt) {
         a($$0, (aqt)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqt)$$1, $$2, cuo.l, true);
      }
   }

   public static void a(dta $$0, dcv $$1, jd $$2, @Nullable dqf $$3) {
      if ($$1 instanceof aqt) {
         a($$0, (aqt)$$1, $$2, $$3).forEach($$2x -> a((dcu)((aqt)$$1), $$2, $$2x));
         $$0.a((aqt)$$1, $$2, cuo.l, true);
      }
   }

   public static void a(dta $$0, dcu $$1, jd $$2, @Nullable dqf $$3, @Nullable bsq $$4, cuo $$5) {
      if ($$1 instanceof aqt) {
         a($$0, (aqt)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqt)$$1, $$2, $$5, true);
      }
   }

   public static void a(dcu $$0, jd $$1, cuo $$2) {
      double $$3 = (double)bsw.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayn.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayn.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayn.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cjf($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dcu $$0, jd $$1, ji $$2, cuo $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bsw.ag.l() / 2.0;
      double $$8 = (double)bsw.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayn.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayn.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayn.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayn.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayn.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayn.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cjf($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dcu $$0, Supplier<cjf> $$1, cuo $$2) {
      if (!$$0.B && !$$2.e() && $$0.ab().b(dcq.h)) {
         cjf $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(aqt $$0, jd $$1, int $$2) {
      if ($$0.ab().b(dcq.h)) {
         btb.a($$0, eww.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(dcu $$0, jd $$1, dcm $$2) {
   }

   public void a(dcu $$0, jd $$1, dta $$2, bsq $$3) {
   }

   @Nullable
   public dta a(cyb $$0) {
      return this.o();
   }

   public void a(dcu $$0, cmv $$1, jd $$2, dta $$3, @Nullable dqf $$4, cuo $$5) {
      $$1.b(avy.a.b(this));
      $$1.D(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dcu $$0, jd $$1, dta $$2, @Nullable btl $$3, cuo $$4) {
   }

   public boolean a(dta $$0) {
      return !$$0.e() && !$$0.k();
   }

   public xm f() {
      return wy.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ad.a("block", lt.e.b(this));
      }

      return this.e;
   }

   public void a(dcu $$0, dta $$1, jd $$2, bsq $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dR().l());
   }

   public void a(dca $$0, bsq $$1) {
      $$1.i($$1.dt().d(1.0, 0.0, 1.0));
   }

   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return new cuo(this);
   }

   public float h() {
      return this.aK;
   }

   public float j() {
      return this.aL;
   }

   public float k() {
      return this.aM;
   }

   protected void a(dcu $$0, cmv $$1, jd $$2, dta $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dta a(dcu $$0, jd $$1, dta $$2, cmv $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awd.aW)) {
         clm.a($$3, false);
      }

      $$0.a(dxw.f, $$1, dxw.a.a($$3, $$2));
      return $$2;
   }

   public void a(dta $$0, dcu $$1, jd $$2, ddu.c $$3) {
   }

   public boolean a(dcm $$0) {
      return true;
   }

   protected void a(dtb.a<dfw, dta> $$0) {
   }

   public dtb<dfw, dta> l() {
      return this.E;
   }

   protected final void k(dta $$0) {
      this.d = $$0;
   }

   public final dta o() {
      return this.d;
   }

   public final dta l(dta $$0) {
      dta $$1 = this.o();

      for (dud<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dta a(dta $$0, dta $$1, dud<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cuj r() {
      if (this.f == null) {
         this.f = cuj.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + lt.e.b(this) + "}";
   }

   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
   }

   @Override
   protected dfw q() {
      return this;
   }

   protected ImmutableMap<dta, exp> a(Function<dta, exp> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jm.c<dfw> s() {
      return this.b;
   }

   protected void a(aqt $$0, jd $$1, cuo $$2, bpv $$3) {
      int $$4 = dac.b($$0, $$2, $$3.a($$0.E_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   public static final class a {
      private final dta a;
      private final dta b;
      private final ji c;

      public a(dta $$0, dta $$1, ji $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dfw.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
