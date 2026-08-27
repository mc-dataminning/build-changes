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

public class ajj {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vg.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> vg.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("from", fm.a())
                  .then(
                     dt.a("to", fm.a())
                        .then(
                           ((RequiredArgumentBuilder)dt.a("biome", er.a($$1, ke.at))
                                 .executes($$0x -> a((ds)$$0x.getSource(), fm.a($$0x, "from"), fm.a($$0x, "to"), er.a($$0x, "biome", ke.at), $$0xx -> true)))
                              .then(
                                 dt.a("replace")
                                    .then(
                                       dt.a("filter", eu.a($$1, ke.at))
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   fm.a($$0x, "from"),
                                                   fm.a($$0x, "to"),
                                                   er.a($$0x, "biome", ke.at),
                                                   eu.a($$0x, "filter", ke.at)::test
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
      return is.c(is.a($$0));
   }

   private static hx a(hx $$0) {
      return new hx(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static cuz a(MutableInt $$0, dll $$1, dzg $$2, ih<cuw> $$3, Predicate<ih<cuw>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = is.c($$5);
         int $$10 = is.c($$6);
         int $$11 = is.c($$7);
         ih<cuw> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.c($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(ane $$0, hx $$1, hx $$2, ih<cuw> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(ane $$0, hx $$1, hx $$2, ih<cuw> $$3, Predicate<ih<cuw>> $$4, Consumer<Supplier<vg>> $$5) {
      hx $$6 = a($$1);
      hx $$7 = a($$2);
      dzg $$8 = dzg.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.Z().c(ctt.z);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<dll> $$11 = new ArrayList<>();

         for (int $$12 = iz.a($$8.j()); $$12 <= iz.a($$8.m()); $$12++) {
            for (int $$13 = iz.a($$8.h()); $$13 <= iz.a($$8.k()); $$13++) {
               dll $$14 = $$0.a($$13, $$12, dlq.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dll $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.l().i().b());
            $$16.a(true);
         }

         $$0.l().a.a($$11);
         $$5.accept(() -> vg.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(ds $$0, hx $$1, hx $$2, ih.c<cuw> $$3, Predicate<ih<cuw>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
