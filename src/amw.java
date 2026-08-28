import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class amw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wu.b("commands.jfr.dump.failed", $$0));

   private amw() {
   }

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(er.a("start").executes($$0x -> a((eq)$$0x.getSource()))))
            .then(er.a("stop").executes($$0x -> b((eq)$$0x.getSource())))
      );
   }

   private static int a(eq $$0) throws CommandSyntaxException {
      bmv $$1 = bmv.a($$0.l());
      if (!bmx.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> wu.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(eq $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bmx.f.b().normalize());
         Path $$2 = $$0.l().r() && !aa.aX ? $$1 : $$1.toAbsolutePath();
         wu $$3 = wu.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new ws(ws.a.f, $$2.toString())).a(new xa(xa.a.a, wu.c("chat.copy.click"))));
         $$0.a(() -> wu.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
