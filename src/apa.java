import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class apa {
   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ev)$$0x.getSource(), Collections.singleton(((ev)$$0x.getSource()).h()), jg.a((jz)((ev)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ew.a("targets", fi.d())
                     .executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), jg.a((jz)((ev)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)ew.a("pos", gr.a()).executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), gr.c($$0x, "pos"), 0.0F)))
                        .then(ew.a("angle", fb.a()).executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), gr.c($$0x, "pos"), fb.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(ev $$0, Collection<arn> $$1, jg $$2, float $$3) {
      alg<dev> $$4 = $$0.e().ag();

      for (arn $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xh.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
