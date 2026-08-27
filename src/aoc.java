import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class aoc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ed)$$0x.getSource(), null, ((ed)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)ee.a("target", eq.a()).executes($$0x -> a((ed)$$0x.getSource(), eq.a($$0x, "target"), ((ed)$$0x.getSource()).h())))
                  .then(ee.a("player", eq.c()).executes($$0x -> a((ed)$$0x.getSource(), eq.a($$0x, "target"), eq.e($$0x, "player"))))
            )
      );
   }

   private static int a(ed $$0, @Nullable brh $$1, aqi $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.f.b() != daa.d) {
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
