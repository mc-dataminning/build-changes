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

public class api {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wv.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wv.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wv.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wv.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wv.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wv.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wv.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wv.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(wv.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(wv.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)ey.a("list").executes($$0x -> a((ex)$$0x.getSource())))
                                    .then(ey.a("team", gk.a()).executes($$0x -> c((ex)$$0x.getSource(), gk.a($$0x, "team"))))
                              ))
                           .then(
                              ey.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)ey.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ex)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          ey.a("displayName", fg.a($$1))
                                             .executes($$0x -> a((ex)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), fg.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(ey.a("remove").then(ey.a("team", gk.a()).executes($$0x -> b((ex)$$0x.getSource(), gk.a($$0x, "team"))))))
                     .then(ey.a("empty").then(ey.a("team", gk.a()).executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"))))))
                  .then(
                     ey.a("join")
                        .then(
                           ((RequiredArgumentBuilder)ey.a("team", gk.a())
                                 .executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"), Collections.singleton(((ex)$$0x.getSource()).g()))))
                              .then(ey.a("members", gd.b()).suggests(gd.a).executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"), gd.c($$0x, "members"))))
                        )
                  ))
               .then(ey.a("leave").then(ey.a("members", gd.b()).suggests(gd.a).executes($$0x -> a((ex)$$0x.getSource(), gd.c($$0x, "members"))))))
            .then(
               ey.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a(
                                                   "team", gk.a()
                                                )
                                                .then(
                                                   ey.a("displayName")
                                                      .then(
                                                         ey.a("displayName", fg.a($$1))
                                                            .executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"), fg.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                ey.a("color")
                                                   .then(
                                                      ey.a("value", ff.a()).executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"), ff.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             ey.a("friendlyFire")
                                                .then(
                                                   ey.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ex)$$0x.getSource(), gk.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          ey.a("seeFriendlyInvisibles")
                                             .then(
                                                ey.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("nametagVisibility")
                                                   .then(ey.a("never").executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"), feb.b.b))))
                                                .then(ey.a("hideForOtherTeams").executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"), feb.b.c))))
                                             .then(ey.a("hideForOwnTeam").executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"), feb.b.d))))
                                          .then(ey.a("always").executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"), feb.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("deathMessageVisibility")
                                                .then(ey.a("never").executes($$0x -> b((ex)$$0x.getSource(), gk.a($$0x, "team"), feb.b.b))))
                                             .then(ey.a("hideForOtherTeams").executes($$0x -> b((ex)$$0x.getSource(), gk.a($$0x, "team"), feb.b.c))))
                                          .then(ey.a("hideForOwnTeam").executes($$0x -> b((ex)$$0x.getSource(), gk.a($$0x, "team"), feb.b.d))))
                                       .then(ey.a("always").executes($$0x -> b((ex)$$0x.getSource(), gk.a($$0x, "team"), feb.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("collisionRule")
                                             .then(ey.a("never").executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"), feb.a.b))))
                                          .then(ey.a("pushOwnTeam").executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"), feb.a.d))))
                                       .then(ey.a("pushOtherTeams").executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"), feb.a.c))))
                                    .then(ey.a("always").executes($$0x -> a((ex)$$0x.getSource(), gk.a($$0x, "team"), feb.a.a)))
                              ))
                           .then(
                              ey.a("prefix")
                                 .then(ey.a("prefix", fg.a($$1)).executes($$0x -> b((ex)$$0x.getSource(), gk.a($$0x, "team"), fg.a($$0x, "prefix"))))
                           ))
                        .then(
                           ey.a("suffix").then(ey.a("suffix", fg.a($$1)).executes($$0x -> c((ex)$$0x.getSource(), gk.a($$0x, "team"), fg.a($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static wv a(Collection<fdy> $$0) {
      return $$0.iterator().next().hc();
   }

   private static int a(ex $$0, Collection<fdy> $$1) {
      fdz $$2 = $$0.l().aJ();

      for (fdy $$3 : $$1) {
         $$2.d($$3.cI());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wv.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> wv.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ex $$0, fdu $$1, Collection<fdy> $$2) {
      fdz $$3 = $$0.l().aJ();

      for (fdy $$4 : $$2) {
         $$3.a($$4.cI(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> wv.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> wv.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(ex $$0, fdu $$1, feb.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wv.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(ex $$0, fdu $$1, feb.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> wv.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(ex $$0, fdu $$1, feb.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wv.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ex $$0, fdu $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> wv.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(ex $$0, fdu $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> wv.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(ex $$0, fdu $$1, wv $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wv.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(ex $$0, fdu $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wv.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ex $$0, fdu $$1) throws CommandSyntaxException {
      fdz $$2 = $$0.l().aJ();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> wv.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(ex $$0, fdu $$1) {
      fdz $$2 = $$0.l().aJ();
      $$2.d($$1);
      $$0.a(() -> wv.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(ex $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, wv.b($$1));
   }

   private static int a(ex $$0, String $$1, wv $$2) throws CommandSyntaxException {
      fdz $$3 = $$0.l().aJ();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         fdu $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> wv.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(ex $$0, fdu $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> wv.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> wv.a("commands.team.list.members.success", $$1.d(), $$2.size(), wy.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ex $$0) {
      Collection<fdu> $$1 = $$0.l().aJ().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> wv.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> wv.a("commands.team.list.teams.success", $$1.size(), wy.b($$1, fdu::d)), false);
      }

      return $$1.size();
   }

   private static int b(ex $$0, fdu $$1, wv $$2) {
      $$1.b($$2);
      $$0.a(() -> wv.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ex $$0, fdu $$1, wv $$2) {
      $$1.c($$2);
      $$0.a(() -> wv.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
