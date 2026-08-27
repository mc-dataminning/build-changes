import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aiy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tf.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(tf.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(ds.a("on").executes($$0x -> b((dr)$$0x.getSource()))))
                        .then(ds.a("off").executes($$0x -> c((dr)$$0x.getSource()))))
                     .then(ds.a("list").executes($$0x -> d((dr)$$0x.getSource()))))
                  .then(ds.a("add").then(ds.a("targets", ee.a()).suggests(($$0x, $$1) -> {
                     anz $$2 = ((dr)$$0x.getSource()).l().ac();
                     return du.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.fP())).map($$0xx -> $$0xx.fP().getName()), $$1);
                  }).executes($$0x -> a((dr)$$0x.getSource(), ee.a($$0x, "targets"))))))
               .then(
                  ds.a("remove")
                     .then(
                        ds.a("targets", ee.a())
                           .suggests(($$0x, $$1) -> du.a(((dr)$$0x.getSource()).l().ac().j(), $$1))
                           .executes($$0x -> b((dr)$$0x.getSource(), ee.a($$0x, "targets")))
                     )
               ))
            .then(ds.a("reload").executes($$0x -> a((dr)$$0x.getSource())))
      );
   }

   private static int a(dr $$0) {
      $$0.l().ac().a();
      $$0.a(() -> tf.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(dr $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aoh $$2 = $$0.l().ac().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            aoi $$5 = new aoi($$4);
            $$2.a($$5);
            $$0.a(() -> tf.a("commands.whitelist.add.success", tf.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(dr $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aoh $$2 = $$0.l().ac().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            aoi $$5 = new aoi($$4);
            $$2.b($$5);
            $$0.a(() -> tf.a("commands.whitelist.remove.success", tf.b($$4.getName())), true);
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

   private static int b(dr $$0) throws CommandSyntaxException {
      anz $$1 = $$0.l().ac();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> tf.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(dr $$0) throws CommandSyntaxException {
      anz $$1 = $$0.l().ac();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> tf.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(dr $$0) {
      String[] $$1 = $$0.l().ac().j();
      if ($$1.length == 0) {
         $$0.a(() -> tf.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> tf.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
