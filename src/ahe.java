import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class ahe {
   public static final int a = 100;

   public static void a(CommandDispatcher<dt> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               du.a("targets", ee.d())
                  .then(
                     ((RequiredArgumentBuilder)du.a("item", fw.a($$1)).executes($$0x -> a((dt)$$0x.getSource(), fw.a($$0x, "item"), ee.f($$0x, "targets"), 1)))
                        .then(
                           du.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((dt)$$0x.getSource(), fw.a($$0x, "item"), ee.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(dt $$0, fx $$1, Collection<aks> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = $$1.a().l();
      int $$5 = $$4 * 100;
      cjf $$6 = $$1.a($$3, false);
      if ($$3 > $$5) {
         $$0.b(tl.a("commands.give.failed.toomanyitems", $$5, $$6.J()));
         return 0;
      } else {
         for (aks $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$4, $$8);
               $$8 -= $$9;
               cjf $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.fR().e($$10);
               if ($$11 && $$10.b()) {
                  $$10.f(1);
                  byn $$13 = $$7.a($$10, false);
                  if ($$13 != null) {
                     $$13.B();
                  }

                  $$7.dL().a(null, $$7.dq(), $$7.ds(), $$7.dw(), ape.ma, apf.h, 0.2F, (($$7.ef().i() - $$7.ef().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.bS.d();
               } else {
                  byn $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.w();
                     $$12.b($$7.cw());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> tl.a("commands.give.success.single", $$3, $$6.J(), $$2.iterator().next().N_()), true);
         } else {
            $$0.a(() -> tl.a("commands.give.success.single", $$3, $$6.J(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
