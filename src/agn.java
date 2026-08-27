import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class agn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ti.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ti.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ti.b("Target not reached"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(du.a("to", fk.a()).executes($$0x -> a((dt)$$0x.getSource(), fk.a($$0x, "to"))))
      );
   }

   private static int a(dt $$0, gw $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bjd $$3)) {
         throw a.create();
      } else {
         bsk $$4 = new bsj($$3, $$0.e());
         eaw $$5 = $$4.a($$1, 0);
         aay.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> ti.b("Made path"), true);
            return 1;
         }
      }
   }
}
