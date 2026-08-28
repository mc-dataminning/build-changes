import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aor {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xj.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xj.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xj.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xj.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xj.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xj.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ex.a("target", fj.a())
                     .then(ex.a("mount").then(ex.a("vehicle", fj.a()).executes($$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"), fj.a($$0x, "vehicle"))))))
                  .then(ex.a("dismount").executes($$0x -> a((ew)$$0x.getSource(), fj.a($$0x, "target"))))
            )
      );
   }

   private static int a(ew $$0, bul $$1, bul $$2) throws CommandSyntaxException {
      bul $$3 = $$1.dk();
      if ($$3 != null) {
         throw b.create($$1.o_(), $$3.o_());
      } else if ($$2.aq() == bus.bO) {
         throw d.create();
      } else if ($$1.db().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dV() != $$2.dV()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.o_(), $$2.o_());
      } else {
         $$0.a(() -> xj.a("commands.ride.mount.success", $$1.o_(), $$2.o_()), true);
         return 1;
      }
   }

   private static int a(ew $$0, bul $$1) throws CommandSyntaxException {
      bul $$2 = $$1.dk();
      if ($$2 == null) {
         throw a.create($$1.o_());
      } else {
         $$1.ae();
         $$0.a(() -> xj.a("commands.ride.dismount.success", $$1.o_(), $$2.o_()), true);
         return 1;
      }
   }
}
