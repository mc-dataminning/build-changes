import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class chf {
   public static final int a = 8;
   public static final int b = 4;
   private static final bmo c = axv.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bmo j = bmo.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bqq<?> a(bqq<che> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ckj.a));
      $$0.b(ckj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqq<che> $$0) {
      $$0.a(ckj.a, 0, ImmutableList.of(new bsn(45, 90), new bsr()));
   }

   private static void c(bqq<che> $$0) {
      $$0.a(
         ckj.b,
         10,
         ImmutableList.of(
            brg.a(bys.aw, 200),
            new brb(bpd.aa, 0.6F, 2),
            btl.a(bys.aw, 1.0F, 8, true),
            btt.a(chf::d),
            buu.a(che::s, btl.b(bys.aq, 0.4F, 8, false)),
            bth.a(8.0F, bmo.a(30, 60)),
            bre.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bqq<che> $$0) {
      $$0.a(
         ckj.k,
         10,
         ImmutableList.of(
            brg.a(bys.aw, 200), new brb(bpd.aa, 0.6F, 2), btm.a(1.0F), buu.a(che::s, bso.a(40)), buu.a(bos::o_, bso.a(15)), btw.a(), brt.a(chf::i, bys.o)
         ),
         bys.o
      );
   }

   private static void e(bqq<che> $$0) {
      $$0.a(ckj.n, 10, ImmutableList.of(btl.b(bys.z, 1.3F, 15, false), a(), bth.a(8.0F, bmo.a(30, 60)), brt.a(chf::e, bys.z)), bys.z);
   }

   private static bte<che> a() {
      return new bte<>(ImmutableList.of(Pair.of(bsz.a(0.4F), 2), Pair.of(bto.a(0.4F, 3), 2), Pair.of(new brr(30, 60), 1)));
   }

   protected static void a(che $$0) {
      bqq<che> $$1 = $$0.dP();
      ckj $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ckj.k, ckj.n, ckj.b));
      ckj $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bys.o));
   }

   protected static void a(che $$0, bpp $$1) {
      if (!$$0.o_()) {
         if ($$1.ai() == bpd.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(che $$0, bpp $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(che $$0, bpp $$1) {
      bqq<che> $$3 = $$0.dP();
      bpp $$2 = brj.a($$0, $$3.c(bys.z), $$1);
      $$2 = brj.a($$0, $$3.c(bys.o), $$2);
      e($$0, $$2);
   }

   private static void e(che $$0, bpp $$1) {
      $$0.dP().b(bys.o);
      $$0.dP().b(bys.m);
      $$0.dP().a(bys.z, $$1, (long)c.a($$0.dM().z));
   }

   private static Optional<? extends bpp> d(che $$0) {
      return !c($$0) && !i($$0) ? $$0.dP().c(bys.l) : Optional.empty();
   }

   static boolean a(che $$0, ib $$1) {
      Optional<ib> $$2 = $$0.dP().c(bys.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(che $$0) {
      return $$0.s() && !f($$0);
   }

   private static boolean f(che $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dP().c(bys.as).orElse(0);
         int $$2 = $$0.dP().c(bys.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(che $$0, bpp $$1) {
      bqq<che> $$2 = $$0.dP();
      $$2.b(bys.ax);
      $$2.b(bys.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(che $$0, bpp $$1) {
      if (!$$0.dP().c(ckj.n) || $$1.ai() != bpd.aA) {
         if ($$1.ai() != bpd.aa) {
            if (!brj.a($$0, $$1, 4.0)) {
               if (bzy.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(che $$0, bpp $$1) {
      bqq<che> $$2 = $$0.dP();
      $$2.b(bys.E);
      $$2.b(bys.r);
      $$2.a(bys.o, $$1, 200L);
   }

   private static void h(che $$0, bpp $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(che $$0, bpp $$1) {
      if (!c($$0)) {
         Optional<bpp> $$2 = $$0.dP().c(bys.o);
         bpp $$3 = brj.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<atx> b(che $$0) {
      return $$0.dP().g().map($$1 -> a($$0, $$1));
   }

   private static atx a(che $$0, ckj $$1) {
      if ($$1 == ckj.n || $$0.y()) {
         return aty.md;
      } else if ($$1 == ckj.k) {
         return aty.lY;
      } else {
         return h($$0) ? aty.md : aty.lX;
      }
   }

   private static List<che> g(che $$0) {
      return $$0.dP().c(bys.ap).orElse(ImmutableList.of());
   }

   private static boolean h(che $$0) {
      return $$0.dP().a(bys.aw);
   }

   private static boolean i(che $$0) {
      return $$0.dP().a(bys.r);
   }

   protected static boolean c(che $$0) {
      return $$0.dP().a(bys.ax);
   }
}
