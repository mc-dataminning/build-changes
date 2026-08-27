import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aog {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wu.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ee.a("entity", fc.a($$1, le.v))
                     .suggests(ib.d)
                     .executes($$0x -> b((ed)$$0x.getSource(), fc.e($$0x, "entity"), ((ed)$$0x.getSource()).d(), new ua(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ee.a("pos", gg.a())
                           .executes($$0x -> b((ed)$$0x.getSource(), fc.e($$0x, "entity"), gg.a($$0x, "pos"), new ua(), true)))
                        .then(ee.a("nbt", en.a()).executes($$0x -> b((ed)$$0x.getSource(), fc.e($$0x, "entity"), gg.a($$0x, "pos"), en.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static brh a(ed $$0, iw.c<brn<?>> $$1, etp $$2, ua $$3, boolean $$4) throws CommandSyntaxException {
      in $$5 = in.a($$2);
      if (!dad.l($$5)) {
         throw c.create();
      } else {
         ua $$6 = $$3.h();
         $$6.a("id", $$1.h().a().toString());
         aqh $$7 = $$0.e();
         brh $$8 = brn.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dD(), $$1x.dF());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bsc) {
               ((bsc)$$8).a($$0.e(), $$0.e().d_($$8.dn()), bse.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ed $$0, iw.c<brn<?>> $$1, etp $$2, ua $$3, boolean $$4) throws CommandSyntaxException {
      brh $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> wu.a("commands.summon.success", $$5.O_()), true);
      return 1;
   }
}
