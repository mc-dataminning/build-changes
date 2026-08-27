import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class amj {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> ws.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> ws.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(ws.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(ws.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     ed.a("add")
                        .then(
                           ((RequiredArgumentBuilder)ed.a("from", fy.a())
                                 .executes($$0x -> a((ec)$$0x.getSource(), fy.a($$0x, "from"), fy.a($$0x, "from"), true)))
                              .then(ed.a("to", fy.a()).executes($$0x -> a((ec)$$0x.getSource(), fy.a($$0x, "from"), fy.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)ed.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)ed.a("from", fy.a())
                                 .executes($$0x -> a((ec)$$0x.getSource(), fy.a($$0x, "from"), fy.a($$0x, "from"), false)))
                              .then(ed.a("to", fy.a()).executes($$0x -> a((ec)$$0x.getSource(), fy.a($$0x, "from"), fy.a($$0x, "to"), false)))
                        ))
                     .then(ed.a("all").executes($$0x -> b((ec)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)ed.a("query").executes($$0x -> a((ec)$$0x.getSource())))
                  .then(ed.a("pos", fy.a()).executes($$0x -> a((ec)$$0x.getSource(), fy.a($$0x, "pos"))))
            )
      );
   }

   private static int a(ec $$0, apu $$1) throws CommandSyntaxException {
      czb $$2 = $$1.a();
      aqe $$3 = $$0.e();
      ake<czu> $$4 = $$3.ae();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> ws.a("commands.forceload.query.success", ws.a($$2), ws.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(ec $$0) {
      aqe $$1 = $$0.e();
      ake<czu> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(czb::new).map(czb::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> ws.a("commands.forceload.list.single", ws.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> ws.a("commands.forceload.list.multiple", $$4, ws.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(ws.a("commands.forceload.added.none", ws.a($$2.a())));
      }

      return $$4;
   }

   private static int b(ec $$0) {
      aqe $$1 = $$0.e();
      ake<czu> $$2 = $$1.ae();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(czb.a($$1x), czb.b($$1x), false));
      $$0.a(() -> ws.a("commands.forceload.removed.all", ws.a($$2.a())), true);
      return 0;
   }

   private static int a(ec $$0, apu $$1, apu $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = jo.a($$4);
         int $$9 = jo.a($$5);
         int $$10 = jo.a($$6);
         int $$11 = jo.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            aqe $$13 = $$0.e();
            ake<czu> $$14 = $$13.ae();
            czb $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new czb($$17, $$18);
                     }
                  }
               }
            }

            czb $$20 = $$15;
            if ($$16 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$16 == 1) {
                  $$0.a(() -> ws.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", ws.a($$20), ws.a($$14.a())), true);
               } else {
                  czb $$21 = new czb($$8, $$9);
                  czb $$22 = new czb($$10, $$11);
                  $$0.a(() -> ws.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", ws.a($$20), ws.a($$14.a()), ws.a($$21), ws.a($$22)), true);
               }

               return $$16;
            }
         }
      } else {
         throw fx.b.create();
      }
   }
}
