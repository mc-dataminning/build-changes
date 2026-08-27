import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class aoh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ee)$$0x.getSource(), null, ((ee)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)ef.a("target", er.a()).executes($$0x -> a((ee)$$0x.getSource(), er.a($$0x, "target"), ((ee)$$0x.getSource()).h())))
                  .then(ef.a("player", er.c()).executes($$0x -> a((ee)$$0x.getSource(), er.a($$0x, "target"), er.e($$0x, "player"))))
            )
      );
   }

   private static int a(ee $$0, @Nullable bru $$1, aqn $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.f.b() != dau.d) {
         throw b.create($$2.O_());
      } else {
         $$2.d($$1);
         if ($$1 != null) {
            $$0.a(() -> wx.a("commands.spectate.success.started", $$1.O_()), false);
         } else {
            $$0.a(() -> wx.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
