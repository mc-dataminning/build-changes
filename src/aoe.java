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

public class aoe {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wz.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wz.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wz.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wz.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> wz.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("objectives")
                                 .then(eu.a("list").executes($$0x -> b((et)$$0x.getSource()))))
                              .then(
                                 eu.a("add")
                                    .then(
                                       eu.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)eu.a("criteria", fo.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (et)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            fo.a($$0x, "criteria"),
                                                            wz.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   eu.a("displayName", fc.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (et)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               fo.a($$0x, "criteria"),
                                                               fc.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              eu.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("objective", fn.a())
                                                .then(
                                                   eu.a("displayname")
                                                      .then(
                                                         eu.a("displayName", fc.a($$1))
                                                            .executes($$0x -> a((et)$$0x.getSource(), fn.a($$0x, "objective"), fc.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             eu.a("displayautoupdate")
                                                .then(
                                                   eu.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((et)$$0x.getSource(), fn.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, eu.a("numberformat"), ($$0x, $$1x) -> a((et)$$0x.getSource(), fn.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(eu.a("remove").then(eu.a("objective", fn.a()).executes($$0x -> a((et)$$0x.getSource(), fn.a($$0x, "objective"))))))
                     .then(
                        eu.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)eu.a("slot", fz.a()).executes($$0x -> a((et)$$0x.getSource(), fz.a($$0x, "slot"))))
                                 .then(eu.a("objective", fn.a()).executes($$0x -> a((et)$$0x.getSource(), fz.a($$0x, "slot"), fn.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)eu.a("list").executes($$0x -> a((et)$$0x.getSource())))
                                                .then(eu.a("target", fy.a()).suggests(fy.a).executes($$0x -> a((et)$$0x.getSource(), fy.a($$0x, "target"))))
                                          ))
                                       .then(
                                          eu.a("set")
                                             .then(
                                                eu.a("targets", fy.b())
                                                   .suggests(fy.a)
                                                   .then(
                                                      eu.a("objective", fn.a())
                                                         .then(
                                                            eu.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (et)$$0x.getSource(),
                                                                        fy.c($$0x, "targets"),
                                                                        fn.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       eu.a("get")
                                          .then(
                                             eu.a("target", fy.a())
                                                .suggests(fy.a)
                                                .then(
                                                   eu.a("objective", fn.a())
                                                      .executes($$0x -> a((et)$$0x.getSource(), fy.a($$0x, "target"), fn.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    eu.a("add")
                                       .then(
                                          eu.a("targets", fy.b())
                                             .suggests(fy.a)
                                             .then(
                                                eu.a("objective", fn.a())
                                                   .then(
                                                      eu.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (et)$$0x.getSource(),
                                                                  fy.c($$0x, "targets"),
                                                                  fn.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 eu.a("remove")
                                    .then(
                                       eu.a("targets", fy.b())
                                          .suggests(fy.a)
                                          .then(
                                             eu.a("objective", fn.a())
                                                .then(
                                                   eu.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (et)$$0x.getSource(),
                                                               fy.c($$0x, "targets"),
                                                               fn.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              eu.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)eu.a("targets", fy.b())
                                          .suggests(fy.a)
                                          .executes($$0x -> a((et)$$0x.getSource(), fy.c($$0x, "targets"))))
                                       .then(
                                          eu.a("objective", fn.a()).executes($$0x -> b((et)$$0x.getSource(), fy.c($$0x, "targets"), fn.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           eu.a("enable")
                              .then(
                                 eu.a("targets", fy.b())
                                    .suggests(fy.a)
                                    .then(
                                       eu.a("objective", fn.a())
                                          .suggests(($$0x, $$1x) -> a((et)$$0x.getSource(), fy.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((et)$$0x.getSource(), fy.c($$0x, "targets"), fn.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)eu.a("display")
                              .then(
                                 eu.a("name")
                                    .then(
                                       eu.a("targets", fy.b())
                                          .suggests(fy.a)
                                          .then(
                                             ((RequiredArgumentBuilder)eu.a("objective", fn.a())
                                                   .then(
                                                      eu.a("name", fc.a($$1))
                                                         .executes(
                                                            $$0x -> a((et)$$0x.getSource(), fy.c($$0x, "targets"), fn.a($$0x, "objective"), fc.a($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((et)$$0x.getSource(), fy.c($$0x, "targets"), fn.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              eu.a("numberformat")
                                 .then(
                                    eu.a("targets", fy.b())
                                       .suggests(fy.a)
                                       .then(
                                          a(
                                             $$1,
                                             eu.a("objective", fn.a()),
                                             ($$0x, $$1x) -> a((et)$$0x.getSource(), fy.c($$0x, "targets"), fn.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     eu.a("operation")
                        .then(
                           eu.a("targets", fy.b())
                              .suggests(fy.a)
                              .then(
                                 eu.a("targetObjective", fn.a())
                                    .then(
                                       eu.a("operation", fp.a())
                                          .then(
                                             eu.a("source", fy.b())
                                                .suggests(fy.a)
                                                .then(
                                                   eu.a("sourceObjective", fn.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (et)$$0x.getSource(),
                                                               fy.c($$0x, "targets"),
                                                               fn.b($$0x, "targetObjective"),
                                                               fp.a($$0x, "operation"),
                                                               fy.c($$0x, "source"),
                                                               fn.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<et, ?> a(ep $$0, ArgumentBuilder<et, ?> $$1, aoe.a $$2) {
      return $$1.then(eu.a("blank").executes($$1x -> $$2.run($$1x, yn.a))).then(eu.a("fixed").then(eu.a("contents", fc.a($$0)).executes($$1x -> {
         wz $$2x = fc.a($$1x, "contents");
         return $$2.run($$1x, new yo($$2x));
      }))).then(eu.a("styled").then(eu.a("style", ge.a($$0)).executes($$1x -> {
         xw $$2x = ge.a($$1x, "style");
         return $$2.run($$1x, new ys($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<et> a() {
      LiteralArgumentBuilder<et> $$0 = eu.a("rendertype");

      for (eyj.a $$1 : eyj.a.values()) {
         $$0.then(eu.a($$1.a()).executes($$1x -> a((et)$$1x.getSource(), fn.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(et $$0, Collection<eyf> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      eyg $$4 = $$0.l().aK();

      for (exy $$5 : $$4.c()) {
         if ($$5.c() == eyj.c) {
            boolean $$6 = false;

            for (eyf $$7 : $$1) {
               eyc $$8 = $$4.d($$7, $$5);
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

      return ey.b($$3, $$2);
   }

   private static int a(et $$0, eyf $$1, exy $$2) throws CommandSyntaxException {
      eyg $$3 = $$0.l().aK();
      eyc $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.gY());
      } else {
         $$0.a(() -> wz.a("commands.scoreboard.players.get.success", $$1.gY(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static wz a(Collection<eyf> $$0) {
      return $$0.iterator().next().gY();
   }

   private static int a(et $$0, Collection<eyf> $$1, exy $$2, fp.a $$3, Collection<eyf> $$4, exy $$5) throws CommandSyntaxException {
      eyg $$6 = $$0.l().aK();
      int $$7 = 0;

      for (eyf $$8 : $$1) {
         eye $$9 = $$6.c($$8, $$2);

         for (eyf $$10 : $$4) {
            eye $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> wz.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> wz.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(et $$0, Collection<eyf> $$1, exy $$2) throws CommandSyntaxException {
      if ($$2.c() != eyj.c) {
         throw e.create();
      } else {
         eyg $$3 = $$0.l().aK();
         int $$4 = 0;

         for (eyf $$5 : $$1) {
            eye $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> wz.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> wz.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(et $$0, Collection<eyf> $$1) {
      eyg $$2 = $$0.l().aK();

      for (eyf $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wz.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> wz.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(et $$0, Collection<eyf> $$1, exy $$2) {
      eyg $$3 = $$0.l().aK();

      for (eyf $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wz.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> wz.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(et $$0, Collection<eyf> $$1, exy $$2, int $$3) {
      eyg $$4 = $$0.l().aK();

      for (eyf $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wz.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> wz.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(et $$0, Collection<eyf> $$1, exy $$2, @Nullable wz $$3) {
      eyg $$4 = $$0.l().aK();

      for (eyf $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> wz.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> wz.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> wz.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> wz.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(et $$0, Collection<eyf> $$1, exy $$2, @Nullable yp $$3) {
      eyg $$4 = $$0.l().aK();

      for (eyf $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> wz.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> wz.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> wz.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> wz.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(et $$0, Collection<eyf> $$1, exy $$2, int $$3) {
      eyg $$4 = $$0.l().aK();
      int $$5 = 0;

      for (eyf $$6 : $$1) {
         eye $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> wz.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> wz.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(et $$0, Collection<eyf> $$1, exy $$2, int $$3) {
      eyg $$4 = $$0.l().aK();
      int $$5 = 0;

      for (eyf $$6 : $$1) {
         eye $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> wz.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> wz.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(et $$0) {
      Collection<eyf> $$1 = $$0.l().aK().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> wz.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> wz.a("commands.scoreboard.players.list.success", $$1.size(), xc.b($$1, eyf::gY)), false);
      }

      return $$1.size();
   }

   private static int a(et $$0, eyf $$1) {
      Object2IntMap<exy> $$2 = $$0.l().aK().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> wz.a("commands.scoreboard.players.list.entity.empty", $$1.gY()), false);
      } else {
         $$0.a(() -> wz.a("commands.scoreboard.players.list.entity.success", $$1.gY(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> wz.a("commands.scoreboard.players.list.entity.entry", ((exy)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(et $$0, exx $$1) throws CommandSyntaxException {
      eyg $$2 = $$0.l().aK();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> wz.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(et $$0, exx $$1, exy $$2) throws CommandSyntaxException {
      eyg $$3 = $$0.l().aK();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> wz.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(et $$0, exy $$1, wz $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> wz.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(et $$0, exy $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> wz.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> wz.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(et $$0, exy $$1, @Nullable yp $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> wz.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> wz.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(et $$0, exy $$1, eyj.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> wz.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(et $$0, exy $$1) {
      eyg $$2 = $$0.l().aK();
      $$2.j($$1);
      $$0.a(() -> wz.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(et $$0, String $$1, eyj $$2, wz $$3) throws CommandSyntaxException {
      eyg $$4 = $$0.l().aK();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         exy $$5 = $$4.a($$1);
         $$0.a(() -> wz.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(et $$0) {
      Collection<exy> $$1 = $$0.l().aK().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> wz.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> wz.a("commands.scoreboard.objectives.list.success", $$1.size(), xc.b($$1, exy::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<et> var1, @Nullable yp var2) throws CommandSyntaxException;
   }
}
