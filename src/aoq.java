import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aoq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wz.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wz.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)eu.a("entity", fs.a($$1, lu.z))
                     .suggests(is.d)
                     .executes($$0x -> b((et)$$0x.getSource(), fs.e($$0x, "entity"), ((et)$$0x.getSource()).d(), new ub(), true)))
                  .then(
                     ((RequiredArgumentBuilder)eu.a("pos", gw.a())
                           .executes($$0x -> b((et)$$0x.getSource(), fs.e($$0x, "entity"), gw.a($$0x, "pos"), new ub(), true)))
                        .then(eu.a("nbt", fd.a()).executes($$0x -> b((et)$$0x.getSource(), fs.e($$0x, "entity"), gw.a($$0x, "pos"), fd.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bsr a(et $$0, jm.c<bsx<?>> $$1, exa $$2, ub $$3, boolean $$4) throws CommandSyntaxException {
      jd $$5 = jd.a((jw)$$2);
      if (!dcw.l($$5)) {
         throw c.create();
      } else {
         ub $$6 = $$3.i();
         $$6.a("id", $$1.h().a().toString());
         aqu $$7 = $$0.e();
         bsr $$8 = bsx.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dF(), $$1x.dH());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof btp) {
               ((btp)$$8).a($$0.e(), $$0.e().d_($$8.dp()), btr.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(et $$0, jm.c<bsx<?>> $$1, exa $$2, ub $$3, boolean $$4) throws CommandSyntaxException {
      bsr $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> wz.a("commands.summon.success", $$5.S_()), true);
      return 1;
   }
}
