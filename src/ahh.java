import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ahh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tm.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tm.a("commands.jfr.dump.failed", $$0));

   private ahh() {
   }

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(du.a("start").executes($$0x -> a((dt)$$0x.getSource()))))
            .then(du.a("stop").executes($$0x -> b((dt)$$0x.getSource())))
      );
   }

   private static int a(dt $$0) throws CommandSyntaxException {
      bdt $$1 = bdt.a($$0.l());
      if (!bdv.e.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> tm.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(dt $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bdv.e.b().normalize());
         Path $$2 = $$0.l().p() && !aa.aT ? $$1 : $$1.toAbsolutePath();
         tm $$3 = tm.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new tk(tk.a.f, $$2.toString())).a(new tr(tr.a.a, tm.c("chat.copy.click"))));
         $$0.a(() -> tm.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
