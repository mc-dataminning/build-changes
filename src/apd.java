import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class apd {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ev)$$0x.getSource(), null, ((ev)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)ew.a("target", fi.a()).executes($$0x -> a((ev)$$0x.getSource(), fi.a($$0x, "target"), ((ev)$$0x.getSource()).h())))
                  .then(ew.a("player", fi.c()).executes($$0x -> a((ev)$$0x.getSource(), fi.a($$0x, "target"), fi.e($$0x, "player"))))
            )
      );
   }

   private static int a(ev $$0, @Nullable btz $$1, arn $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.f.b() != des.d) {
         throw b.create($$2.S_());
      } else {
         $$2.d($$1);
         if ($$1 != null) {
            $$0.a(() -> xh.a("commands.spectate.success.started", $$1.S_()), false);
         } else {
            $$0.a(() -> xh.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
