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
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wp.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wp.c("commands.clone.failed"));
   public static final Predicate<dxu> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ex)$$0x.getSource()).e())))
            .then(ey.a("from").then(ey.a("sourceDimension", fi.a()).then(a($$1, $$0x -> fi.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ex, ?> a(et $$0, amk.c<CommandContext<ex>, ard> $$1) {
      return ey.a("begin", gt.a())
         .then(
            ((RequiredArgumentBuilder)ey.a("end", gt.a()).then(a($$0, $$1, $$0x -> ((ex)$$0x.getSource()).e())))
               .then(ey.a("to").then(ey.a("targetDimension", fi.a()).then(a($$0, $$1, $$0x -> fi.a($$0x, "targetDimension")))))
         );
   }

   private static amk.d a(CommandContext<ex> $$0, ard $$1, String $$2) throws CommandSyntaxException {
      ji $$3 = gt.a($$0, $$1, $$2);
      return new amk.d($$1, $$3);
   }

   private static ArgumentBuilder<ex, ?> a(et $$0, amk.c<CommandContext<ex>, ard> $$1, amk.c<CommandContext<ex>, ard> $$2) {
      amk.c<CommandContext<ex>, amk.d> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      amk.c<CommandContext<ex>, amk.d> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      amk.c<CommandContext<ex>, amk.d> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return a($$0, $$3, $$4, $$5, false, ey.a("destination", gt.a())).then(a($$0, $$3, $$4, $$5, true, ey.a("strict")));
   }

   private static ArgumentBuilder<ex, ?> a(
      et $$0,
      amk.c<CommandContext<ex>, amk.d> $$1,
      amk.c<CommandContext<ex>, amk.d> $$2,
      amk.c<CommandContext<ex>, amk.d> $$3,
      boolean $$4,
      ArgumentBuilder<ex, ?> $$5
   ) {
      return $$5.executes($$4x -> a((ex)$$4x.getSource(), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), $$0xx -> true, amk.e.c, $$4))
         .then(a($$1, $$2, $$3, $$0x -> $$0xx -> true, $$4, ey.a("replace")))
         .then(a($$1, $$2, $$3, $$0x -> a, $$4, ey.a("masked")))
         .then(ey.a("filtered").then(a($$1, $$2, $$3, $$0x -> gp.a($$0x, "filter"), $$4, ey.a("filter", gp.a($$0)))));
   }

   private static ArgumentBuilder<ex, ?> a(
      amk.c<CommandContext<ex>, amk.d> $$0,
      amk.c<CommandContext<ex>, amk.d> $$1,
      amk.c<CommandContext<ex>, amk.d> $$2,
      amk.c<CommandContext<ex>, Predicate<dxu>> $$3,
      boolean $$4,
      ArgumentBuilder<ex, ?> $$5
   ) {
      return $$5.executes($$5x -> a((ex)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amk.e.c, $$4))
         .then(ey.a("force").executes($$5x -> a((ex)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amk.e.a, $$4)))
         .then(ey.a("move").executes($$5x -> a((ex)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amk.e.b, $$4)))
         .then(ey.a("normal").executes($$5x -> a((ex)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amk.e.c, $$4)));
   }

   private static int a(ex $$0, amk.d $$1, amk.d $$2, amk.d $$3, Predicate<dxu> $$4, amk.e $$5, boolean $$6) throws CommandSyntaxException {
      ji $$7 = $$1.b();
      ji $$8 = $$2.b();
      eob $$9 = eob.a($$7, $$8);
      ji $$10 = $$3.b();
      ji $$11 = $$10.a($$9.c());
      eob $$12 = eob.a($$10, $$11);
      ard $$13 = $$1.a();
      ard $$14 = $$3.a();
      if (!$$5.a() && $$13 == $$14 && $$12.a($$9)) {
         throw b.create();
      } else {
         int $$15 = $$9.d() * $$9.e() * $$9.f();
         int $$16 = $$0.e().O().c(dgv.A);
         if ($$15 > $$16) {
            throw c.create($$16, $$15);
         } else if ($$13.a($$7, $$8) && $$14.a($$10, $$11)) {
            if ($$14.ak()) {
               throw d.create();
            } else {
               List<amk.b> $$17 = Lists.newArrayList();
               List<amk.b> $$18 = Lists.newArrayList();
               List<amk.b> $$19 = Lists.newArrayList();
               Deque<ji> $$20 = Lists.newLinkedList();
               ji $$21 = new ji($$12.h() - $$9.h(), $$12.i() - $$9.i(), $$12.j() - $$9.j());

               for (int $$22 = $$9.j(); $$22 <= $$9.m(); $$22++) {
                  for (int $$23 = $$9.i(); $$23 <= $$9.l(); $$23++) {
                     for (int $$24 = $$9.h(); $$24 <= $$9.k(); $$24++) {
                        ji $$25 = new ji($$24, $$23, $$22);
                        ji $$26 = $$25.a((km)$$21);
                        dxu $$27 = new dxu($$13, $$25, false);
                        dxq $$28 = $$27.a();
                        if ($$4.test($$27)) {
                           dus $$29 = $$13.c_($$25);
                           if ($$29 != null) {
                              amk.a $$30 = new amk.a($$29.e($$0.u()), $$29.r());
                              $$18.add(new amk.b($$26, $$28, $$30));
                              $$20.addLast($$25);
                           } else if (!$$28.s() && !$$28.m($$13, $$25)) {
                              $$19.add(new amk.b($$26, $$28, null));
                              $$20.addFirst($$25);
                           } else {
                              $$17.add(new amk.b($$26, $$28, null));
                              $$20.addLast($$25);
                           }
                        }
                     }
                  }
               }

               int $$31 = 2 | ($$6 ? 304 : 0);
               if ($$5 == amk.e.b) {
                  for (ji $$32 : $$20) {
                     $$13.a($$32, dkg.iu.m(), $$31 | 304);
                  }

                  int $$33 = $$6 ? $$31 : 3;

                  for (ji $$34 : $$20) {
                     $$13.a($$34, dkg.a.m(), $$33);
                  }
               }

               List<amk.b> $$35 = Lists.newArrayList();
               $$35.addAll($$17);
               $$35.addAll($$18);
               $$35.addAll($$19);
               List<amk.b> $$36 = Lists.reverse($$35);

               for (amk.b $$37 : $$36) {
                  $$14.a($$37.a, dkg.iu.m(), $$31 | 304);
               }

               int $$38 = 0;

               for (amk.b $$39 : $$35) {
                  if ($$14.a($$39.a, $$39.b, $$31)) {
                     $$38++;
                  }
               }

               for (amk.b $$40 : $$18) {
                  dus $$41 = $$14.c_($$40.a);
                  if ($$40.c != null && $$41 != null) {
                     $$41.d($$40.c.a, $$14.F_());
                     $$41.a($$40.c.b);
                     $$41.e();
                  }

                  $$14.a($$40.a, $$40.b, $$31);
               }

               if (!$$6) {
                  for (amk.b $$42 : $$36) {
                     $$14.a($$42.a, $$42.b.b());
                  }
               }

               $$14.n().a($$13.n(), $$9, $$21);
               if ($$38 == 0) {
                  throw d.create();
               } else {
                  int $$43 = $$38;
                  $$0.a(() -> wp.a("commands.clone.success", $$43), true);
                  return $$38;
               }
            }
         } else {
            throw gt.a.create();
         }
      }
   }

   static record a(tq a, kr b) {
   }

   static record b(ji a, dxq b, @Nullable amk.a c) {
   }

   @FunctionalInterface
   interface c<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record d(ard a, ji b) {
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
