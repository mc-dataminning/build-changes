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

public class ani {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xa.c("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xa.c("commands.effect.clear.everything.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xa.c("commands.effect.clear.specific.failed"));

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("effect").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ek.a("clear").executes($$0x -> a((ej)$$0x.getSource(), ImmutableList.of(((ej)$$0x.getSource()).g()))))
                     .then(
                        ((RequiredArgumentBuilder)ek.a("targets", ew.b()).executes($$0x -> a((ej)$$0x.getSource(), ew.b($$0x, "targets"))))
                           .then(ek.a("effect", fi.a($$1, mh.W)).executes($$0x -> a((ej)$$0x.getSource(), ew.b($$0x, "targets"), fi.f($$0x, "effect"))))
                     )
               ))
            .then(
               ek.a("give")
                  .then(
                     ek.a("targets", ew.b())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("effect", fi.a($$1, mh.W))
                                    .executes($$0x -> a((ej)$$0x.getSource(), ew.b($$0x, "targets"), fi.f($$0x, "effect"), null, 0, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)ek.a("seconds", IntegerArgumentType.integer(1, 1000000))
                                          .executes(
                                             $$0x -> a(
                                                   (ej)$$0x.getSource(),
                                                   ew.b($$0x, "targets"),
                                                   fi.f($$0x, "effect"),
                                                   IntegerArgumentType.getInteger($$0x, "seconds"),
                                                   0,
                                                   true
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)ek.a("amplifier", IntegerArgumentType.integer(0, 255))
                                                .executes(
                                                   $$0x -> a(
                                                         (ej)$$0x.getSource(),
                                                         ew.b($$0x, "targets"),
                                                         fi.f($$0x, "effect"),
                                                         IntegerArgumentType.getInteger($$0x, "seconds"),
                                                         IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                         true
                                                      )
                                                ))
                                             .then(
                                                ek.a("hideParticles", BoolArgumentType.bool())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ej)$$0x.getSource(),
                                                            ew.b($$0x, "targets"),
                                                            fi.f($$0x, "effect"),
                                                            IntegerArgumentType.getInteger($$0x, "seconds"),
                                                            IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                            !BoolArgumentType.getBool($$0x, "hideParticles")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ek.a("infinite")
                                       .executes($$0x -> a((ej)$$0x.getSource(), ew.b($$0x, "targets"), fi.f($$0x, "effect"), -1, 0, true)))
                                    .then(
                                       ((RequiredArgumentBuilder)ek.a("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                $$0x -> a(
                                                      (ej)$$0x.getSource(),
                                                      ew.b($$0x, "targets"),
                                                      fi.f($$0x, "effect"),
                                                      -1,
                                                      IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                      true
                                                   )
                                             ))
                                          .then(
                                             ek.a("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   $$0x -> a(
                                                         (ej)$$0x.getSource(),
                                                         ew.b($$0x, "targets"),
                                                         fi.f($$0x, "effect"),
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

   private static int a(ej $$0, Collection<? extends bwt> $$1, jf<bvv> $$2, @Nullable Integer $$3, int $$4, boolean $$5) throws CommandSyntaxException {
      bvv $$6 = $$2.a();
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

      for (bwt $$13 : $$1) {
         if ($$13 instanceof bxu) {
            bvx $$14 = new bvx($$2, $$8, $$4, false, $$5);
            if (((bxu)$$13).b($$14, $$0.f())) {
               $$7++;
            }
         }
      }

      if ($$7 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xa.a("commands.effect.give.success.single", $$6.g(), $$1.iterator().next().m_(), $$8 / 20), true);
         } else {
            $$0.a(() -> xa.a("commands.effect.give.success.multiple", $$6.g(), $$1.size(), $$8 / 20), true);
         }

         return $$7;
      }
   }

   private static int a(ej $$0, Collection<? extends bwt> $$1) throws CommandSyntaxException {
      int $$2 = 0;

      for (bwt $$3 : $$1) {
         if ($$3 instanceof bxu && ((bxu)$$3).eC()) {
            $$2++;
         }
      }

      if ($$2 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xa.a("commands.effect.clear.everything.success.single", $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> xa.a("commands.effect.clear.everything.success.multiple", $$1.size()), true);
         }

         return $$2;
      }
   }

   private static int a(ej $$0, Collection<? extends bwt> $$1, jf<bvv> $$2) throws CommandSyntaxException {
      bvv $$3 = $$2.a();
      int $$4 = 0;

      for (bwt $$5 : $$1) {
         if ($$5 instanceof bxu && ((bxu)$$5).e($$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw c.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xa.a("commands.effect.clear.specific.success.single", $$3.g(), $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> xa.a("commands.effect.clear.specific.success.multiple", $$3.g(), $$1.size()), true);
         }

         return $$4;
      }
   }
}
