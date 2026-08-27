import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class alf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vg.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vg.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vg.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dt.a("entity", er.a($$1, ke.u))
                     .suggests(hn.d)
                     .executes($$0x -> b((ds)$$0x.getSource(), er.e($$0x, "entity"), ((ds)$$0x.getSource()).d(), new so(), true)))
                  .then(
                     ((RequiredArgumentBuilder)dt.a("pos", ft.a())
                           .executes($$0x -> b((ds)$$0x.getSource(), er.e($$0x, "entity"), ft.a($$0x, "pos"), new so(), true)))
                        .then(dt.a("nbt", ec.a()).executes($$0x -> b((ds)$$0x.getSource(), er.e($$0x, "entity"), ft.a($$0x, "pos"), ec.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static blw a(ds $$0, ih.c<bmc<?>> $$1, emc $$2, so $$3, boolean $$4) throws CommandSyntaxException {
      hx $$5 = hx.a($$2);
      if (!ctx.l($$5)) {
         throw c.create();
      } else {
         so $$6 = $$3.h();
         $$6.a("id", $$1.h().a().toString());
         ane $$7 = $$0.e();
         blw $$8 = bmc.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dB(), $$1x.dD());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bmq) {
               ((bmq)$$8).a($$0.e(), $$0.e().d_($$8.dl()), bms.n, null, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ds $$0, ih.c<bmc<?>> $$1, emc $$2, so $$3, boolean $$4) throws CommandSyntaxException {
      blw $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> vg.a("commands.summon.success", $$5.Q_()), true);
      return 1;
   }
}
