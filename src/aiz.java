import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class aiz {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a(
                                    "targets", ee.d()
                                 )
                                 .then(du.a("clear").executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets")))))
                              .then(du.a("reset").executes($$0x -> b((dt)$$0x.getSource(), ee.f($$0x, "targets")))))
                           .then(
                              du.a("title")
                                 .then(
                                    du.a("title", ea.a())
                                       .executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), ea.a($$0x, "title"), "title", aak::new))
                                 )
                           ))
                        .then(
                           du.a("subtitle")
                              .then(
                                 du.a("title", ea.a())
                                    .executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), ea.a($$0x, "title"), "subtitle", aai::new))
                              )
                        ))
                     .then(
                        du.a("actionbar")
                           .then(
                              du.a("title", ea.a()).executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), ea.a($$0x, "title"), "actionbar", zl::new))
                           )
                     ))
                  .then(
                     du.a("times")
                        .then(
                           du.a("fadeIn", fd.a())
                              .then(
                                 du.a("stay", fd.a())
                                    .then(
                                       du.a("fadeOut", fd.a())
                                          .executes(
                                             $$0x -> a(
                                                   (dt)$$0x.getSource(),
                                                   ee.f($$0x, "targets"),
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

   private static int a(dt $$0, Collection<akr> $$1) {
      xm $$2 = new xm(false);

      for (akr $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tl.a("commands.title.cleared.single", $$1.iterator().next().N_()), true);
      } else {
         $$0.a(() -> tl.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(dt $$0, Collection<akr> $$1) {
      xm $$2 = new xm(true);

      for (akr $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tl.a("commands.title.reset.single", $$1.iterator().next().N_()), true);
      } else {
         $$0.a(() -> tl.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dt $$0, Collection<akr> $$1, tl $$2, String $$3, Function<tl, vd<?>> $$4) throws CommandSyntaxException {
      for (akr $$5 : $$1) {
         $$5.c.b($$4.apply(tn.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tl.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().N_()), true);
      } else {
         $$0.a(() -> tl.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dt $$0, Collection<akr> $$1, int $$2, int $$3, int $$4) {
      aal $$5 = new aal($$2, $$3, $$4);

      for (akr $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tl.a("commands.title.times.single", $$1.iterator().next().N_()), true);
      } else {
         $$0.a(() -> tl.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
