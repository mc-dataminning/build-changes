import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class anc {
   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(ew.a("config").then(ew.a("target", fi.c()).executes($$0x -> a((ev)$$0x.getSource(), fi.e($$0x, "target"))))))
            .then(
               ew.a("unconfig")
                  .then(
                     ew.a("target", gl.a())
                        .suggests(($$0x, $$1) -> fa.b(a(((ev)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((ev)$$0x.getSource(), gl.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (wb $$2 : $$0.ah().e()) {
         if ($$2.k() instanceof asn $$3) {
            $$1.add($$3.j().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ev $$0, arn $$1) {
      GameProfile $$2 = $$1.gj();
      $$1.d.n();
      $$0.a(() -> xh.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(ev $$0, UUID $$1) {
      for (wb $$2 : $$0.l().ah().e()) {
         wn var5 = $$2.k();
         if (var5 instanceof asn) {
            asn $$3 = (asn)var5;
            if ($$3.j().getId().equals($$1)) {
               $$3.m();
            }
         }
      }

      $$0.b(xh.b("Can't find player to unconfig"));
      return 0;
   }
}
