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

public class ami {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vu.c("commands.random.error.range_too_large"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vu.c("commands.random.error.range_too_small"));

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
                     ((RequiredArgumentBuilder)dv.a("sequence", ev.a()).suggests(ami::a).executes($$0x -> a((du)$$0x.getSource(), ev.e($$0x, "sequence"))))
                        .then(
                           ((RequiredArgumentBuilder)dv.a("seed", IntegerArgumentType.integer())
                                 .executes($$0x -> a((du)$$0x.getSource(), ev.e($$0x, "sequence"), IntegerArgumentType.getInteger($$0x, "seed"), true, true)))
                              .then(
                                 ((RequiredArgumentBuilder)dv.a("includeWorldSeed", BoolArgumentType.bool())
                                       .executes(
                                          $$0x -> a(
                                                (du)$$0x.getSource(),
                                                ev.e($$0x, "sequence"),
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
                                                   ev.e($$0x, "sequence"),
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
            ((RequiredArgumentBuilder)dv.a("range", es.a()).executes($$1x -> a((du)$$1x.getSource(), es.b.a($$1x, "range"), null, $$1)))
               .then(
                  ((RequiredArgumentBuilder)dv.a("sequence", ev.a()).suggests(ami::a).requires($$0x -> $$0x.c(2)))
                     .executes($$1x -> a((du)$$1x.getSource(), es.b.a($$1x, "range"), ev.e($$1x, "sequence"), $$1))
               )
         );
   }

   private static CompletableFuture<Suggestions> a(CommandContext<du> $$0, SuggestionsBuilder $$1) {
      List<String> $$2 = Lists.newArrayList();
      ((du)$$0.getSource()).e().J().a(($$1x, $$2x) -> $$2.add($$1x.toString()));
      return dz.b($$2, $$1);
   }

   private static int a(du $$0, cm.d $$1, @Nullable ajh $$2, boolean $$3) throws CommandSyntaxException {
      axd $$4;
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
         int $$9 = aww.b($$4, $$6, $$7);
         if ($$3) {
            $$0.l().ah().a(vu.a("commands.random.roll", $$0.b(), $$9, $$6, $$7), false);
         } else {
            $$0.a(() -> vu.a("commands.random.sample.success", $$9), false);
         }

         return $$9;
      }
   }

   private static int a(du $$0, ajh $$1) throws CommandSyntaxException {
      $$0.e().J().b($$1);
      $$0.a(() -> vu.a("commands.random.reset.success", vu.a($$1)), false);
      return 1;
   }

   private static int a(du $$0, ajh $$1, int $$2, boolean $$3, boolean $$4) throws CommandSyntaxException {
      $$0.e().J().a($$1, $$2, $$3, $$4);
      $$0.a(() -> vu.a("commands.random.reset.success", vu.a($$1)), false);
      return 1;
   }

   private static int a(du $$0) {
      int $$1 = $$0.e().J().a();
      $$0.a(() -> vu.a("commands.random.reset.all.success", $$1), false);
      return $$1;
   }

   private static int a(du $$0, int $$1, boolean $$2, boolean $$3) {
      bnk $$4 = $$0.e().J();
      $$4.a($$1, $$2, $$3);
      int $$5 = $$4.a();
      $$0.a(() -> vu.a("commands.random.reset.all.success", $$5), false);
      return $$5;
   }
}
