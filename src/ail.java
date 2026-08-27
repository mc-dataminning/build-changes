import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ail {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(te.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)dt.a("entity", ep.a($$1, jd.s))
                     .suggests(gl.d)
                     .executes($$0x -> b((ds)$$0x.getSource(), ep.e($$0x, "entity"), ((ds)$$0x.getSource()).d(), new qs(), true)))
                  .then(
                     ((RequiredArgumentBuilder)dt.a("pos", fq.a())
                           .executes($$0x -> b((ds)$$0x.getSource(), ep.e($$0x, "entity"), fq.a($$0x, "pos"), new qs(), true)))
                        .then(dt.a("nbt", ea.a()).executes($$0x -> b((ds)$$0x.getSource(), ep.e($$0x, "entity"), fq.a($$0x, "pos"), ea.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static big a(ds $$0, hf.c<bik<?>> $$1, ehf $$2, qs $$3, boolean $$4) throws CommandSyntaxException {
      gv $$5 = gv.a($$2);
      if (!cpk.k($$5)) {
         throw c.create();
      } else {
         qs $$6 = $$3.h();
         $$6.a("id", $$1.g().a().toString());
         aki $$7 = $$0.e();
         big $$8 = bik.a($$6, $$7, $$1x -> {
            $$1x.b($$2.c, $$2.d, $$2.e, $$1x.dA(), $$1x.dC());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof biy) {
               ((biy)$$8).a($$0.e(), $$0.e().d_($$8.dk()), bja.n, null, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ds $$0, hf.c<bik<?>> $$1, ehf $$2, qs $$3, boolean $$4) throws CommandSyntaxException {
      big $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> te.a("commands.summon.success", $$5.H_()), true);
      return 1;
   }
}
