import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class ans {
   public static final int a = 100;

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               ew.a("targets", fi.d())
                  .then(
                     ((RequiredArgumentBuilder)ew.a("item", he.a($$1)).executes($$0x -> a((ev)$$0x.getSource(), he.a($$0x, "item"), fi.f($$0x, "targets"), 1)))
                        .then(
                           ew.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((ev)$$0x.getSource(), he.a($$0x, "item"), fi.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ev $$0, hf $$1, Collection<arn> $$2, int $$3) throws CommandSyntaxException {
      cvx $$4 = $$1.a(1, false);
      int $$5 = $$4.k();
      int $$6 = $$5 * 100;
      if ($$3 > $$6) {
         $$0.b(xh.a("commands.give.failed.toomanyitems", $$6, $$4.J()));
         return 0;
      } else {
         for (arn $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$5, $$8);
               $$8 -= $$9;
               cvx $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.gk().f($$10);
               if ($$11 && $$10.f()) {
                  ckq $$13 = $$7.a($$4, false);
                  if ($$13 != null) {
                     $$13.z();
                  }

                  $$7.dX().a(null, $$7.dC(), $$7.dE(), $$7.dI(), awk.nB, awl.h, 0.2F, (($$7.ea().i() - $$7.ea().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.ca.d();
               } else {
                  ckq $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.t();
                     $$12.b($$7.cH());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> xh.a("commands.give.success.single", $$3, $$4.J(), $$2.iterator().next().S_()), true);
         } else {
            $$0.a(() -> xh.a("commands.give.success.single", $$3, $$4.J(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
