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

public class anq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ws.b("commands.schedule.cleared.failure", $$0));
   private static final SuggestionProvider<ec> c = ($$0, $$1) -> eh.b(((ec)$$0.getSource()).l().bc().I().s().a(), $$1);

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  ed.a("function")
                     .then(
                        ed.a("function", gi.a())
                           .suggests(amk.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("time", fq.a())
                                       .executes($$0x -> a((ec)$$0x.getSource(), gi.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       ed.a("append")
                                          .executes(
                                             $$0x -> a((ec)$$0x.getSource(), gi.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    ed.a("replace")
                                       .executes($$0x -> a((ec)$$0x.getSource(), gi.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               ed.a("clear")
                  .then(
                     ed.a("function", StringArgumentType.greedyString())
                        .suggests(c)
                        .executes($$0x -> a((ec)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(ec $$0, Pair<akf, Either<ho<ec>, Collection<ho<ec>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().Y() + (long)$$2;
         akf $$5 = (akf)$$1.getFirst();
         ess<MinecraftServer> $$6 = $$0.l().bc().I().s();
         ((Either)$$1.getSecond()).ifLeft($$6x -> {
            String $$7 = $$5.toString();
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new eso($$5));
            $$0.a(() -> ws.a("commands.schedule.created.function", ws.a($$5), $$2, $$4), true);
         }).ifRight($$6x -> {
            String $$7 = "#" + $$5;
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new esp($$5));
            $$0.a(() -> ws.a("commands.schedule.created.tag", ws.a($$5), $$2, $$4), true);
         });
         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(ec $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().bc().I().s().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> ws.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
