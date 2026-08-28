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

public class apn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xa.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xa.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xa.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xa.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xa.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xa.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xa.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xa.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xa.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xa.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xa.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)ek.a("list").executes($$0x -> a((ej)$$0x.getSource())))
                                    .then(ek.a("team", fw.a()).executes($$0x -> c((ej)$$0x.getSource(), fw.a($$0x, "team"))))
                              ))
                           .then(
                              ek.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)ek.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ej)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          ek.a("displayName", es.a($$1))
                                             .executes($$0x -> a((ej)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), es.b($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(ek.a("remove").then(ek.a("team", fw.a()).executes($$0x -> b((ej)$$0x.getSource(), fw.a($$0x, "team"))))))
                     .then(ek.a("empty").then(ek.a("team", fw.a()).executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"))))))
                  .then(
                     ek.a("join")
                        .then(
                           ((RequiredArgumentBuilder)ek.a("team", fw.a())
                                 .executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"), Collections.singleton(((ej)$$0x.getSource()).g()))))
                              .then(ek.a("members", fp.b()).suggests(fp.a).executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"), fp.c($$0x, "members"))))
                        )
                  ))
               .then(ek.a("leave").then(ek.a("members", fp.b()).suggests(fp.a).executes($$0x -> a((ej)$$0x.getSource(), fp.c($$0x, "members"))))))
            .then(
               ek.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a(
                                                   "team", fw.a()
                                                )
                                                .then(
                                                   ek.a("displayName")
                                                      .then(
                                                         ek.a("displayName", es.a($$1))
                                                            .executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"), es.b($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                ek.a("color")
                                                   .then(
                                                      ek.a("value", er.a()).executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"), er.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             ek.a("friendlyFire")
                                                .then(
                                                   ek.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ej)$$0x.getSource(), fw.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          ek.a("seeFriendlyInvisibles")
                                             .then(
                                                ek.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("nametagVisibility")
                                                   .then(ek.a("never").executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"), fgx.b.b))))
                                                .then(ek.a("hideForOtherTeams").executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"), fgx.b.c))))
                                             .then(ek.a("hideForOwnTeam").executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"), fgx.b.d))))
                                          .then(ek.a("always").executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"), fgx.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("deathMessageVisibility")
                                                .then(ek.a("never").executes($$0x -> b((ej)$$0x.getSource(), fw.a($$0x, "team"), fgx.b.b))))
                                             .then(ek.a("hideForOtherTeams").executes($$0x -> b((ej)$$0x.getSource(), fw.a($$0x, "team"), fgx.b.c))))
                                          .then(ek.a("hideForOwnTeam").executes($$0x -> b((ej)$$0x.getSource(), fw.a($$0x, "team"), fgx.b.d))))
                                       .then(ek.a("always").executes($$0x -> b((ej)$$0x.getSource(), fw.a($$0x, "team"), fgx.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("collisionRule")
                                             .then(ek.a("never").executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"), fgx.a.b))))
                                          .then(ek.a("pushOwnTeam").executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"), fgx.a.d))))
                                       .then(ek.a("pushOtherTeams").executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"), fgx.a.c))))
                                    .then(ek.a("always").executes($$0x -> a((ej)$$0x.getSource(), fw.a($$0x, "team"), fgx.a.a)))
                              ))
                           .then(
                              ek.a("prefix")
                                 .then(ek.a("prefix", es.a($$1)).executes($$0x -> b((ej)$$0x.getSource(), fw.a($$0x, "team"), es.b($$0x, "prefix"))))
                           ))
                        .then(
                           ek.a("suffix").then(ek.a("suffix", es.a($$1)).executes($$0x -> c((ej)$$0x.getSource(), fw.a($$0x, "team"), es.b($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static xa a(Collection<fgu> $$0) {
      return $$0.iterator().next().hg();
   }

   private static int a(ej $$0, Collection<fgu> $$1) {
      fgv $$2 = $$0.l().aJ();

      for (fgu $$3 : $$1) {
         $$2.d($$3.cI());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xa.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> xa.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ej $$0, fgq $$1, Collection<fgu> $$2) {
      fgv $$3 = $$0.l().aJ();

      for (fgu $$4 : $$2) {
         $$3.a($$4.cI(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> xa.a("commands.team.join.success.single", a($$2), $$1.e()), true);
      } else {
         $$0.a(() -> xa.a("commands.team.join.success.multiple", $$2.size(), $$1.e()), true);
      }

      return $$2.size();
   }

   private static int a(ej $$0, fgq $$1, fgx.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xa.a("commands.team.option.nametagVisibility.success", $$1.e(), $$2.a()), true);
         return 0;
      }
   }

   private static int b(ej $$0, fgq $$1, fgx.b $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xa.a("commands.team.option.deathMessageVisibility.success", $$1.e(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ej $$0, fgq $$1, fgx.a $$2) throws CommandSyntaxException {
      if ($$1.m() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xa.a("commands.team.option.collisionRule.success", $$1.e(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ej $$0, fgq $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> xa.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.e()), true);
         return 0;
      }
   }

   private static int b(ej $$0, fgq $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> xa.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.e()), true);
         return 0;
      }
   }

   private static int a(ej $$0, fgq $$1, xa $$2) throws CommandSyntaxException {
      if ($$1.d().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xa.a("commands.team.option.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ej $$0, fgq $$1, o $$2) throws CommandSyntaxException {
      if ($$1.o() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xa.a("commands.team.option.color.success", $$1.e(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ej $$0, fgq $$1) throws CommandSyntaxException {
      fgv $$2 = $$0.l().aJ();
      Collection<String> $$3 = Lists.newArrayList($$1.h());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> xa.a("commands.team.empty.success", $$3.size(), $$1.e()), true);
         return $$3.size();
      }
   }

   private static int b(ej $$0, fgq $$1) {
      fgv $$2 = $$0.l().aJ();
      $$2.d($$1);
      $$0.a(() -> xa.a("commands.team.remove.success", $$1.e()), true);
      return $$2.f().size();
   }

   private static int a(ej $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, xa.b($$1));
   }

   private static int a(ej $$0, String $$1, xa $$2) throws CommandSyntaxException {
      fgv $$3 = $$0.l().aJ();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         fgq $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> xa.a("commands.team.add.success", $$4.e()), true);
         return $$3.f().size();
      }
   }

   private static int c(ej $$0, fgq $$1) {
      Collection<String> $$2 = $$1.h();
      if ($$2.isEmpty()) {
         $$0.a(() -> xa.a("commands.team.list.members.empty", $$1.e()), false);
      } else {
         $$0.a(() -> xa.a("commands.team.list.members.success", $$1.e(), $$2.size(), xd.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ej $$0) {
      Collection<fgq> $$1 = $$0.l().aJ().f();
      if ($$1.isEmpty()) {
         $$0.a(() -> xa.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> xa.a("commands.team.list.teams.success", $$1.size(), xd.b($$1, fgq::e)), false);
      }

      return $$1.size();
   }

   private static int b(ej $$0, fgq $$1, xa $$2) {
      $$1.b($$2);
      $$0.a(() -> xa.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ej $$0, fgq $$1, xa $$2) {
      $$1.c($$2);
      $$0.a(() -> xa.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
