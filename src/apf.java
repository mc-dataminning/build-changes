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

public class apf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xk.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xk.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xk.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xk.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xk.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> xk.b("commands.scoreboard.players.get.null", $$0, $$1));

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
                                                            xk.b(StringArgumentType.getString($$0x, "objective"))
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

   private static ArgumentBuilder<ew, ?> a(es $$0, ArgumentBuilder<ew, ?> $$1, apf.a $$2) {
      return $$1.then(ex.a("blank").executes($$1x -> $$2.run($$1x, yy.a))).then(ex.a("fixed").then(ex.a("contents", ff.a($$0)).executes($$1x -> {
         xk $$2x = ff.a($$1x, "contents");
         return $$2.run($$1x, new yz($$2x));
      }))).then(ex.a("styled").then(ex.a("style", gh.a($$0)).executes($$1x -> {
         yh $$2x = gh.a($$1x, "style");
         return $$2.run($$1x, new zd($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<ew> a() {
      LiteralArgumentBuilder<ew> $$0 = ex.a("rendertype");

      for (fcz.a $$1 : fcz.a.values()) {
         $$0.then(ex.a($$1.a()).executes($$1x -> a((ew)$$1x.getSource(), fq.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(ew $$0, Collection<fcv> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      fcw $$4 = $$0.l().aJ();

      for (fco $$5 : $$4.c()) {
         if ($$5.c() == fcz.c) {
            boolean $$6 = false;

            for (fcv $$7 : $$1) {
               fcs $$8 = $$4.d($$7, $$5);
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

   private static int a(ew $$0, fcv $$1, fco $$2) throws CommandSyntaxException {
      fcw $$3 = $$0.l().aJ();
      fcs $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.hc());
      } else {
         $$0.a(() -> xk.a("commands.scoreboard.players.get.success", $$1.hc(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static xk a(Collection<fcv> $$0) {
      return $$0.iterator().next().hc();
   }

   private static int a(ew $$0, Collection<fcv> $$1, fco $$2, fs.a $$3, Collection<fcv> $$4, fco $$5) throws CommandSyntaxException {
      fcw $$6 = $$0.l().aJ();
      int $$7 = 0;

      for (fcv $$8 : $$1) {
         fcu $$9 = $$6.c($$8, $$2);

         for (fcv $$10 : $$4) {
            fcu $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> xk.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> xk.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(ew $$0, Collection<fcv> $$1, fco $$2) throws CommandSyntaxException {
      if ($$2.c() != fcz.c) {
         throw e.create();
      } else {
         fcw $$3 = $$0.l().aJ();
         int $$4 = 0;

         for (fcv $$5 : $$1) {
            fcu $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xk.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> xk.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(ew $$0, Collection<fcv> $$1) {
      fcw $$2 = $$0.l().aJ();

      for (fcv $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xk.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> xk.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ew $$0, Collection<fcv> $$1, fco $$2) {
      fcw $$3 = $$0.l().aJ();

      for (fcv $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xk.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> xk.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<fcv> $$1, fco $$2, int $$3) {
      fcw $$4 = $$0.l().aJ();

      for (fcv $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xk.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> xk.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(ew $$0, Collection<fcv> $$1, fco $$2, @Nullable xk $$3) {
      fcw $$4 = $$0.l().aJ();

      for (fcv $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xk.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> xk.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xk.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> xk.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<fcv> $$1, fco $$2, @Nullable za $$3) {
      fcw $$4 = $$0.l().aJ();

      for (fcv $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xk.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> xk.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xk.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> xk.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(ew $$0, Collection<fcv> $$1, fco $$2, int $$3) {
      fcw $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fcv $$6 : $$1) {
         fcu $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xk.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xk.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(ew $$0, Collection<fcv> $$1, fco $$2, int $$3) {
      fcw $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fcv $$6 : $$1) {
         fcu $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xk.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xk.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(ew $$0) {
      Collection<fcv> $$1 = $$0.l().aJ().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> xk.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> xk.a("commands.scoreboard.players.list.success", $$1.size(), xn.b($$1, fcv::hc)), false);
      }

      return $$1.size();
   }

   private static int a(ew $$0, fcv $$1) {
      Object2IntMap<fco> $$2 = $$0.l().aJ().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> xk.a("commands.scoreboard.players.list.entity.empty", $$1.hc()), false);
      } else {
         $$0.a(() -> xk.a("commands.scoreboard.players.list.entity.success", $$1.hc(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> xk.a("commands.scoreboard.players.list.entity.entry", ((fco)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(ew $$0, fcn $$1) throws CommandSyntaxException {
      fcw $$2 = $$0.l().aJ();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> xk.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(ew $$0, fcn $$1, fco $$2) throws CommandSyntaxException {
      fcw $$3 = $$0.l().aJ();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xk.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(ew $$0, fco $$1, xk $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> xk.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(ew $$0, fco $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> xk.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> xk.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(ew $$0, fco $$1, @Nullable za $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> xk.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> xk.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(ew $$0, fco $$1, fcz.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> xk.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(ew $$0, fco $$1) {
      fcw $$2 = $$0.l().aJ();
      $$2.j($$1);
      $$0.a(() -> xk.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(ew $$0, String $$1, fcz $$2, xk $$3) throws CommandSyntaxException {
      fcw $$4 = $$0.l().aJ();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         fco $$5 = $$4.a($$1);
         $$0.a(() -> xk.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(ew $$0) {
      Collection<fco> $$1 = $$0.l().aJ().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> xk.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> xk.a("commands.scoreboard.objectives.list.success", $$1.size(), xn.b($$1, fco::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<ew> var1, @Nullable za var2) throws CommandSyntaxException;
   }
}
