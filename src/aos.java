import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class aos {
   private static final List<aku<dey>> a = List.of(
      dez.a, dez.b, dez.c, dez.d, dez.e, dez.f, dez.g, dez.h, dez.i, dez.j, dez.k, dez.l, dez.m, dez.n, dez.o, dez.p, dez.q, dez.r
   );
   private static final List<aku<dew>> b = List.of(dex.a, dex.b, dex.c, dex.d, dex.e, dex.f, dex.g, dex.h, dex.i, dex.j, dex.k);
   private static final ToIntFunction<aku<dey>> c = af.g(a);
   private static final ToIntFunction<aku<dew>> d = af.g(b);

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ex)$$0x.getSource(), ((ex)$$0x.getSource()).h()))
      );
   }

   private static int a(ex $$0, cow $$1) {
      dgh $$2 = $$1.dV();
      ka<dev> $$3 = ka.a();
      ke<dey> $$4 = $$2.K_().e(mc.ba);
      ke<dew> $$5 = $$2.K_().e(mc.aZ);
      jt<cwk> $$6 = $$2.a(mc.K);
      Map<aku<der>, List<cwk>> $$7 = $$6.c().map(jr.c::a).filter($$0x -> {
         det $$1x = $$0x.g().a(kv.D);
         return $$1x != null && $$1x.a().a() == bus.a.b && $$1x.c().isPresent();
      }).collect(Collectors.groupingBy($$0x -> $$0x.g().a(kv.D).c().get()));
      $$4.s()
         .sorted(Comparator.comparing($$1x -> c.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> d.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new dev($$5.e($$4x), $$4.e($$3x))))
         );
      ji $$8 = $$1.dv().a($$1.cO(), 5);
      int $$9 = $$7.size() - 1;
      double $$10 = 3.0;
      int $$11 = 0;
      int $$12 = 0;

      for (dev $$13 : $$3) {
         for (List<cwk> $$14 : $$7.values()) {
            double $$15 = (double)$$8.u() + 0.5 - (double)($$11 % $$5.d()) * 3.0;
            double $$16 = (double)$$8.v() + 0.5 + (double)($$12 % $$9) * 3.0;
            double $$17 = (double)$$8.w() + 0.5 + (double)($$11 / $$5.d() * 10);
            ckq $$18 = new ckq($$2, $$15, $$16, $$17);
            $$18.v(180.0F);
            $$18.f(true);

            for (cwk $$19 : $$14) {
               det $$20 = Objects.requireNonNull($$19.g().a(kv.D));
               cwo $$21 = new cwo($$19);
               $$21.b(kv.U, $$13);
               $$18.a($$20.a(), $$21);
               if ($$21.a(cws.oT)) {
                  $$18.b($$13.b().a().a($$13.a()).f().f(" ").b($$13.a().a().d()));
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

      $$0.a(() -> wp.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
