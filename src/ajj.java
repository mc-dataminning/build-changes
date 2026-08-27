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

public class ajj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("commands.random.error.range_too_large"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ur.c("commands.random.error.range_too_small"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("random").then(a("value", false))).then(a("roll", true)))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("reset").requires($$0x -> $$0x.c(2)))
                     .then(
                        ((LiteralArgumentBuilder)dv.a("*").executes($$0x -> a((du)$$0x.getSource())))
                           .then(
                              ((RequiredArgumentBuilder)dv.a("seed", IntegerArgumentType.integer())
                                    .executes($$0x -> a((du)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "seed"), true, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)dv.a("includeWorldSeed", BoolArgumentType.bool())
                                          .executes(
                                             $$0x -> a(
                                                   (du)$$0x.getSource(),
                                                   IntegerArgumentType.getInteger($$0x, "seed"),
                                                   BoolArgumentType.getBool($$0x, "includeWorldSeed"),
                                                   true
                                                )
                                          ))
                                       .then(
                                          dv.a("includeSequenceId", BoolArgumentType.bool())
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
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
                     ((RequiredArgumentBuilder)dv.a("sequence", eu.a()).suggests(ajj::a).executes($$0x -> a((du)$$0x.getSource(), eu.e($$0x, "sequence"))))
                        .then(
                           ((RequiredArgumentBuilder)dv.a("seed", IntegerArgumentType.integer())
                                 .executes($$0x -> a((du)$$0x.getSource(), eu.e($$0x, "sequence"), IntegerArgumentType.getInteger($$0x, "seed"), true, true)))
                              .then(
                                 ((RequiredArgumentBuilder)dv.a("includeWorldSeed", BoolArgumentType.bool())
                                       .executes(
                                          $$0x -> a(
                                                (du)$$0x.getSource(),
                                                eu.e($$0x, "sequence"),
                                                IntegerArgumentType.getInteger($$0x, "seed"),
                                                BoolArgumentType.getBool($$0x, "includeWorldSeed"),
                                                true
                                             )
                                       ))
                                    .then(
                                       dv.a("includeSequenceId", BoolArgumentType.bool())
                                          .executes(
                                             $$0x -> a(
                                                   (du)$$0x.getSource(),
                                                   eu.e($$0x, "sequence"),
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

   private static LiteralArgumentBuilder<du> a(String $$0, boolean $$1) {
      return (LiteralArgumentBuilder<du>)dv.a($$0)
         .then(
            ((RequiredArgumentBuilder)dv.a("range", er.a()).executes($$1x -> a((du)$$1x.getSource(), er.b.a($$1x, "range"), null, $$1)))
               .then(
                  ((RequiredArgumentBuilder)dv.a("sequence", eu.a()).suggests(ajj::a).requires($$0x -> $$0x.c(2)))
                     .executes($$1x -> a((du)$$1x.getSource(), er.b.a($$1x, "range"), eu.e($$1x, "sequence"), $$1))
               )
         );
   }

   private static CompletableFuture<Suggestions> a(CommandContext<du> $$0, SuggestionsBuilder $$1) {
      List<String> $$2 = Lists.newArrayList();
      ((du)$$0.getSource()).f().I().a(($$1x, $$2x) -> $$2.add($$1x.toString()));
      return dy.b($$2, $$1);
   }

   private static int a(du $$0, cl.d $$1, @Nullable agi $$2, boolean $$3) throws CommandSyntaxException {
      ats $$4;
      if ($$2 != null) {
         $$4 = $$0.f().a($$2);
      } else {
         $$4 = $$0.f().E_();
      }

      int $$6 = $$1.a().orElse(Integer.MIN_VALUE);
      int $$7 = $$1.b().orElse(Integer.MAX_VALUE);
      long $$8 = (long)$$7 - (long)$$6;
      if ($$8 == 0L) {
         throw b.create();
      } else if ($$8 >= 2147483647L) {
         throw a.create();
      } else {
         int $$9 = atm.b($$4, $$6, $$7);
         if ($$3) {
            $$0.m().ae().a(ur.a("commands.random.roll", $$0.c(), $$9, $$6, $$7), false);
         } else {
            $$0.a(() -> ur.a("commands.random.sample.success", $$9), false);
         }

         return $$9;
      }
   }

   private static int a(du $$0, agi $$1) throws CommandSyntaxException {
      $$0.f().I().b($$1);
      $$0.a(() -> ur.a("commands.random.reset.success", ur.a($$1)), false);
      return 1;
   }

   private static int a(du $$0, agi $$1, int $$2, boolean $$3, boolean $$4) throws CommandSyntaxException {
      $$0.f().I().a($$1, $$2, $$3, $$4);
      $$0.a(() -> ur.a("commands.random.reset.success", ur.a($$1)), false);
      return 1;
   }

   private static int a(du $$0) {
      int $$1 = $$0.f().I().a();
      $$0.a(() -> ur.a("commands.random.reset.all.success", $$1), false);
      return $$1;
   }

   private static int a(du $$0, int $$1, boolean $$2, boolean $$3) {
      bjd $$4 = $$0.f().I();
      $$4.a($$1, $$2, $$3);
      int $$5 = $$4.a();
      $$0.a(() -> ur.a("commands.random.reset.all.success", $$5), false);
      return $$5;
   }
}
