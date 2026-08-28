import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class anl {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xe.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xe.c("commands.forceload.removed.failure"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("forceload").requires($$0x -> $$0x.c(2)))
                  .then(
                     ev.a("add")
                        .then(
                           ((RequiredArgumentBuilder)ev.a("from", gr.a())
                                 .executes($$0x -> a((eu)$$0x.getSource(), gr.a($$0x, "from"), gr.a($$0x, "from"), true)))
                              .then(ev.a("to", gr.a()).executes($$0x -> a((eu)$$0x.getSource(), gr.a($$0x, "from"), gr.a($$0x, "to"), true)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)ev.a("remove")
                        .then(
                           ((RequiredArgumentBuilder)ev.a("from", gr.a())
                                 .executes($$0x -> a((eu)$$0x.getSource(), gr.a($$0x, "from"), gr.a($$0x, "from"), false)))
                              .then(ev.a("to", gr.a()).executes($$0x -> a((eu)$$0x.getSource(), gr.a($$0x, "from"), gr.a($$0x, "to"), false)))
                        ))
                     .then(ev.a("all").executes($$0x -> b((eu)$$0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)ev.a("query").executes($$0x -> a((eu)$$0x.getSource())))
                  .then(ev.a("pos", gr.a()).executes($$0x -> a((eu)$$0x.getSource(), gr.a($$0x, "pos"))))
            )
      );
   }

   private static int a(eu $$0, aqw $$1) throws CommandSyntaxException {
      ddp $$2 = $$1.a();
      arj $$3 = $$0.e();
      ald<dej> $$4 = $$3.ag();
      boolean $$5 = $$3.w().contains($$2.a());
      if ($$5) {
         $$0.a(() -> xe.a("commands.forceload.query.success", xe.a($$2), xe.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(eu $$0) {
      arj $$1 = $$0.e();
      ald<dej> $$2 = $$1.ag();
      LongSet $$3 = $$1.w();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(ddp::new).map(ddp::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> xe.a("commands.forceload.list.single", xe.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> xe.a("commands.forceload.list.multiple", $$4, xe.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(xe.a("commands.forceload.added.none", xe.a($$2.a())));
      }

      return $$4;
   }

   private static int b(eu $$0) {
      arj $$1 = $$0.e();
      ald<dej> $$2 = $$1.ag();
      LongSet $$3 = $$1.w();
      $$3.forEach($$1x -> $$1.a(ddp.a($$1x), ddp.b($$1x), false));
      $$0.a(() -> xe.a("commands.forceload.removed.all", xe.a($$2.a())), true);
      return 0;
   }

   private static int a(eu $$0, aqw $$1, aqw $$2, boolean $$3) throws CommandSyntaxException {
      int $$4 = Math.min($$1.c(), $$2.c());
      int $$5 = Math.min($$1.d(), $$2.d());
      int $$6 = Math.max($$1.c(), $$2.c());
      int $$7 = Math.max($$1.d(), $$2.d());
      if ($$4 >= -30000000 && $$5 >= -30000000 && $$6 < 30000000 && $$7 < 30000000) {
         int $$8 = kh.a($$4);
         int $$9 = kh.a($$5);
         int $$10 = kh.a($$6);
         int $$11 = kh.a($$7);
         long $$12 = ((long)($$10 - $$8) + 1L) * ((long)($$11 - $$9) + 1L);
         if ($$12 > 256L) {
            throw b.create(256, $$12);
         } else {
            arj $$13 = $$0.e();
            ald<dej> $$14 = $$13.ag();
            ddp $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new ddp($$17, $$18);
                     }
                  }
               }
            }

            ddp $$20 = $$15;
            int $$21 = $$16;
            if ($$21 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$21 == 1) {
                  $$0.a(() -> xe.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", xe.a($$20), xe.a($$14.a())), true);
               } else {
                  ddp $$22 = new ddp($$8, $$9);
                  ddp $$23 = new ddp($$10, $$11);
                  $$0.a(() -> xe.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$21, xe.a($$14.a()), xe.a($$22), xe.a($$23)), true);
               }

               return $$21;
            }
         }
      } else {
         throw gq.b.create();
      }
   }
}
