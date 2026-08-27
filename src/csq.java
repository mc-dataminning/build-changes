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

public class csq extends dfd implements cpp {
   private static final Logger a = LogUtils.getLogger();
   private final hg.c<csq> b = jd.f.f(this);
   public static final hm<dfe> o = new hm<>();
   private static final LoadingCache<eib, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<eib, Boolean>() {
      public Boolean a(eib $$0) {
         return !ehy.c(ehy.b(), $$0, ehm.g);
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
   protected final dff<csq, dfe> C;
   private dfe d;
   @Nullable
   private String e;
   @Nullable
   private civ f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<csq.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<csq.a> $$0 = new Object2ByteLinkedOpenHashMap<csq.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   public static int i(@Nullable dfe $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = o.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dfe a(int $$0) {
      dfe $$1 = o.a($$0);
      return $$1 == null ? csr.a.n() : $$1;
   }

   public static csq a(@Nullable civ $$0) {
      return $$0 instanceof cgt ? ((cgt)$$0).e() : csr.a;
   }

   public static dfe a(dfe $$0, dfe $$1, cpr $$2, gw $$3) {
      eib $$4 = ehy.b($$0.k($$2, $$3), $$1.k($$2, $$3), ehm.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bil $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ehy.a(hc.a.b, $$6.cG().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static eib a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ehy.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dfe b(dfe $$0, cpr $$1, gw $$2) {
      dfe $$3 = $$0;
      gw.a $$4 = new gw.a();

      for (hc $$5 : aD) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dfe $$0, dfe $$1, cpr $$2, gw $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dfe $$0, dfe $$1, cpr $$2, gw $$3, int $$4, int $$5) {
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

   public csq(dfd.d $$0) {
      super($$0);
      dff.a<csq, dfe> $$1 = new dff.a<>(this);
      this.a($$1);
      this.C = $$1.a(csq::n, dfe::new);
      this.k(this.C.b());
      if (aa.aS) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dfe $$0) {
      return $$0.b() instanceof cwx || $$0.a(csr.hW) || $$0.a(csr.ef) || $$0.a(csr.eg) || $$0.a(csr.fa) || $$0.a(csr.dV) || $$0.a(apo.aQ);
   }

   public boolean e_(dfe $$0) {
      return this.aG;
   }

   public static boolean a(dfe $$0, cow $$1, gw $$2, hc $$3, gw $$4) {
      dfe $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         csq.a $$6 = new csq.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<csq.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            eib $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               eib $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ehy.c($$9, $$10, ehm.e);
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

   public static boolean c(cow $$0, gw $$1) {
      return $$0.a_($$1).a($$0, $$1, hc.b, das.c);
   }

   public static boolean a(cpt $$0, gw $$1, hc $$2) {
      dfe $$3 = $$0.a_($$1);
      return $$2 == hc.a && $$3.a(apo.aY) ? false : $$3.a($$0, $$1, $$2, das.b);
   }

   public static boolean a(eib $$0, hc $$1) {
      eib $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(eib $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean c(dfe $$0, cow $$1, gw $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
   }

   public void a(cpr $$0, gw $$1, dfe $$2) {
   }

   public static List<cja> a(dfe $$0, akn $$1, gw $$2, @Nullable dcq $$3) {
      ecr.a $$4 = new ecr.a($$1).a(eew.f, ehi.b($$2)).a(eew.i, cja.b).b(eew.h, $$3);
      return $$0.a($$4);
   }

   public static List<cja> a(dfe $$0, akn $$1, gw $$2, @Nullable dcq $$3, @Nullable bil $$4, cja $$5) {
      ecr.a $$6 = new ecr.a($$1).a(eew.f, ehi.b($$2)).a(eew.i, $$5).b(eew.a, $$4).b(eew.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dfe $$0, cpq $$1, gw $$2) {
      if ($$1 instanceof akn) {
         a($$0, (akn)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((akn)$$1, $$2, cja.b, true);
      }
   }

   public static void a(dfe $$0, cpr $$1, gw $$2, @Nullable dcq $$3) {
      if ($$1 instanceof akn) {
         a($$0, (akn)$$1, $$2, $$3).forEach($$2x -> a((cpq)((akn)$$1), $$2, $$2x));
         $$0.a((akn)$$1, $$2, cja.b, true);
      }
   }

   public static void a(dfe $$0, cpq $$1, gw $$2, @Nullable dcq $$3, @Nullable bil $$4, cja $$5) {
      if ($$1 instanceof akn) {
         a($$0, (akn)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((akn)$$1, $$2, $$5, true);
      }
   }

   public static void a(cpq $$0, gw $$1, cja $$2) {
      double $$3 = (double)bip.ad.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ars.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ars.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ars.a($$0.z, -0.25, 0.25);
      a($$0, () -> new byi($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cpq $$0, gw $$1, hc $$2, cja $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bip.ad.k() / 2.0;
      double $$8 = (double)bip.ad.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ars.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ars.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ars.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ars.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ars.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ars.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new byi($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cpq $$0, Supplier<byi> $$1, cja $$2) {
      if (!$$0.B && !$$2.b() && $$0.X().b(cpm.g)) {
         byi $$3 = $$1.get();
         $$3.o();
         $$0.b($$3);
      }
   }

   protected void a(akn $$0, gw $$1, int $$2) {
      if ($$0.X().b(cpm.g)) {
         bir.a($$0, ehi.b($$1), $$2);
      }
   }

   public float d() {
      return this.aF;
   }

   public void a(cpq $$0, gw $$1, cpi $$2) {
   }

   public void a(cpq $$0, gw $$1, dfe $$2, bil $$3) {
   }

   @Nullable
   public dfe a(cli $$0) {
      return this.n();
   }

   public void a(cpq $$0, cbp $$1, gw $$2, dfe $$3, @Nullable dcq $$4, cja $$5) {
      $$1.b(apj.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cpq $$0, gw $$1, dfe $$2, @Nullable bjb $$3, cja $$4) {
   }

   public boolean a(dfe $$0) {
      return !$$0.e() && !$$0.k();
   }

   public tv e() {
      return ti.c(this.f());
   }

   public String f() {
      if (this.e == null) {
         this.e = ac.a("block", jd.f.b(this));
      }

      return this.e;
   }

   public void a(cpq $$0, dfe $$1, gw $$2, bil $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dL().k());
   }

   public void a(cow $$0, bil $$1) {
      $$1.f($$1.dn().d(1.0, 0.0, 1.0));
   }

   public cja a(cow $$0, gw $$1, dfe $$2) {
      return new cja(this);
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

   protected void a(cpq $$0, cbp $$1, gw $$2, dfe $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public void a(cpq $$0, gw $$1, dfe $$2, cbp $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(apo.aV)) {
         cag.a($$3, false);
      }

      $$0.a(djo.f, $$1, djo.a.a($$3, $$2));
   }

   public void a(dfe $$0, cpq $$1, gw $$2, cqo.c $$3) {
   }

   public boolean a(cpi $$0) {
      return true;
   }

   protected void a(dff.a<csq, dfe> $$0) {
   }

   public dff<csq, dfe> l() {
      return this.C;
   }

   protected final void k(dfe $$0) {
      this.d = $$0;
   }

   public final dfe n() {
      return this.d;
   }

   public final dfe l(dfe $$0) {
      dfe $$1 = this.n();

      for (dgh<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dfe a(dfe $$0, dfe $$1, dgh<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public dad m(dfe $$0) {
      return this.aH;
   }

   @Override
   public civ k() {
      if (this.f == null) {
         this.f = civ.a(this);
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

   public void a(cja $$0, @Nullable cow $$1, List<ti> $$2, ckr $$3) {
   }

   @Override
   protected csq p() {
      return this;
   }

   protected ImmutableMap<dfe, eib> a(Function<dfe, eib> $$0) {
      return this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public hg.c<csq> q() {
      return this.b;
   }

   protected void a(akn $$0, gw $$1, cja $$2, bfy $$3) {
      if (cnl.a(cnn.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dfe a;
      private final dfe b;
      private final hc c;

      public a(dfe $$0, dfe $$1, hc $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof csq.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
