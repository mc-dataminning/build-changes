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

public class anh {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xe.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xe.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<eu> f = ($$0, $$1) -> {
      alo.a $$2 = ((eu)$$0.getSource()).l().bd();
      return ez.a($$2.a(lw.bg), $$1);
   };

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      LiteralCommandNode<eu> $$2 = $$0.register((LiteralArgumentBuilder)ev.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(ev.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, ev.a("if"), true, $$1)))
                                             .then(a($$2, ev.a("unless"), false, $$1)))
                                          .then(ev.a("as").then(ev.a("targets", fh.b()).fork($$2, $$0x -> {
                                             List<eu> $$1x = Lists.newArrayList();

                                             for (btr $$2x : fh.c($$0x, "targets")) {
                                                $$1x.add(((eu)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ev.a("at").then(ev.a("targets", fh.b()).fork($$2, $$0x -> {
                                          List<eu> $$1x = Lists.newArrayList();

                                          for (btr $$2x : fh.c($$0x, "targets")) {
                                             $$1x.add(((eu)$$0x.getSource()).a((arj)$$2x.dS()).a($$2x.dq()).a($$2x.bR()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)ev.a("store").then(a($$2, ev.a("result"), true))).then(a($$2, ev.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("positioned")
                                             .then(ev.a("pos", gx.a()).redirect($$2, $$0x -> ((eu)$$0x.getSource()).a(gx.a($$0x, "pos")).a(fg.a.a))))
                                          .then(ev.a("as").then(ev.a("targets", fh.b()).fork($$2, $$0x -> {
                                             List<eu> $$1x = Lists.newArrayList();

                                             for (btr $$2x : fh.c($$0x, "targets")) {
                                                $$1x.add(((eu)$$0x.getSource()).a($$2x.dq()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ev.a("over").then(ev.a("heightmap", fk.a()).redirect($$2, $$0x -> {
                                          eyw $$1x = ((eu)$$0x.getSource()).d();
                                          arj $$2x = ((eu)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(kh.b($$3), kh.b($$4))) {
                                             throw gq.a.create();
                                          } else {
                                             int $$5 = $$2x.a(fk.a($$0x, "heightmap"), azf.a($$3), azf.a($$4));
                                             return ((eu)$$0x.getSource()).a(new eyw($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ev.a("rotated")
                                       .then(ev.a("rot", gu.a()).redirect($$2, $$0x -> ((eu)$$0x.getSource()).a(gu.a($$0x, "rot").b((eu)$$0x.getSource())))))
                                    .then(ev.a("as").then(ev.a("targets", fh.b()).fork($$2, $$0x -> {
                                       List<eu> $$1x = Lists.newArrayList();

                                       for (btr $$2x : fh.c($$0x, "targets")) {
                                          $$1x.add(((eu)$$0x.getSource()).a($$2x.bR()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ev.a("facing")
                                    .then(ev.a("entity").then(ev.a("targets", fh.b()).then(ev.a("anchor", fg.a()).fork($$2, $$0x -> {
                                       List<eu> $$1x = Lists.newArrayList();
                                       fg.a $$2x = fg.a($$0x, "anchor");

                                       for (btr $$3 : fh.c($$0x, "targets")) {
                                          $$1x.add(((eu)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(ev.a("pos", gx.a()).redirect($$2, $$0x -> ((eu)$$0x.getSource()).b(gx.a($$0x, "pos"))))
                           ))
                        .then(
                           ev.a("align")
                              .then(ev.a("axes", gv.a()).redirect($$2, $$0x -> ((eu)$$0x.getSource()).a(((eu)$$0x.getSource()).d().a(gv.a($$0x, "axes")))))
                        ))
                     .then(ev.a("anchored").then(ev.a("anchor", fg.a()).redirect($$2, $$0x -> ((eu)$$0x.getSource()).a(fg.a($$0x, "anchor"))))))
                  .then(ev.a("in").then(ev.a("dimension", ff.a()).redirect($$2, $$0x -> ((eu)$$0x.getSource()).a(ff.a($$0x, "dimension"))))))
               .then(ev.a("summon").then(ev.a("entity", ft.a($$1, lw.z)).suggests(iu.d).redirect($$2, $$0x -> a((eu)$$0x.getSource(), ft.e($$0x, "entity"))))))
            .then(a($$2, ev.a("on")))
      );
   }

   private static ArgumentBuilder<eu, ?> a(LiteralCommandNode<eu> $$0, LiteralArgumentBuilder<eu> $$1, boolean $$2) {
      $$1.then(
         ev.a("score")
            .then(
               ev.a("targets", fz.b())
                  .suggests(fz.a)
                  .then(ev.a("objective", fo.a()).redirect($$0, $$1x -> a((eu)$$1x.getSource(), fz.c($$1x, "targets"), fo.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         ev.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)ev.a("id", fv.a())
                     .suggests(amr.a)
                     .then(ev.a("value").redirect($$0, $$1x -> a((eu)$$1x.getSource(), amr.a($$1x), true, $$2))))
                  .then(ev.a("max").redirect($$0, $$1x -> a((eu)$$1x.getSource(), amr.a($$1x), false, $$2)))
            )
      );

      for (apv.c $$3 : apv.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a(
                                       "path", fm.a()
                                    )
                                    .then(
                                       ev.a("int")
                                          .then(
                                             ev.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (eu)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         fm.a($$2xx, "path"),
                                                         $$1xxx -> ul.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ev.a("float")
                                       .then(
                                          ev.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (eu)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      fm.a($$2xx, "path"),
                                                      $$1xxx -> uj.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ev.a("short")
                                    .then(
                                       ev.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (eu)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   fm.a($$2xx, "path"),
                                                   $$1xxx -> uy.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ev.a("long")
                                 .then(
                                    ev.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (eu)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                fm.a($$2xx, "path"),
                                                $$1xxx -> uo.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ev.a("double")
                              .then(
                                 ev.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (eu)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             fm.a($$2xx, "path"),
                                             $$1xxx -> uh.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        ev.a("byte")
                           .then(
                              ev.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (eu)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          fm.a($$2xx, "path"),
                                          $$1xxx -> ue.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static eu a(eu $$0, Collection<faa> $$1, ezt $$2, boolean $$3) {
      fab $$4 = $$0.l().aJ();
      return $$0.a(($$4x, $$5) -> {
         for (faa $$6 : $$1) {
            ezz $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, er::chain);
   }

   private static eu a(eu $$0, amg $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, er::chain);
   }

   private static eu a(eu $$0, apu $$1, fm.g $$2, IntFunction<vd> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            ug $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, er::chain);
   }

   private static boolean a(arj $$0, jf $$1) {
      ddp $$2 = new ddp($$1);
      dwy $$3 = $$0.l().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.C() == aqz.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<eu, ?> a(CommandNode<eu> $$0, LiteralArgumentBuilder<eu> $$1, boolean $$2, eq $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    ev.a("block")
                                       .then(
                                          ev.a("pos", gq.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ev.a("block", gm.a($$3)),
                                                   $$2,
                                                   $$0x -> gm.a($$0x, "block").test(new duw(((eu)$$0x.getSource()).e(), gq.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    ev.a("biome")
                                       .then(
                                          ev.a("pos", gq.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ev.a("biome", fx.a($$3, lw.aH)),
                                                   $$2,
                                                   $$0x -> fx.a($$0x, "biome", lw.aH).test(((eu)$$0x.getSource()).e().t(gq.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(ev.a("loaded").then(a($$0, ev.a("pos", gq.a()), $$2, $$0x -> a(((eu)$$0x.getSource()).e(), gq.b($$0x, "pos"))))))
                           .then(ev.a("dimension").then(a($$0, ev.a("dimension", ff.a()), $$2, $$0x -> ff.a($$0x, "dimension") == ((eu)$$0x.getSource()).e()))))
                        .then(
                           ev.a("score")
                              .then(
                                 ev.a("target", fz.a())
                                    .suggests(fz.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a(
                                                            "targetObjective", fo.a()
                                                         )
                                                         .then(
                                                            ev.a("=")
                                                               .then(
                                                                  ev.a("source", fz.a())
                                                                     .suggests(fz.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           ev.a("sourceObjective", fo.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (anh.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ev.a("<")
                                                            .then(
                                                               ev.a("source", fz.a())
                                                                  .suggests(fz.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        ev.a("sourceObjective", fo.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (anh.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      ev.a("<=")
                                                         .then(
                                                            ev.a("source", fz.a())
                                                               .suggests(fz.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     ev.a("sourceObjective", fo.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (anh.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ev.a(">")
                                                      .then(
                                                         ev.a("source", fz.a())
                                                            .suggests(fz.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  ev.a("sourceObjective", fo.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (anh.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ev.a(">=")
                                                   .then(
                                                      ev.a("source", fz.a())
                                                         .suggests(fz.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               ev.a("sourceObjective", fo.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (anh.e)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(ev.a("matches").then(a($$0, ev.a("range", fs.a()), $$2, $$0x -> a($$0x, fs.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        ev.a("blocks")
                           .then(
                              ev.a("start", gq.a())
                                 .then(
                                    ev.a("end", gq.a())
                                       .then(
                                          ((RequiredArgumentBuilder)ev.a("destination", gq.a()).then(a($$0, ev.a("all"), $$2, false)))
                                             .then(a($$0, ev.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ev.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)ev.a("entities", fh.b()).fork($$0, $$1x -> a($$1x, $$2, !fh.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (anh.b)($$0x -> fh.c($$0x, "entities").size())))
                        )
                  ))
               .then(ev.a("predicate").then(a($$0, ev.a("predicate", fw.c($$3)).suggests(f), $$2, $$0x -> a((eu)$$0x.getSource(), fw.c($$0x, "predicate"))))))
            .then(ev.a("function").then(ev.a("name", hc.a()).suggests(anm.b).fork($$0, new anh.d($$2)))))
         .then(
            ((LiteralArgumentBuilder)ev.a("items")
                  .then(
                     ev.a("entity")
                        .then(
                           ev.a("entities", fh.b())
                              .then(
                                 ev.a("slots", gd.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ev.a("item_predicate", hg.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(fh.b($$1x, "entities"), gd.a($$1x, "slots"), hg.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (anh.b)($$0x -> a(fh.b($$0x, "entities"), gd.a($$0x, "slots"), hg.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  ev.a("block")
                     .then(
                        ev.a("pos", gq.a())
                           .then(
                              ev.a("slots", gd.a())
                                 .then(
                                    ((RequiredArgumentBuilder)ev.a("item_predicate", hg.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((eu)$$1x.getSource(), gq.a($$1x, "pos"), gd.a($$1x, "slots"), hg.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (anh.b)($$0x -> a((eu)$$0x.getSource(), gq.a($$0x, "pos"), gd.a($$0x, "slots"), hg.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (apv.c $$4 : apv.c) {
         $$1.then(
            $$4.a(
               ev.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)ev.a("path", fm.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), fm.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (anh.b)($$1xx -> a($$4.a($$1xx), fm.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends btr> $$0, csx $$1, Predicate<cvs> $$2) {
      int $$3 = 0;

      for (btr $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            bve $$8 = $$4.a_($$7);
            cvs $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.K();
            }
         }
      }

      return $$3;
   }

   private static int a(eu $$0, jf $$1, csx $$2, Predicate<cvs> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      brl $$5 = anr.a($$0, $$1, anr.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            cvs $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.K();
            }
         }
      }

      return $$4;
   }

   private static Command<eu> a(boolean $$0, anh.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((eu)$$1x.getSource()).a(() -> xe.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((eu)$$1x.getSource()).a(() -> xe.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(apu $$0, fm.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<eu> $$0, anh.e $$1) throws CommandSyntaxException {
      faa $$2 = fz.a($$0, "target");
      ezt $$3 = fo.a($$0, "targetObjective");
      faa $$4 = fz.a($$0, "source");
      ezt $$5 = fo.a($$0, "sourceObjective");
      fab $$6 = ((eu)$$0.getSource()).l().aJ();
      ezx $$7 = $$6.d($$2, $$3);
      ezx $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<eu> $$0, dh.d $$1) throws CommandSyntaxException {
      faa $$2 = fz.a($$0, "target");
      ezt $$3 = fo.a($$0, "targetObjective");
      fab $$4 = ((eu)$$0.getSource()).l().aJ();
      ezx $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(eu $$0, jo<eww> $$1) {
      arj $$2 = $$0.e();
      eto $$3 = new eto.a($$2).a(ewh.f, $$0.d()).b(ewh.a, $$0.f()).a(ewg.d);
      etl $$4 = new etl.a($$3).a(Optional.empty());
      $$4.b(etl.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<eu> a(CommandContext<eu> $$0, boolean $$1, boolean $$2) {
      return (Collection<eu>)($$2 == $$1 ? Collections.singleton((eu)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<eu, ?> a(CommandNode<eu> $$0, ArgumentBuilder<eu, ?> $$1, boolean $$2, anh.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((eu)$$2x.getSource()).a(() -> xe.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<eu, ?> a(CommandNode<eu> $$0, ArgumentBuilder<eu, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<eu> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((eu)$$0.getSource()).a(() -> xe.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<eu> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((eu)$$0.getSource()).a(() -> xe.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<eu> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((eu)$$0.getSource()).e(), gq.a($$0, "start"), gq.a($$0, "end"), gq.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(arj $$0, jf $$1, jf $$2, jf $$3, boolean $$4) throws CommandSyntaxException {
      eky $$5 = eky.a($$1, $$2);
      eky $$6 = eky.a($$3, $$3.a($$5.c()));
      jf $$7 = new jf($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         kc $$9 = $$0.G_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  jf $$14 = new jf($$13, $$12, $$11);
                  jf $$15 = $$14.a((kj)$$7);
                  dus $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dho.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     drv $$17 = $$0.c_($$14);
                     drv $$18 = $$0.c_($$15);
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

                        ug $$19 = $$17.e($$9);
                        ug $$20 = $$18.e($$9);
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

   private static RedirectModifier<eu> a(Function<btr, Optional<btr>> $$0) {
      return $$1 -> {
         eu $$2 = (eu)$$1.getSource();
         btr $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dN()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<eu> b(Function<btr, Stream<btr>> $$0) {
      return $$1 -> {
         eu $$2 = (eu)$$1.getSource();
         btr $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dN()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<eu> a(CommandNode<eu> $$0, LiteralArgumentBuilder<eu> $$1) {
      return (LiteralArgumentBuilder<eu>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              ev.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<btr, Optional<btr>>)($$0x -> $$0x instanceof buu $$1x ? Optional.ofNullable($$1x.S_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              ev.a("leasher")
                                 .fork(
                                    $$0, a((Function<btr, Optional<btr>>)($$0x -> $$0x instanceof bul $$1x ? Optional.ofNullable($$1x.C()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           ev.a("target")
                              .fork($$0, a((Function<btr, Optional<btr>>)($$0x -> $$0x instanceof bvk $$1x ? Optional.ofNullable($$1x.m()) : Optional.empty())))
                        ))
                     .then(
                        ev.a("attacker")
                           .fork($$0, a((Function<btr, Optional<btr>>)($$0x -> $$0x instanceof btn $$1x ? Optional.ofNullable($$1x.Y_()) : Optional.empty())))
                     ))
                  .then(ev.a("vehicle").fork($$0, a((Function<btr, Optional<btr>>)($$0x -> Optional.ofNullable($$0x.dg()))))))
               .then(ev.a("controller").fork($$0, a((Function<btr, Optional<btr>>)($$0x -> Optional.ofNullable($$0x.cU()))))))
            .then(
               ev.a("origin").fork($$0, a((Function<btr, Optional<btr>>)($$0x -> $$0x instanceof bvl $$1x ? Optional.ofNullable($$1x.s()) : Optional.empty())))
            ))
         .then(ev.a("passengers").fork($$0, b((Function<btr, Stream<btr>>)($$0x -> $$0x.cW().stream()))));
   }

   private static eu a(eu $$0, jo.c<bty<?>> $$1) throws CommandSyntaxException {
      btr $$2 = ape.a($$0, $$1, $$0.d(), new ug(), true);
      return $$0.a($$2);
   }

   public static <T extends ew<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable ug $$5, hv<T> $$6, anh.a<T, Collection<ii<T>>> $$7, hp $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<ii<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<ik<T>> $$14 = new ArrayList<>($$13);

         try {
            for (ii<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x()));
               } catch (ex var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            er $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new ig<>($$2x -> {
               for (ik<T> $$3x : $$14) {
                  $$2x.a(new ib<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(ie.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new ia.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<eu> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<eu> var1) throws CommandSyntaxException;
   }

   static class d implements hs.a<eu> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(eu $$0, List<eu> $$1, ContextChain<eu> $$2, hp $$3, hv<eu> $$4) {
         anh.a($$0, $$1, anm::a, this.a, $$2, null, $$4, $$0x -> hc.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
