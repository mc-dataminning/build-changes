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

public class apg {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xp.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xp.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xp.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xp.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xp.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xp.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xp.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xp.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xp.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xp.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)eq.a("list").executes($$0x -> a((ep)$$0x.getSource())))
                                    .then(eq.a("team", gb.a()).executes($$0x -> c((ep)$$0x.getSource(), gb.a($$0x, "team"))))
                              ))
                           .then(
                              eq.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)eq.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ep)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          eq.a("displayName", ey.a($$1))
                                             .executes($$0x -> a((ep)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), ey.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(eq.a("remove").then(eq.a("team", gb.a()).executes($$0x -> b((ep)$$0x.getSource(), gb.a($$0x, "team"))))))
                     .then(eq.a("empty").then(eq.a("team", gb.a()).executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"))))))
                  .then(
                     eq.a("join")
                        .then(
                           ((RequiredArgumentBuilder)eq.a("team", gb.a())
                                 .executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"), Collections.singleton(((ep)$$0x.getSource()).g()))))
                              .then(eq.a("members", fu.b()).suggests(fu.a).executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"), fu.c($$0x, "members"))))
                        )
                  ))
               .then(eq.a("leave").then(eq.a("members", fu.b()).suggests(fu.a).executes($$0x -> a((ep)$$0x.getSource(), fu.c($$0x, "members"))))))
            .then(
               eq.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a(
                                                   "team", gb.a()
                                                )
                                                .then(
                                                   eq.a("displayName")
                                                      .then(
                                                         eq.a("displayName", ey.a($$1))
                                                            .executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"), ey.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                eq.a("color")
                                                   .then(
                                                      eq.a("value", ex.a()).executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"), ex.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             eq.a("friendlyFire")
                                                .then(
                                                   eq.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ep)$$0x.getSource(), gb.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          eq.a("seeFriendlyInvisibles")
                                             .then(
                                                eq.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("nametagVisibility")
                                                   .then(eq.a("never").executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"), ewz.b.b))))
                                                .then(eq.a("hideForOtherTeams").executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"), ewz.b.c))))
                                             .then(eq.a("hideForOwnTeam").executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"), ewz.b.d))))
                                          .then(eq.a("always").executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"), ewz.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("deathMessageVisibility")
                                                .then(eq.a("never").executes($$0x -> b((ep)$$0x.getSource(), gb.a($$0x, "team"), ewz.b.b))))
                                             .then(eq.a("hideForOtherTeams").executes($$0x -> b((ep)$$0x.getSource(), gb.a($$0x, "team"), ewz.b.c))))
                                          .then(eq.a("hideForOwnTeam").executes($$0x -> b((ep)$$0x.getSource(), gb.a($$0x, "team"), ewz.b.d))))
                                       .then(eq.a("always").executes($$0x -> b((ep)$$0x.getSource(), gb.a($$0x, "team"), ewz.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("collisionRule")
                                             .then(eq.a("never").executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"), ewz.a.b))))
                                          .then(eq.a("pushOwnTeam").executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"), ewz.a.d))))
                                       .then(eq.a("pushOtherTeams").executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"), ewz.a.c))))
                                    .then(eq.a("always").executes($$0x -> a((ep)$$0x.getSource(), gb.a($$0x, "team"), ewz.a.a)))
                              ))
                           .then(
                              eq.a("prefix")
                                 .then(eq.a("prefix", ey.a($$1)).executes($$0x -> b((ep)$$0x.getSource(), gb.a($$0x, "team"), ey.a($$0x, "prefix"))))
                           ))
                        .then(
                           eq.a("suffix").then(eq.a("suffix", ey.a($$1)).executes($$0x -> c((ep)$$0x.getSource(), gb.a($$0x, "team"), ey.a($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static xp a(Collection<eww> $$0) {
      return $$0.iterator().next().he();
   }

   private static int a(ep $$0, Collection<eww> $$1) {
      ewx $$2 = $$0.l().aK();

      for (eww $$3 : $$1) {
         $$2.d($$3.cB());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xp.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> xp.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ep $$0, ews $$1, Collection<eww> $$2) {
      ewx $$3 = $$0.l().aK();

      for (eww $$4 : $$2) {
         $$3.a($$4.cB(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> xp.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> xp.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(ep $$0, ews $$1, ewz.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xp.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(ep $$0, ews $$1, ewz.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xp.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(ep $$0, ews $$1, ewz.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xp.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ep $$0, ews $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> xp.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(ep $$0, ews $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> xp.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(ep $$0, ews $$1, xp $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xp.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(ep $$0, ews $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xp.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ep $$0, ews $$1) throws CommandSyntaxException {
      ewx $$2 = $$0.l().aK();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> xp.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(ep $$0, ews $$1) {
      ewx $$2 = $$0.l().aK();
      $$2.d($$1);
      $$0.a(() -> xp.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(ep $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, xp.b($$1));
   }

   private static int a(ep $$0, String $$1, xp $$2) throws CommandSyntaxException {
      ewx $$3 = $$0.l().aK();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         ews $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> xp.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(ep $$0, ews $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> xp.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> xp.a("commands.team.list.members.success", $$1.d(), $$2.size(), xs.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ep $$0) {
      Collection<ews> $$1 = $$0.l().aK().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> xp.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> xp.a("commands.team.list.teams.success", $$1.size(), xs.b($$1, ews::d)), false);
      }

      return $$1.size();
   }

   private static int b(ep $$0, ews $$1, xp $$2) {
      $$1.b($$2);
      $$0.a(() -> xp.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ep $$0, ews $$1, xp $$2) {
      $$1.c($$2);
      $$0.a(() -> xp.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
