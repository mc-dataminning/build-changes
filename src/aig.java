import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aig {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(uv.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(uv.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(uv.b("Target not reached"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(dv.a("to", fm.a()).executes($$0x -> a((du)$$0x.getSource(), fm.a($$0x, "to"))))
      );
   }

   private static int a(du $$0, hx $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bln $$3)) {
         throw a.create();
      } else {
         buu $$4 = new but($$3, $$0.e());
         edm $$5 = $$4.a($$1, 0);
         aco.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> uv.b("Made path"), true);
            return 1;
         }
      }
   }
}
