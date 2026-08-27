import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class agj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(sw.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(sw.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(sw.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dt.a("entity", eo.a($$1, jc.s))
                     .suggests(gk.d)
                     .executes($$0x -> b((ds)$$0x.getSource(), eo.e($$0x, "entity"), ((ds)$$0x.getSource()).d(), new qr(), true)))
                  .then(
                     ((RequiredArgumentBuilder)dt.a("pos", fp.a())
                           .executes($$0x -> b((ds)$$0x.getSource(), eo.e($$0x, "entity"), fp.a($$0x, "pos"), new qr(), true)))
                        .then(dt.a("nbt", dz.a()).executes($$0x -> b((ds)$$0x.getSource(), eo.e($$0x, "entity"), fp.a($$0x, "pos"), dz.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bfj a(ds $$0, he.c<bfn<?>> $$1, eei $$2, qr $$3, boolean $$4) throws CommandSyntaxException {
      gu $$5 = gu.a($$2);
      if (!cmm.k($$5)) {
         throw c.create();
      } else {
         qr $$6 = $$3.h();
         $$6.a("id", $$1.g().a().toString());
         aif $$7 = $$0.e();
         bfj $$8 = bfn.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dy(), $$1x.dA());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bgb) {
               ((bgb)$$8).a($$0.e(), $$0.e().d_($$8.di()), bgd.n, null, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ds $$0, he.c<bfn<?>> $$1, eei $$2, qr $$3, boolean $$4) throws CommandSyntaxException {
      bfj $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> sw.a("commands.summon.success", $$5.H_()), true);
      return 1;
   }
}
