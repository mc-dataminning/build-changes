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

public class anr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ws.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ws.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ws.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> ws.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("objectives")
                                 .then(ed.a("list").executes($$0x -> b((ec)$$0x.getSource()))))
                              .then(
                                 ed.a("add")
                                    .then(
                                       ed.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)ed.a("criteria", ex.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ec)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            ex.a($$0x, "criteria"),
                                                            ws.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   ed.a("displayName", el.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ec)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               ex.a($$0x, "criteria"),
                                                               el.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ed.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("objective", ew.a())
                                                .then(
                                                   ed.a("displayname")
                                                      .then(
                                                         ed.a("displayName", el.a($$1))
                                                            .executes($$0x -> a((ec)$$0x.getSource(), ew.a($$0x, "objective"), el.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             ed.a("displayautoupdate")
                                                .then(
                                                   ed.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((ec)$$0x.getSource(), ew.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, ed.a("numberformat"), ($$0x, $$1x) -> a((ec)$$0x.getSource(), ew.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(ed.a("remove").then(ed.a("objective", ew.a()).executes($$0x -> a((ec)$$0x.getSource(), ew.a($$0x, "objective"))))))
                     .then(
                        ed.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)ed.a("slot", fh.a()).executes($$0x -> a((ec)$$0x.getSource(), fh.a($$0x, "slot"))))
                                 .then(ed.a("objective", ew.a()).executes($$0x -> a((ec)$$0x.getSource(), fh.a($$0x, "slot"), ew.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)ed.a("list").executes($$0x -> a((ec)$$0x.getSource())))
                                                .then(ed.a("target", fg.a()).suggests(fg.a).executes($$0x -> a((ec)$$0x.getSource(), fg.a($$0x, "target"))))
                                          ))
                                       .then(
                                          ed.a("set")
                                             .then(
                                                ed.a("targets", fg.b())
                                                   .suggests(fg.a)
                                                   .then(
                                                      ed.a("objective", ew.a())
                                                         .then(
                                                            ed.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ec)$$0x.getSource(),
                                                                        fg.c($$0x, "targets"),
                                                                        ew.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ed.a("get")
                                          .then(
                                             ed.a("target", fg.a())
                                                .suggests(fg.a)
                                                .then(
                                                   ed.a("objective", ew.a())
                                                      .executes($$0x -> a((ec)$$0x.getSource(), fg.a($$0x, "target"), ew.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    ed.a("add")
                                       .then(
                                          ed.a("targets", fg.b())
                                             .suggests(fg.a)
                                             .then(
                                                ed.a("objective", ew.a())
                                                   .then(
                                                      ed.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (ec)$$0x.getSource(),
                                                                  fg.c($$0x, "targets"),
                                                                  ew.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ed.a("remove")
                                    .then(
                                       ed.a("targets", fg.b())
                                          .suggests(fg.a)
                                          .then(
                                             ed.a("objective", ew.a())
                                                .then(
                                                   ed.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (ec)$$0x.getSource(),
                                                               fg.c($$0x, "targets"),
                                                               ew.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ed.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)ed.a("targets", fg.b())
                                          .suggests(fg.a)
                                          .executes($$0x -> a((ec)$$0x.getSource(), fg.c($$0x, "targets"))))
                                       .then(
                                          ed.a("objective", ew.a()).executes($$0x -> b((ec)$$0x.getSource(), fg.c($$0x, "targets"), ew.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           ed.a("enable")
                              .then(
                                 ed.a("targets", fg.b())
                                    .suggests(fg.a)
                                    .then(
                                       ed.a("objective", ew.a())
                                          .suggests(($$0x, $$1x) -> a((ec)$$0x.getSource(), fg.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((ec)$$0x.getSource(), fg.c($$0x, "targets"), ew.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)ed.a("display")
                              .then(
                                 ed.a("name")
                                    .then(
                                       ed.a("targets", fg.b())
                                          .suggests(fg.a)
                                          .then(
                                             ((RequiredArgumentBuilder)ed.a("objective", ew.a())
                                                   .then(
                                                      ed.a("name", el.a($$1))
                                                         .executes(
                                                            $$0x -> a((ec)$$0x.getSource(), fg.c($$0x, "targets"), ew.a($$0x, "objective"), el.a($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((ec)$$0x.getSource(), fg.c($$0x, "targets"), ew.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              ed.a("numberformat")
                                 .then(
                                    ed.a("targets", fg.b())
                                       .suggests(fg.a)
                                       .then(
                                          a(
                                             $$1,
                                             ed.a("objective", ew.a()),
                                             ($$0x, $$1x) -> a((ec)$$0x.getSource(), fg.c($$0x, "targets"), ew.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     ed.a("operation")
                        .then(
                           ed.a("targets", fg.b())
                              .suggests(fg.a)
                              .then(
                                 ed.a("targetObjective", ew.a())
                                    .then(
                                       ed.a("operation", ey.a())
                                          .then(
                                             ed.a("source", fg.b())
                                                .suggests(fg.a)
                                                .then(
                                                   ed.a("sourceObjective", ew.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ec)$$0x.getSource(),
                                                               fg.c($$0x, "targets"),
                                                               ew.b($$0x, "targetObjective"),
                                                               ey.a($$0x, "operation"),
                                                               fg.c($$0x, "source"),
                                                               ew.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<ec, ?> a(dy $$0, ArgumentBuilder<ec, ?> $$1, anr.a $$2) {
      return $$1.then(ed.a("blank").executes($$1x -> $$2.run($$1x, yg.a))).then(ed.a("fixed").then(ed.a("contents", el.a($$0)).executes($$1x -> {
         ws $$2x = el.a($$1x, "contents");
         return $$2.run($$1x, new yh($$2x));
      }))).then(ed.a("styled").then(ed.a("style", fm.a($$0)).executes($$1x -> {
         xp $$2x = fm.a($$1x, "style");
         return $$2.run($$1x, new yl($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<ec> a() {
      LiteralArgumentBuilder<ec> $$0 = ed.a("rendertype");

      for (eum.a $$1 : eum.a.values()) {
         $$0.then(ed.a($$1.a()).executes($$1x -> a((ec)$$1x.getSource(), ew.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(ec $$0, Collection<eui> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      euj $$4 = $$0.l().aK();

      for (eub $$5 : $$4.c()) {
         if ($$5.c() == eum.c) {
            boolean $$6 = false;

            for (eui $$7 : $$1) {
               euf $$8 = $$4.d($$7, $$5);
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

      return eh.b($$3, $$2);
   }

   private static int a(ec $$0, eui $$1, eub $$2) throws CommandSyntaxException {
      euj $$3 = $$0.l().aK();
      euf $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.hd());
      } else {
         $$0.a(() -> ws.a("commands.scoreboard.players.get.success", $$1.hd(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static ws a(Collection<eui> $$0) {
      return $$0.iterator().next().hd();
   }

   private static int a(ec $$0, Collection<eui> $$1, eub $$2, ey.a $$3, Collection<eui> $$4, eub $$5) throws CommandSyntaxException {
      euj $$6 = $$0.l().aK();
      int $$7 = 0;

      for (eui $$8 : $$1) {
         euh $$9 = $$6.c($$8, $$2);

         for (eui $$10 : $$4) {
            euh $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> ws.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> ws.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(ec $$0, Collection<eui> $$1, eub $$2) throws CommandSyntaxException {
      if ($$2.c() != eum.c) {
         throw e.create();
      } else {
         euj $$3 = $$0.l().aK();
         int $$4 = 0;

         for (eui $$5 : $$1) {
            euh $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> ws.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> ws.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(ec $$0, Collection<eui> $$1) {
      euj $$2 = $$0.l().aK();

      for (eui $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> ws.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ec $$0, Collection<eui> $$1, eub $$2) {
      euj $$3 = $$0.l().aK();

      for (eui $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> ws.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ec $$0, Collection<eui> $$1, eub $$2, int $$3) {
      euj $$4 = $$0.l().aK();

      for (eui $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> ws.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(ec $$0, Collection<eui> $$1, eub $$2, @Nullable ws $$3) {
      euj $$4 = $$0.l().aK();

      for (eui $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> ws.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> ws.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> ws.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(ec $$0, Collection<eui> $$1, eub $$2, @Nullable yi $$3) {
      euj $$4 = $$0.l().aK();

      for (eui $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> ws.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> ws.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> ws.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(ec $$0, Collection<eui> $$1, eub $$2, int $$3) {
      euj $$4 = $$0.l().aK();
      int $$5 = 0;

      for (eui $$6 : $$1) {
         euh $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> ws.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> ws.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(ec $$0, Collection<eui> $$1, eub $$2, int $$3) {
      euj $$4 = $$0.l().aK();
      int $$5 = 0;

      for (eui $$6 : $$1) {
         euh $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> ws.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> ws.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(ec $$0) {
      Collection<eui> $$1 = $$0.l().aK().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> ws.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> ws.a("commands.scoreboard.players.list.success", $$1.size(), wv.b($$1, eui::hd)), false);
      }

      return $$1.size();
   }

   private static int a(ec $$0, eui $$1) {
      Object2IntMap<eub> $$2 = $$0.l().aK().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> ws.a("commands.scoreboard.players.list.entity.empty", $$1.hd()), false);
      } else {
         $$0.a(() -> ws.a("commands.scoreboard.players.list.entity.success", $$1.hd(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> ws.a("commands.scoreboard.players.list.entity.entry", ((eub)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(ec $$0, eua $$1) throws CommandSyntaxException {
      euj $$2 = $$0.l().aK();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> ws.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(ec $$0, eua $$1, eub $$2) throws CommandSyntaxException {
      euj $$3 = $$0.l().aK();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> ws.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(ec $$0, eub $$1, ws $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> ws.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(ec $$0, eub $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> ws.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> ws.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(ec $$0, eub $$1, @Nullable yi $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> ws.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> ws.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(ec $$0, eub $$1, eum.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> ws.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(ec $$0, eub $$1) {
      euj $$2 = $$0.l().aK();
      $$2.j($$1);
      $$0.a(() -> ws.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(ec $$0, String $$1, eum $$2, ws $$3) throws CommandSyntaxException {
      euj $$4 = $$0.l().aK();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         eub $$5 = $$4.a($$1);
         $$0.a(() -> ws.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(ec $$0) {
      Collection<eub> $$1 = $$0.l().aK().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> ws.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> ws.a("commands.scoreboard.objectives.list.success", $$1.size(), wv.b($$1, eub::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<ec> var1, @Nullable yi var2) throws CommandSyntaxException;
   }
}
