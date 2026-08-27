import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class aiy {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("debugconfig").requires($$0x -> $$0x.c(3)))
               .then(dt.a("config").then(dt.a("target", ef.c()).executes($$0x -> a((ds)$$0x.getSource(), ef.e($$0x, "target"))))))
            .then(
               dt.a("unconfig")
                  .then(
                     dt.a("target", fg.a())
                        .suggests(($$0x, $$1) -> dx.b(a(((ds)$$0x.getSource()).l()), $$1))
                        .executes($$0x -> a((ds)$$0x.getSource(), fg.a($$0x, "target")))
                  )
            )
      );
   }

   private static Iterable<String> a(MinecraftServer $$0) {
      Set<String> $$1 = new HashSet<>();

      for (ug $$2 : $$0.af().e()) {
         if ($$2.m() instanceof aoa $$3) {
            $$1.add($$3.k().getId().toString());
         }
      }

      return $$1;
   }

   private static int a(ds $$0, ane $$1) {
      GameProfile $$2 = $$1.fR();
      $$1.c.o();
      $$0.a(() -> vf.b("Switched player " + $$2.getName() + "(" + $$2.getId() + ") to config mode"), false);
      return 1;
   }

   private static int a(ds $$0, UUID $$1) {
      for (ug $$2 : $$0.l().af().e()) {
         uo var5 = $$2.m();
         if (var5 instanceof aoa) {
            aoa $$3 = (aoa)var5;
            if ($$3.k().getId().equals($$1)) {
               $$3.n();
            }
         }
      }

      $$0.b(vf.b("Can't find player to unconfig"));
      return 0;
   }
}
