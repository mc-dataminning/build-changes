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

public class aif {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ur.c("commands.effect.clear.everything.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ur.c("commands.effect.clear.specific.failed"));

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("effect").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)dv.a("clear").executes($$0x -> a((du)$$0x.getSource(), ImmutableList.of(((du)$$0x.getSource()).h()))))
                     .then(
                        ((RequiredArgumentBuilder)dv.a("targets", eg.b()).executes($$0x -> a((du)$$0x.getSource(), eg.b($$0x, "targets"))))
                           .then(dv.a("effect", es.a($$1, jz.P)).executes($$0x -> a((du)$$0x.getSource(), eg.b($$0x, "targets"), es.f($$0x, "effect"))))
                     )
               ))
            .then(
               dv.a("give")
                  .then(
                     dv.a("targets", eg.b())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("effect", es.a($$1, jz.P))
                                    .executes($$0x -> a((du)$$0x.getSource(), eg.b($$0x, "targets"), es.f($$0x, "effect"), null, 0, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)dv.a("seconds", IntegerArgumentType.integer(1, 1000000))
                                          .executes(
                                             $$0x -> a(
                                                   (du)$$0x.getSource(),
                                                   eg.b($$0x, "targets"),
                                                   es.f($$0x, "effect"),
                                                   IntegerArgumentType.getInteger($$0x, "seconds"),
                                                   0,
                                                   true
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)dv.a("amplifier", IntegerArgumentType.integer(0, 255))
                                                .executes(
                                                   $$0x -> a(
                                                         (du)$$0x.getSource(),
                                                         eg.b($$0x, "targets"),
                                                         es.f($$0x, "effect"),
                                                         IntegerArgumentType.getInteger($$0x, "seconds"),
                                                         IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                         true
                                                      )
                                                ))
                                             .then(
                                                dv.a("hideParticles", BoolArgumentType.bool())
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(),
                                                            eg.b($$0x, "targets"),
                                                            es.f($$0x, "effect"),
                                                            IntegerArgumentType.getInteger($$0x, "seconds"),
                                                            IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                            !BoolArgumentType.getBool($$0x, "hideParticles")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)dv.a("infinite")
                                       .executes($$0x -> a((du)$$0x.getSource(), eg.b($$0x, "targets"), es.f($$0x, "effect"), -1, 0, true)))
                                    .then(
                                       ((RequiredArgumentBuilder)dv.a("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      eg.b($$0x, "targets"),
                                                      es.f($$0x, "effect"),
                                                      -1,
                                                      IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                      true
                                                   )
                                             ))
                                          .then(
                                             dv.a("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   $$0x -> a(
                                                         (du)$$0x.getSource(),
                                                         eg.b($$0x, "targets"),
                                                         es.f($$0x, "effect"),
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

   private static int a(du $$0, Collection<? extends bkq> $$1, ib<bkb> $$2, @Nullable Integer $$3, int $$4, boolean $$5) throws CommandSyntaxException {
      bkb $$6 = $$2.a();
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

      for (bkq $$13 : $$1) {
         if ($$13 instanceof blg) {
            bkd $$14 = new bkd($$6, $$8, $$4, false, $$5);
            if (((blg)$$13).b($$14, $$0.g())) {
               $$7++;
            }
         }
      }

      if ($$7 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> ur.a("commands.effect.give.success.single", $$6.e(), $$1.iterator().next().P_(), $$8 / 20), true);
         } else {
            $$0.a(() -> ur.a("commands.effect.give.success.multiple", $$6.e(), $$1.size(), $$8 / 20), true);
         }

         return $$7;
      }
   }

   private static int a(du $$0, Collection<? extends bkq> $$1) throws CommandSyntaxException {
      int $$2 = 0;

      for (bkq $$3 : $$1) {
         if ($$3 instanceof blg && ((blg)$$3).es()) {
            $$2++;
         }
      }

      if ($$2 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> ur.a("commands.effect.clear.everything.success.single", $$1.iterator().next().P_()), true);
         } else {
            $$0.a(() -> ur.a("commands.effect.clear.everything.success.multiple", $$1.size()), true);
         }

         return $$2;
      }
   }

   private static int a(du $$0, Collection<? extends bkq> $$1, ib<bkb> $$2) throws CommandSyntaxException {
      bkb $$3 = $$2.a();
      int $$4 = 0;

      for (bkq $$5 : $$1) {
         if ($$5 instanceof blg && ((blg)$$5).d($$3)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw c.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> ur.a("commands.effect.clear.specific.success.single", $$3.e(), $$1.iterator().next().P_()), true);
         } else {
            $$0.a(() -> ur.a("commands.effect.clear.specific.success.multiple", $$3.e(), $$1.size()), true);
         }

         return $$4;
      }
   }
}
