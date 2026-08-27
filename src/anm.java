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

public class anm {
   private static final Logger a = LogUtils.getLogger();

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("resetchunks").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ed)$$0x.getSource(), 0, true)))
            .then(
               ((RequiredArgumentBuilder)ee.a("range", IntegerArgumentType.integer(0, 5))
                     .executes($$0x -> a((ed)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), true)))
                  .then(
                     ee.a("skipOldChunks", BoolArgumentType.bool())
                        .executes(
                           $$0x -> a((ed)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), BoolArgumentType.getBool($$0x, "skipOldChunks"))
                        )
                  )
            )
      );
   }

   private static int a(ed $$0, int $$1, boolean $$2) {
      aqh $$3 = $$0.e();
      aqf $$4 = $$3.l();
      $$4.a.d();
      etp $$5 = $$0.d();
      czk $$6 = new czk(in.a($$5));
      int $$7 = $$6.f - $$1;
      int $$8 = $$6.f + $$1;
      int $$9 = $$6.e - $$1;
      int $$10 = $$6.e + $$1;

      for (int $$11 = $$7; $$11 <= $$8; $$11++) {
         for (int $$12 = $$9; $$12 <= $$10; $$12++) {
            czk $$13 = new czk($$12, $$11);
            dsn $$14 = $$4.a($$12, $$11, false);
            if ($$14 != null && (!$$2 || !$$14.s())) {
               for (in $$15 : in.b($$13.d(), $$3.I_(), $$13.e(), $$13.f(), $$3.al() - 1, $$13.g())) {
                  $$3.a($$15, ddg.a.n(), 16);
               }
            }
         }
      }

      bof<Runnable> $$16 = bof.a(ac.f(), "worldgen-resetchunks");
      long $$17 = System.currentTimeMillis();
      int $$18 = ($$1 * 2 + 1) * ($$1 * 2 + 1);
      UnmodifiableIterator var34 = ImmutableList.of(dtc.f, dtc.g, dtc.h, dtc.i, dtc.j, dtc.k).iterator();

      while (var34.hasNext()) {
         dtc $$19 = (dtc)var34.next();
         long $$20 = System.currentTimeMillis();
         CompletableFuture<Unit> $$21 = CompletableFuture.supplyAsync(() -> Unit.INSTANCE, $$16::a);
         dtg $$22 = new dtg($$3, $$4.g(), $$3.q(), $$4.a());

         for (int $$23 = $$6.f - $$1; $$23 <= $$6.f + $$1; $$23++) {
            for (int $$24 = $$6.e - $$1; $$24 <= $$6.e + $$1; $$24++) {
               czk $$25 = new czk($$24, $$23);
               dsn $$26 = $$4.a($$24, $$23, false);
               if ($$26 != null && (!$$2 || !$$26.s())) {
                  List<dsd> $$27 = Lists.newArrayList();
                  int $$28 = Math.max(1, $$19.e());

                  for (int $$29 = $$25.f - $$28; $$29 <= $$25.f + $$28; $$29++) {
                     for (int $$30 = $$25.e - $$28; $$30 <= $$25.e + $$28; $$30++) {
                        dsd $$31 = $$4.a($$30, $$29, $$19.d(), true);
                        dsd $$32;
                        if ($$31 instanceof dsm) {
                           $$32 = new dsm(((dsm)$$31).C(), true);
                        } else if ($$31 instanceof dsn) {
                           $$32 = new dsm((dsn)$$31, true);
                        } else {
                           $$32 = $$31;
                        }

                        $$27.add($$32);
                     }
                  }

                  $$21 = $$21.thenComposeAsync($$4x -> $$19.a($$22, $$16::a, $$0xx -> {
                        throw new UnsupportedOperationException("Not creating full chunks here");
                     }, $$27).thenApply($$1xx -> {
                        if ($$19 == dtc.g) {
                           dvz.a($$1xx, dtc.b);
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
            czk $$38 = new czk($$37, $$36);
            dsn $$39 = $$4.a($$37, $$36, false);
            if ($$39 != null && (!$$2 || !$$39.s())) {
               for (in $$40 : in.b($$38.d(), $$3.I_(), $$38.e(), $$38.f(), $$3.al() - 1, $$38.g())) {
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
