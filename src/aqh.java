import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aqh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xg.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xg.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(el.a("on").executes($$0x -> b((ek)$$0x.getSource()))))
                        .then(el.a("off").executes($$0x -> c((ek)$$0x.getSource()))))
                     .then(el.a("list").executes($$0x -> d((ek)$$0x.getSource()))))
                  .then(el.a("add").then(el.a("targets", ez.a()).suggests(($$0x, $$1) -> {
                     awb $$2 = ((ek)$$0x.getSource()).l().ag();
                     return ep.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.gi())).map($$0xx -> $$0xx.gi().getName()), $$1);
                  }).executes($$0x -> a((ek)$$0x.getSource(), ez.a($$0x, "targets"))))))
               .then(
                  el.a("remove")
                     .then(
                        el.a("targets", ez.a())
                           .suggests(($$0x, $$1) -> ep.a(((ek)$$0x.getSource()).l().ag().j(), $$1))
                           .executes($$0x -> b((ek)$$0x.getSource(), ez.a($$0x, "targets")))
                     )
               ))
            .then(el.a("reload").executes($$0x -> a((ek)$$0x.getSource())))
      );
   }

   private static int a(ek $$0) {
      $$0.l().ag().a();
      $$0.a(() -> xg.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(ek $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      awj $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            awk $$5 = new awk($$4);
            $$2.a($$5);
            $$0.a(() -> xg.a("commands.whitelist.add.success", xg.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(ek $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      awj $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            awk $$5 = new awk($$4);
            $$2.b($$5);
            $$0.a(() -> xg.a("commands.whitelist.remove.success", xg.b($$4.getName())), true);
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

   private static int b(ek $$0) throws CommandSyntaxException {
      awb $$1 = $$0.l().ag();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> xg.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(ek $$0) throws CommandSyntaxException {
      awb $$1 = $$0.l().ag();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> xg.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(ek $$0) {
      String[] $$1 = $$0.l().ag().j();
      if ($$1.length == 0) {
         $$0.a(() -> xg.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> xg.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
