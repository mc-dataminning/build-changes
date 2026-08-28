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

public class aoh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("commands.random.error.range_too_large"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xp.c("commands.random.error.range_too_small"));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("random").then(a("value", false))).then(a("roll", true)))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("reset").requires($$0x -> $$0x.c(2)))
                     .then(
                        ((LiteralArgumentBuilder)eq.a("*").executes($$0x -> a((ep)$$0x.getSource())))
                           .then(
                              ((RequiredArgumentBuilder)eq.a("seed", IntegerArgumentType.integer())
                                    .executes($$0x -> a((ep)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "seed"), true, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)eq.a("includeWorldSeed", BoolArgumentType.bool())
                                          .executes(
                                             $$0x -> a(
                                                   (ep)$$0x.getSource(),
                                                   IntegerArgumentType.getInteger($$0x, "seed"),
                                                   BoolArgumentType.getBool($$0x, "includeWorldSeed"),
                                                   true
                                                )
                                          ))
                                       .then(
                                          eq.a("includeSequenceId", BoolArgumentType.bool())
                                             .executes(
                                                $$0x -> a(
                                                      (ep)$$0x.getSource(),
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
                     ((RequiredArgumentBuilder)eq.a("sequence", fq.a()).suggests(aoh::a).executes($$0x -> a((ep)$$0x.getSource(), fq.c($$0x, "sequence"))))
                        .then(
                           ((RequiredArgumentBuilder)eq.a("seed", IntegerArgumentType.integer())
                                 .executes($$0x -> a((ep)$$0x.getSource(), fq.c($$0x, "sequence"), IntegerArgumentType.getInteger($$0x, "seed"), true, true)))
                              .then(
                                 ((RequiredArgumentBuilder)eq.a("includeWorldSeed", BoolArgumentType.bool())
                                       .executes(
                                          $$0x -> a(
                                                (ep)$$0x.getSource(),
                                                fq.c($$0x, "sequence"),
                                                IntegerArgumentType.getInteger($$0x, "seed"),
                                                BoolArgumentType.getBool($$0x, "includeWorldSeed"),
                                                true
                                             )
                                       ))
                                    .then(
                                       eq.a("includeSequenceId", BoolArgumentType.bool())
                                          .executes(
                                             $$0x -> a(
                                                   (ep)$$0x.getSource(),
                                                   fq.c($$0x, "sequence"),
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

   private static LiteralArgumentBuilder<ep> a(String $$0, boolean $$1) {
      return (LiteralArgumentBuilder<ep>)eq.a($$0)
         .then(
            ((RequiredArgumentBuilder)eq.a("range", fn.a()).executes($$1x -> a((ep)$$1x.getSource(), fn.b.a($$1x, "range"), null, $$1)))
               .then(
                  ((RequiredArgumentBuilder)eq.a("sequence", fq.a()).suggests(aoh::a).requires($$0x -> $$0x.c(2)))
                     .executes($$1x -> a((ep)$$1x.getSource(), fn.b.a($$1x, "range"), fq.c($$1x, "sequence"), $$1))
               )
         );
   }

   private static CompletableFuture<Suggestions> a(CommandContext<ep> $$0, SuggestionsBuilder $$1) {
      List<String> $$2 = Lists.newArrayList();
      ((ep)$$0.getSource()).e().L().a(($$1x, $$2x) -> $$2.add($$1x.toString()));
      return eu.b($$2, $$1);
   }

   private static int a(ep $$0, de.d $$1, @Nullable alf $$2, boolean $$3) throws CommandSyntaxException {
      azh $$4;
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
         int $$9 = ayz.b($$4, $$6, $$7);
         if ($$3) {
            $$0.l().ah().a(xp.a("commands.random.roll", $$0.b(), $$9, $$6, $$7), false);
         } else {
            $$0.a(() -> xp.a("commands.random.sample.success", $$9), false);
         }

         return $$9;
      }
   }

   private static int a(ep $$0, alf $$1) throws CommandSyntaxException {
      $$0.e().L().b($$1);
      $$0.a(() -> xp.a("commands.random.reset.success", xp.a($$1)), false);
      return 1;
   }

   private static int a(ep $$0, alf $$1, int $$2, boolean $$3, boolean $$4) throws CommandSyntaxException {
      $$0.e().L().a($$1, $$2, $$3, $$4);
      $$0.a(() -> xp.a("commands.random.reset.success", xp.a($$1)), false);
      return 1;
   }

   private static int a(ep $$0) {
      int $$1 = $$0.e().L().a();
      $$0.a(() -> xp.a("commands.random.reset.all.success", $$1), false);
      return $$1;
   }

   private static int a(ep $$0, int $$1, boolean $$2, boolean $$3) {
      brb $$4 = $$0.e().L();
      $$4.a($$1, $$2, $$3);
      int $$5 = $$4.a();
      $$0.a(() -> xp.a("commands.random.reset.all.success", $$5), false);
      return $$5;
   }
}
