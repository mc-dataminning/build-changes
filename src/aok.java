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

public class aok {
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

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)er.a("list").executes($$0x -> a((eq)$$0x.getSource())))
                                    .then(er.a("team", gc.a()).executes($$0x -> c((eq)$$0x.getSource(), gc.a($$0x, "team"))))
                              ))
                           .then(
                              er.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)er.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((eq)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          er.a("displayName", ez.a($$1))
                                             .executes($$0x -> a((eq)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), ez.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(er.a("remove").then(er.a("team", gc.a()).executes($$0x -> b((eq)$$0x.getSource(), gc.a($$0x, "team"))))))
                     .then(er.a("empty").then(er.a("team", gc.a()).executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"))))))
                  .then(
                     er.a("join")
                        .then(
                           ((RequiredArgumentBuilder)er.a("team", gc.a())
                                 .executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"), Collections.singleton(((eq)$$0x.getSource()).g()))))
                              .then(er.a("members", fv.b()).suggests(fv.a).executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"), fv.c($$0x, "members"))))
                        )
                  ))
               .then(er.a("leave").then(er.a("members", fv.b()).suggests(fv.a).executes($$0x -> a((eq)$$0x.getSource(), fv.c($$0x, "members"))))))
            .then(
               er.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a(
                                                   "team", gc.a()
                                                )
                                                .then(
                                                   er.a("displayName")
                                                      .then(
                                                         er.a("displayName", ez.a($$1))
                                                            .executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"), ez.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                er.a("color")
                                                   .then(
                                                      er.a("value", ey.a()).executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"), ey.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             er.a("friendlyFire")
                                                .then(
                                                   er.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((eq)$$0x.getSource(), gc.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          er.a("seeFriendlyInvisibles")
                                             .then(
                                                er.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("nametagVisibility")
                                                   .then(er.a("never").executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"), exl.b.b))))
                                                .then(er.a("hideForOtherTeams").executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"), exl.b.c))))
                                             .then(er.a("hideForOwnTeam").executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"), exl.b.d))))
                                          .then(er.a("always").executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"), exl.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("deathMessageVisibility")
                                                .then(er.a("never").executes($$0x -> b((eq)$$0x.getSource(), gc.a($$0x, "team"), exl.b.b))))
                                             .then(er.a("hideForOtherTeams").executes($$0x -> b((eq)$$0x.getSource(), gc.a($$0x, "team"), exl.b.c))))
                                          .then(er.a("hideForOwnTeam").executes($$0x -> b((eq)$$0x.getSource(), gc.a($$0x, "team"), exl.b.d))))
                                       .then(er.a("always").executes($$0x -> b((eq)$$0x.getSource(), gc.a($$0x, "team"), exl.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("collisionRule")
                                             .then(er.a("never").executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"), exl.a.b))))
                                          .then(er.a("pushOwnTeam").executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"), exl.a.d))))
                                       .then(er.a("pushOtherTeams").executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"), exl.a.c))))
                                    .then(er.a("always").executes($$0x -> a((eq)$$0x.getSource(), gc.a($$0x, "team"), exl.a.a)))
                              ))
                           .then(
                              er.a("prefix")
                                 .then(er.a("prefix", ez.a($$1)).executes($$0x -> b((eq)$$0x.getSource(), gc.a($$0x, "team"), ez.a($$0x, "prefix"))))
                           ))
                        .then(
                           er.a("suffix").then(er.a("suffix", ez.a($$1)).executes($$0x -> c((eq)$$0x.getSource(), gc.a($$0x, "team"), ez.a($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static wu a(Collection<exi> $$0) {
      return $$0.iterator().next().hc();
   }

   private static int a(eq $$0, Collection<exi> $$1) {
      exj $$2 = $$0.l().aL();

      for (exi $$3 : $$1) {
         $$2.d($$3.cC());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> wu.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eq $$0, exe $$1, Collection<exi> $$2) {
      exj $$3 = $$0.l().aL();

      for (exi $$4 : $$2) {
         $$3.a($$4.cC(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> wu.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> wu.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(eq $$0, exe $$1, exl.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(eq $$0, exe $$1, exl.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> wu.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(eq $$0, exe $$1, exl.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(eq $$0, exe $$1, boolean $$2) throws CommandSyntaxException {
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

   private static int b(eq $$0, exe $$1, boolean $$2) throws CommandSyntaxException {
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

   private static int a(eq $$0, exe $$1, wu $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(eq $$0, exe $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wu.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(eq $$0, exe $$1) throws CommandSyntaxException {
      exj $$2 = $$0.l().aL();
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

   private static int b(eq $$0, exe $$1) {
      exj $$2 = $$0.l().aL();
      $$2.d($$1);
      $$0.a(() -> wu.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(eq $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, wu.b($$1));
   }

   private static int a(eq $$0, String $$1, wu $$2) throws CommandSyntaxException {
      exj $$3 = $$0.l().aL();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         exe $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> wu.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(eq $$0, exe $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> wu.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> wu.a("commands.team.list.members.success", $$1.d(), $$2.size(), wx.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(eq $$0) {
      Collection<exe> $$1 = $$0.l().aL().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> wu.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> wu.a("commands.team.list.teams.success", $$1.size(), wx.b($$1, exe::d)), false);
      }

      return $$1.size();
   }

   private static int b(eq $$0, exe $$1, wu $$2) {
      $$1.b($$2);
      $$0.a(() -> wu.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(eq $$0, exe $$1, wu $$2) {
      $$1.c($$2);
      $$0.a(() -> wu.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
