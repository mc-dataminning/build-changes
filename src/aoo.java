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

public class aoo {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wx.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wx.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wx.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wx.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wx.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wx.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wx.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(wx.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(wx.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)ef.a("list").executes($$0x -> a((ee)$$0x.getSource())))
                                    .then(ef.a("team", fq.a()).executes($$0x -> c((ee)$$0x.getSource(), fq.a($$0x, "team"))))
                              ))
                           .then(
                              ef.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)ef.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ee)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          ef.a("displayName", en.a($$1))
                                             .executes($$0x -> a((ee)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), en.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(ef.a("remove").then(ef.a("team", fq.a()).executes($$0x -> b((ee)$$0x.getSource(), fq.a($$0x, "team"))))))
                     .then(ef.a("empty").then(ef.a("team", fq.a()).executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"))))))
                  .then(
                     ef.a("join")
                        .then(
                           ((RequiredArgumentBuilder)ef.a("team", fq.a())
                                 .executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"), Collections.singleton(((ee)$$0x.getSource()).g()))))
                              .then(ef.a("members", fj.b()).suggests(fj.a).executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"), fj.c($$0x, "members"))))
                        )
                  ))
               .then(ef.a("leave").then(ef.a("members", fj.b()).suggests(fj.a).executes($$0x -> a((ee)$$0x.getSource(), fj.c($$0x, "members"))))))
            .then(
               ef.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a(
                                                   "team", fq.a()
                                                )
                                                .then(
                                                   ef.a("displayName")
                                                      .then(
                                                         ef.a("displayName", en.a($$1))
                                                            .executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"), en.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                ef.a("color")
                                                   .then(
                                                      ef.a("value", em.a()).executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"), em.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             ef.a("friendlyFire")
                                                .then(
                                                   ef.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ee)$$0x.getSource(), fq.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          ef.a("seeFriendlyInvisibles")
                                             .then(
                                                ef.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("nametagVisibility")
                                                   .then(ef.a("never").executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"), evs.b.b))))
                                                .then(ef.a("hideForOtherTeams").executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"), evs.b.c))))
                                             .then(ef.a("hideForOwnTeam").executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"), evs.b.d))))
                                          .then(ef.a("always").executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"), evs.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("deathMessageVisibility")
                                                .then(ef.a("never").executes($$0x -> b((ee)$$0x.getSource(), fq.a($$0x, "team"), evs.b.b))))
                                             .then(ef.a("hideForOtherTeams").executes($$0x -> b((ee)$$0x.getSource(), fq.a($$0x, "team"), evs.b.c))))
                                          .then(ef.a("hideForOwnTeam").executes($$0x -> b((ee)$$0x.getSource(), fq.a($$0x, "team"), evs.b.d))))
                                       .then(ef.a("always").executes($$0x -> b((ee)$$0x.getSource(), fq.a($$0x, "team"), evs.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("collisionRule")
                                             .then(ef.a("never").executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"), evs.a.b))))
                                          .then(ef.a("pushOwnTeam").executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"), evs.a.d))))
                                       .then(ef.a("pushOtherTeams").executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"), evs.a.c))))
                                    .then(ef.a("always").executes($$0x -> a((ee)$$0x.getSource(), fq.a($$0x, "team"), evs.a.a)))
                              ))
                           .then(
                              ef.a("prefix")
                                 .then(ef.a("prefix", en.a($$1)).executes($$0x -> b((ee)$$0x.getSource(), fq.a($$0x, "team"), en.a($$0x, "prefix"))))
                           ))
                        .then(
                           ef.a("suffix").then(ef.a("suffix", en.a($$1)).executes($$0x -> c((ee)$$0x.getSource(), fq.a($$0x, "team"), en.a($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static wx a(Collection<evp> $$0) {
      return $$0.iterator().next().hd();
   }

   private static int a(ee $$0, Collection<evp> $$1) {
      evq $$2 = $$0.l().aK();

      for (evp $$3 : $$1) {
         $$2.d($$3.cB());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> wx.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ee $$0, evl $$1, Collection<evp> $$2) {
      evq $$3 = $$0.l().aK();

      for (evp $$4 : $$2) {
         $$3.a($$4.cB(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> wx.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> wx.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(ee $$0, evl $$1, evs.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wx.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(ee $$0, evl $$1, evs.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> wx.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(ee $$0, evl $$1, evs.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wx.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ee $$0, evl $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> wx.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(ee $$0, evl $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> wx.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(ee $$0, evl $$1, wx $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wx.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(ee $$0, evl $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wx.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ee $$0, evl $$1) throws CommandSyntaxException {
      evq $$2 = $$0.l().aK();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> wx.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(ee $$0, evl $$1) {
      evq $$2 = $$0.l().aK();
      $$2.d($$1);
      $$0.a(() -> wx.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(ee $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, wx.b($$1));
   }

   private static int a(ee $$0, String $$1, wx $$2) throws CommandSyntaxException {
      evq $$3 = $$0.l().aK();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         evl $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> wx.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(ee $$0, evl $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> wx.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> wx.a("commands.team.list.members.success", $$1.d(), $$2.size(), xa.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ee $$0) {
      Collection<evl> $$1 = $$0.l().aK().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> wx.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> wx.a("commands.team.list.teams.success", $$1.size(), xa.b($$1, evl::d)), false);
      }

      return $$1.size();
   }

   private static int b(ee $$0, evl $$1, wx $$2) {
      $$1.b($$2);
      $$0.a(() -> wx.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ee $$0, evl $$1, wx $$2) {
      $$1.c($$2);
      $$0.a(() -> wx.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
