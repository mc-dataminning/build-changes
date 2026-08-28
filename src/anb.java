import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class anb {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ww.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ww.b("Target not reached"));

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(ej.a("to", gf.a()).executes($$0x -> a((ei)$$0x.getSource(), gf.a($$0x, "to"))))
      );
   }

   private static int a(ei $$0, iu $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bxb $$3)) {
         throw a.create();
      } else {
         cgj $$4 = new cgi($$3, $$0.e());
         ewj $$5 = $$4.a($$1, 0);
         agk.a($$0.e(), $$3, $$5, $$4.p());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> ww.b("Made path"), true);
            return 1;
         }
      }
   }
}
