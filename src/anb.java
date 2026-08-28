import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class anb {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.b("Target not reached"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(ev.a("to", gq.a()).executes($$0x -> a((eu)$$0x.getSource(), gq.a($$0x, "to"))))
      );
   }

   private static int a(eu $$0, jf $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bup $$3)) {
         throw a.create();
      } else {
         cdy $$4 = new cdx($$3, $$0.e());
         erh $$5 = $$4.a($$1, 0);
         ago.a($$0.e(), $$3, $$5, $$4.r());
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
