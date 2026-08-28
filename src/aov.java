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
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xh.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xh.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xh.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("objectives")
                                 .then(ew.a("list").executes($$0x -> b((ev)$$0x.getSource()))))
                              .then(
                                 ew.a("add")
                                    .then(
                                       ew.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)ew.a("criteria", fq.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ev)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            fq.a($$0x, "criteria"),
                                                            xh.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   ew.a("displayName", fe.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ev)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               fq.a($$0x, "criteria"),
                                                               fe.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ew.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("objective", fp.a())
                                                .then(
                                                   ew.a("displayname")
                                                      .then(
                                                         ew.a("displayName", fe.a($$1))
                                                            .executes($$0x -> a((ev)$$0x.getSource(), fp.a($$0x, "objective"), fe.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             ew.a("displayautoupdate")
                                                .then(
                                                   ew.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((ev)$$0x.getSource(), fp.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, ew.a("numberformat"), ($$0x, $$1x) -> a((ev)$$0x.getSource(), fp.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(ew.a("remove").then(ew.a("objective", fp.a()).executes($$0x -> a((ev)$$0x.getSource(), fp.a($$0x, "objective"))))))
                     .then(
                        ew.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)ew.a("slot", gb.a()).executes($$0x -> a((ev)$$0x.getSource(), gb.a($$0x, "slot"))))
                                 .then(ew.a("objective", fp.a()).executes($$0x -> a((ev)$$0x.getSource(), gb.a($$0x, "slot"), fp.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)ew.a("list").executes($$0x -> a((ev)$$0x.getSource())))
                                                .then(ew.a("target", ga.a()).suggests(ga.a).executes($$0x -> a((ev)$$0x.getSource(), ga.a($$0x, "target"))))
                                          ))
                                       .then(
                                          ew.a("set")
                                             .then(
                                                ew.a("targets", ga.b())
                                                   .suggests(ga.a)
                                                   .then(
                                                      ew.a("objective", fp.a())
                                                         .then(
                                                            ew.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ev)$$0x.getSource(),
                                                                        ga.c($$0x, "targets"),
                                                                        fp.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ew.a("get")
                                          .then(
                                             ew.a("target", ga.a())
                                                .suggests(ga.a)
                                                .then(
                                                   ew.a("objective", fp.a())
                                                      .executes($$0x -> a((ev)$$0x.getSource(), ga.a($$0x, "target"), fp.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    ew.a("add")
                                       .then(
                                          ew.a("targets", ga.b())
                                             .suggests(ga.a)
                                             .then(
                                                ew.a("objective", fp.a())
                                                   .then(
                                                      ew.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (ev)$$0x.getSource(),
                                                                  ga.c($$0x, "targets"),
                                                                  fp.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ew.a("remove")
                                    .then(
                                       ew.a("targets", ga.b())
                                          .suggests(ga.a)
                                          .then(
                                             ew.a("objective", fp.a())
                                                .then(
                                                   ew.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (ev)$$0x.getSource(),
                                                               ga.c($$0x, "targets"),
                                                               fp.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ew.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)ew.a("targets", ga.b())
                                          .suggests(ga.a)
                                          .executes($$0x -> a((ev)$$0x.getSource(), ga.c($$0x, "targets"))))
                                       .then(
                                          ew.a("objective", fp.a()).executes($$0x -> b((ev)$$0x.getSource(), ga.c($$0x, "targets"), fp.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           ew.a("enable")
                              .then(
                                 ew.a("targets", ga.b())
                                    .suggests(ga.a)
                                    .then(
                                       ew.a("objective", fp.a())
                                          .suggests(($$0x, $$1x) -> a((ev)$$0x.getSource(), ga.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((ev)$$0x.getSource(), ga.c($$0x, "targets"), fp.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)ew.a("display")
                              .then(
                                 ew.a("name")
                                    .then(
                                       ew.a("targets", ga.b())
                                          .suggests(ga.a)
                                          .then(
                                             ((RequiredArgumentBuilder)ew.a("objective", fp.a())
                                                   .then(
                                                      ew.a("name", fe.a($$1))
                                                         .executes(
                                                            $$0x -> a((ev)$$0x.getSource(), ga.c($$0x, "targets"), fp.a($$0x, "objective"), fe.a($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((ev)$$0x.getSource(), ga.c($$0x, "targets"), fp.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              ew.a("numberformat")
                                 .then(
                                    ew.a("targets", ga.b())
                                       .suggests(ga.a)
                                       .then(
                                          a(
                                             $$1,
                                             ew.a("objective", fp.a()),
                                             ($$0x, $$1x) -> a((ev)$$0x.getSource(), ga.c($$0x, "targets"), fp.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     ew.a("operation")
                        .then(
                           ew.a("targets", ga.b())
                              .suggests(ga.a)
                              .then(
                                 ew.a("targetObjective", fp.a())
                                    .then(
                                       ew.a("operation", fr.a())
                                          .then(
                                             ew.a("source", ga.b())
                                                .suggests(ga.a)
                                                .then(
                                                   ew.a("sourceObjective", fp.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ev)$$0x.getSource(),
                                                               ga.c($$0x, "targets"),
                                                               fp.b($$0x, "targetObjective"),
                                                               fr.a($$0x, "operation"),
                                                               ga.c($$0x, "source"),
                                                               fp.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<ev, ?> a(er $$0, ArgumentBuilder<ev, ?> $$1, aov.a $$2) {
      return $$1.then(ew.a("blank").executes($$1x -> $$2.run($$1x, yv.a))).then(ew.a("fixed").then(ew.a("contents", fe.a($$0)).executes($$1x -> {
         xh $$2x = fe.a($$1x, "contents");
         return $$2.run($$1x, new yw($$2x));
      }))).then(ew.a("styled").then(ew.a("style", gg.a($$0)).executes($$1x -> {
         ye $$2x = gg.a($$1x, "style");
         return $$2.run($$1x, new za($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<ev> a() {
      LiteralArgumentBuilder<ev> $$0 = ew.a("rendertype");

      for (fap.a $$1 : fap.a.values()) {
         $$0.then(ew.a($$1.a()).executes($$1x -> a((ev)$$1x.getSource(), fp.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(ev $$0, Collection<fal> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      fam $$4 = $$0.l().aJ();

      for (fae $$5 : $$4.c()) {
         if ($$5.c() == fap.c) {
            boolean $$6 = false;

            for (fal $$7 : $$1) {
               fai $$8 = $$4.d($$7, $$5);
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

      return fa.b($$3, $$2);
   }

   private static int a(ev $$0, fal $$1, fae $$2) throws CommandSyntaxException {
      fam $$3 = $$0.l().aJ();
      fai $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.hk());
      } else {
         $$0.a(() -> xh.a("commands.scoreboard.players.get.success", $$1.hk(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static xh a(Collection<fal> $$0) {
      return $$0.iterator().next().hk();
   }

   private static int a(ev $$0, Collection<fal> $$1, fae $$2, fr.a $$3, Collection<fal> $$4, fae $$5) throws CommandSyntaxException {
      fam $$6 = $$0.l().aJ();
      int $$7 = 0;

      for (fal $$8 : $$1) {
         fak $$9 = $$6.c($$8, $$2);

         for (fal $$10 : $$4) {
            fak $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> xh.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> xh.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(ev $$0, Collection<fal> $$1, fae $$2) throws CommandSyntaxException {
      if ($$2.c() != fap.c) {
         throw e.create();
      } else {
         fam $$3 = $$0.l().aJ();
         int $$4 = 0;

         for (fal $$5 : $$1) {
            fak $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xh.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> xh.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(ev $$0, Collection<fal> $$1) {
      fam $$2 = $$0.l().aJ();

      for (fal $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> xh.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ev $$0, Collection<fal> $$1, fae $$2) {
      fam $$3 = $$0.l().aJ();

      for (fal $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> xh.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ev $$0, Collection<fal> $$1, fae $$2, int $$3) {
      fam $$4 = $$0.l().aJ();

      for (fal $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> xh.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(ev $$0, Collection<fal> $$1, fae $$2, @Nullable xh $$3) {
      fam $$4 = $$0.l().aJ();

      for (fal $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xh.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> xh.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> xh.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(ev $$0, Collection<fal> $$1, fae $$2, @Nullable yx $$3) {
      fam $$4 = $$0.l().aJ();

      for (fal $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xh.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> xh.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> xh.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(ev $$0, Collection<fal> $$1, fae $$2, int $$3) {
      fam $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fal $$6 : $$1) {
         fak $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xh.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xh.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(ev $$0, Collection<fal> $$1, fae $$2, int $$3) {
      fam $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fal $$6 : $$1) {
         fak $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xh.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xh.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(ev $$0) {
      Collection<fal> $$1 = $$0.l().aJ().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> xh.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> xh.a("commands.scoreboard.players.list.success", $$1.size(), xk.b($$1, fal::hk)), false);
      }

      return $$1.size();
   }

   private static int a(ev $$0, fal $$1) {
      Object2IntMap<fae> $$2 = $$0.l().aJ().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> xh.a("commands.scoreboard.players.list.entity.empty", $$1.hk()), false);
      } else {
         $$0.a(() -> xh.a("commands.scoreboard.players.list.entity.success", $$1.hk(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> xh.a("commands.scoreboard.players.list.entity.entry", ((fae)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(ev $$0, fad $$1) throws CommandSyntaxException {
      fam $$2 = $$0.l().aJ();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> xh.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(ev $$0, fad $$1, fae $$2) throws CommandSyntaxException {
      fam $$3 = $$0.l().aJ();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xh.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(ev $$0, fae $$1, xh $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> xh.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(ev $$0, fae $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> xh.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> xh.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(ev $$0, fae $$1, @Nullable yx $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> xh.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> xh.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(ev $$0, fae $$1, fap.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> xh.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(ev $$0, fae $$1) {
      fam $$2 = $$0.l().aJ();
      $$2.j($$1);
      $$0.a(() -> xh.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(ev $$0, String $$1, fap $$2, xh $$3) throws CommandSyntaxException {
      fam $$4 = $$0.l().aJ();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         fae $$5 = $$4.a($$1);
         $$0.a(() -> xh.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(ev $$0) {
      Collection<fae> $$1 = $$0.l().aJ().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> xh.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> xh.a("commands.scoreboard.objectives.list.success", $$1.size(), xk.b($$1, fae::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<ev> var1, @Nullable yx var2) throws CommandSyntaxException;
   }
}
