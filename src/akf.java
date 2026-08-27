import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class akf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(uv.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> uv.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((du)$$0x.getSource(), null, ((du)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)dv.a("target", eg.a()).executes($$0x -> a((du)$$0x.getSource(), eg.a($$0x, "target"), ((du)$$0x.getSource()).h())))
                  .then(dv.a("player", eg.c()).executes($$0x -> a((du)$$0x.getSource(), eg.a($$0x, "target"), eg.e($$0x, "player"))))
            )
      );
   }

   private static int a(du $$0, @Nullable bkv $$1, amj $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.e.b() != csc.d) {
         throw b.create($$2.Q_());
      } else {
         $$2.c($$1);
         if ($$1 != null) {
            $$0.a(() -> uv.a("commands.spectate.success.started", $$1.Q_()), false);
         } else {
            $$0.a(() -> uv.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
