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

public class alh {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> vu.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vu.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vu.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> vu.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<du> f = ($$0, $$1) -> {
      ekz $$2 = ((du)$$0.getSource()).l().aM();
      return dz.a($$2.a(elb.a), $$1);
   };

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      LiteralCommandNode<du> $$2 = $$0.register((LiteralArgumentBuilder)dv.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(dv.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, dv.a("if"), true, $$1)))
                                             .then(a($$2, dv.a("unless"), false, $$1)))
                                          .then(dv.a("as").then(dv.a("targets", eh.b()).fork($$2, $$0x -> {
                                             List<du> $$1x = Lists.newArrayList();

                                             for (box $$2x : eh.c($$0x, "targets")) {
                                                $$1x.add(((du)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dv.a("at").then(dv.a("targets", eh.b()).fork($$2, $$0x -> {
                                          List<du> $$1x = Lists.newArrayList();

                                          for (box $$2x : eh.c($$0x, "targets")) {
                                             $$1x.add(((du)$$0x.getSource()).a((apf)$$2x.dM()).a($$2x.dk()).a($$2x.bJ()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)dv.a("store").then(a($$2, dv.a("result"), true))).then(a($$2, dv.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("positioned")
                                             .then(dv.a("pos", fv.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(fv.a($$0x, "pos")).a(eg.a.a))))
                                          .then(dv.a("as").then(dv.a("targets", eh.b()).fork($$2, $$0x -> {
                                             List<du> $$1x = Lists.newArrayList();

                                             for (box $$2x : eh.c($$0x, "targets")) {
                                                $$1x.add(((du)$$0x.getSource()).a($$2x.dk()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dv.a("over").then(dv.a("heightmap", ek.a()).redirect($$2, $$0x -> {
                                          ept $$1x = ((du)$$0x.getSource()).d();
                                          apf $$2x = ((du)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(je.b($$3), je.b($$4))) {
                                             throw fo.a.create();
                                          } else {
                                             int $$5 = $$2x.a(ek.a($$0x, "heightmap"), aww.a($$3), aww.a($$4));
                                             return ((du)$$0x.getSource()).a(new ept($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)dv.a("rotated")
                                       .then(dv.a("rot", fs.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(fs.a($$0x, "rot").b((du)$$0x.getSource())))))
                                    .then(dv.a("as").then(dv.a("targets", eh.b()).fork($$2, $$0x -> {
                                       List<du> $$1x = Lists.newArrayList();

                                       for (box $$2x : eh.c($$0x, "targets")) {
                                          $$1x.add(((du)$$0x.getSource()).a($$2x.bJ()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dv.a("facing")
                                    .then(dv.a("entity").then(dv.a("targets", eh.b()).then(dv.a("anchor", eg.a()).fork($$2, $$0x -> {
                                       List<du> $$1x = Lists.newArrayList();
                                       eg.a $$2x = eg.a($$0x, "anchor");

                                       for (box $$3 : eh.c($$0x, "targets")) {
                                          $$1x.add(((du)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(dv.a("pos", fv.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).b(fv.a($$0x, "pos"))))
                           ))
                        .then(
                           dv.a("align")
                              .then(dv.a("axes", ft.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(((du)$$0x.getSource()).d().a(ft.a($$0x, "axes")))))
                        ))
                     .then(dv.a("anchored").then(dv.a("anchor", eg.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(eg.a($$0x, "anchor"))))))
                  .then(dv.a("in").then(dv.a("dimension", ef.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(ef.a($$0x, "dimension"))))))
               .then(dv.a("summon").then(dv.a("entity", et.a($$1, kj.u)).suggests(hr.d).redirect($$2, $$0x -> a((du)$$0x.getSource(), et.e($$0x, "entity"))))))
            .then(a($$2, dv.a("on")))
      );
   }

   private static ArgumentBuilder<du, ?> a(LiteralCommandNode<du> $$0, LiteralArgumentBuilder<du> $$1, boolean $$2) {
      $$1.then(
         dv.a("score")
            .then(
               dv.a("targets", ey.b())
                  .suggests(ey.a)
                  .then(dv.a("objective", eo.a()).redirect($$0, $$1x -> a((du)$$1x.getSource(), ey.c($$1x, "targets"), eo.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         dv.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)dv.a("id", ev.a())
                     .suggests(akr.a)
                     .then(dv.a("value").redirect($$0, $$1x -> a((du)$$1x.getSource(), akr.a($$1x), true, $$2))))
                  .then(dv.a("max").redirect($$0, $$1x -> a((du)$$1x.getSource(), akr.a($$1x), false, $$2)))
            )
      );

      for (anw.c $$3 : anw.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                       "path", em.a()
                                    )
                                    .then(
                                       dv.a("int")
                                          .then(
                                             dv.a("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   $$0,
                                                   $$2xx -> a(
                                                         (du)$$2xx.getSource(),
                                                         $$3.a($$2xx),
                                                         em.a($$2xx, "path"),
                                                         $$1xxx -> tf.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                         $$2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dv.a("float")
                                       .then(
                                          dv.a("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                $$0,
                                                $$2xx -> a(
                                                      (du)$$2xx.getSource(),
                                                      $$3.a($$2xx),
                                                      em.a($$2xx, "path"),
                                                      $$1xxx -> td.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                      $$2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dv.a("short")
                                    .then(
                                       dv.a("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             $$0,
                                             $$2xx -> a(
                                                   (du)$$2xx.getSource(),
                                                   $$3.a($$2xx),
                                                   em.a($$2xx, "path"),
                                                   $$1xxx -> ts.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
                                                   $$2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              dv.a("long")
                                 .then(
                                    dv.a("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          $$0,
                                          $$2xx -> a(
                                                (du)$$2xx.getSource(),
                                                $$3.a($$2xx),
                                                em.a($$2xx, "path"),
                                                $$1xxx -> ti.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
                                                $$2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           dv.a("double")
                              .then(
                                 dv.a("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       $$0,
                                       $$2xx -> a(
                                             (du)$$2xx.getSource(),
                                             $$3.a($$2xx),
                                             em.a($$2xx, "path"),
                                             $$1xxx -> tb.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
                                             $$2
                                          )
                                    )
                              )
                        ))
                     .then(
                        dv.a("byte")
                           .then(
                              dv.a("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    $$0,
                                    $$2xx -> a(
                                          (du)$$2xx.getSource(),
                                          $$3.a($$2xx),
                                          em.a($$2xx, "path"),
                                          $$1xxx -> sy.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static du a(du $$0, Collection<eqw> $$1, eqp $$2, boolean $$3) {
      eqx $$4 = $$0.l().aK();
      return $$0.a(($$4x, $$5) -> {
         for (eqw $$6 : $$1) {
            eqv $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, dr::chain);
   }

   private static du a(du $$0, akg $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, dr::chain);
   }

   private static du a(du $$0, anv $$1, em.g $$2, IntFunction<tx> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            ta $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, dr::chain);
   }

   private static boolean a(apf $$0, ib $$1) {
      cwi $$2 = new cwi($$1);
      dpi $$3 = $$0.l().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == aoy.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<du, ?> a(CommandNode<du> $$0, LiteralArgumentBuilder<du> $$1, boolean $$2, dq $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                 dv.a("block")
                                    .then(
                                       dv.a("pos", fo.a())
                                          .then(
                                             a(
                                                $$0,
                                                dv.a("block", fk.a($$3)),
                                                $$2,
                                                $$0x -> fk.a($$0x, "block").test(new dnf(((du)$$0x.getSource()).e(), fo.a($$0x, "pos"), true))
                                             )
                                          )
                                    )
                              ))
                              .then(
                                 dv.a("biome")
                                    .then(
                                       dv.a("pos", fo.a())
                                          .then(
                                             a(
                                                $$0,
                                                dv.a("biome", ew.a($$3, kj.au)),
                                                $$2,
                                                $$0x -> ew.a($$0x, "biome", kj.au).test(((du)$$0x.getSource()).e().t(fo.a($$0x, "pos")))
                                             )
                                          )
                                    )
                              ))
                           .then(dv.a("loaded").then(a($$0, dv.a("pos", fo.a()), $$2, $$0x -> a(((du)$$0x.getSource()).e(), fo.b($$0x, "pos"))))))
                        .then(dv.a("dimension").then(a($$0, dv.a("dimension", ef.a()), $$2, $$0x -> ef.a($$0x, "dimension") == ((du)$$0x.getSource()).e()))))
                     .then(
                        dv.a("score")
                           .then(
                              dv.a("target", ey.a())
                                 .suggests(ey.a)
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                                         "targetObjective", eo.a()
                                                      )
                                                      .then(
                                                         dv.a("=")
                                                            .then(
                                                               dv.a("source", ey.a())
                                                                  .suggests(ey.a)
                                                                  .then(
                                                                     a(
                                                                        $$0,
                                                                        dv.a("sourceObjective", eo.a()),
                                                                        $$2,
                                                                        $$0x -> a($$0x, (alh.e)(($$0xx, $$1x) -> $$0xx == $$1x))
                                                                     )
                                                                  )
                                                            )
                                                      ))
                                                   .then(
                                                      dv.a("<")
                                                         .then(
                                                            dv.a("source", ey.a())
                                                               .suggests(ey.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     dv.a("sourceObjective", eo.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (alh.e)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("<=")
                                                      .then(
                                                         dv.a("source", ey.a())
                                                            .suggests(ey.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  dv.a("sourceObjective", eo.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (alh.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                dv.a(">")
                                                   .then(
                                                      dv.a("source", ey.a())
                                                         .suggests(ey.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               dv.a("sourceObjective", eo.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (alh.e)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             dv.a(">=")
                                                .then(
                                                   dv.a("source", ey.a())
                                                      .suggests(ey.a)
                                                      .then(
                                                         a($$0, dv.a("sourceObjective", eo.a()), $$2, $$0x -> a($$0x, (alh.e)(($$0xx, $$1x) -> $$0xx >= $$1x)))
                                                      )
                                                )
                                          ))
                                       .then(dv.a("matches").then(a($$0, dv.a("range", es.a()), $$2, $$0x -> a($$0x, es.b.a($$0x, "range")))))
                                 )
                           )
                     ))
                  .then(
                     dv.a("blocks")
                        .then(
                           dv.a("start", fo.a())
                              .then(
                                 dv.a("end", fo.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dv.a("destination", fo.a()).then(a($$0, dv.a("all"), $$2, false)))
                                          .then(a($$0, dv.a("masked"), $$2, true))
                                    )
                              )
                        )
                  ))
               .then(
                  dv.a("entity")
                     .then(
                        ((RequiredArgumentBuilder)dv.a("entities", eh.b()).fork($$0, $$1x -> a($$1x, $$2, !eh.c($$1x, "entities").isEmpty())))
                           .executes(a($$2, (alh.b)($$0x -> eh.c($$0x, "entities").size())))
                     )
               ))
            .then(dv.a("predicate").then(a($$0, dv.a("predicate", ev.a()).suggests(f), $$2, $$0x -> a((du)$$0x.getSource(), ev.c($$0x, "predicate"))))))
         .then(dv.a("function").then(dv.a("name", fz.a()).suggests(alm.b).fork($$0, new alh.d($$2))));

      for (anw.c $$4 : anw.c) {
         $$1.then(
            $$4.a(
               dv.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)dv.a("path", em.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), em.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (alh.b)($$1xx -> a($$4.a($$1xx), em.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static Command<du> a(boolean $$0, alh.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((du)$$1x.getSource()).a(() -> vu.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((du)$$1x.getSource()).a(() -> vu.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(anv $$0, em.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<du> $$0, alh.e $$1) throws CommandSyntaxException {
      eqw $$2 = ey.a($$0, "target");
      eqp $$3 = eo.a($$0, "targetObjective");
      eqw $$4 = ey.a($$0, "source");
      eqp $$5 = eo.a($$0, "sourceObjective");
      eqx $$6 = ((du)$$0.getSource()).l().aK();
      eqt $$7 = $$6.d($$2, $$3);
      eqt $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<du> $$0, cm.d $$1) throws CommandSyntaxException {
      eqw $$2 = ey.a($$0, "target");
      eqp $$3 = eo.a($$0, "targetObjective");
      eqx $$4 = ((du)$$0.getSource()).l().aK();
      eqt $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(du $$0, env $$1) {
      apf $$2 = $$0.e();
      elc $$3 = new elc.a($$2).a(enh.f, $$0.d()).b(enh.a, $$0.f()).a(eng.d);
      ekw $$4 = new ekw.a($$3).a(Optional.empty());
      $$4.b(ekw.a($$1));
      return $$1.test($$4);
   }

   private static Collection<du> a(CommandContext<du> $$0, boolean $$1, boolean $$2) {
      return (Collection<du>)($$2 == $$1 ? Collections.singleton((du)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<du, ?> a(CommandNode<du> $$0, ArgumentBuilder<du, ?> $$1, boolean $$2, alh.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((du)$$2x.getSource()).a(() -> vu.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create();
         }
      });
   }

   private static ArgumentBuilder<du, ?> a(CommandNode<du> $$0, ArgumentBuilder<du, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<du> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((du)$$0.getSource()).a(() -> vu.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw d.create();
      }
   }

   private static int b(CommandContext<du> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw e.create($$2.getAsInt());
      } else {
         ((du)$$0.getSource()).a(() -> vu.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<du> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((du)$$0.getSource()).e(), fo.a($$0, "start"), fo.a($$0, "end"), fo.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(apf $$0, ib $$1, ib $$2, ib $$3, boolean $$4) throws CommandSyntaxException {
      ecw $$5 = ecw.a($$1, $$2);
      ecw $$6 = ecw.a($$3, $$3.a($$5.c()));
      ib $$7 = new ib($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         iz $$9 = $$0.H_();
         int $$10 = 0;

         for (int $$11 = $$5.j(); $$11 <= $$5.m(); $$11++) {
            for (int $$12 = $$5.i(); $$12 <= $$5.l(); $$12++) {
               for (int $$13 = $$5.h(); $$13 <= $$5.k(); $$13++) {
                  ib $$14 = new ib($$13, $$12, $$11);
                  ib $$15 = $$14.a((jg)$$7);
                  dnb $$16 = $$0.a_($$14);
                  if (!$$4 || !$$16.a(dae.a)) {
                     if ($$16 != $$0.a_($$15)) {
                        return OptionalInt.empty();
                     }

                     dki $$17 = $$0.c_($$14);
                     dki $$18 = $$0.c_($$15);
                     if ($$17 != null) {
                        if ($$18 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$18.r() != $$17.r()) {
                           return OptionalInt.empty();
                        }

                        ta $$19 = $$17.d($$9);
                        ta $$20 = $$18.d($$9);
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

   private static RedirectModifier<du> a(Function<box, Optional<box>> $$0) {
      return $$1 -> {
         du $$2 = (du)$$1.getSource();
         box $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dH()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<du> b(Function<box, Stream<box>> $$0) {
      return $$1 -> {
         du $$2 = (du)$$1.getSource();
         box $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dH()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<du> a(CommandNode<du> $$0, LiteralArgumentBuilder<du> $$1) {
      return (LiteralArgumentBuilder<du>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              dv.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<box, Optional<box>>)($$0x -> $$0x instanceof bpw $$1x ? Optional.ofNullable($$1x.P_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              dv.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<box, Optional<box>>)($$0x -> $$0x instanceof bpr $$1x ? Optional.ofNullable($$1x.gc()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           dv.a("target")
                              .fork($$0, a((Function<box, Optional<box>>)($$0x -> $$0x instanceof bqm $$1x ? Optional.ofNullable($$1x.p()) : Optional.empty())))
                        ))
                     .then(
                        dv.a("attacker")
                           .fork($$0, a((Function<box, Optional<box>>)($$0x -> $$0x instanceof bov $$1x ? Optional.ofNullable($$1x.T_()) : Optional.empty())))
                     ))
                  .then(dv.a("vehicle").fork($$0, a((Function<box, Optional<box>>)($$0x -> Optional.ofNullable($$0x.cZ()))))))
               .then(dv.a("controller").fork($$0, a((Function<box, Optional<box>>)($$0x -> Optional.ofNullable($$0x.cN()))))))
            .then(
               dv.a("origin")
                  .fork($$0, a((Function<box, Optional<box>>)($$0x -> $$0x instanceof bqn $$1x ? Optional.ofNullable($$1x.af_()) : Optional.empty())))
            ))
         .then(dv.a("passengers").fork($$0, b((Function<box, Stream<box>>)($$0x -> $$0x.cP().stream()))));
   }

   private static du a(du $$0, il.c<bpd<?>> $$1) throws CommandSyntaxException {
      box $$2 = anf.a($$0, $$1, $$0.d(), new ta(), true);
      return $$0.a($$2);
   }

   public static <T extends dw<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable ta $$5, gt<T> $$6, alh.a<T, Collection<hf<T>>> $$7, gn $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<hf<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<hh<T>> $$14 = new ArrayList<>($$13);

         try {
            for (hf<T> $$15 : $$10) {
               try {
                  $$14.add($$15.a($$5, $$0.x()));
               } catch (dx var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            dr $$20 = ($$3x, $$4x) -> {
               if ($$3.test($$4x)) {
                  $$9.add($$18);
               }
            };
            $$6.a(new hd<>($$2x -> {
               for (hh<T> $$3x : $$14) {
                  $$2x.a(new gz<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(hc.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new gy.a<>($$22, $$21, $$8, $$0, $$9));
      }
   }

   @FunctionalInterface
   public interface a<T, R> {
      R get(CommandContext<T> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface b {
      int test(CommandContext<du> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<du> var1) throws CommandSyntaxException;
   }

   static class d implements gq.a<du> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(du $$0, List<du> $$1, ContextChain<du> $$2, gn $$3, gt<du> $$4) {
         alh.a($$0, $$1, alm::a, this.a, $$2, null, $$4, $$0x -> fz.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
