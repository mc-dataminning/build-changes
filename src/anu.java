import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class anu {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(ex.a("config").then(ex.a("target", fj.c()).executes($$0x -> a((ew)$$0x.getSource(), fj.e($$0x, "target"))))))
            .then(
               ex.a("unconfig")
                  .then(
                     ex.a("target", gm.a())
                        .suggests(($$0x, $$1) -> fb.b(a(((ew)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((ew)$$0x.getSource(), gm.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (wp $$2 : $$0.ah().e()) {
         if ($$2.k() instanceof ati $$3) {
            $$1.add($$3.j().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ew $$0, asi $$1) {
      GameProfile $$2 = $$1.gf();
      $$1.f.n();
      $$0.a(() -> xv.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(ew $$0, UUID $$1) {
      for (wp $$2 : $$0.l().ah().e()) {
         xb var5 = $$2.k();
         if (var5 instanceof ati) {
            ati $$3 = (ati)var5;
            if ($$3.j().getId().equals($$1)) {
               $$3.m();
            }
         }
      }

      $$0.b(xv.b("Can't find player to unconfig"));
      return 0;
   }
}
