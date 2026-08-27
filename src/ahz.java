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

public class ahz {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(uv.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> uv.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(uv.c("commands.clone.failed"));
   public static final Predicate<dhr> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((du)$$0x.getSource()).e())))
            .then(dv.a("from").then(dv.a("sourceDimension", ee.a()).then(a($$1, $$0x -> ee.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<du, ?> a(dp $$0, ahz.b<CommandContext<du>, ami> $$1) {
      return dv.a("begin", fm.a())
         .then(
            ((RequiredArgumentBuilder)dv.a("end", fm.a()).then(a($$0, $$1, $$0x -> ((du)$$0x.getSource()).e())))
               .then(dv.a("to").then(dv.a("targetDimension", ee.a()).then(a($$0, $$1, $$0x -> ee.a($$0x, "targetDimension")))))
         );
   }

   private static ahz.c a(CommandContext<du> $$0, ami $$1, String $$2) throws CommandSyntaxException {
      hx $$3 = fm.a($$0, $$1, $$2);
      return new ahz.c($$1, $$3);
   }

   private static ArgumentBuilder<du, ?> a(dp $$0, ahz.b<CommandContext<du>, ami> $$1, ahz.b<CommandContext<du>, ami> $$2) {
      ahz.b<CommandContext<du>, ahz.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      ahz.b<CommandContext<du>, ahz.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      ahz.b<CommandContext<du>, ahz.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("destination", fm.a())
                  .executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ahz.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     dv.a("replace").executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ahz.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  dv.a("masked").executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, ahz.d.c))
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
                        .executes($$3x -> a((du)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fi.a($$3x, "filter"), ahz.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<du, ?> a(
      ahz.b<CommandContext<du>, ahz.c> $$0,
      ahz.b<CommandContext<du>, ahz.c> $$1,
      ahz.b<CommandContext<du>, ahz.c> $$2,
      ahz.b<CommandContext<du>, Predicate<dhr>> $$3,
      ArgumentBuilder<du, ?> $$4
   ) {
      return $$4.then(dv.a("force").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ahz.d.a)))
         .then(dv.a("move").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ahz.d.b)))
         .then(dv.a("normal").executes($$4x -> a((du)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ahz.d.c)));
   }

   private static int a(du $$0, ahz.c $$1, ahz.c $$2, ahz.c $$3, Predicate<dhr> $$4, ahz.d $$5) throws CommandSyntaxException {
      hx $$6 = $$1.b();
      hx $$7 = $$2.b();
      dxe $$8 = dxe.a($$6, $$7);
      hx $$9 = $$3.b();
      hx $$10 = $$9.a($$8.c());
      dxe $$11 = dxe.a($$9, $$10);
      ami $$12 = $$1.a();
      ami $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().Y().c(csb.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<ahz.a> $$16 = Lists.newArrayList();
            List<ahz.a> $$17 = Lists.newArrayList();
            List<ahz.a> $$18 = Lists.newArrayList();
            Deque<hx> $$19 = Lists.newLinkedList();
            hx $$20 = new hx($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     hx $$24 = new hx($$23, $$22, $$21);
                     hx $$25 = $$24.a((ja)$$20);
                     dhr $$26 = new dhr($$12, $$24, false);
                     dhn $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dfi $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           sd $$29 = $$28.q();
                           $$17.add(new ahz.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new ahz.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new ahz.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == ahz.d.b) {
               for (hx $$30 : $$19) {
                  dfi $$31 = $$12.c_($$30);
                  bis.a_($$31);
                  $$12.a($$30, cvh.hW.o(), 2);
               }

               for (hx $$32 : $$19) {
                  $$12.a($$32, cvh.a.o(), 3);
               }
            }

            List<ahz.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<ahz.a> $$34 = Lists.reverse($$33);

            for (ahz.a $$35 : $$34) {
               dfi $$36 = $$13.c_($$35.a);
               bis.a_($$36);
               $$13.a($$35.a, cvh.hW.o(), 2);
            }

            int $$37 = 0;

            for (ahz.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (ahz.a $$39 : $$17) {
               dfi $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (ahz.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.l().a($$12.l(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> uv.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fm.a.create();
         }
      }
   }

   static class a {
      public final hx a;
      public final dhn b;
      @Nullable
      public final sd c;

      public a(hx $$0, dhn $$1, @Nullable sd $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(ami a, hx b) {
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
