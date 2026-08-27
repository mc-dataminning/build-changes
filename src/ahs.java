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

public class ahs {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ur.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> ur.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ur.c("commands.clone.failed"));
   public static final Predicate<dha> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((du)$$0x.getSource()).f())))
            .then(dv.a("from").then(dv.a("sourceDimension", ee.a()).then(a($$1, $$0x -> ee.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<du, ?> a(dp $$0, ahs.b<CommandContext<du>, ama> $$1) {
      return dv.a("begin", fm.a())
         .then(
            ((RequiredArgumentBuilder)dv.a("end", fm.a()).then(a($$0, $$1, $$0x -> ((du)$$0x.getSource()).f())))
               .then(dv.a("to").then(dv.a("targetDimension", ee.a()).then(a($$0, $$1, $$0x -> ee.a($$0x, "targetDimension")))))
         );
   }

   private static ahs.c a(CommandContext<du> $$0, ama $$1, String $$2) throws CommandSyntaxException {
      ht $$3 = fm.a($$0, $$1, $$2);
      return new ahs.c($$1, $$3);
   }

   private static ArgumentBuilder<du, ?> a(dp $$0, ahs.b<CommandContext<du>, ama> $$1, ahs.b<CommandContext<du>, ama> $$2) {
      ahs.b<CommandContext<du>, ahs.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      ahs.b<CommandContext<du>, ahs.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      ahs.b<CommandContext<du>, ahs.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("destination", fm.a())
                  .executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ahs.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     dv.a("replace").executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ahs.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  dv.a("masked").executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, ahs.d.c))
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
                        .executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fi.a($$3x, "filter"), ahs.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<du, ?> a(
      ahs.b<CommandContext<du>, ahs.c> $$0,
      ahs.b<CommandContext<du>, ahs.c> $$1,
      ahs.b<CommandContext<du>, ahs.c> $$2,
      ahs.b<CommandContext<du>, Predicate<dha>> $$3,
      ArgumentBuilder<du, ?> $$4
   ) {
      return $$4.then(dv.a("force").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ahs.d.a)))
         .then(dv.a("move").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ahs.d.b)))
         .then(dv.a("normal").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ahs.d.c)));
   }

   private static int a(du $$0, ahs.c $$1, ahs.c $$2, ahs.c $$3, Predicate<dha> $$4, ahs.d $$5) throws CommandSyntaxException {
      ht $$6 = $$1.b();
      ht $$7 = $$2.b();
      dwn $$8 = dwn.a($$6, $$7);
      ht $$9 = $$3.b();
      ht $$10 = $$9.a($$8.b());
      dwn $$11 = dwn.a($$9, $$10);
      ama $$12 = $$1.a();
      ama $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.c() * $$8.d() * $$8.e();
         int $$15 = $$0.f().X().c(cro.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<ahs.a> $$16 = Lists.newArrayList();
            List<ahs.a> $$17 = Lists.newArrayList();
            List<ahs.a> $$18 = Lists.newArrayList();
            Deque<ht> $$19 = Lists.newLinkedList();
            ht $$20 = new ht($$11.g() - $$8.g(), $$11.h() - $$8.h(), $$11.i() - $$8.i());

            for (int $$21 = $$8.i(); $$21 <= $$8.l(); $$21++) {
               for (int $$22 = $$8.h(); $$22 <= $$8.k(); $$22++) {
                  for (int $$23 = $$8.g(); $$23 <= $$8.j(); $$23++) {
                     ht $$24 = new ht($$23, $$22, $$21);
                     ht $$25 = $$24.a((iw)$$20);
                     dha $$26 = new dha($$12, $$24, false);
                     dgw $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        der $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           rz $$29 = $$28.o();
                           $$17.add(new ahs.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new ahs.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new ahs.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == ahs.d.b) {
               for (ht $$30 : $$19) {
                  der $$31 = $$12.c_($$30);
                  bih.a_($$31);
                  $$12.a($$30, cuv.hW.o(), 2);
               }

               for (ht $$32 : $$19) {
                  $$12.a($$32, cuv.a.o(), 3);
               }
            }

            List<ahs.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<ahs.a> $$34 = Lists.reverse($$33);

            for (ahs.a $$35 : $$34) {
               der $$36 = $$13.c_($$35.a);
               bih.a_($$36);
               $$13.a($$35.a, cuv.hW.o(), 2);
            }

            int $$37 = 0;

            for (ahs.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (ahs.a $$39 : $$17) {
               der $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (ahs.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.l().a($$12.l(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> ur.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fm.a.create();
         }
      }
   }

   static class a {
      public final ht a;
      public final dgw b;
      @Nullable
      public final rz c;

      public a(ht $$0, dgw $$1, @Nullable rz $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(ama a, ht b) {
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
