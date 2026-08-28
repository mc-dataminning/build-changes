import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class anx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wo.c("commands.publish.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wo.b("commands.publish.alreadyPublished", $$0));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("publish").requires($$0x -> $$0x.c(4)))
               .executes($$0x -> a((ex)$$0x.getSource(), ayq.a(), false, null)))
            .then(
               ((RequiredArgumentBuilder)ey.a("allowCommands", BoolArgumentType.bool())
                     .executes($$0x -> a((ex)$$0x.getSource(), ayq.a(), BoolArgumentType.getBool($$0x, "allowCommands"), null)))
                  .then(
                     ((RequiredArgumentBuilder)ey.a("gamemode", fl.a())
                           .executes($$0x -> a((ex)$$0x.getSource(), ayq.a(), BoolArgumentType.getBool($$0x, "allowCommands"), fl.a($$0x, "gamemode"))))
                        .then(
                           ey.a("port", IntegerArgumentType.integer(0, 65535))
                              .executes(
                                 $$0x -> a(
                                       (ex)$$0x.getSource(),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       BoolArgumentType.getBool($$0x, "allowCommands"),
                                       fl.a($$0x, "gamemode")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ex $$0, int $$1, boolean $$2, @Nullable dgf $$3) throws CommandSyntaxException {
      if ($$0.l().r()) {
         throw b.create($$0.l().S());
      } else if (!$$0.l().a($$3, $$2, $$1)) {
         throw a.create();
      } else {
         $$0.a(() -> a($$1), true);
         return $$1;
      }
   }

   public static xc a(int $$0) {
      wo $$1 = wr.a(String.valueOf($$0));
      return wo.a("commands.publish.started", $$1);
   }
}
