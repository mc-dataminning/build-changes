import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class akj {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("title").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                    "targets", eg.d()
                                 )
                                 .then(dv.a("clear").executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets")))))
                              .then(dv.a("reset").executes($$0x -> b((du)$$0x.getSource(), eg.f($$0x, "targets")))))
                           .then(
                              dv.a("title")
                                 .then(
                                    dv.a("title", ec.a())
                                       .executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ec.a($$0x, "title"), "title", abr::new))
                                 )
                           ))
                        .then(
                           dv.a("subtitle")
                              .then(
                                 dv.a("title", ec.a())
                                    .executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ec.a($$0x, "title"), "subtitle", abp::new))
                              )
                        ))
                     .then(
                        dv.a("actionbar")
                           .then(
                              dv.a("title", ec.a())
                                 .executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ec.a($$0x, "title"), "actionbar", aas::new))
                           )
                     ))
                  .then(
                     dv.a("times")
                        .then(
                           dv.a("fadeIn", ff.a())
                              .then(
                                 dv.a("stay", ff.a())
                                    .then(
                                       dv.a("fadeOut", ff.a())
                                          .executes(
                                             $$0x -> a(
                                                   (du)$$0x.getSource(),
                                                   eg.f($$0x, "targets"),
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

   private static int a(du $$0, Collection<amb> $$1) {
      yt $$2 = new yt(false);

      for (amb $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ur.a("commands.title.cleared.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> ur.a("commands.title.cleared.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(du $$0, Collection<amb> $$1) {
      yt $$2 = new yt(true);

      for (amb $$3 : $$1) {
         $$3.c.b($$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ur.a("commands.title.reset.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> ur.a("commands.title.reset.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<amb> $$1, ur $$2, String $$3, Function<ur, wk<?>> $$4) throws CommandSyntaxException {
      for (amb $$5 : $$1) {
         $$5.c.b($$4.apply(uu.a($$0, $$2, $$5, 0)));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ur.a("commands.title.show." + $$3 + ".single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> ur.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<amb> $$1, int $$2, int $$3, int $$4) {
      abs $$5 = new abs($$2, $$3, $$4);

      for (amb $$6 : $$1) {
         $$6.c.b($$5);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ur.a("commands.title.times.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> ur.a("commands.title.times.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
