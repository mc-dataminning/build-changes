import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class aha {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> tl.a("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> tl.a("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(tl.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(tl.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     du.a("add")
                        .then(
                           ((RequiredArgumentBuilder)du.a("from", fl.a())
                                 .executes($$0x -> a((dt)$$0x.getSource(), fl.a($$0x, "from"), fl.a($$0x, "from"), true)))
                              .then(du.a("to", fl.a()).executes($$0x -> a((dt)$$0x.getSource(), fl.a($$0x, "from"), fl.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)du.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)du.a("from", fl.a())
                                 .executes($$0x -> a((dt)$$0x.getSource(), fl.a($$0x, "from"), fl.a($$0x, "from"), false)))
                              .then(du.a("to", fl.a()).executes($$0x -> a((dt)$$0x.getSource(), fl.a($$0x, "from"), fl.a($$0x, "to"), false)))
                        ))
                     .then(du.a("all").executes($$0x -> b((dt)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)du.a("query").executes($$0x -> a((dt)$$0x.getSource())))
                  .then(du.a("pos", fl.a()).executes($$0x -> a((dt)$$0x.getSource(), fl.a($$0x, "pos"))))
            )
      );
   }

   private static int a(dt $$0, akh $$1) throws CommandSyntaxException {
      cpc $$2 = $$1.a();
      akr $$3 = $$0.e();
      aew<cpv> $$4 = $$3.ac();
      boolean $$5 = $$3.u().contains($$2.a());
      if ($$5) {
         $$0.a(() -> tl.a("commands.forceload.query.success", $$2, $$4.a()), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(dt $$0) {
      akr $$1 = $$0.e();
      aew<cpv> $$2 = $$1.ac();
      LongSet $$3 = $$1.u();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(cpc::new).map(cpc::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> tl.a("commands.forceload.list.single", $$2.a(), $$5), false);
         } else {
            $$0.a(() -> tl.a("commands.forceload.list.multiple", $$4, $$2.a(), $$5), false);
         }
      } else {
         $$0.b(tl.a("commands.forceload.added.none", $$2.a()));
      }

      return $$4;
   }

   private static int b(dt $$0) {
      akr $$1 = $$0.e();
      aew<cpv> $$2 = $$1.ac();
      LongSet $$3 = $$1.u();
      $$3.forEach($$1x -> $$1.a(cpc.a($$1x), cpc.b($$1x), false));
      $$0.a(() -> tl.a("commands.forceload.removed.all", $$2.a()), true);
      return 0;
   }

   private static int a(dt $$0, akh $$1, akh $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = hz.a($$4);
         int $$9 = hz.a($$5);
         int $$10 = hz.a($$6);
         int $$11 = hz.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            akr $$13 = $$0.e();
            aew<cpv> $$14 = $$13.ac();
            cpc $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new cpc($$17, $$18);
                     }
                  }
               }
            }

            cpc $$20 = $$15;
            if ($$16 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$16 == 1) {
                  $$0.a(() -> tl.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", $$20, $$14.a()), true);
               } else {
                  cpc $$21 = new cpc($$8, $$9);
                  cpc $$22 = new cpc($$10, $$11);
                  $$0.a(() -> tl.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$20, $$14.a(), $$21, $$22), true);
               }

               return $$16;
            }
         }
      } else {
         throw fk.b.create();
      }
   }
}
