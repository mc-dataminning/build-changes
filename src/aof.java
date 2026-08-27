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

public class aof {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.schedule.cleared.failure", $$0));
   private static final SuggestionProvider<eh> c = ($$0, $$1) -> em.b(((eh)$$0.getSource()).l().bb().I().s().a(), $$1);

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  ei.a("function")
                     .then(
                        ei.a("function", gp.a())
                           .suggests(amz.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("time", fw.a())
                                       .executes($$0x -> a((eh)$$0x.getSource(), gp.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       ei.a("append")
                                          .executes(
                                             $$0x -> a((eh)$$0x.getSource(), gp.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    ei.a("replace")
                                       .executes($$0x -> a((eh)$$0x.getSource(), gp.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               ei.a("clear")
                  .then(
                     ei.a("function", StringArgumentType.greedyString())
                        .suggests(c)
                        .executes($$0x -> a((eh)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(eh $$0, Pair<akt, Either<ht<eh>, Collection<ht<eh>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().Z() + (long)$$2;
         akt $$5 = (akt)$$1.getFirst();
         ewh<MinecraftServer> $$6 = $$0.l().bb().I().s();
         ((Either)$$1.getSecond()).ifLeft($$6x -> {
            String $$7 = $$5.toString();
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new ewd($$5));
            $$0.a(() -> xe.a("commands.schedule.created.function", xe.a($$5), $$2, $$4), true);
         }).ifRight($$6x -> {
            String $$7 = "#" + $$5;
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new ewe($$5));
            $$0.a(() -> xe.a("commands.schedule.created.tag", xe.a($$5), $$2, $$4), true);
         });
         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(eh $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().bb().I().s().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> xe.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
