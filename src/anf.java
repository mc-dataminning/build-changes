import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class anf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xe.b("commands.jfr.dump.failed", $$0));

   private anf() {
   }

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(ei.a("start").executes($$0x -> a((eh)$$0x.getSource()))))
            .then(ei.a("stop").executes($$0x -> b((eh)$$0x.getSource())))
      );
   }

   private static int a(eh $$0) throws CommandSyntaxException {
      bms $$1 = bms.a($$0.l());
      if (!bmu.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> xe.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(eh $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bmu.f.b().normalize());
         Path $$2 = $$0.l().r() && !ab.aX ? $$1 : $$1.toAbsolutePath();
         xe $$3 = xe.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new xc(xc.a.f, $$2.toString())).a(new xk(xk.a.a, xe.c("chat.copy.click"))));
         $$0.a(() -> xe.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
