import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableInt;

public class amu {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               eu.a("from", gp.a())
                  .then(
                     eu.a("to", gp.a())
                        .then(
                           ((RequiredArgumentBuilder)eu.a("biome", fs.a($$1, lu.aF))
                                 .executes($$0x -> a((et)$$0x.getSource(), gp.a($$0x, "from"), gp.a($$0x, "to"), fs.a($$0x, "biome", lu.aF), $$0xx -> true)))
                              .then(
                                 eu.a("replace")
                                    .then(
                                       eu.a("filter", fw.a($$1, lu.aF))
                                          .executes(
                                             $$0x -> a(
                                                   (et)$$0x.getSource(),
                                                   gp.a($$0x, "from"),
                                                   gp.a($$0x, "to"),
                                                   fs.a($$0x, "biome", lu.aF),
                                                   fw.a($$0x, "filter", lu.aF)::test
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
      return jx.c(jx.a($$0));
   }

   private static jd a(jd $$0) {
      return new jd(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static ddx a(MutableInt $$0, duw $$1, eje $$2, jm<ddu> $$3, Predicate<jm<ddu>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = jx.c($$5);
         int $$10 = jx.c($$6);
         int $$11 = jx.c($$7);
         jm<ddu> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.d($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(aqt $$0, jd $$1, jd $$2, jm<ddu> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(aqt $$0, jd $$1, jd $$2, jm<ddu> $$3, Predicate<jm<ddu>> $$4, Consumer<Supplier<wy>> $$5) {
      jd $$6 = a($$1);
      jd $$7 = a($$2);
      eje $$8 = eje.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.ab().c(dcq.z);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<duw> $$11 = new ArrayList<>();

         for (int $$12 = kf.a($$8.j()); $$12 <= kf.a($$8.m()); $$12++) {
            for (int $$13 = kf.a($$8.h()); $$13 <= kf.a($$8.k()); $$13++) {
               duw $$14 = $$0.a($$13, $$12, dvx.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (duw $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.l().i().b());
            $$16.a(true);
         }

         $$0.l().a.a($$11);
         $$5.accept(() -> wy.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(et $$0, jd $$1, jd $$2, jm.c<ddu> $$3, Predicate<jm<ddu>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
