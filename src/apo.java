import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class apo {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xd.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xd.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(eu.a("on").executes($$0x -> b((et)$$0x.getSource()))))
                        .then(eu.a("off").executes($$0x -> c((et)$$0x.getSource()))))
                     .then(eu.a("list").executes($$0x -> d((et)$$0x.getSource()))))
                  .then(eu.a("add").then(eu.a("targets", fi.a()).suggests(($$0x, $$1) -> {
                     avg $$2 = ((et)$$0x.getSource()).l().ag();
                     return ey.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.gb())).map($$0xx -> $$0xx.gb().getName()), $$1);
                  }).executes($$0x -> a((et)$$0x.getSource(), fi.a($$0x, "targets"))))))
               .then(
                  eu.a("remove")
                     .then(
                        eu.a("targets", fi.a())
                           .suggests(($$0x, $$1) -> ey.a(((et)$$0x.getSource()).l().ag().j(), $$1))
                           .executes($$0x -> b((et)$$0x.getSource(), fi.a($$0x, "targets")))
                     )
               ))
            .then(eu.a("reload").executes($$0x -> a((et)$$0x.getSource())))
      );
   }

   private static int a(et $$0) {
      $$0.l().ag().a();
      $$0.a(() -> xd.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(et $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avo $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            avp $$5 = new avp($$4);
            $$2.a($$5);
            $$0.a(() -> xd.a("commands.whitelist.add.success", xd.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(et $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avo $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            avp $$5 = new avp($$4);
            $$2.b($$5);
            $$0.a(() -> xd.a("commands.whitelist.remove.success", xd.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw d.create();
      } else {
         $$0.l().a($$0);
         return $$3;
      }
   }

   private static int b(et $$0) throws CommandSyntaxException {
      avg $$1 = $$0.l().ag();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> xd.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(et $$0) throws CommandSyntaxException {
      avg $$1 = $$0.l().ag();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> xd.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(et $$0) {
      String[] $$1 = $$0.l().ag().j();
      if ($$1.length == 0) {
         $$0.a(() -> xd.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> xd.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
