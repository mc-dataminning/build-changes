import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class anf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vu.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vu.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vu.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dv.a("entity", et.a($$1, kj.u))
                     .suggests(hr.d)
                     .executes($$0x -> b((du)$$0x.getSource(), et.e($$0x, "entity"), ((du)$$0x.getSource()).d(), new ta(), true)))
                  .then(
                     ((RequiredArgumentBuilder)dv.a("pos", fv.a())
                           .executes($$0x -> b((du)$$0x.getSource(), et.e($$0x, "entity"), fv.a($$0x, "pos"), new ta(), true)))
                        .then(dv.a("nbt", ee.a()).executes($$0x -> b((du)$$0x.getSource(), et.e($$0x, "entity"), fv.a($$0x, "pos"), ee.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static box a(du $$0, il.c<bpd<?>> $$1, ept $$2, ta $$3, boolean $$4) throws CommandSyntaxException {
      ib $$5 = ib.a($$2);
      if (!cxb.l($$5)) {
         throw c.create();
      } else {
         ta $$6 = $$3.h();
         $$6.a("id", $$1.h().a().toString());
         apf $$7 = $$0.e();
         box $$8 = bpd.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dC(), $$1x.dE());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bpr) {
               ((bpr)$$8).a($$0.e(), $$0.e().d_($$8.dm()), bpt.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(du $$0, il.c<bpd<?>> $$1, ept $$2, ta $$3, boolean $$4) throws CommandSyntaxException {
      box $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> vu.a("commands.summon.success", $$5.O_()), true);
      return 1;
   }
}
