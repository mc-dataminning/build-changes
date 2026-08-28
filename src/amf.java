import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.b("Target not reached"));

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(er.a("to", gm.a()).executes($$0x -> a((eq)$$0x.getSource(), gm.a($$0x, "to"))))
      );
   }

   private static int a(eq $$0, ja $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof btd $$3)) {
         throw a.create();
      } else {
         ccn $$4 = new ccm($$3, $$0.e());
         eov $$5 = $$4.a($$1, 0);
         afy.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> wu.b("Made path"), true);
            return 1;
         }
      }
   }
}
