import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class apn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xl.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xl.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(eq.a("on").executes($$0x -> b((ep)$$0x.getSource()))))
                        .then(eq.a("off").executes($$0x -> c((ep)$$0x.getSource()))))
                     .then(eq.a("list").executes($$0x -> d((ep)$$0x.getSource()))))
                  .then(eq.a("add").then(eq.a("targets", fe.a()).suggests(($$0x, $$1) -> {
                     auz $$2 = ((ep)$$0x.getSource()).l().ah();
                     return eu.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.gb())).map($$0xx -> $$0xx.gb().getName()), $$1);
                  }).executes($$0x -> a((ep)$$0x.getSource(), fe.a($$0x, "targets"))))))
               .then(
                  eq.a("remove")
                     .then(
                        eq.a("targets", fe.a())
                           .suggests(($$0x, $$1) -> eu.a(((ep)$$0x.getSource()).l().ah().j(), $$1))
                           .executes($$0x -> b((ep)$$0x.getSource(), fe.a($$0x, "targets")))
                     )
               ))
            .then(eq.a("reload").executes($$0x -> a((ep)$$0x.getSource())))
      );
   }

   private static int a(ep $$0) {
      $$0.l().ah().a();
      $$0.a(() -> xl.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(ep $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avh $$2 = $$0.l().ah().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            avi $$5 = new avi($$4);
            $$2.a($$5);
            $$0.a(() -> xl.a("commands.whitelist.add.success", xl.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(ep $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avh $$2 = $$0.l().ah().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            avi $$5 = new avi($$4);
            $$2.b($$5);
            $$0.a(() -> xl.a("commands.whitelist.remove.success", xl.b($$4.getName())), true);
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

   private static int b(ep $$0) throws CommandSyntaxException {
      auz $$1 = $$0.l().ah();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> xl.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(ep $$0) throws CommandSyntaxException {
      auz $$1 = $$0.l().ah();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> xl.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(ep $$0) {
      String[] $$1 = $$0.l().ah().j();
      if ($$1.length == 0) {
         $$0.a(() -> xl.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> xl.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
