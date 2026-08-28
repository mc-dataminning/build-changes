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

public class anj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xj.c("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xj.c("commands.effect.clear.everything.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xj.c("commands.effect.clear.specific.failed"));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("effect").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ex.a("clear").executes($$0x -> a((ew)$$0x.getSource(), ImmutableList.of(((ew)$$0x.getSource()).g()))))
                     .then(
                        ((RequiredArgumentBuilder)ex.a("targets", fj.b()).executes($$0x -> a((ew)$$0x.getSource(), fj.b($$0x, "targets"))))
                           .then(ex.a("effect", fv.a($$1, ma.W)).executes($$0x -> a((ew)$$0x.getSource(), fj.b($$0x, "targets"), fv.f($$0x, "effect"))))
                     )
               ))
            .then(
               ex.a("give")
                  .then(
                     ex.a("targets", fj.b())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("effect", fv.a($$1, ma.W))
                                    .executes($$0x -> a((ew)$$0x.getSource(), fj.b($$0x, "targets"), fv.f($$0x, "effect"), null, 0, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)ex.a("seconds", IntegerArgumentType.integer(1, 1000000))
                                          .executes(
                                             $$0x -> a(
                                                   (ew)$$0x.getSource(),
                                                   fj.b($$0x, "targets"),
                                                   fv.f($$0x, "effect"),
                                                   IntegerArgumentType.getInteger($$0x, "seconds"),
                                                   0,
                                                   true
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)ex.a("amplifier", IntegerArgumentType.integer(0, 255))
                                                .executes(
                                                   $$0x -> a(
                                                         (ew)$$0x.getSource(),
                                                         fj.b($$0x, "targets"),
                                                         fv.f($$0x, "effect"),
                                                         IntegerArgumentType.getInteger($$0x, "seconds"),
                                                         IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                         true
                                                      )
                                                ))
                                             .then(
                                                ex.a("hideParticles", BoolArgumentType.bool())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ew)$$0x.getSource(),
                                                            fj.b($$0x, "targets"),
                                                            fv.f($$0x, "effect"),
                                                            IntegerArgumentType.getInteger($$0x, "seconds"),
                                                            IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                            !BoolArgumentType.getBool($$0x, "hideParticles")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ex.a("infinite")
                                       .executes($$0x -> a((ew)$$0x.getSource(), fj.b($$0x, "targets"), fv.f($$0x, "effect"), -1, 0, true)))
                                    .then(
                                       ((RequiredArgumentBuilder)ex.a("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                $$0x -> a(
                                                      (ew)$$0x.getSource(),
                                                      fj.b($$0x, "targets"),
                                                      fv.f($$0x, "effect"),
                                                      -1,
                                                      IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                      true
                                                   )
                                             ))
                                          .then(
                                             ex.a("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   $$0x -> a(
                                                         (ew)$$0x.getSource(),
                                                         fj.b($$0x, "targets"),
                                                         fv.f($$0x, "effect"),
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

   private static int a(ew $$0, Collection<? extends bul> $$1, jq<bto> $$2, @Nullable Integer $$3, int $$4, boolean $$5) throws CommandSyntaxException {
      bto $$6 = $$2.a();
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

      for (bul $$13 : $$1) {
         if ($$13 instanceof bvh) {
            btq $$14 = new btq($$2, $$8, $$4, false, $$5);
            if (((bvh)$$13).b($$14, $$0.f())) {
               $$7++;
            }
         }
      }

      if ($$7 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xj.a("commands.effect.give.success.single", $$6.e(), $$1.iterator().next().o_(), $$8 / 20), true);
         } else {
            $$0.a(() -> xj.a("commands.effect.give.success.multiple", $$6.e(), $$1.size(), $$8 / 20), true);
         }

         return $$7;
      }
   }

   private static int a(ew $$0, Collection<? extends bul> $$1) throws CommandSyntaxException {
      int $$2 = 0;

      for (bul $$3 : $$1) {
         if ($$3 instanceof bvh && ((bvh)$$3).ez()) {
            $$2++;
         }
      }

      if ($$2 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xj.a("commands.effect.clear.everything.success.single", $$1.iterator().next().o_()), true);
         } else {
            $$0.a(() -> xj.a("commands.effect.clear.everything.success.multiple", $$1.size()), true);
         }

         return $$2;
      }
   }

   private static int a(ew $$0, Collection<? extends bul> $$1, jq<bto> $$2) throws CommandSyntaxException {
      bto $$3 = $$2.a();
      int $$4 = 0;

      for (bul $$5 : $$1) {
         if ($$5 instanceof bvh && ((bvh)$$5).e($$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw c.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xj.a("commands.effect.clear.specific.success.single", $$3.e(), $$1.iterator().next().o_()), true);
         } else {
            $$0.a(() -> xj.a("commands.effect.clear.specific.success.multiple", $$3.e(), $$1.size()), true);
         }

         return $$4;
      }
   }
}
