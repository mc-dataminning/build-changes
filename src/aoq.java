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

public class aoq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xd.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xd.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xd.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> xd.b("commands.scoreboard.players.get.null", $$0, $$1));

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
                                                            xd.b(StringArgumentType.getString($$0x, "objective"))
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

   private static ArgumentBuilder<et, ?> a(ep $$0, ArgumentBuilder<et, ?> $$1, aoq.a $$2) {
      return $$1.then(eu.a("blank").executes($$1x -> $$2.run($$1x, yr.a))).then(eu.a("fixed").then(eu.a("contents", fc.a($$0)).executes($$1x -> {
         xd $$2x = fc.a($$1x, "contents");
         return $$2.run($$1x, new ys($$2x));
      }))).then(eu.a("styled").then(eu.a("style", ge.a($$0)).executes($$1x -> {
         ya $$2x = ge.a($$1x, "style");
         return $$2.run($$1x, new yw($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<et> a() {
      LiteralArgumentBuilder<et> $$0 = eu.a("rendertype");

      for (faa.a $$1 : faa.a.values()) {
         $$0.then(eu.a($$1.a()).executes($$1x -> a((et)$$1x.getSource(), fn.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(et $$0, Collection<ezw> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      ezx $$4 = $$0.l().aJ();

      for (ezp $$5 : $$4.c()) {
         if ($$5.c() == faa.c) {
            boolean $$6 = false;

            for (ezw $$7 : $$1) {
               ezt $$8 = $$4.d($$7, $$5);
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

   private static int a(et $$0, ezw $$1, ezp $$2) throws CommandSyntaxException {
      ezx $$3 = $$0.l().aJ();
      ezt $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.hf());
      } else {
         $$0.a(() -> xd.a("commands.scoreboard.players.get.success", $$1.hf(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static xd a(Collection<ezw> $$0) {
      return $$0.iterator().next().hf();
   }

   private static int a(et $$0, Collection<ezw> $$1, ezp $$2, fp.a $$3, Collection<ezw> $$4, ezp $$5) throws CommandSyntaxException {
      ezx $$6 = $$0.l().aJ();
      int $$7 = 0;

      for (ezw $$8 : $$1) {
         ezv $$9 = $$6.c($$8, $$2);

         for (ezw $$10 : $$4) {
            ezv $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> xd.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> xd.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(et $$0, Collection<ezw> $$1, ezp $$2) throws CommandSyntaxException {
      if ($$2.c() != faa.c) {
         throw e.create();
      } else {
         ezx $$3 = $$0.l().aJ();
         int $$4 = 0;

         for (ezw $$5 : $$1) {
            ezv $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xd.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> xd.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(et $$0, Collection<ezw> $$1) {
      ezx $$2 = $$0.l().aJ();

      for (ezw $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> xd.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(et $$0, Collection<ezw> $$1, ezp $$2) {
      ezx $$3 = $$0.l().aJ();

      for (ezw $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> xd.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(et $$0, Collection<ezw> $$1, ezp $$2, int $$3) {
      ezx $$4 = $$0.l().aJ();

      for (ezw $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> xd.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(et $$0, Collection<ezw> $$1, ezp $$2, @Nullable xd $$3) {
      ezx $$4 = $$0.l().aJ();

      for (ezw $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xd.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> xd.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> xd.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(et $$0, Collection<ezw> $$1, ezp $$2, @Nullable yt $$3) {
      ezx $$4 = $$0.l().aJ();

      for (ezw $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xd.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> xd.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> xd.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(et $$0, Collection<ezw> $$1, ezp $$2, int $$3) {
      ezx $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (ezw $$6 : $$1) {
         ezv $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xd.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xd.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(et $$0, Collection<ezw> $$1, ezp $$2, int $$3) {
      ezx $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (ezw $$6 : $$1) {
         ezv $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xd.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xd.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(et $$0) {
      Collection<ezw> $$1 = $$0.l().aJ().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> xd.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> xd.a("commands.scoreboard.players.list.success", $$1.size(), xg.b($$1, ezw::hf)), false);
      }

      return $$1.size();
   }

   private static int a(et $$0, ezw $$1) {
      Object2IntMap<ezp> $$2 = $$0.l().aJ().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> xd.a("commands.scoreboard.players.list.entity.empty", $$1.hf()), false);
      } else {
         $$0.a(() -> xd.a("commands.scoreboard.players.list.entity.success", $$1.hf(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> xd.a("commands.scoreboard.players.list.entity.entry", ((ezp)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(et $$0, ezo $$1) throws CommandSyntaxException {
      ezx $$2 = $$0.l().aJ();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> xd.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(et $$0, ezo $$1, ezp $$2) throws CommandSyntaxException {
      ezx $$3 = $$0.l().aJ();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xd.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(et $$0, ezp $$1, xd $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> xd.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(et $$0, ezp $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> xd.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> xd.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(et $$0, ezp $$1, @Nullable yt $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> xd.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> xd.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(et $$0, ezp $$1, faa.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> xd.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(et $$0, ezp $$1) {
      ezx $$2 = $$0.l().aJ();
      $$2.j($$1);
      $$0.a(() -> xd.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(et $$0, String $$1, faa $$2, xd $$3) throws CommandSyntaxException {
      ezx $$4 = $$0.l().aJ();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         ezp $$5 = $$4.a($$1);
         $$0.a(() -> xd.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(et $$0) {
      Collection<ezp> $$1 = $$0.l().aJ().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> xd.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> xd.a("commands.scoreboard.objectives.list.success", $$1.size(), xg.b($$1, ezp::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<et> var1, @Nullable yt var2) throws CommandSyntaxException;
   }
}
