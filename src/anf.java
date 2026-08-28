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

public class anf {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xk.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xk.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xk.c("commands.clone.failed"));
   public static final Predicate<dxs> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ew)$$0x.getSource()).e())))
            .then(ex.a("from").then(ex.a("sourceDimension", fh.a()).then(a($$1, $$0x -> fh.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ew, ?> a(es $$0, anf.c<CommandContext<ew>, arx> $$1) {
      return ex.a("begin", gs.a())
         .then(
            ((RequiredArgumentBuilder)ex.a("end", gs.a()).then(a($$0, $$1, $$0x -> ((ew)$$0x.getSource()).e())))
               .then(ex.a("to").then(ex.a("targetDimension", fh.a()).then(a($$0, $$1, $$0x -> fh.a($$0x, "targetDimension")))))
         );
   }

   private static anf.d a(CommandContext<ew> $$0, arx $$1, String $$2) throws CommandSyntaxException {
      jh $$3 = gs.a($$0, $$1, $$2);
      return new anf.d($$1, $$3);
   }

   private static ArgumentBuilder<ew, ?> a(es $$0, anf.c<CommandContext<ew>, arx> $$1, anf.c<CommandContext<ew>, arx> $$2) {
      anf.c<CommandContext<ew>, anf.d> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      anf.c<CommandContext<ew>, anf.d> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      anf.c<CommandContext<ew>, anf.d> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("destination", gs.a())
                  .executes($$3x -> a((ew)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, anf.e.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     ex.a("replace").executes($$3x -> a((ew)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, anf.e.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  ex.a("masked").executes($$3x -> a((ew)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, anf.e.c))
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
                        .executes($$3x -> a((ew)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), go.a($$3x, "filter"), anf.e.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ew, ?> a(
      anf.c<CommandContext<ew>, anf.d> $$0,
      anf.c<CommandContext<ew>, anf.d> $$1,
      anf.c<CommandContext<ew>, anf.d> $$2,
      anf.c<CommandContext<ew>, Predicate<dxs>> $$3,
      ArgumentBuilder<ew, ?> $$4
   ) {
      return $$4.then(ex.a("force").executes($$4x -> a((ew)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), anf.e.a)))
         .then(ex.a("move").executes($$4x -> a((ew)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), anf.e.b)))
         .then(ex.a("normal").executes($$4x -> a((ew)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), anf.e.c)));
   }

   private static int a(ew $$0, anf.d $$1, anf.d $$2, anf.d $$3, Predicate<dxs> $$4, anf.e $$5) throws CommandSyntaxException {
      jh $$6 = $$1.b();
      jh $$7 = $$2.b();
      env $$8 = env.a($$6, $$7);
      jh $$9 = $$3.b();
      jh $$10 = $$9.a($$8.c());
      env $$11 = env.a($$9, $$10);
      arx $$12 = $$1.a();
      arx $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().O().c(dgv.A);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<anf.b> $$16 = Lists.newArrayList();
            List<anf.b> $$17 = Lists.newArrayList();
            List<anf.b> $$18 = Lists.newArrayList();
            Deque<jh> $$19 = Lists.newLinkedList();
            jh $$20 = new jh($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     jh $$24 = new jh($$23, $$22, $$21);
                     jh $$25 = $$24.a((kl)$$20);
                     dxs $$26 = new dxs($$12, $$24, false);
                     dxo $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        duq $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           anf.a $$29 = new anf.a($$28.e($$0.u()), $$28.r());
                           $$17.add(new anf.b($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.s() && !$$27.m($$12, $$24)) {
                           $$18.add(new anf.b($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new anf.b($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == anf.e.b) {
               for (jh $$30 : $$19) {
                  duq $$31 = $$12.c_($$30);
                  bsr.a($$31);
                  $$12.a($$30, dkf.iu.m(), 2);
               }

               for (jh $$32 : $$19) {
                  $$12.a($$32, dkf.a.m(), 3);
               }
            }

            List<anf.b> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<anf.b> $$34 = Lists.reverse($$33);

            for (anf.b $$35 : $$34) {
               duq $$36 = $$13.c_($$35.a);
               bsr.a($$36);
               $$13.a($$35.a, dkf.iu.m(), 2);
            }

            int $$37 = 0;

            for (anf.b $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (anf.b $$39 : $$17) {
               duq $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.d($$39.c.a, $$13.K_());
                  $$40.a($$39.c.b);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (anf.b $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.n().a($$12.n(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> xk.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw gs.a.create();
         }
      }
   }

   static record a(um a, kq b) {
   }

   static record b(jh a, dxo b, @Nullable anf.a c) {
   }

   @FunctionalInterface
   interface c<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record d(arx a, jh b) {
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
