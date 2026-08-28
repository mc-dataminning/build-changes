import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class anp {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xd.b("commands.jfr.dump.failed", $$0));

   private anp() {
   }

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(eu.a("start").executes($$0x -> a((et)$$0x.getSource()))))
            .then(eu.a("stop").executes($$0x -> b((et)$$0x.getSource())))
      );
   }

   private static int a(et $$0) throws CommandSyntaxException {
      boc $$1 = boc.a($$0.l());
      if (!boe.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> xd.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(et $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(boe.f.b().normalize());
         Path $$2 = $$0.l().r() && !ab.aW ? $$1 : $$1.toAbsolutePath();
         xd $$3 = xd.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new xb(xb.a.f, $$2.toString())).a(new xj(xj.a.a, xd.c("chat.copy.click"))));
         $$0.a(() -> xd.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
