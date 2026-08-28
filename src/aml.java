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

public class aml {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wu.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wu.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<eq> f = ($$0, $$1) -> {
      aku.b $$2 = ((eq)$$0.getSource()).l().be();
      return ev.a($$2.a(lr.bd), $$1);
   };

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      LiteralCommandNode<eq> $$2 = $$0.register((LiteralArgumentBuilder)er.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(er.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, er.a("if"), true, $$1)))
                                             .then(a($$2, er.a("unless"), false, $$1)))
                                          .then(er.a("as").then(er.a("targets", fd.b()).fork($$2, $$0x -> {
                                             List<eq> $$1x = Lists.newArrayList();

                                             for (bsd $$2x : fd.c($$0x, "targets")) {
                                                $$1x.add(((eq)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(er.a("at").then(er.a("targets", fd.b()).fork($$2, $$0x -> {
                                          List<eq> $$1x = Lists.newArrayList();

                                          for (bsd $$2x : fd.c($$0x, "targets")) {
                                             $$1x.add(((eq)$$0x.getSource()).a((aqk)$$2x.dP()).a($$2x.dn()).a($$2x.bM()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)er.a("store").then(a($$2, er.a("result"), true))).then(a($$2, er.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("positioned")
                                             .then(er.a("pos", gt.a()).redirect($$2, $$0x -> ((eq)$$0x.getSource()).a(gt.a($$0x, "pos")).a(fc.a.a))))
                                          .then(er.a("as").then(er.a("targets", fd.b()).fork($$2, $$0x -> {
                                             List<eq> $$1x = Lists.newArrayList();

                                             for (bsd $$2x : fd.c($$0x, "targets")) {
                                                $$1x.add(((eq)$$0x.getSource()).a($$2x.dn()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(er.a("over").then(er.a("heightmap", fg.a()).redirect($$2, $$0x -> {
                                          evz $$1x = ((eq)$$0x.getSource()).d();
                                          aqk $$2x = ((eq)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(kc.b($$3), kc.b($$4))) {
                                             throw gm.a.create();
                                          } else {
                                             int $$5 = $$2x.a(fg.a($$0x, "heightmap"), aye.a($$3), aye.a($$4));
                                             return ((eq)$$0x.getSource()).a(new evz($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)er.a("rotated")
                                       .then(er.a("rot", gq.a()).redirect($$2, $$0x -> ((eq)$$0x.getSource()).a(gq.a($$0x, "rot").b((eq)$$0x.getSource())))))
                                    .then(er.a("as").then(er.a("targets", fd.b()).fork($$2, $$0x -> {
                                       List<eq> $$1x = Lists.newArrayList();

                                       for (bsd $$2x : fd.c($$0x, "targets")) {
                                          $$1x.add(((eq)$$0x.getSource()).a($$2x.bM()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)er.a("facing")
                                    .then(er.a("entity").then(er.a("targets", fd.b()).then(er.a("anchor", fc.a()).fork($$2, $$0x -> {
                                       List<eq> $$1x = Lists.newArrayList();
                                       fc.a $$2x = fc.a($$0x, "anchor");

                                       for (bsd $$3 : fd.c($$0x, "targets")) {
                                          $$1x.add(((eq)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(er.a("pos", gt.a()).redirect($$2, $$0x -> ((eq)$$0x.getSource()).b(gt.a($$0x, "pos"))))
                           ))
                        .then(
                           er.a("align")
                              .then(er.a("axes", gr.a()).redirect($$2, $$0x -> ((eq)$$0x.getSource()).a(((eq)$$0x.getSource()).d().a(gr.a($$0x, "axes")))))
                        ))
                     .then(er.a("anchored").then(er.a("anchor", fc.a()).redirect($$2, $$0x -> ((eq)$$0x.getSource()).a(fc.a($$0x, "anchor"))))))
                  .then(er.a("in").then(er.a("dimension", fb.a()).redirect($$2, $$0x -> ((eq)$$0x.getSource()).a(fb.a($$0x, "dimension"))))))
               .then(er.a("summon").then(er.a("entity", fp.a($$1, lr.z)).suggests(ip.d).redirect($$2, $$0x -> a((eq)$$0x.getSource(), fp.e($$0x, "entity"))))))
            .then(a($$2, er.a("on")))
      );
   }

   private static ArgumentBuilder<eq, ?> a(LiteralCommandNode<eq> $$0, LiteralArgumentBuilder<eq> $$1, boolean $$2) {
      $$1.then(
         er.a("score")
            .then(
               er.a("targets", fv.b())
                  .suggests(fv.a)
                  .then(er.a("objective", fk.a()).redirect($$0, $$1x -> a((eq)$$1x.getSource(), fv.c($$1x, "targets"), fk.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         er.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)er.a("id", fr.a())
                     .suggests(alv.a)
                     .then(er.a("value").redirect($$0, $$1x -> a((eq)$$1x.getSource(), alv.a($$1x), true, $$2))))
                  .then(er.a("max").redirect($$0, $$1x -> a((eq)$$1x.getSource(), alv.a($$1x), false, $$2)))
            )
      );

      for (apa.c $$3 : apa.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a(
                                       "path", fi.a()
                                    )
                                    .then(
                                       er.a("int")
                                          .then(
                                             er.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (eq)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         fi.a($$2xx, "path"),
                                                         $$1xxx -> uc.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    er.a("float")
                                       .then(
                                          er.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (eq)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      fi.a($$2xx, "path"),
                                                      $$1xxx -> ua.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 er.a("short")
                                    .then(
                                       er.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (eq)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   fi.a($$2xx, "path"),
                                                   $$1xxx -> up.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              er.a("long")
                                 .then(
                                    er.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (eq)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                fi.a($$2xx, "path"),
                                                $$1xxx -> uf.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           er.a("double")
                              .then(
                                 er.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (eq)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             fi.a($$2xx, "path"),
                                             $$1xxx -> ty.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        er.a("byte")
                           .then(
                              er.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (eq)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          fi.a($$2xx, "path"),
                                          $$1xxx -> tv.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static eq a(eq $$0, Collection<exc> $$1, ewv $$2, boolean $$3) {
      exd $$4 = $$0.l().aK();
      return $$0.a(($$4x, $$5) -> {
         for (exc $$6 : $$1) {
            exb $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, en::chain);
   }

   private static eq a(eq $$0, alk $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, en::chain);
   }

   private static eq a(eq $$0, aoz $$1, fi.g $$2, IntFunction<uu> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            tx $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, en::chain);
   }

   private static boolean a(aqk $$0, ja $$1) {
      dbk $$2 = new dbk($$1);
      dun $$3 = $$0.l().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == aqd.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<eq, ?> a(CommandNode<eq> $$0, LiteralArgumentBuilder<eq> $$1, boolean $$2, em $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    er.a("block")
                                       .then(
                                          er.a("pos", gm.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   er.a("block", gi.a($$3)),
                                                   $$2,
                                                   $$0x -> gi.a($$0x, "block").test(new dsl(((eq)$$0x.getSource()).e(), gm.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    er.a("biome")
                                       .then(
                                          er.a("pos", gm.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   er.a("biome", ft.a($$3, lr.aE)),
                                                   $$2,
                                                   $$0x -> ft.a($$0x, "biome", lr.aE).test(((eq)$$0x.getSource()).e().t(gm.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(er.a("loaded").then(a($$0, er.a("pos", gm.a()), $$2, $$0x -> a(((eq)$$0x.getSource()).e(), gm.b($$0x, "pos"))))))
                           .then(er.a("dimension").then(a($$0, er.a("dimension", fb.a()), $$2, $$0x -> fb.a($$0x, "dimension") == ((eq)$$0x.getSource()).e()))))
                        .then(
                           er.a("score")
                              .then(
                                 er.a("target", fv.a())
                                    .suggests(fv.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a(
                                                            "targetObjective", fk.a()
                                                         )
                                                         .then(
                                                            er.a("=")
                                                               .then(
                                                                  er.a("source", fv.a())
                                                                     .suggests(fv.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           er.a("sourceObjective", fk.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (aml.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         er.a("<")
                                                            .then(
                                                               er.a("source", fv.a())
                                                                  .suggests(fv.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        er.a("sourceObjective", fk.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (aml.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      er.a("<=")
                                                         .then(
                                                            er.a("source", fv.a())
                                                               .suggests(fv.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     er.a("sourceObjective", fk.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (aml.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   er.a(">")
                                                      .then(
                                                         er.a("source", fv.a())
                                                            .suggests(fv.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  er.a("sourceObjective", fk.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (aml.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                er.a(">=")
                                                   .then(
                                                      er.a("source", fv.a())
                                                         .suggests(fv.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               er.a("sourceObjective", fk.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (aml.e)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(er.a("matches").then(a($$0, er.a("range", fo.a()), $$2, $$0x -> a($$0x, fo.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        er.a("blocks")
                           .then(
                              er.a("start", gm.a())
                                 .then(
                                    er.a("end", gm.a())
                                       .then(
                                          ((RequiredArgumentBuilder)er.a("destination", gm.a()).then(a($$0, er.a("all"), $$2, false)))
                                             .then(a($$0, er.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     er.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)er.a("entities", fd.b()).fork($$0, $$1x -> a($$1x, $$2, !fd.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (aml.b)($$0x -> fd.c($$0x, "entities").size())))
                        )
                  ))
               .then(er.a("predicate").then(a($$0, er.a("predicate", fs.c($$3)).suggests(f), $$2, $$0x -> a((eq)$$0x.getSource(), fs.c($$0x, "predicate"))))))
            .then(er.a("function").then(er.a("name", gy.a()).suggests(amq.b).fork($$0, new aml.d($$2)))))
         .then(
            ((LiteralArgumentBuilder)er.a("items")
                  .then(
                     er.a("entity")
                        .then(
                           er.a("entities", fd.b())
                              .then(
                                 er.a("slots", fz.a())
                                    .then(
                                       ((RequiredArgumentBuilder)er.a("item_predicate", hc.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(fd.b($$1x, "entities"), fz.a($$1x, "slots"), hc.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (aml.b)($$0x -> a(fd.b($$0x, "entities"), fz.a($$0x, "slots"), hc.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  er.a("block")
                     .then(
                        er.a("pos", gm.a())
                           .then(
                              er.a("slots", fz.a())
                                 .then(
                                    ((RequiredArgumentBuilder)er.a("item_predicate", hc.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((eq)$$1x.getSource(), gm.a($$1x, "pos"), fz.a($$1x, "slots"), hc.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (aml.b)($$0x -> a((eq)$$0x.getSource(), gm.a($$0x, "pos"), fz.a($$0x, "slots"), hc.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (apa.c $$4 : apa.c) {
         $$1.then(
            $$4.a(
               er.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)er.a("path", fi.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), fi.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (aml.b)($$1xx -> a($$4.a($$1xx), fi.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends bsd> $$0, crb $$1, Predicate<cua> $$2) {
      int $$3 = 0;

      for (bsd $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            btq $$8 = $$4.a_($$7);
            cua $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.H();
            }
         }
      }

      return $$3;
   }

   private static int a(eq $$0, ja $$1, crb $$2, Predicate<cua> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      bpw $$5 = amv.a($$0, $$1, amv.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            cua $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.H();
            }
         }
      }

      return $$4;
   }

   private static Command<eq> a(boolean $$0, aml.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((eq)$$1x.getSource()).a(() -> wu.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((eq)$$1x.getSource()).a(() -> wu.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(aoz $$0, fi.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<eq> $$0, aml.e $$1) throws CommandSyntaxException {
      exc $$2 = fv.a($$0, "target");
      ewv $$3 = fk.a($$0, "targetObjective");
      exc $$4 = fv.a($$0, "source");
      ewv $$5 = fk.a($$0, "sourceObjective");
      exd $$6 = ((eq)$$0.getSource()).l().aK();
      ewz $$7 = $$6.d($$2, $$3);
      ewz $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<eq> $$0, de.d $$1) throws CommandSyntaxException {
      exc $$2 = fv.a($$0, "target");
      ewv $$3 = fk.a($$0, "targetObjective");
      exd $$4 = ((eq)$$0.getSource()).l().aK();
      ewz $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(eq $$0, jj<etz> $$1) {
      aqk $$2 = $$0.e();
      eqr $$3 = new eqr.a($$2).a(etk.f, $$0.d()).b(etk.a, $$0.f()).a(etj.d);
      eqo $$4 = new eqo.a($$3).a(Optional.empty());
      $$4.b(eqo.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<eq> a(CommandContext<eq> $$0, boolean $$1, boolean $$2) {
      return (Collection<eq>)($$2 == $$1 ? Collections.singleton((eq)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<eq, ?> a(CommandNode<eq> $$0, ArgumentBuilder<eq, ?> $$1, boolean $$2, aml.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((eq)$$2x.getSource()).a(() -> wu.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<eq, ?> a(CommandNode<eq> $$0, ArgumentBuilder<eq, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<eq> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((eq)$$0.getSource()).a(() -> wu.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<eq> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((eq)$$0.getSource()).a(() -> wu.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<eq> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((eq)$$0.getSource()).e(), gm.a($$0, "start"), gm.a($$0, "end"), gm.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(aqk $$0, ja $$1, ja $$2, ja $$3, boolean $$4) throws CommandSyntaxException {
      eii $$5 = eii.a($$1, $$2);
      eii $$6 = eii.a($$3, $$3.a($$5.c()));
      ja $$7 = new ja($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         jx $$9 = $$0.H_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  ja $$14 = new ja($$13, $$12, $$11);
                  ja $$15 = $$14.a((ke)$$7);
                  dsh $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dfh.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dpn $$17 = $$0.c_($$14);
                     dpn $$18 = $$0.c_($$15);
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

                        tx $$19 = $$17.e($$9);
                        tx $$20 = $$18.e($$9);
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

   private static RedirectModifier<eq> a(Function<bsd, Optional<bsd>> $$0) {
      return $$1 -> {
         eq $$2 = (eq)$$1.getSource();
         bsd $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dK()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<eq> b(Function<bsd, Stream<bsd>> $$0) {
      return $$1 -> {
         eq $$2 = (eq)$$1.getSource();
         bsd $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dK()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<eq> a(CommandNode<eq> $$0, LiteralArgumentBuilder<eq> $$1) {
      return (LiteralArgumentBuilder<eq>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              er.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<bsd, Optional<bsd>>)($$0x -> $$0x instanceof btg $$1x ? Optional.ofNullable($$1x.P_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              er.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<bsd, Optional<bsd>>)($$0x -> $$0x instanceof bta $$1x ? Optional.ofNullable($$1x.gb()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           er.a("target")
                              .fork($$0, a((Function<bsd, Optional<bsd>>)($$0x -> $$0x instanceof btw $$1x ? Optional.ofNullable($$1x.p()) : Optional.empty())))
                        ))
                     .then(
                        er.a("attacker")
                           .fork($$0, a((Function<bsd, Optional<bsd>>)($$0x -> $$0x instanceof bsa $$1x ? Optional.ofNullable($$1x.T_()) : Optional.empty())))
                     ))
                  .then(er.a("vehicle").fork($$0, a((Function<bsd, Optional<bsd>>)($$0x -> Optional.ofNullable($$0x.dc()))))))
               .then(er.a("controller").fork($$0, a((Function<bsd, Optional<bsd>>)($$0x -> Optional.ofNullable($$0x.cQ()))))))
            .then(
               er.a("origin").fork($$0, a((Function<bsd, Optional<bsd>>)($$0x -> $$0x instanceof btx $$1x ? Optional.ofNullable($$1x.s()) : Optional.empty())))
            ))
         .then(er.a("passengers").fork($$0, b((Function<bsd, Stream<bsd>>)($$0x -> $$0x.cS().stream()))));
   }

   private static eq a(eq $$0, jj.c<bsj<?>> $$1) throws CommandSyntaxException {
      bsd $$2 = aoj.a($$0, $$1, $$0.d(), new tx(), true);
      return $$0.a($$2);
   }

   public static <T extends es<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable tx $$5, hq<T> $$6, aml.a<T, Collection<ic<T>>> $$7, hk $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<ic<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<ie<T>> $$14 = new ArrayList<>($$13);

         try {
            for (ic<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x()));
               } catch (et var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            en $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new ia<>($$2x -> {
               for (ie<T> $$3x : $$14) {
                  $$2x.a(new hw<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(hz.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new hv.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<eq> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<eq> var1) throws CommandSyntaxException;
   }

   static class d implements hn.a<eq> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(eq $$0, List<eq> $$1, ContextChain<eq> $$2, hk $$3, hq<eq> $$4) {
         aml.a($$0, $$1, amq::a, this.a, $$2, null, $$4, $$0x -> gy.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
