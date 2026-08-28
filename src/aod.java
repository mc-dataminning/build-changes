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

public class aod {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wz.b("commands.schedule.cleared.failure", $$0));
   private static final SuggestionProvider<et> c = ($$0, $$1) -> ey.b(((et)$$0.getSource()).l().bb().I().s().a(), $$1);

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  eu.a("function")
                     .then(
                        eu.a("function", hb.a())
                           .suggests(amy.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("time", gi.a())
                                       .executes($$0x -> a((et)$$0x.getSource(), hb.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       eu.a("append")
                                          .executes(
                                             $$0x -> a((et)$$0x.getSource(), hb.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    eu.a("replace")
                                       .executes($$0x -> a((et)$$0x.getSource(), hb.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               eu.a("clear")
                  .then(
                     eu.a("function", StringArgumentType.greedyString())
                        .suggests(c)
                        .executes($$0x -> a((et)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(et $$0, Pair<akr, Either<ig<et>, Collection<ig<et>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().Z() + (long)$$2;
         akr $$5 = (akr)$$1.getFirst();
         ewn<MinecraftServer> $$6 = $$0.l().bb().I().s();
         ((Either)$$1.getSecond()).ifLeft($$6x -> {
            String $$7 = $$5.toString();
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new ewj($$5));
            $$0.a(() -> wz.a("commands.schedule.created.function", wz.a($$5), $$2, $$4), true);
         }).ifRight($$6x -> {
            String $$7 = "#" + $$5;
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new ewk($$5));
            $$0.a(() -> wz.a("commands.schedule.created.tag", wz.a($$5), $$2, $$4), true);
         });
         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(et $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().bb().I().s().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> wz.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
