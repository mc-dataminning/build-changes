import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class agk {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tf.b("Target not reached"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(ds.a("to", fi.a()).executes($$0x -> a((dr)$$0x.getSource(), fi.a($$0x, "to"))))
      );
   }

   private static int a(dr $$0, gu $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bja $$3)) {
         throw a.create();
      } else {
         bsi $$4 = new bsh($$3, $$0.e());
         eas $$5 = $$4.a($$1, 0);
         aav.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> tf.b("Made path"), true);
            return 1;
         }
      }
   }
}
