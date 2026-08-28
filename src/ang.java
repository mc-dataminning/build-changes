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

public class ang {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.effect.clear.everything.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.c("commands.effect.clear.specific.failed"));

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("effect").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ej.a("clear").executes($$0x -> a((ei)$$0x.getSource(), ImmutableList.of(((ei)$$0x.getSource()).g()))))
                     .then(
                        ((RequiredArgumentBuilder)ej.a("targets", ev.b()).executes($$0x -> a((ei)$$0x.getSource(), ev.b($$0x, "targets"))))
                           .then(ej.a("effect", fh.a($$1, mg.W)).executes($$0x -> a((ei)$$0x.getSource(), ev.b($$0x, "targets"), fh.f($$0x, "effect"))))
                     )
               ))
            .then(
               ej.a("give")
                  .then(
                     ej.a("targets", ev.b())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("effect", fh.a($$1, mg.W))
                                    .executes($$0x -> a((ei)$$0x.getSource(), ev.b($$0x, "targets"), fh.f($$0x, "effect"), null, 0, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)ej.a("seconds", IntegerArgumentType.integer(1, 1000000))
                                          .executes(
                                             $$0x -> a(
                                                   (ei)$$0x.getSource(),
                                                   ev.b($$0x, "targets"),
                                                   fh.f($$0x, "effect"),
                                                   IntegerArgumentType.getInteger($$0x, "seconds"),
                                                   0,
                                                   true
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)ej.a("amplifier", IntegerArgumentType.integer(0, 255))
                                                .executes(
                                                   $$0x -> a(
                                                         (ei)$$0x.getSource(),
                                                         ev.b($$0x, "targets"),
                                                         fh.f($$0x, "effect"),
                                                         IntegerArgumentType.getInteger($$0x, "seconds"),
                                                         IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                         true
                                                      )
                                                ))
                                             .then(
                                                ej.a("hideParticles", BoolArgumentType.bool())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ei)$$0x.getSource(),
                                                            ev.b($$0x, "targets"),
                                                            fh.f($$0x, "effect"),
                                                            IntegerArgumentType.getInteger($$0x, "seconds"),
                                                            IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                            !BoolArgumentType.getBool($$0x, "hideParticles")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ej.a("infinite")
                                       .executes($$0x -> a((ei)$$0x.getSource(), ev.b($$0x, "targets"), fh.f($$0x, "effect"), -1, 0, true)))
                                    .then(
                                       ((RequiredArgumentBuilder)ej.a("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                $$0x -> a(
                                                      (ei)$$0x.getSource(),
                                                      ev.b($$0x, "targets"),
                                                      fh.f($$0x, "effect"),
                                                      -1,
                                                      IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                      true
                                                   )
                                             ))
                                          .then(
                                             ej.a("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   $$0x -> a(
                                                         (ei)$$0x.getSource(),
                                                         ev.b($$0x, "targets"),
                                                         fh.f($$0x, "effect"),
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

   private static int a(ei $$0, Collection<? extends bwf> $$1, je<bvh> $$2, @Nullable Integer $$3, int $$4, boolean $$5) throws CommandSyntaxException {
      bvh $$6 = $$2.a();
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

      for (bwf $$13 : $$1) {
         if ($$13 instanceof bxe) {
            bvj $$14 = new bvj($$2, $$8, $$4, false, $$5);
            if (((bxe)$$13).b($$14, $$0.f())) {
               $$7++;
            }
         }
      }

      if ($$7 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wy.a("commands.effect.give.success.single", $$6.g(), $$1.iterator().next().m_(), $$8 / 20), true);
         } else {
            $$0.a(() -> wy.a("commands.effect.give.success.multiple", $$6.g(), $$1.size(), $$8 / 20), true);
         }

         return $$7;
      }
   }

   private static int a(ei $$0, Collection<? extends bwf> $$1) throws CommandSyntaxException {
      int $$2 = 0;

      for (bwf $$3 : $$1) {
         if ($$3 instanceof bxe && ((bxe)$$3).eC()) {
            $$2++;
         }
      }

      if ($$2 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wy.a("commands.effect.clear.everything.success.single", $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wy.a("commands.effect.clear.everything.success.multiple", $$1.size()), true);
         }

         return $$2;
      }
   }

   private static int a(ei $$0, Collection<? extends bwf> $$1, je<bvh> $$2) throws CommandSyntaxException {
      bvh $$3 = $$2.a();
      int $$4 = 0;

      for (bwf $$5 : $$1) {
         if ($$5 instanceof bxe && ((bxe)$$5).e($$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw c.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wy.a("commands.effect.clear.specific.success.single", $$3.g(), $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wy.a("commands.effect.clear.specific.success.multiple", $$3.g(), $$1.size()), true);
         }

         return $$4;
      }
   }
}
