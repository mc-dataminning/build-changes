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

public class anm {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xj.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xj.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xj.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xj.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<ew> f = ($$0, $$1) -> {
      alt.a $$2 = ((ew)$$0.getSource()).l().bc();
      return fb.a($$2.a(ma.bf), $$1);
   };

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      LiteralCommandNode<ew> $$2 = $$0.register((LiteralArgumentBuilder)ex.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(ex.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, ex.a("if"), true, $$1)))
                                             .then(a($$2, ex.a("unless"), false, $$1)))
                                          .then(ex.a("as").then(ex.a("targets", fj.b()).fork($$2, $$0x -> {
                                             List<ew> $$1x = Lists.newArrayList();

                                             for (bul $$2x : fj.c($$0x, "targets")) {
                                                $$1x.add(((ew)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ex.a("at").then(ex.a("targets", fj.b()).fork($$2, $$0x -> {
                                          List<ew> $$1x = Lists.newArrayList();

                                          for (bul $$2x : fj.c($$0x, "targets")) {
                                             $$1x.add(((ew)$$0x.getSource()).a((arp)$$2x.dV()).a($$2x.dt()).a($$2x.bU()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)ex.a("store").then(a($$2, ex.a("result"), true))).then(a($$2, ex.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("positioned")
                                             .then(ex.a("pos", gz.a()).redirect($$2, $$0x -> ((ew)$$0x.getSource()).a(gz.a($$0x, "pos")).a(fi.a.a))))
                                          .then(ex.a("as").then(ex.a("targets", fj.b()).fork($$2, $$0x -> {
                                             List<ew> $$1x = Lists.newArrayList();

                                             for (bul $$2x : fj.c($$0x, "targets")) {
                                                $$1x.add(((ew)$$0x.getSource()).a($$2x.dt()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ex.a("over").then(ex.a("heightmap", fm.a()).redirect($$2, $$0x -> {
                                          ezy $$1x = ((ew)$$0x.getSource()).d();
                                          arp $$2x = ((ew)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(kj.b($$3), kj.b($$4))) {
                                             throw gs.a.create();
                                          } else {
                                             int $$5 = $$2x.a(fm.a($$0x, "heightmap"), azm.a($$3), azm.a($$4));
                                             return ((ew)$$0x.getSource()).a(new ezy($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ex.a("rotated")
                                       .then(ex.a("rot", gw.a()).redirect($$2, $$0x -> ((ew)$$0x.getSource()).a(gw.a($$0x, "rot").b((ew)$$0x.getSource())))))
                                    .then(ex.a("as").then(ex.a("targets", fj.b()).fork($$2, $$0x -> {
                                       List<ew> $$1x = Lists.newArrayList();

                                       for (bul $$2x : fj.c($$0x, "targets")) {
                                          $$1x.add(((ew)$$0x.getSource()).a($$2x.bU()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ex.a("facing")
                                    .then(ex.a("entity").then(ex.a("targets", fj.b()).then(ex.a("anchor", fi.a()).fork($$2, $$0x -> {
                                       List<ew> $$1x = Lists.newArrayList();
                                       fi.a $$2x = fi.a($$0x, "anchor");

                                       for (bul $$3 : fj.c($$0x, "targets")) {
                                          $$1x.add(((ew)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(ex.a("pos", gz.a()).redirect($$2, $$0x -> ((ew)$$0x.getSource()).b(gz.a($$0x, "pos"))))
                           ))
                        .then(
                           ex.a("align")
                              .then(ex.a("axes", gx.a()).redirect($$2, $$0x -> ((ew)$$0x.getSource()).a(((ew)$$0x.getSource()).d().a(gx.a($$0x, "axes")))))
                        ))
                     .then(ex.a("anchored").then(ex.a("anchor", fi.a()).redirect($$2, $$0x -> ((ew)$$0x.getSource()).a(fi.a($$0x, "anchor"))))))
                  .then(ex.a("in").then(ex.a("dimension", fh.a()).redirect($$2, $$0x -> ((ew)$$0x.getSource()).a(fh.a($$0x, "dimension"))))))
               .then(ex.a("summon").then(ex.a("entity", fv.a($$1, ma.z)).suggests(iw.d).redirect($$2, $$0x -> a((ew)$$0x.getSource(), fv.e($$0x, "entity"))))))
            .then(a($$2, ex.a("on")))
      );
   }

   private static ArgumentBuilder<ew, ?> a(LiteralCommandNode<ew> $$0, LiteralArgumentBuilder<ew> $$1, boolean $$2) {
      $$1.then(
         ex.a("score")
            .then(
               ex.a("targets", gb.b())
                  .suggests(gb.a)
                  .then(ex.a("objective", fq.a()).redirect($$0, $$1x -> a((ew)$$1x.getSource(), gb.c($$1x, "targets"), fq.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         ex.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)ex.a("id", fx.a())
                     .suggests(amw.a)
                     .then(ex.a("value").redirect($$0, $$1x -> a((ew)$$1x.getSource(), amw.a($$1x), true, $$2))))
                  .then(ex.a("max").redirect($$0, $$1x -> a((ew)$$1x.getSource(), amw.a($$1x), false, $$2)))
            )
      );

      for (aqa.c $$3 : aqa.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a(
                                       "path", fo.a()
                                    )
                                    .then(
                                       ex.a("int")
                                          .then(
                                             ex.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (ew)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         fo.a($$2xx, "path"),
                                                         $$1xxx -> uq.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ex.a("float")
                                       .then(
                                          ex.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (ew)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      fo.a($$2xx, "path"),
                                                      $$1xxx -> uo.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ex.a("short")
                                    .then(
                                       ex.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (ew)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   fo.a($$2xx, "path"),
                                                   $$1xxx -> vd.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ex.a("long")
                                 .then(
                                    ex.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (ew)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                fo.a($$2xx, "path"),
                                                $$1xxx -> ut.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ex.a("double")
                              .then(
                                 ex.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (ew)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             fo.a($$2xx, "path"),
                                             $$1xxx -> um.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        ex.a("byte")
                           .then(
                              ex.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (ew)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          fo.a($$2xx, "path"),
                                          $$1xxx -> uj.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static ew a(ew $$0, Collection<fbc> $$1, fav $$2, boolean $$3) {
      fbd $$4 = $$0.l().aJ();
      return $$0.a(($$4x, $$5) -> {
         for (fbc $$6 : $$1) {
            fbb $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, et::chain);
   }

   private static ew a(ew $$0, aml $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, et::chain);
   }

   private static ew a(ew $$0, apz $$1, fo.g $$2, IntFunction<vi> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            ul $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, et::chain);
   }

   private static boolean a(arp $$0, jh $$1) {
      des $$2 = new des($$1);
      dya $$3 = $$0.m().a($$2.g, $$2.h);
      return $$3 == null ? false : $$3.C() == are.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ew, ?> a(CommandNode<ew> $$0, LiteralArgumentBuilder<ew> $$1, boolean $$2, es $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    ex.a("block")
                                       .then(
                                          ex.a("pos", gs.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ex.a("block", go.a($$3)),
                                                   $$2,
                                                   $$0x -> go.a($$0x, "block").test(new dvz(((ew)$$0x.getSource()).e(), gs.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    ex.a("biome")
                                       .then(
                                          ex.a("pos", gs.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ex.a("biome", fz.a($$3, ma.aG)),
                                                   $$2,
                                                   $$0x -> fz.a($$0x, "biome", ma.aG).test(((ew)$$0x.getSource()).e().t(gs.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(ex.a("loaded").then(a($$0, ex.a("pos", gs.a()), $$2, $$0x -> a(((ew)$$0x.getSource()).e(), gs.b($$0x, "pos"))))))
                           .then(ex.a("dimension").then(a($$0, ex.a("dimension", fh.a()), $$2, $$0x -> fh.a($$0x, "dimension") == ((ew)$$0x.getSource()).e()))))
                        .then(
                           ex.a("score")
                              .then(
                                 ex.a("target", gb.a())
                                    .suggests(gb.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a(
                                                            "targetObjective", fq.a()
                                                         )
                                                         .then(
                                                            ex.a("=")
                                                               .then(
                                                                  ex.a("source", gb.a())
                                                                     .suggests(gb.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           ex.a("sourceObjective", fq.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (anm.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ex.a("<")
                                                            .then(
                                                               ex.a("source", gb.a())
                                                                  .suggests(gb.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        ex.a("sourceObjective", fq.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (anm.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      ex.a("<=")
                                                         .then(
                                                            ex.a("source", gb.a())
                                                               .suggests(gb.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     ex.a("sourceObjective", fq.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (anm.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ex.a(">")
                                                      .then(
                                                         ex.a("source", gb.a())
                                                            .suggests(gb.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  ex.a("sourceObjective", fq.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (anm.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ex.a(">=")
                                                   .then(
                                                      ex.a("source", gb.a())
                                                         .suggests(gb.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               ex.a("sourceObjective", fq.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (anm.e)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(ex.a("matches").then(a($$0, ex.a("range", fu.a()), $$2, $$0x -> a($$0x, fu.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        ex.a("blocks")
                           .then(
                              ex.a("start", gs.a())
                                 .then(
                                    ex.a("end", gs.a())
                                       .then(
                                          ((RequiredArgumentBuilder)ex.a("destination", gs.a()).then(a($$0, ex.a("all"), $$2, false)))
                                             .then(a($$0, ex.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ex.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)ex.a("entities", fj.b()).fork($$0, $$1x -> a($$1x, $$2, !fj.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (anm.b)($$0x -> fj.c($$0x, "entities").size())))
                        )
                  ))
               .then(ex.a("predicate").then(a($$0, ex.a("predicate", fy.c($$3)).suggests(f), $$2, $$0x -> a((ew)$$0x.getSource(), fy.c($$0x, "predicate"))))))
            .then(ex.a("function").then(ex.a("name", he.a()).suggests(anr.b).fork($$0, new anm.d($$2)))))
         .then(
            ((LiteralArgumentBuilder)ex.a("items")
                  .then(
                     ex.a("entity")
                        .then(
                           ex.a("entities", fj.b())
                              .then(
                                 ex.a("slots", gf.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ex.a("item_predicate", hi.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(fj.b($$1x, "entities"), gf.a($$1x, "slots"), hi.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (anm.b)($$0x -> a(fj.b($$0x, "entities"), gf.a($$0x, "slots"), hi.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  ex.a("block")
                     .then(
                        ex.a("pos", gs.a())
                           .then(
                              ex.a("slots", gf.a())
                                 .then(
                                    ((RequiredArgumentBuilder)ex.a("item_predicate", hi.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((ew)$$1x.getSource(), gs.a($$1x, "pos"), gf.a($$1x, "slots"), hi.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (anm.b)($$0x -> a((ew)$$0x.getSource(), gs.a($$0x, "pos"), gf.a($$0x, "slots"), hi.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (aqa.c $$4 : aqa.c) {
         $$1.then(
            $$4.a(
               ex.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)ex.a("path", fo.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), fo.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (anm.b)($$1xx -> a($$4.a($$1xx), fo.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends bul> $$0, ctx $$1, Predicate<cwm> $$2) {
      int $$3 = 0;

      for (bul $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            bvz $$8 = $$4.a_($$7);
            cwm $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.L();
            }
         }
      }

      return $$3;
   }

   private static int a(ew $$0, jh $$1, ctx $$2, Predicate<cwm> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      bsd $$5 = anw.a($$0, $$1, anw.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            cwm $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.L();
            }
         }
      }

      return $$4;
   }

   private static Command<ew> a(boolean $$0, anm.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ew)$$1x.getSource()).a(() -> xj.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ew)$$1x.getSource()).a(() -> xj.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(apz $$0, fo.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ew> $$0, anm.e $$1) throws CommandSyntaxException {
      fbc $$2 = gb.a($$0, "target");
      fav $$3 = fq.a($$0, "targetObjective");
      fbc $$4 = gb.a($$0, "source");
      fav $$5 = fq.a($$0, "sourceObjective");
      fbd $$6 = ((ew)$$0.getSource()).l().aJ();
      faz $$7 = $$6.d($$2, $$3);
      faz $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<ew> $$0, dj.d $$1) throws CommandSyntaxException {
      fbc $$2 = gb.a($$0, "target");
      fav $$3 = fq.a($$0, "targetObjective");
      fbd $$4 = ((ew)$$0.getSource()).l().aJ();
      faz $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(ew $$0, jq<exy> $$1) {
      arp $$2 = $$0.e();
      euq $$3 = new euq.a($$2).a(exj.f, $$0.d()).b(exj.a, $$0.f()).a(exi.d);
      eun $$4 = new eun.a($$3).a(Optional.empty());
      $$4.b(eun.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<ew> a(CommandContext<ew> $$0, boolean $$1, boolean $$2) {
      return (Collection<ew>)($$2 == $$1 ? Collections.singleton((ew)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ew, ?> a(CommandNode<ew> $$0, ArgumentBuilder<ew, ?> $$1, boolean $$2, anm.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ew)$$2x.getSource()).a(() -> xj.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<ew, ?> a(CommandNode<ew> $$0, ArgumentBuilder<ew, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<ew> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((ew)$$0.getSource()).a(() -> xj.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<ew> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((ew)$$0.getSource()).a(() -> xj.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ew> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ew)$$0.getSource()).e(), gs.a($$0, "start"), gs.a($$0, "end"), gs.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(arp $$0, jh $$1, jh $$2, jh $$3, boolean $$4) throws CommandSyntaxException {
      ema $$5 = ema.a($$1, $$2);
      ema $$6 = ema.a($$3, $$3.a($$5.c()));
      jh $$7 = new jh($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         ke $$9 = $$0.J_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  jh $$14 = new jh($$13, $$12, $$11);
                  jh $$15 = $$14.a((kl)$$7);
                  dvv $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dis.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dsy $$17 = $$0.c_($$14);
                     dsy $$18 = $$0.c_($$15);
                     if ($$17 != null) {
                        if ($$18 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$18.q() != $$17.q()) {
                           return OptionalInt.empty();
                        }

                        if (!$$17.s().equals($$18.s())) {
                           return OptionalInt.empty();
                        }

                        ul $$19 = $$17.e($$9);
                        ul $$20 = $$18.e($$9);
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

   private static RedirectModifier<ew> a(Function<bul, Optional<bul>> $$0) {
      return $$1 -> {
         ew $$2 = (ew)$$1.getSource();
         bul $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dQ()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ew> b(Function<bul, Stream<bul>> $$0) {
      return $$1 -> {
         ew $$2 = (ew)$$1.getSource();
         bul $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dQ()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ew> a(CommandNode<ew> $$0, LiteralArgumentBuilder<ew> $$1) {
      return (LiteralArgumentBuilder<ew>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              ex.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<bul, Optional<bul>>)($$0x -> $$0x instanceof bvo $$1x ? Optional.ofNullable($$1x.ag_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              ex.a("leasher")
                                 .fork(
                                    $$0, a((Function<bul, Optional<bul>>)($$0x -> $$0x instanceof bvf $$1x ? Optional.ofNullable($$1x.A()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           ex.a("target")
                              .fork(
                                 $$0, a((Function<bul, Optional<bul>>)($$0x -> $$0x instanceof bwf $$1x ? Optional.ofNullable($$1x.aa_()) : Optional.empty()))
                              )
                        ))
                     .then(
                        ex.a("attacker")
                           .fork($$0, a((Function<bul, Optional<bul>>)($$0x -> $$0x instanceof buf $$1x ? Optional.ofNullable($$1x.am()) : Optional.empty())))
                     ))
                  .then(ex.a("vehicle").fork($$0, a((Function<bul, Optional<bul>>)($$0x -> Optional.ofNullable($$0x.dk()))))))
               .then(ex.a("controller").fork($$0, a((Function<bul, Optional<bul>>)($$0x -> Optional.ofNullable($$0x.cX()))))))
            .then(
               ex.a("origin").fork($$0, a((Function<bul, Optional<bul>>)($$0x -> $$0x instanceof bwg $$1x ? Optional.ofNullable($$1x.p()) : Optional.empty())))
            ))
         .then(ex.a("passengers").fork($$0, b((Function<bul, Stream<bul>>)($$0x -> $$0x.cZ().stream()))));
   }

   private static ew a(ew $$0, jq.c<bus<?>> $$1) throws CommandSyntaxException {
      bul $$2 = apj.a($$0, $$1, $$0.d(), new ul(), true);
      return $$0.a($$2);
   }

   public static <T extends ey<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable ul $$5, hx<T> $$6, anm.a<T, Collection<ik<T>>> $$7, hr $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<ik<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<im<T>> $$14 = new ArrayList<>($$13);

         try {
            for (ik<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x()));
               } catch (ez var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            et $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new ii<>($$2x -> {
               for (im<T> $$3x : $$14) {
                  $$2x.a(new id<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(ih.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new ic.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<ew> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<ew> var1) throws CommandSyntaxException;
   }

   static class d implements hu.a<ew> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ew $$0, List<ew> $$1, ContextChain<ew> $$2, hr $$3, hx<ew> $$4) {
         anm.a($$0, $$1, anr::a, this.a, $$2, null, $$4, $$0x -> he.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
