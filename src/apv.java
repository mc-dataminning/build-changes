import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class apv {
   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a(
                                    "targets", ex.d()
                                 )
                                 .then(el.a("clear").executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets")))))
                              .then(el.a("reset").executes($$0x -> b((ek)$$0x.getSource(), ex.f($$0x, "targets")))))
                           .then(
                              el.a("title")
                                 .then(
                                    el.a("title", et.a($$1))
                                       .executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), et.a($$0x, "title"), "title", afw::new))
                                 )
                           ))
                        .then(
                           el.a("subtitle")
                              .then(
                                 el.a("title", et.a($$1))
                                    .executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), et.a($$0x, "title"), "subtitle", afu::new))
                              )
                        ))
                     .then(
                        el.a("actionbar")
                           .then(
                              el.a("title", et.a($$1))
                                 .executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), et.a($$0x, "title"), "actionbar", aev::new))
                           )
                     ))
                  .then(
                     el.a("times")
                        .then(
                           el.a("fadeIn", ga.a())
                              .then(
                                 el.a("stay", ga.a())
                                    .then(
                                       el.a("fadeOut", ga.a())
                                          .executes(
                                             $$0x -> a(
                                                   (ek)$$0x.getSource(),
                                                   ex.f($$0x, "targets"),
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

   private static int a(ek $$0, Collection<arv> $$1) {
      aco $$2 = new aco(false);

      for (arv $$3 : $$1) {
         $$3.f.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xc.a("commands.title.cleared.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> xc.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ek $$0, Collection<arv> $$1) {
      aco $$2 = new aco(true);

      for (arv $$3 : $$1) {
         $$3.f.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xc.a("commands.title.reset.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> xc.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, Collection<arv> $$1, xc $$2, String $$3, Function<xc, zj<?>> $$4) throws CommandSyntaxException {
      for (arv $$5 : $$1) {
         $$5.f.b($$4.apply(xf.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xc.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> xc.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, Collection<arv> $$1, int $$2, int $$3, int $$4) {
      afx $$5 = new afx($$2, $$3, $$4);

      for (arv $$6 : $$1) {
         $$6.f.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xc.a("commands.title.times.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> xc.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
