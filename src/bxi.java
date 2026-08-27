import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bxi {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final double f = 12.0;
   private static final float g = 0.6F;
   private static final int h = 2;
   private static final int i = 100;
   private static final int j = 5;

   protected static bha<?> a(bxh $$0, bha<bxh> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(bzz.a));
      $$1.b(bzz.b);
      $$1.f();
      return $$1;
   }

   protected static void a(bxh $$0) {
      hd $$1 = hd.a($$0.dI().ac(), $$0.di());
      $$0.dK().a(bpb.b, $$1);
   }

   private static void b(bxh $$0, bha<bxh> $$1) {
      $$1.a(bzz.a, 0, ImmutableList.of(new biw(45, 90), new bja(), bip.a(), bkg.a()));
   }

   private static void c(bxh $$0, bha<bxh> $$1) {
      $$1.a(bzz.b, 10, ImmutableList.of(bkc.a(bxi::a), a(), b(), bjs.a(bfn.bt, 4)));
   }

   private static void d(bxh $$0, bha<bxh> $$1) {
      $$1.a(bzz.k, 10, ImmutableList.of(bkf.a($$1x -> !a((bxd)$$0, $$1x)), bjv.a(1.0F), bix.a(20)), bpb.o);
   }

   private static bjn<bxh> a() {
      return new bjn<>(
         ImmutableList.of(
            Pair.of(bjp.a(bfn.bt, 8.0F), 1),
            Pair.of(bjp.a(bfn.aw, 8.0F), 1),
            Pair.of(bjp.a(bfn.ax, 8.0F), 1),
            Pair.of(bjp.a(8.0F), 1),
            Pair.of(new bib(30, 60), 1)
         )
      );
   }

   private static bjn<bxh> b() {
      return new bjn<>(
         ImmutableList.of(
            Pair.of(bji.a(0.6F), 2),
            Pair.of(bio.a(bfn.aw, 8, bpb.q, 0.6F, 2), 2),
            Pair.of(bio.a(bfn.ax, 8, bpb.q, 0.6F, 2), 2),
            Pair.of(bki.a(bpb.b, 0.6F, 2, 100), 2),
            Pair.of(bkh.a(bpb.b, 0.6F, 5), 2),
            Pair.of(new bib(30, 60), 1)
         )
      );
   }

   protected static void b(bxh $$0) {
      bha<bxh> $$1 = $$0.dK();
      bzz $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(bzz.k, bzz.b));
      bzz $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bpb.o));
   }

   private static boolean a(bxd $$0, bfz $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bfz> a(bxd $$0) {
      Optional<bfz> $$1 = bht.a($$0, bpb.aa);
      if ($$1.isPresent() && bqf.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bfz> $$2 = a($$0, bpb.l);
         return $$2.isPresent() ? $$2 : $$0.dK().c(bpb.L);
      }
   }

   private static Optional<? extends bfz> a(bxd $$0, bpb<? extends bfz> $$1) {
      return $$0.dK().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(bxh $$0, bfz $$1) {
      if (!($$1 instanceof bxd)) {
         bxf.a($$0, $$1);
      }
   }

   protected static void b(bxh $$0, bfz $$1) {
      $$0.dK().b(bpb.E);
      $$0.dK().a(bpb.aa, $$1.ct(), 600L);
   }

   protected static void c(bxh $$0) {
      if ((double)$$0.dI().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(bxh $$0) {
      $$0.dK().g().ifPresent($$1 -> {
         if ($$1 == bzz.k) {
            $$0.gf();
         }
      });
   }
}
