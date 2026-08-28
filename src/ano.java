import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ano {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xg.b("Target not reached"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(el.a("to", gh.a()).executes($$0x -> a((ek)$$0x.getSource(), gh.a($$0x, "to"))))
      );
   }

   private static int a(ek $$0, iw $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof byh $$3)) {
         throw a.create();
      } else {
         chp $$4 = new cho($$3, $$0.e());
         eyo $$5 = $$4.a($$1, 0);
         agx.a($$0.e(), $$3, $$5, $$4.p());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> xg.b("Made path"), true);
            return 1;
         }
      }
   }
}
