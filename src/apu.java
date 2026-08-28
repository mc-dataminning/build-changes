import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class apu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xg.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)el.a("entity", fj.a($$1, mi.B))
                     .suggests(il.c)
                     .executes($$0x -> b((ek)$$0x.getSource(), fj.e($$0x, "entity"), ((ek)$$0x.getSource()).d(), new ua(), true)))
                  .then(
                     ((RequiredArgumentBuilder)el.a("pos", go.a())
                           .executes($$0x -> b((ek)$$0x.getSource(), fj.e($$0x, "entity"), go.a($$0x, "pos"), new ua(), true)))
                        .then(el.a("nbt", eu.a()).executes($$0x -> b((ek)$$0x.getSource(), fj.e($$0x, "entity"), go.a($$0x, "pos"), eu.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bxe a(ek $$0, jg.c<bxn<?>> $$1, fgc $$2, ua $$3, boolean $$4) throws CommandSyntaxException {
      iw $$5 = iw.a((jq)$$2);
      if (!dkj.l($$5)) {
         throw c.create();
      } else {
         ua $$6 = $$3.l();
         $$6.a("id", $$1.h().a().toString());
         asb $$7 = $$0.e();
         bxe $$8 = bxn.a($$6, $$7, bxm.n, $$1x -> {
            $$1x.b($$2.d, $$2.e, $$2.f, $$1x.dL(), $$1x.dN());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof byh) {
               ((byh)$$8).a($$0.e(), $$0.e().d_($$8.dv()), bxm.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ek $$0, jg.c<bxn<?>> $$1, fgc $$2, ua $$3, boolean $$4) throws CommandSyntaxException {
      bxe $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> xg.a("commands.summon.success", $$5.P_()), true);
      return 1;
   }
}
