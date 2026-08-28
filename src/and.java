import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class and {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.jfr.dump.failed", $$0));

   private and() {
   }

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(eu.a("start").executes($$0x -> a((et)$$0x.getSource()))))
            .then(eu.a("stop").executes($$0x -> b((et)$$0x.getSource())))
      );
   }

   private static int a(et $$0) throws CommandSyntaxException {
      bni $$1 = bni.a($$0.l());
      if (!bnk.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> wy.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(et $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bnk.f.b().normalize());
         Path $$2 = $$0.l().r() && !ab.aV ? $$1 : $$1.toAbsolutePath();
         wy $$3 = wy.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new ww(ww.a.f, $$2.toString())).a(new xe(xe.a.a, wy.c("chat.copy.click"))));
         $$0.a(() -> wy.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
