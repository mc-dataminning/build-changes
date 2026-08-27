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

public class czf extends dmd implements cwd {
   public static final MapCodec<czf> p = b(czf::new);
   private static final Logger a = LogUtils.getLogger();
   private final il.c<czf> b = kh.e.g(this);
   public static final ir<dme> q = new ir<>();
   private static final LoadingCache<epo, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<epo, Boolean>() {
      public Boolean a(epo $$0) {
         return !epl.c(epl.b(), $$0, eoz.g);
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
   protected final dmf<czf, dme> E;
   private dme d;
   @Nullable
   private String e;
   @Nullable
   private cpl f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<czf.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<czf.a> $$0 = new Object2ByteLinkedOpenHashMap<czf.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends czf> a() {
      return p;
   }

   public static int i(@Nullable dme $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dme a(int $$0) {
      dme $$1 = q.a($$0);
      return $$1 == null ? czh.a.o() : $$1;
   }

   public static czf a(@Nullable cpl $$0) {
      return $$0 instanceof cnl ? ((cnl)$$0).d() : czh.a;
   }

   public static dme a(dme $$0, dme $$1, cwf $$2, ib $$3) {
      epo $$4 = epl.b($$0.k($$2, $$3), $$1.k($$2, $$3), eoz.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bof $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = epl.a(ih.a.b, $$6.cE().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static epo a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return epl.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dme b(dme $$0, cwf $$1, ib $$2) {
      dme $$3 = $$0;
      ib.a $$4 = new ib.a();

      for (ih $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dme $$0, dme $$1, cwf $$2, ib $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dme $$0, dme $$1, cwf $$2, ib $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.i()) {
            if (!$$2.y_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public czf(dmd.d $$0) {
      super($$0);
      dmf.a<czf, dme> $$1 = new dmf.a<>(this);
      this.a($$1);
      this.E = $$1.a(czf::o, dme::new);
      this.k(this.E.b());
      if (aa.aV) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dme $$0) {
      return $$0.b() instanceof ddo || $$0.a(czh.hW) || $$0.a(czh.ee) || $$0.a(czh.ef) || $$0.a(czh.fa) || $$0.a(czh.eZ) || $$0.a(aue.aQ);
   }

   public static boolean a(dme $$0, cvk $$1, ib $$2, ih $$3, ib $$4) {
      dme $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         czf.a $$6 = new czf.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<czf.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            epo $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               epo $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = epl.c($$9, $$10, eoz.e);
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

   public static boolean c(cvk $$0, ib $$1) {
      return $$0.a_($$1).a($$0, $$1, ih.b, dhf.c);
   }

   public static boolean a(cwh $$0, ib $$1, ih $$2) {
      dme $$3 = $$0.a_($$1);
      return $$2 == ih.a && $$3.a(aue.aY) ? false : $$3.a($$0, $$1, $$2, dhf.b);
   }

   public static boolean a(epo $$0, ih $$1) {
      epo $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(epo $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
   }

   public void a(cwf $$0, ib $$1, dme $$2) {
   }

   public static List<cpq> a(dme $$0, apa $$1, ib $$2, @Nullable djl $$3) {
      eke.a $$4 = new eke.a($$1).a(emj.f, eov.b($$2)).a(emj.i, cpq.h).b(emj.h, $$3);
      return $$0.a($$4);
   }

   public static List<cpq> a(dme $$0, apa $$1, ib $$2, @Nullable djl $$3, @Nullable bof $$4, cpq $$5) {
      eke.a $$6 = new eke.a($$1).a(emj.f, eov.b($$2)).a(emj.i, $$5).b(emj.a, $$4).b(emj.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dme $$0, cwe $$1, ib $$2) {
      if ($$1 instanceof apa) {
         a($$0, (apa)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((apa)$$1, $$2, cpq.h, true);
      }
   }

   public static void a(dme $$0, cwf $$1, ib $$2, @Nullable djl $$3) {
      if ($$1 instanceof apa) {
         a($$0, (apa)$$1, $$2, $$3).forEach($$2x -> a((cwe)((apa)$$1), $$2, $$2x));
         $$0.a((apa)$$1, $$2, cpq.h, true);
      }
   }

   public static void a(dme $$0, cwe $$1, ib $$2, @Nullable djl $$3, @Nullable bof $$4, cpq $$5) {
      if ($$1 instanceof apa) {
         a($$0, (apa)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((apa)$$1, $$2, $$5, true);
      }
   }

   public static void a(cwe $$0, ib $$1, cpq $$2) {
      double $$3 = (double)bol.af.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + awm.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + awm.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + awm.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cel($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cwe $$0, ib $$1, ih $$2, cpq $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bol.af.k() / 2.0;
      double $$8 = (double)bol.af.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? awm.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? awm.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? awm.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? awm.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? awm.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? awm.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cel($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cwe $$0, Supplier<cel> $$1, cpq $$2) {
      if (!$$0.B && !$$2.b() && $$0.Z().b(cwa.h)) {
         cel $$3 = $$1.get();
         $$3.u();
         $$0.b($$3);
      }
   }

   protected void a(apa $$0, ib $$1, int $$2) {
      if ($$0.Z().b(cwa.h)) {
         bon.a($$0, eov.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(cwe $$0, ib $$1, cvw $$2) {
   }

   public void a(cwe $$0, ib $$1, dme $$2, bof $$3) {
   }

   @Nullable
   public dme a(crx $$0) {
      return this.o();
   }

   public void a(cwe $$0, cia $$1, ib $$2, dme $$3, @Nullable djl $$4, cpq $$5) {
      $$1.b(atz.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cwe $$0, ib $$1, dme $$2, @Nullable box $$3, cpq $$4) {
   }

   public boolean a(dme $$0) {
      return !$$0.e() && !$$0.k();
   }

   public wg f() {
      return vs.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ac.a("block", kh.e.b(this));
      }

      return this.e;
   }

   public void a(cwe $$0, dme $$1, ib $$2, bof $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dK().k());
   }

   public void a(cvk $$0, bof $$1) {
      $$1.g($$1.dm().d(1.0, 0.0, 1.0));
   }

   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return new cpq(this);
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

   protected void a(cwe $$0, cia $$1, ib $$2, dme $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dme a(cwe $$0, ib $$1, dme $$2, cia $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(aue.aV)) {
         cgr.a($$3, false);
      }

      $$0.a(dqr.f, $$1, dqr.a.a($$3, $$2));
      return $$2;
   }

   public void a(dme $$0, cwe $$1, ib $$2, cxd.c $$3) {
   }

   public boolean a(cvw $$0) {
      return true;
   }

   protected void a(dmf.a<czf, dme> $$0) {
   }

   public dmf<czf, dme> n() {
      return this.E;
   }

   protected final void k(dme $$0) {
      this.d = $$0;
   }

   public final dme o() {
      return this.d;
   }

   public final dme l(dme $$0) {
      dme $$1 = this.o();

      for (dnh<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dme a(dme $$0, dme $$1, dnh<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cpl l() {
      if (this.f == null) {
         this.f = cpl.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + kh.e.b(this) + "}";
   }

   public void a(cpq $$0, @Nullable cvk $$1, List<vs> $$2, crh $$3, @Nullable iy $$4) {
   }

   @Override
   protected czf q() {
      return this;
   }

   protected ImmutableMap<dme, epo> a(Function<dme, epo> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public il.c<czf> r() {
      return this.b;
   }

   protected void a(apa $$0, ib $$1, cpq $$2, blq $$3) {
      if (cua.a(cuc.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dme a;
      private final dme b;
      private final ih c;

      public a(dme $$0, dme $$1, ih $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof czf.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
