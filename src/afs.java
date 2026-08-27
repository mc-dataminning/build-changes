import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class afs {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> sw.a("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(sw.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(sw.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(sw.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dt.a("target", ec.a())
                     .then(dt.a("mount").then(dt.a("vehicle", ec.a()).executes($$0x -> a((ds)$$0x.getSource(), ec.a($$0x, "target"), ec.a($$0x, "vehicle"))))))
                  .then(dt.a("dismount").executes($$0x -> a((ds)$$0x.getSource(), ec.a($$0x, "target"))))
            )
      );
   }

   private static int a(ds $$0, bfj $$1, bfj $$2) throws CommandSyntaxException {
      bfj $$3 = $$1.cW();
      if ($$3 != null) {
         throw b.create($$1.H_(), $$3.H_());
      } else if ($$2.ae() == bfn.bt) {
         throw d.create();
      } else if ($$1.cP().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dI() != $$2.dI()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.H_(), $$2.H_());
      } else {
         $$0.a(() -> sw.a("commands.ride.mount.success", $$1.H_(), $$2.H_()), true);
         return 1;
      }
   }

   private static int a(ds $$0, bfj $$1) throws CommandSyntaxException {
      bfj $$2 = $$1.cW();
      if ($$2 == null) {
         throw a.create($$1.H_());
      } else {
         $$1.Y();
         $$0.a(() -> sw.a("commands.ride.dismount.success", $$1.H_(), $$2.H_()), true);
         return 1;
      }
   }
}
