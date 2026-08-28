import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class aor {
   private static final List<akt<dez>> a = List.of(
      dfa.a, dfa.b, dfa.c, dfa.d, dfa.e, dfa.f, dfa.g, dfa.h, dfa.i, dfa.j, dfa.k, dfa.l, dfa.m, dfa.n, dfa.o, dfa.p, dfa.q, dfa.r
   );
   private static final List<akt<dex>> b = List.of(dey.a, dey.b, dey.c, dey.d, dey.e, dey.f, dey.g, dey.h, dey.i, dey.j, dey.k);
   private static final ToIntFunction<akt<dez>> c = af.g(a);
   private static final ToIntFunction<akt<dex>> d = af.g(b);

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ex)$$0x.getSource(), ((ex)$$0x.getSource()).h()))
      );
   }

   private static int a(ex $$0, cox $$1) {
      dgi $$2 = $$1.dW();
      ka<dew> $$3 = ka.a();
      ke<dez> $$4 = $$2.K_().e(mc.ba);
      ke<dex> $$5 = $$2.K_().e(mc.aZ);
      jt<cwl> $$6 = $$2.a(mc.K);
      Map<akt<des>, List<cwl>> $$7 = $$6.c().map(jr.c::a).filter($$0x -> {
         deu $$1x = $$0x.g().a(kv.D);
         return $$1x != null && $$1x.a().a() == bus.a.b && $$1x.c().isPresent();
      }).collect(Collectors.groupingBy($$0x -> $$0x.g().a(kv.D).c().get()));
      $$4.s()
         .sorted(Comparator.comparing($$1x -> c.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> d.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new dew($$5.e($$4x), $$4.e($$3x))))
         );
      ji $$8 = $$1.dw().a($$1.cO(), 5);
      int $$9 = $$7.size() - 1;
      double $$10 = 3.0;
      int $$11 = 0;
      int $$12 = 0;

      for (dew $$13 : $$3) {
         for (List<cwl> $$14 : $$7.values()) {
            double $$15 = (double)$$8.u() + 0.5 - (double)($$11 % $$5.d()) * 3.0;
            double $$16 = (double)$$8.v() + 0.5 + (double)($$12 % $$9) * 3.0;
            double $$17 = (double)$$8.w() + 0.5 + (double)($$11 / $$5.d() * 10);
            ckq $$18 = new ckq($$2, $$15, $$16, $$17);
            $$18.v(180.0F);
            $$18.f(true);

            for (cwl $$19 : $$14) {
               deu $$20 = Objects.requireNonNull($$19.g().a(kv.D));
               cwp $$21 = new cwp($$19);
               $$21.b(kv.U, $$13);
               $$18.a($$20.a(), $$21);
               if ($$21.a(cwt.oT)) {
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

      $$0.a(() -> wo.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
