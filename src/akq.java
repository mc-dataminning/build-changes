import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class akq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vb.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(vb.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dt.a("entity", eq.a($$1, kc.u))
                     .suggests(hl.d)
                     .executes($$0x -> b((ds)$$0x.getSource(), eq.e($$0x, "entity"), ((ds)$$0x.getSource()).d(), new sj(), true)))
                  .then(
                     ((RequiredArgumentBuilder)dt.a("pos", fr.a())
                           .executes($$0x -> b((ds)$$0x.getSource(), eq.e($$0x, "entity"), fr.a($$0x, "pos"), new sj(), true)))
                        .then(dt.a("nbt", eb.a()).executes($$0x -> b((ds)$$0x.getSource(), eq.e($$0x, "entity"), fr.a($$0x, "pos"), eb.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static blf a(ds $$0, ie.c<blj<?>> $$1, elb $$2, sj $$3, boolean $$4) throws CommandSyntaxException {
      hv $$5 = hv.a($$2);
      if (!csy.k($$5)) {
         throw c.create();
      } else {
         sj $$6 = $$3.h();
         $$6.a("id", $$1.g().a().toString());
         amp $$7 = $$0.e();
         blf $$8 = blj.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dC(), $$1x.dE());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof blx) {
               ((blx)$$8).a($$0.e(), $$0.e().d_($$8.dm()), blz.n, null, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ds $$0, ie.c<blj<?>> $$1, elb $$2, sj $$3, boolean $$4) throws CommandSyntaxException {
      blf $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> vb.a("commands.summon.success", $$5.Q_()), true);
      return 1;
   }
}
