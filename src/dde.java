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

public class dde extends dqg implements dac {
   public static final MapCodec<dde> p = b(dde::new);
   private static final Logger a = LogUtils.getLogger();
   private final iw.c<dde> b = ld.e.f(this);
   public static final jc<dqh> q = new jc<>();
   private static final LoadingCache<eui, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<eui, Boolean>() {
      public Boolean a(eui $$0) {
         return !euf.c(euf.b(), $$0, ett.g);
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
   protected final dqi<dde, dqh> E;
   private dqh d;
   @Nullable
   private String e;
   @Nullable
   private csu f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dde.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dde.a> $$0 = new Object2ByteLinkedOpenHashMap<dde.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dde> a() {
      return p;
   }

   public static int i(@Nullable dqh $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dqh a(int $$0) {
      dqh $$1 = q.a($$0);
      return $$1 == null ? ddg.a.n() : $$1;
   }

   public static dde a(@Nullable csu $$0) {
      return $$0 instanceof cqx ? ((cqx)$$0).d() : ddg.a;
   }

   public static dqh a(dqh $$0, dqh $$1, dae $$2, in $$3) {
      eui $$4 = euf.b($$0.k($$2, $$3), $$1.k($$2, $$3), ett.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (brh $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = euf.a(is.a.b, $$6.cI().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static eui a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return euf.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dqh b(dqh $$0, dae $$1, in $$2) {
      dqh $$3 = $$0;
      in.a $$4 = new in.a();

      for (is $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dqh $$0, dqh $$1, dae $$2, in $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dqh $$0, dqh $$1, dae $$2, in $$3, int $$4, int $$5) {
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

   public dde(dqg.d $$0) {
      super($$0);
      dqi.a<dde, dqh> $$1 = new dqi.a<>(this);
      this.a($$1);
      this.E = $$1.a(dde::n, dqh::new);
      this.k(this.E.b());
      if (aa.aX) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dqh $$0) {
      return $$0.b() instanceof dho || $$0.a(ddg.hW) || $$0.a(ddg.ee) || $$0.a(ddg.ef) || $$0.a(ddg.fa) || $$0.a(ddg.eZ) || $$0.a(avr.aR);
   }

   public static boolean a(dqh $$0, czj $$1, in $$2, is $$3, in $$4) {
      dqh $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         dde.a $$6 = new dde.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<dde.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            eui $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               eui $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = euf.c($$9, $$10, ett.e);
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

   public static boolean c(czj $$0, in $$1) {
      return $$0.a_($$1).a($$0, $$1, is.b, dlf.c);
   }

   public static boolean a(dag $$0, in $$1, is $$2) {
      dqh $$3 = $$0.a_($$1);
      return $$2 == is.a && $$3.a(avr.aZ) ? false : $$3.a($$0, $$1, $$2, dlf.b);
   }

   public static boolean a(eui $$0, is $$1) {
      eui $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(eui $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
   }

   public void a(dae $$0, in $$1, dqh $$2) {
   }

   public static List<csz> a(dqh $$0, aqh $$1, in $$2, @Nullable dnm $$3) {
      eoo.a $$4 = new eoo.a($$1).a(erc.f, etp.b($$2)).a(erc.i, csz.i).b(erc.h, $$3);
      return $$0.a($$4);
   }

   public static List<csz> a(dqh $$0, aqh $$1, in $$2, @Nullable dnm $$3, @Nullable brh $$4, csz $$5) {
      eoo.a $$6 = new eoo.a($$1).a(erc.f, etp.b($$2)).a(erc.i, $$5).b(erc.a, $$4).b(erc.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dqh $$0, dad $$1, in $$2) {
      if ($$1 instanceof aqh) {
         a($$0, (aqh)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqh)$$1, $$2, csz.i, true);
      }
   }

   public static void a(dqh $$0, dae $$1, in $$2, @Nullable dnm $$3) {
      if ($$1 instanceof aqh) {
         a($$0, (aqh)$$1, $$2, $$3).forEach($$2x -> a((dad)((aqh)$$1), $$2, $$2x));
         $$0.a((aqh)$$1, $$2, csz.i, true);
      }
   }

   public static void a(dqh $$0, dad $$1, in $$2, @Nullable dnm $$3, @Nullable brh $$4, csz $$5) {
      if ($$1 instanceof aqh) {
         a($$0, (aqh)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aqh)$$1, $$2, $$5, true);
      }
   }

   public static void a(dad $$0, in $$1, csz $$2) {
      double $$3 = (double)brn.ag.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + axz.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + axz.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + axz.a($$0.z, -0.25, 0.25);
      a($$0, () -> new chr($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dad $$0, in $$1, is $$2, csz $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)brn.ag.k() / 2.0;
      double $$8 = (double)brn.ag.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? axz.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? axz.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? axz.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? axz.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? axz.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? axz.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new chr($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dad $$0, Supplier<chr> $$1, csz $$2) {
      if (!$$0.B && !$$2.d() && $$0.aa().b(czz.h)) {
         chr $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(aqh $$0, in $$1, int $$2) {
      if ($$0.aa().b(czz.h)) {
         brq.a($$0, etp.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(dad $$0, in $$1, czv $$2) {
   }

   public void a(dad $$0, in $$1, dqh $$2, brh $$3) {
   }

   @Nullable
   public dqh a(cwi $$0) {
      return this.n();
   }

   public void a(dad $$0, clh $$1, in $$2, dqh $$3, @Nullable dnm $$4, csz $$5) {
      $$1.b(avm.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dad $$0, in $$1, dqh $$2, @Nullable bsa $$3, csz $$4) {
   }

   public boolean a(dqh $$0) {
      return !$$0.e() && !$$0.k();
   }

   public xi f() {
      return wu.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ac.a("block", ld.e.b(this));
      }

      return this.e;
   }

   public void a(dad $$0, dqh $$1, in $$2, brh $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dO().k());
   }

   public void a(czj $$0, brh $$1) {
      $$1.g($$1.dq().d(1.0, 0.0, 1.0));
   }

   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz(this);
   }

   public float h() {
      return this.aK;
   }

   public float i() {
      return this.aL;
   }

   public float j() {
      return this.aM;
   }

   protected void a(dad $$0, clh $$1, in $$2, dqh $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dqh a(dad $$0, in $$1, dqh $$2, clh $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(avr.aW)) {
         cjy.a($$3, false);
      }

      $$0.a(dva.f, $$1, dva.a.a($$3, $$2));
      return $$2;
   }

   public void a(dqh $$0, dad $$1, in $$2, dbc.c $$3) {
   }

   public boolean a(czv $$0) {
      return true;
   }

   protected void a(dqi.a<dde, dqh> $$0) {
   }

   public dqi<dde, dqh> l() {
      return this.E;
   }

   protected final void k(dqh $$0) {
      this.d = $$0;
   }

   public final dqh n() {
      return this.d;
   }

   public final dqh l(dqh $$0) {
      dqh $$1 = this.n();

      for (drk<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dqh a(dqh $$0, dqh $$1, drk<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public csu q() {
      if (this.f == null) {
         this.f = csu.a(this);
      }

      return this.f;
   }

   public boolean o() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + ld.e.b(this) + "}";
   }

   public void a(csz $$0, @Nullable czj $$1, List<wu> $$2, cuq $$3, @Nullable jk $$4) {
   }

   @Override
   protected dde p() {
      return this;
   }

   protected ImmutableMap<dqh, eui> a(Function<dqh, eui> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public iw.c<dde> r() {
      return this.b;
   }

   protected void a(aqh $$0, in $$1, csz $$2, bor $$3) {
      if (cyh.a(cyj.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dqh a;
      private final dqh b;
      private final is c;

      public a(dqh $$0, dqh $$1, is $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof dde.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
