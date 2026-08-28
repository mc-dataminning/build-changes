import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class aov {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ww.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ww.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ww.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ww.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> ww.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("objectives")
                                 .then(ej.a("list").executes($$0x -> b((ei)$$0x.getSource()))))
                              .then(
                                 ej.a("add")
                                    .then(
                                       ej.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)ej.a("criteria", fd.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ei)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            fd.a($$0x, "criteria"),
                                                            ww.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   ej.a("displayName", er.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ei)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               fd.a($$0x, "criteria"),
                                                               er.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ej.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("objective", fc.a())
                                                .then(
                                                   ej.a("displayname")
                                                      .then(
                                                         ej.a("displayName", er.a($$1))
                                                            .executes($$0x -> a((ei)$$0x.getSource(), fc.a($$0x, "objective"), er.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             ej.a("displayautoupdate")
                                                .then(
                                                   ej.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((ei)$$0x.getSource(), fc.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, ej.a("numberformat"), ($$0x, $$1x) -> a((ei)$$0x.getSource(), fc.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(ej.a("remove").then(ej.a("objective", fc.a()).executes($$0x -> a((ei)$$0x.getSource(), fc.a($$0x, "objective"))))))
                     .then(
                        ej.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)ej.a("slot", fp.a()).executes($$0x -> a((ei)$$0x.getSource(), fp.a($$0x, "slot"))))
                                 .then(ej.a("objective", fc.a()).executes($$0x -> a((ei)$$0x.getSource(), fp.a($$0x, "slot"), fc.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)ej.a("list").executes($$0x -> a((ei)$$0x.getSource())))
                                                .then(ej.a("target", fo.a()).suggests(fo.a).executes($$0x -> a((ei)$$0x.getSource(), fo.a($$0x, "target"))))
                                          ))
                                       .then(
                                          ej.a("set")
                                             .then(
                                                ej.a("targets", fo.b())
                                                   .suggests(fo.a)
                                                   .then(
                                                      ej.a("objective", fc.a())
                                                         .then(
                                                            ej.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ei)$$0x.getSource(),
                                                                        fo.c($$0x, "targets"),
                                                                        fc.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ej.a("get")
                                          .then(
                                             ej.a("target", fo.a())
                                                .suggests(fo.a)
                                                .then(
                                                   ej.a("objective", fc.a())
                                                      .executes($$0x -> a((ei)$$0x.getSource(), fo.a($$0x, "target"), fc.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    ej.a("add")
                                       .then(
                                          ej.a("targets", fo.b())
                                             .suggests(fo.a)
                                             .then(
                                                ej.a("objective", fc.a())
                                                   .then(
                                                      ej.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (ei)$$0x.getSource(),
                                                                  fo.c($$0x, "targets"),
                                                                  fc.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ej.a("remove")
                                    .then(
                                       ej.a("targets", fo.b())
                                          .suggests(fo.a)
                                          .then(
                                             ej.a("objective", fc.a())
                                                .then(
                                                   ej.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (ei)$$0x.getSource(),
                                                               fo.c($$0x, "targets"),
                                                               fc.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ej.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)ej.a("targets", fo.b())
                                          .suggests(fo.a)
                                          .executes($$0x -> a((ei)$$0x.getSource(), fo.c($$0x, "targets"))))
                                       .then(
                                          ej.a("objective", fc.a()).executes($$0x -> b((ei)$$0x.getSource(), fo.c($$0x, "targets"), fc.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           ej.a("enable")
                              .then(
                                 ej.a("targets", fo.b())
                                    .suggests(fo.a)
                                    .then(
                                       ej.a("objective", fc.a())
                                          .suggests(($$0x, $$1x) -> a((ei)$$0x.getSource(), fo.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((ei)$$0x.getSource(), fo.c($$0x, "targets"), fc.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)ej.a("display")
                              .then(
                                 ej.a("name")
                                    .then(
                                       ej.a("targets", fo.b())
                                          .suggests(fo.a)
                                          .then(
                                             ((RequiredArgumentBuilder)ej.a("objective", fc.a())
                                                   .then(
                                                      ej.a("name", er.a($$1))
                                                         .executes(
                                                            $$0x -> a((ei)$$0x.getSource(), fo.c($$0x, "targets"), fc.a($$0x, "objective"), er.a($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((ei)$$0x.getSource(), fo.c($$0x, "targets"), fc.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              ej.a("numberformat")
                                 .then(
                                    ej.a("targets", fo.b())
                                       .suggests(fo.a)
                                       .then(
                                          a(
                                             $$1,
                                             ej.a("objective", fc.a()),
                                             ($$0x, $$1x) -> a((ei)$$0x.getSource(), fo.c($$0x, "targets"), fc.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     ej.a("operation")
                        .then(
                           ej.a("targets", fo.b())
                              .suggests(fo.a)
                              .then(
                                 ej.a("targetObjective", fc.a())
                                    .then(
                                       ej.a("operation", fe.a())
                                          .then(
                                             ej.a("source", fo.b())
                                                .suggests(fo.a)
                                                .then(
                                                   ej.a("sourceObjective", fc.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ei)$$0x.getSource(),
                                                               fo.c($$0x, "targets"),
                                                               fc.b($$0x, "targetObjective"),
                                                               fe.a($$0x, "operation"),
                                                               fo.c($$0x, "source"),
                                                               fc.a($$0x, "sourceObjective")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static ArgumentBuilder<ei, ?> a(ee $$0, ArgumentBuilder<ei, ?> $$1, aov.a $$2) {
      return $$1.then(ej.a("blank").executes($$1x -> $$2.run($$1x, yk.a))).then(ej.a("fixed").then(ej.a("contents", er.a($$0)).executes($$1x -> {
         ww $$2x = er.a($$1x, "contents");
         return $$2.run($$1x, new yl($$2x));
      }))).then(ej.a("styled").then(ej.a("style", fu.a($$0)).executes($$1x -> {
         xt $$2x = fu.a($$1x, "style");
         return $$2.run($$1x, new yp($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<ei> a() {
      LiteralArgumentBuilder<ei> $$0 = ej.a("rendertype");

      for (ffe.a $$1 : ffe.a.values()) {
         $$0.then(ej.a($$1.a()).executes($$1x -> a((ei)$$1x.getSource(), fc.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(ei $$0, Collection<ffa> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      ffb $$4 = $$0.l().aJ();

      for (fet $$5 : $$4.c()) {
         if ($$5.c() == ffe.c) {
            boolean $$6 = false;

            for (ffa $$7 : $$1) {
               fex $$8 = $$4.d($$7, $$5);
               if ($$8 == null || $$8.b()) {
                  $$6 = true;
                  break;
               }
            }

            if ($$6) {
               $$3.add($$5.b());
            }
         }
      }

      return en.b($$3, $$2);
   }

   private static int a(ei $$0, ffa $$1, fet $$2) throws CommandSyntaxException {
      ffb $$3 = $$0.l().aJ();
      fex $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.hc());
      } else {
         $$0.a(() -> ww.a("commands.scoreboard.players.get.success", $$1.hc(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static ww a(Collection<ffa> $$0) {
      return $$0.iterator().next().hc();
   }

   private static int a(ei $$0, Collection<ffa> $$1, fet $$2, fe.a $$3, Collection<ffa> $$4, fet $$5) throws CommandSyntaxException {
      ffb $$6 = $$0.l().aJ();
      int $$7 = 0;

      for (ffa $$8 : $$1) {
         fez $$9 = $$6.c($$8, $$2);

         for (ffa $$10 : $$4) {
            fez $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> ww.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> ww.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(ei $$0, Collection<ffa> $$1, fet $$2) throws CommandSyntaxException {
      if ($$2.c() != ffe.c) {
         throw e.create();
      } else {
         ffb $$3 = $$0.l().aJ();
         int $$4 = 0;

         for (ffa $$5 : $$1) {
            fez $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> ww.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> ww.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(ei $$0, Collection<ffa> $$1) {
      ffb $$2 = $$0.l().aJ();

      for (ffa $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ww.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> ww.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ei $$0, Collection<ffa> $$1, fet $$2) {
      ffb $$3 = $$0.l().aJ();

      for (ffa $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ww.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> ww.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ei $$0, Collection<ffa> $$1, fet $$2, int $$3) {
      ffb $$4 = $$0.l().aJ();

      for (ffa $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ww.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> ww.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(ei $$0, Collection<ffa> $$1, fet $$2, @Nullable ww $$3) {
      ffb $$4 = $$0.l().aJ();

      for (ffa $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> ww.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> ww.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> ww.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> ww.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(ei $$0, Collection<ffa> $$1, fet $$2, @Nullable ym $$3) {
      ffb $$4 = $$0.l().aJ();

      for (ffa $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> ww.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> ww.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> ww.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> ww.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(ei $$0, Collection<ffa> $$1, fet $$2, int $$3) {
      ffb $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (ffa $$6 : $$1) {
         fez $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> ww.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> ww.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(ei $$0, Collection<ffa> $$1, fet $$2, int $$3) {
      ffb $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (ffa $$6 : $$1) {
         fez $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> ww.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> ww.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(ei $$0) {
      Collection<ffa> $$1 = $$0.l().aJ().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> ww.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> ww.a("commands.scoreboard.players.list.success", $$1.size(), wz.b($$1, ffa::hc)), false);
      }

      return $$1.size();
   }

   private static int a(ei $$0, ffa $$1) {
      Object2IntMap<fet> $$2 = $$0.l().aJ().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> ww.a("commands.scoreboard.players.list.entity.empty", $$1.hc()), false);
      } else {
         $$0.a(() -> ww.a("commands.scoreboard.players.list.entity.success", $$1.hc(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> ww.a("commands.scoreboard.players.list.entity.entry", ((fet)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(ei $$0, fes $$1) throws CommandSyntaxException {
      ffb $$2 = $$0.l().aJ();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> ww.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(ei $$0, fes $$1, fet $$2) throws CommandSyntaxException {
      ffb $$3 = $$0.l().aJ();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> ww.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(ei $$0, fet $$1, ww $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> ww.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(ei $$0, fet $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> ww.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> ww.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(ei $$0, fet $$1, @Nullable ym $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> ww.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> ww.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(ei $$0, fet $$1, ffe.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> ww.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(ei $$0, fet $$1) {
      ffb $$2 = $$0.l().aJ();
      $$2.j($$1);
      $$0.a(() -> ww.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(ei $$0, String $$1, ffe $$2, ww $$3) throws CommandSyntaxException {
      ffb $$4 = $$0.l().aJ();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         fet $$5 = $$4.a($$1);
         $$0.a(() -> ww.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(ei $$0) {
      Collection<fet> $$1 = $$0.l().aJ().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> ww.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> ww.a("commands.scoreboard.objectives.list.success", $$1.size(), wz.b($$1, fet::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<ei> var1, @Nullable ym var2) throws CommandSyntaxException;
   }
}
