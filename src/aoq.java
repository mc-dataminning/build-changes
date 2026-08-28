import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class aoq {
   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a(
                                    "targets", fd.d()
                                 )
                                 .then(er.a("clear").executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets")))))
                              .then(er.a("reset").executes($$0x -> b((eq)$$0x.getSource(), fd.f($$0x, "targets")))))
                           .then(
                              er.a("title")
                                 .then(
                                    er.a("title", ez.a($$1))
                                       .executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), ez.a($$0x, "title"), "title", aff::new))
                                 )
                           ))
                        .then(
                           er.a("subtitle")
                              .then(
                                 er.a("title", ez.a($$1))
                                    .executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), ez.a($$0x, "title"), "subtitle", afd::new))
                              )
                        ))
                     .then(
                        er.a("actionbar")
                           .then(
                              er.a("title", ez.a($$1))
                                 .executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), ez.a($$0x, "title"), "actionbar", aeg::new))
                           )
                     ))
                  .then(
                     er.a("times")
                        .then(
                           er.a("fadeIn", gf.a())
                              .then(
                                 er.a("stay", gf.a())
                                    .then(
                                       er.a("fadeOut", gf.a())
                                          .executes(
                                             $$0x -> a(
                                                   (eq)$$0x.getSource(),
                                                   fd.f($$0x, "targets"),
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

   private static int a(eq $$0, Collection<aqn> $$1) {
      ace $$2 = new ace(false);

      for (aqn $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.title.cleared.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(eq $$0, Collection<aqn> $$1) {
      ace $$2 = new ace(true);

      for (aqn $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.title.reset.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eq $$0, Collection<aqn> $$1, wu $$2, String $$3, Function<wu, zb<?>> $$4) throws CommandSyntaxException {
      for (aqn $$5 : $$1) {
         $$5.c.b($$4.apply(wx.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eq $$0, Collection<aqn> $$1, int $$2, int $$3, int $$4) {
      afg $$5 = new afg($$2, $$3, $$4);

      for (aqn $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.title.times.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
