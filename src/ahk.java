import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ahk {
   private static final SuggestionProvider<du> a = ($$0, $$1) -> {
      Collection<af> $$2 = ((du)$$0.getSource()).m().az().b();
      return dy.a($$2.stream().map(af::a), $$1);
   };

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("advancement").requires($$0x -> $$0x.c(2)))
               .then(
                  dv.a("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("targets", eg.d())
                                       .then(
                                          dv.a("only")
                                             .then(
                                                ((RequiredArgumentBuilder)dv.a("advancement", eu.a())
                                                      .suggests(a)
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               eg.f($$0x, "targets"),
                                                               ahk.a.a,
                                                               a($$0x, eu.a($$0x, "advancement"), ahk.b.a)
                                                            )
                                                      ))
                                                   .then(
                                                      dv.a("criterion", StringArgumentType.greedyString())
                                                         .suggests(($$0x, $$1) -> dy.b(eu.a($$0x, "advancement").b().f().keySet(), $$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (du)$$0x.getSource(),
                                                                  eg.f($$0x, "targets"),
                                                                  ahk.a.a,
                                                                  eu.a($$0x, "advancement"),
                                                                  StringArgumentType.getString($$0x, "criterion")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       dv.a("from")
                                          .then(
                                             dv.a("advancement", eu.a())
                                                .suggests(a)
                                                .executes(
                                                   $$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ahk.a.a, a($$0x, eu.a($$0x, "advancement"), ahk.b.c))
                                                )
                                          )
                                    ))
                                 .then(
                                    dv.a("until")
                                       .then(
                                          dv.a("advancement", eu.a())
                                             .suggests(a)
                                             .executes(
                                                $$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ahk.a.a, a($$0x, eu.a($$0x, "advancement"), ahk.b.d))
                                             )
                                       )
                                 ))
                              .then(
                                 dv.a("through")
                                    .then(
                                       dv.a("advancement", eu.a())
                                          .suggests(a)
                                          .executes(
                                             $$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ahk.a.a, a($$0x, eu.a($$0x, "advancement"), ahk.b.b))
                                          )
                                    )
                              ))
                           .then(
                              dv.a("everything").executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ahk.a.a, ((du)$$0x.getSource()).m().az().b()))
                           )
                     )
               ))
            .then(
               dv.a("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("targets", eg.d())
                                    .then(
                                       dv.a("only")
                                          .then(
                                             ((RequiredArgumentBuilder)dv.a("advancement", eu.a())
                                                   .suggests(a)
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(), eg.f($$0x, "targets"), ahk.a.b, a($$0x, eu.a($$0x, "advancement"), ahk.b.a)
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("criterion", StringArgumentType.greedyString())
                                                      .suggests(($$0x, $$1) -> dy.b(eu.a($$0x, "advancement").b().f().keySet(), $$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               eg.f($$0x, "targets"),
                                                               ahk.a.b,
                                                               eu.a($$0x, "advancement"),
                                                               StringArgumentType.getString($$0x, "criterion")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dv.a("from")
                                       .then(
                                          dv.a("advancement", eu.a())
                                             .suggests(a)
                                             .executes(
                                                $$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ahk.a.b, a($$0x, eu.a($$0x, "advancement"), ahk.b.c))
                                             )
                                       )
                                 ))
                              .then(
                                 dv.a("until")
                                    .then(
                                       dv.a("advancement", eu.a())
                                          .suggests(a)
                                          .executes(
                                             $$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ahk.a.b, a($$0x, eu.a($$0x, "advancement"), ahk.b.d))
                                          )
                                    )
                              ))
                           .then(
                              dv.a("through")
                                 .then(
                                    dv.a("advancement", eu.a())
                                       .suggests(a)
                                       .executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ahk.a.b, a($$0x, eu.a($$0x, "advancement"), ahk.b.b)))
                                 )
                           ))
                        .then(dv.a("everything").executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ahk.a.b, ((du)$$0x.getSource()).m().az().b())))
                  )
            )
      );
   }

   private static int a(du $$0, Collection<amb> $$1, ahk.a $$2, Collection<af> $$3) {
      int $$4 = 0;

      for (amb $$5 : $$1) {
         $$4 += $$2.a($$5, $$3);
      }

      if ($$4 == 0) {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               throw new dr(ur.a($$2.a() + ".one.to.one.failure", ae.a($$3.iterator().next()), $$1.iterator().next().O_()));
            } else {
               throw new dr(ur.a($$2.a() + ".one.to.many.failure", ae.a($$3.iterator().next()), $$1.size()));
            }
         } else if ($$1.size() == 1) {
            throw new dr(ur.a($$2.a() + ".many.to.one.failure", $$3.size(), $$1.iterator().next().O_()));
         } else {
            throw new dr(ur.a($$2.a() + ".many.to.many.failure", $$3.size(), $$1.size()));
         }
      } else {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               $$0.a(() -> ur.a($$2.a() + ".one.to.one.success", ae.a($$3.iterator().next()), $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> ur.a($$2.a() + ".one.to.many.success", ae.a($$3.iterator().next()), $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> ur.a($$2.a() + ".many.to.one.success", $$3.size(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> ur.a($$2.a() + ".many.to.many.success", $$3.size(), $$1.size()), true);
         }

         return $$4;
      }
   }

   private static int a(du $$0, Collection<amb> $$1, ahk.a $$2, af $$3, String $$4) {
      int $$5 = 0;
      ae $$6 = $$3.b();
      if (!$$6.f().containsKey($$4)) {
         throw new dr(ur.a("commands.advancement.criterionNotFound", ae.a($$3), $$4));
      } else {
         for (amb $$7 : $$1) {
            if ($$2.a($$7, $$3, $$4)) {
               $$5++;
            }
         }

         if ($$5 == 0) {
            if ($$1.size() == 1) {
               throw new dr(ur.a($$2.a() + ".criterion.to.one.failure", $$4, ae.a($$3), $$1.iterator().next().O_()));
            } else {
               throw new dr(ur.a($$2.a() + ".criterion.to.many.failure", $$4, ae.a($$3), $$1.size()));
            }
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> ur.a($$2.a() + ".criterion.to.one.success", $$4, ae.a($$3), $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> ur.a($$2.a() + ".criterion.to.many.success", $$4, ae.a($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }

   private static List<af> a(CommandContext<du> $$0, af $$1, ahk.b $$2) {
      ak $$3 = ((du)$$0.getSource()).m().az().a();
      ag $$4 = $$3.a($$1);
      if ($$4 == null) {
         return List.of($$1);
      } else {
         List<af> $$5 = new ArrayList<>();
         if ($$2.f) {
            for (ag $$6 = $$4.c(); $$6 != null; $$6 = $$6.c()) {
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

   private static void a(ag $$0, List<af> $$1) {
      for (ag $$2 : $$0.e()) {
         $$1.add($$2.b());
         a($$2, $$1);
      }
   }

   static enum a {
      a("grant") {
         @Override
         protected boolean a(amb $$0, af $$1) {
            ah $$2 = $$0.O().b($$1);
            if ($$2.a()) {
               return false;
            } else {
               for (String $$3 : $$2.e()) {
                  $$0.O().a($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(amb $$0, af $$1, String $$2) {
            return $$0.O().a($$1, $$2);
         }
      },
      b("revoke") {
         @Override
         protected boolean a(amb $$0, af $$1) {
            ah $$2 = $$0.O().b($$1);
            if (!$$2.b()) {
               return false;
            } else {
               for (String $$3 : $$2.f()) {
                  $$0.O().b($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(amb $$0, af $$1, String $$2) {
            return $$0.O().b($$1, $$2);
         }
      };

      private final String c;

      a(String $$0) {
         this.c = "commands.advancement." + $$0;
      }

      public int a(amb $$0, Iterable<af> $$1) {
         int $$2 = 0;

         for (af $$3 : $$1) {
            if (this.a($$0, $$3)) {
               $$2++;
            }
         }

         return $$2;
      }

      protected abstract boolean a(amb var1, af var2);

      protected abstract boolean a(amb var1, af var2, String var3);

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

      private b(boolean $$0, boolean $$1) {
         this.f = $$0;
         this.g = $$1;
      }
   }
}
