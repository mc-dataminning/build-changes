import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class ann {
   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                    "targets", eh.d()
                                 )
                                 .then(dv.a("clear").executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets")))))
                              .then(dv.a("reset").executes($$0x -> b((du)$$0x.getSource(), eh.f($$0x, "targets")))))
                           .then(
                              dv.a("title")
                                 .then(
                                    dv.a("title", ed.a($$1))
                                       .executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), ed.a($$0x, "title"), "title", aed::new))
                                 )
                           ))
                        .then(
                           dv.a("subtitle")
                              .then(
                                 dv.a("title", ed.a($$1))
                                    .executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), ed.a($$0x, "title"), "subtitle", aeb::new))
                              )
                        ))
                     .then(
                        dv.a("actionbar")
                           .then(
                              dv.a("title", ed.a($$1))
                                 .executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), ed.a($$0x, "title"), "actionbar", ade::new))
                           )
                     ))
                  .then(
                     dv.a("times")
                        .then(
                           dv.a("fadeIn", fh.a())
                              .then(
                                 dv.a("stay", fh.a())
                                    .then(
                                       dv.a("fadeOut", fh.a())
                                          .executes(
                                             $$0x -> a(
                                                   (du)$$0x.getSource(),
                                                   eh.f($$0x, "targets"),
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

   private static int a(du $$0, Collection<apg> $$1) {
      abd $$2 = new abd(false);

      for (apg $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vu.a("commands.title.cleared.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> vu.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(du $$0, Collection<apg> $$1) {
      abd $$2 = new abd(true);

      for (apg $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vu.a("commands.title.reset.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> vu.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<apg> $$1, vu $$2, String $$3, Function<vu, yb<?>> $$4) throws CommandSyntaxException {
      for (apg $$5 : $$1) {
         $$5.d.b($$4.apply(vx.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vu.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> vu.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<apg> $$1, int $$2, int $$3, int $$4) {
      aee $$5 = new aee($$2, $$3, $$4);

      for (apg $$6 : $$1) {
         $$6.d.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vu.a("commands.title.times.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> vu.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
