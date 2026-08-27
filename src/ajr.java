import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ajr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vf.b("commands.jfr.dump.failed", $$0));

   private ajr() {
   }

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(dt.a("start").executes($$0x -> a((ds)$$0x.getSource()))))
            .then(dt.a("stop").executes($$0x -> b((ds)$$0x.getSource())))
      );
   }

   private static int a(ds $$0) throws CommandSyntaxException {
      bgw $$1 = bgw.a($$0.l());
      if (!bgy.e.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> vf.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ds $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bgy.e.b().normalize());
         Path $$2 = $$0.l().p() && !aa.aW ? $$1 : $$1.toAbsolutePath();
         vf $$3 = vf.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new vd(vd.a.f, $$2.toString())).a(new vl(vl.a.a, vf.c("chat.copy.click"))));
         $$0.a(() -> vf.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
