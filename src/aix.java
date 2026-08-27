import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aix {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vd.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vd.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vd.b("Target not reached"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(dt.a("to", fm.a()).executes($$0x -> a((ds)$$0x.getSource(), fm.a($$0x, "to"))))
      );
   }

   private static int a(ds $$0, hx $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bmh $$3)) {
         throw a.create();
      } else {
         bvp $$4 = new bvo($$3, $$0.e());
         eez $$5 = $$4.a($$1, 0);
         adf.a($$0.e(), $$3, $$5, $$4.q());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> vd.b("Made path"), true);
            return 1;
         }
      }
   }
}
