import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class apr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xk.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xk.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xk.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ex.a("entity", fv.a($$1, mb.z))
                     .suggests(iw.c)
                     .executes($$0x -> b((ew)$$0x.getSource(), fv.e($$0x, "entity"), ((ew)$$0x.getSource()).d(), new um(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ex.a("pos", gz.a())
                           .executes($$0x -> b((ew)$$0x.getSource(), fv.e($$0x, "entity"), gz.a($$0x, "pos"), new um(), true)))
                        .then(ex.a("nbt", fg.a()).executes($$0x -> b((ew)$$0x.getSource(), fv.e($$0x, "entity"), gz.a($$0x, "pos"), fg.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bvb a(ew $$0, jq.c<bvi<?>> $$1, fbr $$2, um $$3, boolean $$4) throws CommandSyntaxException {
      jh $$5 = jh.a((ka)$$2);
      if (!dgz.l($$5)) {
         throw c.create();
      } else {
         um $$6 = $$3.i();
         $$6.a("id", $$1.h().a().toString());
         arx $$7 = $$0.e();
         bvb $$8 = bvi.a($$6, $$7, bvh.n, $$1x -> {
            $$1x.b($$2.d, $$2.e, $$2.f, $$1x.dM(), $$1x.dO());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bvz) {
               ((bvz)$$8).a($$0.e(), $$0.e().d_($$8.dw()), bvh.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ew $$0, jq.c<bvi<?>> $$1, fbr $$2, um $$3, boolean $$4) throws CommandSyntaxException {
      bvb $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> xk.a("commands.summon.success", $$5.p_()), true);
      return 1;
   }
}
