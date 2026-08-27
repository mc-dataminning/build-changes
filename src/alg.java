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

public class alg {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vf.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vf.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vf.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vf.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(vf.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(vf.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(vf.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(vf.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(vf.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(vf.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)dt.a("list").executes($$0x -> a((ds)$$0x.getSource())))
                                    .then(dt.a("team", fc.a()).executes($$0x -> c((ds)$$0x.getSource(), fc.a($$0x, "team"))))
                              ))
                           .then(
                              dt.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)dt.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          dt.a("displayName", eb.a())
                                             .executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), eb.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(dt.a("remove").then(dt.a("team", fc.a()).executes($$0x -> b((ds)$$0x.getSource(), fc.a($$0x, "team"))))))
                     .then(dt.a("empty").then(dt.a("team", fc.a()).executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"))))))
                  .then(
                     dt.a("join")
                        .then(
                           ((RequiredArgumentBuilder)dt.a("team", fc.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"), Collections.singleton(((ds)$$0x.getSource()).g()))))
                              .then(dt.a("members", ew.b()).suggests(ew.a).executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"), ew.c($$0x, "members"))))
                        )
                  ))
               .then(dt.a("leave").then(dt.a("members", ew.b()).suggests(ew.a).executes($$0x -> a((ds)$$0x.getSource(), ew.c($$0x, "members"))))))
            .then(
               dt.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                                   "team", fc.a()
                                                )
                                                .then(
                                                   dt.a("displayName")
                                                      .then(
                                                         dt.a("displayName", eb.a())
                                                            .executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"), eb.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                dt.a("color")
                                                   .then(
                                                      dt.a("value", ea.a()).executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"), ea.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             dt.a("friendlyFire")
                                                .then(
                                                   dt.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ds)$$0x.getSource(), fc.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          dt.a("seeFriendlyInvisibles")
                                             .then(
                                                dt.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("nametagVisibility")
                                                   .then(dt.a("never").executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"), emz.b.b))))
                                                .then(dt.a("hideForOtherTeams").executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"), emz.b.c))))
                                             .then(dt.a("hideForOwnTeam").executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"), emz.b.d))))
                                          .then(dt.a("always").executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"), emz.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("deathMessageVisibility")
                                                .then(dt.a("never").executes($$0x -> b((ds)$$0x.getSource(), fc.a($$0x, "team"), emz.b.b))))
                                             .then(dt.a("hideForOtherTeams").executes($$0x -> b((ds)$$0x.getSource(), fc.a($$0x, "team"), emz.b.c))))
                                          .then(dt.a("hideForOwnTeam").executes($$0x -> b((ds)$$0x.getSource(), fc.a($$0x, "team"), emz.b.d))))
                                       .then(dt.a("always").executes($$0x -> b((ds)$$0x.getSource(), fc.a($$0x, "team"), emz.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("collisionRule")
                                             .then(dt.a("never").executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"), emz.a.b))))
                                          .then(dt.a("pushOwnTeam").executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"), emz.a.d))))
                                       .then(dt.a("pushOtherTeams").executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"), emz.a.c))))
                                    .then(dt.a("always").executes($$0x -> a((ds)$$0x.getSource(), fc.a($$0x, "team"), emz.a.a)))
                              ))
                           .then(
                              dt.a("prefix").then(dt.a("prefix", eb.a()).executes($$0x -> b((ds)$$0x.getSource(), fc.a($$0x, "team"), eb.a($$0x, "prefix"))))
                           ))
                        .then(dt.a("suffix").then(dt.a("suffix", eb.a()).executes($$0x -> c((ds)$$0x.getSource(), fc.a($$0x, "team"), eb.a($$0x, "suffix")))))
                  )
            )
      );
   }

   private static vf a(Collection<emw> $$0) {
      return $$0.iterator().next().gU();
   }

   private static int a(ds $$0, Collection<emw> $$1) {
      emx $$2 = $$0.l().aH();

      for (emw $$3 : $$1) {
         $$2.d($$3.cy());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vf.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> vf.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, ems $$1, Collection<emw> $$2) {
      emx $$3 = $$0.l().aH();

      for (emw $$4 : $$2) {
         $$3.a($$4.cy(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> vf.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> vf.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(ds $$0, ems $$1, emz.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vf.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(ds $$0, ems $$1, emz.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> vf.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(ds $$0, ems $$1, emz.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vf.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ds $$0, ems $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> vf.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(ds $$0, ems $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> vf.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(ds $$0, ems $$1, vf $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vf.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(ds $$0, ems $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vf.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ds $$0, ems $$1) throws CommandSyntaxException {
      emx $$2 = $$0.l().aH();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> vf.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(ds $$0, ems $$1) {
      emx $$2 = $$0.l().aH();
      $$2.d($$1);
      $$0.a(() -> vf.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(ds $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, vf.b($$1));
   }

   private static int a(ds $$0, String $$1, vf $$2) throws CommandSyntaxException {
      emx $$3 = $$0.l().aH();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         ems $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> vf.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(ds $$0, ems $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> vf.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> vf.a("commands.team.list.members.success", $$1.d(), $$2.size(), vi.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ds $$0) {
      Collection<ems> $$1 = $$0.l().aH().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> vf.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> vf.a("commands.team.list.teams.success", $$1.size(), vi.b($$1, ems::d)), false);
      }

      return $$1.size();
   }

   private static int b(ds $$0, ems $$1, vf $$2) {
      $$1.b($$2);
      $$0.a(() -> vf.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ds $$0, ems $$1, vf $$2) {
      $$1.c($$2);
      $$0.a(() -> vf.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
