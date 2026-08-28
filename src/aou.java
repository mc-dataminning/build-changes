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

public class aou {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wv.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wv.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wv.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wv.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> wv.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("objectives")
                                 .then(ey.a("list").executes($$0x -> b((ex)$$0x.getSource()))))
                              .then(
                                 ey.a("add")
                                    .then(
                                       ey.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)ey.a("criteria", fs.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ex)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            fs.a($$0x, "criteria"),
                                                            wv.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   ey.a("displayName", fg.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ex)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               fs.a($$0x, "criteria"),
                                                               fg.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ey.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("objective", fr.a())
                                                .then(
                                                   ey.a("displayname")
                                                      .then(
                                                         ey.a("displayName", fg.a($$1))
                                                            .executes($$0x -> a((ex)$$0x.getSource(), fr.a($$0x, "objective"), fg.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             ey.a("displayautoupdate")
                                                .then(
                                                   ey.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((ex)$$0x.getSource(), fr.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, ey.a("numberformat"), ($$0x, $$1x) -> a((ex)$$0x.getSource(), fr.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(ey.a("remove").then(ey.a("objective", fr.a()).executes($$0x -> a((ex)$$0x.getSource(), fr.a($$0x, "objective"))))))
                     .then(
                        ey.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)ey.a("slot", ge.a()).executes($$0x -> a((ex)$$0x.getSource(), ge.a($$0x, "slot"))))
                                 .then(ey.a("objective", fr.a()).executes($$0x -> a((ex)$$0x.getSource(), ge.a($$0x, "slot"), fr.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)ey.a("list").executes($$0x -> a((ex)$$0x.getSource())))
                                                .then(ey.a("target", gd.a()).suggests(gd.a).executes($$0x -> a((ex)$$0x.getSource(), gd.a($$0x, "target"))))
                                          ))
                                       .then(
                                          ey.a("set")
                                             .then(
                                                ey.a("targets", gd.b())
                                                   .suggests(gd.a)
                                                   .then(
                                                      ey.a("objective", fr.a())
                                                         .then(
                                                            ey.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ex)$$0x.getSource(),
                                                                        gd.c($$0x, "targets"),
                                                                        fr.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ey.a("get")
                                          .then(
                                             ey.a("target", gd.a())
                                                .suggests(gd.a)
                                                .then(
                                                   ey.a("objective", fr.a())
                                                      .executes($$0x -> a((ex)$$0x.getSource(), gd.a($$0x, "target"), fr.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    ey.a("add")
                                       .then(
                                          ey.a("targets", gd.b())
                                             .suggests(gd.a)
                                             .then(
                                                ey.a("objective", fr.a())
                                                   .then(
                                                      ey.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (ex)$$0x.getSource(),
                                                                  gd.c($$0x, "targets"),
                                                                  fr.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ey.a("remove")
                                    .then(
                                       ey.a("targets", gd.b())
                                          .suggests(gd.a)
                                          .then(
                                             ey.a("objective", fr.a())
                                                .then(
                                                   ey.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (ex)$$0x.getSource(),
                                                               gd.c($$0x, "targets"),
                                                               fr.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ey.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)ey.a("targets", gd.b())
                                          .suggests(gd.a)
                                          .executes($$0x -> a((ex)$$0x.getSource(), gd.c($$0x, "targets"))))
                                       .then(
                                          ey.a("objective", fr.a()).executes($$0x -> b((ex)$$0x.getSource(), gd.c($$0x, "targets"), fr.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           ey.a("enable")
                              .then(
                                 ey.a("targets", gd.b())
                                    .suggests(gd.a)
                                    .then(
                                       ey.a("objective", fr.a())
                                          .suggests(($$0x, $$1x) -> a((ex)$$0x.getSource(), gd.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((ex)$$0x.getSource(), gd.c($$0x, "targets"), fr.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)ey.a("display")
                              .then(
                                 ey.a("name")
                                    .then(
                                       ey.a("targets", gd.b())
                                          .suggests(gd.a)
                                          .then(
                                             ((RequiredArgumentBuilder)ey.a("objective", fr.a())
                                                   .then(
                                                      ey.a("name", fg.a($$1))
                                                         .executes(
                                                            $$0x -> a((ex)$$0x.getSource(), gd.c($$0x, "targets"), fr.a($$0x, "objective"), fg.a($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((ex)$$0x.getSource(), gd.c($$0x, "targets"), fr.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              ey.a("numberformat")
                                 .then(
                                    ey.a("targets", gd.b())
                                       .suggests(gd.a)
                                       .then(
                                          a(
                                             $$1,
                                             ey.a("objective", fr.a()),
                                             ($$0x, $$1x) -> a((ex)$$0x.getSource(), gd.c($$0x, "targets"), fr.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     ey.a("operation")
                        .then(
                           ey.a("targets", gd.b())
                              .suggests(gd.a)
                              .then(
                                 ey.a("targetObjective", fr.a())
                                    .then(
                                       ey.a("operation", ft.a())
                                          .then(
                                             ey.a("source", gd.b())
                                                .suggests(gd.a)
                                                .then(
                                                   ey.a("sourceObjective", fr.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ex)$$0x.getSource(),
                                                               gd.c($$0x, "targets"),
                                                               fr.b($$0x, "targetObjective"),
                                                               ft.a($$0x, "operation"),
                                                               gd.c($$0x, "source"),
                                                               fr.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<ex, ?> a(et $$0, ArgumentBuilder<ex, ?> $$1, aou.a $$2) {
      return $$1.then(ey.a("blank").executes($$1x -> $$2.run($$1x, yj.a))).then(ey.a("fixed").then(ey.a("contents", fg.a($$0)).executes($$1x -> {
         wv $$2x = fg.a($$1x, "contents");
         return $$2.run($$1x, new yk($$2x));
      }))).then(ey.a("styled").then(ey.a("style", gj.a($$0)).executes($$1x -> {
         xs $$2x = gj.a($$1x, "style");
         return $$2.run($$1x, new yo($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<ex> a() {
      LiteralArgumentBuilder<ex> $$0 = ey.a("rendertype");

      for (fec.a $$1 : fec.a.values()) {
         $$0.then(ey.a($$1.a()).executes($$1x -> a((ex)$$1x.getSource(), fr.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(ex $$0, Collection<fdy> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      fdz $$4 = $$0.l().aJ();

      for (fdr $$5 : $$4.c()) {
         if ($$5.c() == fec.c) {
            boolean $$6 = false;

            for (fdy $$7 : $$1) {
               fdv $$8 = $$4.d($$7, $$5);
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

      return fc.b($$3, $$2);
   }

   private static int a(ex $$0, fdy $$1, fdr $$2) throws CommandSyntaxException {
      fdz $$3 = $$0.l().aJ();
      fdv $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.hc());
      } else {
         $$0.a(() -> wv.a("commands.scoreboard.players.get.success", $$1.hc(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static wv a(Collection<fdy> $$0) {
      return $$0.iterator().next().hc();
   }

   private static int a(ex $$0, Collection<fdy> $$1, fdr $$2, ft.a $$3, Collection<fdy> $$4, fdr $$5) throws CommandSyntaxException {
      fdz $$6 = $$0.l().aJ();
      int $$7 = 0;

      for (fdy $$8 : $$1) {
         fdx $$9 = $$6.c($$8, $$2);

         for (fdy $$10 : $$4) {
            fdx $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> wv.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> wv.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(ex $$0, Collection<fdy> $$1, fdr $$2) throws CommandSyntaxException {
      if ($$2.c() != fec.c) {
         throw e.create();
      } else {
         fdz $$3 = $$0.l().aJ();
         int $$4 = 0;

         for (fdy $$5 : $$1) {
            fdx $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> wv.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> wv.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(ex $$0, Collection<fdy> $$1) {
      fdz $$2 = $$0.l().aJ();

      for (fdy $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wv.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> wv.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ex $$0, Collection<fdy> $$1, fdr $$2) {
      fdz $$3 = $$0.l().aJ();

      for (fdy $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wv.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> wv.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ex $$0, Collection<fdy> $$1, fdr $$2, int $$3) {
      fdz $$4 = $$0.l().aJ();

      for (fdy $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wv.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> wv.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(ex $$0, Collection<fdy> $$1, fdr $$2, @Nullable wv $$3) {
      fdz $$4 = $$0.l().aJ();

      for (fdy $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> wv.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> wv.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> wv.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> wv.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(ex $$0, Collection<fdy> $$1, fdr $$2, @Nullable yl $$3) {
      fdz $$4 = $$0.l().aJ();

      for (fdy $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> wv.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> wv.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> wv.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> wv.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(ex $$0, Collection<fdy> $$1, fdr $$2, int $$3) {
      fdz $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fdy $$6 : $$1) {
         fdx $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> wv.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> wv.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(ex $$0, Collection<fdy> $$1, fdr $$2, int $$3) {
      fdz $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fdy $$6 : $$1) {
         fdx $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> wv.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> wv.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(ex $$0) {
      Collection<fdy> $$1 = $$0.l().aJ().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> wv.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> wv.a("commands.scoreboard.players.list.success", $$1.size(), wy.b($$1, fdy::hc)), false);
      }

      return $$1.size();
   }

   private static int a(ex $$0, fdy $$1) {
      Object2IntMap<fdr> $$2 = $$0.l().aJ().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> wv.a("commands.scoreboard.players.list.entity.empty", $$1.hc()), false);
      } else {
         $$0.a(() -> wv.a("commands.scoreboard.players.list.entity.success", $$1.hc(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> wv.a("commands.scoreboard.players.list.entity.entry", ((fdr)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(ex $$0, fdq $$1) throws CommandSyntaxException {
      fdz $$2 = $$0.l().aJ();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> wv.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(ex $$0, fdq $$1, fdr $$2) throws CommandSyntaxException {
      fdz $$3 = $$0.l().aJ();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> wv.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(ex $$0, fdr $$1, wv $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> wv.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(ex $$0, fdr $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> wv.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> wv.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(ex $$0, fdr $$1, @Nullable yl $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> wv.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> wv.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(ex $$0, fdr $$1, fec.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> wv.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(ex $$0, fdr $$1) {
      fdz $$2 = $$0.l().aJ();
      $$2.j($$1);
      $$0.a(() -> wv.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(ex $$0, String $$1, fec $$2, wv $$3) throws CommandSyntaxException {
      fdz $$4 = $$0.l().aJ();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         fdr $$5 = $$4.a($$1);
         $$0.a(() -> wv.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(ex $$0) {
      Collection<fdr> $$1 = $$0.l().aJ().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> wv.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> wv.a("commands.scoreboard.objectives.list.success", $$1.size(), wy.b($$1, fdr::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<ex> var1, @Nullable yl var2) throws CommandSyntaxException;
   }
}
