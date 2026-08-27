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

public class ddy extends dra implements daw {
   public static final MapCodec<ddy> p = b(ddy::new);
   private static final Logger a = LogUtils.getLogger();
   private final ix.c<ddy> b = le.e.f(this);
   public static final jd<drb> q = new jd<>();
   private static final LoadingCache<evd, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<evd, Boolean>() {
      public Boolean a(evd $$0) {
         return !eva.c(eva.b(), $$0, euo.g);
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
   protected final drc<ddy, drb> E;
   private drb d;
   @Nullable
   private String e;
   @Nullable
   private ctj f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<ddy.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<ddy.a> $$0 = new Object2ByteLinkedOpenHashMap<ddy.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends ddy> a() {
      return p;
   }

   public static int i(@Nullable drb $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static drb a(int $$0) {
      drb $$1 = q.a($$0);
      return $$1 == null ? dea.a.n() : $$1;
   }

   public static ddy a(@Nullable ctj $$0) {
      return $$0 instanceof crm ? ((crm)$$0).d() : dea.a;
   }

   public static drb a(drb $$0, drb $$1, day $$2, io $$3) {
      evd $$4 = eva.b($$0.k($$2, $$3), $$1.k($$2, $$3), euo.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bru $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = eva.a(it.a.b, $$6.cK().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static evd a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return eva.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static drb b(drb $$0, day $$1, io $$2) {
      drb $$3 = $$0;
      io.a $$4 = new io.a();

      for (it $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(drb $$0, drb $$1, day $$2, io $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(drb $$0, drb $$1, day $$2, io $$3, int $$4, int $$5) {
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

   public ddy(dra.d $$0) {
      super($$0);
      drc.a<ddy, drb> $$1 = new drc.a<>(this);
      this.a($$1);
      this.E = $$1.a(ddy::n, drb::new);
      this.k(this.E.b());
      if (aa.aX) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(drb $$0) {
      return $$0.b() instanceof dii || $$0.a(dea.hW) || $$0.a(dea.ee) || $$0.a(dea.ef) || $$0.a(dea.fa) || $$0.a(dea.eZ) || $$0.a(avw.aR);
   }

   public static boolean a(drb $$0, dad $$1, io $$2, it $$3, io $$4) {
      drb $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         ddy.a $$6 = new ddy.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<ddy.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            evd $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               evd $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = eva.c($$9, $$10, euo.e);
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

   public static boolean c(dad $$0, io $$1) {
      return $$0.a_($$1).a($$0, $$1, it.b, dlz.c);
   }

   public static boolean a(dba $$0, io $$1, it $$2) {
      drb $$3 = $$0.a_($$1);
      return $$2 == it.a && $$3.a(avw.aZ) ? false : $$3.a($$0, $$1, $$2, dlz.b);
   }

   public static boolean a(evd $$0, it $$1) {
      evd $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(evd $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
   }

   public void a(day $$0, io $$1, drb $$2) {
   }

   public static List<cto> a(drb $$0, aqm $$1, io $$2, @Nullable dog $$3) {
      epi.a $$4 = new epi.a($$1).a(erx.f, euk.b($$2)).a(erx.i, cto.i).b(erx.h, $$3);
      return $$0.a($$4);
   }

   public static List<cto> a(drb $$0, aqm $$1, io $$2, @Nullable dog $$3, @Nullable bru $$4, cto $$5) {
      epi.a $$6 = new epi.a($$1).a(erx.f, euk.b($$2)).a(erx.i, $$5).b(erx.a, $$4).b(erx.h, $$3);
      return $$0.a($$6);
   }

   public static void c(drb $$0, dax $$1, io $$2) {
      if ($$1 instanceof aqm) {
         a($$0, (aqm)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqm)$$1, $$2, cto.i, true);
      }
   }

   public static void a(drb $$0, day $$1, io $$2, @Nullable dog $$3) {
      if ($$1 instanceof aqm) {
         a($$0, (aqm)$$1, $$2, $$3).forEach($$2x -> a((dax)((aqm)$$1), $$2, $$2x));
         $$0.a((aqm)$$1, $$2, cto.i, true);
      }
   }

   public static void a(drb $$0, dax $$1, io $$2, @Nullable dog $$3, @Nullable bru $$4, cto $$5) {
      if ($$1 instanceof aqm) {
         a($$0, (aqm)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqm)$$1, $$2, $$5, true);
      }
   }

   public static void a(dax $$0, io $$1, cto $$2) {
      double $$3 = (double)bsa.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayd.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayd.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayd.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cig($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dax $$0, io $$1, it $$2, cto $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bsa.ag.l() / 2.0;
      double $$8 = (double)bsa.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayd.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayd.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayd.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayd.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayd.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayd.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cig($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dax $$0, Supplier<cig> $$1, cto $$2) {
      if (!$$0.B && !$$2.e() && $$0.aa().b(dat.h)) {
         cig $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(aqm $$0, io $$1, int $$2) {
      if ($$0.aa().b(dat.h)) {
         bse.a($$0, euk.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(dax $$0, io $$1, dap $$2) {
   }

   public void a(dax $$0, io $$1, drb $$2, bru $$3) {
   }

   @Nullable
   public drb a(cwz $$0) {
      return this.n();
   }

   public void a(dax $$0, clw $$1, io $$2, drb $$3, @Nullable dog $$4, cto $$5) {
      $$1.b(avr.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dax $$0, io $$1, drb $$2, @Nullable bso $$3, cto $$4) {
   }

   public boolean a(drb $$0) {
      return !$$0.e() && !$$0.k();
   }

   public xl f() {
      return wx.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ac.a("block", le.e.b(this));
      }

      return this.e;
   }

   public void a(dax $$0, drb $$1, io $$2, bru $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dQ().k());
   }

   public void a(dad $$0, bru $$1) {
      $$1.g($$1.ds().d(1.0, 0.0, 1.0));
   }

   public cto a(dba $$0, io $$1, drb $$2) {
      return new cto(this);
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

   protected void a(dax $$0, clw $$1, io $$2, drb $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public drb a(dax $$0, io $$1, drb $$2, clw $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(avw.aW)) {
         ckn.a($$3, false);
      }

      $$0.a(dvu.f, $$1, dvu.a.a($$3, $$2));
      return $$2;
   }

   public void a(drb $$0, dax $$1, io $$2, dbw.c $$3) {
   }

   public boolean a(dap $$0) {
      return true;
   }

   protected void a(drc.a<ddy, drb> $$0) {
   }

   public drc<ddy, drb> m() {
      return this.E;
   }

   protected final void k(drb $$0) {
      this.d = $$0;
   }

   public final drb n() {
      return this.d;
   }

   public final drb l(drb $$0) {
      drb $$1 = this.n();

      for (dse<?> $$2 : $$0.b().m().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> drb a(drb $$0, drb $$1, dse<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public ctj q() {
      if (this.f == null) {
         this.f = ctj.a(this);
      }

      return this.f;
   }

   public boolean o() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + le.e.b(this) + "}";
   }

   public void a(cto $$0, @Nullable dad $$1, List<wx> $$2, cvh $$3, @Nullable jl $$4) {
   }

   @Override
   protected ddy p() {
      return this;
   }

   protected ImmutableMap<drb, evd> a(Function<drb, evd> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ix.c<ddy> r() {
      return this.b;
   }

   protected void a(aqm $$0, io $$1, cto $$2, boz $$3) {
      if (cza.a(czc.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final drb a;
      private final drb b;
      private final it c;

      public a(drb $$0, drb $$1, it $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof ddy.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
