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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ait {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> vb.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vb.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vb.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> vb.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<ds> f = ($$0, $$1) -> {
      egh $$2 = ((ds)$$0.getSource()).l().aJ();
      return dw.a($$2.a(egj.a), $$1);
   };

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      LiteralCommandNode<ds> $$2 = $$0.register((LiteralArgumentBuilder)dt.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(dt.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, dt.a("if"), true, $$1)))
                                             .then(a($$2, dt.a("unless"), false, $$1)))
                                          .then(dt.a("as").then(dt.a("targets", ee.b()).fork($$2, $$0x -> {
                                             List<ds> $$1x = Lists.newArrayList();

                                             for (blf $$2x : ee.c($$0x, "targets")) {
                                                $$1x.add(((ds)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dt.a("at").then(dt.a("targets", ee.b()).fork($$2, $$0x -> {
                                          List<ds> $$1x = Lists.newArrayList();

                                          for (blf $$2x : ee.c($$0x, "targets")) {
                                             $$1x.add(((ds)$$0x.getSource()).a((amp)$$2x.dM()).a($$2x.dk()).a($$2x.bG()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)dt.a("store").then(a($$2, dt.a("result"), true))).then(a($$2, dt.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("positioned")
                                             .then(dt.a("pos", fr.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(fr.a($$0x, "pos")).a(ed.a.a))))
                                          .then(dt.a("as").then(dt.a("targets", ee.b()).fork($$2, $$0x -> {
                                             List<ds> $$1x = Lists.newArrayList();

                                             for (blf $$2x : ee.c($$0x, "targets")) {
                                                $$1x.add(((ds)$$0x.getSource()).a($$2x.dk()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dt.a("over").then(dt.a("heightmap", eh.a()).redirect($$2, $$0x -> {
                                          elb $$1x = ((ds)$$0x.getSource()).d();
                                          amp $$2x = ((ds)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(ix.b($$3), ix.b($$4))) {
                                             throw fk.a.create();
                                          } else {
                                             int $$5 = $$2x.a(eh.a($$0x, "heightmap"), aty.a($$3), aty.a($$4));
                                             return ((ds)$$0x.getSource()).a(new elb($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)dt.a("rotated")
                                       .then(dt.a("rot", fo.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(fo.a($$0x, "rot").b((ds)$$0x.getSource())))))
                                    .then(dt.a("as").then(dt.a("targets", ee.b()).fork($$2, $$0x -> {
                                       List<ds> $$1x = Lists.newArrayList();

                                       for (blf $$2x : ee.c($$0x, "targets")) {
                                          $$1x.add(((ds)$$0x.getSource()).a($$2x.bG()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dt.a("facing")
                                    .then(dt.a("entity").then(dt.a("targets", ee.b()).then(dt.a("anchor", ed.a()).fork($$2, $$0x -> {
                                       List<ds> $$1x = Lists.newArrayList();
                                       ed.a $$2x = ed.a($$0x, "anchor");

                                       for (blf $$3 : ee.c($$0x, "targets")) {
                                          $$1x.add(((ds)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(dt.a("pos", fr.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).b(fr.a($$0x, "pos"))))
                           ))
                        .then(
                           dt.a("align")
                              .then(dt.a("axes", fp.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(((ds)$$0x.getSource()).d().a(fp.a($$0x, "axes")))))
                        ))
                     .then(dt.a("anchored").then(dt.a("anchor", ed.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(ed.a($$0x, "anchor"))))))
                  .then(dt.a("in").then(dt.a("dimension", ec.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(ec.a($$0x, "dimension"))))))
               .then(dt.a("summon").then(dt.a("entity", eq.a($$1, kc.u)).suggests(hl.d).redirect($$2, $$0x -> a((ds)$$0x.getSource(), eq.e($$0x, "entity"))))))
            .then(a($$2, dt.a("on")))
      );
   }

   private static ArgumentBuilder<ds, ?> a(LiteralCommandNode<ds> $$0, LiteralArgumentBuilder<ds> $$1, boolean $$2) {
      $$1.then(
         dt.a("score")
            .then(
               dt.a("targets", ev.b())
                  .suggests(ev.a)
                  .then(dt.a("objective", el.a()).redirect($$0, $$1x -> a((ds)$$1x.getSource(), ev.c($$1x, "targets"), el.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         dt.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)dt.a("id", es.a())
                     .suggests(aid.a)
                     .then(dt.a("value").redirect($$0, $$1x -> a((ds)$$1x.getSource(), aid.a($$1x), true, $$2))))
                  .then(dt.a("max").redirect($$0, $$1x -> a((ds)$$1x.getSource(), aid.a($$1x), false, $$2)))
            )
      );

      for (alg.c $$3 : alg.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                       "path", ej.a()
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
                                                         ej.a($$2xx, "path"),
                                                         $$1xxx -> so.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                                      ej.a($$2xx, "path"),
                                                      $$1xxx -> sm.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                                   ej.a($$2xx, "path"),
                                                   $$1xxx -> tb.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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
                                                ej.a($$2xx, "path"),
                                                $$1xxx -> sr.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                             ej.a($$2xx, "path"),
                                             $$1xxx -> sk.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
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
                                          ej.a($$2xx, "path"),
                                          $$1xxx -> sh.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static ds a(ds $$0, Collection<String> $$1, elx $$2, boolean $$3) {
      ema $$4 = $$0.l().aH();
      return $$0.a(($$4x, $$5) -> {
         for (String $$6 : $$1) {
            elz $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.b($$8);
         }
      }, dp::chain);
   }

   private static ds a(ds $$0, ahs $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, dp::chain);
   }

   private static ds a(ds $$0, alf $$1, ej.g $$2, IntFunction<tg> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            sj $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, dp::chain);
   }

   private static boolean a(amp $$0, hv $$1) {
      csf $$2 = new csf($$1);
      dkw $$3 = $$0.k().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == ami.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ds, ?> a(CommandNode<ds> $$0, LiteralArgumentBuilder<ds> $$1, boolean $$2, dn $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                 dt.a("block")
                                    .then(
                                       dt.a("pos", fk.a())
                                          .then(
                                             a(
                                                $$0,
                                                dt.a("block", fg.a($$3)),
                                                $$2,
                                                $$0x -> fg.a($$0x, "block").test(new dit(((ds)$$0x.getSource()).e(), fk.a($$0x, "pos"), true))
                                             )
                                          )
                                    )
                              ))
                              .then(
                                 dt.a("biome")
                                    .then(
                                       dt.a("pos", fk.a())
                                          .then(
                                             a(
                                                $$0,
                                                dt.a("biome", et.a($$3, kc.as)),
                                                $$2,
                                                $$0x -> et.a($$0x, "biome", kc.as).test(((ds)$$0x.getSource()).e().s(fk.a($$0x, "pos")))
                                             )
                                          )
                                    )
                              ))
                           .then(dt.a("loaded").then(a($$0, dt.a("pos", fk.a()), $$2, $$0x -> a(((ds)$$0x.getSource()).e(), fk.b($$0x, "pos"))))))
                        .then(dt.a("dimension").then(a($$0, dt.a("dimension", ec.a()), $$2, $$0x -> ec.a($$0x, "dimension") == ((ds)$$0x.getSource()).e()))))
                     .then(
                        dt.a("score")
                           .then(
                              dt.a("target", ev.a())
                                 .suggests(ev.a)
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                                         "targetObjective", el.a()
                                                      )
                                                      .then(
                                                         dt.a("=")
                                                            .then(
                                                               dt.a("source", ev.a())
                                                                  .suggests(ev.a)
                                                                  .then(a($$0, dt.a("sourceObjective", el.a()), $$2, $$0x -> a($$0x, Integer::equals)))
                                                            )
                                                      ))
                                                   .then(
                                                      dt.a("<")
                                                         .then(
                                                            dt.a("source", ev.a())
                                                               .suggests(ev.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     dt.a("sourceObjective", el.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("<=")
                                                      .then(
                                                         dt.a("source", ev.a())
                                                            .suggests(ev.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  dt.a("sourceObjective", el.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                dt.a(">")
                                                   .then(
                                                      dt.a("source", ev.a())
                                                         .suggests(ev.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               dt.a("sourceObjective", el.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             dt.a(">=")
                                                .then(
                                                   dt.a("source", ev.a())
                                                      .suggests(ev.a)
                                                      .then(
                                                         a(
                                                            $$0,
                                                            dt.a("sourceObjective", el.a()),
                                                            $$2,
                                                            $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(dt.a("matches").then(a($$0, dt.a("range", ep.a()), $$2, $$0x -> a($$0x, ep.b.a($$0x, "range")))))
                                 )
                           )
                     ))
                  .then(
                     dt.a("blocks")
                        .then(
                           dt.a("start", fk.a())
                              .then(
                                 dt.a("end", fk.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("destination", fk.a()).then(a($$0, dt.a("all"), $$2, false)))
                                          .then(a($$0, dt.a("masked"), $$2, true))
                                    )
                              )
                        )
                  ))
               .then(
                  dt.a("entity")
                     .then(
                        ((RequiredArgumentBuilder)dt.a("entities", ee.b()).fork($$0, $$1x -> a($$1x, $$2, !ee.c($$1x, "entities").isEmpty())))
                           .executes(a($$2, (ait.b)($$0x -> ee.c($$0x, "entities").size())))
                     )
               ))
            .then(dt.a("predicate").then(a($$0, dt.a("predicate", es.a()).suggests(f), $$2, $$0x -> a((ds)$$0x.getSource(), es.c($$0x, "predicate"))))))
         .then(dt.a("function").then(dt.a("name", fv.a()).suggests(aiy.b).fork($$0, new ait.d($$2))));

      for (alg.c $$4 : alg.c) {
         $$1.then(
            $$4.a(
               dt.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)dt.a("path", ej.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), ej.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (ait.b)($$1xx -> a($$4.a($$1xx), ej.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static Command<ds> a(boolean $$0, ait.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ds)$$1x.getSource()).a(() -> vb.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ds)$$1x.getSource()).a(() -> vb.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(alf $$0, ej.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ds> $$0, BiPredicate<Integer, Integer> $$1) throws CommandSyntaxException {
      String $$2 = ev.a($$0, "target");
      elx $$3 = el.a($$0, "targetObjective");
      String $$4 = ev.a($$0, "source");
      elx $$5 = el.a($$0, "sourceObjective");
      ema $$6 = ((ds)$$0.getSource()).l().aH();
      if ($$6.b($$2, $$3) && $$6.b($$4, $$5)) {
         elz $$7 = $$6.c($$2, $$3);
         elz $$8 = $$6.c($$4, $$5);
         return $$1.test($$7.b(), $$8.b());
      } else {
         return false;
      }
   }

   private static boolean a(CommandContext<ds> $$0, ck.d $$1) throws CommandSyntaxException {
      String $$2 = ev.a($$0, "target");
      elx $$3 = el.a($$0, "targetObjective");
      ema $$4 = ((ds)$$0.getSource()).l().aH();
      return !$$4.b($$2, $$3) ? false : $$1.d($$4.c($$2, $$3).b());
   }

   private static boolean a(ds $$0, ejd $$1) {
      amp $$2 = $$0.e();
      egk $$3 = new egk.a($$2).a(eip.f, $$0.d()).b(eip.a, $$0.f()).a(eio.d);
      ege $$4 = new ege.a($$3).a(Optional.empty());
      $$4.b(ege.a($$1));
      return $$1.test($$4);
   }

   private static Collection<ds> a(CommandContext<ds> $$0, boolean $$1, boolean $$2) {
      return (Collection<ds>)($$2 == $$1 ? Collections.singleton((ds)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ds, ?> a(CommandNode<ds> $$0, ArgumentBuilder<ds, ?> $$1, boolean $$2, ait.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ds)$$2x.getSource()).a(() -> vb.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<ds, ?> a(CommandNode<ds> $$0, ArgumentBuilder<ds, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<ds> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((ds)$$0.getSource()).a(() -> vb.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<ds> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((ds)$$0.getSource()).a(() -> vb.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ds> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ds)$$0.getSource()).e(), fk.a($$0, "start"), fk.a($$0, "end"), fk.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(amp $$0, hv $$1, hv $$2, hv $$3, boolean $$4) throws CommandSyntaxException {
      dyg $$5 = dyg.a($$1, $$2);
      dyg $$6 = dyg.a($$3, $$3.a($$5.c()));
      hv $$7 = new hv($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         int $$9 = 0;

         for (int $$10 = $$5.j(); $$10 <= $$5.m(); $$10++) {
            for (int $$11 = $$5.i(); $$11 <= $$5.l(); $$11++) {
               for (int $$12 = $$5.h(); $$12 <= $$5.k(); $$12++) {
                  hv $$13 = new hv($$12, $$11, $$10);
                  hv $$14 = $$13.a((iz)$$7);
                  dip $$15 = $$0.a_($$13);
                  if (!$$4 || !$$15.a(cwb.a)) {
                     if ($$15 != $$0.a_($$14)) {
                        return OptionalInt.empty();
                     }

                     dgd $$16 = $$0.c_($$13);
                     dgd $$17 = $$0.c_($$14);
                     if ($$16 != null) {
                        if ($$17 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$17.v() != $$16.v()) {
                           return OptionalInt.empty();
                        }

                        sj $$18 = $$16.q();
                        sj $$19 = $$17.q();
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

   private static RedirectModifier<ds> a(Function<blf, Optional<blf>> $$0) {
      return $$1 -> {
         ds $$2 = (ds)$$1.getSource();
         blf $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dH()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ds> b(Function<blf, Stream<blf>> $$0) {
      return $$1 -> {
         ds $$2 = (ds)$$1.getSource();
         blf $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dH()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ds> a(CommandNode<ds> $$0, LiteralArgumentBuilder<ds> $$1) {
      return (LiteralArgumentBuilder<ds>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              dt.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<blf, Optional<blf>>)($$0x -> $$0x instanceof bmd $$1x ? Optional.ofNullable($$1x.R_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              dt.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<blf, Optional<blf>>)($$0x -> $$0x instanceof blx $$1x ? Optional.ofNullable($$1x.fT()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           dt.a("target")
                              .fork($$0, a((Function<blf, Optional<blf>>)($$0x -> $$0x instanceof bmr $$1x ? Optional.ofNullable($$1x.q()) : Optional.empty())))
                        ))
                     .then(
                        dt.a("attacker")
                           .fork($$0, a((Function<blf, Optional<blf>>)($$0x -> $$0x instanceof bld $$1x ? Optional.ofNullable($$1x.V_()) : Optional.empty())))
                     ))
                  .then(dt.a("vehicle").fork($$0, a((Function<blf, Optional<blf>>)($$0x -> Optional.ofNullable($$0x.cZ()))))))
               .then(dt.a("controller").fork($$0, a((Function<blf, Optional<blf>>)($$0x -> Optional.ofNullable($$0x.cN()))))))
            .then(
               dt.a("origin").fork($$0, a((Function<blf, Optional<blf>>)($$0x -> $$0x instanceof bms $$1x ? Optional.ofNullable($$1x.w()) : Optional.empty())))
            ))
         .then(dt.a("passengers").fork($$0, b((Function<blf, Stream<blf>>)($$0x -> $$0x.cP().stream()))));
   }

   private static ds a(ds $$0, ie.c<blj<?>> $$1) throws CommandSyntaxException {
      blf $$2 = akq.a($$0, $$1, $$0.d(), new sj(), true);
      return $$0.a($$2);
   }

   public static <T extends du<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable sj $$5, gn<T> $$6, ait.a<T, Collection<gz<T>>> $$7, gh $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<gz<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<hb<T>> $$14 = new ArrayList<>($$13);

         try {
            for (gz<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x(), $$0));
               } catch (dv var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            dp $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new gx<>($$2x -> {
               for (hb<T> $$3x : $$14) {
                  $$2x.a(new gt<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(gw.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new gs.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<ds> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<ds> var1) throws CommandSyntaxException;
   }

   static class d implements gk.a<ds> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ds $$0, List<ds> $$1, ContextChain<ds> $$2, gh $$3, gn<ds> $$4) {
         ait.a($$0, $$1, aiy::a, this.a, $$2, null, $$4, $$0x -> fv.a($$0x, "name"), $$3);
      }
   }
}
