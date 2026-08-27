import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class akn {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vg.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> vg.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> vg.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vg.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vg.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(vg.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dt.a("target", ef.a())
                     .then(dt.a("mount").then(dt.a("vehicle", ef.a()).executes($$0x -> a((ds)$$0x.getSource(), ef.a($$0x, "target"), ef.a($$0x, "vehicle"))))))
                  .then(dt.a("dismount").executes($$0x -> a((ds)$$0x.getSource(), ef.a($$0x, "target"))))
            )
      );
   }

   private static int a(ds $$0, blw $$1, blw $$2) throws CommandSyntaxException {
      blw $$3 = $$1.cZ();
      if ($$3 != null) {
         throw b.create($$1.Q_(), $$3.Q_());
      } else if ($$2.ai() == bmc.bw) {
         throw d.create();
      } else if ($$1.cR().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dL() != $$2.dL()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.Q_(), $$2.Q_());
      } else {
         $$0.a(() -> vg.a("commands.ride.mount.success", $$1.Q_(), $$2.Q_()), true);
         return 1;
      }
   }

   private static int a(ds $$0, blw $$1) throws CommandSyntaxException {
      blw $$2 = $$1.cZ();
      if ($$2 == null) {
         throw a.create($$1.Q_());
      } else {
         $$1.ac();
         $$0.a(() -> vg.a("commands.ride.dismount.success", $$1.Q_(), $$2.Q_()), true);
         return 1;
      }
   }
}
