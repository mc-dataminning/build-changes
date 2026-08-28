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

public class app {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xv.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xv.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xv.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xv.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xv.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> xv.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("objectives")
                                 .then(ex.a("list").executes($$0x -> b((ew)$$0x.getSource()))))
                              .then(
                                 ex.a("add")
                                    .then(
                                       ex.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)ex.a("criteria", fr.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ew)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            fr.a($$0x, "criteria"),
                                                            xv.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   ex.a("displayName", ff.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ew)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               fr.a($$0x, "criteria"),
                                                               ff.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ex.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("objective", fq.a())
                                                .then(
                                                   ex.a("displayname")
                                                      .then(
                                                         ex.a("displayName", ff.a($$1))
                                                            .executes($$0x -> a((ew)$$0x.getSource(), fq.a($$0x, "objective"), ff.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             ex.a("displayautoupdate")
                                                .then(
                                                   ex.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((ew)$$0x.getSource(), fq.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, ex.a("numberformat"), ($$0x, $$1x) -> a((ew)$$0x.getSource(), fq.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(ex.a("remove").then(ex.a("objective", fq.a()).executes($$0x -> a((ew)$$0x.getSource(), fq.a($$0x, "objective"))))))
                     .then(
                        ex.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)ex.a("slot", gc.a()).executes($$0x -> a((ew)$$0x.getSource(), gc.a($$0x, "slot"))))
                                 .then(ex.a("objective", fq.a()).executes($$0x -> a((ew)$$0x.getSource(), gc.a($$0x, "slot"), fq.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)ex.a("list").executes($$0x -> a((ew)$$0x.getSource())))
                                                .then(ex.a("target", gb.a()).suggests(gb.a).executes($$0x -> a((ew)$$0x.getSource(), gb.a($$0x, "target"))))
                                          ))
                                       .then(
                                          ex.a("set")
                                             .then(
                                                ex.a("targets", gb.b())
                                                   .suggests(gb.a)
                                                   .then(
                                                      ex.a("objective", fq.a())
                                                         .then(
                                                            ex.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ew)$$0x.getSource(),
                                                                        gb.c($$0x, "targets"),
                                                                        fq.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ex.a("get")
                                          .then(
                                             ex.a("target", gb.a())
                                                .suggests(gb.a)
                                                .then(
                                                   ex.a("objective", fq.a())
                                                      .executes($$0x -> a((ew)$$0x.getSource(), gb.a($$0x, "target"), fq.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    ex.a("add")
                                       .then(
                                          ex.a("targets", gb.b())
                                             .suggests(gb.a)
                                             .then(
                                                ex.a("objective", fq.a())
                                                   .then(
                                                      ex.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (ew)$$0x.getSource(),
                                                                  gb.c($$0x, "targets"),
                                                                  fq.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ex.a("remove")
                                    .then(
                                       ex.a("targets", gb.b())
                                          .suggests(gb.a)
                                          .then(
                                             ex.a("objective", fq.a())
                                                .then(
                                                   ex.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (ew)$$0x.getSource(),
                                                               gb.c($$0x, "targets"),
                                                               fq.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ex.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)ex.a("targets", gb.b())
                                          .suggests(gb.a)
                                          .executes($$0x -> a((ew)$$0x.getSource(), gb.c($$0x, "targets"))))
                                       .then(
                                          ex.a("objective", fq.a()).executes($$0x -> b((ew)$$0x.getSource(), gb.c($$0x, "targets"), fq.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           ex.a("enable")
                              .then(
                                 ex.a("targets", gb.b())
                                    .suggests(gb.a)
                                    .then(
                                       ex.a("objective", fq.a())
                                          .suggests(($$0x, $$1x) -> a((ew)$$0x.getSource(), gb.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((ew)$$0x.getSource(), gb.c($$0x, "targets"), fq.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)ex.a("display")
                              .then(
                                 ex.a("name")
                                    .then(
                                       ex.a("targets", gb.b())
                                          .suggests(gb.a)
                                          .then(
                                             ((RequiredArgumentBuilder)ex.a("objective", fq.a())
                                                   .then(
                                                      ex.a("name", ff.a($$1))
                                                         .executes(
                                                            $$0x -> a((ew)$$0x.getSource(), gb.c($$0x, "targets"), fq.a($$0x, "objective"), ff.a($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((ew)$$0x.getSource(), gb.c($$0x, "targets"), fq.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              ex.a("numberformat")
                                 .then(
                                    ex.a("targets", gb.b())
                                       .suggests(gb.a)
                                       .then(
                                          a(
                                             $$1,
                                             ex.a("objective", fq.a()),
                                             ($$0x, $$1x) -> a((ew)$$0x.getSource(), gb.c($$0x, "targets"), fq.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     ex.a("operation")
                        .then(
                           ex.a("targets", gb.b())
                              .suggests(gb.a)
                              .then(
                                 ex.a("targetObjective", fq.a())
                                    .then(
                                       ex.a("operation", fs.a())
                                          .then(
                                             ex.a("source", gb.b())
                                                .suggests(gb.a)
                                                .then(
                                                   ex.a("sourceObjective", fq.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ew)$$0x.getSource(),
                                                               gb.c($$0x, "targets"),
                                                               fq.b($$0x, "targetObjective"),
                                                               fs.a($$0x, "operation"),
                                                               gb.c($$0x, "source"),
                                                               fq.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<ew, ?> a(es $$0, ArgumentBuilder<ew, ?> $$1, app.a $$2) {
      return $$1.then(ex.a("blank").executes($$1x -> $$2.run($$1x, zj.a))).then(ex.a("fixed").then(ex.a("contents", ff.a($$0)).executes($$1x -> {
         xv $$2x = ff.a($$1x, "contents");
         return $$2.run($$1x, new zk($$2x));
      }))).then(ex.a("styled").then(ex.a("style", gh.a($$0)).executes($$1x -> {
         ys $$2x = gh.a($$1x, "style");
         return $$2.run($$1x, new zo($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<ew> a() {
      LiteralArgumentBuilder<ew> $$0 = ex.a("rendertype");

      for (fdg.a $$1 : fdg.a.values()) {
         $$0.then(ex.a($$1.a()).executes($$1x -> a((ew)$$1x.getSource(), fq.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(ew $$0, Collection<fdc> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      fdd $$4 = $$0.l().aJ();

      for (fcv $$5 : $$4.c()) {
         if ($$5.c() == fdg.c) {
            boolean $$6 = false;

            for (fdc $$7 : $$1) {
               fcz $$8 = $$4.d($$7, $$5);
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

      return fb.b($$3, $$2);
   }

   private static int a(ew $$0, fdc $$1, fcv $$2) throws CommandSyntaxException {
      fdd $$3 = $$0.l().aJ();
      fcz $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.hc());
      } else {
         $$0.a(() -> xv.a("commands.scoreboard.players.get.success", $$1.hc(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static xv a(Collection<fdc> $$0) {
      return $$0.iterator().next().hc();
   }

   private static int a(ew $$0, Collection<fdc> $$1, fcv $$2, fs.a $$3, Collection<fdc> $$4, fcv $$5) throws CommandSyntaxException {
      fdd $$6 = $$0.l().aJ();
      int $$7 = 0;

      for (fdc $$8 : $$1) {
         fdb $$9 = $$6.c($$8, $$2);

         for (fdc $$10 : $$4) {
            fdb $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> xv.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> xv.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(ew $$0, Collection<fdc> $$1, fcv $$2) throws CommandSyntaxException {
      if ($$2.c() != fdg.c) {
         throw e.create();
      } else {
         fdd $$3 = $$0.l().aJ();
         int $$4 = 0;

         for (fdc $$5 : $$1) {
            fdb $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xv.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> xv.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(ew $$0, Collection<fdc> $$1) {
      fdd $$2 = $$0.l().aJ();

      for (fdc $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xv.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> xv.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ew $$0, Collection<fdc> $$1, fcv $$2) {
      fdd $$3 = $$0.l().aJ();

      for (fdc $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xv.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> xv.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<fdc> $$1, fcv $$2, int $$3) {
      fdd $$4 = $$0.l().aJ();

      for (fdc $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xv.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> xv.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(ew $$0, Collection<fdc> $$1, fcv $$2, @Nullable xv $$3) {
      fdd $$4 = $$0.l().aJ();

      for (fdc $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xv.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> xv.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xv.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> xv.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<fdc> $$1, fcv $$2, @Nullable zl $$3) {
      fdd $$4 = $$0.l().aJ();

      for (fdc $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xv.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> xv.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xv.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> xv.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(ew $$0, Collection<fdc> $$1, fcv $$2, int $$3) {
      fdd $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fdc $$6 : $$1) {
         fdb $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xv.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xv.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(ew $$0, Collection<fdc> $$1, fcv $$2, int $$3) {
      fdd $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fdc $$6 : $$1) {
         fdb $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xv.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xv.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(ew $$0) {
      Collection<fdc> $$1 = $$0.l().aJ().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> xv.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> xv.a("commands.scoreboard.players.list.success", $$1.size(), xy.b($$1, fdc::hc)), false);
      }

      return $$1.size();
   }

   private static int a(ew $$0, fdc $$1) {
      Object2IntMap<fcv> $$2 = $$0.l().aJ().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> xv.a("commands.scoreboard.players.list.entity.empty", $$1.hc()), false);
      } else {
         $$0.a(() -> xv.a("commands.scoreboard.players.list.entity.success", $$1.hc(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> xv.a("commands.scoreboard.players.list.entity.entry", ((fcv)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(ew $$0, fcu $$1) throws CommandSyntaxException {
      fdd $$2 = $$0.l().aJ();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> xv.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(ew $$0, fcu $$1, fcv $$2) throws CommandSyntaxException {
      fdd $$3 = $$0.l().aJ();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xv.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(ew $$0, fcv $$1, xv $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> xv.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(ew $$0, fcv $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> xv.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> xv.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(ew $$0, fcv $$1, @Nullable zl $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> xv.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> xv.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(ew $$0, fcv $$1, fdg.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> xv.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(ew $$0, fcv $$1) {
      fdd $$2 = $$0.l().aJ();
      $$2.j($$1);
      $$0.a(() -> xv.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(ew $$0, String $$1, fdg $$2, xv $$3) throws CommandSyntaxException {
      fdd $$4 = $$0.l().aJ();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         fcv $$5 = $$4.a($$1);
         $$0.a(() -> xv.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(ew $$0) {
      Collection<fcv> $$1 = $$0.l().aJ().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> xv.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> xv.a("commands.scoreboard.objectives.list.success", $$1.size(), xy.b($$1, fcv::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<ew> var1, @Nullable zl var2) throws CommandSyntaxException;
   }
}
