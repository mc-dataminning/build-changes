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

public class akl {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vq.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> vq.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vq.c("commands.clone.failed"));
   public static final Predicate<dln> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((du)$$0x.getSource()).e())))
            .then(dv.a("from").then(dv.a("sourceDimension", ef.a()).then(a($$1, $$0x -> ef.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<du, ?> a(dq $$0, akl.b<CommandContext<du>, aow> $$1) {
      return dv.a("begin", fo.a())
         .then(
            ((RequiredArgumentBuilder)dv.a("end", fo.a()).then(a($$0, $$1, $$0x -> ((du)$$0x.getSource()).e())))
               .then(dv.a("to").then(dv.a("targetDimension", ef.a()).then(a($$0, $$1, $$0x -> ef.a($$0x, "targetDimension")))))
         );
   }

   private static akl.c a(CommandContext<du> $$0, aow $$1, String $$2) throws CommandSyntaxException {
      hz $$3 = fo.a($$0, $$1, $$2);
      return new akl.c($$1, $$3);
   }

   private static ArgumentBuilder<du, ?> a(dq $$0, akl.b<CommandContext<du>, aow> $$1, akl.b<CommandContext<du>, aow> $$2) {
      akl.b<CommandContext<du>, akl.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      akl.b<CommandContext<du>, akl.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      akl.b<CommandContext<du>, akl.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("destination", fo.a())
                  .executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, akl.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     dv.a("replace").executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, akl.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  dv.a("masked").executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, akl.d.c))
               )
            ))
         .then(
            dv.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> fk.a($$0x, "filter"),
                     dv.a("filter", fk.a($$0))
                        .executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fk.a($$3x, "filter"), akl.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<du, ?> a(
      akl.b<CommandContext<du>, akl.c> $$0,
      akl.b<CommandContext<du>, akl.c> $$1,
      akl.b<CommandContext<du>, akl.c> $$2,
      akl.b<CommandContext<du>, Predicate<dln>> $$3,
      ArgumentBuilder<du, ?> $$4
   ) {
      return $$4.then(dv.a("force").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), akl.d.a)))
         .then(dv.a("move").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), akl.d.b)))
         .then(dv.a("normal").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), akl.d.c)));
   }

   private static int a(du $$0, akl.c $$1, akl.c $$2, akl.c $$3, Predicate<dln> $$4, akl.d $$5) throws CommandSyntaxException {
      hz $$6 = $$1.b();
      hz $$7 = $$2.b();
      ebd $$8 = ebd.a($$6, $$7);
      hz $$9 = $$3.b();
      hz $$10 = $$9.a($$8.c());
      ebd $$11 = ebd.a($$9, $$10);
      aow $$12 = $$1.a();
      aow $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().Z().c(cvn.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<akl.a> $$16 = Lists.newArrayList();
            List<akl.a> $$17 = Lists.newArrayList();
            List<akl.a> $$18 = Lists.newArrayList();
            Deque<hz> $$19 = Lists.newLinkedList();
            hz $$20 = new hz($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     hz $$24 = new hz($$23, $$22, $$21);
                     hz $$25 = $$24.a((jd)$$20);
                     dln $$26 = new dln($$12, $$24, false);
                     dlj $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dix $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           sw $$29 = $$28.q();
                           $$17.add(new akl.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new akl.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new akl.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == akl.d.b) {
               for (hz $$30 : $$19) {
                  dix $$31 = $$12.c_($$30);
                  bln.a_($$31);
                  $$12.a($$30, cyu.hW.o(), 2);
               }

               for (hz $$32 : $$19) {
                  $$12.a($$32, cyu.a.o(), 3);
               }
            }

            List<akl.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<akl.a> $$34 = Lists.reverse($$33);

            for (akl.a $$35 : $$34) {
               dix $$36 = $$13.c_($$35.a);
               bln.a_($$36);
               $$13.a($$35.a, cyu.hW.o(), 2);
            }

            int $$37 = 0;

            for (akl.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (akl.a $$39 : $$17) {
               dix $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (akl.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.m().a($$12.m(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> vq.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fo.a.create();
         }
      }
   }

   static class a {
      public final hz a;
      public final dlj b;
      @Nullable
      public final sw c;

      public a(hz $$0, dlj $$1, @Nullable sw $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(aow a, hz b) {
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
