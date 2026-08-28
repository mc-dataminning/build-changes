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

public class amk {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wo.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wo.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wo.c("commands.clone.failed"));
   public static final Predicate<dxb> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ex)$$0x.getSource()).e())))
            .then(ey.a("from").then(ey.a("sourceDimension", fi.a()).then(a($$1, $$0x -> fi.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ex, ?> a(et $$0, amk.c<CommandContext<ex>, arc> $$1) {
      return ey.a("begin", gt.a())
         .then(
            ((RequiredArgumentBuilder)ey.a("end", gt.a()).then(a($$0, $$1, $$0x -> ((ex)$$0x.getSource()).e())))
               .then(ey.a("to").then(ey.a("targetDimension", fi.a()).then(a($$0, $$1, $$0x -> fi.a($$0x, "targetDimension")))))
         );
   }

   private static amk.d a(CommandContext<ex> $$0, arc $$1, String $$2) throws CommandSyntaxException {
      ji $$3 = gt.a($$0, $$1, $$2);
      return new amk.d($$1, $$3);
   }

   private static ArgumentBuilder<ex, ?> a(et $$0, amk.c<CommandContext<ex>, arc> $$1, amk.c<CommandContext<ex>, arc> $$2) {
      amk.c<CommandContext<ex>, amk.d> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      amk.c<CommandContext<ex>, amk.d> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      amk.c<CommandContext<ex>, amk.d> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("destination", gt.a())
                  .executes($$3x -> a((ex)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amk.e.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     ey.a("replace").executes($$3x -> a((ex)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amk.e.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  ey.a("masked").executes($$3x -> a((ex)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, amk.e.c))
               )
            ))
         .then(
            ey.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> gp.a($$0x, "filter"),
                     ey.a("filter", gp.a($$0))
                        .executes($$3x -> a((ex)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), gp.a($$3x, "filter"), amk.e.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ex, ?> a(
      amk.c<CommandContext<ex>, amk.d> $$0,
      amk.c<CommandContext<ex>, amk.d> $$1,
      amk.c<CommandContext<ex>, amk.d> $$2,
      amk.c<CommandContext<ex>, Predicate<dxb>> $$3,
      ArgumentBuilder<ex, ?> $$4
   ) {
      return $$4.then(ey.a("force").executes($$4x -> a((ex)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amk.e.a)))
         .then(ey.a("move").executes($$4x -> a((ex)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amk.e.b)))
         .then(ey.a("normal").executes($$4x -> a((ex)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amk.e.c)));
   }

   private static int a(ex $$0, amk.d $$1, amk.d $$2, amk.d $$3, Predicate<dxb> $$4, amk.e $$5) throws CommandSyntaxException {
      ji $$6 = $$1.b();
      ji $$7 = $$2.b();
      ene $$8 = ene.a($$6, $$7);
      ji $$9 = $$3.b();
      ji $$10 = $$9.a($$8.c());
      ene $$11 = ene.a($$9, $$10);
      arc $$12 = $$1.a();
      arc $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().O().c(dge.A);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<amk.b> $$16 = Lists.newArrayList();
            List<amk.b> $$17 = Lists.newArrayList();
            List<amk.b> $$18 = Lists.newArrayList();
            Deque<ji> $$19 = Lists.newLinkedList();
            ji $$20 = new ji($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     ji $$24 = new ji($$23, $$22, $$21);
                     ji $$25 = $$24.a((km)$$20);
                     dxb $$26 = new dxb($$12, $$24, false);
                     dwx $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dtz $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           amk.a $$29 = new amk.a($$28.e($$0.u()), $$28.r());
                           $$17.add(new amk.b($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.s() && !$$27.m($$12, $$24)) {
                           $$18.add(new amk.b($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new amk.b($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == amk.e.b) {
               for (ji $$30 : $$19) {
                  dtz $$31 = $$12.c_($$30);
                  bsa.a($$31);
                  $$12.a($$30, djo.iu.m(), 2);
               }

               for (ji $$32 : $$19) {
                  $$12.a($$32, djo.a.m(), 3);
               }
            }

            List<amk.b> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<amk.b> $$34 = Lists.reverse($$33);

            for (amk.b $$35 : $$34) {
               dtz $$36 = $$13.c_($$35.a);
               bsa.a($$36);
               $$13.a($$35.a, djo.iu.m(), 2);
            }

            int $$37 = 0;

            for (amk.b $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (amk.b $$39 : $$17) {
               dtz $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.d($$39.c.a, $$13.K_());
                  $$40.a($$39.c.b);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (amk.b $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.n().a($$12.n(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> wo.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw gt.a.create();
         }
      }
   }

   static record a(tq a, kr b) {
   }

   static record b(ji a, dwx b, @Nullable amk.a c) {
   }

   @FunctionalInterface
   interface c<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record d(arc a, ji b) {
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
