import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class amn {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> vu.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> vu.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> vu.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vu.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vu.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(vu.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dv.a("target", eh.a())
                     .then(dv.a("mount").then(dv.a("vehicle", eh.a()).executes($$0x -> a((du)$$0x.getSource(), eh.a($$0x, "target"), eh.a($$0x, "vehicle"))))))
                  .then(dv.a("dismount").executes($$0x -> a((du)$$0x.getSource(), eh.a($$0x, "target"))))
            )
      );
   }

   private static int a(du $$0, bow $$1, bow $$2) throws CommandSyntaxException {
      bow $$3 = $$1.cZ();
      if ($$3 != null) {
         throw b.create($$1.O_(), $$3.O_());
      } else if ($$2.ai() == bpc.bx) {
         throw d.create();
      } else if ($$1.cR().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dM() != $$2.dM()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.O_(), $$2.O_());
      } else {
         $$0.a(() -> vu.a("commands.ride.mount.success", $$1.O_(), $$2.O_()), true);
         return 1;
      }
   }

   private static int a(du $$0, bow $$1) throws CommandSyntaxException {
      bow $$2 = $$1.cZ();
      if ($$2 == null) {
         throw a.create($$1.O_());
      } else {
         $$1.ac();
         $$0.a(() -> vu.a("commands.ride.dismount.success", $$1.O_(), $$2.O_()), true);
         return 1;
      }
   }
}
