import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ami {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wx.b("Target not reached"));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(ef.a("to", ga.a()).executes($$0x -> a((ee)$$0x.getSource(), ga.a($$0x, "to"))))
      );
   }

   private static int a(ee $$0, io $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bss $$3)) {
         throw a.create();
      } else {
         ccc $$4 = new ccb($$3, $$0.e());
         enk $$5 = $$4.a($$1, 0);
         agb.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> wx.b("Made path"), true);
            return 1;
         }
      }
   }
}
