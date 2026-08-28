import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class amx {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(eq.a("config").then(eq.a("target", fc.c()).executes($$0x -> a((ep)$$0x.getSource(), fc.e($$0x, "target"))))))
            .then(
               eq.a("unconfig")
                  .then(
                     eq.a("target", gf.a())
                        .suggests(($$0x, $$1) -> eu.b(a(((ep)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((ep)$$0x.getSource(), gf.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (wj $$2 : $$0.ai().e()) {
         if ($$2.k() instanceof asc $$3) {
            $$1.add($$3.j().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ep $$0, arf $$1) {
      GameProfile $$2 = $$1.gb();
      $$1.c.n();
      $$0.a(() -> xo.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(ep $$0, UUID $$1) {
      for (wj $$2 : $$0.l().ai().e()) {
         wu var5 = $$2.k();
         if (var5 instanceof asc) {
            asc $$3 = (asc)var5;
            if ($$3.j().getId().equals($$1)) {
               $$3.m();
            }
         }
      }

      $$0.b(xo.b("Can't find player to unconfig"));
      return 0;
   }
}
