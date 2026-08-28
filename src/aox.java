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

public class aox {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.scoreboard.objectives.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.scoreboard.objectives.display.alreadyEmpty"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.c("commands.scoreboard.objectives.display.alreadySet"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wy.c("commands.scoreboard.players.enable.failed"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wy.c("commands.scoreboard.players.enable.invalid"));
   private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("commands.scoreboard.players.get.null", $$0, $$1));

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("scoreboard").requires($$0x -> $$0x.c(2)))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("objectives")
                                 .then(ek.a("list").executes($$0x -> b((ej)$$0x.getSource()))))
                              .then(
                                 ek.a("add")
                                    .then(
                                       ek.a("objective", StringArgumentType.word())
                                          .then(
                                             ((RequiredArgumentBuilder)ek.a("criteria", fe.a())
                                                   .executes(
                                                      $$0x -> a(
                                                            (ej)$$0x.getSource(),
                                                            StringArgumentType.getString($$0x, "objective"),
                                                            fe.a($$0x, "criteria"),
                                                            wy.b(StringArgumentType.getString($$0x, "objective"))
                                                         )
                                                   ))
                                                .then(
                                                   ek.a("displayName", es.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ej)$$0x.getSource(),
                                                               StringArgumentType.getString($$0x, "objective"),
                                                               fe.a($$0x, "criteria"),
                                                               es.b($$0x, "displayName")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ek.a("modify")
                                 .then(
                                    ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("objective", fd.a())
                                                .then(
                                                   ek.a("displayname")
                                                      .then(
                                                         ek.a("displayName", es.a($$1))
                                                            .executes($$0x -> a((ej)$$0x.getSource(), fd.a($$0x, "objective"), es.b($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(a()))
                                          .then(
                                             ek.a("displayautoupdate")
                                                .then(
                                                   ek.a("value", BoolArgumentType.bool())
                                                      .executes(
                                                         $$0x -> a((ej)$$0x.getSource(), fd.a($$0x, "objective"), BoolArgumentType.getBool($$0x, "value"))
                                                      )
                                                )
                                          ))
                                       .then(a($$1, ek.a("numberformat"), ($$0x, $$1x) -> a((ej)$$0x.getSource(), fd.a($$0x, "objective"), $$1x)))
                                 )
                           ))
                        .then(ek.a("remove").then(ek.a("objective", fd.a()).executes($$0x -> a((ej)$$0x.getSource(), fd.a($$0x, "objective"))))))
                     .then(
                        ek.a("setdisplay")
                           .then(
                              ((RequiredArgumentBuilder)ek.a("slot", fq.a()).executes($$0x -> a((ej)$$0x.getSource(), fq.a($$0x, "slot"))))
                                 .then(ek.a("objective", fd.a()).executes($$0x -> a((ej)$$0x.getSource(), fq.a($$0x, "slot"), fd.a($$0x, "objective"))))
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a(
                                             "players"
                                          )
                                          .then(
                                             ((LiteralArgumentBuilder)ek.a("list").executes($$0x -> a((ej)$$0x.getSource())))
                                                .then(ek.a("target", fp.a()).suggests(fp.a).executes($$0x -> a((ej)$$0x.getSource(), fp.a($$0x, "target"))))
                                          ))
                                       .then(
                                          ek.a("set")
                                             .then(
                                                ek.a("targets", fp.b())
                                                   .suggests(fp.a)
                                                   .then(
                                                      ek.a("objective", fd.a())
                                                         .then(
                                                            ek.a("score", IntegerArgumentType.integer())
                                                               .executes(
                                                                  $$0x -> a(
                                                                        (ej)$$0x.getSource(),
                                                                        fp.c($$0x, "targets"),
                                                                        fd.b($$0x, "objective"),
                                                                        IntegerArgumentType.getInteger($$0x, "score")
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ek.a("get")
                                          .then(
                                             ek.a("target", fp.a())
                                                .suggests(fp.a)
                                                .then(
                                                   ek.a("objective", fd.a())
                                                      .executes($$0x -> a((ej)$$0x.getSource(), fp.a($$0x, "target"), fd.a($$0x, "objective")))
                                                )
                                          )
                                    ))
                                 .then(
                                    ek.a("add")
                                       .then(
                                          ek.a("targets", fp.b())
                                             .suggests(fp.a)
                                             .then(
                                                ek.a("objective", fd.a())
                                                   .then(
                                                      ek.a("score", IntegerArgumentType.integer(0))
                                                         .executes(
                                                            $$0x -> b(
                                                                  (ej)$$0x.getSource(),
                                                                  fp.c($$0x, "targets"),
                                                                  fd.b($$0x, "objective"),
                                                                  IntegerArgumentType.getInteger($$0x, "score")
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ek.a("remove")
                                    .then(
                                       ek.a("targets", fp.b())
                                          .suggests(fp.a)
                                          .then(
                                             ek.a("objective", fd.a())
                                                .then(
                                                   ek.a("score", IntegerArgumentType.integer(0))
                                                      .executes(
                                                         $$0x -> c(
                                                               (ej)$$0x.getSource(),
                                                               fp.c($$0x, "targets"),
                                                               fd.b($$0x, "objective"),
                                                               IntegerArgumentType.getInteger($$0x, "score")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ek.a("reset")
                                 .then(
                                    ((RequiredArgumentBuilder)ek.a("targets", fp.b())
                                          .suggests(fp.a)
                                          .executes($$0x -> a((ej)$$0x.getSource(), fp.c($$0x, "targets"))))
                                       .then(
                                          ek.a("objective", fd.a()).executes($$0x -> b((ej)$$0x.getSource(), fp.c($$0x, "targets"), fd.a($$0x, "objective")))
                                       )
                                 )
                           ))
                        .then(
                           ek.a("enable")
                              .then(
                                 ek.a("targets", fp.b())
                                    .suggests(fp.a)
                                    .then(
                                       ek.a("objective", fd.a())
                                          .suggests(($$0x, $$1x) -> a((ej)$$0x.getSource(), fp.c($$0x, "targets"), $$1x))
                                          .executes($$0x -> a((ej)$$0x.getSource(), fp.c($$0x, "targets"), fd.a($$0x, "objective")))
                                    )
                              )
                        ))
                     .then(
                        ((LiteralArgumentBuilder)ek.a("display")
                              .then(
                                 ek.a("name")
                                    .then(
                                       ek.a("targets", fp.b())
                                          .suggests(fp.a)
                                          .then(
                                             ((RequiredArgumentBuilder)ek.a("objective", fd.a())
                                                   .then(
                                                      ek.a("name", es.a($$1))
                                                         .executes(
                                                            $$0x -> a((ej)$$0x.getSource(), fp.c($$0x, "targets"), fd.a($$0x, "objective"), es.b($$0x, "name"))
                                                         )
                                                   ))
                                                .executes($$0x -> a((ej)$$0x.getSource(), fp.c($$0x, "targets"), fd.a($$0x, "objective"), null))
                                          )
                                    )
                              ))
                           .then(
                              ek.a("numberformat")
                                 .then(
                                    ek.a("targets", fp.b())
                                       .suggests(fp.a)
                                       .then(
                                          a(
                                             $$1,
                                             ek.a("objective", fd.a()),
                                             ($$0x, $$1x) -> a((ej)$$0x.getSource(), fp.c($$0x, "targets"), fd.a($$0x, "objective"), $$1x)
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     ek.a("operation")
                        .then(
                           ek.a("targets", fp.b())
                              .suggests(fp.a)
                              .then(
                                 ek.a("targetObjective", fd.a())
                                    .then(
                                       ek.a("operation", ff.a())
                                          .then(
                                             ek.a("source", fp.b())
                                                .suggests(fp.a)
                                                .then(
                                                   ek.a("sourceObjective", fd.a())
                                                      .executes(
                                                         $$0x -> a(
                                                               (ej)$$0x.getSource(),
                                                               fp.c($$0x, "targets"),
                                                               fd.b($$0x, "targetObjective"),
                                                               ff.a($$0x, "operation"),
                                                               fp.c($$0x, "source"),
                                                               fd.a($$0x, "sourceObjective")
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

   private static ArgumentBuilder<ej, ?> a(ef $$0, ArgumentBuilder<ej, ?> $$1, aox.a $$2) {
      return $$1.then(ek.a("blank").executes($$1x -> $$2.run($$1x, ym.a))).then(ek.a("fixed").then(ek.a("contents", es.a($$0)).executes($$1x -> {
         wy $$2x = es.b($$1x, "contents");
         return $$2.run($$1x, new yn($$2x));
      }))).then(ek.a("styled").then(ek.a("style", fv.a($$0)).executes($$1x -> {
         xv $$2x = fv.a($$1x, "style");
         return $$2.run($$1x, new yr($$2x));
      }))).executes($$1x -> $$2.run($$1x, null));
   }

   private static LiteralArgumentBuilder<ej> a() {
      LiteralArgumentBuilder<ej> $$0 = ek.a("rendertype");

      for (fgk.a $$1 : fgk.a.values()) {
         $$0.then(ek.a($$1.a()).executes($$1x -> a((ej)$$1x.getSource(), fd.a($$1x, "objective"), $$1)));
      }

      return $$0;
   }

   private static CompletableFuture<Suggestions> a(ej $$0, Collection<fgg> $$1, SuggestionsBuilder $$2) {
      List<String> $$3 = Lists.newArrayList();
      fgh $$4 = $$0.l().aJ();

      for (ffz $$5 : $$4.b()) {
         if ($$5.d() == fgk.d) {
            boolean $$6 = false;

            for (fgg $$7 : $$1) {
               fgd $$8 = $$4.d($$7, $$5);
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

      return eo.b($$3, $$2);
   }

   private static int a(ej $$0, fgg $$1, ffz $$2) throws CommandSyntaxException {
      fgh $$3 = $$0.l().aJ();
      fgd $$4 = $$3.d($$1, $$2);
      if ($$4 == null) {
         throw f.create($$2.c(), $$1.hf());
      } else {
         $$0.a(() -> wy.a("commands.scoreboard.players.get.success", $$1.hf(), $$4.a(), $$2.h()), false);
         return $$4.a();
      }
   }

   private static wy a(Collection<fgg> $$0) {
      return $$0.iterator().next().hf();
   }

   private static int a(ej $$0, Collection<fgg> $$1, ffz $$2, ff.a $$3, Collection<fgg> $$4, ffz $$5) throws CommandSyntaxException {
      fgh $$6 = $$0.l().aJ();
      int $$7 = 0;

      for (fgg $$8 : $$1) {
         fgf $$9 = $$6.c($$8, $$2);

         for (fgg $$10 : $$4) {
            fgf $$11 = $$6.c($$10, $$5);
            $$3.apply($$9, $$11);
         }

         $$7 += $$9.a();
      }

      if ($$1.size() == 1) {
         int $$12 = $$7;
         $$0.a(() -> wy.a("commands.scoreboard.players.operation.success.single", $$2.h(), a($$1), $$12), true);
      } else {
         $$0.a(() -> wy.a("commands.scoreboard.players.operation.success.multiple", $$2.h(), $$1.size()), true);
      }

      return $$7;
   }

   private static int a(ej $$0, Collection<fgg> $$1, ffz $$2) throws CommandSyntaxException {
      if ($$2.d() != fgk.d) {
         throw e.create();
      } else {
         fgh $$3 = $$0.l().aJ();
         int $$4 = 0;

         for (fgg $$5 : $$1) {
            fgf $$6 = $$3.c($$5, $$2);
            if ($$6.d()) {
               $$6.e();
               $$4++;
            }
         }

         if ($$4 == 0) {
            throw d.create();
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> wy.a("commands.scoreboard.players.enable.success.single", $$2.h(), a($$1)), true);
            } else {
               $$0.a(() -> wy.a("commands.scoreboard.players.enable.success.multiple", $$2.h(), $$1.size()), true);
            }

            return $$4;
         }
      }
   }

   private static int a(ej $$0, Collection<fgg> $$1) {
      fgh $$2 = $$0.l().aJ();

      for (fgg $$3 : $$1) {
         $$2.b($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.scoreboard.players.reset.all.single", a($$1)), true);
      } else {
         $$0.a(() -> wy.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int b(ej $$0, Collection<fgg> $$1, ffz $$2) {
      fgh $$3 = $$0.l().aJ();

      for (fgg $$4 : $$1) {
         $$3.e($$4, $$2);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.scoreboard.players.reset.specific.single", $$2.h(), a($$1)), true);
      } else {
         $$0.a(() -> wy.a("commands.scoreboard.players.reset.specific.multiple", $$2.h(), $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ej $$0, Collection<fgg> $$1, ffz $$2, int $$3) {
      fgh $$4 = $$0.l().aJ();

      for (fgg $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.scoreboard.players.set.success.single", $$2.h(), a($$1), $$3), true);
      } else {
         $$0.a(() -> wy.a("commands.scoreboard.players.set.success.multiple", $$2.h(), $$1.size(), $$3), true);
      }

      return $$3 * $$1.size();
   }

   private static int a(ej $$0, Collection<fgg> $$1, ffz $$2, @Nullable wy $$3) {
      fgh $$4 = $$0.l().aJ();

      for (fgg $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> wy.a("commands.scoreboard.players.display.name.clear.success.single", a($$1), $$2.h()), true);
         } else {
            $$0.a(() -> wy.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.h()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.scoreboard.players.display.name.set.success.single", $$3, a($$1), $$2.h()), true);
      } else {
         $$0.a(() -> wy.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.h()), true);
      }

      return $$1.size();
   }

   private static int a(ej $$0, Collection<fgg> $$1, ffz $$2, @Nullable yo $$3) {
      fgh $$4 = $$0.l().aJ();

      for (fgg $$5 : $$1) {
         $$4.c($$5, $$2).a($$3);
      }

      if ($$3 == null) {
         if ($$1.size() == 1) {
            $$0.a(() -> wy.a("commands.scoreboard.players.display.numberFormat.clear.success.single", a($$1), $$2.h()), true);
         } else {
            $$0.a(() -> wy.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.h()), true);
         }
      } else if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.scoreboard.players.display.numberFormat.set.success.single", a($$1), $$2.h()), true);
      } else {
         $$0.a(() -> wy.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.h()), true);
      }

      return $$1.size();
   }

   private static int b(ej $$0, Collection<fgg> $$1, ffz $$2, int $$3) {
      fgh $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fgg $$6 : $$1) {
         fgf $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() + $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> wy.a("commands.scoreboard.players.add.success.single", $$3, $$2.h(), a($$1), $$8), true);
      } else {
         $$0.a(() -> wy.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.h(), $$1.size()), true);
      }

      return $$5;
   }

   private static int c(ej $$0, Collection<fgg> $$1, ffz $$2, int $$3) {
      fgh $$4 = $$0.l().aJ();
      int $$5 = 0;

      for (fgg $$6 : $$1) {
         fgf $$7 = $$4.c($$6, $$2);
         $$7.a($$7.a() - $$3);
         $$5 += $$7.a();
      }

      if ($$1.size() == 1) {
         int $$8 = $$5;
         $$0.a(() -> wy.a("commands.scoreboard.players.remove.success.single", $$3, $$2.h(), a($$1), $$8), true);
      } else {
         $$0.a(() -> wy.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.h(), $$1.size()), true);
      }

      return $$5;
   }

   private static int a(ej $$0) {
      Collection<fgg> $$1 = $$0.l().aJ().d();
      if ($$1.isEmpty()) {
         $$0.a(() -> wy.c("commands.scoreboard.players.list.empty"), false);
      } else {
         $$0.a(() -> wy.a("commands.scoreboard.players.list.success", $$1.size(), xb.b($$1, fgg::hf)), false);
      }

      return $$1.size();
   }

   private static int a(ej $$0, fgg $$1) {
      Object2IntMap<ffz> $$2 = $$0.l().aJ().c($$1);
      if ($$2.isEmpty()) {
         $$0.a(() -> wy.a("commands.scoreboard.players.list.entity.empty", $$1.hf()), false);
      } else {
         $$0.a(() -> wy.a("commands.scoreboard.players.list.entity.success", $$1.hf(), $$2.size()), false);
         Object2IntMaps.fastForEach(
            $$2, $$1x -> $$0.a(() -> wy.a("commands.scoreboard.players.list.entity.entry", ((ffz)$$1x.getKey()).h(), $$1x.getIntValue()), false)
         );
      }

      return $$2.size();
   }

   private static int a(ej $$0, ffy $$1) throws CommandSyntaxException {
      fgh $$2 = $$0.l().aJ();
      if ($$2.a($$1) == null) {
         throw b.create();
      } else {
         $$2.a($$1, null);
         $$0.a(() -> wy.a("commands.scoreboard.objectives.display.cleared", $$1.c()), true);
         return 0;
      }
   }

   private static int a(ej $$0, ffy $$1, ffz $$2) throws CommandSyntaxException {
      fgh $$3 = $$0.l().aJ();
      if ($$3.a($$1) == $$2) {
         throw c.create();
      } else {
         $$3.a($$1, $$2);
         $$0.a(() -> wy.a("commands.scoreboard.objectives.display.set", $$1.c(), $$2.e()), true);
         return 0;
      }
   }

   private static int a(ej $$0, ffz $$1, wy $$2) {
      if (!$$1.e().equals($$2)) {
         $$1.a($$2);
         $$0.a(() -> wy.a("commands.scoreboard.objectives.modify.displayname", $$1.c(), $$1.h()), true);
      }

      return 0;
   }

   private static int a(ej $$0, ffz $$1, boolean $$2) {
      if ($$1.f() != $$2) {
         $$1.a($$2);
         if ($$2) {
            $$0.a(() -> wy.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", $$1.c(), $$1.h()), true);
         } else {
            $$0.a(() -> wy.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", $$1.c(), $$1.h()), true);
         }
      }

      return 0;
   }

   private static int a(ej $$0, ffz $$1, @Nullable yo $$2) {
      $$1.b($$2);
      if ($$2 != null) {
         $$0.a(() -> wy.a("commands.scoreboard.objectives.modify.objectiveFormat.set", $$1.c()), true);
      } else {
         $$0.a(() -> wy.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", $$1.c()), true);
      }

      return 0;
   }

   private static int a(ej $$0, ffz $$1, fgk.a $$2) {
      if ($$1.i() != $$2) {
         $$1.a($$2);
         $$0.a(() -> wy.a("commands.scoreboard.objectives.modify.rendertype", $$1.h()), true);
      }

      return 0;
   }

   private static int a(ej $$0, ffz $$1) {
      fgh $$2 = $$0.l().aJ();
      $$2.j($$1);
      $$0.a(() -> wy.a("commands.scoreboard.objectives.remove.success", $$1.h()), true);
      return $$2.b().size();
   }

   private static int a(ej $$0, String $$1, fgk $$2, wy $$3) throws CommandSyntaxException {
      fgh $$4 = $$0.l().aJ();
      if ($$4.a($$1) != null) {
         throw a.create();
      } else {
         $$4.a($$1, $$2, $$3, $$2.f(), false, null);
         ffz $$5 = $$4.a($$1);
         $$0.a(() -> wy.a("commands.scoreboard.objectives.add.success", $$5.h()), true);
         return $$4.b().size();
      }
   }

   private static int b(ej $$0) {
      Collection<ffz> $$1 = $$0.l().aJ().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> wy.c("commands.scoreboard.objectives.list.empty"), false);
      } else {
         $$0.a(() -> wy.a("commands.scoreboard.objectives.list.success", $$1.size(), xb.b($$1, ffz::h)), false);
      }

      return $$1.size();
   }

   @FunctionalInterface
   public interface a {
      int run(CommandContext<ej> var1, @Nullable yo var2) throws CommandSyntaxException;
   }
}
