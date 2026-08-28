import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class apu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.c("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ww.c("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ww.c("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ww.c("commands.whitelist.remove.failed"));

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a(
                                 "whitelist"
                              )
                              .requires($$0x -> $$0x.c(3)))
                           .then(ej.a("on").executes($$0x -> b((ei)$$0x.getSource()))))
                        .then(ej.a("off").executes($$0x -> c((ei)$$0x.getSource()))))
                     .then(ej.a("list").executes($$0x -> d((ei)$$0x.getSource()))))
                  .then(ej.a("add").then(ej.a("targets", ex.a()).suggests(($$0x, $$1) -> {
                     avo $$2 = ((ei)$$0x.getSource()).l().ag();
                     return en.b($$2.t().stream().filter($$1x -> !$$2.i().a($$1x.gh())).map($$0xx -> $$0xx.gh().getName()), $$1);
                  }).executes($$0x -> a((ei)$$0x.getSource(), ex.a($$0x, "targets"))))))
               .then(
                  ej.a("remove")
                     .then(
                        ej.a("targets", ex.a())
                           .suggests(($$0x, $$1) -> en.a(((ei)$$0x.getSource()).l().ag().j(), $$1))
                           .executes($$0x -> b((ei)$$0x.getSource(), ex.a($$0x, "targets")))
                     )
               ))
            .then(ej.a("reload").executes($$0x -> a((ei)$$0x.getSource())))
      );
   }

   private static int a(ei $$0) {
      $$0.l().ag().a();
      $$0.a(() -> ww.c("commands.whitelist.reloaded"), true);
      $$0.l().a($$0);
      return 1;
   }

   private static int a(ei $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avw $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.a($$4)) {
            avx $$5 = new avx($$4);
            $$2.a($$5);
            $$0.a(() -> ww.a("commands.whitelist.add.success", ww.b($$4.getName())), true);
            $$3++;
         }
      }

      if ($$3 == 0) {
         throw c.create();
      } else {
         return $$3;
      }
   }

   private static int b(ei $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avw $$2 = $$0.l().ag().i();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            avx $$5 = new avx($$4);
            $$2.b($$5);
            $$0.a(() -> ww.a("commands.whitelist.remove.success", ww.b($$4.getName())), true);
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

   private static int b(ei $$0) throws CommandSyntaxException {
      avo $$1 = $$0.l().ag();
      if ($$1.o()) {
         throw a.create();
      } else {
         $$1.a(true);
         $$0.a(() -> ww.c("commands.whitelist.enabled"), true);
         $$0.l().a($$0);
         return 1;
      }
   }

   private static int c(ei $$0) throws CommandSyntaxException {
      avo $$1 = $$0.l().ag();
      if (!$$1.o()) {
         throw b.create();
      } else {
         $$1.a(false);
         $$0.a(() -> ww.c("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int d(ei $$0) {
      String[] $$1 = $$0.l().ag().j();
      if ($$1.length == 0) {
         $$0.a(() -> ww.c("commands.whitelist.none"), false);
      } else {
         $$0.a(() -> ww.a("commands.whitelist.list", $$1.length, String.join(", ", $$1)), false);
      }

      return $$1.length;
   }
}
