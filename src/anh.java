import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class anh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.publish.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.publish.alreadyPublished", $$0));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("publish").requires($$0x -> $$0x.c(4)))
               .executes($$0x -> a((ed)$$0x.getSource(), axq.a(), false, null)))
            .then(
               ((RequiredArgumentBuilder)ee.a("allowCommands", BoolArgumentType.bool())
                     .executes($$0x -> a((ed)$$0x.getSource(), axq.a(), BoolArgumentType.getBool($$0x, "allowCommands"), null)))
                  .then(
                     ((RequiredArgumentBuilder)ee.a("gamemode", er.a())
                           .executes($$0x -> a((ed)$$0x.getSource(), axq.a(), BoolArgumentType.getBool($$0x, "allowCommands"), er.a($$0x, "gamemode"))))
                        .then(
                           ee.a("port", IntegerArgumentType.integer(0, 65535))
                              .executes(
                                 $$0x -> a(
                                       (ed)$$0x.getSource(),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       BoolArgumentType.getBool($$0x, "allowCommands"),
                                       er.a($$0x, "gamemode")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ed $$0, int $$1, boolean $$2, @Nullable daa $$3) throws CommandSyntaxException {
      if ($$0.l().r()) {
         throw b.create($$0.l().R());
      } else if (!$$0.l().a($$3, $$2, $$1)) {
         throw a.create();
      } else {
         $$0.a(() -> a($$1), true);
         return $$1;
      }
   }

   public static xi a(int $$0) {
      wu $$1 = wx.a(String.valueOf($$0));
      return wu.a("commands.publish.started", $$1);
   }
}
