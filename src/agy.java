import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class agy {
   public static final int a = 100;

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               ds.a("targets", ec.d())
                  .then(
                     ((RequiredArgumentBuilder)ds.a("item", fu.a($$1)).executes($$0x -> a((dr)$$0x.getSource(), fu.a($$0x, "item"), ec.f($$0x, "targets"), 1)))
                        .then(
                           ds.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((dr)$$0x.getSource(), fu.a($$0x, "item"), ec.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(dr $$0, fv $$1, Collection<akl> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = $$1.a().l();
      int $$5 = $$4 * 100;
      ciy $$6 = $$1.a($$3, false);
      if ($$3 > $$5) {
         $$0.b(tf.a("commands.give.failed.toomanyitems", $$5, $$6.J()));
         return 0;
      } else {
         for (akl $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$4, $$8);
               $$8 -= $$9;
               ciy $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.fQ().e($$10);
               if ($$11 && $$10.b()) {
                  $$10.f(1);
                  byg $$13 = $$7.a($$10, false);
                  if ($$13 != null) {
                     $$13.w();
                  }

                  $$7.dK().a(null, $$7.dp(), $$7.dr(), $$7.dv(), aow.ma, aox.h, 0.2F, (($$7.ee().i() - $$7.ee().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.bQ.d();
               } else {
                  byg $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.p();
                     $$12.b($$7.cv());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> tf.a("commands.give.success.single", $$3, $$6.J(), $$2.iterator().next().H_()), true);
         } else {
            $$0.a(() -> tf.a("commands.give.success.single", $$3, $$6.J(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
