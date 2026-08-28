import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class ano {
   public static final int a = 100;

   public static void a(CommandDispatcher<ep> $$0, el $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               eq.a("targets", fc.d())
                  .then(
                     ((RequiredArgumentBuilder)eq.a("item", gy.a($$1)).executes($$0x -> a((ep)$$0x.getSource(), gy.a($$0x, "item"), fc.f($$0x, "targets"), 1)))
                        .then(
                           eq.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((ep)$$0x.getSource(), gy.a($$0x, "item"), fc.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ep $$0, gz $$1, Collection<arg> $$2, int $$3) throws CommandSyntaxException {
      cuq $$4 = $$1.a(1, false);
      int $$5 = $$4.j();
      int $$6 = $$5 * 100;
      if ($$3 > $$6) {
         $$0.b(xp.a("commands.give.failed.toomanyitems", $$6, $$4.G()));
         return 0;
      } else {
         for (arg $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$5, $$8);
               $$8 -= $$9;
               cuq $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.gc().f($$10);
               if ($$11 && $$10.e()) {
                  cji $$13 = $$7.a($$4, false);
                  if ($$13 != null) {
                     $$13.B();
                  }

                  $$7.dP().a(null, $$7.du(), $$7.dw(), $$7.dA(), awa.nC, awb.h, 0.2F, (($$7.el().i() - $$7.el().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.cb.d();
               } else {
                  cji $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.w();
                     $$12.b($$7.cz());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> xp.a("commands.give.success.single", $$3, $$4.G(), $$2.iterator().next().O_()), true);
         } else {
            $$0.a(() -> xp.a("commands.give.success.single", $$3, $$4.G(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
