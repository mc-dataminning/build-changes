import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aiu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tn.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tn.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tn.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)du.a("entity", eq.a($$1, je.s))
                     .suggests(gm.d)
                     .executes($$0x -> b((dt)$$0x.getSource(), eq.e($$0x, "entity"), ((dt)$$0x.getSource()).d(), new qy(), true)))
                  .then(
                     ((RequiredArgumentBuilder)du.a("pos", fr.a())
                           .executes($$0x -> b((dt)$$0x.getSource(), eq.e($$0x, "entity"), fr.a($$0x, "pos"), new qy(), true)))
                        .then(du.a("nbt", eb.a()).executes($$0x -> b((dt)$$0x.getSource(), eq.e($$0x, "entity"), fr.a($$0x, "pos"), eb.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bis a(dt $$0, hg.c<biw<?>> $$1, ehp $$2, qy $$3, boolean $$4) throws CommandSyntaxException {
      gw $$5 = gw.a($$2);
      if (!cpx.k($$5)) {
         throw c.create();
      } else {
         qy $$6 = $$3.h();
         $$6.a("id", $$1.g().a().toString());
         aks $$7 = $$0.e();
         bis $$8 = biw.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dB(), $$1x.dD());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bjk) {
               ((bjk)$$8).a($$0.e(), $$0.e().d_($$8.dl()), bjm.n, null, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(dt $$0, hg.c<biw<?>> $$1, ehp $$2, qy $$3, boolean $$4) throws CommandSyntaxException {
      bis $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> tn.a("commands.summon.success", $$5.N_()), true);
      return 1;
   }
}
