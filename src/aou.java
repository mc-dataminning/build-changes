import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aou {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> xc.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xc.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xc.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xc.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xc.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xc.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)el.a("target", ex.a())
                     .then(el.a("mount").then(el.a("vehicle", ex.a()).executes($$0x -> a((ek)$$0x.getSource(), ex.a($$0x, "target"), ex.a($$0x, "vehicle"))))))
                  .then(el.a("dismount").executes($$0x -> a((ek)$$0x.getSource(), ex.a($$0x, "target"))))
            )
      );
   }

   private static int a(ek $$0, bwv $$1, bwv $$2) throws CommandSyntaxException {
      bwv $$3 = $$1.dk();
      if ($$3 != null) {
         throw b.create($$1.m_(), $$3.m_());
      } else if ($$2.an() == bxe.bT) {
         throw d.create();
      } else if ($$1.da().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dV() != $$2.dV()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.m_(), $$2.m_());
      } else {
         $$0.a(() -> xc.a("commands.ride.mount.success", $$1.m_(), $$2.m_()), true);
         return 1;
      }
   }

   private static int a(ek $$0, bwv $$1) throws CommandSyntaxException {
      bwv $$2 = $$1.dk();
      if ($$2 == null) {
         throw a.create($$1.m_());
      } else {
         $$1.bO();
         $$0.a(() -> xc.a("commands.ride.dismount.success", $$1.m_(), $$2.m_()), true);
         return 1;
      }
   }
}
