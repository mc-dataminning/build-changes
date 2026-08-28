import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class anz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xc.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xc.b("commands.jfr.dump.failed", $$0));

   private anz() {
   }

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(el.a("start").executes($$0x -> a((ek)$$0x.getSource()))))
            .then(el.a("stop").executes($$0x -> b((ek)$$0x.getSource())))
      );
   }

   private static int a(ek $$0) throws CommandSyntaxException {
      brj $$1 = brj.a($$0.l());
      if (!brl.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> xc.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ek $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(brl.f.b().normalize());
         Path $$2 = $$0.l().r() && !ac.aU ? $$1 : $$1.toAbsolutePath();
         xc $$3 = xc.b($$1.toString()).a(o.t).a($$1x -> $$1x.a(new xa.c($$2.toString())).a(new xi.e(xc.c("chat.copy.click"))));
         $$0.a(() -> xc.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
