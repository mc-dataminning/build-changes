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

public class app {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xc.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xc.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xc.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xc.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xc.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xc.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xc.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xc.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xc.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xc.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xc.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)el.a("list").executes($$0x -> a((ek)$$0x.getSource())))
                                    .then(el.a("team", fx.a()).executes($$0x -> c((ek)$$0x.getSource(), fx.a($$0x, "team"))))
                              ))
                           .then(
                              el.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)el.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ek)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          el.a("displayName", et.a($$1))
                                             .executes($$0x -> a((ek)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), et.b($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(el.a("remove").then(el.a("team", fx.a()).executes($$0x -> b((ek)$$0x.getSource(), fx.a($$0x, "team"))))))
                     .then(el.a("empty").then(el.a("team", fx.a()).executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"))))))
                  .then(
                     el.a("join")
                        .then(
                           ((RequiredArgumentBuilder)el.a("team", fx.a())
                                 .executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"), Collections.singleton(((ek)$$0x.getSource()).g()))))
                              .then(el.a("members", fq.b()).suggests(fq.a).executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"), fq.c($$0x, "members"))))
                        )
                  ))
               .then(el.a("leave").then(el.a("members", fq.b()).suggests(fq.a).executes($$0x -> a((ek)$$0x.getSource(), fq.c($$0x, "members"))))))
            .then(
               el.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a(
                                                   "team", fx.a()
                                                )
                                                .then(
                                                   el.a("displayName")
                                                      .then(
                                                         el.a("displayName", et.a($$1))
                                                            .executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"), et.b($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                el.a("color")
                                                   .then(
                                                      el.a("value", es.a()).executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"), es.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             el.a("friendlyFire")
                                                .then(
                                                   el.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ek)$$0x.getSource(), fx.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          el.a("seeFriendlyInvisibles")
                                             .then(
                                                el.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("nametagVisibility")
                                                   .then(el.a("never").executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"), fgz.b.b))))
                                                .then(el.a("hideForOtherTeams").executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"), fgz.b.c))))
                                             .then(el.a("hideForOwnTeam").executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"), fgz.b.d))))
                                          .then(el.a("always").executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"), fgz.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("deathMessageVisibility")
                                                .then(el.a("never").executes($$0x -> b((ek)$$0x.getSource(), fx.a($$0x, "team"), fgz.b.b))))
                                             .then(el.a("hideForOtherTeams").executes($$0x -> b((ek)$$0x.getSource(), fx.a($$0x, "team"), fgz.b.c))))
                                          .then(el.a("hideForOwnTeam").executes($$0x -> b((ek)$$0x.getSource(), fx.a($$0x, "team"), fgz.b.d))))
                                       .then(el.a("always").executes($$0x -> b((ek)$$0x.getSource(), fx.a($$0x, "team"), fgz.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("collisionRule")
                                             .then(el.a("never").executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"), fgz.a.b))))
                                          .then(el.a("pushOwnTeam").executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"), fgz.a.d))))
                                       .then(el.a("pushOtherTeams").executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"), fgz.a.c))))
                                    .then(el.a("always").executes($$0x -> a((ek)$$0x.getSource(), fx.a($$0x, "team"), fgz.a.a)))
                              ))
                           .then(
                              el.a("prefix")
                                 .then(el.a("prefix", et.a($$1)).executes($$0x -> b((ek)$$0x.getSource(), fx.a($$0x, "team"), et.b($$0x, "prefix"))))
                           ))
                        .then(
                           el.a("suffix").then(el.a("suffix", et.a($$1)).executes($$0x -> c((ek)$$0x.getSource(), fx.a($$0x, "team"), et.b($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static xc a(Collection<fgw> $$0) {
      return $$0.iterator().next().hg();
   }

   private static int a(ek $$0, Collection<fgw> $$1) {
      fgx $$2 = $$0.l().aJ();

      for (fgw $$3 : $$1) {
         $$2.d($$3.cI());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xc.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> xc.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, fgs $$1, Collection<fgw> $$2) {
      fgx $$3 = $$0.l().aJ();

      for (fgw $$4 : $$2) {
         $$3.a($$4.cI(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> xc.a("commands.team.join.success.single", a($$2), $$1.e()), true);
      } else {
         $$0.a(() -> xc.a("commands.team.join.success.multiple", $$2.size(), $$1.e()), true);
      }

      return $$2.size();
   }

   private static int a(ek $$0, fgs $$1, fgz.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xc.a("commands.team.option.nametagVisibility.success", $$1.e(), $$2.a()), true);
         return 0;
      }
   }

   private static int b(ek $$0, fgs $$1, fgz.b $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xc.a("commands.team.option.deathMessageVisibility.success", $$1.e(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fgs $$1, fgz.a $$2) throws CommandSyntaxException {
      if ($$1.m() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xc.a("commands.team.option.collisionRule.success", $$1.e(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fgs $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> xc.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.e()), true);
         return 0;
      }
   }

   private static int b(ek $$0, fgs $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> xc.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.e()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fgs $$1, xc $$2) throws CommandSyntaxException {
      if ($$1.d().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xc.a("commands.team.option.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fgs $$1, o $$2) throws CommandSyntaxException {
      if ($$1.o() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xc.a("commands.team.option.color.success", $$1.e(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ek $$0, fgs $$1) throws CommandSyntaxException {
      fgx $$2 = $$0.l().aJ();
      Collection<String> $$3 = Lists.newArrayList($$1.h());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> xc.a("commands.team.empty.success", $$3.size(), $$1.e()), true);
         return $$3.size();
      }
   }

   private static int b(ek $$0, fgs $$1) {
      fgx $$2 = $$0.l().aJ();
      $$2.d($$1);
      $$0.a(() -> xc.a("commands.team.remove.success", $$1.e()), true);
      return $$2.f().size();
   }

   private static int a(ek $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, xc.b($$1));
   }

   private static int a(ek $$0, String $$1, xc $$2) throws CommandSyntaxException {
      fgx $$3 = $$0.l().aJ();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         fgs $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> xc.a("commands.team.add.success", $$4.e()), true);
         return $$3.f().size();
      }
   }

   private static int c(ek $$0, fgs $$1) {
      Collection<String> $$2 = $$1.h();
      if ($$2.isEmpty()) {
         $$0.a(() -> xc.a("commands.team.list.members.empty", $$1.e()), false);
      } else {
         $$0.a(() -> xc.a("commands.team.list.members.success", $$1.e(), $$2.size(), xf.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ek $$0) {
      Collection<fgs> $$1 = $$0.l().aJ().f();
      if ($$1.isEmpty()) {
         $$0.a(() -> xc.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> xc.a("commands.team.list.teams.success", $$1.size(), xf.b($$1, fgs::e)), false);
      }

      return $$1.size();
   }

   private static int b(ek $$0, fgs $$1, xc $$2) {
      $$1.b($$2);
      $$0.a(() -> xc.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ek $$0, fgs $$1, xc $$2) {
      $$1.c($$2);
      $$0.a(() -> xc.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
