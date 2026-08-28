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

public class apl {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wy.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wy.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wy.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wy.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wy.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wy.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(wy.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(wy.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)ej.a("list").executes($$0x -> a((ei)$$0x.getSource())))
                                    .then(ej.a("team", fv.a()).executes($$0x -> c((ei)$$0x.getSource(), fv.a($$0x, "team"))))
                              ))
                           .then(
                              ej.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)ej.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ei)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          ej.a("displayName", er.a($$1))
                                             .executes($$0x -> a((ei)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), er.b($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(ej.a("remove").then(ej.a("team", fv.a()).executes($$0x -> b((ei)$$0x.getSource(), fv.a($$0x, "team"))))))
                     .then(ej.a("empty").then(ej.a("team", fv.a()).executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"))))))
                  .then(
                     ej.a("join")
                        .then(
                           ((RequiredArgumentBuilder)ej.a("team", fv.a())
                                 .executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"), Collections.singleton(((ei)$$0x.getSource()).g()))))
                              .then(ej.a("members", fo.b()).suggests(fo.a).executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"), fo.c($$0x, "members"))))
                        )
                  ))
               .then(ej.a("leave").then(ej.a("members", fo.b()).suggests(fo.a).executes($$0x -> a((ei)$$0x.getSource(), fo.c($$0x, "members"))))))
            .then(
               ej.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a(
                                                   "team", fv.a()
                                                )
                                                .then(
                                                   ej.a("displayName")
                                                      .then(
                                                         ej.a("displayName", er.a($$1))
                                                            .executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"), er.b($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                ej.a("color")
                                                   .then(
                                                      ej.a("value", eq.a()).executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"), eq.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             ej.a("friendlyFire")
                                                .then(
                                                   ej.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ei)$$0x.getSource(), fv.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          ej.a("seeFriendlyInvisibles")
                                             .then(
                                                ej.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("nametagVisibility")
                                                   .then(ej.a("never").executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"), ffx.b.b))))
                                                .then(ej.a("hideForOtherTeams").executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"), ffx.b.c))))
                                             .then(ej.a("hideForOwnTeam").executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"), ffx.b.d))))
                                          .then(ej.a("always").executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"), ffx.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("deathMessageVisibility")
                                                .then(ej.a("never").executes($$0x -> b((ei)$$0x.getSource(), fv.a($$0x, "team"), ffx.b.b))))
                                             .then(ej.a("hideForOtherTeams").executes($$0x -> b((ei)$$0x.getSource(), fv.a($$0x, "team"), ffx.b.c))))
                                          .then(ej.a("hideForOwnTeam").executes($$0x -> b((ei)$$0x.getSource(), fv.a($$0x, "team"), ffx.b.d))))
                                       .then(ej.a("always").executes($$0x -> b((ei)$$0x.getSource(), fv.a($$0x, "team"), ffx.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("collisionRule")
                                             .then(ej.a("never").executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"), ffx.a.b))))
                                          .then(ej.a("pushOwnTeam").executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"), ffx.a.d))))
                                       .then(ej.a("pushOtherTeams").executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"), ffx.a.c))))
                                    .then(ej.a("always").executes($$0x -> a((ei)$$0x.getSource(), fv.a($$0x, "team"), ffx.a.a)))
                              ))
                           .then(
                              ej.a("prefix")
                                 .then(ej.a("prefix", er.a($$1)).executes($$0x -> b((ei)$$0x.getSource(), fv.a($$0x, "team"), er.b($$0x, "prefix"))))
                           ))
                        .then(
                           ej.a("suffix").then(ej.a("suffix", er.a($$1)).executes($$0x -> c((ei)$$0x.getSource(), fv.a($$0x, "team"), er.b($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static wy a(Collection<ffu> $$0) {
      return $$0.iterator().next().hd();
   }

   private static int a(ei $$0, Collection<ffu> $$1) {
      ffv $$2 = $$0.l().aJ();

      for (ffu $$3 : $$1) {
         $$2.d($$3.cI());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> wy.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ei $$0, ffq $$1, Collection<ffu> $$2) {
      ffv $$3 = $$0.l().aJ();

      for (ffu $$4 : $$2) {
         $$3.a($$4.cI(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> wy.a("commands.team.join.success.single", a($$2), $$1.e()), true);
      } else {
         $$0.a(() -> wy.a("commands.team.join.success.multiple", $$2.size(), $$1.e()), true);
      }

      return $$2.size();
   }

   private static int a(ei $$0, ffq $$1, ffx.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wy.a("commands.team.option.nametagVisibility.success", $$1.e(), $$2.a()), true);
         return 0;
      }
   }

   private static int b(ei $$0, ffq $$1, ffx.b $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> wy.a("commands.team.option.deathMessageVisibility.success", $$1.e(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ei $$0, ffq $$1, ffx.a $$2) throws CommandSyntaxException {
      if ($$1.m() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wy.a("commands.team.option.collisionRule.success", $$1.e(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ei $$0, ffq $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> wy.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.e()), true);
         return 0;
      }
   }

   private static int b(ei $$0, ffq $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> wy.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.e()), true);
         return 0;
      }
   }

   private static int a(ei $$0, ffq $$1, wy $$2) throws CommandSyntaxException {
      if ($$1.d().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wy.a("commands.team.option.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ei $$0, ffq $$1, n $$2) throws CommandSyntaxException {
      if ($$1.o() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wy.a("commands.team.option.color.success", $$1.e(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ei $$0, ffq $$1) throws CommandSyntaxException {
      ffv $$2 = $$0.l().aJ();
      Collection<String> $$3 = Lists.newArrayList($$1.h());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> wy.a("commands.team.empty.success", $$3.size(), $$1.e()), true);
         return $$3.size();
      }
   }

   private static int b(ei $$0, ffq $$1) {
      ffv $$2 = $$0.l().aJ();
      $$2.d($$1);
      $$0.a(() -> wy.a("commands.team.remove.success", $$1.e()), true);
      return $$2.f().size();
   }

   private static int a(ei $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, wy.b($$1));
   }

   private static int a(ei $$0, String $$1, wy $$2) throws CommandSyntaxException {
      ffv $$3 = $$0.l().aJ();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         ffq $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> wy.a("commands.team.add.success", $$4.e()), true);
         return $$3.f().size();
      }
   }

   private static int c(ei $$0, ffq $$1) {
      Collection<String> $$2 = $$1.h();
      if ($$2.isEmpty()) {
         $$0.a(() -> wy.a("commands.team.list.members.empty", $$1.e()), false);
      } else {
         $$0.a(() -> wy.a("commands.team.list.members.success", $$1.e(), $$2.size(), xb.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ei $$0) {
      Collection<ffq> $$1 = $$0.l().aJ().f();
      if ($$1.isEmpty()) {
         $$0.a(() -> wy.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> wy.a("commands.team.list.teams.success", $$1.size(), xb.b($$1, ffq::e)), false);
      }

      return $$1.size();
   }

   private static int b(ei $$0, ffq $$1, wy $$2) {
      $$1.b($$2);
      $$0.a(() -> wy.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ei $$0, ffq $$1, wy $$2) {
      $$1.c($$2);
      $$0.a(() -> wy.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
