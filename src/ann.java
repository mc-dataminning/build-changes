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

public class ann {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xc.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xc.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xc.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xc.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<ek> f = ($$0, $$1) -> {
      alu.a $$2 = ((ek)$$0.getSource()).l().bc();
      return ep.a($$2.a(mi.bt), $$1);
   };

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      LiteralCommandNode<ek> $$2 = $$0.register((LiteralArgumentBuilder)el.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(el.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, el.a("if"), true, $$1)))
                                             .then(a($$2, el.a("unless"), false, $$1)))
                                          .then(el.a("as").then(el.a("targets", ex.b()).fork($$2, $$0x -> {
                                             List<ek> $$1x = Lists.newArrayList();

                                             for (bwv $$2x : ex.c($$0x, "targets")) {
                                                $$1x.add(((ek)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(el.a("at").then(el.a("targets", ex.b()).fork($$2, $$0x -> {
                                          List<ek> $$1x = Lists.newArrayList();

                                          for (bwv $$2x : ex.c($$0x, "targets")) {
                                             $$1x.add(((ek)$$0x.getSource()).a((aru)$$2x.dV()).a($$2x.dt()).a($$2x.bT()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)el.a("store").then(a($$2, el.a("result"), true))).then(a($$2, el.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("positioned")
                                             .then(el.a("pos", go.a()).redirect($$2, $$0x -> ((ek)$$0x.getSource()).a(go.a($$0x, "pos")).a(ew.a.a))))
                                          .then(el.a("as").then(el.a("targets", ex.b()).fork($$2, $$0x -> {
                                             List<ek> $$1x = Lists.newArrayList();

                                             for (bwv $$2x : ex.c($$0x, "targets")) {
                                                $$1x.add(((ek)$$0x.getSource()).a($$2x.dt()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(el.a("over").then(el.a("heightmap", fa.a()).redirect($$2, $$0x -> {
                                          ffs $$1x = ((ek)$$0x.getSource()).d();
                                          aru $$2x = ((ek)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(jz.b($$3), jz.b($$4))) {
                                             throw gh.a.create();
                                          } else {
                                             int $$5 = $$2x.a(fa.a($$0x, "heightmap"), azq.a($$3), azq.a($$4));
                                             return ((ek)$$0x.getSource()).a(new ffs($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)el.a("rotated")
                                       .then(el.a("rot", gl.a()).redirect($$2, $$0x -> ((ek)$$0x.getSource()).a(gl.a($$0x, "rot").b((ek)$$0x.getSource())))))
                                    .then(el.a("as").then(el.a("targets", ex.b()).fork($$2, $$0x -> {
                                       List<ek> $$1x = Lists.newArrayList();

                                       for (bwv $$2x : ex.c($$0x, "targets")) {
                                          $$1x.add(((ek)$$0x.getSource()).a($$2x.bT()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)el.a("facing")
                                    .then(el.a("entity").then(el.a("targets", ex.b()).then(el.a("anchor", ew.a()).fork($$2, $$0x -> {
                                       List<ek> $$1x = Lists.newArrayList();
                                       ew.a $$2x = ew.a($$0x, "anchor");

                                       for (bwv $$3 : ex.c($$0x, "targets")) {
                                          $$1x.add(((ek)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(el.a("pos", go.a()).redirect($$2, $$0x -> ((ek)$$0x.getSource()).b(go.a($$0x, "pos"))))
                           ))
                        .then(
                           el.a("align")
                              .then(el.a("axes", gm.a()).redirect($$2, $$0x -> ((ek)$$0x.getSource()).a(((ek)$$0x.getSource()).d().a(gm.a($$0x, "axes")))))
                        ))
                     .then(el.a("anchored").then(el.a("anchor", ew.a()).redirect($$2, $$0x -> ((ek)$$0x.getSource()).a(ew.a($$0x, "anchor"))))))
                  .then(el.a("in").then(el.a("dimension", ev.a()).redirect($$2, $$0x -> ((ek)$$0x.getSource()).a(ev.a($$0x, "dimension"))))))
               .then(el.a("summon").then(el.a("entity", fj.a($$1, mi.B)).suggests(il.c).redirect($$2, $$0x -> a((ek)$$0x.getSource(), fj.e($$0x, "entity"))))))
            .then(a($$2, el.a("on")))
      );
   }

   private static ArgumentBuilder<ek, ?> a(LiteralCommandNode<ek> $$0, LiteralArgumentBuilder<ek> $$1, boolean $$2) {
      $$1.then(
         el.a("score")
            .then(
               el.a("targets", fq.b())
                  .suggests(fq.a)
                  .then(el.a("objective", fe.a()).redirect($$0, $$1x -> a((ek)$$1x.getSource(), fq.c($$1x, "targets"), fe.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         el.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)el.a("id", fl.a())
                     .suggests(amx.a)
                     .then(el.a("value").redirect($$0, $$1x -> a((ek)$$1x.getSource(), amx.a($$1x), true, $$2))))
                  .then(el.a("max").redirect($$0, $$1x -> a((ek)$$1x.getSource(), amx.a($$1x), false, $$2)))
            )
      );

      for (aqe.c $$3 : aqe.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a(
                                       "path", fc.a()
                                    )
                                    .then(
                                       el.a("int")
                                          .then(
                                             el.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (ek)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         fc.a($$2xx, "path"),
                                                         $$1xxx -> uf.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    el.a("float")
                                       .then(
                                          el.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (ek)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      fc.a($$2xx, "path"),
                                                      $$1xxx -> ud.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 el.a("short")
                                    .then(
                                       el.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (ek)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   fc.a($$2xx, "path"),
                                                   $$1xxx -> ut.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              el.a("long")
                                 .then(
                                    el.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (ek)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                fc.a($$2xx, "path"),
                                                $$1xxx -> ui.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           el.a("double")
                              .then(
                                 el.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (ek)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             fc.a($$2xx, "path"),
                                             $$1xxx -> ub.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        el.a("byte")
                           .then(
                              el.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (ek)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          fc.a($$2xx, "path"),
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

   private static ek a(ek $$0, Collection<fgw> $$1, fgp $$2, boolean $$3) {
      fgx $$4 = $$0.l().aJ();
      return $$0.a(($$4x, $$5) -> {
         for (fgw $$6 : $$1) {
            fgv $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, eh::chain);
   }

   private static ek a(ek $$0, amm $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, eh::chain);
   }

   private static ek a(ek $$0, aqd $$1, fc.g $$2, IntFunction<va> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            ua $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, eh::chain);
   }

   private static boolean a(aru $$0, iw $$1) {
      dje $$2 = new dje($$1);
      edn $$3 = $$0.m().a($$2.h, $$2.i);
      return $$3 == null ? false : $$3.F() == ari.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ek, ?> a(CommandNode<ek> $$0, LiteralArgumentBuilder<ek> $$1, boolean $$2, eg $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    el.a("block")
                                       .then(
                                          el.a("pos", gh.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   el.a("block", gd.a($$3)),
                                                   $$2,
                                                   $$0x -> gd.a($$0x, "block").test(new ebk(((ek)$$0x.getSource()).e(), gh.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    el.a("biome")
                                       .then(
                                          el.a("pos", gh.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   el.a("biome", fn.a($$3, mi.aG)),
                                                   $$2,
                                                   $$0x -> fn.a($$0x, "biome", mi.aG).test(((ek)$$0x.getSource()).e().u(gh.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(el.a("loaded").then(a($$0, el.a("pos", gh.a()), $$2, $$0x -> a(((ek)$$0x.getSource()).e(), gh.b($$0x, "pos"))))))
                           .then(el.a("dimension").then(a($$0, el.a("dimension", ev.a()), $$2, $$0x -> ev.a($$0x, "dimension") == ((ek)$$0x.getSource()).e()))))
                        .then(
                           el.a("score")
                              .then(
                                 el.a("target", fq.a())
                                    .suggests(fq.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a(
                                                            "targetObjective", fe.a()
                                                         )
                                                         .then(
                                                            el.a("=")
                                                               .then(
                                                                  el.a("source", fq.a())
                                                                     .suggests(fq.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           el.a("sourceObjective", fe.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (ann.d)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         el.a("<")
                                                            .then(
                                                               el.a("source", fq.a())
                                                                  .suggests(fq.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        el.a("sourceObjective", fe.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (ann.d)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      el.a("<=")
                                                         .then(
                                                            el.a("source", fq.a())
                                                               .suggests(fq.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     el.a("sourceObjective", fe.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (ann.d)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   el.a(">")
                                                      .then(
                                                         el.a("source", fq.a())
                                                            .suggests(fq.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  el.a("sourceObjective", fe.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (ann.d)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                el.a(">=")
                                                   .then(
                                                      el.a("source", fq.a())
                                                         .suggests(fq.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               el.a("sourceObjective", fe.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (ann.d)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(el.a("matches").then(a($$0, el.a("range", fi.a()), $$2, $$0x -> a($$0x, fi.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        el.a("blocks")
                           .then(
                              el.a("start", gh.a())
                                 .then(
                                    el.a("end", gh.a())
                                       .then(
                                          ((RequiredArgumentBuilder)el.a("destination", gh.a()).then(a($$0, el.a("all"), $$2, false)))
                                             .then(a($$0, el.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     el.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)el.a("entities", ex.b()).fork($$0, $$1x -> a($$1x, $$2, !ex.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (ann.a)($$0x -> ex.c($$0x, "entities").size())))
                        )
                  ))
               .then(el.a("predicate").then(a($$0, el.a("predicate", fm.c($$3)).suggests(f), $$2, $$0x -> a((ek)$$0x.getSource(), fm.c($$0x, "predicate"))))))
            .then(el.a("function").then(el.a("name", gt.a()).suggests(ans.b).fork($$0, new ann.c($$2)))))
         .then(
            ((LiteralArgumentBuilder)el.a("items")
                  .then(
                     el.a("entity")
                        .then(
                           el.a("entities", ex.b())
                              .then(
                                 el.a("slots", fu.a())
                                    .then(
                                       ((RequiredArgumentBuilder)el.a("item_predicate", gx.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(ex.b($$1x, "entities"), fu.a($$1x, "slots"), gx.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (ann.a)($$0x -> a(ex.b($$0x, "entities"), fu.a($$0x, "slots"), gx.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  el.a("block")
                     .then(
                        el.a("pos", gh.a())
                           .then(
                              el.a("slots", fu.a())
                                 .then(
                                    ((RequiredArgumentBuilder)el.a("item_predicate", gx.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((ek)$$1x.getSource(), gh.a($$1x, "pos"), fu.a($$1x, "slots"), gx.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (ann.a)($$0x -> a((ek)$$0x.getSource(), gh.a($$0x, "pos"), fu.a($$0x, "slots"), gx.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (aqe.c $$4 : aqe.c) {
         $$1.then(
            $$4.a(
               el.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)el.a("path", fc.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), fc.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (ann.a)($$1xx -> a($$4.a($$1xx), fc.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends bwv> $$0, cxq $$1, Predicate<daa> $$2) {
      int $$3 = 0;

      for (bwv $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            byn $$8 = $$4.a_($$7);
            daa $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.M();
            }
         }
      }

      return $$3;
   }

   private static int a(ek $$0, iw $$1, cxq $$2, Predicate<daa> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      bum $$5 = any.a($$0, $$1, any.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            daa $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.M();
            }
         }
      }

      return $$4;
   }

   private static Command<ek> a(boolean $$0, ann.a $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ek)$$1x.getSource()).a(() -> xc.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ek)$$1x.getSource()).a(() -> xc.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(aqd $$0, fc.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ek> $$0, ann.d $$1) throws CommandSyntaxException {
      fgw $$2 = fq.a($$0, "target");
      fgp $$3 = fe.a($$0, "targetObjective");
      fgw $$4 = fq.a($$0, "source");
      fgp $$5 = fe.a($$0, "sourceObjective");
      fgx $$6 = ((ek)$$0.getSource()).l().aJ();
      fgt $$7 = $$6.d($$2, $$3);
      fgt $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<ek> $$0, cx.d $$1) throws CommandSyntaxException {
      fgw $$2 = fq.a($$0, "target");
      fgp $$3 = fe.a($$0, "targetObjective");
      fgx $$4 = ((ek)$$0.getSource()).l().aJ();
      fgt $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(ek $$0, jg<fds> $$1) {
      aru $$2 = $$0.e();
      fam $$3 = new fam.a($$2).a(fdd.f, $$0.d()).b(fdd.a, $$0.f()).a(fdc.d);
      faj $$4 = new faj.a($$3).a(Optional.empty());
      $$4.b(faj.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<ek> a(CommandContext<ek> $$0, boolean $$1, boolean $$2) {
      return (Collection<ek>)($$2 == $$1 ? Collections.singleton((ek)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ek, ?> a(CommandNode<ek> $$0, ArgumentBuilder<ek, ?> $$1, boolean $$2, ann.b $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ek)$$2x.getSource()).a(() -> xc.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<ek, ?> a(CommandNode<ek> $$0, ArgumentBuilder<ek, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<ek> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((ek)$$0.getSource()).a(() -> xc.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<ek> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((ek)$$0.getSource()).a(() -> xc.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ek> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ek)$$0.getSource()).e(), gh.a($$0, "start"), gh.a($$0, "end"), gh.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(aru $$0, iw $$1, iw $$2, iw $$3, boolean $$4) throws CommandSyntaxException {
      erv $$5 = erv.a($$1, $$2);
      erv $$6 = erv.a($$3, $$3.a($$5.c()));
      iw $$7 = new iw($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         ju $$9 = $$0.J_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  iw $$14 = new iw($$13, $$12, $$11);
                  iw $$15 = $$14.a((kb)$$7);
                  ebg $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dng.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dye $$17 = $$0.c_($$14);
                     dye $$18 = $$0.c_($$15);
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

                        ua $$19 = $$17.e($$9);
                        ua $$20 = $$18.e($$9);
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

   private static RedirectModifier<ek> a(Function<bwv, Optional<bwv>> $$0) {
      return $$1 -> {
         ek $$2 = (ek)$$1.getSource();
         bwv $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dQ()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ek> b(Function<bwv, Stream<bwv>> $$0) {
      return $$1 -> {
         ek $$2 = (ek)$$1.getSource();
         bwv $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dQ()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ek> a(CommandNode<ek> $$0, LiteralArgumentBuilder<ek> $$1) {
      return (LiteralArgumentBuilder<ek>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              el.a("owner")
                                 .fork(
                                    $$0, a((Function<bwv, Optional<bwv>>)($$0x -> $$0x instanceof byd $$1x ? Optional.ofNullable($$1x.e()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              el.a("leasher")
                                 .fork(
                                    $$0, a((Function<bwv, Optional<bwv>>)($$0x -> $$0x instanceof bxu $$1x ? Optional.ofNullable($$1x.C()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           el.a("target")
                              .fork($$0, a((Function<bwv, Optional<bwv>>)($$0x -> $$0x instanceof byt $$1x ? Optional.ofNullable($$1x.f()) : Optional.empty())))
                        ))
                     .then(
                        el.a("attacker")
                           .fork($$0, a((Function<bwv, Optional<bwv>>)($$0x -> $$0x instanceof bwo $$1x ? Optional.ofNullable($$1x.aj()) : Optional.empty())))
                     ))
                  .then(el.a("vehicle").fork($$0, a((Function<bwv, Optional<bwv>>)($$0x -> Optional.ofNullable($$0x.dk()))))))
               .then(el.a("controller").fork($$0, a((Function<bwv, Optional<bwv>>)($$0x -> Optional.ofNullable($$0x.cW()))))))
            .then(
               el.a("origin").fork($$0, a((Function<bwv, Optional<bwv>>)($$0x -> $$0x instanceof byu $$1x ? Optional.ofNullable($$1x.q()) : Optional.empty())))
            ))
         .then(el.a("passengers").fork($$0, b((Function<bwv, Stream<bwv>>)($$0x -> $$0x.cY().stream()))));
   }

   private static ek a(ek $$0, jg.c<bxe<?>> $$1) throws CommandSyntaxException {
      bwv $$2 = apn.a($$0, $$1, $$0.d(), new ua(), true);
      return $$0.a($$2);
   }

   public static <T extends em<T>> void a(
      T $$0,
      List<T> $$1,
      Function<T, T> $$2,
      IntPredicate $$3,
      ContextChain<T> $$4,
      @Nullable ua $$5,
      hm<T> $$6,
      anx<CommandContext<T>, Collection<hy<T>>> $$7,
      hg $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<hy<T>> $$10;
      try {
         $$10 = $$7.apply($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<ia<T>> $$14 = new ArrayList<>($$13);

         try {
            for (hy<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.w()));
               } catch (en var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            eh $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new hw<>($$2x -> {
               for (ia<T> $$3x : $$14) {
                  $$2x.a(new hs<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(hv.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new hr.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   interface a {
      int test(CommandContext<ek> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      boolean test(CommandContext<ek> var1) throws CommandSyntaxException;
   }

   static class c implements hj.a<ek> {
      private final IntPredicate a;

      c(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ek $$0, List<ek> $$1, ContextChain<ek> $$2, hg $$3, hm<ek> $$4) {
         ann.a($$0, $$1, ans::a, this.a, $$2, null, $$4, $$0x -> gt.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface d {
      boolean test(int var1, int var2);
   }
}
