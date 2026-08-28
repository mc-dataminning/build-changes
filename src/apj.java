import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class apj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wp.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wp.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(ey.a("on").executes($$0x -> b((ex)$$0x.getSource()))))
                        .then(ey.a("off").executes($$0x -> c((ex)$$0x.getSource()))))
                     .then(ey.a("list").executes($$0x -> d((ex)$$0x.getSource()))))
                  .then(ey.a("add").then(ey.a("targets", fm.a()).suggests(($$0x, $$1) -> {
                     avd $$2 = ((ex)$$0x.getSource()).l().ag();
                     return fc.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.gk())).map($$0xx -> $$0xx.gk().getName()), $$1);
                  }).executes($$0x -> a((ex)$$0x.getSource(), fm.a($$0x, "targets"))))))
               .then(
                  ey.a("remove")
                     .then(
                        ey.a("targets", fm.a())
                           .suggests(($$0x, $$1) -> fc.a(((ex)$$0x.getSource()).l().ag().j(), $$1))
                           .executes($$0x -> b((ex)$$0x.getSource(), fm.a($$0x, "targets")))
                     )
               ))
            .then(ey.a("reload").executes($$0x -> a((ex)$$0x.getSource())))
      );
   }

   private static int a(ex $$0) {
      $$0.l().ag().a();
      $$0.a(() -> wp.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(ex $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avl $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            avm $$5 = new avm($$4);
            $$2.a($$5);
            $$0.a(() -> wp.a("commands.whitelist.add.success", wp.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(ex $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avl $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            avm $$5 = new avm($$4);
            $$2.b($$5);
            $$0.a(() -> wp.a("commands.whitelist.remove.success", wp.b($$4.getName())), true);
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

   private static int b(ex $$0) throws CommandSyntaxException {
      avd $$1 = $$0.l().ag();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> wp.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(ex $$0) throws CommandSyntaxException {
      avd $$1 = $$0.l().ag();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> wp.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(ex $$0) {
      String[] $$1 = $$0.l().ag().j();
      if ($$1.length == 0) {
         $$0.a(() -> wp.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> wp.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
