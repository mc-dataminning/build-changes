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

public class aeq {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.fill.toobig", $$0, $$1));
   static final fd b = new fd(cpo.a.n(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(sw.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("from", fi.a())
                  .then(
                     dt.a("to", fi.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                                "block", ff.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((ds)$$0x.getSource(), drs.a(fi.a($$0x, "from"), fi.a($$0x, "to")), ff.a($$0x, "block"), aeq.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)dt.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            drs.a(fi.a($$0x, "from"), fi.a($$0x, "to")),
                                                            ff.a($$0x, "block"),
                                                            aeq.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("filter", fe.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               drs.a(fi.a($$0x, "from"), fi.a($$0x, "to")),
                                                               ff.a($$0x, "block"),
                                                               aeq.a.a,
                                                               fe.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          dt.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      drs.a(fi.a($$0x, "from"), fi.a($$0x, "to")),
                                                      ff.a($$0x, "block"),
                                                      aeq.a.a,
                                                      $$0xx -> $$0xx.c().t($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       dt.a("outline")
                                          .executes(
                                             $$0x -> a((ds)$$0x.getSource(), drs.a(fi.a($$0x, "from"), fi.a($$0x, "to")), ff.a($$0x, "block"), aeq.a.b, null)
                                          )
                                    ))
                                 .then(
                                    dt.a("hollow")
                                       .executes(
                                          $$0x -> a((ds)$$0x.getSource(), drs.a(fi.a($$0x, "from"), fi.a($$0x, "to")), ff.a($$0x, "block"), aeq.a.c, null)
                                       )
                                 ))
                              .then(
                                 dt.a("destroy")
                                    .executes($$0x -> a((ds)$$0x.getSource(), drs.a(fi.a($$0x, "from"), fi.a($$0x, "to")), ff.a($$0x, "block"), aeq.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, drs $$1, fd $$2, aeq.a $$3, @Nullable Predicate<dcf> $$4) throws CommandSyntaxException {
      int $$5 = $$1.c() * $$1.d() * $$1.e();
      int $$6 = $$0.e().X().c(cmi.x);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<gu> $$7 = Lists.newArrayList();
         aif $$8 = $$0.e();
         int $$9 = 0;

         for (gu $$10 : gu.b($$1.g(), $$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l())) {
            if ($$4 == null || $$4.test(new dcf($$8, $$10, true))) {
               fd $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  czn $$12 = $$8.c_($$10);
                  bdo.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.i());
                     $$9++;
                  }
               }
            }
         }

         for (gu $$13 : $$7) {
            cpn $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> sw.a("commands.fill.success", $$15), true);
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
               ? aeq.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final aga.a e;

      private a(aga.a $$0) {
         this.e = $$0;
      }
   }
}
