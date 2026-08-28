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

public class anl {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               ej.a("from", gf.a())
                  .then(
                     ej.a("to", gf.a())
                        .then(
                           ((RequiredArgumentBuilder)ej.a("biome", fh.a($$1, mg.aG))
                                 .executes($$0x -> a((ei)$$0x.getSource(), gf.a($$0x, "from"), gf.a($$0x, "to"), fh.a($$0x, "biome", mg.aG), $$0xx -> true)))
                              .then(
                                 ej.a("replace")
                                    .then(
                                       ej.a("filter", fl.a($$1, mg.aG))
                                          .executes(
                                             $$0x -> a(
                                                   (ei)$$0x.getSource(),
                                                   gf.a($$0x, "from"),
                                                   gf.a($$0x, "to"),
                                                   fh.a($$0x, "biome", mg.aG),
                                                   fl.a($$0x, "filter", mg.aG)::test
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
      return jp.c(jp.a($$0));
   }

   private static iu a(iu $$0) {
      return new iu(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static dkg a(MutableInt $$0, ece $$1, eqt $$2, je<dkd> $$3, Predicate<je<dkd>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = jp.c($$5);
         int $$10 = jp.c($$6);
         int $$11 = jp.c($$7);
         je<dkd> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.d($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(arq $$0, iu $$1, iu $$2, je<dkd> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(arq $$0, iu $$1, iu $$2, je<dkd> $$3, Predicate<je<dkd>> $$4, Consumer<Supplier<wy>> $$5) {
      iu $$6 = a($$1);
      iu $$7 = a($$2);
      eqt $$8 = eqt.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.O().d(diw.B);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<ece> $$11 = new ArrayList<>();

         for (int $$12 = jx.a($$8.j()); $$12 <= jx.a($$8.m()); $$12++) {
            for (int $$13 = jx.a($$8.h()); $$13 <= jx.a($$8.k()); $$13++) {
               ece $$14 = $$0.a($$13, $$12, edf.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (ece $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.m().i().b());
            $$16.i();
         }

         $$0.m().a.b($$11);
         $$5.accept(() -> wy.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(ei $$0, iu $$1, iu $$2, je.c<dkd> $$3, Predicate<je<dkd>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
