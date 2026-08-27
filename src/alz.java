import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class alz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ws.b("Target not reached"));

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(ed.a("to", fx.a()).executes($$0x -> a((ec)$$0x.getSource(), fx.a($$0x, "to"))))
      );
   }

   private static int a(ec $$0, im $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof brg $$3)) {
         throw a.create();
      } else {
         cap $$4 = new cao($$3, $$0.e());
         emf $$5 = $$4.a($$1, 0);
         afu.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> ws.b("Made path"), true);
            return 1;
         }
      }
   }
}
