import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class amt {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.jfr.dump.failed", $$0));

   private amt() {
   }

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(ee.a("start").executes($$0x -> a((ed)$$0x.getSource()))))
            .then(ee.a("stop").executes($$0x -> b((ed)$$0x.getSource())))
      );
   }

   private static int a(ed $$0) throws CommandSyntaxException {
      bme $$1 = bme.a($$0.l());
      if (!bmg.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> wu.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ed $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bmg.f.b().normalize());
         Path $$2 = $$0.l().r() && !aa.aX ? $$1 : $$1.toAbsolutePath();
         wu $$3 = wu.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new ws(ws.a.f, $$2.toString())).a(new xa(xa.a.a, wu.c("chat.copy.click"))));
         $$0.a(() -> wu.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
