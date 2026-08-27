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

public class ami {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wu.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wu.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<ed> f = ($$0, $$1) -> {
      akr.b $$2 = ((ed)$$0.getSource()).l().be();
      return ei.a($$2.a(le.aW), $$1);
   };

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      LiteralCommandNode<ed> $$2 = $$0.register((LiteralArgumentBuilder)ee.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(ee.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, ee.a("if"), true, $$1)))
                                             .then(a($$2, ee.a("unless"), false, $$1)))
                                          .then(ee.a("as").then(ee.a("targets", eq.b()).fork($$2, $$0x -> {
                                             List<ed> $$1x = Lists.newArrayList();

                                             for (brh $$2x : eq.c($$0x, "targets")) {
                                                $$1x.add(((ed)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ee.a("at").then(ee.a("targets", eq.b()).fork($$2, $$0x -> {
                                          List<ed> $$1x = Lists.newArrayList();

                                          for (brh $$2x : eq.c($$0x, "targets")) {
                                             $$1x.add(((ed)$$0x.getSource()).a((aqh)$$2x.dN()).a($$2x.dl()).a($$2x.bK()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)ee.a("store").then(a($$2, ee.a("result"), true))).then(a($$2, ee.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("positioned")
                                             .then(ee.a("pos", gg.a()).redirect($$2, $$0x -> ((ed)$$0x.getSource()).a(gg.a($$0x, "pos")).a(ep.a.a))))
                                          .then(ee.a("as").then(ee.a("targets", eq.b()).fork($$2, $$0x -> {
                                             List<ed> $$1x = Lists.newArrayList();

                                             for (brh $$2x : eq.c($$0x, "targets")) {
                                                $$1x.add(((ed)$$0x.getSource()).a($$2x.dl()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ee.a("over").then(ee.a("heightmap", et.a()).redirect($$2, $$0x -> {
                                          etp $$1x = ((ed)$$0x.getSource()).d();
                                          aqh $$2x = ((ed)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(jp.b($$3), jp.b($$4))) {
                                             throw fz.a.create();
                                          } else {
                                             int $$5 = $$2x.a(et.a($$0x, "heightmap"), axz.a($$3), axz.a($$4));
                                             return ((ed)$$0x.getSource()).a(new etp($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ee.a("rotated")
                                       .then(ee.a("rot", gd.a()).redirect($$2, $$0x -> ((ed)$$0x.getSource()).a(gd.a($$0x, "rot").b((ed)$$0x.getSource())))))
                                    .then(ee.a("as").then(ee.a("targets", eq.b()).fork($$2, $$0x -> {
                                       List<ed> $$1x = Lists.newArrayList();

                                       for (brh $$2x : eq.c($$0x, "targets")) {
                                          $$1x.add(((ed)$$0x.getSource()).a($$2x.bK()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ee.a("facing")
                                    .then(ee.a("entity").then(ee.a("targets", eq.b()).then(ee.a("anchor", ep.a()).fork($$2, $$0x -> {
                                       List<ed> $$1x = Lists.newArrayList();
                                       ep.a $$2x = ep.a($$0x, "anchor");

                                       for (brh $$3 : eq.c($$0x, "targets")) {
                                          $$1x.add(((ed)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(ee.a("pos", gg.a()).redirect($$2, $$0x -> ((ed)$$0x.getSource()).b(gg.a($$0x, "pos"))))
                           ))
                        .then(
                           ee.a("align")
                              .then(ee.a("axes", ge.a()).redirect($$2, $$0x -> ((ed)$$0x.getSource()).a(((ed)$$0x.getSource()).d().a(ge.a($$0x, "axes")))))
                        ))
                     .then(ee.a("anchored").then(ee.a("anchor", ep.a()).redirect($$2, $$0x -> ((ed)$$0x.getSource()).a(ep.a($$0x, "anchor"))))))
                  .then(ee.a("in").then(ee.a("dimension", eo.a()).redirect($$2, $$0x -> ((ed)$$0x.getSource()).a(eo.a($$0x, "dimension"))))))
               .then(ee.a("summon").then(ee.a("entity", fc.a($$1, le.v)).suggests(ib.d).redirect($$2, $$0x -> a((ed)$$0x.getSource(), fc.e($$0x, "entity"))))))
            .then(a($$2, ee.a("on")))
      );
   }

   private static ArgumentBuilder<ed, ?> a(LiteralCommandNode<ed> $$0, LiteralArgumentBuilder<ed> $$1, boolean $$2) {
      $$1.then(
         ee.a("score")
            .then(
               ee.a("targets", fi.b())
                  .suggests(fi.a)
                  .then(ee.a("objective", ex.a()).redirect($$0, $$1x -> a((ed)$$1x.getSource(), fi.c($$1x, "targets"), ex.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         ee.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)ee.a("id", fe.a())
                     .suggests(als.a)
                     .then(ee.a("value").redirect($$0, $$1x -> a((ed)$$1x.getSource(), als.a($$1x), true, $$2))))
                  .then(ee.a("max").redirect($$0, $$1x -> a((ed)$$1x.getSource(), als.a($$1x), false, $$2)))
            )
      );

      for (aox.c $$3 : aox.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a(
                                       "path", ev.a()
                                    )
                                    .then(
                                       ee.a("int")
                                          .then(
                                             ee.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (ed)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         ev.a($$2xx, "path"),
                                                         $$1xxx -> uf.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ee.a("float")
                                       .then(
                                          ee.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (ed)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      ev.a($$2xx, "path"),
                                                      $$1xxx -> ud.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ee.a("short")
                                    .then(
                                       ee.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (ed)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   ev.a($$2xx, "path"),
                                                   $$1xxx -> us.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ee.a("long")
                                 .then(
                                    ee.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (ed)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                ev.a($$2xx, "path"),
                                                $$1xxx -> ui.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ee.a("double")
                              .then(
                                 ee.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (ed)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             ev.a($$2xx, "path"),
                                             $$1xxx -> ub.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        ee.a("byte")
                           .then(
                              ee.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (ed)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          ev.a($$2xx, "path"),
                                          $$1xxx -> ty.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static ed a(ed $$0, Collection<eus> $$1, eul $$2, boolean $$3) {
      eut $$4 = $$0.l().aK();
      return $$0.a(($$4x, $$5) -> {
         for (eus $$6 : $$1) {
            eur $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, ea::chain);
   }

   private static ed a(ed $$0, alh $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, ea::chain);
   }

   private static ed a(ed $$0, aow $$1, ev.g $$2, IntFunction<ux> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            ua $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, ea::chain);
   }

   private static boolean a(aqh $$0, in $$1) {
      czk $$2 = new czk($$1);
      dsn $$3 = $$0.l().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == aqa.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ed, ?> a(CommandNode<ed> $$0, LiteralArgumentBuilder<ed> $$1, boolean $$2, dz $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    ee.a("block")
                                       .then(
                                          ee.a("pos", fz.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ee.a("block", fv.a($$3)),
                                                   $$2,
                                                   $$0x -> fv.a($$0x, "block").test(new dql(((ed)$$0x.getSource()).e(), fz.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    ee.a("biome")
                                       .then(
                                          ee.a("pos", fz.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ee.a("biome", fg.a($$3, le.az)),
                                                   $$2,
                                                   $$0x -> fg.a($$0x, "biome", le.az).test(((ed)$$0x.getSource()).e().t(fz.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(ee.a("loaded").then(a($$0, ee.a("pos", fz.a()), $$2, $$0x -> a(((ed)$$0x.getSource()).e(), fz.b($$0x, "pos"))))))
                           .then(ee.a("dimension").then(a($$0, ee.a("dimension", eo.a()), $$2, $$0x -> eo.a($$0x, "dimension") == ((ed)$$0x.getSource()).e()))))
                        .then(
                           ee.a("score")
                              .then(
                                 ee.a("target", fi.a())
                                    .suggests(fi.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a(
                                                            "targetObjective", ex.a()
                                                         )
                                                         .then(
                                                            ee.a("=")
                                                               .then(
                                                                  ee.a("source", fi.a())
                                                                     .suggests(fi.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           ee.a("sourceObjective", ex.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (ami.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ee.a("<")
                                                            .then(
                                                               ee.a("source", fi.a())
                                                                  .suggests(fi.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        ee.a("sourceObjective", ex.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (ami.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      ee.a("<=")
                                                         .then(
                                                            ee.a("source", fi.a())
                                                               .suggests(fi.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     ee.a("sourceObjective", ex.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (ami.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ee.a(">")
                                                      .then(
                                                         ee.a("source", fi.a())
                                                            .suggests(fi.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  ee.a("sourceObjective", ex.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (ami.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ee.a(">=")
                                                   .then(
                                                      ee.a("source", fi.a())
                                                         .suggests(fi.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               ee.a("sourceObjective", ex.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (ami.e)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(ee.a("matches").then(a($$0, ee.a("range", fb.a()), $$2, $$0x -> a($$0x, fb.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        ee.a("blocks")
                           .then(
                              ee.a("start", fz.a())
                                 .then(
                                    ee.a("end", fz.a())
                                       .then(
                                          ((RequiredArgumentBuilder)ee.a("destination", fz.a()).then(a($$0, ee.a("all"), $$2, false)))
                                             .then(a($$0, ee.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ee.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)ee.a("entities", eq.b()).fork($$0, $$1x -> a($$1x, $$2, !eq.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (ami.b)($$0x -> eq.c($$0x, "entities").size())))
                        )
                  ))
               .then(ee.a("predicate").then(a($$0, ee.a("predicate", ff.c($$3)).suggests(f), $$2, $$0x -> a((ed)$$0x.getSource(), ff.c($$0x, "predicate"))))))
            .then(ee.a("function").then(ee.a("name", gl.a()).suggests(amn.b).fork($$0, new ami.d($$2)))))
         .then(
            ((LiteralArgumentBuilder)ee.a("items")
                  .then(
                     ee.a("entity")
                        .then(
                           ee.a("entities", eq.b())
                              .then(
                                 ee.a("slots", fm.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ee.a("item_predicate", gp.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(eq.b($$1x, "entities"), fm.a($$1x, "slots"), gp.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (ami.b)($$0x -> a(eq.b($$0x, "entities"), fm.a($$0x, "slots"), gp.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  ee.a("block")
                     .then(
                        ee.a("pos", fz.a())
                           .then(
                              ee.a("slots", fm.a())
                                 .then(
                                    ((RequiredArgumentBuilder)ee.a("item_predicate", gp.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((ed)$$1x.getSource(), fz.a($$1x, "pos"), fm.a($$1x, "slots"), gp.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (ami.b)($$0x -> a((ed)$$0x.getSource(), fz.a($$0x, "pos"), fm.a($$0x, "slots"), gp.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (aox.c $$4 : aox.c) {
         $$1.then(
            $$4.a(
               ee.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)ee.a("path", ev.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), ev.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (ami.b)($$1xx -> a($$4.a($$1xx), ev.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends brh> $$0, cqa $$1, Predicate<csz> $$2) {
      int $$3 = 0;

      for (brh $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            bsr $$8 = $$4.a_($$7);
            csz $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.G();
            }
         }
      }

      return $$3;
   }

   private static int a(ed $$0, in $$1, cqa $$2, Predicate<csz> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      bpf $$5 = ams.a($$0, $$1, ams.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            csz $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.G();
            }
         }
      }

      return $$4;
   }

   private static Command<ed> a(boolean $$0, ami.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ed)$$1x.getSource()).a(() -> wu.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ed)$$1x.getSource()).a(() -> wu.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(aow $$0, ev.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ed> $$0, ami.e $$1) throws CommandSyntaxException {
      eus $$2 = fi.a($$0, "target");
      eul $$3 = ex.a($$0, "targetObjective");
      eus $$4 = fi.a($$0, "source");
      eul $$5 = ex.a($$0, "sourceObjective");
      eut $$6 = ((ed)$$0.getSource()).l().aK();
      eup $$7 = $$6.d($$2, $$3);
      eup $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<ed> $$0, ct.d $$1) throws CommandSyntaxException {
      eus $$2 = fi.a($$0, "target");
      eul $$3 = ex.a($$0, "targetObjective");
      eut $$4 = ((ed)$$0.getSource()).l().aK();
      eup $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(ed $$0, iw<erq> $$1) {
      aqh $$2 = $$0.e();
      eoo $$3 = new eoo.a($$2).a(erc.f, $$0.d()).b(erc.a, $$0.f()).a(erb.d);
      eol $$4 = new eol.a($$3).a(Optional.empty());
      $$4.b(eol.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<ed> a(CommandContext<ed> $$0, boolean $$1, boolean $$2) {
      return (Collection<ed>)($$2 == $$1 ? Collections.singleton((ed)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ed, ?> a(CommandNode<ed> $$0, ArgumentBuilder<ed, ?> $$1, boolean $$2, ami.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ed)$$2x.getSource()).a(() -> wu.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<ed, ?> a(CommandNode<ed> $$0, ArgumentBuilder<ed, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<ed> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((ed)$$0.getSource()).a(() -> wu.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<ed> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((ed)$$0.getSource()).a(() -> wu.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ed> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ed)$$0.getSource()).e(), fz.a($$0, "start"), fz.a($$0, "end"), fz.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(aqh $$0, in $$1, in $$2, in $$3, boolean $$4) throws CommandSyntaxException {
      egh $$5 = egh.a($$1, $$2);
      egh $$6 = egh.a($$3, $$3.a($$5.c()));
      in $$7 = new in($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         jk $$9 = $$0.H_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  in $$14 = new in($$13, $$12, $$11);
                  in $$15 = $$14.a((jr)$$7);
                  dqh $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(ddg.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dnm $$17 = $$0.c_($$14);
                     dnm $$18 = $$0.c_($$15);
                     if ($$17 != null) {
                        if ($$18 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$18.r() != $$17.r()) {
                           return OptionalInt.empty();
                        }

                        ua $$19 = $$17.d($$9);
                        ua $$20 = $$18.d($$9);
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

   private static RedirectModifier<ed> a(Function<brh, Optional<brh>> $$0) {
      return $$1 -> {
         ed $$2 = (ed)$$1.getSource();
         brh $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dI()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ed> b(Function<brh, Stream<brh>> $$0) {
      return $$1 -> {
         ed $$2 = (ed)$$1.getSource();
         brh $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dI()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ed> a(CommandNode<ed> $$0, LiteralArgumentBuilder<ed> $$1) {
      return (LiteralArgumentBuilder<ed>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              ee.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<brh, Optional<brh>>)($$0x -> $$0x instanceof bsh $$1x ? Optional.ofNullable($$1x.P_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              ee.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<brh, Optional<brh>>)($$0x -> $$0x instanceof bsc $$1x ? Optional.ofNullable($$1x.ge()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           ee.a("target")
                              .fork($$0, a((Function<brh, Optional<brh>>)($$0x -> $$0x instanceof bsx $$1x ? Optional.ofNullable($$1x.p()) : Optional.empty())))
                        ))
                     .then(
                        ee.a("attacker")
                           .fork($$0, a((Function<brh, Optional<brh>>)($$0x -> $$0x instanceof bre $$1x ? Optional.ofNullable($$1x.T_()) : Optional.empty())))
                     ))
                  .then(ee.a("vehicle").fork($$0, a((Function<brh, Optional<brh>>)($$0x -> Optional.ofNullable($$0x.da()))))))
               .then(ee.a("controller").fork($$0, a((Function<brh, Optional<brh>>)($$0x -> Optional.ofNullable($$0x.cO()))))))
            .then(
               ee.a("origin").fork($$0, a((Function<brh, Optional<brh>>)($$0x -> $$0x instanceof bsy $$1x ? Optional.ofNullable($$1x.u()) : Optional.empty())))
            ))
         .then(ee.a("passengers").fork($$0, b((Function<brh, Stream<brh>>)($$0x -> $$0x.cQ().stream()))));
   }

   private static ed a(ed $$0, iw.c<brn<?>> $$1) throws CommandSyntaxException {
      brh $$2 = aog.a($$0, $$1, $$0.d(), new ua(), true);
      return $$0.a($$2);
   }

   public static <T extends ef<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable ua $$5, hd<T> $$6, ami.a<T, Collection<hp<T>>> $$7, gx $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<hp<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<hr<T>> $$14 = new ArrayList<>($$13);

         try {
            for (hp<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x()));
               } catch (eg var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            ea $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new hn<>($$2x -> {
               for (hr<T> $$3x : $$14) {
                  $$2x.a(new hj<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(hm.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new hi.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<ed> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<ed> var1) throws CommandSyntaxException;
   }

   static class d implements ha.a<ed> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ed $$0, List<ed> $$1, ContextChain<ed> $$2, gx $$3, hd<ed> $$4) {
         ami.a($$0, $$1, amn::a, this.a, $$2, null, $$4, $$0x -> gl.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
