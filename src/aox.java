import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aox {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wp.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wp.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ey.a("entity", fw.a($$1, mc.z))
                     .suggests(ix.c)
                     .executes($$0x -> b((ex)$$0x.getSource(), fw.e($$0x, "entity"), ((ex)$$0x.getSource()).d(), new tq(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ey.a("pos", ha.a())
                           .executes($$0x -> b((ex)$$0x.getSource(), fw.e($$0x, "entity"), ha.a($$0x, "pos"), new tq(), true)))
                        .then(ey.a("nbt", fh.a()).executes($$0x -> b((ex)$$0x.getSource(), fw.e($$0x, "entity"), ha.a($$0x, "pos"), fh.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static buk a(ex $$0, jr.c<bur<?>> $$1, faz $$2, tq $$3, boolean $$4) throws CommandSyntaxException {
      ji $$5 = ji.a((kb)$$2);
      if (!dgh.l($$5)) {
         throw c.create();
      } else {
         tq $$6 = $$3.i();
         $$6.a("id", $$1.h().a().toString());
         ard $$7 = $$0.e();
         buk $$8 = bur.a($$6, $$7, buq.n, $$1x -> {
            $$1x.b($$2.d, $$2.e, $$2.f, $$1x.dL(), $$1x.dN());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bvi) {
               ((bvi)$$8).a($$0.e(), $$0.e().d_($$8.dv()), buq.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ex $$0, jr.c<bur<?>> $$1, faz $$2, tq $$3, boolean $$4) throws CommandSyntaxException {
      buk $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> wp.a("commands.summon.success", $$5.p_()), true);
      return 1;
   }
}
