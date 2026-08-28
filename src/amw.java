import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xl.b("Target not reached"));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(eq.a("to", gl.a()).executes($$0x -> a((ep)$$0x.getSource(), gl.a($$0x, "to"))))
      );
   }

   private static int a(ep $$0, iz $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof btm $$3)) {
         throw a.create();
      } else {
         ccw $$4 = new ccv($$3, $$0.e());
         eoe $$5 = $$4.a($$1, 0);
         agp.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> xl.b("Made path"), true);
            return 1;
         }
      }
   }
}
