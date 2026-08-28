import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class aly {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> (wz)$$0);
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> wz.b("commands.advancement.criterionNotFound", $$0, $$1)
   );
   private static final SuggestionProvider<et> c = ($$0, $$1) -> {
      Collection<ag> $$2 = ((et)$$0.getSource()).l().aE().b();
      return ey.a($$2.stream().map(ag::a), $$1);
   };

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("advancement").requires($$0x -> $$0x.c(2)))
               .then(
                  eu.a("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("targets", fg.d())
                                       .then(
                                          eu.a("only")
                                             .then(
                                                ((RequiredArgumentBuilder)eu.a("advancement", fu.a())
                                                      .suggests(c)
                                                      .executes(
                                                         $$0x -> a(
                                                               (et)$$0x.getSource(),
                                                               fg.f($$0x, "targets"),
                                                               aly.a.a,
                                                               a($$0x, fu.a($$0x, "advancement"), aly.b.a)
                                                            )
                                                      ))
                                                   .then(
                                                      eu.a("criterion", StringArgumentType.greedyString())
                                                         .suggests(($$0x, $$1) -> ey.b(fu.a($$0x, "advancement").b().e().keySet(), $$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (et)$$0x.getSource(),
                                                                  fg.f($$0x, "targets"),
                                                                  aly.a.a,
                                                                  fu.a($$0x, "advancement"),
                                                                  StringArgumentType.getString($$0x, "criterion")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       eu.a("from")
                                          .then(
                                             eu.a("advancement", fu.a())
                                                .suggests(c)
                                                .executes(
                                                   $$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), aly.a.a, a($$0x, fu.a($$0x, "advancement"), aly.b.c))
                                                )
                                          )
                                    ))
                                 .then(
                                    eu.a("until")
                                       .then(
                                          eu.a("advancement", fu.a())
                                             .suggests(c)
                                             .executes(
                                                $$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), aly.a.a, a($$0x, fu.a($$0x, "advancement"), aly.b.d))
                                             )
                                       )
                                 ))
                              .then(
                                 eu.a("through")
                                    .then(
                                       eu.a("advancement", fu.a())
                                          .suggests(c)
                                          .executes(
                                             $$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), aly.a.a, a($$0x, fu.a($$0x, "advancement"), aly.b.b))
                                          )
                                    )
                              ))
                           .then(
                              eu.a("everything").executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), aly.a.a, ((et)$$0x.getSource()).l().aE().b()))
                           )
                     )
               ))
            .then(
               eu.a("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("targets", fg.d())
                                    .then(
                                       eu.a("only")
                                          .then(
                                             ((RequiredArgumentBuilder)eu.a("advancement", fu.a())
                                                   .suggests(c)
                                                   .executes(
                                                      $$0x -> a(
                                                            (et)$$0x.getSource(), fg.f($$0x, "targets"), aly.a.b, a($$0x, fu.a($$0x, "advancement"), aly.b.a)
                                                         )
                                                   ))
                                                .then(
                                                   eu.a("criterion", StringArgumentType.greedyString())
                                                      .suggests(($$0x, $$1) -> ey.b(fu.a($$0x, "advancement").b().e().keySet(), $$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (et)$$0x.getSource(),
                                                               fg.f($$0x, "targets"),
                                                               aly.a.b,
                                                               fu.a($$0x, "advancement"),
                                                               StringArgumentType.getString($$0x, "criterion")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    eu.a("from")
                                       .then(
                                          eu.a("advancement", fu.a())
                                             .suggests(c)
                                             .executes(
                                                $$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), aly.a.b, a($$0x, fu.a($$0x, "advancement"), aly.b.c))
                                             )
                                       )
                                 ))
                              .then(
                                 eu.a("until")
                                    .then(
                                       eu.a("advancement", fu.a())
                                          .suggests(c)
                                          .executes(
                                             $$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), aly.a.b, a($$0x, fu.a($$0x, "advancement"), aly.b.d))
                                          )
                                    )
                              ))
                           .then(
                              eu.a("through")
                                 .then(
                                    eu.a("advancement", fu.a())
                                       .suggests(c)
                                       .executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), aly.a.b, a($$0x, fu.a($$0x, "advancement"), aly.b.b)))
                                 )
                           ))
                        .then(eu.a("everything").executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), aly.a.b, ((et)$$0x.getSource()).l().aE().b())))
                  )
            )
      );
   }

   private static int a(et $$0, Collection<aqv> $$1, aly.a $$2, Collection<ag> $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aqv $$5 : $$1) {
         $$4 += $$2.a($$5, $$3);
      }

      if ($$4 == 0) {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               throw a.create(wz.a($$2.a() + ".one.to.one.failure", af.a($$3.iterator().next()), $$1.iterator().next().S_()));
            } else {
               throw a.create(wz.a($$2.a() + ".one.to.many.failure", af.a($$3.iterator().next()), $$1.size()));
            }
         } else if ($$1.size() == 1) {
            throw a.create(wz.a($$2.a() + ".many.to.one.failure", $$3.size(), $$1.iterator().next().S_()));
         } else {
            throw a.create(wz.a($$2.a() + ".many.to.many.failure", $$3.size(), $$1.size()));
         }
      } else {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               $$0.a(() -> wz.a($$2.a() + ".one.to.one.success", af.a($$3.iterator().next()), $$1.iterator().next().S_()), true);
            } else {
               $$0.a(() -> wz.a($$2.a() + ".one.to.many.success", af.a($$3.iterator().next()), $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> wz.a($$2.a() + ".many.to.one.success", $$3.size(), $$1.iterator().next().S_()), true);
         } else {
            $$0.a(() -> wz.a($$2.a() + ".many.to.many.success", $$3.size(), $$1.size()), true);
         }

         return $$4;
      }
   }

   private static int a(et $$0, Collection<aqv> $$1, aly.a $$2, ag $$3, String $$4) throws CommandSyntaxException {
      int $$5 = 0;
      af $$6 = $$3.b();
      if (!$$6.e().containsKey($$4)) {
         throw b.create(af.a($$3), $$4);
      } else {
         for (aqv $$7 : $$1) {
            if ($$2.a($$7, $$3, $$4)) {
               $$5++;
            }
         }

         if ($$5 == 0) {
            if ($$1.size() == 1) {
               throw a.create(wz.a($$2.a() + ".criterion.to.one.failure", $$4, af.a($$3), $$1.iterator().next().S_()));
            } else {
               throw a.create(wz.a($$2.a() + ".criterion.to.many.failure", $$4, af.a($$3), $$1.size()));
            }
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> wz.a($$2.a() + ".criterion.to.one.success", $$4, af.a($$3), $$1.iterator().next().S_()), true);
            } else {
               $$0.a(() -> wz.a($$2.a() + ".criterion.to.many.success", $$4, af.a($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }

   private static List<ag> a(CommandContext<et> $$0, ag $$1, aly.b $$2) {
      al $$3 = ((et)$$0.getSource()).l().aE().a();
      ah $$4 = $$3.a($$1);
      if ($$4 == null) {
         return List.of($$1);
      } else {
         List<ag> $$5 = new ArrayList<>();
         if ($$2.f) {
            for (ah $$6 = $$4.c(); $$6 != null; $$6 = $$6.c()) {
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

   private static void a(ah $$0, List<ag> $$1) {
      for (ah $$2 : $$0.e()) {
         $$1.add($$2.b());
         a($$2, $$1);
      }
   }

   static enum a {
      a("grant") {
         @Override
         protected boolean a(aqv $$0, ag $$1) {
            ai $$2 = $$0.R().b($$1);
            if ($$2.a()) {
               return false;
            } else {
               for (String $$3 : $$2.e()) {
                  $$0.R().a($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(aqv $$0, ag $$1, String $$2) {
            return $$0.R().a($$1, $$2);
         }
      },
      b("revoke") {
         @Override
         protected boolean a(aqv $$0, ag $$1) {
            ai $$2 = $$0.R().b($$1);
            if (!$$2.b()) {
               return false;
            } else {
               for (String $$3 : $$2.f()) {
                  $$0.R().b($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(aqv $$0, ag $$1, String $$2) {
            return $$0.R().b($$1, $$2);
         }
      };

      private final String c;

      a(final String $$0) {
         this.c = "commands.advancement." + $$0;
      }

      public int a(aqv $$0, Iterable<ag> $$1) {
         int $$2 = 0;

         for (ag $$3 : $$1) {
            if (this.a($$0, $$3)) {
               $$2++;
            }
         }

         return $$2;
      }

      protected abstract boolean a(aqv var1, ag var2);

      protected abstract boolean a(aqv var1, ag var2, String var3);

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
