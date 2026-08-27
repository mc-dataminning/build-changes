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

public class csm extends dez implements cpl {
   private static final Logger a = LogUtils.getLogger();
   private final he.c<csm> b = jb.f.f(this);
   public static final hk<dfa> o = new hk<>();
   private static final LoadingCache<ehx, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ehx, Boolean>() {
      public Boolean a(ehx $$0) {
         return !ehu.c(ehu.b(), $$0, ehi.g);
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
   protected final dfb<csm, dfa> C;
   private dfa d;
   @Nullable
   private String e;
   @Nullable
   private cit f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<csm.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<csm.a> $$0 = new Object2ByteLinkedOpenHashMap<csm.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   public static int i(@Nullable dfa $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = o.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dfa a(int $$0) {
      dfa $$1 = o.a($$0);
      return $$1 == null ? csn.a.n() : $$1;
   }

   public static csm a(@Nullable cit $$0) {
      return $$0 instanceof cgr ? ((cgr)$$0).e() : csn.a;
   }

   public static dfa a(dfa $$0, dfa $$1, cpn $$2, gu $$3) {
      ehx $$4 = ehu.b($$0.k($$2, $$3), $$1.k($$2, $$3), ehi.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bii $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ehu.a(ha.a.b, $$6.cG().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ehx a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ehu.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dfa b(dfa $$0, cpn $$1, gu $$2) {
      dfa $$3 = $$0;
      gu.a $$4 = new gu.a();

      for (ha $$5 : aD) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dfa $$0, dfa $$1, cpn $$2, gu $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dfa $$0, dfa $$1, cpn $$2, gu $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.i()) {
            if (!$$2.r_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public csm(dez.d $$0) {
      super($$0);
      dfb.a<csm, dfa> $$1 = new dfb.a<>(this);
      this.a($$1);
      this.C = $$1.a(csm::n, dfa::new);
      this.k(this.C.b());
      if (aa.aS) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dfa $$0) {
      return $$0.b() instanceof cwt || $$0.a(csn.hW) || $$0.a(csn.ef) || $$0.a(csn.eg) || $$0.a(csn.fa) || $$0.a(csn.dV) || $$0.a(apl.aQ);
   }

   public boolean e_(dfa $$0) {
      return this.aG;
   }

   public static boolean a(dfa $$0, cos $$1, gu $$2, ha $$3, gu $$4) {
      dfa $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         csm.a $$6 = new csm.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<csm.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ehx $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ehx $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ehu.c($$9, $$10, ehi.e);
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

   public static boolean c(cos $$0, gu $$1) {
      return $$0.a_($$1).a($$0, $$1, ha.b, dao.c);
   }

   public static boolean a(cpp $$0, gu $$1, ha $$2) {
      dfa $$3 = $$0.a_($$1);
      return $$2 == ha.a && $$3.a(apl.aY) ? false : $$3.a($$0, $$1, $$2, dao.b);
   }

   public static boolean a(ehx $$0, ha $$1) {
      ehx $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ehx $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean c(dfa $$0, cos $$1, gu $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
   }

   public void a(cpn $$0, gu $$1, dfa $$2) {
   }

   public static List<ciy> a(dfa $$0, akk $$1, gu $$2, @Nullable dcm $$3) {
      ecn.a $$4 = new ecn.a($$1).a(ees.f, ehe.b($$2)).a(ees.i, ciy.b).b(ees.h, $$3);
      return $$0.a($$4);
   }

   public static List<ciy> a(dfa $$0, akk $$1, gu $$2, @Nullable dcm $$3, @Nullable bii $$4, ciy $$5) {
      ecn.a $$6 = new ecn.a($$1).a(ees.f, ehe.b($$2)).a(ees.i, $$5).b(ees.a, $$4).b(ees.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dfa $$0, cpm $$1, gu $$2) {
      if ($$1 instanceof akk) {
         a($$0, (akk)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((akk)$$1, $$2, ciy.b, true);
      }
   }

   public static void a(dfa $$0, cpn $$1, gu $$2, @Nullable dcm $$3) {
      if ($$1 instanceof akk) {
         a($$0, (akk)$$1, $$2, $$3).forEach($$2x -> a((cpm)((akk)$$1), $$2, $$2x));
         $$0.a((akk)$$1, $$2, ciy.b, true);
      }
   }

   public static void a(dfa $$0, cpm $$1, gu $$2, @Nullable dcm $$3, @Nullable bii $$4, ciy $$5) {
      if ($$1 instanceof akk) {
         a($$0, (akk)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((akk)$$1, $$2, $$5, true);
      }
   }

   public static void a(cpm $$0, gu $$1, ciy $$2) {
      double $$3 = (double)bim.ad.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + arp.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + arp.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + arp.a($$0.z, -0.25, 0.25);
      a($$0, () -> new byg($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cpm $$0, gu $$1, ha $$2, ciy $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bim.ad.k() / 2.0;
      double $$8 = (double)bim.ad.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? arp.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? arp.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? arp.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? arp.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? arp.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? arp.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new byg($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cpm $$0, Supplier<byg> $$1, ciy $$2) {
      if (!$$0.B && !$$2.b() && $$0.X().b(cpi.g)) {
         byg $$3 = $$1.get();
         $$3.o();
         $$0.b($$3);
      }
   }

   protected void a(akk $$0, gu $$1, int $$2) {
      if ($$0.X().b(cpi.g)) {
         bio.a($$0, ehe.b($$1), $$2);
      }
   }

   public float d() {
      return this.aF;
   }

   public void a(cpm $$0, gu $$1, cpe $$2) {
   }

   public void a(cpm $$0, gu $$1, dfa $$2, bii $$3) {
   }

   @Nullable
   public dfa a(clg $$0) {
      return this.n();
   }

   public void a(cpm $$0, cbn $$1, gu $$2, dfa $$3, @Nullable dcm $$4, ciy $$5) {
      $$1.b(apg.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cpm $$0, gu $$1, dfa $$2, @Nullable biy $$3, ciy $$4) {
   }

   public boolean a(dfa $$0) {
      return !$$0.e() && !$$0.k();
   }

   public ts e() {
      return tf.c(this.f());
   }

   public String f() {
      if (this.e == null) {
         this.e = ac.a("block", jb.f.b(this));
      }

      return this.e;
   }

   public void a(cpm $$0, dfa $$1, gu $$2, bii $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dL().k());
   }

   public void a(cos $$0, bii $$1) {
      $$1.f($$1.dn().d(1.0, 0.0, 1.0));
   }

   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return new ciy(this);
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

   protected void a(cpm $$0, cbn $$1, gu $$2, dfa $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public void a(cpm $$0, gu $$1, dfa $$2, cbn $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(apl.aV)) {
         cae.a($$3, false);
      }

      $$0.a(djk.f, $$1, djk.a.a($$3, $$2));
   }

   public void a(dfa $$0, cpm $$1, gu $$2, cqk.c $$3) {
   }

   public boolean a(cpe $$0) {
      return true;
   }

   protected void a(dfb.a<csm, dfa> $$0) {
   }

   public dfb<csm, dfa> l() {
      return this.C;
   }

   protected final void k(dfa $$0) {
      this.d = $$0;
   }

   public final dfa n() {
      return this.d;
   }

   public final dfa l(dfa $$0) {
      dfa $$1 = this.n();

      for (dgd<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dfa a(dfa $$0, dfa $$1, dgd<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public czz m(dfa $$0) {
      return this.aH;
   }

   @Override
   public cit k() {
      if (this.f == null) {
         this.f = cit.a(this);
      }

      return this.f;
   }

   public boolean o() {
      return this.aL;
   }

   @Override
   public String toString() {
      return "Block{" + jb.f.b(this) + "}";
   }

   public void a(ciy $$0, @Nullable cos $$1, List<tf> $$2, ckp $$3) {
   }

   @Override
   protected csm p() {
      return this;
   }

   protected ImmutableMap<dfa, ehx> a(Function<dfa, ehx> $$0) {
      return this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public he.c<csm> q() {
      return this.b;
   }

   protected void a(akk $$0, gu $$1, ciy $$2, bfv $$3) {
      if (cnh.a(cnj.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dfa a;
      private final dfa b;
      private final ha c;

      public a(dfa $$0, dfa $$1, ha $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof csm.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
