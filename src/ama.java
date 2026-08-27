import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class ama {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(ee.a("config").then(ee.a("target", eq.c()).executes($$0x -> a((ed)$$0x.getSource(), eq.e($$0x, "target"))))))
            .then(
               ee.a("unconfig")
                  .then(
                     ee.a("target", ft.a())
                        .suggests(($$0x, $$1) -> ei.b(a(((ed)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((ed)$$0x.getSource(), ft.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (vs $$2 : $$0.ai().e()) {
         if ($$2.k() instanceof arf $$3) {
            $$1.add($$3.k().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ed $$0, aqi $$1) {
      GameProfile $$2 = $$1.fZ();
      $$1.d.o();
      $$0.a(() -> wu.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(ed $$0, UUID $$1) {
      for (vs $$2 : $$0.l().ai().e()) {
         wa var5 = $$2.k();
         if (var5 instanceof arf) {
            arf $$3 = (arf)var5;
            if ($$3.k().getId().equals($$1)) {
               $$3.n();
            }
         }
      }

      $$0.b(wu.b("Can't find player to unconfig"));
      return 0;
   }
}
