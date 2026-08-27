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

public class anv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wi.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wi.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wi.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wi.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wi.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wi.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wi.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(wi.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(wi.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)dw.a("list").executes($$0x -> a((dv)$$0x.getSource())))
                                    .then(dw.a("team", fg.a()).executes($$0x -> c((dv)$$0x.getSource(), fg.a($$0x, "team"))))
                              ))
                           .then(
                              dw.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)dw.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((dv)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          dw.a("displayName", ee.a($$1))
                                             .executes($$0x -> a((dv)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), ee.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(dw.a("remove").then(dw.a("team", fg.a()).executes($$0x -> b((dv)$$0x.getSource(), fg.a($$0x, "team"))))))
                     .then(dw.a("empty").then(dw.a("team", fg.a()).executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"))))))
                  .then(
                     dw.a("join")
                        .then(
                           ((RequiredArgumentBuilder)dw.a("team", fg.a())
                                 .executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"), Collections.singleton(((dv)$$0x.getSource()).g()))))
                              .then(dw.a("members", ez.b()).suggests(ez.a).executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"), ez.c($$0x, "members"))))
                        )
                  ))
               .then(dw.a("leave").then(dw.a("members", ez.b()).suggests(ez.a).executes($$0x -> a((dv)$$0x.getSource(), ez.c($$0x, "members"))))))
            .then(
               dw.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a(
                                                   "team", fg.a()
                                                )
                                                .then(
                                                   dw.a("displayName")
                                                      .then(
                                                         dw.a("displayName", ee.a($$1))
                                                            .executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"), ee.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                dw.a("color")
                                                   .then(
                                                      dw.a("value", ed.a()).executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"), ed.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             dw.a("friendlyFire")
                                                .then(
                                                   dw.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((dv)$$0x.getSource(), fg.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          dw.a("seeFriendlyInvisibles")
                                             .then(
                                                dw.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("nametagVisibility")
                                                   .then(dw.a("never").executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"), etp.b.b))))
                                                .then(dw.a("hideForOtherTeams").executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"), etp.b.c))))
                                             .then(dw.a("hideForOwnTeam").executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"), etp.b.d))))
                                          .then(dw.a("always").executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"), etp.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("deathMessageVisibility")
                                                .then(dw.a("never").executes($$0x -> b((dv)$$0x.getSource(), fg.a($$0x, "team"), etp.b.b))))
                                             .then(dw.a("hideForOtherTeams").executes($$0x -> b((dv)$$0x.getSource(), fg.a($$0x, "team"), etp.b.c))))
                                          .then(dw.a("hideForOwnTeam").executes($$0x -> b((dv)$$0x.getSource(), fg.a($$0x, "team"), etp.b.d))))
                                       .then(dw.a("always").executes($$0x -> b((dv)$$0x.getSource(), fg.a($$0x, "team"), etp.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("collisionRule")
                                             .then(dw.a("never").executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"), etp.a.b))))
                                          .then(dw.a("pushOwnTeam").executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"), etp.a.d))))
                                       .then(dw.a("pushOtherTeams").executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"), etp.a.c))))
                                    .then(dw.a("always").executes($$0x -> a((dv)$$0x.getSource(), fg.a($$0x, "team"), etp.a.a)))
                              ))
                           .then(
                              dw.a("prefix")
                                 .then(dw.a("prefix", ee.a($$1)).executes($$0x -> b((dv)$$0x.getSource(), fg.a($$0x, "team"), ee.a($$0x, "prefix"))))
                           ))
                        .then(
                           dw.a("suffix").then(dw.a("suffix", ee.a($$1)).executes($$0x -> c((dv)$$0x.getSource(), fg.a($$0x, "team"), ee.a($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static wi a(Collection<etm> $$0) {
      return $$0.iterator().next().hb();
   }

   private static int a(dv $$0, Collection<etm> $$1) {
      etn $$2 = $$0.l().aK();

      for (etm $$3 : $$1) {
         $$2.d($$3.cy());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wi.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> wi.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dv $$0, eti $$1, Collection<etm> $$2) {
      etn $$3 = $$0.l().aK();

      for (etm $$4 : $$2) {
         $$3.a($$4.cy(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> wi.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> wi.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(dv $$0, eti $$1, etp.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wi.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(dv $$0, eti $$1, etp.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> wi.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(dv $$0, eti $$1, etp.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wi.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(dv $$0, eti $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> wi.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(dv $$0, eti $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> wi.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(dv $$0, eti $$1, wi $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wi.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(dv $$0, eti $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wi.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(dv $$0, eti $$1) throws CommandSyntaxException {
      etn $$2 = $$0.l().aK();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> wi.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(dv $$0, eti $$1) {
      etn $$2 = $$0.l().aK();
      $$2.d($$1);
      $$0.a(() -> wi.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(dv $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, wi.b($$1));
   }

   private static int a(dv $$0, String $$1, wi $$2) throws CommandSyntaxException {
      etn $$3 = $$0.l().aK();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         eti $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> wi.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(dv $$0, eti $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> wi.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> wi.a("commands.team.list.members.success", $$1.d(), $$2.size(), wl.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(dv $$0) {
      Collection<eti> $$1 = $$0.l().aK().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> wi.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> wi.a("commands.team.list.teams.success", $$1.size(), wl.b($$1, eti::d)), false);
      }

      return $$1.size();
   }

   private static int b(dv $$0, eti $$1, wi $$2) {
      $$1.b($$2);
      $$0.a(() -> wi.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(dv $$0, eti $$1, wi $$2) {
      $$1.c($$2);
      $$0.a(() -> wi.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
