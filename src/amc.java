import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.datafixers.util.Unit;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class amc {
   private static final Logger a = LogUtils.getLogger();

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("resetchunks").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((du)$$0x.getSource(), 0, true)))
            .then(
               ((RequiredArgumentBuilder)dv.a("range", IntegerArgumentType.integer(0, 5))
                     .executes($$0x -> a((du)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), true)))
                  .then(
                     dv.a("skipOldChunks", BoolArgumentType.bool())
                        .executes(
                           $$0x -> a((du)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), BoolArgumentType.getBool($$0x, "skipOldChunks"))
                        )
                  )
            )
      );
   }

   private static int a(du $$0, int $$1, boolean $$2) {
      aow $$3 = $$0.e();
      aou $$4 = $$3.l();
      $$4.a.d();
      enz $$5 = $$0.d();
      cuy $$6 = new cuy(hz.a($$5));
      int $$7 = $$6.f - $$1;
      int $$8 = $$6.f + $$1;
      int $$9 = $$6.e - $$1;
      int $$10 = $$6.e + $$1;

      for (int $$11 = $$7; $$11 <= $$8; $$11++) {
         for (int $$12 = $$9; $$12 <= $$10; $$12++) {
            cuy $$13 = new cuy($$12, $$11);
            dnq $$14 = $$4.a($$12, $$11, false);
            if ($$14 != null && (!$$2 || !$$14.s())) {
               for (hz $$15 : hz.b($$13.d(), $$3.J_(), $$13.e(), $$13.f(), $$3.ak() - 1, $$13.g())) {
                  $$3.a($$15, cyu.a.o(), 16);
               }
            }
         }
      }

      bkp<Runnable> $$16 = bkp.a(ac.f(), "worldgen-resetchunks");
      long $$17 = System.currentTimeMillis();
      int $$18 = ($$1 * 2 + 1) * ($$1 * 2 + 1);
      UnmodifiableIterator var33 = ImmutableList.of(dnk.f, dnk.g, dnk.h, dnk.i, dnk.j, dnk.k).iterator();

      while (var33.hasNext()) {
         dnk $$19 = (dnk)var33.next();
         long $$20 = System.currentTimeMillis();
         CompletableFuture<Unit> $$21 = CompletableFuture.supplyAsync(() -> Unit.INSTANCE, $$16::a);

         for (int $$22 = $$6.f - $$1; $$22 <= $$6.f + $$1; $$22++) {
            for (int $$23 = $$6.e - $$1; $$23 <= $$6.e + $$1; $$23++) {
               cuy $$24 = new cuy($$23, $$22);
               dnq $$25 = $$4.a($$23, $$22, false);
               if ($$25 != null && (!$$2 || !$$25.s())) {
                  List<dnf> $$26 = Lists.newArrayList();
                  int $$27 = Math.max(1, $$19.e());

                  for (int $$28 = $$24.f - $$27; $$28 <= $$24.f + $$27; $$28++) {
                     for (int $$29 = $$24.e - $$27; $$29 <= $$24.e + $$27; $$29++) {
                        dnf $$30 = $$4.a($$29, $$28, $$19.d(), true);
                        dnf $$31;
                        if ($$30 instanceof dnp) {
                           $$31 = new dnp(((dnp)$$30).C(), true);
                        } else if ($$30 instanceof dnq) {
                           $$31 = new dnp((dnq)$$30, true);
                        } else {
                           $$31 = $$30;
                        }

                        $$26.add($$31);
                     }
                  }

                  $$21 = $$21.thenComposeAsync($$5x -> $$19.a($$16::a, $$3, $$4.g(), $$3.q(), $$4.a(), $$0xx -> {
                        throw new UnsupportedOperationException("Not creating full chunks here");
                     }, $$26).thenApply($$1xx -> {
                        if ($$19 == dnk.g) {
                           $$1xx.left().ifPresent($$0xxx -> dqv.a($$0xxx, dnk.b));
                        }

                        return Unit.INSTANCE;
                     }), $$16::a);
               }
            }
         }

         $$0.l().c($$21::isDone);
         a.debug($$19 + " took " + (System.currentTimeMillis() - $$20) + " ms");
      }

      long $$34 = System.currentTimeMillis();

      for (int $$35 = $$6.f - $$1; $$35 <= $$6.f + $$1; $$35++) {
         for (int $$36 = $$6.e - $$1; $$36 <= $$6.e + $$1; $$36++) {
            cuy $$37 = new cuy($$36, $$35);
            dnq $$38 = $$4.a($$36, $$35, false);
            if ($$38 != null && (!$$2 || !$$38.s())) {
               for (hz $$39 : hz.b($$37.d(), $$3.J_(), $$37.e(), $$37.f(), $$3.ak() - 1, $$37.g())) {
                  $$4.a($$39);
               }
            }
         }
      }

      a.debug("blockChanged took " + (System.currentTimeMillis() - $$34) + " ms");
      long $$40 = System.currentTimeMillis() - $$17;
      $$0.a(
         () -> vq.b(
               String.format(
                  Locale.ROOT, "%d chunks have been reset. This took %d ms for %d chunks, or %02f ms per chunk", $$18, $$40, $$18, (float)$$40 / (float)$$18
               )
            ),
         true
      );
      return 1;
   }
}
