import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ant {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ww.b("commands.jfr.dump.failed", $$0));

   private ant() {
   }

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(ej.a("start").executes($$0x -> a((ei)$$0x.getSource()))))
            .then(ej.a("stop").executes($$0x -> b((ei)$$0x.getSource())))
      );
   }

   private static int a(ei $$0) throws CommandSyntaxException {
      bqp $$1 = bqp.a($$0.l());
      if (!bqr.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> ww.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ei $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bqr.f.b().normalize());
         Path $$2 = $$0.l().r() && !ab.aU ? $$1 : $$1.toAbsolutePath();
         ww $$3 = ww.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new wu.c($$2.toString())).a(new xc.e(ww.c("chat.copy.click"))));
         $$0.a(() -> ww.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
