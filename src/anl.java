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

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               ek.a("from", gg.a())
                  .then(
                     ek.a("to", gg.a())
                        .then(
                           ((RequiredArgumentBuilder)ek.a("biome", fi.a($$1, mh.aG))
                                 .executes($$0x -> a((ej)$$0x.getSource(), gg.a($$0x, "from"), gg.a($$0x, "to"), fi.a($$0x, "biome", mh.aG), $$0xx -> true)))
                              .then(
                                 ek.a("replace")
                                    .then(
                                       ek.a("filter", fm.a($$1, mh.aG))
                                          .executes(
                                             $$0x -> a(
                                                   (ej)$$0x.getSource(),
                                                   gg.a($$0x, "from"),
                                                   gg.a($$0x, "to"),
                                                   fi.a($$0x, "biome", mh.aG),
                                                   fm.a($$0x, "filter", mh.aG)::test
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
      return jq.c(jq.a($$0));
   }

   private static iv a(iv $$0) {
      return new iv(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static dks a(MutableInt $$0, ecq $$1, erf $$2, jf<dkp> $$3, Predicate<jf<dkp>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = jq.c($$5);
         int $$10 = jq.c($$6);
         int $$11 = jq.c($$7);
         jf<dkp> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.d($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(arq $$0, iv $$1, iv $$2, jf<dkp> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(arq $$0, iv $$1, iv $$2, jf<dkp> $$3, Predicate<jf<dkp>> $$4, Consumer<Supplier<wy>> $$5) {
      iv $$6 = a($$1);
      iv $$7 = a($$2);
      erf $$8 = erf.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.O().d(dji.B);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<ecq> $$11 = new ArrayList<>();

         for (int $$12 = jy.a($$8.j()); $$12 <= jy.a($$8.m()); $$12++) {
            for (int $$13 = jy.a($$8.h()); $$13 <= jy.a($$8.k()); $$13++) {
               ecq $$14 = $$0.a($$13, $$12, edr.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (ecq $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.m().i().b());
            $$16.i();
         }

         $$0.m().a.b($$11);
         $$5.accept(() -> wy.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(ej $$0, iv $$1, iv $$2, jf.c<dkp> $$3, Predicate<jf<dkp>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
