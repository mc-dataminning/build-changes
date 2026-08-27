import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class anm {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.publish.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("commands.publish.alreadyPublished", $$0));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("publish").requires($$0x -> $$0x.c(4)))
               .executes($$0x -> a((ee)$$0x.getSource(), axv.a(), false, null)))
            .then(
               ((RequiredArgumentBuilder)ef.a("allowCommands", BoolArgumentType.bool())
                     .executes($$0x -> a((ee)$$0x.getSource(), axv.a(), BoolArgumentType.getBool($$0x, "allowCommands"), null)))
                  .then(
                     ((RequiredArgumentBuilder)ef.a("gamemode", es.a())
                           .executes($$0x -> a((ee)$$0x.getSource(), axv.a(), BoolArgumentType.getBool($$0x, "allowCommands"), es.a($$0x, "gamemode"))))
                        .then(
                           ef.a("port", IntegerArgumentType.integer(0, 65535))
                              .executes(
                                 $$0x -> a(
                                       (ee)$$0x.getSource(),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       BoolArgumentType.getBool($$0x, "allowCommands"),
                                       es.a($$0x, "gamemode")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ee $$0, int $$1, boolean $$2, @Nullable dau $$3) throws CommandSyntaxException {
      if ($$0.l().r()) {
         throw b.create($$0.l().R());
      } else if (!$$0.l().a($$3, $$2, $$1)) {
         throw a.create();
      } else {
         $$0.a(() -> a($$1), true);
         return $$1;
      }
   }

   public static xl a(int $$0) {
      wx $$1 = xa.a(String.valueOf($$0));
      return wx.a("commands.publish.started", $$1);
   }
}
