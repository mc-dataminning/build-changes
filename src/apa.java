import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class apa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xl.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)eq.a("entity", fo.a($$1, lq.v))
                     .suggests(io.d)
                     .executes($$0x -> b((ep)$$0x.getSource(), fo.e($$0x, "entity"), ((ep)$$0x.getSource()).d(), new ur(), true)))
                  .then(
                     ((RequiredArgumentBuilder)eq.a("pos", gs.a())
                           .executes($$0x -> b((ep)$$0x.getSource(), fo.e($$0x, "entity"), gs.a($$0x, "pos"), new ur(), true)))
                        .then(eq.a("nbt", ez.a()).executes($$0x -> b((ep)$$0x.getSource(), fo.e($$0x, "entity"), gs.a($$0x, "pos"), ez.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bsp a(ep $$0, ji.c<bsv<?>> $$1, evm $$2, ur $$3, boolean $$4) throws CommandSyntaxException {
      iz $$5 = iz.a($$2);
      if (!dbt.l($$5)) {
         throw c.create();
      } else {
         ur $$6 = $$3.h();
         $$6.a("id", $$1.h().a().toString());
         arb $$7 = $$0.e();
         bsp $$8 = bsv.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dF(), $$1x.dH());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof btm) {
               ((btm)$$8).a($$0.e(), $$0.e().d_($$8.dp()), bto.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ep $$0, ji.c<bsv<?>> $$1, evm $$2, ur $$3, boolean $$4) throws CommandSyntaxException {
      bsp $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> xl.a("commands.summon.success", $$5.O_()), true);
      return 1;
   }
}
