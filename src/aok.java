import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class aok {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.publish.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.publish.alreadyPublished", $$0));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("publish").requires($$0x -> $$0x.c(4)))
               .executes($$0x -> a((ej)$$0x.getSource(), azd.a(), false, null)))
            .then(
               ((RequiredArgumentBuilder)ek.a("allowCommands", BoolArgumentType.bool())
                     .executes($$0x -> a((ej)$$0x.getSource(), azd.a(), BoolArgumentType.getBool($$0x, "allowCommands"), null)))
                  .then(
                     ((RequiredArgumentBuilder)ek.a("gamemode", ex.a())
                           .executes($$0x -> a((ej)$$0x.getSource(), azd.a(), BoolArgumentType.getBool($$0x, "allowCommands"), ex.a($$0x, "gamemode"))))
                        .then(
                           ek.a("port", IntegerArgumentType.integer(0, 65535))
                              .executes(
                                 $$0x -> a(
                                       (ej)$$0x.getSource(),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       BoolArgumentType.getBool($$0x, "allowCommands"),
                                       ex.a($$0x, "gamemode")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ej $$0, int $$1, boolean $$2, @Nullable dje $$3) throws CommandSyntaxException {
      if ($$0.l().r()) {
         throw b.create($$0.l().S());
      } else if (!$$0.l().a($$3, $$2, $$1)) {
         throw a.create();
      } else {
         $$0.a(() -> a($$1), true);
         return $$1;
      }
   }

   public static xm a(int $$0) {
      wy $$1 = xb.a(String.valueOf($$0));
      return wy.a("commands.publish.started", $$1);
   }
}
