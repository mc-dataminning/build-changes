import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class apg {
   private static final List<alk<ddw>> a = List.of(
      ddx.a, ddx.b, ddx.c, ddx.d, ddx.e, ddx.f, ddx.g, ddx.h, ddx.i, ddx.j, ddx.k, ddx.l, ddx.m, ddx.n, ddx.o, ddx.p, ddx.q, ddx.r
   );
   private static final List<alk<ddu>> b = List.of(ddv.a, ddv.b, ddv.c, ddv.d, ddv.e, ddv.f, ddv.g, ddv.h, ddv.i, ddv.j);
   private static final ToIntFunction<alk<ddw>> c = ae.g(a);
   private static final ToIntFunction<alk<ddu>> d = ae.g(b);

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ew)$$0x.getSource(), ((ew)$$0x.getSource()).h()))
      );
   }

   private static int a(ew $$0, cor $$1) {
      dff $$2 = $$1.dY();
      jz<ddt> $$3 = jz.a();
      kd<ddw> $$4 = $$2.H_().e(ma.aY);
      kd<ddu> $$5 = $$2.H_().e(ma.aX);
      js<cwb> $$6 = $$2.a(ma.K);
      Map<all, List<cwb>> $$7 = $$6.c().map(jq.c::a).filter($$0x -> {
         ddr $$1x = $$0x.g().a(ku.D);
         return $$1x != null && $$1x.a().a() == buq.a.b && $$1x.c().isPresent();
      }).collect(Collectors.groupingBy($$0x -> $$0x.g().a(ku.D).c().get()));
      $$4.s()
         .sorted(Comparator.comparing($$1x -> c.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> d.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new ddt($$5.e($$4x), $$4.e($$3x))))
         );
      jh $$8 = $$1.dy().a($$1.cQ(), 5);
      int $$9 = $$7.size() - 1;
      double $$10 = 3.0;
      int $$11 = 0;
      int $$12 = 0;

      for (ddt $$13 : $$3) {
         for (List<cwb> $$14 : $$7.values()) {
            double $$15 = (double)$$8.u() + 0.5 - (double)($$11 % $$5.d()) * 3.0;
            double $$16 = (double)$$8.v() + 0.5 + (double)($$12 % $$9) * 3.0;
            double $$17 = (double)$$8.w() + 0.5 + (double)($$11 / $$5.d() * 10);
            cko $$18 = new cko($$2, $$15, $$16, $$17);
            $$18.v(180.0F);
            $$18.f(true);

            for (cwb $$19 : $$14) {
               ddr $$20 = Objects.requireNonNull($$19.g().a(ku.D));
               cwf $$21 = new cwf($$19);
               $$21.b(ku.U, $$13);
               $$18.a($$20.a(), $$21);
               if ($$21.a(cwj.op)) {
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

      $$0.a(() -> xl.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
