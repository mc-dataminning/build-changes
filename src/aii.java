import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;

public class aii {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tl.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tl.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(tl.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(tl.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> tl.a("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("objectives")
                                 .then(du.a("list").executes($$0x -> b((dt)$$0x.getSource()))))
                              .then(
                                 du.a("add")
                                    .then(
                                       du.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)du.a("criteria", em.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (dt)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            em.a($$0x, "criteria"),
                                                            tl.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   du.a("displayName", ea.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dt)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               em.a($$0x, "criteria"),
                                                               ea.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              du.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)du.a("objective", el.a())
                                          .then(
                                             du.a("displayname")
                                                .then(
                                                   du.a("displayName", ea.a())
                                                      .executes($$0x -> a((dt)$$0x.getSource(), el.a($$0x, "objective"), ea.a($$0x, "displayName")))
                                                )
                                          ))
                                       .then(a())
                                 )
                           ))
                        .then(du.a("remove").then(du.a("objective", el.a()).executes($$0x -> a((dt)$$0x.getSource(), el.a($$0x, "objective"))))))
                     .then(
                        du.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)du.a("slot", ew.a()).executes($$0x -> a((dt)$$0x.getSource(), ew.a($$0x, "slot"))))
                                 .then(du.a("objective", el.a()).executes($$0x -> a((dt)$$0x.getSource(), ew.a($$0x, "slot"), el.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a(
                                          "players"
                                       )
                                       .then(
                                          ((LiteralArgumentBuilder)du.a("list").executes($$0x -> a((dt)$$0x.getSource())))
                                             .then(du.a("target", ev.a()).suggests(ev.a).executes($$0x -> a((dt)$$0x.getSource(), ev.a($$0x, "target"))))
                                       ))
                                    .then(
                                       du.a("set")
                                          .then(
                                             du.a("targets", ev.b())
                                                .suggests(ev.a)
                                                .then(
                                                   du.a("objective", el.a())
                                                      .then(
                                                         du.a("score", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (dt)$$0x.getSource(),
                                                                     ev.c($$0x, "targets"),
                                                                     el.b($$0x, "objective"),
                                                                     IntegerArgumentType.getInteger($$0x, "score")
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    du.a("get")
                                       .then(
                                          du.a("target", ev.a())
                                             .suggests(ev.a)
                                             .then(
                                                du.a("objective", el.a())
                                                   .executes($$0x -> a((dt)$$0x.getSource(), ev.a($$0x, "target"), el.a($$0x, "objective")))
                                             )
                                       )
                                 ))
                              .then(
                                 du.a("add")
                                    .then(
                                       du.a("targets", ev.b())
                                          .suggests(ev.a)
                                          .then(
                                             du.a("objective", el.a())
                                                .then(
                                                   du.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> b(
                                                               (dt)$$0x.getSource(),
                                                               ev.c($$0x, "targets"),
                                                               el.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              du.a("remove")
                                 .then(
                                    du.a("targets", ev.b())
                                       .suggests(ev.a)
                                       .then(
                                          du.a("objective", el.a())
                                             .then(
                                                du.a("score", IntegerArgumentType.integer(0))
                                                   .executes(
                                                      $$0x -> c(
                                                            (dt)$$0x.getSource(),
                                                            ev.c($$0x, "targets"),
                                                            el.b($$0x, "objective"),
                                                            IntegerArgumentType.getInteger($$0x, "score")
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           du.a("reset")
                              .then(
                                 ((RequiredArgumentBuilder)du.a("targets", ev.b())
                                       .suggests(ev.a)
                                       .executes($$0x -> a((dt)$$0x.getSource(), ev.c($$0x, "targets"))))
                                    .then(du.a("objective", el.a()).executes($$0x -> b((dt)$$0x.getSource(), ev.c($$0x, "targets"), el.a($$0x, "objective"))))
                              )
                        ))
                     .then(
                        du.a("enable")
                           .then(
                              du.a("targets", ev.b())
                                 .suggests(ev.a)
                                 .then(
                                    du.a("objective", el.a())
                                       .suggests(($$0x, $$1) -> a((dt)$$0x.getSource(), ev.c($$0x, "targets"), $$1))
                                       .executes($$0x -> a((dt)$$0x.getSource(), ev.c($$0x, "targets"), el.a($$0x, "objective")))
                                 )
                           )
                     ))
                  .then(
                     du.a("operation")
                        .then(
                           du.a("targets", ev.b())
                              .suggests(ev.a)
                              .then(
                                 du.a("targetObjective", el.a())
                                    .then(
                                       du.a("operation", en.a())
                                          .then(
                                             du.a("source", ev.b())
                                                .suggests(ev.a)
                                                .then(
                                                   du.a("sourceObjective", el.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dt)$$0x.getSource(),
                                                               ev.c($$0x, "targets"),
                                                               el.b($$0x, "targetObjective"),
                                                               en.a($$0x, "operation"),
                                                               ev.c($$0x, "source"),
                                                               el.a($$0x, "sourceObjective")
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

   private static LiteralArgumentBuilder<dt> a() {
      LiteralArgumentBuilder<dt> $$0 = du.a("rendertype");

      for (eip.a $$1 : eip.a.values()) {
         $$0.then(du.a($$1.a()).executes($$1x -> a((dt)$$1x.getSource(), el.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(dt $$0, Collection<String> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      eim $$4 = $$0.l().aF();

      for (eij $$5 : $$4.c()) {
         if ($$5.c() == eip.b) {
            boolean $$6 = false;

            for (String $$7 : $$1) {
               if (!$$4.b($$7, $$5) || $$4.c($$7, $$5).g()) {
                  $$6 = true;
                  break;
               }
            }

            if ($$6) {
               $$3.add($$5.b());
            }
         }
      }

      return dw.b($$3, $$2);
   }

   private static int a(dt $$0, String $$1, eij $$2) throws CommandSyntaxException {
      eim $$3 = $$0.l().aF();
      if (!$$3.b($$1, $$2)) {
         throw f.create($$2.b(), $$1);
      } else {
         eil $$4 = $$3.c($$1, $$2);
         $$0.a(() -> tl.a("commands.scoreboard.players.get.success", $$1, $$4.b(), $$2.e()), false);
         return $$4.b();
      }
   }

   private static int a(dt $$0, Collection<String> $$1, eij $$2, en.a $$3, Collection<String> $$4, eij $$5) throws CommandSyntaxException {
      eim $$6 = $$0.l().aF();
      int $$7 = 0;

      for (String $$8 : $$1) {
         eil $$9 = $$6.c($$8, $$2);

         for (String $$10 : $$4) {
            eil $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.b();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> tl.a("commands.scoreboard.players.operation.success.single", $$2.e(), $$1.iterator().next(), $$12), true);
      } else {
         $$0.a(() -> tl.a("commands.scoreboard.players.operation.success.multiple", $$2.e(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(dt $$0, Collection<String> $$1, eij $$2) throws CommandSyntaxException {
      if ($$2.c() != eip.b) {
         throw e.create();
      } else {
         eim $$3 = $$0.l().aF();
         int $$4 = 0;

         for (String $$5 : $$1) {
            eil $$6 = $$3.c($$5, $$2);
            if ($$6.g()) {
               $$6.a(false);
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> tl.a("commands.scoreboard.players.enable.success.single", $$2.e(), $$1.iterator().next()), true);
            } else {
               $$0.a(() -> tl.a("commands.scoreboard.players.enable.success.multiple", $$2.e(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(dt $$0, Collection<String> $$1) {
      eim $$2 = $$0.l().aF();

      for (String $$3 : $$1) {
         $$2.d($$3, null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tl.a("commands.scoreboard.players.reset.all.single", $$1.iterator().next()), true);
      } else {
         $$0.a(() -> tl.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(dt $$0, Collection<String> $$1, eij $$2) {
      eim $$3 = $$0.l().aF();

      for (String $$4 : $$1) {
         $$3.d($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tl.a("commands.scoreboard.players.reset.specific.single", $$2.e(), $$1.iterator().next()), true);
      } else {
         $$0.a(() -> tl.a("commands.scoreboard.players.reset.specific.multiple", $$2.e(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dt $$0, Collection<String> $$1, eij $$2, int $$3) {
      eim $$4 = $$0.l().aF();

      for (String $$5 : $$1) {
         eil $$6 = $$4.c($$5, $$2);
         $$6.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tl.a("commands.scoreboard.players.set.success.single", $$2.e(), $$1.iterator().next(), $$3), true);
      } else {
         $$0.a(() -> tl.a("commands.scoreboard.players.set.success.multiple", $$2.e(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int b(dt $$0, Collection<String> $$1, eij $$2, int $$3) {
      eim $$4 = $$0.l().aF();
      int $$5 = 0;

      for (String $$6 : $$1) {
         eil $$7 = $$4.c($$6, $$2);
         $$7.b($$7.b() + $$3);
         $$5 += $$7.b();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> tl.a("commands.scoreboard.players.add.success.single", $$3, $$2.e(), $$1.iterator().next(), $$8), true);
      } else {
         $$0.a(() -> tl.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.e(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(dt $$0, Collection<String> $$1, eij $$2, int $$3) {
      eim $$4 = $$0.l().aF();
      int $$5 = 0;

      for (String $$6 : $$1) {
         eil $$7 = $$4.c($$6, $$2);
         $$7.b($$7.b() - $$3);
         $$5 += $$7.b();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> tl.a("commands.scoreboard.players.remove.success.single", $$3, $$2.e(), $$1.iterator().next(), $$8), true);
      } else {
         $$0.a(() -> tl.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.e(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(dt $$0) {
      Collection<String> $$1 = $$0.l().aF().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> tl.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> tl.a("commands.scoreboard.players.list.success", $$1.size(), tn.a($$1)), false);
      }

      return $$1.size();
   }

   private static int a(dt $$0, String $$1) {
      Map<eij, eil> $$2 = $$0.l().aF().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> tl.a("commands.scoreboard.players.list.entity.empty", $$1), false);
      } else {
         $$0.a(() -> tl.a("commands.scoreboard.players.list.entity.success", $$1, $$2.size()), false);

         for (Entry<eij, eil> $$3 : $$2.entrySet()) {
            $$0.a(() -> tl.a("commands.scoreboard.players.list.entity.entry", $$3.getKey().e(), $$3.getValue().b()), false);
         }
      }

      return $$2.size();
   }

   private static int a(dt $$0, eii $$1) throws CommandSyntaxException {
      eim $$2 = $$0.l().aF();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> tl.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(dt $$0, eii $$1, eij $$2) throws CommandSyntaxException {
      eim $$3 = $$0.l().aF();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> tl.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(dt $$0, eij $$1, tl $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> tl.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.e()), true);
      }

      return 0;
   }

   private static int a(dt $$0, eij $$1, eip.a $$2) {
      if ($$1.f() != $$2) {
         $$1.a($$2);
         $$0.a(() -> tl.a("commands.scoreboard.objectives.modify.rendertype", $$1.e()), true);
      }

      return 0;
   }

   private static int a(dt $$0, eij $$1) {
      eim $$2 = $$0.l().aF();
      $$2.j($$1);
      $$0.a(() -> tl.a("commands.scoreboard.objectives.remove.success", $$1.e()), true);
      return $$2.c().size();
   }

   private static int a(dt $$0, String $$1, eip $$2, tl $$3) throws CommandSyntaxException {
      eim $$4 = $$0.l().aF();
      if ($$4.b($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f());
         eij $$5 = $$4.b($$1);
         $$0.a(() -> tl.a("commands.scoreboard.objectives.add.success", $$5.e()), true);
         return $$4.c().size();
      }
   }

   private static int b(dt $$0) {
      Collection<eij> $$1 = $$0.l().aF().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> tl.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> tl.a("commands.scoreboard.objectives.list.success", $$1.size(), tn.b($$1, eij::e)), false);
      }

      return $$1.size();
   }
}
