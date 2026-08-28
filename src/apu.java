import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class apu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xh.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xh.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(ew.a("on").executes($$0x -> b((ev)$$0x.getSource()))))
                        .then(ew.a("off").executes($$0x -> c((ev)$$0x.getSource()))))
                     .then(ew.a("list").executes($$0x -> d((ev)$$0x.getSource()))))
                  .then(ew.a("add").then(ew.a("targets", fk.a()).suggests(($$0x, $$1) -> {
                     avn $$2 = ((ev)$$0x.getSource()).l().ag();
                     return fa.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.gj())).map($$0xx -> $$0xx.gj().getName()), $$1);
                  }).executes($$0x -> a((ev)$$0x.getSource(), fk.a($$0x, "targets"))))))
               .then(
                  ew.a("remove")
                     .then(
                        ew.a("targets", fk.a())
                           .suggests(($$0x, $$1) -> fa.a(((ev)$$0x.getSource()).l().ag().j(), $$1))
                           .executes($$0x -> b((ev)$$0x.getSource(), fk.a($$0x, "targets")))
                     )
               ))
            .then(ew.a("reload").executes($$0x -> a((ev)$$0x.getSource())))
      );
   }

   private static int a(ev $$0) {
      $$0.l().ag().a();
      $$0.a(() -> xh.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(ev $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avv $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            avw $$5 = new avw($$4);
            $$2.a($$5);
            $$0.a(() -> xh.a("commands.whitelist.add.success", xh.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(ev $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avv $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            avw $$5 = new avw($$4);
            $$2.b($$5);
            $$0.a(() -> xh.a("commands.whitelist.remove.success", xh.b($$4.getName())), true);
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

   private static int b(ev $$0) throws CommandSyntaxException {
      avn $$1 = $$0.l().ag();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> xh.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(ev $$0) throws CommandSyntaxException {
      avn $$1 = $$0.l().ag();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> xh.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(ev $$0) {
      String[] $$1 = $$0.l().ag().j();
      if ($$1.length == 0) {
         $$0.a(() -> xh.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> xh.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
