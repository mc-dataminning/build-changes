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

public class ako {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vd.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vd.b("commands.schedule.cleared.failure", $$0));
   private static final SuggestionProvider<ds> c = ($$0, $$1) -> dx.b(((ds)$$0.getSource()).l().aY().K().u().a(), $$1);

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  dt.a("function")
                     .then(
                        dt.a("function", fx.a())
                           .suggests(aji.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("time", ff.a())
                                       .executes($$0x -> a((ds)$$0x.getSource(), fx.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       dt.a("append")
                                          .executes(
                                             $$0x -> a((ds)$$0x.getSource(), fx.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    dt.a("replace")
                                       .executes($$0x -> a((ds)$$0x.getSource(), fx.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
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

   private static int a(ds $$0, Pair<ahd, Either<hb<ds>, Collection<hb<ds>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().X() + (long)$$2;
         ahd $$5 = (ahd)$$1.getFirst();
         ekz<MinecraftServer> $$6 = $$0.l().aY().K().u();
         ((Either)$$1.getSecond()).ifLeft($$6x -> {
            String $$7 = $$5.toString();
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new ekv($$5));
            $$0.a(() -> vd.a("commands.schedule.created.function", vd.a($$5), $$2, $$4), true);
         }).ifRight($$6x -> {
            String $$7 = "#" + $$5;
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new ekw($$5));
            $$0.a(() -> vd.a("commands.schedule.created.tag", vd.a($$5), $$2, $$4), true);
         });
         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(ds $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().aY().K().u().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> vd.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
