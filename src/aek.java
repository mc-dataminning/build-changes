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

public class aek {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(sw.c("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(sw.c("commands.effect.clear.everything.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(sw.c("commands.effect.clear.specific.failed"));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("effect").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)dt.a("clear").executes($$0x -> a((ds)$$0x.getSource(), ImmutableList.of(((ds)$$0x.getSource()).g()))))
                     .then(
                        ((RequiredArgumentBuilder)dt.a("targets", ec.b()).executes($$0x -> a((ds)$$0x.getSource(), ec.b($$0x, "targets"))))
                           .then(dt.a("effect", eo.a($$1, jc.O)).executes($$0x -> a((ds)$$0x.getSource(), ec.b($$0x, "targets"), eo.f($$0x, "effect"))))
                     )
               ))
            .then(
               dt.a("give")
                  .then(
                     dt.a("targets", ec.b())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("effect", eo.a($$1, jc.O))
                                    .executes($$0x -> a((ds)$$0x.getSource(), ec.b($$0x, "targets"), eo.f($$0x, "effect"), null, 0, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)dt.a("seconds", IntegerArgumentType.integer(1, 1000000))
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   ec.b($$0x, "targets"),
                                                   eo.f($$0x, "effect"),
                                                   IntegerArgumentType.getInteger($$0x, "seconds"),
                                                   0,
                                                   true
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)dt.a("amplifier", IntegerArgumentType.integer(0, 255))
                                                .executes(
                                                   $$0x -> a(
                                                         (ds)$$0x.getSource(),
                                                         ec.b($$0x, "targets"),
                                                         eo.f($$0x, "effect"),
                                                         IntegerArgumentType.getInteger($$0x, "seconds"),
                                                         IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                         true
                                                      )
                                                ))
                                             .then(
                                                dt.a("hideParticles", BoolArgumentType.bool())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            ec.b($$0x, "targets"),
                                                            eo.f($$0x, "effect"),
                                                            IntegerArgumentType.getInteger($$0x, "seconds"),
                                                            IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                            !BoolArgumentType.getBool($$0x, "hideParticles")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)dt.a("infinite")
                                       .executes($$0x -> a((ds)$$0x.getSource(), ec.b($$0x, "targets"), eo.f($$0x, "effect"), -1, 0, true)))
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      ec.b($$0x, "targets"),
                                                      eo.f($$0x, "effect"),
                                                      -1,
                                                      IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                      true
                                                   )
                                             ))
                                          .then(
                                             dt.a("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   $$0x -> a(
                                                         (ds)$$0x.getSource(),
                                                         ec.b($$0x, "targets"),
                                                         eo.f($$0x, "effect"),
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

   private static int a(ds $$0, Collection<? extends bfj> $$1, he<bey> $$2, @Nullable Integer $$3, int $$4, boolean $$5) throws CommandSyntaxException {
      bey $$6 = $$2.a();
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

      for (bfj $$13 : $$1) {
         if ($$13 instanceof bfz) {
            bfa $$14 = new bfa($$6, $$8, $$4, false, $$5);
            if (((bfz)$$13).b($$14, $$0.f())) {
               $$7++;
            }
         }
      }

      if ($$7 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.effect.give.success.single", $$6.e(), $$1.iterator().next().H_(), $$8 / 20), true);
         } else {
            $$0.a(() -> sw.a("commands.effect.give.success.multiple", $$6.e(), $$1.size(), $$8 / 20), true);
         }

         return $$7;
      }
   }

   private static int a(ds $$0, Collection<? extends bfj> $$1) throws CommandSyntaxException {
      int $$2 = 0;

      for (bfj $$3 : $$1) {
         if ($$3 instanceof bfz && ((bfz)$$3).en()) {
            $$2++;
         }
      }

      if ($$2 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.effect.clear.everything.success.single", $$1.iterator().next().H_()), true);
         } else {
            $$0.a(() -> sw.a("commands.effect.clear.everything.success.multiple", $$1.size()), true);
         }

         return $$2;
      }
   }

   private static int a(ds $$0, Collection<? extends bfj> $$1, he<bey> $$2) throws CommandSyntaxException {
      bey $$3 = $$2.a();
      int $$4 = 0;

      for (bfj $$5 : $$1) {
         if ($$5 instanceof bfz && ((bfz)$$5).d($$3)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw c.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> sw.a("commands.effect.clear.specific.success.single", $$3.e(), $$1.iterator().next().H_()), true);
         } else {
            $$0.a(() -> sw.a("commands.effect.clear.specific.success.multiple", $$3.e(), $$1.size()), true);
         }

         return $$4;
      }
   }
}
