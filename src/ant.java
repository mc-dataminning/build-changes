import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ant {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wi.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dw.a("entity", eu.a($$1, ku.v))
                     .suggests(ht.d)
                     .executes($$0x -> b((dv)$$0x.getSource(), eu.e($$0x, "entity"), ((dv)$$0x.getSource()).d(), new to(), true)))
                  .then(
                     ((RequiredArgumentBuilder)dw.a("pos", fx.a())
                           .executes($$0x -> b((dv)$$0x.getSource(), eu.e($$0x, "entity"), fx.a($$0x, "pos"), new to(), true)))
                        .then(dw.a("nbt", ef.a()).executes($$0x -> b((dv)$$0x.getSource(), eu.e($$0x, "entity"), fx.a($$0x, "pos"), ef.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bqa a(dv $$0, in.c<bqg<?>> $$1, esj $$2, to $$3, boolean $$4) throws CommandSyntaxException {
      id $$5 = id.a($$2);
      if (!czg.l($$5)) {
         throw c.create();
      } else {
         to $$6 = $$3.h();
         $$6.a("id", $$1.h().a().toString());
         apu $$7 = $$0.e();
         bqa $$8 = bqg.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dC(), $$1x.dE());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bqv) {
               ((bqv)$$8).a($$0.e(), $$0.e().d_($$8.dm()), bqx.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(dv $$0, in.c<bqg<?>> $$1, esj $$2, to $$3, boolean $$4) throws CommandSyntaxException {
      bqa $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> wi.a("commands.summon.success", $$5.O_()), true);
      return 1;
   }
}
