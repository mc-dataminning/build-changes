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

public class anc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vs.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vs.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vs.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vs.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(vs.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(vs.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(vs.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(vs.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(vs.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(vs.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(vs.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)dv.a("list").executes($$0x -> a((du)$$0x.getSource())))
                                    .then(dv.a("team", fe.a()).executes($$0x -> c((du)$$0x.getSource(), fe.a($$0x, "team"))))
                              ))
                           .then(
                              dv.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)dv.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          dv.a("displayName", ed.a($$1))
                                             .executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), ed.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(dv.a("remove").then(dv.a("team", fe.a()).executes($$0x -> b((du)$$0x.getSource(), fe.a($$0x, "team"))))))
                     .then(dv.a("empty").then(dv.a("team", fe.a()).executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"))))))
                  .then(
                     dv.a("join")
                        .then(
                           ((RequiredArgumentBuilder)dv.a("team", fe.a())
                                 .executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"), Collections.singleton(((du)$$0x.getSource()).g()))))
                              .then(dv.a("members", ey.b()).suggests(ey.a).executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"), ey.c($$0x, "members"))))
                        )
                  ))
               .then(dv.a("leave").then(dv.a("members", ey.b()).suggests(ey.a).executes($$0x -> a((du)$$0x.getSource(), ey.c($$0x, "members"))))))
            .then(
               dv.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                                   "team", fe.a()
                                                )
                                                .then(
                                                   dv.a("displayName")
                                                      .then(
                                                         dv.a("displayName", ed.a($$1))
                                                            .executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"), ed.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                dv.a("color")
                                                   .then(
                                                      dv.a("value", ec.a()).executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"), ec.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             dv.a("friendlyFire")
                                                .then(
                                                   dv.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((du)$$0x.getSource(), fe.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          dv.a("seeFriendlyInvisibles")
                                             .then(
                                                dv.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("nametagVisibility")
                                                   .then(dv.a("never").executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"), eqb.b.b))))
                                                .then(dv.a("hideForOtherTeams").executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"), eqb.b.c))))
                                             .then(dv.a("hideForOwnTeam").executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"), eqb.b.d))))
                                          .then(dv.a("always").executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"), eqb.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("deathMessageVisibility")
                                                .then(dv.a("never").executes($$0x -> b((du)$$0x.getSource(), fe.a($$0x, "team"), eqb.b.b))))
                                             .then(dv.a("hideForOtherTeams").executes($$0x -> b((du)$$0x.getSource(), fe.a($$0x, "team"), eqb.b.c))))
                                          .then(dv.a("hideForOwnTeam").executes($$0x -> b((du)$$0x.getSource(), fe.a($$0x, "team"), eqb.b.d))))
                                       .then(dv.a("always").executes($$0x -> b((du)$$0x.getSource(), fe.a($$0x, "team"), eqb.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("collisionRule")
                                             .then(dv.a("never").executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"), eqb.a.b))))
                                          .then(dv.a("pushOwnTeam").executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"), eqb.a.d))))
                                       .then(dv.a("pushOtherTeams").executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"), eqb.a.c))))
                                    .then(dv.a("always").executes($$0x -> a((du)$$0x.getSource(), fe.a($$0x, "team"), eqb.a.a)))
                              ))
                           .then(
                              dv.a("prefix")
                                 .then(dv.a("prefix", ed.a($$1)).executes($$0x -> b((du)$$0x.getSource(), fe.a($$0x, "team"), ed.a($$0x, "prefix"))))
                           ))
                        .then(
                           dv.a("suffix").then(dv.a("suffix", ed.a($$1)).executes($$0x -> c((du)$$0x.getSource(), fe.a($$0x, "team"), ed.a($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static vs a(Collection<epy> $$0) {
      return $$0.iterator().next().ha();
   }

   private static int a(du $$0, Collection<epy> $$1) {
      epz $$2 = $$0.l().aK();

      for (epy $$3 : $$1) {
         $$2.d($$3.cv());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vs.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> vs.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, epu $$1, Collection<epy> $$2) {
      epz $$3 = $$0.l().aK();

      for (epy $$4 : $$2) {
         $$3.a($$4.cv(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> vs.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> vs.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(du $$0, epu $$1, eqb.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vs.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(du $$0, epu $$1, eqb.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> vs.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(du $$0, epu $$1, eqb.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vs.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(du $$0, epu $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> vs.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(du $$0, epu $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> vs.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(du $$0, epu $$1, vs $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vs.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(du $$0, epu $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> vs.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(du $$0, epu $$1) throws CommandSyntaxException {
      epz $$2 = $$0.l().aK();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> vs.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(du $$0, epu $$1) {
      epz $$2 = $$0.l().aK();
      $$2.d($$1);
      $$0.a(() -> vs.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(du $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, vs.b($$1));
   }

   private static int a(du $$0, String $$1, vs $$2) throws CommandSyntaxException {
      epz $$3 = $$0.l().aK();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         epu $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> vs.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(du $$0, epu $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> vs.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> vs.a("commands.team.list.members.success", $$1.d(), $$2.size(), vv.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(du $$0) {
      Collection<epu> $$1 = $$0.l().aK().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> vs.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> vs.a("commands.team.list.teams.success", $$1.size(), vv.b($$1, epu::d)), false);
      }

      return $$1.size();
   }

   private static int b(du $$0, epu $$1, vs $$2) {
      $$1.b($$2);
      $$0.a(() -> vs.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(du $$0, epu $$1, vs $$2) {
      $$1.c($$2);
      $$0.a(() -> vs.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
