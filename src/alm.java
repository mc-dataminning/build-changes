import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class alm {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                    "targets", ef.d()
                                 )
                                 .then(dt.a("clear").executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets")))))
                              .then(dt.a("reset").executes($$0x -> b((ds)$$0x.getSource(), ef.f($$0x, "targets")))))
                           .then(
                              dt.a("title")
                                 .then(
                                    dt.a("title", eb.a())
                                       .executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), eb.a($$0x, "title"), "title", acp::new))
                                 )
                           ))
                        .then(
                           dt.a("subtitle")
                              .then(
                                 dt.a("title", eb.a())
                                    .executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), eb.a($$0x, "title"), "subtitle", acn::new))
                              )
                        ))
                     .then(
                        dt.a("actionbar")
                           .then(
                              dt.a("title", eb.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), eb.a($$0x, "title"), "actionbar", abq::new))
                           )
                     ))
                  .then(
                     dt.a("times")
                        .then(
                           dt.a("fadeIn", ff.a())
                              .then(
                                 dt.a("stay", ff.a())
                                    .then(
                                       dt.a("fadeOut", ff.a())
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   ef.f($$0x, "targets"),
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

   private static int a(ds $$0, Collection<ane> $$1) {
      zq $$2 = new zq(false);

      for (ane $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vf.a("commands.title.cleared.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vf.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ds $$0, Collection<ane> $$1) {
      zq $$2 = new zq(true);

      for (ane $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vf.a("commands.title.reset.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vf.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<ane> $$1, vf $$2, String $$3, Function<vf, xf<?>> $$4) throws CommandSyntaxException {
      for (ane $$5 : $$1) {
         $$5.c.b($$4.apply(vi.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vf.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vf.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<ane> $$1, int $$2, int $$3, int $$4) {
      acq $$5 = new acq($$2, $$3, $$4);

      for (ane $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vf.a("commands.title.times.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vf.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
