import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class and {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.b("Target not reached"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(ek.a("to", gg.a()).executes($$0x -> a((ej)$$0x.getSource(), gg.a($$0x, "to"))))
      );
   }

   private static int a(ej $$0, iv $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bxl $$3)) {
         throw a.create();
      } else {
         cgt $$4 = new cgs($$3, $$0.e());
         exj $$5 = $$4.a($$1, 0);
         agm.a($$0.e(), $$3, $$5, $$4.p());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> wy.b("Made path"), true);
            return 1;
         }
      }
   }
}
