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

public class amf {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> ws.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ws.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> ws.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> ws.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<ec> f = ($$0, $$1) -> {
      eod $$2 = ((ec)$$0.getSource()).l().aM();
      return eh.a($$2.a(eof.a), $$1);
   };

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      LiteralCommandNode<ec> $$2 = $$0.register((LiteralArgumentBuilder)ed.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(ed.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, ed.a("if"), true, $$1)))
                                             .then(a($$2, ed.a("unless"), false, $$1)))
                                          .then(ed.a("as").then(ed.a("targets", ep.b()).fork($$2, $$0x -> {
                                             List<ec> $$1x = Lists.newArrayList();

                                             for (bql $$2x : ep.c($$0x, "targets")) {
                                                $$1x.add(((ec)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ed.a("at").then(ed.a("targets", ep.b()).fork($$2, $$0x -> {
                                          List<ec> $$1x = Lists.newArrayList();

                                          for (bql $$2x : ep.c($$0x, "targets")) {
                                             $$1x.add(((ec)$$0x.getSource()).a((aqe)$$2x.dN()).a($$2x.dl()).a($$2x.bK()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)ed.a("store").then(a($$2, ed.a("result"), true))).then(a($$2, ed.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("positioned")
                                             .then(ed.a("pos", ge.a()).redirect($$2, $$0x -> ((ec)$$0x.getSource()).a(ge.a($$0x, "pos")).a(eo.a.a))))
                                          .then(ed.a("as").then(ed.a("targets", ep.b()).fork($$2, $$0x -> {
                                             List<ec> $$1x = Lists.newArrayList();

                                             for (bql $$2x : ep.c($$0x, "targets")) {
                                                $$1x.add(((ec)$$0x.getSource()).a($$2x.dl()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ed.a("over").then(ed.a("heightmap", es.a()).redirect($$2, $$0x -> {
                                          etf $$1x = ((ec)$$0x.getSource()).d();
                                          aqe $$2x = ((ec)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(jo.b($$3), jo.b($$4))) {
                                             throw fx.a.create();
                                          } else {
                                             int $$5 = $$2x.a(es.a($$0x, "heightmap"), axw.a($$3), axw.a($$4));
                                             return ((ec)$$0x.getSource()).a(new etf($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ed.a("rotated")
                                       .then(ed.a("rot", gb.a()).redirect($$2, $$0x -> ((ec)$$0x.getSource()).a(gb.a($$0x, "rot").b((ec)$$0x.getSource())))))
                                    .then(ed.a("as").then(ed.a("targets", ep.b()).fork($$2, $$0x -> {
                                       List<ec> $$1x = Lists.newArrayList();

                                       for (bql $$2x : ep.c($$0x, "targets")) {
                                          $$1x.add(((ec)$$0x.getSource()).a($$2x.bK()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ed.a("facing")
                                    .then(ed.a("entity").then(ed.a("targets", ep.b()).then(ed.a("anchor", eo.a()).fork($$2, $$0x -> {
                                       List<ec> $$1x = Lists.newArrayList();
                                       eo.a $$2x = eo.a($$0x, "anchor");

                                       for (bql $$3 : ep.c($$0x, "targets")) {
                                          $$1x.add(((ec)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(ed.a("pos", ge.a()).redirect($$2, $$0x -> ((ec)$$0x.getSource()).b(ge.a($$0x, "pos"))))
                           ))
                        .then(
                           ed.a("align")
                              .then(ed.a("axes", gc.a()).redirect($$2, $$0x -> ((ec)$$0x.getSource()).a(((ec)$$0x.getSource()).d().a(gc.a($$0x, "axes")))))
                        ))
                     .then(ed.a("anchored").then(ed.a("anchor", eo.a()).redirect($$2, $$0x -> ((ec)$$0x.getSource()).a(eo.a($$0x, "anchor"))))))
                  .then(ed.a("in").then(ed.a("dimension", en.a()).redirect($$2, $$0x -> ((ec)$$0x.getSource()).a(en.a($$0x, "dimension"))))))
               .then(ed.a("summon").then(ed.a("entity", fb.a($$1, ld.v)).suggests(ia.d).redirect($$2, $$0x -> a((ec)$$0x.getSource(), fb.e($$0x, "entity"))))))
            .then(a($$2, ed.a("on")))
      );
   }

   private static ArgumentBuilder<ec, ?> a(LiteralCommandNode<ec> $$0, LiteralArgumentBuilder<ec> $$1, boolean $$2) {
      $$1.then(
         ed.a("score")
            .then(
               ed.a("targets", fg.b())
                  .suggests(fg.a)
                  .then(ed.a("objective", ew.a()).redirect($$0, $$1x -> a((ec)$$1x.getSource(), fg.c($$1x, "targets"), ew.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         ed.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)ed.a("id", fd.a())
                     .suggests(alp.a)
                     .then(ed.a("value").redirect($$0, $$1x -> a((ec)$$1x.getSource(), alp.a($$1x), true, $$2))))
                  .then(ed.a("max").redirect($$0, $$1x -> a((ec)$$1x.getSource(), alp.a($$1x), false, $$2)))
            )
      );

      for (aou.c $$3 : aou.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a(
                                       "path", eu.a()
                                    )
                                    .then(
                                       ed.a("int")
                                          .then(
                                             ed.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (ec)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         eu.a($$2xx, "path"),
                                                         $$1xxx -> ud.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ed.a("float")
                                       .then(
                                          ed.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (ec)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      eu.a($$2xx, "path"),
                                                      $$1xxx -> ub.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ed.a("short")
                                    .then(
                                       ed.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (ec)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   eu.a($$2xx, "path"),
                                                   $$1xxx -> uq.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ed.a("long")
                                 .then(
                                    ed.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (ec)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                eu.a($$2xx, "path"),
                                                $$1xxx -> ug.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ed.a("double")
                              .then(
                                 ed.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (ec)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             eu.a($$2xx, "path"),
                                             $$1xxx -> tz.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        ed.a("byte")
                           .then(
                              ed.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (ec)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          eu.a($$2xx, "path"),
                                          $$1xxx -> tw.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static ec a(ec $$0, Collection<eui> $$1, eub $$2, boolean $$3) {
      euj $$4 = $$0.l().aK();
      return $$0.a(($$4x, $$5) -> {
         for (eui $$6 : $$1) {
            euh $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, dz::chain);
   }

   private static ec a(ec $$0, ale $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, dz::chain);
   }

   private static ec a(ec $$0, aot $$1, eu.g $$2, IntFunction<uv> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            ty $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, dz::chain);
   }

   private static boolean a(aqe $$0, im $$1) {
      czb $$2 = new czb($$1);
      dse $$3 = $$0.l().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == apx.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ec, ?> a(CommandNode<ec> $$0, LiteralArgumentBuilder<ec> $$1, boolean $$2, dy $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    ed.a("block")
                                       .then(
                                          ed.a("pos", fx.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ed.a("block", ft.a($$3)),
                                                   $$2,
                                                   $$0x -> ft.a($$0x, "block").test(new dqc(((ec)$$0x.getSource()).e(), fx.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    ed.a("biome")
                                       .then(
                                          ed.a("pos", fx.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   ed.a("biome", fe.a($$3, ld.ay)),
                                                   $$2,
                                                   $$0x -> fe.a($$0x, "biome", ld.ay).test(((ec)$$0x.getSource()).e().t(fx.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(ed.a("loaded").then(a($$0, ed.a("pos", fx.a()), $$2, $$0x -> a(((ec)$$0x.getSource()).e(), fx.b($$0x, "pos"))))))
                           .then(ed.a("dimension").then(a($$0, ed.a("dimension", en.a()), $$2, $$0x -> en.a($$0x, "dimension") == ((ec)$$0x.getSource()).e()))))
                        .then(
                           ed.a("score")
                              .then(
                                 ed.a("target", fg.a())
                                    .suggests(fg.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a(
                                                            "targetObjective", ew.a()
                                                         )
                                                         .then(
                                                            ed.a("=")
                                                               .then(
                                                                  ed.a("source", fg.a())
                                                                     .suggests(fg.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           ed.a("sourceObjective", ew.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (amf.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         ed.a("<")
                                                            .then(
                                                               ed.a("source", fg.a())
                                                                  .suggests(fg.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        ed.a("sourceObjective", ew.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (amf.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      ed.a("<=")
                                                         .then(
                                                            ed.a("source", fg.a())
                                                               .suggests(fg.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     ed.a("sourceObjective", ew.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (amf.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ed.a(">")
                                                      .then(
                                                         ed.a("source", fg.a())
                                                            .suggests(fg.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  ed.a("sourceObjective", ew.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (amf.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ed.a(">=")
                                                   .then(
                                                      ed.a("source", fg.a())
                                                         .suggests(fg.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               ed.a("sourceObjective", ew.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (amf.e)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(ed.a("matches").then(a($$0, ed.a("range", fa.a()), $$2, $$0x -> a($$0x, fa.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        ed.a("blocks")
                           .then(
                              ed.a("start", fx.a())
                                 .then(
                                    ed.a("end", fx.a())
                                       .then(
                                          ((RequiredArgumentBuilder)ed.a("destination", fx.a()).then(a($$0, ed.a("all"), $$2, false)))
                                             .then(a($$0, ed.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     ed.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)ed.a("entities", ep.b()).fork($$0, $$1x -> a($$1x, $$2, !ep.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (amf.b)($$0x -> ep.c($$0x, "entities").size())))
                        )
                  ))
               .then(ed.a("predicate").then(a($$0, ed.a("predicate", fd.a()).suggests(f), $$2, $$0x -> a((ec)$$0x.getSource(), fd.c($$0x, "predicate"))))))
            .then(ed.a("function").then(ed.a("name", gi.a()).suggests(amk.b).fork($$0, new amf.d($$2)))))
         .then(
            ((LiteralArgumentBuilder)ed.a("items")
                  .then(
                     ed.a("entity")
                        .then(
                           ed.a("entities", ep.b())
                              .then(
                                 ed.a("slots", fk.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ed.a("item_predicate", gm.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(ep.b($$1x, "entities"), fk.a($$1x, "slots"), gm.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (amf.b)($$0x -> a(ep.b($$0x, "entities"), fk.a($$0x, "slots"), gm.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  ed.a("block")
                     .then(
                        ed.a("pos", fx.a())
                           .then(
                              ed.a("slots", fk.a())
                                 .then(
                                    ((RequiredArgumentBuilder)ed.a("item_predicate", gm.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((ec)$$1x.getSource(), fx.a($$1x, "pos"), fk.a($$1x, "slots"), gm.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (amf.b)($$0x -> a((ec)$$0x.getSource(), fx.a($$0x, "pos"), fk.a($$0x, "slots"), gm.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (aou.c $$4 : aou.c) {
         $$1.then(
            $$4.a(
               ed.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)ed.a("path", eu.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), eu.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (amf.b)($$1xx -> a($$4.a($$1xx), eu.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends bql> $$0, cpe $$1, Predicate<csd> $$2) {
      int $$3 = 0;

      for (bql $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            brv $$8 = $$4.a_($$7);
            csd $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.G();
            }
         }
      }

      return $$3;
   }

   private static int a(ec $$0, im $$1, cpe $$2, Predicate<csd> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      boj $$5 = amp.a($$0, $$1, amp.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            csd $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.G();
            }
         }
      }

      return $$4;
   }

   private static Command<ec> a(boolean $$0, amf.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ec)$$1x.getSource()).a(() -> ws.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ec)$$1x.getSource()).a(() -> ws.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(aot $$0, eu.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ec> $$0, amf.e $$1) throws CommandSyntaxException {
      eui $$2 = fg.a($$0, "target");
      eub $$3 = ew.a($$0, "targetObjective");
      eui $$4 = fg.a($$0, "source");
      eub $$5 = ew.a($$0, "sourceObjective");
      euj $$6 = ((ec)$$0.getSource()).l().aK();
      euf $$7 = $$6.d($$2, $$3);
      euf $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<ec> $$0, cs.d $$1) throws CommandSyntaxException {
      eui $$2 = fg.a($$0, "target");
      eub $$3 = ew.a($$0, "targetObjective");
      euj $$4 = ((ec)$$0.getSource()).l().aK();
      euf $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(ec $$0, erh $$1) {
      aqe $$2 = $$0.e();
      eog $$3 = new eog.a($$2).a(eqt.f, $$0.d()).b(eqt.a, $$0.f()).a(eqs.d);
      eoa $$4 = new eoa.a($$3).a(Optional.empty());
      $$4.b(eoa.a($$1));
      return $$1.test($$4);
   }

   private static Collection<ec> a(CommandContext<ec> $$0, boolean $$1, boolean $$2) {
      return (Collection<ec>)($$2 == $$1 ? Collections.singleton((ec)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ec, ?> a(CommandNode<ec> $$0, ArgumentBuilder<ec, ?> $$1, boolean $$2, amf.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ec)$$2x.getSource()).a(() -> ws.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<ec, ?> a(CommandNode<ec> $$0, ArgumentBuilder<ec, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<ec> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((ec)$$0.getSource()).a(() -> ws.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<ec> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((ec)$$0.getSource()).a(() -> ws.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ec> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ec)$$0.getSource()).e(), fx.a($$0, "start"), fx.a($$0, "end"), fx.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(aqe $$0, im $$1, im $$2, im $$3, boolean $$4) throws CommandSyntaxException {
      efy $$5 = efy.a($$1, $$2);
      efy $$6 = efy.a($$3, $$3.a($$5.c()));
      im $$7 = new im($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         jj $$9 = $$0.H_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  im $$14 = new im($$13, $$12, $$11);
                  im $$15 = $$14.a((jq)$$7);
                  dpy $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dcx.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dnd $$17 = $$0.c_($$14);
                     dnd $$18 = $$0.c_($$15);
                     if ($$17 != null) {
                        if ($$18 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$18.r() != $$17.r()) {
                           return OptionalInt.empty();
                        }

                        ty $$19 = $$17.d($$9);
                        ty $$20 = $$18.d($$9);
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

   private static RedirectModifier<ec> a(Function<bql, Optional<bql>> $$0) {
      return $$1 -> {
         ec $$2 = (ec)$$1.getSource();
         bql $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dI()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ec> b(Function<bql, Stream<bql>> $$0) {
      return $$1 -> {
         ec $$2 = (ec)$$1.getSource();
         bql $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dI()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ec> a(CommandNode<ec> $$0, LiteralArgumentBuilder<ec> $$1) {
      return (LiteralArgumentBuilder<ec>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              ed.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<bql, Optional<bql>>)($$0x -> $$0x instanceof brl $$1x ? Optional.ofNullable($$1x.P_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              ed.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<bql, Optional<bql>>)($$0x -> $$0x instanceof brg $$1x ? Optional.ofNullable($$1x.ge()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           ed.a("target")
                              .fork($$0, a((Function<bql, Optional<bql>>)($$0x -> $$0x instanceof bsb $$1x ? Optional.ofNullable($$1x.p()) : Optional.empty())))
                        ))
                     .then(
                        ed.a("attacker")
                           .fork($$0, a((Function<bql, Optional<bql>>)($$0x -> $$0x instanceof bqi $$1x ? Optional.ofNullable($$1x.T_()) : Optional.empty())))
                     ))
                  .then(ed.a("vehicle").fork($$0, a((Function<bql, Optional<bql>>)($$0x -> Optional.ofNullable($$0x.da()))))))
               .then(ed.a("controller").fork($$0, a((Function<bql, Optional<bql>>)($$0x -> Optional.ofNullable($$0x.cO()))))))
            .then(
               ed.a("origin").fork($$0, a((Function<bql, Optional<bql>>)($$0x -> $$0x instanceof bsc $$1x ? Optional.ofNullable($$1x.u()) : Optional.empty())))
            ))
         .then(ed.a("passengers").fork($$0, b((Function<bql, Stream<bql>>)($$0x -> $$0x.cQ().stream()))));
   }

   private static ec a(ec $$0, iv.c<bqr<?>> $$1) throws CommandSyntaxException {
      bql $$2 = aod.a($$0, $$1, $$0.d(), new ty(), true);
      return $$0.a($$2);
   }

   public static <T extends ee<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable ty $$5, hc<T> $$6, amf.a<T, Collection<ho<T>>> $$7, gw $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<ho<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<hq<T>> $$14 = new ArrayList<>($$13);

         try {
            for (ho<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x()));
               } catch (ef var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            dz $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new hm<>($$2x -> {
               for (hq<T> $$3x : $$14) {
                  $$2x.a(new hi<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(hl.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new hh.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<ec> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<ec> var1) throws CommandSyntaxException;
   }

   static class d implements gz.a<ec> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ec $$0, List<ec> $$1, ContextChain<ec> $$2, gw $$3, hc<ec> $$4) {
         amf.a($$0, $$1, amk::a, this.a, $$2, null, $$4, $$0x -> gi.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
