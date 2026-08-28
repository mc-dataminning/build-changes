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

public class amp {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> (xh)$$0);
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> xh.b("commands.advancement.criterionNotFound", $$0, $$1)
   );
   private static final SuggestionProvider<ev> c = ($$0, $$1) -> {
      Collection<ag> $$2 = ((ev)$$0.getSource()).l().aD().b();
      return fa.a($$2.stream().map(ag::a), $$1);
   };

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("advancement").requires($$0x -> $$0x.c(2)))
               .then(
                  ew.a("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("targets", fi.d())
                                       .then(
                                          ew.a("only")
                                             .then(
                                                ((RequiredArgumentBuilder)ew.a("advancement", fw.a())
                                                      .suggests(c)
                                                      .executes(
                                                         $$0x -> a(
                                                               (ev)$$0x.getSource(),
                                                               fi.f($$0x, "targets"),
                                                               amp.a.a,
                                                               a($$0x, fw.a($$0x, "advancement"), amp.b.a)
                                                            )
                                                      ))
                                                   .then(
                                                      ew.a("criterion", StringArgumentType.greedyString())
                                                         .suggests(($$0x, $$1) -> fa.b(fw.a($$0x, "advancement").b().e().keySet(), $$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ev)$$0x.getSource(),
                                                                  fi.f($$0x, "targets"),
                                                                  amp.a.a,
                                                                  fw.a($$0x, "advancement"),
                                                                  StringArgumentType.getString($$0x, "criterion")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ew.a("from")
                                          .then(
                                             ew.a("advancement", fw.a())
                                                .suggests(c)
                                                .executes(
                                                   $$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), amp.a.a, a($$0x, fw.a($$0x, "advancement"), amp.b.c))
                                                )
                                          )
                                    ))
                                 .then(
                                    ew.a("until")
                                       .then(
                                          ew.a("advancement", fw.a())
                                             .suggests(c)
                                             .executes(
                                                $$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), amp.a.a, a($$0x, fw.a($$0x, "advancement"), amp.b.d))
                                             )
                                       )
                                 ))
                              .then(
                                 ew.a("through")
                                    .then(
                                       ew.a("advancement", fw.a())
                                          .suggests(c)
                                          .executes(
                                             $$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), amp.a.a, a($$0x, fw.a($$0x, "advancement"), amp.b.b))
                                          )
                                    )
                              ))
                           .then(
                              ew.a("everything").executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), amp.a.a, ((ev)$$0x.getSource()).l().aD().b()))
                           )
                     )
               ))
            .then(
               ew.a("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("targets", fi.d())
                                    .then(
                                       ew.a("only")
                                          .then(
                                             ((RequiredArgumentBuilder)ew.a("advancement", fw.a())
                                                   .suggests(c)
                                                   .executes(
                                                      $$0x -> a(
                                                            (ev)$$0x.getSource(), fi.f($$0x, "targets"), amp.a.b, a($$0x, fw.a($$0x, "advancement"), amp.b.a)
                                                         )
                                                   ))
                                                .then(
                                                   ew.a("criterion", StringArgumentType.greedyString())
                                                      .suggests(($$0x, $$1) -> fa.b(fw.a($$0x, "advancement").b().e().keySet(), $$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ev)$$0x.getSource(),
                                                               fi.f($$0x, "targets"),
                                                               amp.a.b,
                                                               fw.a($$0x, "advancement"),
                                                               StringArgumentType.getString($$0x, "criterion")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ew.a("from")
                                       .then(
                                          ew.a("advancement", fw.a())
                                             .suggests(c)
                                             .executes(
                                                $$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), amp.a.b, a($$0x, fw.a($$0x, "advancement"), amp.b.c))
                                             )
                                       )
                                 ))
                              .then(
                                 ew.a("until")
                                    .then(
                                       ew.a("advancement", fw.a())
                                          .suggests(c)
                                          .executes(
                                             $$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), amp.a.b, a($$0x, fw.a($$0x, "advancement"), amp.b.d))
                                          )
                                    )
                              ))
                           .then(
                              ew.a("through")
                                 .then(
                                    ew.a("advancement", fw.a())
                                       .suggests(c)
                                       .executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), amp.a.b, a($$0x, fw.a($$0x, "advancement"), amp.b.b)))
                                 )
                           ))
                        .then(ew.a("everything").executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), amp.a.b, ((ev)$$0x.getSource()).l().aD().b())))
                  )
            )
      );
   }

   private static int a(ev $$0, Collection<arn> $$1, amp.a $$2, Collection<ag> $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (arn $$5 : $$1) {
         $$4 += $$2.a($$5, $$3);
      }

      if ($$4 == 0) {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               throw a.create(xh.a($$2.a() + ".one.to.one.failure", af.a($$3.iterator().next()), $$1.iterator().next().S_()));
            } else {
               throw a.create(xh.a($$2.a() + ".one.to.many.failure", af.a($$3.iterator().next()), $$1.size()));
            }
         } else if ($$1.size() == 1) {
            throw a.create(xh.a($$2.a() + ".many.to.one.failure", $$3.size(), $$1.iterator().next().S_()));
         } else {
            throw a.create(xh.a($$2.a() + ".many.to.many.failure", $$3.size(), $$1.size()));
         }
      } else {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               $$0.a(() -> xh.a($$2.a() + ".one.to.one.success", af.a($$3.iterator().next()), $$1.iterator().next().S_()), true);
            } else {
               $$0.a(() -> xh.a($$2.a() + ".one.to.many.success", af.a($$3.iterator().next()), $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> xh.a($$2.a() + ".many.to.one.success", $$3.size(), $$1.iterator().next().S_()), true);
         } else {
            $$0.a(() -> xh.a($$2.a() + ".many.to.many.success", $$3.size(), $$1.size()), true);
         }

         return $$4;
      }
   }

   private static int a(ev $$0, Collection<arn> $$1, amp.a $$2, ag $$3, String $$4) throws CommandSyntaxException {
      int $$5 = 0;
      af $$6 = $$3.b();
      if (!$$6.e().containsKey($$4)) {
         throw b.create(af.a($$3), $$4);
      } else {
         for (arn $$7 : $$1) {
            if ($$2.a($$7, $$3, $$4)) {
               $$5++;
            }
         }

         if ($$5 == 0) {
            if ($$1.size() == 1) {
               throw a.create(xh.a($$2.a() + ".criterion.to.one.failure", $$4, af.a($$3), $$1.iterator().next().S_()));
            } else {
               throw a.create(xh.a($$2.a() + ".criterion.to.many.failure", $$4, af.a($$3), $$1.size()));
            }
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> xh.a($$2.a() + ".criterion.to.one.success", $$4, af.a($$3), $$1.iterator().next().S_()), true);
            } else {
               $$0.a(() -> xh.a($$2.a() + ".criterion.to.many.success", $$4, af.a($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }

   private static List<ag> a(CommandContext<ev> $$0, ag $$1, amp.b $$2) {
      al $$3 = ((ev)$$0.getSource()).l().aD().a();
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
         protected boolean a(arn $$0, ag $$1) {
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
         protected boolean a(arn $$0, ag $$1, String $$2) {
            return $$0.T().a($$1, $$2);
         }
      },
      b("revoke") {
         @Override
         protected boolean a(arn $$0, ag $$1) {
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
         protected boolean a(arn $$0, ag $$1, String $$2) {
            return $$0.T().b($$1, $$2);
         }
      };

      private final String c;

      a(final String $$0) {
         this.c = "commands.advancement." + $$0;
      }

      public int a(arn $$0, Iterable<ag> $$1) {
         int $$2 = 0;

         for (ag $$3 : $$1) {
            if (this.a($$0, $$3)) {
               $$2++;
            }
         }

         return $$2;
      }

      protected abstract boolean a(arn var1, ag var2);

      protected abstract boolean a(arn var1, ag var2, String var3);

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
