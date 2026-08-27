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

public class cyo extends dle implements cvm {
   public static final MapCodec<cyo> p = b(cyo::new);
   private static final Logger a = LogUtils.getLogger();
   private final ij.c<cyo> b = kf.e.g(this);
   public static final ip<dlf> q = new ip<>();
   private static final LoadingCache<eol, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<eol, Boolean>() {
      public Boolean a(eol $$0) {
         return !eoi.c(eoi.b(), $$0, enw.g);
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
   protected final dlg<cyo, dlf> E;
   private dlf d;
   @Nullable
   private String e;
   @Nullable
   private cou f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cyo.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cyo.a> $$0 = new Object2ByteLinkedOpenHashMap<cyo.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends cyo> a() {
      return p;
   }

   public static int i(@Nullable dlf $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dlf a(int $$0) {
      dlf $$1 = q.a($$0);
      return $$1 == null ? cyq.a.o() : $$1;
   }

   public static cyo a(@Nullable cou $$0) {
      return $$0 instanceof cms ? ((cms)$$0).e() : cyq.a;
   }

   public static dlf a(dlf $$0, dlf $$1, cvo $$2, hz $$3) {
      eol $$4 = eoi.b($$0.k($$2, $$3), $$1.k($$2, $$3), enw.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bno $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = eoi.a(ie.a.b, $$6.cH().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static eol a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return eoi.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dlf b(dlf $$0, cvo $$1, hz $$2) {
      dlf $$3 = $$0;
      hz.a $$4 = new hz.a();

      for (ie $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dlf $$0, dlf $$1, cvo $$2, hz $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dlf $$0, dlf $$1, cvo $$2, hz $$3, int $$4, int $$5) {
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

   public cyo(dle.d $$0) {
      super($$0);
      dlg.a<cyo, dlf> $$1 = new dlg.a<>(this);
      this.a($$1);
      this.E = $$1.a(cyo::o, dlf::new);
      this.k(this.E.b());
      if (aa.aU) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dlf $$0) {
      return $$0.b() instanceof dcx || $$0.a(cyq.hW) || $$0.a(cyq.ee) || $$0.a(cyq.ef) || $$0.a(cyq.fa) || $$0.a(cyq.eZ) || $$0.a(atz.aQ);
   }

   public static boolean a(dlf $$0, cut $$1, hz $$2, ie $$3, hz $$4) {
      dlf $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         cyo.a $$6 = new cyo.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<cyo.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            eol $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               eol $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = eoi.c($$9, $$10, enw.e);
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

   public static boolean c(cut $$0, hz $$1) {
      return $$0.a_($$1).a($$0, $$1, ie.b, dgo.c);
   }

   public static boolean a(cvq $$0, hz $$1, ie $$2) {
      dlf $$3 = $$0.a_($$1);
      return $$2 == ie.a && $$3.a(atz.aY) ? false : $$3.a($$0, $$1, $$2, dgo.b);
   }

   public static boolean a(eol $$0, ie $$1) {
      eol $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(eol $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
   }

   public void a(cvo $$0, hz $$1, dlf $$2) {
   }

   public static List<coz> a(dlf $$0, aov $$1, hz $$2, @Nullable dit $$3) {
      ejb.a $$4 = new ejb.a($$1).a(elg.f, ens.b($$2)).a(elg.i, coz.h).b(elg.h, $$3);
      return $$0.a($$4);
   }

   public static List<coz> a(dlf $$0, aov $$1, hz $$2, @Nullable dit $$3, @Nullable bno $$4, coz $$5) {
      ejb.a $$6 = new ejb.a($$1).a(elg.f, ens.b($$2)).a(elg.i, $$5).b(elg.a, $$4).b(elg.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dlf $$0, cvn $$1, hz $$2) {
      if ($$1 instanceof aov) {
         a($$0, (aov)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aov)$$1, $$2, coz.h, true);
      }
   }

   public static void a(dlf $$0, cvo $$1, hz $$2, @Nullable dit $$3) {
      if ($$1 instanceof aov) {
         a($$0, (aov)$$1, $$2, $$3).forEach($$2x -> a((cvn)((aov)$$1), $$2, $$2x));
         $$0.a((aov)$$1, $$2, coz.h, true);
      }
   }

   public static void a(dlf $$0, cvn $$1, hz $$2, @Nullable dit $$3, @Nullable bno $$4, coz $$5) {
      if ($$1 instanceof aov) {
         a($$0, (aov)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aov)$$1, $$2, $$5, true);
      }
   }

   public static void a(cvn $$0, hz $$1, coz $$2) {
      double $$3 = (double)bnu.af.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + awh.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + awh.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + awh.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cds($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cvn $$0, hz $$1, ie $$2, coz $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bnu.af.k() / 2.0;
      double $$8 = (double)bnu.af.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? awh.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? awh.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? awh.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? awh.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? awh.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? awh.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cds($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cvn $$0, Supplier<cds> $$1, coz $$2) {
      if (!$$0.B && !$$2.b() && $$0.Z().b(cvj.h)) {
         cds $$3 = $$1.get();
         $$3.u();
         $$0.b($$3);
      }
   }

   protected void a(aov $$0, hz $$1, int $$2) {
      if ($$0.Z().b(cvj.h)) {
         bnw.a($$0, ens.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(cvn $$0, hz $$1, cvf $$2) {
   }

   public void a(cvn $$0, hz $$1, dlf $$2, bno $$3) {
   }

   @Nullable
   public dlf a(crg $$0) {
      return this.o();
   }

   public void a(cvn $$0, chh $$1, hz $$2, dlf $$3, @Nullable dit $$4, coz $$5) {
      $$1.b(atu.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cvn $$0, hz $$1, dlf $$2, @Nullable bog $$3, coz $$4) {
   }

   public boolean a(dlf $$0) {
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

   public void a(cvn $$0, dlf $$1, hz $$2, bno $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dN().k());
   }

   public void a(cut $$0, bno $$1) {
      $$1.g($$1.dp().d(1.0, 0.0, 1.0));
   }

   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return new coz(this);
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

   protected void a(cvn $$0, chh $$1, hz $$2, dlf $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dlf a(cvn $$0, hz $$1, dlf $$2, chh $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(atz.aV)) {
         cfy.a($$3, false);
      }

      $$0.a(dpp.f, $$1, dpp.a.a($$3, $$2));
      return $$2;
   }

   public void a(dlf $$0, cvn $$1, hz $$2, cwm.c $$3) {
   }

   public boolean a(cvf $$0) {
      return true;
   }

   protected void a(dlg.a<cyo, dlf> $$0) {
   }

   public dlg<cyo, dlf> n() {
      return this.E;
   }

   protected final void k(dlf $$0) {
      this.d = $$0;
   }

   public final dlf o() {
      return this.d;
   }

   public final dlf l(dlf $$0) {
      dlf $$1 = this.o();

      for (dmi<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dlf a(dlf $$0, dlf $$1, dmi<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cou j() {
      if (this.f == null) {
         this.f = cou.a(this);
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

   public void a(coz $$0, @Nullable cut $$1, List<vq> $$2, cqq $$3) {
   }

   @Override
   protected cyo q() {
      return this;
   }

   protected ImmutableMap<dlf, eol> a(Function<dlf, eol> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ij.c<cyo> r() {
      return this.b;
   }

   protected void a(aov $$0, hz $$1, coz $$2, bkz $$3) {
      if (ctj.a(ctl.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dlf a;
      private final dlf b;
      private final ie c;

      public a(dlf $$0, dlf $$1, ie $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof cyo.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
