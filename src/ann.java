import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class ann {
   public static final int a = 100;

   public static void a(CommandDispatcher<et> $$0, ep $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               eu.a("targets", fg.d())
                  .then(
                     ((RequiredArgumentBuilder)eu.a("item", hc.a($$1)).executes($$0x -> a((et)$$0x.getSource(), hc.a($$0x, "item"), fg.f($$0x, "targets"), 1)))
                        .then(
                           eu.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((et)$$0x.getSource(), hc.a($$0x, "item"), fg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(et $$0, hd $$1, Collection<ari> $$2, int $$3) throws CommandSyntaxException {
      cvp $$4 = $$1.a(1, false);
      int $$5 = $$4.k();
      int $$6 = $$5 * 100;
      if ($$3 > $$6) {
         $$0.b(xd.a("commands.give.failed.toomanyitems", $$6, $$4.H()));
         return 0;
      } else {
         for (ari $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$5, $$8);
               $$8 -= $$9;
               cvp $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.gc().f($$10);
               if ($$11 && $$10.f()) {
                  cke $$13 = $$7.a($$4, false);
                  if ($$13 != null) {
                     $$13.z();
                  }

                  $$7.dS().a(null, $$7.dx(), $$7.dz(), $$7.dD(), awe.nD, awf.h, 0.2F, (($$7.dV().i() - $$7.dV().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.bZ.d();
               } else {
                  cke $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.t();
                     $$12.b($$7.cD());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> xd.a("commands.give.success.single", $$3, $$4.H(), $$2.iterator().next().Q_()), true);
         } else {
            $$0.a(() -> xd.a("commands.give.success.single", $$3, $$4.H(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
