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

public class aoe {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xv.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xv.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               ex.a("from", gs.a())
                  .then(
                     ex.a("to", gs.a())
                        .then(
                           ((RequiredArgumentBuilder)ex.a("biome", fv.a($$1, mb.aH))
                                 .executes($$0x -> a((ew)$$0x.getSource(), gs.a($$0x, "from"), gs.a($$0x, "to"), fv.a($$0x, "biome", mb.aH), $$0xx -> true)))
                              .then(
                                 ex.a("replace")
                                    .then(
                                       ex.a("filter", fz.a($$1, mb.aH))
                                          .executes(
                                             $$0x -> a(
                                                   (ew)$$0x.getSource(),
                                                   gs.a($$0x, "from"),
                                                   gs.a($$0x, "to"),
                                                   fv.a($$0x, "biome", mb.aH),
                                                   fz.a($$0x, "filter", mb.aH)::test
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
      return kb.c(kb.a($$0));
   }

   private static jh a(jh $$0) {
      return new jh(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static dif a(MutableInt $$0, dzi $$1, enu $$2, jq<dic> $$3, Predicate<jq<dic>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = kb.c($$5);
         int $$10 = kb.c($$6);
         int $$11 = kb.c($$7);
         jq<dic> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.d($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(ash $$0, jh $$1, jh $$2, jq<dic> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(ash $$0, jh $$1, jh $$2, jq<dic> $$3, Predicate<jq<dic>> $$4, Consumer<Supplier<xv>> $$5) {
      jh $$6 = a($$1);
      jh $$7 = a($$2);
      enu $$8 = enu.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.N().c(dgw.z);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<dzi> $$11 = new ArrayList<>();

         for (int $$12 = kj.a($$8.j()); $$12 <= kj.a($$8.m()); $$12++) {
            for (int $$13 = kj.a($$8.h()); $$13 <= kj.a($$8.k()); $$13++) {
               dzi $$14 = $$0.a($$13, $$12, eaj.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dzi $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.m().i().b());
            $$16.a(true);
         }

         $$0.m().a.a($$11);
         $$5.accept(() -> xv.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(ew $$0, jh $$1, jh $$2, jq.c<dic> $$3, Predicate<jq<dic>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
