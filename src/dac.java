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

public class dac extends dna implements cxa {
   public static final MapCodec<dac> p = b(dac::new);
   private static final Logger a = LogUtils.getLogger();
   private final il.c<dac> b = ki.e.f(this);
   public static final ir<dnb> q = new ir<>();
   private static final LoadingCache<eqm, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<eqm, Boolean>() {
      public Boolean a(eqm $$0) {
         return !eqj.c(eqj.b(), $$0, epx.g);
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
   protected final dnc<dac, dnb> E;
   private dnb d;
   @Nullable
   private String e;
   @Nullable
   private cqh f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dac.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dac.a> $$0 = new Object2ByteLinkedOpenHashMap<dac.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dac> a() {
      return p;
   }

   public static int i(@Nullable dnb $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dnb a(int $$0) {
      dnb $$1 = q.a($$0);
      return $$1 == null ? dae.a.o() : $$1;
   }

   public static dac a(@Nullable cqh $$0) {
      return $$0 instanceof coh ? ((coh)$$0).d() : dae.a;
   }

   public static dnb a(dnb $$0, dnb $$1, cxc $$2, ib $$3) {
      eqm $$4 = eqj.b($$0.k($$2, $$3), $$1.k($$2, $$3), epx.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (box $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = eqj.a(ih.a.b, $$6.cH().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static eqm a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return eqj.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dnb b(dnb $$0, cxc $$1, ib $$2) {
      dnb $$3 = $$0;
      ib.a $$4 = new ib.a();

      for (ih $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dnb $$0, dnb $$1, cxc $$2, ib $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dnb $$0, dnb $$1, cxc $$2, ib $$3, int $$4, int $$5) {
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

   public dac(dna.d $$0) {
      super($$0);
      dnc.a<dac, dnb> $$1 = new dnc.a<>(this);
      this.a($$1);
      this.E = $$1.a(dac::o, dnb::new);
      this.k(this.E.b());
      if (aa.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dnb $$0) {
      return $$0.b() instanceof del || $$0.a(dae.hW) || $$0.a(dae.ee) || $$0.a(dae.ef) || $$0.a(dae.fa) || $$0.a(dae.eZ) || $$0.a(aun.aR);
   }

   public static boolean a(dnb $$0, cwh $$1, ib $$2, ih $$3, ib $$4) {
      dnb $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dac.a $$6 = new dac.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dac.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            eqm $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               eqm $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = eqj.c($$9, $$10, epx.e);
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

   public static boolean c(cwh $$0, ib $$1) {
      return $$0.a_($$1).a($$0, $$1, ih.b, dic.c);
   }

   public static boolean a(cxe $$0, ib $$1, ih $$2) {
      dnb $$3 = $$0.a_($$1);
      return $$2 == ih.a && $$3.a(aun.aZ) ? false : $$3.a($$0, $$1, $$2, dic.b);
   }

   public static boolean a(eqm $$0, ih $$1) {
      eqm $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(eqm $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
   }

   public void a(cxc $$0, ib $$1, dnb $$2) {
   }

   public static List<cqm> a(dnb $$0, apf $$1, ib $$2, @Nullable dki $$3) {
      elc.a $$4 = new elc.a($$1).a(enh.f, ept.b($$2)).a(enh.i, cqm.h).b(enh.h, $$3);
      return $$0.a($$4);
   }

   public static List<cqm> a(dnb $$0, apf $$1, ib $$2, @Nullable dki $$3, @Nullable box $$4, cqm $$5) {
      elc.a $$6 = new elc.a($$1).a(enh.f, ept.b($$2)).a(enh.i, $$5).b(enh.a, $$4).b(enh.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dnb $$0, cxb $$1, ib $$2) {
      if ($$1 instanceof apf) {
         a($$0, (apf)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((apf)$$1, $$2, cqm.h, true);
      }
   }

   public static void a(dnb $$0, cxc $$1, ib $$2, @Nullable dki $$3) {
      if ($$1 instanceof apf) {
         a($$0, (apf)$$1, $$2, $$3).forEach($$2x -> a((cxb)((apf)$$1), $$2, $$2x));
         $$0.a((apf)$$1, $$2, cqm.h, true);
      }
   }

   public static void a(dnb $$0, cxb $$1, ib $$2, @Nullable dki $$3, @Nullable box $$4, cqm $$5) {
      if ($$1 instanceof apf) {
         a($$0, (apf)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((apf)$$1, $$2, $$5, true);
      }
   }

   public static void a(cxb $$0, ib $$1, cqm $$2) {
      double $$3 = (double)bpd.ah.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + aww.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + aww.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + aww.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cfe($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cxb $$0, ib $$1, ih $$2, cqm $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bpd.ah.k() / 2.0;
      double $$8 = (double)bpd.ah.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? aww.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? aww.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? aww.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? aww.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? aww.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? aww.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cfe($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cxb $$0, Supplier<cfe> $$1, cqm $$2) {
      if (!$$0.B && !$$2.b() && $$0.Z().b(cwx.h)) {
         cfe $$3 = $$1.get();
         $$3.s();
         $$0.b($$3);
      }
   }

   protected void a(apf $$0, ib $$1, int $$2) {
      if ($$0.Z().b(cwx.h)) {
         bpf.a($$0, ept.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(cxb $$0, ib $$1, cwt $$2) {
   }

   public void a(cxb $$0, ib $$1, dnb $$2, box $$3) {
   }

   @Nullable
   public dnb a(csu $$0) {
      return this.o();
   }

   public void a(cxb $$0, ciu $$1, ib $$2, dnb $$3, @Nullable dki $$4, cqm $$5) {
      $$1.b(aui.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cxb $$0, ib $$1, dnb $$2, @Nullable bpp $$3, cqm $$4) {
   }

   public boolean a(dnb $$0) {
      return !$$0.e() && !$$0.k();
   }

   public wi f() {
      return vu.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ac.a("block", ki.e.b(this));
      }

      return this.e;
   }

   public void a(cxb $$0, dnb $$1, ib $$2, box $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dN().k());
   }

   public void a(cwh $$0, box $$1) {
      $$1.g($$1.dp().d(1.0, 0.0, 1.0));
   }

   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      return new cqm(this);
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

   protected void a(cxb $$0, ciu $$1, ib $$2, dnb $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dnb a(cxb $$0, ib $$1, dnb $$2, ciu $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(aun.aW)) {
         chl.a($$3, false);
      }

      $$0.a(drp.f, $$1, drp.a.a($$3, $$2));
      return $$2;
   }

   public void a(dnb $$0, cxb $$1, ib $$2, cya.c $$3) {
   }

   public boolean a(cwt $$0) {
      return true;
   }

   protected void a(dnc.a<dac, dnb> $$0) {
   }

   public dnc<dac, dnb> n() {
      return this.E;
   }

   protected final void k(dnb $$0) {
      this.d = $$0;
   }

   public final dnb o() {
      return this.d;
   }

   public final dnb l(dnb $$0) {
      dnb $$1 = this.o();

      for (doe<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dnb a(dnb $$0, dnb $$1, doe<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cqh l() {
      if (this.f == null) {
         this.f = cqh.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + ki.e.b(this) + "}";
   }

   public void a(cqm $$0, @Nullable cwh $$1, List<vu> $$2, csd $$3, @Nullable iz $$4) {
   }

   @Override
   protected dac q() {
      return this;
   }

   protected ImmutableMap<dnb, eqm> a(Function<dnb, eqm> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public il.c<dac> r() {
      return this.b;
   }

   protected void a(apf $$0, ib $$1, cqm $$2, bmi $$3) {
      if (cux.a(cuz.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dnb a;
      private final dnb b;
      private final ih c;

      public a(dnb $$0, dnb $$1, ih $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dac.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
