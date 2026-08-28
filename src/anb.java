import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class anb {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(ej.a("config").then(ej.a("target", ev.c()).executes($$0x -> a((ei)$$0x.getSource(), ev.e($$0x, "target"))))))
            .then(
               ej.a("unconfig")
                  .then(
                     ej.a("target", fz.a())
                        .suggests(($$0x, $$1) -> en.b(a(((ei)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((ei)$$0x.getSource(), fz.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (vr $$2 : $$0.ah().e()) {
         if ($$2.k() instanceof asr $$3) {
            $$1.add($$3.j().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ei $$0, arr $$1) {
      GameProfile $$2 = $$1.gh();
      $$1.f.n();
      $$0.a(() -> wy.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(ei $$0, UUID $$1) {
      for (vr $$2 : $$0.l().ah().e()) {
         we var5 = $$2.k();
         if (var5 instanceof asr) {
            asr $$3 = (asr)var5;
            if ($$3.j().getId().equals($$1)) {
               $$3.m();
            }
         }
      }

      $$0.b(wy.b("Can't find player to unconfig"));
      return 0;
   }
}
