import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class app {
   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a(
                                    "targets", fi.d()
                                 )
                                 .then(ew.a("clear").executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets")))))
                              .then(ew.a("reset").executes($$0x -> b((ev)$$0x.getSource(), fi.f($$0x, "targets")))))
                           .then(
                              ew.a("title")
                                 .then(
                                    ew.a("title", fe.a($$1))
                                       .executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), fe.a($$0x, "title"), "title", afy::new))
                                 )
                           ))
                        .then(
                           ew.a("subtitle")
                              .then(
                                 ew.a("title", fe.a($$1))
                                    .executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), fe.a($$0x, "title"), "subtitle", afw::new))
                              )
                        ))
                     .then(
                        ew.a("actionbar")
                           .then(
                              ew.a("title", fe.a($$1))
                                 .executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), fe.a($$0x, "title"), "actionbar", aex::new))
                           )
                     ))
                  .then(
                     ew.a("times")
                        .then(
                           ew.a("fadeIn", gk.a())
                              .then(
                                 ew.a("stay", gk.a())
                                    .then(
                                       ew.a("fadeOut", gk.a())
                                          .executes(
                                             $$0x -> a(
                                                   (ev)$$0x.getSource(),
                                                   fi.f($$0x, "targets"),
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

   private static int a(ev $$0, Collection<arn> $$1) {
      acu $$2 = new acu(false);

      for (arn $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.title.cleared.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xh.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ev $$0, Collection<arn> $$1) {
      acu $$2 = new acu(true);

      for (arn $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.title.reset.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xh.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ev $$0, Collection<arn> $$1, xh $$2, String $$3, Function<xh, zo<?>> $$4) throws CommandSyntaxException {
      for (arn $$5 : $$1) {
         $$5.d.b($$4.apply(xk.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xh.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ev $$0, Collection<arn> $$1, int $$2, int $$3, int $$4) {
      afz $$5 = new afz($$2, $$3, $$4);

      for (arn $$6 : $$1) {
         $$6.d.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.title.times.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xh.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
