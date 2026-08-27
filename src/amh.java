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

public class amh {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.clone.failed"));
   public static final Predicate<dtg> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((eh)$$0x.getSource()).e())))
            .then(ei.a("from").then(ei.a("sourceDimension", es.a()).then(a($$1, $$0x -> es.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<eh, ?> a(ed $$0, amh.b<CommandContext<eh>, aqt> $$1) {
      return ei.a("begin", gd.a())
         .then(
            ((RequiredArgumentBuilder)ei.a("end", gd.a()).then(a($$0, $$1, $$0x -> ((eh)$$0x.getSource()).e())))
               .then(ei.a("to").then(ei.a("targetDimension", es.a()).then(a($$0, $$1, $$0x -> es.a($$0x, "targetDimension")))))
         );
   }

   private static amh.c a(CommandContext<eh> $$0, aqt $$1, String $$2) throws CommandSyntaxException {
      ir $$3 = gd.a($$0, $$1, $$2);
      return new amh.c($$1, $$3);
   }

   private static ArgumentBuilder<eh, ?> a(ed $$0, amh.b<CommandContext<eh>, aqt> $$1, amh.b<CommandContext<eh>, aqt> $$2) {
      amh.b<CommandContext<eh>, amh.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      amh.b<CommandContext<eh>, amh.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      amh.b<CommandContext<eh>, amh.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("destination", gd.a())
                  .executes($$3x -> a((eh)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amh.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     ei.a("replace").executes($$3x -> a((eh)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amh.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  ei.a("masked").executes($$3x -> a((eh)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, amh.d.c))
               )
            ))
         .then(
            ei.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> fz.a($$0x, "filter"),
                     ei.a("filter", fz.a($$0))
                        .executes($$3x -> a((eh)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fz.a($$3x, "filter"), amh.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<eh, ?> a(
      amh.b<CommandContext<eh>, amh.c> $$0,
      amh.b<CommandContext<eh>, amh.c> $$1,
      amh.b<CommandContext<eh>, amh.c> $$2,
      amh.b<CommandContext<eh>, Predicate<dtg>> $$3,
      ArgumentBuilder<eh, ?> $$4
   ) {
      return $$4.then(ei.a("force").executes($$4x -> a((eh)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amh.d.a)))
         .then(ei.a("move").executes($$4x -> a((eh)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amh.d.b)))
         .then(ei.a("normal").executes($$4x -> a((eh)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amh.d.c)));
   }

   private static int a(eh $$0, amh.c $$1, amh.c $$2, amh.c $$3, Predicate<dtg> $$4, amh.d $$5) throws CommandSyntaxException {
      ir $$6 = $$1.b();
      ir $$7 = $$2.b();
      ejl $$8 = ejl.a($$6, $$7);
      ir $$9 = $$3.b();
      ir $$10 = $$9.a($$8.c());
      ejl $$11 = ejl.a($$9, $$10);
      aqt $$12 = $$1.a();
      aqt $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().ab().c(dbw.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<amh.a> $$16 = Lists.newArrayList();
            List<amh.a> $$17 = Lists.newArrayList();
            List<amh.a> $$18 = Lists.newArrayList();
            Deque<ir> $$19 = Lists.newLinkedList();
            ir $$20 = new ir($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     ir $$24 = new ir($$23, $$22, $$21);
                     ir $$25 = $$24.a((jv)$$20);
                     dtg $$26 = new dtg($$12, $$24, false);
                     dtc $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dqc $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           uk $$29 = $$28.d($$0.v());
                           $$17.add(new amh.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new amh.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new amh.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == amh.d.b) {
               for (ir $$30 : $$19) {
                  dqc $$31 = $$12.c_($$30);
                  bpr.a_($$31);
                  $$12.a($$30, dfe.iQ.n(), 2);
               }

               for (ir $$32 : $$19) {
                  $$12.a($$32, dfe.a.n(), 3);
               }
            }

            List<amh.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<amh.a> $$34 = Lists.reverse($$33);

            for (amh.a $$35 : $$34) {
               dqc $$36 = $$13.c_($$35.a);
               bpr.a_($$36);
               $$13.a($$35.a, dfe.iQ.n(), 2);
            }

            int $$37 = 0;

            for (amh.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (amh.a $$39 : $$17) {
               dqc $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c, $$13.I_());
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (amh.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.m().a($$12.m(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> xe.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw gd.a.create();
         }
      }
   }

   static class a {
      public final ir a;
      public final dtc b;
      @Nullable
      public final uk c;

      public a(ir $$0, dtc $$1, @Nullable uk $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(aqt a, ir b) {
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
