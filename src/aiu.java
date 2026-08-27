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

public class aiu {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vg.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> vg.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vg.c("commands.clone.failed"));
   public static final Predicate<djt> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ds)$$0x.getSource()).e())))
            .then(dt.a("from").then(dt.a("sourceDimension", ed.a()).then(a($$1, $$0x -> ed.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ds, ?> a(dn $$0, aiu.b<CommandContext<ds>, ane> $$1) {
      return dt.a("begin", fm.a())
         .then(
            ((RequiredArgumentBuilder)dt.a("end", fm.a()).then(a($$0, $$1, $$0x -> ((ds)$$0x.getSource()).e())))
               .then(dt.a("to").then(dt.a("targetDimension", ed.a()).then(a($$0, $$1, $$0x -> ed.a($$0x, "targetDimension")))))
         );
   }

   private static aiu.c a(CommandContext<ds> $$0, ane $$1, String $$2) throws CommandSyntaxException {
      hx $$3 = fm.a($$0, $$1, $$2);
      return new aiu.c($$1, $$3);
   }

   private static ArgumentBuilder<ds, ?> a(dn $$0, aiu.b<CommandContext<ds>, ane> $$1, aiu.b<CommandContext<ds>, ane> $$2) {
      aiu.b<CommandContext<ds>, aiu.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      aiu.b<CommandContext<ds>, aiu.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      aiu.b<CommandContext<ds>, aiu.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("destination", fm.a())
                  .executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, aiu.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     dt.a("replace").executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, aiu.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  dt.a("masked").executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, aiu.d.c))
               )
            ))
         .then(
            dt.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> fi.a($$0x, "filter"),
                     dt.a("filter", fi.a($$0))
                        .executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fi.a($$3x, "filter"), aiu.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ds, ?> a(
      aiu.b<CommandContext<ds>, aiu.c> $$0,
      aiu.b<CommandContext<ds>, aiu.c> $$1,
      aiu.b<CommandContext<ds>, aiu.c> $$2,
      aiu.b<CommandContext<ds>, Predicate<djt>> $$3,
      ArgumentBuilder<ds, ?> $$4
   ) {
      return $$4.then(dt.a("force").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), aiu.d.a)))
         .then(dt.a("move").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), aiu.d.b)))
         .then(dt.a("normal").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), aiu.d.c)));
   }

   private static int a(ds $$0, aiu.c $$1, aiu.c $$2, aiu.c $$3, Predicate<djt> $$4, aiu.d $$5) throws CommandSyntaxException {
      hx $$6 = $$1.b();
      hx $$7 = $$2.b();
      dzg $$8 = dzg.a($$6, $$7);
      hx $$9 = $$3.b();
      hx $$10 = $$9.a($$8.c());
      dzg $$11 = dzg.a($$9, $$10);
      ane $$12 = $$1.a();
      ane $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().Z().c(ctt.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<aiu.a> $$16 = Lists.newArrayList();
            List<aiu.a> $$17 = Lists.newArrayList();
            List<aiu.a> $$18 = Lists.newArrayList();
            Deque<hx> $$19 = Lists.newLinkedList();
            hx $$20 = new hx($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     hx $$24 = new hx($$23, $$22, $$21);
                     hx $$25 = $$24.a((jb)$$20);
                     djt $$26 = new djt($$12, $$24, false);
                     djp $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dhd $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           so $$29 = $$28.q();
                           $$17.add(new aiu.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new aiu.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new aiu.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == aiu.d.b) {
               for (hx $$30 : $$19) {
                  dhd $$31 = $$12.c_($$30);
                  bjt.a_($$31);
                  $$12.a($$30, cxa.hW.o(), 2);
               }

               for (hx $$32 : $$19) {
                  $$12.a($$32, cxa.a.o(), 3);
               }
            }

            List<aiu.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<aiu.a> $$34 = Lists.reverse($$33);

            for (aiu.a $$35 : $$34) {
               dhd $$36 = $$13.c_($$35.a);
               bjt.a_($$36);
               $$13.a($$35.a, cxa.hW.o(), 2);
            }

            int $$37 = 0;

            for (aiu.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (aiu.a $$39 : $$17) {
               dhd $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (aiu.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.m().a($$12.m(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> vg.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fm.a.create();
         }
      }
   }

   static class a {
      public final hx a;
      public final djp b;
      @Nullable
      public final so c;

      public a(hx $$0, djp $$1, @Nullable so $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(ane a, hx b) {
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
