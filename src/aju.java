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

public class aju {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ui.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ui.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ui.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ui.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ui.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(ui.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(ui.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(ui.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(ui.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(ui.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(ui.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)dv.a("list").executes($$0x -> a((du)$$0x.getSource())))
                                    .then(dv.a("team", fc.a()).executes($$0x -> c((du)$$0x.getSource(), fc.a($$0x, "team"))))
                              ))
                           .then(
                              dv.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)dv.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          dv.a("displayName", ec.a())
                                             .executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), ec.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(dv.a("remove").then(dv.a("team", fc.a()).executes($$0x -> b((du)$$0x.getSource(), fc.a($$0x, "team"))))))
                     .then(dv.a("empty").then(dv.a("team", fc.a()).executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"))))))
                  .then(
                     dv.a("join")
                        .then(
                           ((RequiredArgumentBuilder)dv.a("team", fc.a())
                                 .executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"), Collections.singleton(((du)$$0x.getSource()).h().cx()))))
                              .then(dv.a("members", ex.b()).suggests(ex.a).executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"), ex.c($$0x, "members"))))
                        )
                  ))
               .then(dv.a("leave").then(dv.a("members", ex.b()).suggests(ex.a).executes($$0x -> a((du)$$0x.getSource(), ex.c($$0x, "members"))))))
            .then(
               dv.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                                   "team", fc.a()
                                                )
                                                .then(
                                                   dv.a("displayName")
                                                      .then(
                                                         dv.a("displayName", ec.a())
                                                            .executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"), ec.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                dv.a("color")
                                                   .then(
                                                      dv.a("value", eb.a()).executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"), eb.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             dv.a("friendlyFire")
                                                .then(
                                                   dv.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((du)$$0x.getSource(), fc.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          dv.a("seeFriendlyInvisibles")
                                             .then(
                                                dv.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("nametagVisibility")
                                                   .then(dv.a("never").executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"), ejg.b.b))))
                                                .then(dv.a("hideForOtherTeams").executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"), ejg.b.c))))
                                             .then(dv.a("hideForOwnTeam").executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"), ejg.b.d))))
                                          .then(dv.a("always").executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"), ejg.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("deathMessageVisibility")
                                                .then(dv.a("never").executes($$0x -> b((du)$$0x.getSource(), fc.a($$0x, "team"), ejg.b.b))))
                                             .then(dv.a("hideForOtherTeams").executes($$0x -> b((du)$$0x.getSource(), fc.a($$0x, "team"), ejg.b.c))))
                                          .then(dv.a("hideForOwnTeam").executes($$0x -> b((du)$$0x.getSource(), fc.a($$0x, "team"), ejg.b.d))))
                                       .then(dv.a("always").executes($$0x -> b((du)$$0x.getSource(), fc.a($$0x, "team"), ejg.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("collisionRule")
                                             .then(dv.a("never").executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"), ejg.a.b))))
                                          .then(dv.a("pushOwnTeam").executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"), ejg.a.d))))
                                       .then(dv.a("pushOtherTeams").executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"), ejg.a.c))))
                                    .then(dv.a("always").executes($$0x -> a((du)$$0x.getSource(), fc.a($$0x, "team"), ejg.a.a)))
                              ))
                           .then(
                              dv.a("prefix").then(dv.a("prefix", ec.a()).executes($$0x -> b((du)$$0x.getSource(), fc.a($$0x, "team"), ec.a($$0x, "prefix"))))
                           ))
                        .then(dv.a("suffix").then(dv.a("suffix", ec.a()).executes($$0x -> c((du)$$0x.getSource(), fc.a($$0x, "team"), ec.a($$0x, "suffix")))))
                  )
            )
      );
   }

   private static int a(du $$0, Collection<String> $$1) {
      eje $$2 = $$0.m().aF();

      for (String $$3 : $$1) {
         $$2.f($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ui.a("commands.team.leave.success.single", $$1.iterator().next()), true);
      } else {
         $$0.a(() -> ui.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, ejc $$1, Collection<String> $$2) {
      eje $$3 = $$0.m().aF();

      for (String $$4 : $$2) {
         $$3.a($$4, $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> ui.a("commands.team.join.success.single", $$2.iterator().next(), $$1.d()), true);
      } else {
         $$0.a(() -> ui.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(du $$0, ejc $$1, ejg.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ui.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(du $$0, ejc $$1, ejg.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> ui.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(du $$0, ejc $$1, ejg.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ui.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(du $$0, ejc $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> ui.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(du $$0, ejc $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> ui.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(du $$0, ejc $$1, ui $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ui.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(du $$0, ejc $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ui.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(du $$0, ejc $$1) throws CommandSyntaxException {
      eje $$2 = $$0.m().aF();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> ui.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(du $$0, ejc $$1) {
      eje $$2 = $$0.m().aF();
      $$2.d($$1);
      $$0.a(() -> ui.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(du $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ui.b($$1));
   }

   private static int a(du $$0, String $$1, ui $$2) throws CommandSyntaxException {
      eje $$3 = $$0.m().aF();
      if ($$3.d($$1) != null) {
         throw a.create();
      } else {
         ejc $$4 = $$3.e($$1);
         $$4.a($$2);
         $$0.a(() -> ui.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(du $$0, ejc $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> ui.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> ui.a("commands.team.list.members.success", $$1.d(), $$2.size(), ul.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(du $$0) {
      Collection<ejc> $$1 = $$0.m().aF().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> ui.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> ui.a("commands.team.list.teams.success", $$1.size(), ul.b($$1, ejc::d)), false);
      }

      return $$1.size();
   }

   private static int b(du $$0, ejc $$1, ui $$2) {
      $$1.b($$2);
      $$0.a(() -> ui.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(du $$0, ejc $$1, ui $$2) {
      $$1.c($$2);
      $$0.a(() -> ui.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
