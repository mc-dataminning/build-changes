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

public class dfy extends dtb implements dcv {
   public static final MapCodec<dfy> p = b(dfy::new);
   private static final Logger a = LogUtils.getLogger();
   private final jm.c<dfy> b = lt.e.f(this);
   public static final js<dtc> q = new js<>();
   private static final LoadingCache<ext, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ext, Boolean>() {
      public Boolean a(ext $$0) {
         return !exq.c(exq.b(), $$0, exe.g);
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
   protected final dtd<dfy, dtc> E;
   private dtc d;
   @Nullable
   private String e;
   @Nullable
   private cul f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dfy.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dfy.a> $$0 = new Object2ByteLinkedOpenHashMap<dfy.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dfy> a() {
      return p;
   }

   public static int i(@Nullable dtc $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dtc a(int $$0) {
      dtc $$1 = q.a($$0);
      return $$1 == null ? dga.a.o() : $$1;
   }

   public static dfy a(@Nullable cul $$0) {
      return $$0 instanceof cso ? ((cso)$$0).d() : dga.a;
   }

   public static dtc a(dtc $$0, dtc $$1, dcx $$2, jd $$3) {
      ext $$4 = exq.b($$0.k($$2, $$3), $$1.k($$2, $$3), exe.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bsr $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = exq.a(ji.a.b, $$6.cL().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ext a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return exq.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dtc b(dtc $$0, dcx $$1, jd $$2) {
      dtc $$3 = $$0;
      jd.a $$4 = new jd.a();

      for (ji $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dtc $$0, dtc $$1, dcx $$2, jd $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dtc $$0, dtc $$1, dcx $$2, jd $$3, int $$4, int $$5) {
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

   public dfy(dtb.d $$0) {
      super($$0);
      dtd.a<dfy, dtc> $$1 = new dtd.a<>(this);
      this.a($$1);
      this.E = $$1.a(dfy::o, dtc::new);
      this.k(this.E.b());
      if (ab.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dtc $$0) {
      return $$0.b() instanceof dki || $$0.a(dga.hW) || $$0.a(dga.ee) || $$0.a(dga.ef) || $$0.a(dga.fa) || $$0.a(dga.eZ) || $$0.a(awe.aR);
   }

   public static boolean a(dtc $$0, dcc $$1, jd $$2, ji $$3, jd $$4) {
      dtc $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dfy.a $$6 = new dfy.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dfy.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ext $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ext $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = exq.c($$9, $$10, exe.e);
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

   public static boolean c(dcc $$0, jd $$1) {
      return $$0.a_($$1).a($$0, $$1, ji.b, doa.c);
   }

   public static boolean a(dcz $$0, jd $$1, ji $$2) {
      dtc $$3 = $$0.a_($$1);
      return $$2 == ji.a && $$3.a(awe.aZ) ? false : $$3.a($$0, $$1, $$2, doa.b);
   }

   public static boolean a(ext $$0, ji $$1) {
      ext $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ext $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
   }

   public void a(dcx $$0, jd $$1, dtc $$2) {
   }

   public static List<cuq> a(dtc $$0, aqu $$1, jd $$2, @Nullable dqh $$3) {
      ers.a $$4 = new ers.a($$1).a(eul.f, exa.b($$2)).a(eul.i, cuq.l).b(eul.h, $$3);
      return $$0.a($$4);
   }

   public static List<cuq> a(dtc $$0, aqu $$1, jd $$2, @Nullable dqh $$3, @Nullable bsr $$4, cuq $$5) {
      ers.a $$6 = new ers.a($$1).a(eul.f, exa.b($$2)).a(eul.i, $$5).b(eul.a, $$4).b(eul.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dtc $$0, dcw $$1, jd $$2) {
      if ($$1 instanceof aqu) {
         a($$0, (aqu)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqu)$$1, $$2, cuq.l, true);
      }
   }

   public static void a(dtc $$0, dcx $$1, jd $$2, @Nullable dqh $$3) {
      if ($$1 instanceof aqu) {
         a($$0, (aqu)$$1, $$2, $$3).forEach($$2x -> a((dcw)((aqu)$$1), $$2, $$2x));
         $$0.a((aqu)$$1, $$2, cuq.l, true);
      }
   }

   public static void a(dtc $$0, dcw $$1, jd $$2, @Nullable dqh $$3, @Nullable bsr $$4, cuq $$5) {
      if ($$1 instanceof aqu) {
         a($$0, (aqu)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqu)$$1, $$2, $$5, true);
      }
   }

   public static void a(dcw $$0, jd $$1, cuq $$2) {
      double $$3 = (double)bsx.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayo.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayo.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayo.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cjh($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dcw $$0, jd $$1, ji $$2, cuq $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bsx.ag.l() / 2.0;
      double $$8 = (double)bsx.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayo.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayo.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayo.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayo.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayo.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayo.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cjh($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dcw $$0, Supplier<cjh> $$1, cuq $$2) {
      if (!$$0.B && !$$2.e() && $$0.ab().b(dcs.h)) {
         cjh $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(aqu $$0, jd $$1, int $$2) {
      if ($$0.ab().b(dcs.h)) {
         btc.a($$0, exa.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(dcw $$0, jd $$1, dco $$2) {
   }

   public void a(dcw $$0, jd $$1, dtc $$2, bsr $$3) {
   }

   @Nullable
   public dtc a(cyd $$0) {
      return this.o();
   }

   public void a(dcw $$0, cmx $$1, jd $$2, dtc $$3, @Nullable dqh $$4, cuq $$5) {
      $$1.b(avz.a.b(this));
      $$1.E(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dcw $$0, jd $$1, dtc $$2, @Nullable btn $$3, cuq $$4) {
   }

   public boolean a(dtc $$0) {
      return !$$0.e() && !$$0.k();
   }

   public xn f() {
      return wz.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ad.a("block", lt.e.b(this));
      }

      return this.e;
   }

   public void a(dcw $$0, dtc $$1, jd $$2, bsr $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dQ().l());
   }

   public void a(dcc $$0, bsr $$1) {
      $$1.i($$1.ds().d(1.0, 0.0, 1.0));
   }

   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return new cuq(this);
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

   protected void a(dcw $$0, cmx $$1, jd $$2, dtc $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dtc a(dcw $$0, jd $$1, dtc $$2, cmx $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awe.aW)) {
         clo.a($$3, false);
      }

      $$0.a(dxz.f, $$1, dxz.a.a($$3, $$2));
      return $$2;
   }

   public void a(dtc $$0, dcw $$1, jd $$2, ddw.c $$3) {
   }

   public boolean a(dco $$0) {
      return true;
   }

   protected void a(dtd.a<dfy, dtc> $$0) {
   }

   public dtd<dfy, dtc> l() {
      return this.E;
   }

   protected final void k(dtc $$0) {
      this.d = $$0;
   }

   public final dtc o() {
      return this.d;
   }

   public final dtc l(dtc $$0) {
      dtc $$1 = this.o();

      for (duf<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dtc a(dtc $$0, dtc $$1, duf<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cul r() {
      if (this.f == null) {
         this.f = cul.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + lt.e.e(this).g() + "}";
   }

   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
   }

   @Override
   protected dfy q() {
      return this;
   }

   protected ImmutableMap<dtc, ext> a(Function<dtc, ext> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jm.c<dfy> s() {
      return this.b;
   }

   protected void a(aqu $$0, jd $$1, cuq $$2, bpw $$3) {
      int $$4 = dae.b($$0, $$2, $$3.a($$0.E_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   public static final class a {
      private final dtc a;
      private final dtc b;
      private final ji c;

      public a(dtc $$0, dtc $$1, ji $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dfy.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
