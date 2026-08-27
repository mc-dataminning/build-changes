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

public class aeb {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(sw.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> sw.a("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(sw.c("commands.clone.failed"));
   public static final Predicate<dcf> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ds)$$0x.getSource()).e())))
            .then(dt.a("from").then(dt.a("sourceDimension", ea.a()).then(a($$1, $$0x -> ea.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ds, ?> a(dm $$0, aeb.b<CommandContext<ds>, aif> $$1) {
      return dt.a("begin", fi.a())
         .then(
            ((RequiredArgumentBuilder)dt.a("end", fi.a()).then(a($$0, $$1, $$0x -> ((ds)$$0x.getSource()).e())))
               .then(dt.a("to").then(dt.a("targetDimension", ea.a()).then(a($$0, $$1, $$0x -> ea.a($$0x, "targetDimension")))))
         );
   }

   private static aeb.c a(CommandContext<ds> $$0, aif $$1, String $$2) throws CommandSyntaxException {
      gu $$3 = fi.a($$0, $$1, $$2);
      return new aeb.c($$1, $$3);
   }

   private static ArgumentBuilder<ds, ?> a(dm $$0, aeb.b<CommandContext<ds>, aif> $$1, aeb.b<CommandContext<ds>, aif> $$2) {
      aeb.b<CommandContext<ds>, aeb.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      aeb.b<CommandContext<ds>, aeb.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      aeb.b<CommandContext<ds>, aeb.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("destination", fi.a())
                  .executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, aeb.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     dt.a("replace").executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, aeb.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  dt.a("masked").executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, aeb.d.c))
               )
            ))
         .then(
            dt.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> fe.a($$0x, "filter"),
                     dt.a("filter", fe.a($$0))
                        .executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fe.a($$3x, "filter"), aeb.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ds, ?> a(
      aeb.b<CommandContext<ds>, aeb.c> $$0,
      aeb.b<CommandContext<ds>, aeb.c> $$1,
      aeb.b<CommandContext<ds>, aeb.c> $$2,
      aeb.b<CommandContext<ds>, Predicate<dcf>> $$3,
      ArgumentBuilder<ds, ?> $$4
   ) {
      return $$4.then(dt.a("force").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), aeb.d.a)))
         .then(dt.a("move").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), aeb.d.b)))
         .then(dt.a("normal").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), aeb.d.c)));
   }

   private static int a(ds $$0, aeb.c $$1, aeb.c $$2, aeb.c $$3, Predicate<dcf> $$4, aeb.d $$5) throws CommandSyntaxException {
      gu $$6 = $$1.b();
      gu $$7 = $$2.b();
      drs $$8 = drs.a($$6, $$7);
      gu $$9 = $$3.b();
      gu $$10 = $$9.a($$8.b());
      drs $$11 = drs.a($$9, $$10);
      aif $$12 = $$1.a();
      aif $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.c() * $$8.d() * $$8.e();
         int $$15 = $$0.e().X().c(cmi.x);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<aeb.a> $$16 = Lists.newArrayList();
            List<aeb.a> $$17 = Lists.newArrayList();
            List<aeb.a> $$18 = Lists.newArrayList();
            Deque<gu> $$19 = Lists.newLinkedList();
            gu $$20 = new gu($$11.g() - $$8.g(), $$11.h() - $$8.h(), $$11.i() - $$8.i());

            for (int $$21 = $$8.i(); $$21 <= $$8.l(); $$21++) {
               for (int $$22 = $$8.h(); $$22 <= $$8.k(); $$22++) {
                  for (int $$23 = $$8.g(); $$23 <= $$8.j(); $$23++) {
                     gu $$24 = new gu($$23, $$22, $$21);
                     gu $$25 = $$24.a((hz)$$20);
                     dcf $$26 = new dcf($$12, $$24, false);
                     dcb $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        czn $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           qr $$29 = $$28.o();
                           $$17.add(new aeb.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new aeb.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new aeb.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == aeb.d.b) {
               for (gu $$30 : $$19) {
                  czn $$31 = $$12.c_($$30);
                  bdo.a_($$31);
                  $$12.a($$30, cpo.hW.n(), 2);
               }

               for (gu $$32 : $$19) {
                  $$12.a($$32, cpo.a.n(), 3);
               }
            }

            List<aeb.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<aeb.a> $$34 = Lists.reverse($$33);

            for (aeb.a $$35 : $$34) {
               czn $$36 = $$13.c_($$35.a);
               bdo.a_($$36);
               $$13.a($$35.a, cpo.hW.n(), 2);
            }

            int $$37 = 0;

            for (aeb.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (aeb.a $$39 : $$17) {
               czn $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (aeb.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.l().a($$12.l(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> sw.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fi.a.create();
         }
      }
   }

   static class a {
      public final gu a;
      public final dcb b;
      @Nullable
      public final qr c;

      public a(gu $$0, dcb $$1, @Nullable qr $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(aif a, gu b) {
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
