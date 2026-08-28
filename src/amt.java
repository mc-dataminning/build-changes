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

public class amt {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xp.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xp.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xp.c("commands.clone.failed"));
   public static final Predicate<dsi> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ep)$$0x.getSource()).e())))
            .then(eq.a("from").then(eq.a("sourceDimension", fa.a()).then(a($$1, $$0x -> fa.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ep, ?> a(el $$0, amt.c<CommandContext<ep>, arf> $$1) {
      return eq.a("begin", gl.a())
         .then(
            ((RequiredArgumentBuilder)eq.a("end", gl.a()).then(a($$0, $$1, $$0x -> ((ep)$$0x.getSource()).e())))
               .then(eq.a("to").then(eq.a("targetDimension", fa.a()).then(a($$0, $$1, $$0x -> fa.a($$0x, "targetDimension")))))
         );
   }

   private static amt.d a(CommandContext<ep> $$0, arf $$1, String $$2) throws CommandSyntaxException {
      iz $$3 = gl.a($$0, $$1, $$2);
      return new amt.d($$1, $$3);
   }

   private static ArgumentBuilder<ep, ?> a(el $$0, amt.c<CommandContext<ep>, arf> $$1, amt.c<CommandContext<ep>, arf> $$2) {
      amt.c<CommandContext<ep>, amt.d> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      amt.c<CommandContext<ep>, amt.d> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      amt.c<CommandContext<ep>, amt.d> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("destination", gl.a())
                  .executes($$3x -> a((ep)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amt.e.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     eq.a("replace").executes($$3x -> a((ep)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amt.e.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  eq.a("masked").executes($$3x -> a((ep)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, amt.e.c))
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
                        .executes($$3x -> a((ep)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), gh.a($$3x, "filter"), amt.e.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ep, ?> a(
      amt.c<CommandContext<ep>, amt.d> $$0,
      amt.c<CommandContext<ep>, amt.d> $$1,
      amt.c<CommandContext<ep>, amt.d> $$2,
      amt.c<CommandContext<ep>, Predicate<dsi>> $$3,
      ArgumentBuilder<ep, ?> $$4
   ) {
      return $$4.then(eq.a("force").executes($$4x -> a((ep)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amt.e.a)))
         .then(eq.a("move").executes($$4x -> a((ep)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amt.e.b)))
         .then(eq.a("normal").executes($$4x -> a((ep)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amt.e.c)));
   }

   private static int a(ep $$0, amt.d $$1, amt.d $$2, amt.d $$3, Predicate<dsi> $$4, amt.e $$5) throws CommandSyntaxException {
      iz $$6 = $$1.b();
      iz $$7 = $$2.b();
      eie $$8 = eie.a($$6, $$7);
      iz $$9 = $$3.b();
      iz $$10 = $$9.a($$8.c());
      eie $$11 = eie.a($$9, $$10);
      arf $$12 = $$1.a();
      arf $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().ab().c(dbw.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<amt.b> $$16 = Lists.newArrayList();
            List<amt.b> $$17 = Lists.newArrayList();
            List<amt.b> $$18 = Lists.newArrayList();
            Deque<iz> $$19 = Lists.newLinkedList();
            iz $$20 = new iz($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     iz $$24 = new iz($$23, $$22, $$21);
                     iz $$25 = $$24.a((kd)$$20);
                     dsi $$26 = new dsi($$12, $$24, false);
                     dse $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dpj $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           amt.a $$29 = new amt.a($$28.e($$0.v()), $$28.t());
                           $$17.add(new amt.b($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new amt.b($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new amt.b($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == amt.e.b) {
               for (iz $$30 : $$19) {
                  dpj $$31 = $$12.c_($$30);
                  bqn.a_($$31);
                  $$12.a($$30, dfd.hW.o(), 2);
               }

               for (iz $$32 : $$19) {
                  $$12.a($$32, dfd.a.o(), 3);
               }
            }

            List<amt.b> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<amt.b> $$34 = Lists.reverse($$33);

            for (amt.b $$35 : $$34) {
               dpj $$36 = $$13.c_($$35.a);
               bqn.a_($$36);
               $$13.a($$35.a, dfd.hW.o(), 2);
            }

            int $$37 = 0;

            for (amt.b $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (amt.b $$39 : $$17) {
               dpj $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.d($$39.c.a, $$13.H_());
                  $$40.a($$39.c.b);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (amt.b $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.m().a($$12.m(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> xp.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw gl.a.create();
         }
      }
   }

   static record a(us a, ki b) {
   }

   static record b(iz a, dse b, @Nullable amt.a c) {
   }

   @FunctionalInterface
   interface c<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record d(arf a, iz b) {
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
