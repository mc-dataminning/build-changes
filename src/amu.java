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

public class amu {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.clone.failed"));
   public static final Predicate<duw> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((eu)$$0x.getSource()).e())))
            .then(ev.a("from").then(ev.a("sourceDimension", ff.a()).then(a($$1, $$0x -> ff.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<eu, ?> a(eq $$0, amu.c<CommandContext<eu>, arj> $$1) {
      return ev.a("begin", gq.a())
         .then(
            ((RequiredArgumentBuilder)ev.a("end", gq.a()).then(a($$0, $$1, $$0x -> ((eu)$$0x.getSource()).e())))
               .then(ev.a("to").then(ev.a("targetDimension", ff.a()).then(a($$0, $$1, $$0x -> ff.a($$0x, "targetDimension")))))
         );
   }

   private static amu.d a(CommandContext<eu> $$0, arj $$1, String $$2) throws CommandSyntaxException {
      jf $$3 = gq.a($$0, $$1, $$2);
      return new amu.d($$1, $$3);
   }

   private static ArgumentBuilder<eu, ?> a(eq $$0, amu.c<CommandContext<eu>, arj> $$1, amu.c<CommandContext<eu>, arj> $$2) {
      amu.c<CommandContext<eu>, amu.d> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      amu.c<CommandContext<eu>, amu.d> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      amu.c<CommandContext<eu>, amu.d> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("destination", gq.a())
                  .executes($$3x -> a((eu)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amu.e.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     ev.a("replace").executes($$3x -> a((eu)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amu.e.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  ev.a("masked").executes($$3x -> a((eu)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, amu.e.c))
               )
            ))
         .then(
            ev.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> gm.a($$0x, "filter"),
                     ev.a("filter", gm.a($$0))
                        .executes($$3x -> a((eu)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), gm.a($$3x, "filter"), amu.e.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<eu, ?> a(
      amu.c<CommandContext<eu>, amu.d> $$0,
      amu.c<CommandContext<eu>, amu.d> $$1,
      amu.c<CommandContext<eu>, amu.d> $$2,
      amu.c<CommandContext<eu>, Predicate<duw>> $$3,
      ArgumentBuilder<eu, ?> $$4
   ) {
      return $$4.then(ev.a("force").executes($$4x -> a((eu)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amu.e.a)))
         .then(ev.a("move").executes($$4x -> a((eu)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amu.e.b)))
         .then(ev.a("normal").executes($$4x -> a((eu)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amu.e.c)));
   }

   private static int a(eu $$0, amu.d $$1, amu.d $$2, amu.d $$3, Predicate<duw> $$4, amu.e $$5) throws CommandSyntaxException {
      jf $$6 = $$1.b();
      jf $$7 = $$2.b();
      eky $$8 = eky.a($$6, $$7);
      jf $$9 = $$3.b();
      jf $$10 = $$9.a($$8.c());
      eky $$11 = eky.a($$9, $$10);
      arj $$12 = $$1.a();
      arj $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().ac().c(def.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<amu.b> $$16 = Lists.newArrayList();
            List<amu.b> $$17 = Lists.newArrayList();
            List<amu.b> $$18 = Lists.newArrayList();
            Deque<jf> $$19 = Lists.newLinkedList();
            jf $$20 = new jf($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     jf $$24 = new jf($$23, $$22, $$21);
                     jf $$25 = $$24.a((kj)$$20);
                     duw $$26 = new duw($$12, $$24, false);
                     dus $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        drv $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           amu.a $$29 = new amu.a($$28.e($$0.v()), $$28.s());
                           $$17.add(new amu.b($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.s() && !$$27.m($$12, $$24)) {
                           $$18.add(new amu.b($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new amu.b($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == amu.e.b) {
               for (jf $$30 : $$19) {
                  drv $$31 = $$12.c_($$30);
                  brj.a_($$31);
                  $$12.a($$30, dho.hW.n(), 2);
               }

               for (jf $$32 : $$19) {
                  $$12.a($$32, dho.a.n(), 3);
               }
            }

            List<amu.b> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<amu.b> $$34 = Lists.reverse($$33);

            for (amu.b $$35 : $$34) {
               drv $$36 = $$13.c_($$35.a);
               brj.a_($$36);
               $$13.a($$35.a, dho.hW.n(), 2);
            }

            int $$37 = 0;

            for (amu.b $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (amu.b $$39 : $$17) {
               drv $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.d($$39.c.a, $$13.G_());
                  $$40.a($$39.c.b);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (amu.b $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.m().a($$12.m(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> xe.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw gq.a.create();
         }
      }
   }

   static record a(ug a, ko b) {
   }

   static record b(jf a, dus b, @Nullable amu.a c) {
   }

   @FunctionalInterface
   interface c<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record d(arj a, jf b) {
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
