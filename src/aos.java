import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aos {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xe.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ei.a("entity", fg.a($$1, li.v))
                     .suggests(ig.d)
                     .executes($$0x -> b((eh)$$0x.getSource(), fg.e($$0x, "entity"), ((eh)$$0x.getSource()).d(), new uk(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ei.a("pos", gk.a())
                           .executes($$0x -> b((eh)$$0x.getSource(), fg.e($$0x, "entity"), gk.a($$0x, "pos"), new uk(), true)))
                        .then(ei.a("nbt", er.a()).executes($$0x -> b((eh)$$0x.getSource(), fg.e($$0x, "entity"), gk.a($$0x, "pos"), er.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static brv a(eh $$0, ja.c<bsb<?>> $$1, ewu $$2, uk $$3, boolean $$4) throws CommandSyntaxException {
      ir $$5 = ir.a($$2);
      if (!dca.l($$5)) {
         throw c.create();
      } else {
         uk $$6 = $$3.h();
         $$6.a("id", $$1.h().a().toString());
         aqt $$7 = $$0.e();
         brv $$8 = bsb.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dK(), $$1x.dM());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bsq) {
               ((bsq)$$8).a($$0.e(), $$0.e().d_($$8.du()), bss.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(eh $$0, ja.c<bsb<?>> $$1, ewu $$2, uk $$3, boolean $$4) throws CommandSyntaxException {
      brv $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> xe.a("commands.summon.success", $$5.P_()), true);
      return 1;
   }
}
