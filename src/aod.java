import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aod {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ws.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ed.a("entity", fb.a($$1, ld.v))
                     .suggests(ia.d)
                     .executes($$0x -> b((ec)$$0x.getSource(), fb.e($$0x, "entity"), ((ec)$$0x.getSource()).d(), new ty(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ed.a("pos", ge.a())
                           .executes($$0x -> b((ec)$$0x.getSource(), fb.e($$0x, "entity"), ge.a($$0x, "pos"), new ty(), true)))
                        .then(ed.a("nbt", em.a()).executes($$0x -> b((ec)$$0x.getSource(), fb.e($$0x, "entity"), ge.a($$0x, "pos"), em.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bql a(ec $$0, iv.c<bqr<?>> $$1, etf $$2, ty $$3, boolean $$4) throws CommandSyntaxException {
      im $$5 = im.a($$2);
      if (!czu.l($$5)) {
         throw c.create();
      } else {
         ty $$6 = $$3.h();
         $$6.a("id", $$1.h().a().toString());
         aqe $$7 = $$0.e();
         bql $$8 = bqr.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dD(), $$1x.dF());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof brg) {
               ((brg)$$8).a($$0.e(), $$0.e().d_($$8.dn()), bri.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ec $$0, iv.c<bqr<?>> $$1, etf $$2, ty $$3, boolean $$4) throws CommandSyntaxException {
      bql $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> ws.a("commands.summon.success", $$5.O_()), true);
      return 1;
   }
}
