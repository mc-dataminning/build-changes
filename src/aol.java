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

public class aol {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.random.error.range_too_large"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.random.error.range_too_small"));

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("random").then(a("value", false))).then(a("roll", true)))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("reset").requires($$0x -> $$0x.c(2)))
                     .then(
                        ((LiteralArgumentBuilder)ew.a("*").executes($$0x -> a((ev)$$0x.getSource())))
                           .then(
                              ((RequiredArgumentBuilder)ew.a("seed", IntegerArgumentType.integer())
                                    .executes($$0x -> a((ev)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "seed"), true, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)ew.a("includeWorldSeed", BoolArgumentType.bool())
                                          .executes(
                                             $$0x -> a(
                                                   (ev)$$0x.getSource(),
                                                   IntegerArgumentType.getInteger($$0x, "seed"),
                                                   BoolArgumentType.getBool($$0x, "includeWorldSeed"),
                                                   true
                                                )
                                          ))
                                       .then(
                                          ew.a("includeSequenceId", BoolArgumentType.bool())
                                             .executes(
                                                $$0x -> a(
                                                      (ev)$$0x.getSource(),
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
                     ((RequiredArgumentBuilder)ew.a("sequence", fw.a()).suggests(aol::a).executes($$0x -> a((ev)$$0x.getSource(), fw.c($$0x, "sequence"))))
                        .then(
                           ((RequiredArgumentBuilder)ew.a("seed", IntegerArgumentType.integer())
                                 .executes($$0x -> a((ev)$$0x.getSource(), fw.c($$0x, "sequence"), IntegerArgumentType.getInteger($$0x, "seed"), true, true)))
                              .then(
                                 ((RequiredArgumentBuilder)ew.a("includeWorldSeed", BoolArgumentType.bool())
                                       .executes(
                                          $$0x -> a(
                                                (ev)$$0x.getSource(),
                                                fw.c($$0x, "sequence"),
                                                IntegerArgumentType.getInteger($$0x, "seed"),
                                                BoolArgumentType.getBool($$0x, "includeWorldSeed"),
                                                true
                                             )
                                       ))
                                    .then(
                                       ew.a("includeSequenceId", BoolArgumentType.bool())
                                          .executes(
                                             $$0x -> a(
                                                   (ev)$$0x.getSource(),
                                                   fw.c($$0x, "sequence"),
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

   private static LiteralArgumentBuilder<ev> a(String $$0, boolean $$1) {
      return (LiteralArgumentBuilder<ev>)ew.a($$0)
         .then(
            ((RequiredArgumentBuilder)ew.a("range", ft.a()).executes($$1x -> a((ev)$$1x.getSource(), ft.b.a($$1x, "range"), null, $$1)))
               .then(
                  ((RequiredArgumentBuilder)ew.a("sequence", fw.a()).suggests(aol::a).requires($$0x -> $$0x.c(2)))
                     .executes($$1x -> a((ev)$$1x.getSource(), ft.b.a($$1x, "range"), fw.c($$1x, "sequence"), $$1))
               )
         );
   }

   private static CompletableFuture<Suggestions> a(CommandContext<ev> $$0, SuggestionsBuilder $$1) {
      List<String> $$2 = Lists.newArrayList();
      ((ev)$$0.getSource()).e().M().a(($$1x, $$2x) -> $$2.add($$1x.toString()));
      return fa.b($$2, $$1);
   }

   private static int a(ev $$0, di.d $$1, @Nullable alh $$2, boolean $$3) throws CommandSyntaxException {
      azr $$4;
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
         int $$9 = azj.b($$4, $$6, $$7);
         if ($$3) {
            $$0.l().ag().a(xh.a("commands.random.roll", $$0.b(), $$9, $$6, $$7), false);
         } else {
            $$0.a(() -> xh.a("commands.random.sample.success", $$9), false);
         }

         return $$9;
      }
   }

   private static int a(ev $$0, alh $$1) throws CommandSyntaxException {
      $$0.e().M().b($$1);
      $$0.a(() -> xh.a("commands.random.reset.success", xh.a($$1)), false);
      return 1;
   }

   private static int a(ev $$0, alh $$1, int $$2, boolean $$3, boolean $$4) throws CommandSyntaxException {
      $$0.e().M().a($$1, $$2, $$3, $$4);
      $$0.a(() -> xh.a("commands.random.reset.success", xh.a($$1)), false);
      return 1;
   }

   private static int a(ev $$0) {
      int $$1 = $$0.e().M().a();
      $$0.a(() -> xh.a("commands.random.reset.all.success", $$1), false);
      return $$1;
   }

   private static int a(ev $$0, int $$1, boolean $$2, boolean $$3) {
      bsd $$4 = $$0.e().M();
      $$4.a($$1, $$2, $$3);
      int $$5 = $$4.a();
      $$0.a(() -> xh.a("commands.random.reset.all.success", $$5), false);
      return $$5;
   }
}
