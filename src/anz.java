import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class anz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xl.b("commands.jfr.dump.failed", $$0));

   private anz() {
   }

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(ex.a("start").executes($$0x -> a((ew)$$0x.getSource()))))
            .then(ex.a("stop").executes($$0x -> b((ew)$$0x.getSource())))
      );
   }

   private static int a(ew $$0) throws CommandSyntaxException {
      box $$1 = box.a($$0.l());
      if (!boz.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> xl.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ew $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(boz.f.b().normalize());
         Path $$2 = $$0.l().r() && !ab.aV ? $$1 : $$1.toAbsolutePath();
         xl $$3 = xl.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new xj(xj.a.f, $$2.toString())).a(new xr(xr.a.a, xl.c("chat.copy.click"))));
         $$0.a(() -> xl.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
