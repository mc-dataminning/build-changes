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

public class alv {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wi.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wi.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wi.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wi.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<dv> f = ($$0, $$1) -> {
      enn $$2 = ((dv)$$0.getSource()).l().aM();
      return ea.a($$2.a(enp.a), $$1);
   };

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      LiteralCommandNode<dv> $$2 = $$0.register((LiteralArgumentBuilder)dw.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(dw.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, dw.a("if"), true, $$1)))
                                             .then(a($$2, dw.a("unless"), false, $$1)))
                                          .then(dw.a("as").then(dw.a("targets", ei.b()).fork($$2, $$0x -> {
                                             List<dv> $$1x = Lists.newArrayList();

                                             for (bqa $$2x : ei.c($$0x, "targets")) {
                                                $$1x.add(((dv)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dw.a("at").then(dw.a("targets", ei.b()).fork($$2, $$0x -> {
                                          List<dv> $$1x = Lists.newArrayList();

                                          for (bqa $$2x : ei.c($$0x, "targets")) {
                                             $$1x.add(((dv)$$0x.getSource()).a((apu)$$2x.dM()).a($$2x.dk()).a($$2x.bJ()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)dw.a("store").then(a($$2, dw.a("result"), true))).then(a($$2, dw.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("positioned")
                                             .then(dw.a("pos", fx.a()).redirect($$2, $$0x -> ((dv)$$0x.getSource()).a(fx.a($$0x, "pos")).a(eh.a.a))))
                                          .then(dw.a("as").then(dw.a("targets", ei.b()).fork($$2, $$0x -> {
                                             List<dv> $$1x = Lists.newArrayList();

                                             for (bqa $$2x : ei.c($$0x, "targets")) {
                                                $$1x.add(((dv)$$0x.getSource()).a($$2x.dk()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dw.a("over").then(dw.a("heightmap", el.a()).redirect($$2, $$0x -> {
                                          esj $$1x = ((dv)$$0x.getSource()).d();
                                          apu $$2x = ((dv)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(jg.b($$3), jg.b($$4))) {
                                             throw fq.a.create();
                                          } else {
                                             int $$5 = $$2x.a(el.a($$0x, "heightmap"), axm.a($$3), axm.a($$4));
                                             return ((dv)$$0x.getSource()).a(new esj($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)dw.a("rotated")
                                       .then(dw.a("rot", fu.a()).redirect($$2, $$0x -> ((dv)$$0x.getSource()).a(fu.a($$0x, "rot").b((dv)$$0x.getSource())))))
                                    .then(dw.a("as").then(dw.a("targets", ei.b()).fork($$2, $$0x -> {
                                       List<dv> $$1x = Lists.newArrayList();

                                       for (bqa $$2x : ei.c($$0x, "targets")) {
                                          $$1x.add(((dv)$$0x.getSource()).a($$2x.bJ()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dw.a("facing")
                                    .then(dw.a("entity").then(dw.a("targets", ei.b()).then(dw.a("anchor", eh.a()).fork($$2, $$0x -> {
                                       List<dv> $$1x = Lists.newArrayList();
                                       eh.a $$2x = eh.a($$0x, "anchor");

                                       for (bqa $$3 : ei.c($$0x, "targets")) {
                                          $$1x.add(((dv)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(dw.a("pos", fx.a()).redirect($$2, $$0x -> ((dv)$$0x.getSource()).b(fx.a($$0x, "pos"))))
                           ))
                        .then(
                           dw.a("align")
                              .then(dw.a("axes", fv.a()).redirect($$2, $$0x -> ((dv)$$0x.getSource()).a(((dv)$$0x.getSource()).d().a(fv.a($$0x, "axes")))))
                        ))
                     .then(dw.a("anchored").then(dw.a("anchor", eh.a()).redirect($$2, $$0x -> ((dv)$$0x.getSource()).a(eh.a($$0x, "anchor"))))))
                  .then(dw.a("in").then(dw.a("dimension", eg.a()).redirect($$2, $$0x -> ((dv)$$0x.getSource()).a(eg.a($$0x, "dimension"))))))
               .then(dw.a("summon").then(dw.a("entity", eu.a($$1, ku.v)).suggests(ht.d).redirect($$2, $$0x -> a((dv)$$0x.getSource(), eu.e($$0x, "entity"))))))
            .then(a($$2, dw.a("on")))
      );
   }

   private static ArgumentBuilder<dv, ?> a(LiteralCommandNode<dv> $$0, LiteralArgumentBuilder<dv> $$1, boolean $$2) {
      $$1.then(
         dw.a("score")
            .then(
               dw.a("targets", ez.b())
                  .suggests(ez.a)
                  .then(dw.a("objective", ep.a()).redirect($$0, $$1x -> a((dv)$$1x.getSource(), ez.c($$1x, "targets"), ep.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         dw.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)dw.a("id", ew.a())
                     .suggests(alf.a)
                     .then(dw.a("value").redirect($$0, $$1x -> a((dv)$$1x.getSource(), alf.a($$1x), true, $$2))))
                  .then(dw.a("max").redirect($$0, $$1x -> a((dv)$$1x.getSource(), alf.a($$1x), false, $$2)))
            )
      );

      for (aok.c $$3 : aok.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a(
                                       "path", en.a()
                                    )
                                    .then(
                                       dw.a("int")
                                          .then(
                                             dw.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (dv)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         en.a($$2xx, "path"),
                                                         $$1xxx -> tt.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dw.a("float")
                                       .then(
                                          dw.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (dv)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      en.a($$2xx, "path"),
                                                      $$1xxx -> tr.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dw.a("short")
                                    .then(
                                       dw.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (dv)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   en.a($$2xx, "path"),
                                                   $$1xxx -> ug.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              dw.a("long")
                                 .then(
                                    dw.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (dv)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                en.a($$2xx, "path"),
                                                $$1xxx -> tw.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           dw.a("double")
                              .then(
                                 dw.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (dv)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             en.a($$2xx, "path"),
                                             $$1xxx -> tp.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        dw.a("byte")
                           .then(
                              dw.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (dv)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          en.a($$2xx, "path"),
                                          $$1xxx -> tm.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static dv a(dv $$0, Collection<etm> $$1, etf $$2, boolean $$3) {
      etn $$4 = $$0.l().aK();
      return $$0.a(($$4x, $$5) -> {
         for (etm $$6 : $$1) {
            etl $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, ds::chain);
   }

   private static dv a(dv $$0, aku $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, ds::chain);
   }

   private static dv a(dv $$0, aoj $$1, en.g $$2, IntFunction<ul> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            to $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, ds::chain);
   }

   private static boolean a(apu $$0, id $$1) {
      cyn $$2 = new cyn($$1);
      dro $$3 = $$0.l().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == apn.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<dv, ?> a(CommandNode<dv> $$0, LiteralArgumentBuilder<dv> $$1, boolean $$2, dr $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    dw.a("block")
                                       .then(
                                          dw.a("pos", fq.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   dw.a("block", fm.a($$3)),
                                                   $$2,
                                                   $$0x -> fm.a($$0x, "block").test(new dpm(((dv)$$0x.getSource()).e(), fq.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    dw.a("biome")
                                       .then(
                                          dw.a("pos", fq.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   dw.a("biome", ex.a($$3, ku.aw)),
                                                   $$2,
                                                   $$0x -> ex.a($$0x, "biome", ku.aw).test(((dv)$$0x.getSource()).e().t(fq.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(dw.a("loaded").then(a($$0, dw.a("pos", fq.a()), $$2, $$0x -> a(((dv)$$0x.getSource()).e(), fq.b($$0x, "pos"))))))
                           .then(dw.a("dimension").then(a($$0, dw.a("dimension", eg.a()), $$2, $$0x -> eg.a($$0x, "dimension") == ((dv)$$0x.getSource()).e()))))
                        .then(
                           dw.a("score")
                              .then(
                                 dw.a("target", ez.a())
                                    .suggests(ez.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a(
                                                            "targetObjective", ep.a()
                                                         )
                                                         .then(
                                                            dw.a("=")
                                                               .then(
                                                                  dw.a("source", ez.a())
                                                                     .suggests(ez.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           dw.a("sourceObjective", ep.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (alv.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         dw.a("<")
                                                            .then(
                                                               dw.a("source", ez.a())
                                                                  .suggests(ez.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        dw.a("sourceObjective", ep.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (alv.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      dw.a("<=")
                                                         .then(
                                                            dw.a("source", ez.a())
                                                               .suggests(ez.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     dw.a("sourceObjective", ep.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (alv.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   dw.a(">")
                                                      .then(
                                                         dw.a("source", ez.a())
                                                            .suggests(ez.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  dw.a("sourceObjective", ep.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (alv.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                dw.a(">=")
                                                   .then(
                                                      dw.a("source", ez.a())
                                                         .suggests(ez.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               dw.a("sourceObjective", ep.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (alv.e)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(dw.a("matches").then(a($$0, dw.a("range", et.a()), $$2, $$0x -> a($$0x, et.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        dw.a("blocks")
                           .then(
                              dw.a("start", fq.a())
                                 .then(
                                    dw.a("end", fq.a())
                                       .then(
                                          ((RequiredArgumentBuilder)dw.a("destination", fq.a()).then(a($$0, dw.a("all"), $$2, false)))
                                             .then(a($$0, dw.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     dw.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)dw.a("entities", ei.b()).fork($$0, $$1x -> a($$1x, $$2, !ei.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (alv.b)($$0x -> ei.c($$0x, "entities").size())))
                        )
                  ))
               .then(dw.a("predicate").then(a($$0, dw.a("predicate", ew.a()).suggests(f), $$2, $$0x -> a((dv)$$0x.getSource(), ew.c($$0x, "predicate"))))))
            .then(dw.a("function").then(dw.a("name", gb.a()).suggests(ama.b).fork($$0, new alv.d($$2)))))
         .then(
            ((LiteralArgumentBuilder)dw.a("items")
                  .then(
                     dw.a("entity")
                        .then(
                           dw.a("entities", ei.b())
                              .then(
                                 dw.a("slots", fd.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dw.a("item_predicate", gf.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(ei.b($$1x, "entities"), fd.a($$1x, "slots"), gf.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (alv.b)($$0x -> a(ei.b($$0x, "entities"), fd.a($$0x, "slots"), gf.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  dw.a("block")
                     .then(
                        dw.a("pos", fq.a())
                           .then(
                              dw.a("slots", fd.a())
                                 .then(
                                    ((RequiredArgumentBuilder)dw.a("item_predicate", gf.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((dv)$$1x.getSource(), fq.a($$1x, "pos"), fd.a($$1x, "slots"), gf.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (alv.b)($$0x -> a((dv)$$0x.getSource(), fq.a($$0x, "pos"), fd.a($$0x, "slots"), gf.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (aok.c $$4 : aok.c) {
         $$1.then(
            $$4.a(
               dw.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)dw.a("path", en.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), en.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (alv.b)($$1xx -> a($$4.a($$1xx), en.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends bqa> $$0, cot $$1, Predicate<crs> $$2) {
      int $$3 = 0;

      for (bqa $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            brk $$8 = $$4.a_($$7);
            crs $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.G();
            }
         }
      }

      return $$3;
   }

   private static int a(dv $$0, id $$1, cot $$2, Predicate<crs> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      bny $$5 = amf.a($$0, $$1, amf.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            crs $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.G();
            }
         }
      }

      return $$4;
   }

   private static Command<dv> a(boolean $$0, alv.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((dv)$$1x.getSource()).a(() -> wi.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((dv)$$1x.getSource()).a(() -> wi.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(aoj $$0, en.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<dv> $$0, alv.e $$1) throws CommandSyntaxException {
      etm $$2 = ez.a($$0, "target");
      etf $$3 = ep.a($$0, "targetObjective");
      etm $$4 = ez.a($$0, "source");
      etf $$5 = ep.a($$0, "sourceObjective");
      etn $$6 = ((dv)$$0.getSource()).l().aK();
      etj $$7 = $$6.d($$2, $$3);
      etj $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<dv> $$0, cm.d $$1) throws CommandSyntaxException {
      etm $$2 = ez.a($$0, "target");
      etf $$3 = ep.a($$0, "targetObjective");
      etn $$4 = ((dv)$$0.getSource()).l().aK();
      etj $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(dv $$0, eql $$1) {
      apu $$2 = $$0.e();
      enq $$3 = new enq.a($$2).a(epx.f, $$0.d()).b(epx.a, $$0.f()).a(epw.d);
      enk $$4 = new enk.a($$3).a(Optional.empty());
      $$4.b(enk.a($$1));
      return $$1.test($$4);
   }

   private static Collection<dv> a(CommandContext<dv> $$0, boolean $$1, boolean $$2) {
      return (Collection<dv>)($$2 == $$1 ? Collections.singleton((dv)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<dv, ?> a(CommandNode<dv> $$0, ArgumentBuilder<dv, ?> $$1, boolean $$2, alv.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((dv)$$2x.getSource()).a(() -> wi.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<dv, ?> a(CommandNode<dv> $$0, ArgumentBuilder<dv, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<dv> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((dv)$$0.getSource()).a(() -> wi.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<dv> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((dv)$$0.getSource()).a(() -> wi.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<dv> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((dv)$$0.getSource()).e(), fq.a($$0, "start"), fq.a($$0, "end"), fq.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(apu $$0, id $$1, id $$2, id $$3, boolean $$4) throws CommandSyntaxException {
      efi $$5 = efi.a($$1, $$2);
      efi $$6 = efi.a($$3, $$3.a($$5.c()));
      id $$7 = new id($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         jb $$9 = $$0.H_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  id $$14 = new id($$13, $$12, $$11);
                  id $$15 = $$14.a((ji)$$7);
                  dpi $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dcj.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dmo $$17 = $$0.c_($$14);
                     dmo $$18 = $$0.c_($$15);
                     if ($$17 != null) {
                        if ($$18 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$18.r() != $$17.r()) {
                           return OptionalInt.empty();
                        }

                        to $$19 = $$17.d($$9);
                        to $$20 = $$18.d($$9);
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

   private static RedirectModifier<dv> a(Function<bqa, Optional<bqa>> $$0) {
      return $$1 -> {
         dv $$2 = (dv)$$1.getSource();
         bqa $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dH()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<dv> b(Function<bqa, Stream<bqa>> $$0) {
      return $$1 -> {
         dv $$2 = (dv)$$1.getSource();
         bqa $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dH()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<dv> a(CommandNode<dv> $$0, LiteralArgumentBuilder<dv> $$1) {
      return (LiteralArgumentBuilder<dv>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              dw.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<bqa, Optional<bqa>>)($$0x -> $$0x instanceof bra $$1x ? Optional.ofNullable($$1x.P_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              dw.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<bqa, Optional<bqa>>)($$0x -> $$0x instanceof bqv $$1x ? Optional.ofNullable($$1x.gc()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           dw.a("target")
                              .fork($$0, a((Function<bqa, Optional<bqa>>)($$0x -> $$0x instanceof brq $$1x ? Optional.ofNullable($$1x.p()) : Optional.empty())))
                        ))
                     .then(
                        dw.a("attacker")
                           .fork($$0, a((Function<bqa, Optional<bqa>>)($$0x -> $$0x instanceof bpx $$1x ? Optional.ofNullable($$1x.T_()) : Optional.empty())))
                     ))
                  .then(dw.a("vehicle").fork($$0, a((Function<bqa, Optional<bqa>>)($$0x -> Optional.ofNullable($$0x.cZ()))))))
               .then(dw.a("controller").fork($$0, a((Function<bqa, Optional<bqa>>)($$0x -> Optional.ofNullable($$0x.cN()))))))
            .then(
               dw.a("origin").fork($$0, a((Function<bqa, Optional<bqa>>)($$0x -> $$0x instanceof brr $$1x ? Optional.ofNullable($$1x.u()) : Optional.empty())))
            ))
         .then(dw.a("passengers").fork($$0, b((Function<bqa, Stream<bqa>>)($$0x -> $$0x.cP().stream()))));
   }

   private static dv a(dv $$0, in.c<bqg<?>> $$1) throws CommandSyntaxException {
      bqa $$2 = ant.a($$0, $$1, $$0.d(), new to(), true);
      return $$0.a($$2);
   }

   public static <T extends dx<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable to $$5, gv<T> $$6, alv.a<T, Collection<hh<T>>> $$7, gp $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<hh<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<hj<T>> $$14 = new ArrayList<>($$13);

         try {
            for (hh<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x()));
               } catch (dy var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            ds $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new hf<>($$2x -> {
               for (hj<T> $$3x : $$14) {
                  $$2x.a(new hb<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(he.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new ha.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<dv> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<dv> var1) throws CommandSyntaxException;
   }

   static class d implements gs.a<dv> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(dv $$0, List<dv> $$1, ContextChain<dv> $$2, gp $$3, gv<dv> $$4) {
         alv.a($$0, $$1, ama::a, this.a, $$2, null, $$4, $$0x -> gb.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
