import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class anq {
   public static final int a = 2;

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ew.a("gamemode", fj.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ev)$$0x.getSource()).h()), fj.a($$0x, "gamemode"))))
                  .then(ew.a("target", fi.d()).executes($$0x -> a($$0x, fi.f($$0x, "target"), fj.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ev $$0, arn $$1, des $$2) {
      xh $$3 = xh.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> xh.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().ac().b(der.p)) {
            $$1.a(xh.a("gameMode.changed", $$3));
         }

         $$0.a(() -> xh.a("commands.gamemode.success.other", $$1.S_(), $$3), true);
      }
   }

   private static int a(CommandContext<ev> $$0, Collection<arn> $$1, des $$2) {
      int $$3 = 0;

      for (arn $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ev)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
