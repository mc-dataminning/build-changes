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

public class csk extends dex implements cpj {
   private static final Logger a = LogUtils.getLogger();
   private final hf.c<csk> b = jc.f.f(this);
   public static final hl<dey> o = new hl<>();
   private static final LoadingCache<ehy, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ehy, Boolean>() {
      public Boolean a(ehy $$0) {
         return !ehv.c(ehv.b(), $$0, ehj.g);
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
   protected final dez<csk, dey> C;
   private dey d;
   @Nullable
   private String e;
   @Nullable
   private cir f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<csk.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<csk.a> $$0 = new Object2ByteLinkedOpenHashMap<csk.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   public static int i(@Nullable dey $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = o.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dey a(int $$0) {
      dey $$1 = o.a($$0);
      return $$1 == null ? csl.a.n() : $$1;
   }

   public static csk a(@Nullable cir $$0) {
      return $$0 instanceof cgp ? ((cgp)$$0).e() : csl.a;
   }

   public static dey a(dey $$0, dey $$1, cpl $$2, gv $$3) {
      ehy $$4 = ehv.b($$0.k($$2, $$3), $$1.k($$2, $$3), ehj.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (big $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ehv.a(hb.a.b, $$6.cG().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ehy a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ehv.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dey b(dey $$0, cpl $$1, gv $$2) {
      dey $$3 = $$0;
      gv.a $$4 = new gv.a();

      for (hb $$5 : aD) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dey $$0, dey $$1, cpl $$2, gv $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dey $$0, dey $$1, cpl $$2, gv $$3, int $$4, int $$5) {
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

   public csk(dex.d $$0) {
      super($$0);
      dez.a<csk, dey> $$1 = new dez.a<>(this);
      this.a($$1);
      this.C = $$1.a(csk::n, dey::new);
      this.k(this.C.b());
      if (aa.aS) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dey $$0) {
      return $$0.b() instanceof cwr || $$0.a(csl.hW) || $$0.a(csl.ef) || $$0.a(csl.eg) || $$0.a(csl.fa) || $$0.a(csl.dV) || $$0.a(apj.aQ);
   }

   public boolean e_(dey $$0) {
      return this.aG;
   }

   public static boolean a(dey $$0, coq $$1, gv $$2, hb $$3, gv $$4) {
      dey $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         csk.a $$6 = new csk.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<csk.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ehy $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ehy $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ehv.c($$9, $$10, ehj.e);
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

   public static boolean c(coq $$0, gv $$1) {
      return $$0.a_($$1).a($$0, $$1, hb.b, dam.c);
   }

   public static boolean a(cpn $$0, gv $$1, hb $$2) {
      dey $$3 = $$0.a_($$1);
      return $$2 == hb.a && $$3.a(apj.aY) ? false : $$3.a($$0, $$1, $$2, dam.b);
   }

   public static boolean a(ehy $$0, hb $$1) {
      ehy $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ehy $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean c(dey $$0, coq $$1, gv $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
   }

   public void a(cpl $$0, gv $$1, dey $$2) {
   }

   public static List<ciw> a(dey $$0, aki $$1, gv $$2, @Nullable dck $$3) {
      ecn.a $$4 = new ecn.a($$1).a(eet.f, ehf.b($$2)).a(eet.i, ciw.b).b(eet.h, $$3);
      return $$0.a($$4);
   }

   public static List<ciw> a(dey $$0, aki $$1, gv $$2, @Nullable dck $$3, @Nullable big $$4, ciw $$5) {
      ecn.a $$6 = new ecn.a($$1).a(eet.f, ehf.b($$2)).a(eet.i, $$5).b(eet.a, $$4).b(eet.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dey $$0, cpk $$1, gv $$2) {
      if ($$1 instanceof aki) {
         a($$0, (aki)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aki)$$1, $$2, ciw.b, true);
      }
   }

   public static void a(dey $$0, cpl $$1, gv $$2, @Nullable dck $$3) {
      if ($$1 instanceof aki) {
         a($$0, (aki)$$1, $$2, $$3).forEach($$2x -> a((cpk)((aki)$$1), $$2, $$2x));
         $$0.a((aki)$$1, $$2, ciw.b, true);
      }
   }

   public static void a(dey $$0, cpk $$1, gv $$2, @Nullable dck $$3, @Nullable big $$4, ciw $$5) {
      if ($$1 instanceof aki) {
         a($$0, (aki)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aki)$$1, $$2, $$5, true);
      }
   }

   public static void a(cpk $$0, gv $$1, ciw $$2) {
      double $$3 = (double)bik.ad.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + aro.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + aro.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + aro.a($$0.z, -0.25, 0.25);
      a($$0, () -> new bye($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cpk $$0, gv $$1, hb $$2, ciw $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bik.ad.k() / 2.0;
      double $$8 = (double)bik.ad.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? aro.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? aro.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? aro.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? aro.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? aro.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? aro.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new bye($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cpk $$0, Supplier<bye> $$1, ciw $$2) {
      if (!$$0.B && !$$2.b() && $$0.X().b(cpg.g)) {
         bye $$3 = $$1.get();
         $$3.o();
         $$0.b($$3);
      }
   }

   protected void a(aki $$0, gv $$1, int $$2) {
      if ($$0.X().b(cpg.g)) {
         bim.a($$0, ehf.b($$1), $$2);
      }
   }

   public float d() {
      return this.aF;
   }

   public void a(cpk $$0, gv $$1, cpc $$2) {
   }

   public void a(cpk $$0, gv $$1, dey $$2, big $$3) {
   }

   @Nullable
   public dey a(cle $$0) {
      return this.n();
   }

   public void a(cpk $$0, cbl $$1, gv $$2, dey $$3, @Nullable dck $$4, ciw $$5) {
      $$1.b(ape.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cpk $$0, gv $$1, dey $$2, @Nullable biw $$3, ciw $$4) {
   }

   public boolean a(dey $$0) {
      return !$$0.e() && !$$0.k();
   }

   public tr e() {
      return te.c(this.f());
   }

   public String f() {
      if (this.e == null) {
         this.e = ac.a("block", jc.f.b(this));
      }

      return this.e;
   }

   public void a(cpk $$0, dey $$1, gv $$2, big $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dL().k());
   }

   public void a(coq $$0, big $$1) {
      $$1.f($$1.dn().d(1.0, 0.0, 1.0));
   }

   public ciw a(coq $$0, gv $$1, dey $$2) {
      return new ciw(this);
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

   protected void a(cpk $$0, cbl $$1, gv $$2, dey $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public void a(cpk $$0, gv $$1, dey $$2, cbl $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(apj.aV)) {
         cac.a($$3, false);
      }

      $$0.a(dji.f, $$1, dji.a.a($$3, $$2));
   }

   public void a(dey $$0, cpk $$1, gv $$2, cqi.c $$3) {
   }

   public boolean a(cpc $$0) {
      return true;
   }

   protected void a(dez.a<csk, dey> $$0) {
   }

   public dez<csk, dey> l() {
      return this.C;
   }

   protected final void k(dey $$0) {
      this.d = $$0;
   }

   public final dey n() {
      return this.d;
   }

   public final dey l(dey $$0) {
      dey $$1 = this.n();

      for (dgb<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dey a(dey $$0, dey $$1, dgb<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public czx m(dey $$0) {
      return this.aH;
   }

   @Override
   public cir k() {
      if (this.f == null) {
         this.f = cir.a(this);
      }

      return this.f;
   }

   public boolean o() {
      return this.aL;
   }

   @Override
   public String toString() {
      return "Block{" + jc.f.b(this) + "}";
   }

   public void a(ciw $$0, @Nullable coq $$1, List<te> $$2, ckn $$3) {
   }

   @Override
   protected csk p() {
      return this;
   }

   protected ImmutableMap<dey, ehy> a(Function<dey, ehy> $$0) {
      return this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public hf.c<csk> q() {
      return this.b;
   }

   protected void a(aki $$0, gv $$1, ciw $$2, bft $$3) {
      if (cnf.a(cnh.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dey a;
      private final dey b;
      private final hb c;

      public a(dey $$0, dey $$1, hb $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof csk.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
