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
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xd.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xd.c("commands.clone.failed"));
   public static final Predicate<dus> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((et)$$0x.getSource()).e())))
            .then(eu.a("from").then(eu.a("sourceDimension", fe.a()).then(a($$1, $$0x -> fe.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<et, ?> a(ep $$0, ams.c<CommandContext<et>, arh> $$1) {
      return eu.a("begin", gp.a())
         .then(
            ((RequiredArgumentBuilder)eu.a("end", gp.a()).then(a($$0, $$1, $$0x -> ((et)$$0x.getSource()).e())))
               .then(eu.a("to").then(eu.a("targetDimension", fe.a()).then(a($$0, $$1, $$0x -> fe.a($$0x, "targetDimension")))))
         );
   }

   private static ams.d a(CommandContext<et> $$0, arh $$1, String $$2) throws CommandSyntaxException {
      je $$3 = gp.a($$0, $$1, $$2);
      return new ams.d($$1, $$3);
   }

   private static ArgumentBuilder<et, ?> a(ep $$0, ams.c<CommandContext<et>, arh> $$1, ams.c<CommandContext<et>, arh> $$2) {
      ams.c<CommandContext<et>, ams.d> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      ams.c<CommandContext<et>, ams.d> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      ams.c<CommandContext<et>, ams.d> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("destination", gp.a())
                  .executes($$3x -> a((et)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ams.e.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     eu.a("replace").executes($$3x -> a((et)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ams.e.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  eu.a("masked").executes($$3x -> a((et)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, ams.e.c))
               )
            ))
         .then(
            eu.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> gl.a($$0x, "filter"),
                     eu.a("filter", gl.a($$0))
                        .executes($$3x -> a((et)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), gl.a($$3x, "filter"), ams.e.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<et, ?> a(
      ams.c<CommandContext<et>, ams.d> $$0,
      ams.c<CommandContext<et>, ams.d> $$1,
      ams.c<CommandContext<et>, ams.d> $$2,
      ams.c<CommandContext<et>, Predicate<dus>> $$3,
      ArgumentBuilder<et, ?> $$4
   ) {
      return $$4.then(eu.a("force").executes($$4x -> a((et)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ams.e.a)))
         .then(eu.a("move").executes($$4x -> a((et)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ams.e.b)))
         .then(eu.a("normal").executes($$4x -> a((et)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ams.e.c)));
   }

   private static int a(et $$0, ams.d $$1, ams.d $$2, ams.d $$3, Predicate<dus> $$4, ams.e $$5) throws CommandSyntaxException {
      je $$6 = $$1.b();
      je $$7 = $$2.b();
      eku $$8 = eku.a($$6, $$7);
      je $$9 = $$3.b();
      je $$10 = $$9.a($$8.c());
      eku $$11 = eku.a($$9, $$10);
      arh $$12 = $$1.a();
      arh $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().ac().c(dec.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<ams.b> $$16 = Lists.newArrayList();
            List<ams.b> $$17 = Lists.newArrayList();
            List<ams.b> $$18 = Lists.newArrayList();
            Deque<je> $$19 = Lists.newLinkedList();
            je $$20 = new je($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     je $$24 = new je($$23, $$22, $$21);
                     je $$25 = $$24.a((ki)$$20);
                     dus $$26 = new dus($$12, $$24, false);
                     duo $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        drs $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           ams.a $$29 = new ams.a($$28.e($$0.v()), $$28.s());
                           $$17.add(new ams.b($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.s() && !$$27.m($$12, $$24)) {
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
               for (je $$30 : $$19) {
                  drs $$31 = $$12.c_($$30);
                  brg.a_($$31);
                  $$12.a($$30, dhl.hW.o(), 2);
               }

               for (je $$32 : $$19) {
                  $$12.a($$32, dhl.a.o(), 3);
               }
            }

            List<ams.b> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<ams.b> $$34 = Lists.reverse($$33);

            for (ams.b $$35 : $$34) {
               drs $$36 = $$13.c_($$35.a);
               brg.a_($$36);
               $$13.a($$35.a, dhl.hW.o(), 2);
            }

            int $$37 = 0;

            for (ams.b $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (ams.b $$39 : $$17) {
               drs $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.d($$39.c.a, $$13.F_());
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
               $$0.a(() -> xd.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw gp.a.create();
         }
      }
   }

   static record a(uf a, kn b) {
   }

   static record b(je a, duo b, @Nullable ams.a c) {
   }

   @FunctionalInterface
   interface c<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record d(arh a, je b) {
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
