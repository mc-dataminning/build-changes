import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;

public class aez {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dt.a("targets", ec.d())
                     .executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), sw.c("multiplayer.disconnect.kicked"))))
                  .then(dt.a("reason", eg.a()).executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), eg.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ds $$0, Collection<aig> $$1, sw $$2) {
      for (aig $$3 : $$1) {
         $$3.c.b($$2);
         $$0.a(() -> sw.a("commands.kick.success", $$3.H_(), $$2), true);
      }

      return $$1.size();
   }
}
