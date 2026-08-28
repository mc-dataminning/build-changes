import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class amq {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(ey.a("config").then(ey.a("target", fk.c()).executes($$0x -> a((ex)$$0x.getSource(), fk.e($$0x, "target"))))))
            .then(
               ey.a("unconfig")
                  .then(
                     ey.a("target", gn.a())
                        .suggests(($$0x, $$1) -> fc.b(a(((ex)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((ex)$$0x.getSource(), gn.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (vi $$2 : $$0.ah().e()) {
         if ($$2.k() instanceof ase $$3) {
            $$1.add($$3.j().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ex $$0, are $$1) {
      GameProfile $$2 = $$1.gh();
      $$1.f.n();
      $$0.a(() -> wp.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(ex $$0, UUID $$1) {
      for (vi $$2 : $$0.l().ah().e()) {
         vv var5 = $$2.k();
         if (var5 instanceof ase) {
            ase $$3 = (ase)var5;
            if ($$3.j().getId().equals($$1)) {
               $$3.m();
            }
         }
      }

      $$0.b(wp.b("Can't find player to unconfig"));
      return 0;
   }
}
