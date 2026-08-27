import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class aku {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(dv.a("config").then(dv.a("target", eh.c()).executes($$0x -> a((du)$$0x.getSource(), eh.e($$0x, "target"))))))
            .then(
               dv.a("unconfig")
                  .then(
                     dv.a("target", fi.a())
                        .suggests(($$0x, $$1) -> dz.b(a(((du)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((du)$$0x.getSource(), fi.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (uq $$2 : $$0.ai().e()) {
         if ($$2.k() instanceof apx $$3) {
            $$1.add($$3.k().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(du $$0, apb $$1) {
      GameProfile $$2 = $$1.fU();
      $$1.d.o();
      $$0.a(() -> vs.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(du $$0, UUID $$1) {
      for (uq $$2 : $$0.l().ai().e()) {
         uy var5 = $$2.k();
         if (var5 instanceof apx) {
            apx $$3 = (apx)var5;
            if ($$3.k().getId().equals($$1)) {
               $$3.n();
            }
         }
      }

      $$0.b(vs.b("Can't find player to unconfig"));
      return 0;
   }
}
