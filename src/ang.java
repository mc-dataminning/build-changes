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

public class ang {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xp.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xp.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xp.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xp.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<ep> f = ($$0, $$1) -> {
      alp.b $$2 = ((ep)$$0.getSource()).l().be();
      return eu.a($$2.a(lq.aW), $$1);
   };

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      LiteralCommandNode<ep> $$2 = $$0.register((LiteralArgumentBuilder)eq.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(eq.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, eq.a("if"), true, $$1)))
                                             .then(a($$2, eq.a("unless"), false, $$1)))
                                          .then(eq.a("as").then(eq.a("targets", fc.b()).fork($$2, $$0x -> {
                                             List<ep> $$1x = Lists.newArrayList();

                                             for (bsu $$2x : fc.c($$0x, "targets")) {
                                                $$1x.add(((ep)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(eq.a("at").then(eq.a("targets", fc.b()).fork($$2, $$0x -> {
                                          List<ep> $$1x = Lists.newArrayList();

                                          for (bsu $$2x : fc.c($$0x, "targets")) {
                                             $$1x.add(((ep)$$0x.getSource()).a((arf)$$2x.dP()).a($$2x.dn()).a($$2x.bM()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)eq.a("store").then(a($$2, eq.a("result"), true))).then(a($$2, eq.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("positioned")
                                             .then(eq.a("pos", gs.a()).redirect($$2, $$0x -> ((ep)$$0x.getSource()).a(gs.a($$0x, "pos")).a(fb.a.a))))
                                          .then(eq.a("as").then(eq.a("targets", fc.b()).fork($$2, $$0x -> {
                                             List<ep> $$1x = Lists.newArrayList();

                                             for (bsu $$2x : fc.c($$0x, "targets")) {
                                                $$1x.add(((ep)$$0x.getSource()).a($$2x.dn()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(eq.a("over").then(eq.a("heightmap", ff.a()).redirect($$2, $$0x -> {
                                          evr $$1x = ((ep)$$0x.getSource()).d();
                                          arf $$2x = ((ep)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(kb.b($$3), kb.b($$4))) {
                                             throw gl.a.create();
                                          } else {
                                             int $$5 = $$2x.a(ff.a($$0x, "heightmap"), ayz.a($$3), ayz.a($$4));
                                             return ((ep)$$0x.getSource()).a(new evr($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)eq.a("rotated")
                                       .then(eq.a("rot", gp.a()).redirect($$2, $$0x -> ((ep)$$0x.getSource()).a(gp.a($$0x, "rot").b((ep)$$0x.getSource())))))
                                    .then(eq.a("as").then(eq.a("targets", fc.b()).fork($$2, $$0x -> {
                                       List<ep> $$1x = Lists.newArrayList();

                                       for (bsu $$2x : fc.c($$0x, "targets")) {
                                          $$1x.add(((ep)$$0x.getSource()).a($$2x.bM()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)eq.a("facing")
                                    .then(eq.a("entity").then(eq.a("targets", fc.b()).then(eq.a("anchor", fb.a()).fork($$2, $$0x -> {
                                       List<ep> $$1x = Lists.newArrayList();
                                       fb.a $$2x = fb.a($$0x, "anchor");

                                       for (bsu $$3 : fc.c($$0x, "targets")) {
                                          $$1x.add(((ep)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(eq.a("pos", gs.a()).redirect($$2, $$0x -> ((ep)$$0x.getSource()).b(gs.a($$0x, "pos"))))
                           ))
                        .then(
                           eq.a("align")
                              .then(eq.a("axes", gq.a()).redirect($$2, $$0x -> ((ep)$$0x.getSource()).a(((ep)$$0x.getSource()).d().a(gq.a($$0x, "axes")))))
                        ))
                     .then(eq.a("anchored").then(eq.a("anchor", fb.a()).redirect($$2, $$0x -> ((ep)$$0x.getSource()).a(fb.a($$0x, "anchor"))))))
                  .then(eq.a("in").then(eq.a("dimension", fa.a()).redirect($$2, $$0x -> ((ep)$$0x.getSource()).a(fa.a($$0x, "dimension"))))))
               .then(eq.a("summon").then(eq.a("entity", fo.a($$1, lq.v)).suggests(io.d).redirect($$2, $$0x -> a((ep)$$0x.getSource(), fo.e($$0x, "entity"))))))
            .then(a($$2, eq.a("on")))
      );
   }

   private static ArgumentBuilder<ep, ?> a(LiteralCommandNode<ep> $$0, LiteralArgumentBuilder<ep> $$1, boolean $$2) {
      $$1.then(
         eq.a("score")
            .then(
               eq.a("targets", fu.b())
                  .suggests(fu.a)
                  .then(eq.a("objective", fj.a()).redirect($$0, $$1x -> a((ep)$$1x.getSource(), fu.c($$1x, "targets"), fj.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         eq.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)eq.a("id", fq.a())
                     .suggests(amq.a)
                     .then(eq.a("value").redirect($$0, $$1x -> a((ep)$$1x.getSource(), amq.a($$1x), true, $$2))))
                  .then(eq.a("max").redirect($$0, $$1x -> a((ep)$$1x.getSource(), amq.a($$1x), false, $$2)))
            )
      );

      for (apv.c $$3 : apv.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a(
                                       "path", fh.a()
                                    )
                                    .then(
                                       eq.a("int")
                                          .then(
                                             eq.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (ep)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         fh.a($$2xx, "path"),
                                                         $$1xxx -> ux.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    eq.a("float")
                                       .then(
                                          eq.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (ep)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      fh.a($$2xx, "path"),
                                                      $$1xxx -> uv.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 eq.a("short")
                                    .then(
                                       eq.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (ep)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   fh.a($$2xx, "path"),
                                                   $$1xxx -> vk.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              eq.a("long")
                                 .then(
                                    eq.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (ep)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                fh.a($$2xx, "path"),
                                                $$1xxx -> va.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           eq.a("double")
                              .then(
                                 eq.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (ep)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             fh.a($$2xx, "path"),
                                             $$1xxx -> ut.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        eq.a("byte")
                           .then(
                              eq.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (ep)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          fh.a($$2xx, "path"),
                                          $$1xxx -> uq.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static ep a(ep $$0, Collection<ewu> $$1, ewn $$2, boolean $$3) {
      ewv $$4 = $$0.l().aK();
      return $$0.a(($$4x, $$5) -> {
         for (ewu $$6 : $$1) {
            ewt $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, em::chain);
   }

   private static ep a(ep $$0, amf $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, em::chain);
   }

   private static ep a(ep $$0, apu $$1, fh.g $$2, IntFunction<vp> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            us $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, em::chain);
   }

   private static boolean a(arf $$0, iz $$1) {
      dbf $$2 = new dbf($$1);
      dui $$3 = $$0.l().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == aqy.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ep, ?> a(CommandNode<ep> $$0, LiteralArgumentBuilder<ep> $$1, boolean $$2, el $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                    eq.a("block")
                                       .then(
                                          eq.a("pos", gl.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   eq.a("block", gh.a($$3)),
                                                   $$2,
                                                   $$0x -> gh.a($$0x, "block").test(new dsg(((ep)$$0x.getSource()).e(), gl.a($$0x, "pos"), true))
                                                )
                                             )
                                       )
                                 ))
                                 .then(
                                    eq.a("biome")
                                       .then(
                                          eq.a("pos", gl.a())
                                             .then(
                                                a(
                                                   $$0,
                                                   eq.a("biome", fs.a($$3, lq.az)),
                                                   $$2,
                                                   $$0x -> fs.a($$0x, "biome", lq.az).test(((ep)$$0x.getSource()).e().t(gl.a($$0x, "pos")))
                                                )
                                             )
                                       )
                                 ))
                              .then(eq.a("loaded").then(a($$0, eq.a("pos", gl.a()), $$2, $$0x -> a(((ep)$$0x.getSource()).e(), gl.b($$0x, "pos"))))))
                           .then(eq.a("dimension").then(a($$0, eq.a("dimension", fa.a()), $$2, $$0x -> fa.a($$0x, "dimension") == ((ep)$$0x.getSource()).e()))))
                        .then(
                           eq.a("score")
                              .then(
                                 eq.a("target", fu.a())
                                    .suggests(fu.a)
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a(
                                                            "targetObjective", fj.a()
                                                         )
                                                         .then(
                                                            eq.a("=")
                                                               .then(
                                                                  eq.a("source", fu.a())
                                                                     .suggests(fu.a)
                                                                     .then(
                                                                        a(
                                                                           $$0,
                                                                           eq.a("sourceObjective", fj.a()),
                                                                           $$2,
                                                                           $$0x -> a($$0x, (ang.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                        )
                                                                     )
                                                               )
                                                         ))
                                                      .then(
                                                         eq.a("<")
                                                            .then(
                                                               eq.a("source", fu.a())
                                                                  .suggests(fu.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        eq.a("sourceObjective", fj.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (ang.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      eq.a("<=")
                                                         .then(
                                                            eq.a("source", fu.a())
                                                               .suggests(fu.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     eq.a("sourceObjective", fj.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (ang.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   eq.a(">")
                                                      .then(
                                                         eq.a("source", fu.a())
                                                            .suggests(fu.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  eq.a("sourceObjective", fj.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (ang.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                eq.a(">=")
                                                   .then(
                                                      eq.a("source", fu.a())
                                                         .suggests(fu.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               eq.a("sourceObjective", fj.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (ang.e)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(eq.a("matches").then(a($$0, eq.a("range", fn.a()), $$2, $$0x -> a($$0x, fn.b.a($$0x, "range")))))
                                    )
                              )
                        ))
                     .then(
                        eq.a("blocks")
                           .then(
                              eq.a("start", gl.a())
                                 .then(
                                    eq.a("end", gl.a())
                                       .then(
                                          ((RequiredArgumentBuilder)eq.a("destination", gl.a()).then(a($$0, eq.a("all"), $$2, false)))
                                             .then(a($$0, eq.a("masked"), $$2, true))
                                       )
                                 )
                           )
                     ))
                  .then(
                     eq.a("entity")
                        .then(
                           ((RequiredArgumentBuilder)eq.a("entities", fc.b()).fork($$0, $$1x -> a($$1x, $$2, !fc.c($$1x, "entities").isEmpty())))
                              .executes(a($$2, (ang.b)($$0x -> fc.c($$0x, "entities").size())))
                        )
                  ))
               .then(eq.a("predicate").then(a($$0, eq.a("predicate", fr.c($$3)).suggests(f), $$2, $$0x -> a((ep)$$0x.getSource(), fr.c($$0x, "predicate"))))))
            .then(eq.a("function").then(eq.a("name", gx.a()).suggests(anl.b).fork($$0, new ang.d($$2)))))
         .then(
            ((LiteralArgumentBuilder)eq.a("items")
                  .then(
                     eq.a("entity")
                        .then(
                           eq.a("entities", fc.b())
                              .then(
                                 eq.a("slots", fy.a())
                                    .then(
                                       ((RequiredArgumentBuilder)eq.a("item_predicate", hb.a($$3))
                                             .fork($$0, $$1x -> a($$1x, $$2, a(fc.b($$1x, "entities"), fy.a($$1x, "slots"), hb.a($$1x, "item_predicate")) > 0)))
                                          .executes(a($$2, (ang.b)($$0x -> a(fc.b($$0x, "entities"), fy.a($$0x, "slots"), hb.a($$0x, "item_predicate")))))
                                    )
                              )
                        )
                  ))
               .then(
                  eq.a("block")
                     .then(
                        eq.a("pos", gl.a())
                           .then(
                              eq.a("slots", fy.a())
                                 .then(
                                    ((RequiredArgumentBuilder)eq.a("item_predicate", hb.a($$3))
                                          .fork(
                                             $$0,
                                             $$1x -> a(
                                                   $$1x, $$2, a((ep)$$1x.getSource(), gl.a($$1x, "pos"), fy.a($$1x, "slots"), hb.a($$1x, "item_predicate")) > 0
                                                )
                                          ))
                                       .executes(
                                          a($$2, (ang.b)($$0x -> a((ep)$$0x.getSource(), gl.a($$0x, "pos"), fy.a($$0x, "slots"), hb.a($$0x, "item_predicate"))))
                                       )
                                 )
                           )
                     )
               )
         );

      for (apv.c $$4 : apv.c) {
         $$1.then(
            $$4.a(
               eq.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)eq.a("path", fh.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), fh.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (ang.b)($$1xx -> a($$4.a($$1xx), fh.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static int a(Iterable<? extends bsu> $$0, crq $$1, Predicate<cup> $$2) {
      int $$3 = 0;

      for (bsu $$4 : $$0) {
         IntList $$5 = $$1.a();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            int $$7 = $$5.getInt($$6);
            buh $$8 = $$4.a_($$7);
            cup $$9 = $$8.a();
            if ($$2.test($$9)) {
               $$3 += $$9.I();
            }
         }
      }

      return $$3;
   }

   private static int a(ep $$0, iz $$1, crq $$2, Predicate<cup> $$3) throws CommandSyntaxException {
      int $$4 = 0;
      bqn $$5 = anq.a($$0, $$1, anq.b);
      int $$6 = $$5.b();
      IntList $$7 = $$2.a();

      for (int $$8 = 0; $$8 < $$7.size(); $$8++) {
         int $$9 = $$7.getInt($$8);
         if ($$9 >= 0 && $$9 < $$6) {
            cup $$10 = $$5.a($$9);
            if ($$3.test($$10)) {
               $$4 += $$10.I();
            }
         }
      }

      return $$4;
   }

   private static Command<ep> a(boolean $$0, ang.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ep)$$1x.getSource()).a(() -> xp.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ep)$$1x.getSource()).a(() -> xp.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(apu $$0, fh.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ep> $$0, ang.e $$1) throws CommandSyntaxException {
      ewu $$2 = fu.a($$0, "target");
      ewn $$3 = fj.a($$0, "targetObjective");
      ewu $$4 = fu.a($$0, "source");
      ewn $$5 = fj.a($$0, "sourceObjective");
      ewv $$6 = ((ep)$$0.getSource()).l().aK();
      ewr $$7 = $$6.d($$2, $$3);
      ewr $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<ep> $$0, de.d $$1) throws CommandSyntaxException {
      ewu $$2 = fu.a($$0, "target");
      ewn $$3 = fj.a($$0, "targetObjective");
      ewv $$4 = ((ep)$$0.getSource()).l().aK();
      ewr $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(ep $$0, ji<ets> $$1) {
      arf $$2 = $$0.e();
      eql $$3 = new eql.a($$2).a(ete.f, $$0.d()).b(ete.a, $$0.f()).a(etd.d);
      eqi $$4 = new eqi.a($$3).a(Optional.empty());
      $$4.b(eqi.a($$1.a()));
      return $$1.a().test($$4);
   }

   private static Collection<ep> a(CommandContext<ep> $$0, boolean $$1, boolean $$2) {
      return (Collection<ep>)($$2 == $$1 ? Collections.singleton((ep)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ep, ?> a(CommandNode<ep> $$0, ArgumentBuilder<ep, ?> $$1, boolean $$2, ang.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ep)$$2x.getSource()).a(() -> xp.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<ep, ?> a(CommandNode<ep> $$0, ArgumentBuilder<ep, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<ep> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((ep)$$0.getSource()).a(() -> xp.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<ep> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((ep)$$0.getSource()).a(() -> xp.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ep> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ep)$$0.getSource()).e(), gl.a($$0, "start"), gl.a($$0, "end"), gl.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(arf $$0, iz $$1, iz $$2, iz $$3, boolean $$4) throws CommandSyntaxException {
      eic $$5 = eic.a($$1, $$2);
      eic $$6 = eic.a($$3, $$3.a($$5.c()));
      iz $$7 = new iz($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         jw $$9 = $$0.H_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  iz $$14 = new iz($$13, $$12, $$11);
                  iz $$15 = $$14.a((kd)$$7);
                  dsc $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dfb.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dph $$17 = $$0.c_($$14);
                     dph $$18 = $$0.c_($$15);
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

                        us $$19 = $$17.e($$9);
                        us $$20 = $$18.e($$9);
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

   private static RedirectModifier<ep> a(Function<bsu, Optional<bsu>> $$0) {
      return $$1 -> {
         ep $$2 = (ep)$$1.getSource();
         bsu $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dK()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ep> b(Function<bsu, Stream<bsu>> $$0) {
      return $$1 -> {
         ep $$2 = (ep)$$1.getSource();
         bsu $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dK()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ep> a(CommandNode<ep> $$0, LiteralArgumentBuilder<ep> $$1) {
      return (LiteralArgumentBuilder<ep>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              eq.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<bsu, Optional<bsu>>)($$0x -> $$0x instanceof btx $$1x ? Optional.ofNullable($$1x.P_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              eq.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<bsu, Optional<bsu>>)($$0x -> $$0x instanceof btr $$1x ? Optional.ofNullable($$1x.gf()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           eq.a("target")
                              .fork($$0, a((Function<bsu, Optional<bsu>>)($$0x -> $$0x instanceof bun $$1x ? Optional.ofNullable($$1x.p()) : Optional.empty())))
                        ))
                     .then(
                        eq.a("attacker")
                           .fork($$0, a((Function<bsu, Optional<bsu>>)($$0x -> $$0x instanceof bsr $$1x ? Optional.ofNullable($$1x.T_()) : Optional.empty())))
                     ))
                  .then(eq.a("vehicle").fork($$0, a((Function<bsu, Optional<bsu>>)($$0x -> Optional.ofNullable($$0x.dc()))))))
               .then(eq.a("controller").fork($$0, a((Function<bsu, Optional<bsu>>)($$0x -> Optional.ofNullable($$0x.cQ()))))))
            .then(
               eq.a("origin").fork($$0, a((Function<bsu, Optional<bsu>>)($$0x -> $$0x instanceof buo $$1x ? Optional.ofNullable($$1x.s()) : Optional.empty())))
            ))
         .then(eq.a("passengers").fork($$0, b((Function<bsu, Stream<bsu>>)($$0x -> $$0x.cS().stream()))));
   }

   private static ep a(ep $$0, ji.c<bta<?>> $$1) throws CommandSyntaxException {
      bsu $$2 = ape.a($$0, $$1, $$0.d(), new us(), true);
      return $$0.a($$2);
   }

   public static <T extends er<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable us $$5, hp<T> $$6, ang.a<T, Collection<ib<T>>> $$7, hj $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<ib<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<id<T>> $$14 = new ArrayList<>($$13);

         try {
            for (ib<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x()));
               } catch (es var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            em $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new hz<>($$2x -> {
               for (id<T> $$3x : $$14) {
                  $$2x.a(new hv<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(hy.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new hu.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<ep> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<ep> var1) throws CommandSyntaxException;
   }

   static class d implements hm.a<ep> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ep $$0, List<ep> $$1, ContextChain<ep> $$2, hj $$3, hp<ep> $$4) {
         ang.a($$0, $$1, anl::a, this.a, $$2, null, $$4, $$0x -> gx.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
