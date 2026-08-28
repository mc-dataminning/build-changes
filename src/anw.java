import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class anw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xi.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xi.b("commands.jfr.dump.failed", $$0));

   private anw() {
   }

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(ex.a("start").executes($$0x -> a((ew)$$0x.getSource()))))
            .then(ex.a("stop").executes($$0x -> b((ew)$$0x.getSource())))
      );
   }

   private static int a(ew $$0) throws CommandSyntaxException {
      bot $$1 = bot.a($$0.l());
      if (!bov.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> xi.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ew $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bov.f.b().normalize());
         Path $$2 = $$0.l().r() && !ab.aV ? $$1 : $$1.toAbsolutePath();
         xi $$3 = xi.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new xg(xg.a.f, $$2.toString())).a(new xo(xo.a.a, xi.c("chat.copy.click"))));
         $$0.a(() -> xi.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
