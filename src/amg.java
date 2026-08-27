import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class amg {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wi.b("commands.jfr.dump.failed", $$0));

   private amg() {
   }

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(dw.a("start").executes($$0x -> a((dv)$$0x.getSource()))))
            .then(dw.a("stop").executes($$0x -> b((dv)$$0x.getSource())))
      );
   }

   private static int a(dv $$0) throws CommandSyntaxException {
      bkx $$1 = bkx.a($$0.l());
      if (!bkz.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> wi.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(dv $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bkz.f.b().normalize());
         Path $$2 = $$0.l().r() && !aa.aW ? $$1 : $$1.toAbsolutePath();
         wi $$3 = wi.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new wg(wg.a.f, $$2.toString())).a(new wo(wo.a.a, wi.c("chat.copy.click"))));
         $$0.a(() -> wi.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
