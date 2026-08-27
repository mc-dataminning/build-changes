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

public class agq {
   private static final int a = 32768;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> tf.a("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tf.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> tf.a("commands.execute.conditional.fail_count", $$0));
   private static final BinaryOperator<ResultConsumer<dr>> e = ($$0, $$1) -> ($$2, $$3, $$4) -> {
         $$0.onCommandComplete($$2, $$3, $$4);
         $$1.onCommandComplete($$2, $$3, $$4);
      };
   private static final SuggestionProvider<dr> f = ($$0, $$1) -> {
      ecj $$2 = ((dr)$$0.getSource()).l().aH();
      return du.a($$2.a(ecl.a), $$1);
   };

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      LiteralCommandNode<dr> $$2 = $$0.register((LiteralArgumentBuilder)ds.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(ds.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, ds.a("if"), true, $$1)))
                                             .then(a($$2, ds.a("unless"), false, $$1)))
                                          .then(ds.a("as").then(ds.a("targets", ec.b()).fork($$2, $$0x -> {
                                             List<dr> $$1x = Lists.newArrayList();

                                             for (bii $$2x : ec.c($$0x, "targets")) {
                                                $$1x.add(((dr)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ds.a("at").then(ds.a("targets", ec.b()).fork($$2, $$0x -> {
                                          List<dr> $$1x = Lists.newArrayList();

                                          for (bii $$2x : ec.c($$0x, "targets")) {
                                             $$1x.add(((dr)$$0x.getSource()).a((akk)$$2x.dK()).a($$2x.di()).a($$2x.bF()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)ds.a("store").then(a($$2, ds.a("result"), true))).then(a($$2, ds.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("positioned")
                                             .then(ds.a("pos", fp.a()).redirect($$2, $$0x -> ((dr)$$0x.getSource()).a(fp.a($$0x, "pos")).a(eb.a.a))))
                                          .then(ds.a("as").then(ds.a("targets", ec.b()).fork($$2, $$0x -> {
                                             List<dr> $$1x = Lists.newArrayList();

                                             for (bii $$2x : ec.c($$0x, "targets")) {
                                                $$1x.add(((dr)$$0x.getSource()).a($$2x.di()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(ds.a("over").then(ds.a("heightmap", ef.a()).redirect($$2, $$0x -> {
                                          ehd $$1x = ((dr)$$0x.getSource()).d();
                                          akk $$2x = ((dr)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(hx.b($$3), hx.b($$4))) {
                                             throw fi.a.create();
                                          } else {
                                             int $$5 = $$2x.a(ef.a($$0x, "heightmap"), arp.a($$3), arp.a($$4));
                                             return ((dr)$$0x.getSource()).a(new ehd($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)ds.a("rotated")
                                       .then(ds.a("rot", fm.a()).redirect($$2, $$0x -> ((dr)$$0x.getSource()).a(fm.a($$0x, "rot").b((dr)$$0x.getSource())))))
                                    .then(ds.a("as").then(ds.a("targets", ec.b()).fork($$2, $$0x -> {
                                       List<dr> $$1x = Lists.newArrayList();

                                       for (bii $$2x : ec.c($$0x, "targets")) {
                                          $$1x.add(((dr)$$0x.getSource()).a($$2x.bF()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ds.a("facing")
                                    .then(ds.a("entity").then(ds.a("targets", ec.b()).then(ds.a("anchor", eb.a()).fork($$2, $$0x -> {
                                       List<dr> $$1x = Lists.newArrayList();
                                       eb.a $$2x = eb.a($$0x, "anchor");

                                       for (bii $$3 : ec.c($$0x, "targets")) {
                                          $$1x.add(((dr)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(ds.a("pos", fp.a()).redirect($$2, $$0x -> ((dr)$$0x.getSource()).b(fp.a($$0x, "pos"))))
                           ))
                        .then(
                           ds.a("align")
                              .then(ds.a("axes", fn.a()).redirect($$2, $$0x -> ((dr)$$0x.getSource()).a(((dr)$$0x.getSource()).d().a(fn.a($$0x, "axes")))))
                        ))
                     .then(ds.a("anchored").then(ds.a("anchor", eb.a()).redirect($$2, $$0x -> ((dr)$$0x.getSource()).a(eb.a($$0x, "anchor"))))))
                  .then(ds.a("in").then(ds.a("dimension", ea.a()).redirect($$2, $$0x -> ((dr)$$0x.getSource()).a(ea.a($$0x, "dimension"))))))
               .then(ds.a("summon").then(ds.a("entity", eo.a($$1, jc.s)).suggests(gk.d).redirect($$2, $$0x -> a((dr)$$0x.getSource(), eo.e($$0x, "entity"))))))
            .then(a($$2, ds.a("on")))
      );
   }

   private static ArgumentBuilder<dr, ?> a(LiteralCommandNode<dr> $$0, LiteralArgumentBuilder<dr> $$1, boolean $$2) {
      $$1.then(
         ds.a("score")
            .then(
               ds.a("targets", et.b())
                  .suggests(et.a)
                  .then(ds.a("objective", ej.a()).redirect($$0, $$1x -> a((dr)$$1x.getSource(), et.c($$1x, "targets"), ej.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         ds.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)ds.a("id", eq.a())
                     .suggests(aga.a)
                     .then(ds.a("value").redirect($$0, $$1x -> a((dr)$$1x.getSource(), aga.a($$1x), true, $$2))))
                  .then(ds.a("max").redirect($$0, $$1x -> a((dr)$$1x.getSource(), aga.a($$1x), false, $$2)))
            )
      );

      for (ajc.c $$3 : ajc.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a(
                                       "path", eh.a()
                                    )
                                    .then(
                                       ds.a("int")
                                          .then(
                                             ds.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (dr)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         eh.a($$2xx, "path"),
                                                         $$1xxx -> qw.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ds.a("float")
                                       .then(
                                          ds.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (dr)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      eh.a($$2xx, "path"),
                                                      $$1xxx -> qu.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ds.a("short")
                                    .then(
                                       ds.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (dr)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   eh.a($$2xx, "path"),
                                                   $$1xxx -> rf.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ds.a("long")
                                 .then(
                                    ds.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (dr)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                eh.a($$2xx, "path"),
                                                $$1xxx -> qz.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ds.a("double")
                              .then(
                                 ds.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (dr)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             eh.a($$2xx, "path"),
                                             $$1xxx -> qs.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        ds.a("byte")
                           .then(
                              ds.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (dr)$$2xx.getSource(),
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

   private static dr a(dr $$0, Collection<String> $$1, ehz $$2, boolean $$3) {
      eic $$4 = $$0.l().aF();
      return $$0.a(($$4x, $$5, $$6) -> {
         for (String $$7 : $$1) {
            eib $$8 = $$4.c($$7, $$2);
            int $$9 = $$3 ? $$6 : ($$5 ? 1 : 0);
            $$8.b($$9);
         }
      }, e);
   }

   private static dr a(dr $$0, afp $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4, $$5) -> {
         int $$6 = $$3 ? $$5 : ($$4 ? 1 : 0);
         if ($$2) {
            $$1.a($$6);
         } else {
            $$1.b($$6);
         }
      }, e);
   }

   private static dr a(dr $$0, ajb $$1, eh.g $$2, IntFunction<rk> $$3, boolean $$4) {
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

   private static boolean a(akk $$0, gu $$1) {
      cos $$2 = new cos($$1);
      dhg $$3 = $$0.k().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == akd.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<dr, ?> a(CommandNode<dr> $$0, LiteralArgumentBuilder<dr> $$1, boolean $$2, dl $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                 ds.a("block")
                                    .then(
                                       ds.a("pos", fi.a())
                                          .then(
                                             a(
                                                $$0,
                                                ds.a("block", fe.a($$3)),
                                                $$2,
                                                $$0x -> fe.a($$0x, "block").test(new dfd(((dr)$$0x.getSource()).e(), fi.a($$0x, "pos"), true))
                                             )
                                          )
                                    )
                              ))
                              .then(
                                 ds.a("biome")
                                    .then(
                                       ds.a("pos", fi.a())
                                          .then(
                                             a(
                                                $$0,
                                                ds.a("biome", er.a($$3, jc.ap)),
                                                $$2,
                                                $$0x -> er.a($$0x, "biome", jc.ap).test(((dr)$$0x.getSource()).e().s(fi.a($$0x, "pos")))
                                             )
                                          )
                                    )
                              ))
                           .then(ds.a("loaded").then(a($$0, ds.a("pos", fi.a()), $$2, $$0x -> a(((dr)$$0x.getSource()).e(), fi.b($$0x, "pos"))))))
                        .then(ds.a("dimension").then(a($$0, ds.a("dimension", ea.a()), $$2, $$0x -> ea.a($$0x, "dimension") == ((dr)$$0x.getSource()).e()))))
                     .then(
                        ds.a("score")
                           .then(
                              ds.a("target", et.a())
                                 .suggests(et.a)
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a(
                                                         "targetObjective", ej.a()
                                                      )
                                                      .then(
                                                         ds.a("=")
                                                            .then(
                                                               ds.a("source", et.a())
                                                                  .suggests(et.a)
                                                                  .then(a($$0, ds.a("sourceObjective", ej.a()), $$2, $$0x -> a($$0x, Integer::equals)))
                                                            )
                                                      ))
                                                   .then(
                                                      ds.a("<")
                                                         .then(
                                                            ds.a("source", et.a())
                                                               .suggests(et.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     ds.a("sourceObjective", ej.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   ds.a("<=")
                                                      .then(
                                                         ds.a("source", et.a())
                                                            .suggests(et.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  ds.a("sourceObjective", ej.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                ds.a(">")
                                                   .then(
                                                      ds.a("source", et.a())
                                                         .suggests(et.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               ds.a("sourceObjective", ej.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ds.a(">=")
                                                .then(
                                                   ds.a("source", et.a())
                                                      .suggests(et.a)
                                                      .then(
                                                         a(
                                                            $$0,
                                                            ds.a("sourceObjective", ej.a()),
                                                            $$2,
                                                            $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(ds.a("matches").then(a($$0, ds.a("range", en.a()), $$2, $$0x -> a($$0x, en.b.a($$0x, "range")))))
                                 )
                           )
                     ))
                  .then(
                     ds.a("blocks")
                        .then(
                           ds.a("start", fi.a())
                              .then(
                                 ds.a("end", fi.a())
                                    .then(
                                       ((RequiredArgumentBuilder)ds.a("destination", fi.a()).then(a($$0, ds.a("all"), $$2, false)))
                                          .then(a($$0, ds.a("masked"), $$2, true))
                                    )
                              )
                        )
                  ))
               .then(
                  ds.a("entity")
                     .then(
                        ((RequiredArgumentBuilder)ds.a("entities", ec.b()).fork($$0, $$1x -> a($$1x, $$2, !ec.c($$1x, "entities").isEmpty())))
                           .executes(a($$2, (agq.a)($$0x -> ec.c($$0x, "entities").size())))
                     )
               ))
            .then(ds.a("predicate").then(a($$0, ds.a("predicate", eq.a()).suggests(f), $$2, $$0x -> a((dr)$$0x.getSource(), eq.c($$0x, "predicate"))))))
         .then(ds.a("function").then(a($$0, ds.a("function", ft.a()).suggests(agv.a), $$2, $$0x -> a((dr)$$0x.getSource(), ft.a($$0x, "function")))));

      for (ajc.c $$4 : ajc.c) {
         $$1.then(
            $$4.a(
               ds.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)ds.a("path", eh.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), eh.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (agq.a)($$1xx -> a($$4.a($$1xx), eh.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static Command<dr> a(boolean $$0, agq.a $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((dr)$$1x.getSource()).a(() -> tf.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw c.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((dr)$$1x.getSource()).a(() -> tf.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create($$2);
         }
      };
   }

   private static int a(ajb $$0, eh.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<dr> $$0, BiPredicate<Integer, Integer> $$1) throws CommandSyntaxException {
      String $$2 = et.a($$0, "target");
      ehz $$3 = ej.a($$0, "targetObjective");
      String $$4 = et.a($$0, "source");
      ehz $$5 = ej.a($$0, "sourceObjective");
      eic $$6 = ((dr)$$0.getSource()).l().aF();
      if ($$6.b($$2, $$3) && $$6.b($$4, $$5)) {
         eib $$7 = $$6.c($$2, $$3);
         eib $$8 = $$6.c($$4, $$5);
         return $$1.test($$7.b(), $$8.b());
      } else {
         return false;
      }
   }

   private static boolean a(CommandContext<dr> $$0, cj.d $$1) throws CommandSyntaxException {
      String $$2 = et.a($$0, "target");
      ehz $$3 = ej.a($$0, "targetObjective");
      eic $$4 = ((dr)$$0.getSource()).l().aF();
      return !$$4.b($$2, $$3) ? false : $$1.d($$4.c($$2, $$3).b());
   }

   private static boolean a(dr $$0, Collection<dm> $$1) {
      boolean $$2 = false;

      for (dm $$3 : $$1) {
         try {
            agv.a $$4 = agv.a($$0, $$3, null);
            if ($$4.b() && $$4.a() != 0) {
               $$2 = true;
            }
         } catch (dt var6) {
         }
      }

      return $$2;
   }

   private static boolean a(dr $$0, eff $$1) {
      akk $$2 = $$0.e();
      ecm $$3 = new ecm.a($$2).a(eer.f, $$0.d()).b(eer.a, $$0.f()).a(eeq.d);
      ecg $$4 = new ecg.a($$3).a(Optional.empty());
      $$4.b(ecg.a($$1));
      return $$1.test($$4);
   }

   private static Collection<dr> a(CommandContext<dr> $$0, boolean $$1, boolean $$2) {
      return (Collection<dr>)($$2 == $$1 ? Collections.singleton((dr)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<dr, ?> a(CommandNode<dr> $$0, ArgumentBuilder<dr, ?> $$1, boolean $$2, agq.b $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((dr)$$2x.getSource()).a(() -> tf.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw c.create();
         }
      });
   }

   private static ArgumentBuilder<dr, ?> a(CommandNode<dr> $$0, ArgumentBuilder<dr, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<dr> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((dr)$$0.getSource()).a(() -> tf.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw c.create();
      }
   }

   private static int b(CommandContext<dr> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw d.create($$2.getAsInt());
      } else {
         ((dr)$$0.getSource()).a(() -> tf.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<dr> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((dr)$$0.getSource()).e(), fi.a($$0, "start"), fi.a($$0, "end"), fi.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(akk $$0, gu $$1, gu $$2, gu $$3, boolean $$4) throws CommandSyntaxException {
      duq $$5 = duq.a($$1, $$2);
      duq $$6 = duq.a($$3, $$3.a($$5.b()));
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
                  dez $$15 = $$0.a_($$13);
                  if (!$$4 || !$$15.a(csm.a)) {
                     if ($$15 != $$0.a_($$14)) {
                        return OptionalInt.empty();
                     }

                     dcl $$16 = $$0.c_($$13);
                     dcl $$17 = $$0.c_($$14);
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

   private static RedirectModifier<dr> a(Function<bii, Optional<bii>> $$0) {
      return $$1 -> {
         dr $$2 = (dr)$$1.getSource();
         bii $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dF()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<dr> b(Function<bii, Stream<bii>> $$0) {
      return $$1 -> {
         dr $$2 = (dr)$$1.getSource();
         bii $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dF()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<dr> a(CommandNode<dr> $$0, LiteralArgumentBuilder<dr> $$1) {
      return (LiteralArgumentBuilder<dr>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              ds.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<bii, Optional<bii>>)($$0x -> $$0x instanceof bjg $$1x ? Optional.ofNullable($$1x.I_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              ds.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<bii, Optional<bii>>)($$0x -> $$0x instanceof bja $$1x ? Optional.ofNullable($$1x.fP()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           ds.a("target")
                              .fork($$0, a((Function<bii, Optional<bii>>)($$0x -> $$0x instanceof bju $$1x ? Optional.ofNullable($$1x.j()) : Optional.empty())))
                        ))
                     .then(
                        ds.a("attacker")
                           .fork($$0, a((Function<bii, Optional<bii>>)($$0x -> $$0x instanceof big $$1x ? Optional.ofNullable($$1x.M_()) : Optional.empty())))
                     ))
                  .then(ds.a("vehicle").fork($$0, a((Function<bii, Optional<bii>>)($$0x -> Optional.ofNullable($$0x.cY()))))))
               .then(ds.a("controller").fork($$0, a((Function<bii, Optional<bii>>)($$0x -> Optional.ofNullable($$0x.cN()))))))
            .then(
               ds.a("origin").fork($$0, a((Function<bii, Optional<bii>>)($$0x -> $$0x instanceof bjv $$1x ? Optional.ofNullable($$1x.v()) : Optional.empty())))
            ))
         .then(ds.a("passengers").fork($$0, b((Function<bii, Stream<bii>>)($$0x -> $$0x.cP().stream()))));
   }

   private static dr a(dr $$0, he.c<bim<?>> $$1) throws CommandSyntaxException {
      bii $$2 = ain.a($$0, $$1, $$0.d(), new qr(), true);
      return $$0.a($$2);
   }

   @FunctionalInterface
   interface a {
      int test(CommandContext<dr> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      boolean test(CommandContext<dr> var1) throws CommandSyntaxException;
   }
}
