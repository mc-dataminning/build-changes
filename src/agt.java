import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class agt {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tl.c("commands.effect.clear.everything.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tl.c("commands.effect.clear.specific.failed"));

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("effect").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)du.a("clear").executes($$0x -> a((dt)$$0x.getSource(), ImmutableList.of(((dt)$$0x.getSource()).g()))))
                     .then(
                        ((RequiredArgumentBuilder)du.a("targets", ee.b()).executes($$0x -> a((dt)$$0x.getSource(), ee.b($$0x, "targets"))))
                           .then(du.a("effect", eq.a($$1, je.O)).executes($$0x -> a((dt)$$0x.getSource(), ee.b($$0x, "targets"), eq.f($$0x, "effect"))))
                     )
               ))
            .then(
               du.a("give")
                  .then(
                     du.a("targets", ee.b())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("effect", eq.a($$1, je.O))
                                    .executes($$0x -> a((dt)$$0x.getSource(), ee.b($$0x, "targets"), eq.f($$0x, "effect"), null, 0, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)du.a("seconds", IntegerArgumentType.integer(1, 1000000))
                                          .executes(
                                             $$0x -> a(
                                                   (dt)$$0x.getSource(),
                                                   ee.b($$0x, "targets"),
                                                   eq.f($$0x, "effect"),
                                                   IntegerArgumentType.getInteger($$0x, "seconds"),
                                                   0,
                                                   true
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)du.a("amplifier", IntegerArgumentType.integer(0, 255))
                                                .executes(
                                                   $$0x -> a(
                                                         (dt)$$0x.getSource(),
                                                         ee.b($$0x, "targets"),
                                                         eq.f($$0x, "effect"),
                                                         IntegerArgumentType.getInteger($$0x, "seconds"),
                                                         IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                         true
                                                      )
                                                ))
                                             .then(
                                                du.a("hideParticles", BoolArgumentType.bool())
                                                   .executes(
                                                      $$0x -> a(
                                                            (dt)$$0x.getSource(),
                                                            ee.b($$0x, "targets"),
                                                            eq.f($$0x, "effect"),
                                                            IntegerArgumentType.getInteger($$0x, "seconds"),
                                                            IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                            !BoolArgumentType.getBool($$0x, "hideParticles")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)du.a("infinite")
                                       .executes($$0x -> a((dt)$$0x.getSource(), ee.b($$0x, "targets"), eq.f($$0x, "effect"), -1, 0, true)))
                                    .then(
                                       ((RequiredArgumentBuilder)du.a("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                $$0x -> a(
                                                      (dt)$$0x.getSource(),
                                                      ee.b($$0x, "targets"),
                                                      eq.f($$0x, "effect"),
                                                      -1,
                                                      IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                      true
                                                   )
                                             ))
                                          .then(
                                             du.a("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   $$0x -> a(
                                                         (dt)$$0x.getSource(),
                                                         ee.b($$0x, "targets"),
                                                         eq.f($$0x, "effect"),
                                                         -1,
                                                         IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                         !BoolArgumentType.getBool($$0x, "hideParticles")
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(dt $$0, Collection<? extends biq> $$1, hg<bib> $$2, @Nullable Integer $$3, int $$4, boolean $$5) throws CommandSyntaxException {
      bib $$6 = $$2.a();
      int $$7 = 0;
      int $$8;
      if ($$3 != null) {
         if ($$6.a()) {
            $$8 = $$3;
         } else if ($$3 == -1) {
            $$8 = -1;
         } else {
            $$8 = $$3 * 20;
         }
      } else if ($$6.a()) {
         $$8 = 1;
      } else {
         $$8 = 600;
      }

      for (biq $$13 : $$1) {
         if ($$13 instanceof bjg) {
            bid $$14 = new bid($$6, $$8, $$4, false, $$5);
            if (((bjg)$$13).b($$14, $$0.f())) {
               $$7++;
            }
         }
      }

      if ($$7 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> tl.a("commands.effect.give.success.single", $$6.e(), $$1.iterator().next().N_(), $$8 / 20), true);
         } else {
            $$0.a(() -> tl.a("commands.effect.give.success.multiple", $$6.e(), $$1.size(), $$8 / 20), true);
         }

         return $$7;
      }
   }

   private static int a(dt $$0, Collection<? extends biq> $$1) throws CommandSyntaxException {
      int $$2 = 0;

      for (biq $$3 : $$1) {
         if ($$3 instanceof bjg && ((bjg)$$3).eq()) {
            $$2++;
         }
      }

      if ($$2 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> tl.a("commands.effect.clear.everything.success.single", $$1.iterator().next().N_()), true);
         } else {
            $$0.a(() -> tl.a("commands.effect.clear.everything.success.multiple", $$1.size()), true);
         }

         return $$2;
      }
   }

   private static int a(dt $$0, Collection<? extends biq> $$1, hg<bib> $$2) throws CommandSyntaxException {
      bib $$3 = $$2.a();
      int $$4 = 0;

      for (biq $$5 : $$1) {
         if ($$5 instanceof bjg && ((bjg)$$5).d($$3)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw c.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> tl.a("commands.effect.clear.specific.success.single", $$3.e(), $$1.iterator().next().N_()), true);
         } else {
            $$0.a(() -> tl.a("commands.effect.clear.specific.success.multiple", $$3.e(), $$1.size()), true);
         }

         return $$4;
      }
   }
}
