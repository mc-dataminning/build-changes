import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aom {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xe.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xe.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xe.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ev.a("target", fh.a())
                     .then(ev.a("mount").then(ev.a("vehicle", fh.a()).executes($$0x -> a((eu)$$0x.getSource(), fh.a($$0x, "target"), fh.a($$0x, "vehicle"))))))
                  .then(ev.a("dismount").executes($$0x -> a((eu)$$0x.getSource(), fh.a($$0x, "target"))))
            )
      );
   }

   private static int a(eu $$0, btr $$1, btr $$2) throws CommandSyntaxException {
      btr $$3 = $$1.dg();
      if ($$3 != null) {
         throw b.create($$1.R_(), $$3.R_());
      } else if ($$2.ao() == bty.by) {
         throw d.create();
      } else if ($$1.cY().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dS() != $$2.dS()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.R_(), $$2.R_());
      } else {
         $$0.a(() -> xe.a("commands.ride.mount.success", $$1.R_(), $$2.R_()), true);
         return 1;
      }
   }

   private static int a(eu $$0, btr $$1) throws CommandSyntaxException {
      btr $$2 = $$1.dg();
      if ($$2 == null) {
         throw a.create($$1.R_());
      } else {
         $$1.af();
         $$0.a(() -> xe.a("commands.ride.dismount.success", $$1.R_(), $$2.R_()), true);
         return 1;
      }
   }
}
