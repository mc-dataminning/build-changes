import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class apf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(ei.a("on").executes($$0x -> b((eh)$$0x.getSource()))))
                        .then(ei.a("off").executes($$0x -> c((eh)$$0x.getSource()))))
                     .then(ei.a("list").executes($$0x -> d((eh)$$0x.getSource()))))
                  .then(ei.a("add").then(ei.a("targets", ew.a()).suggests(($$0x, $$1) -> {
                     auq $$2 = ((eh)$$0x.getSource()).l().ah();
                     return em.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.gk())).map($$0xx -> $$0xx.gk().getName()), $$1);
                  }).executes($$0x -> a((eh)$$0x.getSource(), ew.a($$0x, "targets"))))))
               .then(
                  ei.a("remove")
                     .then(
                        ei.a("targets", ew.a())
                           .suggests(($$0x, $$1) -> em.a(((eh)$$0x.getSource()).l().ah().j(), $$1))
                           .executes($$0x -> b((eh)$$0x.getSource(), ew.a($$0x, "targets")))
                     )
               ))
            .then(ei.a("reload").executes($$0x -> a((eh)$$0x.getSource())))
      );
   }

   private static int a(eh $$0) {
      $$0.l().ah().a();
      $$0.a(() -> xe.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(eh $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      auz $$2 = $$0.l().ah().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            ava $$5 = new ava($$4);
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

   private static int b(eh $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      auz $$2 = $$0.l().ah().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            ava $$5 = new ava($$4);
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

   private static int b(eh $$0) throws CommandSyntaxException {
      auq $$1 = $$0.l().ah();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> xe.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(eh $$0) throws CommandSyntaxException {
      auq $$1 = $$0.l().ah();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> xe.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(eh $$0) {
      String[] $$1 = $$0.l().ah().j();
      if ($$1.length == 0) {
         $$0.a(() -> xe.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> xe.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
