import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ams {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wp.b("Target not reached"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(ey.a("to", gt.a()).executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "to"))))
      );
   }

   private static int a(ex $$0, ji $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bvk $$3)) {
         throw a.create();
      } else {
         ceu $$4 = new cet($$3, $$0.e());
         eto $$5 = $$4.a($$1, 0);
         agd.a($$0.e(), $$3, $$5, $$4.p());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> wp.b("Made path"), true);
            return 1;
         }
      }
   }
}
