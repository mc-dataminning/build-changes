import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class apr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(ev.a("on").executes($$0x -> b((eu)$$0x.getSource()))))
                        .then(ev.a("off").executes($$0x -> c((eu)$$0x.getSource()))))
                     .then(ev.a("list").executes($$0x -> d((eu)$$0x.getSource()))))
                  .then(ev.a("add").then(ev.a("targets", fj.a()).suggests(($$0x, $$1) -> {
                     avj $$2 = ((eu)$$0x.getSource()).l().ag();
                     return ez.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.gc())).map($$0xx -> $$0xx.gc().getName()), $$1);
                  }).executes($$0x -> a((eu)$$0x.getSource(), fj.a($$0x, "targets"))))))
               .then(
                  ev.a("remove")
                     .then(
                        ev.a("targets", fj.a())
                           .suggests(($$0x, $$1) -> ez.a(((eu)$$0x.getSource()).l().ag().j(), $$1))
                           .executes($$0x -> b((eu)$$0x.getSource(), fj.a($$0x, "targets")))
                     )
               ))
            .then(ev.a("reload").executes($$0x -> a((eu)$$0x.getSource())))
      );
   }

   private static int a(eu $$0) {
      $$0.l().ag().a();
      $$0.a(() -> xe.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(eu $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avr $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            avs $$5 = new avs($$4);
            $$2.a($$5);
            $$0.a(() -> xe.a("commands.whitelist.add.success", xe.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(eu $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avr $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            avs $$5 = new avs($$4);
            $$2.b($$5);
            $$0.a(() -> xe.a("commands.whitelist.remove.success", xe.b($$4.getName())), true);
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

   private static int b(eu $$0) throws CommandSyntaxException {
      avj $$1 = $$0.l().ag();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> xe.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(eu $$0) throws CommandSyntaxException {
      avj $$1 = $$0.l().ag();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> xe.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(eu $$0) {
      String[] $$1 = $$0.l().ag().j();
      if ($$1.length == 0) {
         $$0.a(() -> xe.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> xe.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
