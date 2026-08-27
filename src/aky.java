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

public class aky {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> vq.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vq.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> vq.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> vq.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<du> f = ($$0, $$1) -> {
      eiy $$2 = ((du)$$0.getSource()).l().aJ();
      return dz.a($$2.a(eja.a), $$1);
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

                                             for (bno $$2x : eh.c($$0x, "targets")) {
                                                $$1x.add(((du)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dv.a("at").then(dv.a("targets", eh.b()).fork($$2, $$0x -> {
                                          List<du> $$1x = Lists.newArrayList();

                                          for (bno $$2x : eh.c($$0x, "targets")) {
                                             $$1x.add(((du)$$0x.getSource()).a((aov)$$2x.dM()).a($$2x.dk()).a($$2x.bG()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)dv.a("store").then(a($$2, dv.a("result"), true))).then(a($$2, dv.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("positioned")
                                             .then(dv.a("pos", fv.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(fv.a($$0x, "pos")).a(eg.a.a))))
                                          .then(dv.a("as").then(dv.a("targets", eh.b()).fork($$2, $$0x -> {
                                             List<du> $$1x = Lists.newArrayList();

                                             for (bno $$2x : eh.c($$0x, "targets")) {
                                                $$1x.add(((du)$$0x.getSource()).a($$2x.dk()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dv.a("over").then(dv.a("heightmap", ek.a()).redirect($$2, $$0x -> {
                                          ens $$1x = ((du)$$0x.getSource()).d();
                                          aov $$2x = ((du)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(jb.b($$3), jb.b($$4))) {
                                             throw fo.a.create();
                                          } else {
                                             int $$5 = $$2x.a(ek.a($$0x, "heightmap"), awh.a($$3), awh.a($$4));
                                             return ((du)$$0x.getSource()).a(new ens($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)dv.a("rotated")
                                       .then(dv.a("rot", fs.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(fs.a($$0x, "rot").b((du)$$0x.getSource())))))
                                    .then(dv.a("as").then(dv.a("targets", eh.b()).fork($$2, $$0x -> {
                                       List<du> $$1x = Lists.newArrayList();

                                       for (bno $$2x : eh.c($$0x, "targets")) {
                                          $$1x.add(((du)$$0x.getSource()).a($$2x.bG()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dv.a("facing")
                                    .then(dv.a("entity").then(dv.a("targets", eh.b()).then(dv.a("anchor", eg.a()).fork($$2, $$0x -> {
                                       List<du> $$1x = Lists.newArrayList();
                                       eg.a $$2x = eg.a($$0x, "anchor");

                                       for (bno $$3 : eh.c($$0x, "targets")) {
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
               .then(dv.a("summon").then(dv.a("entity", et.a($$1, kg.u)).suggests(hp.d).redirect($$2, $$0x -> a((du)$$0x.getSource(), et.e($$0x, "entity"))))))
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
                     .suggests(aki.a)
                     .then(dv.a("value").redirect($$0, $$1x -> a((du)$$1x.getSource(), aki.a($$1x), true, $$2))))
                  .then(dv.a("max").redirect($$0, $$1x -> a((du)$$1x.getSource(), aki.a($$1x), false, $$2)))
            )
      );

      for (anm.c $$3 : anm.b) {
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
                                                         $$1xxx -> tb.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                                      $$1xxx -> sz.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                                   $$1xxx -> to.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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
                                                $$1xxx -> te.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                             $$1xxx -> sx.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
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
                                          $$1xxx -> su.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static du a(du $$0, Collection<eov> $$1, eoo $$2, boolean $$3) {
      eow $$4 = $$0.l().aH();
      return $$0.a(($$4x, $$5) -> {
         for (eov $$6 : $$1) {
            eou $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.a($$8);
         }
      }, dr::chain);
   }

   private static du a(du $$0, ajx $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, dr::chain);
   }

   private static du a(du $$0, anl $$1, em.g $$2, IntFunction<tt> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            sw $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, dr::chain);
   }

   private static boolean a(aov $$0, hz $$1) {
      cuu $$2 = new cuu($$1);
      dnm $$3 = $$0.l().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == aoo.d && $$0.c($$2.a());
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
                                                $$0x -> fk.a($$0x, "block").test(new dlj(((du)$$0x.getSource()).e(), fo.a($$0x, "pos"), true))
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
                                                dv.a("biome", ew.a($$3, kg.at)),
                                                $$2,
                                                $$0x -> ew.a($$0x, "biome", kg.at).test(((du)$$0x.getSource()).e().t(fo.a($$0x, "pos")))
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
                                                                        $$0x -> a($$0x, (aky.e)(($$0xx, $$1x) -> $$0xx == $$1x))
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
                                                                     $$0x -> a($$0x, (aky.e)(($$0xx, $$1x) -> $$0xx < $$1x))
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
                                                                  $$0x -> a($$0x, (aky.e)(($$0xx, $$1x) -> $$0xx <= $$1x))
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
                                                               $$0x -> a($$0x, (aky.e)(($$0xx, $$1x) -> $$0xx > $$1x))
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
                                                         a($$0, dv.a("sourceObjective", eo.a()), $$2, $$0x -> a($$0x, (aky.e)(($$0xx, $$1x) -> $$0xx >= $$1x)))
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
                           .executes(a($$2, (aky.b)($$0x -> eh.c($$0x, "entities").size())))
                     )
               ))
            .then(dv.a("predicate").then(a($$0, dv.a("predicate", ev.a()).suggests(f), $$2, $$0x -> a((du)$$0x.getSource(), ev.c($$0x, "predicate"))))))
         .then(dv.a("function").then(dv.a("name", fz.a()).suggests(ald.b).fork($$0, new aky.d($$2))));

      for (anm.c $$4 : anm.c) {
         $$1.then(
            $$4.a(
               dv.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)dv.a("path", em.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), em.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (aky.b)($$1xx -> a($$4.a($$1xx), em.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static Command<du> a(boolean $$0, aky.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((du)$$1x.getSource()).a(() -> vq.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((du)$$1x.getSource()).a(() -> vq.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(anl $$0, em.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<du> $$0, aky.e $$1) throws CommandSyntaxException {
      eov $$2 = ey.a($$0, "target");
      eoo $$3 = eo.a($$0, "targetObjective");
      eov $$4 = ey.a($$0, "source");
      eoo $$5 = eo.a($$0, "sourceObjective");
      eow $$6 = ((du)$$0.getSource()).l().aH();
      eos $$7 = $$6.d($$2, $$3);
      eos $$8 = $$6.d($$4, $$5);
      return $$7 != null && $$8 != null ? $$1.test($$7.a(), $$8.a()) : false;
   }

   private static boolean a(CommandContext<du> $$0, cm.d $$1) throws CommandSyntaxException {
      eov $$2 = ey.a($$0, "target");
      eoo $$3 = eo.a($$0, "targetObjective");
      eow $$4 = ((du)$$0.getSource()).l().aH();
      eos $$5 = $$4.d($$2, $$3);
      return $$5 == null ? false : $$1.d($$5.a());
   }

   private static boolean a(du $$0, elu $$1) {
      aov $$2 = $$0.e();
      ejb $$3 = new ejb.a($$2).a(elg.f, $$0.d()).b(elg.a, $$0.f()).a(elf.d);
      eiv $$4 = new eiv.a($$3).a(Optional.empty());
      $$4.b(eiv.a($$1));
      return $$1.test($$4);
   }

   private static Collection<du> a(CommandContext<du> $$0, boolean $$1, boolean $$2) {
      return (Collection<du>)($$2 == $$1 ? Collections.singleton((du)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<du, ?> a(CommandNode<du> $$0, ArgumentBuilder<du, ?> $$1, boolean $$2, aky.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((du)$$2x.getSource()).a(() -> vq.c("commands.execute.conditional.pass"), false);
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
         ((du)$$0.getSource()).a(() -> vq.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
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
         ((du)$$0.getSource()).a(() -> vq.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<du> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((du)$$0.getSource()).e(), fo.a($$0, "start"), fo.a($$0, "end"), fo.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(aov $$0, hz $$1, hz $$2, hz $$3, boolean $$4) throws CommandSyntaxException {
      eaw $$5 = eaw.a($$1, $$2);
      eaw $$6 = eaw.a($$3, $$3.a($$5.c()));
      hz $$7 = new hz($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
      int $$8 = $$5.d() * $$5.e() * $$5.f();
      if ($$8 > 32768) {
         throw c.create(32768, $$8);
      } else {
         int $$9 = 0;

         for (int $$10 = $$5.j(); $$10 <= $$5.m(); $$10++) {
            for (int $$11 = $$5.i(); $$11 <= $$5.l(); $$11++) {
               for (int $$12 = $$5.h(); $$12 <= $$5.k(); $$12++) {
                  hz $$13 = new hz($$12, $$11, $$10);
                  hz $$14 = $$13.a((jd)$$7);
                  dlf $$15 = $$0.a_($$13);
                  if (!$$4 || !$$15.a(cyq.a)) {
                     if ($$15 != $$0.a_($$14)) {
                        return OptionalInt.empty();
                     }

                     dit $$16 = $$0.c_($$13);
                     dit $$17 = $$0.c_($$14);
                     if ($$16 != null) {
                        if ($$17 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$17.v() != $$16.v()) {
                           return OptionalInt.empty();
                        }

                        sw $$18 = $$16.q();
                        sw $$19 = $$17.q();
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

   private static RedirectModifier<du> a(Function<bno, Optional<bno>> $$0) {
      return $$1 -> {
         du $$2 = (du)$$1.getSource();
         bno $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dH()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<du> b(Function<bno, Stream<bno>> $$0) {
      return $$1 -> {
         du $$2 = (du)$$1.getSource();
         bno $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dH()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<du> a(CommandNode<du> $$0, LiteralArgumentBuilder<du> $$1) {
      return (LiteralArgumentBuilder<du>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              dv.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<bno, Optional<bno>>)($$0x -> $$0x instanceof bon $$1x ? Optional.ofNullable($$1x.R_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              dv.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<bno, Optional<bno>>)($$0x -> $$0x instanceof boi $$1x ? Optional.ofNullable($$1x.fV()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           dv.a("target")
                              .fork($$0, a((Function<bno, Optional<bno>>)($$0x -> $$0x instanceof bpb $$1x ? Optional.ofNullable($$1x.q()) : Optional.empty())))
                        ))
                     .then(
                        dv.a("attacker")
                           .fork($$0, a((Function<bno, Optional<bno>>)($$0x -> $$0x instanceof bnm $$1x ? Optional.ofNullable($$1x.V_()) : Optional.empty())))
                     ))
                  .then(dv.a("vehicle").fork($$0, a((Function<bno, Optional<bno>>)($$0x -> Optional.ofNullable($$0x.cZ()))))))
               .then(dv.a("controller").fork($$0, a((Function<bno, Optional<bno>>)($$0x -> Optional.ofNullable($$0x.cN()))))))
            .then(
               dv.a("origin").fork($$0, a((Function<bno, Optional<bno>>)($$0x -> $$0x instanceof bpc $$1x ? Optional.ofNullable($$1x.w()) : Optional.empty())))
            ))
         .then(dv.a("passengers").fork($$0, b((Function<bno, Stream<bno>>)($$0x -> $$0x.cP().stream()))));
   }

   private static du a(du $$0, ij.c<bnu<?>> $$1) throws CommandSyntaxException {
      bno $$2 = amw.a($$0, $$1, $$0.d(), new sw(), true);
      return $$0.a($$2);
   }

   public static <T extends dw<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable sw $$5, gr<T> $$6, aky.a<T, Collection<hd<T>>> $$7, gl $$8
   ) {
      List<T> $$9 = new ArrayList<>($$1.size());

      Collection<hd<T>> $$10;
      try {
         $$10 = $$7.get($$4.getTopContext().copyFor($$0));
      } catch (CommandSyntaxException var18) {
         $$0.a(var18, $$8.a(), $$6.a());
         return;
      }

      int $$13 = $$10.size();
      if ($$13 != 0) {
         List<hf<T>> $$14 = new ArrayList<>($$13);

         try {
            for (hd<T> $$15 : $$10) {
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
            $$6.a(new hb<>($$2x -> {
               for (hf<T> $$3x : $$14) {
                  $$2x.a(new gx<>($$3x, $$2x.b().d(), true).bind($$19));
               }

               $$2x.a(ha.a());
            }, $$20));
         }

         ContextChain<T> $$21 = $$4.nextStage();
         String $$22 = $$4.getTopContext().getInput();
         $$6.a(new gw.a<>($$22, $$21, $$8, $$0, $$9));
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

   static class d implements go.a<du> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(du $$0, List<du> $$1, ContextChain<du> $$2, gl $$3, gr<du> $$4) {
         aky.a($$0, $$1, ald::a, this.a, $$2, null, $$4, $$0x -> fz.a($$0x, "name"), $$3);
      }
   }

   @FunctionalInterface
   interface e {
      boolean test(int var1, int var2);
   }
}
