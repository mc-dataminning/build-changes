import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class ape {
   private static final List<alf<dhs>> a = List.of(
      dht.a, dht.b, dht.c, dht.d, dht.e, dht.f, dht.g, dht.h, dht.i, dht.j, dht.k, dht.l, dht.m, dht.n, dht.o, dht.p, dht.q, dht.r
   );
   private static final List<alf<dhq>> b = List.of(dhr.a, dhr.b, dhr.c, dhr.d, dhr.e, dhr.f, dhr.g, dhr.h, dhr.i, dhr.j, dhr.k);
   private static final ToIntFunction<alf<dhs>> c = af.g(a);
   private static final ToIntFunction<alf<dhq>> d = af.g(b);
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wy.b("Invalid pattern", $$0));

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
               .then(ej.a("*_lag_my_game").executes($$0x -> a((ei)$$0x.getSource(), ((ei)$$0x.getSource()).h()))))
            .then(ej.a("pattern", fi.a(mg.bl)).executes($$0x -> a((ei)$$0x.getSource(), ((ei)$$0x.getSource()).h(), fi.a($$0x, "pattern", mg.bl, e))))
      );
   }

   private static int a(ei $$0, crc $$1) {
      return a($$0, $$1, $$0.l().ba().f(mg.bl).c());
   }

   private static int a(ei $$0, crc $$1, alf<dhs> $$2) {
      return a($$0, $$1, Stream.of($$0.l().ba().f(mg.bl).a($$2).orElseThrow()));
   }

   private static int a(ei $$0, crc $$1, Stream<je.c<dhs>> $$2) {
      arq $$3 = $$0.e();
      List<je.c<dhs>> $$4 = $$2.sorted(Comparator.comparing($$0x -> c.applyAsInt($$0x.h()))).toList();
      List<je.c<dhq>> $$5 = $$3.F_().f(mg.bk).c().sorted(Comparator.comparing($$0x -> d.applyAsInt($$0x.h()))).toList();
      List<je.c<cyz>> $$6 = a($$3.F_().f(mg.K));
      iu $$7 = $$1.dv().a($$1.cO(), 5);
      double $$8 = 3.0;

      for (int $$9 = 0; $$9 < $$5.size(); $$9++) {
         je.c<dhq> $$10 = $$5.get($$9);

         for (int $$11 = 0; $$11 < $$4.size(); $$11++) {
            je.c<dhs> $$12 = $$4.get($$11);
            dho $$13 = new dho($$10, $$12);

            for (int $$14 = 0; $$14 < $$6.size(); $$14++) {
               je.c<cyz> $$15 = $$6.get($$14);
               double $$16 = (double)$$7.u() + 0.5 - (double)$$14 * 3.0;
               double $$17 = (double)$$7.v() + 0.5 + (double)$$9 * 3.0;
               double $$18 = (double)$$7.w() + 0.5 + (double)($$11 * 10);
               cmw $$19 = new cmw($$3, $$16, $$17, $$18);
               $$19.w(180.0F);
               $$19.f(true);
               czd $$20 = new czd($$15);
               dhm $$21 = Objects.requireNonNull($$20.a(kj.D));
               $$20.b(kj.W, $$13);
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

      $$0.a(() -> wy.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }

   private static List<je.c<cyz>> a(jg<cyz> $$0) {
      List<je.c<cyz>> $$1 = new ArrayList<>();
      $$0.c().forEach($$1x -> {
         dhm $$2 = ((cyz)$$1x.a()).f().a(kj.D);
         if ($$2 != null && $$2.b().a() == bwp.a.b && $$2.d().isPresent()) {
            $$1.add($$1x);
         }
      });
      return $$1;
   }
}
