import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class amg {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(ef.a("config").then(ef.a("target", er.c()).executes($$0x -> a((ee)$$0x.getSource(), er.e($$0x, "target"))))))
            .then(
               ef.a("unconfig")
                  .then(
                     ef.a("target", fu.a())
                        .suggests(($$0x, $$1) -> ej.b(a(((ee)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((ee)$$0x.getSource(), fu.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (vv $$2 : $$0.ai().e()) {
         if ($$2.k() instanceof arl $$3) {
            $$1.add($$3.k().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ee $$0, aqo $$1) {
      GameProfile $$2 = $$1.gb();
      $$1.c.o();
      $$0.a(() -> wx.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(ee $$0, UUID $$1) {
      for (vv $$2 : $$0.l().ai().e()) {
         wd var5 = $$2.k();
         if (var5 instanceof arl) {
            arl $$3 = (arl)var5;
            if ($$3.k().getId().equals($$1)) {
               $$3.n();
            }
         }
      }

      $$0.b(wx.b("Can't find player to unconfig"));
      return 0;
   }
}
