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

public class cpn extends dca implements cml {
   private static final Logger a = LogUtils.getLogger();
   private final he.c<cpn> b = jb.f.f(this);
   public static final hk<dcb> o = new hk<>();
   private static final LoadingCache<efb, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<efb, Boolean>() {
      public Boolean a(efb $$0) {
         return !eey.c(eey.b(), $$0, eem.g);
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
   protected final dcc<cpn, dcb> C;
   private dcb d;
   @Nullable
   private String e;
   @Nullable
   private cfu f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cpn.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cpn.a> $$0 = new Object2ByteLinkedOpenHashMap<cpn.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   public static int i(@Nullable dcb $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = o.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dcb a(int $$0) {
      dcb $$1 = o.a($$0);
      return $$1 == null ? cpo.a.n() : $$1;
   }

   public static cpn a(@Nullable cfu $$0) {
      return $$0 instanceof cds ? ((cds)$$0).e() : cpo.a;
   }

   public static dcb a(dcb $$0, dcb $$1, cmn $$2, gu $$3) {
      efb $$4 = eey.b($$0.k($$2, $$3), $$1.k($$2, $$3), eem.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.b()) {
         return $$1;
      } else {
         for (bfj $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = eey.a(ha.a.b, $$6.cE().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static efb a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return eey.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dcb b(dcb $$0, cmn $$1, gu $$2) {
      dcb $$3 = $$0;
      gu.a $$4 = new gu.a();

      for (ha $$5 : aD) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dcb $$0, dcb $$1, cmn $$2, gu $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dcb $$0, dcb $$1, cmn $$2, gu $$3, int $$4, int $$5) {
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

   public cpn(dca.d $$0) {
      super($$0);
      dcc.a<cpn, dcb> $$1 = new dcc.a<>(this);
      this.a($$1);
      this.C = $$1.a(cpn::n, dcb::new);
      this.k(this.C.b());
      if (aa.aS) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dcb $$0) {
      return $$0.b() instanceof ctu || $$0.a(cpo.hW) || $$0.a(cpo.ef) || $$0.a(cpo.eg) || $$0.a(cpo.fa) || $$0.a(cpo.dV) || $$0.a(amw.aP);
   }

   public boolean e_(dcb $$0) {
      return this.aG;
   }

   public static boolean a(dcb $$0, cls $$1, gu $$2, ha $$3, gu $$4) {
      dcb $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         cpn.a $$6 = new cpn.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<cpn.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            efb $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.b()) {
               return true;
            } else {
               efb $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = eey.c($$9, $$10, eem.e);
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

   public static boolean c(cls $$0, gu $$1) {
      return $$0.a_($$1).a($$0, $$1, ha.b, cxp.c);
   }

   public static boolean a(cmp $$0, gu $$1, ha $$2) {
      dcb $$3 = $$0.a_($$1);
      return $$2 == ha.a && $$3.a(amw.aX) ? false : $$3.a($$0, $$1, $$2, cxp.b);
   }

   public static boolean a(efb $$0, ha $$1) {
      efb $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(efb $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean c(dcb $$0, cls $$1, gu $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
   }

   public void a(cmn $$0, gu $$1, dcb $$2) {
   }

   public static List<cfz> a(dcb $$0, aif $$1, gu $$2, @Nullable czn $$3) {
      dzq.a $$4 = new dzq.a($$1).a(ebw.f, eei.b($$2)).a(ebw.i, cfz.b).b(ebw.h, $$3);
      return $$0.a($$4);
   }

   public static List<cfz> a(dcb $$0, aif $$1, gu $$2, @Nullable czn $$3, @Nullable bfj $$4, cfz $$5) {
      dzq.a $$6 = new dzq.a($$1).a(ebw.f, eei.b($$2)).a(ebw.i, $$5).b(ebw.a, $$4).b(ebw.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dcb $$0, cmm $$1, gu $$2) {
      if ($$1 instanceof aif) {
         a($$0, (aif)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aif)$$1, $$2, cfz.b, true);
      }
   }

   public static void a(dcb $$0, cmn $$1, gu $$2, @Nullable czn $$3) {
      if ($$1 instanceof aif) {
         a($$0, (aif)$$1, $$2, $$3).forEach($$2x -> a((cmm)((aif)$$1), $$2, $$2x));
         $$0.a((aif)$$1, $$2, cfz.b, true);
      }
   }

   public static void a(dcb $$0, cmm $$1, gu $$2, @Nullable czn $$3, @Nullable bfj $$4, cfz $$5) {
      if ($$1 instanceof aif) {
         a($$0, (aif)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aif)$$1, $$2, $$5, true);
      }
   }

   public static void a(cmm $$0, gu $$1, cfz $$2) {
      double $$3 = (double)bfn.ad.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + apa.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + apa.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + apa.a($$0.z, -0.25, 0.25);
      a($$0, () -> new bvh($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cmm $$0, gu $$1, ha $$2, cfz $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bfn.ad.k() / 2.0;
      double $$8 = (double)bfn.ad.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? apa.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? apa.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? apa.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? apa.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? apa.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? apa.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new bvh($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cmm $$0, Supplier<bvh> $$1, cfz $$2) {
      if (!$$0.B && !$$2.b() && $$0.X().b(cmi.g)) {
         bvh $$3 = $$1.get();
         $$3.o();
         $$0.b($$3);
      }
   }

   protected void a(aif $$0, gu $$1, int $$2) {
      if ($$0.X().b(cmi.g)) {
         bfp.a($$0, eei.b($$1), $$2);
      }
   }

   public float d() {
      return this.aF;
   }

   public void a(cmm $$0, gu $$1, cme $$2) {
   }

   public void a(cmm $$0, gu $$1, dcb $$2, bfj $$3) {
   }

   @Nullable
   public dcb a(cih $$0) {
      return this.n();
   }

   public void a(cmm $$0, byo $$1, gu $$2, dcb $$3, @Nullable czn $$4, cfz $$5) {
      $$1.b(amr.a.b(this));
      $$1.z(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cmm $$0, gu $$1, dcb $$2, @Nullable bfz $$3, cfz $$4) {
   }

   public boolean a(dcb $$0) {
      return !$$0.e() && !$$0.k();
   }

   public tj e() {
      return sw.c(this.f());
   }

   public String f() {
      if (this.e == null) {
         this.e = ac.a("block", jb.f.b(this));
      }

      return this.e;
   }

   public void a(cmm $$0, dcb $$1, gu $$2, bfj $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dJ().k());
   }

   public void a(cls $$0, bfj $$1) {
      $$1.f($$1.dl().d(1.0, 0.0, 1.0));
   }

   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return new cfz(this);
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

   protected void a(cmm $$0, byo $$1, gu $$2, dcb $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public void a(cmm $$0, gu $$1, dcb $$2, byo $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(amw.aU)) {
         bxf.a($$3, false);
      }

      $$0.a(dgl.f, $$1, dgl.a.a($$3, $$2));
   }

   public void a(dcb $$0, cmm $$1, gu $$2, cnk.c $$3) {
   }

   public boolean a(cme $$0) {
      return true;
   }

   protected void a(dcc.a<cpn, dcb> $$0) {
   }

   public dcc<cpn, dcb> l() {
      return this.C;
   }

   protected final void k(dcb $$0) {
      this.d = $$0;
   }

   public final dcb n() {
      return this.d;
   }

   public final dcb l(dcb $$0) {
      dcb $$1 = this.n();

      for (dde<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dcb a(dcb $$0, dcb $$1, dde<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public cxa m(dcb $$0) {
      return this.aH;
   }

   @Override
   public cfu k() {
      if (this.f == null) {
         this.f = cfu.a(this);
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

   public void a(cfz $$0, @Nullable cls $$1, List<sw> $$2, chq $$3) {
   }

   @Override
   protected cpn p() {
      return this;
   }

   protected ImmutableMap<dcb, efb> a(Function<dcb, efb> $$0) {
      return this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public he.c<cpn> q() {
      return this.b;
   }

   protected void a(aif $$0, gu $$1, cfz $$2, bdc $$3) {
      if (cki.a(ckk.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dcb a;
      private final dcb b;
      private final ha c;

      public a(dcb $$0, dcb $$1, ha $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof cpn.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
