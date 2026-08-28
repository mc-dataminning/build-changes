import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class anx {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xg.b("commands.fill.toobig", $$0, $$1));
   static final gc b = new gc(dnq.a.m(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xg.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("fill").requires($$0x -> $$0x.c(2)))
            .then(
               el.a("from", gh.a())
                  .then(
                     el.a("to", gh.a())
                        .then(
                           a($$1, el.a("block", ge.a($$1)), $$0x -> gh.a($$0x, "from"), $$0x -> gh.a($$0x, "to"), $$0x -> ge.a($$0x, "block"), $$0x -> null)
                              .then(
                                 ((LiteralArgumentBuilder)el.a("replace")
                                       .executes(
                                          $$0x -> a(
                                                (ek)$$0x.getSource(), esf.a(gh.a($$0x, "from"), gh.a($$0x, "to")), ge.a($$0x, "block"), anx.c.a, null, false
                                             )
                                       ))
                                    .then(
                                       a(
                                          $$1,
                                          el.a("filter", gd.a($$1)),
                                          $$0x -> gh.a($$0x, "from"),
                                          $$0x -> gh.a($$0x, "to"),
                                          $$0x -> ge.a($$0x, "block"),
                                          $$0x -> gd.a($$0x, "filter")
                                       )
                                    )
                              )
                              .then(
                                 el.a("keep")
                                    .executes(
                                       $$0x -> a(
                                             (ek)$$0x.getSource(),
                                             esf.a(gh.a($$0x, "from"), gh.a($$0x, "to")),
                                             ge.a($$0x, "block"),
                                             anx.c.a,
                                             $$0xx -> $$0xx.c().v($$0xx.d()),
                                             false
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static ArgumentBuilder<ek, ?> a(
      eg $$0,
      ArgumentBuilder<ek, ?> $$1,
      aoe<CommandContext<ek>, iw> $$2,
      aoe<CommandContext<ek>, iw> $$3,
      aoe<CommandContext<ek>, gc> $$4,
      anx.d<CommandContext<ek>, Predicate<ebu>> $$5
   ) {
      return $$1.executes($$4x -> a((ek)$$4x.getSource(), esf.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), anx.c.a, $$5.apply($$4x), false))
         .then(
            el.a("outline")
               .executes($$4x -> a((ek)$$4x.getSource(), esf.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), anx.c.b, $$5.apply($$4x), false))
         )
         .then(
            el.a("hollow").executes($$4x -> a((ek)$$4x.getSource(), esf.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), anx.c.c, $$5.apply($$4x), false))
         )
         .then(
            el.a("destroy")
               .executes($$4x -> a((ek)$$4x.getSource(), esf.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), anx.c.d, $$5.apply($$4x), false))
         )
         .then(
            el.a("strict").executes($$4x -> a((ek)$$4x.getSource(), esf.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), anx.c.a, $$5.apply($$4x), true))
         );
   }

   private static int a(ek $$0, esf $$1, gc $$2, anx.c $$3, @Nullable Predicate<ebu> $$4, boolean $$5) throws CommandSyntaxException {
      int $$6 = $$1.d() * $$1.e() * $$1.f();
      int $$7 = $$0.e().O().d(dkf.B);
      if ($$6 > $$7) {
         throw a.create($$7, $$6);
      } else {
         List<iw> $$8 = Lists.newArrayList();
         asb $$9 = $$0.e();
         if ($$9.ak()) {
            throw c.create();
         } else {
            int $$10 = 0;

            for (iw $$11 : iw.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
               if ($$4 == null || $$4.test(new ebu($$9, $$11, true))) {
                  boolean $$12 = false;
                  if ($$3.f.affect($$9, $$11)) {
                     $$12 = true;
                  }

                  gc $$13 = $$3.e.filter($$1, $$11, $$2, $$9);
                  if ($$13 == null) {
                     if ($$12) {
                        $$10++;
                     }
                  } else if (!$$13.a($$9, $$11, 2 | ($$5 ? 816 : 256))) {
                     if ($$12) {
                        $$10++;
                     }
                  } else {
                     if (!$$5) {
                        $$8.add($$11.j());
                     }

                     $$10++;
                  }
               }
            }

            for (iw $$14 : $$8) {
               dno $$15 = $$9.a_($$14).b();
               $$9.a($$14, $$15);
            }

            if ($$10 == 0) {
               throw c.create();
            } else {
               int $$16 = $$10;
               $$0.a(() -> xg.a("commands.fill.success", $$16), true);
               return $$10;
            }
         }
      }
   }

   @FunctionalInterface
   public interface a {
      anx.a a = ($$0, $$1) -> false;

      boolean affect(asb var1, iw var2);
   }

   @FunctionalInterface
   public interface b {
      anx.b a = ($$0, $$1, $$2, $$3) -> $$2;

      @Nullable
      gc filter(esf var1, iw var2, gc var3, asb var4);
   }

   static enum c {
      a(anx.a.a, anx.b.a),
      b(
         anx.a.a,
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
         anx.a.a,
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.h()
                  && $$1.u() != $$0.k()
                  && $$1.v() != $$0.i()
                  && $$1.v() != $$0.l()
                  && $$1.w() != $$0.j()
                  && $$1.w() != $$0.m()
               ? anx.b
               : $$2
      ),
      d(($$0, $$1) -> $$0.b($$1, true), anx.b.a);

      public final anx.b e;
      public final anx.a f;

      private c(final anx.a $$0, final anx.b $$1) {
         this.f = $$0;
         this.e = $$1;
      }
   }

   @FunctionalInterface
   interface d<T, R> {
      @Nullable
      R apply(T var1) throws CommandSyntaxException;
   }
}
