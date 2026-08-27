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

public class aks {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vf.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vf.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vf.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vf.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> vf.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("objectives")
                                 .then(dt.a("list").executes($$0x -> b((ds)$$0x.getSource()))))
                              .then(
                                 dt.a("add")
                                    .then(
                                       dt.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("criteria", en.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            en.a($$0x, "criteria"),
                                                            vf.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("displayName", eb.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               en.a($$0x, "criteria"),
                                                               eb.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              dt.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("objective", em.a())
                                                .then(
                                                   dt.a("displayname")
                                                      .then(
                                                         dt.a("displayName", eb.a())
                                                            .executes($$0x -> a((ds)$$0x.getSource(), em.a($$0x, "objective"), eb.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             dt.a("displayautoupdate")
                                                .then(
                                                   dt.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((ds)$$0x.getSource(), em.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a(dt.a("numberformat"), ($$0x, $$1) -> a((ds)$$0x.getSource(), em.a($$0x, "objective"), $$1)))
                                 )
                           ))
                        .then(dt.a("remove").then(dt.a("objective", em.a()).executes($$0x -> a((ds)$$0x.getSource(), em.a($$0x, "objective"))))))
                     .then(
                        dt.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)dt.a("slot", ex.a()).executes($$0x -> a((ds)$$0x.getSource(), ex.a($$0x, "slot"))))
                                 .then(dt.a("objective", em.a()).executes($$0x -> a((ds)$$0x.getSource(), ex.a($$0x, "slot"), em.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)dt.a("list").executes($$0x -> a((ds)$$0x.getSource())))
                                                .then(dt.a("target", ew.a()).suggests(ew.a).executes($$0x -> a((ds)$$0x.getSource(), ew.a($$0x, "target"))))
                                          ))
                                       .then(
                                          dt.a("set")
                                             .then(
                                                dt.a("targets", ew.b())
                                                   .suggests(ew.a)
                                                   .then(
                                                      dt.a("objective", em.a())
                                                         .then(
                                                            dt.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ds)$$0x.getSource(),
                                                                        ew.c($$0x, "targets"),
                                                                        em.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       dt.a("get")
                                          .then(
                                             dt.a("target", ew.a())
                                                .suggests(ew.a)
                                                .then(
                                                   dt.a("objective", em.a())
                                                      .executes($$0x -> a((ds)$$0x.getSource(), ew.a($$0x, "target"), em.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    dt.a("add")
                                       .then(
                                          dt.a("targets", ew.b())
                                             .suggests(ew.a)
                                             .then(
                                                dt.a("objective", em.a())
                                                   .then(
                                                      dt.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (ds)$$0x.getSource(),
                                                                  ew.c($$0x, "targets"),
                                                                  em.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 dt.a("remove")
                                    .then(
                                       dt.a("targets", ew.b())
                                          .suggests(ew.a)
                                          .then(
                                             dt.a("objective", em.a())
                                                .then(
                                                   dt.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (ds)$$0x.getSource(),
                                                               ew.c($$0x, "targets"),
                                                               em.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              dt.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)dt.a("targets", ew.b())
                                          .suggests(ew.a)
                                          .executes($$0x -> a((ds)$$0x.getSource(), ew.c($$0x, "targets"))))
                                       .then(
                                          dt.a("objective", em.a()).executes($$0x -> b((ds)$$0x.getSource(), ew.c($$0x, "targets"), em.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           dt.a("enable")
                              .then(
                                 dt.a("targets", ew.b())
                                    .suggests(ew.a)
                                    .then(
                                       dt.a("objective", em.a())
                                          .suggests(($$0x, $$1) -> a((ds)$$0x.getSource(), ew.c($$0x, "targets"), $$1))
                                          .executes($$0x -> a((ds)$$0x.getSource(), ew.c($$0x, "targets"), em.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)dt.a("display")
                              .then(
                                 dt.a("name")
                                    .then(
                                       dt.a("targets", ew.b())
                                          .suggests(ew.a)
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("objective", em.a())
                                                   .then(
                                                      dt.a("name", eb.a())
                                                         .executes(
                                                            $$0x -> a((ds)$$0x.getSource(), ew.c($$0x, "targets"), em.a($$0x, "objective"), eb.a($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((ds)$$0x.getSource(), ew.c($$0x, "targets"), em.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              dt.a("numberformat")
                                 .then(
                                    dt.a("targets", ew.b())
                                       .suggests(ew.a)
                                       .then(
                                          a(
                                             dt.a("objective", em.a()),
                                             ($$0x, $$1) -> a((ds)$$0x.getSource(), ew.c($$0x, "targets"), em.a($$0x, "objective"), $$1)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     dt.a("operation")
                        .then(
                           dt.a("targets", ew.b())
                              .suggests(ew.a)
                              .then(
                                 dt.a("targetObjective", em.a())
                                    .then(
                                       dt.a("operation", eo.a())
                                          .then(
                                             dt.a("source", ew.b())
                                                .suggests(ew.a)
                                                .then(
                                                   dt.a("sourceObjective", em.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               ew.c($$0x, "targets"),
                                                               em.b($$0x, "targetObjective"),
                                                               eo.a($$0x, "operation"),
                                                               ew.c($$0x, "source"),
                                                               em.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<ds, ?> a(ArgumentBuilder<ds, ?> $$0, aks.a $$1) {
      return $$0.then(dt.a("blank").executes($$1x -> $$1.run($$1x, wt.a))).then(dt.a("fixed").then(dt.a("contents", eb.a()).executes($$1x -> {
         vf $$2 = eb.a($$1x, "contents");
         return $$1.run($$1x, new wu($$2));
      }))).then(dt.a("styled").then(dt.a("style", fb.a()).executes($$1x -> {
         wc $$2 = fb.a($$1x, "style");
         return $$1.run($$1x, new wy($$2));
      }))).executes($$1x -> $$1.run($$1x, null));
   }

   private static LiteralArgumentBuilder<ds> a() {
      LiteralArgumentBuilder<ds> $$0 = dt.a("rendertype");

      for (ena.a $$1 : ena.a.values()) {
         $$0.then(dt.a($$1.a()).executes($$1x -> a((ds)$$1x.getSource(), em.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(ds $$0, Collection<emw> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      emx $$4 = $$0.l().aH();

      for (emp $$5 : $$4.c()) {
         if ($$5.c() == ena.b) {
            boolean $$6 = false;

            for (emw $$7 : $$1) {
               emt $$8 = $$4.d($$7, $$5);
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

      return dx.b($$3, $$2);
   }

   private static int a(ds $$0, emw $$1, emp $$2) throws CommandSyntaxException {
      emx $$3 = $$0.l().aH();
      emt $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.gU());
      } else {
         $$0.a(() -> vf.a("commands.scoreboard.players.get.success", $$1.gU(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static vf a(Collection<emw> $$0) {
      return $$0.iterator().next().gU();
   }

   private static int a(ds $$0, Collection<emw> $$1, emp $$2, eo.a $$3, Collection<emw> $$4, emp $$5) throws CommandSyntaxException {
      emx $$6 = $$0.l().aH();
      int $$7 = 0;

      for (emw $$8 : $$1) {
         emv $$9 = $$6.c($$8, $$2);

         for (emw $$10 : $$4) {
            emv $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> vf.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> vf.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(ds $$0, Collection<emw> $$1, emp $$2) throws CommandSyntaxException {
      if ($$2.c() != ena.b) {
         throw e.create();
      } else {
         emx $$3 = $$0.l().aH();
         int $$4 = 0;

         for (emw $$5 : $$1) {
            emv $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> vf.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> vf.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(ds $$0, Collection<emw> $$1) {
      emx $$2 = $$0.l().aH();

      for (emw $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vf.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> vf.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ds $$0, Collection<emw> $$1, emp $$2) {
      emx $$3 = $$0.l().aH();

      for (emw $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vf.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> vf.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<emw> $$1, emp $$2, int $$3) {
      emx $$4 = $$0.l().aH();

      for (emw $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vf.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> vf.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(ds $$0, Collection<emw> $$1, emp $$2, @Nullable vf $$3) {
      emx $$4 = $$0.l().aH();

      for (emw $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> vf.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> vf.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> vf.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> vf.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<emw> $$1, emp $$2, @Nullable wv $$3) {
      emx $$4 = $$0.l().aH();

      for (emw $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> vf.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> vf.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> vf.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> vf.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(ds $$0, Collection<emw> $$1, emp $$2, int $$3) {
      emx $$4 = $$0.l().aH();
      int $$5 = 0;

      for (emw $$6 : $$1) {
         emv $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> vf.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> vf.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(ds $$0, Collection<emw> $$1, emp $$2, int $$3) {
      emx $$4 = $$0.l().aH();
      int $$5 = 0;

      for (emw $$6 : $$1) {
         emv $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> vf.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> vf.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(ds $$0) {
      Collection<emw> $$1 = $$0.l().aH().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> vf.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> vf.a("commands.scoreboard.players.list.success", $$1.size(), vi.b($$1, emw::gU)), false);
      }

      return $$1.size();
   }

   private static int a(ds $$0, emw $$1) {
      Object2IntMap<emp> $$2 = $$0.l().aH().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> vf.a("commands.scoreboard.players.list.entity.empty", $$1.gU()), false);
      } else {
         $$0.a(() -> vf.a("commands.scoreboard.players.list.entity.success", $$1.gU(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> vf.a("commands.scoreboard.players.list.entity.entry", ((emp)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(ds $$0, emo $$1) throws CommandSyntaxException {
      emx $$2 = $$0.l().aH();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> vf.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(ds $$0, emo $$1, emp $$2) throws CommandSyntaxException {
      emx $$3 = $$0.l().aH();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> vf.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(ds $$0, emp $$1, vf $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> vf.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(ds $$0, emp $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> vf.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> vf.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(ds $$0, emp $$1, @Nullable wv $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> vf.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> vf.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(ds $$0, emp $$1, ena.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> vf.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(ds $$0, emp $$1) {
      emx $$2 = $$0.l().aH();
      $$2.j($$1);
      $$0.a(() -> vf.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(ds $$0, String $$1, ena $$2, vf $$3) throws CommandSyntaxException {
      emx $$4 = $$0.l().aH();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         emp $$5 = $$4.a($$1);
         $$0.a(() -> vf.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(ds $$0) {
      Collection<emp> $$1 = $$0.l().aH().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> vf.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> vf.a("commands.scoreboard.objectives.list.success", $$1.size(), vi.b($$1, emp::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<ds> var1, @Nullable wv var2) throws CommandSyntaxException;
   }
}
