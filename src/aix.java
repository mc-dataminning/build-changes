import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class aix {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(uv.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> uv.b("commands.jfr.dump.failed", $$0));

   private aix() {
   }

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(dv.a("start").executes($$0x -> a((du)$$0x.getSource()))))
            .then(dv.a("stop").executes($$0x -> b((du)$$0x.getSource())))
      );
   }

   private static int a(du $$0) throws CommandSyntaxException {
      bfw $$1 = bfw.a($$0.l());
      if (!bfy.e.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> uv.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(du $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bfy.e.b().normalize());
         Path $$2 = $$0.l().p() && !aa.aT ? $$1 : $$1.toAbsolutePath();
         uv $$3 = uv.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new ut(ut.a.f, $$2.toString())).a(new vb(vb.a.a, uv.c("chat.copy.click"))));
         $$0.a(() -> uv.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
