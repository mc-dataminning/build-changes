import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class apf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ei)$$0x.getSource(), null, ((ei)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)ej.a("target", ev.a()).executes($$0x -> a((ei)$$0x.getSource(), ev.a($$0x, "target"), ((ei)$$0x.getSource()).h())))
                  .then(ej.a("player", ev.c()).executes($$0x -> a((ei)$$0x.getSource(), ev.a($$0x, "target"), ev.e($$0x, "player"))))
            )
      );
   }

   private static int a(ei $$0, @Nullable bwf $$1, arr $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.h.b() != dix.d) {
         throw b.create($$2.m_());
      } else {
         $$2.d($$1);
         if ($$1 != null) {
            $$0.a(() -> wy.a("commands.spectate.success.started", $$1.m_()), false);
         } else {
            $$0.a(() -> wy.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
