import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wz.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wz.b("Target not reached"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(eu.a("to", gp.a()).executes($$0x -> a((et)$$0x.getSource(), gp.a($$0x, "to"))))
      );
   }

   private static int a(et $$0, jd $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof btp $$3)) {
         throw a.create();
      } else {
         cda $$4 = new ccz($$3, $$0.e());
         epq $$5 = $$4.a($$1, 0);
         agf.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> wz.b("Made path"), true);
            return 1;
         }
      }
   }
}
