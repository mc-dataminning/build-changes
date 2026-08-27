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

public class aoa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wx.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wx.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wx.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("objectives")
                                 .then(ef.a("list").executes($$0x -> b((ee)$$0x.getSource()))))
                              .then(
                                 ef.a("add")
                                    .then(
                                       ef.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)ef.a("criteria", ez.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ee)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            ez.a($$0x, "criteria"),
                                                            wx.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   ef.a("displayName", en.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ee)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               ez.a($$0x, "criteria"),
                                                               en.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ef.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("objective", ey.a())
                                                .then(
                                                   ef.a("displayname")
                                                      .then(
                                                         ef.a("displayName", en.a($$1))
                                                            .executes($$0x -> a((ee)$$0x.getSource(), ey.a($$0x, "objective"), en.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             ef.a("displayautoupdate")
                                                .then(
                                                   ef.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((ee)$$0x.getSource(), ey.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, ef.a("numberformat"), ($$0x, $$1x) -> a((ee)$$0x.getSource(), ey.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(ef.a("remove").then(ef.a("objective", ey.a()).executes($$0x -> a((ee)$$0x.getSource(), ey.a($$0x, "objective"))))))
                     .then(
                        ef.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)ef.a("slot", fk.a()).executes($$0x -> a((ee)$$0x.getSource(), fk.a($$0x, "slot"))))
                                 .then(ef.a("objective", ey.a()).executes($$0x -> a((ee)$$0x.getSource(), fk.a($$0x, "slot"), ey.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)ef.a("list").executes($$0x -> a((ee)$$0x.getSource())))
                                                .then(ef.a("target", fj.a()).suggests(fj.a).executes($$0x -> a((ee)$$0x.getSource(), fj.a($$0x, "target"))))
                                          ))
                                       .then(
                                          ef.a("set")
                                             .then(
                                                ef.a("targets", fj.b())
                                                   .suggests(fj.a)
                                                   .then(
                                                      ef.a("objective", ey.a())
                                                         .then(
                                                            ef.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ee)$$0x.getSource(),
                                                                        fj.c($$0x, "targets"),
                                                                        ey.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ef.a("get")
                                          .then(
                                             ef.a("target", fj.a())
                                                .suggests(fj.a)
                                                .then(
                                                   ef.a("objective", ey.a())
                                                      .executes($$0x -> a((ee)$$0x.getSource(), fj.a($$0x, "target"), ey.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    ef.a("add")
                                       .then(
                                          ef.a("targets", fj.b())
                                             .suggests(fj.a)
                                             .then(
                                                ef.a("objective", ey.a())
                                                   .then(
                                                      ef.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (ee)$$0x.getSource(),
                                                                  fj.c($$0x, "targets"),
                                                                  ey.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ef.a("remove")
                                    .then(
                                       ef.a("targets", fj.b())
                                          .suggests(fj.a)
                                          .then(
                                             ef.a("objective", ey.a())
                                                .then(
                                                   ef.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (ee)$$0x.getSource(),
                                                               fj.c($$0x, "targets"),
                                                               ey.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ef.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)ef.a("targets", fj.b())
                                          .suggests(fj.a)
                                          .executes($$0x -> a((ee)$$0x.getSource(), fj.c($$0x, "targets"))))
                                       .then(
                                          ef.a("objective", ey.a()).executes($$0x -> b((ee)$$0x.getSource(), fj.c($$0x, "targets"), ey.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           ef.a("enable")
                              .then(
                                 ef.a("targets", fj.b())
                                    .suggests(fj.a)
                                    .then(
                                       ef.a("objective", ey.a())
                                          .suggests(($$0x, $$1x) -> a((ee)$$0x.getSource(), fj.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((ee)$$0x.getSource(), fj.c($$0x, "targets"), ey.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)ef.a("display")
                              .then(
                                 ef.a("name")
                                    .then(
                                       ef.a("targets", fj.b())
                                          .suggests(fj.a)
                                          .then(
                                             ((RequiredArgumentBuilder)ef.a("objective", ey.a())
                                                   .then(
                                                      ef.a("name", en.a($$1))
                                                         .executes(
                                                            $$0x -> a((ee)$$0x.getSource(), fj.c($$0x, "targets"), ey.a($$0x, "objective"), en.a($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((ee)$$0x.getSource(), fj.c($$0x, "targets"), ey.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              ef.a("numberformat")
                                 .then(
                                    ef.a("targets", fj.b())
                                       .suggests(fj.a)
                                       .then(
                                          a(
                                             $$1,
                                             ef.a("objective", ey.a()),
                                             ($$0x, $$1x) -> a((ee)$$0x.getSource(), fj.c($$0x, "targets"), ey.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     ef.a("operation")
                        .then(
                           ef.a("targets", fj.b())
                              .suggests(fj.a)
                              .then(
                                 ef.a("targetObjective", ey.a())
                                    .then(
                                       ef.a("operation", fa.a())
                                          .then(
                                             ef.a("source", fj.b())
                                                .suggests(fj.a)
                                                .then(
                                                   ef.a("sourceObjective", ey.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ee)$$0x.getSource(),
                                                               fj.c($$0x, "targets"),
                                                               ey.b($$0x, "targetObjective"),
                                                               fa.a($$0x, "operation"),
                                                               fj.c($$0x, "source"),
                                                               ey.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<ee, ?> a(ea $$0, ArgumentBuilder<ee, ?> $$1, aoa.a $$2) {
      return $$1.then(ef.a("blank").executes($$1x -> $$2.run($$1x, yl.a))).then(ef.a("fixed").then(ef.a("contents", en.a($$0)).executes($$1x -> {
         wx $$2x = en.a($$1x, "contents");
         return $$2.run($$1x, new ym($$2x));
      }))).then(ef.a("styled").then(ef.a("style", fp.a($$0)).executes($$1x -> {
         xu $$2x = fp.a($$1x, "style");
         return $$2.run($$1x, new yq($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<ee> a() {
      LiteralArgumentBuilder<ee> $$0 = ef.a("rendertype");

      for (evt.a $$1 : evt.a.values()) {
         $$0.then(ef.a($$1.a()).executes($$1x -> a((ee)$$1x.getSource(), ey.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(ee $$0, Collection<evp> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      evq $$4 = $$0.l().aK();

      for (evi $$5 : $$4.c()) {
         if ($$5.c() == evt.c) {
            boolean $$6 = false;

            for (evp $$7 : $$1) {
               evm $$8 = $$4.d($$7, $$5);
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

      return ej.b($$3, $$2);
   }

   private static int a(ee $$0, evp $$1, evi $$2) throws CommandSyntaxException {
      evq $$3 = $$0.l().aK();
      evm $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.hd());
      } else {
         $$0.a(() -> wx.a("commands.scoreboard.players.get.success", $$1.hd(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static wx a(Collection<evp> $$0) {
      return $$0.iterator().next().hd();
   }

   private static int a(ee $$0, Collection<evp> $$1, evi $$2, fa.a $$3, Collection<evp> $$4, evi $$5) throws CommandSyntaxException {
      evq $$6 = $$0.l().aK();
      int $$7 = 0;

      for (evp $$8 : $$1) {
         evo $$9 = $$6.c($$8, $$2);

         for (evp $$10 : $$4) {
            evo $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> wx.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> wx.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(ee $$0, Collection<evp> $$1, evi $$2) throws CommandSyntaxException {
      if ($$2.c() != evt.c) {
         throw e.create();
      } else {
         evq $$3 = $$0.l().aK();
         int $$4 = 0;

         for (evp $$5 : $$1) {
            evo $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> wx.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> wx.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(ee $$0, Collection<evp> $$1) {
      evq $$2 = $$0.l().aK();

      for (evp $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> wx.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ee $$0, Collection<evp> $$1, evi $$2) {
      evq $$3 = $$0.l().aK();

      for (evp $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> wx.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ee $$0, Collection<evp> $$1, evi $$2, int $$3) {
      evq $$4 = $$0.l().aK();

      for (evp $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> wx.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(ee $$0, Collection<evp> $$1, evi $$2, @Nullable wx $$3) {
      evq $$4 = $$0.l().aK();

      for (evp $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> wx.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> wx.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> wx.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(ee $$0, Collection<evp> $$1, evi $$2, @Nullable yn $$3) {
      evq $$4 = $$0.l().aK();

      for (evp $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> wx.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> wx.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> wx.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(ee $$0, Collection<evp> $$1, evi $$2, int $$3) {
      evq $$4 = $$0.l().aK();
      int $$5 = 0;

      for (evp $$6 : $$1) {
         evo $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> wx.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> wx.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(ee $$0, Collection<evp> $$1, evi $$2, int $$3) {
      evq $$4 = $$0.l().aK();
      int $$5 = 0;

      for (evp $$6 : $$1) {
         evo $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> wx.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> wx.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(ee $$0) {
      Collection<evp> $$1 = $$0.l().aK().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> wx.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> wx.a("commands.scoreboard.players.list.success", $$1.size(), xa.b($$1, evp::hd)), false);
      }

      return $$1.size();
   }

   private static int a(ee $$0, evp $$1) {
      Object2IntMap<evi> $$2 = $$0.l().aK().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> wx.a("commands.scoreboard.players.list.entity.empty", $$1.hd()), false);
      } else {
         $$0.a(() -> wx.a("commands.scoreboard.players.list.entity.success", $$1.hd(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> wx.a("commands.scoreboard.players.list.entity.entry", ((evi)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(ee $$0, evh $$1) throws CommandSyntaxException {
      evq $$2 = $$0.l().aK();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> wx.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(ee $$0, evh $$1, evi $$2) throws CommandSyntaxException {
      evq $$3 = $$0.l().aK();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> wx.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(ee $$0, evi $$1, wx $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> wx.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(ee $$0, evi $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> wx.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> wx.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(ee $$0, evi $$1, @Nullable yn $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> wx.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> wx.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(ee $$0, evi $$1, evt.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> wx.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(ee $$0, evi $$1) {
      evq $$2 = $$0.l().aK();
      $$2.j($$1);
      $$0.a(() -> wx.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(ee $$0, String $$1, evt $$2, wx $$3) throws CommandSyntaxException {
      evq $$4 = $$0.l().aK();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         evi $$5 = $$4.a($$1);
         $$0.a(() -> wx.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(ee $$0) {
      Collection<evi> $$1 = $$0.l().aK().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> wx.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> wx.a("commands.scoreboard.objectives.list.success", $$1.size(), xa.b($$1, evi::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<ee> var1, @Nullable yn var2) throws CommandSyntaxException;
   }
}
