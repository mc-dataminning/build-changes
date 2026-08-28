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

public class apj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xh.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xh.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xh.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xh.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xh.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xh.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xh.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xh.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xh.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)ew.a("list").executes($$0x -> a((ev)$$0x.getSource())))
                                    .then(ew.a("team", gh.a()).executes($$0x -> c((ev)$$0x.getSource(), gh.a($$0x, "team"))))
                              ))
                           .then(
                              ew.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)ew.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ev)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          ew.a("displayName", fe.a($$1))
                                             .executes($$0x -> a((ev)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), fe.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(ew.a("remove").then(ew.a("team", gh.a()).executes($$0x -> b((ev)$$0x.getSource(), gh.a($$0x, "team"))))))
                     .then(ew.a("empty").then(ew.a("team", gh.a()).executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"))))))
                  .then(
                     ew.a("join")
                        .then(
                           ((RequiredArgumentBuilder)ew.a("team", gh.a())
                                 .executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"), Collections.singleton(((ev)$$0x.getSource()).g()))))
                              .then(ew.a("members", ga.b()).suggests(ga.a).executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"), ga.c($$0x, "members"))))
                        )
                  ))
               .then(ew.a("leave").then(ew.a("members", ga.b()).suggests(ga.a).executes($$0x -> a((ev)$$0x.getSource(), ga.c($$0x, "members"))))))
            .then(
               ew.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a(
                                                   "team", gh.a()
                                                )
                                                .then(
                                                   ew.a("displayName")
                                                      .then(
                                                         ew.a("displayName", fe.a($$1))
                                                            .executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"), fe.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                ew.a("color")
                                                   .then(
                                                      ew.a("value", fd.a()).executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"), fd.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             ew.a("friendlyFire")
                                                .then(
                                                   ew.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ev)$$0x.getSource(), gh.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          ew.a("seeFriendlyInvisibles")
                                             .then(
                                                ew.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("nametagVisibility")
                                                   .then(ew.a("never").executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"), fao.b.b))))
                                                .then(ew.a("hideForOtherTeams").executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"), fao.b.c))))
                                             .then(ew.a("hideForOwnTeam").executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"), fao.b.d))))
                                          .then(ew.a("always").executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"), fao.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("deathMessageVisibility")
                                                .then(ew.a("never").executes($$0x -> b((ev)$$0x.getSource(), gh.a($$0x, "team"), fao.b.b))))
                                             .then(ew.a("hideForOtherTeams").executes($$0x -> b((ev)$$0x.getSource(), gh.a($$0x, "team"), fao.b.c))))
                                          .then(ew.a("hideForOwnTeam").executes($$0x -> b((ev)$$0x.getSource(), gh.a($$0x, "team"), fao.b.d))))
                                       .then(ew.a("always").executes($$0x -> b((ev)$$0x.getSource(), gh.a($$0x, "team"), fao.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("collisionRule")
                                             .then(ew.a("never").executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"), fao.a.b))))
                                          .then(ew.a("pushOwnTeam").executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"), fao.a.d))))
                                       .then(ew.a("pushOtherTeams").executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"), fao.a.c))))
                                    .then(ew.a("always").executes($$0x -> a((ev)$$0x.getSource(), gh.a($$0x, "team"), fao.a.a)))
                              ))
                           .then(
                              ew.a("prefix")
                                 .then(ew.a("prefix", fe.a($$1)).executes($$0x -> b((ev)$$0x.getSource(), gh.a($$0x, "team"), fe.a($$0x, "prefix"))))
                           ))
                        .then(
                           ew.a("suffix").then(ew.a("suffix", fe.a($$1)).executes($$0x -> c((ev)$$0x.getSource(), gh.a($$0x, "team"), fe.a($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static xh a(Collection<fal> $$0) {
      return $$0.iterator().next().hk();
   }

   private static int a(ev $$0, Collection<fal> $$1) {
      fam $$2 = $$0.l().aJ();

      for (fal $$3 : $$1) {
         $$2.d($$3.cJ());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> xh.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ev $$0, fah $$1, Collection<fal> $$2) {
      fam $$3 = $$0.l().aJ();

      for (fal $$4 : $$2) {
         $$3.a($$4.cJ(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> xh.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> xh.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(ev $$0, fah $$1, fao.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xh.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(ev $$0, fah $$1, fao.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xh.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(ev $$0, fah $$1, fao.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xh.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ev $$0, fah $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> xh.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(ev $$0, fah $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> xh.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(ev $$0, fah $$1, xh $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xh.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(ev $$0, fah $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xh.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ev $$0, fah $$1) throws CommandSyntaxException {
      fam $$2 = $$0.l().aJ();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> xh.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(ev $$0, fah $$1) {
      fam $$2 = $$0.l().aJ();
      $$2.d($$1);
      $$0.a(() -> xh.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(ev $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, xh.b($$1));
   }

   private static int a(ev $$0, String $$1, xh $$2) throws CommandSyntaxException {
      fam $$3 = $$0.l().aJ();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         fah $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> xh.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(ev $$0, fah $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> xh.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> xh.a("commands.team.list.members.success", $$1.d(), $$2.size(), xk.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ev $$0) {
      Collection<fah> $$1 = $$0.l().aJ().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> xh.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> xh.a("commands.team.list.teams.success", $$1.size(), xk.b($$1, fah::d)), false);
      }

      return $$1.size();
   }

   private static int b(ev $$0, fah $$1, xh $$2) {
      $$1.b($$2);
      $$0.a(() -> xh.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ev $$0, fah $$1, xh $$2) {
      $$1.c($$2);
      $$0.a(() -> xh.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
