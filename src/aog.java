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

public class aog {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xe.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("objectives")
                                 .then(ei.a("list").executes($$0x -> b((eh)$$0x.getSource()))))
                              .then(
                                 ei.a("add")
                                    .then(
                                       ei.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)ei.a("criteria", fc.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (eh)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            fc.a($$0x, "criteria"),
                                                            xe.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   ei.a("displayName", eq.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (eh)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               fc.a($$0x, "criteria"),
                                                               eq.a($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ei.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("objective", fb.a())
                                                .then(
                                                   ei.a("displayname")
                                                      .then(
                                                         ei.a("displayName", eq.a($$1))
                                                            .executes($$0x -> a((eh)$$0x.getSource(), fb.a($$0x, "objective"), eq.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             ei.a("displayautoupdate")
                                                .then(
                                                   ei.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((eh)$$0x.getSource(), fb.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, ei.a("numberformat"), ($$0x, $$1x) -> a((eh)$$0x.getSource(), fb.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(ei.a("remove").then(ei.a("objective", fb.a()).executes($$0x -> a((eh)$$0x.getSource(), fb.a($$0x, "objective"))))))
                     .then(
                        ei.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)ei.a("slot", fn.a()).executes($$0x -> a((eh)$$0x.getSource(), fn.a($$0x, "slot"))))
                                 .then(ei.a("objective", fb.a()).executes($$0x -> a((eh)$$0x.getSource(), fn.a($$0x, "slot"), fb.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)ei.a("list").executes($$0x -> a((eh)$$0x.getSource())))
                                                .then(ei.a("target", fm.a()).suggests(fm.a).executes($$0x -> a((eh)$$0x.getSource(), fm.a($$0x, "target"))))
                                          ))
                                       .then(
                                          ei.a("set")
                                             .then(
                                                ei.a("targets", fm.b())
                                                   .suggests(fm.a)
                                                   .then(
                                                      ei.a("objective", fb.a())
                                                         .then(
                                                            ei.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (eh)$$0x.getSource(),
                                                                        fm.c($$0x, "targets"),
                                                                        fb.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ei.a("get")
                                          .then(
                                             ei.a("target", fm.a())
                                                .suggests(fm.a)
                                                .then(
                                                   ei.a("objective", fb.a())
                                                      .executes($$0x -> a((eh)$$0x.getSource(), fm.a($$0x, "target"), fb.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    ei.a("add")
                                       .then(
                                          ei.a("targets", fm.b())
                                             .suggests(fm.a)
                                             .then(
                                                ei.a("objective", fb.a())
                                                   .then(
                                                      ei.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (eh)$$0x.getSource(),
                                                                  fm.c($$0x, "targets"),
                                                                  fb.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ei.a("remove")
                                    .then(
                                       ei.a("targets", fm.b())
                                          .suggests(fm.a)
                                          .then(
                                             ei.a("objective", fb.a())
                                                .then(
                                                   ei.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (eh)$$0x.getSource(),
                                                               fm.c($$0x, "targets"),
                                                               fb.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ei.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)ei.a("targets", fm.b())
                                          .suggests(fm.a)
                                          .executes($$0x -> a((eh)$$0x.getSource(), fm.c($$0x, "targets"))))
                                       .then(
                                          ei.a("objective", fb.a()).executes($$0x -> b((eh)$$0x.getSource(), fm.c($$0x, "targets"), fb.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           ei.a("enable")
                              .then(
                                 ei.a("targets", fm.b())
                                    .suggests(fm.a)
                                    .then(
                                       ei.a("objective", fb.a())
                                          .suggests(($$0x, $$1x) -> a((eh)$$0x.getSource(), fm.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((eh)$$0x.getSource(), fm.c($$0x, "targets"), fb.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)ei.a("display")
                              .then(
                                 ei.a("name")
                                    .then(
                                       ei.a("targets", fm.b())
                                          .suggests(fm.a)
                                          .then(
                                             ((RequiredArgumentBuilder)ei.a("objective", fb.a())
                                                   .then(
                                                      ei.a("name", eq.a($$1))
                                                         .executes(
                                                            $$0x -> a((eh)$$0x.getSource(), fm.c($$0x, "targets"), fb.a($$0x, "objective"), eq.a($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((eh)$$0x.getSource(), fm.c($$0x, "targets"), fb.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              ei.a("numberformat")
                                 .then(
                                    ei.a("targets", fm.b())
                                       .suggests(fm.a)
                                       .then(
                                          a(
                                             $$1,
                                             ei.a("objective", fb.a()),
                                             ($$0x, $$1x) -> a((eh)$$0x.getSource(), fm.c($$0x, "targets"), fb.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     ei.a("operation")
                        .then(
                           ei.a("targets", fm.b())
                              .suggests(fm.a)
                              .then(
                                 ei.a("targetObjective", fb.a())
                                    .then(
                                       ei.a("operation", fd.a())
                                          .then(
                                             ei.a("source", fm.b())
                                                .suggests(fm.a)
                                                .then(
                                                   ei.a("sourceObjective", fb.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (eh)$$0x.getSource(),
                                                               fm.c($$0x, "targets"),
                                                               fb.b($$0x, "targetObjective"),
                                                               fd.a($$0x, "operation"),
                                                               fm.c($$0x, "source"),
                                                               fb.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<eh, ?> a(ed $$0, ArgumentBuilder<eh, ?> $$1, aog.a $$2) {
      return $$1.then(ei.a("blank").executes($$1x -> $$2.run($$1x, ys.a))).then(ei.a("fixed").then(ei.a("contents", eq.a($$0)).executes($$1x -> {
         xe $$2x = eq.a($$1x, "contents");
         return $$2.run($$1x, new yt($$2x));
      }))).then(ei.a("styled").then(ei.a("style", fs.a($$0)).executes($$1x -> {
         yb $$2x = fs.a($$1x, "style");
         return $$2.run($$1x, new yx($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<eh> a() {
      LiteralArgumentBuilder<eh> $$0 = ei.a("rendertype");

      for (eyb.a $$1 : eyb.a.values()) {
         $$0.then(ei.a($$1.a()).executes($$1x -> a((eh)$$1x.getSource(), fb.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(eh $$0, Collection<exx> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      exy $$4 = $$0.l().aK();

      for (exq $$5 : $$4.c()) {
         if ($$5.c() == eyb.c) {
            boolean $$6 = false;

            for (exx $$7 : $$1) {
               exu $$8 = $$4.d($$7, $$5);
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

      return em.b($$3, $$2);
   }

   private static int a(eh $$0, exx $$1, exq $$2) throws CommandSyntaxException {
      exy $$3 = $$0.l().aK();
      exu $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.b(), $$1.hm());
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.get.success", $$1.hm(), $$4.a(), $$2.g()), false);
         return $$4.a();
      }
   }

   private static xe a(Collection<exx> $$0) {
      return $$0.iterator().next().hm();
   }

   private static int a(eh $$0, Collection<exx> $$1, exq $$2, fd.a $$3, Collection<exx> $$4, exq $$5) throws CommandSyntaxException {
      exy $$6 = $$0.l().aK();
      int $$7 = 0;

      for (exx $$8 : $$1) {
         exw $$9 = $$6.c($$8, $$2);

         for (exx $$10 : $$4) {
            exw $$11 = $$6.c($$10, $$5);
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

   private static int a(eh $$0, Collection<exx> $$1, exq $$2) throws CommandSyntaxException {
      if ($$2.c() != eyb.c) {
         throw e.create();
      } else {
         exy $$3 = $$0.l().aK();
         int $$4 = 0;

         for (exx $$5 : $$1) {
            exw $$6 = $$3.c($$5, $$2);
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

   private static int a(eh $$0, Collection<exx> $$1) {
      exy $$2 = $$0.l().aK();

      for (exx $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(eh $$0, Collection<exx> $$1, exq $$2) {
      exy $$3 = $$0.l().aK();

      for (exx $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.scoreboard.players.reset.specific.single", $$2.g(), a($$1)), true);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.reset.specific.multiple", $$2.g(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eh $$0, Collection<exx> $$1, exq $$2, int $$3) {
      exy $$4 = $$0.l().aK();

      for (exx $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.scoreboard.players.set.success.single", $$2.g(), a($$1), $$3), true);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.set.success.multiple", $$2.g(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(eh $$0, Collection<exx> $$1, exq $$2, @Nullable xe $$3) {
      exy $$4 = $$0.l().aK();

      for (exx $$5 : $$1) {
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

   private static int a(eh $$0, Collection<exx> $$1, exq $$2, @Nullable yu $$3) {
      exy $$4 = $$0.l().aK();

      for (exx $$5 : $$1) {
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

   private static int b(eh $$0, Collection<exx> $$1, exq $$2, int $$3) {
      exy $$4 = $$0.l().aK();
      int $$5 = 0;

      for (exx $$6 : $$1) {
         exw $$7 = $$4.c($$6, $$2);
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

   private static int c(eh $$0, Collection<exx> $$1, exq $$2, int $$3) {
      exy $$4 = $$0.l().aK();
      int $$5 = 0;

      for (exx $$6 : $$1) {
         exw $$7 = $$4.c($$6, $$2);
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

   private static int a(eh $$0) {
      Collection<exx> $$1 = $$0.l().aK().e();
      if ($$1.isEmpty()) {
         $$0.a(() -> xe.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.list.success", $$1.size(), xh.b($$1, exx::hm)), false);
      }

      return $$1.size();
   }

   private static int a(eh $$0, exx $$1) {
      Object2IntMap<exq> $$2 = $$0.l().aK().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> xe.a("commands.scoreboard.players.list.entity.empty", $$1.hm()), false);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.players.list.entity.success", $$1.hm(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> xe.a("commands.scoreboard.players.list.entity.entry", ((exq)$$1x.getKey()).g(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(eh $$0, exp $$1) throws CommandSyntaxException {
      exy $$2 = $$0.l().aK();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> xe.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(eh $$0, exp $$1, exq $$2) throws CommandSyntaxException {
      exy $$3 = $$0.l().aK();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xe.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.d()), true);
         return 0;
      }
   }

   private static int a(eh $$0, exq $$1, xe $$2) {
      if (!$$1.d().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.scoreboard.objectives.modify.displayname", $$1.b(), $$1.g()), true);
      }

      return 0;
   }

   private static int a(eh $$0, exq $$1, boolean $$2) {
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

   private static int a(eh $$0, exq $$1, @Nullable yu $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> xe.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.b()), true);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.b()), true);
      }

      return 0;
   }

   private static int a(eh $$0, exq $$1, eyb.a $$2) {
      if ($$1.h() != $$2) {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.scoreboard.objectives.modify.rendertype", $$1.g()), true);
      }

      return 0;
   }

   private static int a(eh $$0, exq $$1) {
      exy $$2 = $$0.l().aK();
      $$2.j($$1);
      $$0.a(() -> xe.a("commands.scoreboard.objectives.remove.success", $$1.g()), true);
      return $$2.c().size();
   }

   private static int a(eh $$0, String $$1, eyb $$2, xe $$3) throws CommandSyntaxException {
      exy $$4 = $$0.l().aK();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         exq $$5 = $$4.a($$1);
         $$0.a(() -> xe.a("commands.scoreboard.objectives.add.success", $$5.g()), true);
         return $$4.c().size();
      }
   }

   private static int b(eh $$0) {
      Collection<exq> $$1 = $$0.l().aK().c();
      if ($$1.isEmpty()) {
         $$0.a(() -> xe.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> xe.a("commands.scoreboard.objectives.list.success", $$1.size(), xh.b($$1, exq::g)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<eh> var1, @Nullable yu var2) throws CommandSyntaxException;
   }
}
