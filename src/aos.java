import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class aos {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wp.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ex)$$0x.getSource(), null, ((ex)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)ey.a("target", fk.a()).executes($$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"), ((ex)$$0x.getSource()).h())))
                  .then(ey.a("player", fk.c()).executes($$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"), fk.e($$0x, "player"))))
            )
      );
   }

   private static int a(ex $$0, @Nullable bva $$1, are $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.h.b() != dgw.d) {
         throw b.create($$2.m_());
      } else {
         $$2.d($$1);
         if ($$1 != null) {
            $$0.a(() -> wp.a("commands.spectate.success.started", $$1.m_()), false);
         } else {
            $$0.a(() -> wp.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
