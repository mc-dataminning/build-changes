import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ags {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> te.a("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> te.a("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(te.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(te.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     dt.a("add")
                        .then(
                           ((RequiredArgumentBuilder)dt.a("from", fk.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), fk.a($$0x, "from"), fk.a($$0x, "from"), true)))
                              .then(dt.a("to", fk.a()).executes($$0x -> a((ds)$$0x.getSource(), fk.a($$0x, "from"), fk.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)dt.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)dt.a("from", fk.a())
                                 .executes($$0x -> a((ds)$$0x.getSource(), fk.a($$0x, "from"), fk.a($$0x, "from"), false)))
                              .then(dt.a("to", fk.a()).executes($$0x -> a((ds)$$0x.getSource(), fk.a($$0x, "from"), fk.a($$0x, "to"), false)))
                        ))
                     .then(dt.a("all").executes($$0x -> b((ds)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)dt.a("query").executes($$0x -> a((ds)$$0x.getSource())))
                  .then(dt.a("pos", fk.a()).executes($$0x -> a((ds)$$0x.getSource(), fk.a($$0x, "pos"))))
            )
      );
   }

   private static int a(ds $$0, ajy $$1) throws CommandSyntaxException {
      cor $$2 = $$1.a();
      aki $$3 = $$0.e();
      aeo<cpk> $$4 = $$3.ac();
      boolean $$5 = $$3.u().contains($$2.a());
      if ($$5) {
         $$0.a(() -> te.a("commands.forceload.query.success", $$2, $$4.a()), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(ds $$0) {
      aki $$1 = $$0.e();
      aeo<cpk> $$2 = $$1.ac();
      LongSet $$3 = $$1.u();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(cor::new).map(cor::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> te.a("commands.forceload.list.single", $$2.a(), $$5), false);
         } else {
            $$0.a(() -> te.a("commands.forceload.list.multiple", $$4, $$2.a(), $$5), false);
         }
      } else {
         $$0.b(te.a("commands.forceload.added.none", $$2.a()));
      }

      return $$4;
   }

   private static int b(ds $$0) {
      aki $$1 = $$0.e();
      aeo<cpk> $$2 = $$1.ac();
      LongSet $$3 = $$1.u();
      $$3.forEach($$1x -> $$1.a(cor.a($$1x), cor.b($$1x), false));
      $$0.a(() -> te.a("commands.forceload.removed.all", $$2.a()), true);
      return 0;
   }

   private static int a(ds $$0, ajy $$1, ajy $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = hy.a($$4);
         int $$9 = hy.a($$5);
         int $$10 = hy.a($$6);
         int $$11 = hy.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            aki $$13 = $$0.e();
            aeo<cpk> $$14 = $$13.ac();
            cor $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new cor($$17, $$18);
                     }
                  }
               }
            }

            cor $$20 = $$15;
            if ($$16 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$16 == 1) {
                  $$0.a(() -> te.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", $$20, $$14.a()), true);
               } else {
                  cor $$21 = new cor($$8, $$9);
                  cor $$22 = new cor($$10, $$11);
                  $$0.a(() -> te.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$20, $$14.a(), $$21, $$22), true);
               }

               return $$16;
            }
         }
      } else {
         throw fj.b.create();
      }
   }
}
