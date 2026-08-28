import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class anm {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(el.a("config").then(el.a("target", ex.c()).executes($$0x -> a((ek)$$0x.getSource(), ex.e($$0x, "target"))))))
            .then(
               el.a("unconfig")
                  .then(
                     el.a("target", gb.a())
                        .suggests(($$0x, $$1) -> ep.b(a(((ek)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((ek)$$0x.getSource(), gb.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (vv $$2 : $$0.ah().e()) {
         if ($$2.k() instanceof atc $$3) {
            $$1.add($$3.j().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ek $$0, asc $$1) {
      GameProfile $$2 = $$1.gi();
      $$1.f.n();
      $$0.a(() -> xg.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(ek $$0, UUID $$1) {
      for (vv $$2 : $$0.l().ah().e()) {
         wk var5 = $$2.k();
         if (var5 instanceof atc) {
            atc $$3 = (atc)var5;
            if ($$3.j().getId().equals($$1)) {
               $$3.m();
            }
         }
      }

      $$0.b(xg.b("Can't find player to unconfig"));
      return 0;
   }
}
