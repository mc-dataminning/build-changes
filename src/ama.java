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

public class ama {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wx.c("commands.clone.failed"));
   public static final Predicate<drf> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ee)$$0x.getSource()).e())))
            .then(ef.a("from").then(ef.a("sourceDimension", ep.a()).then(a($$1, $$0x -> ep.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ee, ?> a(ea $$0, ama.c<CommandContext<ee>, aqm> $$1) {
      return ef.a("begin", ga.a())
         .then(
            ((RequiredArgumentBuilder)ef.a("end", ga.a()).then(a($$0, $$1, $$0x -> ((ee)$$0x.getSource()).e())))
               .then(ef.a("to").then(ef.a("targetDimension", ep.a()).then(a($$0, $$1, $$0x -> ep.a($$0x, "targetDimension")))))
         );
   }

   private static ama.d a(CommandContext<ee> $$0, aqm $$1, String $$2) throws CommandSyntaxException {
      io $$3 = ga.a($$0, $$1, $$2);
      return new ama.d($$1, $$3);
   }

   private static ArgumentBuilder<ee, ?> a(ea $$0, ama.c<CommandContext<ee>, aqm> $$1, ama.c<CommandContext<ee>, aqm> $$2) {
      ama.c<CommandContext<ee>, ama.d> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      ama.c<CommandContext<ee>, ama.d> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      ama.c<CommandContext<ee>, ama.d> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("destination", ga.a())
                  .executes($$3x -> a((ee)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ama.e.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     ef.a("replace").executes($$3x -> a((ee)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, ama.e.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  ef.a("masked").executes($$3x -> a((ee)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, ama.e.c))
               )
            ))
         .then(
            ef.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> fw.a($$0x, "filter"),
                     ef.a("filter", fw.a($$0))
                        .executes($$3x -> a((ee)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), fw.a($$3x, "filter"), ama.e.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ee, ?> a(
      ama.c<CommandContext<ee>, ama.d> $$0,
      ama.c<CommandContext<ee>, ama.d> $$1,
      ama.c<CommandContext<ee>, ama.d> $$2,
      ama.c<CommandContext<ee>, Predicate<drf>> $$3,
      ArgumentBuilder<ee, ?> $$4
   ) {
      return $$4.then(ef.a("force").executes($$4x -> a((ee)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ama.e.a)))
         .then(ef.a("move").executes($$4x -> a((ee)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ama.e.b)))
         .then(ef.a("normal").executes($$4x -> a((ee)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), ama.e.c)));
   }

   private static int a(ee $$0, ama.d $$1, ama.d $$2, ama.d $$3, Predicate<drf> $$4, ama.e $$5) throws CommandSyntaxException {
      io $$6 = $$1.b();
      io $$7 = $$2.b();
      ehb $$8 = ehb.a($$6, $$7);
      io $$9 = $$3.b();
      io $$10 = $$9.a($$8.c());
      ehb $$11 = ehb.a($$9, $$10);
      aqm $$12 = $$1.a();
      aqm $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().aa().c(dat.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<ama.b> $$16 = Lists.newArrayList();
            List<ama.b> $$17 = Lists.newArrayList();
            List<ama.b> $$18 = Lists.newArrayList();
            Deque<io> $$19 = Lists.newLinkedList();
            io $$20 = new io($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     io $$24 = new io($$23, $$22, $$21);
                     io $$25 = $$24.a((js)$$20);
                     drf $$26 = new drf($$12, $$24, false);
                     drb $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dog $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           ama.a $$29 = new ama.a($$28.e($$0.v()), $$28.t());
                           $$17.add(new ama.b($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new ama.b($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new ama.b($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == ama.e.b) {
               for (io $$30 : $$19) {
                  dog $$31 = $$12.c_($$30);
                  bpl.a_($$31);
                  $$12.a($$30, dea.hW.n(), 2);
               }

               for (io $$32 : $$19) {
                  $$12.a($$32, dea.a.n(), 3);
               }
            }

            List<ama.b> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<ama.b> $$34 = Lists.reverse($$33);

            for (ama.b $$35 : $$34) {
               dog $$36 = $$13.c_($$35.a);
               bpl.a_($$36);
               $$13.a($$35.a, dea.hW.n(), 2);
            }

            int $$37 = 0;

            for (ama.b $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (ama.b $$39 : $$17) {
               dog $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.d($$39.c.a, $$13.H_());
                  $$40.a($$39.c.b);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (ama.b $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.m().a($$12.m(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> wx.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw ga.a.create();
         }
      }
   }

   static record a(ud a, jx b) {
   }

   static record b(io a, drb b, @Nullable ama.a c) {
   }

   @FunctionalInterface
   interface c<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record d(aqm a, io b) {
   }

   static enum e {
      a(true),
      b(true),
      c(false);

      private final boolean d;

      private e(boolean $$0) {
         this.d = $$0;
      }

      public boolean a() {
         return this.d;
      }
   }
}
