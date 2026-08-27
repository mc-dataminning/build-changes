import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import javax.annotation.Nullable;

public class aor {
   public static void a(CommandDispatcher<eh> $$0) {
      RequiredArgumentBuilder<eh, gw> $$1 = (RequiredArgumentBuilder<eh, gw>)((RequiredArgumentBuilder)ei.a("targets", eu.d())
            .executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), null, null)))
         .then(ei.a("*").then(ei.a("sound", fi.a()).suggests(ig.c).executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), null, fi.c($$0x, "sound")))));

      for (avq $$2 : avq.values()) {
         $$1.then(
            ((LiteralArgumentBuilder)ei.a($$2.a()).executes($$1x -> a((eh)$$1x.getSource(), eu.f($$1x, "targets"), $$2, null)))
               .then(ei.a("sound", fi.a()).suggests(ig.c).executes($$1x -> a((eh)$$1x.getSource(), eu.f($$1x, "targets"), $$2, fi.c($$1x, "sound"))))
         );
      }

      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("stopsound").requires($$0x -> $$0x.c(2))).then($$1));
   }

   private static int a(eh $$0, Collection<aqu> $$1, @Nullable avq $$2, @Nullable akt $$3) {
      afu $$4 = new afu($$3, $$2);

      for (aqu $$5 : $$1) {
         $$5.d.b($$4);
      }

      if ($$2 != null) {
         if ($$3 != null) {
            $$0.a(() -> xe.a("commands.stopsound.success.source.sound", xe.a($$3), $$2.a()), true);
         } else {
            $$0.a(() -> xe.a("commands.stopsound.success.source.any", $$2.a()), true);
         }
      } else if ($$3 != null) {
         $$0.a(() -> xe.a("commands.stopsound.success.sourceless.sound", xe.a($$3)), true);
      } else {
         $$0.a(() -> xe.c("commands.stopsound.success.sourceless.any"), true);
      }

      return $$1.size();
   }
}
