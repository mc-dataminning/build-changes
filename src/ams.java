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

public class ams {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xo.c("commands.clone.failed"));
   public static final Predicate<dsf> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ep)$$0x.getSource()).e())))
            .then(eq.a("from").then(eq.a("sourceDimension", fa.a()).then(a($$1, $$0x -> fa.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ep, ?> a(el $$0, ams.c<CommandContext<ep>, are> $$1) {
      return eq.a("begin", gl.a())
         .then(
            ((RequiredArgumentBuilder)eq.a("end", gl.a()).then(a($$0, $$1, $$0x -> ((ep)$$0x.getSource()).e())))
               .then(eq.a("to").then(eq.a("targetDimension", fa.a()).then(a($$0, $$1, $$0x -> fa.a($$0x, "targetDimension")))))
         );
   }

   private static ams.d a(CommandContext<ep> $$0, are $$1, String $$2) throws CommandSyntaxException {
      iz $$3 = gl.a($$0, $$1, $$2);
      return new ams.d($$1, $$3);
   }

   private static ArgumentBuilder<ep, ?> a(el $$0, ams.c<CommandContext<ep>, are> $$1, ams.c<CommandContext<ep>, are> $$2) {
      ams.c<CommandContext<ep>, ams.d> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      ams.c<CommandContext<ep>, ams.d> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      ams.c<CommandContext<ep>, ams.d> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("destination", gl.a())
                  .executes($$3x -> a((ep)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ams.e.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     eq.a("replace").executes($$3x -> a((ep)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ams.e.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  eq.a("masked").executes($$3x -> a((ep)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, ams.e.c))
               )
            ))
         .then(
            eq.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> gh.a($$0x, "filter"),
                     eq.a("filter", gh.a($$0))
                        .executes($$3x -> a((ep)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), gh.a($$3x, "filter"), ams.e.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ep, ?> a(
      ams.c<CommandContext<ep>, ams.d> $$0,
      ams.c<CommandContext<ep>, ams.d> $$1,
      ams.c<CommandContext<ep>, ams.d> $$2,
      ams.c<CommandContext<ep>, Predicate<dsf>> $$3,
      ArgumentBuilder<ep, ?> $$4
   ) {
      return $$4.then(eq.a("force").executes($$4x -> a((ep)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ams.e.a)))
         .then(eq.a("move").executes($$4x -> a((ep)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ams.e.b)))
         .then(eq.a("normal").executes($$4x -> a((ep)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ams.e.c)));
   }

   private static int a(ep $$0, ams.d $$1, ams.d $$2, ams.d $$3, Predicate<dsf> $$4, ams.e $$5) throws CommandSyntaxException {
      iz $$6 = $$1.b();
      iz $$7 = $$2.b();
      eib $$8 = eib.a($$6, $$7);
      iz $$9 = $$3.b();
      iz $$10 = $$9.a($$8.c());
      eib $$11 = eib.a($$9, $$10);
      are $$12 = $$1.a();
      are $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().ab().c(dbt.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<ams.b> $$16 = Lists.newArrayList();
            List<ams.b> $$17 = Lists.newArrayList();
            List<ams.b> $$18 = Lists.newArrayList();
            Deque<iz> $$19 = Lists.newLinkedList();
            iz $$20 = new iz($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     iz $$24 = new iz($$23, $$22, $$21);
                     iz $$25 = $$24.a((kd)$$20);
                     dsf $$26 = new dsf($$12, $$24, false);
                     dsb $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dpg $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           ams.a $$29 = new ams.a($$28.e($$0.v()), $$28.t());
                           $$17.add(new ams.b($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new ams.b($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new ams.b($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == ams.e.b) {
               for (iz $$30 : $$19) {
                  dpg $$31 = $$12.c_($$30);
                  bqk.a_($$31);
                  $$12.a($$30, dfa.hW.o(), 2);
               }

               for (iz $$32 : $$19) {
                  $$12.a($$32, dfa.a.o(), 3);
               }
            }

            List<ams.b> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<ams.b> $$34 = Lists.reverse($$33);

            for (ams.b $$35 : $$34) {
               dpg $$36 = $$13.c_($$35.a);
               bqk.a_($$36);
               $$13.a($$35.a, dfa.hW.o(), 2);
            }

            int $$37 = 0;

            for (ams.b $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (ams.b $$39 : $$17) {
               dpg $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.d($$39.c.a, $$13.H_());
                  $$40.a($$39.c.b);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (ams.b $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.m().a($$12.m(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> xo.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw gl.a.create();
         }
      }
   }

   static record a(ur a, ki b) {
   }

   static record b(iz a, dsb b, @Nullable ams.a c) {
   }

   @FunctionalInterface
   interface c<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record d(are a, iz b) {
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
