import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amm {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.b("Target not reached"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(eu.a("to", gp.a()).executes($$0x -> a((et)$$0x.getSource(), gp.a($$0x, "to"))))
      );
   }

   private static int a(et $$0, jd $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof btn $$3)) {
         throw a.create();
      } else {
         ccy $$4 = new ccx($$3, $$0.e());
         epm $$5 = $$4.a($$1, 0);
         age.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> wy.b("Made path"), true);
            return 1;
         }
      }
   }
}
