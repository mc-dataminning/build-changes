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

public class anj {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               ev.a("from", gq.a())
                  .then(
                     ev.a("to", gq.a())
                        .then(
                           ((RequiredArgumentBuilder)ev.a("biome", ft.a($$1, lw.aH))
                                 .executes($$0x -> a((eu)$$0x.getSource(), gq.a($$0x, "from"), gq.a($$0x, "to"), ft.a($$0x, "biome", lw.aH), $$0xx -> true)))
                              .then(
                                 ev.a("replace")
                                    .then(
                                       ev.a("filter", fx.a($$1, lw.aH))
                                          .executes(
                                             $$0x -> a(
                                                   (eu)$$0x.getSource(),
                                                   gq.a($$0x, "from"),
                                                   gq.a($$0x, "to"),
                                                   ft.a($$0x, "biome", lw.aH),
                                                   fx.a($$0x, "filter", lw.aH)::test
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
      return jz.c(jz.a($$0));
   }

   private static jf a(jf $$0) {
      return new jf(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static dfn a(MutableInt $$0, dwo $$1, eky $$2, jo<dfk> $$3, Predicate<jo<dfk>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = jz.c($$5);
         int $$10 = jz.c($$6);
         int $$11 = jz.c($$7);
         jo<dfk> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.d($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(arj $$0, jf $$1, jf $$2, jo<dfk> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(arj $$0, jf $$1, jf $$2, jo<dfk> $$3, Predicate<jo<dfk>> $$4, Consumer<Supplier<xe>> $$5) {
      jf $$6 = a($$1);
      jf $$7 = a($$2);
      eky $$8 = eky.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.ac().c(def.z);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<dwo> $$11 = new ArrayList<>();

         for (int $$12 = kh.a($$8.j()); $$12 <= kh.a($$8.m()); $$12++) {
            for (int $$13 = kh.a($$8.h()); $$13 <= kh.a($$8.k()); $$13++) {
               dwo $$14 = $$0.a($$13, $$12, dxp.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dwo $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.l().i().b());
            $$16.a(true);
         }

         $$0.l().a.a($$11);
         $$5.accept(() -> xe.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(eu $$0, jf $$1, jf $$2, jo.c<dfk> $$3, Predicate<jo<dfk>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
