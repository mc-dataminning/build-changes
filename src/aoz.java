import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class aoz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ep)$$0x.getSource(), null, ((ep)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)eq.a("target", fc.a()).executes($$0x -> a((ep)$$0x.getSource(), fc.a($$0x, "target"), ((ep)$$0x.getSource()).h())))
                  .then(eq.a("player", fc.c()).executes($$0x -> a((ep)$$0x.getSource(), fc.a($$0x, "target"), fc.e($$0x, "player"))))
            )
      );
   }

   private static int a(ep $$0, @Nullable bss $$1, arf $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.e.b() != dbt.d) {
         throw b.create($$2.O_());
      } else {
         $$2.d($$1);
         if ($$1 != null) {
            $$0.a(() -> xo.a("commands.spectate.success.started", $$1.O_()), false);
         } else {
            $$0.a(() -> xo.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
