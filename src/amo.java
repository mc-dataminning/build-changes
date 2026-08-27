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

public class amo {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wx.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wx.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wx.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<ee> f = ($$0, $$1) -> {
      akx.b $$2 = ((ee)$$0.getSource()).l().be();
      return ej.a($$2.a(lf.aW), $$1);
   };

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      LiteralCommandNode<ee> $$2 = $$0.register((LiteralArgumentBuilder)ef.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(ef.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, ef.a("if"), true, $$1)))
                                             .then(a($$2, ef.a("unless"), false, $$1)))
                                          .then(ef.a("as").then(ef.a("targets", er.b()).fork($$2, $$0x -> {
                                             List<ee> $$1x = Lists.newArrayList();

                                             for (brw $$2x : er.c($$0x, "targets")) {
                                                $$1x.add(((ee)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ef.a("at").then(ef.a("targets", er.b()).fork($$2, $$0x -> {
                                          List<ee> $$1x = Lists.newArrayList();

                                          for (brw $$2x : er.c($$0x, "targets")) {
                                             $$1x.add(((ee)$$0x.getSource()).a((aqn)$$2x.dP()).a($$2x.dn()).a($$2x.bM()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)ef.a("store").then(a($$2, ef.a("result"), true))).then(a($$2, ef.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("positioned")
                                             .then(ef.a("pos", gh.a()).redirect($$2, $$0x -> ((ee)$$0x.getSource()).a(gh.a($$0x, "pos")).a(eq.a.a))))
                                          .then(ef.a("as").then(ef.a("targets", er.b()).fork($$2, $$0x -> {
                                             List<ee> $$1x = Lists.newArrayList();

                                             for (brw $$2x : er.c($$0x, "targets")) {
                                                $$1x.add(((ee)$$0x.getSource()).a($$2x.dn()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ef.a("over").then(ef.a("heightmap", eu.a()).redirect($$2, $$0x -> {
                                          eum $$1x = ((ee)$$0x.getSource()).d();
                                          aqn $$2x = ((ee)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(jq.b($$3), jq.b($$4))) {
                                             throw ga.a.create();
                                          } else {
                                             int $$5 = $$2x.a(eu.a($$0x, "heightmap"), ayf.a($$3), ayf.a($$4));
                                             return ((ee)$$0x.getSource()).a(new eum($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ef.a("rotated")
                                       .then(ef.a("rot", ge.a()).redirect($$2, $$0x -> ((ee)$$0x.getSource()).a(ge.a($$0x, "rot").b((ee)$$0x.getSource())))))
                                    .then(ef.a("as").then(ef.a("targets", er.b()).fork($$2, $$0x -> {
                                       List<ee> $$1x = Lists.newArrayList();

                                       for (brw $$2x : er.c($$0x, "targets")) {
                                          $$1x.add(((ee)$$0x.getSource()).a($$2x.bM()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ef.a("facing")
                                    .then(ef.a("entity").then(ef.a("targets", er.b()).then(ef.a("anchor", eq.a()).fork($$2, $$0x -> {
                                       List<ee> $$1x = Lists.newArrayList();
                                       eq.a $$2x = eq.a($$0x, "anchor");

                                       for (brw $$3 : er.c($$0x, "targets")) {
                                          $$1x.add(((ee)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(ef.a("pos", gh.a()).redirect($$2, $$0x -> ((ee)$$0x.getSource()).b(gh.a($$0x, "pos"))))
                           ))
                        .then(
                           ef.a("align")
                              .then(ef.a("axes", gf.a()).redirect($$2, $$0x -> ((ee)$$0x.getSource()).a(((ee)$$0x.getSource()).d().a(gf.a($$0x, "axes")))))
                        ))
                     .then(ef.a("anchored").then(ef.a("anchor", eq.a()).redirect($$2, $$0x -> ((ee)$$0x.getSource()).a(eq.a($$0x, "anchor"))))))
                  .then(ef.a("in").then(ef.a("dimension", ep.a()).redirect($$2, $$0x -> ((ee)$$0x.getSource()).a(ep.a($$0x, "dimension"))))))
               .then(ef.a("summon").then(ef.a("entity", fd.a($$1, lf.v)).suggests(ic.d).redirect($$2, $$0x -> a((ee)$$0x.getSource(), fd.e($$0x, "entity"))))))
            .then(a($$2, ef.a("on")))
      );
   }

   private static ArgumentBuilder<ee, ?> a(LiteralCommandNode<ee> $$0, LiteralArgumentBuilder<ee> $$1, boolean $$2) {
      $$1.then(
         ef.a("score")
            .then(
               ef.a("targets", fj.b())
                  .suggests(fj.a)
                  .then(ef.a("objective", ey.a()).redirect($$0, $$1x -> a((ee)$$1x.getSource(), fj.c($$1x, "targets"), ey.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         ef.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)ef.a("id", ff.a())
                     .suggests(aly.a)
                     .then(ef.a("value").redirect($$0, $$1x -> a((ee)$$1x.getSource(), aly.a($$1x), true, $$2))))
                  .then(ef.a("max").redirect($$0, $$1x -> a((ee)$$1x.getSource(), aly.a($$1x), false, $$2)))
            )
      );

      for (apd.c $$3 : apd.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a(
                                       "path", ew.a()
                                    )
                                    .then(
                                       ef.a("int")
                                          .then(
                                             ef.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (ee)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         ew.a($$2xx, "path"),
                                                         $$1xxx -> ui.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ef.a("float")
                                       .then(
                                          ef.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (ee)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      ew.a($$2xx, "path"),
                                                      $$1xxx -> ug.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ef.a("short")
                                    .then(
                                       ef.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (ee)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   ew.a($$2xx, "path"),
                                                   $$1xxx -> uv.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ef.a("long")
                                 .then(
                                    ef.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (ee)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                ew.a($$2xx, "path"),
                                                $$1xxx -> ul.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ef.a("double")
                              .then(
                                 ef.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (ee)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             ew.a($$2xx, "path"),
                                             $$1xxx -> ue.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        ef.a("byte")
                           .then(
                              ef.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (ee)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          ew.a($$2xx, "path"),
                                          $$1xxx -> ub.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static ee a(ee $$0, Collection<evp> $$1, evi $$2, boolean $$3) {
      evq $$4 = $$0.l().aK();
      return $$0.a(($$4x, $$5) -> {
         for (evp $$6 : $$1) {
            evo $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, eb::chain);
   }

   private static ee a(ee $$0, aln $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, eb::chain);
   }

   private static ee a(ee $$0, apc $$1, ew.g $$2, IntFunction<va> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            ud $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, eb::chain);
   }

   private static boolean a(aqn $$0, io $$1) {
      dag $$2 = new dag($$1);
      dtj $$3 = $$0.l().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == aqg.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ee, ?> a(CommandNode<ee> $$0, LiteralArgumentBuilder<ee> $$1, boolean $$2, ea $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    ef.a("block")
                                       .then(
                                          ef.a("pos", ga.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ef.a("block", fw.a($$3)),
                                                   $$2,
                                                   $$0x -> fw.a($$0x, "block").test(new drh(((ee)$$0x.getSource()).e(), ga.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    ef.a("biome")
                                       .then(
                                          ef.a("pos", ga.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ef.a("biome", fh.a($$3, lf.az)),
                                                   $$2,
                                                   $$0x -> fh.a($$0x, "biome", lf.az).test(((ee)$$0x.getSource()).e().t(ga.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(ef.a("loaded").then(a($$0, ef.a("pos", ga.a()), $$2, $$0x -> a(((ee)$$0x.getSource()).e(), ga.b($$0x, "pos"))))))
                           .then(ef.a("dimension").then(a($$0, ef.a("dimension", ep.a()), $$2, $$0x -> ep.a($$0x, "dimension") == ((ee)$$0x.getSource()).e()))))
                        .then(
                           ef.a("score")
                              .then(
                                 ef.a("target", fj.a())
                                    .suggests(fj.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a(
                                                            "targetObjective", ey.a()
                                                         )
                                                         .then(
                                                            ef.a("=")
                                                               .then(
                                                                  ef.a("source", fj.a())
                                                                     .suggests(fj.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           ef.a("sourceObjective", ey.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (amo.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ef.a("<")
                                                            .then(
                                                               ef.a("source", fj.a())
                                                                  .suggests(fj.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        ef.a("sourceObjective", ey.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (amo.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      ef.a("<=")
                                                         .then(
                                                            ef.a("source", fj.a())
                                                               .suggests(fj.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     ef.a("sourceObjective", ey.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (amo.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ef.a(">")
                                                      .then(
                                                         ef.a("source", fj.a())
                                                            .suggests(fj.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  ef.a("sourceObjective", ey.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (amo.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ef.a(">=")
                                                   .then(
                                                      ef.a("source", fj.a())
                                                         .suggests(fj.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               ef.a("sourceObjective", ey.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (amo.e)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(ef.a("matches").then(a($$0, ef.a("range", fc.a()), $$2, $$0x -> a($$0x, fc.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        ef.a("blocks")
                           .then(
                              ef.a("start", ga.a())
                                 .then(
                                    ef.a("end", ga.a())
                                       .then(
                                          ((RequiredArgumentBuilder)ef.a("destination", ga.a()).then(a($$0, ef.a("all"), $$2, false)))
                                             .then(a($$0, ef.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ef.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)ef.a("entities", er.b()).fork($$0, $$1x -> a($$1x, $$2, !er.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (amo.b)($$0x -> er.c($$0x, "entities").size())))
                        )
                  ))
               .then(ef.a("predicate").then(a($$0, ef.a("predicate", fg.c($$3)).suggests(f), $$2, $$0x -> a((ee)$$0x.getSource(), fg.c($$0x, "predicate"))))))
            .then(ef.a("function").then(ef.a("name", gm.a()).suggests(amt.b).fork($$0, new amo.d($$2)))))
         .then(
            ((LiteralArgumentBuilder)ef.a("items")
                  .then(
                     ef.a("entity")
                        .then(
                           ef.a("entities", er.b())
                              .then(
                                 ef.a("slots", fn.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ef.a("item_predicate", gq.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(er.b($$1x, "entities"), fn.a($$1x, "slots"), gq.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (amo.b)($$0x -> a(er.b($$0x, "entities"), fn.a($$0x, "slots"), gq.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  ef.a("block")
                     .then(
                        ef.a("pos", ga.a())
                           .then(
                              ef.a("slots", fn.a())
                                 .then(
                                    ((RequiredArgumentBuilder)ef.a("item_predicate", gq.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((ee)$$1x.getSource(), ga.a($$1x, "pos"), fn.a($$1x, "slots"), gq.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (amo.b)($$0x -> a((ee)$$0x.getSource(), ga.a($$0x, "pos"), fn.a($$0x, "slots"), gq.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (apd.c $$4 : apd.c) {
         $$1.then(
            $$4.a(
               ef.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)ef.a("path", ew.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), ew.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (amo.b)($$1xx -> a($$4.a($$1xx), ew.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends brw> $$0, cqr $$1, Predicate<ctq> $$2) {
      int $$3 = 0;

      for (brw $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            bti $$8 = $$4.a_($$7);
            ctq $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.I();
            }
         }
      }

      return $$3;
   }

   private static int a(ee $$0, io $$1, cqr $$2, Predicate<ctq> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      bpp $$5 = amy.a($$0, $$1, amy.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            ctq $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.I();
            }
         }
      }

      return $$4;
   }

   private static Command<ee> a(boolean $$0, amo.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ee)$$1x.getSource()).a(() -> wx.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ee)$$1x.getSource()).a(() -> wx.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(apc $$0, ew.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ee> $$0, amo.e $$1) throws CommandSyntaxException {
      evp $$2 = fj.a($$0, "target");
      evi $$3 = ey.a($$0, "targetObjective");
      evp $$4 = fj.a($$0, "source");
      evi $$5 = ey.a($$0, "sourceObjective");
      evq $$6 = ((ee)$$0.getSource()).l().aK();
      evm $$7 = $$6.d($$2, $$3);
      evm $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<ee> $$0, ct.d $$1) throws CommandSyntaxException {
      evp $$2 = fj.a($$0, "target");
      evi $$3 = ey.a($$0, "targetObjective");
      evq $$4 = ((ee)$$0.getSource()).l().aK();
      evm $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(ee $$0, ix<esn> $$1) {
      aqn $$2 = $$0.e();
      epk $$3 = new epk.a($$2).a(erz.f, $$0.d()).b(erz.a, $$0.f()).a(ery.d);
      eph $$4 = new eph.a($$3).a(Optional.empty());
      $$4.b(eph.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<ee> a(CommandContext<ee> $$0, boolean $$1, boolean $$2) {
      return (Collection<ee>)($$2 == $$1 ? Collections.singleton((ee)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ee, ?> a(CommandNode<ee> $$0, ArgumentBuilder<ee, ?> $$1, boolean $$2, amo.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ee)$$2x.getSource()).a(() -> wx.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<ee, ?> a(CommandNode<ee> $$0, ArgumentBuilder<ee, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<ee> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((ee)$$0.getSource()).a(() -> wx.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<ee> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((ee)$$0.getSource()).a(() -> wx.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ee> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ee)$$0.getSource()).e(), ga.a($$0, "start"), ga.a($$0, "end"), ga.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(aqn $$0, io $$1, io $$2, io $$3, boolean $$4) throws CommandSyntaxException {
      ehd $$5 = ehd.a($$1, $$2);
      ehd $$6 = ehd.a($$3, $$3.a($$5.c()));
      io $$7 = new io($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         jl $$9 = $$0.H_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  io $$14 = new io($$13, $$12, $$11);
                  io $$15 = $$14.a((js)$$7);
                  drd $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dec.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     doi $$17 = $$0.c_($$14);
                     doi $$18 = $$0.c_($$15);
                     if ($$17 != null) {
                        if ($$18 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$18.r() != $$17.r()) {
                           return OptionalInt.empty();
                        }

                        if (!$$17.t().equals($$18.t())) {
                           return OptionalInt.empty();
                        }

                        ud $$19 = $$17.e($$9);
                        ud $$20 = $$18.e($$9);
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

   private static RedirectModifier<ee> a(Function<brw, Optional<brw>> $$0) {
      return $$1 -> {
         ee $$2 = (ee)$$1.getSource();
         brw $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dK()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ee> b(Function<brw, Stream<brw>> $$0) {
      return $$1 -> {
         ee $$2 = (ee)$$1.getSource();
         brw $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dK()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ee> a(CommandNode<ee> $$0, LiteralArgumentBuilder<ee> $$1) {
      return (LiteralArgumentBuilder<ee>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              ef.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<brw, Optional<brw>>)($$0x -> $$0x instanceof bsy $$1x ? Optional.ofNullable($$1x.P_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              ef.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<brw, Optional<brw>>)($$0x -> $$0x instanceof bss $$1x ? Optional.ofNullable($$1x.ge()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           ef.a("target")
                              .fork($$0, a((Function<brw, Optional<brw>>)($$0x -> $$0x instanceof bto $$1x ? Optional.ofNullable($$1x.p()) : Optional.empty())))
                        ))
                     .then(
                        ef.a("attacker")
                           .fork($$0, a((Function<brw, Optional<brw>>)($$0x -> $$0x instanceof brt $$1x ? Optional.ofNullable($$1x.T_()) : Optional.empty())))
                     ))
                  .then(ef.a("vehicle").fork($$0, a((Function<brw, Optional<brw>>)($$0x -> Optional.ofNullable($$0x.dc()))))))
               .then(ef.a("controller").fork($$0, a((Function<brw, Optional<brw>>)($$0x -> Optional.ofNullable($$0x.cQ()))))))
            .then(
               ef.a("origin").fork($$0, a((Function<brw, Optional<brw>>)($$0x -> $$0x instanceof btp $$1x ? Optional.ofNullable($$1x.s()) : Optional.empty())))
            ))
         .then(ef.a("passengers").fork($$0, b((Function<brw, Stream<brw>>)($$0x -> $$0x.cS().stream()))));
   }

   private static ee a(ee $$0, ix.c<bsc<?>> $$1) throws CommandSyntaxException {
      brw $$2 = aom.a($$0, $$1, $$0.d(), new ud(), true);
      return $$0.a($$2);
   }

   public static <T extends eg<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable ud $$5, he<T> $$6, amo.a<T, Collection<hq<T>>> $$7, gy $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<hq<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<hs<T>> $$14 = new ArrayList<>($$13);

         try {
            for (hq<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x()));
               } catch (eh var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            eb $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new ho<>($$2x -> {
               for (hs<T> $$3x : $$14) {
                  $$2x.a(new hk<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(hn.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new hj.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<ee> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<ee> var1) throws CommandSyntaxException;
   }

   static class d implements hb.a<ee> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ee $$0, List<ee> $$1, ContextChain<ee> $$2, gy $$3, he<ee> $$4) {
         amo.a($$0, $$1, amt::a, this.a, $$2, null, $$4, $$0x -> gm.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
