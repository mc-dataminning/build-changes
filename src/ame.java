import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ame {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wg.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wg.b("commands.jfr.dump.failed", $$0));

   private ame() {
   }

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(dv.a("start").executes($$0x -> a((du)$$0x.getSource()))))
            .then(dv.a("stop").executes($$0x -> b((du)$$0x.getSource())))
      );
   }

   private static int a(du $$0) throws CommandSyntaxException {
      bks $$1 = bks.a($$0.l());
      if (!bku.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> wg.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(du $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bku.f.b().normalize());
         Path $$2 = $$0.l().r() && !aa.aW ? $$1 : $$1.toAbsolutePath();
         wg $$3 = wg.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new we(we.a.f, $$2.toString())).a(new wm(wm.a.a, wg.c("chat.copy.click"))));
         $$0.a(() -> wg.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
