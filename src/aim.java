import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class aim {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ti.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ti.a("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((dt)$$0x.getSource(), null, ((dt)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)du.a("target", ee.a()).executes($$0x -> a((dt)$$0x.getSource(), ee.a($$0x, "target"), ((dt)$$0x.getSource()).h())))
                  .then(du.a("player", ee.c()).executes($$0x -> a((dt)$$0x.getSource(), ee.a($$0x, "target"), ee.e($$0x, "player"))))
            )
      );
   }

   private static int a(dt $$0, @Nullable bil $$1, ako $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.e.b() != cpn.d) {
         throw b.create($$2.H_());
      } else {
         $$2.c($$1);
         if ($$1 != null) {
            $$0.a(() -> ti.a("commands.spectate.success.started", $$1.H_()), false);
         } else {
            $$0.a(() -> ti.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
