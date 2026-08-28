import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aop {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xh.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xh.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xh.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xh.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ew.a("target", fi.a())
                     .then(ew.a("mount").then(ew.a("vehicle", fi.a()).executes($$0x -> a((ev)$$0x.getSource(), fi.a($$0x, "target"), fi.a($$0x, "vehicle"))))))
                  .then(ew.a("dismount").executes($$0x -> a((ev)$$0x.getSource(), fi.a($$0x, "target"))))
            )
      );
   }

   private static int a(ev $$0, btz $$1, btz $$2) throws CommandSyntaxException {
      btz $$3 = $$1.dl();
      if ($$3 != null) {
         throw b.create($$1.S_(), $$3.S_());
      } else if ($$2.aq() == bug.by) {
         throw d.create();
      } else if ($$1.dc().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dX() != $$2.dX()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.S_(), $$2.S_());
      } else {
         $$0.a(() -> xh.a("commands.ride.mount.success", $$1.S_(), $$2.S_()), true);
         return 1;
      }
   }

   private static int a(ev $$0, btz $$1) throws CommandSyntaxException {
      btz $$2 = $$1.dl();
      if ($$2 == null) {
         throw a.create($$1.S_());
      } else {
         $$1.af();
         $$0.a(() -> xh.a("commands.ride.dismount.success", $$1.S_(), $$2.S_()), true);
         return 1;
      }
   }
}
