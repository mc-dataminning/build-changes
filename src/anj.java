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

public class anj {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wy.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wy.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wy.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<ei> f = ($$0, $$1) -> {
      alq.a $$2 = ((ei)$$0.getSource()).l().bc();
      return en.a($$2.a(mg.bs), $$1);
   };

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      LiteralCommandNode<ei> $$2 = $$0.register((LiteralArgumentBuilder)ej.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(ej.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, ej.a("if"), true, $$1)))
                                             .then(a($$2, ej.a("unless"), false, $$1)))
                                          .then(ej.a("as").then(ej.a("targets", ev.b()).fork($$2, $$0x -> {
                                             List<ei> $$1x = Lists.newArrayList();

                                             for (bwf $$2x : ev.c($$0x, "targets")) {
                                                $$1x.add(((ei)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ej.a("at").then(ej.a("targets", ev.b()).fork($$2, $$0x -> {
                                          List<ei> $$1x = Lists.newArrayList();

                                          for (bwf $$2x : ev.c($$0x, "targets")) {
                                             $$1x.add(((ei)$$0x.getSource()).a((arq)$$2x.dV()).a($$2x.dt()).a($$2x.bU()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)ej.a("store").then(a($$2, ej.a("result"), true))).then(a($$2, ej.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("positioned")
                                             .then(ej.a("pos", gm.a()).redirect($$2, $$0x -> ((ei)$$0x.getSource()).a(gm.a($$0x, "pos")).a(eu.a.a))))
                                          .then(ej.a("as").then(ej.a("targets", ev.b()).fork($$2, $$0x -> {
                                             List<ei> $$1x = Lists.newArrayList();

                                             for (bwf $$2x : ev.c($$0x, "targets")) {
                                                $$1x.add(((ei)$$0x.getSource()).a($$2x.dt()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ej.a("over").then(ej.a("heightmap", ey.a()).redirect($$2, $$0x -> {
                                          feq $$1x = ((ei)$$0x.getSource()).d();
                                          arq $$2x = ((ei)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(jx.b($$3), jx.b($$4))) {
                                             throw gf.a.create();
                                          } else {
                                             int $$5 = $$2x.a(ey.a($$0x, "heightmap"), azm.a($$3), azm.a($$4));
                                             return ((ei)$$0x.getSource()).a(new feq($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ej.a("rotated")
                                       .then(ej.a("rot", gj.a()).redirect($$2, $$0x -> ((ei)$$0x.getSource()).a(gj.a($$0x, "rot").b((ei)$$0x.getSource())))))
                                    .then(ej.a("as").then(ej.a("targets", ev.b()).fork($$2, $$0x -> {
                                       List<ei> $$1x = Lists.newArrayList();

                                       for (bwf $$2x : ev.c($$0x, "targets")) {
                                          $$1x.add(((ei)$$0x.getSource()).a($$2x.bU()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ej.a("facing")
                                    .then(ej.a("entity").then(ej.a("targets", ev.b()).then(ej.a("anchor", eu.a()).fork($$2, $$0x -> {
                                       List<ei> $$1x = Lists.newArrayList();
                                       eu.a $$2x = eu.a($$0x, "anchor");

                                       for (bwf $$3 : ev.c($$0x, "targets")) {
                                          $$1x.add(((ei)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(ej.a("pos", gm.a()).redirect($$2, $$0x -> ((ei)$$0x.getSource()).b(gm.a($$0x, "pos"))))
                           ))
                        .then(
                           ej.a("align")
                              .then(ej.a("axes", gk.a()).redirect($$2, $$0x -> ((ei)$$0x.getSource()).a(((ei)$$0x.getSource()).d().a(gk.a($$0x, "axes")))))
                        ))
                     .then(ej.a("anchored").then(ej.a("anchor", eu.a()).redirect($$2, $$0x -> ((ei)$$0x.getSource()).a(eu.a($$0x, "anchor"))))))
                  .then(ej.a("in").then(ej.a("dimension", et.a()).redirect($$2, $$0x -> ((ei)$$0x.getSource()).a(et.a($$0x, "dimension"))))))
               .then(ej.a("summon").then(ej.a("entity", fh.a($$1, mg.B)).suggests(ij.c).redirect($$2, $$0x -> a((ei)$$0x.getSource(), fh.e($$0x, "entity"))))))
            .then(a($$2, ej.a("on")))
      );
   }

   private static ArgumentBuilder<ei, ?> a(LiteralCommandNode<ei> $$0, LiteralArgumentBuilder<ei> $$1, boolean $$2) {
      $$1.then(
         ej.a("score")
            .then(
               ej.a("targets", fo.b())
                  .suggests(fo.a)
                  .then(ej.a("objective", fc.a()).redirect($$0, $$1x -> a((ei)$$1x.getSource(), fo.c($$1x, "targets"), fc.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         ej.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)ej.a("id", fj.a())
                     .suggests(amt.a)
                     .then(ej.a("value").redirect($$0, $$1x -> a((ei)$$1x.getSource(), amt.a($$1x), true, $$2))))
                  .then(ej.a("max").redirect($$0, $$1x -> a((ei)$$1x.getSource(), amt.a($$1x), false, $$2)))
            )
      );

      for (aqa.c $$3 : aqa.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a(
                                       "path", fa.a()
                                    )
                                    .then(
                                       ej.a("int")
                                          .then(
                                             ej.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (ei)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         fa.a($$2xx, "path"),
                                                         $$1xxx -> ue.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ej.a("float")
                                       .then(
                                          ej.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (ei)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      fa.a($$2xx, "path"),
                                                      $$1xxx -> uc.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ej.a("short")
                                    .then(
                                       ej.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (ei)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   fa.a($$2xx, "path"),
                                                   $$1xxx -> ur.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ej.a("long")
                                 .then(
                                    ej.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (ei)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                fa.a($$2xx, "path"),
                                                $$1xxx -> uh.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ej.a("double")
                              .then(
                                 ej.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (ei)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             fa.a($$2xx, "path"),
                                             $$1xxx -> ua.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        ej.a("byte")
                           .then(
                              ej.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (ei)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          fa.a($$2xx, "path"),
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

   private static ei a(ei $$0, Collection<ffu> $$1, ffn $$2, boolean $$3) {
      ffv $$4 = $$0.l().aJ();
      return $$0.a(($$4x, $$5) -> {
         for (ffu $$6 : $$1) {
            fft $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, ef::chain);
   }

   private static ei a(ei $$0, ami $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, ef::chain);
   }

   private static ei a(ei $$0, apz $$1, fa.g $$2, IntFunction<uw> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            tz $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, ef::chain);
   }

   private static boolean a(arq $$0, iu $$1) {
      dih $$2 = new dih($$1);
      eco $$3 = $$0.m().a($$2.h, $$2.i);
      return $$3 == null ? false : $$3.F() == are.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ei, ?> a(CommandNode<ei> $$0, LiteralArgumentBuilder<ei> $$1, boolean $$2, ee $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    ej.a("block")
                                       .then(
                                          ej.a("pos", gf.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ej.a("block", gb.a($$3)),
                                                   $$2,
                                                   $$0x -> gb.a($$0x, "block").test(new eal(((ei)$$0x.getSource()).e(), gf.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    ej.a("biome")
                                       .then(
                                          ej.a("pos", gf.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ej.a("biome", fl.a($$3, mg.aG)),
                                                   $$2,
                                                   $$0x -> fl.a($$0x, "biome", mg.aG).test(((ei)$$0x.getSource()).e().u(gf.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(ej.a("loaded").then(a($$0, ej.a("pos", gf.a()), $$2, $$0x -> a(((ei)$$0x.getSource()).e(), gf.b($$0x, "pos"))))))
                           .then(ej.a("dimension").then(a($$0, ej.a("dimension", et.a()), $$2, $$0x -> et.a($$0x, "dimension") == ((ei)$$0x.getSource()).e()))))
                        .then(
                           ej.a("score")
                              .then(
                                 ej.a("target", fo.a())
                                    .suggests(fo.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a(
                                                            "targetObjective", fc.a()
                                                         )
                                                         .then(
                                                            ej.a("=")
                                                               .then(
                                                                  ej.a("source", fo.a())
                                                                     .suggests(fo.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           ej.a("sourceObjective", fc.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (anj.d)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ej.a("<")
                                                            .then(
                                                               ej.a("source", fo.a())
                                                                  .suggests(fo.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        ej.a("sourceObjective", fc.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (anj.d)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      ej.a("<=")
                                                         .then(
                                                            ej.a("source", fo.a())
                                                               .suggests(fo.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     ej.a("sourceObjective", fc.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (anj.d)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ej.a(">")
                                                      .then(
                                                         ej.a("source", fo.a())
                                                            .suggests(fo.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  ej.a("sourceObjective", fc.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (anj.d)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ej.a(">=")
                                                   .then(
                                                      ej.a("source", fo.a())
                                                         .suggests(fo.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               ej.a("sourceObjective", fc.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (anj.d)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(ej.a("matches").then(a($$0, ej.a("range", fg.a()), $$2, $$0x -> a($$0x, fg.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        ej.a("blocks")
                           .then(
                              ej.a("start", gf.a())
                                 .then(
                                    ej.a("end", gf.a())
                                       .then(
                                          ((RequiredArgumentBuilder)ej.a("destination", gf.a()).then(a($$0, ej.a("all"), $$2, false)))
                                             .then(a($$0, ej.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ej.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)ej.a("entities", ev.b()).fork($$0, $$1x -> a($$1x, $$2, !ev.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (anj.a)($$0x -> ev.c($$0x, "entities").size())))
                        )
                  ))
               .then(ej.a("predicate").then(a($$0, ej.a("predicate", fk.c($$3)).suggests(f), $$2, $$0x -> a((ei)$$0x.getSource(), fk.c($$0x, "predicate"))))))
            .then(ej.a("function").then(ej.a("name", gr.a()).suggests(ano.b).fork($$0, new anj.c($$2)))))
         .then(
            ((LiteralArgumentBuilder)ej.a("items")
                  .then(
                     ej.a("entity")
                        .then(
                           ej.a("entities", ev.b())
                              .then(
                                 ej.a("slots", fs.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ej.a("item_predicate", gv.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(ev.b($$1x, "entities"), fs.a($$1x, "slots"), gv.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (anj.a)($$0x -> a(ev.b($$0x, "entities"), fs.a($$0x, "slots"), gv.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  ej.a("block")
                     .then(
                        ej.a("pos", gf.a())
                           .then(
                              ej.a("slots", fs.a())
                                 .then(
                                    ((RequiredArgumentBuilder)ej.a("item_predicate", gv.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((ei)$$1x.getSource(), gf.a($$1x, "pos"), fs.a($$1x, "slots"), gv.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (anj.a)($$0x -> a((ei)$$0x.getSource(), gf.a($$0x, "pos"), fs.a($$0x, "slots"), gv.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (aqa.c $$4 : aqa.c) {
         $$1.then(
            $$4.a(
               ej.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)ej.a("path", fa.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), fa.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (anj.a)($$1xx -> a($$4.a($$1xx), fa.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends bwf> $$0, cwt $$1, Predicate<czd> $$2) {
      int $$3 = 0;

      for (bwf $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            bxv $$8 = $$4.a_($$7);
            czd $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.M();
            }
         }
      }

      return $$3;
   }

   private static int a(ei $$0, iu $$1, cwt $$2, Predicate<czd> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      btw $$5 = anu.a($$0, $$1, anu.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            czd $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.M();
            }
         }
      }

      return $$4;
   }

   private static Command<ei> a(boolean $$0, anj.a $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ei)$$1x.getSource()).a(() -> wy.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ei)$$1x.getSource()).a(() -> wy.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(apz $$0, fa.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ei> $$0, anj.d $$1) throws CommandSyntaxException {
      ffu $$2 = fo.a($$0, "target");
      ffn $$3 = fc.a($$0, "targetObjective");
      ffu $$4 = fo.a($$0, "source");
      ffn $$5 = fc.a($$0, "sourceObjective");
      ffv $$6 = ((ei)$$0.getSource()).l().aJ();
      ffr $$7 = $$6.d($$2, $$3);
      ffr $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<ei> $$0, cv.d $$1) throws CommandSyntaxException {
      ffu $$2 = fo.a($$0, "target");
      ffn $$3 = fc.a($$0, "targetObjective");
      ffv $$4 = ((ei)$$0.getSource()).l().aJ();
      ffr $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(ei $$0, je<fcq> $$1) {
      arq $$2 = $$0.e();
      ezk $$3 = new ezk.a($$2).a(fcb.f, $$0.d()).b(fcb.a, $$0.f()).a(fca.d);
      ezh $$4 = new ezh.a($$3).a(Optional.empty());
      $$4.b(ezh.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<ei> a(CommandContext<ei> $$0, boolean $$1, boolean $$2) {
      return (Collection<ei>)($$2 == $$1 ? Collections.singleton((ei)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ei, ?> a(CommandNode<ei> $$0, ArgumentBuilder<ei, ?> $$1, boolean $$2, anj.b $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ei)$$2x.getSource()).a(() -> wy.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<ei, ?> a(CommandNode<ei> $$0, ArgumentBuilder<ei, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<ei> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((ei)$$0.getSource()).a(() -> wy.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<ei> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((ei)$$0.getSource()).a(() -> wy.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ei> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ei)$$0.getSource()).e(), gf.a($$0, "start"), gf.a($$0, "end"), gf.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(arq $$0, iu $$1, iu $$2, iu $$3, boolean $$4) throws CommandSyntaxException {
      eqt $$5 = eqt.a($$1, $$2);
      eqt $$6 = eqt.a($$3, $$3.a($$5.c()));
      iu $$7 = new iu($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         js $$9 = $$0.F_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  iu $$14 = new iu($$13, $$12, $$11);
                  iu $$15 = $$14.a((jz)$$7);
                  eah $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dmh.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dxf $$17 = $$0.c_($$14);
                     dxf $$18 = $$0.c_($$15);
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

   private static RedirectModifier<ei> a(Function<bwf, Optional<bwf>> $$0) {
      return $$1 -> {
         ei $$2 = (ei)$$1.getSource();
         bwf $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dQ()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ei> b(Function<bwf, Stream<bwf>> $$0) {
      return $$1 -> {
         ei $$2 = (ei)$$1.getSource();
         bwf $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dQ()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ei> a(CommandNode<ei> $$0, LiteralArgumentBuilder<ei> $$1) {
      return (LiteralArgumentBuilder<ei>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              ej.a("owner")
                                 .fork(
                                    $$0, a((Function<bwf, Optional<bwf>>)($$0x -> $$0x instanceof bxl $$1x ? Optional.ofNullable($$1x.e()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              ej.a("leasher")
                                 .fork(
                                    $$0, a((Function<bwf, Optional<bwf>>)($$0x -> $$0x instanceof bxc $$1x ? Optional.ofNullable($$1x.C()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           ej.a("target")
                              .fork($$0, a((Function<bwf, Optional<bwf>>)($$0x -> $$0x instanceof byb $$1x ? Optional.ofNullable($$1x.f()) : Optional.empty())))
                        ))
                     .then(
                        ej.a("attacker")
                           .fork($$0, a((Function<bwf, Optional<bwf>>)($$0x -> $$0x instanceof bvy $$1x ? Optional.ofNullable($$1x.am()) : Optional.empty())))
                     ))
                  .then(ej.a("vehicle").fork($$0, a((Function<bwf, Optional<bwf>>)($$0x -> Optional.ofNullable($$0x.dk()))))))
               .then(ej.a("controller").fork($$0, a((Function<bwf, Optional<bwf>>)($$0x -> Optional.ofNullable($$0x.cW()))))))
            .then(
               ej.a("origin").fork($$0, a((Function<bwf, Optional<bwf>>)($$0x -> $$0x instanceof byc $$1x ? Optional.ofNullable($$1x.q()) : Optional.empty())))
            ))
         .then(ej.a("passengers").fork($$0, b((Function<bwf, Stream<bwf>>)($$0x -> $$0x.cY().stream()))));
   }

   private static ei a(ei $$0, je.c<bwo<?>> $$1) throws CommandSyntaxException {
      bwf $$2 = apj.a($$0, $$1, $$0.d(), new tz(), true);
      return $$0.a($$2);
   }

   public static <T extends ek<T>> void a(
      T $$0,
      List<T> $$1,
      Function<T, T> $$2,
      IntPredicate $$3,
      ContextChain<T> $$4,
      @Nullable tz $$5,
      hk<T> $$6,
      ant<CommandContext<T>, Collection<hw<T>>> $$7,
      he $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<hw<T>> $$10;
      try {
         $$10 = $$7.apply($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<hy<T>> $$14 = new ArrayList<>($$13);

         try {
            for (hw<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.w()));
               } catch (el var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            ef $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new hu<>($$2x -> {
               for (hy<T> $$3x : $$14) {
                  $$2x.a(new hq<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(ht.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new hp.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   interface a {
      int test(CommandContext<ei> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      boolean test(CommandContext<ei> var1) throws CommandSyntaxException;
   }

   static class c implements hh.a<ei> {
      private final IntPredicate a;

      c(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ei $$0, List<ei> $$1, ContextChain<ei> $$2, he $$3, hk<ei> $$4) {
         anj.a($$0, $$1, ano::a, this.a, $$2, null, $$4, $$0x -> gr.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface d {
      boolean test(int var1, int var2);
   }
}
