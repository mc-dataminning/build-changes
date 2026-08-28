import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class aoe {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eq)$$0x.getSource(), null, ((eq)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)er.a("target", fd.a()).executes($$0x -> a((eq)$$0x.getSource(), fd.a($$0x, "target"), ((eq)$$0x.getSource()).h())))
                  .then(er.a("player", fd.c()).executes($$0x -> a((eq)$$0x.getSource(), fd.a($$0x, "target"), fd.e($$0x, "player"))))
            )
      );
   }

   private static int a(eq $$0, @Nullable bsh $$1, aqn $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.e.b() != dcd.d) {
         throw b.create($$2.O_());
      } else {
         $$2.d($$1);
         if ($$1 != null) {
            $$0.a(() -> wu.a("commands.spectate.success.started", $$1.O_()), false);
         } else {
            $$0.a(() -> wu.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
