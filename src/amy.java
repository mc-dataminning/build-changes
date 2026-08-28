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

public class amy {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xa.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xa.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xa.c("commands.clone.failed"));
   public static final Predicate<ebi> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ej)$$0x.getSource()).e())))
            .then(ek.a("from").then(ek.a("sourceDimension", eu.a()).then(a($$1, $$0x -> eu.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ej, ?> a(ef $$0, anv<CommandContext<ej>, ars> $$1) {
      return ek.a("begin", gg.a())
         .then(
            ((RequiredArgumentBuilder)ek.a("end", gg.a()).then(a($$0, $$1, $$0x -> ((ej)$$0x.getSource()).e())))
               .then(ek.a("to").then(ek.a("targetDimension", eu.a()).then(a($$0, $$1, $$0x -> eu.a($$0x, "targetDimension")))))
         );
   }

   private static amy.c a(CommandContext<ej> $$0, ars $$1, String $$2) throws CommandSyntaxException {
      iv $$3 = gg.a($$0, $$1, $$2);
      return new amy.c($$1, $$3);
   }

   private static ArgumentBuilder<ej, ?> a(ef $$0, anv<CommandContext<ej>, ars> $$1, anv<CommandContext<ej>, ars> $$2) {
      anv<CommandContext<ej>, amy.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      anv<CommandContext<ej>, amy.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      anv<CommandContext<ej>, amy.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return a($$0, $$3, $$4, $$5, false, ek.a("destination", gg.a())).then(a($$0, $$3, $$4, $$5, true, ek.a("strict")));
   }

   private static ArgumentBuilder<ej, ?> a(
      ef $$0,
      anv<CommandContext<ej>, amy.c> $$1,
      anv<CommandContext<ej>, amy.c> $$2,
      anv<CommandContext<ej>, amy.c> $$3,
      boolean $$4,
      ArgumentBuilder<ej, ?> $$5
   ) {
      return $$5.executes($$4x -> a((ej)$$4x.getSource(), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), $$0xx -> true, amy.d.c, $$4))
         .then(a($$1, $$2, $$3, $$0x -> $$0xx -> true, $$4, ek.a("replace")))
         .then(a($$1, $$2, $$3, $$0x -> a, $$4, ek.a("masked")))
         .then(ek.a("filtered").then(a($$1, $$2, $$3, $$0x -> gc.a($$0x, "filter"), $$4, ek.a("filter", gc.a($$0)))));
   }

   private static ArgumentBuilder<ej, ?> a(
      anv<CommandContext<ej>, amy.c> $$0,
      anv<CommandContext<ej>, amy.c> $$1,
      anv<CommandContext<ej>, amy.c> $$2,
      anv<CommandContext<ej>, Predicate<ebi>> $$3,
      boolean $$4,
      ArgumentBuilder<ej, ?> $$5
   ) {
      return $$5.executes($$5x -> a((ej)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amy.d.c, $$4))
         .then(ek.a("force").executes($$5x -> a((ej)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amy.d.a, $$4)))
         .then(ek.a("move").executes($$5x -> a((ej)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amy.d.b, $$4)))
         .then(ek.a("normal").executes($$5x -> a((ej)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amy.d.c, $$4)));
   }

   private static int a(ej $$0, amy.c $$1, amy.c $$2, amy.c $$3, Predicate<ebi> $$4, amy.d $$5, boolean $$6) throws CommandSyntaxException {
      iv $$7 = $$1.b();
      iv $$8 = $$2.b();
      ert $$9 = ert.a($$7, $$8);
      iv $$10 = $$3.b();
      iv $$11 = $$10.a($$9.c());
      ert $$12 = ert.a($$10, $$11);
      ars $$13 = $$1.a();
      ars $$14 = $$3.a();
      if (!$$5.a() && $$13 == $$14 && $$12.a($$9)) {
         throw b.create();
      } else {
         int $$15 = $$9.d() * $$9.e() * $$9.f();
         int $$16 = $$0.e().O().d(djt.B);
         if ($$15 > $$16) {
            throw c.create($$16, $$15);
         } else if ($$13.a($$7, $$8) && $$14.a($$10, $$11)) {
            if ($$14.ak()) {
               throw d.create();
            } else {
               List<amy.b> $$17 = Lists.newArrayList();
               List<amy.b> $$18 = Lists.newArrayList();
               List<amy.b> $$19 = Lists.newArrayList();
               Deque<iv> $$20 = Lists.newLinkedList();
               iv $$21 = new iv($$12.h() - $$9.h(), $$12.i() - $$9.i(), $$12.j() - $$9.j());

               for (int $$22 = $$9.j(); $$22 <= $$9.m(); $$22++) {
                  for (int $$23 = $$9.i(); $$23 <= $$9.l(); $$23++) {
                     for (int $$24 = $$9.h(); $$24 <= $$9.k(); $$24++) {
                        iv $$25 = new iv($$24, $$23, $$22);
                        iv $$26 = $$25.a((ka)$$21);
                        ebi $$27 = new ebi($$13, $$25, false);
                        ebe $$28 = $$27.a();
                        if ($$4.test($$27)) {
                           dyc $$29 = $$13.c_($$25);
                           if ($$29 != null) {
                              amy.a $$30 = new amy.a($$29.e($$0.u()), $$29.r());
                              $$18.add(new amy.b($$26, $$28, $$30));
                              $$20.addLast($$25);
                           } else if (!$$28.s() && !$$28.m($$13, $$25)) {
                              $$19.add(new amy.b($$26, $$28, null));
                              $$20.addFirst($$25);
                           } else {
                              $$17.add(new amy.b($$26, $$28, null));
                              $$20.addLast($$25);
                           }
                        }
                     }
                  }
               }

               int $$31 = 2 | ($$6 ? 816 : 0);
               if ($$5 == amy.d.b) {
                  for (iv $$32 : $$20) {
                     $$13.a($$32, dne.iy.m(), $$31 | 816);
                  }

                  int $$33 = $$6 ? $$31 : 3;

                  for (iv $$34 : $$20) {
                     $$13.a($$34, dne.a.m(), $$33);
                  }
               }

               List<amy.b> $$35 = Lists.newArrayList();
               $$35.addAll($$17);
               $$35.addAll($$18);
               $$35.addAll($$19);
               List<amy.b> $$36 = Lists.reverse($$35);

               for (amy.b $$37 : $$36) {
                  $$14.a($$37.a, dne.iy.m(), $$31 | 816);
               }

               int $$38 = 0;

               for (amy.b $$39 : $$35) {
                  if ($$14.a($$39.a, $$39.b, $$31)) {
                     $$38++;
                  }
               }

               for (amy.b $$40 : $$18) {
                  dyc $$41 = $$14.c_($$40.a);
                  if ($$40.c != null && $$41 != null) {
                     $$41.d($$40.c.a, $$14.J_());
                     $$41.a($$40.c.b);
                     $$41.e();
                  }

                  $$14.a($$40.a, $$40.b, $$31);
               }

               if (!$$6) {
                  for (amy.b $$42 : $$36) {
                     $$14.a($$42.a, $$42.b.b());
                  }
               }

               $$14.n().a($$13.n(), $$9, $$21);
               if ($$38 == 0) {
                  throw d.create();
               } else {
                  int $$43 = $$38;
                  $$0.a(() -> xa.a("commands.clone.success", $$43), true);
                  return $$38;
               }
            }
         } else {
            throw gg.a.create();
         }
      }
   }

   static record a(tz a, kh b) {
   }

   static record b(iv a, ebe b, @Nullable amy.a c) {
   }

   static record c(ars a, iv b) {
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
