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

public class aor {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xp.b("commands.schedule.cleared.failure", $$0));
   private static final SuggestionProvider<ep> c = ($$0, $$1) -> eu.b(((ep)$$0.getSource()).l().bb().I().s().a(), $$1);

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  eq.a("function")
                     .then(
                        eq.a("function", gx.a())
                           .suggests(anl.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("time", ge.a())
                                       .executes($$0x -> a((ep)$$0x.getSource(), gx.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       eq.a("append")
                                          .executes(
                                             $$0x -> a((ep)$$0x.getSource(), gx.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    eq.a("replace")
                                       .executes($$0x -> a((ep)$$0x.getSource(), gx.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               eq.a("clear")
                  .then(
                     eq.a("function", StringArgumentType.greedyString())
                        .suggests(c)
                        .executes($$0x -> a((ep)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(ep $$0, Pair<alf, Either<ib<ep>, Collection<ib<ep>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().Z() + (long)$$2;
         alf $$5 = (alf)$$1.getFirst();
         eve<MinecraftServer> $$6 = $$0.l().bb().I().s();
         ((Either)$$1.getSecond()).ifLeft($$6x -> {
            String $$7 = $$5.toString();
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new eva($$5));
            $$0.a(() -> xp.a("commands.schedule.created.function", xp.a($$5), $$2, $$4), true);
         }).ifRight($$6x -> {
            String $$7 = "#" + $$5;
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new evb($$5));
            $$0.a(() -> xp.a("commands.schedule.created.tag", xp.a($$5), $$2, $$4), true);
         });
         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(ep $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().bb().I().s().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> xp.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
