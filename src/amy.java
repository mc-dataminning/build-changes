import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class amy {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wp.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wp.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wp.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<ex> f = ($$0, $$1) -> {
      alf.a $$2 = ((ex)$$0.getSource()).l().bc();
      return fc.a($$2.a(mc.bi), $$1);
   };

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      LiteralCommandNode<ex> $$2 = $$0.register((LiteralArgumentBuilder)ey.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(ey.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, ey.a("if"), true, $$1)))
                                             .then(a($$2, ey.a("unless"), false, $$1)))
                                          .then(ey.a("as").then(ey.a("targets", fk.b()).fork($$2, $$0x -> {
                                             List<ex> $$1x = Lists.newArrayList();

                                             for (bum $$2x : fk.c($$0x, "targets")) {
                                                $$1x.add(((ex)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ey.a("at").then(ey.a("targets", fk.b()).fork($$2, $$0x -> {
                                          List<ex> $$1x = Lists.newArrayList();

                                          for (bum $$2x : fk.c($$0x, "targets")) {
                                             $$1x.add(((ex)$$0x.getSource()).a((ard)$$2x.dV()).a($$2x.dt()).a($$2x.bU()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)ey.a("store").then(a($$2, ey.a("result"), true))).then(a($$2, ey.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("positioned")
                                             .then(ey.a("pos", ha.a()).redirect($$2, $$0x -> ((ex)$$0x.getSource()).a(ha.a($$0x, "pos")).a(fj.a.a))))
                                          .then(ey.a("as").then(ey.a("targets", fk.b()).fork($$2, $$0x -> {
                                             List<ex> $$1x = Lists.newArrayList();

                                             for (bum $$2x : fk.c($$0x, "targets")) {
                                                $$1x.add(((ex)$$0x.getSource()).a($$2x.dt()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ey.a("over").then(ey.a("heightmap", fn.a()).redirect($$2, $$0x -> {
                                          fbb $$1x = ((ex)$$0x.getSource()).d();
                                          ard $$2x = ((ex)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(kk.b($$3), kk.b($$4))) {
                                             throw gt.a.create();
                                          } else {
                                             int $$5 = $$2x.a(fn.a($$0x, "heightmap"), ayz.a($$3), ayz.a($$4));
                                             return ((ex)$$0x.getSource()).a(new fbb($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ey.a("rotated")
                                       .then(ey.a("rot", gx.a()).redirect($$2, $$0x -> ((ex)$$0x.getSource()).a(gx.a($$0x, "rot").b((ex)$$0x.getSource())))))
                                    .then(ey.a("as").then(ey.a("targets", fk.b()).fork($$2, $$0x -> {
                                       List<ex> $$1x = Lists.newArrayList();

                                       for (bum $$2x : fk.c($$0x, "targets")) {
                                          $$1x.add(((ex)$$0x.getSource()).a($$2x.bU()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ey.a("facing")
                                    .then(ey.a("entity").then(ey.a("targets", fk.b()).then(ey.a("anchor", fj.a()).fork($$2, $$0x -> {
                                       List<ex> $$1x = Lists.newArrayList();
                                       fj.a $$2x = fj.a($$0x, "anchor");

                                       for (bum $$3 : fk.c($$0x, "targets")) {
                                          $$1x.add(((ex)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(ey.a("pos", ha.a()).redirect($$2, $$0x -> ((ex)$$0x.getSource()).b(ha.a($$0x, "pos"))))
                           ))
                        .then(
                           ey.a("align")
                              .then(ey.a("axes", gy.a()).redirect($$2, $$0x -> ((ex)$$0x.getSource()).a(((ex)$$0x.getSource()).d().a(gy.a($$0x, "axes")))))
                        ))
                     .then(ey.a("anchored").then(ey.a("anchor", fj.a()).redirect($$2, $$0x -> ((ex)$$0x.getSource()).a(fj.a($$0x, "anchor"))))))
                  .then(ey.a("in").then(ey.a("dimension", fi.a()).redirect($$2, $$0x -> ((ex)$$0x.getSource()).a(fi.a($$0x, "dimension"))))))
               .then(ey.a("summon").then(ey.a("entity", fw.a($$1, mc.z)).suggests(ix.c).redirect($$2, $$0x -> a((ex)$$0x.getSource(), fw.e($$0x, "entity"))))))
            .then(a($$2, ey.a("on")))
      );
   }

   private static ArgumentBuilder<ex, ?> a(LiteralCommandNode<ex> $$0, LiteralArgumentBuilder<ex> $$1, boolean $$2) {
      $$1.then(
         ey.a("score")
            .then(
               ey.a("targets", gc.b())
                  .suggests(gc.a)
                  .then(ey.a("objective", fr.a()).redirect($$0, $$1x -> a((ex)$$1x.getSource(), gc.c($$1x, "targets"), fr.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         ey.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)ey.a("id", fy.a())
                     .suggests(ami.a)
                     .then(ey.a("value").redirect($$0, $$1x -> a((ex)$$1x.getSource(), ami.a($$1x), true, $$2))))
                  .then(ey.a("max").redirect($$0, $$1x -> a((ex)$$1x.getSource(), ami.a($$1x), false, $$2)))
            )
      );

      for (apo.c $$3 : apo.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a(
                                       "path", fp.a()
                                    )
                                    .then(
                                       ey.a("int")
                                          .then(
                                             ey.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (ex)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         fp.a($$2xx, "path"),
                                                         $$1xxx -> tv.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ey.a("float")
                                       .then(
                                          ey.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (ex)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      fp.a($$2xx, "path"),
                                                      $$1xxx -> tt.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ey.a("short")
                                    .then(
                                       ey.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (ex)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   fp.a($$2xx, "path"),
                                                   $$1xxx -> ui.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ey.a("long")
                                 .then(
                                    ey.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (ex)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                fp.a($$2xx, "path"),
                                                $$1xxx -> ty.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ey.a("double")
                              .then(
                                 ey.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (ex)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             fp.a($$2xx, "path"),
                                             $$1xxx -> tr.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        ey.a("byte")
                           .then(
                              ey.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (ex)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          fp.a($$2xx, "path"),
                                          $$1xxx -> to.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                          $$2
                                       )
                                 )
                           )
                     )
               )
         );
      }

      return $$1;
   }

   private static ex a(ex $$0, Collection<fcf> $$1, fby $$2, boolean $$3) {
      fcg $$4 = $$0.l().aJ();
      return $$0.a(($$4x, $$5) -> {
         for (fcf $$6 : $$1) {
            fce $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, eu::chain);
   }

   private static ex a(ex $$0, alx $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, eu::chain);
   }

   private static ex a(ex $$0, apn $$1, fp.g $$2, IntFunction<un> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            tq $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, eu::chain);
   }

   private static boolean a(ard $$0, ji $$1) {
      dfp $$2 = new dfp($$1);
      dzd $$3 = $$0.m().a($$2.h, $$2.i);
      return $$3 == null ? false : $$3.F() == aqs.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ex, ?> a(CommandNode<ex> $$0, LiteralArgumentBuilder<ex> $$1, boolean $$2, et $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    ey.a("block")
                                       .then(
                                          ey.a("pos", gt.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ey.a("block", gp.a($$3)),
                                                   $$2,
                                                   $$0x -> gp.a($$0x, "block").test(new dxc(((ex)$$0x.getSource()).e(), gt.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    ey.a("biome")
                                       .then(
                                          ey.a("pos", gt.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ey.a("biome", ga.a($$3, mc.aI)),
                                                   $$2,
                                                   $$0x -> ga.a($$0x, "biome", mc.aI).test(((ex)$$0x.getSource()).e().t(gt.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(ey.a("loaded").then(a($$0, ey.a("pos", gt.a()), $$2, $$0x -> a(((ex)$$0x.getSource()).e(), gt.b($$0x, "pos"))))))
                           .then(ey.a("dimension").then(a($$0, ey.a("dimension", fi.a()), $$2, $$0x -> fi.a($$0x, "dimension") == ((ex)$$0x.getSource()).e()))))
                        .then(
                           ey.a("score")
                              .then(
                                 ey.a("target", gc.a())
                                    .suggests(gc.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a(
                                                            "targetObjective", fr.a()
                                                         )
                                                         .then(
                                                            ey.a("=")
                                                               .then(
                                                                  ey.a("source", gc.a())
                                                                     .suggests(gc.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           ey.a("sourceObjective", fr.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (amy.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ey.a("<")
                                                            .then(
                                                               ey.a("source", gc.a())
                                                                  .suggests(gc.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        ey.a("sourceObjective", fr.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (amy.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      ey.a("<=")
                                                         .then(
                                                            ey.a("source", gc.a())
                                                               .suggests(gc.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     ey.a("sourceObjective", fr.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (amy.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ey.a(">")
                                                      .then(
                                                         ey.a("source", gc.a())
                                                            .suggests(gc.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  ey.a("sourceObjective", fr.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (amy.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ey.a(">=")
                                                   .then(
                                                      ey.a("source", gc.a())
                                                         .suggests(gc.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               ey.a("sourceObjective", fr.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (amy.e)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(ey.a("matches").then(a($$0, ey.a("range", fv.a()), $$2, $$0x -> a($$0x, fv.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        ey.a("blocks")
                           .then(
                              ey.a("start", gt.a())
                                 .then(
                                    ey.a("end", gt.a())
                                       .then(
                                          ((RequiredArgumentBuilder)ey.a("destination", gt.a()).then(a($$0, ey.a("all"), $$2, false)))
                                             .then(a($$0, ey.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ey.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)ey.a("entities", fk.b()).fork($$0, $$1x -> a($$1x, $$2, !fk.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (amy.b)($$0x -> fk.c($$0x, "entities").size())))
                        )
                  ))
               .then(ey.a("predicate").then(a($$0, ey.a("predicate", fz.c($$3)).suggests(f), $$2, $$0x -> a((ex)$$0x.getSource(), fz.c($$0x, "predicate"))))))
            .then(ey.a("function").then(ey.a("name", hf.a()).suggests(and.b).fork($$0, new amy.d($$2)))))
         .then(
            ((LiteralArgumentBuilder)ey.a("items")
                  .then(
                     ey.a("entity")
                        .then(
                           ey.a("entities", fk.b())
                              .then(
                                 ey.a("slots", gg.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ey.a("item_predicate", hj.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(fk.b($$1x, "entities"), gg.a($$1x, "slots"), hj.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (amy.b)($$0x -> a(fk.b($$0x, "entities"), gg.a($$0x, "slots"), hj.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  ey.a("block")
                     .then(
                        ey.a("pos", gt.a())
                           .then(
                              ey.a("slots", gg.a())
                                 .then(
                                    ((RequiredArgumentBuilder)ey.a("item_predicate", hj.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((ex)$$1x.getSource(), gt.a($$1x, "pos"), gg.a($$1x, "slots"), hj.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (amy.b)($$0x -> a((ex)$$0x.getSource(), gt.a($$0x, "pos"), gg.a($$0x, "slots"), hj.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (apo.c $$4 : apo.c) {
         $$1.then(
            $$4.a(
               ey.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)ey.a("path", fp.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), fp.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (amy.b)($$1xx -> a($$4.a($$1xx), fp.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends bum> $$0, cub $$1, Predicate<cwq> $$2) {
      int $$3 = 0;

      for (bum $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            bwa $$8 = $$4.a_($$7);
            cwq $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.M();
            }
         }
      }

      return $$3;
   }

   private static int a(ex $$0, ji $$1, cub $$2, Predicate<cwq> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      bse $$5 = ani.a($$0, $$1, ani.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            cwq $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.M();
            }
         }
      }

      return $$4;
   }

   private static Command<ex> a(boolean $$0, amy.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ex)$$1x.getSource()).a(() -> wp.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ex)$$1x.getSource()).a(() -> wp.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(apn $$0, fp.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ex> $$0, amy.e $$1) throws CommandSyntaxException {
      fcf $$2 = gc.a($$0, "target");
      fby $$3 = fr.a($$0, "targetObjective");
      fcf $$4 = gc.a($$0, "source");
      fby $$5 = fr.a($$0, "sourceObjective");
      fcg $$6 = ((ex)$$0.getSource()).l().aJ();
      fcc $$7 = $$6.d($$2, $$3);
      fcc $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<ex> $$0, dk.d $$1) throws CommandSyntaxException {
      fcf $$2 = gc.a($$0, "target");
      fby $$3 = fr.a($$0, "targetObjective");
      fcg $$4 = ((ex)$$0.getSource()).l().aJ();
      fcc $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(ex $$0, jr<ezb> $$1) {
      ard $$2 = $$0.e();
      evv $$3 = new evv.a($$2).a(eym.f, $$0.d()).b(eym.a, $$0.f()).a(eyl.d);
      evs $$4 = new evs.a($$3).a(Optional.empty());
      $$4.b(evs.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<ex> a(CommandContext<ex> $$0, boolean $$1, boolean $$2) {
      return (Collection<ex>)($$2 == $$1 ? Collections.singleton((ex)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ex, ?> a(CommandNode<ex> $$0, ArgumentBuilder<ex, ?> $$1, boolean $$2, amy.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ex)$$2x.getSource()).a(() -> wp.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<ex, ?> a(CommandNode<ex> $$0, ArgumentBuilder<ex, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<ex> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((ex)$$0.getSource()).a(() -> wp.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<ex> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((ex)$$0.getSource()).a(() -> wp.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ex> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ex)$$0.getSource()).e(), gt.a($$0, "start"), gt.a($$0, "end"), gt.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(ard $$0, ji $$1, ji $$2, ji $$3, boolean $$4) throws CommandSyntaxException {
      enf $$5 = enf.a($$1, $$2);
      enf $$6 = enf.a($$3, $$3.a($$5.c()));
      ji $$7 = new ji($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         kf $$9 = $$0.K_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  ji $$14 = new ji($$13, $$12, $$11);
                  ji $$15 = $$14.a((km)$$7);
                  dwy $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(djp.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dua $$17 = $$0.c_($$14);
                     dua $$18 = $$0.c_($$15);
                     if ($$17 != null) {
                        if ($$18 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$18.p() != $$17.p()) {
                           return OptionalInt.empty();
                        }

                        if (!$$17.r().equals($$18.r())) {
                           return OptionalInt.empty();
                        }

                        tq $$19 = $$17.e($$9);
                        tq $$20 = $$18.e($$9);
                        if (!$$19.equals($$20)) {
                           return OptionalInt.empty();
                        }
                     }

                     $$10++;
                  }
               }
            }
         }

         return OptionalInt.of($$10);
      }
   }

   private static RedirectModifier<ex> a(Function<bum, Optional<bum>> $$0) {
      return $$1 -> {
         ex $$2 = (ex)$$1.getSource();
         bum $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dQ()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ex> b(Function<bum, Stream<bum>> $$0) {
      return $$1 -> {
         ex $$2 = (ex)$$1.getSource();
         bum $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dQ()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ex> a(CommandNode<ex> $$0, LiteralArgumentBuilder<ex> $$1) {
      return (LiteralArgumentBuilder<ex>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              ey.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<bum, Optional<bum>>)($$0x -> $$0x instanceof bvp $$1x ? Optional.ofNullable($$1x.ag_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              ey.a("leasher")
                                 .fork(
                                    $$0, a((Function<bum, Optional<bum>>)($$0x -> $$0x instanceof bvg $$1x ? Optional.ofNullable($$1x.D()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           ey.a("target")
                              .fork(
                                 $$0, a((Function<bum, Optional<bum>>)($$0x -> $$0x instanceof bwg $$1x ? Optional.ofNullable($$1x.O_()) : Optional.empty()))
                              )
                        ))
                     .then(
                        ey.a("attacker")
                           .fork($$0, a((Function<bum, Optional<bum>>)($$0x -> $$0x instanceof bug $$1x ? Optional.ofNullable($$1x.am()) : Optional.empty())))
                     ))
                  .then(ey.a("vehicle").fork($$0, a((Function<bum, Optional<bum>>)($$0x -> Optional.ofNullable($$0x.dk()))))))
               .then(ey.a("controller").fork($$0, a((Function<bum, Optional<bum>>)($$0x -> Optional.ofNullable($$0x.cW()))))))
            .then(
               ey.a("origin").fork($$0, a((Function<bum, Optional<bum>>)($$0x -> $$0x instanceof bwh $$1x ? Optional.ofNullable($$1x.p()) : Optional.empty())))
            ))
         .then(ey.a("passengers").fork($$0, b((Function<bum, Stream<bum>>)($$0x -> $$0x.cY().stream()))));
   }

   private static ex a(ex $$0, jr.c<but<?>> $$1) throws CommandSyntaxException {
      bum $$2 = aox.a($$0, $$1, $$0.d(), new tq(), true);
      return $$0.a($$2);
   }

   public static <T extends ez<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable tq $$5, hy<T> $$6, amy.a<T, Collection<il<T>>> $$7, hs $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<il<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<in<T>> $$14 = new ArrayList<>($$13);

         try {
            for (il<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.w()));
               } catch (fa var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            eu $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new ij<>($$2x -> {
               for (in<T> $$3x : $$14) {
                  $$2x.a(new ie<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(ii.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new id.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<ex> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<ex> var1) throws CommandSyntaxException;
   }

   static class d implements hv.a<ex> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ex $$0, List<ex> $$1, ContextChain<ex> $$2, hs $$3, hy<ex> $$4) {
         amy.a($$0, $$1, and::a, this.a, $$2, null, $$4, $$0x -> hf.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
