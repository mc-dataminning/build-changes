import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.b("Target not reached"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(ee.a("to", fz.a()).executes($$0x -> a((ed)$$0x.getSource(), fz.a($$0x, "to"))))
      );
   }

   private static int a(ed $$0, in $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bsc $$3)) {
         throw a.create();
      } else {
         cbl $$4 = new cbk($$3, $$0.e());
         emo $$5 = $$4.a($$1, 0);
         afw.a($$0.e(), $$3, $$5, $$4.q());
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
