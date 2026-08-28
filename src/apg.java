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

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)ev.a("list").executes($$0x -> a((eu)$$0x.getSource())))
                                    .then(ev.a("team", gg.a()).executes($$0x -> c((eu)$$0x.getSource(), gg.a($$0x, "team"))))
                              ))
                           .then(
                              ev.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)ev.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((eu)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          ev.a("displayName", fd.a($$1))
                                             .executes($$0x -> a((eu)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), fd.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(ev.a("remove").then(ev.a("team", gg.a()).executes($$0x -> b((eu)$$0x.getSource(), gg.a($$0x, "team"))))))
                     .then(ev.a("empty").then(ev.a("team", gg.a()).executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"))))))
                  .then(
                     ev.a("join")
                        .then(
                           ((RequiredArgumentBuilder)ev.a("team", gg.a())
                                 .executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"), Collections.singleton(((eu)$$0x.getSource()).g()))))
                              .then(ev.a("members", fz.b()).suggests(fz.a).executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"), fz.c($$0x, "members"))))
                        )
                  ))
               .then(ev.a("leave").then(ev.a("members", fz.b()).suggests(fz.a).executes($$0x -> a((eu)$$0x.getSource(), fz.c($$0x, "members"))))))
            .then(
               ev.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a(
                                                   "team", gg.a()
                                                )
                                                .then(
                                                   ev.a("displayName")
                                                      .then(
                                                         ev.a("displayName", fd.a($$1))
                                                            .executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"), fd.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                ev.a("color")
                                                   .then(
                                                      ev.a("value", fc.a()).executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"), fc.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             ev.a("friendlyFire")
                                                .then(
                                                   ev.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((eu)$$0x.getSource(), gg.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          ev.a("seeFriendlyInvisibles")
                                             .then(
                                                ev.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("nametagVisibility")
                                                   .then(ev.a("never").executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"), fad.b.b))))
                                                .then(ev.a("hideForOtherTeams").executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"), fad.b.c))))
                                             .then(ev.a("hideForOwnTeam").executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"), fad.b.d))))
                                          .then(ev.a("always").executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"), fad.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("deathMessageVisibility")
                                                .then(ev.a("never").executes($$0x -> b((eu)$$0x.getSource(), gg.a($$0x, "team"), fad.b.b))))
                                             .then(ev.a("hideForOtherTeams").executes($$0x -> b((eu)$$0x.getSource(), gg.a($$0x, "team"), fad.b.c))))
                                          .then(ev.a("hideForOwnTeam").executes($$0x -> b((eu)$$0x.getSource(), gg.a($$0x, "team"), fad.b.d))))
                                       .then(ev.a("always").executes($$0x -> b((eu)$$0x.getSource(), gg.a($$0x, "team"), fad.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("collisionRule")
                                             .then(ev.a("never").executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"), fad.a.b))))
                                          .then(ev.a("pushOwnTeam").executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"), fad.a.d))))
                                       .then(ev.a("pushOtherTeams").executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"), fad.a.c))))
                                    .then(ev.a("always").executes($$0x -> a((eu)$$0x.getSource(), gg.a($$0x, "team"), fad.a.a)))
                              ))
                           .then(
                              ev.a("prefix")
                                 .then(ev.a("prefix", fd.a($$1)).executes($$0x -> b((eu)$$0x.getSource(), gg.a($$0x, "team"), fd.a($$0x, "prefix"))))
                           ))
                        .then(
                           ev.a("suffix").then(ev.a("suffix", fd.a($$1)).executes($$0x -> c((eu)$$0x.getSource(), gg.a($$0x, "team"), fd.a($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static xe a(Collection<faa> $$0) {
      return $$0.iterator().next().he();
   }

   private static int a(eu $$0, Collection<faa> $$1) {
      fab $$2 = $$0.l().aJ();

      for (faa $$3 : $$1) {
         $$2.d($$3.cF());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> xe.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eu $$0, ezw $$1, Collection<faa> $$2) {
      fab $$3 = $$0.l().aJ();

      for (faa $$4 : $$2) {
         $$3.a($$4.cF(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> xe.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> xe.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(eu $$0, ezw $$1, fad.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(eu $$0, ezw $$1, fad.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xe.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(eu $$0, ezw $$1, fad.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(eu $$0, ezw $$1, boolean $$2) throws CommandSyntaxException {
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

   private static int b(eu $$0, ezw $$1, boolean $$2) throws CommandSyntaxException {
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

   private static int a(eu $$0, ezw $$1, xe $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(eu $$0, ezw $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xe.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(eu $$0, ezw $$1) throws CommandSyntaxException {
      fab $$2 = $$0.l().aJ();
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

   private static int b(eu $$0, ezw $$1) {
      fab $$2 = $$0.l().aJ();
      $$2.d($$1);
      $$0.a(() -> xe.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(eu $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, xe.b($$1));
   }

   private static int a(eu $$0, String $$1, xe $$2) throws CommandSyntaxException {
      fab $$3 = $$0.l().aJ();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         ezw $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> xe.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(eu $$0, ezw $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> xe.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> xe.a("commands.team.list.members.success", $$1.d(), $$2.size(), xh.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(eu $$0) {
      Collection<ezw> $$1 = $$0.l().aJ().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> xe.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> xe.a("commands.team.list.teams.success", $$1.size(), xh.b($$1, ezw::d)), false);
      }

      return $$1.size();
   }

   private static int b(eu $$0, ezw $$1, xe $$2) {
      $$1.b($$2);
      $$0.a(() -> xe.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(eu $$0, ezw $$1, xe $$2) {
      $$1.c($$2);
      $$0.a(() -> xe.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
