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

public class anp {
   private static final Logger a = LogUtils.getLogger();

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("resetchunks").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eq)$$0x.getSource(), 0, true)))
            .then(
               ((RequiredArgumentBuilder)er.a("range", IntegerArgumentType.integer(0, 5))
                     .executes($$0x -> a((eq)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), true)))
                  .then(
                     er.a("skipOldChunks", BoolArgumentType.bool())
                        .executes(
                           $$0x -> a((eq)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), BoolArgumentType.getBool($$0x, "skipOldChunks"))
                        )
                  )
            )
      );
   }

   private static int a(eq $$0, int $$1, boolean $$2) {
      aqk $$3 = $$0.e();
      aqi $$4 = $$3.l();
      $$4.a.d();
      evz $$5 = $$0.d();
      dbk $$6 = new dbk(ja.a($$5));
      int $$7 = $$6.f - $$1;
      int $$8 = $$6.f + $$1;
      int $$9 = $$6.e - $$1;
      int $$10 = $$6.e + $$1;

      for (int $$11 = $$7; $$11 <= $$8; $$11++) {
         for (int $$12 = $$9; $$12 <= $$10; $$12++) {
            dbk $$13 = new dbk($$12, $$11);
            dun $$14 = $$4.a($$12, $$11, false);
            if ($$14 != null && (!$$2 || !$$14.s())) {
               for (ja $$15 : ja.b($$13.d(), $$3.I_(), $$13.e(), $$13.f(), $$3.am() - 1, $$13.g())) {
                  $$3.a($$15, dfh.a.o(), 16);
               }
            }
         }
      }

      bow<Runnable> $$16 = bow.a(ac.g(), "worldgen-resetchunks");
      long $$17 = System.currentTimeMillis();
      int $$18 = ($$1 * 2 + 1) * ($$1 * 2 + 1);
      UnmodifiableIterator var34 = ImmutableList.of(dvc.f, dvc.g, dvc.h, dvc.i, dvc.j, dvc.k).iterator();

      while (var34.hasNext()) {
         dvc $$19 = (dvc)var34.next();
         long $$20 = System.currentTimeMillis();
         CompletableFuture<Unit> $$21 = CompletableFuture.supplyAsync(() -> Unit.INSTANCE, $$16::a);
         dvg $$22 = new dvg($$3, $$4.g(), $$3.q(), $$4.a());

         for (int $$23 = $$6.f - $$1; $$23 <= $$6.f + $$1; $$23++) {
            for (int $$24 = $$6.e - $$1; $$24 <= $$6.e + $$1; $$24++) {
               dbk $$25 = new dbk($$24, $$23);
               dun $$26 = $$4.a($$24, $$23, false);
               if ($$26 != null && (!$$2 || !$$26.s())) {
                  List<dud> $$27 = Lists.newArrayList();
                  int $$28 = Math.max(1, $$19.e());

                  for (int $$29 = $$25.f - $$28; $$29 <= $$25.f + $$28; $$29++) {
                     for (int $$30 = $$25.e - $$28; $$30 <= $$25.e + $$28; $$30++) {
                        dud $$31 = $$4.a($$30, $$29, $$19.d(), true);
                        dud $$32;
                        if ($$31 instanceof dum) {
                           $$32 = new dum(((dum)$$31).C(), true);
                        } else if ($$31 instanceof dun) {
                           $$32 = new dum((dun)$$31, true);
                        } else {
                           $$32 = $$31;
                        }

                        $$27.add($$32);
                     }
                  }

                  $$21 = $$21.thenComposeAsync($$4x -> $$19.a($$22, $$16::a, $$0xx -> {
                        throw new UnsupportedOperationException("Not creating full chunks here");
                     }, $$27).thenApply($$1xx -> {
                        if ($$19 == dvc.g) {
                           dxz.a($$1xx, dvc.b);
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
            dbk $$38 = new dbk($$37, $$36);
            dun $$39 = $$4.a($$37, $$36, false);
            if ($$39 != null && (!$$2 || !$$39.s())) {
               for (ja $$40 : ja.b($$38.d(), $$3.I_(), $$38.e(), $$38.f(), $$3.am() - 1, $$38.g())) {
                  $$4.a($$40);
               }
            }
         }
      }

      a.debug("blockChanged took " + (System.currentTimeMillis() - $$35) + " ms");
      long $$41 = System.currentTimeMillis() - $$17;
      $$0.a(
         () -> wu.b(
               String.format(
                  Locale.ROOT, "%d chunks have been reset. This took %d ms for %d chunks, or %02f ms per chunk", $$18, $$41, $$18, (float)$$41 / (float)$$18
               )
            ),
         true
      );
      return 1;
   }
}
