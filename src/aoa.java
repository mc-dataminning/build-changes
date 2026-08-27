import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aoa {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xe.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xe.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ei.a("target", eu.a())
                     .then(ei.a("mount").then(ei.a("vehicle", eu.a()).executes($$0x -> a((eh)$$0x.getSource(), eu.a($$0x, "target"), eu.a($$0x, "vehicle"))))))
                  .then(ei.a("dismount").executes($$0x -> a((eh)$$0x.getSource(), eu.a($$0x, "target"))))
            )
      );
   }

   private static int a(eh $$0, brv $$1, brv $$2) throws CommandSyntaxException {
      brv $$3 = $$1.dh();
      if ($$3 != null) {
         throw b.create($$1.P_(), $$3.P_());
      } else if ($$2.ak() == bsb.bE) {
         throw d.create();
      } else if ($$1.cZ().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dU() != $$2.dU()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.P_(), $$2.P_());
      } else {
         $$0.a(() -> xe.a("commands.ride.mount.success", $$1.P_(), $$2.P_()), true);
         return 1;
      }
   }

   private static int a(eh $$0, brv $$1) throws CommandSyntaxException {
      brv $$2 = $$1.dh();
      if ($$2 == null) {
         throw a.create($$1.P_());
      } else {
         $$1.ae();
         $$0.a(() -> xe.a("commands.ride.dismount.success", $$1.P_(), $$2.P_()), true);
         return 1;
      }
   }
}
