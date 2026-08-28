import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class aog {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.publish.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.publish.alreadyPublished", $$0));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("publish").requires($$0x -> $$0x.c(4)))
               .executes($$0x -> a((eu)$$0x.getSource(), ayw.a(), false, null)))
            .then(
               ((RequiredArgumentBuilder)ev.a("allowCommands", BoolArgumentType.bool())
                     .executes($$0x -> a((eu)$$0x.getSource(), ayw.a(), BoolArgumentType.getBool($$0x, "allowCommands"), null)))
                  .then(
                     ((RequiredArgumentBuilder)ev.a("gamemode", fi.a())
                           .executes($$0x -> a((eu)$$0x.getSource(), ayw.a(), BoolArgumentType.getBool($$0x, "allowCommands"), fi.a($$0x, "gamemode"))))
                        .then(
                           ev.a("port", IntegerArgumentType.integer(0, 65535))
                              .executes(
                                 $$0x -> a(
                                       (eu)$$0x.getSource(),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       BoolArgumentType.getBool($$0x, "allowCommands"),
                                       fi.a($$0x, "gamemode")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(eu $$0, int $$1, boolean $$2, @Nullable deg $$3) throws CommandSyntaxException {
      if ($$0.l().r()) {
         throw b.create($$0.l().S());
      } else if (!$$0.l().a($$3, $$2, $$1)) {
         throw a.create();
      } else {
         $$0.a(() -> a($$1), true);
         return $$1;
      }
   }

   public static xs a(int $$0) {
      xe $$1 = xh.a(String.valueOf($$0));
      return xe.a("commands.publish.started", $$1);
   }
}
