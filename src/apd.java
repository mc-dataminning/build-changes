import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class apd {
   private static final List<alh<dds>> a = List.of(
      ddt.a, ddt.b, ddt.c, ddt.d, ddt.e, ddt.f, ddt.g, ddt.h, ddt.i, ddt.j, ddt.k, ddt.l, ddt.m, ddt.n, ddt.o, ddt.p, ddt.q, ddt.r
   );
   private static final List<alh<ddq>> b = List.of(ddr.a, ddr.b, ddr.c, ddr.d, ddr.e, ddr.f, ddr.g, ddr.h, ddr.i, ddr.j);
   private static final ToIntFunction<alh<dds>> c = ae.g(a);
   private static final ToIntFunction<alh<ddq>> d = ae.g(b);

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ew)$$0x.getSource(), ((ew)$$0x.getSource()).h()))
      );
   }

   private static int a(ew $$0, com $$1) {
      dfb $$2 = $$1.dX();
      jz<ddp> $$3 = jz.a();
      kd<dds> $$4 = $$2.H_().e(lz.aY);
      kd<ddq> $$5 = $$2.H_().e(lz.aX);
      js<cvx> $$6 = $$2.a(lz.K);
      Map<ali, List<cvx>> $$7 = $$6.c().map(jq.c::a).filter($$0x -> {
         ddn $$1x = $$0x.g().a(ku.D);
         return $$1x != null && $$1x.a().a() == bum.a.b && $$1x.c().isPresent();
      }).collect(Collectors.groupingBy($$0x -> $$0x.g().a(ku.D).c().get()));
      $$4.s()
         .sorted(Comparator.comparing($$1x -> c.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> d.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new ddp($$5.e($$4x), $$4.e($$3x))))
         );
      jh $$8 = $$1.dx().a($$1.cP(), 5);
      int $$9 = $$7.size() - 1;
      double $$10 = 3.0;
      int $$11 = 0;
      int $$12 = 0;

      for (ddp $$13 : $$3) {
         for (List<cvx> $$14 : $$7.values()) {
            double $$15 = (double)$$8.u() + 0.5 - (double)($$11 % $$5.d()) * 3.0;
            double $$16 = (double)$$8.v() + 0.5 + (double)($$12 % $$9) * 3.0;
            double $$17 = (double)$$8.w() + 0.5 + (double)($$11 / $$5.d() * 10);
            ckk $$18 = new ckk($$2, $$15, $$16, $$17);
            $$18.v(180.0F);
            $$18.f(true);

            for (cvx $$19 : $$14) {
               ddn $$20 = Objects.requireNonNull($$19.g().a(ku.D));
               cwb $$21 = new cwb($$19);
               $$21.b(ku.U, $$13);
               $$18.a($$20.a(), $$21);
               if ($$21.a(cwf.op)) {
                  $$18.b($$13.b().a().a($$13.a()).f().f(" ").b($$13.a().a().e()));
                  $$18.p(true);
               } else {
                  $$18.k(true);
               }
            }

            $$2.b($$18);
            $$12++;
         }

         $$11++;
      }

      $$0.a(() -> xi.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
