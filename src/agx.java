import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;

public class agx {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> tl.a("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               du.a("from", fk.a())
                  .then(
                     du.a("to", fk.a())
                        .then(
                           ((RequiredArgumentBuilder)du.a("biome", eq.a($$1, jc.ap))
                                 .executes($$0x -> a((dt)$$0x.getSource(), fk.a($$0x, "from"), fk.a($$0x, "to"), eq.a($$0x, "biome", jc.ap), $$0xx -> true)))
                              .then(
                                 du.a("replace")
                                    .then(
                                       du.a("filter", et.a($$1, jc.ap))
                                          .executes(
                                             $$0x -> a(
                                                   (dt)$$0x.getSource(),
                                                   fk.a($$0x, "from"),
                                                   fk.a($$0x, "to"),
                                                   eq.a($$0x, "biome", jc.ap),
                                                   et.a($$0x, "filter", jc.ap)::test
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(int $$0) {
      return hp.c(hp.a($$0));
   }

   private static gw a(gw $$0) {
      return new gw(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static cqw a(MutableInt $$0, dhf $$1, dva $$2, he<cqt> $$3, Predicate<he<cqt>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = hp.c($$5);
         int $$10 = hp.c($$6);
         int $$11 = hp.c($$7);
         he<cqt> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.c($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   private static int a(dt $$0, gw $$1, gw $$2, he.c<cqt> $$3, Predicate<he<cqt>> $$4) throws CommandSyntaxException {
      gw $$5 = a($$1);
      gw $$6 = a($$2);
      dva $$7 = dva.a($$5, $$6);
      int $$8 = $$7.c() * $$7.d() * $$7.e();
      int $$9 = $$0.e().X().c(cpr.x);
      if ($$8 > $$9) {
         throw b.create($$9, $$8);
      } else {
         akq $$10 = $$0.e();
         List<dhf> $$11 = new ArrayList<>();

         for (int $$12 = hw.a($$7.i()); $$12 <= hw.a($$7.l()); $$12++) {
            for (int $$13 = hw.a($$7.g()); $$13 <= hw.a($$7.j()); $$13++) {
               dhf $$14 = $$10.a($$13, $$12, dhk.n, false);
               if ($$14 == null) {
                  throw a.create();
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dhf $$16 : $$11) {
            $$16.a(a($$15, $$16, $$7, $$3, $$4), $$10.k().i().b());
            $$16.a(true);
         }

         $$10.k().a.a($$11);
         $$0.a(() -> tl.a("commands.fillbiome.success.count", $$15.getValue(), $$7.g(), $$7.h(), $$7.i(), $$7.j(), $$7.k(), $$7.l()), true);
         return $$15.getValue();
      }
   }
}
