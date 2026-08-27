import com.google.common.collect.Lists;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class aen {
   private static final int a = 32768;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(sw.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> sw.a("commands.execute.conditional.fail_count", $$0));
   private static final BinaryOperator<ResultConsumer<ds>> e = ($$0, $$1) -> ($$2, $$3, $$4) -> {
         $$0.onCommandComplete($$2, $$3, $$4);
         $$1.onCommandComplete($$2, $$3, $$4);
      };
   private static final SuggestionProvider<ds> f = ($$0, $$1) -> {
      dzn $$2 = ((ds)$$0.getSource()).l().aH();
      return du.a($$2.a(dzp.a), $$1);
   };

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      LiteralCommandNode<ds> $$2 = $$0.register((LiteralArgumentBuilder)dt.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(dt.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, dt.a("if"), true, $$1)))
                                             .then(a($$2, dt.a("unless"), false, $$1)))
                                          .then(dt.a("as").then(dt.a("targets", ec.b()).fork($$2, $$0x -> {
                                             List<ds> $$1x = Lists.newArrayList();

                                             for (bfj $$2x : ec.c($$0x, "targets")) {
                                                $$1x.add(((ds)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dt.a("at").then(dt.a("targets", ec.b()).fork($$2, $$0x -> {
                                          List<ds> $$1x = Lists.newArrayList();

                                          for (bfj $$2x : ec.c($$0x, "targets")) {
                                             $$1x.add(((ds)$$0x.getSource()).a((aif)$$2x.dI()).a($$2x.dg()).a($$2x.bE()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)dt.a("store").then(a($$2, dt.a("result"), true))).then(a($$2, dt.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("positioned")
                                             .then(dt.a("pos", fp.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(fp.a($$0x, "pos")).a(eb.a.a))))
                                          .then(dt.a("as").then(dt.a("targets", ec.b()).fork($$2, $$0x -> {
                                             List<ds> $$1x = Lists.newArrayList();

                                             for (bfj $$2x : ec.c($$0x, "targets")) {
                                                $$1x.add(((ds)$$0x.getSource()).a($$2x.dg()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dt.a("over").then(dt.a("heightmap", ef.a()).redirect($$2, $$0x -> {
                                          eei $$1x = ((ds)$$0x.getSource()).d();
                                          aif $$2x = ((ds)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(hx.b($$3), hx.b($$4))) {
                                             throw fi.a.create();
                                          } else {
                                             int $$5 = $$2x.a(ef.a($$0x, "heightmap"), apa.a($$3), apa.a($$4));
                                             return ((ds)$$0x.getSource()).a(new eei($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)dt.a("rotated")
                                       .then(dt.a("rot", fm.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(fm.a($$0x, "rot").b((ds)$$0x.getSource())))))
                                    .then(dt.a("as").then(dt.a("targets", ec.b()).fork($$2, $$0x -> {
                                       List<ds> $$1x = Lists.newArrayList();

                                       for (bfj $$2x : ec.c($$0x, "targets")) {
                                          $$1x.add(((ds)$$0x.getSource()).a($$2x.bE()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dt.a("facing")
                                    .then(dt.a("entity").then(dt.a("targets", ec.b()).then(dt.a("anchor", eb.a()).fork($$2, $$0x -> {
                                       List<ds> $$1x = Lists.newArrayList();
                                       eb.a $$2x = eb.a($$0x, "anchor");

                                       for (bfj $$3 : ec.c($$0x, "targets")) {
                                          $$1x.add(((ds)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(dt.a("pos", fp.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).b(fp.a($$0x, "pos"))))
                           ))
                        .then(
                           dt.a("align")
                              .then(dt.a("axes", fn.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(((ds)$$0x.getSource()).d().a(fn.a($$0x, "axes")))))
                        ))
                     .then(dt.a("anchored").then(dt.a("anchor", eb.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(eb.a($$0x, "anchor"))))))
                  .then(dt.a("in").then(dt.a("dimension", ea.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(ea.a($$0x, "dimension"))))))
               .then(dt.a("summon").then(dt.a("entity", eo.a($$1, jc.s)).suggests(gk.d).redirect($$2, $$0x -> a((ds)$$0x.getSource(), eo.e($$0x, "entity"))))))
            .then(a($$2, dt.a("on")))
      );
   }

   private static ArgumentBuilder<ds, ?> a(LiteralCommandNode<ds> $$0, LiteralArgumentBuilder<ds> $$1, boolean $$2) {
      $$1.then(
         dt.a("score")
            .then(
               dt.a("targets", et.b())
                  .suggests(et.a)
                  .then(dt.a("objective", ej.a()).redirect($$0, $$1x -> a((ds)$$1x.getSource(), et.c($$1x, "targets"), ej.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         dt.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)dt.a("id", eq.a())
                     .suggests(ady.a)
                     .then(dt.a("value").redirect($$0, $$1x -> a((ds)$$1x.getSource(), ady.a($$1x), true, $$2))))
                  .then(dt.a("max").redirect($$0, $$1x -> a((ds)$$1x.getSource(), ady.a($$1x), false, $$2)))
            )
      );

      for (agy.c $$3 : agy.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                       "path", eh.a()
                                    )
                                    .then(
                                       dt.a("int")
                                          .then(
                                             dt.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (ds)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         eh.a($$2xx, "path"),
                                                         $$1xxx -> qw.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dt.a("float")
                                       .then(
                                          dt.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (ds)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      eh.a($$2xx, "path"),
                                                      $$1xxx -> qu.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dt.a("short")
                                    .then(
                                       dt.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (ds)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   eh.a($$2xx, "path"),
                                                   $$1xxx -> rf.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              dt.a("long")
                                 .then(
                                    dt.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (ds)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                eh.a($$2xx, "path"),
                                                $$1xxx -> qz.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           dt.a("double")
                              .then(
                                 dt.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (ds)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             eh.a($$2xx, "path"),
                                             $$1xxx -> qs.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        dt.a("byte")
                           .then(
                              dt.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (ds)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          eh.a($$2xx, "path"),
                                          $$1xxx -> qp.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static ds a(ds $$0, Collection<String> $$1, efd $$2, boolean $$3) {
      efg $$4 = $$0.l().aF();
      return $$0.a(($$4x, $$5, $$6) -> {
         for (String $$7 : $$1) {
            eff $$8 = $$4.c($$7, $$2);
            int $$9 = $$3 ? $$6 : ($$5 ? 1 : 0);
            $$8.b($$9);
         }
      }, e);
   }

   private static ds a(ds $$0, adn $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4, $$5) -> {
         int $$6 = $$3 ? $$5 : ($$4 ? 1 : 0);
         if ($$2) {
            $$1.a($$6);
         } else {
            $$1.b($$6);
         }
      }, e);
   }

   private static ds a(ds $$0, agx $$1, eh.g $$2, IntFunction<rk> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5, $$6) -> {
         try {
            qr $$7 = $$1.a();
            int $$8 = $$4 ? $$6 : ($$5 ? 1 : 0);
            $$2.a($$7, $$3.apply($$8));
            $$1.a($$7);
         } catch (CommandSyntaxException var9) {
         }
      }, e);
   }

   private static boolean a(aif $$0, gu $$1) {
      clt $$2 = new clt($$1);
      dei $$3 = $$0.k().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == ahy.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ds, ?> a(CommandNode<ds> $$0, LiteralArgumentBuilder<ds> $$1, boolean $$2, dm $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              dt.a("block")
                                 .then(
                                    dt.a("pos", fi.a())
                                       .then(
                                          a(
                                             $$0,
                                             dt.a("block", fe.a($$3)),
                                             $$2,
                                             $$0x -> fe.a($$0x, "block").test(new dcf(((ds)$$0x.getSource()).e(), fi.a($$0x, "pos"), true))
                                          )
                                       )
                                 )
                           ))
                           .then(
                              dt.a("biome")
                                 .then(
                                    dt.a("pos", fi.a())
                                       .then(
                                          a(
                                             $$0,
                                             dt.a("biome", er.a($$3, jc.ap)),
                                             $$2,
                                             $$0x -> er.a($$0x, "biome", jc.ap).test(((ds)$$0x.getSource()).e().s(fi.a($$0x, "pos")))
                                          )
                                       )
                                 )
                           ))
                        .then(dt.a("loaded").then(a($$0, dt.a("pos", fi.a()), $$2, $$0x -> a(((ds)$$0x.getSource()).e(), fi.b($$0x, "pos"))))))
                     .then(dt.a("dimension").then(a($$0, dt.a("dimension", ea.a()), $$2, $$0x -> ea.a($$0x, "dimension") == ((ds)$$0x.getSource()).e()))))
                  .then(
                     dt.a("score")
                        .then(
                           dt.a("target", et.a())
                              .suggests(et.a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                                      "targetObjective", ej.a()
                                                   )
                                                   .then(
                                                      dt.a("=")
                                                         .then(
                                                            dt.a("source", et.a())
                                                               .suggests(et.a)
                                                               .then(a($$0, dt.a("sourceObjective", ej.a()), $$2, $$0x -> a($$0x, Integer::equals)))
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("<")
                                                      .then(
                                                         dt.a("source", et.a())
                                                            .suggests(et.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  dt.a("sourceObjective", ej.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                dt.a("<=")
                                                   .then(
                                                      dt.a("source", et.a())
                                                         .suggests(et.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               dt.a("sourceObjective", ej.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             dt.a(">")
                                                .then(
                                                   dt.a("source", et.a())
                                                      .suggests(et.a)
                                                      .then(
                                                         a(
                                                            $$0,
                                                            dt.a("sourceObjective", ej.a()),
                                                            $$2,
                                                            $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(
                                          dt.a(">=")
                                             .then(
                                                dt.a("source", et.a())
                                                   .suggests(et.a)
                                                   .then(
                                                      a(
                                                         $$0,
                                                         dt.a("sourceObjective", ej.a()),
                                                         $$2,
                                                         $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                      )
                                                   )
                                             )
                                       ))
                                    .then(dt.a("matches").then(a($$0, dt.a("range", en.a()), $$2, $$0x -> a($$0x, en.b.a($$0x, "range")))))
                              )
                        )
                  ))
               .then(
                  dt.a("blocks")
                     .then(
                        dt.a("start", fi.a())
                           .then(
                              dt.a("end", fi.a())
                                 .then(
                                    ((RequiredArgumentBuilder)dt.a("destination", fi.a()).then(a($$0, dt.a("all"), $$2, false)))
                                       .then(a($$0, dt.a("masked"), $$2, true))
                                 )
                           )
                     )
               ))
            .then(
               dt.a("entity")
                  .then(
                     ((RequiredArgumentBuilder)dt.a("entities", ec.b()).fork($$0, $$1x -> a($$1x, $$2, !ec.c($$1x, "entities").isEmpty())))
                        .executes(a($$2, (aen.a)($$0x -> ec.c($$0x, "entities").size())))
                  )
            ))
         .then(dt.a("predicate").then(a($$0, dt.a("predicate", eq.a()).suggests(f), $$2, $$0x -> a((ds)$$0x.getSource(), eq.c($$0x, "predicate")))));

      for (agy.c $$4 : agy.c) {
         $$1.then(
            $$4.a(
               dt.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)dt.a("path", eh.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), eh.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (aen.a)($$1xx -> a($$4.a($$1xx), eh.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static Command<ds> a(boolean $$0, aen.a $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ds)$$1x.getSource()).a(() -> sw.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw c.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ds)$$1x.getSource()).a(() -> sw.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create($$2);
         }
      };
   }

   private static int a(agx $$0, eh.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ds> $$0, BiPredicate<Integer, Integer> $$1) throws CommandSyntaxException {
      String $$2 = et.a($$0, "target");
      efd $$3 = ej.a($$0, "targetObjective");
      String $$4 = et.a($$0, "source");
      efd $$5 = ej.a($$0, "sourceObjective");
      efg $$6 = ((ds)$$0.getSource()).l().aF();
      if ($$6.b($$2, $$3) && $$6.b($$4, $$5)) {
         eff $$7 = $$6.c($$2, $$3);
         eff $$8 = $$6.c($$4, $$5);
         return $$1.test($$7.b(), $$8.b());
      } else {
         return false;
      }
   }

   private static boolean a(CommandContext<ds> $$0, cj.d $$1) throws CommandSyntaxException {
      String $$2 = et.a($$0, "target");
      efd $$3 = ej.a($$0, "targetObjective");
      efg $$4 = ((ds)$$0.getSource()).l().aF();
      return !$$4.b($$2, $$3) ? false : $$1.d($$4.c($$2, $$3).b());
   }

   private static boolean a(ds $$0, eck $$1) {
      aif $$2 = $$0.e();
      dzq $$3 = new dzq.a($$2).a(ebw.f, $$0.d()).b(ebw.a, $$0.f()).a(ebv.c);
      dzk $$4 = new dzk.a($$3).a(null);
      $$4.b(dzk.a($$1));
      return $$1.test($$4);
   }

   private static Collection<ds> a(CommandContext<ds> $$0, boolean $$1, boolean $$2) {
      return (Collection<ds>)($$2 == $$1 ? Collections.singleton((ds)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ds, ?> a(CommandNode<ds> $$0, ArgumentBuilder<ds, ?> $$1, boolean $$2, aen.b $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ds)$$2x.getSource()).a(() -> sw.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw c.create();
         }
      });
   }

   private static ArgumentBuilder<ds, ?> a(CommandNode<ds> $$0, ArgumentBuilder<ds, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<ds> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((ds)$$0.getSource()).a(() -> sw.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw c.create();
      }
   }

   private static int b(CommandContext<ds> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw d.create($$2.getAsInt());
      } else {
         ((ds)$$0.getSource()).a(() -> sw.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ds> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ds)$$0.getSource()).e(), fi.a($$0, "start"), fi.a($$0, "end"), fi.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(aif $$0, gu $$1, gu $$2, gu $$3, boolean $$4) throws CommandSyntaxException {
      drs $$5 = drs.a($$1, $$2);
      drs $$6 = drs.a($$3, $$3.a($$5.b()));
      gu $$7 = new gu($$6.g() - $$5.g(), $$6.h() - $$5.h(), $$6.i() - $$5.i());
      int $$8 = $$5.c() * $$5.d() * $$5.e();
      if ($$8 > 32768) {
         throw b.create(32768, $$8);
      } else {
         int $$9 = 0;

         for (int $$10 = $$5.i(); $$10 <= $$5.l(); $$10++) {
            for (int $$11 = $$5.h(); $$11 <= $$5.k(); $$11++) {
               for (int $$12 = $$5.g(); $$12 <= $$5.j(); $$12++) {
                  gu $$13 = new gu($$12, $$11, $$10);
                  gu $$14 = $$13.a((hz)$$7);
                  dcb $$15 = $$0.a_($$13);
                  if (!$$4 || !$$15.a(cpo.a)) {
                     if ($$15 != $$0.a_($$14)) {
                        return OptionalInt.empty();
                     }

                     czn $$16 = $$0.c_($$13);
                     czn $$17 = $$0.c_($$14);
                     if ($$16 != null) {
                        if ($$17 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$17.u() != $$16.u()) {
                           return OptionalInt.empty();
                        }

                        qr $$18 = $$16.o();
                        qr $$19 = $$17.o();
                        if (!$$18.equals($$19)) {
                           return OptionalInt.empty();
                        }
                     }

                     $$9++;
                  }
               }
            }
         }

         return OptionalInt.of($$9);
      }
   }

   private static RedirectModifier<ds> a(Function<bfj, Optional<bfj>> $$0) {
      return $$1 -> {
         ds $$2 = (ds)$$1.getSource();
         bfj $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dD()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ds> b(Function<bfj, Stream<bfj>> $$0) {
      return $$1 -> {
         ds $$2 = (ds)$$1.getSource();
         bfj $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dD()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ds> a(CommandNode<ds> $$0, LiteralArgumentBuilder<ds> $$1) {
      return (LiteralArgumentBuilder<ds>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              dt.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<bfj, Optional<bfj>>)($$0x -> $$0x instanceof bgh $$1x ? Optional.ofNullable($$1x.I_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              dt.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<bfj, Optional<bfj>>)($$0x -> $$0x instanceof bgb $$1x ? Optional.ofNullable($$1x.fP()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           dt.a("target")
                              .fork($$0, a((Function<bfj, Optional<bfj>>)($$0x -> $$0x instanceof bgw $$1x ? Optional.ofNullable($$1x.j()) : Optional.empty())))
                        ))
                     .then(
                        dt.a("attacker")
                           .fork($$0, a((Function<bfj, Optional<bfj>>)($$0x -> $$0x instanceof bfh $$1x ? Optional.ofNullable($$1x.M_()) : Optional.empty())))
                     ))
                  .then(dt.a("vehicle").fork($$0, a((Function<bfj, Optional<bfj>>)($$0x -> Optional.ofNullable($$0x.cW()))))))
               .then(dt.a("controller").fork($$0, a((Function<bfj, Optional<bfj>>)($$0x -> Optional.ofNullable($$0x.cL()))))))
            .then(
               dt.a("origin").fork($$0, a((Function<bfj, Optional<bfj>>)($$0x -> $$0x instanceof bgx $$1x ? Optional.ofNullable($$1x.v()) : Optional.empty())))
            ))
         .then(dt.a("passengers").fork($$0, b((Function<bfj, Stream<bfj>>)($$0x -> $$0x.cN().stream()))));
   }

   private static ds a(ds $$0, he.c<bfn<?>> $$1) throws CommandSyntaxException {
      bfj $$2 = agj.a($$0, $$1, $$0.d(), new qr(), true);
      return $$0.a($$2);
   }

   @FunctionalInterface
   interface a {
      int test(CommandContext<ds> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      boolean test(CommandContext<ds> var1) throws CommandSyntaxException;
   }
}
