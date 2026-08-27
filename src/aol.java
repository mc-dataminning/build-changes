import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class aol {
   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("spawnpoint").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eh)$$0x.getSource(), Collections.singleton(((eh)$$0x.getSource()).h()), ir.a(((eh)$$0x.getSource()).d()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)ei.a("targets", eu.d())
                     .executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), ir.a(((eh)$$0x.getSource()).d()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)ei.a("pos", gd.a()).executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), gd.c($$0x, "pos"), 0.0F)))
                        .then(ei.a("angle", en.a()).executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), gd.c($$0x, "pos"), en.a($$0x, "angle"))))
                  )
            )
      );
   }

   private static int a(eh $$0, Collection<aqu> $$1, ir $$2, float $$3) {
      aks<dca> $$4 = $$0.e().af();

      for (aqu $$5 : $$1) {
         $$5.a($$4, $$2, $$3, true, false);
      }

      String $$6 = $$4.a().toString();
      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.iterator().next().P_()), true);
      } else {
         $$0.a(() -> xe.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), $$3, $$6, $$1.size()), true);
      }

      return $$1.size();
   }
}
