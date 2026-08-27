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

public class aig {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vb.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> vb.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vb.c("commands.clone.failed"));
   public static final Predicate<dit> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ds)$$0x.getSource()).e())))
            .then(dt.a("from").then(dt.a("sourceDimension", ec.a()).then(a($$1, $$0x -> ec.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ds, ?> a(dn $$0, aig.b<CommandContext<ds>, amp> $$1) {
      return dt.a("begin", fk.a())
         .then(
            ((RequiredArgumentBuilder)dt.a("end", fk.a()).then(a($$0, $$1, $$0x -> ((ds)$$0x.getSource()).e())))
               .then(dt.a("to").then(dt.a("targetDimension", ec.a()).then(a($$0, $$1, $$0x -> ec.a($$0x, "targetDimension")))))
         );
   }

   private static aig.c a(CommandContext<ds> $$0, amp $$1, String $$2) throws CommandSyntaxException {
      hv $$3 = fk.a($$0, $$1, $$2);
      return new aig.c($$1, $$3);
   }

   private static ArgumentBuilder<ds, ?> a(dn $$0, aig.b<CommandContext<ds>, amp> $$1, aig.b<CommandContext<ds>, amp> $$2) {
      aig.b<CommandContext<ds>, aig.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      aig.b<CommandContext<ds>, aig.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      aig.b<CommandContext<ds>, aig.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("destination", fk.a())
                  .executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, aig.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     dt.a("replace").executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, aig.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  dt.a("masked").executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, aig.d.c))
               )
            ))
         .then(
            dt.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> fg.a($$0x, "filter"),
                     dt.a("filter", fg.a($$0))
                        .executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fg.a($$3x, "filter"), aig.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ds, ?> a(
      aig.b<CommandContext<ds>, aig.c> $$0,
      aig.b<CommandContext<ds>, aig.c> $$1,
      aig.b<CommandContext<ds>, aig.c> $$2,
      aig.b<CommandContext<ds>, Predicate<dit>> $$3,
      ArgumentBuilder<ds, ?> $$4
   ) {
      return $$4.then(dt.a("force").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), aig.d.a)))
         .then(dt.a("move").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), aig.d.b)))
         .then(dt.a("normal").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), aig.d.c)));
   }

   private static int a(ds $$0, aig.c $$1, aig.c $$2, aig.c $$3, Predicate<dit> $$4, aig.d $$5) throws CommandSyntaxException {
      hv $$6 = $$1.b();
      hv $$7 = $$2.b();
      dyg $$8 = dyg.a($$6, $$7);
      hv $$9 = $$3.b();
      hv $$10 = $$9.a($$8.c());
      dyg $$11 = dyg.a($$9, $$10);
      amp $$12 = $$1.a();
      amp $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().Y().c(csu.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<aig.a> $$16 = Lists.newArrayList();
            List<aig.a> $$17 = Lists.newArrayList();
            List<aig.a> $$18 = Lists.newArrayList();
            Deque<hv> $$19 = Lists.newLinkedList();
            hv $$20 = new hv($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     hv $$24 = new hv($$23, $$22, $$21);
                     hv $$25 = $$24.a((iz)$$20);
                     dit $$26 = new dit($$12, $$24, false);
                     dip $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dgd $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           sj $$29 = $$28.q();
                           $$17.add(new aig.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new aig.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new aig.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == aig.d.b) {
               for (hv $$30 : $$19) {
                  dgd $$31 = $$12.c_($$30);
                  bjc.a_($$31);
                  $$12.a($$30, cwb.hW.o(), 2);
               }

               for (hv $$32 : $$19) {
                  $$12.a($$32, cwb.a.o(), 3);
               }
            }

            List<aig.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<aig.a> $$34 = Lists.reverse($$33);

            for (aig.a $$35 : $$34) {
               dgd $$36 = $$13.c_($$35.a);
               bjc.a_($$36);
               $$13.a($$35.a, cwb.hW.o(), 2);
            }

            int $$37 = 0;

            for (aig.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (aig.a $$39 : $$17) {
               dgd $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (aig.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.l().a($$12.l(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> vb.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fk.a.create();
         }
      }
   }

   static class a {
      public final hv a;
      public final dip b;
      @Nullable
      public final sj c;

      public a(hv $$0, dip $$1, @Nullable sj $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(amp a, hv b) {
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
