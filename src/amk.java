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

public class amk {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               ee.a("from", fz.a())
                  .then(
                     ee.a("to", fz.a())
                        .then(
                           ((RequiredArgumentBuilder)ee.a("biome", fc.a($$1, le.az))
                                 .executes($$0x -> a((ed)$$0x.getSource(), fz.a($$0x, "from"), fz.a($$0x, "to"), fc.a($$0x, "biome", le.az), $$0xx -> true)))
                              .then(
                                 ee.a("replace")
                                    .then(
                                       ee.a("filter", fg.a($$1, le.az))
                                          .executes(
                                             $$0x -> a(
                                                   (ed)$$0x.getSource(),
                                                   fz.a($$0x, "from"),
                                                   fz.a($$0x, "to"),
                                                   fc.a($$0x, "biome", le.az),
                                                   fg.a($$0x, "filter", le.az)::test
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
      return jh.c(jh.a($$0));
   }

   private static in a(in $$0) {
      return new in(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static dbf a(MutableInt $$0, dsd $$1, egh $$2, iw<dbc> $$3, Predicate<iw<dbc>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = jh.c($$5);
         int $$10 = jh.c($$6);
         int $$11 = jh.c($$7);
         iw<dbc> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.c($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(aqh $$0, in $$1, in $$2, iw<dbc> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(aqh $$0, in $$1, in $$2, iw<dbc> $$3, Predicate<iw<dbc>> $$4, Consumer<Supplier<wu>> $$5) {
      in $$6 = a($$1);
      in $$7 = a($$2);
      egh $$8 = egh.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.aa().c(czz.z);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<dsd> $$11 = new ArrayList<>();

         for (int $$12 = jp.a($$8.j()); $$12 <= jp.a($$8.m()); $$12++) {
            for (int $$13 = jp.a($$8.h()); $$13 <= jp.a($$8.k()); $$13++) {
               dsd $$14 = $$0.a($$13, $$12, dtc.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dsd $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.l().i().b());
            $$16.a(true);
         }

         $$0.l().a.a($$11);
         $$5.accept(() -> wu.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(ed $$0, in $$1, in $$2, iw.c<dbc> $$3, Predicate<iw<dbc>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
