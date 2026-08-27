import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class anz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ws.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ec)$$0x.getSource(), null, ((ec)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)ed.a("target", ep.a()).executes($$0x -> a((ec)$$0x.getSource(), ep.a($$0x, "target"), ((ec)$$0x.getSource()).h())))
                  .then(ed.a("player", ep.c()).executes($$0x -> a((ec)$$0x.getSource(), ep.a($$0x, "target"), ep.e($$0x, "player"))))
            )
      );
   }

   private static int a(ec $$0, @Nullable bql $$1, aqf $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.f.b() != czr.d) {
         throw b.create($$2.O_());
      } else {
         $$2.d($$1);
         if ($$1 != null) {
            $$0.a(() -> ws.a("commands.spectate.success.started", $$1.O_()), false);
         } else {
            $$0.a(() -> ws.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
