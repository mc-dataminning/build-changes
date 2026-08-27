import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class ail {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(dt.a("config").then(dt.a("target", ee.c()).executes($$0x -> a((ds)$$0x.getSource(), ee.e($$0x, "target"))))))
            .then(
               dt.a("unconfig")
                  .then(
                     dt.a("target", fe.a())
                        .suggests(($$0x, $$1) -> dw.b(a(((ds)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((ds)$$0x.getSource(), fe.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (uc $$2 : $$0.af().e()) {
         if ($$2.m() instanceof anm $$3) {
            $$1.add($$3.k().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ds $$0, amq $$1) {
      GameProfile $$2 = $$1.fR();
      $$1.c.o();
      $$0.a(() -> vb.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(ds $$0, UUID $$1) {
      for (uc $$2 : $$0.l().af().e()) {
         uk var5 = $$2.m();
         if (var5 instanceof anm) {
            anm $$3 = (anm)var5;
            if ($$3.k().getId().equals($$1)) {
               $$3.n();
            }
         }
      }

      $$0.b(vb.b("Can't find player to unconfig"));
      return 0;
   }
}
