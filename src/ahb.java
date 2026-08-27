import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ahb {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> tf.a("commands.jfr.dump.failed", $$0));

   private ahb() {
   }

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(ds.a("start").executes($$0x -> a((dr)$$0x.getSource()))))
            .then(ds.a("stop").executes($$0x -> b((dr)$$0x.getSource())))
      );
   }

   private static int a(dr $$0) throws CommandSyntaxException {
      bdl $$1 = bdl.a($$0.l());
      if (!bdn.e.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> tf.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(dr $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bdn.e.b().normalize());
         Path $$2 = $$0.l().p() && !aa.aS ? $$1 : $$1.toAbsolutePath();
         tf $$3 = tf.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new td(td.a.f, $$2.toString())).a(new tk(tk.a.a, tf.c("chat.copy.click"))));
         $$0.a(() -> tf.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
