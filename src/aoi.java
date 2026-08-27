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

public class aoi {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wu.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wu.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wu.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wu.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wu.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(wu.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(wu.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)ee.a("list").executes($$0x -> a((ed)$$0x.getSource())))
                                    .then(ee.a("team", fp.a()).executes($$0x -> c((ed)$$0x.getSource(), fp.a($$0x, "team"))))
                              ))
                           .then(
                              ee.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)ee.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ed)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          ee.a("displayName", em.a($$1))
                                             .executes($$0x -> a((ed)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), em.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(ee.a("remove").then(ee.a("team", fp.a()).executes($$0x -> b((ed)$$0x.getSource(), fp.a($$0x, "team"))))))
                     .then(ee.a("empty").then(ee.a("team", fp.a()).executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"))))))
                  .then(
                     ee.a("join")
                        .then(
                           ((RequiredArgumentBuilder)ee.a("team", fp.a())
                                 .executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"), Collections.singleton(((ed)$$0x.getSource()).g()))))
                              .then(ee.a("members", fi.b()).suggests(fi.a).executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"), fi.c($$0x, "members"))))
                        )
                  ))
               .then(ee.a("leave").then(ee.a("members", fi.b()).suggests(fi.a).executes($$0x -> a((ed)$$0x.getSource(), fi.c($$0x, "members"))))))
            .then(
               ee.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a(
                                                   "team", fp.a()
                                                )
                                                .then(
                                                   ee.a("displayName")
                                                      .then(
                                                         ee.a("displayName", em.a($$1))
                                                            .executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"), em.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                ee.a("color")
                                                   .then(
                                                      ee.a("value", el.a()).executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"), el.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             ee.a("friendlyFire")
                                                .then(
                                                   ee.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ed)$$0x.getSource(), fp.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          ee.a("seeFriendlyInvisibles")
                                             .then(
                                                ee.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("nametagVisibility")
                                                   .then(ee.a("never").executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"), euv.b.b))))
                                                .then(ee.a("hideForOtherTeams").executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"), euv.b.c))))
                                             .then(ee.a("hideForOwnTeam").executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"), euv.b.d))))
                                          .then(ee.a("always").executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"), euv.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("deathMessageVisibility")
                                                .then(ee.a("never").executes($$0x -> b((ed)$$0x.getSource(), fp.a($$0x, "team"), euv.b.b))))
                                             .then(ee.a("hideForOtherTeams").executes($$0x -> b((ed)$$0x.getSource(), fp.a($$0x, "team"), euv.b.c))))
                                          .then(ee.a("hideForOwnTeam").executes($$0x -> b((ed)$$0x.getSource(), fp.a($$0x, "team"), euv.b.d))))
                                       .then(ee.a("always").executes($$0x -> b((ed)$$0x.getSource(), fp.a($$0x, "team"), euv.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("collisionRule")
                                             .then(ee.a("never").executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"), euv.a.b))))
                                          .then(ee.a("pushOwnTeam").executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"), euv.a.d))))
                                       .then(ee.a("pushOtherTeams").executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"), euv.a.c))))
                                    .then(ee.a("always").executes($$0x -> a((ed)$$0x.getSource(), fp.a($$0x, "team"), euv.a.a)))
                              ))
                           .then(
                              ee.a("prefix")
                                 .then(ee.a("prefix", em.a($$1)).executes($$0x -> b((ed)$$0x.getSource(), fp.a($$0x, "team"), em.a($$0x, "prefix"))))
                           ))
                        .then(
                           ee.a("suffix").then(ee.a("suffix", em.a($$1)).executes($$0x -> c((ed)$$0x.getSource(), fp.a($$0x, "team"), em.a($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static wu a(Collection<eus> $$0) {
      return $$0.iterator().next().hd();
   }

   private static int a(ed $$0, Collection<eus> $$1) {
      eut $$2 = $$0.l().aK();

      for (eus $$3 : $$1) {
         $$2.d($$3.cz());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> wu.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ed $$0, euo $$1, Collection<eus> $$2) {
      eut $$3 = $$0.l().aK();

      for (eus $$4 : $$2) {
         $$3.a($$4.cz(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> wu.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> wu.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(ed $$0, euo $$1, euv.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(ed $$0, euo $$1, euv.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> wu.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(ed $$0, euo $$1, euv.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ed $$0, euo $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> wu.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(ed $$0, euo $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(ed $$0, euo $$1, wu $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(ed $$0, euo $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ed $$0, euo $$1) throws CommandSyntaxException {
      eut $$2 = $$0.l().aK();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> wu.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(ed $$0, euo $$1) {
      eut $$2 = $$0.l().aK();
      $$2.d($$1);
      $$0.a(() -> wu.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(ed $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, wu.b($$1));
   }

   private static int a(ed $$0, String $$1, wu $$2) throws CommandSyntaxException {
      eut $$3 = $$0.l().aK();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         euo $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> wu.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(ed $$0, euo $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> wu.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> wu.a("commands.team.list.members.success", $$1.d(), $$2.size(), wx.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ed $$0) {
      Collection<euo> $$1 = $$0.l().aK().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> wu.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> wu.a("commands.team.list.teams.success", $$1.size(), wx.b($$1, euo::d)), false);
      }

      return $$1.size();
   }

   private static int b(ed $$0, euo $$1, wu $$2) {
      $$1.b($$2);
      $$0.a(() -> wu.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ed $$0, euo $$1, wu $$2) {
      $$1.c($$2);
      $$0.a(() -> wu.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
