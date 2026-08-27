import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class ane {
   public static void a(CommandDispatcher<du> $$0) {
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
                                    dv.a("title", ed.a())
                                       .executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), ed.a($$0x, "title"), "title", adw::new))
                                 )
                           ))
                        .then(
                           dv.a("subtitle")
                              .then(
                                 dv.a("title", ed.a())
                                    .executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), ed.a($$0x, "title"), "subtitle", adu::new))
                              )
                        ))
                     .then(
                        dv.a("actionbar")
                           .then(
                              dv.a("title", ed.a())
                                 .executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), ed.a($$0x, "title"), "actionbar", acx::new))
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

   private static int a(du $$0, Collection<aow> $$1) {
      aax $$2 = new aax(false);

      for (aow $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vq.a("commands.title.cleared.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vq.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(du $$0, Collection<aow> $$1) {
      aax $$2 = new aax(true);

      for (aow $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vq.a("commands.title.reset.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vq.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<aow> $$1, vq $$2, String $$3, Function<vq, xx<?>> $$4) throws CommandSyntaxException {
      for (aow $$5 : $$1) {
         $$5.d.b($$4.apply(vt.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vq.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vq.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<aow> $$1, int $$2, int $$3, int $$4) {
      adx $$5 = new adx($$2, $$3, $$4);

      for (aow $$6 : $$1) {
         $$6.d.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vq.a("commands.title.times.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vq.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
