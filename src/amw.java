import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class amw {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(eu.a("config").then(eu.a("target", fg.c()).executes($$0x -> a((et)$$0x.getSource(), fg.e($$0x, "target"))))))
            .then(
               eu.a("unconfig")
                  .then(
                     eu.a("target", gj.a())
                        .suggests(($$0x, $$1) -> ey.b(a(((et)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((et)$$0x.getSource(), gj.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (vx $$2 : $$0.ah().e()) {
         if ($$2.k() instanceof asg $$3) {
            $$1.add($$3.j().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(et $$0, arh $$1) {
      GameProfile $$2 = $$1.gb();
      $$1.c.n();
      $$0.a(() -> xd.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(et $$0, UUID $$1) {
      for (vx $$2 : $$0.l().ah().e()) {
         wj var5 = $$2.k();
         if (var5 instanceof asg) {
            asg $$3 = (asg)var5;
            if ($$3.j().getId().equals($$1)) {
               $$3.m();
            }
         }
      }

      $$0.b(xd.b("Can't find player to unconfig"));
      return 0;
   }
}
