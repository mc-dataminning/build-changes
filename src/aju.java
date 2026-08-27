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

public class aju {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ur.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ur.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ur.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ur.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> ur.b("commands.scoreboard.players.get.null", $$0, $$1));

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
                                             ((RequiredArgumentBuilder)dv.a("criteria", eo.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            eo.a($$0x, "criteria"),
                                                            ur.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("displayName", ec.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               eo.a($$0x, "criteria"),
                                                               ec.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              dv.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)dv.a("objective", en.a())
                                          .then(
                                             dv.a("displayname")
                                                .then(
                                                   dv.a("displayName", ec.a())
                                                      .executes($$0x -> a((du)$$0x.getSource(), en.a($$0x, "objective"), ec.a($$0x, "displayName")))
                                                )
                                          ))
                                       .then(a())
                                 )
                           ))
                        .then(dv.a("remove").then(dv.a("objective", en.a()).executes($$0x -> a((du)$$0x.getSource(), en.a($$0x, "objective"))))))
                     .then(
                        dv.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)dv.a("slot", ey.a()).executes($$0x -> a((du)$$0x.getSource(), ey.a($$0x, "slot"))))
                                 .then(dv.a("objective", en.a()).executes($$0x -> a((du)$$0x.getSource(), ey.a($$0x, "slot"), en.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                                          "players"
                                       )
                                       .then(
                                          ((LiteralArgumentBuilder)dv.a("list").executes($$0x -> a((du)$$0x.getSource())))
                                             .then(dv.a("target", ex.a()).suggests(ex.a).executes($$0x -> a((du)$$0x.getSource(), ex.a($$0x, "target"))))
                                       ))
                                    .then(
                                       dv.a("set")
                                          .then(
                                             dv.a("targets", ex.b())
                                                .suggests(ex.a)
                                                .then(
                                                   dv.a("objective", en.a())
                                                      .then(
                                                         dv.a("score", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (du)$$0x.getSource(),
                                                                     ex.c($$0x, "targets"),
                                                                     en.b($$0x, "objective"),
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
                                          dv.a("target", ex.a())
                                             .suggests(ex.a)
                                             .then(
                                                dv.a("objective", en.a())
                                                   .executes($$0x -> a((du)$$0x.getSource(), ex.a($$0x, "target"), en.a($$0x, "objective")))
                                             )
                                       )
                                 ))
                              .then(
                                 dv.a("add")
                                    .then(
                                       dv.a("targets", ex.b())
                                          .suggests(ex.a)
                                          .then(
                                             dv.a("objective", en.a())
                                                .then(
                                                   dv.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> b(
                                                               (du)$$0x.getSource(),
                                                               ex.c($$0x, "targets"),
                                                               en.b($$0x, "objective"),
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
                                    dv.a("targets", ex.b())
                                       .suggests(ex.a)
                                       .then(
                                          dv.a("objective", en.a())
                                             .then(
                                                dv.a("score", IntegerArgumentType.integer(0))
                                                   .executes(
                                                      $$0x -> c(
                                                            (du)$$0x.getSource(),
                                                            ex.c($$0x, "targets"),
                                                            en.b($$0x, "objective"),
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
                                 ((RequiredArgumentBuilder)dv.a("targets", ex.b())
                                       .suggests(ex.a)
                                       .executes($$0x -> a((du)$$0x.getSource(), ex.c($$0x, "targets"))))
                                    .then(dv.a("objective", en.a()).executes($$0x -> b((du)$$0x.getSource(), ex.c($$0x, "targets"), en.a($$0x, "objective"))))
                              )
                        ))
                     .then(
                        dv.a("enable")
                           .then(
                              dv.a("targets", ex.b())
                                 .suggests(ex.a)
                                 .then(
                                    dv.a("objective", en.a())
                                       .suggests(($$0x, $$1) -> a((du)$$0x.getSource(), ex.c($$0x, "targets"), $$1))
                                       .executes($$0x -> a((du)$$0x.getSource(), ex.c($$0x, "targets"), en.a($$0x, "objective")))
                                 )
                           )
                     ))
                  .then(
                     dv.a("operation")
                        .then(
                           dv.a("targets", ex.b())
                              .suggests(ex.a)
                              .then(
                                 dv.a("targetObjective", en.a())
                                    .then(
                                       dv.a("operation", ep.a())
                                          .then(
                                             dv.a("source", ex.b())
                                                .suggests(ex.a)
                                                .then(
                                                   dv.a("sourceObjective", en.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               ex.c($$0x, "targets"),
                                                               en.b($$0x, "targetObjective"),
                                                               ep.a($$0x, "operation"),
                                                               ex.c($$0x, "source"),
                                                               en.a($$0x, "sourceObjective")
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

   private static LiteralArgumentBuilder<du> a() {
      LiteralArgumentBuilder<du> $$0 = dv.a("rendertype");

      for (ekw.a $$1 : ekw.a.values()) {
         $$0.then(dv.a($$1.a()).executes($$1x -> a((du)$$1x.getSource(), en.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(du $$0, Collection<String> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      ekt $$4 = $$0.m().aH();

      for (ekq $$5 : $$4.c()) {
         if ($$5.c() == ekw.b) {
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

      return dy.b($$3, $$2);
   }

   private static int a(du $$0, String $$1, ekq $$2) throws CommandSyntaxException {
      ekt $$3 = $$0.m().aH();
      if (!$$3.b($$1, $$2)) {
         throw f.create($$2.b(), $$1);
      } else {
         eks $$4 = $$3.c($$1, $$2);
         $$0.a(() -> ur.a("commands.scoreboard.players.get.success", $$1, $$4.b(), $$2.e()), false);
         return $$4.b();
      }
   }

   private static int a(du $$0, Collection<String> $$1, ekq $$2, ep.a $$3, Collection<String> $$4, ekq $$5) throws CommandSyntaxException {
      ekt $$6 = $$0.m().aH();
      int $$7 = 0;

      for (String $$8 : $$1) {
         eks $$9 = $$6.c($$8, $$2);

         for (String $$10 : $$4) {
            eks $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.b();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> ur.a("commands.scoreboard.players.operation.success.single", $$2.e(), $$1.iterator().next(), $$12), true);
      } else {
         $$0.a(() -> ur.a("commands.scoreboard.players.operation.success.multiple", $$2.e(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(du $$0, Collection<String> $$1, ekq $$2) throws CommandSyntaxException {
      if ($$2.c() != ekw.b) {
         throw e.create();
      } else {
         ekt $$3 = $$0.m().aH();
         int $$4 = 0;

         for (String $$5 : $$1) {
            eks $$6 = $$3.c($$5, $$2);
            if ($$6.g()) {
               $$6.a(false);
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> ur.a("commands.scoreboard.players.enable.success.single", $$2.e(), $$1.iterator().next()), true);
            } else {
               $$0.a(() -> ur.a("commands.scoreboard.players.enable.success.multiple", $$2.e(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(du $$0, Collection<String> $$1) {
      ekt $$2 = $$0.m().aH();

      for (String $$3 : $$1) {
         $$2.d($$3, null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ur.a("commands.scoreboard.players.reset.all.single", $$1.iterator().next()), true);
      } else {
         $$0.a(() -> ur.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(du $$0, Collection<String> $$1, ekq $$2) {
      ekt $$3 = $$0.m().aH();

      for (String $$4 : $$1) {
         $$3.d($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ur.a("commands.scoreboard.players.reset.specific.single", $$2.e(), $$1.iterator().next()), true);
      } else {
         $$0.a(() -> ur.a("commands.scoreboard.players.reset.specific.multiple", $$2.e(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<String> $$1, ekq $$2, int $$3) {
      ekt $$4 = $$0.m().aH();

      for (String $$5 : $$1) {
         eks $$6 = $$4.c($$5, $$2);
         $$6.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ur.a("commands.scoreboard.players.set.success.single", $$2.e(), $$1.iterator().next(), $$3), true);
      } else {
         $$0.a(() -> ur.a("commands.scoreboard.players.set.success.multiple", $$2.e(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int b(du $$0, Collection<String> $$1, ekq $$2, int $$3) {
      ekt $$4 = $$0.m().aH();
      int $$5 = 0;

      for (String $$6 : $$1) {
         eks $$7 = $$4.c($$6, $$2);
         $$7.b($$7.b() + $$3);
         $$5 += $$7.b();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> ur.a("commands.scoreboard.players.add.success.single", $$3, $$2.e(), $$1.iterator().next(), $$8), true);
      } else {
         $$0.a(() -> ur.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.e(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(du $$0, Collection<String> $$1, ekq $$2, int $$3) {
      ekt $$4 = $$0.m().aH();
      int $$5 = 0;

      for (String $$6 : $$1) {
         eks $$7 = $$4.c($$6, $$2);
         $$7.b($$7.b() - $$3);
         $$5 += $$7.b();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> ur.a("commands.scoreboard.players.remove.success.single", $$3, $$2.e(), $$1.iterator().next(), $$8), true);
      } else {
         $$0.a(() -> ur.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.e(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(du $$0) {
      Collection<String> $$1 = $$0.m().aH().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> ur.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> ur.a("commands.scoreboard.players.list.success", $$1.size(), uu.a($$1)), false);
      }

      return $$1.size();
   }

   private static int a(du $$0, String $$1) {
      Map<ekq, eks> $$2 = $$0.m().aH().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> ur.a("commands.scoreboard.players.list.entity.empty", $$1), false);
      } else {
         $$0.a(() -> ur.a("commands.scoreboard.players.list.entity.success", $$1, $$2.size()), false);

         for (Entry<ekq, eks> $$3 : $$2.entrySet()) {
            $$0.a(() -> ur.a("commands.scoreboard.players.list.entity.entry", $$3.getKey().e(), $$3.getValue().b()), false);
         }
      }

      return $$2.size();
   }

   private static int a(du $$0, ekp $$1) throws CommandSyntaxException {
      ekt $$2 = $$0.m().aH();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> ur.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(du $$0, ekp $$1, ekq $$2) throws CommandSyntaxException {
      ekt $$3 = $$0.m().aH();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> ur.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(du $$0, ekq $$1, ur $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> ur.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.e()), true);
      }

      return 0;
   }

   private static int a(du $$0, ekq $$1, ekw.a $$2) {
      if ($$1.f() != $$2) {
         $$1.a($$2);
         $$0.a(() -> ur.a("commands.scoreboard.objectives.modify.rendertype", $$1.e()), true);
      }

      return 0;
   }

   private static int a(du $$0, ekq $$1) {
      ekt $$2 = $$0.m().aH();
      $$2.j($$1);
      $$0.a(() -> ur.a("commands.scoreboard.objectives.remove.success", $$1.e()), true);
      return $$2.c().size();
   }

   private static int a(du $$0, String $$1, ekw $$2, ur $$3) throws CommandSyntaxException {
      ekt $$4 = $$0.m().aH();
      if ($$4.b($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f());
         ekq $$5 = $$4.b($$1);
         $$0.a(() -> ur.a("commands.scoreboard.objectives.add.success", $$5.e()), true);
         return $$4.c().size();
      }
   }

   private static int b(du $$0) {
      Collection<ekq> $$1 = $$0.m().aH().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> ur.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> ur.a("commands.scoreboard.objectives.list.success", $$1.size(), uu.b($$1, ekq::e)), false);
      }

      return $$1.size();
   }
}
