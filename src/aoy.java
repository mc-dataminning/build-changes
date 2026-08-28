import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class aoy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xd.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((et)$$0x.getSource(), null, ((et)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)eu.a("target", fg.a()).executes($$0x -> a((et)$$0x.getSource(), fg.a($$0x, "target"), ((et)$$0x.getSource()).h())))
                  .then(eu.a("player", fg.c()).executes($$0x -> a((et)$$0x.getSource(), fg.a($$0x, "target"), fg.e($$0x, "player"))))
            )
      );
   }

   private static int a(et $$0, @Nullable bto $$1, ari $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.e.b() != ded.d) {
         throw b.create($$2.Q_());
      } else {
         $$2.d($$1);
         if ($$1 != null) {
            $$0.a(() -> xd.a("commands.spectate.success.started", $$1.Q_()), false);
         } else {
            $$0.a(() -> xd.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
