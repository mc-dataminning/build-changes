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

public class alg {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wg.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wg.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wg.c("commands.clone.failed"));
   public static final Predicate<dpd> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((du)$$0x.getSource()).e())))
            .then(dv.a("from").then(dv.a("sourceDimension", ef.a()).then(a($$1, $$0x -> ef.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<du, ?> a(dq $$0, alg.b<CommandContext<du>, aps> $$1) {
      return dv.a("begin", fo.a())
         .then(
            ((RequiredArgumentBuilder)dv.a("end", fo.a()).then(a($$0, $$1, $$0x -> ((du)$$0x.getSource()).e())))
               .then(dv.a("to").then(dv.a("targetDimension", ef.a()).then(a($$0, $$1, $$0x -> ef.a($$0x, "targetDimension")))))
         );
   }

   private static alg.c a(CommandContext<du> $$0, aps $$1, String $$2) throws CommandSyntaxException {
      ib $$3 = fo.a($$0, $$1, $$2);
      return new alg.c($$1, $$3);
   }

   private static ArgumentBuilder<du, ?> a(dq $$0, alg.b<CommandContext<du>, aps> $$1, alg.b<CommandContext<du>, aps> $$2) {
      alg.b<CommandContext<du>, alg.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      alg.b<CommandContext<du>, alg.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      alg.b<CommandContext<du>, alg.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("destination", fo.a())
                  .executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, alg.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     dv.a("replace").executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, alg.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  dv.a("masked").executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, alg.d.c))
               )
            ))
         .then(
            dv.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> fk.a($$0x, "filter"),
                     dv.a("filter", fk.a($$0))
                        .executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fk.a($$3x, "filter"), alg.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<du, ?> a(
      alg.b<CommandContext<du>, alg.c> $$0,
      alg.b<CommandContext<du>, alg.c> $$1,
      alg.b<CommandContext<du>, alg.c> $$2,
      alg.b<CommandContext<du>, Predicate<dpd>> $$3,
      ArgumentBuilder<du, ?> $$4
   ) {
      return $$4.then(dv.a("force").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), alg.d.a)))
         .then(dv.a("move").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), alg.d.b)))
         .then(dv.a("normal").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), alg.d.c)));
   }

   private static int a(du $$0, alg.c $$1, alg.c $$2, alg.c $$3, Predicate<dpd> $$4, alg.d $$5) throws CommandSyntaxException {
      ib $$6 = $$1.b();
      ib $$7 = $$2.b();
      eez $$8 = eez.a($$6, $$7);
      ib $$9 = $$3.b();
      ib $$10 = $$9.a($$8.c());
      eez $$11 = eez.a($$9, $$10);
      aps $$12 = $$1.a();
      aps $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().aa().c(cyt.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<alg.a> $$16 = Lists.newArrayList();
            List<alg.a> $$17 = Lists.newArrayList();
            List<alg.a> $$18 = Lists.newArrayList();
            Deque<ib> $$19 = Lists.newLinkedList();
            ib $$20 = new ib($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     ib $$24 = new ib($$23, $$22, $$21);
                     ib $$25 = $$24.a((jg)$$20);
                     dpd $$26 = new dpd($$12, $$24, false);
                     doz $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dmf $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           tm $$29 = $$28.d($$0.v());
                           $$17.add(new alg.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new alg.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new alg.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == alg.d.b) {
               for (ib $$30 : $$19) {
                  dmf $$31 = $$12.c_($$30);
                  bnr.a_($$31);
                  $$12.a($$30, dca.hW.n(), 2);
               }

               for (ib $$32 : $$19) {
                  $$12.a($$32, dca.a.n(), 3);
               }
            }

            List<alg.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<alg.a> $$34 = Lists.reverse($$33);

            for (alg.a $$35 : $$34) {
               dmf $$36 = $$13.c_($$35.a);
               bnr.a_($$36);
               $$13.a($$35.a, dca.hW.n(), 2);
            }

            int $$37 = 0;

            for (alg.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (alg.a $$39 : $$17) {
               dmf $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c, $$13.H_());
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (alg.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.m().a($$12.m(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> wg.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fo.a.create();
         }
      }
   }

   static class a {
      public final ib a;
      public final doz b;
      @Nullable
      public final tm c;

      public a(ib $$0, doz $$1, @Nullable tm $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(aps a, ib b) {
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
