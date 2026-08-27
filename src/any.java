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

public class any {
   private static final Logger a = LogUtils.getLogger();

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("resetchunks").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((eh)$$0x.getSource(), 0, true)))
            .then(
               ((RequiredArgumentBuilder)ei.a("range", IntegerArgumentType.integer(0, 5))
                     .executes($$0x -> a((eh)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), true)))
                  .then(
                     ei.a("skipOldChunks", BoolArgumentType.bool())
                        .executes(
                           $$0x -> a((eh)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "range"), BoolArgumentType.getBool($$0x, "skipOldChunks"))
                        )
                  )
            )
      );
   }

   private static int a(eh $$0, int $$1, boolean $$2) {
      aqt $$3 = $$0.e();
      aqr $$4 = $$3.l();
      $$4.a.d();
      ewu $$5 = $$0.d();
      dbh $$6 = new dbh(ir.a($$5));
      int $$7 = $$6.f - $$1;
      int $$8 = $$6.f + $$1;
      int $$9 = $$6.e - $$1;
      int $$10 = $$6.e + $$1;

      for (int $$11 = $$7; $$11 <= $$8; $$11++) {
         for (int $$12 = $$9; $$12 <= $$10; $$12++) {
            dbh $$13 = new dbh($$12, $$11);
            dvi $$14 = $$4.a($$12, $$11, false);
            if ($$14 != null && (!$$2 || !$$14.t())) {
               for (ir $$15 : ir.b($$13.d(), $$3.J_(), $$13.e(), $$13.f(), $$3.am() - 1, $$13.g())) {
                  $$3.a($$15, dfe.a.n(), 16);
               }
            }
         }
      }

      bot<Runnable> $$16 = bot.a(ad.f(), "worldgen-resetchunks");
      long $$17 = System.currentTimeMillis();
      int $$18 = ($$1 * 2 + 1) * ($$1 * 2 + 1);
      UnmodifiableIterator var34 = ImmutableList.of(dvx.f, dvx.g, dvx.h, dvx.i, dvx.j, dvx.k).iterator();

      while (var34.hasNext()) {
         dvx $$19 = (dvx)var34.next();
         long $$20 = System.currentTimeMillis();
         CompletableFuture<Unit> $$21 = CompletableFuture.supplyAsync(() -> Unit.INSTANCE, $$16::a);
         dwb $$22 = new dwb($$3, $$4.g(), $$3.q(), $$4.a());

         for (int $$23 = $$6.f - $$1; $$23 <= $$6.f + $$1; $$23++) {
            for (int $$24 = $$6.e - $$1; $$24 <= $$6.e + $$1; $$24++) {
               dbh $$25 = new dbh($$24, $$23);
               dvi $$26 = $$4.a($$24, $$23, false);
               if ($$26 != null && (!$$2 || !$$26.t())) {
                  List<duy> $$27 = Lists.newArrayList();
                  int $$28 = Math.max(1, $$19.e());

                  for (int $$29 = $$25.f - $$28; $$29 <= $$25.f + $$28; $$29++) {
                     for (int $$30 = $$25.e - $$28; $$30 <= $$25.e + $$28; $$30++) {
                        duy $$31 = $$4.a($$30, $$29, $$19.d(), true);
                        duy $$32;
                        if ($$31 instanceof dvh) {
                           $$32 = new dvh(((dvh)$$31).D(), true);
                        } else if ($$31 instanceof dvi) {
                           $$32 = new dvh((dvi)$$31, true);
                        } else {
                           $$32 = $$31;
                        }

                        $$27.add($$32);
                     }
                  }

                  $$21 = $$21.thenComposeAsync($$4x -> $$19.a($$22, $$16::a, $$0xx -> {
                        throw new UnsupportedOperationException("Not creating full chunks here");
                     }, $$27).thenApply($$1xx -> {
                        if ($$19 == dvx.g) {
                           dyu.a($$1xx, dvx.b);
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
            dbh $$38 = new dbh($$37, $$36);
            dvi $$39 = $$4.a($$37, $$36, false);
            if ($$39 != null && (!$$2 || !$$39.t())) {
               for (ir $$40 : ir.b($$38.d(), $$3.J_(), $$38.e(), $$38.f(), $$3.am() - 1, $$38.g())) {
                  $$4.a($$40);
               }
            }
         }
      }

      a.debug("blockChanged took " + (System.currentTimeMillis() - $$35) + " ms");
      long $$41 = System.currentTimeMillis() - $$17;
      $$0.a(
         () -> xe.b(
               String.format(
                  Locale.ROOT, "%d chunks have been reset. This took %d ms for %d chunks, or %02f ms per chunk", $$18, $$41, $$18, (float)$$41 / (float)$$18
               )
            ),
         true
      );
      return 1;
   }
}
