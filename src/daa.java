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

public class daa extends dmy implements cwy {
   public static final MapCodec<daa> p = b(daa::new);
   private static final Logger a = LogUtils.getLogger();
   private final il.c<daa> b = ki.e.f(this);
   public static final ir<dmz> q = new ir<>();
   private static final LoadingCache<eqk, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<eqk, Boolean>() {
      public Boolean a(eqk $$0) {
         return !eqh.c(eqh.b(), $$0, epv.g);
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
   protected final dna<daa, dmz> E;
   private dmz d;
   @Nullable
   private String e;
   @Nullable
   private cqf f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<daa.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<daa.a> $$0 = new Object2ByteLinkedOpenHashMap<daa.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends daa> a() {
      return p;
   }

   public static int i(@Nullable dmz $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dmz a(int $$0) {
      dmz $$1 = q.a($$0);
      return $$1 == null ? dac.a.o() : $$1;
   }

   public static daa a(@Nullable cqf $$0) {
      return $$0 instanceof cof ? ((cof)$$0).d() : dac.a;
   }

   public static dmz a(dmz $$0, dmz $$1, cxa $$2, ib $$3) {
      eqk $$4 = eqh.b($$0.k($$2, $$3), $$1.k($$2, $$3), epv.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bow $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = eqh.a(ih.a.b, $$6.cH().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static eqk a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return eqh.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dmz b(dmz $$0, cxa $$1, ib $$2) {
      dmz $$3 = $$0;
      ib.a $$4 = new ib.a();

      for (ih $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dmz $$0, dmz $$1, cxa $$2, ib $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dmz $$0, dmz $$1, cxa $$2, ib $$3, int $$4, int $$5) {
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

   public daa(dmy.d $$0) {
      super($$0);
      dna.a<daa, dmz> $$1 = new dna.a<>(this);
      this.a($$1);
      this.E = $$1.a(daa::o, dmz::new);
      this.k(this.E.b());
      if (aa.aW) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dmz $$0) {
      return $$0.b() instanceof dej || $$0.a(dac.hW) || $$0.a(dac.ee) || $$0.a(dac.ef) || $$0.a(dac.fa) || $$0.a(dac.eZ) || $$0.a(aun.aR);
   }

   public static boolean a(dmz $$0, cwf $$1, ib $$2, ih $$3, ib $$4) {
      dmz $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         daa.a $$6 = new daa.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<daa.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            eqk $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               eqk $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = eqh.c($$9, $$10, epv.e);
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

   public static boolean c(cwf $$0, ib $$1) {
      return $$0.a_($$1).a($$0, $$1, ih.b, dia.c);
   }

   public static boolean a(cxc $$0, ib $$1, ih $$2) {
      dmz $$3 = $$0.a_($$1);
      return $$2 == ih.a && $$3.a(aun.aZ) ? false : $$3.a($$0, $$1, $$2, dia.b);
   }

   public static boolean a(eqk $$0, ih $$1) {
      eqk $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(eqk $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
   }

   public void a(cxa $$0, ib $$1, dmz $$2) {
   }

   public static List<cqk> a(dmz $$0, apf $$1, ib $$2, @Nullable dkg $$3) {
      ela.a $$4 = new ela.a($$1).a(enf.f, epr.b($$2)).a(enf.i, cqk.h).b(enf.h, $$3);
      return $$0.a($$4);
   }

   public static List<cqk> a(dmz $$0, apf $$1, ib $$2, @Nullable dkg $$3, @Nullable bow $$4, cqk $$5) {
      ela.a $$6 = new ela.a($$1).a(enf.f, epr.b($$2)).a(enf.i, $$5).b(enf.a, $$4).b(enf.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dmz $$0, cwz $$1, ib $$2) {
      if ($$1 instanceof apf) {
         a($$0, (apf)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((apf)$$1, $$2, cqk.h, true);
      }
   }

   public static void a(dmz $$0, cxa $$1, ib $$2, @Nullable dkg $$3) {
      if ($$1 instanceof apf) {
         a($$0, (apf)$$1, $$2, $$3).forEach($$2x -> a((cwz)((apf)$$1), $$2, $$2x));
         $$0.a((apf)$$1, $$2, cqk.h, true);
      }
   }

   public static void a(dmz $$0, cwz $$1, ib $$2, @Nullable dkg $$3, @Nullable bow $$4, cqk $$5) {
      if ($$1 instanceof apf) {
         a($$0, (apf)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((apf)$$1, $$2, $$5, true);
      }
   }

   public static void a(cwz $$0, ib $$1, cqk $$2) {
      double $$3 = (double)bpc.ag.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + aww.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + aww.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + aww.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cfd($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cwz $$0, ib $$1, ih $$2, cqk $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bpc.ag.k() / 2.0;
      double $$8 = (double)bpc.ag.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? aww.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? aww.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? aww.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? aww.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? aww.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? aww.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cfd($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cwz $$0, Supplier<cfd> $$1, cqk $$2) {
      if (!$$0.B && !$$2.b() && $$0.Z().b(cwv.h)) {
         cfd $$3 = $$1.get();
         $$3.s();
         $$0.b($$3);
      }
   }

   protected void a(apf $$0, ib $$1, int $$2) {
      if ($$0.Z().b(cwv.h)) {
         bpe.a($$0, epr.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(cwz $$0, ib $$1, cwr $$2) {
   }

   public void a(cwz $$0, ib $$1, dmz $$2, bow $$3) {
   }

   @Nullable
   public dmz a(css $$0) {
      return this.o();
   }

   public void a(cwz $$0, cis $$1, ib $$2, dmz $$3, @Nullable dkg $$4, cqk $$5) {
      $$1.b(aui.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cwz $$0, ib $$1, dmz $$2, @Nullable bpo $$3, cqk $$4) {
   }

   public boolean a(dmz $$0) {
      return !$$0.e() && !$$0.k();
   }

   public wi f() {
      return vu.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ac.a("block", ki.e.b(this));
      }

      return this.e;
   }

   public void a(cwz $$0, dmz $$1, ib $$2, bow $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dN().k());
   }

   public void a(cwf $$0, bow $$1) {
      $$1.g($$1.dp().d(1.0, 0.0, 1.0));
   }

   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return new cqk(this);
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

   protected void a(cwz $$0, cis $$1, ib $$2, dmz $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dmz a(cwz $$0, ib $$1, dmz $$2, cis $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(aun.aW)) {
         chj.a($$3, false);
      }

      $$0.a(drn.f, $$1, drn.a.a($$3, $$2));
      return $$2;
   }

   public void a(dmz $$0, cwz $$1, ib $$2, cxy.c $$3) {
   }

   public boolean a(cwr $$0) {
      return true;
   }

   protected void a(dna.a<daa, dmz> $$0) {
   }

   public dna<daa, dmz> n() {
      return this.E;
   }

   protected final void k(dmz $$0) {
      this.d = $$0;
   }

   public final dmz o() {
      return this.d;
   }

   public final dmz l(dmz $$0) {
      dmz $$1 = this.o();

      for (doc<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dmz a(dmz $$0, dmz $$1, doc<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cqf l() {
      if (this.f == null) {
         this.f = cqf.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + ki.e.b(this) + "}";
   }

   public void a(cqk $$0, @Nullable cwf $$1, List<vu> $$2, csb $$3, @Nullable iz $$4) {
   }

   @Override
   protected daa q() {
      return this;
   }

   protected ImmutableMap<dmz, eqk> a(Function<dmz, eqk> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public il.c<daa> r() {
      return this.b;
   }

   protected void a(apf $$0, ib $$1, cqk $$2, bmh $$3) {
      if (cuv.a(cux.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dmz a;
      private final dmz b;
      private final ih c;

      public a(dmz $$0, dmz $$1, ih $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof daa.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
