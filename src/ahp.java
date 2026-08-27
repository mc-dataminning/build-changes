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

public class ahp {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.random.error.range_too_large"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("commands.random.error.range_too_small"));

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
                     ((RequiredArgumentBuilder)dt.a("sequence", er.a()).suggests(ahp::a).executes($$0x -> a((ds)$$0x.getSource(), er.e($$0x, "sequence"))))
                        .then(
                           ((RequiredArgumentBuilder)dt.a("seed", IntegerArgumentType.integer())
                                 .executes($$0x -> a((ds)$$0x.getSource(), er.e($$0x, "sequence"), IntegerArgumentType.getInteger($$0x, "seed"), true, true)))
                              .then(
                                 ((RequiredArgumentBuilder)dt.a("includeWorldSeed", BoolArgumentType.bool())
                                       .executes(
                                          $$0x -> a(
                                                (ds)$$0x.getSource(),
                                                er.e($$0x, "sequence"),
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
                                                   er.e($$0x, "sequence"),
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
            ((RequiredArgumentBuilder)dt.a("range", eo.a()).executes($$1x -> a((ds)$$1x.getSource(), eo.b.a($$1x, "range"), null, $$1)))
               .then(
                  ((RequiredArgumentBuilder)dt.a("sequence", er.a()).suggests(ahp::a).requires($$0x -> $$0x.c(2)))
                     .executes($$1x -> a((ds)$$1x.getSource(), eo.b.a($$1x, "range"), er.e($$1x, "sequence"), $$1))
               )
         );
   }

   private static CompletableFuture<Suggestions> a(CommandContext<ds> $$0, SuggestionsBuilder $$1) {
      List<String> $$2 = Lists.newArrayList();
      ((ds)$$0.getSource()).e().H().a(($$1x, $$2x) -> $$2.add($$1x.toString()));
      return dv.b($$2, $$1);
   }

   private static int a(ds $$0, cj.d $$1, @Nullable aep $$2, boolean $$3) throws CommandSyntaxException {
      art $$4;
      if ($$2 != null) {
         $$4 = $$0.e().a($$2);
      } else {
         $$4 = $$0.e().y_();
      }

      int $$6 = $$1.a() == null ? Integer.MIN_VALUE : (Integer)$$1.a();
      int $$7 = $$1.b() == null ? Integer.MAX_VALUE : (Integer)$$1.b();
      long $$8 = (long)$$7 - (long)$$6;
      if ($$8 == 0L) {
         throw b.create();
      } else if ($$8 >= 2147483647L) {
         throw a.create();
      } else {
         int $$9 = aro.b($$4, $$6, $$7);
         if ($$3) {
            $$0.l().ac().a(te.a("commands.random.roll", $$0.b(), $$9, $$6, $$7), false);
         } else {
            $$0.a(() -> te.a("commands.random.sample.success", $$9), false);
         }

         return $$9;
      }
   }

   private static int a(ds $$0, aep $$1) throws CommandSyntaxException {
      $$0.e().H().b($$1);
      $$0.a(() -> te.a("commands.random.reset.success", $$1), false);
      return 1;
   }

   private static int a(ds $$0, aep $$1, int $$2, boolean $$3, boolean $$4) throws CommandSyntaxException {
      $$0.e().H().a($$1, $$2, $$3, $$4);
      $$0.a(() -> te.a("commands.random.reset.success", $$1), false);
      return 1;
   }

   private static int a(ds $$0) {
      int $$1 = $$0.e().H().a();
      $$0.a(() -> te.a("commands.random.reset.all.success", $$1), false);
      return $$1;
   }

   private static int a(ds $$0, int $$1, boolean $$2, boolean $$3) {
      bgu $$4 = $$0.e().H();
      $$4.a($$1, $$2, $$3);
      int $$5 = $$4.a();
      $$0.a(() -> te.a("commands.random.reset.all.success", $$5), false);
      return $$5;
   }
}
