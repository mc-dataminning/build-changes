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

public class aly {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wu.c("commands.clone.failed"));
   public static final Predicate<dsp> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((eq)$$0x.getSource()).e())))
            .then(er.a("from").then(er.a("sourceDimension", fb.a()).then(a($$1, $$0x -> fb.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<eq, ?> a(em $$0, aly.c<CommandContext<eq>, aqm> $$1) {
      return er.a("begin", gm.a())
         .then(
            ((RequiredArgumentBuilder)er.a("end", gm.a()).then(a($$0, $$1, $$0x -> ((eq)$$0x.getSource()).e())))
               .then(er.a("to").then(er.a("targetDimension", fb.a()).then(a($$0, $$1, $$0x -> fb.a($$0x, "targetDimension")))))
         );
   }

   private static aly.d a(CommandContext<eq> $$0, aqm $$1, String $$2) throws CommandSyntaxException {
      ja $$3 = gm.a($$0, $$1, $$2);
      return new aly.d($$1, $$3);
   }

   private static ArgumentBuilder<eq, ?> a(em $$0, aly.c<CommandContext<eq>, aqm> $$1, aly.c<CommandContext<eq>, aqm> $$2) {
      aly.c<CommandContext<eq>, aly.d> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      aly.c<CommandContext<eq>, aly.d> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      aly.c<CommandContext<eq>, aly.d> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("destination", gm.a())
                  .executes($$3x -> a((eq)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, aly.e.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     er.a("replace").executes($$3x -> a((eq)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, aly.e.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  er.a("masked").executes($$3x -> a((eq)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, aly.e.c))
               )
            ))
         .then(
            er.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> gi.a($$0x, "filter"),
                     er.a("filter", gi.a($$0))
                        .executes($$3x -> a((eq)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), gi.a($$3x, "filter"), aly.e.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<eq, ?> a(
      aly.c<CommandContext<eq>, aly.d> $$0,
      aly.c<CommandContext<eq>, aly.d> $$1,
      aly.c<CommandContext<eq>, aly.d> $$2,
      aly.c<CommandContext<eq>, Predicate<dsp>> $$3,
      ArgumentBuilder<eq, ?> $$4
   ) {
      return $$4.then(er.a("force").executes($$4x -> a((eq)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), aly.e.a)))
         .then(er.a("move").executes($$4x -> a((eq)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), aly.e.b)))
         .then(er.a("normal").executes($$4x -> a((eq)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), aly.e.c)));
   }

   private static int a(eq $$0, aly.d $$1, aly.d $$2, aly.d $$3, Predicate<dsp> $$4, aly.e $$5) throws CommandSyntaxException {
      ja $$6 = $$1.b();
      ja $$7 = $$2.b();
      eip $$8 = eip.a($$6, $$7);
      ja $$9 = $$3.b();
      ja $$10 = $$9.a($$8.c());
      eip $$11 = eip.a($$9, $$10);
      aqm $$12 = $$1.a();
      aqm $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().ab().c(dcc.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<aly.b> $$16 = Lists.newArrayList();
            List<aly.b> $$17 = Lists.newArrayList();
            List<aly.b> $$18 = Lists.newArrayList();
            Deque<ja> $$19 = Lists.newLinkedList();
            ja $$20 = new ja($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     ja $$24 = new ja($$23, $$22, $$21);
                     ja $$25 = $$24.a((ke)$$20);
                     dsp $$26 = new dsp($$12, $$24, false);
                     dsl $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dpq $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           aly.a $$29 = new aly.a($$28.e($$0.v()), $$28.t());
                           $$17.add(new aly.b($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new aly.b($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new aly.b($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == aly.e.b) {
               for (ja $$30 : $$19) {
                  dpq $$31 = $$12.c_($$30);
                  bpy.a_($$31);
                  $$12.a($$30, dfk.hW.o(), 2);
               }

               for (ja $$32 : $$19) {
                  $$12.a($$32, dfk.a.o(), 3);
               }
            }

            List<aly.b> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<aly.b> $$34 = Lists.reverse($$33);

            for (aly.b $$35 : $$34) {
               dpq $$36 = $$13.c_($$35.a);
               bpy.a_($$36);
               $$13.a($$35.a, dfk.hW.o(), 2);
            }

            int $$37 = 0;

            for (aly.b $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (aly.b $$39 : $$17) {
               dpq $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.d($$39.c.a, $$13.H_());
                  $$40.a($$39.c.b);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (aly.b $$41 : $$34) {
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
            throw gm.a.create();
         }
      }
   }

   static record a(tx a, kj b) {
   }

   static record b(ja a, dsl b, @Nullable aly.a c) {
   }

   @FunctionalInterface
   interface c<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record d(aqm a, ja b) {
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
