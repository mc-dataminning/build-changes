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

public class amz {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xj.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xj.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xj.c("commands.clone.failed"));
   public static final Predicate<dvz> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ew)$$0x.getSource()).e())))
            .then(ex.a("from").then(ex.a("sourceDimension", fh.a()).then(a($$1, $$0x -> fh.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ew, ?> a(es $$0, amz.c<CommandContext<ew>, arp> $$1) {
      return ex.a("begin", gs.a())
         .then(
            ((RequiredArgumentBuilder)ex.a("end", gs.a()).then(a($$0, $$1, $$0x -> ((ew)$$0x.getSource()).e())))
               .then(ex.a("to").then(ex.a("targetDimension", fh.a()).then(a($$0, $$1, $$0x -> fh.a($$0x, "targetDimension")))))
         );
   }

   private static amz.d a(CommandContext<ew> $$0, arp $$1, String $$2) throws CommandSyntaxException {
      jh $$3 = gs.a($$0, $$1, $$2);
      return new amz.d($$1, $$3);
   }

   private static ArgumentBuilder<ew, ?> a(es $$0, amz.c<CommandContext<ew>, arp> $$1, amz.c<CommandContext<ew>, arp> $$2) {
      amz.c<CommandContext<ew>, amz.d> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      amz.c<CommandContext<ew>, amz.d> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      amz.c<CommandContext<ew>, amz.d> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("destination", gs.a())
                  .executes($$3x -> a((ew)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amz.e.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     ex.a("replace").executes($$3x -> a((ew)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amz.e.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  ex.a("masked").executes($$3x -> a((ew)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, amz.e.c))
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
                        .executes($$3x -> a((ew)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), go.a($$3x, "filter"), amz.e.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ew, ?> a(
      amz.c<CommandContext<ew>, amz.d> $$0,
      amz.c<CommandContext<ew>, amz.d> $$1,
      amz.c<CommandContext<ew>, amz.d> $$2,
      amz.c<CommandContext<ew>, Predicate<dvz>> $$3,
      ArgumentBuilder<ew, ?> $$4
   ) {
      return $$4.then(ex.a("force").executes($$4x -> a((ew)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amz.e.a)))
         .then(ex.a("move").executes($$4x -> a((ew)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amz.e.b)))
         .then(ex.a("normal").executes($$4x -> a((ew)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amz.e.c)));
   }

   private static int a(ew $$0, amz.d $$1, amz.d $$2, amz.d $$3, Predicate<dvz> $$4, amz.e $$5) throws CommandSyntaxException {
      jh $$6 = $$1.b();
      jh $$7 = $$2.b();
      ema $$8 = ema.a($$6, $$7);
      jh $$9 = $$3.b();
      jh $$10 = $$9.a($$8.c());
      ema $$11 = ema.a($$9, $$10);
      arp $$12 = $$1.a();
      arp $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().N().c(dfi.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<amz.b> $$16 = Lists.newArrayList();
            List<amz.b> $$17 = Lists.newArrayList();
            List<amz.b> $$18 = Lists.newArrayList();
            Deque<jh> $$19 = Lists.newLinkedList();
            jh $$20 = new jh($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     jh $$24 = new jh($$23, $$22, $$21);
                     jh $$25 = $$24.a((kl)$$20);
                     dvz $$26 = new dvz($$12, $$24, false);
                     dvv $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dsy $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           amz.a $$29 = new amz.a($$28.e($$0.v()), $$28.s());
                           $$17.add(new amz.b($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.s() && !$$27.m($$12, $$24)) {
                           $$18.add(new amz.b($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new amz.b($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == amz.e.b) {
               for (jh $$30 : $$19) {
                  dsy $$31 = $$12.c_($$30);
                  bsb.a($$31);
                  $$12.a($$30, dis.hW.m(), 2);
               }

               for (jh $$32 : $$19) {
                  $$12.a($$32, dis.a.m(), 3);
               }
            }

            List<amz.b> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<amz.b> $$34 = Lists.reverse($$33);

            for (amz.b $$35 : $$34) {
               dsy $$36 = $$13.c_($$35.a);
               bsb.a($$36);
               $$13.a($$35.a, dis.hW.m(), 2);
            }

            int $$37 = 0;

            for (amz.b $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (amz.b $$39 : $$17) {
               dsy $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.d($$39.c.a, $$13.J_());
                  $$40.a($$39.c.b);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (amz.b $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.n().a($$12.n(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> xj.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw gs.a.create();
         }
      }
   }

   static record a(ul a, kq b) {
   }

   static record b(jh a, dvv b, @Nullable amz.a c) {
   }

   @FunctionalInterface
   interface c<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record d(arp a, jh b) {
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
