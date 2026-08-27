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

public class aim {
   private static final int b = 32768;
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> uv.b("commands.execute.blocks.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(uv.c("commands.execute.conditional.fail"));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> uv.b("commands.execute.conditional.fail_count", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> uv.b("commands.execute.function.instantiationFailure", $$0, $$1)
   );
   private static final SuggestionProvider<du> f = ($$0, $$1) -> {
      eff $$2 = ((du)$$0.getSource()).l().aJ();
      return dy.a($$2.a(efh.a), $$1);
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

                                             for (bkv $$2x : eg.c($$0x, "targets")) {
                                                $$1x.add(((du)$$0x.getSource()).a($$2x));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dv.a("at").then(dv.a("targets", eg.b()).fork($$2, $$0x -> {
                                          List<du> $$1x = Lists.newArrayList();

                                          for (bkv $$2x : eg.c($$0x, "targets")) {
                                             $$1x.add(((du)$$0x.getSource()).a((ami)$$2x.dN()).a($$2x.dl()).a($$2x.bG()));
                                          }

                                          return $$1x;
                                       }))))
                                    .then(((LiteralArgumentBuilder)dv.a("store").then(a($$2, dv.a("result"), true))).then(a($$2, dv.a("success"), false))))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("positioned")
                                             .then(dv.a("pos", ft.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(ft.a($$0x, "pos")).a(ef.a.a))))
                                          .then(dv.a("as").then(dv.a("targets", eg.b()).fork($$2, $$0x -> {
                                             List<du> $$1x = Lists.newArrayList();

                                             for (bkv $$2x : eg.c($$0x, "targets")) {
                                                $$1x.add(((du)$$0x.getSource()).a($$2x.dl()));
                                             }

                                             return $$1x;
                                          }))))
                                       .then(dv.a("over").then(dv.a("heightmap", ej.a()).redirect($$2, $$0x -> {
                                          ejz $$1x = ((du)$$0x.getSource()).d();
                                          ami $$2x = ((du)$$0x.getSource()).e();
                                          double $$3 = $$1x.a();
                                          double $$4 = $$1x.c();
                                          if (!$$2x.b(iy.b($$3), iy.b($$4))) {
                                             throw fm.a.create();
                                          } else {
                                             int $$5 = $$2x.a(ej.a($$0x, "heightmap"), atq.a($$3), atq.a($$4));
                                             return ((du)$$0x.getSource()).a(new ejz($$3, (double)$$5, $$4));
                                          }
                                       })))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)dv.a("rotated")
                                       .then(dv.a("rot", fq.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(fq.a($$0x, "rot").b((du)$$0x.getSource())))))
                                    .then(dv.a("as").then(dv.a("targets", eg.b()).fork($$2, $$0x -> {
                                       List<du> $$1x = Lists.newArrayList();

                                       for (bkv $$2x : eg.c($$0x, "targets")) {
                                          $$1x.add(((du)$$0x.getSource()).a($$2x.bG()));
                                       }

                                       return $$1x;
                                    })))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)dv.a("facing")
                                    .then(dv.a("entity").then(dv.a("targets", eg.b()).then(dv.a("anchor", ef.a()).fork($$2, $$0x -> {
                                       List<du> $$1x = Lists.newArrayList();
                                       ef.a $$2x = ef.a($$0x, "anchor");

                                       for (bkv $$3 : eg.c($$0x, "targets")) {
                                          $$1x.add(((du)$$0x.getSource()).a($$3, $$2x));
                                       }

                                       return $$1x;
                                    })))))
                                 .then(dv.a("pos", ft.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).b(ft.a($$0x, "pos"))))
                           ))
                        .then(
                           dv.a("align")
                              .then(dv.a("axes", fr.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(((du)$$0x.getSource()).d().a(fr.a($$0x, "axes")))))
                        ))
                     .then(dv.a("anchored").then(dv.a("anchor", ef.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(ef.a($$0x, "anchor"))))))
                  .then(dv.a("in").then(dv.a("dimension", ee.a()).redirect($$2, $$0x -> ((du)$$0x.getSource()).a(ee.a($$0x, "dimension"))))))
               .then(dv.a("summon").then(dv.a("entity", es.a($$1, kd.t)).suggests(hn.d).redirect($$2, $$0x -> a((du)$$0x.getSource(), es.e($$0x, "entity"))))))
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
                     .suggests(ahw.a)
                     .then(dv.a("value").redirect($$0, $$1x -> a((du)$$1x.getSource(), ahw.a($$1x), true, $$2))))
                  .then(dv.a("max").redirect($$0, $$1x -> a((du)$$1x.getSource(), ahw.a($$1x), false, $$2)))
            )
      );

      for (akz.c $$3 : akz.b) {
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
                                                         $$1xxx -> si.a((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                                      $$1xxx -> sg.a((float)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                                   $$1xxx -> sv.a((short)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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
                                                $$1xxx -> sl.a((long)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale"))),
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
                                             $$1xxx -> se.a((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")),
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
                                          $$1xxx -> sb.a((byte)((int)((double)$$1xxx * DoubleArgumentType.getDouble($$2xx, "scale")))),
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

   private static du a(du $$0, Collection<String> $$1, ekv $$2, boolean $$3) {
      eky $$4 = $$0.l().aH();
      return $$0.a(($$4x, $$5) -> {
         for (String $$6 : $$1) {
            ekx $$7 = $$4.c($$6, $$2);
            int $$8 = $$3 ? $$5 : ($$4x ? 1 : 0);
            $$7.b($$8);
         }
      }, dq::chain);
   }

   private static du a(du $$0, ahl $$1, boolean $$2, boolean $$3) {
      return $$0.a(($$3x, $$4) -> {
         int $$5 = $$3 ? $$4 : ($$3x ? 1 : 0);
         if ($$2) {
            $$1.a($$5);
         } else {
            $$1.b($$5);
         }
      }, dq::chain);
   }

   private static du a(du $$0, aky $$1, el.g $$2, IntFunction<ta> $$3, boolean $$4) {
      return $$0.a(($$4x, $$5) -> {
         try {
            sd $$6 = $$1.a();
            int $$7 = $$4 ? $$5 : ($$4x ? 1 : 0);
            $$2.a($$6, $$3.apply($$7));
            $$1.a($$6);
         } catch (CommandSyntaxException var8) {
         }
      }, dq::chain);
   }

   private static boolean a(ami $$0, hx $$1) {
      crm $$2 = new crm($$1);
      dju $$3 = $$0.k().a($$2.e, $$2.f);
      return $$3 == null ? false : $$3.D() == amb.d && $$0.c($$2.a());
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
                                                $$0x -> fi.a($$0x, "block").test(new dhr(((du)$$0x.getSource()).e(), fm.a($$0x, "pos"), true))
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
                                                dv.a("biome", ev.a($$3, kd.ar)),
                                                $$2,
                                                $$0x -> ev.a($$0x, "biome", kd.ar).test(((du)$$0x.getSource()).e().s(fm.a($$0x, "pos")))
                                             )
                                          )
                                    )
                              ))
                           .then(dv.a("loaded").then(a($$0, dv.a("pos", fm.a()), $$2, $$0x -> a(((du)$$0x.getSource()).e(), fm.b($$0x, "pos"))))))
                        .then(dv.a("dimension").then(a($$0, dv.a("dimension", ee.a()), $$2, $$0x -> ee.a($$0x, "dimension") == ((du)$$0x.getSource()).e()))))
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
                           .executes(a($$2, (aim.b)($$0x -> eg.c($$0x, "entities").size())))
                     )
               ))
            .then(dv.a("predicate").then(a($$0, dv.a("predicate", eu.a()).suggests(f), $$2, $$0x -> a((du)$$0x.getSource(), eu.c($$0x, "predicate"))))))
         .then(dv.a("function").then(dv.a("name", fx.a()).suggests(air.b).fork($$0, new aim.d($$2))));

      for (akz.c $$4 : akz.c) {
         $$1.then(
            $$4.a(
               dv.a("data"),
               $$3x -> $$3x.then(
                     ((RequiredArgumentBuilder)dv.a("path", el.a()).fork($$0, $$2xx -> a($$2xx, $$2, a($$4.a($$2xx), el.a($$2xx, "path")) > 0)))
                        .executes(a($$2, (aim.b)($$1xx -> a($$4.a($$1xx), el.a($$1xx, "path")))))
                  )
            )
         );
      }

      return $$1;
   }

   private static Command<du> a(boolean $$0, aim.b $$1) {
      return $$0 ? $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 > 0) {
            ((du)$$1x.getSource()).a(() -> uv.a("commands.execute.conditional.pass_count", $$2), false);
            return $$2;
         } else {
            throw d.create();
         }
      } : $$1x -> {
         int $$2 = $$1.test($$1x);
         if ($$2 == 0) {
            ((du)$$1x.getSource()).a(() -> uv.c("commands.execute.conditional.pass"), false);
            return 1;
         } else {
            throw e.create($$2);
         }
      };
   }

   private static int a(aky $$0, el.g $$1) throws CommandSyntaxException {
      return $$1.b($$0.a());
   }

   private static boolean a(CommandContext<du> $$0, BiPredicate<Integer, Integer> $$1) throws CommandSyntaxException {
      String $$2 = ex.a($$0, "target");
      ekv $$3 = en.a($$0, "targetObjective");
      String $$4 = ex.a($$0, "source");
      ekv $$5 = en.a($$0, "sourceObjective");
      eky $$6 = ((du)$$0.getSource()).l().aH();
      if ($$6.b($$2, $$3) && $$6.b($$4, $$5)) {
         ekx $$7 = $$6.c($$2, $$3);
         ekx $$8 = $$6.c($$4, $$5);
         return $$1.test($$7.b(), $$8.b());
      } else {
         return false;
      }
   }

   private static boolean a(CommandContext<du> $$0, cl.d $$1) throws CommandSyntaxException {
      String $$2 = ex.a($$0, "target");
      ekv $$3 = en.a($$0, "targetObjective");
      eky $$4 = ((du)$$0.getSource()).l().aH();
      return !$$4.b($$2, $$3) ? false : $$1.d($$4.c($$2, $$3).b());
   }

   private static boolean a(du $$0, eib $$1) {
      ami $$2 = $$0.e();
      efi $$3 = new efi.a($$2).a(ehn.f, $$0.d()).b(ehn.a, $$0.f()).a(ehm.d);
      efc $$4 = new efc.a($$3).a(Optional.empty());
      $$4.b(efc.a($$1));
      return $$1.test($$4);
   }

   private static Collection<du> a(CommandContext<du> $$0, boolean $$1, boolean $$2) {
      return (Collection<du>)($$2 == $$1 ? Collections.singleton((du)$$0.getSource()) : Collections.emptyList());
   }

   private static ArgumentBuilder<du, ?> a(CommandNode<du> $$0, ArgumentBuilder<du, ?> $$1, boolean $$2, aim.c $$3) {
      return $$1.fork($$0, $$2x -> a($$2x, $$2, $$3.test($$2x))).executes($$2x -> {
         if ($$2 == $$3.test($$2x)) {
            ((du)$$2x.getSource()).a(() -> uv.c("commands.execute.conditional.pass"), false);
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
         ((du)$$0.getSource()).a(() -> uv.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
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
         ((du)$$0.getSource()).a(() -> uv.c("commands.execute.conditional.pass"), false);
         return 1;
      }
   }

   private static OptionalInt c(CommandContext<du> $$0, boolean $$1) throws CommandSyntaxException {
      return a(((du)$$0.getSource()).e(), fm.a($$0, "start"), fm.a($$0, "end"), fm.a($$0, "destination"), $$1);
   }

   private static OptionalInt a(ami $$0, hx $$1, hx $$2, hx $$3, boolean $$4) throws CommandSyntaxException {
      dxe $$5 = dxe.a($$1, $$2);
      dxe $$6 = dxe.a($$3, $$3.a($$5.c()));
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
                  hx $$14 = $$13.a((ja)$$7);
                  dhn $$15 = $$0.a_($$13);
                  if (!$$4 || !$$15.a(cvh.a)) {
                     if ($$15 != $$0.a_($$14)) {
                        return OptionalInt.empty();
                     }

                     dfi $$16 = $$0.c_($$13);
                     dfi $$17 = $$0.c_($$14);
                     if ($$16 != null) {
                        if ($$17 == null) {
                           return OptionalInt.empty();
                        }

                        if ($$17.v() != $$16.v()) {
                           return OptionalInt.empty();
                        }

                        sd $$18 = $$16.q();
                        sd $$19 = $$17.q();
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

   private static RedirectModifier<du> a(Function<bkv, Optional<bkv>> $$0) {
      return $$1 -> {
         du $$2 = (du)$$1.getSource();
         bkv $$3 = $$2.f();
         return (Collection)($$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dI()).map($$1x -> List.of($$2.a($$1x))).orElse(List.of()));
      };
   }

   private static RedirectModifier<du> b(Function<bkv, Stream<bkv>> $$0) {
      return $$1 -> {
         du $$2 = (du)$$1.getSource();
         bkv $$3 = $$2.f();
         return $$3 == null ? List.of() : $$0.apply($$3).filter($$0xx -> !$$0xx.dI()).map($$2::a).toList();
      };
   }

   private static LiteralArgumentBuilder<du> a(CommandNode<du> $$0, LiteralArgumentBuilder<du> $$1) {
      return (LiteralArgumentBuilder<du>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(
                              dv.a("owner")
                                 .fork(
                                    $$0,
                                    a((Function<bkv, Optional<bkv>>)($$0x -> $$0x instanceof blt $$1x ? Optional.ofNullable($$1x.R_()) : Optional.empty()))
                                 )
                           ))
                           .then(
                              dv.a("leasher")
                                 .fork(
                                    $$0,
                                    a((Function<bkv, Optional<bkv>>)($$0x -> $$0x instanceof bln $$1x ? Optional.ofNullable($$1x.fU()) : Optional.empty()))
                                 )
                           ))
                        .then(
                           dv.a("target")
                              .fork($$0, a((Function<bkv, Optional<bkv>>)($$0x -> $$0x instanceof bmh $$1x ? Optional.ofNullable($$1x.q()) : Optional.empty())))
                        ))
                     .then(
                        dv.a("attacker")
                           .fork($$0, a((Function<bkv, Optional<bkv>>)($$0x -> $$0x instanceof bkt $$1x ? Optional.ofNullable($$1x.V_()) : Optional.empty())))
                     ))
                  .then(dv.a("vehicle").fork($$0, a((Function<bkv, Optional<bkv>>)($$0x -> Optional.ofNullable($$0x.da()))))))
               .then(dv.a("controller").fork($$0, a((Function<bkv, Optional<bkv>>)($$0x -> Optional.ofNullable($$0x.cO()))))))
            .then(
               dv.a("origin").fork($$0, a((Function<bkv, Optional<bkv>>)($$0x -> $$0x instanceof bmi $$1x ? Optional.ofNullable($$1x.w()) : Optional.empty())))
            ))
         .then(dv.a("passengers").fork($$0, b((Function<bkv, Stream<bkv>>)($$0x -> $$0x.cQ().stream()))));
   }

   private static du a(du $$0, ig.c<bkz<?>> $$1) throws CommandSyntaxException {
      bkv $$2 = akj.a($$0, $$1, $$0.d(), new sd(), true);
      return $$0.a($$2);
   }

   public static <T extends dw<T>> void a(
      T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable sd $$5, gp<T> $$6, aim.a<T, Collection<hb<T>>> $$7, gj $$8
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
                  $$14.add($$15.a($$5, $$0.x(), $$0));
               } catch (dx var17) {
                  throw a.create($$15.a(), var17.a());
               }
            }
         } catch (CommandSyntaxException var19) {
            $$0.a(var19, $$8.a(), $$6.a());
         }

         for (T $$18 : $$1) {
            T $$19 = (T)$$2.apply($$18.a_());
            dq $$20 = ($$3x, $$4x) -> {
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
      int test(CommandContext<du> var1) throws CommandSyntaxException;
   }

   @FunctionalInterface
   interface c {
      boolean test(CommandContext<du> var1) throws CommandSyntaxException;
   }

   static class d implements gm.a<du> {
      private final IntPredicate a;

      d(boolean $$0) {
         this.a = $$0 ? $$0x -> $$0x != 0 : $$0x -> $$0x == 0;
      }

      public void a(du $$0, List<du> $$1, ContextChain<du> $$2, gj $$3, gp<du> $$4) {
         aim.a($$0, $$1, air::a, this.a, $$2, null, $$4, $$0x -> fx.a($$0x, "name"), $$3);
      }
   }
}
