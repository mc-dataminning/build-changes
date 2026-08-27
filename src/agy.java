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

public class agy {
   private static final int a = 32768;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> tl.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tl.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tl.b("commands.execute.conditional.fail_count", $$0));
   private static final BinaryOperator<ResultConsumer<dt>> e = ($$0, $$1) -> ($$2, $$3, $$4) -> {
         $$0.onCommandComplete($$2, $$3, $$4);
         $$1.onCommandComplete($$2, $$3, $$4);
      };
   private static final SuggestionProvider<dt> f = ($$0, $$1) -> {
      ecn $$2 = ((dt)$$0.getSource()).l().aH();
      return dw.a($$2.a(ecp.a), $$1);
   };

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      LiteralCommandNode<dt> $$2 = $$0.register((LiteralArgumentBuilder)du.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(du.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, du.a("if"), true, $$1)))
                                             .then(a($$2, du.a("unless"), false, $$1)))
                                          .then(du.a("as").then(du.a("targets", ee.b()).fork($$2, $$0x -> {
                                             List<dt> $$1x = Lists.newArrayList();

                                             for (biw $$2x : ee.c($$0x, "targets")) {
                                                $$1x.add(((dt)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(du.a("at").then(du.a("targets", ee.b()).fork($$2, $$0x -> {
                                          List<dt> $$1x = Lists.newArrayList();

                                          for (biw $$2x : ee.c($$0x, "targets")) {
                                             $$1x.add(((dt)$$0x.getSource()).a((akt)$$2x.dL()).a($$2x.dj()).a($$2x.bF()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)du.a("store").then(a($$2, du.a("result"), true))).then(a($$2, du.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("positioned")
                                             .then(du.a("pos", fr.a()).redirect($$2, $$0x -> ((dt)$$0x.getSource()).a(fr.a($$0x, "pos")).a(ed.a.a))))
                                          .then(du.a("as").then(du.a("targets", ee.b()).fork($$2, $$0x -> {
                                             List<dt> $$1x = Lists.newArrayList();

                                             for (biw $$2x : ee.c($$0x, "targets")) {
                                                $$1x.add(((dt)$$0x.getSource()).a($$2x.dj()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(du.a("over").then(du.a("heightmap", eh.a()).redirect($$2, $$0x -> {
                                          ehh $$1x = ((dt)$$0x.getSource()).d();
                                          akt $$2x = ((dt)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(hw.b($$3), hw.b($$4))) {
                                             throw fk.a.create();
                                          } else {
                                             int $$5 = $$2x.a(eh.a($$0x, "heightmap"), asb.a($$3), asb.a($$4));
                                             return ((dt)$$0x.getSource()).a(new ehh($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)du.a("rotated")
                                       .then(du.a("rot", fo.a()).redirect($$2, $$0x -> ((dt)$$0x.getSource()).a(fo.a($$0x, "rot").b((dt)$$0x.getSource())))))
                                    .then(du.a("as").then(du.a("targets", ee.b()).fork($$2, $$0x -> {
                                       List<dt> $$1x = Lists.newArrayList();

                                       for (biw $$2x : ee.c($$0x, "targets")) {
                                          $$1x.add(((dt)$$0x.getSource()).a($$2x.bF()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)du.a("facing")
                                    .then(du.a("entity").then(du.a("targets", ee.b()).then(du.a("anchor", ed.a()).fork($$2, $$0x -> {
                                       List<dt> $$1x = Lists.newArrayList();
                                       ed.a $$2x = ed.a($$0x, "anchor");

                                       for (biw $$3 : ee.c($$0x, "targets")) {
                                          $$1x.add(((dt)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(du.a("pos", fr.a()).redirect($$2, $$0x -> ((dt)$$0x.getSource()).b(fr.a($$0x, "pos"))))
                           ))
                        .then(
                           du.a("align")
                              .then(du.a("axes", fp.a()).redirect($$2, $$0x -> ((dt)$$0x.getSource()).a(((dt)$$0x.getSource()).d().a(fp.a($$0x, "axes")))))
                        ))
                     .then(du.a("anchored").then(du.a("anchor", ed.a()).redirect($$2, $$0x -> ((dt)$$0x.getSource()).a(ed.a($$0x, "anchor"))))))
                  .then(du.a("in").then(du.a("dimension", ec.a()).redirect($$2, $$0x -> ((dt)$$0x.getSource()).a(ec.a($$0x, "dimension"))))))
               .then(du.a("summon").then(du.a("entity", eq.a($$1, jc.t)).suggests(gm.d).redirect($$2, $$0x -> a((dt)$$0x.getSource(), eq.e($$0x, "entity"))))))
            .then(a($$2, du.a("on")))
      );
   }

   private static ArgumentBuilder<dt, ?> a(LiteralCommandNode<dt> $$0, LiteralArgumentBuilder<dt> $$1, boolean $$2) {
      $$1.then(
         du.a("score")
            .then(
               du.a("targets", ev.b())
                  .suggests(ev.a)
                  .then(du.a("objective", el.a()).redirect($$0, $$1x -> a((dt)$$1x.getSource(), ev.c($$1x, "targets"), el.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         du.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)du.a("id", es.a())
                     .suggests(agi.a)
                     .then(du.a("value").redirect($$0, $$1x -> a((dt)$$1x.getSource(), agi.a($$1x), true, $$2))))
                  .then(du.a("max").redirect($$0, $$1x -> a((dt)$$1x.getSource(), agi.a($$1x), false, $$2)))
            )
      );

      for (ajk.c $$3 : ajk.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a(
                                       "path", ej.a()
                                    )
                                    .then(
                                       du.a("int")
                                          .then(
                                             du.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (dt)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         ej.a($$2xx, "path"),
                                                         $$1xxx -> rb.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    du.a("float")
                                       .then(
                                          du.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (dt)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      ej.a($$2xx, "path"),
                                                      $$1xxx -> qz.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 du.a("short")
                                    .then(
                                       du.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (dt)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   ej.a($$2xx, "path"),
                                                   $$1xxx -> rl.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              du.a("long")
                                 .then(
                                    du.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (dt)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                ej.a($$2xx, "path"),
                                                $$1xxx -> re.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           du.a("double")
                              .then(
                                 du.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (dt)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             ej.a($$2xx, "path"),
                                             $$1xxx -> qx.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        du.a("byte")
                           .then(
                              du.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (dt)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          ej.a($$2xx, "path"),
                                          $$1xxx -> qu.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static dt a(dt $$0, Collection<String> $$1, eid $$2, boolean $$3) {
      eig $$4 = $$0.l().aF();
      return $$0.a(($$4x, $$5, $$6) -> {
         for (String $$7 : $$1) {
            eif $$8 = $$4.c($$7, $$2);
            int $$9 = $$3 ? $$6 : ($$5 ? 1 : 0);
            $$8.b($$9);
         }
      }, e);
   }

   private static dt a(dt $$0, afx $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4, $$5) -> {
         int $$6 = $$3 ? $$5 : ($$4 ? 1 : 0);
         if ($$2) {
            $$1.a($$6);
         } else {
            $$1.b($$6);
         }
      }, e);
   }

   private static dt a(dt $$0, ajj $$1, ej.g $$2, IntFunction<rq> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5, $$6) -> {
         try {
            qw $$7 = $$1.a();
            int $$8 = $$4 ? $$6 : ($$5 ? 1 : 0);
            $$2.a($$7, $$3.apply($$8));
            $$1.a($$7);
         } catch (CommandSyntaxException var9) {
         }
      }, e);
   }

   private static boolean a(akt $$0, gw $$1) {
      cpi $$2 = new cpi($$1);
      dhk $$3 = $$0.k().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == akm.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<dt, ?> a(CommandNode<dt> $$0, LiteralArgumentBuilder<dt> $$1, boolean $$2, dn $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              du.a("block")
                                 .then(
                                    du.a("pos", fk.a())
                                       .then(
                                          a(
                                             $$0,
                                             du.a("block", fg.a($$3)),
                                             $$2,
                                             $$0x -> fg.a($$0x, "block").test(new dfh(((dt)$$0x.getSource()).e(), fk.a($$0x, "pos"), true))
                                          )
                                       )
                                 )
                           ))
                           .then(
                              du.a("biome")
                                 .then(
                                    du.a("pos", fk.a())
                                       .then(
                                          a(
                                             $$0,
                                             du.a("biome", et.a($$3, jc.aq)),
                                             $$2,
                                             $$0x -> et.a($$0x, "biome", jc.aq).test(((dt)$$0x.getSource()).e().s(fk.a($$0x, "pos")))
                                          )
                                       )
                                 )
                           ))
                        .then(du.a("loaded").then(a($$0, du.a("pos", fk.a()), $$2, $$0x -> a(((dt)$$0x.getSource()).e(), fk.b($$0x, "pos"))))))
                     .then(du.a("dimension").then(a($$0, du.a("dimension", ec.a()), $$2, $$0x -> ec.a($$0x, "dimension") == ((dt)$$0x.getSource()).e()))))
                  .then(
                     du.a("score")
                        .then(
                           du.a("target", ev.a())
                              .suggests(ev.a)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a(
                                                      "targetObjective", el.a()
                                                   )
                                                   .then(
                                                      du.a("=")
                                                         .then(
                                                            du.a("source", ev.a())
                                                               .suggests(ev.a)
                                                               .then(a($$0, du.a("sourceObjective", el.a()), $$2, $$0x -> a($$0x, Integer::equals)))
                                                         )
                                                   ))
                                                .then(
                                                   du.a("<")
                                                      .then(
                                                         du.a("source", ev.a())
                                                            .suggests(ev.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  du.a("sourceObjective", el.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                du.a("<=")
                                                   .then(
                                                      du.a("source", ev.a())
                                                         .suggests(ev.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               du.a("sourceObjective", el.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             du.a(">")
                                                .then(
                                                   du.a("source", ev.a())
                                                      .suggests(ev.a)
                                                      .then(
                                                         a(
                                                            $$0,
                                                            du.a("sourceObjective", el.a()),
                                                            $$2,
                                                            $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(
                                          du.a(">=")
                                             .then(
                                                du.a("source", ev.a())
                                                   .suggests(ev.a)
                                                   .then(
                                                      a(
                                                         $$0,
                                                         du.a("sourceObjective", el.a()),
                                                         $$2,
                                                         $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                      )
                                                   )
                                             )
                                       ))
                                    .then(du.a("matches").then(a($$0, du.a("range", ep.a()), $$2, $$0x -> a($$0x, ep.b.a($$0x, "range")))))
                              )
                        )
                  ))
               .then(
                  du.a("blocks")
                     .then(
                        du.a("start", fk.a())
                           .then(
                              du.a("end", fk.a())
                                 .then(
                                    ((RequiredArgumentBuilder)du.a("destination", fk.a()).then(a($$0, du.a("all"), $$2, false)))
                                       .then(a($$0, du.a("masked"), $$2, true))
                                 )
                           )
                     )
               ))
            .then(
               du.a("entity")
                  .then(
                     ((RequiredArgumentBuilder)du.a("entities", ee.b()).fork($$0, $$1x -> a($$1x, $$2, !ee.c($$1x, "entities").isEmpty())))
                        .executes(a($$2, (agy.a)($$0x -> ee.c($$0x, "entities").size())))
                  )
            ))
         .then(du.a("predicate").then(a($$0, du.a("predicate", es.a()).suggests(f), $$2, $$0x -> a((dt)$$0x.getSource(), es.c($$0x, "predicate")))));

      for (ajk.c $$4 : ajk.c) {
         $$1.then(
            $$4.a(
               du.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)du.a("path", ej.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), ej.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (agy.a)($$1xx -> a($$4.a($$1xx), ej.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static Command<dt> a(boolean $$0, agy.a $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((dt)$$1x.getSource()).a(() -> tl.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw c.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((dt)$$1x.getSource()).a(() -> tl.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create($$2);
         }
      };
   }

   private static int a(ajj $$0, ej.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<dt> $$0, BiPredicate<Integer, Integer> $$1) throws CommandSyntaxException {
      String $$2 = ev.a($$0, "target");
      eid $$3 = el.a($$0, "targetObjective");
      String $$4 = ev.a($$0, "source");
      eid $$5 = el.a($$0, "sourceObjective");
      eig $$6 = ((dt)$$0.getSource()).l().aF();
      if ($$6.b($$2, $$3) && $$6.b($$4, $$5)) {
         eif $$7 = $$6.c($$2, $$3);
         eif $$8 = $$6.c($$4, $$5);
         return $$1.test($$7.b(), $$8.b());
      } else {
         return false;
      }
   }

   private static boolean a(CommandContext<dt> $$0, cl.d $$1) throws CommandSyntaxException {
      String $$2 = ev.a($$0, "target");
      eid $$3 = el.a($$0, "targetObjective");
      eig $$4 = ((dt)$$0.getSource()).l().aF();
      return !$$4.b($$2, $$3) ? false : $$1.d($$4.c($$2, $$3).b());
   }

   private static boolean a(dt $$0, efj $$1) {
      akt $$2 = $$0.e();
      ecq $$3 = new ecq.a($$2).a(eev.f, $$0.d()).b(eev.a, $$0.f()).a(eeu.d);
      eck $$4 = new eck.a($$3).a(Optional.empty());
      $$4.b(eck.a($$1));
      return $$1.test($$4);
   }

   private static Collection<dt> a(CommandContext<dt> $$0, boolean $$1, boolean $$2) {
      return (Collection<dt>)($$2 == $$1 ? Collections.singleton((dt)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<dt, ?> a(CommandNode<dt> $$0, ArgumentBuilder<dt, ?> $$1, boolean $$2, agy.b $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((dt)$$2x.getSource()).a(() -> tl.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw c.create();
         }
      });
   }

   private static ArgumentBuilder<dt, ?> a(CommandNode<dt> $$0, ArgumentBuilder<dt, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<dt> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((dt)$$0.getSource()).a(() -> tl.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw c.create();
      }
   }

   private static int b(CommandContext<dt> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw d.create($$2.getAsInt());
      } else {
         ((dt)$$0.getSource()).a(() -> tl.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<dt> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((dt)$$0.getSource()).e(), fk.a($$0, "start"), fk.a($$0, "end"), fk.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(akt $$0, gw $$1, gw $$2, gw $$3, boolean $$4) throws CommandSyntaxException {
      duu $$5 = duu.a($$1, $$2);
      duu $$6 = duu.a($$3, $$3.a($$5.b()));
      gw $$7 = new gw($$6.g() - $$5.g(), $$6.h() - $$5.h(), $$6.i() - $$5.i());
      int $$8 = $$5.c() * $$5.d() * $$5.e();
      if ($$8 > 32768) {
         throw b.create(32768, $$8);
      } else {
         int $$9 = 0;

         for (int $$10 = $$5.i(); $$10 <= $$5.l(); $$10++) {
            for (int $$11 = $$5.h(); $$11 <= $$5.k(); $$11++) {
               for (int $$12 = $$5.g(); $$12 <= $$5.j(); $$12++) {
                  gw $$13 = new gw($$12, $$11, $$10);
                  gw $$14 = $$13.a((hy)$$7);
                  dfd $$15 = $$0.a_($$13);
                  if (!$$4 || !$$15.a(cte.a)) {
                     if ($$15 != $$0.a_($$14)) {
                        return OptionalInt.empty();
                     }

                     dcz $$16 = $$0.c_($$13);
                     dcz $$17 = $$0.c_($$14);
                     if ($$16 != null) {
                        if ($$17 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$17.u() != $$16.u()) {
                           return OptionalInt.empty();
                        }

                        qw $$18 = $$16.o();
                        qw $$19 = $$17.o();
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

   private static RedirectModifier<dt> a(Function<biw, Optional<biw>> $$0) {
      return $$1 -> {
         dt $$2 = (dt)$$1.getSource();
         biw $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dG()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<dt> b(Function<biw, Stream<biw>> $$0) {
      return $$1 -> {
         dt $$2 = (dt)$$1.getSource();
         biw $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dG()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<dt> a(CommandNode<dt> $$0, LiteralArgumentBuilder<dt> $$1) {
      return (LiteralArgumentBuilder<dt>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              du.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<biw, Optional<biw>>)($$0x -> $$0x instanceof bju $$1x ? Optional.ofNullable($$1x.O_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              du.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<biw, Optional<biw>>)($$0x -> $$0x instanceof bjo $$1x ? Optional.ofNullable($$1x.fT()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           du.a("target")
                              .fork($$0, a((Function<biw, Optional<biw>>)($$0x -> $$0x instanceof bki $$1x ? Optional.ofNullable($$1x.q()) : Optional.empty())))
                        ))
                     .then(
                        du.a("attacker")
                           .fork($$0, a((Function<biw, Optional<biw>>)($$0x -> $$0x instanceof biu $$1x ? Optional.ofNullable($$1x.S_()) : Optional.empty())))
                     ))
                  .then(du.a("vehicle").fork($$0, a((Function<biw, Optional<biw>>)($$0x -> Optional.ofNullable($$0x.cY()))))))
               .then(du.a("controller").fork($$0, a((Function<biw, Optional<biw>>)($$0x -> Optional.ofNullable($$0x.cN()))))))
            .then(
               du.a("origin").fork($$0, a((Function<biw, Optional<biw>>)($$0x -> $$0x instanceof bkj $$1x ? Optional.ofNullable($$1x.v()) : Optional.empty())))
            ))
         .then(du.a("passengers").fork($$0, b((Function<biw, Stream<biw>>)($$0x -> $$0x.cP().stream()))));
   }

   private static dt a(dt $$0, he.c<bja<?>> $$1) throws CommandSyntaxException {
      biw $$2 = aiv.a($$0, $$1, $$0.d(), new qw(), true);
      return $$0.a($$2);
   }

   @FunctionalInterface
   interface a {
      int test(CommandContext<dt> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      boolean test(CommandContext<dt> var1) throws CommandSyntaxException;
   }
}
