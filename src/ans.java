import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ans {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.jfr.dump.failed", $$0));

   private ans() {
   }

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(ev.a("start").executes($$0x -> a((eu)$$0x.getSource()))))
            .then(ev.a("stop").executes($$0x -> b((eu)$$0x.getSource())))
      );
   }

   private static int a(eu $$0) throws CommandSyntaxException {
      bok $$1 = bok.a($$0.l());
      if (!bom.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> xe.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(eu $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bom.f.b().normalize());
         Path $$2 = $$0.l().r() && !ab.aW ? $$1 : $$1.toAbsolutePath();
         xe $$3 = xe.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new xc(xc.a.f, $$2.toString())).a(new xk(xk.a.a, xe.c("chat.copy.click"))));
         $$0.a(() -> xe.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
