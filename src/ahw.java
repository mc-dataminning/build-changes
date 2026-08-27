import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ahw {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> tf.a("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> tf.a("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> tf.a("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(tf.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(tf.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(tf.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ds.a("target", ec.a())
                     .then(ds.a("mount").then(ds.a("vehicle", ec.a()).executes($$0x -> a((dr)$$0x.getSource(), ec.a($$0x, "target"), ec.a($$0x, "vehicle"))))))
                  .then(ds.a("dismount").executes($$0x -> a((dr)$$0x.getSource(), ec.a($$0x, "target"))))
            )
      );
   }

   private static int a(dr $$0, bii $$1, bii $$2) throws CommandSyntaxException {
      bii $$3 = $$1.cY();
      if ($$3 != null) {
         throw b.create($$1.H_(), $$3.H_());
      } else if ($$2.ag() == bim.bt) {
         throw d.create();
      } else if ($$1.cR().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dK() != $$2.dK()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.H_(), $$2.H_());
      } else {
         $$0.a(() -> tf.a("commands.ride.mount.success", $$1.H_(), $$2.H_()), true);
         return 1;
      }
   }

   private static int a(dr $$0, bii $$1) throws CommandSyntaxException {
      bii $$2 = $$1.cY();
      if ($$2 == null) {
         throw a.create($$1.H_());
      } else {
         $$1.aa();
         $$0.a(() -> tf.a("commands.ride.dismount.success", $$1.H_(), $$2.H_()), true);
         return 1;
      }
   }
}
