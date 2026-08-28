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

public class anf {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xl.b("commands.fill.toobig", $$0, $$1));
   static final gg b = new gg(dew.a.n(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xl.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               eq.a("from", gl.a())
                  .then(
                     eq.a("to", gl.a())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a(
                                                "block", gi.a($$1)
                                             )
                                             .executes(
                                                $$0x -> a((ep)$$0x.getSource(), ehx.a(gl.a($$0x, "from"), gl.a($$0x, "to")), gi.a($$0x, "block"), anf.a.a, null)
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)eq.a("replace")
                                                   .executes(
                                                      $$0x -> a(
                                                            (ep)$$0x.getSource(),
                                                            ehx.a(gl.a($$0x, "from"), gl.a($$0x, "to")),
                                                            gi.a($$0x, "block"),
                                                            anf.a.a,
                                                            null
                                                         )
                                                   ))
                                                .then(
                                                   eq.a("filter", gh.a($$1))
                                                      .executes(
                                                         $$0x -> a(
                                                               (ep)$$0x.getSource(),
                                                               ehx.a(gl.a($$0x, "from"), gl.a($$0x, "to")),
                                                               gi.a($$0x, "block"),
                                                               anf.a.a,
                                                               gh.a($$0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          eq.a("keep")
                                             .executes(
                                                $$0x -> a(
                                                      (ep)$$0x.getSource(),
                                                      ehx.a(gl.a($$0x, "from"), gl.a($$0x, "to")),
                                                      gi.a($$0x, "block"),
                                                      anf.a.a,
                                                      $$0xx -> $$0xx.c().u($$0xx.d())
                                                   )
                                             )
                                       ))
                                    .then(
                                       eq.a("outline")
                                          .executes(
                                             $$0x -> a((ep)$$0x.getSource(), ehx.a(gl.a($$0x, "from"), gl.a($$0x, "to")), gi.a($$0x, "block"), anf.a.b, null)
                                          )
                                    ))
                                 .then(
                                    eq.a("hollow")
                                       .executes(
                                          $$0x -> a((ep)$$0x.getSource(), ehx.a(gl.a($$0x, "from"), gl.a($$0x, "to")), gi.a($$0x, "block"), anf.a.c, null)
                                       )
                                 ))
                              .then(
                                 eq.a("destroy")
                                    .executes($$0x -> a((ep)$$0x.getSource(), ehx.a(gl.a($$0x, "from"), gl.a($$0x, "to")), gi.a($$0x, "block"), anf.a.d, null))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ep $$0, ehx $$1, gg $$2, anf.a $$3, @Nullable Predicate<dsb> $$4) throws CommandSyntaxException {
      int $$5 = $$1.d() * $$1.e() * $$1.f();
      int $$6 = $$0.e().ab().c(dbp.z);
      if ($$5 > $$6) {
         throw a.create($$6, $$5);
      } else {
         List<iz> $$7 = Lists.newArrayList();
         arb $$8 = $$0.e();
         int $$9 = 0;

         for (iz $$10 : iz.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
            if ($$4 == null || $$4.test(new dsb($$8, $$10, true))) {
               gg $$11 = $$3.e.filter($$1, $$10, $$2, $$8);
               if ($$11 != null) {
                  dpc $$12 = $$8.c_($$10);
                  bqg.a_($$12);
                  if ($$11.a($$8, $$10, 2)) {
                     $$7.add($$10.i());
                     $$9++;
                  }
               }
            }
         }

         for (iz $$13 : $$7) {
            deu $$14 = $$8.a_($$13).b();
            $$8.b($$13, $$14);
         }

         if ($$9 == 0) {
            throw c.create();
         } else {
            int $$15 = $$9;
            $$0.a(() -> xl.a("commands.fill.success", $$15), true);
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
               ? anf.b
               : $$2
      ),
      d(($$0, $$1, $$2, $$3) -> {
         $$3.b($$1, true);
         return $$2;
      });

      public final aor.a e;

      private a(final aor.a $$0) {
         this.e = $$0;
      }
   }
}
