import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ams {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wx.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wx.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     ef.a("add")
                        .then(
                           ((RequiredArgumentBuilder)ef.a("from", gb.a())
                                 .executes($$0x -> a((ee)$$0x.getSource(), gb.a($$0x, "from"), gb.a($$0x, "from"), true)))
                              .then(ef.a("to", gb.a()).executes($$0x -> a((ee)$$0x.getSource(), gb.a($$0x, "from"), gb.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)ef.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)ef.a("from", gb.a())
                                 .executes($$0x -> a((ee)$$0x.getSource(), gb.a($$0x, "from"), gb.a($$0x, "from"), false)))
                              .then(ef.a("to", gb.a()).executes($$0x -> a((ee)$$0x.getSource(), gb.a($$0x, "from"), gb.a($$0x, "to"), false)))
                        ))
                     .then(ef.a("all").executes($$0x -> b((ee)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)ef.a("query").executes($$0x -> a((ee)$$0x.getSource())))
                  .then(ef.a("pos", gb.a()).executes($$0x -> a((ee)$$0x.getSource(), gb.a($$0x, "pos"))))
            )
      );
   }

   private static int a(ee $$0, aqd $$1) throws CommandSyntaxException {
      dag $$2 = $$1.a();
      aqn $$3 = $$0.e();
      akm<daz> $$4 = $$3.ae();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> wx.a("commands.forceload.query.success", wx.a($$2), wx.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(ee $$0) {
      aqn $$1 = $$0.e();
      akm<daz> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(dag::new).map(dag::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> wx.a("commands.forceload.list.single", wx.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> wx.a("commands.forceload.list.multiple", $$4, wx.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(wx.a("commands.forceload.added.none", wx.a($$2.a())));
      }

      return $$4;
   }

   private static int b(ee $$0) {
      aqn $$1 = $$0.e();
      akm<daz> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(dag.a($$1x), dag.b($$1x), false));
      $$0.a(() -> wx.a("commands.forceload.removed.all", wx.a($$2.a())), true);
      return 0;
   }

   private static int a(ee $$0, aqd $$1, aqd $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = jq.a($$4);
         int $$9 = jq.a($$5);
         int $$10 = jq.a($$6);
         int $$11 = jq.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            aqn $$13 = $$0.e();
            akm<daz> $$14 = $$13.ae();
            dag $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new dag($$17, $$18);
                     }
                  }
               }
            }

            dag $$20 = $$15;
            if ($$16 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$16 == 1) {
                  $$0.a(() -> wx.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", wx.a($$20), wx.a($$14.a())), true);
               } else {
                  dag $$21 = new dag($$8, $$9);
                  dag $$22 = new dag($$10, $$11);
                  $$0.a(() -> wx.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", wx.a($$20), wx.a($$14.a()), wx.a($$21), wx.a($$22)), true);
               }

               return $$16;
            }
         }
      } else {
         throw ga.b.create();
      }
   }
}
