import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class amu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.publish.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wi.b("commands.publish.alreadyPublished", $$0));

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("publish").requires($$0x -> $$0x.c(4)))
               .executes($$0x -> a((dv)$$0x.getSource(), axd.a(), false, null)))
            .then(
               ((RequiredArgumentBuilder)dw.a("allowCommands", BoolArgumentType.bool())
                     .executes($$0x -> a((dv)$$0x.getSource(), axd.a(), BoolArgumentType.getBool($$0x, "allowCommands"), null)))
                  .then(
                     ((RequiredArgumentBuilder)dw.a("gamemode", ej.a())
                           .executes($$0x -> a((dv)$$0x.getSource(), axd.a(), BoolArgumentType.getBool($$0x, "allowCommands"), ej.a($$0x, "gamemode"))))
                        .then(
                           dw.a("port", IntegerArgumentType.integer(0, 65535))
                              .executes(
                                 $$0x -> a(
                                       (dv)$$0x.getSource(),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       BoolArgumentType.getBool($$0x, "allowCommands"),
                                       ej.a($$0x, "gamemode")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(dv $$0, int $$1, boolean $$2, @Nullable czd $$3) throws CommandSyntaxException {
      if ($$0.l().r()) {
         throw b.create($$0.l().R());
      } else if (!$$0.l().a($$3, $$2, $$1)) {
         throw a.create();
      } else {
         $$0.a(() -> a($$1), true);
         return $$1;
      }
   }

   public static ww a(int $$0) {
      wi $$1 = wl.a(String.valueOf($$0));
      return wi.a("commands.publish.started", $$1);
   }
}
