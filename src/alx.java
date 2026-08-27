import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.Collections;

public class alx {
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("commands.bossbar.create.failed", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wx.b("commands.bossbar.unknown", $$0));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wx.c("commands.bossbar.set.players.unchanged"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wx.c("commands.bossbar.set.name.unchanged"));
   private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(wx.c("commands.bossbar.set.color.unchanged"));
   private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType(wx.c("commands.bossbar.set.style.unchanged"));
   private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType(wx.c("commands.bossbar.set.value.unchanged"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(wx.c("commands.bossbar.set.max.unchanged"));
   private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType(wx.c("commands.bossbar.set.visibility.unchanged.hidden"));
   private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType(wx.c("commands.bossbar.set.visibility.unchanged.visible"));
   public static final SuggestionProvider<ee> a = ($$0, $$1) -> ej.a(((ee)$$0.getSource()).l().aN().a(), $$1);

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a(
                              "bossbar"
                           )
                           .requires($$0x -> $$0x.c(2)))
                        .then(
                           ef.a("add")
                              .then(
                                 ef.a("id", ff.a())
                                    .then(ef.a("name", en.a($$1)).executes($$0x -> a((ee)$$0x.getSource(), ff.c($$0x, "id"), en.a($$0x, "name"))))
                              )
                        ))
                     .then(ef.a("remove").then(ef.a("id", ff.a()).suggests(a).executes($$0x -> e((ee)$$0x.getSource(), a($$0x))))))
                  .then(ef.a("list").executes($$0x -> a((ee)$$0x.getSource()))))
               .then(
                  ef.a("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a(
                                                "id", ff.a()
                                             )
                                             .suggests(a)
                                             .then(
                                                ef.a("name")
                                                   .then(ef.a("name", en.a($$1)).executes($$0x -> a((ee)$$0x.getSource(), a($$0x), en.a($$0x, "name"))))
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a(
                                                                     "color"
                                                                  )
                                                                  .then(ef.a("pink").executes($$0x -> a((ee)$$0x.getSource(), a($$0x), bpk.a.a))))
                                                               .then(ef.a("blue").executes($$0x -> a((ee)$$0x.getSource(), a($$0x), bpk.a.b))))
                                                            .then(ef.a("red").executes($$0x -> a((ee)$$0x.getSource(), a($$0x), bpk.a.c))))
                                                         .then(ef.a("green").executes($$0x -> a((ee)$$0x.getSource(), a($$0x), bpk.a.d))))
                                                      .then(ef.a("yellow").executes($$0x -> a((ee)$$0x.getSource(), a($$0x), bpk.a.e))))
                                                   .then(ef.a("purple").executes($$0x -> a((ee)$$0x.getSource(), a($$0x), bpk.a.f))))
                                                .then(ef.a("white").executes($$0x -> a((ee)$$0x.getSource(), a($$0x), bpk.a.g)))
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("style")
                                                         .then(ef.a("progress").executes($$0x -> a((ee)$$0x.getSource(), a($$0x), bpk.b.a))))
                                                      .then(ef.a("notched_6").executes($$0x -> a((ee)$$0x.getSource(), a($$0x), bpk.b.b))))
                                                   .then(ef.a("notched_10").executes($$0x -> a((ee)$$0x.getSource(), a($$0x), bpk.b.c))))
                                                .then(ef.a("notched_12").executes($$0x -> a((ee)$$0x.getSource(), a($$0x), bpk.b.d))))
                                             .then(ef.a("notched_20").executes($$0x -> a((ee)$$0x.getSource(), a($$0x), bpk.b.e)))
                                       ))
                                    .then(
                                       ef.a("value")
                                          .then(
                                             ef.a("value", IntegerArgumentType.integer(0))
                                                .executes($$0x -> a((ee)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "value")))
                                          )
                                    ))
                                 .then(
                                    ef.a("max")
                                       .then(
                                          ef.a("max", IntegerArgumentType.integer(1))
                                             .executes($$0x -> b((ee)$$0x.getSource(), a($$0x), IntegerArgumentType.getInteger($$0x, "max")))
                                       )
                                 ))
                              .then(
                                 ef.a("visible")
                                    .then(
                                       ef.a("visible", BoolArgumentType.bool())
                                          .executes($$0x -> a((ee)$$0x.getSource(), a($$0x), BoolArgumentType.getBool($$0x, "visible")))
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)ef.a("players").executes($$0x -> a((ee)$$0x.getSource(), a($$0x), Collections.emptyList())))
                                 .then(ef.a("targets", er.d()).executes($$0x -> a((ee)$$0x.getSource(), a($$0x), er.d($$0x, "targets"))))
                           )
                     )
               ))
            .then(
               ef.a("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("id", ff.a())
                                 .suggests(a)
                                 .then(ef.a("value").executes($$0x -> a((ee)$$0x.getSource(), a($$0x)))))
                              .then(ef.a("max").executes($$0x -> b((ee)$$0x.getSource(), a($$0x)))))
                           .then(ef.a("visible").executes($$0x -> c((ee)$$0x.getSource(), a($$0x)))))
                        .then(ef.a("players").executes($$0x -> d((ee)$$0x.getSource(), a($$0x))))
                  )
            )
      );
   }

   private static int a(ee $$0, alm $$1) {
      $$0.a(() -> wx.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
      return $$1.c();
   }

   private static int b(ee $$0, alm $$1) {
      $$0.a(() -> wx.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
      return $$1.d();
   }

   private static int c(ee $$0, alm $$1) {
      if ($$1.f()) {
         $$0.a(() -> wx.a("commands.bossbar.get.visible.visible", $$1.e()), true);
         return 1;
      } else {
         $$0.a(() -> wx.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
         return 0;
      }
   }

   private static int d(ee $$0, alm $$1) {
      if ($$1.g().isEmpty()) {
         $$0.a(() -> wx.a("commands.bossbar.get.players.none", $$1.e()), true);
      } else {
         $$0.a(() -> wx.a("commands.bossbar.get.players.some", $$1.e(), $$1.g().size(), xa.b($$1.g(), clw::O_)), true);
      }

      return $$1.g().size();
   }

   private static int a(ee $$0, alm $$1, boolean $$2) throws CommandSyntaxException {
      if ($$1.f() == $$2) {
         if ($$2) {
            throw k.create();
         } else {
            throw j.create();
         }
      } else {
         $$1.d($$2);
         if ($$2) {
            $$0.a(() -> wx.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
         } else {
            $$0.a(() -> wx.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
         }

         return 0;
      }
   }

   private static int a(ee $$0, alm $$1, int $$2) throws CommandSyntaxException {
      if ($$1.c() == $$2) {
         throw h.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wx.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int b(ee $$0, alm $$1, int $$2) throws CommandSyntaxException {
      if ($$1.d() == $$2) {
         throw i.create();
      } else {
         $$1.b($$2);
         $$0.a(() -> wx.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
         return $$2;
      }
   }

   private static int a(ee $$0, alm $$1, bpk.a $$2) throws CommandSyntaxException {
      if ($$1.k().equals($$2)) {
         throw f.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wx.a("commands.bossbar.set.color.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ee $$0, alm $$1, bpk.b $$2) throws CommandSyntaxException {
      if ($$1.l().equals($$2)) {
         throw g.create();
      } else {
         $$1.a($$2);
         $$0.a(() -> wx.a("commands.bossbar.set.style.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ee $$0, alm $$1, wx $$2) throws CommandSyntaxException {
      wx $$3 = xa.a($$0, $$2, null, 0);
      if ($$1.i().equals($$3)) {
         throw e.create();
      } else {
         $$1.a($$3);
         $$0.a(() -> wx.a("commands.bossbar.set.name.success", $$1.e()), true);
         return 0;
      }
   }

   private static int a(ee $$0, alm $$1, Collection<aqn> $$2) throws CommandSyntaxException {
      boolean $$3 = $$1.a($$2);
      if (!$$3) {
         throw d.create();
      } else {
         if ($$1.g().isEmpty()) {
            $$0.a(() -> wx.a("commands.bossbar.set.players.success.none", $$1.e()), true);
         } else {
            $$0.a(() -> wx.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), xa.b($$2, clw::O_)), true);
         }

         return $$1.g().size();
      }
   }

   private static int a(ee $$0) {
      Collection<alm> $$1 = $$0.l().aN().b();
      if ($$1.isEmpty()) {
         $$0.a(() -> wx.c("commands.bossbar.list.bars.none"), false);
      } else {
         $$0.a(() -> wx.a("commands.bossbar.list.bars.some", $$1.size(), xa.b($$1, alm::e)), false);
      }

      return $$1.size();
   }

   private static int a(ee $$0, akm $$1, wx $$2) throws CommandSyntaxException {
      aln $$3 = $$0.l().aN();
      if ($$3.a($$1) != null) {
         throw b.create($$1.toString());
      } else {
         alm $$4 = $$3.a($$1, xa.a($$0, $$2, null, 0));
         $$0.a(() -> wx.a("commands.bossbar.create.success", $$4.e()), true);
         return $$3.b().size();
      }
   }

   private static int e(ee $$0, alm $$1) {
      aln $$2 = $$0.l().aN();
      $$1.b();
      $$2.a($$1);
      $$0.a(() -> wx.a("commands.bossbar.remove.success", $$1.e()), true);
      return $$2.b().size();
   }

   public static alm a(CommandContext<ee> $$0) throws CommandSyntaxException {
      akm $$1 = ff.c($$0, "id");
      alm $$2 = ((ee)$$0.getSource()).l().aN().a($$1);
      if ($$2 == null) {
         throw c.create($$1.toString());
      } else {
         return $$2;
      }
   }
}
