import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aja {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vf.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vf.b("Target not reached"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(dt.a("to", fm.a()).executes($$0x -> a((ds)$$0x.getSource(), fm.a($$0x, "to"))))
      );
   }

   private static int a(ds $$0, hx $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bmm $$3)) {
         throw a.create();
      } else {
         bvu $$4 = new bvt($$3, $$0.e());
         eff $$5 = $$4.a($$1, 0);
         adi.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> vf.b("Made path"), true);
            return 1;
         }
      }
   }
}
