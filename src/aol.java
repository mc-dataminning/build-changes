import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class aol {
   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a(
                                    "targets", ep.d()
                                 )
                                 .then(ed.a("clear").executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets")))))
                              .then(ed.a("reset").executes($$0x -> b((ec)$$0x.getSource(), ep.f($$0x, "targets")))))
                           .then(
                              ed.a("title")
                                 .then(
                                    ed.a("title", el.a($$1))
                                       .executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), el.a($$0x, "title"), "title", afb::new))
                                 )
                           ))
                        .then(
                           ed.a("subtitle")
                              .then(
                                 ed.a("title", el.a($$1))
                                    .executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), el.a($$0x, "title"), "subtitle", aez::new))
                              )
                        ))
                     .then(
                        ed.a("actionbar")
                           .then(
                              ed.a("title", el.a($$1))
                                 .executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), el.a($$0x, "title"), "actionbar", aec::new))
                           )
                     ))
                  .then(
                     ed.a("times")
                        .then(
                           ed.a("fadeIn", fq.a())
                              .then(
                                 ed.a("stay", fq.a())
                                    .then(
                                       ed.a("fadeOut", fq.a())
                                          .executes(
                                             $$0x -> a(
                                                   (ec)$$0x.getSource(),
                                                   ep.f($$0x, "targets"),
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

   private static int a(ec $$0, Collection<aqf> $$1) {
      acb $$2 = new acb(false);

      for (aqf $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.title.cleared.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> ws.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ec $$0, Collection<aqf> $$1) {
      acb $$2 = new acb(true);

      for (aqf $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.title.reset.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> ws.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ec $$0, Collection<aqf> $$1, ws $$2, String $$3, Function<ws, yz<?>> $$4) throws CommandSyntaxException {
      for (aqf $$5 : $$1) {
         $$5.d.b($$4.apply(wv.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> ws.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ec $$0, Collection<aqf> $$1, int $$2, int $$3, int $$4) {
      afc $$5 = new afc($$2, $$3, $$4);

      for (aqf $$6 : $$1) {
         $$6.d.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.title.times.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> ws.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
