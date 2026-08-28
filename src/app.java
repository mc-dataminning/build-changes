import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class app {
   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a(
                                    "targets", ev.d()
                                 )
                                 .then(ej.a("clear").executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets")))))
                              .then(ej.a("reset").executes($$0x -> b((ei)$$0x.getSource(), ev.f($$0x, "targets")))))
                           .then(
                              ej.a("title")
                                 .then(
                                    ej.a("title", er.a($$1))
                                       .executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), er.a($$0x, "title"), "title", afq::new))
                                 )
                           ))
                        .then(
                           ej.a("subtitle")
                              .then(
                                 ej.a("title", er.a($$1))
                                    .executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), er.a($$0x, "title"), "subtitle", afo::new))
                              )
                        ))
                     .then(
                        ej.a("actionbar")
                           .then(
                              ej.a("title", er.a($$1))
                                 .executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), er.a($$0x, "title"), "actionbar", aep::new))
                           )
                     ))
                  .then(
                     ej.a("times")
                        .then(
                           ej.a("fadeIn", fy.a())
                              .then(
                                 ej.a("stay", fy.a())
                                    .then(
                                       ej.a("fadeOut", fy.a())
                                          .executes(
                                             $$0x -> a(
                                                   (ei)$$0x.getSource(),
                                                   ev.f($$0x, "targets"),
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

   private static int a(ei $$0, Collection<arp> $$1) {
      aci $$2 = new aci(false);

      for (arp $$3 : $$1) {
         $$3.f.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ww.a("commands.title.cleared.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> ww.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ei $$0, Collection<arp> $$1) {
      aci $$2 = new aci(true);

      for (arp $$3 : $$1) {
         $$3.f.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ww.a("commands.title.reset.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> ww.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ei $$0, Collection<arp> $$1, ww $$2, String $$3, Function<ww, zd<?>> $$4) throws CommandSyntaxException {
      for (arp $$5 : $$1) {
         $$5.f.b($$4.apply(wz.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ww.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> ww.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ei $$0, Collection<arp> $$1, int $$2, int $$3, int $$4) {
      afr $$5 = new afr($$2, $$3, $$4);

      for (arp $$6 : $$1) {
         $$6.f.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ww.a("commands.title.times.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> ww.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
