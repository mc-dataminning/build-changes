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

public class apd {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xd.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xd.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xd.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xd.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xd.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xd.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xd.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xd.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xd.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)eu.a("list").executes($$0x -> a((et)$$0x.getSource())))
                                    .then(eu.a("team", gf.a()).executes($$0x -> c((et)$$0x.getSource(), gf.a($$0x, "team"))))
                              ))
                           .then(
                              eu.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)eu.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((et)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          eu.a("displayName", fc.a($$1))
                                             .executes($$0x -> a((et)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), fc.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(eu.a("remove").then(eu.a("team", gf.a()).executes($$0x -> b((et)$$0x.getSource(), gf.a($$0x, "team"))))))
                     .then(eu.a("empty").then(eu.a("team", gf.a()).executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"))))))
                  .then(
                     eu.a("join")
                        .then(
                           ((RequiredArgumentBuilder)eu.a("team", gf.a())
                                 .executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"), Collections.singleton(((et)$$0x.getSource()).g()))))
                              .then(eu.a("members", fy.b()).suggests(fy.a).executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"), fy.c($$0x, "members"))))
                        )
                  ))
               .then(eu.a("leave").then(eu.a("members", fy.b()).suggests(fy.a).executes($$0x -> a((et)$$0x.getSource(), fy.c($$0x, "members"))))))
            .then(
               eu.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a(
                                                   "team", gf.a()
                                                )
                                                .then(
                                                   eu.a("displayName")
                                                      .then(
                                                         eu.a("displayName", fc.a($$1))
                                                            .executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"), fc.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                eu.a("color")
                                                   .then(
                                                      eu.a("value", fb.a()).executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"), fb.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             eu.a("friendlyFire")
                                                .then(
                                                   eu.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((et)$$0x.getSource(), gf.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          eu.a("seeFriendlyInvisibles")
                                             .then(
                                                eu.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("nametagVisibility")
                                                   .then(eu.a("never").executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"), ezk.b.b))))
                                                .then(eu.a("hideForOtherTeams").executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"), ezk.b.c))))
                                             .then(eu.a("hideForOwnTeam").executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"), ezk.b.d))))
                                          .then(eu.a("always").executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"), ezk.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("deathMessageVisibility")
                                                .then(eu.a("never").executes($$0x -> b((et)$$0x.getSource(), gf.a($$0x, "team"), ezk.b.b))))
                                             .then(eu.a("hideForOtherTeams").executes($$0x -> b((et)$$0x.getSource(), gf.a($$0x, "team"), ezk.b.c))))
                                          .then(eu.a("hideForOwnTeam").executes($$0x -> b((et)$$0x.getSource(), gf.a($$0x, "team"), ezk.b.d))))
                                       .then(eu.a("always").executes($$0x -> b((et)$$0x.getSource(), gf.a($$0x, "team"), ezk.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("collisionRule")
                                             .then(eu.a("never").executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"), ezk.a.b))))
                                          .then(eu.a("pushOwnTeam").executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"), ezk.a.d))))
                                       .then(eu.a("pushOtherTeams").executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"), ezk.a.c))))
                                    .then(eu.a("always").executes($$0x -> a((et)$$0x.getSource(), gf.a($$0x, "team"), ezk.a.a)))
                              ))
                           .then(
                              eu.a("prefix")
                                 .then(eu.a("prefix", fc.a($$1)).executes($$0x -> b((et)$$0x.getSource(), gf.a($$0x, "team"), fc.a($$0x, "prefix"))))
                           ))
                        .then(
                           eu.a("suffix").then(eu.a("suffix", fc.a($$1)).executes($$0x -> c((et)$$0x.getSource(), gf.a($$0x, "team"), fc.a($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static xd a(Collection<ezh> $$0) {
      return $$0.iterator().next().he();
   }

   private static int a(et $$0, Collection<ezh> $$1) {
      ezi $$2 = $$0.l().aJ();

      for (ezh $$3 : $$1) {
         $$2.d($$3.cF());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xd.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> xd.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(et $$0, ezd $$1, Collection<ezh> $$2) {
      ezi $$3 = $$0.l().aJ();

      for (ezh $$4 : $$2) {
         $$3.a($$4.cF(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> xd.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> xd.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(et $$0, ezd $$1, ezk.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xd.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(et $$0, ezd $$1, ezk.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xd.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(et $$0, ezd $$1, ezk.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xd.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(et $$0, ezd $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> xd.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(et $$0, ezd $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> xd.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(et $$0, ezd $$1, xd $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xd.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(et $$0, ezd $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xd.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(et $$0, ezd $$1) throws CommandSyntaxException {
      ezi $$2 = $$0.l().aJ();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> xd.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(et $$0, ezd $$1) {
      ezi $$2 = $$0.l().aJ();
      $$2.d($$1);
      $$0.a(() -> xd.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(et $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, xd.b($$1));
   }

   private static int a(et $$0, String $$1, xd $$2) throws CommandSyntaxException {
      ezi $$3 = $$0.l().aJ();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         ezd $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> xd.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(et $$0, ezd $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> xd.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> xd.a("commands.team.list.members.success", $$1.d(), $$2.size(), xg.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(et $$0) {
      Collection<ezd> $$1 = $$0.l().aJ().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> xd.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> xd.a("commands.team.list.teams.success", $$1.size(), xg.b($$1, ezd::d)), false);
      }

      return $$1.size();
   }

   private static int b(et $$0, ezd $$1, xd $$2) {
      $$1.b($$2);
      $$0.a(() -> xd.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(et $$0, ezd $$1, xd $$2) {
      $$1.c($$2);
      $$0.a(() -> xd.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
