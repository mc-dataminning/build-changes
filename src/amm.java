import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class amm {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> (ww)$$0);
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> ww.b("commands.advancement.criterionNotFound", $$0, $$1)
   );

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("advancement").requires($$0x -> $$0x.c(2)))
               .then(
                  ej.a("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("targets", ev.d())
                                       .then(
                                          ej.a("only")
                                             .then(
                                                ((RequiredArgumentBuilder)ej.a("advancement", fi.a(mg.br))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ei)$$0x.getSource(),
                                                               ev.f($$0x, "targets"),
                                                               amm.a.a,
                                                               a($$0x, fi.e($$0x, "advancement"), amm.b.a)
                                                            )
                                                      ))
                                                   .then(
                                                      ej.a("criterion", StringArgumentType.greedyString())
                                                         .suggests(($$0x, $$1) -> en.b(fi.e($$0x, "advancement").b().e().keySet(), $$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ei)$$0x.getSource(),
                                                                  ev.f($$0x, "targets"),
                                                                  amm.a.a,
                                                                  fi.e($$0x, "advancement"),
                                                                  StringArgumentType.getString($$0x, "criterion")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ej.a("from")
                                          .then(
                                             ej.a("advancement", fi.a(mg.br))
                                                .executes(
                                                   $$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), amm.a.a, a($$0x, fi.e($$0x, "advancement"), amm.b.c))
                                                )
                                          )
                                    ))
                                 .then(
                                    ej.a("until")
                                       .then(
                                          ej.a("advancement", fi.a(mg.br))
                                             .executes(
                                                $$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), amm.a.a, a($$0x, fi.e($$0x, "advancement"), amm.b.d))
                                             )
                                       )
                                 ))
                              .then(
                                 ej.a("through")
                                    .then(
                                       ej.a("advancement", fi.a(mg.br))
                                          .executes(
                                             $$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), amm.a.a, a($$0x, fi.e($$0x, "advancement"), amm.b.b))
                                          )
                                    )
                              ))
                           .then(
                              ej.a("everything")
                                 .executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), amm.a.a, ((ei)$$0x.getSource()).l().aD().b(), false))
                           )
                     )
               ))
            .then(
               ej.a("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("targets", ev.d())
                                    .then(
                                       ej.a("only")
                                          .then(
                                             ((RequiredArgumentBuilder)ej.a("advancement", fi.a(mg.br))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ei)$$0x.getSource(), ev.f($$0x, "targets"), amm.a.b, a($$0x, fi.e($$0x, "advancement"), amm.b.a)
                                                         )
                                                   ))
                                                .then(
                                                   ej.a("criterion", StringArgumentType.greedyString())
                                                      .suggests(($$0x, $$1) -> en.b(fi.e($$0x, "advancement").b().e().keySet(), $$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ei)$$0x.getSource(),
                                                               ev.f($$0x, "targets"),
                                                               amm.a.b,
                                                               fi.e($$0x, "advancement"),
                                                               StringArgumentType.getString($$0x, "criterion")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ej.a("from")
                                       .then(
                                          ej.a("advancement", fi.a(mg.br))
                                             .executes(
                                                $$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), amm.a.b, a($$0x, fi.e($$0x, "advancement"), amm.b.c))
                                             )
                                       )
                                 ))
                              .then(
                                 ej.a("until")
                                    .then(
                                       ej.a("advancement", fi.a(mg.br))
                                          .executes(
                                             $$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), amm.a.b, a($$0x, fi.e($$0x, "advancement"), amm.b.d))
                                          )
                                    )
                              ))
                           .then(
                              ej.a("through")
                                 .then(
                                    ej.a("advancement", fi.a(mg.br))
                                       .executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), amm.a.b, a($$0x, fi.e($$0x, "advancement"), amm.b.b)))
                                 )
                           ))
                        .then(ej.a("everything").executes($$0x -> a((ei)$$0x.getSource(), ev.f($$0x, "targets"), amm.a.b, ((ei)$$0x.getSource()).l().aD().b())))
                  )
            )
      );
   }

   private static int a(ei $$0, Collection<arp> $$1, amm.a $$2, Collection<ai> $$3) throws CommandSyntaxException {
      return a($$0, $$1, $$2, $$3, true);
   }

   private static int a(ei $$0, Collection<arp> $$1, amm.a $$2, Collection<ai> $$3, boolean $$4) throws CommandSyntaxException {
      int $$5 = 0;

      for (arp $$6 : $$1) {
         $$5 += $$2.a($$6, $$3, $$4);
      }

      if ($$5 == 0) {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               throw a.create(ww.a($$2.a() + ".one.to.one.failure", ah.a($$3.iterator().next()), $$1.iterator().next().m_()));
            } else {
               throw a.create(ww.a($$2.a() + ".one.to.many.failure", ah.a($$3.iterator().next()), $$1.size()));
            }
         } else if ($$1.size() == 1) {
            throw a.create(ww.a($$2.a() + ".many.to.one.failure", $$3.size(), $$1.iterator().next().m_()));
         } else {
            throw a.create(ww.a($$2.a() + ".many.to.many.failure", $$3.size(), $$1.size()));
         }
      } else {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               $$0.a(() -> ww.a($$2.a() + ".one.to.one.success", ah.a($$3.iterator().next()), $$1.iterator().next().m_()), true);
            } else {
               $$0.a(() -> ww.a($$2.a() + ".one.to.many.success", ah.a($$3.iterator().next()), $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> ww.a($$2.a() + ".many.to.one.success", $$3.size(), $$1.iterator().next().m_()), true);
         } else {
            $$0.a(() -> ww.a($$2.a() + ".many.to.many.success", $$3.size(), $$1.size()), true);
         }

         return $$5;
      }
   }

   private static int a(ei $$0, Collection<arp> $$1, amm.a $$2, ai $$3, String $$4) throws CommandSyntaxException {
      int $$5 = 0;
      ah $$6 = $$3.b();
      if (!$$6.e().containsKey($$4)) {
         throw b.create(ah.a($$3), $$4);
      } else {
         for (arp $$7 : $$1) {
            if ($$2.a($$7, $$3, $$4)) {
               $$5++;
            }
         }

         if ($$5 == 0) {
            if ($$1.size() == 1) {
               throw a.create(ww.a($$2.a() + ".criterion.to.one.failure", $$4, ah.a($$3), $$1.iterator().next().m_()));
            } else {
               throw a.create(ww.a($$2.a() + ".criterion.to.many.failure", $$4, ah.a($$3), $$1.size()));
            }
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> ww.a($$2.a() + ".criterion.to.one.success", $$4, ah.a($$3), $$1.iterator().next().m_()), true);
            } else {
               $$0.a(() -> ww.a($$2.a() + ".criterion.to.many.success", $$4, ah.a($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }

   private static List<ai> a(CommandContext<ei> $$0, ai $$1, amm.b $$2) {
      an $$3 = ((ei)$$0.getSource()).l().aD().a();
      aj $$4 = $$3.a($$1);
      if ($$4 == null) {
         return List.of($$1);
      } else {
         List<ai> $$5 = new ArrayList<>();
         if ($$2.f) {
            for (aj $$6 = $$4.c(); $$6 != null; $$6 = $$6.c()) {
               $$5.add($$6.b());
            }
         }

         $$5.add($$1);
         if ($$2.g) {
            a($$4, $$5);
         }

         return $$5;
      }
   }

   private static void a(aj $$0, List<ai> $$1) {
      for (aj $$2 : $$0.e()) {
         $$1.add($$2.b());
         a($$2, $$1);
      }
   }

   static enum a {
      a("grant") {
         @Override
         protected boolean a(arp $$0, ai $$1) {
            ak $$2 = $$0.S().b($$1);
            if ($$2.a()) {
               return false;
            } else {
               for (String $$3 : $$2.e()) {
                  $$0.S().a($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(arp $$0, ai $$1, String $$2) {
            return $$0.S().a($$1, $$2);
         }
      },
      b("revoke") {
         @Override
         protected boolean a(arp $$0, ai $$1) {
            ak $$2 = $$0.S().b($$1);
            if (!$$2.b()) {
               return false;
            } else {
               for (String $$3 : $$2.f()) {
                  $$0.S().b($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(arp $$0, ai $$1, String $$2) {
            return $$0.S().b($$1, $$2);
         }
      };

      private final String c;

      a(final String $$0) {
         this.c = "commands.advancement." + $$0;
      }

      public int a(arp $$0, Iterable<ai> $$1, boolean $$2) {
         int $$3 = 0;
         if (!$$2) {
            $$0.S().a($$0, true);
         }

         for (ai $$4 : $$1) {
            if (this.a($$0, $$4)) {
               $$3++;
            }
         }

         if (!$$2) {
            $$0.S().a($$0, false);
         }

         return $$3;
      }

      protected abstract boolean a(arp var1, ai var2);

      protected abstract boolean a(arp var1, ai var2, String var3);

      protected String a() {
         return this.c;
      }
   }

   static enum b {
      a(false, false),
      b(true, true),
      c(false, true),
      d(true, false),
      e(true, true);

      final boolean f;
      final boolean g;

      private b(final boolean $$0, final boolean $$1) {
         this.f = $$0;
         this.g = $$1;
      }
   }
}
