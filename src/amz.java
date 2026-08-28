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

public class amz {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               ey.a("from", gt.a())
                  .then(
                     ey.a("to", gt.a())
                        .then(
                           ((RequiredArgumentBuilder)ey.a("biome", fw.a($$1, mc.aJ))
                                 .executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "from"), gt.a($$0x, "to"), fw.a($$0x, "biome", mc.aJ), $$0xx -> true)))
                              .then(
                                 ey.a("replace")
                                    .then(
                                       ey.a("filter", ga.a($$1, mc.aJ))
                                          .executes(
                                             $$0x -> a(
                                                   (ex)$$0x.getSource(),
                                                   gt.a($$0x, "from"),
                                                   gt.a($$0x, "to"),
                                                   fw.a($$0x, "biome", mc.aJ),
                                                   ga.a($$0x, "filter", mc.aJ)::test
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
      return kc.c(kc.a($$0));
   }

   private static ji a(ji $$0) {
      return new ji(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static dif a(MutableInt $$0, dzm $$1, eob $$2, jr<dic> $$3, Predicate<jr<dic>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = kc.c($$5);
         int $$10 = kc.c($$6);
         int $$11 = kc.c($$7);
         jr<dic> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.d($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(ard $$0, ji $$1, ji $$2, jr<dic> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(ard $$0, ji $$1, ji $$2, jr<dic> $$3, Predicate<jr<dic>> $$4, Consumer<Supplier<wp>> $$5) {
      ji $$6 = a($$1);
      ji $$7 = a($$2);
      eob $$8 = eob.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.O().c(dgv.A);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<dzm> $$11 = new ArrayList<>();

         for (int $$12 = kk.a($$8.j()); $$12 <= kk.a($$8.m()); $$12++) {
            for (int $$13 = kk.a($$8.h()); $$13 <= kk.a($$8.k()); $$13++) {
               dzm $$14 = $$0.a($$13, $$12, ean.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dzm $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.m().i().b());
            $$16.i();
         }

         $$0.m().a.a($$11);
         $$5.accept(() -> wp.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(ex $$0, ji $$1, ji $$2, jr.c<dic> $$3, Predicate<jr<dic>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
