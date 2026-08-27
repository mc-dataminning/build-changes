import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class aoo {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eh)$$0x.getSource(), null, ((eh)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)ei.a("target", eu.a()).executes($$0x -> a((eh)$$0x.getSource(), eu.a($$0x, "target"), ((eh)$$0x.getSource()).h())))
                  .then(ei.a("player", eu.c()).executes($$0x -> a((eh)$$0x.getSource(), eu.a($$0x, "target"), eu.e($$0x, "player"))))
            )
      );
   }

   private static int a(eh $$0, @Nullable brv $$1, aqu $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.f.b() != dbx.d) {
         throw b.create($$2.P_());
      } else {
         $$2.d($$1);
         if ($$1 != null) {
            $$0.a(() -> xe.a("commands.spectate.success.started", $$1.P_()), false);
         } else {
            $$0.a(() -> xe.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
