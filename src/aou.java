import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class aou {
   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a(
                                    "targets", er.d()
                                 )
                                 .then(ef.a("clear").executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets")))))
                              .then(ef.a("reset").executes($$0x -> b((ee)$$0x.getSource(), er.f($$0x, "targets")))))
                           .then(
                              ef.a("title")
                                 .then(
                                    ef.a("title", en.a($$1))
                                       .executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), en.a($$0x, "title"), "title", afi::new))
                                 )
                           ))
                        .then(
                           ef.a("subtitle")
                              .then(
                                 ef.a("title", en.a($$1))
                                    .executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), en.a($$0x, "title"), "subtitle", afg::new))
                              )
                        ))
                     .then(
                        ef.a("actionbar")
                           .then(
                              ef.a("title", en.a($$1))
                                 .executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), en.a($$0x, "title"), "actionbar", aej::new))
                           )
                     ))
                  .then(
                     ef.a("times")
                        .then(
                           ef.a("fadeIn", ft.a())
                              .then(
                                 ef.a("stay", ft.a())
                                    .then(
                                       ef.a("fadeOut", ft.a())
                                          .executes(
                                             $$0x -> a(
                                                   (ee)$$0x.getSource(),
                                                   er.f($$0x, "targets"),
                                                   IntegerArgumentType.getInteger($$0x, "fadeIn"),
                                                   IntegerArgumentType.getInteger($$0x, "stay"),
                                                   IntegerArgumentType.getInteger($$0x, "fadeOut")
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ee $$0, Collection<aqo> $$1) {
      ach $$2 = new ach(false);

      for (aqo $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.title.cleared.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wx.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ee $$0, Collection<aqo> $$1) {
      ach $$2 = new ach(true);

      for (aqo $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.title.reset.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wx.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ee $$0, Collection<aqo> $$1, wx $$2, String $$3, Function<wx, ze<?>> $$4) throws CommandSyntaxException {
      for (aqo $$5 : $$1) {
         $$5.c.b($$4.apply(xa.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wx.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ee $$0, Collection<aqo> $$1, int $$2, int $$3, int $$4) {
      afj $$5 = new afj($$2, $$3, $$4);

      for (aqo $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.title.times.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wx.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
