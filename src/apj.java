import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class apj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xj.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xj.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xj.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ex.a("entity", fv.a($$1, ma.z))
                     .suggests(iw.d)
                     .executes($$0x -> b((ew)$$0x.getSource(), fv.e($$0x, "entity"), ((ew)$$0x.getSource()).d(), new ul(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ex.a("pos", gz.a())
                           .executes($$0x -> b((ew)$$0x.getSource(), fv.e($$0x, "entity"), gz.a($$0x, "pos"), new ul(), true)))
                        .then(ex.a("nbt", fg.a()).executes($$0x -> b((ew)$$0x.getSource(), fv.e($$0x, "entity"), gz.a($$0x, "pos"), fg.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bul a(ew $$0, jq.c<bus<?>> $$1, ezy $$2, ul $$3, boolean $$4) throws CommandSyntaxException {
      jh $$5 = jh.a((ka)$$2);
      if (!dfm.l($$5)) {
         throw c.create();
      } else {
         ul $$6 = $$3.i();
         $$6.a("id", $$1.h().a().toString());
         arp $$7 = $$0.e();
         bul $$8 = bus.a($$6, $$7, bur.n, $$1x -> {
            $$1x.b($$2.d, $$2.e, $$2.f, $$1x.dL(), $$1x.dN());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bvj) {
               ((bvj)$$8).a($$0.e(), $$0.e().d_($$8.dv()), bur.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ew $$0, jq.c<bus<?>> $$1, ezy $$2, ul $$3, boolean $$4) throws CommandSyntaxException {
      bul $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> xj.a("commands.summon.success", $$5.o_()), true);
      return 1;
   }
}
