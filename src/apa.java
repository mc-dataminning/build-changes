import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class apa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eu)$$0x.getSource(), null, ((eu)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)ev.a("target", fh.a()).executes($$0x -> a((eu)$$0x.getSource(), fh.a($$0x, "target"), ((eu)$$0x.getSource()).h())))
                  .then(ev.a("player", fh.c()).executes($$0x -> a((eu)$$0x.getSource(), fh.a($$0x, "target"), fh.e($$0x, "player"))))
            )
      );
   }

   private static int a(eu $$0, @Nullable btr $$1, ark $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.e.b() != deg.d) {
         throw b.create($$2.R_());
      } else {
         $$2.d($$1);
         if ($$1 != null) {
            $$0.a(() -> xe.a("commands.spectate.success.started", $$1.R_()), false);
         } else {
            $$0.a(() -> xe.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
