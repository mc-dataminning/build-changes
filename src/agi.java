import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class agi {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(ds.a("config").then(ds.a("target", ec.c()).executes($$0x -> a((dr)$$0x.getSource(), ec.e($$0x, "target"))))))
            .then(
               ds.a("unconfig")
                  .then(
                     ds.a("target", fc.a())
                        .suggests(($$0x, $$1) -> du.b(a(((dr)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((dr)$$0x.getSource(), fc.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (sg $$2 : $$0.ad().e()) {
         if ($$2.m() instanceof alg $$3) {
            $$1.add($$3.k().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(dr $$0, akl $$1) {
      GameProfile $$2 = $$1.fP();
      $$1.c.o();
      $$0.a(() -> tf.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(dr $$0, UUID $$1) {
      for (sg $$2 : $$0.l().ad().e()) {
         so var5 = $$2.m();
         if (var5 instanceof alg) {
            alg $$3 = (alg)var5;
            if ($$3.k().getId().equals($$1)) {
               $$3.n();
            }
         }
      }

      $$0.b(tf.b("Can't find player to unconfig"));
      return 0;
   }
}
