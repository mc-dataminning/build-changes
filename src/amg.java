import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;

public class amg {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.experience.set.points.invalid"));

   public static void a(CommandDispatcher<ec> $$0) {
      LiteralCommandNode<ec> $$1 = $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("experience").requires($$0x -> $$0x.c(2)))
                  .then(
                     ed.a("add")
                        .then(
                           ed.a("targets", ep.d())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("amount", IntegerArgumentType.integer())
                                          .executes(
                                             $$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amg.a.a)
                                          ))
                                       .then(
                                          ed.a("points")
                                             .executes(
                                                $$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amg.a.a)
                                             )
                                       ))
                                    .then(
                                       ed.a("levels")
                                          .executes(
                                             $$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amg.a.b)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  ed.a("set")
                     .then(
                        ed.a("targets", ep.d())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          $$0x -> b((ec)$$0x.getSource(), ep.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amg.a.a)
                                       ))
                                    .then(
                                       ed.a("points")
                                          .executes(
                                             $$0x -> b((ec)$$0x.getSource(), ep.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amg.a.a)
                                          )
                                    ))
                                 .then(
                                    ed.a("levels")
                                       .executes(
                                          $$0x -> b((ec)$$0x.getSource(), ep.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "amount"), amg.a.b)
                                       )
                                 )
                           )
                     )
               ))
            .then(
               ed.a("query")
                  .then(
                     ((RequiredArgumentBuilder)ed.a("targets", ep.c())
                           .then(ed.a("points").executes($$0x -> a((ec)$$0x.getSource(), ep.e($$0x, "targets"), amg.a.a))))
                        .then(ed.a("levels").executes($$0x -> a((ec)$$0x.getSource(), ep.e($$0x, "targets"), amg.a.b)))
                  )
            )
      );
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("xp").requires($$0x -> $$0x.c(2))).redirect($$1));
   }

   private static int a(ec $$0, aqf $$1, amg.a $$2) {
      int $$3 = $$2.f.applyAsInt($$1);
      $$0.a(() -> ws.a("commands.experience.query." + $$2.e, $$1.O_(), $$3), false);
      return $$3;
   }

   private static int a(ec $$0, Collection<? extends aqf> $$1, int $$2, amg.a $$3) {
      for (aqf $$4 : $$1) {
         $$3.c.accept($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.experience.add." + $$3.e + ".success.single", $$2, $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> ws.a("commands.experience.add." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ec $$0, Collection<? extends aqf> $$1, int $$2, amg.a $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aqf $$5 : $$1) {
         if ($$3.d.test($$5, $$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> ws.a("commands.experience.set." + $$3.e + ".success.single", $$2, $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> ws.a("commands.experience.set." + $$3.e + ".success.multiple", $$2, $$1.size()), true);
         }

         return $$1.size();
      }
   }

   static enum a {
      a("points", ckl::d, ($$0, $$1) -> {
         if ($$1 >= $$0.gj()) {
            return false;
         } else {
            $$0.a($$1);
            return true;
         }
      }, $$0 -> axw.d($$0.cr * (float)$$0.gj())),
      b("levels", aqf::c, ($$0, $$1) -> {
         $$0.b($$1);
         return true;
      }, $$0 -> $$0.cp);

      public final BiConsumer<aqf, Integer> c;
      public final BiPredicate<aqf, Integer> d;
      public final String e;
      final ToIntFunction<aqf> f;

      private a(String $$0, BiConsumer<aqf, Integer> $$1, BiPredicate<aqf, Integer> $$2, ToIntFunction<aqf> $$3) {
         this.c = $$1;
         this.e = $$0;
         this.d = $$2;
         this.f = $$3;
      }
   }
}
