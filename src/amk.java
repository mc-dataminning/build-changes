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

public class amk {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vq.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vq.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vq.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vq.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vq.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> vq.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("objectives")
                                 .then(dv.a("list").executes($$0x -> b((du)$$0x.getSource()))))
                              .then(
                                 dv.a("add")
                                    .then(
                                       dv.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)dv.a("criteria", ep.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            ep.a($$0x, "criteria"),
                                                            vq.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("displayName", ed.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               ep.a($$0x, "criteria"),
                                                               ed.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              dv.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("objective", eo.a())
                                                .then(
                                                   dv.a("displayname")
                                                      .then(
                                                         dv.a("displayName", ed.a())
                                                            .executes($$0x -> a((du)$$0x.getSource(), eo.a($$0x, "objective"), ed.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             dv.a("displayautoupdate")
                                                .then(
                                                   dv.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((du)$$0x.getSource(), eo.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a(dv.a("numberformat"), ($$0x, $$1) -> a((du)$$0x.getSource(), eo.a($$0x, "objective"), $$1)))
                                 )
                           ))
                        .then(dv.a("remove").then(dv.a("objective", eo.a()).executes($$0x -> a((du)$$0x.getSource(), eo.a($$0x, "objective"))))))
                     .then(
                        dv.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)dv.a("slot", ez.a()).executes($$0x -> a((du)$$0x.getSource(), ez.a($$0x, "slot"))))
                                 .then(dv.a("objective", eo.a()).executes($$0x -> a((du)$$0x.getSource(), ez.a($$0x, "slot"), eo.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)dv.a("list").executes($$0x -> a((du)$$0x.getSource())))
                                                .then(dv.a("target", ey.a()).suggests(ey.a).executes($$0x -> a((du)$$0x.getSource(), ey.a($$0x, "target"))))
                                          ))
                                       .then(
                                          dv.a("set")
                                             .then(
                                                dv.a("targets", ey.b())
                                                   .suggests(ey.a)
                                                   .then(
                                                      dv.a("objective", eo.a())
                                                         .then(
                                                            dv.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (du)$$0x.getSource(),
                                                                        ey.c($$0x, "targets"),
                                                                        eo.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       dv.a("get")
                                          .then(
                                             dv.a("target", ey.a())
                                                .suggests(ey.a)
                                                .then(
                                                   dv.a("objective", eo.a())
                                                      .executes($$0x -> a((du)$$0x.getSource(), ey.a($$0x, "target"), eo.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    dv.a("add")
                                       .then(
                                          dv.a("targets", ey.b())
                                             .suggests(ey.a)
                                             .then(
                                                dv.a("objective", eo.a())
                                                   .then(
                                                      dv.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (du)$$0x.getSource(),
                                                                  ey.c($$0x, "targets"),
                                                                  eo.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dv.a("remove")
                                    .then(
                                       dv.a("targets", ey.b())
                                          .suggests(ey.a)
                                          .then(
                                             dv.a("objective", eo.a())
                                                .then(
                                                   dv.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (du)$$0x.getSource(),
                                                               ey.c($$0x, "targets"),
                                                               eo.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              dv.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)dv.a("targets", ey.b())
                                          .suggests(ey.a)
                                          .executes($$0x -> a((du)$$0x.getSource(), ey.c($$0x, "targets"))))
                                       .then(
                                          dv.a("objective", eo.a()).executes($$0x -> b((du)$$0x.getSource(), ey.c($$0x, "targets"), eo.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           dv.a("enable")
                              .then(
                                 dv.a("targets", ey.b())
                                    .suggests(ey.a)
                                    .then(
                                       dv.a("objective", eo.a())
                                          .suggests(($$0x, $$1) -> a((du)$$0x.getSource(), ey.c($$0x, "targets"), $$1))
                                          .executes($$0x -> a((du)$$0x.getSource(), ey.c($$0x, "targets"), eo.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)dv.a("display")
                              .then(
                                 dv.a("name")
                                    .then(
                                       dv.a("targets", ey.b())
                                          .suggests(ey.a)
                                          .then(
                                             ((RequiredArgumentBuilder)dv.a("objective", eo.a())
                                                   .then(
                                                      dv.a("name", ed.a())
                                                         .executes(
                                                            $$0x -> a((du)$$0x.getSource(), ey.c($$0x, "targets"), eo.a($$0x, "objective"), ed.a($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((du)$$0x.getSource(), ey.c($$0x, "targets"), eo.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              dv.a("numberformat")
                                 .then(
                                    dv.a("targets", ey.b())
                                       .suggests(ey.a)
                                       .then(
                                          a(
                                             dv.a("objective", eo.a()),
                                             ($$0x, $$1) -> a((du)$$0x.getSource(), ey.c($$0x, "targets"), eo.a($$0x, "objective"), $$1)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     dv.a("operation")
                        .then(
                           dv.a("targets", ey.b())
                              .suggests(ey.a)
                              .then(
                                 dv.a("targetObjective", eo.a())
                                    .then(
                                       dv.a("operation", eq.a())
                                          .then(
                                             dv.a("source", ey.b())
                                                .suggests(ey.a)
                                                .then(
                                                   dv.a("sourceObjective", eo.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               ey.c($$0x, "targets"),
                                                               eo.b($$0x, "targetObjective"),
                                                               eq.a($$0x, "operation"),
                                                               ey.c($$0x, "source"),
                                                               eo.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<du, ?> a(ArgumentBuilder<du, ?> $$0, amk.a $$1) {
      return $$0.then(dv.a("blank").executes($$1x -> $$1.run($$1x, xe.a))).then(dv.a("fixed").then(dv.a("contents", ed.a()).executes($$1x -> {
         vq $$2 = ed.a($$1x, "contents");
         return $$1.run($$1x, new xf($$2));
      }))).then(dv.a("styled").then(dv.a("style", fd.a()).executes($$1x -> {
         wn $$2 = fd.a($$1x, "style");
         return $$1.run($$1x, new xj($$2));
      }))).executes($$1x -> $$1.run($$1x, null));
   }

   private static LiteralArgumentBuilder<du> a() {
      LiteralArgumentBuilder<du> $$0 = dv.a("rendertype");

      for (epg.a $$1 : epg.a.values()) {
         $$0.then(dv.a($$1.a()).executes($$1x -> a((du)$$1x.getSource(), eo.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(du $$0, Collection<epc> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      epd $$4 = $$0.l().aJ();

      for (eov $$5 : $$4.c()) {
         if ($$5.c() == epg.c) {
            boolean $$6 = false;

            for (epc $$7 : $$1) {
               eoz $$8 = $$4.d($$7, $$5);
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

      return dz.b($$3, $$2);
   }

   private static int a(du $$0, epc $$1, eov $$2) throws CommandSyntaxException {
      epd $$3 = $$0.l().aJ();
      eoz $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.gW());
      } else {
         $$0.a(() -> vq.a("commands.scoreboard.players.get.success", $$1.gW(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static vq a(Collection<epc> $$0) {
      return $$0.iterator().next().gW();
   }

   private static int a(du $$0, Collection<epc> $$1, eov $$2, eq.a $$3, Collection<epc> $$4, eov $$5) throws CommandSyntaxException {
      epd $$6 = $$0.l().aJ();
      int $$7 = 0;

      for (epc $$8 : $$1) {
         epb $$9 = $$6.c($$8, $$2);

         for (epc $$10 : $$4) {
            epb $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> vq.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> vq.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(du $$0, Collection<epc> $$1, eov $$2) throws CommandSyntaxException {
      if ($$2.c() != epg.c) {
         throw e.create();
      } else {
         epd $$3 = $$0.l().aJ();
         int $$4 = 0;

         for (epc $$5 : $$1) {
            epb $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> vq.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> vq.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(du $$0, Collection<epc> $$1) {
      epd $$2 = $$0.l().aJ();

      for (epc $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vq.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> vq.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(du $$0, Collection<epc> $$1, eov $$2) {
      epd $$3 = $$0.l().aJ();

      for (epc $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vq.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> vq.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<epc> $$1, eov $$2, int $$3) {
      epd $$4 = $$0.l().aJ();

      for (epc $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vq.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> vq.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(du $$0, Collection<epc> $$1, eov $$2, @Nullable vq $$3) {
      epd $$4 = $$0.l().aJ();

      for (epc $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> vq.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> vq.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> vq.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> vq.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<epc> $$1, eov $$2, @Nullable xg $$3) {
      epd $$4 = $$0.l().aJ();

      for (epc $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> vq.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> vq.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> vq.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> vq.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(du $$0, Collection<epc> $$1, eov $$2, int $$3) {
      epd $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (epc $$6 : $$1) {
         epb $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> vq.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> vq.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(du $$0, Collection<epc> $$1, eov $$2, int $$3) {
      epd $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (epc $$6 : $$1) {
         epb $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> vq.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> vq.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(du $$0) {
      Collection<epc> $$1 = $$0.l().aJ().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> vq.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> vq.a("commands.scoreboard.players.list.success", $$1.size(), vt.b($$1, epc::gW)), false);
      }

      return $$1.size();
   }

   private static int a(du $$0, epc $$1) {
      Object2IntMap<eov> $$2 = $$0.l().aJ().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> vq.a("commands.scoreboard.players.list.entity.empty", $$1.gW()), false);
      } else {
         $$0.a(() -> vq.a("commands.scoreboard.players.list.entity.success", $$1.gW(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> vq.a("commands.scoreboard.players.list.entity.entry", ((eov)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(du $$0, eou $$1) throws CommandSyntaxException {
      epd $$2 = $$0.l().aJ();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> vq.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(du $$0, eou $$1, eov $$2) throws CommandSyntaxException {
      epd $$3 = $$0.l().aJ();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> vq.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(du $$0, eov $$1, vq $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> vq.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(du $$0, eov $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> vq.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> vq.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(du $$0, eov $$1, @Nullable xg $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> vq.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> vq.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(du $$0, eov $$1, epg.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> vq.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(du $$0, eov $$1) {
      epd $$2 = $$0.l().aJ();
      $$2.j($$1);
      $$0.a(() -> vq.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(du $$0, String $$1, epg $$2, vq $$3) throws CommandSyntaxException {
      epd $$4 = $$0.l().aJ();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         eov $$5 = $$4.a($$1);
         $$0.a(() -> vq.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(du $$0) {
      Collection<eov> $$1 = $$0.l().aJ().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> vq.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> vq.a("commands.scoreboard.objectives.list.success", $$1.size(), vt.b($$1, eov::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<du> var1, @Nullable xg var2) throws CommandSyntaxException;
   }
}
