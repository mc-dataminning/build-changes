import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aln {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wg.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wg.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wg.b("Target not reached"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(dv.a("to", fo.a()).executes($$0x -> a((du)$$0x.getSource(), fo.a($$0x, "to"))))
      );
   }

   private static int a(du $$0, ib $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bqq $$3)) {
         throw a.create();
      } else {
         bzz $$4 = new bzy($$3, $$0.e());
         elg $$5 = $$4.a($$1, 0);
         afi.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> wg.b("Made path"), true);
            return 1;
         }
      }
   }
}
