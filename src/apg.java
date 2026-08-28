import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class apg {
   private static final List<alh<din>> a = List.of(
      dio.a, dio.b, dio.c, dio.d, dio.e, dio.f, dio.g, dio.h, dio.i, dio.j, dio.k, dio.l, dio.m, dio.n, dio.o, dio.p, dio.q, dio.r
   );
   private static final List<alh<dil>> b = List.of(dim.a, dim.b, dim.c, dim.d, dim.e, dim.f, dim.g, dim.h, dim.i, dim.j, dim.k);
   private static final ToIntFunction<alh<din>> c = ag.g(a);
   private static final ToIntFunction<alh<dil>> d = ag.g(b);
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xa.b("Invalid pattern", $$0));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
               .then(ek.a("*_lag_my_game").executes($$0x -> a((ej)$$0x.getSource(), ((ej)$$0x.getSource()).h()))))
            .then(ek.a("pattern", fj.a(mh.bl)).executes($$0x -> a((ej)$$0x.getSource(), ((ej)$$0x.getSource()).h(), fj.a($$0x, "pattern", mh.bl, e))))
      );
   }

   private static int a(ej $$0, crx $$1) {
      return a($$0, $$1, $$0.l().ba().f(mh.bl).c());
   }

   private static int a(ej $$0, crx $$1, alh<din> $$2) {
      return a($$0, $$1, Stream.of($$0.l().ba().f(mh.bl).a($$2).orElseThrow()));
   }

   private static int a(ej $$0, crx $$1, Stream<jf.c<din>> $$2) {
      ars $$3 = $$0.e();
      List<jf.c<din>> $$4 = $$2.sorted(Comparator.comparing($$0x -> c.applyAsInt($$0x.h()))).toList();
      List<jf.c<dil>> $$5 = $$3.J_().f(mh.bk).c().sorted(Comparator.comparing($$0x -> d.applyAsInt($$0x.h()))).toList();
      List<jf.c<czu>> $$6 = a($$3.J_().f(mh.K));
      iv $$7 = $$1.dv().a($$1.cO(), 5);
      double $$8 = 3.0;

      for (int $$9 = 0; $$9 < $$5.size(); $$9++) {
         jf.c<dil> $$10 = $$5.get($$9);

         for (int $$11 = 0; $$11 < $$4.size(); $$11++) {
            jf.c<din> $$12 = $$4.get($$11);
            dij $$13 = new dij($$10, $$12);

            for (int $$14 = 0; $$14 < $$6.size(); $$14++) {
               jf.c<czu> $$15 = $$6.get($$14);
               double $$16 = (double)$$7.u() + 0.5 - (double)$$14 * 3.0;
               double $$17 = (double)$$7.v() + 0.5 + (double)$$9 * 3.0;
               double $$18 = (double)$$7.w() + 0.5 + (double)($$11 * 10);
               cnr $$19 = new cnr($$3, $$16, $$17, $$18);
               $$19.w(180.0F);
               $$19.f(true);
               czy $$20 = new czy($$15);
               dih $$21 = Objects.requireNonNull($$20.a(kk.D));
               $$20.b(kk.W, $$13);
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

      $$0.a(() -> xa.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }

   private static List<jf.c<czu>> a(jh<czu> $$0) {
      List<jf.c<czu>> $$1 = new ArrayList<>();
      $$0.c().forEach($$1x -> {
         dih $$2 = ((czu)$$1x.a()).f().a(kk.D);
         if ($$2 != null && $$2.b().a() == bxd.a.b && $$2.d().isPresent()) {
            $$1.add($$1x);
         }
      });
      return $$1;
   }
}
