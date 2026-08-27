import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class amq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ws.b("commands.jfr.dump.failed", $$0));

   private amq() {
   }

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(ed.a("start").executes($$0x -> a((ec)$$0x.getSource()))))
            .then(ed.a("stop").executes($$0x -> b((ec)$$0x.getSource())))
      );
   }

   private static int a(ec $$0) throws CommandSyntaxException {
      bli $$1 = bli.a($$0.l());
      if (!blk.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> ws.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ec $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(blk.f.b().normalize());
         Path $$2 = $$0.l().r() && !aa.aX ? $$1 : $$1.toAbsolutePath();
         ws $$3 = ws.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new wq(wq.a.f, $$2.toString())).a(new wy(wy.a.a, ws.c("chat.copy.click"))));
         $$0.a(() -> ws.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
