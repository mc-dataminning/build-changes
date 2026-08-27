import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ajo {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> ur.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> ur.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> ur.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ur.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ur.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(ur.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dv.a("target", eg.a())
                     .then(dv.a("mount").then(dv.a("vehicle", eg.a()).executes($$0x -> a((du)$$0x.getSource(), eg.a($$0x, "target"), eg.a($$0x, "vehicle"))))))
                  .then(dv.a("dismount").executes($$0x -> a((du)$$0x.getSource(), eg.a($$0x, "target"))))
            )
      );
   }

   private static int a(du $$0, bkq $$1, bkq $$2) throws CommandSyntaxException {
      bkq $$3 = $$1.da();
      if ($$3 != null) {
         throw b.create($$1.P_(), $$3.P_());
      } else if ($$2.ai() == bku.bt) {
         throw d.create();
      } else if ($$1.cS().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dN() != $$2.dN()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.P_(), $$2.P_());
      } else {
         $$0.a(() -> ur.a("commands.ride.mount.success", $$1.P_(), $$2.P_()), true);
         return 1;
      }
   }

   private static int a(du $$0, bkq $$1) throws CommandSyntaxException {
      bkq $$2 = $$1.da();
      if ($$2 == null) {
         throw a.create($$1.P_());
      } else {
         $$1.ac();
         $$0.a(() -> ur.a("commands.ride.dismount.success", $$1.P_(), $$2.P_()), true);
         return 1;
      }
   }
}
