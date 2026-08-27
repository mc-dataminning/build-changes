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

public class cvf extends dhm implements cse {
   public static final MapCodec<cvf> p = b(cvf::new);
   private static final Logger a = LogUtils.getLogger();
   private final ig.c<cvf> b = kc.f.f(this);
   public static final im<dhn> q = new im<>();
   private static final LoadingCache<eks, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<eks, Boolean>() {
      public Boolean a(eks $$0) {
         return !ekp.c(ekp.b(), $$0, ekd.g);
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
   protected final dho<cvf, dhn> E;
   private dhn d;
   @Nullable
   private String e;
   @Nullable
   private clj f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cvf.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cvf.a> $$0 = new Object2ByteLinkedOpenHashMap<cvf.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends cvf> a() {
      return p;
   }

   public static int i(@Nullable dhn $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dhn a(int $$0) {
      dhn $$1 = q.a($$0);
      return $$1 == null ? cvh.a.o() : $$1;
   }

   public static cvf a(@Nullable clj $$0) {
      return $$0 instanceof cjh ? ((cjh)$$0).e() : cvh.a;
   }

   public static dhn a(dhn $$0, dhn $$1, csg $$2, hx $$3) {
      eks $$4 = ekp.b($$0.k($$2, $$3), $$1.k($$2, $$3), ekd.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bkv $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ekp.a(ib.a.b, $$6.cH().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static eks a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ekp.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dhn b(dhn $$0, csg $$1, hx $$2) {
      dhn $$3 = $$0;
      hx.a $$4 = new hx.a();

      for (ib $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dhn $$0, dhn $$1, csg $$2, hx $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dhn $$0, dhn $$1, csg $$2, hx $$3, int $$4, int $$5) {
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

   public cvf(dhm.d $$0) {
      super($$0);
      dho.a<cvf, dhn> $$1 = new dho.a<>(this);
      this.a($$1);
      this.E = $$1.a(cvf::o, dhn::new);
      this.k(this.E.b());
      if (aa.aT) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dhn $$0) {
      return $$0.b() instanceof czo || $$0.a(cvh.hW) || $$0.a(cvh.ee) || $$0.a(cvh.ef) || $$0.a(cvh.fa) || $$0.a(cvh.eZ) || $$0.a(ark.aQ);
   }

   public boolean e_(dhn $$0) {
      return this.aI;
   }

   public static boolean a(dhn $$0, crl $$1, hx $$2, ib $$3, hx $$4) {
      dhn $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         cvf.a $$6 = new cvf.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<cvf.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            eks $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               eks $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ekp.c($$9, $$10, ekd.e);
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

   public static boolean c(crl $$0, hx $$1) {
      return $$0.a_($$1).a($$0, $$1, ib.b, ddf.c);
   }

   public static boolean a(csi $$0, hx $$1, ib $$2) {
      dhn $$3 = $$0.a_($$1);
      return $$2 == ib.a && $$3.a(ark.aY) ? false : $$3.a($$0, $$1, $$2, ddf.b);
   }

   public static boolean a(eks $$0, ib $$1) {
      eks $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(eks $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean a_(dhn $$0, crl $$1, hx $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
   }

   public void a(csg $$0, hx $$1, dhn $$2) {
   }

   public static List<clo> a(dhn $$0, ami $$1, hx $$2, @Nullable dfi $$3) {
      efi.a $$4 = new efi.a($$1).a(ehn.f, ejz.b($$2)).a(ehn.i, clo.b).b(ehn.h, $$3);
      return $$0.a($$4);
   }

   public static List<clo> a(dhn $$0, ami $$1, hx $$2, @Nullable dfi $$3, @Nullable bkv $$4, clo $$5) {
      efi.a $$6 = new efi.a($$1).a(ehn.f, ejz.b($$2)).a(ehn.i, $$5).b(ehn.a, $$4).b(ehn.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dhn $$0, csf $$1, hx $$2) {
      if ($$1 instanceof ami) {
         a($$0, (ami)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ami)$$1, $$2, clo.b, true);
      }
   }

   public static void a(dhn $$0, csg $$1, hx $$2, @Nullable dfi $$3) {
      if ($$1 instanceof ami) {
         a($$0, (ami)$$1, $$2, $$3).forEach($$2x -> a((csf)((ami)$$1), $$2, $$2x));
         $$0.a((ami)$$1, $$2, clo.b, true);
      }
   }

   public static void a(dhn $$0, csf $$1, hx $$2, @Nullable dfi $$3, @Nullable bkv $$4, clo $$5) {
      if ($$1 instanceof ami) {
         a($$0, (ami)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((ami)$$1, $$2, $$5, true);
      }
   }

   public static void a(csf $$0, hx $$1, clo $$2) {
      double $$3 = (double)bkz.ad.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + atq.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + atq.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + atq.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cas($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(csf $$0, hx $$1, ib $$2, clo $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bkz.ad.k() / 2.0;
      double $$8 = (double)bkz.ad.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? atq.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? atq.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? atq.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? atq.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? atq.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? atq.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cas($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(csf $$0, Supplier<cas> $$1, clo $$2) {
      if (!$$0.B && !$$2.b() && $$0.Y().b(csb.h)) {
         cas $$3 = $$1.get();
         $$3.u();
         $$0.b($$3);
      }
   }

   protected void a(ami $$0, hx $$1, int $$2) {
      if ($$0.Y().b(csb.h)) {
         blb.a($$0, ejz.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(csf $$0, hx $$1, crx $$2) {
   }

   public void a(csf $$0, hx $$1, dhn $$2, bkv $$3) {
   }

   @Nullable
   public dhn a(cnw $$0) {
      return this.o();
   }

   public void a(csf $$0, cdz $$1, hx $$2, dhn $$3, @Nullable dfi $$4, clo $$5) {
      $$1.b(arf.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(csf $$0, hx $$1, dhn $$2, @Nullable bll $$3, clo $$4) {
   }

   public boolean a(dhn $$0) {
      return !$$0.e() && !$$0.k();
   }

   public vj f() {
      return uv.c(this.h());
   }

   public String h() {
      if (this.e == null) {
         this.e = ac.a("block", kc.f.b(this));
      }

      return this.e;
   }

   public void a(csf $$0, dhn $$1, hx $$2, bkv $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dO().k());
   }

   public void a(crl $$0, bkv $$1) {
      $$1.g($$1.dq().d(1.0, 0.0, 1.0));
   }

   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo(this);
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

   protected void a(csf $$0, cdz $$1, hx $$2, dhn $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dhn a(csf $$0, hx $$1, dhn $$2, cdz $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(ark.aV)) {
         ccq.a($$3, false);
      }

      $$0.a(dlx.f, $$1, dlx.a.a($$3, $$2));
      return $$2;
   }

   public void a(dhn $$0, csf $$1, hx $$2, ctd.c $$3) {
   }

   public boolean a(crx $$0) {
      return true;
   }

   protected void a(dho.a<cvf, dhn> $$0) {
   }

   public dho<cvf, dhn> n() {
      return this.E;
   }

   protected final void k(dhn $$0) {
      this.d = $$0;
   }

   public final dhn o() {
      return this.d;
   }

   public final dhn l(dhn $$0) {
      dhn $$1 = this.o();

      for (diq<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dhn a(dhn $$0, dhn $$1, diq<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public dcr m(dhn $$0) {
      return this.aJ;
   }

   @Override
   public clj k() {
      if (this.f == null) {
         this.f = clj.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + kc.f.b(this) + "}";
   }

   public void a(clo $$0, @Nullable crl $$1, List<uv> $$2, cnf $$3) {
   }

   @Override
   protected cvf q() {
      return this;
   }

   protected ImmutableMap<dhn, eks> a(Function<dhn, eks> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ig.c<cvf> r() {
      return this.b;
   }

   protected void a(ami $$0, hx $$1, clo $$2, big $$3) {
      if (cqb.a(cqd.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dhn a;
      private final dhn b;
      private final ib c;

      public a(dhn $$0, dhn $$1, ib $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof cvf.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
