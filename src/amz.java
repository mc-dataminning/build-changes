import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class amz {
   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(ev.a("config").then(ev.a("target", fh.c()).executes($$0x -> a((eu)$$0x.getSource(), fh.e($$0x, "target"))))))
            .then(
               ev.a("unconfig")
                  .then(
                     ev.a("target", gk.a())
                        .suggests(($$0x, $$1) -> ez.b(a(((eu)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((eu)$$0x.getSource(), gk.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (vy $$2 : $$0.ah().e()) {
         if ($$2.k() instanceof asj $$3) {
            $$1.add($$3.j().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(eu $$0, ark $$1) {
      GameProfile $$2 = $$1.gc();
      $$1.c.n();
      $$0.a(() -> xe.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(eu $$0, UUID $$1) {
      for (vy $$2 : $$0.l().ah().e()) {
         wk var5 = $$2.k();
         if (var5 instanceof asj) {
            asj $$3 = (asj)var5;
            if ($$3.j().getId().equals($$1)) {
               $$3.m();
            }
         }
      }

      $$0.b(xe.b("Can't find player to unconfig"));
      return 0;
   }
}
