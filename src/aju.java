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

public class aju {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("commands.random.error.range_too_large"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vb.c("commands.random.error.range_too_small"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("random").then(a("value", false))).then(a("roll", true)))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("reset").requires($$0x -> $$0x.c(2)))
                     .then(
                        ((LiteralArgumentBuilder)dt.a("*").executes($$0x -> a((ds)$$0x.getSource())))
                           .then(
                              ((RequiredArgumentBuilder)dt.a("seed", IntegerArgumentType.integer())
                                    .executes($$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "seed"), true, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)dt.a("includeWorldSeed", BoolArgumentType.bool())
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   IntegerArgumentType.getInteger($$0x, "seed"),
                                                   BoolArgumentType.getBool($$0x, "includeWorldSeed"),
                                                   true
                                                )
                                          ))
                                       .then(
                                          dt.a("includeSequenceId", BoolArgumentType.bool())
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
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
                     ((RequiredArgumentBuilder)dt.a("sequence", es.a()).suggests(aju::a).executes($$0x -> a((ds)$$0x.getSource(), es.e($$0x, "sequence"))))
                        .then(
                           ((RequiredArgumentBuilder)dt.a("seed", IntegerArgumentType.integer())
                                 .executes($$0x -> a((ds)$$0x.getSource(), es.e($$0x, "sequence"), IntegerArgumentType.getInteger($$0x, "seed"), true, true)))
                              .then(
                                 ((RequiredArgumentBuilder)dt.a("includeWorldSeed", BoolArgumentType.bool())
                                       .executes(
                                          $$0x -> a(
                                                (ds)$$0x.getSource(),
                                                es.e($$0x, "sequence"),
                                                IntegerArgumentType.getInteger($$0x, "seed"),
                                                BoolArgumentType.getBool($$0x, "includeWorldSeed"),
                                                true
                                             )
                                       ))
                                    .then(
                                       dt.a("includeSequenceId", BoolArgumentType.bool())
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   es.e($$0x, "sequence"),
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

   private static LiteralArgumentBuilder<ds> a(String $$0, boolean $$1) {
      return (LiteralArgumentBuilder<ds>)dt.a($$0)
         .then(
            ((RequiredArgumentBuilder)dt.a("range", ep.a()).executes($$1x -> a((ds)$$1x.getSource(), ep.b.a($$1x, "range"), null, $$1)))
               .then(
                  ((RequiredArgumentBuilder)dt.a("sequence", es.a()).suggests(aju::a).requires($$0x -> $$0x.c(2)))
                     .executes($$1x -> a((ds)$$1x.getSource(), ep.b.a($$1x, "range"), es.e($$1x, "sequence"), $$1))
               )
         );
   }

   private static CompletableFuture<Suggestions> a(CommandContext<ds> $$0, SuggestionsBuilder $$1) {
      List<String> $$2 = Lists.newArrayList();
      ((ds)$$0.getSource()).e().I().a(($$1x, $$2x) -> $$2.add($$1x.toString()));
      return dw.b($$2, $$1);
   }

   private static int a(ds $$0, ck.d $$1, @Nullable agt $$2, boolean $$3) throws CommandSyntaxException {
      auf $$4;
      if ($$2 != null) {
         $$4 = $$0.e().a($$2);
      } else {
         $$4 = $$0.e().F_();
      }

      int $$6 = $$1.a().orElse(Integer.MIN_VALUE);
      int $$7 = $$1.b().orElse(Integer.MAX_VALUE);
      long $$8 = (long)$$7 - (long)$$6;
      if ($$8 == 0L) {
         throw b.create();
      } else if ($$8 >= 2147483647L) {
         throw a.create();
      } else {
         int $$9 = aty.b($$4, $$6, $$7);
         if ($$3) {
            $$0.l().ae().a(vb.a("commands.random.roll", $$0.b(), $$9, $$6, $$7), false);
         } else {
            $$0.a(() -> vb.a("commands.random.sample.success", $$9), false);
         }

         return $$9;
      }
   }

   private static int a(ds $$0, agt $$1) throws CommandSyntaxException {
      $$0.e().I().b($$1);
      $$0.a(() -> vb.a("commands.random.reset.success", vb.a($$1)), false);
      return 1;
   }

   private static int a(ds $$0, agt $$1, int $$2, boolean $$3, boolean $$4) throws CommandSyntaxException {
      $$0.e().I().a($$1, $$2, $$3, $$4);
      $$0.a(() -> vb.a("commands.random.reset.success", vb.a($$1)), false);
      return 1;
   }

   private static int a(ds $$0) {
      int $$1 = $$0.e().I().a();
      $$0.a(() -> vb.a("commands.random.reset.all.success", $$1), false);
      return $$1;
   }

   private static int a(ds $$0, int $$1, boolean $$2, boolean $$3) {
      bjr $$4 = $$0.e().I();
      $$4.a($$1, $$2, $$3);
      int $$5 = $$4.a();
      $$0.a(() -> vb.a("commands.random.reset.all.success", $$5), false);
      return $$5;
   }
}
