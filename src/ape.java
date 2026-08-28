import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class ape {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xi.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xi.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ew)$$0x.getSource(), null, ((ew)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)ex.a("target", fj.a()).executes($$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"), ((ew)$$0x.getSource()).h())))
                  .then(ex.a("player", fj.c()).executes($$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"), fj.e($$0x, "player"))))
            )
      );
   }

   private static int a(ew $$0, @Nullable bue $$1, aro $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.i.b() != dey.d) {
         throw b.create($$2.S_());
      } else {
         $$2.d($$1);
         if ($$1 != null) {
            $$0.a(() -> xi.a("commands.spectate.success.started", $$1.S_()), false);
         } else {
            $$0.a(() -> xi.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
