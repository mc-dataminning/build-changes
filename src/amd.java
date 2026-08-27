import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class amd {
   public static final int a = 100;

   public static void a(CommandDispatcher<dv> $$0, dr $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               dw.a("targets", ei.d())
                  .then(
                     ((RequiredArgumentBuilder)dw.a("item", gc.a($$1)).executes($$0x -> a((dv)$$0x.getSource(), gc.a($$0x, "item"), ei.f($$0x, "targets"), 1)))
                        .then(
                           dw.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((dv)$$0x.getSource(), gc.a($$0x, "item"), ei.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(dv $$0, gd $$1, Collection<apv> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = $$1.a().q();
      int $$5 = $$4 * 100;
      crs $$6 = $$1.a(1, false);
      if ($$3 > $$5) {
         $$0.b(wi.a("commands.give.failed.toomanyitems", $$5, $$6.E()));
         return 0;
      } else {
         for (apv $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$4, $$8);
               $$8 -= $$9;
               crs $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.fZ().e($$10);
               if ($$11 && $$10.d()) {
                  cgk $$13 = $$7.a($$6, false);
                  if ($$13 != null) {
                     $$13.B();
                  }

                  $$7.dM().a(null, $$7.dr(), $$7.dt(), $$7.dx(), auo.nn, aup.h, 0.2F, (($$7.ei().i() - $$7.ei().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.ca.d();
               } else {
                  cgk $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.w();
                     $$12.b($$7.cw());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> wi.a("commands.give.success.single", $$3, $$6.E(), $$2.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wi.a("commands.give.success.single", $$3, $$6.E(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
