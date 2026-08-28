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

public class ani {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xp.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               eq.a("from", gl.a())
                  .then(
                     eq.a("to", gl.a())
                        .then(
                           ((RequiredArgumentBuilder)eq.a("biome", fo.a($$1, lq.az))
                                 .executes($$0x -> a((ep)$$0x.getSource(), gl.a($$0x, "from"), gl.a($$0x, "to"), fo.a($$0x, "biome", lq.az), $$0xx -> true)))
                              .then(
                                 eq.a("replace")
                                    .then(
                                       eq.a("filter", fs.a($$1, lq.az))
                                          .executes(
                                             $$0x -> a(
                                                   (ep)$$0x.getSource(),
                                                   gl.a($$0x, "from"),
                                                   gl.a($$0x, "to"),
                                                   fo.a($$0x, "biome", lq.az),
                                                   fs.a($$0x, "filter", lq.az)::test
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
      return jt.c(jt.a($$0));
   }

   private static iz a(iz $$0) {
      return new iz(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static ddc a(MutableInt $$0, dua $$1, eie $$2, ji<dcz> $$3, Predicate<ji<dcz>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = jt.c($$5);
         int $$10 = jt.c($$6);
         int $$11 = jt.c($$7);
         ji<dcz> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.d($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(arf $$0, iz $$1, iz $$2, ji<dcz> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(arf $$0, iz $$1, iz $$2, ji<dcz> $$3, Predicate<ji<dcz>> $$4, Consumer<Supplier<xp>> $$5) {
      iz $$6 = a($$1);
      iz $$7 = a($$2);
      eie $$8 = eie.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.ab().c(dbw.z);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<dua> $$11 = new ArrayList<>();

         for (int $$12 = kb.a($$8.j()); $$12 <= kb.a($$8.m()); $$12++) {
            for (int $$13 = kb.a($$8.h()); $$13 <= kb.a($$8.k()); $$13++) {
               dua $$14 = $$0.a($$13, $$12, duz.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dua $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.l().i().b());
            $$16.a(true);
         }

         $$0.l().a.a($$11);
         $$5.accept(() -> xp.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(ep $$0, iz $$1, iz $$2, ji.c<dcz> $$3, Predicate<ji<dcz>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
