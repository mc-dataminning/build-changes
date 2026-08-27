import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amo {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.b("Target not reached"));

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(ei.a("to", gd.a()).executes($$0x -> a((eh)$$0x.getSource(), gd.a($$0x, "to"))))
      );
   }

   private static int a(eh $$0, ir $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bsq $$3)) {
         throw a.create();
      } else {
         cbz $$4 = new cby($$3, $$0.e());
         eps $$5 = $$4.a($$1, 0);
         agi.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> xe.b("Made path"), true);
            return 1;
         }
      }
   }
}
