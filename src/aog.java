import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class aog {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xg.b("commands.jfr.dump.failed", $$0));

   private aog() {
   }

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(el.a("start").executes($$0x -> a((ek)$$0x.getSource()))))
            .then(el.a("stop").executes($$0x -> b((ek)$$0x.getSource())))
      );
   }

   private static int a(ek $$0) throws CommandSyntaxException {
      brs $$1 = brs.a($$0.l());
      if (!bru.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> xg.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ek $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bru.f.b().normalize());
         Path $$2 = $$0.l().r() && !ac.aU ? $$1 : $$1.toAbsolutePath();
         xg $$3 = xg.b($$1.toString()).a(o.t).a($$1x -> $$1x.a(new xe.c($$2.toString())).a(new xm.e(xg.c("chat.copy.click"))));
         $$0.a(() -> xg.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
