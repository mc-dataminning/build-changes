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

public class ajg {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ui.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ui.b("commands.schedule.cleared.failure", $$0));
   private static final SuggestionProvider<du> c = ($$0, $$1) -> dy.b(((du)$$0.getSource()).m().aT().K().u().a(), $$1);

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  dv.a("function")
                     .then(
                        dv.a("function", fx.a())
                           .suggests(aia.a)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("time", ff.a())
                                       .executes($$0x -> a((du)$$0x.getSource(), fx.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       dv.a("append")
                                          .executes(
                                             $$0x -> a((du)$$0x.getSource(), fx.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    dv.a("replace")
                                       .executes($$0x -> a((du)$$0x.getSource(), fx.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               dv.a("clear")
                  .then(
                     dv.a("function", StringArgumentType.greedyString())
                        .suggests(c)
                        .executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(du $$0, Pair<afw, Either<gx<du>, Collection<gx<du>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.f().V() + (long)$$2;
         afw $$5 = (afw)$$1.getFirst();
         ehs<MinecraftServer> $$6 = $$0.m().aT().K().u();
         ((Either)$$1.getSecond()).ifLeft($$6x -> {
            String $$7 = $$5.toString();
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new eho($$5));
            $$0.a(() -> ui.a("commands.schedule.created.function", ui.a($$5), $$2, $$4), true);
         }).ifRight($$6x -> {
            String $$7 = "#" + $$5;
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new ehp($$5));
            $$0.a(() -> ui.a("commands.schedule.created.tag", ui.a($$5), $$2, $$4), true);
         });
         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(du $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.m().aT().K().u().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> ui.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
