import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.List;

public class adt {
   private static final SuggestionProvider<ds> a = ($$0, $$1) -> {
      Collection<ae> $$2 = ((ds)$$0.getSource()).l().az().a();
      return du.a($$2.stream().map(ae::j), $$1);
   };

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("advancement").requires($$0x -> $$0x.c(2)))
               .then(
                  dt.a("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("targets", ec.d())
                                       .then(
                                          dt.a("only")
                                             .then(
                                                ((RequiredArgumentBuilder)dt.a("advancement", eq.a())
                                                      .suggests(a)
                                                      .executes(
                                                         $$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), adt.a.a, a(eq.a($$0x, "advancement"), adt.b.a))
                                                      ))
                                                   .then(
                                                      dt.a("criterion", StringArgumentType.greedyString())
                                                         .suggests(($$0x, $$1) -> du.b(eq.a($$0x, "advancement").h().keySet(), $$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ds)$$0x.getSource(),
                                                                  ec.f($$0x, "targets"),
                                                                  adt.a.a,
                                                                  eq.a($$0x, "advancement"),
                                                                  StringArgumentType.getString($$0x, "criterion")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       dt.a("from")
                                          .then(
                                             dt.a("advancement", eq.a())
                                                .suggests(a)
                                                .executes(
                                                   $$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), adt.a.a, a(eq.a($$0x, "advancement"), adt.b.c))
                                                )
                                          )
                                    ))
                                 .then(
                                    dt.a("until")
                                       .then(
                                          dt.a("advancement", eq.a())
                                             .suggests(a)
                                             .executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), adt.a.a, a(eq.a($$0x, "advancement"), adt.b.d)))
                                       )
                                 ))
                              .then(
                                 dt.a("through")
                                    .then(
                                       dt.a("advancement", eq.a())
                                          .suggests(a)
                                          .executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), adt.a.a, a(eq.a($$0x, "advancement"), adt.b.b)))
                                    )
                              ))
                           .then(
                              dt.a("everything").executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), adt.a.a, ((ds)$$0x.getSource()).l().az().a()))
                           )
                     )
               ))
            .then(
               dt.a("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("targets", ec.d())
                                    .then(
                                       dt.a("only")
                                          .then(
                                             ((RequiredArgumentBuilder)dt.a("advancement", eq.a())
                                                   .suggests(a)
                                                   .executes(
                                                      $$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), adt.a.b, a(eq.a($$0x, "advancement"), adt.b.a))
                                                   ))
                                                .then(
                                                   dt.a("criterion", StringArgumentType.greedyString())
                                                      .suggests(($$0x, $$1) -> du.b(eq.a($$0x, "advancement").h().keySet(), $$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               ec.f($$0x, "targets"),
                                                               adt.a.b,
                                                               eq.a($$0x, "advancement"),
                                                               StringArgumentType.getString($$0x, "criterion")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    dt.a("from")
                                       .then(
                                          dt.a("advancement", eq.a())
                                             .suggests(a)
                                             .executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), adt.a.b, a(eq.a($$0x, "advancement"), adt.b.c)))
                                       )
                                 ))
                              .then(
                                 dt.a("until")
                                    .then(
                                       dt.a("advancement", eq.a())
                                          .suggests(a)
                                          .executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), adt.a.b, a(eq.a($$0x, "advancement"), adt.b.d)))
                                    )
                              ))
                           .then(
                              dt.a("through")
                                 .then(
                                    dt.a("advancement", eq.a())
                                       .suggests(a)
                                       .executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), adt.a.b, a(eq.a($$0x, "advancement"), adt.b.b)))
                                 )
                           ))
                        .then(dt.a("everything").executes($$0x -> a((ds)$$0x.getSource(), ec.f($$0x, "targets"), adt.a.b, ((ds)$$0x.getSource()).l().az().a())))
                  )
            )
      );
   }

   private static int a(ds $$0, Collection<aig> $$1, adt.a $$2, Collection<ae> $$3) {
      int $$4 = 0;

      for (aig $$5 : $$1) {
         $$4 += $$2.a($$5, $$3);
      }

      if ($$4 == 0) {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               throw new dp(sw.a($$2.a() + ".one.to.one.failure", $$3.iterator().next().l(), $$1.iterator().next().H_()));
            } else {
               throw new dp(sw.a($$2.a() + ".one.to.many.failure", $$3.iterator().next().l(), $$1.size()));
            }
         } else if ($$1.size() == 1) {
            throw new dp(sw.a($$2.a() + ".many.to.one.failure", $$3.size(), $$1.iterator().next().H_()));
         } else {
            throw new dp(sw.a($$2.a() + ".many.to.many.failure", $$3.size(), $$1.size()));
         }
      } else {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               $$0.a(() -> sw.a($$2.a() + ".one.to.one.success", $$3.iterator().next().l(), $$1.iterator().next().H_()), true);
            } else {
               $$0.a(() -> sw.a($$2.a() + ".one.to.many.success", $$3.iterator().next().l(), $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> sw.a($$2.a() + ".many.to.one.success", $$3.size(), $$1.iterator().next().H_()), true);
         } else {
            $$0.a(() -> sw.a($$2.a() + ".many.to.many.success", $$3.size(), $$1.size()), true);
         }

         return $$4;
      }
   }

   private static int a(ds $$0, Collection<aig> $$1, adt.a $$2, ae $$3, String $$4) {
      int $$5 = 0;
      if (!$$3.h().containsKey($$4)) {
         throw new dp(sw.a("commands.advancement.criterionNotFound", $$3.l(), $$4));
      } else {
         for (aig $$6 : $$1) {
            if ($$2.a($$6, $$3, $$4)) {
               $$5++;
            }
         }

         if ($$5 == 0) {
            if ($$1.size() == 1) {
               throw new dp(sw.a($$2.a() + ".criterion.to.one.failure", $$4, $$3.l(), $$1.iterator().next().H_()));
            } else {
               throw new dp(sw.a($$2.a() + ".criterion.to.many.failure", $$4, $$3.l(), $$1.size()));
            }
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> sw.a($$2.a() + ".criterion.to.one.success", $$4, $$3.l(), $$1.iterator().next().H_()), true);
            } else {
               $$0.a(() -> sw.a($$2.a() + ".criterion.to.many.success", $$4, $$3.l(), $$1.size()), true);
            }

            return $$5;
         }
      }
   }

   private static List<ae> a(ae $$0, adt.b $$1) {
      List<ae> $$2 = Lists.newArrayList();
      if ($$1.f) {
         for (ae $$3 = $$0.b(); $$3 != null; $$3 = $$3.b()) {
            $$2.add($$3);
         }
      }

      $$2.add($$0);
      if ($$1.g) {
         a($$0, $$2);
      }

      return $$2;
   }

   private static void a(ae $$0, List<ae> $$1) {
      for (ae $$2 : $$0.g()) {
         $$1.add($$2);
         a($$2, $$1);
      }
   }

   static enum a {
      a("grant") {
         @Override
         protected boolean a(aig $$0, ae $$1) {
            ag $$2 = $$0.M().b($$1);
            if ($$2.a()) {
               return false;
            } else {
               for (String $$3 : $$2.e()) {
                  $$0.M().a($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(aig $$0, ae $$1, String $$2) {
            return $$0.M().a($$1, $$2);
         }
      },
      b("revoke") {
         @Override
         protected boolean a(aig $$0, ae $$1) {
            ag $$2 = $$0.M().b($$1);
            if (!$$2.b()) {
               return false;
            } else {
               for (String $$3 : $$2.f()) {
                  $$0.M().b($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(aig $$0, ae $$1, String $$2) {
            return $$0.M().b($$1, $$2);
         }
      };

      private final String c;

      a(String $$0) {
         this.c = "commands.advancement." + $$0;
      }

      public int a(aig $$0, Iterable<ae> $$1) {
         int $$2 = 0;

         for (ae $$3 : $$1) {
            if (this.a($$0, $$3)) {
               $$2++;
            }
         }

         return $$2;
      }

      protected abstract boolean a(aig var1, ae var2);

      protected abstract boolean a(aig var1, ae var2, String var3);

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
