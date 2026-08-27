import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ale {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vf.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vf.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dt.a("entity", er.a($$1, ke.u))
                     .suggests(hn.d)
                     .executes($$0x -> b((ds)$$0x.getSource(), er.e($$0x, "entity"), ((ds)$$0x.getSource()).d(), new sn(), true)))
                  .then(
                     ((RequiredArgumentBuilder)dt.a("pos", ft.a())
                           .executes($$0x -> b((ds)$$0x.getSource(), er.e($$0x, "entity"), ft.a($$0x, "pos"), new sn(), true)))
                        .then(dt.a("nbt", ec.a()).executes($$0x -> b((ds)$$0x.getSource(), er.e($$0x, "entity"), ft.a($$0x, "pos"), ec.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static blv a(ds $$0, ih.c<blz<?>> $$1, elt $$2, sn $$3, boolean $$4) throws CommandSyntaxException {
      hx $$5 = hx.a($$2);
      if (!ctp.l($$5)) {
         throw c.create();
      } else {
         sn $$6 = $$3.h();
         $$6.a("id", $$1.g().a().toString());
         and $$7 = $$0.e();
         blv $$8 = blz.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dC(), $$1x.dE());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bmn) {
               ((bmn)$$8).a($$0.e(), $$0.e().d_($$8.dm()), bmp.n, null, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ds $$0, ih.c<blz<?>> $$1, elt $$2, sn $$3, boolean $$4) throws CommandSyntaxException {
      blv $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> vf.a("commands.summon.success", $$5.Q_()), true);
      return 1;
   }
}
