import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Deque;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class anp {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xv.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xv.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xv.c("commands.clone.failed"));
   public static final Predicate<dxr> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ew)$$0x.getSource()).e())))
            .then(ex.a("from").then(ex.a("sourceDimension", fh.a()).then(a($$1, $$0x -> fh.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ew, ?> a(es $$0, anp.c<CommandContext<ew>, ash> $$1) {
      return ex.a("begin", gs.a())
         .then(
            ((RequiredArgumentBuilder)ex.a("end", gs.a()).then(a($$0, $$1, $$0x -> ((ew)$$0x.getSource()).e())))
               .then(ex.a("to").then(ex.a("targetDimension", fh.a()).then(a($$0, $$1, $$0x -> fh.a($$0x, "targetDimension")))))
         );
   }

   private static anp.d a(CommandContext<ew> $$0, ash $$1, String $$2) throws CommandSyntaxException {
      jh $$3 = gs.a($$0, $$1, $$2);
      return new anp.d($$1, $$3);
   }

   private static ArgumentBuilder<ew, ?> a(es $$0, anp.c<CommandContext<ew>, ash> $$1, anp.c<CommandContext<ew>, ash> $$2) {
      anp.c<CommandContext<ew>, anp.d> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      anp.c<CommandContext<ew>, anp.d> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      anp.c<CommandContext<ew>, anp.d> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("destination", gs.a())
                  .executes($$3x -> a((ew)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, anp.e.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     ex.a("replace").executes($$3x -> a((ew)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, anp.e.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  ex.a("masked").executes($$3x -> a((ew)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, anp.e.c))
               )
            ))
         .then(
            ex.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> go.a($$0x, "filter"),
                     ex.a("filter", go.a($$0))
                        .executes($$3x -> a((ew)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), go.a($$3x, "filter"), anp.e.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ew, ?> a(
      anp.c<CommandContext<ew>, anp.d> $$0,
      anp.c<CommandContext<ew>, anp.d> $$1,
      anp.c<CommandContext<ew>, anp.d> $$2,
      anp.c<CommandContext<ew>, Predicate<dxr>> $$3,
      ArgumentBuilder<ew, ?> $$4
   ) {
      return $$4.then(ex.a("force").executes($$4x -> a((ew)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), anp.e.a)))
         .then(ex.a("move").executes($$4x -> a((ew)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), anp.e.b)))
         .then(ex.a("normal").executes($$4x -> a((ew)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), anp.e.c)));
   }

   private static int a(ew $$0, anp.d $$1, anp.d $$2, anp.d $$3, Predicate<dxr> $$4, anp.e $$5) throws CommandSyntaxException {
      jh $$6 = $$1.b();
      jh $$7 = $$2.b();
      enu $$8 = enu.a($$6, $$7);
      jh $$9 = $$3.b();
      jh $$10 = $$9.a($$8.c());
      enu $$11 = enu.a($$9, $$10);
      ash $$12 = $$1.a();
      ash $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().N().c(dgw.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<anp.b> $$16 = Lists.newArrayList();
            List<anp.b> $$17 = Lists.newArrayList();
            List<anp.b> $$18 = Lists.newArrayList();
            Deque<jh> $$19 = Lists.newLinkedList();
            jh $$20 = new jh($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     jh $$24 = new jh($$23, $$22, $$21);
                     jh $$25 = $$24.a((kl)$$20);
                     dxr $$26 = new dxr($$12, $$24, false);
                     dxn $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dup $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           anp.a $$29 = new anp.a($$28.e($$0.u()), $$28.s());
                           $$17.add(new anp.b($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.s() && !$$27.m($$12, $$24)) {
                           $$18.add(new anp.b($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new anp.b($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == anp.e.b) {
               for (jh $$30 : $$19) {
                  dup $$31 = $$12.c_($$30);
                  bsv.a($$31);
                  $$12.a($$30, dkg.in.m(), 2);
               }

               for (jh $$32 : $$19) {
                  $$12.a($$32, dkg.a.m(), 3);
               }
            }

            List<anp.b> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<anp.b> $$34 = Lists.reverse($$33);

            for (anp.b $$35 : $$34) {
               dup $$36 = $$13.c_($$35.a);
               bsv.a($$36);
               $$13.a($$35.a, dkg.in.m(), 2);
            }

            int $$37 = 0;

            for (anp.b $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (anp.b $$39 : $$17) {
               dup $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.d($$39.c.a, $$13.K_());
                  $$40.a($$39.c.b);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (anp.b $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.n().a($$12.n(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> xv.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw gs.a.create();
         }
      }
   }

   static record a(ux a, kq b) {
   }

   static record b(jh a, dxn b, @Nullable anp.a c) {
   }

   @FunctionalInterface
   interface c<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record d(ash a, jh b) {
   }

   static enum e {
      a(true),
      b(true),
      c(false);

      private final boolean d;

      private e(final boolean $$0) {
         this.d = $$0;
      }

      public boolean a() {
         return this.d;
      }
   }
}
