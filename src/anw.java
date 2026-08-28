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

public class anw {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xg.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               el.a("from", gh.a())
                  .then(
                     el.a("to", gh.a())
                        .then(
                           ((RequiredArgumentBuilder)el.a("biome", fj.a($$1, mi.aG))
                                 .executes($$0x -> a((ek)$$0x.getSource(), gh.a($$0x, "from"), gh.a($$0x, "to"), fj.a($$0x, "biome", mi.aG), $$0xx -> true)))
                              .then(
                                 el.a("replace")
                                    .then(
                                       el.a("filter", fn.a($$1, mi.aG))
                                          .executes(
                                             $$0x -> a(
                                                   (ek)$$0x.getSource(),
                                                   gh.a($$0x, "from"),
                                                   gh.a($$0x, "to"),
                                                   fj.a($$0x, "biome", mi.aG),
                                                   fn.a($$0x, "filter", mi.aG)::test
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
      return jr.c(jr.a($$0));
   }

   private static iw a(iw $$0) {
      return new iw(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static dlp a(MutableInt $$0, edn $$1, esf $$2, jg<dlm> $$3, Predicate<jg<dlm>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = jr.c($$5);
         int $$10 = jr.c($$6);
         int $$11 = jr.c($$7);
         jg<dlm> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.d($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(asb $$0, iw $$1, iw $$2, jg<dlm> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(asb $$0, iw $$1, iw $$2, jg<dlm> $$3, Predicate<jg<dlm>> $$4, Consumer<Supplier<xg>> $$5) {
      iw $$6 = a($$1);
      iw $$7 = a($$2);
      esf $$8 = esf.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.O().d(dkf.B);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<edn> $$11 = new ArrayList<>();

         for (int $$12 = jz.a($$8.j()); $$12 <= jz.a($$8.m()); $$12++) {
            for (int $$13 = jz.a($$8.h()); $$13 <= jz.a($$8.k()); $$13++) {
               edn $$14 = $$0.a($$13, $$12, eeo.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (edn $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.m().i().b());
            $$16.i();
         }

         $$0.m().a.b($$11);
         $$5.accept(() -> xg.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(ek $$0, iw $$1, iw $$2, jg.c<dlm> $$3, Predicate<jg<dlm>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
