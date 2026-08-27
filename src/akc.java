import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class akc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ur.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(ur.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dv.a("entity", es.a($$1, jz.t))
                     .suggests(hj.d)
                     .executes($$0x -> b((du)$$0x.getSource(), es.e($$0x, "entity"), ((du)$$0x.getSource()).e(), new rz(), true)))
                  .then(
                     ((RequiredArgumentBuilder)dv.a("pos", ft.a())
                           .executes($$0x -> b((du)$$0x.getSource(), es.e($$0x, "entity"), ft.a($$0x, "pos"), new rz(), true)))
                        .then(dv.a("nbt", ed.a()).executes($$0x -> b((du)$$0x.getSource(), es.e($$0x, "entity"), ft.a($$0x, "pos"), ed.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bki a(du $$0, ib.c<bkm<?>> $$1, eji $$2, rz $$3, boolean $$4) throws CommandSyntaxException {
      ht $$5 = ht.a($$2);
      if (!crs.k($$5)) {
         throw c.create();
      } else {
         rz $$6 = $$3.h();
         $$6.a("id", $$1.g().a().toString());
         ama $$7 = $$0.f();
         bki $$8 = bkm.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dB(), $$1x.dD());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bla) {
               ((bla)$$8).a($$0.f(), $$0.f().d_($$8.dl()), blc.n, null, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(du $$0, ib.c<bkm<?>> $$1, eji $$2, rz $$3, boolean $$4) throws CommandSyntaxException {
      bki $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> ur.a("commands.summon.success", $$5.O_()), true);
      return 1;
   }
}
