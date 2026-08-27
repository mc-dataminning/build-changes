import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class amm {
   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(ei.a("config").then(ei.a("target", eu.c()).executes($$0x -> a((eh)$$0x.getSource(), eu.e($$0x, "target"))))))
            .then(
               ei.a("unconfig")
                  .then(
                     ei.a("target", fx.a())
                        .suggests(($$0x, $$1) -> em.b(a(((eh)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((eh)$$0x.getSource(), fx.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (wc $$2 : $$0.ai().e()) {
         if ($$2.k() instanceof arr $$3) {
            $$1.add($$3.k().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(eh $$0, aqu $$1) {
      GameProfile $$2 = $$1.gk();
      $$1.d.o();
      $$0.a(() -> xe.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(eh $$0, UUID $$1) {
      for (wc $$2 : $$0.l().ai().e()) {
         wk var5 = $$2.k();
         if (var5 instanceof arr) {
            arr $$3 = (arr)var5;
            if ($$3.k().getId().equals($$1)) {
               $$3.n();
            }
         }
      }

      $$0.b(xe.b("Can't find player to unconfig"));
      return 0;
   }
}
