import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class ahx {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(dv.a("config").then(dv.a("target", eg.c()).executes($$0x -> a((du)$$0x.getSource(), eg.e($$0x, "target"))))))
            .then(
               dv.a("unconfig")
                  .then(
                     dv.a("target", fg.a())
                        .suggests(($$0x, $$1) -> dy.b(a(((du)$$0x.getSource()).m()), $$1))
                        .executes($$0x -> a((du)$$0x.getSource(), fg.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (ts $$2 : $$0.ad().e()) {
         if ($$2.m() instanceof amx $$3) {
            $$1.add($$3.k().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(du $$0, amb $$1) {
      GameProfile $$2 = $$1.fR();
      $$1.c.o();
      $$0.a(() -> ur.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(du $$0, UUID $$1) {
      for (ts $$2 : $$0.m().ad().e()) {
         ua var5 = $$2.m();
         if (var5 instanceof amx) {
            amx $$3 = (amx)var5;
            if ($$3.k().getId().equals($$1)) {
               $$3.n();
            }
         }
      }

      $$0.b(ur.b("Can't find player to unconfig"));
      return 0;
   }
}
