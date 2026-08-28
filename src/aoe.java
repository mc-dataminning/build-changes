import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aoe {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wp.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wp.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wp.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wp.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ey.a("target", fk.a())
                     .then(ey.a("mount").then(ey.a("vehicle", fk.a()).executes($$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"), fk.a($$0x, "vehicle"))))))
                  .then(ey.a("dismount").executes($$0x -> a((ex)$$0x.getSource(), fk.a($$0x, "target"))))
            )
      );
   }

   private static int a(ex $$0, buk $$1, buk $$2) throws CommandSyntaxException {
      buk $$3 = $$1.dk();
      if ($$3 != null) {
         throw b.create($$1.p_(), $$3.p_());
      } else if ($$2.aq() == bur.bR) {
         throw d.create();
      } else if ($$1.da().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dV() != $$2.dV()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.p_(), $$2.p_());
      } else {
         $$0.a(() -> wp.a("commands.ride.mount.success", $$1.p_(), $$2.p_()), true);
         return 1;
      }
   }

   private static int a(ex $$0, buk $$1) throws CommandSyntaxException {
      buk $$2 = $$1.dk();
      if ($$2 == null) {
         throw a.create($$1.p_());
      } else {
         $$1.ae();
         $$0.a(() -> wp.a("commands.ride.dismount.success", $$1.p_(), $$2.p_()), true);
         return 1;
      }
   }
}
