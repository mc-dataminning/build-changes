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

public class ahi {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ui.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> ui.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ui.c("commands.clone.failed"));
   public static final Predicate<dgf> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((du)$$0x.getSource()).f())))
            .then(dv.a("from").then(dv.a("sourceDimension", ee.a()).then(a($$1, $$0x -> ee.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<du, ?> a(dp $$0, ahi.b<CommandContext<du>, alq> $$1) {
      return dv.a("begin", fm.a())
         .then(
            ((RequiredArgumentBuilder)dv.a("end", fm.a()).then(a($$0, $$1, $$0x -> ((du)$$0x.getSource()).f())))
               .then(dv.a("to").then(dv.a("targetDimension", ee.a()).then(a($$0, $$1, $$0x -> ee.a($$0x, "targetDimension")))))
         );
   }

   private static ahi.c a(CommandContext<du> $$0, alq $$1, String $$2) throws CommandSyntaxException {
      ht $$3 = fm.a($$0, $$1, $$2);
      return new ahi.c($$1, $$3);
   }

   private static ArgumentBuilder<du, ?> a(dp $$0, ahi.b<CommandContext<du>, alq> $$1, ahi.b<CommandContext<du>, alq> $$2) {
      ahi.b<CommandContext<du>, ahi.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      ahi.b<CommandContext<du>, ahi.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      ahi.b<CommandContext<du>, ahi.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("destination", fm.a())
                  .executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ahi.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     dv.a("replace").executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ahi.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  dv.a("masked").executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, ahi.d.c))
               )
            ))
         .then(
            dv.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> fi.a($$0x, "filter"),
                     dv.a("filter", fi.a($$0))
                        .executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fi.a($$3x, "filter"), ahi.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<du, ?> a(
      ahi.b<CommandContext<du>, ahi.c> $$0,
      ahi.b<CommandContext<du>, ahi.c> $$1,
      ahi.b<CommandContext<du>, ahi.c> $$2,
      ahi.b<CommandContext<du>, Predicate<dgf>> $$3,
      ArgumentBuilder<du, ?> $$4
   ) {
      return $$4.then(dv.a("force").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ahi.d.a)))
         .then(dv.a("move").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ahi.d.b)))
         .then(dv.a("normal").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ahi.d.c)));
   }

   private static int a(du $$0, ahi.c $$1, ahi.c $$2, ahi.c $$3, Predicate<dgf> $$4, ahi.d $$5) throws CommandSyntaxException {
      ht $$6 = $$1.b();
      ht $$7 = $$2.b();
      dvs $$8 = dvs.a($$6, $$7);
      ht $$9 = $$3.b();
      ht $$10 = $$9.a($$8.b());
      dvs $$11 = dvs.a($$9, $$10);
      alq $$12 = $$1.a();
      alq $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.c() * $$8.d() * $$8.e();
         int $$15 = $$0.f().X().c(cqv.y);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<ahi.a> $$16 = Lists.newArrayList();
            List<ahi.a> $$17 = Lists.newArrayList();
            List<ahi.a> $$18 = Lists.newArrayList();
            Deque<ht> $$19 = Lists.newLinkedList();
            ht $$20 = new ht($$11.g() - $$8.g(), $$11.h() - $$8.h(), $$11.i() - $$8.i());

            for (int $$21 = $$8.i(); $$21 <= $$8.l(); $$21++) {
               for (int $$22 = $$8.h(); $$22 <= $$8.k(); $$22++) {
                  for (int $$23 = $$8.g(); $$23 <= $$8.j(); $$23++) {
                     ht $$24 = new ht($$23, $$22, $$21);
                     ht $$25 = $$24.a((iw)$$20);
                     dgf $$26 = new dgf($$12, $$24, false);
                     dgb $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        ddx $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           rt $$29 = $$28.o();
                           $$17.add(new ahi.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new ahi.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new ahi.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == ahi.d.b) {
               for (ht $$30 : $$19) {
                  ddx $$31 = $$12.c_($$30);
                  bhs.a_($$31);
                  $$12.a($$30, cuc.hW.o(), 2);
               }

               for (ht $$32 : $$19) {
                  $$12.a($$32, cuc.a.o(), 3);
               }
            }

            List<ahi.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<ahi.a> $$34 = Lists.reverse($$33);

            for (ahi.a $$35 : $$34) {
               ddx $$36 = $$13.c_($$35.a);
               bhs.a_($$36);
               $$13.a($$35.a, cuc.hW.o(), 2);
            }

            int $$37 = 0;

            for (ahi.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (ahi.a $$39 : $$17) {
               ddx $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (ahi.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.l().a($$12.l(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> ui.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fm.a.create();
         }
      }
   }

   static class a {
      public final ht a;
      public final dgb b;
      @Nullable
      public final rt c;

      public a(ht $$0, dgb $$1, @Nullable rt $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(alq a, ht b) {
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
