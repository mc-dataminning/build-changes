import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xd.b("Target not reached"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(eu.a("to", gp.a()).executes($$0x -> a((et)$$0x.getSource(), gp.a($$0x, "to"))))
      );
   }

   private static int a(et $$0, je $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bum $$3)) {
         throw a.create();
      } else {
         cdv $$4 = new cdu($$3, $$0.e());
         erd $$5 = $$4.a($$1, 0);
         agn.a($$0.e(), $$3, $$5, $$4.r());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> xd.b("Made path"), true);
            return 1;
         }
      }
   }
}
