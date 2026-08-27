import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class ahu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("commands.publish.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tl.a("commands.publish.alreadyPublished", $$0));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("publish").requires($$0x -> $$0x.c(4)))
               .executes($$0x -> a((dt)$$0x.getSource(), aro.a(), false, null)))
            .then(
               ((RequiredArgumentBuilder)du.a("allowCommands", BoolArgumentType.bool())
                     .executes($$0x -> a((dt)$$0x.getSource(), aro.a(), BoolArgumentType.getBool($$0x, "allowCommands"), null)))
                  .then(
                     ((RequiredArgumentBuilder)du.a("gamemode", ef.a())
                           .executes($$0x -> a((dt)$$0x.getSource(), aro.a(), BoolArgumentType.getBool($$0x, "allowCommands"), ef.a($$0x, "gamemode"))))
                        .then(
                           du.a("port", IntegerArgumentType.integer(0, 65535))
                              .executes(
                                 $$0x -> a(
                                       (dt)$$0x.getSource(),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       BoolArgumentType.getBool($$0x, "allowCommands"),
                                       ef.a($$0x, "gamemode")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(dt $$0, int $$1, boolean $$2, @Nullable cps $$3) throws CommandSyntaxException {
      if ($$0.l().p()) {
         throw b.create($$0.l().M());
      } else if (!$$0.l().a($$3, $$2, $$1)) {
         throw a.create();
      } else {
         $$0.a(() -> a($$1), true);
         return $$1;
      }
   }

   public static ty a(int $$0) {
      tl $$1 = tn.a(String.valueOf($$0));
      return tl.a("commands.publish.started", $$1);
   }
}
