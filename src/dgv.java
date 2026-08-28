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

public class dgv extends dtz implements ddr {
   public static final MapCodec<dgv> p = b(dgv::new);
   private static final Logger a = LogUtils.getLogger();
   private final jn.c<dgv> b = lu.e.f(this);
   public static final jt<dua> q = new jt<>();
   private static final LoadingCache<eyx, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<eyx, Boolean>() {
      public Boolean a(eyx $$0) {
         return !eyu.c(eyu.b(), $$0, eyi.g);
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
   protected final dub<dgv, dua> E;
   private dua d;
   @Nullable
   private String e;
   @Nullable
   private cvg f;
   private static final int g = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dgv.b>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dgv.b> $$0 = new Object2ByteLinkedOpenHashMap<dgv.b>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dgv> a() {
      return p;
   }

   public static int j(@Nullable dua $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dua a(int $$0) {
      dua $$1 = q.a($$0);
      return $$1 == null ? dgx.a.o() : $$1;
   }

   public static dgv a(@Nullable cvg $$0) {
      return $$0 instanceof ctl ? ((ctl)$$0).d() : dgx.a;
   }

   public static dua a(dua $$0, dua $$1, ddt $$2, je $$3) {
      eyx $$4 = eyu.b($$0.g($$2, $$3), $$1.g($$2, $$3), eyi.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (btj $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = eyu.a(jj.a.b, $$6.cO().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static eyx a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return eyu.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dua b(dua $$0, ddt $$1, je $$2) {
      dua $$3 = $$0;
      je.a $$4 = new je.a();

      for (jj $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dua $$0, dua $$1, ddt $$2, je $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dua $$0, dua $$1, ddt $$2, je $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.l()) {
            if (!$$2.w_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public dgv(dtz.d $$0) {
      super($$0);
      dub.a<dgv, dua> $$1 = new dub.a<>(this);
      this.a($$1);
      this.E = $$1.a(dgv::o, dua::new);
      this.l(this.E.b());
      if (ab.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(dua $$0) {
      return $$0.b() instanceof dlf || $$0.a(dgx.hW) || $$0.a(dgx.ee) || $$0.a(dgx.ef) || $$0.a(dgx.fa) || $$0.a(dgx.eZ) || $$0.a(aws.aS);
   }

   public static boolean a(dua $$0, dua $$1, jj $$2) {
      eyx $$3 = $$1.a($$2.g());
      if ($$3 == eyu.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == eyu.a()) {
         return true;
      } else {
         eyx $$4 = $$0.a($$2);
         if ($$4 == eyu.a()) {
            return true;
         } else {
            dgv.b $$5 = new dgv.b($$4, $$3);
            Object2ByteLinkedOpenHashMap<dgv.b> $$6 = h.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = eyu.c($$4, $$3, eyi.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dcx $$0, je $$1) {
      return $$0.a_($$1).a($$0, $$1, jj.b, dox.c);
   }

   public static boolean a(ddv $$0, je $$1, jj $$2) {
      dua $$3 = $$0.a_($$1);
      return $$2 == jj.a && $$3.a(aws.ba) ? false : $$3.a($$0, $$1, $$2, dox.b);
   }

   public static boolean a(eyx $$0, jj $$1) {
      eyx $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(eyx $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
   }

   public void a(ddt $$0, je $$1, dua $$2) {
   }

   public static List<cvl> a(dua $$0, arg $$1, je $$2, @Nullable dre $$3) {
      esw.a $$4 = new esw.a($$1).a(evp.f, eye.b($$2)).a(evp.i, cvl.k).b(evp.h, $$3);
      return $$0.a($$4);
   }

   public static List<cvl> a(dua $$0, arg $$1, je $$2, @Nullable dre $$3, @Nullable btj $$4, cvl $$5) {
      esw.a $$6 = new esw.a($$1).a(evp.f, eye.b($$2)).a(evp.i, $$5).b(evp.a, $$4).b(evp.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dua $$0, dds $$1, je $$2) {
      if ($$1 instanceof arg) {
         a($$0, (arg)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arg)$$1, $$2, cvl.k, true);
      }
   }

   public static void a(dua $$0, ddt $$1, je $$2, @Nullable dre $$3) {
      if ($$1 instanceof arg) {
         a($$0, (arg)$$1, $$2, $$3).forEach($$2x -> a((dds)((arg)$$1), $$2, $$2x));
         $$0.a((arg)$$1, $$2, cvl.k, true);
      }
   }

   public static void a(dua $$0, dds $$1, je $$2, @Nullable dre $$3, @Nullable btj $$4, cvl $$5) {
      if ($$1 instanceof arg) {
         a($$0, (arg)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arg)$$1, $$2, $$5, true);
      }
   }

   public static void a(dds $$0, je $$1, cvl $$2) {
      double $$3 = (double)btq.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + azc.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + azc.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + azc.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cjz($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dds $$0, je $$1, jj $$2, cvl $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)btq.ag.l() / 2.0;
      double $$8 = (double)btq.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? azc.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? azc.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? azc.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? azc.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? azc.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? azc.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cjz($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dds $$0, Supplier<cjz> $$1, cvl $$2) {
      if (!$$0.B && !$$2.f() && $$0.ac().b(ddo.h)) {
         cjz $$3 = $$1.get();
         $$3.q();
         $$0.b($$3);
      }
   }

   protected void a(arg $$0, je $$1, int $$2) {
      if ($$0.ac().b(ddo.h)) {
         btv.a($$0, eye.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(arg $$0, je $$1, ddk $$2) {
   }

   public void a(dds $$0, je $$1, dua $$2, btj $$3) {
   }

   @Nullable
   public dua a(cyw $$0) {
      return this.o();
   }

   public void a(dds $$0, cnp $$1, je $$2, dua $$3, @Nullable dre $$4, cvl $$5) {
      $$1.b(awn.a.b(this));
      $$1.G(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dds $$0, je $$1, dua $$2, @Nullable buf $$3, cvl $$4) {
   }

   public boolean a(dua $$0) {
      return !$$0.e() && !$$0.n();
   }

   public xr f() {
      return xd.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ad.a("block", lu.e.b(this));
      }

      return this.e;
   }

   public void a(dds $$0, dua $$1, je $$2, btj $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dT().l());
   }

   public void a(dcx $$0, btj $$1) {
      $$1.h($$1.dv().d(1.0, 0.0, 1.0));
   }

   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl(this);
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

   protected void a(dds $$0, cnp $$1, je $$2, dua $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public dua a(dds $$0, je $$1, dua $$2, cnp $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(aws.aX)) {
         cmg.a($$3, false);
      }

      $$0.a(dyx.f, $$1, dyx.a.a($$3, $$2));
      return $$2;
   }

   public void a(dua $$0, dds $$1, je $$2, det.c $$3) {
   }

   public boolean a(ddk $$0) {
      return true;
   }

   protected void a(dub.a<dgv, dua> $$0) {
   }

   public dub<dgv, dua> l() {
      return this.E;
   }

   protected final void l(dua $$0) {
      this.d = $$0;
   }

   public final dua o() {
      return this.d;
   }

   public final dua m(dua $$0) {
      dua $$1 = this.o();

      for (dvd<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dua a(dua $$0, dua $$1, dvd<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public cvg r() {
      if (this.f == null) {
         this.f = cvg.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + lu.e.e(this).g() + "}";
   }

   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
   }

   @Override
   protected dgv q() {
      return this;
   }

   protected ImmutableMap<dua, eyx> a(Function<dua, eyx> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public jn.c<dgv> s() {
      return this.b;
   }

   protected void a(arg $$0, je $$1, cvl $$2, bqp $$3) {
      int $$4 = day.b($$0, $$2, $$3.a($$0.C_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   public static final class a {
      private final dua a;
      private final dua b;
      private final jj c;

      public a(dua $$0, dua $$1, jj $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dgv.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.a.hashCode();
         $$0 = 31 * $$0 + this.b.hashCode();
         return 31 * $$0 + this.c.hashCode();
      }
   }

   static record b(eyx a, eyx b) {
      @Override
      public boolean equals(Object $$0) {
         if ($$0 instanceof dgv.b $$1 && this.a == $$1.a && this.b == $$1.b) {
            return true;
         }

         return false;
      }

      @Override
      public int hashCode() {
         return System.identityHashCode(this.a) * 31 + System.identityHashCode(this.b);
      }
   }
}
