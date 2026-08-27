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

public class aml {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.effect.clear.everything.failed"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wx.c("commands.effect.clear.specific.failed"));

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("effect").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)ef.a("clear").executes($$0x -> a((ee)$$0x.getSource(), ImmutableList.of(((ee)$$0x.getSource()).g()))))
                     .then(
                        ((RequiredArgumentBuilder)ef.a("targets", er.b()).executes($$0x -> a((ee)$$0x.getSource(), er.b($$0x, "targets"))))
                           .then(ef.a("effect", fd.a($$1, lf.R)).executes($$0x -> a((ee)$$0x.getSource(), er.b($$0x, "targets"), fd.f($$0x, "effect"))))
                     )
               ))
            .then(
               ef.a("give")
                  .then(
                     ef.a("targets", er.b())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("effect", fd.a($$1, lf.R))
                                    .executes($$0x -> a((ee)$$0x.getSource(), er.b($$0x, "targets"), fd.f($$0x, "effect"), null, 0, true)))
                                 .then(
                                    ((RequiredArgumentBuilder)ef.a("seconds", IntegerArgumentType.integer(1, 1000000))
                                          .executes(
                                             $$0x -> a(
                                                   (ee)$$0x.getSource(),
                                                   er.b($$0x, "targets"),
                                                   fd.f($$0x, "effect"),
                                                   IntegerArgumentType.getInteger($$0x, "seconds"),
                                                   0,
                                                   true
                                                )
                                          ))
                                       .then(
                                          ((RequiredArgumentBuilder)ef.a("amplifier", IntegerArgumentType.integer(0, 255))
                                                .executes(
                                                   $$0x -> a(
                                                         (ee)$$0x.getSource(),
                                                         er.b($$0x, "targets"),
                                                         fd.f($$0x, "effect"),
                                                         IntegerArgumentType.getInteger($$0x, "seconds"),
                                                         IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                         true
                                                      )
                                                ))
                                             .then(
                                                ef.a("hideParticles", BoolArgumentType.bool())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ee)$$0x.getSource(),
                                                            er.b($$0x, "targets"),
                                                            fd.f($$0x, "effect"),
                                                            IntegerArgumentType.getInteger($$0x, "seconds"),
                                                            IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                            !BoolArgumentType.getBool($$0x, "hideParticles")
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ef.a("infinite")
                                       .executes($$0x -> a((ee)$$0x.getSource(), er.b($$0x, "targets"), fd.f($$0x, "effect"), -1, 0, true)))
                                    .then(
                                       ((RequiredArgumentBuilder)ef.a("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                $$0x -> a(
                                                      (ee)$$0x.getSource(),
                                                      er.b($$0x, "targets"),
                                                      fd.f($$0x, "effect"),
                                                      -1,
                                                      IntegerArgumentType.getInteger($$0x, "amplifier"),
                                                      true
                                                   )
                                             ))
                                          .then(
                                             ef.a("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   $$0x -> a(
                                                         (ee)$$0x.getSource(),
                                                         er.b($$0x, "targets"),
                                                         fd.f($$0x, "effect"),
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

   private static int a(ee $$0, Collection<? extends brw> $$1, ix<brc> $$2, @Nullable Integer $$3, int $$4, boolean $$5) throws CommandSyntaxException {
      brc $$6 = $$2.a();
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

      for (brw $$13 : $$1) {
         if ($$13 instanceof bsq) {
            bre $$14 = new bre($$2, $$8, $$4, false, $$5);
            if (((bsq)$$13).b($$14, $$0.f())) {
               $$7++;
            }
         }
      }

      if ($$7 == 0) {
         throw a.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wx.a("commands.effect.give.success.single", $$6.e(), $$1.iterator().next().O_(), $$8 / 20), true);
         } else {
            $$0.a(() -> wx.a("commands.effect.give.success.multiple", $$6.e(), $$1.size(), $$8 / 20), true);
         }

         return $$7;
      }
   }

   private static int a(ee $$0, Collection<? extends brw> $$1) throws CommandSyntaxException {
      int $$2 = 0;

      for (brw $$3 : $$1) {
         if ($$3 instanceof bsq && ((bsq)$$3).ew()) {
            $$2++;
         }
      }

      if ($$2 == 0) {
         throw b.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wx.a("commands.effect.clear.everything.success.single", $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wx.a("commands.effect.clear.everything.success.multiple", $$1.size()), true);
         }

         return $$2;
      }
   }

   private static int a(ee $$0, Collection<? extends brw> $$1, ix<brc> $$2) throws CommandSyntaxException {
      brc $$3 = $$2.a();
      int $$4 = 0;

      for (brw $$5 : $$1) {
         if ($$5 instanceof bsq && ((bsq)$$5).e($$2)) {
            $$4++;
         }
      }

      if ($$4 == 0) {
         throw c.create();
      } else {
         if ($$1.size() == 1) {
            $$0.a(() -> wx.a("commands.effect.clear.specific.success.single", $$3.e(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wx.a("commands.effect.clear.specific.success.multiple", $$3.e(), $$1.size()), true);
         }

         return $$4;
      }
   }
}
