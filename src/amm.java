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

public class amm {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> (xe)$$0);
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xe.b("commands.advancement.criterionNotFound", $$0, $$1)
   );
   private static final SuggestionProvider<eu> c = ($$0, $$1) -> {
      Collection<ag> $$2 = ((eu)$$0.getSource()).l().aD().b();
      return ez.a($$2.stream().map(ag::a), $$1);
   };

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("advancement").requires($$0x -> $$0x.c(2)))
               .then(
                  ev.a("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("targets", fh.d())
                                       .then(
                                          ev.a("only")
                                             .then(
                                                ((RequiredArgumentBuilder)ev.a("advancement", fv.a())
                                                      .suggests(c)
                                                      .executes(
                                                         $$0x -> a(
                                                               (eu)$$0x.getSource(),
                                                               fh.f($$0x, "targets"),
                                                               amm.a.a,
                                                               a($$0x, fv.a($$0x, "advancement"), amm.b.a)
                                                            )
                                                      ))
                                                   .then(
                                                      ev.a("criterion", StringArgumentType.greedyString())
                                                         .suggests(($$0x, $$1) -> ez.b(fv.a($$0x, "advancement").b().e().keySet(), $$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (eu)$$0x.getSource(),
                                                                  fh.f($$0x, "targets"),
                                                                  amm.a.a,
                                                                  fv.a($$0x, "advancement"),
                                                                  StringArgumentType.getString($$0x, "criterion")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ev.a("from")
                                          .then(
                                             ev.a("advancement", fv.a())
                                                .suggests(c)
                                                .executes(
                                                   $$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), amm.a.a, a($$0x, fv.a($$0x, "advancement"), amm.b.c))
                                                )
                                          )
                                    ))
                                 .then(
                                    ev.a("until")
                                       .then(
                                          ev.a("advancement", fv.a())
                                             .suggests(c)
                                             .executes(
                                                $$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), amm.a.a, a($$0x, fv.a($$0x, "advancement"), amm.b.d))
                                             )
                                       )
                                 ))
                              .then(
                                 ev.a("through")
                                    .then(
                                       ev.a("advancement", fv.a())
                                          .suggests(c)
                                          .executes(
                                             $$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), amm.a.a, a($$0x, fv.a($$0x, "advancement"), amm.b.b))
                                          )
                                    )
                              ))
                           .then(
                              ev.a("everything").executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), amm.a.a, ((eu)$$0x.getSource()).l().aD().b()))
                           )
                     )
               ))
            .then(
               ev.a("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("targets", fh.d())
                                    .then(
                                       ev.a("only")
                                          .then(
                                             ((RequiredArgumentBuilder)ev.a("advancement", fv.a())
                                                   .suggests(c)
                                                   .executes(
                                                      $$0x -> a(
                                                            (eu)$$0x.getSource(), fh.f($$0x, "targets"), amm.a.b, a($$0x, fv.a($$0x, "advancement"), amm.b.a)
                                                         )
                                                   ))
                                                .then(
                                                   ev.a("criterion", StringArgumentType.greedyString())
                                                      .suggests(($$0x, $$1) -> ez.b(fv.a($$0x, "advancement").b().e().keySet(), $$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (eu)$$0x.getSource(),
                                                               fh.f($$0x, "targets"),
                                                               amm.a.b,
                                                               fv.a($$0x, "advancement"),
                                                               StringArgumentType.getString($$0x, "criterion")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ev.a("from")
                                       .then(
                                          ev.a("advancement", fv.a())
                                             .suggests(c)
                                             .executes(
                                                $$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), amm.a.b, a($$0x, fv.a($$0x, "advancement"), amm.b.c))
                                             )
                                       )
                                 ))
                              .then(
                                 ev.a("until")
                                    .then(
                                       ev.a("advancement", fv.a())
                                          .suggests(c)
                                          .executes(
                                             $$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), amm.a.b, a($$0x, fv.a($$0x, "advancement"), amm.b.d))
                                          )
                                    )
                              ))
                           .then(
                              ev.a("through")
                                 .then(
                                    ev.a("advancement", fv.a())
                                       .suggests(c)
                                       .executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), amm.a.b, a($$0x, fv.a($$0x, "advancement"), amm.b.b)))
                                 )
                           ))
                        .then(ev.a("everything").executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), amm.a.b, ((eu)$$0x.getSource()).l().aD().b())))
                  )
            )
      );
   }

   private static int a(eu $$0, Collection<ark> $$1, amm.a $$2, Collection<ag> $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (ark $$5 : $$1) {
         $$4 += $$2.a($$5, $$3);
      }

      if ($$4 == 0) {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               throw a.create(xe.a($$2.a() + ".one.to.one.failure", af.a($$3.iterator().next()), $$1.iterator().next().R_()));
            } else {
               throw a.create(xe.a($$2.a() + ".one.to.many.failure", af.a($$3.iterator().next()), $$1.size()));
            }
         } else if ($$1.size() == 1) {
            throw a.create(xe.a($$2.a() + ".many.to.one.failure", $$3.size(), $$1.iterator().next().R_()));
         } else {
            throw a.create(xe.a($$2.a() + ".many.to.many.failure", $$3.size(), $$1.size()));
         }
      } else {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               $$0.a(() -> xe.a($$2.a() + ".one.to.one.success", af.a($$3.iterator().next()), $$1.iterator().next().R_()), true);
            } else {
               $$0.a(() -> xe.a($$2.a() + ".one.to.many.success", af.a($$3.iterator().next()), $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> xe.a($$2.a() + ".many.to.one.success", $$3.size(), $$1.iterator().next().R_()), true);
         } else {
            $$0.a(() -> xe.a($$2.a() + ".many.to.many.success", $$3.size(), $$1.size()), true);
         }

         return $$4;
      }
   }

   private static int a(eu $$0, Collection<ark> $$1, amm.a $$2, ag $$3, String $$4) throws CommandSyntaxException {
      int $$5 = 0;
      af $$6 = $$3.b();
      if (!$$6.e().containsKey($$4)) {
         throw b.create(af.a($$3), $$4);
      } else {
         for (ark $$7 : $$1) {
            if ($$2.a($$7, $$3, $$4)) {
               $$5++;
            }
         }

         if ($$5 == 0) {
            if ($$1.size() == 1) {
               throw a.create(xe.a($$2.a() + ".criterion.to.one.failure", $$4, af.a($$3), $$1.iterator().next().R_()));
            } else {
               throw a.create(xe.a($$2.a() + ".criterion.to.many.failure", $$4, af.a($$3), $$1.size()));
            }
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xe.a($$2.a() + ".criterion.to.one.success", $$4, af.a($$3), $$1.iterator().next().R_()), true);
            } else {
               $$0.a(() -> xe.a($$2.a() + ".criterion.to.many.success", $$4, af.a($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }

   private static List<ag> a(CommandContext<eu> $$0, ag $$1, amm.b $$2) {
      al $$3 = ((eu)$$0.getSource()).l().aD().a();
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
         protected boolean a(ark $$0, ag $$1) {
            ai $$2 = $$0.T().b($$1);
            if ($$2.a()) {
               return false;
            } else {
               for (String $$3 : $$2.e()) {
                  $$0.T().a($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(ark $$0, ag $$1, String $$2) {
            return $$0.T().a($$1, $$2);
         }
      },
      b("revoke") {
         @Override
         protected boolean a(ark $$0, ag $$1) {
            ai $$2 = $$0.T().b($$1);
            if (!$$2.b()) {
               return false;
            } else {
               for (String $$3 : $$2.f()) {
                  $$0.T().b($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(ark $$0, ag $$1, String $$2) {
            return $$0.T().b($$1, $$2);
         }
      };

      private final String c;

      a(final String $$0) {
         this.c = "commands.advancement." + $$0;
      }

      public int a(ark $$0, Iterable<ag> $$1) {
         int $$2 = 0;

         for (ag $$3 : $$1) {
            if (this.a($$0, $$3)) {
               $$2++;
            }
         }

         return $$2;
      }

      protected abstract boolean a(ark var1, ag var2);

      protected abstract boolean a(ark var1, ag var2, String var3);

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
