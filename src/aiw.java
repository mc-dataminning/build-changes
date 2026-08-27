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

public class aiw {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vb.b("commands.fill.toobig", $$0, $$1));
   static final ff b = new ff(cwb.a.o(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vb.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("from", fk.a())
                  .then(
                     dt.a("to", fk.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a(
                                                "block", fh.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((ds)$$0x.getSource(), dyg.a(fk.a($$0x, "from"), fk.a($$0x, "to")), fh.a($$0x, "block"), aiw.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)dt.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ds)$$0x.getSource(),
                                                            dyg.a(fk.a($$0x, "from"), fk.a($$0x, "to")),
                                                            fh.a($$0x, "block"),
                                                            aiw.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   dt.a("filter", fg.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ds)$$0x.getSource(),
                                                               dyg.a(fk.a($$0x, "from"), fk.a($$0x, "to")),
                                                               fh.a($$0x, "block"),
                                                               aiw.a.a,
                                                               fg.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          dt.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (ds)$$0x.getSource(),
                                                      dyg.a(fk.a($$0x, "from"), fk.a($$0x, "to")),
                                                      fh.a($$0x, "block"),
                                                      aiw.a.a,
                                                      $$0xx -> $$0xx.c().t($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       dt.a("outline")
                                          .executes(
                                             $$0x -> a((ds)$$0x.getSource(), dyg.a(fk.a($$0x, "from"), fk.a($$0x, "to")), fh.a($$0x, "block"), aiw.a.b, null)
                                          )
                                    ))
                                 .then(
                                    dt.a("hollow")
                                       .executes(
                                          $$0x -> a((ds)$$0x.getSource(), dyg.a(fk.a($$0x, "from"), fk.a($$0x, "to")), fh.a($$0x, "block"), aiw.a.c, null)
                                       )
                                 ))
                              .then(
                                 dt.a("destroy")
                                    .executes($$0x -> a((ds)$$0x.getSource(), dyg.a(fk.a($$0x, "from"), fk.a($$0x, "to")), fh.a($$0x, "block"), aiw.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, dyg $$1, ff $$2, aiw.a $$3, @Nullable Predicate<dit> $$4) throws CommandSyntaxException {
      int $$5 = $$1.d() * $$1.e() * $$1.f();
      int $$6 = $$0.e().Y().c(csu.z);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<hv> $$7 = Lists.newArrayList();
         amp $$8 = $$0.e();
         int $$9 = 0;

         for (hv $$10 : hv.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            if ($$4 == null || $$4.test(new dit($$8, $$10, true))) {
               ff $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  dgd $$12 = $$8.c_($$10);
                  bjc.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.i());
                     $$9++;
                  }
               }
            }
         }

         for (hv $$13 : $$7) {
            cvz $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> vb.a("commands.fill.success", $$15), true);
            return $$9;
         }
      }
   }

   static enum a {
      a(($$0, $$1, $$2, $$3) -> $$2),
      b(
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.h()
                  && $$1.u() != $$0.k()
                  && $$1.v() != $$0.i()
                  && $$1.v() != $$0.l()
                  && $$1.w() != $$0.j()
                  && $$1.w() != $$0.m()
               ? null
               : $$2
      ),
      c(
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.h()
                  && $$1.u() != $$0.k()
                  && $$1.v() != $$0.i()
                  && $$1.v() != $$0.l()
                  && $$1.w() != $$0.j()
                  && $$1.w() != $$0.m()
               ? aiw.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final akh.a e;

      private a(akh.a $$0) {
         this.e = $$0;
      }
   }
}
