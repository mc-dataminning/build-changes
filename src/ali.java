import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class ali {
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
                                       .executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), eb.a($$0x, "title"), "title", acm::new))
                                 )
                           ))
                        .then(
                           dt.a("subtitle")
                              .then(
                                 dt.a("title", eb.a())
                                    .executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), eb.a($$0x, "title"), "subtitle", ack::new))
                              )
                        ))
                     .then(
                        dt.a("actionbar")
                           .then(
                              dt.a("title", eb.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), eb.a($$0x, "title"), "actionbar", abn::new))
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

   private static int a(ds $$0, Collection<ana> $$1) {
      zn $$2 = new zn(false);

      for (ana $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vd.a("commands.title.cleared.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vd.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ds $$0, Collection<ana> $$1) {
      zn $$2 = new zn(true);

      for (ana $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vd.a("commands.title.reset.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vd.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<ana> $$1, vd $$2, String $$3, Function<vd, xd<?>> $$4) throws CommandSyntaxException {
      for (ana $$5 : $$1) {
         $$5.c.b($$4.apply(vg.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vd.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vd.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<ana> $$1, int $$2, int $$3, int $$4) {
      acn $$5 = new acn($$2, $$3, $$4);

      for (ana $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vd.a("commands.title.times.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vd.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
