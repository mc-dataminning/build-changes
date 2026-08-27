import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class alp {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wi.b("Target not reached"));

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(dw.a("to", fq.a()).executes($$0x -> a((dv)$$0x.getSource(), fq.a($$0x, "to"))))
      );
   }

   private static int a(dv $$0, id $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bqv $$3)) {
         throw a.create();
      } else {
         cae $$4 = new cad($$3, $$0.e());
         elp $$5 = $$4.a($$1, 0);
         afk.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> wi.b("Made path"), true);
            return 1;
         }
      }
   }
}
