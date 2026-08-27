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

public class agb {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> te.a("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(te.c("commands.clone.failed"));
   public static final Predicate<dfc> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ds)$$0x.getSource()).e())))
            .then(dt.a("from").then(dt.a("sourceDimension", eb.a()).then(a($$1, $$0x -> eb.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ds, ?> a(dm $$0, agb.b<CommandContext<ds>, aki> $$1) {
      return dt.a("begin", fj.a())
         .then(
            ((RequiredArgumentBuilder)dt.a("end", fj.a()).then(a($$0, $$1, $$0x -> ((ds)$$0x.getSource()).e())))
               .then(dt.a("to").then(dt.a("targetDimension", eb.a()).then(a($$0, $$1, $$0x -> eb.a($$0x, "targetDimension")))))
         );
   }

   private static agb.c a(CommandContext<ds> $$0, aki $$1, String $$2) throws CommandSyntaxException {
      gv $$3 = fj.a($$0, $$1, $$2);
      return new agb.c($$1, $$3);
   }

   private static ArgumentBuilder<ds, ?> a(dm $$0, agb.b<CommandContext<ds>, aki> $$1, agb.b<CommandContext<ds>, aki> $$2) {
      agb.b<CommandContext<ds>, agb.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      agb.b<CommandContext<ds>, agb.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      agb.b<CommandContext<ds>, agb.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("destination", fj.a())
                  .executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, agb.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     dt.a("replace").executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, agb.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  dt.a("masked").executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, agb.d.c))
               )
            ))
         .then(
            dt.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> ff.a($$0x, "filter"),
                     dt.a("filter", ff.a($$0))
                        .executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), ff.a($$3x, "filter"), agb.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ds, ?> a(
      agb.b<CommandContext<ds>, agb.c> $$0,
      agb.b<CommandContext<ds>, agb.c> $$1,
      agb.b<CommandContext<ds>, agb.c> $$2,
      agb.b<CommandContext<ds>, Predicate<dfc>> $$3,
      ArgumentBuilder<ds, ?> $$4
   ) {
      return $$4.then(dt.a("force").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), agb.d.a)))
         .then(dt.a("move").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), agb.d.b)))
         .then(dt.a("normal").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), agb.d.c)));
   }

   private static int a(ds $$0, agb.c $$1, agb.c $$2, agb.c $$3, Predicate<dfc> $$4, agb.d $$5) throws CommandSyntaxException {
      gv $$6 = $$1.b();
      gv $$7 = $$2.b();
      dup $$8 = dup.a($$6, $$7);
      gv $$9 = $$3.b();
      gv $$10 = $$9.a($$8.b());
      dup $$11 = dup.a($$9, $$10);
      aki $$12 = $$1.a();
      aki $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.c() * $$8.d() * $$8.e();
         int $$15 = $$0.e().X().c(cpg.x);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<agb.a> $$16 = Lists.newArrayList();
            List<agb.a> $$17 = Lists.newArrayList();
            List<agb.a> $$18 = Lists.newArrayList();
            Deque<gv> $$19 = Lists.newLinkedList();
            gv $$20 = new gv($$11.g() - $$8.g(), $$11.h() - $$8.h(), $$11.i() - $$8.i());

            for (int $$21 = $$8.i(); $$21 <= $$8.l(); $$21++) {
               for (int $$22 = $$8.h(); $$22 <= $$8.k(); $$22++) {
                  for (int $$23 = $$8.g(); $$23 <= $$8.j(); $$23++) {
                     gv $$24 = new gv($$23, $$22, $$21);
                     gv $$25 = $$24.a((ia)$$20);
                     dfc $$26 = new dfc($$12, $$24, false);
                     dey $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dck $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           qs $$29 = $$28.o();
                           $$17.add(new agb.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new agb.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new agb.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == agb.d.b) {
               for (gv $$30 : $$19) {
                  dck $$31 = $$12.c_($$30);
                  bgf.a_($$31);
                  $$12.a($$30, csl.hW.n(), 2);
               }

               for (gv $$32 : $$19) {
                  $$12.a($$32, csl.a.n(), 3);
               }
            }

            List<agb.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<agb.a> $$34 = Lists.reverse($$33);

            for (agb.a $$35 : $$34) {
               dck $$36 = $$13.c_($$35.a);
               bgf.a_($$36);
               $$13.a($$35.a, csl.hW.n(), 2);
            }

            int $$37 = 0;

            for (agb.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (agb.a $$39 : $$17) {
               dck $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (agb.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.l().a($$12.l(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> te.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fj.a.create();
         }
      }
   }

   static class a {
      public final gv a;
      public final dey b;
      @Nullable
      public final qs c;

      public a(gv $$0, dey $$1, @Nullable qs $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(aki a, gv b) {
   }

   static enum d {
      a(true),
      b(true),
      c(false);

      private final boolean d;

      private d(boolean $$0) {
         this.d = $$0;
      }

      public boolean a() {
         return this.d;
      }
   }
}
