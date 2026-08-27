import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class alb {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vu.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vu.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vu.b("Target not reached"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(dv.a("to", fo.a()).executes($$0x -> a((du)$$0x.getSource(), fo.a($$0x, "to"))))
      );
   }

   private static int a(du $$0, ib $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bpq $$3)) {
         throw a.create();
      } else {
         byz $$4 = new byy($$3, $$0.e());
         ejc $$5 = $$4.a($$1, 0);
         aew.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> vu.b("Made path"), true);
            return 1;
         }
      }
   }
}
