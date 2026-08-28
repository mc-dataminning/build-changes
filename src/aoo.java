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

public class aoo {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xl.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xl.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xl.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> xl.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("objectives")
                                 .then(eq.a("list").executes($$0x -> b((ep)$$0x.getSource()))))
                              .then(
                                 eq.a("add")
                                    .then(
                                       eq.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)eq.a("criteria", fk.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ep)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            fk.a($$0x, "criteria"),
                                                            xl.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   eq.a("displayName", ey.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ep)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               fk.a($$0x, "criteria"),
                                                               ey.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              eq.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("objective", fj.a())
                                                .then(
                                                   eq.a("displayname")
                                                      .then(
                                                         eq.a("displayName", ey.a($$1))
                                                            .executes($$0x -> a((ep)$$0x.getSource(), fj.a($$0x, "objective"), ey.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             eq.a("displayautoupdate")
                                                .then(
                                                   eq.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((ep)$$0x.getSource(), fj.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, eq.a("numberformat"), ($$0x, $$1x) -> a((ep)$$0x.getSource(), fj.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(eq.a("remove").then(eq.a("objective", fj.a()).executes($$0x -> a((ep)$$0x.getSource(), fj.a($$0x, "objective"))))))
                     .then(
                        eq.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)eq.a("slot", fv.a()).executes($$0x -> a((ep)$$0x.getSource(), fv.a($$0x, "slot"))))
                                 .then(eq.a("objective", fj.a()).executes($$0x -> a((ep)$$0x.getSource(), fv.a($$0x, "slot"), fj.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)eq.a("list").executes($$0x -> a((ep)$$0x.getSource())))
                                                .then(eq.a("target", fu.a()).suggests(fu.a).executes($$0x -> a((ep)$$0x.getSource(), fu.a($$0x, "target"))))
                                          ))
                                       .then(
                                          eq.a("set")
                                             .then(
                                                eq.a("targets", fu.b())
                                                   .suggests(fu.a)
                                                   .then(
                                                      eq.a("objective", fj.a())
                                                         .then(
                                                            eq.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ep)$$0x.getSource(),
                                                                        fu.c($$0x, "targets"),
                                                                        fj.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       eq.a("get")
                                          .then(
                                             eq.a("target", fu.a())
                                                .suggests(fu.a)
                                                .then(
                                                   eq.a("objective", fj.a())
                                                      .executes($$0x -> a((ep)$$0x.getSource(), fu.a($$0x, "target"), fj.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    eq.a("add")
                                       .then(
                                          eq.a("targets", fu.b())
                                             .suggests(fu.a)
                                             .then(
                                                eq.a("objective", fj.a())
                                                   .then(
                                                      eq.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (ep)$$0x.getSource(),
                                                                  fu.c($$0x, "targets"),
                                                                  fj.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 eq.a("remove")
                                    .then(
                                       eq.a("targets", fu.b())
                                          .suggests(fu.a)
                                          .then(
                                             eq.a("objective", fj.a())
                                                .then(
                                                   eq.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (ep)$$0x.getSource(),
                                                               fu.c($$0x, "targets"),
                                                               fj.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              eq.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)eq.a("targets", fu.b())
                                          .suggests(fu.a)
                                          .executes($$0x -> a((ep)$$0x.getSource(), fu.c($$0x, "targets"))))
                                       .then(
                                          eq.a("objective", fj.a()).executes($$0x -> b((ep)$$0x.getSource(), fu.c($$0x, "targets"), fj.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           eq.a("enable")
                              .then(
                                 eq.a("targets", fu.b())
                                    .suggests(fu.a)
                                    .then(
                                       eq.a("objective", fj.a())
                                          .suggests(($$0x, $$1x) -> a((ep)$$0x.getSource(), fu.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((ep)$$0x.getSource(), fu.c($$0x, "targets"), fj.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)eq.a("display")
                              .then(
                                 eq.a("name")
                                    .then(
                                       eq.a("targets", fu.b())
                                          .suggests(fu.a)
                                          .then(
                                             ((RequiredArgumentBuilder)eq.a("objective", fj.a())
                                                   .then(
                                                      eq.a("name", ey.a($$1))
                                                         .executes(
                                                            $$0x -> a((ep)$$0x.getSource(), fu.c($$0x, "targets"), fj.a($$0x, "objective"), ey.a($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((ep)$$0x.getSource(), fu.c($$0x, "targets"), fj.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              eq.a("numberformat")
                                 .then(
                                    eq.a("targets", fu.b())
                                       .suggests(fu.a)
                                       .then(
                                          a(
                                             $$1,
                                             eq.a("objective", fj.a()),
                                             ($$0x, $$1x) -> a((ep)$$0x.getSource(), fu.c($$0x, "targets"), fj.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     eq.a("operation")
                        .then(
                           eq.a("targets", fu.b())
                              .suggests(fu.a)
                              .then(
                                 eq.a("targetObjective", fj.a())
                                    .then(
                                       eq.a("operation", fl.a())
                                          .then(
                                             eq.a("source", fu.b())
                                                .suggests(fu.a)
                                                .then(
                                                   eq.a("sourceObjective", fj.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ep)$$0x.getSource(),
                                                               fu.c($$0x, "targets"),
                                                               fj.b($$0x, "targetObjective"),
                                                               fl.a($$0x, "operation"),
                                                               fu.c($$0x, "source"),
                                                               fj.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<ep, ?> a(el $$0, ArgumentBuilder<ep, ?> $$1, aoo.a $$2) {
      return $$1.then(eq.a("blank").executes($$1x -> $$2.run($$1x, yz.a))).then(eq.a("fixed").then(eq.a("contents", ey.a($$0)).executes($$1x -> {
         xl $$2x = ey.a($$1x, "contents");
         return $$2.run($$1x, new za($$2x));
      }))).then(eq.a("styled").then(eq.a("style", ga.a($$0)).executes($$1x -> {
         yi $$2x = ga.a($$1x, "style");
         return $$2.run($$1x, new ze($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<ep> a() {
      LiteralArgumentBuilder<ep> $$0 = eq.a("rendertype");

      for (ewt.a $$1 : ewt.a.values()) {
         $$0.then(eq.a($$1.a()).executes($$1x -> a((ep)$$1x.getSource(), fj.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(ep $$0, Collection<ewp> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      ewq $$4 = $$0.l().aK();

      for (ewi $$5 : $$4.c()) {
         if ($$5.c() == ewt.c) {
            boolean $$6 = false;

            for (ewp $$7 : $$1) {
               ewm $$8 = $$4.d($$7, $$5);
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

      return eu.b($$3, $$2);
   }

   private static int a(ep $$0, ewp $$1, ewi $$2) throws CommandSyntaxException {
      ewq $$3 = $$0.l().aK();
      ewm $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.he());
      } else {
         $$0.a(() -> xl.a("commands.scoreboard.players.get.success", $$1.he(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static xl a(Collection<ewp> $$0) {
      return $$0.iterator().next().he();
   }

   private static int a(ep $$0, Collection<ewp> $$1, ewi $$2, fl.a $$3, Collection<ewp> $$4, ewi $$5) throws CommandSyntaxException {
      ewq $$6 = $$0.l().aK();
      int $$7 = 0;

      for (ewp $$8 : $$1) {
         ewo $$9 = $$6.c($$8, $$2);

         for (ewp $$10 : $$4) {
            ewo $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> xl.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> xl.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(ep $$0, Collection<ewp> $$1, ewi $$2) throws CommandSyntaxException {
      if ($$2.c() != ewt.c) {
         throw e.create();
      } else {
         ewq $$3 = $$0.l().aK();
         int $$4 = 0;

         for (ewp $$5 : $$1) {
            ewo $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xl.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> xl.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(ep $$0, Collection<ewp> $$1) {
      ewq $$2 = $$0.l().aK();

      for (ewp $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> xl.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ep $$0, Collection<ewp> $$1, ewi $$2) {
      ewq $$3 = $$0.l().aK();

      for (ewp $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> xl.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ep $$0, Collection<ewp> $$1, ewi $$2, int $$3) {
      ewq $$4 = $$0.l().aK();

      for (ewp $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> xl.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(ep $$0, Collection<ewp> $$1, ewi $$2, @Nullable xl $$3) {
      ewq $$4 = $$0.l().aK();

      for (ewp $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xl.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> xl.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> xl.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(ep $$0, Collection<ewp> $$1, ewi $$2, @Nullable zb $$3) {
      ewq $$4 = $$0.l().aK();

      for (ewp $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xl.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> xl.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> xl.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(ep $$0, Collection<ewp> $$1, ewi $$2, int $$3) {
      ewq $$4 = $$0.l().aK();
      int $$5 = 0;

      for (ewp $$6 : $$1) {
         ewo $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xl.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xl.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(ep $$0, Collection<ewp> $$1, ewi $$2, int $$3) {
      ewq $$4 = $$0.l().aK();
      int $$5 = 0;

      for (ewp $$6 : $$1) {
         ewo $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xl.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xl.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(ep $$0) {
      Collection<ewp> $$1 = $$0.l().aK().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> xl.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> xl.a("commands.scoreboard.players.list.success", $$1.size(), xo.b($$1, ewp::he)), false);
      }

      return $$1.size();
   }

   private static int a(ep $$0, ewp $$1) {
      Object2IntMap<ewi> $$2 = $$0.l().aK().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> xl.a("commands.scoreboard.players.list.entity.empty", $$1.he()), false);
      } else {
         $$0.a(() -> xl.a("commands.scoreboard.players.list.entity.success", $$1.he(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> xl.a("commands.scoreboard.players.list.entity.entry", ((ewi)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(ep $$0, ewh $$1) throws CommandSyntaxException {
      ewq $$2 = $$0.l().aK();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> xl.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(ep $$0, ewh $$1, ewi $$2) throws CommandSyntaxException {
      ewq $$3 = $$0.l().aK();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xl.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(ep $$0, ewi $$1, xl $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> xl.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(ep $$0, ewi $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> xl.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> xl.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(ep $$0, ewi $$1, @Nullable zb $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> xl.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> xl.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(ep $$0, ewi $$1, ewt.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> xl.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(ep $$0, ewi $$1) {
      ewq $$2 = $$0.l().aK();
      $$2.j($$1);
      $$0.a(() -> xl.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(ep $$0, String $$1, ewt $$2, xl $$3) throws CommandSyntaxException {
      ewq $$4 = $$0.l().aK();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         ewi $$5 = $$4.a($$1);
         $$0.a(() -> xl.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(ep $$0) {
      Collection<ewi> $$1 = $$0.l().aK().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> xl.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> xl.a("commands.scoreboard.objectives.list.success", $$1.size(), xo.b($$1, ewi::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<ep> var1, @Nullable zb var2) throws CommandSyntaxException;
   }
}
