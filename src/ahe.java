import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ahe {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ti.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> ti.a("commands.jfr.dump.failed", $$0));

   private ahe() {
   }

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(du.a("start").executes($$0x -> a((dt)$$0x.getSource()))))
            .then(du.a("stop").executes($$0x -> b((dt)$$0x.getSource())))
      );
   }

   private static int a(dt $$0) throws CommandSyntaxException {
      bdo $$1 = bdo.a($$0.l());
      if (!bdq.e.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> ti.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(dt $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bdq.e.b().normalize());
         Path $$2 = $$0.l().p() && !aa.aS ? $$1 : $$1.toAbsolutePath();
         ti $$3 = ti.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new tg(tg.a.f, $$2.toString())).a(new tn(tn.a.a, ti.c("chat.copy.click"))));
         $$0.a(() -> ti.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
