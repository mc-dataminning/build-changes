import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class apd {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wz.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wz.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wz.c("commands.whitelist.remove.failed"));

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
                     aur $$2 = ((et)$$0x.getSource()).l().ah();
                     return ey.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.fY())).map($$0xx -> $$0xx.fY().getName()), $$1);
                  }).executes($$0x -> a((et)$$0x.getSource(), fi.a($$0x, "targets"))))))
               .then(
                  eu.a("remove")
                     .then(
                        eu.a("targets", fi.a())
                           .suggests(($$0x, $$1) -> ey.a(((et)$$0x.getSource()).l().ah().j(), $$1))
                           .executes($$0x -> b((et)$$0x.getSource(), fi.a($$0x, "targets")))
                     )
               ))
            .then(eu.a("reload").executes($$0x -> a((et)$$0x.getSource())))
      );
   }

   private static int a(et $$0) {
      $$0.l().ah().a();
      $$0.a(() -> wz.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(et $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      ava $$2 = $$0.l().ah().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            avb $$5 = new avb($$4);
            $$2.a($$5);
            $$0.a(() -> wz.a("commands.whitelist.add.success", wz.b($$4.getName())), true);
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
      ava $$2 = $$0.l().ah().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            avb $$5 = new avb($$4);
            $$2.b($$5);
            $$0.a(() -> wz.a("commands.whitelist.remove.success", wz.b($$4.getName())), true);
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
      aur $$1 = $$0.l().ah();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> wz.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(et $$0) throws CommandSyntaxException {
      aur $$1 = $$0.l().ah();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> wz.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(et $$0) {
      String[] $$1 = $$0.l().ah().j();
      if ($$1.length == 0) {
         $$0.a(() -> wz.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> wz.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
