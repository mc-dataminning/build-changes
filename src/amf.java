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

public class amf {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wy.c("commands.clone.failed"));
   public static final Predicate<dte> a = $$0 -> !$$0.a().i();

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((et)$$0x.getSource()).e())))
            .then(eu.a("from").then(eu.a("sourceDimension", fe.a()).then(a($$1, $$0x -> fe.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<et, ?> a(ep $$0, amf.c<CommandContext<et>, aqt> $$1) {
      return eu.a("begin", gp.a())
         .then(
            ((RequiredArgumentBuilder)eu.a("end", gp.a()).then(a($$0, $$1, $$0x -> ((et)$$0x.getSource()).e())))
               .then(eu.a("to").then(eu.a("targetDimension", fe.a()).then(a($$0, $$1, $$0x -> fe.a($$0x, "targetDimension")))))
         );
   }

   private static amf.d a(CommandContext<et> $$0, aqt $$1, String $$2) throws CommandSyntaxException {
      jd $$3 = gp.a($$0, $$1, $$2);
      return new amf.d($$1, $$3);
   }

   private static ArgumentBuilder<et, ?> a(ep $$0, amf.c<CommandContext<et>, aqt> $$1, amf.c<CommandContext<et>, aqt> $$2) {
      amf.c<CommandContext<et>, amf.d> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      amf.c<CommandContext<et>, amf.d> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      amf.c<CommandContext<et>, amf.d> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("destination", gp.a())
                  .executes($$3x -> a((et)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amf.e.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     eu.a("replace").executes($$3x -> a((et)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amf.e.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  eu.a("masked").executes($$3x -> a((et)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, amf.e.c))
               )
            ))
         .then(
            eu.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> gl.a($$0x, "filter"),
                     eu.a("filter", gl.a($$0))
                        .executes($$3x -> a((et)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), gl.a($$3x, "filter"), amf.e.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<et, ?> a(
      amf.c<CommandContext<et>, amf.d> $$0,
      amf.c<CommandContext<et>, amf.d> $$1,
      amf.c<CommandContext<et>, amf.d> $$2,
      amf.c<CommandContext<et>, Predicate<dte>> $$3,
      ArgumentBuilder<et, ?> $$4
   ) {
      return $$4.then(eu.a("force").executes($$4x -> a((et)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amf.e.a)))
         .then(eu.a("move").executes($$4x -> a((et)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amf.e.b)))
         .then(eu.a("normal").executes($$4x -> a((et)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amf.e.c)));
   }

   private static int a(et $$0, amf.d $$1, amf.d $$2, amf.d $$3, Predicate<dte> $$4, amf.e $$5) throws CommandSyntaxException {
      jd $$6 = $$1.b();
      jd $$7 = $$2.b();
      eje $$8 = eje.a($$6, $$7);
      jd $$9 = $$3.b();
      jd $$10 = $$9.a($$8.c());
      eje $$11 = eje.a($$9, $$10);
      aqt $$12 = $$1.a();
      aqt $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().ab().c(dcq.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<amf.b> $$16 = Lists.newArrayList();
            List<amf.b> $$17 = Lists.newArrayList();
            List<amf.b> $$18 = Lists.newArrayList();
            Deque<jd> $$19 = Lists.newLinkedList();
            jd $$20 = new jd($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     jd $$24 = new jd($$23, $$22, $$21);
                     jd $$25 = $$24.a((kh)$$20);
                     dte $$26 = new dte($$12, $$24, false);
                     dta $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dqf $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           amf.a $$29 = new amf.a($$28.e($$0.v()), $$28.t());
                           $$17.add(new amf.b($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.i($$12, $$24) && !$$27.r($$12, $$24)) {
                           $$18.add(new amf.b($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new amf.b($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == amf.e.b) {
               for (jd $$30 : $$19) {
                  dqf $$31 = $$12.c_($$30);
                  bqh.a_($$31);
                  $$12.a($$30, dfy.hW.o(), 2);
               }

               for (jd $$32 : $$19) {
                  $$12.a($$32, dfy.a.o(), 3);
               }
            }

            List<amf.b> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<amf.b> $$34 = Lists.reverse($$33);

            for (amf.b $$35 : $$34) {
               dqf $$36 = $$13.c_($$35.a);
               bqh.a_($$36);
               $$13.a($$35.a, dfy.hW.o(), 2);
            }

            int $$37 = 0;

            for (amf.b $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (amf.b $$39 : $$17) {
               dqf $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.d($$39.c.a, $$13.H_());
                  $$40.a($$39.c.b);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (amf.b $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.m().a($$12.m(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> wy.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw gp.a.create();
         }
      }
   }

   static record a(ua a, km b) {
   }

   static record b(jd a, dta b, @Nullable amf.a c) {
   }

   @FunctionalInterface
   interface c<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record d(aqt a, jd b) {
   }

   static enum e {
      a(true),
      b(true),
      c(false);

      private final boolean d;

      private e(final boolean $$0) {
         this.d = $$0;
      }

      public boolean a() {
         return this.d;
      }
   }
}
