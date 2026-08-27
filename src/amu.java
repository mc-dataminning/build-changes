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

public class amu {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xe.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xe.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<eh> f = ($$0, $$1) -> {
      ald.b $$2 = ((eh)$$0.getSource()).l().be();
      return em.a($$2.a(li.aW), $$1);
   };

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      LiteralCommandNode<eh> $$2 = $$0.register((LiteralArgumentBuilder)ei.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(ei.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, ei.a("if"), true, $$1)))
                                             .then(a($$2, ei.a("unless"), false, $$1)))
                                          .then(ei.a("as").then(ei.a("targets", eu.b()).fork($$2, $$0x -> {
                                             List<eh> $$1x = Lists.newArrayList();

                                             for (brv $$2x : eu.c($$0x, "targets")) {
                                                $$1x.add(((eh)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ei.a("at").then(ei.a("targets", eu.b()).fork($$2, $$0x -> {
                                          List<eh> $$1x = Lists.newArrayList();

                                          for (brv $$2x : eu.c($$0x, "targets")) {
                                             $$1x.add(((eh)$$0x.getSource()).a((aqt)$$2x.dU()).a($$2x.ds()).a($$2x.bR()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)ei.a("store").then(a($$2, ei.a("result"), true))).then(a($$2, ei.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("positioned")
                                             .then(ei.a("pos", gk.a()).redirect($$2, $$0x -> ((eh)$$0x.getSource()).a(gk.a($$0x, "pos")).a(et.a.a))))
                                          .then(ei.a("as").then(ei.a("targets", eu.b()).fork($$2, $$0x -> {
                                             List<eh> $$1x = Lists.newArrayList();

                                             for (brv $$2x : eu.c($$0x, "targets")) {
                                                $$1x.add(((eh)$$0x.getSource()).a($$2x.ds()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ei.a("over").then(ei.a("heightmap", ex.a()).redirect($$2, $$0x -> {
                                          ewu $$1x = ((eh)$$0x.getSource()).d();
                                          aqt $$2x = ((eh)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(jt.b($$3), jt.b($$4))) {
                                             throw gd.a.create();
                                          } else {
                                             int $$5 = $$2x.a(ex.a($$0x, "heightmap"), aym.a($$3), aym.a($$4));
                                             return ((eh)$$0x.getSource()).a(new ewu($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ei.a("rotated")
                                       .then(ei.a("rot", gh.a()).redirect($$2, $$0x -> ((eh)$$0x.getSource()).a(gh.a($$0x, "rot").b((eh)$$0x.getSource())))))
                                    .then(ei.a("as").then(ei.a("targets", eu.b()).fork($$2, $$0x -> {
                                       List<eh> $$1x = Lists.newArrayList();

                                       for (brv $$2x : eu.c($$0x, "targets")) {
                                          $$1x.add(((eh)$$0x.getSource()).a($$2x.bR()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ei.a("facing")
                                    .then(ei.a("entity").then(ei.a("targets", eu.b()).then(ei.a("anchor", et.a()).fork($$2, $$0x -> {
                                       List<eh> $$1x = Lists.newArrayList();
                                       et.a $$2x = et.a($$0x, "anchor");

                                       for (brv $$3 : eu.c($$0x, "targets")) {
                                          $$1x.add(((eh)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(ei.a("pos", gk.a()).redirect($$2, $$0x -> ((eh)$$0x.getSource()).b(gk.a($$0x, "pos"))))
                           ))
                        .then(
                           ei.a("align")
                              .then(ei.a("axes", gi.a()).redirect($$2, $$0x -> ((eh)$$0x.getSource()).a(((eh)$$0x.getSource()).d().a(gi.a($$0x, "axes")))))
                        ))
                     .then(ei.a("anchored").then(ei.a("anchor", et.a()).redirect($$2, $$0x -> ((eh)$$0x.getSource()).a(et.a($$0x, "anchor"))))))
                  .then(ei.a("in").then(ei.a("dimension", es.a()).redirect($$2, $$0x -> ((eh)$$0x.getSource()).a(es.a($$0x, "dimension"))))))
               .then(ei.a("summon").then(ei.a("entity", fg.a($$1, li.v)).suggests(ig.d).redirect($$2, $$0x -> a((eh)$$0x.getSource(), fg.e($$0x, "entity"))))))
            .then(a($$2, ei.a("on")))
      );
   }

   private static ArgumentBuilder<eh, ?> a(LiteralCommandNode<eh> $$0, LiteralArgumentBuilder<eh> $$1, boolean $$2) {
      $$1.then(
         ei.a("score")
            .then(
               ei.a("targets", fm.b())
                  .suggests(fm.a)
                  .then(ei.a("objective", fb.a()).redirect($$0, $$1x -> a((eh)$$1x.getSource(), fm.c($$1x, "targets"), fb.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         ei.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)ei.a("id", fi.a())
                     .suggests(ame.a)
                     .then(ei.a("value").redirect($$0, $$1x -> a((eh)$$1x.getSource(), ame.a($$1x), true, $$2))))
                  .then(ei.a("max").redirect($$0, $$1x -> a((eh)$$1x.getSource(), ame.a($$1x), false, $$2)))
            )
      );

      for (apj.c $$3 : apj.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a(
                                       "path", ez.a()
                                    )
                                    .then(
                                       ei.a("int")
                                          .then(
                                             ei.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (eh)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         ez.a($$2xx, "path"),
                                                         $$1xxx -> up.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ei.a("float")
                                       .then(
                                          ei.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (eh)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      ez.a($$2xx, "path"),
                                                      $$1xxx -> un.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ei.a("short")
                                    .then(
                                       ei.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (eh)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   ez.a($$2xx, "path"),
                                                   $$1xxx -> vc.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ei.a("long")
                                 .then(
                                    ei.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (eh)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                ez.a($$2xx, "path"),
                                                $$1xxx -> us.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ei.a("double")
                              .then(
                                 ei.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (eh)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             ez.a($$2xx, "path"),
                                             $$1xxx -> ul.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        ei.a("byte")
                           .then(
                              ei.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (eh)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          ez.a($$2xx, "path"),
                                          $$1xxx -> ui.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static eh a(eh $$0, Collection<exx> $$1, exq $$2, boolean $$3) {
      exy $$4 = $$0.l().aK();
      return $$0.a(($$4x, $$5) -> {
         for (exx $$6 : $$1) {
            exw $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, ee::chain);
   }

   private static eh a(eh $$0, alt $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, ee::chain);
   }

   private static eh a(eh $$0, api $$1, ez.g $$2, IntFunction<vh> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            uk $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, ee::chain);
   }

   private static boolean a(aqt $$0, ir $$1) {
      dbh $$2 = new dbh($$1);
      dvi $$3 = $$0.l().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.E() == aqm.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<eh, ?> a(CommandNode<eh> $$0, LiteralArgumentBuilder<eh> $$1, boolean $$2, ed $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    ei.a("block")
                                       .then(
                                          ei.a("pos", gd.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ei.a("block", fz.a($$3)),
                                                   $$2,
                                                   $$0x -> fz.a($$0x, "block").test(new dtg(((eh)$$0x.getSource()).e(), gd.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    ei.a("biome")
                                       .then(
                                          ei.a("pos", gd.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ei.a("biome", fk.a($$3, li.az)),
                                                   $$2,
                                                   $$0x -> fk.a($$0x, "biome", li.az).test(((eh)$$0x.getSource()).e().t(gd.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(ei.a("loaded").then(a($$0, ei.a("pos", gd.a()), $$2, $$0x -> a(((eh)$$0x.getSource()).e(), gd.b($$0x, "pos"))))))
                           .then(ei.a("dimension").then(a($$0, ei.a("dimension", es.a()), $$2, $$0x -> es.a($$0x, "dimension") == ((eh)$$0x.getSource()).e()))))
                        .then(
                           ei.a("score")
                              .then(
                                 ei.a("target", fm.a())
                                    .suggests(fm.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a(
                                                            "targetObjective", fb.a()
                                                         )
                                                         .then(
                                                            ei.a("=")
                                                               .then(
                                                                  ei.a("source", fm.a())
                                                                     .suggests(fm.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           ei.a("sourceObjective", fb.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (amu.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ei.a("<")
                                                            .then(
                                                               ei.a("source", fm.a())
                                                                  .suggests(fm.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        ei.a("sourceObjective", fb.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (amu.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      ei.a("<=")
                                                         .then(
                                                            ei.a("source", fm.a())
                                                               .suggests(fm.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     ei.a("sourceObjective", fb.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (amu.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ei.a(">")
                                                      .then(
                                                         ei.a("source", fm.a())
                                                            .suggests(fm.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  ei.a("sourceObjective", fb.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (amu.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ei.a(">=")
                                                   .then(
                                                      ei.a("source", fm.a())
                                                         .suggests(fm.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               ei.a("sourceObjective", fb.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (amu.e)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(ei.a("matches").then(a($$0, ei.a("range", ff.a()), $$2, $$0x -> a($$0x, ff.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        ei.a("blocks")
                           .then(
                              ei.a("start", gd.a())
                                 .then(
                                    ei.a("end", gd.a())
                                       .then(
                                          ((RequiredArgumentBuilder)ei.a("destination", gd.a()).then(a($$0, ei.a("all"), $$2, false)))
                                             .then(a($$0, ei.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ei.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)ei.a("entities", eu.b()).fork($$0, $$1x -> a($$1x, $$2, !eu.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (amu.b)($$0x -> eu.c($$0x, "entities").size())))
                        )
                  ))
               .then(ei.a("predicate").then(a($$0, ei.a("predicate", fj.c($$3)).suggests(f), $$2, $$0x -> a((eh)$$0x.getSource(), fj.c($$0x, "predicate"))))))
            .then(ei.a("function").then(ei.a("name", gp.a()).suggests(amz.b).fork($$0, new amu.d($$2)))))
         .then(
            ((LiteralArgumentBuilder)ei.a("items")
                  .then(
                     ei.a("entity")
                        .then(
                           ei.a("entities", eu.b())
                              .then(
                                 ei.a("slots", fq.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ei.a("item_predicate", gt.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(eu.b($$1x, "entities"), fq.a($$1x, "slots"), gt.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (amu.b)($$0x -> a(eu.b($$0x, "entities"), fq.a($$0x, "slots"), gt.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  ei.a("block")
                     .then(
                        ei.a("pos", gd.a())
                           .then(
                              ei.a("slots", fq.a())
                                 .then(
                                    ((RequiredArgumentBuilder)ei.a("item_predicate", gt.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((eh)$$1x.getSource(), gd.a($$1x, "pos"), fq.a($$1x, "slots"), gt.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (amu.b)($$0x -> a((eh)$$0x.getSource(), gd.a($$0x, "pos"), fq.a($$0x, "slots"), gt.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (apj.c $$4 : apj.c) {
         $$1.then(
            $$4.a(
               ei.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)ei.a("path", ez.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), ez.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (amu.b)($$1xx -> a($$4.a($$1xx), ez.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends brv> $$0, crf $$1, Predicate<cuh> $$2) {
      int $$3 = 0;

      for (brv $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            btf $$8 = $$4.a_($$7);
            cuh $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.G();
            }
         }
      }

      return $$3;
   }

   private static int a(eh $$0, ir $$1, crf $$2, Predicate<cuh> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      bpt $$5 = ane.a($$0, $$1, ane.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            cuh $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.G();
            }
         }
      }

      return $$4;
   }

   private static Command<eh> a(boolean $$0, amu.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((eh)$$1x.getSource()).a(() -> xe.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((eh)$$1x.getSource()).a(() -> xe.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(api $$0, ez.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<eh> $$0, amu.e $$1) throws CommandSyntaxException {
      exx $$2 = fm.a($$0, "target");
      exq $$3 = fb.a($$0, "targetObjective");
      exx $$4 = fm.a($$0, "source");
      exq $$5 = fb.a($$0, "sourceObjective");
      exy $$6 = ((eh)$$0.getSource()).l().aK();
      exu $$7 = $$6.d($$2, $$3);
      exu $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<eh> $$0, cu.d $$1) throws CommandSyntaxException {
      exx $$2 = fm.a($$0, "target");
      exq $$3 = fb.a($$0, "targetObjective");
      exy $$4 = ((eh)$$0.getSource()).l().aK();
      exu $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(eh $$0, ja<euu> $$1) {
      aqt $$2 = $$0.e();
      ers $$3 = new ers.a($$2).a(eug.f, $$0.d()).b(eug.a, $$0.f()).a(euf.d);
      erp $$4 = new erp.a($$3).a(Optional.empty());
      $$4.b(erp.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<eh> a(CommandContext<eh> $$0, boolean $$1, boolean $$2) {
      return (Collection<eh>)($$2 == $$1 ? Collections.singleton((eh)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<eh, ?> a(CommandNode<eh> $$0, ArgumentBuilder<eh, ?> $$1, boolean $$2, amu.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((eh)$$2x.getSource()).a(() -> xe.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<eh, ?> a(CommandNode<eh> $$0, ArgumentBuilder<eh, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<eh> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((eh)$$0.getSource()).a(() -> xe.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<eh> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((eh)$$0.getSource()).a(() -> xe.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<eh> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((eh)$$0.getSource()).e(), gd.a($$0, "start"), gd.a($$0, "end"), gd.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(aqt $$0, ir $$1, ir $$2, ir $$3, boolean $$4) throws CommandSyntaxException {
      ejl $$5 = ejl.a($$1, $$2);
      ejl $$6 = ejl.a($$3, $$3.a($$5.c()));
      ir $$7 = new ir($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         jo $$9 = $$0.I_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  ir $$14 = new ir($$13, $$12, $$11);
                  ir $$15 = $$14.a((jv)$$7);
                  dtc $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dfe.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dqc $$17 = $$0.c_($$14);
                     dqc $$18 = $$0.c_($$15);
                     if ($$17 != null) {
                        if ($$18 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$18.r() != $$17.r()) {
                           return OptionalInt.empty();
                        }

                        uk $$19 = $$17.d($$9);
                        uk $$20 = $$18.d($$9);
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

   private static RedirectModifier<eh> a(Function<brv, Optional<brv>> $$0) {
      return $$1 -> {
         eh $$2 = (eh)$$1.getSource();
         brv $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dP()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<eh> b(Function<brv, Stream<brv>> $$0) {
      return $$1 -> {
         eh $$2 = (eh)$$1.getSource();
         brv $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dP()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<eh> a(CommandNode<eh> $$0, LiteralArgumentBuilder<eh> $$1) {
      return (LiteralArgumentBuilder<eh>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              ei.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<brv, Optional<brv>>)($$0x -> $$0x instanceof bsv $$1x ? Optional.ofNullable($$1x.Q_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              ei.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<brv, Optional<brv>>)($$0x -> $$0x instanceof bsq $$1x ? Optional.ofNullable($$1x.gn()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           ei.a("target")
                              .fork($$0, a((Function<brv, Optional<brv>>)($$0x -> $$0x instanceof btl $$1x ? Optional.ofNullable($$1x.p()) : Optional.empty())))
                        ))
                     .then(
                        ei.a("attacker")
                           .fork($$0, a((Function<brv, Optional<brv>>)($$0x -> $$0x instanceof brs $$1x ? Optional.ofNullable($$1x.U_()) : Optional.empty())))
                     ))
                  .then(ei.a("vehicle").fork($$0, a((Function<brv, Optional<brv>>)($$0x -> Optional.ofNullable($$0x.dh()))))))
               .then(ei.a("controller").fork($$0, a((Function<brv, Optional<brv>>)($$0x -> Optional.ofNullable($$0x.cV()))))))
            .then(
               ei.a("origin").fork($$0, a((Function<brv, Optional<brv>>)($$0x -> $$0x instanceof btm $$1x ? Optional.ofNullable($$1x.t()) : Optional.empty())))
            ))
         .then(ei.a("passengers").fork($$0, b((Function<brv, Stream<brv>>)($$0x -> $$0x.cX().stream()))));
   }

   private static eh a(eh $$0, ja.c<bsb<?>> $$1) throws CommandSyntaxException {
      brv $$2 = aos.a($$0, $$1, $$0.d(), new uk(), true);
      return $$0.a($$2);
   }

   public static <T extends ej<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable uk $$5, hh<T> $$6, amu.a<T, Collection<ht<T>>> $$7, hb $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<ht<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<hv<T>> $$14 = new ArrayList<>($$13);

         try {
            for (ht<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x()));
               } catch (ek var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            ee $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new hr<>($$2x -> {
               for (hv<T> $$3x : $$14) {
                  $$2x.a(new hn<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(hq.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new hm.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<eh> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<eh> var1) throws CommandSyntaxException;
   }

   static class d implements he.a<eh> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(eh $$0, List<eh> $$1, ContextChain<eh> $$2, hb $$3, hh<eh> $$4) {
         amu.a($$0, $$1, amz::a, this.a, $$2, null, $$4, $$0x -> gp.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
