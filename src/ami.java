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

public class ami {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.effect.clear.everything.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("commands.effect.clear.specific.failed"));

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("effect").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)er.a("clear").executes($$0x -> a((eq)$$0x.getSource(), ImmutableList.of(((eq)$$0x.getSource()).g()))))
                     .then(
                        ((RequiredArgumentBuilder)er.a("targets", fd.b()).executes($$0x -> a((eq)$$0x.getSource(), fd.b($$0x, "targets"))))
                           .then(er.a("effect", fp.a($$1, lr.V)).executes($$0x -> a((eq)$$0x.getSource(), fd.b($$0x, "targets"), fp.f($$0x, "effect"))))
                     )
               ))
            .then(
               er.a("give")
                  .then(
                     er.a("targets", fd.b())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("effect", fp.a($$1, lr.V))
                                    .executes($$0x -> a((eq)$$0x.getSource(), fd.b($$0x, "targets"), fp.f($$0x, "effect"), null, 0, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)er.a("seconds", IntegerArgumentType.integer(1, 1000000))
                                          .executes(
                                             $$0x -> a(
                                                   (eq)$$0x.getSource(),
                                                   fd.b($$0x, "targets"),
                                                   fp.f($$0x, "effect"),
                                                   IntegerArgumentType.getInteger($$0x, "seconds"),
                                                   0,
                                                   true
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)er.a("amplifier", IntegerArgumentType.integer(0, 255))
                                                .executes(
                                                   $$0x -> a(
                                                         (eq)$$0x.getSource(),
                                                         fd.b($$0x, "targets"),
                                                         fp.f($$0x, "effect"),
                                                         IntegerArgumentType.getInteger($$0x, "seconds"),
                                                         IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                         true
                                                      )
                                                ))
                                             .then(
                                                er.a("hideParticles", BoolArgumentType.bool())
                                                   .executes(
                                                      $$0x -> a(
                                                            (eq)$$0x.getSource(),
                                                            fd.b($$0x, "targets"),
                                                            fp.f($$0x, "effect"),
                                                            IntegerArgumentType.getInteger($$0x, "seconds"),
                                                            IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                            !BoolArgumentType.getBool($$0x, "hideParticles")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)er.a("infinite")
                                       .executes($$0x -> a((eq)$$0x.getSource(), fd.b($$0x, "targets"), fp.f($$0x, "effect"), -1, 0, true)))
                                    .then(
                                       ((RequiredArgumentBuilder)er.a("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                $$0x -> a(
                                                      (eq)$$0x.getSource(),
                                                      fd.b($$0x, "targets"),
                                                      fp.f($$0x, "effect"),
                                                      -1,
                                                      IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                      true
                                                   )
                                             ))
                                          .then(
                                             er.a("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   $$0x -> a(
                                                         (eq)$$0x.getSource(),
                                                         fd.b($$0x, "targets"),
                                                         fp.f($$0x, "effect"),
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

   private static int a(eq $$0, Collection<? extends bsh> $$1, jj<brn> $$2, @Nullable Integer $$3, int $$4, boolean $$5) throws CommandSyntaxException {
      brn $$6 = $$2.a();
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

      for (bsh $$13 : $$1) {
         if ($$13 instanceof btc) {
            brp $$14 = new brp($$2, $$8, $$4, false, $$5);
            if (((btc)$$13).b($$14, $$0.f())) {
               $$7++;
            }
         }
      }

      if ($$7 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wu.a("commands.effect.give.success.single", $$6.e(), $$1.iterator().next().O_(), $$8 / 20), true);
         } else {
            $$0.a(() -> wu.a("commands.effect.give.success.multiple", $$6.e(), $$1.size(), $$8 / 20), true);
         }

         return $$7;
      }
   }

   private static int a(eq $$0, Collection<? extends bsh> $$1) throws CommandSyntaxException {
      int $$2 = 0;

      for (bsh $$3 : $$1) {
         if ($$3 instanceof btc && ((btc)$$3).eu()) {
            $$2++;
         }
      }

      if ($$2 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wu.a("commands.effect.clear.everything.success.single", $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wu.a("commands.effect.clear.everything.success.multiple", $$1.size()), true);
         }

         return $$2;
      }
   }

   private static int a(eq $$0, Collection<? extends bsh> $$1, jj<brn> $$2) throws CommandSyntaxException {
      brn $$3 = $$2.a();
      int $$4 = 0;

      for (bsh $$5 : $$1) {
         if ($$5 instanceof btc && ((btc)$$5).e($$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw c.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wu.a("commands.effect.clear.specific.success.single", $$3.e(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wu.a("commands.effect.clear.specific.success.multiple", $$3.e(), $$1.size()), true);
         }

         return $$4;
      }
   }
}
