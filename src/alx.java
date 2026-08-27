import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class alx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vq.c("commands.publish.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vq.b("commands.publish.alreadyPublished", $$0));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("publish").requires($$0x -> $$0x.c(4)))
               .executes($$0x -> a((du)$$0x.getSource(), avz.a(), false, null)))
            .then(
               ((RequiredArgumentBuilder)dv.a("allowCommands", BoolArgumentType.bool())
                     .executes($$0x -> a((du)$$0x.getSource(), avz.a(), BoolArgumentType.getBool($$0x, "allowCommands"), null)))
                  .then(
                     ((RequiredArgumentBuilder)dv.a("gamemode", ei.a())
                           .executes($$0x -> a((du)$$0x.getSource(), avz.a(), BoolArgumentType.getBool($$0x, "allowCommands"), ei.a($$0x, "gamemode"))))
                        .then(
                           dv.a("port", IntegerArgumentType.integer(0, 65535))
                              .executes(
                                 $$0x -> a(
                                       (du)$$0x.getSource(),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       BoolArgumentType.getBool($$0x, "allowCommands"),
                                       ei.a($$0x, "gamemode")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(du $$0, int $$1, boolean $$2, @Nullable cvo $$3) throws CommandSyntaxException {
      if ($$0.l().p()) {
         throw b.create($$0.l().Q());
      } else if (!$$0.l().a($$3, $$2, $$1)) {
         throw a.create();
      } else {
         $$0.a(() -> a($$1), true);
         return $$1;
      }
   }

   public static we a(int $$0) {
      vq $$1 = vt.a(String.valueOf($$0));
      return vq.a("commands.publish.started", $$1);
   }
}
