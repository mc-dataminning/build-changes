import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ape {
   private static final List<ali<ded>> a = List.of(
      dee.a, dee.b, dee.c, dee.d, dee.e, dee.f, dee.g, dee.h, dee.i, dee.j, dee.k, dee.l, dee.m, dee.n, dee.o, dee.p, dee.q, dee.r
   );
   private static final List<ali<deb>> b = List.of(dec.a, dec.b, dec.c, dec.d, dec.e, dec.f, dec.g, dec.h, dec.i, dec.j);
   private static final ToIntFunction<ali<ded>> c = ae.g(a);
   private static final ToIntFunction<ali<deb>> d = ae.g(b);

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ew)$$0x.getSource(), ((ew)$$0x.getSource()).h()))
      );
   }

   private static int a(ew $$0, cou $$1) {
      dfm $$2 = $$1.dV();
      jz<dea> $$3 = jz.a();
      kd<ded> $$4 = $$2.J_().e(ma.aY);
      kd<deb> $$5 = $$2.J_().e(ma.aX);
      js<cwi> $$6 = $$2.a(ma.K);
      Map<alj, List<cwi>> $$7 = $$6.c().map(jq.c::a).filter($$0x -> {
         ddy $$1x = $$0x.g().a(ku.D);
         return $$1x != null && $$1x.a().a() == but.a.b && $$1x.c().isPresent();
      }).collect(Collectors.groupingBy($$0x -> $$0x.g().a(ku.D).c().get()));
      $$4.s()
         .sorted(Comparator.comparing($$1x -> c.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> d.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new dea($$5.e($$4x), $$4.e($$3x))))
         );
      jh $$8 = $$1.dv().a($$1.cO(), 5);
      int $$9 = $$7.size() - 1;
      double $$10 = 3.0;
      int $$11 = 0;
      int $$12 = 0;

      for (dea $$13 : $$3) {
         for (List<cwi> $$14 : $$7.values()) {
            double $$15 = (double)$$8.u() + 0.5 - (double)($$11 % $$5.d()) * 3.0;
            double $$16 = (double)$$8.v() + 0.5 + (double)($$12 % $$9) * 3.0;
            double $$17 = (double)$$8.w() + 0.5 + (double)($$11 / $$5.d() * 10);
            ckr $$18 = new ckr($$2, $$15, $$16, $$17);
            $$18.v(180.0F);
            $$18.f(true);

            for (cwi $$19 : $$14) {
               ddy $$20 = Objects.requireNonNull($$19.g().a(ku.D));
               cwm $$21 = new cwm($$19);
               $$21.b(ku.U, $$13);
               $$18.a($$20.a(), $$21);
               if ($$21.a(cwq.op)) {
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

      $$0.a(() -> xj.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
