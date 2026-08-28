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

public class anl {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xa.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xa.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xa.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xa.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<ej> f = ($$0, $$1) -> {
      als.a $$2 = ((ej)$$0.getSource()).l().bc();
      return eo.a($$2.a(mh.bt), $$1);
   };

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      LiteralCommandNode<ej> $$2 = $$0.register((LiteralArgumentBuilder)ek.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(ek.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, ek.a("if"), true, $$1)))
                                             .then(a($$2, ek.a("unless"), false, $$1)))
                                          .then(ek.a("as").then(ek.a("targets", ew.b()).fork($$2, $$0x -> {
                                             List<ej> $$1x = Lists.newArrayList();

                                             for (bwt $$2x : ew.c($$0x, "targets")) {
                                                $$1x.add(((ej)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ek.a("at").then(ek.a("targets", ew.b()).fork($$2, $$0x -> {
                                          List<ej> $$1x = Lists.newArrayList();

                                          for (bwt $$2x : ew.c($$0x, "targets")) {
                                             $$1x.add(((ej)$$0x.getSource()).a((ars)$$2x.dV()).a($$2x.dt()).a($$2x.bT()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)ek.a("store").then(a($$2, ek.a("result"), true))).then(a($$2, ek.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("positioned")
                                             .then(ek.a("pos", gn.a()).redirect($$2, $$0x -> ((ej)$$0x.getSource()).a(gn.a($$0x, "pos")).a(ev.a.a))))
                                          .then(ek.a("as").then(ek.a("targets", ew.b()).fork($$2, $$0x -> {
                                             List<ej> $$1x = Lists.newArrayList();

                                             for (bwt $$2x : ew.c($$0x, "targets")) {
                                                $$1x.add(((ej)$$0x.getSource()).a($$2x.dt()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ek.a("over").then(ek.a("heightmap", ez.a()).redirect($$2, $$0x -> {
                                          ffq $$1x = ((ej)$$0x.getSource()).d();
                                          ars $$2x = ((ej)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(jy.b($$3), jy.b($$4))) {
                                             throw gg.a.create();
                                          } else {
                                             int $$5 = $$2x.a(ez.a($$0x, "heightmap"), azo.a($$3), azo.a($$4));
                                             return ((ej)$$0x.getSource()).a(new ffq($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ek.a("rotated")
                                       .then(ek.a("rot", gk.a()).redirect($$2, $$0x -> ((ej)$$0x.getSource()).a(gk.a($$0x, "rot").b((ej)$$0x.getSource())))))
                                    .then(ek.a("as").then(ek.a("targets", ew.b()).fork($$2, $$0x -> {
                                       List<ej> $$1x = Lists.newArrayList();

                                       for (bwt $$2x : ew.c($$0x, "targets")) {
                                          $$1x.add(((ej)$$0x.getSource()).a($$2x.bT()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ek.a("facing")
                                    .then(ek.a("entity").then(ek.a("targets", ew.b()).then(ek.a("anchor", ev.a()).fork($$2, $$0x -> {
                                       List<ej> $$1x = Lists.newArrayList();
                                       ev.a $$2x = ev.a($$0x, "anchor");

                                       for (bwt $$3 : ew.c($$0x, "targets")) {
                                          $$1x.add(((ej)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(ek.a("pos", gn.a()).redirect($$2, $$0x -> ((ej)$$0x.getSource()).b(gn.a($$0x, "pos"))))
                           ))
                        .then(
                           ek.a("align")
                              .then(ek.a("axes", gl.a()).redirect($$2, $$0x -> ((ej)$$0x.getSource()).a(((ej)$$0x.getSource()).d().a(gl.a($$0x, "axes")))))
                        ))
                     .then(ek.a("anchored").then(ek.a("anchor", ev.a()).redirect($$2, $$0x -> ((ej)$$0x.getSource()).a(ev.a($$0x, "anchor"))))))
                  .then(ek.a("in").then(ek.a("dimension", eu.a()).redirect($$2, $$0x -> ((ej)$$0x.getSource()).a(eu.a($$0x, "dimension"))))))
               .then(ek.a("summon").then(ek.a("entity", fi.a($$1, mh.B)).suggests(ik.c).redirect($$2, $$0x -> a((ej)$$0x.getSource(), fi.e($$0x, "entity"))))))
            .then(a($$2, ek.a("on")))
      );
   }

   private static ArgumentBuilder<ej, ?> a(LiteralCommandNode<ej> $$0, LiteralArgumentBuilder<ej> $$1, boolean $$2) {
      $$1.then(
         ek.a("score")
            .then(
               ek.a("targets", fp.b())
                  .suggests(fp.a)
                  .then(ek.a("objective", fd.a()).redirect($$0, $$1x -> a((ej)$$1x.getSource(), fp.c($$1x, "targets"), fd.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         ek.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)ek.a("id", fk.a())
                     .suggests(amv.a)
                     .then(ek.a("value").redirect($$0, $$1x -> a((ej)$$1x.getSource(), amv.a($$1x), true, $$2))))
                  .then(ek.a("max").redirect($$0, $$1x -> a((ej)$$1x.getSource(), amv.a($$1x), false, $$2)))
            )
      );

      for (aqc.c $$3 : aqc.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a(
                                       "path", fb.a()
                                    )
                                    .then(
                                       ek.a("int")
                                          .then(
                                             ek.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (ej)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         fb.a($$2xx, "path"),
                                                         $$1xxx -> ue.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ek.a("float")
                                       .then(
                                          ek.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (ej)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      fb.a($$2xx, "path"),
                                                      $$1xxx -> uc.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ek.a("short")
                                    .then(
                                       ek.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (ej)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   fb.a($$2xx, "path"),
                                                   $$1xxx -> us.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ek.a("long")
                                 .then(
                                    ek.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (ej)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                fb.a($$2xx, "path"),
                                                $$1xxx -> uh.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ek.a("double")
                              .then(
                                 ek.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (ej)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             fb.a($$2xx, "path"),
                                             $$1xxx -> ua.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        ek.a("byte")
                           .then(
                              ek.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (ej)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          fb.a($$2xx, "path"),
                                          $$1xxx -> tx.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static ej a(ej $$0, Collection<fgu> $$1, fgn $$2, boolean $$3) {
      fgv $$4 = $$0.l().aJ();
      return $$0.a(($$4x, $$5) -> {
         for (fgu $$6 : $$1) {
            fgt $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, eg::chain);
   }

   private static ej a(ej $$0, amk $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, eg::chain);
   }

   private static ej a(ej $$0, aqb $$1, fb.g $$2, IntFunction<uy> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            tz $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, eg::chain);
   }

   private static boolean a(ars $$0, iv $$1) {
      djc $$2 = new djc($$1);
      edl $$3 = $$0.m().a($$2.h, $$2.i);
      return $$3 == null ? false : $$3.F() == arg.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ej, ?> a(CommandNode<ej> $$0, LiteralArgumentBuilder<ej> $$1, boolean $$2, ef $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    ek.a("block")
                                       .then(
                                          ek.a("pos", gg.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ek.a("block", gc.a($$3)),
                                                   $$2,
                                                   $$0x -> gc.a($$0x, "block").test(new ebi(((ej)$$0x.getSource()).e(), gg.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    ek.a("biome")
                                       .then(
                                          ek.a("pos", gg.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ek.a("biome", fm.a($$3, mh.aG)),
                                                   $$2,
                                                   $$0x -> fm.a($$0x, "biome", mh.aG).test(((ej)$$0x.getSource()).e().u(gg.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(ek.a("loaded").then(a($$0, ek.a("pos", gg.a()), $$2, $$0x -> a(((ej)$$0x.getSource()).e(), gg.b($$0x, "pos"))))))
                           .then(ek.a("dimension").then(a($$0, ek.a("dimension", eu.a()), $$2, $$0x -> eu.a($$0x, "dimension") == ((ej)$$0x.getSource()).e()))))
                        .then(
                           ek.a("score")
                              .then(
                                 ek.a("target", fp.a())
                                    .suggests(fp.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a(
                                                            "targetObjective", fd.a()
                                                         )
                                                         .then(
                                                            ek.a("=")
                                                               .then(
                                                                  ek.a("source", fp.a())
                                                                     .suggests(fp.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           ek.a("sourceObjective", fd.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (anl.d)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ek.a("<")
                                                            .then(
                                                               ek.a("source", fp.a())
                                                                  .suggests(fp.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        ek.a("sourceObjective", fd.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (anl.d)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      ek.a("<=")
                                                         .then(
                                                            ek.a("source", fp.a())
                                                               .suggests(fp.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     ek.a("sourceObjective", fd.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (anl.d)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ek.a(">")
                                                      .then(
                                                         ek.a("source", fp.a())
                                                            .suggests(fp.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  ek.a("sourceObjective", fd.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (anl.d)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ek.a(">=")
                                                   .then(
                                                      ek.a("source", fp.a())
                                                         .suggests(fp.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               ek.a("sourceObjective", fd.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (anl.d)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(ek.a("matches").then(a($$0, ek.a("range", fh.a()), $$2, $$0x -> a($$0x, fh.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        ek.a("blocks")
                           .then(
                              ek.a("start", gg.a())
                                 .then(
                                    ek.a("end", gg.a())
                                       .then(
                                          ((RequiredArgumentBuilder)ek.a("destination", gg.a()).then(a($$0, ek.a("all"), $$2, false)))
                                             .then(a($$0, ek.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ek.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)ek.a("entities", ew.b()).fork($$0, $$1x -> a($$1x, $$2, !ew.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (anl.a)($$0x -> ew.c($$0x, "entities").size())))
                        )
                  ))
               .then(ek.a("predicate").then(a($$0, ek.a("predicate", fl.c($$3)).suggests(f), $$2, $$0x -> a((ej)$$0x.getSource(), fl.c($$0x, "predicate"))))))
            .then(ek.a("function").then(ek.a("name", gs.a()).suggests(anq.b).fork($$0, new anl.c($$2)))))
         .then(
            ((LiteralArgumentBuilder)ek.a("items")
                  .then(
                     ek.a("entity")
                        .then(
                           ek.a("entities", ew.b())
                              .then(
                                 ek.a("slots", ft.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ek.a("item_predicate", gw.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(ew.b($$1x, "entities"), ft.a($$1x, "slots"), gw.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (anl.a)($$0x -> a(ew.b($$0x, "entities"), ft.a($$0x, "slots"), gw.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  ek.a("block")
                     .then(
                        ek.a("pos", gg.a())
                           .then(
                              ek.a("slots", ft.a())
                                 .then(
                                    ((RequiredArgumentBuilder)ek.a("item_predicate", gw.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((ej)$$1x.getSource(), gg.a($$1x, "pos"), ft.a($$1x, "slots"), gw.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (anl.a)($$0x -> a((ej)$$0x.getSource(), gg.a($$0x, "pos"), ft.a($$0x, "slots"), gw.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (aqc.c $$4 : aqc.c) {
         $$1.then(
            $$4.a(
               ek.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)ek.a("path", fb.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), fb.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (anl.a)($$1xx -> a($$4.a($$1xx), fb.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends bwt> $$0, cxo $$1, Predicate<czy> $$2) {
      int $$3 = 0;

      for (bwt $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            byl $$8 = $$4.a_($$7);
            czy $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.M();
            }
         }
      }

      return $$3;
   }

   private static int a(ej $$0, iv $$1, cxo $$2, Predicate<czy> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      buk $$5 = anw.a($$0, $$1, anw.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            czy $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.M();
            }
         }
      }

      return $$4;
   }

   private static Command<ej> a(boolean $$0, anl.a $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ej)$$1x.getSource()).a(() -> xa.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ej)$$1x.getSource()).a(() -> xa.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(aqb $$0, fb.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ej> $$0, anl.d $$1) throws CommandSyntaxException {
      fgu $$2 = fp.a($$0, "target");
      fgn $$3 = fd.a($$0, "targetObjective");
      fgu $$4 = fp.a($$0, "source");
      fgn $$5 = fd.a($$0, "sourceObjective");
      fgv $$6 = ((ej)$$0.getSource()).l().aJ();
      fgr $$7 = $$6.d($$2, $$3);
      fgr $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<ej> $$0, cw.d $$1) throws CommandSyntaxException {
      fgu $$2 = fp.a($$0, "target");
      fgn $$3 = fd.a($$0, "targetObjective");
      fgv $$4 = ((ej)$$0.getSource()).l().aJ();
      fgr $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(ej $$0, jf<fdq> $$1) {
      ars $$2 = $$0.e();
      fak $$3 = new fak.a($$2).a(fdb.f, $$0.d()).b(fdb.a, $$0.f()).a(fda.d);
      fah $$4 = new fah.a($$3).a(Optional.empty());
      $$4.b(fah.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<ej> a(CommandContext<ej> $$0, boolean $$1, boolean $$2) {
      return (Collection<ej>)($$2 == $$1 ? Collections.singleton((ej)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ej, ?> a(CommandNode<ej> $$0, ArgumentBuilder<ej, ?> $$1, boolean $$2, anl.b $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ej)$$2x.getSource()).a(() -> xa.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<ej, ?> a(CommandNode<ej> $$0, ArgumentBuilder<ej, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<ej> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((ej)$$0.getSource()).a(() -> xa.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<ej> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((ej)$$0.getSource()).a(() -> xa.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ej> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ej)$$0.getSource()).e(), gg.a($$0, "start"), gg.a($$0, "end"), gg.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(ars $$0, iv $$1, iv $$2, iv $$3, boolean $$4) throws CommandSyntaxException {
      ert $$5 = ert.a($$1, $$2);
      ert $$6 = ert.a($$3, $$3.a($$5.c()));
      iv $$7 = new iv($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         jt $$9 = $$0.J_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  iv $$14 = new iv($$13, $$12, $$11);
                  iv $$15 = $$14.a((ka)$$7);
                  ebe $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dne.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dyc $$17 = $$0.c_($$14);
                     dyc $$18 = $$0.c_($$15);
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

                        tz $$19 = $$17.e($$9);
                        tz $$20 = $$18.e($$9);
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

   private static RedirectModifier<ej> a(Function<bwt, Optional<bwt>> $$0) {
      return $$1 -> {
         ej $$2 = (ej)$$1.getSource();
         bwt $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dQ()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ej> b(Function<bwt, Stream<bwt>> $$0) {
      return $$1 -> {
         ej $$2 = (ej)$$1.getSource();
         bwt $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dQ()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ej> a(CommandNode<ej> $$0, LiteralArgumentBuilder<ej> $$1) {
      return (LiteralArgumentBuilder<ej>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              ek.a("owner")
                                 .fork(
                                    $$0, a((Function<bwt, Optional<bwt>>)($$0x -> $$0x instanceof byb $$1x ? Optional.ofNullable($$1x.e()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              ek.a("leasher")
                                 .fork(
                                    $$0, a((Function<bwt, Optional<bwt>>)($$0x -> $$0x instanceof bxs $$1x ? Optional.ofNullable($$1x.C()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           ek.a("target")
                              .fork($$0, a((Function<bwt, Optional<bwt>>)($$0x -> $$0x instanceof byr $$1x ? Optional.ofNullable($$1x.f()) : Optional.empty())))
                        ))
                     .then(
                        ek.a("attacker")
                           .fork($$0, a((Function<bwt, Optional<bwt>>)($$0x -> $$0x instanceof bwm $$1x ? Optional.ofNullable($$1x.aj()) : Optional.empty())))
                     ))
                  .then(ek.a("vehicle").fork($$0, a((Function<bwt, Optional<bwt>>)($$0x -> Optional.ofNullable($$0x.dk()))))))
               .then(ek.a("controller").fork($$0, a((Function<bwt, Optional<bwt>>)($$0x -> Optional.ofNullable($$0x.cW()))))))
            .then(
               ek.a("origin").fork($$0, a((Function<bwt, Optional<bwt>>)($$0x -> $$0x instanceof bys $$1x ? Optional.ofNullable($$1x.q()) : Optional.empty())))
            ))
         .then(ek.a("passengers").fork($$0, b((Function<bwt, Stream<bwt>>)($$0x -> $$0x.cY().stream()))));
   }

   private static ej a(ej $$0, jf.c<bxc<?>> $$1) throws CommandSyntaxException {
      bwt $$2 = apl.a($$0, $$1, $$0.d(), new tz(), true);
      return $$0.a($$2);
   }

   public static <T extends el<T>> void a(
      T $$0,
      List<T> $$1,
      Function<T, T> $$2,
      IntPredicate $$3,
      ContextChain<T> $$4,
      @Nullable tz $$5,
      hl<T> $$6,
      anv<CommandContext<T>, Collection<hx<T>>> $$7,
      hf $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<hx<T>> $$10;
      try {
         $$10 = $$7.apply($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<hz<T>> $$14 = new ArrayList<>($$13);

         try {
            for (hx<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.w()));
               } catch (em var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            eg $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new hv<>($$2x -> {
               for (hz<T> $$3x : $$14) {
                  $$2x.a(new hr<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(hu.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new hq.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   interface a {
      int test(CommandContext<ej> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      boolean test(CommandContext<ej> var1) throws CommandSyntaxException;
   }

   static class c implements hi.a<ej> {
      private final IntPredicate a;

      c(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ej $$0, List<ej> $$1, ContextChain<ej> $$2, hf $$3, hl<ej> $$4) {
         anl.a($$0, $$1, anq::a, this.a, $$2, null, $$4, $$0x -> gs.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface d {
      boolean test(int var1, int var2);
   }
}
