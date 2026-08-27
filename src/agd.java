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

public class agd {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> tf.a("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(tf.c("commands.clone.failed"));
   public static final Predicate<dfd> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((dr)$$0x.getSource()).e())))
            .then(ds.a("from").then(ds.a("sourceDimension", ea.a()).then(a($$1, $$0x -> ea.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<dr, ?> a(dl $$0, agd.b<CommandContext<dr>, akk> $$1) {
      return ds.a("begin", fi.a())
         .then(
            ((RequiredArgumentBuilder)ds.a("end", fi.a()).then(a($$0, $$1, $$0x -> ((dr)$$0x.getSource()).e())))
               .then(ds.a("to").then(ds.a("targetDimension", ea.a()).then(a($$0, $$1, $$0x -> ea.a($$0x, "targetDimension")))))
         );
   }

   private static agd.c a(CommandContext<dr> $$0, akk $$1, String $$2) throws CommandSyntaxException {
      gu $$3 = fi.a($$0, $$1, $$2);
      return new agd.c($$1, $$3);
   }

   private static ArgumentBuilder<dr, ?> a(dl $$0, agd.b<CommandContext<dr>, akk> $$1, agd.b<CommandContext<dr>, akk> $$2) {
      agd.b<CommandContext<dr>, agd.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      agd.b<CommandContext<dr>, agd.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      agd.b<CommandContext<dr>, agd.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ds.a("destination", fi.a())
                  .executes($$3x -> a((dr)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, agd.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     ds.a("replace").executes($$3x -> a((dr)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, agd.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  ds.a("masked").executes($$3x -> a((dr)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, agd.d.c))
               )
            ))
         .then(
            ds.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> fe.a($$0x, "filter"),
                     ds.a("filter", fe.a($$0))
                        .executes($$3x -> a((dr)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fe.a($$3x, "filter"), agd.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<dr, ?> a(
      agd.b<CommandContext<dr>, agd.c> $$0,
      agd.b<CommandContext<dr>, agd.c> $$1,
      agd.b<CommandContext<dr>, agd.c> $$2,
      agd.b<CommandContext<dr>, Predicate<dfd>> $$3,
      ArgumentBuilder<dr, ?> $$4
   ) {
      return $$4.then(ds.a("force").executes($$4x -> a((dr)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), agd.d.a)))
         .then(ds.a("move").executes($$4x -> a((dr)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), agd.d.b)))
         .then(ds.a("normal").executes($$4x -> a((dr)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), agd.d.c)));
   }

   private static int a(dr $$0, agd.c $$1, agd.c $$2, agd.c $$3, Predicate<dfd> $$4, agd.d $$5) throws CommandSyntaxException {
      gu $$6 = $$1.b();
      gu $$7 = $$2.b();
      duq $$8 = duq.a($$6, $$7);
      gu $$9 = $$3.b();
      gu $$10 = $$9.a($$8.b());
      duq $$11 = duq.a($$9, $$10);
      akk $$12 = $$1.a();
      akk $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.c() * $$8.d() * $$8.e();
         int $$15 = $$0.e().X().c(cph.x);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<agd.a> $$16 = Lists.newArrayList();
            List<agd.a> $$17 = Lists.newArrayList();
            List<agd.a> $$18 = Lists.newArrayList();
            Deque<gu> $$19 = Lists.newLinkedList();
            gu $$20 = new gu($$11.g() - $$8.g(), $$11.h() - $$8.h(), $$11.i() - $$8.i());

            for (int $$21 = $$8.i(); $$21 <= $$8.l(); $$21++) {
               for (int $$22 = $$8.h(); $$22 <= $$8.k(); $$22++) {
                  for (int $$23 = $$8.g(); $$23 <= $$8.j(); $$23++) {
                     gu $$24 = new gu($$23, $$22, $$21);
                     gu $$25 = $$24.a((hz)$$20);
                     dfd $$26 = new dfd($$12, $$24, false);
                     dez $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dcl $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           qr $$29 = $$28.o();
                           $$17.add(new agd.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new agd.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new agd.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == agd.d.b) {
               for (gu $$30 : $$19) {
                  dcl $$31 = $$12.c_($$30);
                  bgh.a_($$31);
                  $$12.a($$30, csm.hW.n(), 2);
               }

               for (gu $$32 : $$19) {
                  $$12.a($$32, csm.a.n(), 3);
               }
            }

            List<agd.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<agd.a> $$34 = Lists.reverse($$33);

            for (agd.a $$35 : $$34) {
               dcl $$36 = $$13.c_($$35.a);
               bgh.a_($$36);
               $$13.a($$35.a, csm.hW.n(), 2);
            }

            int $$37 = 0;

            for (agd.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (agd.a $$39 : $$17) {
               dcl $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (agd.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.l().a($$12.l(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> tf.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fi.a.create();
         }
      }
   }

   static class a {
      public final gu a;
      public final dez b;
      @Nullable
      public final qr c;

      public a(gu $$0, dez $$1, @Nullable qr $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(akk a, gu b) {
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
