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

public class anh {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xd.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               eu.a("from", gp.a())
                  .then(
                     eu.a("to", gp.a())
                        .then(
                           ((RequiredArgumentBuilder)eu.a("biome", fs.a($$1, lv.aG))
                                 .executes($$0x -> a((et)$$0x.getSource(), gp.a($$0x, "from"), gp.a($$0x, "to"), fs.a($$0x, "biome", lv.aG), $$0xx -> true)))
                              .then(
                                 eu.a("replace")
                                    .then(
                                       eu.a("filter", fw.a($$1, lv.aG))
                                          .executes(
                                             $$0x -> a(
                                                   (et)$$0x.getSource(),
                                                   gp.a($$0x, "from"),
                                                   gp.a($$0x, "to"),
                                                   fs.a($$0x, "biome", lv.aG),
                                                   fw.a($$0x, "filter", lv.aG)::test
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
      return jy.c(jy.a($$0));
   }

   private static je a(je $$0) {
      return new je(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static dfk a(MutableInt $$0, dwk $$1, eku $$2, jn<dfh> $$3, Predicate<jn<dfh>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = jy.c($$5);
         int $$10 = jy.c($$6);
         int $$11 = jy.c($$7);
         jn<dfh> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.d($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(arh $$0, je $$1, je $$2, jn<dfh> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(arh $$0, je $$1, je $$2, jn<dfh> $$3, Predicate<jn<dfh>> $$4, Consumer<Supplier<xd>> $$5) {
      je $$6 = a($$1);
      je $$7 = a($$2);
      eku $$8 = eku.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.ac().c(dec.z);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<dwk> $$11 = new ArrayList<>();

         for (int $$12 = kg.a($$8.j()); $$12 <= kg.a($$8.m()); $$12++) {
            for (int $$13 = kg.a($$8.h()); $$13 <= kg.a($$8.k()); $$13++) {
               dwk $$14 = $$0.a($$13, $$12, dxl.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dwk $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.l().i().b());
            $$16.a(true);
         }

         $$0.l().a.a($$11);
         $$5.accept(() -> xd.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(et $$0, je $$1, je $$2, jn.c<dfh> $$3, Predicate<jn<dfh>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
