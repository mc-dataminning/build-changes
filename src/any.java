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

public class any {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("commands.schedule.cleared.failure", $$0));
   private static final SuggestionProvider<ee> c = ($$0, $$1) -> ej.b(((ee)$$0.getSource()).l().bb().I().s().a(), $$1);

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  ef.a("function")
                     .then(
                        ef.a("function", gm.a())
                           .suggests(ams.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("time", ft.a())
                                       .executes($$0x -> a((ee)$$0x.getSource(), gm.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       ef.a("append")
                                          .executes(
                                             $$0x -> a((ee)$$0x.getSource(), gm.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    ef.a("replace")
                                       .executes($$0x -> a((ee)$$0x.getSource(), gm.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               ef.a("clear")
                  .then(
                     ef.a("function", StringArgumentType.greedyString())
                        .suggests(c)
                        .executes($$0x -> a((ee)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(ee $$0, Pair<akm, Either<hq<ee>, Collection<hq<ee>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().Y() + (long)$$2;
         akm $$5 = (akm)$$1.getFirst();
         etx<MinecraftServer> $$6 = $$0.l().bb().I().s();
         ((Either)$$1.getSecond()).ifLeft($$6x -> {
            String $$7 = $$5.toString();
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new ett($$5));
            $$0.a(() -> wx.a("commands.schedule.created.function", wx.a($$5), $$2, $$4), true);
         }).ifRight($$6x -> {
            String $$7 = "#" + $$5;
            if ($$3) {
               $$6.a($$7);
            }

            $$6.a($$7, $$4, new etu($$5));
            $$0.a(() -> wx.a("commands.schedule.created.tag", wx.a($$5), $$2, $$4), true);
         });
         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(ee $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().bb().I().s().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> wx.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
