import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class anr {
   private static final int a = 256;
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xc.b("commands.forceload.toobig", $$0, $$1));
   private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> xc.b("commands.forceload.query.failure", $$0, $$1));
   private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(xc.c("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xc.c("commands.forceload.removed.failure"));

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

   private static int a(ek $$0, arf $$1) throws CommandSyntaxException {
      dje $$2 = $$1.a();
      aru $$3 = $$0.e();
      alj<djz> $$4 = $$3.aj();
      boolean $$5 = $$3.y().contains($$2.a());
      if ($$5) {
         $$0.a(() -> xc.a("commands.forceload.query.success", xc.a($$2), xc.a($$4.a())), false);
         return 1;
      } else {
         throw c.create($$2, $$4.a());
      }
   }

   private static int a(ek $$0) {
      aru $$1 = $$0.e();
      alj<djz> $$2 = $$1.aj();
      LongSet $$3 = $$1.y();
      int $$4 = $$3.size();
      if ($$4 > 0) {
         String $$5 = Joiner.on(", ").join($$3.stream().sorted().map(dje::new).map(dje::toString).iterator());
         if ($$4 == 1) {
            $$0.a(() -> xc.a("commands.forceload.list.single", xc.a($$2.a()), $$5), false);
         } else {
            $$0.a(() -> xc.a("commands.forceload.list.multiple", $$4, xc.a($$2.a()), $$5), false);
         }
      } else {
         $$0.b(xc.a("commands.forceload.added.none", xc.a($$2.a())));
      }

      return $$4;
   }

   private static int b(ek $$0) {
      aru $$1 = $$0.e();
      alj<djz> $$2 = $$1.aj();
      LongSet $$3 = $$1.y();
      $$3.forEach($$1x -> $$1.a(dje.a($$1x), dje.b($$1x), false));
      $$0.a(() -> xc.a("commands.forceload.removed.all", xc.a($$2.a())), true);
      return 0;
   }

   private static int a(ek $$0, arf $$1, arf $$2, boolean $$3) throws CommandSyntaxException {
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
            aru $$13 = $$0.e();
            alj<djz> $$14 = $$13.aj();
            dje $$15 = null;
            int $$16 = 0;

            for (int $$17 = $$8; $$17 <= $$10; $$17++) {
               for (int $$18 = $$9; $$18 <= $$11; $$18++) {
                  boolean $$19 = $$13.a($$17, $$18, $$3);
                  if ($$19) {
                     $$16++;
                     if ($$15 == null) {
                        $$15 = new dje($$17, $$18);
                     }
                  }
               }
            }

            dje $$20 = $$15;
            int $$21 = $$16;
            if ($$21 == 0) {
               throw ($$3 ? d : e).create();
            } else {
               if ($$21 == 1) {
                  $$0.a(() -> xc.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", xc.a($$20), xc.a($$14.a())), true);
               } else {
                  dje $$22 = new dje($$8, $$9);
                  dje $$23 = new dje($$10, $$11);
                  $$0.a(() -> xc.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$21, xc.a($$14.a()), xc.a($$22), xc.a($$23)), true);
               }

               return $$21;
            }
         }
      } else {
         throw gh.b.create();
      }
   }
}
