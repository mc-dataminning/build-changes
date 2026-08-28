import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class api {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xi.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xi.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xi.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ex.a("entity", fv.a($$1, lz.z))
                     .suggests(iw.d)
                     .executes($$0x -> b((ew)$$0x.getSource(), fv.e($$0x, "entity"), ((ew)$$0x.getSource()).d(), new uk(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ex.a("pos", gz.a())
                           .executes($$0x -> b((ew)$$0x.getSource(), fv.e($$0x, "entity"), gz.a($$0x, "pos"), new uk(), true)))
                        .then(ex.a("nbt", fg.a()).executes($$0x -> b((ew)$$0x.getSource(), fv.e($$0x, "entity"), gz.a($$0x, "pos"), fg.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bue a(ew $$0, jq.c<bul<?>> $$1, ezn $$2, uk $$3, boolean $$4) throws CommandSyntaxException {
      jh $$5 = jh.a((ka)$$2);
      if (!dfb.l($$5)) {
         throw c.create();
      } else {
         uk $$6 = $$3.i();
         $$6.a("id", $$1.h().a().toString());
         arn $$7 = $$0.e();
         bue $$8 = bul.a($$6, $$7, buk.n, $$1x -> {
            $$1x.b($$2.d, $$2.e, $$2.f, $$1x.dN(), $$1x.dP());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bvc) {
               ((bvc)$$8).a($$0.e(), $$0.e().d_($$8.dx()), buk.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ew $$0, jq.c<bul<?>> $$1, ezn $$2, uk $$3, boolean $$4) throws CommandSyntaxException {
      bue $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> xi.a("commands.summon.success", $$5.S_()), true);
      return 1;
   }
}
