import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class aod {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xk.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xk.b("commands.jfr.dump.failed", $$0));

   private aod() {
   }

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(ex.a("start").executes($$0x -> a((ew)$$0x.getSource()))))
            .then(ex.a("stop").executes($$0x -> b((ew)$$0x.getSource())))
      );
   }

   private static int a(ew $$0) throws CommandSyntaxException {
      bpp $$1 = bpp.a($$0.l());
      if (!bpr.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> xk.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ew $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bpr.f.b().normalize());
         Path $$2 = $$0.l().r() && !ab.aU ? $$1 : $$1.toAbsolutePath();
         xk $$3 = xk.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new xi(xi.a.f, $$2.toString())).a(new xq(xq.a.a, xk.c("chat.copy.click"))));
         $$0.a(() -> xk.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
