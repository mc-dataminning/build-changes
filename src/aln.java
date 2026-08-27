import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class aln {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vs.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> vs.b("commands.jfr.dump.failed", $$0));

   private aln() {
   }

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(dv.a("start").executes($$0x -> a((du)$$0x.getSource()))))
            .then(dv.a("stop").executes($$0x -> b((du)$$0x.getSource())))
      );
   }

   private static int a(du $$0) throws CommandSyntaxException {
      bjg $$1 = bjg.a($$0.l());
      if (!bji.e.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> vs.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(du $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bji.e.b().normalize());
         Path $$2 = $$0.l().r() && !aa.aV ? $$1 : $$1.toAbsolutePath();
         vs $$3 = vs.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new vq(vq.a.f, $$2.toString())).a(new vy(vy.a.a, vs.c("chat.copy.click"))));
         $$0.a(() -> vs.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
