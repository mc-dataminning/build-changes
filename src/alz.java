import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class alz {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wi.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> wi.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(wi.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(wi.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     dw.a("add")
                        .then(
                           ((RequiredArgumentBuilder)dw.a("from", fr.a())
                                 .executes($$0x -> a((dv)$$0x.getSource(), fr.a($$0x, "from"), fr.a($$0x, "from"), true)))
                              .then(dw.a("to", fr.a()).executes($$0x -> a((dv)$$0x.getSource(), fr.a($$0x, "from"), fr.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)dw.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)dw.a("from", fr.a())
                                 .executes($$0x -> a((dv)$$0x.getSource(), fr.a($$0x, "from"), fr.a($$0x, "from"), false)))
                              .then(dw.a("to", fr.a()).executes($$0x -> a((dv)$$0x.getSource(), fr.a($$0x, "from"), fr.a($$0x, "to"), false)))
                        ))
                     .then(dw.a("all").executes($$0x -> b((dv)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)dw.a("query").executes($$0x -> a((dv)$$0x.getSource())))
                  .then(dw.a("pos", fr.a()).executes($$0x -> a((dv)$$0x.getSource(), fr.a($$0x, "pos"))))
            )
      );
   }

   private static int a(dv $$0, apk $$1) throws CommandSyntaxException {
      cyn $$2 = $$1.a();
      apu $$3 = $$0.e();
      aju<czg> $$4 = $$3.ae();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> wi.a("commands.forceload.query.success", wi.a($$2), wi.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(dv $$0) {
      apu $$1 = $$0.e();
      aju<czg> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(cyn::new).map(cyn::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> wi.a("commands.forceload.list.single", wi.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> wi.a("commands.forceload.list.multiple", $$4, wi.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(wi.a("commands.forceload.added.none", wi.a($$2.a())));
      }

      return $$4;
   }

   private static int b(dv $$0) {
      apu $$1 = $$0.e();
      aju<czg> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(cyn.a($$1x), cyn.b($$1x), false));
      $$0.a(() -> wi.a("commands.forceload.removed.all", wi.a($$2.a())), true);
      return 0;
   }

   private static int a(dv $$0, apk $$1, apk $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = jg.a($$4);
         int $$9 = jg.a($$5);
         int $$10 = jg.a($$6);
         int $$11 = jg.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            apu $$13 = $$0.e();
            aju<czg> $$14 = $$13.ae();
            cyn $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new cyn($$17, $$18);
                     }
                  }
               }
            }

            cyn $$20 = $$15;
            if ($$16 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$16 == 1) {
                  $$0.a(() -> wi.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", wi.a($$20), wi.a($$14.a())), true);
               } else {
                  cyn $$21 = new cyn($$8, $$9);
                  cyn $$22 = new cyn($$10, $$11);
                  $$0.a(() -> wi.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", wi.a($$20), wi.a($$14.a()), wi.a($$21), wi.a($$22)), true);
               }

               return $$16;
            }
         }
      } else {
         throw fq.b.create();
      }
   }
}
