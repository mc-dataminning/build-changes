import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ano {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wu.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wu.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ee.a("target", eq.a())
                     .then(ee.a("mount").then(ee.a("vehicle", eq.a()).executes($$0x -> a((ed)$$0x.getSource(), eq.a($$0x, "target"), eq.a($$0x, "vehicle"))))))
                  .then(ee.a("dismount").executes($$0x -> a((ed)$$0x.getSource(), eq.a($$0x, "target"))))
            )
      );
   }

   private static int a(ed $$0, brh $$1, brh $$2) throws CommandSyntaxException {
      brh $$3 = $$1.da();
      if ($$3 != null) {
         throw b.create($$1.O_(), $$3.O_());
      } else if ($$2.ai() == brn.bx) {
         throw d.create();
      } else if ($$1.cS().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dN() != $$2.dN()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.O_(), $$2.O_());
      } else {
         $$0.a(() -> wu.a("commands.ride.mount.success", $$1.O_(), $$2.O_()), true);
         return 1;
      }
   }

   private static int a(ed $$0, brh $$1) throws CommandSyntaxException {
      brh $$2 = $$1.da();
      if ($$2 == null) {
         throw a.create($$1.O_());
      } else {
         $$1.ac();
         $$0.a(() -> wu.a("commands.ride.dismount.success", $$1.O_(), $$2.O_()), true);
         return 1;
      }
   }
}
