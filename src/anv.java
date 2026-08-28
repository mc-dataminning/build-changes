import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class anv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("commands.jfr.dump.failed", $$0));

   private anv() {
   }

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(ew.a("start").executes($$0x -> a((ev)$$0x.getSource()))))
            .then(ew.a("stop").executes($$0x -> b((ev)$$0x.getSource())))
      );
   }

   private static int a(ev $$0) throws CommandSyntaxException {
      boo $$1 = boo.a($$0.l());
      if (!boq.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> xh.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ev $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(boq.f.b().normalize());
         Path $$2 = $$0.l().r() && !ab.aW ? $$1 : $$1.toAbsolutePath();
         xh $$3 = xh.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new xf(xf.a.f, $$2.toString())).a(new xn(xn.a.a, xh.c("chat.copy.click"))));
         $$0.a(() -> xh.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
