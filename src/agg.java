import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class agg {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(dt.a("config").then(dt.a("target", ed.c()).executes($$0x -> a((ds)$$0x.getSource(), ed.e($$0x, "target"))))))
            .then(
               dt.a("unconfig")
                  .then(
                     dt.a("target", fd.a())
                        .suggests(($$0x, $$1) -> dv.b(a(((ds)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((ds)$$0x.getSource(), fd.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (sf $$2 : $$0.ad().e()) {
         if ($$2.m() instanceof ale $$3) {
            $$1.add($$3.j().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ds $$0, akj $$1) {
      GameProfile $$2 = $$1.fP();
      $$1.c.n();
      $$0.a(() -> te.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(ds $$0, UUID $$1) {
      for (sf $$2 : $$0.l().ad().e()) {
         sn var5 = $$2.m();
         if (var5 instanceof ale) {
            ale $$3 = (ale)var5;
            if ($$3.j().getId().equals($$1)) {
               $$3.m();
            }
         }
      }

      $$0.b(te.b("Can't find player to unconfig"));
      return 0;
   }
}
