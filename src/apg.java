import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class apg {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("commands.summon.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wv.c("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wv.c("commands.summon.invalidPosition"));

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("summon").requires($$0x -> $$0x.c(2)))
            .then(
               ((RequiredArgumentBuilder)ey.a("entity", fw.a($$1, me.z))
                     .suggests(iy.c)
                     .executes($$0x -> b((ex)$$0x.getSource(), fw.e($$0x, "entity"), ((ex)$$0x.getSource()).d(), new tw(), true)))
                  .then(
                     ((RequiredArgumentBuilder)ey.a("pos", hb.a())
                           .executes($$0x -> b((ex)$$0x.getSource(), fw.e($$0x, "entity"), hb.a($$0x, "pos"), new tw(), true)))
                        .then(ey.a("nbt", fh.a()).executes($$0x -> b((ex)$$0x.getSource(), fw.e($$0x, "entity"), hb.a($$0x, "pos"), fh.a($$0x, "nbt"), false)))
                  )
            )
      );
   }

   public static bvs a(ex $$0, js.c<bwb<?>> $$1, fcu $$2, tw $$3, boolean $$4) throws CommandSyntaxException {
      jj $$5 = jj.a((kc)$$2);
      if (!dhp.l($$5)) {
         throw c.create();
      } else {
         tw $$6 = $$3.i();
         $$6.a("id", $$1.h().a().toString());
         arn $$7 = $$0.e();
         bvs $$8 = bwb.a($$6, $$7, bwa.n, $$1x -> {
            $$1x.b($$2.d, $$2.e, $$2.f, $$1x.dL(), $$1x.dN());
            return $$1x;
         });
         if ($$8 == null) {
            throw a.create();
         } else {
            if ($$4 && $$8 instanceof bwt) {
               ((bwt)$$8).a($$0.e(), $$0.e().d_($$8.dv()), bwa.n, null);
            }

            if (!$$7.e($$8)) {
               throw b.create();
            } else {
               return $$8;
            }
         }
      }
   }

   private static int b(ex $$0, js.c<bwb<?>> $$1, fcu $$2, tw $$3, boolean $$4) throws CommandSyntaxException {
      bvs $$5 = a($$0, $$1, $$2, $$3, $$4);
      $$0.a(() -> wv.a("commands.summon.success", $$5.m_()), true);
      return 1;
   }
}
