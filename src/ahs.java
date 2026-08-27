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

public class ahs {
   private static final Logger a = LogUtils.getLogger();

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("resetchunks").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ds)$$0x.getSource(), 0, true)))
            .then(
               ((RequiredArgumentBuilder)dt.a("range", IntegerArgumentType.integer(0, 5))
                     .executes($$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), true)))
                  .then(
                     dt.a("skipOldChunks", BoolArgumentType.bool())
                        .executes(
                           $$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), BoolArgumentType.getBool($$0x, "skipOldChunks"))
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, int $$1, boolean $$2) {
      aki $$3 = $$0.e();
      akg $$4 = $$3.k();
      $$4.a.d();
      ehf $$5 = $$0.d();
      cor $$6 = new cor(gv.a($$5));
      int $$7 = $$6.f - $$1;
      int $$8 = $$6.f + $$1;
      int $$9 = $$6.e - $$1;
      int $$10 = $$6.e + $$1;

      for (int $$11 = $$7; $$11 <= $$8; $$11++) {
         for (int $$12 = $$9; $$12 <= $$10; $$12++) {
            cor $$13 = new cor($$12, $$11);
            dhf $$14 = $$4.a($$12, $$11, false);
            if ($$14 != null && (!$$2 || !$$14.s())) {
               for (gv $$15 : gv.b($$13.d(), $$3.C_(), $$13.e(), $$13.f(), $$3.aj() - 1, $$13.g())) {
                  $$3.a($$15, csl.a.n(), 16);
               }
            }
         }
      }

      bfh<Runnable> $$16 = bfh.a(ac.f(), "worldgen-resetchunks");
      long $$17 = System.currentTimeMillis();
      int $$18 = ($$1 * 2 + 1) * ($$1 * 2 + 1);
      UnmodifiableIterator var33 = ImmutableList.of(dgz.f, dgz.g, dgz.h, dgz.i, dgz.j, dgz.k).iterator();

      while (var33.hasNext()) {
         dgz $$19 = (dgz)var33.next();
         long $$20 = System.currentTimeMillis();
         CompletableFuture<Unit> $$21 = CompletableFuture.supplyAsync(() -> Unit.INSTANCE, $$16::a);

         for (int $$22 = $$6.f - $$1; $$22 <= $$6.f + $$1; $$22++) {
            for (int $$23 = $$6.e - $$1; $$23 <= $$6.e + $$1; $$23++) {
               cor $$24 = new cor($$23, $$22);
               dhf $$25 = $$4.a($$23, $$22, false);
               if ($$25 != null && (!$$2 || !$$25.s())) {
                  List<dgu> $$26 = Lists.newArrayList();
                  int $$27 = Math.max(1, $$19.e());

                  for (int $$28 = $$24.f - $$27; $$28 <= $$24.f + $$27; $$28++) {
                     for (int $$29 = $$24.e - $$27; $$29 <= $$24.e + $$27; $$29++) {
                        dgu $$30 = $$4.a($$29, $$28, $$19.d(), true);
                        dgu $$31;
                        if ($$30 instanceof dhe) {
                           $$31 = new dhe(((dhe)$$30).C(), true);
                        } else if ($$30 instanceof dhf) {
                           $$31 = new dhe((dhf)$$30, true);
                        } else {
                           $$31 = $$30;
                        }

                        $$26.add($$31);
                     }
                  }

                  $$21 = $$21.thenComposeAsync($$5x -> $$19.a($$16::a, $$3, $$4.g(), $$3.p(), $$4.a(), $$0xx -> {
                        throw new UnsupportedOperationException("Not creating full chunks here");
                     }, $$26).thenApply($$1xx -> {
                        if ($$19 == dgz.g) {
                           $$1xx.left().ifPresent($$0xxx -> dkh.a($$0xxx, dgz.b));
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
            cor $$37 = new cor($$36, $$35);
            dhf $$38 = $$4.a($$36, $$35, false);
            if ($$38 != null && (!$$2 || !$$38.s())) {
               for (gv $$39 : gv.b($$37.d(), $$3.C_(), $$37.e(), $$37.f(), $$3.aj() - 1, $$37.g())) {
                  $$4.a($$39);
               }
            }
         }
      }

      a.debug("blockChanged took " + (System.currentTimeMillis() - $$34) + " ms");
      long $$40 = System.currentTimeMillis() - $$17;
      $$0.a(
         () -> te.b(
               String.format(
                  Locale.ROOT, "%d chunks have been reset. This took %d ms for %d chunks, or %02f ms per chunk", $$18, $$40, $$18, (float)$$40 / (float)$$18
               )
            ),
         true
      );
      return 1;
   }
}
