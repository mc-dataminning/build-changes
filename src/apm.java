import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class apm {
   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a(
                                    "targets", fh.d()
                                 )
                                 .then(ev.a("clear").executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets")))))
                              .then(ev.a("reset").executes($$0x -> b((eu)$$0x.getSource(), fh.f($$0x, "targets")))))
                           .then(
                              ev.a("title")
                                 .then(
                                    ev.a("title", fd.a($$1))
                                       .executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), fd.a($$0x, "title"), "title", afv::new))
                                 )
                           ))
                        .then(
                           ev.a("subtitle")
                              .then(
                                 ev.a("title", fd.a($$1))
                                    .executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), fd.a($$0x, "title"), "subtitle", aft::new))
                              )
                        ))
                     .then(
                        ev.a("actionbar")
                           .then(
                              ev.a("title", fd.a($$1))
                                 .executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), fd.a($$0x, "title"), "actionbar", aeu::new))
                           )
                     ))
                  .then(
                     ev.a("times")
                        .then(
                           ev.a("fadeIn", gj.a())
                              .then(
                                 ev.a("stay", gj.a())
                                    .then(
                                       ev.a("fadeOut", gj.a())
                                          .executes(
                                             $$0x -> a(
                                                   (eu)$$0x.getSource(),
                                                   fh.f($$0x, "targets"),
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

   private static int a(eu $$0, Collection<ark> $$1) {
      acr $$2 = new acr(false);

      for (ark $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.title.cleared.single", $$1.iterator().next().R_()), true);
      } else {
         $$0.a(() -> xe.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(eu $$0, Collection<ark> $$1) {
      acr $$2 = new acr(true);

      for (ark $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.title.reset.single", $$1.iterator().next().R_()), true);
      } else {
         $$0.a(() -> xe.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eu $$0, Collection<ark> $$1, xe $$2, String $$3, Function<xe, zl<?>> $$4) throws CommandSyntaxException {
      for (ark $$5 : $$1) {
         $$5.c.b($$4.apply(xh.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().R_()), true);
      } else {
         $$0.a(() -> xe.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eu $$0, Collection<ark> $$1, int $$2, int $$3, int $$4) {
      afw $$5 = new afw($$2, $$3, $$4);

      for (ark $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.title.times.single", $$1.iterator().next().R_()), true);
      } else {
         $$0.a(() -> xe.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
