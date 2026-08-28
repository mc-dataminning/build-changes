import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class api {
   private static final List<alj<dip>> a = List.of(
      diq.a, diq.b, diq.c, diq.d, diq.e, diq.f, diq.g, diq.h, diq.i, diq.j, diq.k, diq.l, diq.m, diq.n, diq.o, diq.p, diq.q, diq.r
   );
   private static final List<alj<din>> b = List.of(dio.a, dio.b, dio.c, dio.d, dio.e, dio.f, dio.g, dio.h, dio.i, dio.j, dio.k);
   private static final ToIntFunction<alj<dip>> c = ag.g(a);
   private static final ToIntFunction<alj<din>> d = ag.g(b);
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xc.b("Invalid pattern", $$0));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
               .then(el.a("*_lag_my_game").executes($$0x -> a((ek)$$0x.getSource(), ((ek)$$0x.getSource()).h()))))
            .then(el.a("pattern", fk.a(mi.bl)).executes($$0x -> a((ek)$$0x.getSource(), ((ek)$$0x.getSource()).h(), fk.a($$0x, "pattern", mi.bl, e))))
      );
   }

   private static int a(ek $$0, crz $$1) {
      return a($$0, $$1, $$0.l().ba().f(mi.bl).c());
   }

   private static int a(ek $$0, crz $$1, alj<dip> $$2) {
      return a($$0, $$1, Stream.of($$0.l().ba().f(mi.bl).a($$2).orElseThrow()));
   }

   private static int a(ek $$0, crz $$1, Stream<jg.c<dip>> $$2) {
      aru $$3 = $$0.e();
      List<jg.c<dip>> $$4 = $$2.sorted(Comparator.comparing($$0x -> c.applyAsInt($$0x.h()))).toList();
      List<jg.c<din>> $$5 = $$3.J_().f(mi.bk).c().sorted(Comparator.comparing($$0x -> d.applyAsInt($$0x.h()))).toList();
      List<jg.c<czw>> $$6 = a($$3.J_().f(mi.K));
      iw $$7 = $$1.dv().a($$1.cO(), 5);
      double $$8 = 3.0;

      for (int $$9 = 0; $$9 < $$5.size(); $$9++) {
         jg.c<din> $$10 = $$5.get($$9);

         for (int $$11 = 0; $$11 < $$4.size(); $$11++) {
            jg.c<dip> $$12 = $$4.get($$11);
            dil $$13 = new dil($$10, $$12);

            for (int $$14 = 0; $$14 < $$6.size(); $$14++) {
               jg.c<czw> $$15 = $$6.get($$14);
               double $$16 = (double)$$7.u() + 0.5 - (double)$$14 * 3.0;
               double $$17 = (double)$$7.v() + 0.5 + (double)$$9 * 3.0;
               double $$18 = (double)$$7.w() + 0.5 + (double)($$11 * 10);
               cnt $$19 = new cnt($$3, $$16, $$17, $$18);
               $$19.w(180.0F);
               $$19.f(true);
               daa $$20 = new daa($$15);
               dij $$21 = Objects.requireNonNull($$20.a(kl.D));
               $$20.b(kl.W, $$13);
               $$19.a($$21.b(), $$20);
               if ($$14 == 0) {
                  $$19.b($$13.b().a().a($$13.a()).f().f(" & ").b($$13.a().a().b()));
                  $$19.o(true);
               } else {
                  $$19.k(true);
               }

               $$3.b($$19);
            }
         }
      }

      $$0.a(() -> xc.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }

   private static List<jg.c<czw>> a(ji<czw> $$0) {
      List<jg.c<czw>> $$1 = new ArrayList<>();
      $$0.c().forEach($$1x -> {
         dij $$2 = ((czw)$$1x.a()).f().a(kl.D);
         if ($$2 != null && $$2.b().a() == bxf.a.b && $$2.d().isPresent()) {
            $$1.add($$1x);
         }
      });
      return $$1;
   }
}
