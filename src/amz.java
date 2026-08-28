import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.b("Target not reached"));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(eq.a("to", gl.a()).executes($$0x -> a((ep)$$0x.getSource(), gl.a($$0x, "to"))))
      );
   }

   private static int a(ep $$0, iz $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof btq $$3)) {
         throw a.create();
      } else {
         cda $$4 = new ccz($$3, $$0.e());
         eoi $$5 = $$4.a($$1, 0);
         ags.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> xo.b("Made path"), true);
            return 1;
         }
      }
   }
}
