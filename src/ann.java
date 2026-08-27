import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ann {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vs.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vs.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vs.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vs.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(dv.a("on").executes($$0x -> b((du)$$0x.getSource()))))
                        .then(dv.a("off").executes($$0x -> c((du)$$0x.getSource()))))
                     .then(dv.a("list").executes($$0x -> d((du)$$0x.getSource()))))
                  .then(dv.a("add").then(dv.a("targets", ej.a()).suggests(($$0x, $$1) -> {
                     ass $$2 = ((du)$$0x.getSource()).l().ah();
                     return dz.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.fU())).map($$0xx -> $$0xx.fU().getName()), $$1);
                  }).executes($$0x -> a((du)$$0x.getSource(), ej.a($$0x, "targets"))))))
               .then(
                  dv.a("remove")
                     .then(
                        dv.a("targets", ej.a())
                           .suggests(($$0x, $$1) -> dz.a(((du)$$0x.getSource()).l().ah().j(), $$1))
                           .executes($$0x -> b((du)$$0x.getSource(), ej.a($$0x, "targets")))
                     )
               ))
            .then(dv.a("reload").executes($$0x -> a((du)$$0x.getSource())))
      );
   }

   private static int a(du $$0) {
      $$0.l().ah().a();
      $$0.a(() -> vs.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(du $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      ata $$2 = $$0.l().ah().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            atb $$5 = new atb($$4);
            $$2.a($$5);
            $$0.a(() -> vs.a("commands.whitelist.add.success", vs.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(du $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      ata $$2 = $$0.l().ah().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            atb $$5 = new atb($$4);
            $$2.b($$5);
            $$0.a(() -> vs.a("commands.whitelist.remove.success", vs.b($$4.getName())), true);
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

   private static int b(du $$0) throws CommandSyntaxException {
      ass $$1 = $$0.l().ah();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> vs.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(du $$0) throws CommandSyntaxException {
      ass $$1 = $$0.l().ah();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> vs.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(du $$0) {
      String[] $$1 = $$0.l().ah().j();
      if ($$1.length == 0) {
         $$0.a(() -> vs.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> vs.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
