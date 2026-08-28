import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ane {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xh.b("Target not reached"));

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(ew.a("to", gr.a()).executes($$0x -> a((ev)$$0x.getSource(), gr.a($$0x, "to"))))
      );
   }

   private static int a(ev $$0, jg $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bux $$3)) {
         throw a.create();
      } else {
         ceh $$4 = new ceg($$3, $$0.e());
         ers $$5 = $$4.a($$1, 0);
         agr.a($$0.e(), $$3, $$5, $$4.r());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> xh.b("Made path"), true);
            return 1;
         }
      }
   }
}
