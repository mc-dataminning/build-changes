import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ahz {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ti.a("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> ti.a("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> ti.a("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ti.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ti.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(ti.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)du.a("target", ee.a())
                     .then(du.a("mount").then(du.a("vehicle", ee.a()).executes($$0x -> a((dt)$$0x.getSource(), ee.a($$0x, "target"), ee.a($$0x, "vehicle"))))))
                  .then(du.a("dismount").executes($$0x -> a((dt)$$0x.getSource(), ee.a($$0x, "target"))))
            )
      );
   }

   private static int a(dt $$0, bil $$1, bil $$2) throws CommandSyntaxException {
      bil $$3 = $$1.cY();
      if ($$3 != null) {
         throw b.create($$1.H_(), $$3.H_());
      } else if ($$2.ag() == bip.bt) {
         throw d.create();
      } else if ($$1.cR().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dK() != $$2.dK()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.H_(), $$2.H_());
      } else {
         $$0.a(() -> ti.a("commands.ride.mount.success", $$1.H_(), $$2.H_()), true);
         return 1;
      }
   }

   private static int a(dt $$0, bil $$1) throws CommandSyntaxException {
      bil $$2 = $$1.cY();
      if ($$2 == null) {
         throw a.create($$1.H_());
      } else {
         $$1.aa();
         $$0.a(() -> ti.a("commands.ride.dismount.success", $$1.H_(), $$2.H_()), true);
         return 1;
      }
   }
}
