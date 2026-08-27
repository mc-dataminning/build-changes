import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;

public class aks {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vb.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vb.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vb.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vb.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(vb.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(vb.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(vb.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(vb.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(vb.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(vb.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)dt.a("list").executes($$0x -> a((ds)$$0x.getSource())))
                                    .then(dt.a("team", fa.a()).executes($$0x -> c((ds)$$0x.getSource(), fa.a($$0x, "team"))))
                              ))
                           .then(
                              dt.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)dt.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          dt.a("displayName", ea.a())
                                             .executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), ea.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(dt.a("remove").then(dt.a("team", fa.a()).executes($$0x -> b((ds)$$0x.getSource(), fa.a($$0x, "team"))))))
                     .then(dt.a("empty").then(dt.a("team", fa.a()).executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"))))))
                  .then(
                     dt.a("join")
                        .then(
                           ((RequiredArgumentBuilder)dt.a("team", fa.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"), Collections.singleton(((ds)$$0x.getSource()).g().cy()))))
                              .then(dt.a("members", ev.b()).suggests(ev.a).executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"), ev.c($$0x, "members"))))
                        )
                  ))
               .then(dt.a("leave").then(dt.a("members", ev.b()).suggests(ev.a).executes($$0x -> a((ds)$$0x.getSource(), ev.c($$0x, "members"))))))
            .then(
               dt.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                                   "team", fa.a()
                                                )
                                                .then(
                                                   dt.a("displayName")
                                                      .then(
                                                         dt.a("displayName", ea.a())
                                                            .executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"), ea.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                dt.a("color")
                                                   .then(
                                                      dt.a("value", dz.a()).executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"), dz.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             dt.a("friendlyFire")
                                                .then(
                                                   dt.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ds)$$0x.getSource(), fa.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          dt.a("seeFriendlyInvisibles")
                                             .then(
                                                dt.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("nametagVisibility")
                                                   .then(dt.a("never").executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"), emc.b.b))))
                                                .then(dt.a("hideForOtherTeams").executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"), emc.b.c))))
                                             .then(dt.a("hideForOwnTeam").executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"), emc.b.d))))
                                          .then(dt.a("always").executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"), emc.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("deathMessageVisibility")
                                                .then(dt.a("never").executes($$0x -> b((ds)$$0x.getSource(), fa.a($$0x, "team"), emc.b.b))))
                                             .then(dt.a("hideForOtherTeams").executes($$0x -> b((ds)$$0x.getSource(), fa.a($$0x, "team"), emc.b.c))))
                                          .then(dt.a("hideForOwnTeam").executes($$0x -> b((ds)$$0x.getSource(), fa.a($$0x, "team"), emc.b.d))))
                                       .then(dt.a("always").executes($$0x -> b((ds)$$0x.getSource(), fa.a($$0x, "team"), emc.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("collisionRule")
                                             .then(dt.a("never").executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"), emc.a.b))))
                                          .then(dt.a("pushOwnTeam").executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"), emc.a.d))))
                                       .then(dt.a("pushOtherTeams").executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"), emc.a.c))))
                                    .then(dt.a("always").executes($$0x -> a((ds)$$0x.getSource(), fa.a($$0x, "team"), emc.a.a)))
                              ))
                           .then(
                              dt.a("prefix").then(dt.a("prefix", ea.a()).executes($$0x -> b((ds)$$0x.getSource(), fa.a($$0x, "team"), ea.a($$0x, "prefix"))))
                           ))
                        .then(dt.a("suffix").then(dt.a("suffix", ea.a()).executes($$0x -> c((ds)$$0x.getSource(), fa.a($$0x, "team"), ea.a($$0x, "suffix")))))
                  )
            )
      );
   }

   private static int a(ds $$0, Collection<String> $$1) {
      ema $$2 = $$0.l().aH();

      for (String $$3 : $$1) {
         $$2.f($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vb.a("commands.team.leave.success.single", $$1.iterator().next()), true);
      } else {
         $$0.a(() -> vb.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, ely $$1, Collection<String> $$2) {
      ema $$3 = $$0.l().aH();

      for (String $$4 : $$2) {
         $$3.a($$4, $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> vb.a("commands.team.join.success.single", $$2.iterator().next(), $$1.d()), true);
      } else {
         $$0.a(() -> vb.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(ds $$0, ely $$1, emc.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vb.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(ds $$0, ely $$1, emc.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> vb.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(ds $$0, ely $$1, emc.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vb.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ds $$0, ely $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> vb.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(ds $$0, ely $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> vb.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(ds $$0, ely $$1, vb $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vb.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(ds $$0, ely $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vb.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ds $$0, ely $$1) throws CommandSyntaxException {
      ema $$2 = $$0.l().aH();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> vb.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(ds $$0, ely $$1) {
      ema $$2 = $$0.l().aH();
      $$2.d($$1);
      $$0.a(() -> vb.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(ds $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, vb.b($$1));
   }

   private static int a(ds $$0, String $$1, vb $$2) throws CommandSyntaxException {
      ema $$3 = $$0.l().aH();
      if ($$3.d($$1) != null) {
         throw a.create();
      } else {
         ely $$4 = $$3.e($$1);
         $$4.a($$2);
         $$0.a(() -> vb.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(ds $$0, ely $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> vb.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> vb.a("commands.team.list.members.success", $$1.d(), $$2.size(), ve.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ds $$0) {
      Collection<ely> $$1 = $$0.l().aH().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> vb.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> vb.a("commands.team.list.teams.success", $$1.size(), ve.b($$1, ely::d)), false);
      }

      return $$1.size();
   }

   private static int b(ds $$0, ely $$1, vb $$2) {
      $$1.b($$2);
      $$0.a(() -> vb.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ds $$0, ely $$1, vb $$2) {
      $$1.c($$2);
      $$0.a(() -> vb.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
