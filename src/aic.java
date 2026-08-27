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

public class aic {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tf.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(tf.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(tf.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> tf.a("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("objectives")
                                 .then(ds.a("list").executes($$0x -> b((dr)$$0x.getSource()))))
                              .then(
                                 ds.a("add")
                                    .then(
                                       ds.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)ds.a("criteria", ek.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (dr)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            ek.a($$0x, "criteria"),
                                                            tf.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   ds.a("displayName", dy.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dr)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               ek.a($$0x, "criteria"),
                                                               dy.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ds.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)ds.a("objective", ej.a())
                                          .then(
                                             ds.a("displayname")
                                                .then(
                                                   ds.a("displayName", dy.a())
                                                      .executes($$0x -> a((dr)$$0x.getSource(), ej.a($$0x, "objective"), dy.a($$0x, "displayName")))
                                                )
                                          ))
                                       .then(a())
                                 )
                           ))
                        .then(ds.a("remove").then(ds.a("objective", ej.a()).executes($$0x -> a((dr)$$0x.getSource(), ej.a($$0x, "objective"))))))
                     .then(
                        ds.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)ds.a("slot", eu.a()).executes($$0x -> a((dr)$$0x.getSource(), eu.a($$0x, "slot"))))
                                 .then(ds.a("objective", ej.a()).executes($$0x -> a((dr)$$0x.getSource(), eu.a($$0x, "slot"), ej.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a(
                                          "players"
                                       )
                                       .then(
                                          ((LiteralArgumentBuilder)ds.a("list").executes($$0x -> a((dr)$$0x.getSource())))
                                             .then(ds.a("target", et.a()).suggests(et.a).executes($$0x -> a((dr)$$0x.getSource(), et.a($$0x, "target"))))
                                       ))
                                    .then(
                                       ds.a("set")
                                          .then(
                                             ds.a("targets", et.b())
                                                .suggests(et.a)
                                                .then(
                                                   ds.a("objective", ej.a())
                                                      .then(
                                                         ds.a("score", IntegerArgumentType.integer())
                                                            .executes(
                                                               $$0x -> a(
                                                                     (dr)$$0x.getSource(),
                                                                     et.c($$0x, "targets"),
                                                                     ej.b($$0x, "objective"),
                                                                     IntegerArgumentType.getInteger($$0x, "score")
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ds.a("get")
                                       .then(
                                          ds.a("target", et.a())
                                             .suggests(et.a)
                                             .then(
                                                ds.a("objective", ej.a())
                                                   .executes($$0x -> a((dr)$$0x.getSource(), et.a($$0x, "target"), ej.a($$0x, "objective")))
                                             )
                                       )
                                 ))
                              .then(
                                 ds.a("add")
                                    .then(
                                       ds.a("targets", et.b())
                                          .suggests(et.a)
                                          .then(
                                             ds.a("objective", ej.a())
                                                .then(
                                                   ds.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> b(
                                                               (dr)$$0x.getSource(),
                                                               et.c($$0x, "targets"),
                                                               ej.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ds.a("remove")
                                 .then(
                                    ds.a("targets", et.b())
                                       .suggests(et.a)
                                       .then(
                                          ds.a("objective", ej.a())
                                             .then(
                                                ds.a("score", IntegerArgumentType.integer(0))
                                                   .executes(
                                                      $$0x -> c(
                                                            (dr)$$0x.getSource(),
                                                            et.c($$0x, "targets"),
                                                            ej.b($$0x, "objective"),
                                                            IntegerArgumentType.getInteger($$0x, "score")
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ds.a("reset")
                              .then(
                                 ((RequiredArgumentBuilder)ds.a("targets", et.b())
                                       .suggests(et.a)
                                       .executes($$0x -> a((dr)$$0x.getSource(), et.c($$0x, "targets"))))
                                    .then(ds.a("objective", ej.a()).executes($$0x -> b((dr)$$0x.getSource(), et.c($$0x, "targets"), ej.a($$0x, "objective"))))
                              )
                        ))
                     .then(
                        ds.a("enable")
                           .then(
                              ds.a("targets", et.b())
                                 .suggests(et.a)
                                 .then(
                                    ds.a("objective", ej.a())
                                       .suggests(($$0x, $$1) -> a((dr)$$0x.getSource(), et.c($$0x, "targets"), $$1))
                                       .executes($$0x -> a((dr)$$0x.getSource(), et.c($$0x, "targets"), ej.a($$0x, "objective")))
                                 )
                           )
                     ))
                  .then(
                     ds.a("operation")
                        .then(
                           ds.a("targets", et.b())
                              .suggests(et.a)
                              .then(
                                 ds.a("targetObjective", ej.a())
                                    .then(
                                       ds.a("operation", el.a())
                                          .then(
                                             ds.a("source", et.b())
                                                .suggests(et.a)
                                                .then(
                                                   ds.a("sourceObjective", ej.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (dr)$$0x.getSource(),
                                                               et.c($$0x, "targets"),
                                                               ej.b($$0x, "targetObjective"),
                                                               el.a($$0x, "operation"),
                                                               et.c($$0x, "source"),
                                                               ej.a($$0x, "sourceObjective")
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

   private static LiteralArgumentBuilder<dr> a() {
      LiteralArgumentBuilder<dr> $$0 = ds.a("rendertype");

      for (eig.a $$1 : eig.a.values()) {
         $$0.then(ds.a($$1.a()).executes($$1x -> a((dr)$$1x.getSource(), ej.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(dr $$0, Collection<String> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      eid $$4 = $$0.l().aF();

      for (eia $$5 : $$4.c()) {
         if ($$5.c() == eig.b) {
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

      return du.b($$3, $$2);
   }

   private static int a(dr $$0, String $$1, eia $$2) throws CommandSyntaxException {
      eid $$3 = $$0.l().aF();
      if (!$$3.b($$1, $$2)) {
         throw f.create($$2.b(), $$1);
      } else {
         eic $$4 = $$3.c($$1, $$2);
         $$0.a(() -> tf.a("commands.scoreboard.players.get.success", $$1, $$4.b(), $$2.e()), false);
         return $$4.b();
      }
   }

   private static int a(dr $$0, Collection<String> $$1, eia $$2, el.a $$3, Collection<String> $$4, eia $$5) throws CommandSyntaxException {
      eid $$6 = $$0.l().aF();
      int $$7 = 0;

      for (String $$8 : $$1) {
         eic $$9 = $$6.c($$8, $$2);

         for (String $$10 : $$4) {
            eic $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.b();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> tf.a("commands.scoreboard.players.operation.success.single", $$2.e(), $$1.iterator().next(), $$12), true);
      } else {
         $$0.a(() -> tf.a("commands.scoreboard.players.operation.success.multiple", $$2.e(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(dr $$0, Collection<String> $$1, eia $$2) throws CommandSyntaxException {
      if ($$2.c() != eig.b) {
         throw e.create();
      } else {
         eid $$3 = $$0.l().aF();
         int $$4 = 0;

         for (String $$5 : $$1) {
            eic $$6 = $$3.c($$5, $$2);
            if ($$6.g()) {
               $$6.a(false);
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> tf.a("commands.scoreboard.players.enable.success.single", $$2.e(), $$1.iterator().next()), true);
            } else {
               $$0.a(() -> tf.a("commands.scoreboard.players.enable.success.multiple", $$2.e(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(dr $$0, Collection<String> $$1) {
      eid $$2 = $$0.l().aF();

      for (String $$3 : $$1) {
         $$2.d($$3, null);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tf.a("commands.scoreboard.players.reset.all.single", $$1.iterator().next()), true);
      } else {
         $$0.a(() -> tf.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(dr $$0, Collection<String> $$1, eia $$2) {
      eid $$3 = $$0.l().aF();

      for (String $$4 : $$1) {
         $$3.d($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tf.a("commands.scoreboard.players.reset.specific.single", $$2.e(), $$1.iterator().next()), true);
      } else {
         $$0.a(() -> tf.a("commands.scoreboard.players.reset.specific.multiple", $$2.e(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dr $$0, Collection<String> $$1, eia $$2, int $$3) {
      eid $$4 = $$0.l().aF();

      for (String $$5 : $$1) {
         eic $$6 = $$4.c($$5, $$2);
         $$6.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tf.a("commands.scoreboard.players.set.success.single", $$2.e(), $$1.iterator().next(), $$3), true);
      } else {
         $$0.a(() -> tf.a("commands.scoreboard.players.set.success.multiple", $$2.e(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int b(dr $$0, Collection<String> $$1, eia $$2, int $$3) {
      eid $$4 = $$0.l().aF();
      int $$5 = 0;

      for (String $$6 : $$1) {
         eic $$7 = $$4.c($$6, $$2);
         $$7.b($$7.b() + $$3);
         $$5 += $$7.b();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> tf.a("commands.scoreboard.players.add.success.single", $$3, $$2.e(), $$1.iterator().next(), $$8), true);
      } else {
         $$0.a(() -> tf.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.e(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(dr $$0, Collection<String> $$1, eia $$2, int $$3) {
      eid $$4 = $$0.l().aF();
      int $$5 = 0;

      for (String $$6 : $$1) {
         eic $$7 = $$4.c($$6, $$2);
         $$7.b($$7.b() - $$3);
         $$5 += $$7.b();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> tf.a("commands.scoreboard.players.remove.success.single", $$3, $$2.e(), $$1.iterator().next(), $$8), true);
      } else {
         $$0.a(() -> tf.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.e(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(dr $$0) {
      Collection<String> $$1 = $$0.l().aF().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> tf.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> tf.a("commands.scoreboard.players.list.success", $$1.size(), th.a($$1)), false);
      }

      return $$1.size();
   }

   private static int a(dr $$0, String $$1) {
      Map<eia, eic> $$2 = $$0.l().aF().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> tf.a("commands.scoreboard.players.list.entity.empty", $$1), false);
      } else {
         $$0.a(() -> tf.a("commands.scoreboard.players.list.entity.success", $$1, $$2.size()), false);

         for (Entry<eia, eic> $$3 : $$2.entrySet()) {
            $$0.a(() -> tf.a("commands.scoreboard.players.list.entity.entry", $$3.getKey().e(), $$3.getValue().b()), false);
         }
      }

      return $$2.size();
   }

   private static int a(dr $$0, ehz $$1) throws CommandSyntaxException {
      eid $$2 = $$0.l().aF();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> tf.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(dr $$0, ehz $$1, eia $$2) throws CommandSyntaxException {
      eid $$3 = $$0.l().aF();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> tf.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(dr $$0, eia $$1, tf $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> tf.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.e()), true);
      }

      return 0;
   }

   private static int a(dr $$0, eia $$1, eig.a $$2) {
      if ($$1.f() != $$2) {
         $$1.a($$2);
         $$0.a(() -> tf.a("commands.scoreboard.objectives.modify.rendertype", $$1.e()), true);
      }

      return 0;
   }

   private static int a(dr $$0, eia $$1) {
      eid $$2 = $$0.l().aF();
      $$2.j($$1);
      $$0.a(() -> tf.a("commands.scoreboard.objectives.remove.success", $$1.e()), true);
      return $$2.c().size();
   }

   private static int a(dr $$0, String $$1, eig $$2, tf $$3) throws CommandSyntaxException {
      eid $$4 = $$0.l().aF();
      if ($$4.b($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f());
         eia $$5 = $$4.b($$1);
         $$0.a(() -> tf.a("commands.scoreboard.objectives.add.success", $$5.e()), true);
         return $$4.c().size();
      }
   }

   private static int b(dr $$0) {
      Collection<eia> $$1 = $$0.l().aF().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> tf.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> tf.a("commands.scoreboard.objectives.list.success", $$1.size(), th.b($$1, eia::e)), false);
      }

      return $$1.size();
   }
}
