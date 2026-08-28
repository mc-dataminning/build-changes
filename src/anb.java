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

public class anb {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.effect.clear.everything.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xd.c("commands.effect.clear.specific.failed"));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("effect").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)eu.a("clear").executes($$0x -> a((et)$$0x.getSource(), ImmutableList.of(((et)$$0x.getSource()).g()))))
                     .then(
                        ((RequiredArgumentBuilder)eu.a("targets", fg.b()).executes($$0x -> a((et)$$0x.getSource(), fg.b($$0x, "targets"))))
                           .then(eu.a("effect", fs.a($$1, lv.W)).executes($$0x -> a((et)$$0x.getSource(), fg.b($$0x, "targets"), fs.f($$0x, "effect"))))
                     )
               ))
            .then(
               eu.a("give")
                  .then(
                     eu.a("targets", fg.b())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("effect", fs.a($$1, lv.W))
                                    .executes($$0x -> a((et)$$0x.getSource(), fg.b($$0x, "targets"), fs.f($$0x, "effect"), null, 0, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)eu.a("seconds", IntegerArgumentType.integer(1, 1000000))
                                          .executes(
                                             $$0x -> a(
                                                   (et)$$0x.getSource(),
                                                   fg.b($$0x, "targets"),
                                                   fs.f($$0x, "effect"),
                                                   IntegerArgumentType.getInteger($$0x, "seconds"),
                                                   0,
                                                   true
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)eu.a("amplifier", IntegerArgumentType.integer(0, 255))
                                                .executes(
                                                   $$0x -> a(
                                                         (et)$$0x.getSource(),
                                                         fg.b($$0x, "targets"),
                                                         fs.f($$0x, "effect"),
                                                         IntegerArgumentType.getInteger($$0x, "seconds"),
                                                         IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                         true
                                                      )
                                                ))
                                             .then(
                                                eu.a("hideParticles", BoolArgumentType.bool())
                                                   .executes(
                                                      $$0x -> a(
                                                            (et)$$0x.getSource(),
                                                            fg.b($$0x, "targets"),
                                                            fs.f($$0x, "effect"),
                                                            IntegerArgumentType.getInteger($$0x, "seconds"),
                                                            IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                            !BoolArgumentType.getBool($$0x, "hideParticles")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)eu.a("infinite")
                                       .executes($$0x -> a((et)$$0x.getSource(), fg.b($$0x, "targets"), fs.f($$0x, "effect"), -1, 0, true)))
                                    .then(
                                       ((RequiredArgumentBuilder)eu.a("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                $$0x -> a(
                                                      (et)$$0x.getSource(),
                                                      fg.b($$0x, "targets"),
                                                      fs.f($$0x, "effect"),
                                                      -1,
                                                      IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                      true
                                                   )
                                             ))
                                          .then(
                                             eu.a("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   $$0x -> a(
                                                         (et)$$0x.getSource(),
                                                         fg.b($$0x, "targets"),
                                                         fs.f($$0x, "effect"),
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

   private static int a(et $$0, Collection<? extends btj> $$1, jn<bso> $$2, @Nullable Integer $$3, int $$4, boolean $$5) throws CommandSyntaxException {
      bso $$6 = $$2.a();
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

      for (btj $$13 : $$1) {
         if ($$13 instanceof buf) {
            bsq $$14 = new bsq($$2, $$8, $$4, false, $$5);
            if (((buf)$$13).b($$14, $$0.f())) {
               $$7++;
            }
         }
      }

      if ($$7 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xd.a("commands.effect.give.success.single", $$6.e(), $$1.iterator().next().Q_(), $$8 / 20), true);
         } else {
            $$0.a(() -> xd.a("commands.effect.give.success.multiple", $$6.e(), $$1.size(), $$8 / 20), true);
         }

         return $$7;
      }
   }

   private static int a(et $$0, Collection<? extends btj> $$1) throws CommandSyntaxException {
      int $$2 = 0;

      for (btj $$3 : $$1) {
         if ($$3 instanceof buf && ((buf)$$3).ew()) {
            $$2++;
         }
      }

      if ($$2 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xd.a("commands.effect.clear.everything.success.single", $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> xd.a("commands.effect.clear.everything.success.multiple", $$1.size()), true);
         }

         return $$2;
      }
   }

   private static int a(et $$0, Collection<? extends btj> $$1, jn<bso> $$2) throws CommandSyntaxException {
      bso $$3 = $$2.a();
      int $$4 = 0;

      for (btj $$5 : $$1) {
         if ($$5 instanceof buf && ((buf)$$5).e($$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw c.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> xd.a("commands.effect.clear.specific.success.single", $$3.e(), $$1.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> xd.a("commands.effect.clear.specific.success.multiple", $$3.e(), $$1.size()), true);
         }

         return $$4;
      }
   }
}
