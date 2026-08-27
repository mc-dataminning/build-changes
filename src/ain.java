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

public class ain {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(te.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(te.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(te.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(te.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(te.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(te.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(te.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(te.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(te.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)dt.a("list").executes($$0x -> a((ds)$$0x.getSource())))
                                    .then(dt.a("team", ez.a()).executes($$0x -> c((ds)$$0x.getSource(), ez.a($$0x, "team"))))
                              ))
                           .then(
                              dt.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)dt.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          dt.a("displayName", dz.a())
                                             .executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), dz.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(dt.a("remove").then(dt.a("team", ez.a()).executes($$0x -> b((ds)$$0x.getSource(), ez.a($$0x, "team"))))))
                     .then(dt.a("empty").then(dt.a("team", ez.a()).executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"))))))
                  .then(
                     dt.a("join")
                        .then(
                           ((RequiredArgumentBuilder)dt.a("team", ez.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"), Collections.singleton(((ds)$$0x.getSource()).g().cx()))))
                              .then(dt.a("members", eu.b()).suggests(eu.a).executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"), eu.c($$0x, "members"))))
                        )
                  ))
               .then(dt.a("leave").then(dt.a("members", eu.b()).suggests(eu.a).executes($$0x -> a((ds)$$0x.getSource(), eu.c($$0x, "members"))))))
            .then(
               dt.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                                   "team", ez.a()
                                                )
                                                .then(
                                                   dt.a("displayName")
                                                      .then(
                                                         dt.a("displayName", dz.a())
                                                            .executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"), dz.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                dt.a("color")
                                                   .then(
                                                      dt.a("value", dy.a()).executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"), dy.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             dt.a("friendlyFire")
                                                .then(
                                                   dt.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ds)$$0x.getSource(), ez.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          dt.a("seeFriendlyInvisibles")
                                             .then(
                                                dt.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("nametagVisibility")
                                                   .then(dt.a("never").executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"), eig.b.b))))
                                                .then(dt.a("hideForOtherTeams").executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"), eig.b.c))))
                                             .then(dt.a("hideForOwnTeam").executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"), eig.b.d))))
                                          .then(dt.a("always").executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"), eig.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("deathMessageVisibility")
                                                .then(dt.a("never").executes($$0x -> b((ds)$$0x.getSource(), ez.a($$0x, "team"), eig.b.b))))
                                             .then(dt.a("hideForOtherTeams").executes($$0x -> b((ds)$$0x.getSource(), ez.a($$0x, "team"), eig.b.c))))
                                          .then(dt.a("hideForOwnTeam").executes($$0x -> b((ds)$$0x.getSource(), ez.a($$0x, "team"), eig.b.d))))
                                       .then(dt.a("always").executes($$0x -> b((ds)$$0x.getSource(), ez.a($$0x, "team"), eig.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("collisionRule")
                                             .then(dt.a("never").executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"), eig.a.b))))
                                          .then(dt.a("pushOwnTeam").executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"), eig.a.d))))
                                       .then(dt.a("pushOtherTeams").executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"), eig.a.c))))
                                    .then(dt.a("always").executes($$0x -> a((ds)$$0x.getSource(), ez.a($$0x, "team"), eig.a.a)))
                              ))
                           .then(
                              dt.a("prefix").then(dt.a("prefix", dz.a()).executes($$0x -> b((ds)$$0x.getSource(), ez.a($$0x, "team"), dz.a($$0x, "prefix"))))
                           ))
                        .then(dt.a("suffix").then(dt.a("suffix", dz.a()).executes($$0x -> c((ds)$$0x.getSource(), ez.a($$0x, "team"), dz.a($$0x, "suffix")))))
                  )
            )
      );
   }

   private static int a(ds $$0, Collection<String> $$1) {
      eie $$2 = $$0.l().aF();

      for (String $$3 : $$1) {
         $$2.f($$3);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> te.a("commands.team.leave.success.single", $$1.iterator().next()), true);
      } else {
         $$0.a(() -> te.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, eic $$1, Collection<String> $$2) {
      eie $$3 = $$0.l().aF();

      for (String $$4 : $$2) {
         $$3.a($$4, $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> te.a("commands.team.join.success.single", $$2.iterator().next(), $$1.d()), true);
      } else {
         $$0.a(() -> te.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(ds $$0, eic $$1, eig.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> te.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(ds $$0, eic $$1, eig.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> te.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(ds $$0, eic $$1, eig.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> te.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ds $$0, eic $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> te.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(ds $$0, eic $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> te.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(ds $$0, eic $$1, te $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> te.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(ds $$0, eic $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> te.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ds $$0, eic $$1) throws CommandSyntaxException {
      eie $$2 = $$0.l().aF();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> te.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(ds $$0, eic $$1) {
      eie $$2 = $$0.l().aF();
      $$2.d($$1);
      $$0.a(() -> te.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(ds $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, te.b($$1));
   }

   private static int a(ds $$0, String $$1, te $$2) throws CommandSyntaxException {
      eie $$3 = $$0.l().aF();
      if ($$3.d($$1) != null) {
         throw a.create();
      } else {
         eic $$4 = $$3.e($$1);
         $$4.a($$2);
         $$0.a(() -> te.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(ds $$0, eic $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> te.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> te.a("commands.team.list.members.success", $$1.d(), $$2.size(), tg.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ds $$0) {
      Collection<eic> $$1 = $$0.l().aF().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> te.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> te.a("commands.team.list.teams.success", $$1.size(), tg.b($$1, eic::d)), false);
      }

      return $$1.size();
   }

   private static int b(ds $$0, eic $$1, te $$2) {
      $$1.b($$2);
      $$0.a(() -> te.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ds $$0, eic $$1, te $$2) {
      $$1.c($$2);
      $$0.a(() -> te.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
