import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class anx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xa.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xa.b("commands.jfr.dump.failed", $$0));

   private anx() {
   }

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(ek.a("start").executes($$0x -> a((ej)$$0x.getSource()))))
            .then(ek.a("stop").executes($$0x -> b((ej)$$0x.getSource())))
      );
   }

   private static int a(ej $$0) throws CommandSyntaxException {
      brh $$1 = brh.a($$0.l());
      if (!brj.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> xa.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ej $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(brj.f.b().normalize());
         Path $$2 = $$0.l().r() && !ac.aU ? $$1 : $$1.toAbsolutePath();
         xa $$3 = xa.b($$1.toString()).a(o.t).a($$1x -> $$1x.a(new wy.c($$2.toString())).a(new xg.e(xa.c("chat.copy.click"))));
         $$0.a(() -> xa.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
