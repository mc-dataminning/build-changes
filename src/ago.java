import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class ago {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(du.a("config").then(du.a("target", ee.c()).executes($$0x -> a((dt)$$0x.getSource(), ee.e($$0x, "target"))))))
            .then(
               du.a("unconfig")
                  .then(
                     du.a("target", fe.a())
                        .suggests(($$0x, $$1) -> dw.b(a(((dt)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((dt)$$0x.getSource(), fe.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (sm $$2 : $$0.ad().e()) {
         if ($$2.m() instanceof alo $$3) {
            $$1.add($$3.k().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(dt $$0, aks $$1) {
      GameProfile $$2 = $$1.fQ();
      $$1.c.o();
      $$0.a(() -> tl.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(dt $$0, UUID $$1) {
      for (sm $$2 : $$0.l().ad().e()) {
         su var5 = $$2.m();
         if (var5 instanceof alo) {
            alo $$3 = (alo)var5;
            if ($$3.k().getId().equals($$1)) {
               $$3.n();
            }
         }
      }

      $$0.b(tl.b("Can't find player to unconfig"));
      return 0;
   }
}
