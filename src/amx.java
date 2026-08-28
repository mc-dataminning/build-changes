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

public class amx {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> (xk)$$0);
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xk.b("commands.advancement.criterionNotFound", $$0, $$1)
   );

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("advancement").requires($$0x -> $$0x.c(2)))
               .then(
                  ex.a("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("targets", fj.d())
                                       .then(
                                          ex.a("only")
                                             .then(
                                                ((RequiredArgumentBuilder)ex.a("advancement", fw.a(mb.bj))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ew)$$0x.getSource(),
                                                               fj.f($$0x, "targets"),
                                                               amx.a.a,
                                                               a($$0x, fw.e($$0x, "advancement"), amx.b.a)
                                                            )
                                                      ))
                                                   .then(
                                                      ex.a("criterion", StringArgumentType.greedyString())
                                                         .suggests(($$0x, $$1) -> fb.b(fw.e($$0x, "advancement").b().e().keySet(), $$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ew)$$0x.getSource(),
                                                                  fj.f($$0x, "targets"),
                                                                  amx.a.a,
                                                                  fw.e($$0x, "advancement"),
                                                                  StringArgumentType.getString($$0x, "criterion")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ex.a("from")
                                          .then(
                                             ex.a("advancement", fw.a(mb.bj))
                                                .executes(
                                                   $$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), amx.a.a, a($$0x, fw.e($$0x, "advancement"), amx.b.c))
                                                )
                                          )
                                    ))
                                 .then(
                                    ex.a("until")
                                       .then(
                                          ex.a("advancement", fw.a(mb.bj))
                                             .executes(
                                                $$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), amx.a.a, a($$0x, fw.e($$0x, "advancement"), amx.b.d))
                                             )
                                       )
                                 ))
                              .then(
                                 ex.a("through")
                                    .then(
                                       ex.a("advancement", fw.a(mb.bj))
                                          .executes(
                                             $$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), amx.a.a, a($$0x, fw.e($$0x, "advancement"), amx.b.b))
                                          )
                                    )
                              ))
                           .then(
                              ex.a("everything").executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), amx.a.a, ((ew)$$0x.getSource()).l().aD().b()))
                           )
                     )
               ))
            .then(
               ex.a("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("targets", fj.d())
                                    .then(
                                       ex.a("only")
                                          .then(
                                             ((RequiredArgumentBuilder)ex.a("advancement", fw.a(mb.bj))
                                                   .executes(
                                                      $$0x -> a(
                                                            (ew)$$0x.getSource(), fj.f($$0x, "targets"), amx.a.b, a($$0x, fw.e($$0x, "advancement"), amx.b.a)
                                                         )
                                                   ))
                                                .then(
                                                   ex.a("criterion", StringArgumentType.greedyString())
                                                      .suggests(($$0x, $$1) -> fb.b(fw.e($$0x, "advancement").b().e().keySet(), $$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ew)$$0x.getSource(),
                                                               fj.f($$0x, "targets"),
                                                               amx.a.b,
                                                               fw.e($$0x, "advancement"),
                                                               StringArgumentType.getString($$0x, "criterion")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ex.a("from")
                                       .then(
                                          ex.a("advancement", fw.a(mb.bj))
                                             .executes(
                                                $$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), amx.a.b, a($$0x, fw.e($$0x, "advancement"), amx.b.c))
                                             )
                                       )
                                 ))
                              .then(
                                 ex.a("until")
                                    .then(
                                       ex.a("advancement", fw.a(mb.bj))
                                          .executes(
                                             $$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), amx.a.b, a($$0x, fw.e($$0x, "advancement"), amx.b.d))
                                          )
                                    )
                              ))
                           .then(
                              ex.a("through")
                                 .then(
                                    ex.a("advancement", fw.a(mb.bj))
                                       .executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), amx.a.b, a($$0x, fw.e($$0x, "advancement"), amx.b.b)))
                                 )
                           ))
                        .then(ex.a("everything").executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), amx.a.b, ((ew)$$0x.getSource()).l().aD().b())))
                  )
            )
      );
   }

   private static int a(ew $$0, Collection<ary> $$1, amx.a $$2, Collection<ah> $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (ary $$5 : $$1) {
         $$4 += $$2.a($$5, $$3);
      }

      if ($$4 == 0) {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               throw a.create(xk.a($$2.a() + ".one.to.one.failure", ag.a($$3.iterator().next()), $$1.iterator().next().p_()));
            } else {
               throw a.create(xk.a($$2.a() + ".one.to.many.failure", ag.a($$3.iterator().next()), $$1.size()));
            }
         } else if ($$1.size() == 1) {
            throw a.create(xk.a($$2.a() + ".many.to.one.failure", $$3.size(), $$1.iterator().next().p_()));
         } else {
            throw a.create(xk.a($$2.a() + ".many.to.many.failure", $$3.size(), $$1.size()));
         }
      } else {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               $$0.a(() -> xk.a($$2.a() + ".one.to.one.success", ag.a($$3.iterator().next()), $$1.iterator().next().p_()), true);
            } else {
               $$0.a(() -> xk.a($$2.a() + ".one.to.many.success", ag.a($$3.iterator().next()), $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> xk.a($$2.a() + ".many.to.one.success", $$3.size(), $$1.iterator().next().p_()), true);
         } else {
            $$0.a(() -> xk.a($$2.a() + ".many.to.many.success", $$3.size(), $$1.size()), true);
         }

         return $$4;
      }
   }

   private static int a(ew $$0, Collection<ary> $$1, amx.a $$2, ah $$3, String $$4) throws CommandSyntaxException {
      int $$5 = 0;
      ag $$6 = $$3.b();
      if (!$$6.e().containsKey($$4)) {
         throw b.create(ag.a($$3), $$4);
      } else {
         for (ary $$7 : $$1) {
            if ($$2.a($$7, $$3, $$4)) {
               $$5++;
            }
         }

         if ($$5 == 0) {
            if ($$1.size() == 1) {
               throw a.create(xk.a($$2.a() + ".criterion.to.one.failure", $$4, ag.a($$3), $$1.iterator().next().p_()));
            } else {
               throw a.create(xk.a($$2.a() + ".criterion.to.many.failure", $$4, ag.a($$3), $$1.size()));
            }
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xk.a($$2.a() + ".criterion.to.one.success", $$4, ag.a($$3), $$1.iterator().next().p_()), true);
            } else {
               $$0.a(() -> xk.a($$2.a() + ".criterion.to.many.success", $$4, ag.a($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }

   private static List<ah> a(CommandContext<ew> $$0, ah $$1, amx.b $$2) {
      am $$3 = ((ew)$$0.getSource()).l().aD().a();
      ai $$4 = $$3.a($$1);
      if ($$4 == null) {
         return List.of($$1);
      } else {
         List<ah> $$5 = new ArrayList<>();
         if ($$2.f) {
            for (ai $$6 = $$4.c(); $$6 != null; $$6 = $$6.c()) {
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

   private static void a(ai $$0, List<ah> $$1) {
      for (ai $$2 : $$0.e()) {
         $$1.add($$2.b());
         a($$2, $$1);
      }
   }

   static enum a {
      a("grant") {
         @Override
         protected boolean a(ary $$0, ah $$1) {
            aj $$2 = $$0.S().b($$1);
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
         protected boolean a(ary $$0, ah $$1, String $$2) {
            return $$0.S().a($$1, $$2);
         }
      },
      b("revoke") {
         @Override
         protected boolean a(ary $$0, ah $$1) {
            aj $$2 = $$0.S().b($$1);
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
         protected boolean a(ary $$0, ah $$1, String $$2) {
            return $$0.S().b($$1, $$2);
         }
      };

      private final String c;

      a(final String $$0) {
         this.c = "commands.advancement." + $$0;
      }

      public int a(ary $$0, Iterable<ah> $$1) {
         int $$2 = 0;

         for (ah $$3 : $$1) {
            if (this.a($$0, $$3)) {
               $$2++;
            }
         }

         return $$2;
      }

      protected abstract boolean a(ary var1, ah var2);

      protected abstract boolean a(ary var1, ah var2, String var3);

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
