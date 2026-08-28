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

public class anw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.schedule.cleared.failure", $$0));
   private static final SuggestionProvider<eq> c = ($$0, $$1) -> ev.b(((eq)$$0.getSource()).l().bb().I().s().a(), $$1);

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  er.a("function")
                     .then(
                        er.a("function", gy.a())
                           .suggests(amq.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("time", gf.a())
                                       .executes($$0x -> a((eq)$$0x.getSource(), gy.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       er.a("append")
                                          .executes(
                                             $$0x -> a((eq)$$0x.getSource(), gy.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    er.a("replace")
                                       .executes($$0x -> a((eq)$$0x.getSource(), gy.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               er.a("clear")
                  .then(
                     er.a("function", StringArgumentType.greedyString())
                        .suggests(c)
                        .executes($$0x -> a((eq)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(eq $$0, Pair<akk, Either<ic<eq>, Collection<ic<eq>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().Z() + (long)$$2;
         akk $$5 = (akk)$$1.getFirst();
         evm<MinecraftServer> $$6 = $$0.l().bb().I().s();
         ((Either)$$1.getSecond()).ifLeft($$6x -> {
            String $$7 = $$5.toString();
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new evi($$5));
            $$0.a(() -> wu.a("commands.schedule.created.function", wu.a($$5), $$2, $$4), true);
         }).ifRight($$6x -> {
            String $$7 = "#" + $$5;
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new evj($$5));
            $$0.a(() -> wu.a("commands.schedule.created.tag", wu.a($$5), $$2, $$4), true);
         });
         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(eq $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().bb().I().s().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> wu.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
