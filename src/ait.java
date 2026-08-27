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

public class ait {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vf.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> vf.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(vf.c("commands.clone.failed"));
   public static final Predicate<djk> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ds)$$0x.getSource()).e())))
            .then(dt.a("from").then(dt.a("sourceDimension", ed.a()).then(a($$1, $$0x -> ed.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ds, ?> a(dn $$0, ait.b<CommandContext<ds>, and> $$1) {
      return dt.a("begin", fm.a())
         .then(
            ((RequiredArgumentBuilder)dt.a("end", fm.a()).then(a($$0, $$1, $$0x -> ((ds)$$0x.getSource()).e())))
               .then(dt.a("to").then(dt.a("targetDimension", ed.a()).then(a($$0, $$1, $$0x -> ed.a($$0x, "targetDimension")))))
         );
   }

   private static ait.c a(CommandContext<ds> $$0, and $$1, String $$2) throws CommandSyntaxException {
      hx $$3 = fm.a($$0, $$1, $$2);
      return new ait.c($$1, $$3);
   }

   private static ArgumentBuilder<ds, ?> a(dn $$0, ait.b<CommandContext<ds>, and> $$1, ait.b<CommandContext<ds>, and> $$2) {
      ait.b<CommandContext<ds>, ait.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      ait.b<CommandContext<ds>, ait.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      ait.b<CommandContext<ds>, ait.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("destination", fm.a())
                  .executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ait.d.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     dt.a("replace").executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ait.d.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  dt.a("masked").executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, ait.d.c))
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
                        .executes($$3x -> a((ds)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fi.a($$3x, "filter"), ait.d.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ds, ?> a(
      ait.b<CommandContext<ds>, ait.c> $$0,
      ait.b<CommandContext<ds>, ait.c> $$1,
      ait.b<CommandContext<ds>, ait.c> $$2,
      ait.b<CommandContext<ds>, Predicate<djk>> $$3,
      ArgumentBuilder<ds, ?> $$4
   ) {
      return $$4.then(dt.a("force").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ait.d.a)))
         .then(dt.a("move").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ait.d.b)))
         .then(dt.a("normal").executes($$4x -> a((ds)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ait.d.c)));
   }

   private static int a(ds $$0, ait.c $$1, ait.c $$2, ait.c $$3, Predicate<djk> $$4, ait.d $$5) throws CommandSyntaxException {
      hx $$6 = $$1.b();
      hx $$7 = $$2.b();
      dyx $$8 = dyx.a($$6, $$7);
      hx $$9 = $$3.b();
      hx $$10 = $$9.a($$8.c());
      dyx $$11 = dyx.a($$9, $$10);
      and $$12 = $$1.a();
      and $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().Z().c(ctk.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<ait.a> $$16 = Lists.newArrayList();
            List<ait.a> $$17 = Lists.newArrayList();
            List<ait.a> $$18 = Lists.newArrayList();
            Deque<hx> $$19 = Lists.newLinkedList();
            hx $$20 = new hx($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     hx $$24 = new hx($$23, $$22, $$21);
                     hx $$25 = $$24.a((jb)$$20);
                     djk $$26 = new djk($$12, $$24, false);
                     djg $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dgu $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           sn $$29 = $$28.q();
                           $$17.add(new ait.a($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new ait.a($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new ait.a($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == ait.d.b) {
               for (hx $$30 : $$19) {
                  dgu $$31 = $$12.c_($$30);
                  bjr.a_($$31);
                  $$12.a($$30, cwr.hW.o(), 2);
               }

               for (hx $$32 : $$19) {
                  $$12.a($$32, cwr.a.o(), 3);
               }
            }

            List<ait.a> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<ait.a> $$34 = Lists.reverse($$33);

            for (ait.a $$35 : $$34) {
               dgu $$36 = $$13.c_($$35.a);
               bjr.a_($$36);
               $$13.a($$35.a, cwr.hW.o(), 2);
            }

            int $$37 = 0;

            for (ait.a $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (ait.a $$39 : $$17) {
               dgu $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.a($$39.c);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (ait.a $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.m().a($$12.m(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> vf.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw fm.a.create();
         }
      }
   }

   static class a {
      public final hx a;
      public final djg b;
      @Nullable
      public final sn c;

      public a(hx $$0, djg $$1, @Nullable sn $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   interface b<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record c(and a, hx b) {
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
