import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ans {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wv.b("commands.jfr.dump.failed", $$0));

   private ans() {
   }

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(ey.a("start").executes($$0x -> a((ex)$$0x.getSource()))))
            .then(ey.a("stop").executes($$0x -> b((ex)$$0x.getSource())))
      );
   }

   private static int a(ex $$0) throws CommandSyntaxException {
      bqh $$1 = bqh.a($$0.l());
      if (!bqj.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> wv.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ex $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bqj.f.b().normalize());
         Path $$2 = $$0.l().r() && !ab.aU ? $$1 : $$1.toAbsolutePath();
         wv $$3 = wv.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new wt.c($$2.toString())).a(new xb.e(wv.c("chat.copy.click"))));
         $$0.a(() -> wv.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
