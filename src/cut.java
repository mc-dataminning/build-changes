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

public class cut extends dgv implements crr {
   public static final MapCodec<cut> p = b(cut::new);
   private static final Logger a = LogUtils.getLogger();
   private final ib.c<cut> b = jy.f.f(this);
   public static final ii<dgw> q = new ii<>();
   private static final LoadingCache<ekb, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ekb, Boolean>() {
      public Boolean a(ekb $$0) {
         return !ejy.c(ejy.b(), $$0, ejm.g);
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
   protected final dgx<cut, dgw> E;
   private dgw d;
   @Nullable
   private String e;
   @Nullable
   private ckw f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cut.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cut.a> $$0 = new Object2ByteLinkedOpenHashMap<cut.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends cut> a() {
      return p;
   }

   public static int i(@Nullable dgw $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dgw a(int $$0) {
      dgw $$1 = q.a($$0);
      return $$1 == null ? cuv.a.o() : $$1;
   }

   public static cut a(@Nullable ckw $$0) {
      return $$0 instanceof ciu ? ((ciu)$$0).e() : cuv.a;
   }

   public static dgw a(dgw $$0, dgw $$1, crt $$2, ht $$3) {
      ekb $$4 = ejy.b($$0.k($$2, $$3), $$1.k($$2, $$3), ejm.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bki $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ejy.a(hx.a.b, $$6.cG().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ekb a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ejy.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dgw b(dgw $$0, crt $$1, ht $$2) {
      dgw $$3 = $$0;
      ht.a $$4 = new ht.a();

      for (hx $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dgw $$0, dgw $$1, crt $$2, ht $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dgw $$0, dgw $$1, crt $$2, ht $$3, int $$4, int $$5) {
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

   public cut(dgv.d $$0) {
      super($$0);
      dgx.a<cut, dgw> $$1 = new dgx.a<>(this);
      this.a($$1);
      this.E = $$1.a(cut::o, dgw::new);
      this.k(this.E.b());
      if (aa.aT) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dgw $$0) {
      return $$0.b() instanceof czc || $$0.a(cuv.hW) || $$0.a(cuv.ee) || $$0.a(cuv.ef) || $$0.a(cuv.fa) || $$0.a(cuv.eZ) || $$0.a(arc.aQ);
   }

   public boolean e_(dgw $$0) {
      return this.aI;
   }

   public static boolean a(dgw $$0, cqy $$1, ht $$2, hx $$3, ht $$4) {
      dgw $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         cut.a $$6 = new cut.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<cut.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ekb $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ekb $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ejy.c($$9, $$10, ejm.e);
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

   public static boolean c(cqy $$0, ht $$1) {
      return $$0.a_($$1).a($$0, $$1, hx.b, dct.c);
   }

   public static boolean a(crv $$0, ht $$1, hx $$2) {
      dgw $$3 = $$0.a_($$1);
      return $$2 == hx.a && $$3.a(arc.aY) ? false : $$3.a($$0, $$1, $$2, dct.b);
   }

   public static boolean a(ekb $$0, hx $$1) {
      ekb $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ekb $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean c(dgw $$0, cqy $$1, ht $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
   }

   public void a(crt $$0, ht $$1, dgw $$2) {
   }

   public static List<clb> a(dgw $$0, ama $$1, ht $$2, @Nullable der $$3) {
      eer.a $$4 = new eer.a($$1).a(egw.f, eji.b($$2)).a(egw.i, clb.b).b(egw.h, $$3);
      return $$0.a($$4);
   }

   public static List<clb> a(dgw $$0, ama $$1, ht $$2, @Nullable der $$3, @Nullable bki $$4, clb $$5) {
      eer.a $$6 = new eer.a($$1).a(egw.f, eji.b($$2)).a(egw.i, $$5).b(egw.a, $$4).b(egw.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dgw $$0, crs $$1, ht $$2) {
      if ($$1 instanceof ama) {
         a($$0, (ama)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ama)$$1, $$2, clb.b, true);
      }
   }

   public static void a(dgw $$0, crt $$1, ht $$2, @Nullable der $$3) {
      if ($$1 instanceof ama) {
         a($$0, (ama)$$1, $$2, $$3).forEach($$2x -> a((crs)((ama)$$1), $$2, $$2x));
         $$0.a((ama)$$1, $$2, clb.b, true);
      }
   }

   public static void a(dgw $$0, crs $$1, ht $$2, @Nullable der $$3, @Nullable bki $$4, clb $$5) {
      if ($$1 instanceof ama) {
         a($$0, (ama)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ama)$$1, $$2, $$5, true);
      }
   }

   public static void a(crs $$0, ht $$1, clb $$2) {
      double $$3 = (double)bkm.ad.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ati.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ati.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ati.a($$0.z, -0.25, 0.25);
      a($$0, () -> new caf($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(crs $$0, ht $$1, hx $$2, clb $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bkm.ad.k() / 2.0;
      double $$8 = (double)bkm.ad.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ati.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ati.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ati.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ati.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ati.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ati.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new caf($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(crs $$0, Supplier<caf> $$1, clb $$2) {
      if (!$$0.B && !$$2.b() && $$0.X().b(cro.h)) {
         caf $$3 = $$1.get();
         $$3.t();
         $$0.b($$3);
      }
   }

   protected void a(ama $$0, ht $$1, int $$2) {
      if ($$0.X().b(cro.h)) {
         bko.a($$0, eji.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(crs $$0, ht $$1, crk $$2) {
   }

   public void a(crs $$0, ht $$1, dgw $$2, bki $$3) {
   }

   @Nullable
   public dgw a(cnj $$0) {
      return this.o();
   }

   public void a(crs $$0, cdm $$1, ht $$2, dgw $$3, @Nullable der $$4, clb $$5) {
      $$1.b(aqx.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(crs $$0, ht $$1, dgw $$2, @Nullable bky $$3, clb $$4) {
   }

   public boolean a(dgw $$0) {
      return !$$0.e() && !$$0.k();
   }

   public vf f() {
      return ur.c(this.h());
   }

   public String h() {
      if (this.e == null) {
         this.e = ac.a("block", jy.f.b(this));
      }

      return this.e;
   }

   public void a(crs $$0, dgw $$1, ht $$2, bki $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dM().k());
   }

   public void a(cqy $$0, bki $$1) {
      $$1.f($$1.do().d(1.0, 0.0, 1.0));
   }

   public clb a(crv $$0, ht $$1, dgw $$2) {
      return new clb(this);
   }

   public float i() {
      return this.aK;
   }

   public float j() {
      return this.aL;
   }

   public float l() {
      return this.aM;
   }

   protected void a(crs $$0, cdm $$1, ht $$2, dgw $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dgw a(crs $$0, ht $$1, dgw $$2, cdm $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(arc.aV)) {
         ccd.a($$3, false);
      }

      $$0.a(dlg.f, $$1, dlg.a.a($$3, $$2));
      return $$2;
   }

   public void a(dgw $$0, crs $$1, ht $$2, csq.c $$3) {
   }

   public boolean a(crk $$0) {
      return true;
   }

   protected void a(dgx.a<cut, dgw> $$0) {
   }

   public dgx<cut, dgw> n() {
      return this.E;
   }

   protected final void k(dgw $$0) {
      this.d = $$0;
   }

   public final dgw o() {
      return this.d;
   }

   public final dgw l(dgw $$0) {
      dgw $$1 = this.o();

      for (dhz<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dgw a(dgw $$0, dgw $$1, dhz<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public dcf m(dgw $$0) {
      return this.aJ;
   }

   @Override
   public ckw k() {
      if (this.f == null) {
         this.f = ckw.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + jy.f.b(this) + "}";
   }

   public void a(clb $$0, @Nullable cqy $$1, List<ur> $$2, cms $$3) {
   }

   @Override
   protected cut q() {
      return this;
   }

   protected ImmutableMap<dgw, ekb> a(Function<dgw, ekb> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ib.c<cut> r() {
      return this.b;
   }

   protected void a(ama $$0, ht $$1, clb $$2, bhv $$3) {
      if (cpo.a(cpq.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dgw a;
      private final dgw b;
      private final hx c;

      public a(dgw $$0, dgw $$1, hx $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof cut.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
