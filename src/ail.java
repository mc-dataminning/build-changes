import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ail {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> ur.b("commands.fill.toobig", $$0, $$1));
   static final fh b = new fh(cvc.a.o(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ur.c("commands.fill.failed"));

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("from", fm.a())
                  .then(
                     dv.a("to", fm.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a(
                                                "block", fj.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((du)$$0x.getSource(), dwz.a(fm.a($$0x, "from"), fm.a($$0x, "to")), fj.a($$0x, "block"), ail.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)dv.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (du)$$0x.getSource(),
                                                            dwz.a(fm.a($$0x, "from"), fm.a($$0x, "to")),
                                                            fj.a($$0x, "block"),
                                                            ail.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   dv.a("filter", fi.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (du)$$0x.getSource(),
                                                               dwz.a(fm.a($$0x, "from"), fm.a($$0x, "to")),
                                                               fj.a($$0x, "block"),
                                                               ail.a.a,
                                                               fi.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          dv.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (du)$$0x.getSource(),
                                                      dwz.a(fm.a($$0x, "from"), fm.a($$0x, "to")),
                                                      fj.a($$0x, "block"),
                                                      ail.a.a,
                                                      $$0xx -> $$0xx.c().t($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       dv.a("outline")
                                          .executes(
                                             $$0x -> a((du)$$0x.getSource(), dwz.a(fm.a($$0x, "from"), fm.a($$0x, "to")), fj.a($$0x, "block"), ail.a.b, null)
                                          )
                                    ))
                                 .then(
                                    dv.a("hollow")
                                       .executes(
                                          $$0x -> a((du)$$0x.getSource(), dwz.a(fm.a($$0x, "from"), fm.a($$0x, "to")), fj.a($$0x, "block"), ail.a.c, null)
                                       )
                                 ))
                              .then(
                                 dv.a("destroy")
                                    .executes($$0x -> a((du)$$0x.getSource(), dwz.a(fm.a($$0x, "from"), fm.a($$0x, "to")), fj.a($$0x, "block"), ail.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(du $$0, dwz $$1, fh $$2, ail.a $$3, @Nullable Predicate<dhm> $$4) throws CommandSyntaxException {
      int $$5 = $$1.c() * $$1.d() * $$1.e();
      int $$6 = $$0.f().Y().c(crw.z);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<ht> $$7 = Lists.newArrayList();
         ame $$8 = $$0.f();
         int $$9 = 0;

         for (ht $$10 : ht.b($$1.g(), $$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l())) {
            if ($$4 == null || $$4.test(new dhm($$8, $$10, true))) {
               fh $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  dfd $$12 = $$8.c_($$10);
                  bio.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.i());
                     $$9++;
                  }
               }
            }
         }

         for (ht $$13 : $$7) {
            cva $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> ur.a("commands.fill.success", $$15), true);
            return $$9;
         }
      }
   }

   static enum a {
      a(($$0, $$1, $$2, $$3) -> $$2),
      b(
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.g()
                  && $$1.u() != $$0.j()
                  && $$1.v() != $$0.h()
                  && $$1.v() != $$0.k()
                  && $$1.w() != $$0.i()
                  && $$1.w() != $$0.l()
               ? null
               : $$2
      ),
      c(
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.g()
                  && $$1.u() != $$0.j()
                  && $$1.v() != $$0.h()
                  && $$1.v() != $$0.k()
                  && $$1.w() != $$0.i()
                  && $$1.w() != $$0.l()
               ? ail.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final ajw.a e;

      private a(ajw.a $$0) {
         this.e = $$0;
      }
   }
}
