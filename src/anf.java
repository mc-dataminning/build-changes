import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class anf {
   public static final int a = 100;

   public static void a(CommandDispatcher<ex> $$0, et $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               ey.a("targets", fk.d())
                  .then(
                     ((RequiredArgumentBuilder)ey.a("item", hg.a($$1)).executes($$0x -> a((ex)$$0x.getSource(), hg.a($$0x, "item"), fk.f($$0x, "targets"), 1)))
                        .then(
                           ey.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((ex)$$0x.getSource(), hg.a($$0x, "item"), fk.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ex $$0, hh $$1, Collection<are> $$2, int $$3) throws CommandSyntaxException {
      cxh $$4 = $$1.a(1, false);
      int $$5 = $$4.k();
      int $$6 = $$5 * 100;
      if ($$3 > $$6) {
         $$0.b(wp.a("commands.give.failed.toomanyitems", $$6, $$4.K()));
         return 0;
      } else {
         for (are $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$5, $$8);
               $$8 -= $$9;
               cxh $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.gl().f($$10);
               if ($$11 && $$10.f()) {
                  clw $$13 = $$7.a($$4, false);
                  if ($$13 != null) {
                     $$13.u();
                  }

                  $$7.dU().a(null, $$7.dz(), $$7.dB(), $$7.dF(), awa.of, awb.h, 0.2F, (($$7.dX().i() - $$7.dX().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.bQ.d();
               } else {
                  clw $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.m();
                     $$12.b($$7.cF());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> wp.a("commands.give.success.single", $$3, $$4.K(), $$2.iterator().next().m_()), true);
         } else {
            $$0.a(() -> wp.a("commands.give.success.single", $$3, $$4.K(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
