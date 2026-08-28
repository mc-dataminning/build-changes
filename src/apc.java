import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class apc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xd.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)eu.a("entity", fs.a($$1, lv.z))
                     .suggests(it.d)
                     .executes($$0x -> b((et)$$0x.getSource(), fs.e($$0x, "entity"), ((et)$$0x.getSource()).d(), new uf(), true)))
                  .then(
                     ((RequiredArgumentBuilder)eu.a("pos", gw.a())
                           .executes($$0x -> b((et)$$0x.getSource(), fs.e($$0x, "entity"), gw.a($$0x, "pos"), new uf(), true)))
                        .then(eu.a("nbt", fd.a()).executes($$0x -> b((et)$$0x.getSource(), fs.e($$0x, "entity"), gw.a($$0x, "pos"), fd.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bto a(et $$0, jn.c<btv<?>> $$1, eys $$2, uf $$3, boolean $$4) throws CommandSyntaxException {
      je $$5 = je.a((jx)$$2);
      if (!deg.l($$5)) {
         throw c.create();
      } else {
         uf $$6 = $$3.i();
         $$6.a("id", $$1.h().a().toString());
         arh $$7 = $$0.e();
         bto $$8 = btv.a($$6, $$7, btu.n, $$1x -> {
            $$1x.b($$2.d, $$2.e, $$2.f, $$1x.dI(), $$1x.dK());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bum) {
               ((bum)$$8).a($$0.e(), $$0.e().d_($$8.ds()), btu.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(et $$0, jn.c<btv<?>> $$1, eys $$2, uf $$3, boolean $$4) throws CommandSyntaxException {
      bto $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> xd.a("commands.summon.success", $$5.Q_()), true);
      return 1;
   }
}
