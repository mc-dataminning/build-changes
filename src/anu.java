import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class anu {
   public static final int a = 100;

   public static void a(CommandDispatcher<ew> $$0, es $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               ex.a("targets", fj.d())
                  .then(
                     ((RequiredArgumentBuilder)ex.a("item", hf.a($$1)).executes($$0x -> a((ew)$$0x.getSource(), hf.a($$0x, "item"), fj.f($$0x, "targets"), 1)))
                        .then(
                           ex.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((ew)$$0x.getSource(), hf.a($$0x, "item"), fj.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ew $$0, hg $$1, Collection<arq> $$2, int $$3) throws CommandSyntaxException {
      cwm $$4 = $$1.a(1, false);
      int $$5 = $$4.k();
      int $$6 = $$5 * 100;
      if ($$3 > $$6) {
         $$0.b(xj.a("commands.give.failed.toomanyitems", $$6, $$4.J()));
         return 0;
      } else {
         for (arq $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$5, $$8);
               $$8 -= $$9;
               cwm $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.gg().f($$10);
               if ($$11 && $$10.f()) {
                  clc $$13 = $$7.a($$4, false);
                  if ($$13 != null) {
                     $$13.w();
                  }

                  $$7.dV().a(null, $$7.dA(), $$7.dC(), $$7.dG(), awn.nB, awo.h, 0.2F, (($$7.dY().i() - $$7.dY().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.cc.d();
               } else {
                  clc $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.q();
                     $$12.b($$7.cG());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> xj.a("commands.give.success.single", $$3, $$4.J(), $$2.iterator().next().o_()), true);
         } else {
            $$0.a(() -> xj.a("commands.give.success.single", $$3, $$4.J(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
