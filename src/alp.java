import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class alp {
   public static final int a = 100;

   public static void a(CommandDispatcher<du> $$0, dq $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("targets", eh.d())
                  .then(
                     ((RequiredArgumentBuilder)dv.a("item", ga.a($$1)).executes($$0x -> a((du)$$0x.getSource(), ga.a($$0x, "item"), eh.f($$0x, "targets"), 1)))
                        .then(
                           dv.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((du)$$0x.getSource(), ga.a($$0x, "item"), eh.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(du $$0, gb $$1, Collection<apg> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = $$1.a().n();
      int $$5 = $$4 * 100;
      cqk $$6 = $$1.a($$3, false);
      if ($$3 > $$5) {
         $$0.b(vu.a("commands.give.failed.toomanyitems", $$5, $$6.K()));
         return 0;
      } else {
         for (apg $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$4, $$8);
               $$8 -= $$9;
               cqk $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.fZ().e($$10);
               if ($$11 && $$10.b()) {
                  $$10.f(1);
                  cfd $$13 = $$7.a($$10, false);
                  if ($$13 != null) {
                     $$13.B();
                  }

                  $$7.dM().a(null, $$7.dr(), $$7.dt(), $$7.dx(), aty.nh, atz.h, 0.2F, (($$7.ei().i() - $$7.ei().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.bZ.d();
               } else {
                  cfd $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.w();
                     $$12.b($$7.cw());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> vu.a("commands.give.success.single", $$3, $$6.K(), $$2.iterator().next().O_()), true);
         } else {
            $$0.a(() -> vu.a("commands.give.success.single", $$3, $$6.K(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
