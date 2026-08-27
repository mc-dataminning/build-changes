import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ajf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tn.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tn.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tn.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(tn.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(du.a("on").executes($$0x -> b((dt)$$0x.getSource()))))
                        .then(du.a("off").executes($$0x -> c((dt)$$0x.getSource()))))
                     .then(du.a("list").executes($$0x -> d((dt)$$0x.getSource()))))
                  .then(du.a("add").then(du.a("targets", eg.a()).suggests(($$0x, $$1) -> {
                     aoi $$2 = ((dt)$$0x.getSource()).l().ac();
                     return dw.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.fQ())).map($$0xx -> $$0xx.fQ().getName()), $$1);
                  }).executes($$0x -> a((dt)$$0x.getSource(), eg.a($$0x, "targets"))))))
               .then(
                  du.a("remove")
                     .then(
                        du.a("targets", eg.a())
                           .suggests(($$0x, $$1) -> dw.a(((dt)$$0x.getSource()).l().ac().j(), $$1))
                           .executes($$0x -> b((dt)$$0x.getSource(), eg.a($$0x, "targets")))
                     )
               ))
            .then(du.a("reload").executes($$0x -> a((dt)$$0x.getSource())))
      );
   }

   private static int a(dt $$0) {
      $$0.l().ac().a();
      $$0.a(() -> tn.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(dt $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aoq $$2 = $$0.l().ac().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            aor $$5 = new aor($$4);
            $$2.a($$5);
            $$0.a(() -> tn.a("commands.whitelist.add.success", tn.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(dt $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aoq $$2 = $$0.l().ac().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            aor $$5 = new aor($$4);
            $$2.b($$5);
            $$0.a(() -> tn.a("commands.whitelist.remove.success", tn.b($$4.getName())), true);
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

   private static int b(dt $$0) throws CommandSyntaxException {
      aoi $$1 = $$0.l().ac();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> tn.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(dt $$0) throws CommandSyntaxException {
      aoi $$1 = $$0.l().ac();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> tn.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(dt $$0) {
      String[] $$1 = $$0.l().ac().j();
      if ($$1.length == 0) {
         $$0.a(() -> tn.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> tn.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
