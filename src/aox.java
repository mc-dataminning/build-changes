import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class aox {
   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eu)$$0x.getSource(), Collections.singleton(((eu)$$0x.getSource()).h()), jf.a((jy)((eu)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ev.a("targets", fh.d())
                     .executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), jf.a((jy)((eu)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)ev.a("pos", gq.a()).executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), gq.c($$0x, "pos"), 0.0F)))
                        .then(ev.a("angle", fa.a()).executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), gq.c($$0x, "pos"), fa.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(eu $$0, Collection<ark> $$1, jf $$2, float $$3) {
      ald<dej> $$4 = $$0.e().ag();

      for (ark $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().R_()), true);
      } else {
         $$0.a(() -> xe.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
