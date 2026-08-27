import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class agu {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> tf.a("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> tf.a("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(tf.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(tf.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     ds.a("add")
                        .then(
                           ((RequiredArgumentBuilder)ds.a("from", fj.a())
                                 .executes($$0x -> a((dr)$$0x.getSource(), fj.a($$0x, "from"), fj.a($$0x, "from"), true)))
                              .then(ds.a("to", fj.a()).executes($$0x -> a((dr)$$0x.getSource(), fj.a($$0x, "from"), fj.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)ds.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)ds.a("from", fj.a())
                                 .executes($$0x -> a((dr)$$0x.getSource(), fj.a($$0x, "from"), fj.a($$0x, "from"), false)))
                              .then(ds.a("to", fj.a()).executes($$0x -> a((dr)$$0x.getSource(), fj.a($$0x, "from"), fj.a($$0x, "to"), false)))
                        ))
                     .then(ds.a("all").executes($$0x -> b((dr)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)ds.a("query").executes($$0x -> a((dr)$$0x.getSource())))
                  .then(ds.a("pos", fj.a()).executes($$0x -> a((dr)$$0x.getSource(), fj.a($$0x, "pos"))))
            )
      );
   }

   private static int a(dr $$0, aka $$1) throws CommandSyntaxException {
      cos $$2 = $$1.a();
      akk $$3 = $$0.e();
      aeq<cpl> $$4 = $$3.ac();
      boolean $$5 = $$3.u().contains($$2.a());
      if ($$5) {
         $$0.a(() -> tf.a("commands.forceload.query.success", $$2, $$4.a()), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(dr $$0) {
      akk $$1 = $$0.e();
      aeq<cpl> $$2 = $$1.ac();
      LongSet $$3 = $$1.u();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(cos::new).map(cos::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> tf.a("commands.forceload.list.single", $$2.a(), $$5), false);
         } else {
            $$0.a(() -> tf.a("commands.forceload.list.multiple", $$4, $$2.a(), $$5), false);
         }
      } else {
         $$0.b(tf.a("commands.forceload.added.none", $$2.a()));
      }

      return $$4;
   }

   private static int b(dr $$0) {
      akk $$1 = $$0.e();
      aeq<cpl> $$2 = $$1.ac();
      LongSet $$3 = $$1.u();
      $$3.forEach($$1x -> $$1.a(cos.a($$1x), cos.b($$1x), false));
      $$0.a(() -> tf.a("commands.forceload.removed.all", $$2.a()), true);
      return 0;
   }

   private static int a(dr $$0, aka $$1, aka $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = hx.a($$4);
         int $$9 = hx.a($$5);
         int $$10 = hx.a($$6);
         int $$11 = hx.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            akk $$13 = $$0.e();
            aeq<cpl> $$14 = $$13.ac();
            cos $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new cos($$17, $$18);
                     }
                  }
               }
            }

            cos $$20 = $$15;
            if ($$16 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$16 == 1) {
                  $$0.a(() -> tf.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", $$20, $$14.a()), true);
               } else {
                  cos $$21 = new cos($$8, $$9);
                  cos $$22 = new cos($$10, $$11);
                  $$0.a(() -> tf.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$20, $$14.a(), $$21, $$22), true);
               }

               return $$16;
            }
         }
      } else {
         throw fi.b.create();
      }
   }
}
