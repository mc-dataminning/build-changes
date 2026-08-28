import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wo.b("Source is not a mob"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wo.b("Path not found"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wo.b("Target not reached"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("debugpath").requires($$0x -> $$0x.c(2)))
            .then(ey.a("to", gt.a()).executes($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "to"))))
      );
   }

   private static int a(ex $$0, ji $$1) throws CommandSyntaxException {
      if (!($$0.f() instanceof bvh $$3)) {
         throw a.create();
      } else {
         cer $$4 = new ceq($$3, $$0.e());
         etl $$5 = $$4.a($$1, 0);
         agc.a($$0.e(), $$3, $$5, $$4.p());
         if ($$5 == null) {
            throw b.create();
         } else if (!$$5.j()) {
            throw c.create();
         } else {
            $$0.a(() -> wo.b("Made path"), true);
            return 1;
         }
      }
   }
}
