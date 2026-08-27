import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class ahp {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.publish.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tf.a("commands.publish.alreadyPublished", $$0));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("publish").requires($$0x -> $$0x.c(4)))
               .executes($$0x -> a((dr)$$0x.getSource(), arh.a(), false, null)))
            .then(
               ((RequiredArgumentBuilder)ds.a("allowCommands", BoolArgumentType.bool())
                     .executes($$0x -> a((dr)$$0x.getSource(), arh.a(), BoolArgumentType.getBool($$0x, "allowCommands"), null)))
                  .then(
                     ((RequiredArgumentBuilder)ds.a("gamemode", ed.a())
                           .executes($$0x -> a((dr)$$0x.getSource(), arh.a(), BoolArgumentType.getBool($$0x, "allowCommands"), ed.a($$0x, "gamemode"))))
                        .then(
                           ds.a("port", IntegerArgumentType.integer(0, 65535))
                              .executes(
                                 $$0x -> a(
                                       (dr)$$0x.getSource(),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       BoolArgumentType.getBool($$0x, "allowCommands"),
                                       ed.a($$0x, "gamemode")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(dr $$0, int $$1, boolean $$2, @Nullable cpi $$3) throws CommandSyntaxException {
      if ($$0.l().p()) {
         throw b.create($$0.l().M());
      } else if (!$$0.l().a($$3, $$2, $$1)) {
         throw a.create();
      } else {
         $$0.a(() -> a($$1), true);
         return $$1;
      }
   }

   public static ts a(int $$0) {
      tf $$1 = th.a(String.valueOf($$0));
      return tf.a("commands.publish.started", $$1);
   }
}
