import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class aob {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.publish.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xl.b("commands.publish.alreadyPublished", $$0));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("publish").requires($$0x -> $$0x.c(4)))
               .executes($$0x -> a((ep)$$0x.getSource(), ayl.a(), false, null)))
            .then(
               ((RequiredArgumentBuilder)eq.a("allowCommands", BoolArgumentType.bool())
                     .executes($$0x -> a((ep)$$0x.getSource(), ayl.a(), BoolArgumentType.getBool($$0x, "allowCommands"), null)))
                  .then(
                     ((RequiredArgumentBuilder)eq.a("gamemode", fd.a())
                           .executes($$0x -> a((ep)$$0x.getSource(), ayl.a(), BoolArgumentType.getBool($$0x, "allowCommands"), fd.a($$0x, "gamemode"))))
                        .then(
                           eq.a("port", IntegerArgumentType.integer(0, 65535))
                              .executes(
                                 $$0x -> a(
                                       (ep)$$0x.getSource(),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       BoolArgumentType.getBool($$0x, "allowCommands"),
                                       fd.a($$0x, "gamemode")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ep $$0, int $$1, boolean $$2, @Nullable dbq $$3) throws CommandSyntaxException {
      if ($$0.l().r()) {
         throw b.create($$0.l().R());
      } else if (!$$0.l().a($$3, $$2, $$1)) {
         throw a.create();
      } else {
         $$0.a(() -> a($$1), true);
         return $$1;
      }
   }

   public static xz a(int $$0) {
      xl $$1 = xo.a(String.valueOf($$0));
      return xl.a("commands.publish.started", $$1);
   }
}
