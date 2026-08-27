import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aog {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wi.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wi.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(dw.a("on").executes($$0x -> b((dv)$$0x.getSource()))))
                        .then(dw.a("off").executes($$0x -> c((dv)$$0x.getSource()))))
                     .then(dw.a("list").executes($$0x -> d((dv)$$0x.getSource()))))
                  .then(dw.a("add").then(dw.a("targets", ek.a()).suggests(($$0x, $$1) -> {
                     atr $$2 = ((dv)$$0x.getSource()).l().ah();
                     return ea.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.fY())).map($$0xx -> $$0xx.fY().getName()), $$1);
                  }).executes($$0x -> a((dv)$$0x.getSource(), ek.a($$0x, "targets"))))))
               .then(
                  dw.a("remove")
                     .then(
                        dw.a("targets", ek.a())
                           .suggests(($$0x, $$1) -> ea.a(((dv)$$0x.getSource()).l().ah().j(), $$1))
                           .executes($$0x -> b((dv)$$0x.getSource(), ek.a($$0x, "targets")))
                     )
               ))
            .then(dw.a("reload").executes($$0x -> a((dv)$$0x.getSource())))
      );
   }

   private static int a(dv $$0) {
      $$0.l().ah().a();
      $$0.a(() -> wi.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(dv $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      atz $$2 = $$0.l().ah().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            aua $$5 = new aua($$4);
            $$2.a($$5);
            $$0.a(() -> wi.a("commands.whitelist.add.success", wi.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(dv $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      atz $$2 = $$0.l().ah().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            aua $$5 = new aua($$4);
            $$2.b($$5);
            $$0.a(() -> wi.a("commands.whitelist.remove.success", wi.b($$4.getName())), true);
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

   private static int b(dv $$0) throws CommandSyntaxException {
      atr $$1 = $$0.l().ah();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> wi.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(dv $$0) throws CommandSyntaxException {
      atr $$1 = $$0.l().ah();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> wi.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(dv $$0) {
      String[] $$1 = $$0.l().ah().j();
      if ($$1.length == 0) {
         $$0.a(() -> wi.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> wi.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
