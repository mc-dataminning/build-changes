import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class aie {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(dv.a("config").then(dv.a("target", eg.c()).executes($$0x -> a((du)$$0x.getSource(), eg.e($$0x, "target"))))))
            .then(
               dv.a("unconfig")
                  .then(
                     dv.a("target", fg.a())
                        .suggests(($$0x, $$1) -> dy.b(a(((du)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((du)$$0x.getSource(), fg.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (tw $$2 : $$0.af().e()) {
         if ($$2.m() instanceof anf $$3) {
            $$1.add($$3.k().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(du $$0, amj $$1) {
      GameProfile $$2 = $$1.fS();
      $$1.c.o();
      $$0.a(() -> uv.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(du $$0, UUID $$1) {
      for (tw $$2 : $$0.l().af().e()) {
         ue var5 = $$2.m();
         if (var5 instanceof anf) {
            anf $$3 = (anf)var5;
            if ($$3.k().getId().equals($$1)) {
               $$3.n();
            }
         }
      }

      $$0.b(uv.b("Can't find player to unconfig"));
      return 0;
   }
}
