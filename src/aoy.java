import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aoy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wx.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wx.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(ef.a("on").executes($$0x -> b((ee)$$0x.getSource()))))
                        .then(ef.a("off").executes($$0x -> c((ee)$$0x.getSource()))))
                     .then(ef.a("list").executes($$0x -> d((ee)$$0x.getSource()))))
                  .then(ef.a("add").then(ef.a("targets", et.a()).suggests(($$0x, $$1) -> {
                     auj $$2 = ((ee)$$0x.getSource()).l().ah();
                     return ej.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.gb())).map($$0xx -> $$0xx.gb().getName()), $$1);
                  }).executes($$0x -> a((ee)$$0x.getSource(), et.a($$0x, "targets"))))))
               .then(
                  ef.a("remove")
                     .then(
                        ef.a("targets", et.a())
                           .suggests(($$0x, $$1) -> ej.a(((ee)$$0x.getSource()).l().ah().j(), $$1))
                           .executes($$0x -> b((ee)$$0x.getSource(), et.a($$0x, "targets")))
                     )
               ))
            .then(ef.a("reload").executes($$0x -> a((ee)$$0x.getSource())))
      );
   }

   private static int a(ee $$0) {
      $$0.l().ah().a();
      $$0.a(() -> wx.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(ee $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aur $$2 = $$0.l().ah().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            aus $$5 = new aus($$4);
            $$2.a($$5);
            $$0.a(() -> wx.a("commands.whitelist.add.success", wx.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(ee $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aur $$2 = $$0.l().ah().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            aus $$5 = new aus($$4);
            $$2.b($$5);
            $$0.a(() -> wx.a("commands.whitelist.remove.success", wx.b($$4.getName())), true);
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

   private static int b(ee $$0) throws CommandSyntaxException {
      auj $$1 = $$0.l().ah();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> wx.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(ee $$0) throws CommandSyntaxException {
      auj $$1 = $$0.l().ah();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> wx.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(ee $$0) {
      String[] $$1 = $$0.l().ah().j();
      if ($$1.length == 0) {
         $$0.a(() -> wx.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> wx.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
