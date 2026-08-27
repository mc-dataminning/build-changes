import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ain {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(tf.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ds.a("entity", eo.a($$1, jc.s))
                     .suggests(gk.d)
                     .executes($$0x -> b((dr)$$0x.getSource(), eo.e($$0x, "entity"), ((dr)$$0x.getSource()).d(), new qr(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ds.a("pos", fp.a())
                           .executes($$0x -> b((dr)$$0x.getSource(), eo.e($$0x, "entity"), fp.a($$0x, "pos"), new qr(), true)))
                        .then(ds.a("nbt", dz.a()).executes($$0x -> b((dr)$$0x.getSource(), eo.e($$0x, "entity"), fp.a($$0x, "pos"), dz.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bii a(dr $$0, he.c<bim<?>> $$1, ehe $$2, qr $$3, boolean $$4) throws CommandSyntaxException {
      gu $$5 = gu.a($$2);
      if (!cpm.k($$5)) {
         throw c.create();
      } else {
         qr $$6 = $$3.h();
         $$6.a("id", $$1.g().a().toString());
         akk $$7 = $$0.e();
         bii $$8 = bim.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dA(), $$1x.dC());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bja) {
               ((bja)$$8).a($$0.e(), $$0.e().d_($$8.dk()), bjc.n, null, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(dr $$0, he.c<bim<?>> $$1, ehe $$2, qr $$3, boolean $$4) throws CommandSyntaxException {
      bii $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> tf.a("commands.summon.success", $$5.H_()), true);
      return 1;
   }
}
