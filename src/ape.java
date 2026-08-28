import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ape {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xp.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xp.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)eq.a("entity", fo.a($$1, lq.v))
                     .suggests(io.d)
                     .executes($$0x -> b((ep)$$0x.getSource(), fo.e($$0x, "entity"), ((ep)$$0x.getSource()).d(), new us(), true)))
                  .then(
                     ((RequiredArgumentBuilder)eq.a("pos", gs.a())
                           .executes($$0x -> b((ep)$$0x.getSource(), fo.e($$0x, "entity"), gs.a($$0x, "pos"), new us(), true)))
                        .then(eq.a("nbt", ez.a()).executes($$0x -> b((ep)$$0x.getSource(), fo.e($$0x, "entity"), gs.a($$0x, "pos"), ez.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bsu a(ep $$0, ji.c<bta<?>> $$1, evr $$2, us $$3, boolean $$4) throws CommandSyntaxException {
      iz $$5 = iz.a($$2);
      if (!dby.l($$5)) {
         throw c.create();
      } else {
         us $$6 = $$3.i();
         $$6.a("id", $$1.h().a().toString());
         arf $$7 = $$0.e();
         bsu $$8 = bta.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dF(), $$1x.dH());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof btr) {
               ((btr)$$8).a($$0.e(), $$0.e().d_($$8.dp()), btt.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ep $$0, ji.c<bta<?>> $$1, evr $$2, us $$3, boolean $$4) throws CommandSyntaxException {
      bsu $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> xp.a("commands.summon.success", $$5.O_()), true);
      return 1;
   }
}
