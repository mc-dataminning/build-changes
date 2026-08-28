import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class and {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(ek.a("config").then(ek.a("target", ew.c()).executes($$0x -> a((ej)$$0x.getSource(), ew.e($$0x, "target"))))))
            .then(
               ek.a("unconfig")
                  .then(
                     ek.a("target", ga.a())
                        .suggests(($$0x, $$1) -> eo.b(a(((ej)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((ej)$$0x.getSource(), ga.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (vt $$2 : $$0.ah().e()) {
         if ($$2.k() instanceof ast $$3) {
            $$1.add($$3.j().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ej $$0, art $$1) {
      GameProfile $$2 = $$1.gi();
      $$1.f.n();
      $$0.a(() -> xa.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(ej $$0, UUID $$1) {
      for (vt $$2 : $$0.l().ah().e()) {
         wg var5 = $$2.k();
         if (var5 instanceof ast) {
            ast $$3 = (ast)var5;
            if ($$3.j().getId().equals($$1)) {
               $$3.m();
            }
         }
      }

      $$0.b(xa.b("Can't find player to unconfig"));
      return 0;
   }
}
