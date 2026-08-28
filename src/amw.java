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

public class amw {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wy.c("commands.clone.failed"));
   public static final Predicate<ead> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ei)$$0x.getSource()).e())))
            .then(ej.a("from").then(ej.a("sourceDimension", et.a()).then(a($$1, $$0x -> et.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ei, ?> a(ee $$0, ant<CommandContext<ei>, arq> $$1) {
      return ej.a("begin", gf.a())
         .then(
            ((RequiredArgumentBuilder)ej.a("end", gf.a()).then(a($$0, $$1, $$0x -> ((ei)$$0x.getSource()).e())))
               .then(ej.a("to").then(ej.a("targetDimension", et.a()).then(a($$0, $$1, $$0x -> et.a($$0x, "targetDimension")))))
         );
   }

   private static amw.c a(CommandContext<ei> $$0, arq $$1, String $$2) throws CommandSyntaxException {
      iu $$3 = gf.a($$0, $$1, $$2);
      return new amw.c($$1, $$3);
   }

   private static ArgumentBuilder<ei, ?> a(ee $$0, ant<CommandContext<ei>, arq> $$1, ant<CommandContext<ei>, arq> $$2) {
      ant<CommandContext<ei>, amw.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      ant<CommandContext<ei>, amw.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      ant<CommandContext<ei>, amw.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return a($$0, $$3, $$4, $$5, false, ej.a("destination", gf.a())).then(a($$0, $$3, $$4, $$5, true, ej.a("strict")));
   }

   private static ArgumentBuilder<ei, ?> a(
      ee $$0,
      ant<CommandContext<ei>, amw.c> $$1,
      ant<CommandContext<ei>, amw.c> $$2,
      ant<CommandContext<ei>, amw.c> $$3,
      boolean $$4,
      ArgumentBuilder<ei, ?> $$5
   ) {
      return $$5.executes($$4x -> a((ei)$$4x.getSource(), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), $$0xx -> true, amw.d.c, $$4))
         .then(a($$1, $$2, $$3, $$0x -> $$0xx -> true, $$4, ej.a("replace")))
         .then(a($$1, $$2, $$3, $$0x -> a, $$4, ej.a("masked")))
         .then(ej.a("filtered").then(a($$1, $$2, $$3, $$0x -> gb.a($$0x, "filter"), $$4, ej.a("filter", gb.a($$0)))));
   }

   private static ArgumentBuilder<ei, ?> a(
      ant<CommandContext<ei>, amw.c> $$0,
      ant<CommandContext<ei>, amw.c> $$1,
      ant<CommandContext<ei>, amw.c> $$2,
      ant<CommandContext<ei>, Predicate<ead>> $$3,
      boolean $$4,
      ArgumentBuilder<ei, ?> $$5
   ) {
      return $$5.executes($$5x -> a((ei)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amw.d.c, $$4))
         .then(ej.a("force").executes($$5x -> a((ei)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amw.d.a, $$4)))
         .then(ej.a("move").executes($$5x -> a((ei)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amw.d.b, $$4)))
         .then(ej.a("normal").executes($$5x -> a((ei)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amw.d.c, $$4)));
   }

   private static int a(ei $$0, amw.c $$1, amw.c $$2, amw.c $$3, Predicate<ead> $$4, amw.d $$5, boolean $$6) throws CommandSyntaxException {
      iu $$7 = $$1.b();
      iu $$8 = $$2.b();
      eql $$9 = eql.a($$7, $$8);
      iu $$10 = $$3.b();
      iu $$11 = $$10.a($$9.c());
      eql $$12 = eql.a($$10, $$11);
      arq $$13 = $$1.a();
      arq $$14 = $$3.a();
      if (!$$5.a() && $$13 == $$14 && $$12.a($$9)) {
         throw b.create();
      } else {
         int $$15 = $$9.d() * $$9.e() * $$9.f();
         int $$16 = $$0.e().O().d(dir.A);
         if ($$15 > $$16) {
            throw c.create($$16, $$15);
         } else if ($$13.a($$7, $$8) && $$14.a($$10, $$11)) {
            if ($$14.ak()) {
               throw d.create();
            } else {
               List<amw.b> $$17 = Lists.newArrayList();
               List<amw.b> $$18 = Lists.newArrayList();
               List<amw.b> $$19 = Lists.newArrayList();
               Deque<iu> $$20 = Lists.newLinkedList();
               iu $$21 = new iu($$12.h() - $$9.h(), $$12.i() - $$9.i(), $$12.j() - $$9.j());

               for (int $$22 = $$9.j(); $$22 <= $$9.m(); $$22++) {
                  for (int $$23 = $$9.i(); $$23 <= $$9.l(); $$23++) {
                     for (int $$24 = $$9.h(); $$24 <= $$9.k(); $$24++) {
                        iu $$25 = new iu($$24, $$23, $$22);
                        iu $$26 = $$25.a((jz)$$21);
                        ead $$27 = new ead($$13, $$25, false);
                        dzz $$28 = $$27.a();
                        if ($$4.test($$27)) {
                           dwx $$29 = $$13.c_($$25);
                           if ($$29 != null) {
                              amw.a $$30 = new amw.a($$29.e($$0.u()), $$29.r());
                              $$18.add(new amw.b($$26, $$28, $$30));
                              $$20.addLast($$25);
                           } else if (!$$28.s() && !$$28.m($$13, $$25)) {
                              $$19.add(new amw.b($$26, $$28, null));
                              $$20.addFirst($$25);
                           } else {
                              $$17.add(new amw.b($$26, $$28, null));
                              $$20.addLast($$25);
                           }
                        }
                     }
                  }
               }

               int $$31 = 2 | ($$6 ? 304 : 0);
               if ($$5 == amw.d.b) {
                  for (iu $$32 : $$20) {
                     $$13.a($$32, dmc.iv.m(), $$31 | 304);
                  }

                  int $$33 = $$6 ? $$31 : 3;

                  for (iu $$34 : $$20) {
                     $$13.a($$34, dmc.a.m(), $$33);
                  }
               }

               List<amw.b> $$35 = Lists.newArrayList();
               $$35.addAll($$17);
               $$35.addAll($$18);
               $$35.addAll($$19);
               List<amw.b> $$36 = Lists.reverse($$35);

               for (amw.b $$37 : $$36) {
                  $$14.a($$37.a, dmc.iv.m(), $$31 | 304);
               }

               int $$38 = 0;

               for (amw.b $$39 : $$35) {
                  if ($$14.a($$39.a, $$39.b, $$31)) {
                     $$38++;
                  }
               }

               for (amw.b $$40 : $$18) {
                  dwx $$41 = $$14.c_($$40.a);
                  if ($$40.c != null && $$41 != null) {
                     $$41.d($$40.c.a, $$14.F_());
                     $$41.a($$40.c.b);
                     $$41.e();
                  }

                  $$14.a($$40.a, $$40.b, $$31);
               }

               if (!$$6) {
                  for (amw.b $$42 : $$36) {
                     $$14.a($$42.a, $$42.b.b());
                  }
               }

               $$14.n().a($$13.n(), $$9, $$21);
               if ($$38 == 0) {
                  throw d.create();
               } else {
                  int $$43 = $$38;
                  $$0.a(() -> wy.a("commands.clone.success", $$43), true);
                  return $$38;
               }
            }
         } else {
            throw gf.a.create();
         }
      }
   }

   static record a(tz a, kg b) {
   }

   static record b(iu a, dzz b, @Nullable amw.a c) {
   }

   static record c(arq a, iu b) {
   }

   static enum d {
      a(true),
      b(true),
      c(false);

      private final boolean d;

      private d(final boolean $$0) {
         this.d = $$0;
      }

      public boolean a() {
         return this.d;
      }
   }
}
