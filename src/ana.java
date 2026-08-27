import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class ana {
   public static final int a = 2;

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ei.a("gamemode", ev.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((eh)$$0x.getSource()).h()), ev.a($$0x, "gamemode"))))
                  .then(ei.a("target", eu.d()).executes($$0x -> a($$0x, eu.f($$0x, "target"), ev.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(eh $$0, aqu $$1, dbx $$2) {
      xe $$3 = xe.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> xe.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().ab().b(dbw.p)) {
            $$1.a(xe.a("gameMode.changed", $$3));
         }

         $$0.a(() -> xe.a("commands.gamemode.success.other", $$1.P_(), $$3), true);
      }
   }

   private static int a(CommandContext<eh> $$0, Collection<aqu> $$1, dbx $$2) {
      int $$3 = 0;

      for (aqu $$4 : $$1) {
         if ($$4.a($$2)) {
            a((eh)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
