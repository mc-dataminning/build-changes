import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class aln {
   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(dw.a("config").then(dw.a("target", ei.c()).executes($$0x -> a((dv)$$0x.getSource(), ei.e($$0x, "target"))))))
            .then(
               dw.a("unconfig")
                  .then(
                     dw.a("target", fk.a())
                        .suggests(($$0x, $$1) -> ea.b(a(((dv)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((dv)$$0x.getSource(), fk.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (vg $$2 : $$0.ai().e()) {
         if ($$2.k() instanceof aqs $$3) {
            $$1.add($$3.k().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(dv $$0, apv $$1) {
      GameProfile $$2 = $$1.fY();
      $$1.d.o();
      $$0.a(() -> wi.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(dv $$0, UUID $$1) {
      for (vg $$2 : $$0.l().ai().e()) {
         vo var5 = $$2.k();
         if (var5 instanceof aqs) {
            aqs $$3 = (aqs)var5;
            if ($$3.k().getId().equals($$1)) {
               $$3.n();
            }
         }
      }

      $$0.b(wi.b("Can't find player to unconfig"));
      return 0;
   }
}
