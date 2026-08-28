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

public class ana {
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xc.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xc.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xc.c("commands.clone.failed"));
   public static final Predicate<ebk> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("clone").requires($$0x -> $$0x.c(2)))
               .then(a($$1, $$0x -> ((ek)$$0x.getSource()).e())))
            .then(el.a("from").then(el.a("sourceDimension", ev.a()).then(a($$1, $$0x -> ev.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ek, ?> a(eg $$0, anx<CommandContext<ek>, aru> $$1) {
      return el.a("begin", gh.a())
         .then(
            ((RequiredArgumentBuilder)el.a("end", gh.a()).then(a($$0, $$1, $$0x -> ((ek)$$0x.getSource()).e())))
               .then(el.a("to").then(el.a("targetDimension", ev.a()).then(a($$0, $$1, $$0x -> ev.a($$0x, "targetDimension")))))
         );
   }

   private static ana.c a(CommandContext<ek> $$0, aru $$1, String $$2) throws CommandSyntaxException {
      iw $$3 = gh.a($$0, $$1, $$2);
      return new ana.c($$1, $$3);
   }

   private static ArgumentBuilder<ek, ?> a(eg $$0, anx<CommandContext<ek>, aru> $$1, anx<CommandContext<ek>, aru> $$2) {
      anx<CommandContext<ek>, ana.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      anx<CommandContext<ek>, ana.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      anx<CommandContext<ek>, ana.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return a($$0, $$3, $$4, $$5, false, el.a("destination", gh.a())).then(a($$0, $$3, $$4, $$5, true, el.a("strict")));
   }

   private static ArgumentBuilder<ek, ?> a(
      eg $$0,
      anx<CommandContext<ek>, ana.c> $$1,
      anx<CommandContext<ek>, ana.c> $$2,
      anx<CommandContext<ek>, ana.c> $$3,
      boolean $$4,
      ArgumentBuilder<ek, ?> $$5
   ) {
      return $$5.executes($$4x -> a((ek)$$4x.getSource(), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), $$0xx -> true, ana.d.c, $$4))
         .then(a($$1, $$2, $$3, $$0x -> $$0xx -> true, $$4, el.a("replace")))
         .then(a($$1, $$2, $$3, $$0x -> a, $$4, el.a("masked")))
         .then(el.a("filtered").then(a($$1, $$2, $$3, $$0x -> gd.a($$0x, "filter"), $$4, el.a("filter", gd.a($$0)))));
   }

   private static ArgumentBuilder<ek, ?> a(
      anx<CommandContext<ek>, ana.c> $$0,
      anx<CommandContext<ek>, ana.c> $$1,
      anx<CommandContext<ek>, ana.c> $$2,
      anx<CommandContext<ek>, Predicate<ebk>> $$3,
      boolean $$4,
      ArgumentBuilder<ek, ?> $$5
   ) {
      return $$5.executes($$5x -> a((ek)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), ana.d.c, $$4))
         .then(el.a("force").executes($$5x -> a((ek)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), ana.d.a, $$4)))
         .then(el.a("move").executes($$5x -> a((ek)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), ana.d.b, $$4)))
         .then(el.a("normal").executes($$5x -> a((ek)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), ana.d.c, $$4)));
   }

   private static int a(ek $$0, ana.c $$1, ana.c $$2, ana.c $$3, Predicate<ebk> $$4, ana.d $$5, boolean $$6) throws CommandSyntaxException {
      iw $$7 = $$1.b();
      iw $$8 = $$2.b();
      erv $$9 = erv.a($$7, $$8);
      iw $$10 = $$3.b();
      iw $$11 = $$10.a($$9.c());
      erv $$12 = erv.a($$10, $$11);
      aru $$13 = $$1.a();
      aru $$14 = $$3.a();
      if (!$$5.a() && $$13 == $$14 && $$12.a($$9)) {
         throw b.create();
      } else {
         int $$15 = $$9.d() * $$9.e() * $$9.f();
         int $$16 = $$0.e().O().d(djv.B);
         if ($$15 > $$16) {
            throw c.create($$16, $$15);
         } else if ($$13.a($$7, $$8) && $$14.a($$10, $$11)) {
            if ($$14.ak()) {
               throw d.create();
            } else {
               List<ana.b> $$17 = Lists.newArrayList();
               List<ana.b> $$18 = Lists.newArrayList();
               List<ana.b> $$19 = Lists.newArrayList();
               Deque<iw> $$20 = Lists.newLinkedList();
               iw $$21 = new iw($$12.h() - $$9.h(), $$12.i() - $$9.i(), $$12.j() - $$9.j());

               for (int $$22 = $$9.j(); $$22 <= $$9.m(); $$22++) {
                  for (int $$23 = $$9.i(); $$23 <= $$9.l(); $$23++) {
                     for (int $$24 = $$9.h(); $$24 <= $$9.k(); $$24++) {
                        iw $$25 = new iw($$24, $$23, $$22);
                        iw $$26 = $$25.a((kb)$$21);
                        ebk $$27 = new ebk($$13, $$25, false);
                        ebg $$28 = $$27.a();
                        if ($$4.test($$27)) {
                           dye $$29 = $$13.c_($$25);
                           if ($$29 != null) {
                              ana.a $$30 = new ana.a($$29.e($$0.u()), $$29.r());
                              $$18.add(new ana.b($$26, $$28, $$30));
                              $$20.addLast($$25);
                           } else if (!$$28.s() && !$$28.m($$13, $$25)) {
                              $$19.add(new ana.b($$26, $$28, null));
                              $$20.addFirst($$25);
                           } else {
                              $$17.add(new ana.b($$26, $$28, null));
                              $$20.addLast($$25);
                           }
                        }
                     }
                  }
               }

               int $$31 = 2 | ($$6 ? 816 : 0);
               if ($$5 == ana.d.b) {
                  for (iw $$32 : $$20) {
                     $$13.a($$32, dng.iy.m(), $$31 | 816);
                  }

                  int $$33 = $$6 ? $$31 : 3;

                  for (iw $$34 : $$20) {
                     $$13.a($$34, dng.a.m(), $$33);
                  }
               }

               List<ana.b> $$35 = Lists.newArrayList();
               $$35.addAll($$17);
               $$35.addAll($$18);
               $$35.addAll($$19);
               List<ana.b> $$36 = Lists.reverse($$35);

               for (ana.b $$37 : $$36) {
                  $$14.a($$37.a, dng.iy.m(), $$31 | 816);
               }

               int $$38 = 0;

               for (ana.b $$39 : $$35) {
                  if ($$14.a($$39.a, $$39.b, $$31)) {
                     $$38++;
                  }
               }

               for (ana.b $$40 : $$18) {
                  dye $$41 = $$14.c_($$40.a);
                  if ($$40.c != null && $$41 != null) {
                     $$41.d($$40.c.a, $$14.J_());
                     $$41.a($$40.c.b);
                     $$41.e();
                  }

                  $$14.a($$40.a, $$40.b, $$31);
               }

               if (!$$6) {
                  for (ana.b $$42 : $$36) {
                     $$14.a($$42.a, $$42.b.b());
                  }
               }

               $$14.n().a($$13.n(), $$9, $$21);
               if ($$38 == 0) {
                  throw d.create();
               } else {
                  int $$43 = $$38;
                  $$0.a(() -> xc.a("commands.clone.success", $$43), true);
                  return $$38;
               }
            }
         } else {
            throw gh.a.create();
         }
      }
   }

   static record a(ua a, ki b) {
   }

   static record b(iw a, ebg b, @Nullable ana.a c) {
   }

   static record c(aru a, iw b) {
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
