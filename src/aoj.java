import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aoj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)er.a("entity", fp.a($$1, lr.z))
                     .suggests(ip.d)
                     .executes($$0x -> b((eq)$$0x.getSource(), fp.e($$0x, "entity"), ((eq)$$0x.getSource()).d(), new tx(), true)))
                  .then(
                     ((RequiredArgumentBuilder)er.a("pos", gt.a())
                           .executes($$0x -> b((eq)$$0x.getSource(), fp.e($$0x, "entity"), gt.a($$0x, "pos"), new tx(), true)))
                        .then(er.a("nbt", fa.a()).executes($$0x -> b((eq)$$0x.getSource(), fp.e($$0x, "entity"), gt.a($$0x, "pos"), fa.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bsd a(eq $$0, jj.c<bsj<?>> $$1, evz $$2, tx $$3, boolean $$4) throws CommandSyntaxException {
      ja $$5 = ja.a($$2);
      if (!dcd.l($$5)) {
         throw c.create();
      } else {
         tx $$6 = $$3.i();
         $$6.a("id", $$1.h().a().toString());
         aqk $$7 = $$0.e();
         bsd $$8 = bsj.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dF(), $$1x.dH());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bta) {
               ((bta)$$8).a($$0.e(), $$0.e().d_($$8.dp()), btc.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(eq $$0, jj.c<bsj<?>> $$1, evz $$2, tx $$3, boolean $$4) throws CommandSyntaxException {
      bsd $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> wu.a("commands.summon.success", $$5.O_()), true);
      return 1;
   }
}
