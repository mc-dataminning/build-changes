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

public class aof {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ws.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ws.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ws.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(ws.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(ws.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(ws.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(ws.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(ws.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(ws.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)ed.a("list").executes($$0x -> a((ec)$$0x.getSource())))
                                    .then(ed.a("team", fn.a()).executes($$0x -> c((ec)$$0x.getSource(), fn.a($$0x, "team"))))
                              ))
                           .then(
                              ed.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)ed.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ec)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          ed.a("displayName", el.a($$1))
                                             .executes($$0x -> a((ec)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), el.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(ed.a("remove").then(ed.a("team", fn.a()).executes($$0x -> b((ec)$$0x.getSource(), fn.a($$0x, "team"))))))
                     .then(ed.a("empty").then(ed.a("team", fn.a()).executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"))))))
                  .then(
                     ed.a("join")
                        .then(
                           ((RequiredArgumentBuilder)ed.a("team", fn.a())
                                 .executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"), Collections.singleton(((ec)$$0x.getSource()).g()))))
                              .then(ed.a("members", fg.b()).suggests(fg.a).executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"), fg.c($$0x, "members"))))
                        )
                  ))
               .then(ed.a("leave").then(ed.a("members", fg.b()).suggests(fg.a).executes($$0x -> a((ec)$$0x.getSource(), fg.c($$0x, "members"))))))
            .then(
               ed.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a(
                                                   "team", fn.a()
                                                )
                                                .then(
                                                   ed.a("displayName")
                                                      .then(
                                                         ed.a("displayName", el.a($$1))
                                                            .executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"), el.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                ed.a("color")
                                                   .then(
                                                      ed.a("value", ek.a()).executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"), ek.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             ed.a("friendlyFire")
                                                .then(
                                                   ed.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ec)$$0x.getSource(), fn.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          ed.a("seeFriendlyInvisibles")
                                             .then(
                                                ed.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("nametagVisibility")
                                                   .then(ed.a("never").executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"), eul.b.b))))
                                                .then(ed.a("hideForOtherTeams").executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"), eul.b.c))))
                                             .then(ed.a("hideForOwnTeam").executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"), eul.b.d))))
                                          .then(ed.a("always").executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"), eul.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("deathMessageVisibility")
                                                .then(ed.a("never").executes($$0x -> b((ec)$$0x.getSource(), fn.a($$0x, "team"), eul.b.b))))
                                             .then(ed.a("hideForOtherTeams").executes($$0x -> b((ec)$$0x.getSource(), fn.a($$0x, "team"), eul.b.c))))
                                          .then(ed.a("hideForOwnTeam").executes($$0x -> b((ec)$$0x.getSource(), fn.a($$0x, "team"), eul.b.d))))
                                       .then(ed.a("always").executes($$0x -> b((ec)$$0x.getSource(), fn.a($$0x, "team"), eul.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("collisionRule")
                                             .then(ed.a("never").executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"), eul.a.b))))
                                          .then(ed.a("pushOwnTeam").executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"), eul.a.d))))
                                       .then(ed.a("pushOtherTeams").executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"), eul.a.c))))
                                    .then(ed.a("always").executes($$0x -> a((ec)$$0x.getSource(), fn.a($$0x, "team"), eul.a.a)))
                              ))
                           .then(
                              ed.a("prefix")
                                 .then(ed.a("prefix", el.a($$1)).executes($$0x -> b((ec)$$0x.getSource(), fn.a($$0x, "team"), el.a($$0x, "prefix"))))
                           ))
                        .then(
                           ed.a("suffix").then(ed.a("suffix", el.a($$1)).executes($$0x -> c((ec)$$0x.getSource(), fn.a($$0x, "team"), el.a($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static ws a(Collection<eui> $$0) {
      return $$0.iterator().next().hd();
   }

   private static int a(ec $$0, Collection<eui> $$1) {
      euj $$2 = $$0.l().aK();

      for (eui $$3 : $$1) {
         $$2.d($$3.cz());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ws.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> ws.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ec $$0, eue $$1, Collection<eui> $$2) {
      euj $$3 = $$0.l().aK();

      for (eui $$4 : $$2) {
         $$3.a($$4.cz(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> ws.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> ws.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(ec $$0, eue $$1, eul.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ws.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(ec $$0, eue $$1, eul.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> ws.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(ec $$0, eue $$1, eul.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ws.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ec $$0, eue $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> ws.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(ec $$0, eue $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> ws.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(ec $$0, eue $$1, ws $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ws.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(ec $$0, eue $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> ws.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ec $$0, eue $$1) throws CommandSyntaxException {
      euj $$2 = $$0.l().aK();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> ws.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(ec $$0, eue $$1) {
      euj $$2 = $$0.l().aK();
      $$2.d($$1);
      $$0.a(() -> ws.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(ec $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ws.b($$1));
   }

   private static int a(ec $$0, String $$1, ws $$2) throws CommandSyntaxException {
      euj $$3 = $$0.l().aK();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         eue $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> ws.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(ec $$0, eue $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> ws.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> ws.a("commands.team.list.members.success", $$1.d(), $$2.size(), wv.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ec $$0) {
      Collection<eue> $$1 = $$0.l().aK().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> ws.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> ws.a("commands.team.list.teams.success", $$1.size(), wv.b($$1, eue::d)), false);
      }

      return $$1.size();
   }

   private static int b(ec $$0, eue $$1, ws $$2) {
      $$1.b($$2);
      $$0.a(() -> ws.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ec $$0, eue $$1, ws $$2) {
      $$1.c($$2);
      $$0.a(() -> ws.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
