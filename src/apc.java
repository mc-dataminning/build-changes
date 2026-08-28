import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class apc {
   private static final List<alg<ddm>> a = List.of(
      ddn.a, ddn.b, ddn.c, ddn.d, ddn.e, ddn.f, ddn.g, ddn.h, ddn.i, ddn.j, ddn.k, ddn.l, ddn.m, ddn.n, ddn.o, ddn.p, ddn.q, ddn.r
   );
   private static final List<alg<ddk>> b = List.of(ddl.a, ddl.b, ddl.c, ddl.d, ddl.e, ddl.f, ddl.g, ddl.h, ddl.i, ddl.j);
   private static final ToIntFunction<alg<ddm>> c = ad.g(a);
   private static final ToIntFunction<alg<ddk>> d = ad.g(b);

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ev)$$0x.getSource(), ((ev)$$0x.getSource()).h()))
      );
   }

   private static int a(ev $$0, coh $$1) {
      dev $$2 = $$1.dX();
      jy<ddj> $$3 = jy.a();
      kc<ddm> $$4 = $$2.H_().e(ly.aY);
      kc<ddk> $$5 = $$2.H_().e(ly.aX);
      jr<cvt> $$6 = $$2.a(ly.K);
      Map<alh, List<cvt>> $$7 = $$6.c().map(jp.c::a).filter($$0x -> {
         ddh $$1x = $$0x.g().a(kt.D);
         return $$1x != null && $$1x.a().a() == buh.a.b && $$1x.c().isPresent();
      }).collect(Collectors.groupingBy($$0x -> $$0x.g().a(kt.D).c().get()));
      $$4.s()
         .sorted(Comparator.comparing($$1x -> c.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> d.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new ddj($$5.e($$4x), $$4.e($$3x))))
         );
      jg $$8 = $$1.dx().a($$1.cP(), 5);
      int $$9 = $$7.size() - 1;
      double $$10 = 3.0;
      int $$11 = 0;
      int $$12 = 0;

      for (ddj $$13 : $$3) {
         for (List<cvt> $$14 : $$7.values()) {
            double $$15 = (double)$$8.u() + 0.5 - (double)($$11 % $$5.d()) * 3.0;
            double $$16 = (double)$$8.v() + 0.5 + (double)($$12 % $$9) * 3.0;
            double $$17 = (double)$$8.w() + 0.5 + (double)($$11 / $$5.d() * 10);
            ckf $$18 = new ckf($$2, $$15, $$16, $$17);
            $$18.v(180.0F);
            $$18.f(true);

            for (cvt $$19 : $$14) {
               ddh $$20 = Objects.requireNonNull($$19.g().a(kt.D));
               cvx $$21 = new cvx($$19);
               $$21.b(kt.T, $$13);
               $$18.a($$20.a(), $$21);
               if ($$21.a(cwb.op)) {
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

      $$0.a(() -> xh.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
