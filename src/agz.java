import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class agz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> te.a("commands.jfr.dump.failed", $$0));

   private agz() {
   }

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(dt.a("start").executes($$0x -> a((ds)$$0x.getSource()))))
            .then(dt.a("stop").executes($$0x -> b((ds)$$0x.getSource())))
      );
   }

   private static int a(ds $$0) throws CommandSyntaxException {
      bdi $$1 = bdi.a($$0.l());
      if (!bdk.e.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> te.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ds $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bdk.e.b().normalize());
         Path $$2 = $$0.l().p() && !aa.aS ? $$1 : $$1.toAbsolutePath();
         te $$3 = te.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new tc(tc.a.f, $$2.toString())).a(new tj(tj.a.a, te.c("chat.copy.click"))));
         $$0.a(() -> te.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
