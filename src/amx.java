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

public class amx {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xh.c("commands.clone.failed"));
   public static final Predicate<dvh> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ev)$$0x.getSource()).e())))
            .then(ew.a("from").then(ew.a("sourceDimension", fg.a()).then(a($$1, $$0x -> fg.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ev, ?> a(er $$0, amx.c<CommandContext<ev>, arm> $$1) {
      return ew.a("begin", gr.a())
         .then(
            ((RequiredArgumentBuilder)ew.a("end", gr.a()).then(a($$0, $$1, $$0x -> ((ev)$$0x.getSource()).e())))
               .then(ew.a("to").then(ew.a("targetDimension", fg.a()).then(a($$0, $$1, $$0x -> fg.a($$0x, "targetDimension")))))
         );
   }

   private static amx.d a(CommandContext<ev> $$0, arm $$1, String $$2) throws CommandSyntaxException {
      jg $$3 = gr.a($$0, $$1, $$2);
      return new amx.d($$1, $$3);
   }

   private static ArgumentBuilder<ev, ?> a(er $$0, amx.c<CommandContext<ev>, arm> $$1, amx.c<CommandContext<ev>, arm> $$2) {
      amx.c<CommandContext<ev>, amx.d> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      amx.c<CommandContext<ev>, amx.d> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      amx.c<CommandContext<ev>, amx.d> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("destination", gr.a())
                  .executes($$3x -> a((ev)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amx.e.c)))
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> $$0xx -> true,
                     ew.a("replace").executes($$3x -> a((ev)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), $$0xx -> true, amx.e.c))
                  )
               ))
            .then(
               a(
                  $$3,
                  $$4,
                  $$5,
                  $$0x -> a,
                  ew.a("masked").executes($$3x -> a((ev)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), a, amx.e.c))
               )
            ))
         .then(
            ew.a("filtered")
               .then(
                  a(
                     $$3,
                     $$4,
                     $$5,
                     $$0x -> gn.a($$0x, "filter"),
                     ew.a("filter", gn.a($$0))
                        .executes($$3x -> a((ev)$$3x.getSource(), $$3.apply($$3x), $$4.apply($$3x), $$5.apply($$3x), gn.a($$3x, "filter"), amx.e.c))
                  )
               )
         );
   }

   private static ArgumentBuilder<ev, ?> a(
      amx.c<CommandContext<ev>, amx.d> $$0,
      amx.c<CommandContext<ev>, amx.d> $$1,
      amx.c<CommandContext<ev>, amx.d> $$2,
      amx.c<CommandContext<ev>, Predicate<dvh>> $$3,
      ArgumentBuilder<ev, ?> $$4
   ) {
      return $$4.then(ew.a("force").executes($$4x -> a((ev)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amx.e.a)))
         .then(ew.a("move").executes($$4x -> a((ev)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amx.e.b)))
         .then(ew.a("normal").executes($$4x -> a((ev)$$4x.getSource(), $$0.apply($$4x), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), amx.e.c)));
   }

   private static int a(ev $$0, amx.d $$1, amx.d $$2, amx.d $$3, Predicate<dvh> $$4, amx.e $$5) throws CommandSyntaxException {
      jg $$6 = $$1.b();
      jg $$7 = $$2.b();
      elj $$8 = elj.a($$6, $$7);
      jg $$9 = $$3.b();
      jg $$10 = $$9.a($$8.c());
      elj $$11 = elj.a($$9, $$10);
      arm $$12 = $$1.a();
      arm $$13 = $$3.a();
      if (!$$5.a() && $$12 == $$13 && $$11.a($$8)) {
         throw b.create();
      } else {
         int $$14 = $$8.d() * $$8.e() * $$8.f();
         int $$15 = $$0.e().ac().c(der.z);
         if ($$14 > $$15) {
            throw c.create($$15, $$14);
         } else if ($$12.a($$6, $$7) && $$13.a($$9, $$10)) {
            List<amx.b> $$16 = Lists.newArrayList();
            List<amx.b> $$17 = Lists.newArrayList();
            List<amx.b> $$18 = Lists.newArrayList();
            Deque<jg> $$19 = Lists.newLinkedList();
            jg $$20 = new jg($$11.h() - $$8.h(), $$11.i() - $$8.i(), $$11.j() - $$8.j());

            for (int $$21 = $$8.j(); $$21 <= $$8.m(); $$21++) {
               for (int $$22 = $$8.i(); $$22 <= $$8.l(); $$22++) {
                  for (int $$23 = $$8.h(); $$23 <= $$8.k(); $$23++) {
                     jg $$24 = new jg($$23, $$22, $$21);
                     jg $$25 = $$24.a((kk)$$20);
                     dvh $$26 = new dvh($$12, $$24, false);
                     dvd $$27 = $$26.a();
                     if ($$4.test($$26)) {
                        dsg $$28 = $$12.c_($$24);
                        if ($$28 != null) {
                           amx.a $$29 = new amx.a($$28.e($$0.v()), $$28.s());
                           $$17.add(new amx.b($$25, $$27, $$29));
                           $$19.addLast($$24);
                        } else if (!$$27.s() && !$$27.m($$12, $$24)) {
                           $$18.add(new amx.b($$25, $$27, null));
                           $$19.addFirst($$24);
                        } else {
                           $$16.add(new amx.b($$25, $$27, null));
                           $$19.addLast($$24);
                        }
                     }
                  }
               }
            }

            if ($$5 == amx.e.b) {
               for (jg $$30 : $$19) {
                  dsg $$31 = $$12.c_($$30);
                  brp.a_($$31);
                  $$12.a($$30, dia.hW.m(), 2);
               }

               for (jg $$32 : $$19) {
                  $$12.a($$32, dia.a.m(), 3);
               }
            }

            List<amx.b> $$33 = Lists.newArrayList();
            $$33.addAll($$16);
            $$33.addAll($$17);
            $$33.addAll($$18);
            List<amx.b> $$34 = Lists.reverse($$33);

            for (amx.b $$35 : $$34) {
               dsg $$36 = $$13.c_($$35.a);
               brp.a_($$36);
               $$13.a($$35.a, dia.hW.m(), 2);
            }

            int $$37 = 0;

            for (amx.b $$38 : $$33) {
               if ($$13.a($$38.a, $$38.b, 2)) {
                  $$37++;
               }
            }

            for (amx.b $$39 : $$17) {
               dsg $$40 = $$13.c_($$39.a);
               if ($$39.c != null && $$40 != null) {
                  $$40.d($$39.c.a, $$13.H_());
                  $$40.a($$39.c.b);
                  $$40.e();
               }

               $$13.a($$39.a, $$39.b, 2);
            }

            for (amx.b $$41 : $$34) {
               $$13.b($$41.a, $$41.b.b());
            }

            $$13.m().a($$12.m(), $$8, $$20);
            if ($$37 == 0) {
               throw d.create();
            } else {
               int $$42 = $$37;
               $$0.a(() -> xh.a("commands.clone.success", $$42), true);
               return $$37;
            }
         } else {
            throw gr.a.create();
         }
      }
   }

   static record a(uj a, kp b) {
   }

   static record b(jg a, dvd b, @Nullable amx.a c) {
   }

   @FunctionalInterface
   interface c<T, R> {
      R apply(T var1) throws CommandSyntaxException;
   }

   static record d(arm a, jg b) {
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
