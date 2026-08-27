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
import net.minecraft.server.MinecraftServer;

public class ang {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wi.b("commands.schedule.cleared.failure", $$0));
   private static final SuggestionProvider<dv> c = ($$0, $$1) -> ea.b(((dv)$$0.getSource()).l().bc().I().s().a(), $$1);

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  dw.a("function")
                     .then(
                        dw.a("function", gb.a())
                           .suggests(ama.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("time", fj.a())
                                       .executes($$0x -> a((dv)$$0x.getSource(), gb.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       dw.a("append")
                                          .executes(
                                             $$0x -> a((dv)$$0x.getSource(), gb.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    dw.a("replace")
                                       .executes($$0x -> a((dv)$$0x.getSource(), gb.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               dw.a("clear")
                  .then(
                     dw.a("function", StringArgumentType.greedyString())
                        .suggests(c)
                        .executes($$0x -> a((dv)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(dv $$0, Pair<ajv, Either<hh<dv>, Collection<hh<dv>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().Y() + (long)$$2;
         ajv $$5 = (ajv)$$1.getFirst();
         erw<MinecraftServer> $$6 = $$0.l().bc().I().s();
         ((Either)$$1.getSecond()).ifLeft($$6x -> {
            String $$7 = $$5.toString();
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new ers($$5));
            $$0.a(() -> wi.a("commands.schedule.created.function", wi.a($$5), $$2, $$4), true);
         }).ifRight($$6x -> {
            String $$7 = "#" + $$5;
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new ert($$5));
            $$0.a(() -> wi.a("commands.schedule.created.tag", wi.a($$5), $$2, $$4), true);
         });
         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(dv $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().bc().I().s().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> wi.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
