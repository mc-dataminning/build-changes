import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class apl {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xa.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xa.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xa.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ek.a("entity", fi.a($$1, mh.B))
                     .suggests(ik.c)
                     .executes($$0x -> b((ej)$$0x.getSource(), fi.e($$0x, "entity"), ((ej)$$0x.getSource()).d(), new tz(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ek.a("pos", gn.a())
                           .executes($$0x -> b((ej)$$0x.getSource(), fi.e($$0x, "entity"), gn.a($$0x, "pos"), new tz(), true)))
                        .then(ek.a("nbt", et.a()).executes($$0x -> b((ej)$$0x.getSource(), fi.e($$0x, "entity"), gn.a($$0x, "pos"), et.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bwt a(ej $$0, jf.c<bxc<?>> $$1, ffq $$2, tz $$3, boolean $$4) throws CommandSyntaxException {
      iv $$5 = iv.a((jp)$$2);
      if (!djx.l($$5)) {
         throw c.create();
      } else {
         tz $$6 = $$3.l();
         $$6.a("id", $$1.h().a().toString());
         ars $$7 = $$0.e();
         bwt $$8 = bxc.a($$6, $$7, bxb.n, $$1x -> {
            $$1x.b($$2.d, $$2.e, $$2.f, $$1x.dL(), $$1x.dN());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bxw) {
               ((bxw)$$8).a($$0.e(), $$0.e().d_($$8.dv()), bxb.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ej $$0, jf.c<bxc<?>> $$1, ffq $$2, tz $$3, boolean $$4) throws CommandSyntaxException {
      bwt $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> xa.a("commands.summon.success", $$5.m_()), true);
      return 1;
   }
}
