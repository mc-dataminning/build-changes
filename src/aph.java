import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aph {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xh.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ew.a("entity", fu.a($$1, ly.z))
                     .suggests(iv.d)
                     .executes($$0x -> b((ev)$$0x.getSource(), fu.e($$0x, "entity"), ((ev)$$0x.getSource()).d(), new uj(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ew.a("pos", gy.a())
                           .executes($$0x -> b((ev)$$0x.getSource(), fu.e($$0x, "entity"), gy.a($$0x, "pos"), new uj(), true)))
                        .then(ew.a("nbt", ff.a()).executes($$0x -> b((ev)$$0x.getSource(), fu.e($$0x, "entity"), gy.a($$0x, "pos"), ff.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static btz a(ev $$0, jp.c<bug<?>> $$1, ezh $$2, uj $$3, boolean $$4) throws CommandSyntaxException {
      jg $$5 = jg.a((jz)$$2);
      if (!dev.l($$5)) {
         throw c.create();
      } else {
         uj $$6 = $$3.i();
         $$6.a("id", $$1.h().a().toString());
         arm $$7 = $$0.e();
         btz $$8 = bug.a($$6, $$7, buf.n, $$1x -> {
            $$1x.b($$2.d, $$2.e, $$2.f, $$1x.dN(), $$1x.dP());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bux) {
               ((bux)$$8).a($$0.e(), $$0.e().d_($$8.dx()), buf.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ev $$0, jp.c<bug<?>> $$1, ezh $$2, uj $$3, boolean $$4) throws CommandSyntaxException {
      btz $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> xh.a("commands.summon.success", $$5.S_()), true);
      return 1;
   }
}
