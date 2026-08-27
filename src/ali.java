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

public class ali {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wi.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wi.c("commands.clone.failed"));
   public static final Predicate<dpm> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((dv)$$0x.getSource()).e())))
            .then(dw.a("from").then(dw.a("sourceDimension", eg.a()).then(a($$1, $$0x -> eg.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<dv, ?> a(dr $$0, ali.b<CommandContext<dv>, apu> $$1) {
      return dw.a("begin", fq.a())
         .then(
            ((RequiredArgumentBuilder)dw.a("end", fq.a()).then(a($$0, $$1, $$0x -> ((dv)$$0x.getSource()).e())))
               .then(dw.a("to").then(dw.a("targetDimension", eg.a()).then(a($$0, $$1, $$0x -> eg.a($$0x, "targetDimension")))))
         );
   }

   private static ali.c a(CommandContext<dv> $$0, apu $$1, String $$2) throws CommandSyntaxException {
      id $$3 = fq.a($$0, $$1, $$2);
      return new ali.c($$1, $$3);
   }

   private static ArgumentBuilder<dv, ?> a(dr $$0, ali.b<CommandContext<dv>, apu> $$1, ali.b<CommandContext<dv>, apu> $$2) {
      ali.b<CommandContext<dv>, ali.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      ali.b<CommandContext<dv>, ali.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      ali.b<CommandContext<dv>, ali.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("destination", fq.a())
                  .executes($$3x -> a((dv)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ali.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     dw.a("replace").executes($$3x -> a((dv)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ali.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  dw.a("masked").executes($$3x -> a((dv)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, ali.d.c))
               )
            ))
         .then(
            dw.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> fm.a($$0x, "filter"),
                     dw.a("filter", fm.a($$0))
                        .executes($$3x -> a((dv)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fm.a($$3x, "filter"), ali.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<dv, ?> a(
      ali.b<CommandContext<dv>, ali.c> $$0,
      ali.b<CommandContext<dv>, ali.c> $$1,
      ali.b<CommandContext<dv>, ali.c> $$2,
      ali.b<CommandContext<dv>, Predicate<dpm>> $$3,
      ArgumentBuilder<dv, ?> $$4
   ) {
      return $$4.then(dw.a("force").executes($$4x -> a((dv)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ali.d.a)))
         .then(dw.a("move").executes($$4x -> a((dv)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ali.d.b)))
         .then(dw.a("normal").executes($$4x -> a((dv)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ali.d.c)));
   }

   private static int a(dv $$0, ali.c $$1, ali.c $$2, ali.c $$3, Predicate<dpm> $$4, ali.d $$5) throws CommandSyntaxException {
      id $$6 = $$1.b();
      id $$7 = $$2.b();
      efi $$8 = efi.a($$6, $$7);
      id $$9 = $$3.b();
      id $$10 = $$9.a($$8.c());
      efi $$11 = efi.a($$9, $$10);
      apu $$12 = $$1.a();
      apu $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().aa().c(czc.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<ali.a> $$16 = Lists.newArrayList();
            List<ali.a> $$17 = Lists.newArrayList();
            List<ali.a> $$18 = Lists.newArrayList();
            Deque<id> $$19 = Lists.newLinkedList();
            id $$20 = new id($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     id $$24 = new id($$23, $$22, $$21);
                     id $$25 = $$24.a((ji)$$20);
                     dpm $$26 = new dpm($$12, $$24, false);
                     dpi $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dmo $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           to $$29 = $$28.d($$0.v());
                           $$17.add(new ali.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new ali.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new ali.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == ali.d.b) {
               for (id $$30 : $$19) {
                  dmo $$31 = $$12.c_($$30);
                  bnw.a_($$31);
                  $$12.a($$30, dcj.hW.n(), 2);
               }

               for (id $$32 : $$19) {
                  $$12.a($$32, dcj.a.n(), 3);
               }
            }

            List<ali.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<ali.a> $$34 = Lists.reverse($$33);

            for (ali.a $$35 : $$34) {
               dmo $$36 = $$13.c_($$35.a);
               bnw.a_($$36);
               $$13.a($$35.a, dcj.hW.n(), 2);
            }

            int $$37 = 0;

            for (ali.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (ali.a $$39 : $$17) {
               dmo $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c, $$13.H_());
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (ali.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.m().a($$12.m(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> wi.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fq.a.create();
         }
      }
   }

   static class a {
      public final id a;
      public final dpi b;
      @Nullable
      public final to c;

      public a(id $$0, dpi $$1, @Nullable to $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(apu a, id b) {
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
