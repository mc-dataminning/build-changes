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
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wv.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wv.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wv.c("commands.clone.failed"));
   public static final Predicate<dyq> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ex)$$0x.getSource()).e())))
            .then(ey.a("from").then(ey.a("sourceDimension", fi.a()).then(a($$1, $$0x -> fi.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ex, ?> a(et $$0, anq<CommandContext<ex>, arn> $$1) {
      return ey.a("begin", gu.a())
         .then(
            ((RequiredArgumentBuilder)ey.a("end", gu.a()).then(a($$0, $$1, $$0x -> ((ex)$$0x.getSource()).e())))
               .then(ey.a("to").then(ey.a("targetDimension", fi.a()).then(a($$0, $$1, $$0x -> fi.a($$0x, "targetDimension")))))
         );
   }

   private static amt.c a(CommandContext<ex> $$0, arn $$1, String $$2) throws CommandSyntaxException {
      jj $$3 = gu.a($$0, $$1, $$2);
      return new amt.c($$1, $$3);
   }

   private static ArgumentBuilder<ex, ?> a(et $$0, anq<CommandContext<ex>, arn> $$1, anq<CommandContext<ex>, arn> $$2) {
      anq<CommandContext<ex>, amt.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      anq<CommandContext<ex>, amt.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      anq<CommandContext<ex>, amt.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return a($$0, $$3, $$4, $$5, false, ey.a("destination", gu.a())).then(a($$0, $$3, $$4, $$5, true, ey.a("strict")));
   }

   private static ArgumentBuilder<ex, ?> a(
      et $$0,
      anq<CommandContext<ex>, amt.c> $$1,
      anq<CommandContext<ex>, amt.c> $$2,
      anq<CommandContext<ex>, amt.c> $$3,
      boolean $$4,
      ArgumentBuilder<ex, ?> $$5
   ) {
      return $$5.executes($$4x -> a((ex)$$4x.getSource(), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), $$0xx -> true, amt.d.c, $$4))
         .then(a($$1, $$2, $$3, $$0x -> $$0xx -> true, $$4, ey.a("replace")))
         .then(a($$1, $$2, $$3, $$0x -> a, $$4, ey.a("masked")))
         .then(ey.a("filtered").then(a($$1, $$2, $$3, $$0x -> gq.a($$0x, "filter"), $$4, ey.a("filter", gq.a($$0)))));
   }

   private static ArgumentBuilder<ex, ?> a(
      anq<CommandContext<ex>, amt.c> $$0,
      anq<CommandContext<ex>, amt.c> $$1,
      anq<CommandContext<ex>, amt.c> $$2,
      anq<CommandContext<ex>, Predicate<dyq>> $$3,
      boolean $$4,
      ArgumentBuilder<ex, ?> $$5
   ) {
      return $$5.executes($$5x -> a((ex)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amt.d.c, $$4))
         .then(ey.a("force").executes($$5x -> a((ex)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amt.d.a, $$4)))
         .then(ey.a("move").executes($$5x -> a((ex)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amt.d.b, $$4)))
         .then(ey.a("normal").executes($$5x -> a((ex)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amt.d.c, $$4)));
   }

   private static int a(ex $$0, amt.c $$1, amt.c $$2, amt.c $$3, Predicate<dyq> $$4, amt.d $$5, boolean $$6) throws CommandSyntaxException {
      jj $$7 = $$1.b();
      jj $$8 = $$2.b();
      eoy $$9 = eoy.a($$7, $$8);
      jj $$10 = $$3.b();
      jj $$11 = $$10.a($$9.c());
      eoy $$12 = eoy.a($$10, $$11);
      arn $$13 = $$1.a();
      arn $$14 = $$3.a();
      if (!$$5.a() && $$13 == $$14 && $$12.a($$9)) {
         throw b.create();
      } else {
         int $$15 = $$9.d() * $$9.e() * $$9.f();
         int $$16 = $$0.e().O().d(dhl.A);
         if ($$15 > $$16) {
            throw c.create($$16, $$15);
         } else if ($$13.a($$7, $$8) && $$14.a($$10, $$11)) {
            if ($$14.ak()) {
               throw d.create();
            } else {
               List<amt.b> $$17 = Lists.newArrayList();
               List<amt.b> $$18 = Lists.newArrayList();
               List<amt.b> $$19 = Lists.newArrayList();
               Deque<jj> $$20 = Lists.newLinkedList();
               jj $$21 = new jj($$12.h() - $$9.h(), $$12.i() - $$9.i(), $$12.j() - $$9.j());

               for (int $$22 = $$9.j(); $$22 <= $$9.m(); $$22++) {
                  for (int $$23 = $$9.i(); $$23 <= $$9.l(); $$23++) {
                     for (int $$24 = $$9.h(); $$24 <= $$9.k(); $$24++) {
                        jj $$25 = new jj($$24, $$23, $$22);
                        jj $$26 = $$25.a((kn)$$21);
                        dyq $$27 = new dyq($$13, $$25, false);
                        dym $$28 = $$27.a();
                        if ($$4.test($$27)) {
                           dvl $$29 = $$13.c_($$25);
                           if ($$29 != null) {
                              amt.a $$30 = new amt.a($$29.e($$0.u()), $$29.r());
                              $$18.add(new amt.b($$26, $$28, $$30));
                              $$20.addLast($$25);
                           } else if (!$$28.s() && !$$28.m($$13, $$25)) {
                              $$19.add(new amt.b($$26, $$28, null));
                              $$20.addFirst($$25);
                           } else {
                              $$17.add(new amt.b($$26, $$28, null));
                              $$20.addLast($$25);
                           }
                        }
                     }
                  }
               }

               int $$31 = 2 | ($$6 ? 304 : 0);
               if ($$5 == amt.d.b) {
                  for (jj $$32 : $$20) {
                     $$13.a($$32, dkw.iu.m(), $$31 | 304);
                  }

                  int $$33 = $$6 ? $$31 : 3;

                  for (jj $$34 : $$20) {
                     $$13.a($$34, dkw.a.m(), $$33);
                  }
               }

               List<amt.b> $$35 = Lists.newArrayList();
               $$35.addAll($$17);
               $$35.addAll($$18);
               $$35.addAll($$19);
               List<amt.b> $$36 = Lists.reverse($$35);

               for (amt.b $$37 : $$36) {
                  $$14.a($$37.a, dkw.iu.m(), $$31 | 304);
               }

               int $$38 = 0;

               for (amt.b $$39 : $$35) {
                  if ($$14.a($$39.a, $$39.b, $$31)) {
                     $$38++;
                  }
               }

               for (amt.b $$40 : $$18) {
                  dvl $$41 = $$14.c_($$40.a);
                  if ($$40.c != null && $$41 != null) {
                     $$41.d($$40.c.a, $$14.F_());
                     $$41.a($$40.c.b);
                     $$41.e();
                  }

                  $$14.a($$40.a, $$40.b, $$31);
               }

               if (!$$6) {
                  for (amt.b $$42 : $$36) {
                     $$14.a($$42.a, $$42.b.b());
                  }
               }

               $$14.n().a($$13.n(), $$9, $$21);
               if ($$38 == 0) {
                  throw d.create();
               } else {
                  int $$43 = $$38;
                  $$0.a(() -> wv.a("commands.clone.success", $$43), true);
                  return $$38;
               }
            }
         } else {
            throw gu.a.create();
         }
      }
   }

   static record a(tw a, kt b) {
   }

   static record b(jj a, dym b, @Nullable amt.a c) {
   }

   static record c(arn a, jj b) {
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
