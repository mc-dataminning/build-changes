import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class aiu {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a(
                                    "targets", ec.d()
                                 )
                                 .then(ds.a("clear").executes($$0x -> a((dr)$$0x.getSource(), ec.f($$0x, "targets")))))
                              .then(ds.a("reset").executes($$0x -> b((dr)$$0x.getSource(), ec.f($$0x, "targets")))))
                           .then(
                              ds.a("title")
                                 .then(
                                    ds.a("title", dy.a())
                                       .executes($$0x -> a((dr)$$0x.getSource(), ec.f($$0x, "targets"), dy.a($$0x, "title"), "title", aae::new))
                                 )
                           ))
                        .then(
                           ds.a("subtitle")
                              .then(
                                 ds.a("title", dy.a())
                                    .executes($$0x -> a((dr)$$0x.getSource(), ec.f($$0x, "targets"), dy.a($$0x, "title"), "subtitle", aac::new))
                              )
                        ))
                     .then(
                        ds.a("actionbar")
                           .then(
                              ds.a("title", dy.a()).executes($$0x -> a((dr)$$0x.getSource(), ec.f($$0x, "targets"), dy.a($$0x, "title"), "actionbar", zf::new))
                           )
                     ))
                  .then(
                     ds.a("times")
                        .then(
                           ds.a("fadeIn", fb.a())
                              .then(
                                 ds.a("stay", fb.a())
                                    .then(
                                       ds.a("fadeOut", fb.a())
                                          .executes(
                                             $$0x -> a(
                                                   (dr)$$0x.getSource(),
                                                   ec.f($$0x, "targets"),
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

   private static int a(dr $$0, Collection<akl> $$1) {
      xg $$2 = new xg(false);

      for (akl $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tf.a("commands.title.cleared.single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> tf.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(dr $$0, Collection<akl> $$1) {
      xg $$2 = new xg(true);

      for (akl $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tf.a("commands.title.reset.single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> tf.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dr $$0, Collection<akl> $$1, tf $$2, String $$3, Function<tf, ux<?>> $$4) throws CommandSyntaxException {
      for (akl $$5 : $$1) {
         $$5.c.b($$4.apply(th.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tf.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> tf.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dr $$0, Collection<akl> $$1, int $$2, int $$3, int $$4) {
      aaf $$5 = new aaf($$2, $$3, $$4);

      for (akl $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tf.a("commands.title.times.single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> tf.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
