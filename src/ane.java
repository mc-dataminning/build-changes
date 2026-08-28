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

public class ane {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xd.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xd.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xd.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xd.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<et> f = ($$0, $$1) -> {
      all.a $$2 = ((et)$$0.getSource()).l().bd();
      return ey.a($$2.a(lv.be), $$1);
   };

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      LiteralCommandNode<et> $$2 = $$0.register((LiteralArgumentBuilder)eu.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(eu.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, eu.a("if"), true, $$1)))
                                             .then(a($$2, eu.a("unless"), false, $$1)))
                                          .then(eu.a("as").then(eu.a("targets", fg.b()).fork($$2, $$0x -> {
                                             List<et> $$1x = Lists.newArrayList();

                                             for (btj $$2x : fg.c($$0x, "targets")) {
                                                $$1x.add(((et)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(eu.a("at").then(eu.a("targets", fg.b()).fork($$2, $$0x -> {
                                          List<et> $$1x = Lists.newArrayList();

                                          for (btj $$2x : fg.c($$0x, "targets")) {
                                             $$1x.add(((et)$$0x.getSource()).a((arg)$$2x.dS()).a($$2x.dq()).a($$2x.bR()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)eu.a("store").then(a($$2, eu.a("result"), true))).then(a($$2, eu.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("positioned")
                                             .then(eu.a("pos", gw.a()).redirect($$2, $$0x -> ((et)$$0x.getSource()).a(gw.a($$0x, "pos")).a(ff.a.a))))
                                          .then(eu.a("as").then(eu.a("targets", fg.b()).fork($$2, $$0x -> {
                                             List<et> $$1x = Lists.newArrayList();

                                             for (btj $$2x : fg.c($$0x, "targets")) {
                                                $$1x.add(((et)$$0x.getSource()).a($$2x.dq()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(eu.a("over").then(eu.a("heightmap", fj.a()).redirect($$2, $$0x -> {
                                          eye $$1x = ((et)$$0x.getSource()).d();
                                          arg $$2x = ((et)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(kg.b($$3), kg.b($$4))) {
                                             throw gp.a.create();
                                          } else {
                                             int $$5 = $$2x.a(fj.a($$0x, "heightmap"), azc.a($$3), azc.a($$4));
                                             return ((et)$$0x.getSource()).a(new eye($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)eu.a("rotated")
                                       .then(eu.a("rot", gt.a()).redirect($$2, $$0x -> ((et)$$0x.getSource()).a(gt.a($$0x, "rot").b((et)$$0x.getSource())))))
                                    .then(eu.a("as").then(eu.a("targets", fg.b()).fork($$2, $$0x -> {
                                       List<et> $$1x = Lists.newArrayList();

                                       for (btj $$2x : fg.c($$0x, "targets")) {
                                          $$1x.add(((et)$$0x.getSource()).a($$2x.bR()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)eu.a("facing")
                                    .then(eu.a("entity").then(eu.a("targets", fg.b()).then(eu.a("anchor", ff.a()).fork($$2, $$0x -> {
                                       List<et> $$1x = Lists.newArrayList();
                                       ff.a $$2x = ff.a($$0x, "anchor");

                                       for (btj $$3 : fg.c($$0x, "targets")) {
                                          $$1x.add(((et)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(eu.a("pos", gw.a()).redirect($$2, $$0x -> ((et)$$0x.getSource()).b(gw.a($$0x, "pos"))))
                           ))
                        .then(
                           eu.a("align")
                              .then(eu.a("axes", gu.a()).redirect($$2, $$0x -> ((et)$$0x.getSource()).a(((et)$$0x.getSource()).d().a(gu.a($$0x, "axes")))))
                        ))
                     .then(eu.a("anchored").then(eu.a("anchor", ff.a()).redirect($$2, $$0x -> ((et)$$0x.getSource()).a(ff.a($$0x, "anchor"))))))
                  .then(eu.a("in").then(eu.a("dimension", fe.a()).redirect($$2, $$0x -> ((et)$$0x.getSource()).a(fe.a($$0x, "dimension"))))))
               .then(eu.a("summon").then(eu.a("entity", fs.a($$1, lv.z)).suggests(it.d).redirect($$2, $$0x -> a((et)$$0x.getSource(), fs.e($$0x, "entity"))))))
            .then(a($$2, eu.a("on")))
      );
   }

   private static ArgumentBuilder<et, ?> a(LiteralCommandNode<et> $$0, LiteralArgumentBuilder<et> $$1, boolean $$2) {
      $$1.then(
         eu.a("score")
            .then(
               eu.a("targets", fy.b())
                  .suggests(fy.a)
                  .then(eu.a("objective", fn.a()).redirect($$0, $$1x -> a((et)$$1x.getSource(), fy.c($$1x, "targets"), fn.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         eu.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)eu.a("id", fu.a())
                     .suggests(amo.a)
                     .then(eu.a("value").redirect($$0, $$1x -> a((et)$$1x.getSource(), amo.a($$1x), true, $$2))))
                  .then(eu.a("max").redirect($$0, $$1x -> a((et)$$1x.getSource(), amo.a($$1x), false, $$2)))
            )
      );

      for (aps.c $$3 : aps.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a(
                                       "path", fl.a()
                                    )
                                    .then(
                                       eu.a("int")
                                          .then(
                                             eu.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (et)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         fl.a($$2xx, "path"),
                                                         $$1xxx -> uk.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    eu.a("float")
                                       .then(
                                          eu.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (et)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      fl.a($$2xx, "path"),
                                                      $$1xxx -> ui.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 eu.a("short")
                                    .then(
                                       eu.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (et)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   fl.a($$2xx, "path"),
                                                   $$1xxx -> ux.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              eu.a("long")
                                 .then(
                                    eu.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (et)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                fl.a($$2xx, "path"),
                                                $$1xxx -> un.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           eu.a("double")
                              .then(
                                 eu.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (et)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             fl.a($$2xx, "path"),
                                             $$1xxx -> ug.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        eu.a("byte")
                           .then(
                              eu.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (et)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          fl.a($$2xx, "path"),
                                          $$1xxx -> ud.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static et a(et $$0, Collection<ezh> $$1, eza $$2, boolean $$3) {
      ezi $$4 = $$0.l().aJ();
      return $$0.a(($$4x, $$5) -> {
         for (ezh $$6 : $$1) {
            ezg $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, eq::chain);
   }

   private static et a(et $$0, amd $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, eq::chain);
   }

   private static et a(et $$0, apr $$1, fl.g $$2, IntFunction<vc> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            uf $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, eq::chain);
   }

   private static boolean a(arg $$0, je $$1) {
      dcy $$2 = new dcy($$1);
      dwg $$3 = $$0.l().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.C() == aqw.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<et, ?> a(CommandNode<et> $$0, LiteralArgumentBuilder<et> $$1, boolean $$2, ep $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    eu.a("block")
                                       .then(
                                          eu.a("pos", gp.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   eu.a("block", gl.a($$3)),
                                                   $$2,
                                                   $$0x -> gl.a($$0x, "block").test(new due(((et)$$0x.getSource()).e(), gp.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    eu.a("biome")
                                       .then(
                                          eu.a("pos", gp.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   eu.a("biome", fw.a($$3, lv.aF)),
                                                   $$2,
                                                   $$0x -> fw.a($$0x, "biome", lv.aF).test(((et)$$0x.getSource()).e().t(gp.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(eu.a("loaded").then(a($$0, eu.a("pos", gp.a()), $$2, $$0x -> a(((et)$$0x.getSource()).e(), gp.b($$0x, "pos"))))))
                           .then(eu.a("dimension").then(a($$0, eu.a("dimension", fe.a()), $$2, $$0x -> fe.a($$0x, "dimension") == ((et)$$0x.getSource()).e()))))
                        .then(
                           eu.a("score")
                              .then(
                                 eu.a("target", fy.a())
                                    .suggests(fy.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a(
                                                            "targetObjective", fn.a()
                                                         )
                                                         .then(
                                                            eu.a("=")
                                                               .then(
                                                                  eu.a("source", fy.a())
                                                                     .suggests(fy.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           eu.a("sourceObjective", fn.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (ane.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         eu.a("<")
                                                            .then(
                                                               eu.a("source", fy.a())
                                                                  .suggests(fy.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        eu.a("sourceObjective", fn.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (ane.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      eu.a("<=")
                                                         .then(
                                                            eu.a("source", fy.a())
                                                               .suggests(fy.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     eu.a("sourceObjective", fn.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (ane.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   eu.a(">")
                                                      .then(
                                                         eu.a("source", fy.a())
                                                            .suggests(fy.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  eu.a("sourceObjective", fn.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (ane.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                eu.a(">=")
                                                   .then(
                                                      eu.a("source", fy.a())
                                                         .suggests(fy.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               eu.a("sourceObjective", fn.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (ane.e)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(eu.a("matches").then(a($$0, eu.a("range", fr.a()), $$2, $$0x -> a($$0x, fr.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        eu.a("blocks")
                           .then(
                              eu.a("start", gp.a())
                                 .then(
                                    eu.a("end", gp.a())
                                       .then(
                                          ((RequiredArgumentBuilder)eu.a("destination", gp.a()).then(a($$0, eu.a("all"), $$2, false)))
                                             .then(a($$0, eu.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     eu.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)eu.a("entities", fg.b()).fork($$0, $$1x -> a($$1x, $$2, !fg.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (ane.b)($$0x -> fg.c($$0x, "entities").size())))
                        )
                  ))
               .then(eu.a("predicate").then(a($$0, eu.a("predicate", fv.c($$3)).suggests(f), $$2, $$0x -> a((et)$$0x.getSource(), fv.c($$0x, "predicate"))))))
            .then(eu.a("function").then(eu.a("name", hb.a()).suggests(anj.b).fork($$0, new ane.d($$2)))))
         .then(
            ((LiteralArgumentBuilder)eu.a("items")
                  .then(
                     eu.a("entity")
                        .then(
                           eu.a("entities", fg.b())
                              .then(
                                 eu.a("slots", gc.a())
                                    .then(
                                       ((RequiredArgumentBuilder)eu.a("item_predicate", hf.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(fg.b($$1x, "entities"), gc.a($$1x, "slots"), hf.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (ane.b)($$0x -> a(fg.b($$0x, "entities"), gc.a($$0x, "slots"), hf.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  eu.a("block")
                     .then(
                        eu.a("pos", gp.a())
                           .then(
                              eu.a("slots", gc.a())
                                 .then(
                                    ((RequiredArgumentBuilder)eu.a("item_predicate", hf.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((et)$$1x.getSource(), gp.a($$1x, "pos"), gc.a($$1x, "slots"), hf.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (ane.b)($$0x -> a((et)$$0x.getSource(), gp.a($$0x, "pos"), gc.a($$0x, "slots"), hf.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (aps.c $$4 : aps.c) {
         $$1.then(
            $$4.a(
               eu.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)eu.a("path", fl.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), fl.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (ane.b)($$1xx -> a($$4.a($$1xx), fl.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends btj> $$0, cso $$1, Predicate<cvl> $$2) {
      int $$3 = 0;

      for (btj $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            buw $$8 = $$4.a_($$7);
            cvl $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.J();
            }
         }
      }

      return $$3;
   }

   private static int a(et $$0, je $$1, cso $$2, Predicate<cvl> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      brd $$5 = ano.a($$0, $$1, ano.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            cvl $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.J();
            }
         }
      }

      return $$4;
   }

   private static Command<et> a(boolean $$0, ane.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((et)$$1x.getSource()).a(() -> xd.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((et)$$1x.getSource()).a(() -> xd.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(apr $$0, fl.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<et> $$0, ane.e $$1) throws CommandSyntaxException {
      ezh $$2 = fy.a($$0, "target");
      eza $$3 = fn.a($$0, "targetObjective");
      ezh $$4 = fy.a($$0, "source");
      eza $$5 = fn.a($$0, "sourceObjective");
      ezi $$6 = ((et)$$0.getSource()).l().aJ();
      eze $$7 = $$6.d($$2, $$3);
      eze $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<et> $$0, dh.d $$1) throws CommandSyntaxException {
      ezh $$2 = fy.a($$0, "target");
      eza $$3 = fn.a($$0, "targetObjective");
      ezi $$4 = ((et)$$0.getSource()).l().aJ();
      eze $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(et $$0, jn<ewe> $$1) {
      arg $$2 = $$0.e();
      esw $$3 = new esw.a($$2).a(evp.f, $$0.d()).b(evp.a, $$0.f()).a(evo.d);
      est $$4 = new est.a($$3).a(Optional.empty());
      $$4.b(est.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<et> a(CommandContext<et> $$0, boolean $$1, boolean $$2) {
      return (Collection<et>)($$2 == $$1 ? Collections.singleton((et)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<et, ?> a(CommandNode<et> $$0, ArgumentBuilder<et, ?> $$1, boolean $$2, ane.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((et)$$2x.getSource()).a(() -> xd.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<et, ?> a(CommandNode<et> $$0, ArgumentBuilder<et, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<et> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((et)$$0.getSource()).a(() -> xd.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<et> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((et)$$0.getSource()).a(() -> xd.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<et> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((et)$$0.getSource()).e(), gp.a($$0, "start"), gp.a($$0, "end"), gp.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(arg $$0, je $$1, je $$2, je $$3, boolean $$4) throws CommandSyntaxException {
      ekg $$5 = ekg.a($$1, $$2);
      ekg $$6 = ekg.a($$3, $$3.a($$5.c()));
      je $$7 = new je($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         kb $$9 = $$0.F_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  je $$14 = new je($$13, $$12, $$11);
                  je $$15 = $$14.a((ki)$$7);
                  dua $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dgx.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dre $$17 = $$0.c_($$14);
                     dre $$18 = $$0.c_($$15);
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

                        uf $$19 = $$17.e($$9);
                        uf $$20 = $$18.e($$9);
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

   private static RedirectModifier<et> a(Function<btj, Optional<btj>> $$0) {
      return $$1 -> {
         et $$2 = (et)$$1.getSource();
         btj $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dN()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<et> b(Function<btj, Stream<btj>> $$0) {
      return $$1 -> {
         et $$2 = (et)$$1.getSource();
         btj $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dN()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<et> a(CommandNode<et> $$0, LiteralArgumentBuilder<et> $$1) {
      return (LiteralArgumentBuilder<et>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              eu.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<btj, Optional<btj>>)($$0x -> $$0x instanceof bum $$1x ? Optional.ofNullable($$1x.R_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              eu.a("leasher")
                                 .fork(
                                    $$0, a((Function<btj, Optional<btj>>)($$0x -> $$0x instanceof bud $$1x ? Optional.ofNullable($$1x.C()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           eu.a("target")
                              .fork($$0, a((Function<btj, Optional<btj>>)($$0x -> $$0x instanceof bvc $$1x ? Optional.ofNullable($$1x.m()) : Optional.empty())))
                        ))
                     .then(
                        eu.a("attacker")
                           .fork($$0, a((Function<btj, Optional<btj>>)($$0x -> $$0x instanceof btf $$1x ? Optional.ofNullable($$1x.X_()) : Optional.empty())))
                     ))
                  .then(eu.a("vehicle").fork($$0, a((Function<btj, Optional<btj>>)($$0x -> Optional.ofNullable($$0x.dg()))))))
               .then(eu.a("controller").fork($$0, a((Function<btj, Optional<btj>>)($$0x -> Optional.ofNullable($$0x.cU()))))))
            .then(
               eu.a("origin").fork($$0, a((Function<btj, Optional<btj>>)($$0x -> $$0x instanceof bvd $$1x ? Optional.ofNullable($$1x.s()) : Optional.empty())))
            ))
         .then(eu.a("passengers").fork($$0, b((Function<btj, Stream<btj>>)($$0x -> $$0x.cW().stream()))));
   }

   private static et a(et $$0, jn.c<btq<?>> $$1) throws CommandSyntaxException {
      btj $$2 = apb.a($$0, $$1, $$0.d(), new uf(), true);
      return $$0.a($$2);
   }

   public static <T extends ev<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable uf $$5, hu<T> $$6, ane.a<T, Collection<ih<T>>> $$7, ho $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<ih<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<ij<T>> $$14 = new ArrayList<>($$13);

         try {
            for (ih<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x()));
               } catch (ew var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            eq $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new ie<>($$2x -> {
               for (ij<T> $$3x : $$14) {
                  $$2x.a(new ia<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(id.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new hz.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<et> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<et> var1) throws CommandSyntaxException;
   }

   static class d implements hr.a<et> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(et $$0, List<et> $$1, ContextChain<et> $$2, ho $$3, hu<et> $$4) {
         ane.a($$0, $$1, anj::a, this.a, $$2, null, $$4, $$0x -> hb.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
