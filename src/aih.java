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

public class aih {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tl.a("commands.schedule.cleared.failure", $$0));
   private static final SuggestionProvider<dt> c = ($$0, $$1) -> dw.b(((dt)$$0.getSource()).l().aT().K().u().a(), $$1);

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  du.a("function")
                     .then(
                        du.a("function", fv.a())
                           .suggests(ahb.a)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("time", fd.a())
                                       .executes($$0x -> a((dt)$$0x.getSource(), fv.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       du.a("append")
                                          .executes(
                                             $$0x -> a((dt)$$0x.getSource(), fv.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    du.a("replace")
                                       .executes($$0x -> a((dt)$$0x.getSource(), fv.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               du.a("clear")
                  .then(
                     du.a("function", StringArgumentType.greedyString())
                        .suggests(c)
                        .executes($$0x -> a((dt)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(dt $$0, Pair<aex, Either<dp, Collection<dp>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().V() + (long)$$2;
         aex $$5 = (aex)$$1.getFirst();
         eha<MinecraftServer> $$6 = $$0.l().aT().K().u();
         ((Either)$$1.getSecond()).ifLeft($$6x -> {
            String $$7 = $$5.toString();
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new egw($$5));
            $$0.a(() -> tl.a("commands.schedule.created.function", $$5, $$2, $$4), true);
         }).ifRight($$6x -> {
            String $$7 = "#" + $$5;
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new egx($$5));
            $$0.a(() -> tl.a("commands.schedule.created.tag", $$5, $$2, $$4), true);
         });
         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(dt $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().aT().K().u().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> tl.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
