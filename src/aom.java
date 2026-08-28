import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aom {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xp.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xp.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xp.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xp.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xp.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xp.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)eq.a("target", fc.a())
                     .then(eq.a("mount").then(eq.a("vehicle", fc.a()).executes($$0x -> a((ep)$$0x.getSource(), fc.a($$0x, "target"), fc.a($$0x, "vehicle"))))))
                  .then(eq.a("dismount").executes($$0x -> a((ep)$$0x.getSource(), fc.a($$0x, "target"))))
            )
      );
   }

   private static int a(ep $$0, bsw $$1, bsw $$2) throws CommandSyntaxException {
      bsw $$3 = $$1.dc();
      if ($$3 != null) {
         throw b.create($$1.O_(), $$3.O_());
      } else if ($$2.ak() == btc.by) {
         throw d.create();
      } else if ($$1.cU().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dP() != $$2.dP()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.O_(), $$2.O_());
      } else {
         $$0.a(() -> xp.a("commands.ride.mount.success", $$1.O_(), $$2.O_()), true);
         return 1;
      }
   }

   private static int a(ep $$0, bsw $$1) throws CommandSyntaxException {
      bsw $$2 = $$1.dc();
      if ($$2 == null) {
         throw a.create($$1.O_());
      } else {
         $$1.ac();
         $$0.a(() -> xp.a("commands.ride.dismount.success", $$1.O_(), $$2.O_()), true);
         return 1;
      }
   }
}
