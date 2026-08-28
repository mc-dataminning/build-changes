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

public class anw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("objectives")
                                 .then(er.a("list").executes($$0x -> b((eq)$$0x.getSource()))))
                              .then(
                                 er.a("add")
                                    .then(
                                       er.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)er.a("criteria", fl.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (eq)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            fl.a($$0x, "criteria"),
                                                            wu.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   er.a("displayName", ez.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (eq)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               fl.a($$0x, "criteria"),
                                                               ez.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              er.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("objective", fk.a())
                                                .then(
                                                   er.a("displayname")
                                                      .then(
                                                         er.a("displayName", ez.a($$1))
                                                            .executes($$0x -> a((eq)$$0x.getSource(), fk.a($$0x, "objective"), ez.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             er.a("displayautoupdate")
                                                .then(
                                                   er.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((eq)$$0x.getSource(), fk.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, er.a("numberformat"), ($$0x, $$1x) -> a((eq)$$0x.getSource(), fk.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(er.a("remove").then(er.a("objective", fk.a()).executes($$0x -> a((eq)$$0x.getSource(), fk.a($$0x, "objective"))))))
                     .then(
                        er.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)er.a("slot", fw.a()).executes($$0x -> a((eq)$$0x.getSource(), fw.a($$0x, "slot"))))
                                 .then(er.a("objective", fk.a()).executes($$0x -> a((eq)$$0x.getSource(), fw.a($$0x, "slot"), fk.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)er.a("list").executes($$0x -> a((eq)$$0x.getSource())))
                                                .then(er.a("target", fv.a()).suggests(fv.a).executes($$0x -> a((eq)$$0x.getSource(), fv.a($$0x, "target"))))
                                          ))
                                       .then(
                                          er.a("set")
                                             .then(
                                                er.a("targets", fv.b())
                                                   .suggests(fv.a)
                                                   .then(
                                                      er.a("objective", fk.a())
                                                         .then(
                                                            er.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (eq)$$0x.getSource(),
                                                                        fv.c($$0x, "targets"),
                                                                        fk.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       er.a("get")
                                          .then(
                                             er.a("target", fv.a())
                                                .suggests(fv.a)
                                                .then(
                                                   er.a("objective", fk.a())
                                                      .executes($$0x -> a((eq)$$0x.getSource(), fv.a($$0x, "target"), fk.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    er.a("add")
                                       .then(
                                          er.a("targets", fv.b())
                                             .suggests(fv.a)
                                             .then(
                                                er.a("objective", fk.a())
                                                   .then(
                                                      er.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (eq)$$0x.getSource(),
                                                                  fv.c($$0x, "targets"),
                                                                  fk.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 er.a("remove")
                                    .then(
                                       er.a("targets", fv.b())
                                          .suggests(fv.a)
                                          .then(
                                             er.a("objective", fk.a())
                                                .then(
                                                   er.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (eq)$$0x.getSource(),
                                                               fv.c($$0x, "targets"),
                                                               fk.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              er.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)er.a("targets", fv.b())
                                          .suggests(fv.a)
                                          .executes($$0x -> a((eq)$$0x.getSource(), fv.c($$0x, "targets"))))
                                       .then(
                                          er.a("objective", fk.a()).executes($$0x -> b((eq)$$0x.getSource(), fv.c($$0x, "targets"), fk.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           er.a("enable")
                              .then(
                                 er.a("targets", fv.b())
                                    .suggests(fv.a)
                                    .then(
                                       er.a("objective", fk.a())
                                          .suggests(($$0x, $$1x) -> a((eq)$$0x.getSource(), fv.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((eq)$$0x.getSource(), fv.c($$0x, "targets"), fk.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)er.a("display")
                              .then(
                                 er.a("name")
                                    .then(
                                       er.a("targets", fv.b())
                                          .suggests(fv.a)
                                          .then(
                                             ((RequiredArgumentBuilder)er.a("objective", fk.a())
                                                   .then(
                                                      er.a("name", ez.a($$1))
                                                         .executes(
                                                            $$0x -> a((eq)$$0x.getSource(), fv.c($$0x, "targets"), fk.a($$0x, "objective"), ez.a($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((eq)$$0x.getSource(), fv.c($$0x, "targets"), fk.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              er.a("numberformat")
                                 .then(
                                    er.a("targets", fv.b())
                                       .suggests(fv.a)
                                       .then(
                                          a(
                                             $$1,
                                             er.a("objective", fk.a()),
                                             ($$0x, $$1x) -> a((eq)$$0x.getSource(), fv.c($$0x, "targets"), fk.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     er.a("operation")
                        .then(
                           er.a("targets", fv.b())
                              .suggests(fv.a)
                              .then(
                                 er.a("targetObjective", fk.a())
                                    .then(
                                       er.a("operation", fm.a())
                                          .then(
                                             er.a("source", fv.b())
                                                .suggests(fv.a)
                                                .then(
                                                   er.a("sourceObjective", fk.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eq)$$0x.getSource(),
                                                               fv.c($$0x, "targets"),
                                                               fk.b($$0x, "targetObjective"),
                                                               fm.a($$0x, "operation"),
                                                               fv.c($$0x, "source"),
                                                               fk.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<eq, ?> a(em $$0, ArgumentBuilder<eq, ?> $$1, anw.a $$2) {
      return $$1.then(er.a("blank").executes($$1x -> $$2.run($$1x, yi.a))).then(er.a("fixed").then(er.a("contents", ez.a($$0)).executes($$1x -> {
         wu $$2x = ez.a($$1x, "contents");
         return $$2.run($$1x, new yj($$2x));
      }))).then(er.a("styled").then(er.a("style", gb.a($$0)).executes($$1x -> {
         xr $$2x = gb.a($$1x, "style");
         return $$2.run($$1x, new yn($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<eq> a() {
      LiteralArgumentBuilder<eq> $$0 = er.a("rendertype");

      for (exo.a $$1 : exo.a.values()) {
         $$0.then(er.a($$1.a()).executes($$1x -> a((eq)$$1x.getSource(), fk.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(eq $$0, Collection<exk> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      exl $$4 = $$0.l().aL();

      for (exd $$5 : $$4.c()) {
         if ($$5.c() == exo.c) {
            boolean $$6 = false;

            for (exk $$7 : $$1) {
               exh $$8 = $$4.d($$7, $$5);
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

      return ev.b($$3, $$2);
   }

   private static int a(eq $$0, exk $$1, exd $$2) throws CommandSyntaxException {
      exl $$3 = $$0.l().aL();
      exh $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.hb());
      } else {
         $$0.a(() -> wu.a("commands.scoreboard.players.get.success", $$1.hb(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static wu a(Collection<exk> $$0) {
      return $$0.iterator().next().hb();
   }

   private static int a(eq $$0, Collection<exk> $$1, exd $$2, fm.a $$3, Collection<exk> $$4, exd $$5) throws CommandSyntaxException {
      exl $$6 = $$0.l().aL();
      int $$7 = 0;

      for (exk $$8 : $$1) {
         exj $$9 = $$6.c($$8, $$2);

         for (exk $$10 : $$4) {
            exj $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> wu.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> wu.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(eq $$0, Collection<exk> $$1, exd $$2) throws CommandSyntaxException {
      if ($$2.c() != exo.c) {
         throw e.create();
      } else {
         exl $$3 = $$0.l().aL();
         int $$4 = 0;

         for (exk $$5 : $$1) {
            exj $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> wu.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> wu.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(eq $$0, Collection<exk> $$1) {
      exl $$2 = $$0.l().aL();

      for (exk $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> wu.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(eq $$0, Collection<exk> $$1, exd $$2) {
      exl $$3 = $$0.l().aL();

      for (exk $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> wu.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eq $$0, Collection<exk> $$1, exd $$2, int $$3) {
      exl $$4 = $$0.l().aL();

      for (exk $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> wu.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(eq $$0, Collection<exk> $$1, exd $$2, @Nullable wu $$3) {
      exl $$4 = $$0.l().aL();

      for (exk $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> wu.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> wu.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> wu.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(eq $$0, Collection<exk> $$1, exd $$2, @Nullable yk $$3) {
      exl $$4 = $$0.l().aL();

      for (exk $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> wu.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> wu.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> wu.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(eq $$0, Collection<exk> $$1, exd $$2, int $$3) {
      exl $$4 = $$0.l().aL();
      int $$5 = 0;

      for (exk $$6 : $$1) {
         exj $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> wu.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> wu.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(eq $$0, Collection<exk> $$1, exd $$2, int $$3) {
      exl $$4 = $$0.l().aL();
      int $$5 = 0;

      for (exk $$6 : $$1) {
         exj $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> wu.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> wu.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(eq $$0) {
      Collection<exk> $$1 = $$0.l().aL().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> wu.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> wu.a("commands.scoreboard.players.list.success", $$1.size(), wx.b($$1, exk::hb)), false);
      }

      return $$1.size();
   }

   private static int a(eq $$0, exk $$1) {
      Object2IntMap<exd> $$2 = $$0.l().aL().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> wu.a("commands.scoreboard.players.list.entity.empty", $$1.hb()), false);
      } else {
         $$0.a(() -> wu.a("commands.scoreboard.players.list.entity.success", $$1.hb(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> wu.a("commands.scoreboard.players.list.entity.entry", ((exd)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(eq $$0, exc $$1) throws CommandSyntaxException {
      exl $$2 = $$0.l().aL();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> wu.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(eq $$0, exc $$1, exd $$2) throws CommandSyntaxException {
      exl $$3 = $$0.l().aL();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> wu.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(eq $$0, exd $$1, wu $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(eq $$0, exd $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> wu.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> wu.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(eq $$0, exd $$1, @Nullable yk $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> wu.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> wu.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(eq $$0, exd $$1, exo.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(eq $$0, exd $$1) {
      exl $$2 = $$0.l().aL();
      $$2.j($$1);
      $$0.a(() -> wu.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(eq $$0, String $$1, exo $$2, wu $$3) throws CommandSyntaxException {
      exl $$4 = $$0.l().aL();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         exd $$5 = $$4.a($$1);
         $$0.a(() -> wu.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(eq $$0) {
      Collection<exd> $$1 = $$0.l().aL().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> wu.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> wu.a("commands.scoreboard.objectives.list.success", $$1.size(), wx.b($$1, exd::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<eq> var1, @Nullable yk var2) throws CommandSyntaxException;
   }
}
