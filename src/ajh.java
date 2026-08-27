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
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ajh {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> vg.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vg.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vg.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> vg.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<ds> f = ($$0, $$1) -> {
      ehi $$2 = ((ds)$$0.getSource()).l().aJ();
      return dx.a($$2.a(ehk.a), $$1);
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
                                          .then(dt.a("as").then(dt.a("targets", ef.b()).fork($$2, $$0x -> {
                                             List<ds> $$1x = Lists.newArrayList();

                                             for (blw $$2x : ef.c($$0x, "targets")) {
                                                $$1x.add(((ds)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dt.a("at").then(dt.a("targets", ef.b()).fork($$2, $$0x -> {
                                          List<ds> $$1x = Lists.newArrayList();

                                          for (blw $$2x : ef.c($$0x, "targets")) {
                                             $$1x.add(((ds)$$0x.getSource()).a((ane)$$2x.dL()).a($$2x.dj()).a($$2x.bG()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)dt.a("store").then(a($$2, dt.a("result"), true))).then(a($$2, dt.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("positioned")
                                             .then(dt.a("pos", ft.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(ft.a($$0x, "pos")).a(ee.a.a))))
                                          .then(dt.a("as").then(dt.a("targets", ef.b()).fork($$2, $$0x -> {
                                             List<ds> $$1x = Lists.newArrayList();

                                             for (blw $$2x : ef.c($$0x, "targets")) {
                                                $$1x.add(((ds)$$0x.getSource()).a($$2x.dj()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dt.a("over").then(dt.a("heightmap", ei.a()).redirect($$2, $$0x -> {
                                          emc $$1x = ((ds)$$0x.getSource()).d();
                                          ane $$2x = ((ds)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(iz.b($$3), iz.b($$4))) {
                                             throw fm.a.create();
                                          } else {
                                             int $$5 = $$2x.a(ei.a($$0x, "heightmap"), aup.a($$3), aup.a($$4));
                                             return ((ds)$$0x.getSource()).a(new emc($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)dt.a("rotated")
                                       .then(dt.a("rot", fq.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(fq.a($$0x, "rot").b((ds)$$0x.getSource())))))
                                    .then(dt.a("as").then(dt.a("targets", ef.b()).fork($$2, $$0x -> {
                                       List<ds> $$1x = Lists.newArrayList();

                                       for (blw $$2x : ef.c($$0x, "targets")) {
                                          $$1x.add(((ds)$$0x.getSource()).a($$2x.bG()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dt.a("facing")
                                    .then(dt.a("entity").then(dt.a("targets", ef.b()).then(dt.a("anchor", ee.a()).fork($$2, $$0x -> {
                                       List<ds> $$1x = Lists.newArrayList();
                                       ee.a $$2x = ee.a($$0x, "anchor");

                                       for (blw $$3 : ef.c($$0x, "targets")) {
                                          $$1x.add(((ds)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(dt.a("pos", ft.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).b(ft.a($$0x, "pos"))))
                           ))
                        .then(
                           dt.a("align")
                              .then(dt.a("axes", fr.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(((ds)$$0x.getSource()).d().a(fr.a($$0x, "axes")))))
                        ))
                     .then(dt.a("anchored").then(dt.a("anchor", ee.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(ee.a($$0x, "anchor"))))))
                  .then(dt.a("in").then(dt.a("dimension", ed.a()).redirect($$2, $$0x -> ((ds)$$0x.getSource()).a(ed.a($$0x, "dimension"))))))
               .then(dt.a("summon").then(dt.a("entity", er.a($$1, ke.u)).suggests(hn.d).redirect($$2, $$0x -> a((ds)$$0x.getSource(), er.e($$0x, "entity"))))))
            .then(a($$2, dt.a("on")))
      );
   }

   private static ArgumentBuilder<ds, ?> a(LiteralCommandNode<ds> $$0, LiteralArgumentBuilder<ds> $$1, boolean $$2) {
      $$1.then(
         dt.a("score")
            .then(
               dt.a("targets", ew.b())
                  .suggests(ew.a)
                  .then(dt.a("objective", em.a()).redirect($$0, $$1x -> a((ds)$$1x.getSource(), ew.c($$1x, "targets"), em.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         dt.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)dt.a("id", et.a())
                     .suggests(air.a)
                     .then(dt.a("value").redirect($$0, $$1x -> a((ds)$$1x.getSource(), air.a($$1x), true, $$2))))
                  .then(dt.a("max").redirect($$0, $$1x -> a((ds)$$1x.getSource(), air.a($$1x), false, $$2)))
            )
      );

      for (alv.c $$3 : alv.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                       "path", ek.a()
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
                                                         ek.a($$2xx, "path"),
                                                         $$1xxx -> st.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                                      ek.a($$2xx, "path"),
                                                      $$1xxx -> sr.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                                   ek.a($$2xx, "path"),
                                                   $$1xxx -> tg.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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
                                                ek.a($$2xx, "path"),
                                                $$1xxx -> sw.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                             ek.a($$2xx, "path"),
                                             $$1xxx -> sp.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
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
                                          ek.a($$2xx, "path"),
                                          $$1xxx -> sm.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static ds a(ds $$0, Collection<enf> $$1, emy $$2, boolean $$3) {
      eng $$4 = $$0.l().aH();
      return $$0.a(($$4x, $$5) -> {
         for (enf $$6 : $$1) {
            ene $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, dp::chain);
   }

   private static ds a(ds $$0, aig $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, dp::chain);
   }

   private static ds a(ds $$0, alu $$1, ek.g $$2, IntFunction<tl> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            so $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, dp::chain);
   }

   private static boolean a(ane $$0, hx $$1) {
      cte $$2 = new cte($$1);
      dlw $$3 = $$0.l().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == amx.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<ds, ?> a(CommandNode<ds> $$0, LiteralArgumentBuilder<ds> $$1, boolean $$2, dn $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                 dt.a("block")
                                    .then(
                                       dt.a("pos", fm.a())
                                          .then(
                                             a(
                                                $$0,
                                                dt.a("block", fi.a($$3)),
                                                $$2,
                                                $$0x -> fi.a($$0x, "block").test(new djt(((ds)$$0x.getSource()).e(), fm.a($$0x, "pos"), true))
                                             )
                                          )
                                    )
                              ))
                              .then(
                                 dt.a("biome")
                                    .then(
                                       dt.a("pos", fm.a())
                                          .then(
                                             a(
                                                $$0,
                                                dt.a("biome", eu.a($$3, ke.at)),
                                                $$2,
                                                $$0x -> eu.a($$0x, "biome", ke.at).test(((ds)$$0x.getSource()).e().t(fm.a($$0x, "pos")))
                                             )
                                          )
                                    )
                              ))
                           .then(dt.a("loaded").then(a($$0, dt.a("pos", fm.a()), $$2, $$0x -> a(((ds)$$0x.getSource()).e(), fm.b($$0x, "pos"))))))
                        .then(dt.a("dimension").then(a($$0, dt.a("dimension", ed.a()), $$2, $$0x -> ed.a($$0x, "dimension") == ((ds)$$0x.getSource()).e()))))
                     .then(
                        dt.a("score")
                           .then(
                              dt.a("target", ew.a())
                                 .suggests(ew.a)
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                                         "targetObjective", em.a()
                                                      )
                                                      .then(
                                                         dt.a("=")
                                                            .then(
                                                               dt.a("source", ew.a())
                                                                  .suggests(ew.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        dt.a("sourceObjective", em.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (ajh.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      dt.a("<")
                                                         .then(
                                                            dt.a("source", ew.a())
                                                               .suggests(ew.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     dt.a("sourceObjective", em.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (ajh.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("<=")
                                                      .then(
                                                         dt.a("source", ew.a())
                                                            .suggests(ew.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  dt.a("sourceObjective", em.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (ajh.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                dt.a(">")
                                                   .then(
                                                      dt.a("source", ew.a())
                                                         .suggests(ew.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               dt.a("sourceObjective", em.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (ajh.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             dt.a(">=")
                                                .then(
                                                   dt.a("source", ew.a())
                                                      .suggests(ew.a)
                                                      .then(
                                                         a($$0, dt.a("sourceObjective", em.a()), $$2, $$0x -> a($$0x, (ajh.e)(($$0xx, $$1x) -> $$0xx >= $$1x)))
                                                      )
                                                )
                                          ))
                                       .then(dt.a("matches").then(a($$0, dt.a("range", eq.a()), $$2, $$0x -> a($$0x, eq.b.a($$0x, "range")))))
                                 )
                           )
                     ))
                  .then(
                     dt.a("blocks")
                        .then(
                           dt.a("start", fm.a())
                              .then(
                                 dt.a("end", fm.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dt.a("destination", fm.a()).then(a($$0, dt.a("all"), $$2, false)))
                                          .then(a($$0, dt.a("masked"), $$2, true))
                                    )
                              )
                        )
                  ))
               .then(
                  dt.a("entity")
                     .then(
                        ((RequiredArgumentBuilder)dt.a("entities", ef.b()).fork($$0, $$1x -> a($$1x, $$2, !ef.c($$1x, "entities").isEmpty())))
                           .executes(a($$2, (ajh.b)($$0x -> ef.c($$0x, "entities").size())))
                     )
               ))
            .then(dt.a("predicate").then(a($$0, dt.a("predicate", et.a()).suggests(f), $$2, $$0x -> a((ds)$$0x.getSource(), et.c($$0x, "predicate"))))))
         .then(dt.a("function").then(dt.a("name", fx.a()).suggests(ajm.b).fork($$0, new ajh.d($$2))));

      for (alv.c $$4 : alv.c) {
         $$1.then(
            $$4.a(
               dt.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)dt.a("path", ek.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), ek.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (ajh.b)($$1xx -> a($$4.a($$1xx), ek.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static Command<ds> a(boolean $$0, ajh.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((ds)$$1x.getSource()).a(() -> vg.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((ds)$$1x.getSource()).a(() -> vg.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(alu $$0, ek.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<ds> $$0, ajh.e $$1) throws CommandSyntaxException {
      enf $$2 = ew.a($$0, "target");
      emy $$3 = em.a($$0, "targetObjective");
      enf $$4 = ew.a($$0, "source");
      emy $$5 = em.a($$0, "sourceObjective");
      eng $$6 = ((ds)$$0.getSource()).l().aH();
      enc $$7 = $$6.d($$2, $$3);
      enc $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<ds> $$0, ck.d $$1) throws CommandSyntaxException {
      enf $$2 = ew.a($$0, "target");
      emy $$3 = em.a($$0, "targetObjective");
      eng $$4 = ((ds)$$0.getSource()).l().aH();
      enc $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(ds $$0, eke $$1) {
      ane $$2 = $$0.e();
      ehl $$3 = new ehl.a($$2).a(ejq.f, $$0.d()).b(ejq.a, $$0.f()).a(ejp.d);
      ehf $$4 = new ehf.a($$3).a(Optional.empty());
      $$4.b(ehf.a($$1));
      return $$1.test($$4);
   }

   private static Collection<ds> a(CommandContext<ds> $$0, boolean $$1, boolean $$2) {
      return (Collection<ds>)($$2 == $$1 ? Collections.singleton((ds)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<ds, ?> a(CommandNode<ds> $$0, ArgumentBuilder<ds, ?> $$1, boolean $$2, ajh.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((ds)$$2x.getSource()).a(() -> vg.c("commands.execute.conditional.pass"), false);
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
         ((ds)$$0.getSource()).a(() -> vg.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
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
         ((ds)$$0.getSource()).a(() -> vg.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<ds> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((ds)$$0.getSource()).e(), fm.a($$0, "start"), fm.a($$0, "end"), fm.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(ane $$0, hx $$1, hx $$2, hx $$3, boolean $$4) throws CommandSyntaxException {
      dzg $$5 = dzg.a($$1, $$2);
      dzg $$6 = dzg.a($$3, $$3.a($$5.c()));
      hx $$7 = new hx($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         int $$9 = 0;

         for (int $$10 = $$5.j(); $$10 <= $$5.m(); $$10++) {
            for (int $$11 = $$5.i(); $$11 <= $$5.l(); $$11++) {
               for (int $$12 = $$5.h(); $$12 <= $$5.k(); $$12++) {
                  hx $$13 = new hx($$12, $$11, $$10);
                  hx $$14 = $$13.a((jb)$$7);
                  djp $$15 = $$0.a_($$13);
                  if (!$$4 || !$$15.a(cxa.a)) {
                     if ($$15 != $$0.a_($$14)) {
                        return OptionalInt.empty();
                     }

                     dhd $$16 = $$0.c_($$13);
                     dhd $$17 = $$0.c_($$14);
                     if ($$16 != null) {
                        if ($$17 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$17.v() != $$16.v()) {
                           return OptionalInt.empty();
                        }

                        so $$18 = $$16.q();
                        so $$19 = $$17.q();
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

   private static RedirectModifier<ds> a(Function<blw, Optional<blw>> $$0) {
      return $$1 -> {
         ds $$2 = (ds)$$1.getSource();
         blw $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dG()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<ds> b(Function<blw, Stream<blw>> $$0) {
      return $$1 -> {
         ds $$2 = (ds)$$1.getSource();
         blw $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dG()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<ds> a(CommandNode<ds> $$0, LiteralArgumentBuilder<ds> $$1) {
      return (LiteralArgumentBuilder<ds>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              dt.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<blw, Optional<blw>>)($$0x -> $$0x instanceof bmw $$1x ? Optional.ofNullable($$1x.R_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              dt.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<blw, Optional<blw>>)($$0x -> $$0x instanceof bmq $$1x ? Optional.ofNullable($$1x.fU()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           dt.a("target")
                              .fork($$0, a((Function<blw, Optional<blw>>)($$0x -> $$0x instanceof bnk $$1x ? Optional.ofNullable($$1x.q()) : Optional.empty())))
                        ))
                     .then(
                        dt.a("attacker")
                           .fork($$0, a((Function<blw, Optional<blw>>)($$0x -> $$0x instanceof blu $$1x ? Optional.ofNullable($$1x.V_()) : Optional.empty())))
                     ))
                  .then(dt.a("vehicle").fork($$0, a((Function<blw, Optional<blw>>)($$0x -> Optional.ofNullable($$0x.cZ()))))))
               .then(dt.a("controller").fork($$0, a((Function<blw, Optional<blw>>)($$0x -> Optional.ofNullable($$0x.cN()))))))
            .then(
               dt.a("origin").fork($$0, a((Function<blw, Optional<blw>>)($$0x -> $$0x instanceof bnl $$1x ? Optional.ofNullable($$1x.w()) : Optional.empty())))
            ))
         .then(dt.a("passengers").fork($$0, b((Function<blw, Stream<blw>>)($$0x -> $$0x.cP().stream()))));
   }

   private static ds a(ds $$0, ih.c<bmc<?>> $$1) throws CommandSyntaxException {
      blw $$2 = alf.a($$0, $$1, $$0.d(), new so(), true);
      return $$0.a($$2);
   }

   public static <T extends du<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable so $$5, gp<T> $$6, ajh.a<T, Collection<hb<T>>> $$7, gj $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<hb<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<hd<T>> $$14 = new ArrayList<>($$13);

         try {
            for (hb<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x()));
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
            $$6.a(new gz<>($$2x -> {
               for (hd<T> $$3x : $$14) {
                  $$2x.a(new gv<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(gy.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new gu.a<>($$22, $$21, $$8, $$0, $$9));
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

   static class d implements gm.a<ds> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(ds $$0, List<ds> $$1, ContextChain<ds> $$2, gj $$3, gp<ds> $$4) {
         ajh.a($$0, $$1, ajm::a, this.a, $$2, null, $$4, $$0x -> fx.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
