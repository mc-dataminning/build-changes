import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class any {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xg.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xg.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xg.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xg.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     el.a("add")
                        .then(
                           ((RequiredArgumentBuilder)el.a("from", gi.a())
                                 .executes($$0x -> a((ek)$$0x.getSource(), gi.a($$0x, "from"), gi.a($$0x, "from"), true)))
                              .then(el.a("to", gi.a()).executes($$0x -> a((ek)$$0x.getSource(), gi.a($$0x, "from"), gi.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)el.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)el.a("from", gi.a())
                                 .executes($$0x -> a((ek)$$0x.getSource(), gi.a($$0x, "from"), gi.a($$0x, "from"), false)))
                              .then(el.a("to", gi.a()).executes($$0x -> a((ek)$$0x.getSource(), gi.a($$0x, "from"), gi.a($$0x, "to"), false)))
                        ))
                     .then(el.a("all").executes($$0x -> b((ek)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)el.a("query").executes($$0x -> a((ek)$$0x.getSource())))
                  .then(el.a("pos", gi.a()).executes($$0x -> a((ek)$$0x.getSource(), gi.a($$0x, "pos"))))
            )
      );
   }

   private static int a(ek $$0, arm $$1) throws CommandSyntaxException {
      djo $$2 = $$1.a();
      asb $$3 = $$0.e();
      alq<dkj> $$4 = $$3.aj();
      boolean $$5 = $$3.y().contains($$2.a());
      if ($$5) {
         $$0.a(() -> xg.a("commands.forceload.query.success", xg.a($$2), xg.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(ek $$0) {
      asb $$1 = $$0.e();
      alq<dkj> $$2 = $$1.aj();
      LongSet $$3 = $$1.y();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(djo::new).map(djo::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> xg.a("commands.forceload.list.single", xg.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> xg.a("commands.forceload.list.multiple", $$4, xg.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(xg.a("commands.forceload.added.none", xg.a($$2.a())));
      }

      return $$4;
   }

   private static int b(ek $$0) {
      asb $$1 = $$0.e();
      alq<dkj> $$2 = $$1.aj();
      LongSet $$3 = $$1.y();
      $$3.forEach($$1x -> $$1.a(djo.a($$1x), djo.b($$1x), false));
      $$0.a(() -> xg.a("commands.forceload.removed.all", xg.a($$2.a())), true);
      return 0;
   }

   private static int a(ek $$0, arm $$1, arm $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = jz.a($$4);
         int $$9 = jz.a($$5);
         int $$10 = jz.a($$6);
         int $$11 = jz.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            asb $$13 = $$0.e();
            alq<dkj> $$14 = $$13.aj();
            djo $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new djo($$17, $$18);
                     }
                  }
               }
            }

            djo $$20 = $$15;
            int $$21 = $$16;
            if ($$21 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$21 == 1) {
                  $$0.a(() -> xg.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", xg.a($$20), xg.a($$14.a())), true);
               } else {
                  djo $$22 = new djo($$8, $$9);
                  djo $$23 = new djo($$10, $$11);
                  $$0.a(() -> xg.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$21, xg.a($$14.a()), xg.a($$22), xg.a($$23)), true);
               }

               return $$21;
            }
         }
      } else {
         throw gh.b.create();
      }
   }
}
