import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class csx extends dfk implements cpw {
   private static final Logger a = LogUtils.getLogger();
   private final hg.c<csx> b = jd.f.f(this);
   public static final hm<dfl> o = new hm<>();
   private static final LoadingCache<eii, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<eii, Boolean>() {
      public Boolean a(eii $$0) {
         return !eif.c(eif.b(), $$0, eht.g);
      }
   });
   public static final int p = 1;
   public static final int q = 2;
   public static final int r = 4;
   public static final int s = 8;
   public static final int t = 16;
   public static final int u = 32;
   public static final int v = 64;
   public static final int w = 4;
   public static final int x = 3;
   public static final int y = 11;
   public static final float z = -1.0F;
   public static final float A = 0.0F;
   public static final int B = 512;
   protected final dfm<csx, dfl> C;
   private dfl d;
   @Nullable
   private String e;
   @Nullable
   private cjc f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<csx.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<csx.a> $$0 = new Object2ByteLinkedOpenHashMap<csx.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   public static int i(@Nullable dfl $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = o.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dfl a(int $$0) {
      dfl $$1 = o.a($$0);
      return $$1 == null ? csy.a.n() : $$1;
   }

   public static csx a(@Nullable cjc $$0) {
      return $$0 instanceof cha ? ((cha)$$0).e() : csy.a;
   }

   public static dfl a(dfl $$0, dfl $$1, cpy $$2, gw $$3) {
      eii $$4 = eif.b($$0.k($$2, $$3), $$1.k($$2, $$3), eht.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bis $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = eif.a(hc.a.b, $$6.cG().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static eii a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return eif.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dfl b(dfl $$0, cpy $$1, gw $$2) {
      dfl $$3 = $$0;
      gw.a $$4 = new gw.a();

      for (hc $$5 : aD) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dfl $$0, dfl $$1, cpy $$2, gw $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dfl $$0, dfl $$1, cpy $$2, gw $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.i()) {
            if (!$$2.w_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public csx(dfk.d $$0) {
      super($$0);
      dfm.a<csx, dfl> $$1 = new dfm.a<>(this);
      this.a($$1);
      this.C = $$1.a(csx::n, dfl::new);
      this.k(this.C.b());
      if (aa.aT) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dfl $$0) {
      return $$0.b() instanceof cxe || $$0.a(csy.hW) || $$0.a(csy.ef) || $$0.a(csy.eg) || $$0.a(csy.fa) || $$0.a(csy.dV) || $$0.a(apu.aQ);
   }

   public boolean e_(dfl $$0) {
      return this.aG;
   }

   public static boolean a(dfl $$0, cpd $$1, gw $$2, hc $$3, gw $$4) {
      dfl $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         csx.a $$6 = new csx.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<csx.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            eii $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               eii $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = eif.c($$9, $$10, eht.e);
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

   public static boolean c(cpd $$0, gw $$1) {
      return $$0.a_($$1).a($$0, $$1, hc.b, daz.c);
   }

   public static boolean a(cqa $$0, gw $$1, hc $$2) {
      dfl $$3 = $$0.a_($$1);
      return $$2 == hc.a && $$3.a(apu.aY) ? false : $$3.a($$0, $$1, $$2, daz.b);
   }

   public static boolean a(eii $$0, hc $$1) {
      eii $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(eii $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean c(dfl $$0, cpd $$1, gw $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
   }

   public void a(cpy $$0, gw $$1, dfl $$2) {
   }

   public static List<cjh> a(dfl $$0, aks $$1, gw $$2, @Nullable dcx $$3) {
      ecy.a $$4 = new ecy.a($$1).a(efd.f, ehp.b($$2)).a(efd.i, cjh.b).b(efd.h, $$3);
      return $$0.a($$4);
   }

   public static List<cjh> a(dfl $$0, aks $$1, gw $$2, @Nullable dcx $$3, @Nullable bis $$4, cjh $$5) {
      ecy.a $$6 = new ecy.a($$1).a(efd.f, ehp.b($$2)).a(efd.i, $$5).b(efd.a, $$4).b(efd.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dfl $$0, cpx $$1, gw $$2) {
      if ($$1 instanceof aks) {
         a($$0, (aks)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aks)$$1, $$2, cjh.b, true);
      }
   }

   public static void a(dfl $$0, cpy $$1, gw $$2, @Nullable dcx $$3) {
      if ($$1 instanceof aks) {
         a($$0, (aks)$$1, $$2, $$3).forEach($$2x -> a((cpx)((aks)$$1), $$2, $$2x));
         $$0.a((aks)$$1, $$2, cjh.b, true);
      }
   }

   public static void a(dfl $$0, cpx $$1, gw $$2, @Nullable dcx $$3, @Nullable bis $$4, cjh $$5) {
      if ($$1 instanceof aks) {
         a($$0, (aks)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aks)$$1, $$2, $$5, true);
      }
   }

   public static void a(cpx $$0, gw $$1, cjh $$2) {
      double $$3 = (double)biw.ad.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ary.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ary.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ary.a($$0.z, -0.25, 0.25);
      a($$0, () -> new byp($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cpx $$0, gw $$1, hc $$2, cjh $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)biw.ad.k() / 2.0;
      double $$8 = (double)biw.ad.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ary.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ary.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ary.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ary.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ary.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ary.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new byp($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cpx $$0, Supplier<byp> $$1, cjh $$2) {
      if (!$$0.B && !$$2.b() && $$0.X().b(cpt.g)) {
         byp $$3 = $$1.get();
         $$3.t();
         $$0.b($$3);
      }
   }

   protected void a(aks $$0, gw $$1, int $$2) {
      if ($$0.X().b(cpt.g)) {
         biy.a($$0, ehp.b($$1), $$2);
      }
   }

   public float d() {
      return this.aF;
   }

   public void a(cpx $$0, gw $$1, cpp $$2) {
   }

   public void a(cpx $$0, gw $$1, dfl $$2, bis $$3) {
   }

   @Nullable
   public dfl a(clp $$0) {
      return this.n();
   }

   public void a(cpx $$0, cbw $$1, gw $$2, dfl $$3, @Nullable dcx $$4, cjh $$5) {
      $$1.b(app.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cpx $$0, gw $$1, dfl $$2, @Nullable bji $$3, cjh $$4) {
   }

   public boolean a(dfl $$0) {
      return !$$0.e() && !$$0.k();
   }

   public ua e() {
      return tn.c(this.f());
   }

   public String f() {
      if (this.e == null) {
         this.e = ac.a("block", jd.f.b(this));
      }

      return this.e;
   }

   public void a(cpx $$0, dfl $$1, gw $$2, bis $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dM().k());
   }

   public void a(cpd $$0, bis $$1) {
      $$1.f($$1.do().d(1.0, 0.0, 1.0));
   }

   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return new cjh(this);
   }

   public float h() {
      return this.aI;
   }

   public float i() {
      return this.aJ;
   }

   public float j() {
      return this.aK;
   }

   protected void a(cpx $$0, cbw $$1, gw $$2, dfl $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public void a(cpx $$0, gw $$1, dfl $$2, cbw $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(apu.aV)) {
         can.a($$3, false);
      }

      $$0.a(djv.f, $$1, djv.a.a($$3, $$2));
   }

   public void a(dfl $$0, cpx $$1, gw $$2, cqv.c $$3) {
   }

   public boolean a(cpp $$0) {
      return true;
   }

   protected void a(dfm.a<csx, dfl> $$0) {
   }

   public dfm<csx, dfl> l() {
      return this.C;
   }

   protected final void k(dfl $$0) {
      this.d = $$0;
   }

   public final dfl n() {
      return this.d;
   }

   public final dfl l(dfl $$0) {
      dfl $$1 = this.n();

      for (dgo<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dfl a(dfl $$0, dfl $$1, dgo<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public dak m(dfl $$0) {
      return this.aH;
   }

   @Override
   public cjc k() {
      if (this.f == null) {
         this.f = cjc.a(this);
      }

      return this.f;
   }

   public boolean o() {
      return this.aL;
   }

   @Override
   public String toString() {
      return "Block{" + jd.f.b(this) + "}";
   }

   public void a(cjh $$0, @Nullable cpd $$1, List<tn> $$2, cky $$3) {
   }

   @Override
   protected csx p() {
      return this;
   }

   protected ImmutableMap<dfl, eii> a(Function<dfl, eii> $$0) {
      return this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public hg.c<csx> q() {
      return this.b;
   }

   protected void a(aks $$0, gw $$1, cjh $$2, bgf $$3) {
      if (cns.a(cnu.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dfl a;
      private final dfl b;
      private final hc c;

      public a(dfl $$0, dfl $$1, hc $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof csx.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
