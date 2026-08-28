import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aop {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)eu.a("entity", fs.a($$1, lu.z))
                     .suggests(is.d)
                     .executes($$0x -> b((et)$$0x.getSource(), fs.e($$0x, "entity"), ((et)$$0x.getSource()).d(), new ua(), true)))
                  .then(
                     ((RequiredArgumentBuilder)eu.a("pos", gw.a())
                           .executes($$0x -> b((et)$$0x.getSource(), fs.e($$0x, "entity"), gw.a($$0x, "pos"), new ua(), true)))
                        .then(eu.a("nbt", fd.a()).executes($$0x -> b((et)$$0x.getSource(), fs.e($$0x, "entity"), gw.a($$0x, "pos"), fd.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bsq a(et $$0, jm.c<bsw<?>> $$1, eww $$2, ua $$3, boolean $$4) throws CommandSyntaxException {
      jd $$5 = jd.a((jw)$$2);
      if (!dcu.l($$5)) {
         throw c.create();
      } else {
         ua $$6 = $$3.i();
         $$6.a("id", $$1.h().a().toString());
         aqt $$7 = $$0.e();
         bsq $$8 = bsw.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dG(), $$1x.dI());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof btn) {
               ((btn)$$8).a($$0.e(), $$0.e().d_($$8.dq()), btp.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(et $$0, jm.c<bsw<?>> $$1, eww $$2, ua $$3, boolean $$4) throws CommandSyntaxException {
      bsq $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> wy.a("commands.summon.success", $$5.O_()), true);
      return 1;
   }
}
