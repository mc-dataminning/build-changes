import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class aio {
   public static final int a = 2;

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dv.a("gamemode", eh.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((du)$$0x.getSource()).i()), eh.a($$0x, "gamemode"))))
                  .then(dv.a("target", eg.d()).executes($$0x -> a($$0x, eg.f($$0x, "target"), eh.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(du $$0, amf $$1, crx $$2) {
      ur $$3 = ur.c("gameMode." + $$2.b());
      if ($$0.g() == $$1) {
         $$0.a(() -> ur.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.f().Y().b(crw.p)) {
            $$1.a(ur.a("gameMode.changed", $$3));
         }

         $$0.a(() -> ur.a("commands.gamemode.success.other", $$1.P_(), $$3), true);
      }
   }

   private static int a(CommandContext<du> $$0, Collection<amf> $$1, crx $$2) {
      int $$3 = 0;

      for (amf $$4 : $$1) {
         if ($$4.a($$2)) {
            a((du)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
