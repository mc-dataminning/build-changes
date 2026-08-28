import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class anf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xa.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xa.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xa.b("Target not reached"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(ek.a("to", gg.a()).executes($$0x -> a((ej)$$0x.getSource(), gg.a($$0x, "to"))))
      );
   }

   private static int a(ej $$0, iv $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bxw $$3)) {
         throw a.create();
      } else {
         che $$4 = new chd($$3, $$0.e());
         eyc $$5 = $$4.a($$1, 0);
         ago.a($$0.e(), $$3, $$5, $$4.p());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> xa.b("Made path"), true);
            return 1;
         }
      }
   }
}
