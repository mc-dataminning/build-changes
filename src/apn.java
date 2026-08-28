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
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.team.add.duplicate"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xl.c("commands.team.option.name.unchanged"));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xl.c("commands.team.option.color.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xl.c("commands.team.option.friendlyfire.alreadyEnabled"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(xl.c("commands.team.option.friendlyfire.alreadyDisabled"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(xl.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(xl.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(xl.c("commands.team.option.nametagVisibility.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(xl.c("commands.team.option.deathMessageVisibility.unchanged"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(xl.c("commands.team.option.collisionRule.unchanged"));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a(
                                    "team"
                                 )
                                 .requires($$0x -> $$0x.c(2)))
                              .then(
                                 ((LiteralArgumentBuilder)ex.a("list").executes($$0x -> a((ew)$$0x.getSource())))
                                    .then(ex.a("team", gi.a()).executes($$0x -> c((ew)$$0x.getSource(), gi.a($$0x, "team"))))
                              ))
                           .then(
                              ex.a("add")
                                 .then(
                                    ((RequiredArgumentBuilder)ex.a("team", StringArgumentType.word())
                                          .executes($$0x -> a((ew)$$0x.getSource(), StringArgumentType.getString($$0x, "team"))))
                                       .then(
                                          ex.a("displayName", ff.a($$1))
                                             .executes($$0x -> a((ew)$$0x.getSource(), StringArgumentType.getString($$0x, "team"), ff.a($$0x, "displayName")))
                                       )
                                 )
                           ))
                        .then(ex.a("remove").then(ex.a("team", gi.a()).executes($$0x -> b((ew)$$0x.getSource(), gi.a($$0x, "team"))))))
                     .then(ex.a("empty").then(ex.a("team", gi.a()).executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"))))))
                  .then(
                     ex.a("join")
                        .then(
                           ((RequiredArgumentBuilder)ex.a("team", gi.a())
                                 .executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"), Collections.singleton(((ew)$$0x.getSource()).g()))))
                              .then(ex.a("members", gb.b()).suggests(gb.a).executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"), gb.c($$0x, "members"))))
                        )
                  ))
               .then(ex.a("leave").then(ex.a("members", gb.b()).suggests(gb.a).executes($$0x -> a((ew)$$0x.getSource(), gb.c($$0x, "members"))))))
            .then(
               ex.a("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a(
                                                   "team", gi.a()
                                                )
                                                .then(
                                                   ex.a("displayName")
                                                      .then(
                                                         ex.a("displayName", ff.a($$1))
                                                            .executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"), ff.a($$0x, "displayName")))
                                                      )
                                                ))
                                             .then(
                                                ex.a("color")
                                                   .then(
                                                      ex.a("value", fe.a()).executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"), fe.a($$0x, "value")))
                                                   )
                                             ))
                                          .then(
                                             ex.a("friendlyFire")
                                                .then(
                                                   ex.a("allowed", BoolArgumentType.bool())
                                                      .executes($$0x -> b((ew)$$0x.getSource(), gi.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                                )
                                          ))
                                       .then(
                                          ex.a("seeFriendlyInvisibles")
                                             .then(
                                                ex.a("allowed", BoolArgumentType.bool())
                                                   .executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"), BoolArgumentType.getBool($$0x, "allowed")))
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("nametagVisibility")
                                                   .then(ex.a("never").executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"), fay.b.b))))
                                                .then(ex.a("hideForOtherTeams").executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"), fay.b.c))))
                                             .then(ex.a("hideForOwnTeam").executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"), fay.b.d))))
                                          .then(ex.a("always").executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"), fay.b.a)))
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("deathMessageVisibility")
                                                .then(ex.a("never").executes($$0x -> b((ew)$$0x.getSource(), gi.a($$0x, "team"), fay.b.b))))
                                             .then(ex.a("hideForOtherTeams").executes($$0x -> b((ew)$$0x.getSource(), gi.a($$0x, "team"), fay.b.c))))
                                          .then(ex.a("hideForOwnTeam").executes($$0x -> b((ew)$$0x.getSource(), gi.a($$0x, "team"), fay.b.d))))
                                       .then(ex.a("always").executes($$0x -> b((ew)$$0x.getSource(), gi.a($$0x, "team"), fay.b.a)))
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("collisionRule")
                                             .then(ex.a("never").executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"), fay.a.b))))
                                          .then(ex.a("pushOwnTeam").executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"), fay.a.d))))
                                       .then(ex.a("pushOtherTeams").executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"), fay.a.c))))
                                    .then(ex.a("always").executes($$0x -> a((ew)$$0x.getSource(), gi.a($$0x, "team"), fay.a.a)))
                              ))
                           .then(
                              ex.a("prefix")
                                 .then(ex.a("prefix", ff.a($$1)).executes($$0x -> b((ew)$$0x.getSource(), gi.a($$0x, "team"), ff.a($$0x, "prefix"))))
                           ))
                        .then(
                           ex.a("suffix").then(ex.a("suffix", ff.a($$1)).executes($$0x -> c((ew)$$0x.getSource(), gi.a($$0x, "team"), ff.a($$0x, "suffix"))))
                        )
                  )
            )
      );
   }

   private static xl a(Collection<fav> $$0) {
      return $$0.iterator().next().hk();
   }

   private static int a(ew $$0, Collection<fav> $$1) {
      faw $$2 = $$0.l().aJ();

      for (fav $$3 : $$1) {
         $$2.d($$3.cK());
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.team.leave.success.single", a($$1)), true);
      } else {
         $$0.a(() -> xl.a("commands.team.leave.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, far $$1, Collection<fav> $$2) {
      faw $$3 = $$0.l().aJ();

      for (fav $$4 : $$2) {
         $$3.a($$4.cK(), $$1);
      }

      if ($$2.size() == 1) {
         $$0.a(() -> xl.a("commands.team.join.success.single", a($$2), $$1.d()), true);
      } else {
         $$0.a(() -> xl.a("commands.team.join.success.multiple", $$2.size(), $$1.d()), true);
      }

      return $$2.size();
   }

   private static int a(ew $$0, far $$1, fay.b $$2) throws CommandSyntaxException {
      if ($$1.j() == $$2) {
         throw i.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xl.a("commands.team.option.nametagVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int b(ew $$0, far $$1, fay.b $$2) throws CommandSyntaxException {
      if ($$1.k() == $$2) {
         throw j.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> xl.a("commands.team.option.deathMessageVisibility.success", $$1.d(), $$2.b()), true);
         return 0;
      }
   }

   private static int a(ew $$0, far $$1, fay.a $$2) throws CommandSyntaxException {
      if ($$1.l() == $$2) {
         throw k.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xl.a("commands.team.option.collisionRule.success", $$1.d(), $$2.a()), true);
         return 0;
      }
   }

   private static int a(ew $$0, far $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.i() == $$2) {
         if ($$2) {
            throw g.create();
         } else {
            throw h.create();
         }
      } else {
         $$1.b($$2);
         $$0.a(() -> xl.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int b(ew $$0, far $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.h() == $$2) {
         if ($$2) {
            throw e.create();
         } else {
            throw f.create();
         }
      } else {
         $$1.a($$2);
         $$0.a(() -> xl.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.d()), true);
         return 0;
      }
   }

   private static int a(ew $$0, far $$1, xl $$2) throws CommandSyntaxException {
      if ($$1.c().equals($$2)) {
         throw c.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xl.a("commands.team.option.name.success", $$1.d()), true);
         return 0;
      }
   }

   private static int a(ew $$0, far $$1, n $$2) throws CommandSyntaxException {
      if ($$1.n() == $$2) {
         throw d.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> xl.a("commands.team.option.color.success", $$1.d(), $$2.g()), true);
         return 0;
      }
   }

   private static int a(ew $$0, far $$1) throws CommandSyntaxException {
      faw $$2 = $$0.l().aJ();
      Collection<String> $$3 = Lists.newArrayList($$1.g());
      if ($$3.isEmpty()) {
         throw b.create();
      } else {
         for (String $$4 : $$3) {
            $$2.b($$4, $$1);
         }

         $$0.a(() -> xl.a("commands.team.empty.success", $$3.size(), $$1.d()), true);
         return $$3.size();
      }
   }

   private static int b(ew $$0, far $$1) {
      faw $$2 = $$0.l().aJ();
      $$2.d($$1);
      $$0.a(() -> xl.a("commands.team.remove.success", $$1.d()), true);
      return $$2.g().size();
   }

   private static int a(ew $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, xl.b($$1));
   }

   private static int a(ew $$0, String $$1, xl $$2) throws CommandSyntaxException {
      faw $$3 = $$0.l().aJ();
      if ($$3.b($$1) != null) {
         throw a.create();
      } else {
         far $$4 = $$3.c($$1);
         $$4.a($$2);
         $$0.a(() -> xl.a("commands.team.add.success", $$4.d()), true);
         return $$3.g().size();
      }
   }

   private static int c(ew $$0, far $$1) {
      Collection<String> $$2 = $$1.g();
      if ($$2.isEmpty()) {
         $$0.a(() -> xl.a("commands.team.list.members.empty", $$1.d()), false);
      } else {
         $$0.a(() -> xl.a("commands.team.list.members.success", $$1.d(), $$2.size(), xo.a($$2)), false);
      }

      return $$2.size();
   }

   private static int a(ew $$0) {
      Collection<far> $$1 = $$0.l().aJ().g();
      if ($$1.isEmpty()) {
         $$0.a(() -> xl.c("commands.team.list.teams.empty"), false);
      } else {
         $$0.a(() -> xl.a("commands.team.list.teams.success", $$1.size(), xo.b($$1, far::d)), false);
      }

      return $$1.size();
   }

   private static int b(ew $$0, far $$1, xl $$2) {
      $$1.b($$2);
      $$0.a(() -> xl.a("commands.team.option.prefix.success", $$2), false);
      return 1;
   }

   private static int c(ew $$0, far $$1, xl $$2) {
      $$1.c($$2);
      $$0.a(() -> xl.a("commands.team.option.suffix.success", $$2), false);
      return 1;
   }
}
