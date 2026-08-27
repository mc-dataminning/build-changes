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

public class anr {
   private static final Logger a = LogUtils.getLogger();

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("resetchunks").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ee)$$0x.getSource(), 0, true)))
            .then(
               ((RequiredArgumentBuilder)ef.a("range", IntegerArgumentType.integer(0, 5))
                     .executes($$0x -> a((ee)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), true)))
                  .then(
                     ef.a("skipOldChunks", BoolArgumentType.bool())
                        .executes(
                           $$0x -> a((ee)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), BoolArgumentType.getBool($$0x, "skipOldChunks"))
                        )
                  )
            )
      );
   }

   private static int a(ee $$0, int $$1, boolean $$2) {
      aqm $$3 = $$0.e();
      aqk $$4 = $$3.l();
      $$4.a.d();
      euk $$5 = $$0.d();
      dae $$6 = new dae(io.a($$5));
      int $$7 = $$6.f - $$1;
      int $$8 = $$6.f + $$1;
      int $$9 = $$6.e - $$1;
      int $$10 = $$6.e + $$1;

      for (int $$11 = $$7; $$11 <= $$8; $$11++) {
         for (int $$12 = $$9; $$12 <= $$10; $$12++) {
            dae $$13 = new dae($$12, $$11);
            dth $$14 = $$4.a($$12, $$11, false);
            if ($$14 != null && (!$$2 || !$$14.s())) {
               for (io $$15 : io.b($$13.d(), $$3.I_(), $$13.e(), $$13.f(), $$3.al() - 1, $$13.g())) {
                  $$3.a($$15, dea.a.n(), 16);
               }
            }
         }
      }

      bon<Runnable> $$16 = bon.a(ac.g(), "worldgen-resetchunks");
      long $$17 = System.currentTimeMillis();
      int $$18 = ($$1 * 2 + 1) * ($$1 * 2 + 1);
      UnmodifiableIterator var34 = ImmutableList.of(dtw.f, dtw.g, dtw.h, dtw.i, dtw.j, dtw.k).iterator();

      while (var34.hasNext()) {
         dtw $$19 = (dtw)var34.next();
         long $$20 = System.currentTimeMillis();
         CompletableFuture<Unit> $$21 = CompletableFuture.supplyAsync(() -> Unit.INSTANCE, $$16::a);
         dua $$22 = new dua($$3, $$4.g(), $$3.q(), $$4.a());

         for (int $$23 = $$6.f - $$1; $$23 <= $$6.f + $$1; $$23++) {
            for (int $$24 = $$6.e - $$1; $$24 <= $$6.e + $$1; $$24++) {
               dae $$25 = new dae($$24, $$23);
               dth $$26 = $$4.a($$24, $$23, false);
               if ($$26 != null && (!$$2 || !$$26.s())) {
                  List<dsx> $$27 = Lists.newArrayList();
                  int $$28 = Math.max(1, $$19.e());

                  for (int $$29 = $$25.f - $$28; $$29 <= $$25.f + $$28; $$29++) {
                     for (int $$30 = $$25.e - $$28; $$30 <= $$25.e + $$28; $$30++) {
                        dsx $$31 = $$4.a($$30, $$29, $$19.d(), true);
                        dsx $$32;
                        if ($$31 instanceof dtg) {
                           $$32 = new dtg(((dtg)$$31).C(), true);
                        } else if ($$31 instanceof dth) {
                           $$32 = new dtg((dth)$$31, true);
                        } else {
                           $$32 = $$31;
                        }

                        $$27.add($$32);
                     }
                  }

                  $$21 = $$21.thenComposeAsync($$4x -> $$19.a($$22, $$16::a, $$0xx -> {
                        throw new UnsupportedOperationException("Not creating full chunks here");
                     }, $$27).thenApply($$1xx -> {
                        if ($$19 == dtw.g) {
                           dwt.a($$1xx, dtw.b);
                        }

                        return Unit.INSTANCE;
                     }), $$16::a);
               }
            }
         }

         $$0.l().c($$21::isDone);
         a.debug($$19 + " took " + (System.currentTimeMillis() - $$20) + " ms");
      }

      long $$35 = System.currentTimeMillis();

      for (int $$36 = $$6.f - $$1; $$36 <= $$6.f + $$1; $$36++) {
         for (int $$37 = $$6.e - $$1; $$37 <= $$6.e + $$1; $$37++) {
            dae $$38 = new dae($$37, $$36);
            dth $$39 = $$4.a($$37, $$36, false);
            if ($$39 != null && (!$$2 || !$$39.s())) {
               for (io $$40 : io.b($$38.d(), $$3.I_(), $$38.e(), $$38.f(), $$3.al() - 1, $$38.g())) {
                  $$4.a($$40);
               }
            }
         }
      }

      a.debug("blockChanged took " + (System.currentTimeMillis() - $$35) + " ms");
      long $$41 = System.currentTimeMillis() - $$17;
      $$0.a(
         () -> wx.b(
               String.format(
                  Locale.ROOT, "%d chunks have been reset. This took %d ms for %d chunks, or %02f ms per chunk", $$18, $$41, $$18, (float)$$41 / (float)$$18
               )
            ),
         true
      );
      return 1;
   }
}
