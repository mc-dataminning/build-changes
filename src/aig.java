import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class aig {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ui.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ui.b("commands.jfr.dump.failed", $$0));

   private aig() {
   }

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(dv.a("start").executes($$0x -> a((du)$$0x.getSource()))))
            .then(dv.a("stop").executes($$0x -> b((du)$$0x.getSource())))
      );
   }

   private static int a(du $$0) throws CommandSyntaxException {
      bew $$1 = bew.a($$0.m());
      if (!bey.e.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> ui.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(du $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bey.e.b().normalize());
         Path $$2 = $$0.m().p() && !aa.aT ? $$1 : $$1.toAbsolutePath();
         ui $$3 = ui.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new ug(ug.a.f, $$2.toString())).a(new uo(uo.a.a, ui.c("chat.copy.click"))));
         $$0.a(() -> ui.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
