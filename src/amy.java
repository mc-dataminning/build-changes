import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class amy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.jfr.start.failed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("commands.jfr.dump.failed", $$0));

   private amy() {
   }

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("jfr").requires($$0x -> $$0x.c(4)))
               .then(ef.a("start").executes($$0x -> a((ee)$$0x.getSource()))))
            .then(ef.a("stop").executes($$0x -> b((ee)$$0x.getSource())))
      );
   }

   private static int a(ee $$0) throws CommandSyntaxException {
      bmm $$1 = bmm.a($$0.l());
      if (!bmo.f.a($$1)) {
         throw a.create();
      } else {
         $$0.a(() -> wx.c("commands.jfr.started"), false);
         return 1;
      }
   }

   private static int b(ee $$0) throws CommandSyntaxException {
      try {
         Path $$1 = Paths.get(".").relativize(bmo.f.b().normalize());
         Path $$2 = $$0.l().r() && !aa.aX ? $$1 : $$1.toAbsolutePath();
         wx $$3 = wx.b($$1.toString()).a(n.t).a($$1x -> $$1x.a(new wv(wv.a.f, $$2.toString())).a(new xd(xd.a.a, wx.c("chat.copy.click"))));
         $$0.a(() -> wx.a("commands.jfr.stopped", $$3), false);
         return 1;
      } catch (Throwable var4) {
         throw b.create(var4.getMessage());
      }
   }
}
