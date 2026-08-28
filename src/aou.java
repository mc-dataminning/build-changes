import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public class aou {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ww.b("commands.schedule.cleared.failure", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ww.b("commands.schedule.macro"));
   private static final SuggestionProvider<ei> d = ($$0, $$1) -> en.b(((ei)$$0.getSource()).l().aZ().I().s().a(), $$1);

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  ej.a("function")
                     .then(
                        ej.a("function", gr.a())
                           .suggests(anm.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("time", fy.a())
                                       .executes($$0x -> a((ei)$$0x.getSource(), gr.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       ej.a("append")
                                          .executes(
                                             $$0x -> a((ei)$$0x.getSource(), gr.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    ej.a("replace")
                                       .executes($$0x -> a((ei)$$0x.getSource(), gr.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               ej.a("clear")
                  .then(
                     ej.a("function", StringArgumentType.greedyString())
                        .suggests(d)
                        .executes($$0x -> a((ei)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(ei $$0, Pair<ale, Either<hw<ei>, Collection<hw<ei>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().ae() + (long)$$2;
         ale $$5 = (ale)$$1.getFirst();
         fdj<MinecraftServer> $$6 = $$0.l().aZ().I().s();
         Optional<hw<ei>> $$7 = ((Either)$$1.getSecond()).left();
         if ($$7.isPresent()) {
            if ($$7.get() instanceof hz) {
               throw c.create();
            }

            String $$8 = $$5.toString();
            if ($$3) {
               $$6.a($$8);
            }

            $$6.a($$8, $$4, new fdf($$5));
            $$0.a(() -> ww.a("commands.schedule.created.function", ww.a($$5), $$2, $$4), true);
         } else {
            String $$9 = "#" + $$5;
            if ($$3) {
               $$6.a($$9);
            }

            $$6.a($$9, $$4, new fdg($$5));
            $$0.a(() -> ww.a("commands.schedule.created.tag", ww.a($$5), $$2, $$4), true);
         }

         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(ei $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().aZ().I().s().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> ww.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
