import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class aoo {
   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a(
                                    "targets", eq.d()
                                 )
                                 .then(ee.a("clear").executes($$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets")))))
                              .then(ee.a("reset").executes($$0x -> b((ed)$$0x.getSource(), eq.f($$0x, "targets")))))
                           .then(
                              ee.a("title")
                                 .then(
                                    ee.a("title", em.a($$1))
                                       .executes($$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), em.a($$0x, "title"), "title", afd::new))
                                 )
                           ))
                        .then(
                           ee.a("subtitle")
                              .then(
                                 ee.a("title", em.a($$1))
                                    .executes($$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), em.a($$0x, "title"), "subtitle", afb::new))
                              )
                        ))
                     .then(
                        ee.a("actionbar")
                           .then(
                              ee.a("title", em.a($$1))
                                 .executes($$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), em.a($$0x, "title"), "actionbar", aee::new))
                           )
                     ))
                  .then(
                     ee.a("times")
                        .then(
                           ee.a("fadeIn", fs.a())
                              .then(
                                 ee.a("stay", fs.a())
                                    .then(
                                       ee.a("fadeOut", fs.a())
                                          .executes(
                                             $$0x -> a(
                                                   (ed)$$0x.getSource(),
                                                   eq.f($$0x, "targets"),
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

   private static int a(ed $$0, Collection<aqi> $$1) {
      acd $$2 = new acd(false);

      for (aqi $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.title.cleared.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ed $$0, Collection<aqi> $$1) {
      acd $$2 = new acd(true);

      for (aqi $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.title.reset.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ed $$0, Collection<aqi> $$1, wu $$2, String $$3, Function<wu, zb<?>> $$4) throws CommandSyntaxException {
      for (aqi $$5 : $$1) {
         $$5.d.b($$4.apply(wx.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ed $$0, Collection<aqi> $$1, int $$2, int $$3, int $$4) {
      afe $$5 = new afe($$2, $$3, $$4);

      for (aqi $$6 : $$1) {
         $$6.d.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.title.times.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
