import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class anl {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ws.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> ws.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> ws.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ws.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ws.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(ws.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ed.a("target", ep.a())
                     .then(ed.a("mount").then(ed.a("vehicle", ep.a()).executes($$0x -> a((ec)$$0x.getSource(), ep.a($$0x, "target"), ep.a($$0x, "vehicle"))))))
                  .then(ed.a("dismount").executes($$0x -> a((ec)$$0x.getSource(), ep.a($$0x, "target"))))
            )
      );
   }

   private static int a(ec $$0, bql $$1, bql $$2) throws CommandSyntaxException {
      bql $$3 = $$1.da();
      if ($$3 != null) {
         throw b.create($$1.O_(), $$3.O_());
      } else if ($$2.ai() == bqr.bx) {
         throw d.create();
      } else if ($$1.cS().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dN() != $$2.dN()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.O_(), $$2.O_());
      } else {
         $$0.a(() -> ws.a("commands.ride.mount.success", $$1.O_(), $$2.O_()), true);
         return 1;
      }
   }

   private static int a(ec $$0, bql $$1) throws CommandSyntaxException {
      bql $$2 = $$1.da();
      if ($$2 == null) {
         throw a.create($$1.O_());
      } else {
         $$1.ac();
         $$0.a(() -> ws.a("commands.ride.dismount.success", $$1.O_(), $$2.O_()), true);
         return 1;
      }
   }
}
