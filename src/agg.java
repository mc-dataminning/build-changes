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

public class agg {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ti.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> ti.a("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ti.c("commands.clone.failed"));
   public static final Predicate<dfi> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((dt)$$0x.getSource()).e())))
            .then(du.a("from").then(du.a("sourceDimension", ec.a()).then(a($$1, $$0x -> ec.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<dt, ?> a(dn $$0, agg.b<CommandContext<dt>, akn> $$1) {
      return du.a("begin", fk.a())
         .then(
            ((RequiredArgumentBuilder)du.a("end", fk.a()).then(a($$0, $$1, $$0x -> ((dt)$$0x.getSource()).e())))
               .then(du.a("to").then(du.a("targetDimension", ec.a()).then(a($$0, $$1, $$0x -> ec.a($$0x, "targetDimension")))))
         );
   }

   private static agg.c a(CommandContext<dt> $$0, akn $$1, String $$2) throws CommandSyntaxException {
      gw $$3 = fk.a($$0, $$1, $$2);
      return new agg.c($$1, $$3);
   }

   private static ArgumentBuilder<dt, ?> a(dn $$0, agg.b<CommandContext<dt>, akn> $$1, agg.b<CommandContext<dt>, akn> $$2) {
      agg.b<CommandContext<dt>, agg.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      agg.b<CommandContext<dt>, agg.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      agg.b<CommandContext<dt>, agg.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)du.a("destination", fk.a())
                  .executes($$3x -> a((dt)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, agg.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     du.a("replace").executes($$3x -> a((dt)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, agg.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  du.a("masked").executes($$3x -> a((dt)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, agg.d.c))
               )
            ))
         .then(
            du.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> fg.a($$0x, "filter"),
                     du.a("filter", fg.a($$0))
                        .executes($$3x -> a((dt)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fg.a($$3x, "filter"), agg.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<dt, ?> a(
      agg.b<CommandContext<dt>, agg.c> $$0,
      agg.b<CommandContext<dt>, agg.c> $$1,
      agg.b<CommandContext<dt>, agg.c> $$2,
      agg.b<CommandContext<dt>, Predicate<dfi>> $$3,
      ArgumentBuilder<dt, ?> $$4
   ) {
      return $$4.then(du.a("force").executes($$4x -> a((dt)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), agg.d.a)))
         .then(du.a("move").executes($$4x -> a((dt)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), agg.d.b)))
         .then(du.a("normal").executes($$4x -> a((dt)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), agg.d.c)));
   }

   private static int a(dt $$0, agg.c $$1, agg.c $$2, agg.c $$3, Predicate<dfi> $$4, agg.d $$5) throws CommandSyntaxException {
      gw $$6 = $$1.b();
      gw $$7 = $$2.b();
      duv $$8 = duv.a($$6, $$7);
      gw $$9 = $$3.b();
      gw $$10 = $$9.a($$8.b());
      duv $$11 = duv.a($$9, $$10);
      akn $$12 = $$1.a();
      akn $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.c() * $$8.d() * $$8.e();
         int $$15 = $$0.e().X().c(cpm.x);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<agg.a> $$16 = Lists.newArrayList();
            List<agg.a> $$17 = Lists.newArrayList();
            List<agg.a> $$18 = Lists.newArrayList();
            Deque<gw> $$19 = Lists.newLinkedList();
            gw $$20 = new gw($$11.g() - $$8.g(), $$11.h() - $$8.h(), $$11.i() - $$8.i());

            for (int $$21 = $$8.i(); $$21 <= $$8.l(); $$21++) {
               for (int $$22 = $$8.h(); $$22 <= $$8.k(); $$22++) {
                  for (int $$23 = $$8.g(); $$23 <= $$8.j(); $$23++) {
                     gw $$24 = new gw($$23, $$22, $$21);
                     gw $$25 = $$24.a((ib)$$20);
                     dfi $$26 = new dfi($$12, $$24, false);
                     dfe $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dcq $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           qu $$29 = $$28.o();
                           $$17.add(new agg.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new agg.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new agg.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == agg.d.b) {
               for (gw $$30 : $$19) {
                  dcq $$31 = $$12.c_($$30);
                  bgk.a_($$31);
                  $$12.a($$30, csr.hW.n(), 2);
               }

               for (gw $$32 : $$19) {
                  $$12.a($$32, csr.a.n(), 3);
               }
            }

            List<agg.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<agg.a> $$34 = Lists.reverse($$33);

            for (agg.a $$35 : $$34) {
               dcq $$36 = $$13.c_($$35.a);
               bgk.a_($$36);
               $$13.a($$35.a, csr.hW.n(), 2);
            }

            int $$37 = 0;

            for (agg.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (agg.a $$39 : $$17) {
               dcq $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (agg.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.l().a($$12.l(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> ti.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fk.a.create();
         }
      }
   }

   static class a {
      public final gw a;
      public final dfe b;
      @Nullable
      public final qu c;

      public a(gw $$0, dfe $$1, @Nullable qu $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(akn a, gw b) {
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
