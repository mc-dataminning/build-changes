import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ais {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tl.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tl.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)du.a("entity", eq.a($$1, jc.s))
                     .suggests(gm.d)
                     .executes($$0x -> b((dt)$$0x.getSource(), eq.e($$0x, "entity"), ((dt)$$0x.getSource()).d(), new qw(), true)))
                  .then(
                     ((RequiredArgumentBuilder)du.a("pos", fr.a())
                           .executes($$0x -> b((dt)$$0x.getSource(), eq.e($$0x, "entity"), fr.a($$0x, "pos"), new qw(), true)))
                        .then(du.a("nbt", eb.a()).executes($$0x -> b((dt)$$0x.getSource(), eq.e($$0x, "entity"), fr.a($$0x, "pos"), eb.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static biq a(dt $$0, he.c<biu<?>> $$1, ehn $$2, qw $$3, boolean $$4) throws CommandSyntaxException {
      gw $$5 = gw.a($$2);
      if (!cpv.k($$5)) {
         throw c.create();
      } else {
         qw $$6 = $$3.h();
         $$6.a("id", $$1.g().a().toString());
         akq $$7 = $$0.e();
         biq $$8 = biu.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dB(), $$1x.dD());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bji) {
               ((bji)$$8).a($$0.e(), $$0.e().d_($$8.dl()), bjk.n, null, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(dt $$0, he.c<biu<?>> $$1, ehn $$2, qw $$3, boolean $$4) throws CommandSyntaxException {
      biq $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> tl.a("commands.summon.success", $$5.N_()), true);
      return 1;
   }
}
