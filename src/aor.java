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

public class aor {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.schedule.cleared.failure", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.b("commands.schedule.macro"));
   private static final SuggestionProvider<eu> d = ($$0, $$1) -> ez.b(((eu)$$0.getSource()).l().ba().I().s().a(), $$1);

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  ev.a("function")
                     .then(
                        ev.a("function", hc.a())
                           .suggests(anm.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("time", gj.a())
                                       .executes($$0x -> a((eu)$$0x.getSource(), hc.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       ev.a("append")
                                          .executes(
                                             $$0x -> a((eu)$$0x.getSource(), hc.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    ev.a("replace")
                                       .executes($$0x -> a((eu)$$0x.getSource(), hc.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               ev.a("clear")
                  .then(
                     ev.a("function", StringArgumentType.greedyString())
                        .suggests(d)
                        .executes($$0x -> a((eu)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(eu $$0, Pair<ale, Either<ii<eu>, Collection<ii<eu>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().aa() + (long)$$2;
         ale $$5 = (ale)$$1.getFirst();
         eyj<MinecraftServer> $$6 = $$0.l().ba().I().s();
         Optional<ii<eu>> $$7 = ((Either)$$1.getSecond()).left();
         if ($$7.isPresent()) {
            if ($$7.get() instanceof il) {
               throw c.create();
            }

            String $$8 = $$5.toString();
            if ($$3) {
               $$6.a($$8);
            }

            $$6.a($$8, $$4, new eyf($$5));
            $$0.a(() -> xe.a("commands.schedule.created.function", xe.a($$5), $$2, $$4), true);
         } else {
            String $$9 = "#" + $$5;
            if ($$3) {
               $$6.a($$9);
            }

            $$6.a($$9, $$4, new eyg($$5));
            $$0.a(() -> xe.a("commands.schedule.created.tag", xe.a($$5), $$2, $$4), true);
         }

         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(eu $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().ba().I().s().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> xe.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
