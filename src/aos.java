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

public class aos {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xe.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("objectives")
                                 .then(ev.a("list").executes($$0x -> b((eu)$$0x.getSource()))))
                              .then(
                                 ev.a("add")
                                    .then(
                                       ev.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)ev.a("criteria", fp.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (eu)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            fp.a($$0x, "criteria"),
                                                            xe.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   ev.a("displayName", fd.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (eu)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               fp.a($$0x, "criteria"),
                                                               fd.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ev.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("objective", fo.a())
                                                .then(
                                                   ev.a("displayname")
                                                      .then(
                                                         ev.a("displayName", fd.a($$1))
                                                            .executes($$0x -> a((eu)$$0x.getSource(), fo.a($$0x, "objective"), fd.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             ev.a("displayautoupdate")
                                                .then(
                                                   ev.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((eu)$$0x.getSource(), fo.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, ev.a("numberformat"), ($$0x, $$1x) -> a((eu)$$0x.getSource(), fo.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(ev.a("remove").then(ev.a("objective", fo.a()).executes($$0x -> a((eu)$$0x.getSource(), fo.a($$0x, "objective"))))))
                     .then(
                        ev.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)ev.a("slot", ga.a()).executes($$0x -> a((eu)$$0x.getSource(), ga.a($$0x, "slot"))))
                                 .then(ev.a("objective", fo.a()).executes($$0x -> a((eu)$$0x.getSource(), ga.a($$0x, "slot"), fo.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)ev.a("list").executes($$0x -> a((eu)$$0x.getSource())))
                                                .then(ev.a("target", fz.a()).suggests(fz.a).executes($$0x -> a((eu)$$0x.getSource(), fz.a($$0x, "target"))))
                                          ))
                                       .then(
                                          ev.a("set")
                                             .then(
                                                ev.a("targets", fz.b())
                                                   .suggests(fz.a)
                                                   .then(
                                                      ev.a("objective", fo.a())
                                                         .then(
                                                            ev.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (eu)$$0x.getSource(),
                                                                        fz.c($$0x, "targets"),
                                                                        fo.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ev.a("get")
                                          .then(
                                             ev.a("target", fz.a())
                                                .suggests(fz.a)
                                                .then(
                                                   ev.a("objective", fo.a())
                                                      .executes($$0x -> a((eu)$$0x.getSource(), fz.a($$0x, "target"), fo.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    ev.a("add")
                                       .then(
                                          ev.a("targets", fz.b())
                                             .suggests(fz.a)
                                             .then(
                                                ev.a("objective", fo.a())
                                                   .then(
                                                      ev.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (eu)$$0x.getSource(),
                                                                  fz.c($$0x, "targets"),
                                                                  fo.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ev.a("remove")
                                    .then(
                                       ev.a("targets", fz.b())
                                          .suggests(fz.a)
                                          .then(
                                             ev.a("objective", fo.a())
                                                .then(
                                                   ev.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (eu)$$0x.getSource(),
                                                               fz.c($$0x, "targets"),
                                                               fo.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ev.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)ev.a("targets", fz.b())
                                          .suggests(fz.a)
                                          .executes($$0x -> a((eu)$$0x.getSource(), fz.c($$0x, "targets"))))
                                       .then(
                                          ev.a("objective", fo.a()).executes($$0x -> b((eu)$$0x.getSource(), fz.c($$0x, "targets"), fo.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           ev.a("enable")
                              .then(
                                 ev.a("targets", fz.b())
                                    .suggests(fz.a)
                                    .then(
                                       ev.a("objective", fo.a())
                                          .suggests(($$0x, $$1x) -> a((eu)$$0x.getSource(), fz.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((eu)$$0x.getSource(), fz.c($$0x, "targets"), fo.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)ev.a("display")
                              .then(
                                 ev.a("name")
                                    .then(
                                       ev.a("targets", fz.b())
                                          .suggests(fz.a)
                                          .then(
                                             ((RequiredArgumentBuilder)ev.a("objective", fo.a())
                                                   .then(
                                                      ev.a("name", fd.a($$1))
                                                         .executes(
                                                            $$0x -> a((eu)$$0x.getSource(), fz.c($$0x, "targets"), fo.a($$0x, "objective"), fd.a($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((eu)$$0x.getSource(), fz.c($$0x, "targets"), fo.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              ev.a("numberformat")
                                 .then(
                                    ev.a("targets", fz.b())
                                       .suggests(fz.a)
                                       .then(
                                          a(
                                             $$1,
                                             ev.a("objective", fo.a()),
                                             ($$0x, $$1x) -> a((eu)$$0x.getSource(), fz.c($$0x, "targets"), fo.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     ev.a("operation")
                        .then(
                           ev.a("targets", fz.b())
                              .suggests(fz.a)
                              .then(
                                 ev.a("targetObjective", fo.a())
                                    .then(
                                       ev.a("operation", fq.a())
                                          .then(
                                             ev.a("source", fz.b())
                                                .suggests(fz.a)
                                                .then(
                                                   ev.a("sourceObjective", fo.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eu)$$0x.getSource(),
                                                               fz.c($$0x, "targets"),
                                                               fo.b($$0x, "targetObjective"),
                                                               fq.a($$0x, "operation"),
                                                               fz.c($$0x, "source"),
                                                               fo.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<eu, ?> a(eq $$0, ArgumentBuilder<eu, ?> $$1, aos.a $$2) {
      return $$1.then(ev.a("blank").executes($$1x -> $$2.run($$1x, ys.a))).then(ev.a("fixed").then(ev.a("contents", fd.a($$0)).executes($$1x -> {
         xe $$2x = fd.a($$1x, "contents");
         return $$2.run($$1x, new yt($$2x));
      }))).then(ev.a("styled").then(ev.a("style", gf.a($$0)).executes($$1x -> {
         yb $$2x = gf.a($$1x, "style");
         return $$2.run($$1x, new yx($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<eu> a() {
      LiteralArgumentBuilder<eu> $$0 = ev.a("rendertype");

      for (fae.a $$1 : fae.a.values()) {
         $$0.then(ev.a($$1.a()).executes($$1x -> a((eu)$$1x.getSource(), fo.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(eu $$0, Collection<faa> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      fab $$4 = $$0.l().aJ();

      for (ezt $$5 : $$4.c()) {
         if ($$5.c() == fae.c) {
            boolean $$6 = false;

            for (faa $$7 : $$1) {
               ezx $$8 = $$4.d($$7, $$5);
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

      return ez.b($$3, $$2);
   }

   private static int a(eu $$0, faa $$1, ezt $$2) throws CommandSyntaxException {
      fab $$3 = $$0.l().aJ();
      ezx $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.he());
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.get.success", $$1.he(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static xe a(Collection<faa> $$0) {
      return $$0.iterator().next().he();
   }

   private static int a(eu $$0, Collection<faa> $$1, ezt $$2, fq.a $$3, Collection<faa> $$4, ezt $$5) throws CommandSyntaxException {
      fab $$6 = $$0.l().aJ();
      int $$7 = 0;

      for (faa $$8 : $$1) {
         ezz $$9 = $$6.c($$8, $$2);

         for (faa $$10 : $$4) {
            ezz $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> xe.a("commands.scoreboard.players.operation.success.single", $$2.g(), a($$1), $$12), true);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.operation.success.multiple", $$2.g(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(eu $$0, Collection<faa> $$1, ezt $$2) throws CommandSyntaxException {
      if ($$2.c() != fae.c) {
         throw e.create();
      } else {
         fab $$3 = $$0.l().aJ();
         int $$4 = 0;

         for (faa $$5 : $$1) {
            ezz $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xe.a("commands.scoreboard.players.enable.success.single", $$2.g(), a($$1)), true);
            } else {
               $$0.a(() -> xe.a("commands.scoreboard.players.enable.success.multiple", $$2.g(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(eu $$0, Collection<faa> $$1) {
      fab $$2 = $$0.l().aJ();

      for (faa $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(eu $$0, Collection<faa> $$1, ezt $$2) {
      fab $$3 = $$0.l().aJ();

      for (faa $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eu $$0, Collection<faa> $$1, ezt $$2, int $$3) {
      fab $$4 = $$0.l().aJ();

      for (faa $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(eu $$0, Collection<faa> $$1, ezt $$2, @Nullable xe $$3) {
      fab $$4 = $$0.l().aJ();

      for (faa $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xe.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> xe.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int a(eu $$0, Collection<faa> $$1, ezt $$2, @Nullable yu $$3) {
      fab $$4 = $$0.l().aJ();

      for (faa $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xe.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.g()), true);
         } else {
            $$0.a(() -> xe.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.g()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.g()), true);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.g()), true);
      }

      return $$1.size();
   }

   private static int b(eu $$0, Collection<faa> $$1, ezt $$2, int $$3) {
      fab $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (faa $$6 : $$1) {
         ezz $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xe.a("commands.scoreboard.players.add.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(eu $$0, Collection<faa> $$1, ezt $$2, int $$3) {
      fab $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (faa $$6 : $$1) {
         ezz $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xe.a("commands.scoreboard.players.remove.success.single", $$3, $$2.g(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.g(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(eu $$0) {
      Collection<faa> $$1 = $$0.l().aJ().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> xe.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.list.success", $$1.size(), xh.b($$1, faa::he)), false);
      }

      return $$1.size();
   }

   private static int a(eu $$0, faa $$1) {
      Object2IntMap<ezt> $$2 = $$0.l().aJ().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> xe.a("commands.scoreboard.players.list.entity.empty", $$1.he()), false);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.list.entity.success", $$1.he(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> xe.a("commands.scoreboard.players.list.entity.entry", ((ezt)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(eu $$0, ezs $$1) throws CommandSyntaxException {
      fab $$2 = $$0.l().aJ();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> xe.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(eu $$0, ezs $$1, ezt $$2) throws CommandSyntaxException {
      fab $$3 = $$0.l().aJ();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xe.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(eu $$0, ezt $$1, xe $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(eu $$0, ezt $$1, boolean $$2) {
      if ($$1.e() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> xe.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.b(), $$1.g()), true);
         } else {
            $$0.a(() -> xe.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.b(), $$1.g()), true);
         }
      }

      return 0;
   }

   private static int a(eu $$0, ezt $$1, @Nullable yu $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> xe.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(eu $$0, ezt $$1, fae.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(eu $$0, ezt $$1) {
      fab $$2 = $$0.l().aJ();
      $$2.j($$1);
      $$0.a(() -> xe.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(eu $$0, String $$1, fae $$2, xe $$3) throws CommandSyntaxException {
      fab $$4 = $$0.l().aJ();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         ezt $$5 = $$4.a($$1);
         $$0.a(() -> xe.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(eu $$0) {
      Collection<ezt> $$1 = $$0.l().aJ().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> xe.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.objectives.list.success", $$1.size(), xh.b($$1, ezt::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<eu> var1, @Nullable yu var2) throws CommandSyntaxException;
   }
}
