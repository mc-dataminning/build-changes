import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class alx {
   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(ed.a("config").then(ed.a("target", ep.c()).executes($$0x -> a((ec)$$0x.getSource(), ep.e($$0x, "target"))))))
            .then(
               ed.a("unconfig")
                  .then(
                     ed.a("target", fr.a())
                        .suggests(($$0x, $$1) -> eh.b(a(((ec)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((ec)$$0x.getSource(), fr.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (vq $$2 : $$0.ai().e()) {
         if ($$2.k() instanceof arc $$3) {
            $$1.add($$3.k().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ec $$0, aqf $$1) {
      GameProfile $$2 = $$1.fZ();
      $$1.d.o();
      $$0.a(() -> ws.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(ec $$0, UUID $$1) {
      for (vq $$2 : $$0.l().ai().e()) {
         vy var5 = $$2.k();
         if (var5 instanceof arc) {
            arc $$3 = (arc)var5;
            if ($$3.k().getId().equals($$1)) {
               $$3.n();
            }
         }
      }

      $$0.b(ws.b("Can't find player to unconfig"));
      return 0;
   }
}
