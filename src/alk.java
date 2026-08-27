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

public class alk {
   private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> (ws)$$0);
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(
      ($$0, $$1) -> ws.a("commands.advancement.criterionNotFound", $$0, $$1)
   );
   private static final SuggestionProvider<ec> c = ($$0, $$1) -> {
      Collection<af> $$2 = ((ec)$$0.getSource()).l().aE().b();
      return eh.a($$2.stream().map(af::a), $$1);
   };

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("advancement").requires($$0x -> $$0x.c(2)))
               .then(
                  ed.a("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("targets", ep.d())
                                       .then(
                                          ed.a("only")
                                             .then(
                                                ((RequiredArgumentBuilder)ed.a("advancement", fd.a())
                                                      .suggests(c)
                                                      .executes(
                                                         $$0x -> a(
                                                               (ec)$$0x.getSource(),
                                                               ep.f($$0x, "targets"),
                                                               alk.a.a,
                                                               a($$0x, fd.a($$0x, "advancement"), alk.b.a)
                                                            )
                                                      ))
                                                   .then(
                                                      ed.a("criterion", StringArgumentType.greedyString())
                                                         .suggests(($$0x, $$1) -> eh.b(fd.a($$0x, "advancement").b().e().keySet(), $$1))
                                                         .executes(
                                                            $$0x -> a(
                                                                  (ec)$$0x.getSource(),
                                                                  ep.f($$0x, "targets"),
                                                                  alk.a.a,
                                                                  fd.a($$0x, "advancement"),
                                                                  StringArgumentType.getString($$0x, "criterion")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ed.a("from")
                                          .then(
                                             ed.a("advancement", fd.a())
                                                .suggests(c)
                                                .executes(
                                                   $$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), alk.a.a, a($$0x, fd.a($$0x, "advancement"), alk.b.c))
                                                )
                                          )
                                    ))
                                 .then(
                                    ed.a("until")
                                       .then(
                                          ed.a("advancement", fd.a())
                                             .suggests(c)
                                             .executes(
                                                $$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), alk.a.a, a($$0x, fd.a($$0x, "advancement"), alk.b.d))
                                             )
                                       )
                                 ))
                              .then(
                                 ed.a("through")
                                    .then(
                                       ed.a("advancement", fd.a())
                                          .suggests(c)
                                          .executes(
                                             $$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), alk.a.a, a($$0x, fd.a($$0x, "advancement"), alk.b.b))
                                          )
                                    )
                              ))
                           .then(
                              ed.a("everything").executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), alk.a.a, ((ec)$$0x.getSource()).l().aE().b()))
                           )
                     )
               ))
            .then(
               ed.a("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("targets", ep.d())
                                    .then(
                                       ed.a("only")
                                          .then(
                                             ((RequiredArgumentBuilder)ed.a("advancement", fd.a())
                                                   .suggests(c)
                                                   .executes(
                                                      $$0x -> a(
                                                            (ec)$$0x.getSource(), ep.f($$0x, "targets"), alk.a.b, a($$0x, fd.a($$0x, "advancement"), alk.b.a)
                                                         )
                                                   ))
                                                .then(
                                                   ed.a("criterion", StringArgumentType.greedyString())
                                                      .suggests(($$0x, $$1) -> eh.b(fd.a($$0x, "advancement").b().e().keySet(), $$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ec)$$0x.getSource(),
                                                               ep.f($$0x, "targets"),
                                                               alk.a.b,
                                                               fd.a($$0x, "advancement"),
                                                               StringArgumentType.getString($$0x, "criterion")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ed.a("from")
                                       .then(
                                          ed.a("advancement", fd.a())
                                             .suggests(c)
                                             .executes(
                                                $$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), alk.a.b, a($$0x, fd.a($$0x, "advancement"), alk.b.c))
                                             )
                                       )
                                 ))
                              .then(
                                 ed.a("until")
                                    .then(
                                       ed.a("advancement", fd.a())
                                          .suggests(c)
                                          .executes(
                                             $$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), alk.a.b, a($$0x, fd.a($$0x, "advancement"), alk.b.d))
                                          )
                                    )
                              ))
                           .then(
                              ed.a("through")
                                 .then(
                                    ed.a("advancement", fd.a())
                                       .suggests(c)
                                       .executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), alk.a.b, a($$0x, fd.a($$0x, "advancement"), alk.b.b)))
                                 )
                           ))
                        .then(ed.a("everything").executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), alk.a.b, ((ec)$$0x.getSource()).l().aE().b())))
                  )
            )
      );
   }

   private static int a(ec $$0, Collection<aqf> $$1, alk.a $$2, Collection<af> $$3) throws CommandSyntaxException {
      int $$4 = 0;

      for (aqf $$5 : $$1) {
         $$4 += $$2.a($$5, $$3);
      }

      if ($$4 == 0) {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               throw a.create(ws.a($$2.a() + ".one.to.one.failure", ae.a($$3.iterator().next()), $$1.iterator().next().O_()));
            } else {
               throw a.create(ws.a($$2.a() + ".one.to.many.failure", ae.a($$3.iterator().next()), $$1.size()));
            }
         } else if ($$1.size() == 1) {
            throw a.create(ws.a($$2.a() + ".many.to.one.failure", $$3.size(), $$1.iterator().next().O_()));
         } else {
            throw a.create(ws.a($$2.a() + ".many.to.many.failure", $$3.size(), $$1.size()));
         }
      } else {
         if ($$3.size() == 1) {
            if ($$1.size() == 1) {
               $$0.a(() -> ws.a($$2.a() + ".one.to.one.success", ae.a($$3.iterator().next()), $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> ws.a($$2.a() + ".one.to.many.success", ae.a($$3.iterator().next()), $$1.size()), true);
            }
         } else if ($$1.size() == 1) {
            $$0.a(() -> ws.a($$2.a() + ".many.to.one.success", $$3.size(), $$1.iterator().next().O_()), true);
         } else {
            $$0.a(() -> ws.a($$2.a() + ".many.to.many.success", $$3.size(), $$1.size()), true);
         }

         return $$4;
      }
   }

   private static int a(ec $$0, Collection<aqf> $$1, alk.a $$2, af $$3, String $$4) throws CommandSyntaxException {
      int $$5 = 0;
      ae $$6 = $$3.b();
      if (!$$6.e().containsKey($$4)) {
         throw b.create(ae.a($$3), $$4);
      } else {
         for (aqf $$7 : $$1) {
            if ($$2.a($$7, $$3, $$4)) {
               $$5++;
            }
         }

         if ($$5 == 0) {
            if ($$1.size() == 1) {
               throw a.create(ws.a($$2.a() + ".criterion.to.one.failure", $$4, ae.a($$3), $$1.iterator().next().O_()));
            } else {
               throw a.create(ws.a($$2.a() + ".criterion.to.many.failure", $$4, ae.a($$3), $$1.size()));
            }
         } else {
            if ($$1.size() == 1) {
               $$0.a(() -> ws.a($$2.a() + ".criterion.to.one.success", $$4, ae.a($$3), $$1.iterator().next().O_()), true);
            } else {
               $$0.a(() -> ws.a($$2.a() + ".criterion.to.many.success", $$4, ae.a($$3), $$1.size()), true);
            }

            return $$5;
         }
      }
   }

   private static List<af> a(CommandContext<ec> $$0, af $$1, alk.b $$2) {
      ak $$3 = ((ec)$$0.getSource()).l().aE().a();
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
         protected boolean a(aqf $$0, af $$1) {
            ah $$2 = $$0.Q().b($$1);
            if ($$2.a()) {
               return false;
            } else {
               for (String $$3 : $$2.e()) {
                  $$0.Q().a($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(aqf $$0, af $$1, String $$2) {
            return $$0.Q().a($$1, $$2);
         }
      },
      b("revoke") {
         @Override
         protected boolean a(aqf $$0, af $$1) {
            ah $$2 = $$0.Q().b($$1);
            if (!$$2.b()) {
               return false;
            } else {
               for (String $$3 : $$2.f()) {
                  $$0.Q().b($$1, $$3);
               }

               return true;
            }
         }

         @Override
         protected boolean a(aqf $$0, af $$1, String $$2) {
            return $$0.Q().b($$1, $$2);
         }
      };

      private final String c;

      a(String $$0) {
         this.c = "commands.advancement." + $$0;
      }

      public int a(aqf $$0, Iterable<af> $$1) {
         int $$2 = 0;

         for (af $$3 : $$1) {
            if (this.a($$0, $$3)) {
               $$2++;
            }
         }

         return $$2;
      }

      protected abstract boolean a(aqf var1, af var2);

      protected abstract boolean a(aqf var1, af var2, String var3);

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
