import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class aiz {
   public static final int a = 2;

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("gamemode").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dt.a("gamemode", ef.a())
                     .executes($$0x -> a($$0x, Collections.singleton(((ds)$$0x.getSource()).h()), ef.a($$0x, "gamemode"))))
                  .then(dt.a("target", ee.d()).executes($$0x -> a($$0x, ee.f($$0x, "target"), ef.a($$0x, "gamemode"))))
            )
      );
   }

   private static void a(ds $$0, amq $$1, csv $$2) {
      vb $$3 = vb.c("gameMode." + $$2.b());
      if ($$0.f() == $$1) {
         $$0.a(() -> vb.a("commands.gamemode.success.self", $$3), true);
      } else {
         if ($$0.e().Y().b(csu.p)) {
            $$1.a(vb.a("gameMode.changed", $$3));
         }

         $$0.a(() -> vb.a("commands.gamemode.success.other", $$1.Q_(), $$3), true);
      }
   }

   private static int a(CommandContext<ds> $$0, Collection<amq> $$1, csv $$2) {
      int $$3 = 0;

      for (amq $$4 : $$1) {
         if ($$4.a($$2)) {
            a((ds)$$0.getSource(), $$4, $$2);
            $$3++;
         }
      }

      return $$3;
   }
}
