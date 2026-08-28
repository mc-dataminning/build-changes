import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class amd {
   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(er.a("config").then(er.a("target", fd.c()).executes($$0x -> a((eq)$$0x.getSource(), fd.e($$0x, "target"))))))
            .then(
               er.a("unconfig")
                  .then(
                     er.a("target", gg.a())
                        .suggests(($$0x, $$1) -> ev.b(a(((eq)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((eq)$$0x.getSource(), gg.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (vp $$2 : $$0.aj().e()) {
         if ($$2.k() instanceof ark $$3) {
            $$1.add($$3.j().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(eq $$0, aqn $$1) {
      GameProfile $$2 = $$1.fZ();
      $$1.c.n();
      $$0.a(() -> wu.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(eq $$0, UUID $$1) {
      for (vp $$2 : $$0.l().aj().e()) {
         wa var5 = $$2.k();
         if (var5 instanceof ark) {
            ark $$3 = (ark)var5;
            if ($$3.j().getId().equals($$1)) {
               $$3.m();
            }
         }
      }

      $$0.b(wu.b("Can't find player to unconfig"));
      return 0;
   }
}
