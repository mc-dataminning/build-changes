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

public class cys extends dli implements cvq {
   public static final MapCodec<cys> p = b(cys::new);
   private static final Logger a = LogUtils.getLogger();
   private final ij.c<cys> b = kf.e.g(this);
   public static final ip<dlj> q = new ip<>();
   private static final LoadingCache<eos, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<eos, Boolean>() {
      public Boolean a(eos $$0) {
         return !eop.c(eop.b(), $$0, eod.g);
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
   protected final dlk<cys, dlj> E;
   private dlj d;
   @Nullable
   private String e;
   @Nullable
   private coy f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cys.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cys.a> $$0 = new Object2ByteLinkedOpenHashMap<cys.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends cys> a() {
      return p;
   }

   public static int i(@Nullable dlj $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dlj a(int $$0) {
      dlj $$1 = q.a($$0);
      return $$1 == null ? cyu.a.o() : $$1;
   }

   public static cys a(@Nullable coy $$0) {
      return $$0 instanceof cmw ? ((cmw)$$0).e() : cyu.a;
   }

   public static dlj a(dlj $$0, dlj $$1, cvs $$2, hz $$3) {
      eos $$4 = eop.b($$0.k($$2, $$3), $$1.k($$2, $$3), eod.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bnq $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = eop.a(ie.a.b, $$6.cH().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static eos a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return eop.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dlj b(dlj $$0, cvs $$1, hz $$2) {
      dlj $$3 = $$0;
      hz.a $$4 = new hz.a();

      for (ie $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dlj $$0, dlj $$1, cvs $$2, hz $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dlj $$0, dlj $$1, cvs $$2, hz $$3, int $$4, int $$5) {
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

   public cys(dli.d $$0) {
      super($$0);
      dlk.a<cys, dlj> $$1 = new dlk.a<>(this);
      this.a($$1);
      this.E = $$1.a(cys::o, dlj::new);
      this.k(this.E.b());
      if (aa.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dlj $$0) {
      return $$0.b() instanceof ddb || $$0.a(cyu.hW) || $$0.a(cyu.ee) || $$0.a(cyu.ef) || $$0.a(cyu.fa) || $$0.a(cyu.eZ) || $$0.a(aua.aQ);
   }

   public static boolean a(dlj $$0, cux $$1, hz $$2, ie $$3, hz $$4) {
      dlj $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         cys.a $$6 = new cys.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<cys.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            eos $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               eos $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = eop.c($$9, $$10, eod.e);
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

   public static boolean c(cux $$0, hz $$1) {
      return $$0.a_($$1).a($$0, $$1, ie.b, dgs.c);
   }

   public static boolean a(cvu $$0, hz $$1, ie $$2) {
      dlj $$3 = $$0.a_($$1);
      return $$2 == ie.a && $$3.a(aua.aY) ? false : $$3.a($$0, $$1, $$2, dgs.b);
   }

   public static boolean a(eos $$0, ie $$1) {
      eos $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(eos $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
   }

   public void a(cvs $$0, hz $$1, dlj $$2) {
   }

   public static List<cpd> a(dlj $$0, aow $$1, hz $$2, @Nullable dix $$3) {
      eji.a $$4 = new eji.a($$1).a(eln.f, enz.b($$2)).a(eln.i, cpd.h).b(eln.h, $$3);
      return $$0.a($$4);
   }

   public static List<cpd> a(dlj $$0, aow $$1, hz $$2, @Nullable dix $$3, @Nullable bnq $$4, cpd $$5) {
      eji.a $$6 = new eji.a($$1).a(eln.f, enz.b($$2)).a(eln.i, $$5).b(eln.a, $$4).b(eln.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dlj $$0, cvr $$1, hz $$2) {
      if ($$1 instanceof aow) {
         a($$0, (aow)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aow)$$1, $$2, cpd.h, true);
      }
   }

   public static void a(dlj $$0, cvs $$1, hz $$2, @Nullable dix $$3) {
      if ($$1 instanceof aow) {
         a($$0, (aow)$$1, $$2, $$3).forEach($$2x -> a((cvr)((aow)$$1), $$2, $$2x));
         $$0.a((aow)$$1, $$2, cpd.h, true);
      }
   }

   public static void a(dlj $$0, cvr $$1, hz $$2, @Nullable dix $$3, @Nullable bnq $$4, cpd $$5) {
      if ($$1 instanceof aow) {
         a($$0, (aow)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aow)$$1, $$2, $$5, true);
      }
   }

   public static void a(cvr $$0, hz $$1, cpd $$2) {
      double $$3 = (double)bnw.af.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + awi.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + awi.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + awi.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cdw($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cvr $$0, hz $$1, ie $$2, cpd $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bnw.af.k() / 2.0;
      double $$8 = (double)bnw.af.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? awi.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? awi.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? awi.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? awi.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? awi.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? awi.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cdw($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cvr $$0, Supplier<cdw> $$1, cpd $$2) {
      if (!$$0.B && !$$2.b() && $$0.Z().b(cvn.h)) {
         cdw $$3 = $$1.get();
         $$3.u();
         $$0.b($$3);
      }
   }

   protected void a(aow $$0, hz $$1, int $$2) {
      if ($$0.Z().b(cvn.h)) {
         bny.a($$0, enz.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(cvr $$0, hz $$1, cvj $$2) {
   }

   public void a(cvr $$0, hz $$1, dlj $$2, bnq $$3) {
   }

   @Nullable
   public dlj a(crk $$0) {
      return this.o();
   }

   public void a(cvr $$0, chl $$1, hz $$2, dlj $$3, @Nullable dix $$4, cpd $$5) {
      $$1.b(atv.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cvr $$0, hz $$1, dlj $$2, @Nullable boi $$3, cpd $$4) {
   }

   public boolean a(dlj $$0) {
      return !$$0.e() && !$$0.k();
   }

   public we f() {
      return vq.c(this.h());
   }

   public String h() {
      if (this.e == null) {
         this.e = ac.a("block", kf.e.b(this));
      }

      return this.e;
   }

   public void a(cvr $$0, dlj $$1, hz $$2, bnq $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dN().k());
   }

   public void a(cux $$0, bnq $$1) {
      $$1.g($$1.dp().d(1.0, 0.0, 1.0));
   }

   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return new cpd(this);
   }

   public float i() {
      return this.aK;
   }

   public float k() {
      return this.aL;
   }

   public float l() {
      return this.aM;
   }

   protected void a(cvr $$0, chl $$1, hz $$2, dlj $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dlj a(cvr $$0, hz $$1, dlj $$2, chl $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(aua.aV)) {
         cgc.a($$3, false);
      }

      $$0.a(dpw.f, $$1, dpw.a.a($$3, $$2));
      return $$2;
   }

   public void a(dlj $$0, cvr $$1, hz $$2, cwq.c $$3) {
   }

   public boolean a(cvj $$0) {
      return true;
   }

   protected void a(dlk.a<cys, dlj> $$0) {
   }

   public dlk<cys, dlj> n() {
      return this.E;
   }

   protected final void k(dlj $$0) {
      this.d = $$0;
   }

   public final dlj o() {
      return this.d;
   }

   public final dlj l(dlj $$0) {
      dlj $$1 = this.o();

      for (dmm<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dlj a(dlj $$0, dlj $$1, dmm<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public coy j() {
      if (this.f == null) {
         this.f = coy.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + kf.e.b(this) + "}";
   }

   public void a(cpd $$0, @Nullable cux $$1, List<vq> $$2, cqu $$3) {
   }

   @Override
   protected cys q() {
      return this;
   }

   protected ImmutableMap<dlj, eos> a(Function<dlj, eos> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ij.c<cys> r() {
      return this.b;
   }

   protected void a(aow $$0, hz $$1, cpd $$2, blb $$3) {
      if (ctn.a(ctp.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dlj a;
      private final dlj b;
      private final ie c;

      public a(dlj $$0, dlj $$1, ie $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof cys.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
