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

public class amu {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ww.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> ww.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ww.c("commands.clone.failed"));
   public static final Predicate<dzs> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ei)$$0x.getSource()).e())))
            .then(ej.a("from").then(ej.a("sourceDimension", et.a()).then(a($$1, $$0x -> et.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ei, ?> a(ee $$0, anr<CommandContext<ei>, aro> $$1) {
      return ej.a("begin", gf.a())
         .then(
            ((RequiredArgumentBuilder)ej.a("end", gf.a()).then(a($$0, $$1, $$0x -> ((ei)$$0x.getSource()).e())))
               .then(ej.a("to").then(ej.a("targetDimension", et.a()).then(a($$0, $$1, $$0x -> et.a($$0x, "targetDimension")))))
         );
   }

   private static amu.c a(CommandContext<ei> $$0, aro $$1, String $$2) throws CommandSyntaxException {
      iu $$3 = gf.a($$0, $$1, $$2);
      return new amu.c($$1, $$3);
   }

   private static ArgumentBuilder<ei, ?> a(ee $$0, anr<CommandContext<ei>, aro> $$1, anr<CommandContext<ei>, aro> $$2) {
      anr<CommandContext<ei>, amu.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      anr<CommandContext<ei>, amu.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      anr<CommandContext<ei>, amu.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return a($$0, $$3, $$4, $$5, false, ej.a("destination", gf.a())).then(a($$0, $$3, $$4, $$5, true, ej.a("strict")));
   }

   private static ArgumentBuilder<ei, ?> a(
      ee $$0,
      anr<CommandContext<ei>, amu.c> $$1,
      anr<CommandContext<ei>, amu.c> $$2,
      anr<CommandContext<ei>, amu.c> $$3,
      boolean $$4,
      ArgumentBuilder<ei, ?> $$5
   ) {
      return $$5.executes($$4x -> a((ei)$$4x.getSource(), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), $$0xx -> true, amu.d.c, $$4))
         .then(a($$1, $$2, $$3, $$0x -> $$0xx -> true, $$4, ej.a("replace")))
         .then(a($$1, $$2, $$3, $$0x -> a, $$4, ej.a("masked")))
         .then(ej.a("filtered").then(a($$1, $$2, $$3, $$0x -> gb.a($$0x, "filter"), $$4, ej.a("filter", gb.a($$0)))));
   }

   private static ArgumentBuilder<ei, ?> a(
      anr<CommandContext<ei>, amu.c> $$0,
      anr<CommandContext<ei>, amu.c> $$1,
      anr<CommandContext<ei>, amu.c> $$2,
      anr<CommandContext<ei>, Predicate<dzs>> $$3,
      boolean $$4,
      ArgumentBuilder<ei, ?> $$5
   ) {
      return $$5.executes($$5x -> a((ei)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amu.d.c, $$4))
         .then(ej.a("force").executes($$5x -> a((ei)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amu.d.a, $$4)))
         .then(ej.a("move").executes($$5x -> a((ei)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amu.d.b, $$4)))
         .then(ej.a("normal").executes($$5x -> a((ei)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), amu.d.c, $$4)));
   }

   private static int a(ei $$0, amu.c $$1, amu.c $$2, amu.c $$3, Predicate<dzs> $$4, amu.d $$5, boolean $$6) throws CommandSyntaxException {
      iu $$7 = $$1.b();
      iu $$8 = $$2.b();
      eqa $$9 = eqa.a($$7, $$8);
      iu $$10 = $$3.b();
      iu $$11 = $$10.a($$9.c());
      eqa $$12 = eqa.a($$10, $$11);
      aro $$13 = $$1.a();
      aro $$14 = $$3.a();
      if (!$$5.a() && $$13 == $$14 && $$12.a($$9)) {
         throw b.create();
      } else {
         int $$15 = $$9.d() * $$9.e() * $$9.f();
         int $$16 = $$0.e().O().d(dil.A);
         if ($$15 > $$16) {
            throw c.create($$16, $$15);
         } else if ($$13.a($$7, $$8) && $$14.a($$10, $$11)) {
            if ($$14.ak()) {
               throw d.create();
            } else {
               List<amu.b> $$17 = Lists.newArrayList();
               List<amu.b> $$18 = Lists.newArrayList();
               List<amu.b> $$19 = Lists.newArrayList();
               Deque<iu> $$20 = Lists.newLinkedList();
               iu $$21 = new iu($$12.h() - $$9.h(), $$12.i() - $$9.i(), $$12.j() - $$9.j());

               for (int $$22 = $$9.j(); $$22 <= $$9.m(); $$22++) {
                  for (int $$23 = $$9.i(); $$23 <= $$9.l(); $$23++) {
                     for (int $$24 = $$9.h(); $$24 <= $$9.k(); $$24++) {
                        iu $$25 = new iu($$24, $$23, $$22);
                        iu $$26 = $$25.a((jz)$$21);
                        dzs $$27 = new dzs($$13, $$25, false);
                        dzo $$28 = $$27.a();
                        if ($$4.test($$27)) {
                           dwn $$29 = $$13.c_($$25);
                           if ($$29 != null) {
                              amu.a $$30 = new amu.a($$29.e($$0.u()), $$29.r());
                              $$18.add(new amu.b($$26, $$28, $$30));
                              $$20.addLast($$25);
                           } else if (!$$28.s() && !$$28.m($$13, $$25)) {
                              $$19.add(new amu.b($$26, $$28, null));
                              $$20.addFirst($$25);
                           } else {
                              $$17.add(new amu.b($$26, $$28, null));
                              $$20.addLast($$25);
                           }
                        }
                     }
                  }
               }

               int $$31 = 2 | ($$6 ? 304 : 0);
               if ($$5 == amu.d.b) {
                  for (iu $$32 : $$20) {
                     $$13.a($$32, dlw.iu.m(), $$31 | 304);
                  }

                  int $$33 = $$6 ? $$31 : 3;

                  for (iu $$34 : $$20) {
                     $$13.a($$34, dlw.a.m(), $$33);
                  }
               }

               List<amu.b> $$35 = Lists.newArrayList();
               $$35.addAll($$17);
               $$35.addAll($$18);
               $$35.addAll($$19);
               List<amu.b> $$36 = Lists.reverse($$35);

               for (amu.b $$37 : $$36) {
                  $$14.a($$37.a, dlw.iu.m(), $$31 | 304);
               }

               int $$38 = 0;

               for (amu.b $$39 : $$35) {
                  if ($$14.a($$39.a, $$39.b, $$31)) {
                     $$38++;
                  }
               }

               for (amu.b $$40 : $$18) {
                  dwn $$41 = $$14.c_($$40.a);
                  if ($$40.c != null && $$41 != null) {
                     $$41.d($$40.c.a, $$14.F_());
                     $$41.a($$40.c.b);
                     $$41.e();
                  }

                  $$14.a($$40.a, $$40.b, $$31);
               }

               if (!$$6) {
                  for (amu.b $$42 : $$36) {
                     $$14.a($$42.a, $$42.b.b());
                  }
               }

               $$14.n().a($$13.n(), $$9, $$21);
               if ($$38 == 0) {
                  throw d.create();
               } else {
                  int $$43 = $$38;
                  $$0.a(() -> ww.a("commands.clone.success", $$43), true);
                  return $$38;
               }
            }
         } else {
            throw gf.a.create();
         }
      }
   }

   static record a(tx a, kg b) {
   }

   static record b(iu a, dzo b, @Nullable amu.a c) {
   }

   static record c(aro a, iu b) {
   }

   static enum d {
      a(true),
      b(true),
      c(false);

      private final boolean d;

      private d(final boolean $$0) {
         this.d = $$0;
      }

      public boolean a() {
         return this.d;
      }
   }
}
