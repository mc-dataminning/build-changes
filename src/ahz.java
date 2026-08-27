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

public class ahz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> te.a("commands.schedule.cleared.failure", $$0));
   private static final SuggestionProvider<ds> c = ($$0, $$1) -> dv.b(((ds)$$0.getSource()).l().aU().K().u().a(), $$1);

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  dt.a("function")
                     .then(
                        dt.a("function", fu.a())
                           .suggests(agt.a)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("time", fc.a())
                                       .executes($$0x -> a((ds)$$0x.getSource(), fu.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       dt.a("append")
                                          .executes(
                                             $$0x -> a((ds)$$0x.getSource(), fu.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    dt.a("replace")
                                       .executes($$0x -> a((ds)$$0x.getSource(), fu.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               dt.a("clear")
                  .then(
                     dt.a("function", StringArgumentType.greedyString())
                        .suggests(c)
                        .executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(ds $$0, Pair<aep, Either<dn, Collection<dn>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().V() + (long)$$2;
         aep $$5 = (aep)$$1.getFirst();
         egs<MinecraftServer> $$6 = $$0.l().aU().K().u();
         ((Either)$$1.getSecond()).ifLeft($$6x -> {
            String $$7 = $$5.toString();
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new ego($$5));
            $$0.a(() -> te.a("commands.schedule.created.function", $$5, $$2, $$4), true);
         }).ifRight($$6x -> {
            String $$7 = "#" + $$5;
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new egp($$5));
            $$0.a(() -> te.a("commands.schedule.created.tag", $$5, $$2, $$4), true);
         });
         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(ds $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().aU().K().u().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> te.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
