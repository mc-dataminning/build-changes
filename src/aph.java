import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aph {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ww.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ww.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ei> $$0, ee $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ej.a("entity", fh.a($$1, mg.B))
                     .suggests(ij.c)
                     .executes($$0x -> b((ei)$$0x.getSource(), fh.e($$0x, "entity"), ((ei)$$0x.getSource()).d(), new tx(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ej.a("pos", gm.a())
                           .executes($$0x -> b((ei)$$0x.getSource(), fh.e($$0x, "entity"), gm.a($$0x, "pos"), new tx(), true)))
                        .then(ej.a("nbt", es.a()).executes($$0x -> b((ei)$$0x.getSource(), fh.e($$0x, "entity"), gm.a($$0x, "pos"), es.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bwa a(ei $$0, je.c<bwj<?>> $$1, fdw $$2, tx $$3, boolean $$4) throws CommandSyntaxException {
      iu $$5 = iu.a((jo)$$2);
      if (!dip.l($$5)) {
         throw c.create();
      } else {
         tx $$6 = $$3.i();
         $$6.a("id", $$1.h().a().toString());
         aro $$7 = $$0.e();
         bwa $$8 = bwj.a($$6, $$7, bwi.n, $$1x -> {
            $$1x.b($$2.d, $$2.e, $$2.f, $$1x.dL(), $$1x.dN());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bxb) {
               ((bxb)$$8).a($$0.e(), $$0.e().d_($$8.dv()), bwi.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ei $$0, je.c<bwj<?>> $$1, fdw $$2, tx $$3, boolean $$4) throws CommandSyntaxException {
      bwa $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> ww.a("commands.summon.success", $$5.m_()), true);
      return 1;
   }
}
