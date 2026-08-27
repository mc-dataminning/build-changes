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

public class alv {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("commands.clone.failed"));
   public static final Predicate<dql> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ed)$$0x.getSource()).e())))
            .then(ee.a("from").then(ee.a("sourceDimension", eo.a()).then(a($$1, $$0x -> eo.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ed, ?> a(dz $$0, alv.b<CommandContext<ed>, aqh> $$1) {
      return ee.a("begin", fz.a())
         .then(
            ((RequiredArgumentBuilder)ee.a("end", fz.a()).then(a($$0, $$1, $$0x -> ((ed)$$0x.getSource()).e())))
               .then(ee.a("to").then(ee.a("targetDimension", eo.a()).then(a($$0, $$1, $$0x -> eo.a($$0x, "targetDimension")))))
         );
   }

   private static alv.c a(CommandContext<ed> $$0, aqh $$1, String $$2) throws CommandSyntaxException {
      in $$3 = fz.a($$0, $$1, $$2);
      return new alv.c($$1, $$3);
   }

   private static ArgumentBuilder<ed, ?> a(dz $$0, alv.b<CommandContext<ed>, aqh> $$1, alv.b<CommandContext<ed>, aqh> $$2) {
      alv.b<CommandContext<ed>, alv.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      alv.b<CommandContext<ed>, alv.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      alv.b<CommandContext<ed>, alv.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("destination", fz.a())
                  .executes($$3x -> a((ed)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, alv.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     ee.a("replace").executes($$3x -> a((ed)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, alv.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  ee.a("masked").executes($$3x -> a((ed)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, alv.d.c))
               )
            ))
         .then(
            ee.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> fv.a($$0x, "filter"),
                     ee.a("filter", fv.a($$0))
                        .executes($$3x -> a((ed)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fv.a($$3x, "filter"), alv.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ed, ?> a(
      alv.b<CommandContext<ed>, alv.c> $$0,
      alv.b<CommandContext<ed>, alv.c> $$1,
      alv.b<CommandContext<ed>, alv.c> $$2,
      alv.b<CommandContext<ed>, Predicate<dql>> $$3,
      ArgumentBuilder<ed, ?> $$4
   ) {
      return $$4.then(ee.a("force").executes($$4x -> a((ed)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), alv.d.a)))
         .then(ee.a("move").executes($$4x -> a((ed)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), alv.d.b)))
         .then(ee.a("normal").executes($$4x -> a((ed)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), alv.d.c)));
   }

   private static int a(ed $$0, alv.c $$1, alv.c $$2, alv.c $$3, Predicate<dql> $$4, alv.d $$5) throws CommandSyntaxException {
      in $$6 = $$1.b();
      in $$7 = $$2.b();
      egh $$8 = egh.a($$6, $$7);
      in $$9 = $$3.b();
      in $$10 = $$9.a($$8.c());
      egh $$11 = egh.a($$9, $$10);
      aqh $$12 = $$1.a();
      aqh $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().aa().c(czz.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<alv.a> $$16 = Lists.newArrayList();
            List<alv.a> $$17 = Lists.newArrayList();
            List<alv.a> $$18 = Lists.newArrayList();
            Deque<in> $$19 = Lists.newLinkedList();
            in $$20 = new in($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     in $$24 = new in($$23, $$22, $$21);
                     in $$25 = $$24.a((jr)$$20);
                     dql $$26 = new dql($$12, $$24, false);
                     dqh $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dnm $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           ua $$29 = $$28.d($$0.v());
                           $$17.add(new alv.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new alv.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new alv.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == alv.d.b) {
               for (in $$30 : $$19) {
                  dnm $$31 = $$12.c_($$30);
                  bpd.a_($$31);
                  $$12.a($$30, ddg.hW.n(), 2);
               }

               for (in $$32 : $$19) {
                  $$12.a($$32, ddg.a.n(), 3);
               }
            }

            List<alv.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<alv.a> $$34 = Lists.reverse($$33);

            for (alv.a $$35 : $$34) {
               dnm $$36 = $$13.c_($$35.a);
               bpd.a_($$36);
               $$13.a($$35.a, ddg.hW.n(), 2);
            }

            int $$37 = 0;

            for (alv.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (alv.a $$39 : $$17) {
               dnm $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c, $$13.H_());
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (alv.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.m().a($$12.m(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> wu.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fz.a.create();
         }
      }
   }

   static class a {
      public final in a;
      public final dqh b;
      @Nullable
      public final ua c;

      public a(in $$0, dqh $$1, @Nullable ua $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(aqh a, in b) {
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
