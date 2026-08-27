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

public class csl extends dey implements cpk {
   private static final Logger a = LogUtils.getLogger();
   private final he.c<csl> b = jb.f.f(this);
   public static final hk<dez> o = new hk<>();
   private static final LoadingCache<ehw, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ehw, Boolean>() {
      public Boolean a(ehw $$0) {
         return !eht.c(eht.b(), $$0, ehh.g);
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
   protected final dfa<csl, dez> C;
   private dez d;
   @Nullable
   private String e;
   @Nullable
   private cis f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<csl.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<csl.a> $$0 = new Object2ByteLinkedOpenHashMap<csl.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   public static int i(@Nullable dez $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = o.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dez a(int $$0) {
      dez $$1 = o.a($$0);
      return $$1 == null ? csm.a.n() : $$1;
   }

   public static csl a(@Nullable cis $$0) {
      return $$0 instanceof cgq ? ((cgq)$$0).e() : csm.a;
   }

   public static dez a(dez $$0, dez $$1, cpm $$2, gu $$3) {
      ehw $$4 = eht.b($$0.k($$2, $$3), $$1.k($$2, $$3), ehh.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bii $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = eht.a(ha.a.b, $$6.cG().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ehw a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return eht.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dez b(dez $$0, cpm $$1, gu $$2) {
      dez $$3 = $$0;
      gu.a $$4 = new gu.a();

      for (ha $$5 : aD) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dez $$0, dez $$1, cpm $$2, gu $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dez $$0, dez $$1, cpm $$2, gu $$3, int $$4, int $$5) {
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

   public csl(dey.d $$0) {
      super($$0);
      dfa.a<csl, dez> $$1 = new dfa.a<>(this);
      this.a($$1);
      this.C = $$1.a(csl::n, dez::new);
      this.k(this.C.b());
      if (aa.aS) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dez $$0) {
      return $$0.b() instanceof cws || $$0.a(csm.hW) || $$0.a(csm.ef) || $$0.a(csm.eg) || $$0.a(csm.fa) || $$0.a(csm.dV) || $$0.a(apl.aQ);
   }

   public boolean e_(dez $$0) {
      return this.aG;
   }

   public static boolean a(dez $$0, cor $$1, gu $$2, ha $$3, gu $$4) {
      dez $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         csl.a $$6 = new csl.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<csl.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ehw $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ehw $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = eht.c($$9, $$10, ehh.e);
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

   public static boolean c(cor $$0, gu $$1) {
      return $$0.a_($$1).a($$0, $$1, ha.b, dan.c);
   }

   public static boolean a(cpo $$0, gu $$1, ha $$2) {
      dez $$3 = $$0.a_($$1);
      return $$2 == ha.a && $$3.a(apl.aY) ? false : $$3.a($$0, $$1, $$2, dan.b);
   }

   public static boolean a(ehw $$0, ha $$1) {
      ehw $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ehw $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean c(dez $$0, cor $$1, gu $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
   }

   public void a(cpm $$0, gu $$1, dez $$2) {
   }

   public static List<cix> a(dez $$0, akk $$1, gu $$2, @Nullable dcl $$3) {
      ecm.a $$4 = new ecm.a($$1).a(eer.f, ehd.b($$2)).a(eer.i, cix.b).b(eer.h, $$3);
      return $$0.a($$4);
   }

   public static List<cix> a(dez $$0, akk $$1, gu $$2, @Nullable dcl $$3, @Nullable bii $$4, cix $$5) {
      ecm.a $$6 = new ecm.a($$1).a(eer.f, ehd.b($$2)).a(eer.i, $$5).b(eer.a, $$4).b(eer.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dez $$0, cpl $$1, gu $$2) {
      if ($$1 instanceof akk) {
         a($$0, (akk)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((akk)$$1, $$2, cix.b, true);
      }
   }

   public static void a(dez $$0, cpm $$1, gu $$2, @Nullable dcl $$3) {
      if ($$1 instanceof akk) {
         a($$0, (akk)$$1, $$2, $$3).forEach($$2x -> a((cpl)((akk)$$1), $$2, $$2x));
         $$0.a((akk)$$1, $$2, cix.b, true);
      }
   }

   public static void a(dez $$0, cpl $$1, gu $$2, @Nullable dcl $$3, @Nullable bii $$4, cix $$5) {
      if ($$1 instanceof akk) {
         a($$0, (akk)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((akk)$$1, $$2, $$5, true);
      }
   }

   public static void a(cpl $$0, gu $$1, cix $$2) {
      double $$3 = (double)bim.ad.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + arp.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + arp.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + arp.a($$0.z, -0.25, 0.25);
      a($$0, () -> new byf($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cpl $$0, gu $$1, ha $$2, cix $$3) {
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
      a($$0, () -> new byf($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cpl $$0, Supplier<byf> $$1, cix $$2) {
      if (!$$0.B && !$$2.b() && $$0.X().b(cph.g)) {
         byf $$3 = $$1.get();
         $$3.o();
         $$0.b($$3);
      }
   }

   protected void a(akk $$0, gu $$1, int $$2) {
      if ($$0.X().b(cph.g)) {
         bio.a($$0, ehd.b($$1), $$2);
      }
   }

   public float d() {
      return this.aF;
   }

   public void a(cpl $$0, gu $$1, cpd $$2) {
   }

   public void a(cpl $$0, gu $$1, dez $$2, bii $$3) {
   }

   @Nullable
   public dez a(clf $$0) {
      return this.n();
   }

   public void a(cpl $$0, cbm $$1, gu $$2, dez $$3, @Nullable dcl $$4, cix $$5) {
      $$1.b(apg.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cpl $$0, gu $$1, dez $$2, @Nullable biy $$3, cix $$4) {
   }

   public boolean a(dez $$0) {
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

   public void a(cpl $$0, dez $$1, gu $$2, bii $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dL().k());
   }

   public void a(cor $$0, bii $$1) {
      $$1.f($$1.dn().d(1.0, 0.0, 1.0));
   }

   public cix a(cor $$0, gu $$1, dez $$2) {
      return new cix(this);
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

   protected void a(cpl $$0, cbm $$1, gu $$2, dez $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public void a(cpl $$0, gu $$1, dez $$2, cbm $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(apl.aV)) {
         cad.a($$3, false);
      }

      $$0.a(djj.f, $$1, djj.a.a($$3, $$2));
   }

   public void a(dez $$0, cpl $$1, gu $$2, cqj.c $$3) {
   }

   public boolean a(cpd $$0) {
      return true;
   }

   protected void a(dfa.a<csl, dez> $$0) {
   }

   public dfa<csl, dez> l() {
      return this.C;
   }

   protected final void k(dez $$0) {
      this.d = $$0;
   }

   public final dez n() {
      return this.d;
   }

   public final dez l(dez $$0) {
      dez $$1 = this.n();

      for (dgc<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dez a(dez $$0, dez $$1, dgc<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public czy m(dez $$0) {
      return this.aH;
   }

   @Override
   public cis k() {
      if (this.f == null) {
         this.f = cis.a(this);
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

   public void a(cix $$0, @Nullable cor $$1, List<tf> $$2, cko $$3) {
   }

   @Override
   protected csl p() {
      return this;
   }

   protected ImmutableMap<dez, ehw> a(Function<dez, ehw> $$0) {
      return this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public he.c<csl> q() {
      return this.b;
   }

   protected void a(akk $$0, gu $$1, cix $$2, bfv $$3) {
      if (cng.a(cni.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dez a;
      private final dez b;
      private final ha c;

      public a(dez $$0, dez $$1, ha $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof csl.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
