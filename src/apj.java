import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class apj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xc.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xc.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ek)$$0x.getSource(), null, ((ek)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)el.a("target", ex.a()).executes($$0x -> a((ek)$$0x.getSource(), ex.a($$0x, "target"), ((ek)$$0x.getSource()).h())))
                  .then(el.a("player", ex.c()).executes($$0x -> a((ek)$$0x.getSource(), ex.a($$0x, "target"), ex.e($$0x, "player"))))
            )
      );
   }

   private static int a(ek $$0, @Nullable bwv $$1, arv $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.h.b() != djw.d) {
         throw b.create($$2.m_());
      } else {
         $$2.d($$1);
         if ($$1 != null) {
            $$0.a(() -> xc.a("commands.spectate.success.started", $$1.m_()), false);
         } else {
            $$0.a(() -> xc.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
