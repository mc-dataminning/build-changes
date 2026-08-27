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

public class aou {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xe.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xe.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xe.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xe.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xe.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xe.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xe.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)ei.a("list").executes($$0x -> a((eh)$$0x.getSource())))
                                    .then(ei.a("team", ft.a()).executes($$0x -> c((eh)$$0x.getSource(), ft.a($$0x, "team"))))
                              ))
                           .then(
                              ei.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)ei.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((eh)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          ei.a("displayName", eq.a($$1))
                                             .executes($$0x -> a((eh)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), eq.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(ei.a("remove").then(ei.a("team", ft.a()).executes($$0x -> b((eh)$$0x.getSource(), ft.a($$0x, "team"))))))
                     .then(ei.a("empty").then(ei.a("team", ft.a()).executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"))))))
                  .then(
                     ei.a("join")
                        .then(
                           ((RequiredArgumentBuilder)ei.a("team", ft.a())
                                 .executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"), Collections.singleton(((eh)$$0x.getSource()).g()))))
                              .then(ei.a("members", fm.b()).suggests(fm.a).executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"), fm.c($$0x, "members"))))
                        )
                  ))
               .then(ei.a("leave").then(ei.a("members", fm.b()).suggests(fm.a).executes($$0x -> a((eh)$$0x.getSource(), fm.c($$0x, "members"))))))
            .then(
               ei.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a(
                                                   "team", ft.a()
                                                )
                                                .then(
                                                   ei.a("displayName")
                                                      .then(
                                                         ei.a("displayName", eq.a($$1))
                                                            .executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"), eq.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                ei.a("color")
                                                   .then(
                                                      ei.a("value", ep.a()).executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"), ep.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             ei.a("friendlyFire")
                                                .then(
                                                   ei.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((eh)$$0x.getSource(), ft.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          ei.a("seeFriendlyInvisibles")
                                             .then(
                                                ei.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("nametagVisibility")
                                                   .then(ei.a("never").executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"), eya.b.b))))
                                                .then(ei.a("hideForOtherTeams").executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"), eya.b.c))))
                                             .then(ei.a("hideForOwnTeam").executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"), eya.b.d))))
                                          .then(ei.a("always").executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"), eya.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("deathMessageVisibility")
                                                .then(ei.a("never").executes($$0x -> b((eh)$$0x.getSource(), ft.a($$0x, "team"), eya.b.b))))
                                             .then(ei.a("hideForOtherTeams").executes($$0x -> b((eh)$$0x.getSource(), ft.a($$0x, "team"), eya.b.c))))
                                          .then(ei.a("hideForOwnTeam").executes($$0x -> b((eh)$$0x.getSource(), ft.a($$0x, "team"), eya.b.d))))
                                       .then(ei.a("always").executes($$0x -> b((eh)$$0x.getSource(), ft.a($$0x, "team"), eya.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("collisionRule")
                                             .then(ei.a("never").executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"), eya.a.b))))
                                          .then(ei.a("pushOwnTeam").executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"), eya.a.d))))
                                       .then(ei.a("pushOtherTeams").executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"), eya.a.c))))
                                    .then(ei.a("always").executes($$0x -> a((eh)$$0x.getSource(), ft.a($$0x, "team"), eya.a.a)))
                              ))
                           .then(
                              ei.a("prefix")
                                 .then(ei.a("prefix", eq.a($$1)).executes($$0x -> b((eh)$$0x.getSource(), ft.a($$0x, "team"), eq.a($$0x, "prefix"))))
                           ))
                        .then(
                           ei.a("suffix").then(ei.a("suffix", eq.a($$1)).executes($$0x -> c((eh)$$0x.getSource(), ft.a($$0x, "team"), eq.a($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static xe a(Collection<exx> $$0) {
      return $$0.iterator().next().hm();
   }

   private static int a(eh $$0, Collection<exx> $$1) {
      exy $$2 = $$0.l().aK();

      for (exx $$3 : $$1) {
         $$2.d($$3.cG());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> xe.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eh $$0, ext $$1, Collection<exx> $$2) {
      exy $$3 = $$0.l().aK();

      for (exx $$4 : $$2) {
         $$3.a($$4.cG(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> xe.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> xe.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(eh $$0, ext $$1, eya.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(eh $$0, ext $$1, eya.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xe.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(eh $$0, ext $$1, eya.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(eh $$0, ext $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> xe.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(eh $$0, ext $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(eh $$0, ext $$1, xe $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(eh $$0, ext $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(eh $$0, ext $$1) throws CommandSyntaxException {
      exy $$2 = $$0.l().aK();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> xe.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(eh $$0, ext $$1) {
      exy $$2 = $$0.l().aK();
      $$2.d($$1);
      $$0.a(() -> xe.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(eh $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, xe.b($$1));
   }

   private static int a(eh $$0, String $$1, xe $$2) throws CommandSyntaxException {
      exy $$3 = $$0.l().aK();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         ext $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> xe.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(eh $$0, ext $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> xe.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> xe.a("commands.team.list.members.success", $$1.d(), $$2.size(), xh.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(eh $$0) {
      Collection<ext> $$1 = $$0.l().aK().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> xe.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> xe.a("commands.team.list.teams.success", $$1.size(), xh.b($$1, ext::d)), false);
      }

      return $$1.size();
   }

   private static int b(eh $$0, ext $$1, xe $$2) {
      $$1.b($$2);
      $$0.a(() -> xe.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(eh $$0, ext $$1, xe $$2) {
      $$1.c($$2);
      $$0.a(() -> xe.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
