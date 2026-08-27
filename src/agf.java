import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import javax.annotation.Nullable;

public class agf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(sw.c("commands.spectate.self"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> sw.a("commands.spectate.not_spectator", $$0));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("spectate").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ds)$$0x.getSource(), null, ((ds)$$0x.getSource()).h())))
            .then(
               ((RequiredArgumentBuilder)dt.a("target", ec.a()).executes($$0x -> a((ds)$$0x.getSource(), ec.a($$0x, "target"), ((ds)$$0x.getSource()).h())))
                  .then(dt.a("player", ec.c()).executes($$0x -> a((ds)$$0x.getSource(), ec.a($$0x, "target"), ec.e($$0x, "player"))))
            )
      );
   }

   private static int a(ds $$0, @Nullable bfj $$1, aig $$2) throws CommandSyntaxException {
      if ($$2 == $$1) {
         throw a.create();
      } else if ($$2.e.b() != cmj.d) {
         throw b.create($$2.H_());
      } else {
         $$2.c($$1);
         if ($$1 != null) {
            $$0.a(() -> sw.a("commands.spectate.success.started", $$1.H_()), false);
         } else {
            $$0.a(() -> sw.c("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
