import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class apw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wy.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(ek.a("on").executes($$0x -> b((ej)$$0x.getSource()))))
                        .then(ek.a("off").executes($$0x -> c((ej)$$0x.getSource()))))
                     .then(ek.a("list").executes($$0x -> d((ej)$$0x.getSource()))))
                  .then(ek.a("add").then(ek.a("targets", ey.a()).suggests(($$0x, $$1) -> {
                     avq $$2 = ((ej)$$0x.getSource()).l().ag();
                     return eo.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.gh())).map($$0xx -> $$0xx.gh().getName()), $$1);
                  }).executes($$0x -> a((ej)$$0x.getSource(), ey.a($$0x, "targets"))))))
               .then(
                  ek.a("remove")
                     .then(
                        ek.a("targets", ey.a())
                           .suggests(($$0x, $$1) -> eo.a(((ej)$$0x.getSource()).l().ag().j(), $$1))
                           .executes($$0x -> b((ej)$$0x.getSource(), ey.a($$0x, "targets")))
                     )
               ))
            .then(ek.a("reload").executes($$0x -> a((ej)$$0x.getSource())))
      );
   }

   private static int a(ej $$0) {
      $$0.l().ag().a();
      $$0.a(() -> wy.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(ej $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avy $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            avz $$5 = new avz($$4);
            $$2.a($$5);
            $$0.a(() -> wy.a("commands.whitelist.add.success", wy.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(ej $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avy $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            avz $$5 = new avz($$4);
            $$2.b($$5);
            $$0.a(() -> wy.a("commands.whitelist.remove.success", wy.b($$4.getName())), true);
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

   private static int b(ej $$0) throws CommandSyntaxException {
      avq $$1 = $$0.l().ag();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> wy.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(ej $$0) throws CommandSyntaxException {
      avq $$1 = $$0.l().ag();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> wy.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(ej $$0) {
      String[] $$1 = $$0.l().ag().j();
      if ($$1.length == 0) {
         $$0.a(() -> wy.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> wy.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
