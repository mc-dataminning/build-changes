import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class akj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(uv.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(uv.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(uv.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dv.a("entity", es.a($$1, kd.t))
                     .suggests(hn.d)
                     .executes($$0x -> b((du)$$0x.getSource(), es.e($$0x, "entity"), ((du)$$0x.getSource()).d(), new sd(), true)))
                  .then(
                     ((RequiredArgumentBuilder)dv.a("pos", ft.a())
                           .executes($$0x -> b((du)$$0x.getSource(), es.e($$0x, "entity"), ft.a($$0x, "pos"), new sd(), true)))
                        .then(dv.a("nbt", ed.a()).executes($$0x -> b((du)$$0x.getSource(), es.e($$0x, "entity"), ft.a($$0x, "pos"), ed.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bkv a(du $$0, ig.c<bkz<?>> $$1, ejz $$2, sd $$3, boolean $$4) throws CommandSyntaxException {
      hx $$5 = hx.a($$2);
      if (!csf.k($$5)) {
         throw c.create();
      } else {
         sd $$6 = $$3.h();
         $$6.a("id", $$1.g().a().toString());
         ami $$7 = $$0.e();
         bkv $$8 = bkz.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dD(), $$1x.dF());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bln) {
               ((bln)$$8).a($$0.e(), $$0.e().d_($$8.dn()), blp.n, null, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(du $$0, ig.c<bkz<?>> $$1, ejz $$2, sd $$3, boolean $$4) throws CommandSyntaxException {
      bkv $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> uv.a("commands.summon.success", $$5.Q_()), true);
      return 1;
   }
}
