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
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class ahv {
   private static final int a = 32768;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> ui.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ui.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ui.b("commands.execute.conditional.fail_count", $$0));
   private static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> ui.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final BinaryOperator<dq<du>> f = ($$0, $$1) -> ($$2, $$3, $$4) -> {
         $$0.storeResult($$2, $$3, $$4);
         $$1.storeResult($$2, $$3, $$4);
      };
   private static final SuggestionProvider<du> g = ($$0, $$1) -> {
      edl $$2 = ((du)$$0.getSource()).m().aH();
      return dy.a($$2.a(edn.a), $$1);
   };

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      LiteralCommandNode<du> $$2 = $$0.register((LiteralArgumentBuilder)dv.a("execute").requires($$0x -> $$0x.c(2)));
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                                                         "execute"
                                                      )
                                                      .requires($$0x -> $$0x.c(2)))
                                                   .then(dv.a("run").redirect($$0.getRoot())))
                                                .then(a($$2, dv.a("if"), true, $$1)))
                                             .then(a($$2, dv.a("unless"), false, $$1)))
                                          .then(dv.a("as").then(dv.a("targets", eg.b()).fork($$2, $$0x -> {
                                             List<du> $$1x = Lists.newArrayList();

                                             for (bjt $$2x : eg.c($$0x, "targets")) {
                                                $$1x.add(((du)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dv.a("at").then(dv.a("targets", eg.b()).fork($$2, $$0x -> {
                                          List<du> $$1x = Lists.newArrayList();

                                          for (bjt $$2x : eg.c($$0x, "targets")) {
                                             $$1x.add(((du)$$0x.getSource()).a((alq)$$2x.dL()).a($$2x.dj()).a($$2x.bF()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)dv.a("store").then(a($$2, dv.a("result"), true))).then(a($$2, dv.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("positioned")
                                             .then(dv.a("pos", ft.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(ft.a($$0x, "pos")).a(ef.a.a))))
                                          .then(dv.a("as").then(dv.a("targets", eg.b()).fork($$2, $$0x -> {
                                             List<du> $$1x = Lists.newArrayList();

                                             for (bjt $$2x : eg.c($$0x, "targets")) {
                                                $$1x.add(((du)$$0x.getSource()).a($$2x.dj()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dv.a("over").then(dv.a("heightmap", ej.a()).redirect($$2, $$0x -> {
                                          eif $$1x = ((du)$$0x.getSource()).e();
                                          alq $$2x = ((du)$$0x.getSource()).f();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(iu.b($$3), iu.b($$4))) {
                                             throw fm.a.create();
                                          } else {
                                             int $$5 = $$2x.a(ej.a($$0x, "heightmap"), asy.a($$3), asy.a($$4));
                                             return ((du)$$0x.getSource()).a(new eif($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)dv.a("rotated")
                                       .then(dv.a("rot", fq.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(fq.a($$0x, "rot").b((du)$$0x.getSource())))))
                                    .then(dv.a("as").then(dv.a("targets", eg.b()).fork($$2, $$0x -> {
                                       List<du> $$1x = Lists.newArrayList();

                                       for (bjt $$2x : eg.c($$0x, "targets")) {
                                          $$1x.add(((du)$$0x.getSource()).a($$2x.bF()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dv.a("facing")
                                    .then(dv.a("entity").then(dv.a("targets", eg.b()).then(dv.a("anchor", ef.a()).fork($$2, $$0x -> {
                                       List<du> $$1x = Lists.newArrayList();
                                       ef.a $$2x = ef.a($$0x, "anchor");

                                       for (bjt $$3 : eg.c($$0x, "targets")) {
                                          $$1x.add(((du)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(dv.a("pos", ft.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).b(ft.a($$0x, "pos"))))
                           ))
                        .then(
                           dv.a("align")
                              .then(dv.a("axes", fr.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(((du)$$0x.getSource()).e().a(fr.a($$0x, "axes")))))
                        ))
                     .then(dv.a("anchored").then(dv.a("anchor", ef.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(ef.a($$0x, "anchor"))))))
                  .then(dv.a("in").then(dv.a("dimension", ee.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(ee.a($$0x, "dimension"))))))
               .then(dv.a("summon").then(dv.a("entity", es.a($$1, jz.t)).suggests(hj.d).redirect($$2, $$0x -> a((du)$$0x.getSource(), es.e($$0x, "entity"))))))
            .then(a($$2, dv.a("on")))
      );
   }

   private static ArgumentBuilder<du, ?> a(LiteralCommandNode<du> $$0, LiteralArgumentBuilder<du> $$1, boolean $$2) {
      $$1.then(
         dv.a("score")
            .then(
               dv.a("targets", ex.b())
                  .suggests(ex.a)
                  .then(dv.a("objective", en.a()).redirect($$0, $$1x -> a((du)$$1x.getSource(), ex.c($$1x, "targets"), en.a($$1x, "objective"), $$2)))
            )
      );
      $$1.then(
         dv.a("bossbar")
            .then(
               ((RequiredArgumentBuilder)dv.a("id", eu.a())
                     .suggests(ahf.a)
                     .then(dv.a("value").redirect($$0, $$1x -> a((du)$$1x.getSource(), ahf.a($$1x), true, $$2))))
                  .then(dv.a("max").redirect($$0, $$1x -> a((du)$$1x.getSource(), ahf.a($$1x), false, $$2)))
            )
      );

      for (akh.c $$3 : akh.b) {
         $$3.a(
            $$1,
            $$3x -> $$3x.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                       "path", el.a()
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
                                                         el.a($$2xx, "path"),
                                                         $$1xxx -> ry.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                                      el.a($$2xx, "path"),
                                                      $$1xxx -> rw.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                                   el.a($$2xx, "path"),
                                                   $$1xxx -> si.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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
                                                el.a($$2xx, "path"),
                                                $$1xxx -> sb.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                             el.a($$2xx, "path"),
                                             $$1xxx -> ru.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
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
                                          el.a($$2xx, "path"),
                                          $$1xxx -> rr.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static du a(du $$0, Collection<String> $$1, ejb $$2, boolean $$3) {
      eje $$4 = $$0.m().aF();
      return $$0.a(($$4x, $$5, $$6) -> {
         for (String $$7 : $$1) {
            ejd $$8 = $$4.c($$7, $$2);
            int $$9 = $$3 ? $$6 : ($$5 ? 1 : 0);
            $$8.b($$9);
         }
      }, f);
   }

   private static du a(du $$0, agu $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4, $$5) -> {
         int $$6 = $$3 ? $$5 : ($$4 ? 1 : 0);
         if ($$2) {
            $$1.a($$6);
         } else {
            $$1.b($$6);
         }
      }, f);
   }

   private static du a(du $$0, akg $$1, el.g $$2, IntFunction<sn> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5, $$6) -> {
         try {
            rt $$7 = $$1.a();
            int $$8 = $$4 ? $$6 : ($$5 ? 1 : 0);
            $$2.a($$7, $$3.apply($$8));
            $$1.a($$7);
         } catch (CommandSyntaxException var9) {
         }
      }, f);
   }

   private static boolean a(alq $$0, ht $$1) {
      cqg $$2 = new cqg($$1);
      dii $$3 = $$0.k().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == alj.d && $$0.c($$2.a());
   }

   private static ArgumentBuilder<du, ?> a(CommandNode<du> $$0, LiteralArgumentBuilder<du> $$1, boolean $$2, dp $$3) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                                 dv.a("block")
                                    .then(
                                       dv.a("pos", fm.a())
                                          .then(
                                             a(
                                                $$0,
                                                dv.a("block", fi.a($$3)),
                                                $$2,
                                                $$0x -> fi.a($$0x, "block").test(new dgf(((du)$$0x.getSource()).f(), fm.a($$0x, "pos"), true))
                                             )
                                          )
                                    )
                              ))
                              .then(
                                 dv.a("biome")
                                    .then(
                                       dv.a("pos", fm.a())
                                          .then(
                                             a(
                                                $$0,
                                                dv.a("biome", ev.a($$3, jz.aq)),
                                                $$2,
                                                $$0x -> ev.a($$0x, "biome", jz.aq).test(((du)$$0x.getSource()).f().s(fm.a($$0x, "pos")))
                                             )
                                          )
                                    )
                              ))
                           .then(dv.a("loaded").then(a($$0, dv.a("pos", fm.a()), $$2, $$0x -> a(((du)$$0x.getSource()).f(), fm.b($$0x, "pos"))))))
                        .then(dv.a("dimension").then(a($$0, dv.a("dimension", ee.a()), $$2, $$0x -> ee.a($$0x, "dimension") == ((du)$$0x.getSource()).f()))))
                     .then(
                        dv.a("score")
                           .then(
                              dv.a("target", ex.a())
                                 .suggests(ex.a)
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                                         "targetObjective", en.a()
                                                      )
                                                      .then(
                                                         dv.a("=")
                                                            .then(
                                                               dv.a("source", ex.a())
                                                                  .suggests(ex.a)
                                                                  .then(a($$0, dv.a("sourceObjective", en.a()), $$2, $$0x -> a($$0x, Integer::equals)))
                                                            )
                                                      ))
                                                   .then(
                                                      dv.a("<")
                                                         .then(
                                                            dv.a("source", ex.a())
                                                               .suggests(ex.a)
                                                               .then(
                                                                  a(
                                                                     $$0,
                                                                     dv.a("sourceObjective", en.a()),
                                                                     $$2,
                                                                     $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx < $$1x))
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("<=")
                                                      .then(
                                                         dv.a("source", ex.a())
                                                            .suggests(ex.a)
                                                            .then(
                                                               a(
                                                                  $$0,
                                                                  dv.a("sourceObjective", en.a()),
                                                                  $$2,
                                                                  $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx <= $$1x))
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                dv.a(">")
                                                   .then(
                                                      dv.a("source", ex.a())
                                                         .suggests(ex.a)
                                                         .then(
                                                            a(
                                                               $$0,
                                                               dv.a("sourceObjective", en.a()),
                                                               $$2,
                                                               $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx > $$1x))
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             dv.a(">=")
                                                .then(
                                                   dv.a("source", ex.a())
                                                      .suggests(ex.a)
                                                      .then(
                                                         a(
                                                            $$0,
                                                            dv.a("sourceObjective", en.a()),
                                                            $$2,
                                                            $$0x -> a($$0x, (BiPredicate<Integer, Integer>)(($$0xx, $$1x) -> $$0xx >= $$1x))
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(dv.a("matches").then(a($$0, dv.a("range", er.a()), $$2, $$0x -> a($$0x, er.b.a($$0x, "range")))))
                                 )
                           )
                     ))
                  .then(
                     dv.a("blocks")
                        .then(
                           dv.a("start", fm.a())
                              .then(
                                 dv.a("end", fm.a())
                                    .then(
                                       ((RequiredArgumentBuilder)dv.a("destination", fm.a()).then(a($$0, dv.a("all"), $$2, false)))
                                          .then(a($$0, dv.a("masked"), $$2, true))
                                    )
                              )
                        )
                  ))
               .then(
                  dv.a("entity")
                     .then(
                        ((RequiredArgumentBuilder)dv.a("entities", eg.b()).fork($$0, $$1x -> a($$1x, $$2, !eg.c($$1x, "entities").isEmpty())))
                           .executes(a($$2, (ahv.b)($$0x -> eg.c($$0x, "entities").size())))
                     )
               ))
            .then(dv.a("predicate").then(a($$0, dv.a("predicate", eu.a()).suggests(g), $$2, $$0x -> a((du)$$0x.getSource(), eu.c($$0x, "predicate"))))))
         .then(dv.a("function").then(dv.a("name", fx.a()).suggests(aia.a).fork($$0, new ahv.d($$2))));

      for (akh.c $$4 : akh.c) {
         $$1.then(
            $$4.a(
               dv.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)dv.a("path", el.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), el.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (ahv.b)($$1xx -> a($$4.a($$1xx), el.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static Command<du> a(boolean $$0, ahv.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((du)$$1x.getSource()).a(() -> ui.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw c.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((du)$$1x.getSource()).a(() -> ui.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw d.create($$2);
         }
      };
   }

   private static int a(akg $$0, el.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<du> $$0, BiPredicate<Integer, Integer> $$1) throws CommandSyntaxException {
      String $$2 = ex.a($$0, "target");
      ejb $$3 = en.a($$0, "targetObjective");
      String $$4 = ex.a($$0, "source");
      ejb $$5 = en.a($$0, "sourceObjective");
      eje $$6 = ((du)$$0.getSource()).m().aF();
      if ($$6.b($$2, $$3) && $$6.b($$4, $$5)) {
         ejd $$7 = $$6.c($$2, $$3);
         ejd $$8 = $$6.c($$4, $$5);
         return $$1.test($$7.b(), $$8.b());
      } else {
         return false;
      }
   }

   private static boolean a(CommandContext<du> $$0, cl.d $$1) throws CommandSyntaxException {
      String $$2 = ex.a($$0, "target");
      ejb $$3 = en.a($$0, "targetObjective");
      eje $$4 = ((du)$$0.getSource()).m().aF();
      return !$$4.b($$2, $$3) ? false : $$1.d($$4.c($$2, $$3).b());
   }

   private static boolean a(du $$0, egh $$1) {
      alq $$2 = $$0.f();
      edo $$3 = new edo.a($$2).a(eft.f, $$0.e()).b(eft.a, $$0.g()).a(efs.d);
      edi $$4 = new edi.a($$3).a(Optional.empty());
      $$4.b(edi.a($$1));
      return $$1.test($$4);
   }

   private static Collection<du> a(CommandContext<du> $$0, boolean $$1, boolean $$2) {
      return (Collection<du>)($$2 == $$1 ? Collections.singleton((du)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<du, ?> a(CommandNode<du> $$0, ArgumentBuilder<du, ?> $$1, boolean $$2, ahv.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((du)$$2x.getSource()).a(() -> ui.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw c.create();
         }
      });
   }

   private static ArgumentBuilder<du, ?> a(CommandNode<du> $$0, ArgumentBuilder<du, ?> $$1, boolean $$2, boolean $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, c($$2x, $$3).isPresent())).executes($$2 ? $$1x -> a($$1x, $$3) : $$1x -> b($$1x, $$3));
   }

   private static int a(CommandContext<du> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         ((du)$$0.getSource()).a(() -> ui.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
         return $$2.getAsInt();
      } else {
         throw c.create();
      }
   }

   private static int b(CommandContext<du> $$0, boolean $$1) throws CommandSyntaxException {
      OptionalInt $$2 = c($$0, $$1);
      if ($$2.isPresent()) {
         throw d.create($$2.getAsInt());
      } else {
         ((du)$$0.getSource()).a(() -> ui.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<du> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((du)$$0.getSource()).f(), fm.a($$0, "start"), fm.a($$0, "end"), fm.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(alq $$0, ht $$1, ht $$2, ht $$3, boolean $$4) throws CommandSyntaxException {
      dvs $$5 = dvs.a($$1, $$2);
      dvs $$6 = dvs.a($$3, $$3.a($$5.b()));
      ht $$7 = new ht($$6.g() - $$5.g(), $$6.h() - $$5.h(), $$6.i() - $$5.i());
      int $$8 = $$5.c() * $$5.d() * $$5.e();
      if ($$8 > 32768) {
         throw b.create(32768, $$8);
      } else {
         int $$9 = 0;

         for (int $$10 = $$5.i(); $$10 <= $$5.l(); $$10++) {
            for (int $$11 = $$5.h(); $$11 <= $$5.k(); $$11++) {
               for (int $$12 = $$5.g(); $$12 <= $$5.j(); $$12++) {
                  ht $$13 = new ht($$12, $$11, $$10);
                  ht $$14 = $$13.a((iw)$$7);
                  dgb $$15 = $$0.a_($$13);
                  if (!$$4 || !$$15.a(cuc.a)) {
                     if ($$15 != $$0.a_($$14)) {
                        return OptionalInt.empty();
                     }

                     ddx $$16 = $$0.c_($$13);
                     ddx $$17 = $$0.c_($$14);
                     if ($$16 != null) {
                        if ($$17 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$17.u() != $$16.u()) {
                           return OptionalInt.empty();
                        }

                        rt $$18 = $$16.o();
                        rt $$19 = $$17.o();
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

   private static RedirectModifier<du> a(Function<bjt, Optional<bjt>> $$0) {
      return $$1 -> {
         du $$2 = (du)$$1.getSource();
         bjt $$3 = $$2.g();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dG()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<du> b(Function<bjt, Stream<bjt>> $$0) {
      return $$1 -> {
         du $$2 = (du)$$1.getSource();
         bjt $$3 = $$2.g();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dG()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<du> a(CommandNode<du> $$0, LiteralArgumentBuilder<du> $$1) {
      return (LiteralArgumentBuilder<du>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              dv.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<bjt, Optional<bjt>>)($$0x -> $$0x instanceof bkr $$1x ? Optional.ofNullable($$1x.P_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              dv.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<bjt, Optional<bjt>>)($$0x -> $$0x instanceof bkl $$1x ? Optional.ofNullable($$1x.fT()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           dv.a("target")
                              .fork($$0, a((Function<bjt, Optional<bjt>>)($$0x -> $$0x instanceof blf $$1x ? Optional.ofNullable($$1x.q()) : Optional.empty())))
                        ))
                     .then(
                        dv.a("attacker")
                           .fork($$0, a((Function<bjt, Optional<bjt>>)($$0x -> $$0x instanceof bjr $$1x ? Optional.ofNullable($$1x.T_()) : Optional.empty())))
                     ))
                  .then(dv.a("vehicle").fork($$0, a((Function<bjt, Optional<bjt>>)($$0x -> Optional.ofNullable($$0x.cY()))))))
               .then(dv.a("controller").fork($$0, a((Function<bjt, Optional<bjt>>)($$0x -> Optional.ofNullable($$0x.cN()))))))
            .then(
               dv.a("origin").fork($$0, a((Function<bjt, Optional<bjt>>)($$0x -> $$0x instanceof blg $$1x ? Optional.ofNullable($$1x.v()) : Optional.empty())))
            ))
         .then(dv.a("passengers").fork($$0, b((Function<bjt, Stream<bjt>>)($$0x -> $$0x.cP().stream()))));
   }

   private static du a(du $$0, ib.c<bjx<?>> $$1) throws CommandSyntaxException {
      bjt $$2 = ajs.a($$0, $$1, $$0.e(), new rt(), true);
      return $$0.a($$2);
   }

   public static <T extends dw<T>> void a(
      List<T> $$0, Function<T, T> $$1, IntPredicate $$2, ContextChain<T> $$3, @Nullable rt $$4, go<T> $$5, ahv.a<T, Collection<gx<T>>> $$6, boolean $$7
   ) throws CommandSyntaxException {
      List<T> $$8 = new ArrayList<>($$0.size());
      CommandContext<T> $$9 = $$3.getTopContext();

      for (T $$10 : $$0) {
         Collection<gx<T>> $$11 = $$6.get($$9.copyFor($$10));
         int $$12 = $$11.size();
         if ($$12 != 0) {
            T $$13 = a($$1, $$2, $$8, $$10, $$12 == 1);

            for (gx<T> $$14 : $$11) {
               gz<T> $$15;
               try {
                  $$15 = $$14.a($$4, $$13.x(), $$13);
               } catch (dx var19) {
                  throw e.create($$14.a(), var19.a());
               }

               $$5.a(new gt<>($$15).bind($$13));
            }
         }
      }

      ContextChain<T> $$18 = $$3.nextStage();
      String $$19 = $$9.getInput();
      $$5.a(new gs.a<>($$19, $$18, $$7, $$8));
   }

   private static <T extends dw<T>> T a(Function<T, T> $$0, IntPredicate $$1, List<T> $$2, T $$3, boolean $$4) {
      T $$5 = $$0.apply($$3).y();
      if ($$4) {
         return $$5.b($$3x -> {
            if ($$1.test($$3x)) {
               $$2.add($$3);
            }
         });
      } else {
         MutableBoolean $$6 = new MutableBoolean();
         return $$5.b($$4x -> {
            if ($$6.isFalse() && $$1.test($$4x)) {
               $$2.add($$3);
               $$6.setTrue();
            }
         });
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

   static class d implements gl.a<du> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      @Override
      public void a(List<du> $$0, ContextChain<du> $$1, boolean $$2, go<du> $$3) throws CommandSyntaxException {
         ahv.a($$0, aia::a, this.a, $$1, null, $$3, $$0x -> fx.a($$0x, "name"), $$2);
      }
   }
}
