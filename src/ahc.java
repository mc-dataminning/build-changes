import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;

public class ahc {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ds.a("targets", ec.d())
                     .executes($$0x -> a((dr)$$0x.getSource(), ec.f($$0x, "targets"), tf.c("multiplayer.disconnect.kicked"))))
                  .then(ds.a("reason", eg.a()).executes($$0x -> a((dr)$$0x.getSource(), ec.f($$0x, "targets"), eg.a($$0x, "reason"))))
            )
      );
   }

   private static int a(dr $$0, Collection<akl> $$1, tf $$2) {
      for (akl $$3 : $$1) {
         $$3.c.b($$2);
         $$0.a(() -> tf.a("commands.kick.success", $$3.H_(), $$2), true);
      }

      return $$1.size();
   }
}
