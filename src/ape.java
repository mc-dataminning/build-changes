import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class ape {
   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a(
                                    "targets", fk.d()
                                 )
                                 .then(ey.a("clear").executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets")))))
                              .then(ey.a("reset").executes($$0x -> b((ex)$$0x.getSource(), fk.f($$0x, "targets")))))
                           .then(
                              ey.a("title")
                                 .then(
                                    ey.a("title", fg.a($$1))
                                       .executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), fg.a($$0x, "title"), "title", afj::new))
                                 )
                           ))
                        .then(
                           ey.a("subtitle")
                              .then(
                                 ey.a("title", fg.a($$1))
                                    .executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), fg.a($$0x, "title"), "subtitle", afh::new))
                              )
                        ))
                     .then(
                        ey.a("actionbar")
                           .then(
                              ey.a("title", fg.a($$1))
                                 .executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), fg.a($$0x, "title"), "actionbar", aei::new))
                           )
                     ))
                  .then(
                     ey.a("times")
                        .then(
                           ey.a("fadeIn", gm.a())
                              .then(
                                 ey.a("stay", gm.a())
                                    .then(
                                       ey.a("fadeOut", gm.a())
                                          .executes(
                                             $$0x -> a(
                                                   (ex)$$0x.getSource(),
                                                   fk.f($$0x, "targets"),
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

   private static int a(ex $$0, Collection<are> $$1) {
      acb $$2 = new acb(false);

      for (are $$3 : $$1) {
         $$3.f.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wp.a("commands.title.cleared.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> wp.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ex $$0, Collection<are> $$1) {
      acb $$2 = new acb(true);

      for (are $$3 : $$1) {
         $$3.f.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wp.a("commands.title.reset.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> wp.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ex $$0, Collection<are> $$1, wp $$2, String $$3, Function<wp, yw<?>> $$4) throws CommandSyntaxException {
      for (are $$5 : $$1) {
         $$5.f.b($$4.apply(ws.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wp.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> wp.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ex $$0, Collection<are> $$1, int $$2, int $$3, int $$4) {
      afk $$5 = new afk($$2, $$3, $$4);

      for (are $$6 : $$1) {
         $$6.f.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wp.a("commands.title.times.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> wp.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
