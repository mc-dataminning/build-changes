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

public class ang {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wv.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wv.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wv.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wv.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<ex> f = ($$0, $$1) -> {
      aln.a $$2 = ((ex)$$0.getSource()).l().bc();
      return fc.a($$2.a(me.bp), $$1);
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

                                             for (bvs $$2x : fk.c($$0x, "targets")) {
                                                $$1x.add(((ex)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ey.a("at").then(ey.a("targets", fk.b()).fork($$2, $$0x -> {
                                          List<ex> $$1x = Lists.newArrayList();

                                          for (bvs $$2x : fk.c($$0x, "targets")) {
                                             $$1x.add(((ex)$$0x.getSource()).a((arn)$$2x.dV()).a($$2x.dt()).a($$2x.bU()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)ey.a("store").then(a($$2, ey.a("result"), true))).then(a($$2, ey.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("positioned")
                                             .then(ey.a("pos", hb.a()).redirect($$2, $$0x -> ((ex)$$0x.getSource()).a(hb.a($$0x, "pos")).a(fj.a.a))))
                                          .then(ey.a("as").then(ey.a("targets", fk.b()).fork($$2, $$0x -> {
                                             List<ex> $$1x = Lists.newArrayList();

                                             for (bvs $$2x : fk.c($$0x, "targets")) {
                                                $$1x.add(((ex)$$0x.getSource()).a($$2x.dt()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ey.a("over").then(ey.a("heightmap", fn.a()).redirect($$2, $$0x -> {
                                          fcu $$1x = ((ex)$$0x.getSource()).d();
                                          arn $$2x = ((ex)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(kl.b($$3), kl.b($$4))) {
                                             throw gu.a.create();
                                          } else {
                                             int $$5 = $$2x.a(fn.a($$0x, "heightmap"), azk.a($$3), azk.a($$4));
                                             return ((ex)$$0x.getSource()).a(new fcu($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ey.a("rotated")
                                       .then(ey.a("rot", gy.a()).redirect($$2, $$0x -> ((ex)$$0x.getSource()).a(gy.a($$0x, "rot").b((ex)$$0x.getSource())))))
                                    .then(ey.a("as").then(ey.a("targets", fk.b()).fork($$2, $$0x -> {
                                       List<ex> $$1x = Lists.newArrayList();

                                       for (bvs $$2x : fk.c($$0x, "targets")) {
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

                                       for (bvs $$3 : fk.c($$0x, "targets")) {
                                          $$1x.add(((ex)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(ey.a("pos", hb.a()).redirect($$2, $$0x -> ((ex)$$0x.getSource()).b(hb.a($$0x, "pos"))))
                           ))
                        .then(
                           ey.a("align")
                              .then(ey.a("axes", gz.a()).redirect($$2, $$0x -> ((ex)$$0x.getSource()).a(((ex)$$0x.getSource()).d().a(gz.a($$0x, "axes")))))
                        ))
                     .then(ey.a("anchored").then(ey.a("anchor", fj.a()).redirect($$2, $$0x -> ((ex)$$0x.getSource()).a(fj.a($$0x, "anchor"))))))
                  .then(ey.a("in").then(ey.a("dimension", fi.a()).redirect($$2, $$0x -> ((ex)$$0x.getSource()).a(fi.a($$0x, "dimension"))))))
               .then(ey.a("summon").then(ey.a("entity", fw.a($$1, me.z)).suggests(iy.c).redirect($$2, $$0x -> a((ex)$$0x.getSource(), fw.e($$0x, "entity"))))))
            .then(a($$2, ey.a("on")))
      );
   }

   private static ArgumentBuilder<ex, ?> a(LiteralCommandNode<ex> $$0, LiteralArgumentBuilder<ex> $$1, boolean $$2) {
      $$1.then(
         ey.a("score")
            .then(
               ey.a("targets", gd.b())
                  .suggests(gd.a)
                  .then(ey.a("objective", fr.a()).redirect($$0, $$1x -> a((ex)$$1x.getSource(), gd.c($$1x, "targets"), fr.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         ey.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)ey.a("id", fy.a())
                     .suggests(amq.a)
                     .then(ey.a("value").redirect($$0, $$1x -> a((ex)$$1x.getSource(), amq.a($$1x), true, $$2))))
                  .then(ey.a("max").redirect($$0, $$1x -> a((ex)$$1x.getSource(), amq.a($$1x), false, $$2)))
            )
      );

      for (apx.c $$3 : apx.b) {
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
                                                         $$1xxx -> ub.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                                      $$1xxx -> tz.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                                   $$1xxx -> uo.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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
                                                $$1xxx -> ue.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                             $$1xxx -> tx.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
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
                                          $$1xxx -> tu.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static ex a(ex $$0, Collection<fdy> $$1, fdr $$2, boolean $$3) {
      fdz $$4 = $$0.l().aJ();
      return $$0.a(($$4x, $$5) -> {
         for (fdy $$6 : $$1) {
            fdx $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, eu::chain);
   }

   private static ex a(ex $$0, amf $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, eu::chain);
   }

   private static ex a(ex $$0, apw $$1, fp.g $$2, IntFunction<ut> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            tw $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, eu::chain);
   }

   private static boolean a(arn $$0, jj $$1) {
      dgw $$2 = new dgw($$1);
      eat $$3 = $$0.m().a($$2.h, $$2.i);
      return $$3 == null ? false : $$3.F() == arb.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ex, ?> a(CommandNode<ex> $$0, LiteralArgumentBuilder<ex> $$1, boolean $$2, et $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    ey.a("block")
                                       .then(
                                          ey.a("pos", gu.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ey.a("block", gq.a($$3)),
                                                   $$2,
                                                   $$0x -> gq.a($$0x, "block").test(new dyq(((ex)$$0x.getSource()).e(), gu.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    ey.a("biome")
                                       .then(
                                          ey.a("pos", gu.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ey.a("biome", ga.a($$3, me.aM)),
                                                   $$2,
                                                   $$0x -> ga.a($$0x, "biome", me.aM).test(((ex)$$0x.getSource()).e().t(gu.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(ey.a("loaded").then(a($$0, ey.a("pos", gu.a()), $$2, $$0x -> a(((ex)$$0x.getSource()).e(), gu.b($$0x, "pos"))))))
                           .then(ey.a("dimension").then(a($$0, ey.a("dimension", fi.a()), $$2, $$0x -> fi.a($$0x, "dimension") == ((ex)$$0x.getSource()).e()))))
                        .then(
                           ey.a("score")
                              .then(
                                 ey.a("target", gd.a())
                                    .suggests(gd.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a(
                                                            "targetObjective", fr.a()
                                                         )
                                                         .then(
                                                            ey.a("=")
                                                               .then(
                                                                  ey.a("source", gd.a())
                                                                     .suggests(gd.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           ey.a("sourceObjective", fr.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (ang.d)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ey.a("<")
                                                            .then(
                                                               ey.a("source", gd.a())
                                                                  .suggests(gd.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        ey.a("sourceObjective", fr.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (ang.d)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      ey.a("<=")
                                                         .then(
                                                            ey.a("source", gd.a())
                                                               .suggests(gd.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     ey.a("sourceObjective", fr.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (ang.d)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ey.a(">")
                                                      .then(
                                                         ey.a("source", gd.a())
                                                            .suggests(gd.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  ey.a("sourceObjective", fr.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (ang.d)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ey.a(">=")
                                                   .then(
                                                      ey.a("source", gd.a())
                                                         .suggests(gd.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               ey.a("sourceObjective", fr.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (ang.d)(($$0xx, $$1x) -> $$0xx >= $$1x))
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
                              ey.a("start", gu.a())
                                 .then(
                                    ey.a("end", gu.a())
                                       .then(
                                          ((RequiredArgumentBuilder)ey.a("destination", gu.a()).then(a($$0, ey.a("all"), $$2, false)))
                                             .then(a($$0, ey.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ey.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)ey.a("entities", fk.b()).fork($$0, $$1x -> a($$1x, $$2, !fk.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (ang.a)($$0x -> fk.c($$0x, "entities").size())))
                        )
                  ))
               .then(ey.a("predicate").then(a($$0, ey.a("predicate", fz.c($$3)).suggests(f), $$2, $$0x -> a((ex)$$0x.getSource(), fz.c($$0x, "predicate"))))))
            .then(ey.a("function").then(ey.a("name", hg.a()).suggests(anl.b).fork($$0, new ang.c($$2)))))
         .then(
            ((LiteralArgumentBuilder)ey.a("items")
                  .then(
                     ey.a("entity")
                        .then(
                           ey.a("entities", fk.b())
                              .then(
                                 ey.a("slots", gh.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ey.a("item_predicate", hk.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(fk.b($$1x, "entities"), gh.a($$1x, "slots"), hk.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (ang.a)($$0x -> a(fk.b($$0x, "entities"), gh.a($$0x, "slots"), hk.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  ey.a("block")
                     .then(
                        ey.a("pos", gu.a())
                           .then(
                              ey.a("slots", gh.a())
                                 .then(
                                    ((RequiredArgumentBuilder)ey.a("item_predicate", hk.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((ex)$$1x.getSource(), gu.a($$1x, "pos"), gh.a($$1x, "slots"), hk.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (ang.a)($$0x -> a((ex)$$0x.getSource(), gu.a($$0x, "pos"), gh.a($$0x, "slots"), hk.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (apx.c $$4 : apx.c) {
         $$1.then(
            $$4.a(
               ey.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)ey.a("path", fp.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), fp.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (ang.a)($$1xx -> a($$4.a($$1xx), fp.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends bvs> $$0, cvl $$1, Predicate<cxy> $$2) {
      int $$3 = 0;

      for (bvs $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            bxi $$8 = $$4.a_($$7);
            cxy $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.M();
            }
         }
      }

      return $$3;
   }

   private static int a(ex $$0, jj $$1, cvl $$2, Predicate<cxy> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      btj $$5 = anr.a($$0, $$1, anr.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            cxy $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.M();
            }
         }
      }

      return $$4;
   }

   private static Command<ex> a(boolean $$0, ang.a $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ex)$$1x.getSource()).a(() -> wv.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ex)$$1x.getSource()).a(() -> wv.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(apw $$0, fp.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ex> $$0, ang.d $$1) throws CommandSyntaxException {
      fdy $$2 = gd.a($$0, "target");
      fdr $$3 = fr.a($$0, "targetObjective");
      fdy $$4 = gd.a($$0, "source");
      fdr $$5 = fr.a($$0, "sourceObjective");
      fdz $$6 = ((ex)$$0.getSource()).l().aJ();
      fdv $$7 = $$6.d($$2, $$3);
      fdv $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<ex> $$0, dk.d $$1) throws CommandSyntaxException {
      fdy $$2 = gd.a($$0, "target");
      fdr $$3 = fr.a($$0, "targetObjective");
      fdz $$4 = ((ex)$$0.getSource()).l().aJ();
      fdv $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(ex $$0, js<fau> $$1) {
      arn $$2 = $$0.e();
      exo $$3 = new exo.a($$2).a(faf.f, $$0.d()).b(faf.a, $$0.f()).a(fae.d);
      exl $$4 = new exl.a($$3).a(Optional.empty());
      $$4.b(exl.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<ex> a(CommandContext<ex> $$0, boolean $$1, boolean $$2) {
      return (Collection<ex>)($$2 == $$1 ? Collections.singleton((ex)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ex, ?> a(CommandNode<ex> $$0, ArgumentBuilder<ex, ?> $$1, boolean $$2, ang.b $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ex)$$2x.getSource()).a(() -> wv.c("commands.execute.conditional.pass"), false);
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
         ((ex)$$0.getSource()).a(() -> wv.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
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
         ((ex)$$0.getSource()).a(() -> wv.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ex> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ex)$$0.getSource()).e(), gu.a($$0, "start"), gu.a($$0, "end"), gu.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(arn $$0, jj $$1, jj $$2, jj $$3, boolean $$4) throws CommandSyntaxException {
      eoy $$5 = eoy.a($$1, $$2);
      eoy $$6 = eoy.a($$3, $$3.a($$5.c()));
      jj $$7 = new jj($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         kg $$9 = $$0.F_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  jj $$14 = new jj($$13, $$12, $$11);
                  jj $$15 = $$14.a((kn)$$7);
                  dym $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dkw.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dvl $$17 = $$0.c_($$14);
                     dvl $$18 = $$0.c_($$15);
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

                        tw $$19 = $$17.e($$9);
                        tw $$20 = $$18.e($$9);
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

   private static RedirectModifier<ex> a(Function<bvs, Optional<bvs>> $$0) {
      return $$1 -> {
         ex $$2 = (ex)$$1.getSource();
         bvs $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dQ()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ex> b(Function<bvs, Stream<bvs>> $$0) {
      return $$1 -> {
         ex $$2 = (ex)$$1.getSource();
         bvs $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dQ()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ex> a(CommandNode<ex> $$0, LiteralArgumentBuilder<ex> $$1) {
      return (LiteralArgumentBuilder<ex>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              ey.a("owner")
                                 .fork(
                                    $$0, a((Function<bvs, Optional<bvs>>)($$0x -> $$0x instanceof bwy $$1x ? Optional.ofNullable($$1x.e()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              ey.a("leasher")
                                 .fork(
                                    $$0, a((Function<bvs, Optional<bvs>>)($$0x -> $$0x instanceof bwp $$1x ? Optional.ofNullable($$1x.C()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           ey.a("target")
                              .fork($$0, a((Function<bvs, Optional<bvs>>)($$0x -> $$0x instanceof bxo $$1x ? Optional.ofNullable($$1x.f()) : Optional.empty())))
                        ))
                     .then(
                        ey.a("attacker")
                           .fork($$0, a((Function<bvs, Optional<bvs>>)($$0x -> $$0x instanceof bvl $$1x ? Optional.ofNullable($$1x.am()) : Optional.empty())))
                     ))
                  .then(ey.a("vehicle").fork($$0, a((Function<bvs, Optional<bvs>>)($$0x -> Optional.ofNullable($$0x.dk()))))))
               .then(ey.a("controller").fork($$0, a((Function<bvs, Optional<bvs>>)($$0x -> Optional.ofNullable($$0x.cW()))))))
            .then(
               ey.a("origin").fork($$0, a((Function<bvs, Optional<bvs>>)($$0x -> $$0x instanceof bxp $$1x ? Optional.ofNullable($$1x.q()) : Optional.empty())))
            ))
         .then(ey.a("passengers").fork($$0, b((Function<bvs, Stream<bvs>>)($$0x -> $$0x.cY().stream()))));
   }

   private static ex a(ex $$0, js.c<bwb<?>> $$1) throws CommandSyntaxException {
      bvs $$2 = apg.a($$0, $$1, $$0.d(), new tw(), true);
      return $$0.a($$2);
   }

   public static <T extends ez<T>> void a(
      T $$0,
      List<T> $$1,
      Function<T, T> $$2,
      IntPredicate $$3,
      ContextChain<T> $$4,
      @Nullable tw $$5,
      hz<T> $$6,
      anq<CommandContext<T>, Collection<im<T>>> $$7,
      ht $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<im<T>> $$10;
      try {
         $$10 = $$7.apply($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<io<T>> $$14 = new ArrayList<>($$13);

         try {
            for (im<T> $$15 : $$10) {
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
            $$6.a(new ik<>($$2x -> {
               for (io<T> $$3x : $$14) {
                  $$2x.a(new ig<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(ij.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new ie.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   interface a {
      int test(CommandContext<ex> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      boolean test(CommandContext<ex> var1) throws CommandSyntaxException;
   }

   static class c implements hw.a<ex> {
      private final IntPredicate a;

      c(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ex $$0, List<ex> $$1, ContextChain<ex> $$2, ht $$3, hz<ex> $$4) {
         ang.a($$0, $$1, anl::a, this.a, $$2, null, $$4, $$0x -> hg.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface d {
      boolean test(int var1, int var2);
   }
}
