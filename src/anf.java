import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class anf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xi.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xi.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xi.b("Target not reached"));

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(ex.a("to", gs.a()).executes($$0x -> a((ew)$$0x.getSource(), gs.a($$0x, "to"))))
      );
   }

   private static int a(ew $$0, jh $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bvc $$3)) {
         throw a.create();
      } else {
         cem $$4 = new cel($$3, $$0.e());
         ery $$5 = $$4.a($$1, 0);
         ags.a($$0.e(), $$3, $$5, $$4.r());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> xi.b("Made path"), true);
            return 1;
         }
      }
   }
}
