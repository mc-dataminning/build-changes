import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class anh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xc.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xc.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xc.b("Target not reached"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(el.a("to", gh.a()).executes($$0x -> a((ek)$$0x.getSource(), gh.a($$0x, "to"))))
      );
   }

   private static int a(ek $$0, iw $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bxy $$3)) {
         throw a.create();
      } else {
         chg $$4 = new chf($$3, $$0.e());
         eye $$5 = $$4.a($$1, 0);
         agq.a($$0.e(), $$3, $$5, $$4.p());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> xc.b("Made path"), true);
            return 1;
         }
      }
   }
}
