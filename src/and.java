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

public class and {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wv.c("commands.effect.clear.everything.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wv.c("commands.effect.clear.specific.failed"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("effect").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ey.a("clear").executes($$0x -> a((ex)$$0x.getSource(), ImmutableList.of(((ex)$$0x.getSource()).g()))))
                     .then(
                        ((RequiredArgumentBuilder)ey.a("targets", fk.b()).executes($$0x -> a((ex)$$0x.getSource(), fk.b($$0x, "targets"))))
                           .then(ey.a("effect", fw.a($$1, me.W)).executes($$0x -> a((ex)$$0x.getSource(), fk.b($$0x, "targets"), fw.f($$0x, "effect"))))
                     )
               ))
            .then(
               ey.a("give")
                  .then(
                     ey.a("targets", fk.b())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("effect", fw.a($$1, me.W))
                                    .executes($$0x -> a((ex)$$0x.getSource(), fk.b($$0x, "targets"), fw.f($$0x, "effect"), null, 0, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)ey.a("seconds", IntegerArgumentType.integer(1, 1000000))
                                          .executes(
                                             $$0x -> a(
                                                   (ex)$$0x.getSource(),
                                                   fk.b($$0x, "targets"),
                                                   fw.f($$0x, "effect"),
                                                   IntegerArgumentType.getInteger($$0x, "seconds"),
                                                   0,
                                                   true
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)ey.a("amplifier", IntegerArgumentType.integer(0, 255))
                                                .executes(
                                                   $$0x -> a(
                                                         (ex)$$0x.getSource(),
                                                         fk.b($$0x, "targets"),
                                                         fw.f($$0x, "effect"),
                                                         IntegerArgumentType.getInteger($$0x, "seconds"),
                                                         IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                         true
                                                      )
                                                ))
                                             .then(
                                                ey.a("hideParticles", BoolArgumentType.bool())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ex)$$0x.getSource(),
                                                            fk.b($$0x, "targets"),
                                                            fw.f($$0x, "effect"),
                                                            IntegerArgumentType.getInteger($$0x, "seconds"),
                                                            IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                            !BoolArgumentType.getBool($$0x, "hideParticles")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ey.a("infinite")
                                       .executes($$0x -> a((ex)$$0x.getSource(), fk.b($$0x, "targets"), fw.f($$0x, "effect"), -1, 0, true)))
                                    .then(
                                       ((RequiredArgumentBuilder)ey.a("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                $$0x -> a(
                                                      (ex)$$0x.getSource(),
                                                      fk.b($$0x, "targets"),
                                                      fw.f($$0x, "effect"),
                                                      -1,
                                                      IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                      true
                                                   )
                                             ))
                                          .then(
                                             ey.a("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   $$0x -> a(
                                                         (ex)$$0x.getSource(),
                                                         fk.b($$0x, "targets"),
                                                         fw.f($$0x, "effect"),
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

   private static int a(ex $$0, Collection<? extends bvs> $$1, js<buu> $$2, @Nullable Integer $$3, int $$4, boolean $$5) throws CommandSyntaxException {
      buu $$6 = $$2.a();
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

      for (bvs $$13 : $$1) {
         if ($$13 instanceof bwr) {
            buw $$14 = new buw($$2, $$8, $$4, false, $$5);
            if (((bwr)$$13).b($$14, $$0.f())) {
               $$7++;
            }
         }
      }

      if ($$7 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wv.a("commands.effect.give.success.single", $$6.g(), $$1.iterator().next().m_(), $$8 / 20), true);
         } else {
            $$0.a(() -> wv.a("commands.effect.give.success.multiple", $$6.g(), $$1.size(), $$8 / 20), true);
         }

         return $$7;
      }
   }

   private static int a(ex $$0, Collection<? extends bvs> $$1) throws CommandSyntaxException {
      int $$2 = 0;

      for (bvs $$3 : $$1) {
         if ($$3 instanceof bwr && ((bwr)$$3).eB()) {
            $$2++;
         }
      }

      if ($$2 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wv.a("commands.effect.clear.everything.success.single", $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wv.a("commands.effect.clear.everything.success.multiple", $$1.size()), true);
         }

         return $$2;
      }
   }

   private static int a(ex $$0, Collection<? extends bvs> $$1, js<buu> $$2) throws CommandSyntaxException {
      buu $$3 = $$2.a();
      int $$4 = 0;

      for (bvs $$5 : $$1) {
         if ($$5 instanceof bwr && ((bwr)$$5).e($$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw c.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wv.a("commands.effect.clear.specific.success.single", $$3.g(), $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wv.a("commands.effect.clear.specific.success.multiple", $$3.g(), $$1.size()), true);
         }

         return $$4;
      }
   }
}
