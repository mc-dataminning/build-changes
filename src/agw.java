import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class agw {
   public static final int a = 2;

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ds.a("gamemode", ed.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((dr)$$0x.getSource()).h()), ed.a($$0x, "gamemode"))))
                  .then(ds.a("target", ec.d()).executes($$0x -> a($$0x, ec.f($$0x, "target"), ed.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(dr $$0, akl $$1, cpi $$2) {
      tf $$3 = tf.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> tf.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().X().b(cph.o)) {
            $$1.a(tf.a("gameMode.changed", $$3));
         }

         $$0.a(() -> tf.a("commands.gamemode.success.other", $$1.H_(), $$3), true);
      }
   }

   private static int a(CommandContext<dr> $$0, Collection<akl> $$1, cpi $$2) {
      int $$3 = 0;

      for (akl $$4 : $$1) {
         if ($$4.a($$2)) {
            a((dr)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
