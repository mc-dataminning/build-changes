import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ans {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xl.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xl.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xl.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xl.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     ex.a("add")
                        .then(
                           ((RequiredArgumentBuilder)ex.a("from", gt.a())
                                 .executes($$0x -> a((ew)$$0x.getSource(), gt.a($$0x, "from"), gt.a($$0x, "from"), true)))
                              .then(ex.a("to", gt.a()).executes($$0x -> a((ew)$$0x.getSource(), gt.a($$0x, "from"), gt.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)ex.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)ex.a("from", gt.a())
                                 .executes($$0x -> a((ew)$$0x.getSource(), gt.a($$0x, "from"), gt.a($$0x, "from"), false)))
                              .then(ex.a("to", gt.a()).executes($$0x -> a((ew)$$0x.getSource(), gt.a($$0x, "from"), gt.a($$0x, "to"), false)))
                        ))
                     .then(ex.a("all").executes($$0x -> b((ew)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)ex.a("query").executes($$0x -> a((ew)$$0x.getSource())))
                  .then(ex.a("pos", gt.a()).executes($$0x -> a((ew)$$0x.getSource(), gt.a($$0x, "pos"))))
            )
      );
   }

   private static int a(ew $$0, ard $$1) throws CommandSyntaxException {
      del $$2 = $$1.a();
      arq $$3 = $$0.e();
      alk<dff> $$4 = $$3.ag();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> xl.a("commands.forceload.query.success", xl.a($$2), xl.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(ew $$0) {
      arq $$1 = $$0.e();
      alk<dff> $$2 = $$1.ag();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(del::new).map(del::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> xl.a("commands.forceload.list.single", xl.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> xl.a("commands.forceload.list.multiple", $$4, xl.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(xl.a("commands.forceload.added.none", xl.a($$2.a())));
      }

      return $$4;
   }

   private static int b(ew $$0) {
      arq $$1 = $$0.e();
      alk<dff> $$2 = $$1.ag();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(del.a($$1x), del.b($$1x), false));
      $$0.a(() -> xl.a("commands.forceload.removed.all", xl.a($$2.a())), true);
      return 0;
   }

   private static int a(ew $$0, ard $$1, ard $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = kj.a($$4);
         int $$9 = kj.a($$5);
         int $$10 = kj.a($$6);
         int $$11 = kj.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            arq $$13 = $$0.e();
            alk<dff> $$14 = $$13.ag();
            del $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new del($$17, $$18);
                     }
                  }
               }
            }

            del $$20 = $$15;
            int $$21 = $$16;
            if ($$21 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$21 == 1) {
                  $$0.a(() -> xl.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", xl.a($$20), xl.a($$14.a())), true);
               } else {
                  del $$22 = new del($$8, $$9);
                  del $$23 = new del($$10, $$11);
                  $$0.a(() -> xl.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$21, xl.a($$14.a()), xl.a($$22), xl.a($$23)), true);
               }

               return $$21;
            }
         }
      } else {
         throw gs.b.create();
      }
   }
}
