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

public class api {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xg.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xg.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xg.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> xg.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("objectives")
                                 .then(el.a("list").executes($$0x -> b((ek)$$0x.getSource()))))
                              .then(
                                 el.a("add")
                                    .then(
                                       el.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)el.a("criteria", ff.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ek)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            ff.a($$0x, "criteria"),
                                                            xg.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   el.a("displayName", et.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ek)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               ff.a($$0x, "criteria"),
                                                               et.b($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              el.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("objective", fe.a())
                                                .then(
                                                   el.a("displayname")
                                                      .then(
                                                         el.a("displayName", et.a($$1))
                                                            .executes($$0x -> a((ek)$$0x.getSource(), fe.a($$0x, "objective"), et.b($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             el.a("displayautoupdate")
                                                .then(
                                                   el.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((ek)$$0x.getSource(), fe.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, el.a("numberformat"), ($$0x, $$1x) -> a((ek)$$0x.getSource(), fe.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(el.a("remove").then(el.a("objective", fe.a()).executes($$0x -> a((ek)$$0x.getSource(), fe.a($$0x, "objective"))))))
                     .then(
                        el.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)el.a("slot", fr.a()).executes($$0x -> a((ek)$$0x.getSource(), fr.a($$0x, "slot"))))
                                 .then(el.a("objective", fe.a()).executes($$0x -> a((ek)$$0x.getSource(), fr.a($$0x, "slot"), fe.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)el.a("list").executes($$0x -> a((ek)$$0x.getSource())))
                                                .then(el.a("target", fq.a()).suggests(fq.a).executes($$0x -> a((ek)$$0x.getSource(), fq.a($$0x, "target"))))
                                          ))
                                       .then(
                                          el.a("set")
                                             .then(
                                                el.a("targets", fq.b())
                                                   .suggests(fq.a)
                                                   .then(
                                                      el.a("objective", fe.a())
                                                         .then(
                                                            el.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ek)$$0x.getSource(),
                                                                        fq.c($$0x, "targets"),
                                                                        fe.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       el.a("get")
                                          .then(
                                             el.a("target", fq.a())
                                                .suggests(fq.a)
                                                .then(
                                                   el.a("objective", fe.a())
                                                      .executes($$0x -> a((ek)$$0x.getSource(), fq.a($$0x, "target"), fe.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    el.a("add")
                                       .then(
                                          el.a("targets", fq.b())
                                             .suggests(fq.a)
                                             .then(
                                                el.a("objective", fe.a())
                                                   .then(
                                                      el.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (ek)$$0x.getSource(),
                                                                  fq.c($$0x, "targets"),
                                                                  fe.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 el.a("remove")
                                    .then(
                                       el.a("targets", fq.b())
                                          .suggests(fq.a)
                                          .then(
                                             el.a("objective", fe.a())
                                                .then(
                                                   el.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (ek)$$0x.getSource(),
                                                               fq.c($$0x, "targets"),
                                                               fe.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              el.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)el.a("targets", fq.b())
                                          .suggests(fq.a)
                                          .executes($$0x -> a((ek)$$0x.getSource(), fq.c($$0x, "targets"))))
                                       .then(
                                          el.a("objective", fe.a()).executes($$0x -> b((ek)$$0x.getSource(), fq.c($$0x, "targets"), fe.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           el.a("enable")
                              .then(
                                 el.a("targets", fq.b())
                                    .suggests(fq.a)
                                    .then(
                                       el.a("objective", fe.a())
                                          .suggests(($$0x, $$1x) -> a((ek)$$0x.getSource(), fq.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((ek)$$0x.getSource(), fq.c($$0x, "targets"), fe.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)el.a("display")
                              .then(
                                 el.a("name")
                                    .then(
                                       el.a("targets", fq.b())
                                          .suggests(fq.a)
                                          .then(
                                             ((RequiredArgumentBuilder)el.a("objective", fe.a())
                                                   .then(
                                                      el.a("name", et.a($$1))
                                                         .executes(
                                                            $$0x -> a((ek)$$0x.getSource(), fq.c($$0x, "targets"), fe.a($$0x, "objective"), et.b($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((ek)$$0x.getSource(), fq.c($$0x, "targets"), fe.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              el.a("numberformat")
                                 .then(
                                    el.a("targets", fq.b())
                                       .suggests(fq.a)
                                       .then(
                                          a(
                                             $$1,
                                             el.a("objective", fe.a()),
                                             ($$0x, $$1x) -> a((ek)$$0x.getSource(), fq.c($$0x, "targets"), fe.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     el.a("operation")
                        .then(
                           el.a("targets", fq.b())
                              .suggests(fq.a)
                              .then(
                                 el.a("targetObjective", fe.a())
                                    .then(
                                       el.a("operation", fg.a())
                                          .then(
                                             el.a("source", fq.b())
                                                .suggests(fq.a)
                                                .then(
                                                   el.a("sourceObjective", fe.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ek)$$0x.getSource(),
                                                               fq.c($$0x, "targets"),
                                                               fe.b($$0x, "targetObjective"),
                                                               fg.a($$0x, "operation"),
                                                               fq.c($$0x, "source"),
                                                               fe.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<ek, ?> a(eg $$0, ArgumentBuilder<ek, ?> $$1, api.a $$2) {
      return $$1.then(el.a("blank").executes($$1x -> $$2.run($$1x, yu.a))).then(el.a("fixed").then(el.a("contents", et.a($$0)).executes($$1x -> {
         xg $$2x = et.b($$1x, "contents");
         return $$2.run($$1x, new yv($$2x));
      }))).then(el.a("styled").then(el.a("style", fw.a($$0)).executes($$1x -> {
         yd $$2x = fw.a($$1x, "style");
         return $$2.run($$1x, new yz($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<ek> a() {
      LiteralArgumentBuilder<ek> $$0 = el.a("rendertype");

      for (fhk.a $$1 : fhk.a.values()) {
         $$0.then(el.a($$1.a()).executes($$1x -> a((ek)$$1x.getSource(), fe.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(ek $$0, Collection<fhg> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      fhh $$4 = $$0.l().aJ();

      for (fgz $$5 : $$4.b()) {
         if ($$5.d() == fhk.d) {
            boolean $$6 = false;

            for (fhg $$7 : $$1) {
               fhd $$8 = $$4.d($$7, $$5);
               if ($$8 == null || $$8.b()) {
                  $$6 = true;
                  break;
               }
            }

            if ($$6) {
               $$3.add($$5.c());
            }
         }
      }

      return ep.b($$3, $$2);
   }

   private static int a(ek $$0, fhg $$1, fgz $$2) throws CommandSyntaxException {
      fhh $$3 = $$0.l().aJ();
      fhd $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.c(), $$1.hg());
      } else {
         $$0.a(() -> xg.a("commands.scoreboard.players.get.success", $$1.hg(), $$4.a(), $$2.h()), false);
         return $$4.a();
      }
   }

   private static xg a(Collection<fhg> $$0) {
      return $$0.iterator().next().hg();
   }

   private static int a(ek $$0, Collection<fhg> $$1, fgz $$2, fg.a $$3, Collection<fhg> $$4, fgz $$5) throws CommandSyntaxException {
      fhh $$6 = $$0.l().aJ();
      int $$7 = 0;

      for (fhg $$8 : $$1) {
         fhf $$9 = $$6.c($$8, $$2);

         for (fhg $$10 : $$4) {
            fhf $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> xg.a("commands.scoreboard.players.operation.success.single", $$2.h(), a($$1), $$12), true);
      } else {
         $$0.a(() -> xg.a("commands.scoreboard.players.operation.success.multiple", $$2.h(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(ek $$0, Collection<fhg> $$1, fgz $$2) throws CommandSyntaxException {
      if ($$2.d() != fhk.d) {
         throw e.create();
      } else {
         fhh $$3 = $$0.l().aJ();
         int $$4 = 0;

         for (fhg $$5 : $$1) {
            fhf $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xg.a("commands.scoreboard.players.enable.success.single", $$2.h(), a($$1)), true);
            } else {
               $$0.a(() -> xg.a("commands.scoreboard.players.enable.success.multiple", $$2.h(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(ek $$0, Collection<fhg> $$1) {
      fhh $$2 = $$0.l().aJ();

      for (fhg $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xg.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> xg.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ek $$0, Collection<fhg> $$1, fgz $$2) {
      fhh $$3 = $$0.l().aJ();

      for (fhg $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xg.a("commands.scoreboard.players.reset.specific.single", $$2.h(), a($$1)), true);
      } else {
         $$0.a(() -> xg.a("commands.scoreboard.players.reset.specific.multiple", $$2.h(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, Collection<fhg> $$1, fgz $$2, int $$3) {
      fhh $$4 = $$0.l().aJ();

      for (fhg $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xg.a("commands.scoreboard.players.set.success.single", $$2.h(), a($$1), $$3), true);
      } else {
         $$0.a(() -> xg.a("commands.scoreboard.players.set.success.multiple", $$2.h(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(ek $$0, Collection<fhg> $$1, fgz $$2, @Nullable xg $$3) {
      fhh $$4 = $$0.l().aJ();

      for (fhg $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xg.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.h()), true);
         } else {
            $$0.a(() -> xg.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.h()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xg.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.h()), true);
      } else {
         $$0.a(() -> xg.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.h()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, Collection<fhg> $$1, fgz $$2, @Nullable yw $$3) {
      fhh $$4 = $$0.l().aJ();

      for (fhg $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> xg.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.h()), true);
         } else {
            $$0.a(() -> xg.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.h()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> xg.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.h()), true);
      } else {
         $$0.a(() -> xg.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.h()), true);
      }

      return $$1.size();
   }

   private static int b(ek $$0, Collection<fhg> $$1, fgz $$2, int $$3) {
      fhh $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fhg $$6 : $$1) {
         fhf $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xg.a("commands.scoreboard.players.add.success.single", $$3, $$2.h(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xg.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.h(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(ek $$0, Collection<fhg> $$1, fgz $$2, int $$3) {
      fhh $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fhg $$6 : $$1) {
         fhf $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> xg.a("commands.scoreboard.players.remove.success.single", $$3, $$2.h(), a($$1), $$8), true);
      } else {
         $$0.a(() -> xg.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.h(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(ek $$0) {
      Collection<fhg> $$1 = $$0.l().aJ().d();
      if ($$1.isEmpty()) {
         $$0.a(() -> xg.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> xg.a("commands.scoreboard.players.list.success", $$1.size(), xj.b($$1, fhg::hg)), false);
      }

      return $$1.size();
   }

   private static int a(ek $$0, fhg $$1) {
      Object2IntMap<fgz> $$2 = $$0.l().aJ().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> xg.a("commands.scoreboard.players.list.entity.empty", $$1.hg()), false);
      } else {
         $$0.a(() -> xg.a("commands.scoreboard.players.list.entity.success", $$1.hg(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> xg.a("commands.scoreboard.players.list.entity.entry", ((fgz)$$1x.getKey()).h(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(ek $$0, fgy $$1) throws CommandSyntaxException {
      fhh $$2 = $$0.l().aJ();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> xg.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fgy $$1, fgz $$2) throws CommandSyntaxException {
      fhh $$3 = $$0.l().aJ();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> xg.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.e()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fgz $$1, xg $$2) {
      if (!$$1.e().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> xg.a("commands.scoreboard.objectives.modify.displayname", $$1.c(), $$1.h()), true);
      }

      return 0;
   }

   private static int a(ek $$0, fgz $$1, boolean $$2) {
      if ($$1.f() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> xg.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.c(), $$1.h()), true);
         } else {
            $$0.a(() -> xg.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.c(), $$1.h()), true);
         }
      }

      return 0;
   }

   private static int a(ek $$0, fgz $$1, @Nullable yw $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> xg.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.c()), true);
      } else {
         $$0.a(() -> xg.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.c()), true);
      }

      return 0;
   }

   private static int a(ek $$0, fgz $$1, fhk.a $$2) {
      if ($$1.i() != $$2) {
         $$1.a($$2);
         $$0.a(() -> xg.a("commands.scoreboard.objectives.modify.rendertype", $$1.h()), true);
      }

      return 0;
   }

   private static int a(ek $$0, fgz $$1) {
      fhh $$2 = $$0.l().aJ();
      $$2.j($$1);
      $$0.a(() -> xg.a("commands.scoreboard.objectives.remove.success", $$1.h()), true);
      return $$2.b().size();
   }

   private static int a(ek $$0, String $$1, fhk $$2, xg $$3) throws CommandSyntaxException {
      fhh $$4 = $$0.l().aJ();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         fgz $$5 = $$4.a($$1);
         $$0.a(() -> xg.a("commands.scoreboard.objectives.add.success", $$5.h()), true);
         return $$4.b().size();
      }
   }

   private static int b(ek $$0) {
      Collection<fgz> $$1 = $$0.l().aJ().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> xg.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> xg.a("commands.scoreboard.objectives.list.success", $$1.size(), xj.b($$1, fgz::h)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<ek> var1, @Nullable yw var2) throws CommandSyntaxException;
   }
}
