import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class anq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("commands.jfr.dump.failed", $$0));

   private anq() {
   }

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(eq.a("start").executes($$0x -> a((ep)$$0x.getSource()))))
            .then(eq.a("stop").executes($$0x -> b((ep)$$0x.getSource())))
      );
   }

   private static int a(ep $$0) throws CommandSyntaxException {
      bnl $$1 = bnl.a($$0.l());
      if (!bnn.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> xo.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ep $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bnn.f.b().normalize());
         Path $$2 = $$0.l().r() && !aa.aX ? $$1 : $$1.toAbsolutePath();
         xo $$3 = xo.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new xm(xm.a.f, $$2.toString())).a(new xu(xu.a.a, xo.c("chat.copy.click"))));
         $$0.a(() -> xo.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
