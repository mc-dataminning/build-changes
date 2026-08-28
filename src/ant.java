import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ant {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.random.error.range_too_large"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.random.error.range_too_small"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("random").then(a("value", false))).then(a("roll", true)))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("reset").requires($$0x -> $$0x.c(2)))
                     .then(
                        ((LiteralArgumentBuilder)eu.a("*").executes($$0x -> a((et)$$0x.getSource())))
                           .then(
                              ((RequiredArgumentBuilder)eu.a("seed", IntegerArgumentType.integer())
                                    .executes($$0x -> a((et)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "seed"), true, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)eu.a("includeWorldSeed", BoolArgumentType.bool())
                                          .executes(
                                             $$0x -> a(
                                                   (et)$$0x.getSource(),
                                                   IntegerArgumentType.getInteger($$0x, "seed"),
                                                   BoolArgumentType.getBool($$0x, "includeWorldSeed"),
                                                   true
                                                )
                                          ))
                                       .then(
                                          eu.a("includeSequenceId", BoolArgumentType.bool())
                                             .executes(
                                                $$0x -> a(
                                                      (et)$$0x.getSource(),
                                                      IntegerArgumentType.getInteger($$0x, "seed"),
                                                      BoolArgumentType.getBool($$0x, "includeWorldSeed"),
                                                      BoolArgumentType.getBool($$0x, "includeSequenceId")
                                                   )
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)eu.a("sequence", fu.a()).suggests(ant::a).executes($$0x -> a((et)$$0x.getSource(), fu.c($$0x, "sequence"))))
                        .then(
                           ((RequiredArgumentBuilder)eu.a("seed", IntegerArgumentType.integer())
                                 .executes($$0x -> a((et)$$0x.getSource(), fu.c($$0x, "sequence"), IntegerArgumentType.getInteger($$0x, "seed"), true, true)))
                              .then(
                                 ((RequiredArgumentBuilder)eu.a("includeWorldSeed", BoolArgumentType.bool())
                                       .executes(
                                          $$0x -> a(
                                                (et)$$0x.getSource(),
                                                fu.c($$0x, "sequence"),
                                                IntegerArgumentType.getInteger($$0x, "seed"),
                                                BoolArgumentType.getBool($$0x, "includeWorldSeed"),
                                                true
                                             )
                                       ))
                                    .then(
                                       eu.a("includeSequenceId", BoolArgumentType.bool())
                                          .executes(
                                             $$0x -> a(
                                                   (et)$$0x.getSource(),
                                                   fu.c($$0x, "sequence"),
                                                   IntegerArgumentType.getInteger($$0x, "seed"),
                                                   BoolArgumentType.getBool($$0x, "includeWorldSeed"),
                                                   BoolArgumentType.getBool($$0x, "includeSequenceId")
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static LiteralArgumentBuilder<et> a(String $$0, boolean $$1) {
      return (LiteralArgumentBuilder<et>)eu.a($$0)
         .then(
            ((RequiredArgumentBuilder)eu.a("range", fr.a()).executes($$1x -> a((et)$$1x.getSource(), fr.b.a($$1x, "range"), null, $$1)))
               .then(
                  ((RequiredArgumentBuilder)eu.a("sequence", fu.a()).suggests(ant::a).requires($$0x -> $$0x.c(2)))
                     .executes($$1x -> a((et)$$1x.getSource(), fr.b.a($$1x, "range"), fu.c($$1x, "sequence"), $$1))
               )
         );
   }

   private static CompletableFuture<Suggestions> a(CommandContext<et> $$0, SuggestionsBuilder $$1) {
      List<String> $$2 = Lists.newArrayList();
      ((et)$$0.getSource()).e().L().a(($$1x, $$2x) -> $$2.add($$1x.toString()));
      return ey.b($$2, $$1);
   }

   private static int a(et $$0, dh.d $$1, @Nullable akq $$2, boolean $$3) throws CommandSyntaxException {
      ayv $$4;
      if ($$2 != null) {
         $$4 = $$0.e().a($$2);
      } else {
         $$4 = $$0.e().E_();
      }

      int $$6 = $$1.a().orElse(Integer.MIN_VALUE);
      int $$7 = $$1.b().orElse(Integer.MAX_VALUE);
      long $$8 = (long)$$7 - (long)$$6;
      if ($$8 == 0L) {
         throw b.create();
      } else if ($$8 >= 2147483647L) {
         throw a.create();
      } else {
         int $$9 = ayn.b($$4, $$6, $$7);
         if ($$3) {
            $$0.l().ah().a(wy.a("commands.random.roll", $$0.b(), $$9, $$6, $$7), false);
         } else {
            $$0.a(() -> wy.a("commands.random.sample.success", $$9), false);
         }

         return $$9;
      }
   }

   private static int a(et $$0, akq $$1) throws CommandSyntaxException {
      $$0.e().L().b($$1);
      $$0.a(() -> wy.a("commands.random.reset.success", wy.a($$1)), false);
      return 1;
   }

   private static int a(et $$0, akq $$1, int $$2, boolean $$3, boolean $$4) throws CommandSyntaxException {
      $$0.e().L().a($$1, $$2, $$3, $$4);
      $$0.a(() -> wy.a("commands.random.reset.success", wy.a($$1)), false);
      return 1;
   }

   private static int a(et $$0) {
      int $$1 = $$0.e().L().a();
      $$0.a(() -> wy.a("commands.random.reset.all.success", $$1), false);
      return $$1;
   }

   private static int a(et $$0, int $$1, boolean $$2, boolean $$3) {
      bqx $$4 = $$0.e().L();
      $$4.a($$1, $$2, $$3);
      int $$5 = $$4.a();
      $$0.a(() -> wy.a("commands.random.reset.all.success", $$5), false);
      return $$5;
   }
}
