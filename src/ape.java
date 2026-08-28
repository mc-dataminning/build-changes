import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ape {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<eu> $$0, eq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ev.a("entity", ft.a($$1, lw.z))
                     .suggests(iu.d)
                     .executes($$0x -> b((eu)$$0x.getSource(), ft.e($$0x, "entity"), ((eu)$$0x.getSource()).d(), new ug(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ev.a("pos", gx.a())
                           .executes($$0x -> b((eu)$$0x.getSource(), ft.e($$0x, "entity"), gx.a($$0x, "pos"), new ug(), true)))
                        .then(ev.a("nbt", fe.a()).executes($$0x -> b((eu)$$0x.getSource(), ft.e($$0x, "entity"), gx.a($$0x, "pos"), fe.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static btr a(eu $$0, jo.c<bty<?>> $$1, eyw $$2, ug $$3, boolean $$4) throws CommandSyntaxException {
      jf $$5 = jf.a((jy)$$2);
      if (!dej.l($$5)) {
         throw c.create();
      } else {
         ug $$6 = $$3.i();
         $$6.a("id", $$1.h().a().toString());
         arj $$7 = $$0.e();
         btr $$8 = bty.a($$6, $$7, btx.n, $$1x -> {
            $$1x.b($$2.d, $$2.e, $$2.f, $$1x.dI(), $$1x.dK());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bup) {
               ((bup)$$8).a($$0.e(), $$0.e().d_($$8.ds()), btx.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(eu $$0, jo.c<bty<?>> $$1, eyw $$2, ug $$3, boolean $$4) throws CommandSyntaxException {
      btr $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> xe.a("commands.summon.success", $$5.R_()), true);
      return 1;
   }
}
