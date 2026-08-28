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

public class ank {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xh.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xh.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xh.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<ev> f = ($$0, $$1) -> {
      alr.a $$2 = ((ev)$$0.getSource()).l().bd();
      return fa.a($$2.a(ly.bf), $$1);
   };

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      LiteralCommandNode<ev> $$2 = $$0.register((LiteralArgumentBuilder)ew.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(ew.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, ew.a("if"), true, $$1)))
                                             .then(a($$2, ew.a("unless"), false, $$1)))
                                          .then(ew.a("as").then(ew.a("targets", fi.b()).fork($$2, $$0x -> {
                                             List<ev> $$1x = Lists.newArrayList();

                                             for (btz $$2x : fi.c($$0x, "targets")) {
                                                $$1x.add(((ev)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ew.a("at").then(ew.a("targets", fi.b()).fork($$2, $$0x -> {
                                          List<ev> $$1x = Lists.newArrayList();

                                          for (btz $$2x : fi.c($$0x, "targets")) {
                                             $$1x.add(((ev)$$0x.getSource()).a((arm)$$2x.dX()).a($$2x.dv()).a($$2x.bV()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)ew.a("store").then(a($$2, ew.a("result"), true))).then(a($$2, ew.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("positioned")
                                             .then(ew.a("pos", gy.a()).redirect($$2, $$0x -> ((ev)$$0x.getSource()).a(gy.a($$0x, "pos")).a(fh.a.a))))
                                          .then(ew.a("as").then(ew.a("targets", fi.b()).fork($$2, $$0x -> {
                                             List<ev> $$1x = Lists.newArrayList();

                                             for (btz $$2x : fi.c($$0x, "targets")) {
                                                $$1x.add(((ev)$$0x.getSource()).a($$2x.dv()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ew.a("over").then(ew.a("heightmap", fl.a()).redirect($$2, $$0x -> {
                                          ezh $$1x = ((ev)$$0x.getSource()).d();
                                          arm $$2x = ((ev)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(ki.b($$3), ki.b($$4))) {
                                             throw gr.a.create();
                                          } else {
                                             int $$5 = $$2x.a(fl.a($$0x, "heightmap"), azj.a($$3), azj.a($$4));
                                             return ((ev)$$0x.getSource()).a(new ezh($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ew.a("rotated")
                                       .then(ew.a("rot", gv.a()).redirect($$2, $$0x -> ((ev)$$0x.getSource()).a(gv.a($$0x, "rot").b((ev)$$0x.getSource())))))
                                    .then(ew.a("as").then(ew.a("targets", fi.b()).fork($$2, $$0x -> {
                                       List<ev> $$1x = Lists.newArrayList();

                                       for (btz $$2x : fi.c($$0x, "targets")) {
                                          $$1x.add(((ev)$$0x.getSource()).a($$2x.bV()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ew.a("facing")
                                    .then(ew.a("entity").then(ew.a("targets", fi.b()).then(ew.a("anchor", fh.a()).fork($$2, $$0x -> {
                                       List<ev> $$1x = Lists.newArrayList();
                                       fh.a $$2x = fh.a($$0x, "anchor");

                                       for (btz $$3 : fi.c($$0x, "targets")) {
                                          $$1x.add(((ev)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(ew.a("pos", gy.a()).redirect($$2, $$0x -> ((ev)$$0x.getSource()).b(gy.a($$0x, "pos"))))
                           ))
                        .then(
                           ew.a("align")
                              .then(ew.a("axes", gw.a()).redirect($$2, $$0x -> ((ev)$$0x.getSource()).a(((ev)$$0x.getSource()).d().a(gw.a($$0x, "axes")))))
                        ))
                     .then(ew.a("anchored").then(ew.a("anchor", fh.a()).redirect($$2, $$0x -> ((ev)$$0x.getSource()).a(fh.a($$0x, "anchor"))))))
                  .then(ew.a("in").then(ew.a("dimension", fg.a()).redirect($$2, $$0x -> ((ev)$$0x.getSource()).a(fg.a($$0x, "dimension"))))))
               .then(ew.a("summon").then(ew.a("entity", fu.a($$1, ly.z)).suggests(iv.d).redirect($$2, $$0x -> a((ev)$$0x.getSource(), fu.e($$0x, "entity"))))))
            .then(a($$2, ew.a("on")))
      );
   }

   private static ArgumentBuilder<ev, ?> a(LiteralCommandNode<ev> $$0, LiteralArgumentBuilder<ev> $$1, boolean $$2) {
      $$1.then(
         ew.a("score")
            .then(
               ew.a("targets", ga.b())
                  .suggests(ga.a)
                  .then(ew.a("objective", fp.a()).redirect($$0, $$1x -> a((ev)$$1x.getSource(), ga.c($$1x, "targets"), fp.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         ew.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)ew.a("id", fw.a())
                     .suggests(amu.a)
                     .then(ew.a("value").redirect($$0, $$1x -> a((ev)$$1x.getSource(), amu.a($$1x), true, $$2))))
                  .then(ew.a("max").redirect($$0, $$1x -> a((ev)$$1x.getSource(), amu.a($$1x), false, $$2)))
            )
      );

      for (apy.c $$3 : apy.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a(
                                       "path", fn.a()
                                    )
                                    .then(
                                       ew.a("int")
                                          .then(
                                             ew.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (ev)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         fn.a($$2xx, "path"),
                                                         $$1xxx -> uo.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ew.a("float")
                                       .then(
                                          ew.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (ev)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      fn.a($$2xx, "path"),
                                                      $$1xxx -> um.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ew.a("short")
                                    .then(
                                       ew.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (ev)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   fn.a($$2xx, "path"),
                                                   $$1xxx -> vb.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ew.a("long")
                                 .then(
                                    ew.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (ev)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                fn.a($$2xx, "path"),
                                                $$1xxx -> ur.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ew.a("double")
                              .then(
                                 ew.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (ev)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             fn.a($$2xx, "path"),
                                             $$1xxx -> uk.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        ew.a("byte")
                           .then(
                              ew.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (ev)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          fn.a($$2xx, "path"),
                                          $$1xxx -> uh.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static ev a(ev $$0, Collection<fal> $$1, fae $$2, boolean $$3) {
      fam $$4 = $$0.l().aJ();
      return $$0.a(($$4x, $$5) -> {
         for (fal $$6 : $$1) {
            fak $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, es::chain);
   }

   private static ev a(ev $$0, amj $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, es::chain);
   }

   private static ev a(ev $$0, apx $$1, fn.g $$2, IntFunction<vg> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            uj $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, es::chain);
   }

   private static boolean a(arm $$0, jg $$1) {
      deb $$2 = new deb($$1);
      dxj $$3 = $$0.l().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.C() == arc.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ev, ?> a(CommandNode<ev> $$0, LiteralArgumentBuilder<ev> $$1, boolean $$2, er $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    ew.a("block")
                                       .then(
                                          ew.a("pos", gr.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ew.a("block", gn.a($$3)),
                                                   $$2,
                                                   $$0x -> gn.a($$0x, "block").test(new dvh(((ev)$$0x.getSource()).e(), gr.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    ew.a("biome")
                                       .then(
                                          ew.a("pos", gr.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ew.a("biome", fy.a($$3, ly.aG)),
                                                   $$2,
                                                   $$0x -> fy.a($$0x, "biome", ly.aG).test(((ev)$$0x.getSource()).e().t(gr.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(ew.a("loaded").then(a($$0, ew.a("pos", gr.a()), $$2, $$0x -> a(((ev)$$0x.getSource()).e(), gr.b($$0x, "pos"))))))
                           .then(ew.a("dimension").then(a($$0, ew.a("dimension", fg.a()), $$2, $$0x -> fg.a($$0x, "dimension") == ((ev)$$0x.getSource()).e()))))
                        .then(
                           ew.a("score")
                              .then(
                                 ew.a("target", ga.a())
                                    .suggests(ga.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a(
                                                            "targetObjective", fp.a()
                                                         )
                                                         .then(
                                                            ew.a("=")
                                                               .then(
                                                                  ew.a("source", ga.a())
                                                                     .suggests(ga.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           ew.a("sourceObjective", fp.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (ank.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ew.a("<")
                                                            .then(
                                                               ew.a("source", ga.a())
                                                                  .suggests(ga.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        ew.a("sourceObjective", fp.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (ank.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      ew.a("<=")
                                                         .then(
                                                            ew.a("source", ga.a())
                                                               .suggests(ga.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     ew.a("sourceObjective", fp.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (ank.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ew.a(">")
                                                      .then(
                                                         ew.a("source", ga.a())
                                                            .suggests(ga.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  ew.a("sourceObjective", fp.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (ank.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ew.a(">=")
                                                   .then(
                                                      ew.a("source", ga.a())
                                                         .suggests(ga.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               ew.a("sourceObjective", fp.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (ank.e)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(ew.a("matches").then(a($$0, ew.a("range", ft.a()), $$2, $$0x -> a($$0x, ft.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        ew.a("blocks")
                           .then(
                              ew.a("start", gr.a())
                                 .then(
                                    ew.a("end", gr.a())
                                       .then(
                                          ((RequiredArgumentBuilder)ew.a("destination", gr.a()).then(a($$0, ew.a("all"), $$2, false)))
                                             .then(a($$0, ew.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ew.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)ew.a("entities", fi.b()).fork($$0, $$1x -> a($$1x, $$2, !fi.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (ank.b)($$0x -> fi.c($$0x, "entities").size())))
                        )
                  ))
               .then(ew.a("predicate").then(a($$0, ew.a("predicate", fx.c($$3)).suggests(f), $$2, $$0x -> a((ev)$$0x.getSource(), fx.c($$0x, "predicate"))))))
            .then(ew.a("function").then(ew.a("name", hd.a()).suggests(anp.b).fork($$0, new ank.d($$2)))))
         .then(
            ((LiteralArgumentBuilder)ew.a("items")
                  .then(
                     ew.a("entity")
                        .then(
                           ew.a("entities", fi.b())
                              .then(
                                 ew.a("slots", ge.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ew.a("item_predicate", hh.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(fi.b($$1x, "entities"), ge.a($$1x, "slots"), hh.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (ank.b)($$0x -> a(fi.b($$0x, "entities"), ge.a($$0x, "slots"), hh.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  ew.a("block")
                     .then(
                        ew.a("pos", gr.a())
                           .then(
                              ew.a("slots", ge.a())
                                 .then(
                                    ((RequiredArgumentBuilder)ew.a("item_predicate", hh.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((ev)$$1x.getSource(), gr.a($$1x, "pos"), ge.a($$1x, "slots"), hh.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (ank.b)($$0x -> a((ev)$$0x.getSource(), gr.a($$0x, "pos"), ge.a($$0x, "slots"), hh.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (apy.c $$4 : apy.c) {
         $$1.then(
            $$4.a(
               ew.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)ew.a("path", fn.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), fn.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (ank.b)($$1xx -> a($$4.a($$1xx), fn.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends btz> $$0, cth $$1, Predicate<cvx> $$2) {
      int $$3 = 0;

      for (btz $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            bvn $$8 = $$4.a_($$7);
            cvx $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.L();
            }
         }
      }

      return $$3;
   }

   private static int a(ev $$0, jg $$1, cth $$2, Predicate<cvx> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      brr $$5 = anu.a($$0, $$1, anu.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            cvx $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.L();
            }
         }
      }

      return $$4;
   }

   private static Command<ev> a(boolean $$0, ank.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ev)$$1x.getSource()).a(() -> xh.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ev)$$1x.getSource()).a(() -> xh.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(apx $$0, fn.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ev> $$0, ank.e $$1) throws CommandSyntaxException {
      fal $$2 = ga.a($$0, "target");
      fae $$3 = fp.a($$0, "targetObjective");
      fal $$4 = ga.a($$0, "source");
      fae $$5 = fp.a($$0, "sourceObjective");
      fam $$6 = ((ev)$$0.getSource()).l().aJ();
      fai $$7 = $$6.d($$2, $$3);
      fai $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<ev> $$0, di.d $$1) throws CommandSyntaxException {
      fal $$2 = ga.a($$0, "target");
      fae $$3 = fp.a($$0, "targetObjective");
      fam $$4 = ((ev)$$0.getSource()).l().aJ();
      fai $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(ev $$0, jp<exh> $$1) {
      arm $$2 = $$0.e();
      etz $$3 = new etz.a($$2).a(ews.f, $$0.d()).b(ews.a, $$0.f()).a(ewr.d);
      etw $$4 = new etw.a($$3).a(Optional.empty());
      $$4.b(etw.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<ev> a(CommandContext<ev> $$0, boolean $$1, boolean $$2) {
      return (Collection<ev>)($$2 == $$1 ? Collections.singleton((ev)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ev, ?> a(CommandNode<ev> $$0, ArgumentBuilder<ev, ?> $$1, boolean $$2, ank.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ev)$$2x.getSource()).a(() -> xh.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<ev, ?> a(CommandNode<ev> $$0, ArgumentBuilder<ev, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<ev> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((ev)$$0.getSource()).a(() -> xh.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<ev> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((ev)$$0.getSource()).a(() -> xh.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ev> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ev)$$0.getSource()).e(), gr.a($$0, "start"), gr.a($$0, "end"), gr.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(arm $$0, jg $$1, jg $$2, jg $$3, boolean $$4) throws CommandSyntaxException {
      elj $$5 = elj.a($$1, $$2);
      elj $$6 = elj.a($$3, $$3.a($$5.c()));
      jg $$7 = new jg($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         kd $$9 = $$0.H_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  jg $$14 = new jg($$13, $$12, $$11);
                  jg $$15 = $$14.a((kk)$$7);
                  dvd $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dia.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dsg $$17 = $$0.c_($$14);
                     dsg $$18 = $$0.c_($$15);
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

                        uj $$19 = $$17.e($$9);
                        uj $$20 = $$18.e($$9);
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

   private static RedirectModifier<ev> a(Function<btz, Optional<btz>> $$0) {
      return $$1 -> {
         ev $$2 = (ev)$$1.getSource();
         btz $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dS()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ev> b(Function<btz, Stream<btz>> $$0) {
      return $$1 -> {
         ev $$2 = (ev)$$1.getSource();
         btz $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dS()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ev> a(CommandNode<ev> $$0, LiteralArgumentBuilder<ev> $$1) {
      return (LiteralArgumentBuilder<ev>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              ew.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<btz, Optional<btz>>)($$0x -> $$0x instanceof bvc $$1x ? Optional.ofNullable($$1x.T_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              ew.a("leasher")
                                 .fork(
                                    $$0, a((Function<btz, Optional<btz>>)($$0x -> $$0x instanceof but $$1x ? Optional.ofNullable($$1x.C()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           ew.a("target")
                              .fork($$0, a((Function<btz, Optional<btz>>)($$0x -> $$0x instanceof bvt $$1x ? Optional.ofNullable($$1x.m()) : Optional.empty())))
                        ))
                     .then(
                        ew.a("attacker")
                           .fork($$0, a((Function<btz, Optional<btz>>)($$0x -> $$0x instanceof btt $$1x ? Optional.ofNullable($$1x.Z_()) : Optional.empty())))
                     ))
                  .then(ew.a("vehicle").fork($$0, a((Function<btz, Optional<btz>>)($$0x -> Optional.ofNullable($$0x.dl()))))))
               .then(ew.a("controller").fork($$0, a((Function<btz, Optional<btz>>)($$0x -> Optional.ofNullable($$0x.cY()))))))
            .then(
               ew.a("origin").fork($$0, a((Function<btz, Optional<btz>>)($$0x -> $$0x instanceof bvu $$1x ? Optional.ofNullable($$1x.s()) : Optional.empty())))
            ))
         .then(ew.a("passengers").fork($$0, b((Function<btz, Stream<btz>>)($$0x -> $$0x.da().stream()))));
   }

   private static ev a(ev $$0, jp.c<bug<?>> $$1) throws CommandSyntaxException {
      btz $$2 = aph.a($$0, $$1, $$0.d(), new uj(), true);
      return $$0.a($$2);
   }

   public static <T extends ex<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable uj $$5, hw<T> $$6, ank.a<T, Collection<ij<T>>> $$7, hq $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<ij<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<il<T>> $$14 = new ArrayList<>($$13);

         try {
            for (ij<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x()));
               } catch (ey var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            es $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new ih<>($$2x -> {
               for (il<T> $$3x : $$14) {
                  $$2x.a(new ic<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(ig.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new ib.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<ev> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<ev> var1) throws CommandSyntaxException;
   }

   static class d implements ht.a<ev> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ev $$0, List<ev> $$1, ContextChain<ev> $$2, hq $$3, hw<ev> $$4) {
         ank.a($$0, $$1, anp::a, this.a, $$2, null, $$4, $$0x -> hd.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
