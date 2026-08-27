import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aol {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wx.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ef.a("entity", fd.a($$1, lf.v))
                     .suggests(ic.d)
                     .executes($$0x -> b((ee)$$0x.getSource(), fd.e($$0x, "entity"), ((ee)$$0x.getSource()).d(), new ud(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ef.a("pos", gh.a())
                           .executes($$0x -> b((ee)$$0x.getSource(), fd.e($$0x, "entity"), gh.a($$0x, "pos"), new ud(), true)))
                        .then(ef.a("nbt", eo.a()).executes($$0x -> b((ee)$$0x.getSource(), fd.e($$0x, "entity"), gh.a($$0x, "pos"), eo.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bru a(ee $$0, ix.c<bsa<?>> $$1, euk $$2, ud $$3, boolean $$4) throws CommandSyntaxException {
      io $$5 = io.a($$2);
      if (!dax.l($$5)) {
         throw c.create();
      } else {
         ud $$6 = $$3.h();
         $$6.a("id", $$1.h().a().toString());
         aqm $$7 = $$0.e();
         bru $$8 = bsa.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dF(), $$1x.dH());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bsq) {
               ((bsq)$$8).a($$0.e(), $$0.e().d_($$8.dp()), bss.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ee $$0, ix.c<bsa<?>> $$1, euk $$2, ud $$3, boolean $$4) throws CommandSyntaxException {
      bru $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> wx.a("commands.summon.success", $$5.O_()), true);
      return 1;
   }
}
