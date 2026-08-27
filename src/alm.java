import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class alm {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vd.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vd.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vd.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vd.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(dt.a("on").executes($$0x -> b((ds)$$0x.getSource()))))
                        .then(dt.a("off").executes($$0x -> c((ds)$$0x.getSource()))))
                     .then(dt.a("list").executes($$0x -> d((ds)$$0x.getSource()))))
                  .then(dt.a("add").then(dt.a("targets", eh.a()).suggests(($$0x, $$1) -> {
                     aqp $$2 = ((ds)$$0x.getSource()).l().ae();
                     return dx.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.fR())).map($$0xx -> $$0xx.fR().getName()), $$1);
                  }).executes($$0x -> a((ds)$$0x.getSource(), eh.a($$0x, "targets"))))))
               .then(
                  dt.a("remove")
                     .then(
                        dt.a("targets", eh.a())
                           .suggests(($$0x, $$1) -> dx.a(((ds)$$0x.getSource()).l().ae().j(), $$1))
                           .executes($$0x -> b((ds)$$0x.getSource(), eh.a($$0x, "targets")))
                     )
               ))
            .then(dt.a("reload").executes($$0x -> a((ds)$$0x.getSource())))
      );
   }

   private static int a(ds $$0) {
      $$0.l().ae().a();
      $$0.a(() -> vd.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(ds $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aqx $$2 = $$0.l().ae().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            aqy $$5 = new aqy($$4);
            $$2.a($$5);
            $$0.a(() -> vd.a("commands.whitelist.add.success", vd.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(ds $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aqx $$2 = $$0.l().ae().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            aqy $$5 = new aqy($$4);
            $$2.b($$5);
            $$0.a(() -> vd.a("commands.whitelist.remove.success", vd.b($$4.getName())), true);
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

   private static int b(ds $$0) throws CommandSyntaxException {
      aqp $$1 = $$0.l().ae();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> vd.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(ds $$0) throws CommandSyntaxException {
      aqp $$1 = $$0.l().ae();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> vd.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(ds $$0) {
      String[] $$1 = $$0.l().ae().j();
      if ($$1.length == 0) {
         $$0.a(() -> vd.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> vd.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
