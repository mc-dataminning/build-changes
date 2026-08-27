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

public class alj {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vu.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> vu.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("from", fo.a())
                  .then(
                     dv.a("to", fo.a())
                        .then(
                           ((RequiredArgumentBuilder)dv.a("biome", et.a($$1, kj.au))
                                 .executes($$0x -> a((du)$$0x.getSource(), fo.a($$0x, "from"), fo.a($$0x, "to"), et.a($$0x, "biome", kj.au), $$0xx -> true)))
                              .then(
                                 dv.a("replace")
                                    .then(
                                       dv.a("filter", ew.a($$1, kj.au))
                                          .executes(
                                             $$0x -> a(
                                                   (du)$$0x.getSource(),
                                                   fo.a($$0x, "from"),
                                                   fo.a($$0x, "to"),
                                                   et.a($$0x, "biome", kj.au),
                                                   ew.a($$0x, "filter", kj.au)::test
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
      return iw.c(iw.a($$0));
   }

   private static ib a(ib $$0) {
      return new ib(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static cyd a(MutableInt $$0, dox $$1, ecw $$2, il<cya> $$3, Predicate<il<cya>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = iw.c($$5);
         int $$10 = iw.c($$6);
         int $$11 = iw.c($$7);
         il<cya> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.c($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(apf $$0, ib $$1, ib $$2, il<cya> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(apf $$0, ib $$1, ib $$2, il<cya> $$3, Predicate<il<cya>> $$4, Consumer<Supplier<vu>> $$5) {
      ib $$6 = a($$1);
      ib $$7 = a($$2);
      ecw $$8 = ecw.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.Z().c(cwx.z);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<dox> $$11 = new ArrayList<>();

         for (int $$12 = je.a($$8.j()); $$12 <= je.a($$8.m()); $$12++) {
            for (int $$13 = je.a($$8.h()); $$13 <= je.a($$8.k()); $$13++) {
               dox $$14 = $$0.a($$13, $$12, dpc.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dox $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.l().i().b());
            $$16.a(true);
         }

         $$0.l().a.a($$11);
         $$5.accept(() -> vu.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(du $$0, ib $$1, ib $$2, il.c<cya> $$3, Predicate<il<cya>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
