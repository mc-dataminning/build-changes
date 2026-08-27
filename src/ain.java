import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class ain {
   public static final int a = 100;

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("targets", eg.d())
                  .then(
                     ((RequiredArgumentBuilder)dv.a("item", fy.a($$1)).executes($$0x -> a((du)$$0x.getSource(), fy.a($$0x, "item"), eg.f($$0x, "targets"), 1)))
                        .then(
                           dv.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((du)$$0x.getSource(), fy.a($$0x, "item"), eg.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(du $$0, fz $$1, Collection<amb> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = $$1.a().l();
      int $$5 = $$4 * 100;
      clb $$6 = $$1.a($$3, false);
      if ($$3 > $$5) {
         $$0.b(ur.a("commands.give.failed.toomanyitems", $$5, $$6.J()));
         return 0;
      } else {
         for (amb $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$4, $$8);
               $$8 -= $$9;
               clb $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.fS().e($$10);
               if ($$11 && $$10.b()) {
                  $$10.f(1);
                  caf $$13 = $$7.a($$10, false);
                  if ($$13 != null) {
                     $$13.B();
                  }

                  $$7.dL().a(null, $$7.dq(), $$7.ds(), $$7.dw(), aqn.me, aqo.h, 0.2F, (($$7.ef().i() - $$7.ef().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.bS.d();
               } else {
                  caf $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.w();
                     $$12.b($$7.cv());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> ur.a("commands.give.success.single", $$3, $$6.J(), $$2.iterator().next().O_()), true);
         } else {
            $$0.a(() -> ur.a("commands.give.success.single", $$3, $$6.J(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
