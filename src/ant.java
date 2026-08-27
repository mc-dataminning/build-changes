import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ant {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> wx.b("commands.ride.not_riding", $$0));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("commands.ride.already_riding", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("commands.ride.mount.failure.generic", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wx.c("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wx.c("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wx.c("commands.ride.mount.failure.wrong_dimension"));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("ride").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ef.a("target", er.a())
                     .then(ef.a("mount").then(ef.a("vehicle", er.a()).executes($$0x -> a((ee)$$0x.getSource(), er.a($$0x, "target"), er.a($$0x, "vehicle"))))))
                  .then(ef.a("dismount").executes($$0x -> a((ee)$$0x.getSource(), er.a($$0x, "target"))))
            )
      );
   }

   private static int a(ee $$0, bru $$1, bru $$2) throws CommandSyntaxException {
      bru $$3 = $$1.dc();
      if ($$3 != null) {
         throw b.create($$1.O_(), $$3.O_());
      } else if ($$2.ak() == bsa.by) {
         throw d.create();
      } else if ($$1.cU().anyMatch($$1x -> $$1x == $$2)) {
         throw e.create();
      } else if ($$1.dP() != $$2.dP()) {
         throw f.create();
      } else if (!$$1.a($$2, true)) {
         throw c.create($$1.O_(), $$2.O_());
      } else {
         $$0.a(() -> wx.a("commands.ride.mount.success", $$1.O_(), $$2.O_()), true);
         return 1;
      }
   }

   private static int a(ee $$0, bru $$1) throws CommandSyntaxException {
      bru $$2 = $$1.dc();
      if ($$2 == null) {
         throw a.create($$1.O_());
      } else {
         $$1.ac();
         $$0.a(() -> wx.a("commands.ride.dismount.success", $$1.O_(), $$2.O_()), true);
         return 1;
      }
   }
}
