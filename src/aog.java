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

public class aog {
   private static final Logger a = LogUtils.getLogger();

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("resetchunks").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ep)$$0x.getSource(), 0, true)))
            .then(
               ((RequiredArgumentBuilder)eq.a("range", IntegerArgumentType.integer(0, 5))
                     .executes($$0x -> a((ep)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), true)))
                  .then(
                     eq.a("skipOldChunks", BoolArgumentType.bool())
                        .executes(
                           $$0x -> a((ep)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), BoolArgumentType.getBool($$0x, "skipOldChunks"))
                        )
                  )
            )
      );
   }

   private static int a(ep $$0, int $$1, boolean $$2) {
      arb $$3 = $$0.e();
      aqz $$4 = $$3.l();
      $$4.a.d();
      evm $$5 = $$0.d();
      dba $$6 = new dba(iz.a($$5));
      int $$7 = $$6.f - $$1;
      int $$8 = $$6.f + $$1;
      int $$9 = $$6.e - $$1;
      int $$10 = $$6.e + $$1;

      for (int $$11 = $$7; $$11 <= $$8; $$11++) {
         for (int $$12 = $$9; $$12 <= $$10; $$12++) {
            dba $$13 = new dba($$12, $$11);
            dud $$14 = $$4.a($$12, $$11, false);
            if ($$14 != null && (!$$2 || !$$14.s())) {
               for (iz $$15 : iz.b($$13.d(), $$3.I_(), $$13.e(), $$13.f(), $$3.am() - 1, $$13.g())) {
                  $$3.a($$15, dew.a.n(), 16);
               }
            }
         }
      }

      bpi<Runnable> $$16 = bpi.a(ac.g(), "worldgen-resetchunks");
      long $$17 = System.currentTimeMillis();
      int $$18 = ($$1 * 2 + 1) * ($$1 * 2 + 1);
      UnmodifiableIterator var34 = ImmutableList.of(dus.f, dus.g, dus.h, dus.i, dus.j, dus.k).iterator();

      while (var34.hasNext()) {
         dus $$19 = (dus)var34.next();
         long $$20 = System.currentTimeMillis();
         CompletableFuture<Unit> $$21 = CompletableFuture.supplyAsync(() -> Unit.INSTANCE, $$16::a);
         duw $$22 = new duw($$3, $$4.g(), $$3.q(), $$4.a());

         for (int $$23 = $$6.f - $$1; $$23 <= $$6.f + $$1; $$23++) {
            for (int $$24 = $$6.e - $$1; $$24 <= $$6.e + $$1; $$24++) {
               dba $$25 = new dba($$24, $$23);
               dud $$26 = $$4.a($$24, $$23, false);
               if ($$26 != null && (!$$2 || !$$26.s())) {
                  List<dtt> $$27 = Lists.newArrayList();
                  int $$28 = Math.max(1, $$19.e());

                  for (int $$29 = $$25.f - $$28; $$29 <= $$25.f + $$28; $$29++) {
                     for (int $$30 = $$25.e - $$28; $$30 <= $$25.e + $$28; $$30++) {
                        dtt $$31 = $$4.a($$30, $$29, $$19.d(), true);
                        dtt $$32;
                        if ($$31 instanceof duc) {
                           $$32 = new duc(((duc)$$31).C(), true);
                        } else if ($$31 instanceof dud) {
                           $$32 = new duc((dud)$$31, true);
                        } else {
                           $$32 = $$31;
                        }

                        $$27.add($$32);
                     }
                  }

                  $$21 = $$21.thenComposeAsync($$4x -> $$19.a($$22, $$16::a, $$0xx -> {
                        throw new UnsupportedOperationException("Not creating full chunks here");
                     }, $$27).thenApply($$1xx -> {
                        if ($$19 == dus.g) {
                           dxp.a($$1xx, dus.b);
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
            dba $$38 = new dba($$37, $$36);
            dud $$39 = $$4.a($$37, $$36, false);
            if ($$39 != null && (!$$2 || !$$39.s())) {
               for (iz $$40 : iz.b($$38.d(), $$3.I_(), $$38.e(), $$38.f(), $$3.am() - 1, $$38.g())) {
                  $$4.a($$40);
               }
            }
         }
      }

      a.debug("blockChanged took " + (System.currentTimeMillis() - $$35) + " ms");
      long $$41 = System.currentTimeMillis() - $$17;
      $$0.a(
         () -> xl.b(
               String.format(
                  Locale.ROOT, "%d chunks have been reset. This took %d ms for %d chunks, or %02f ms per chunk", $$18, $$41, $$18, (float)$$41 / (float)$$18
               )
            ),
         true
      );
      return 1;
   }
}
