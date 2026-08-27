import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class apa {
   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a(
                                    "targets", eu.d()
                                 )
                                 .then(ei.a("clear").executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets")))))
                              .then(ei.a("reset").executes($$0x -> b((eh)$$0x.getSource(), eu.f($$0x, "targets")))))
                           .then(
                              ei.a("title")
                                 .then(
                                    ei.a("title", eq.a($$1))
                                       .executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), eq.a($$0x, "title"), "title", afo::new))
                                 )
                           ))
                        .then(
                           ei.a("subtitle")
                              .then(
                                 ei.a("title", eq.a($$1))
                                    .executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), eq.a($$0x, "title"), "subtitle", afm::new))
                              )
                        ))
                     .then(
                        ei.a("actionbar")
                           .then(
                              ei.a("title", eq.a($$1))
                                 .executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), eq.a($$0x, "title"), "actionbar", aep::new))
                           )
                     ))
                  .then(
                     ei.a("times")
                        .then(
                           ei.a("fadeIn", fw.a())
                              .then(
                                 ei.a("stay", fw.a())
                                    .then(
                                       ei.a("fadeOut", fw.a())
                                          .executes(
                                             $$0x -> a(
                                                   (eh)$$0x.getSource(),
                                                   eu.f($$0x, "targets"),
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

   private static int a(eh $$0, Collection<aqu> $$1) {
      aco $$2 = new aco(false);

      for (aqu $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.title.cleared.single", $$1.iterator().next().P_()), true);
      } else {
         $$0.a(() -> xe.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(eh $$0, Collection<aqu> $$1) {
      aco $$2 = new aco(true);

      for (aqu $$3 : $$1) {
         $$3.d.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.title.reset.single", $$1.iterator().next().P_()), true);
      } else {
         $$0.a(() -> xe.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eh $$0, Collection<aqu> $$1, xe $$2, String $$3, Function<xe, zl<?>> $$4) throws CommandSyntaxException {
      for (aqu $$5 : $$1) {
         $$5.d.b($$4.apply(xh.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().P_()), true);
      } else {
         $$0.a(() -> xe.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eh $$0, Collection<aqu> $$1, int $$2, int $$3, int $$4) {
      afp $$5 = new afp($$2, $$3, $$4);

      for (aqu $$6 : $$1) {
         $$6.d.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.title.times.single", $$1.iterator().next().P_()), true);
      } else {
         $$0.a(() -> xe.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
