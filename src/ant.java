import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class ant {
   public static final int a = 100;

   public static void a(CommandDispatcher<ej> $$0, ef $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               ek.a("targets", ew.d())
                  .then(
                     ((RequiredArgumentBuilder)ek.a("item", gt.a($$1)).executes($$0x -> a((ej)$$0x.getSource(), gt.a($$0x, "item"), ew.f($$0x, "targets"), 1)))
                        .then(
                           ek.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((ej)$$0x.getSource(), gt.a($$0x, "item"), ew.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ej $$0, gu $$1, Collection<art> $$2, int $$3) throws CommandSyntaxException {
      czy $$4 = $$1.a(1, false);
      int $$5 = $$4.k();
      int $$6 = $$5 * 100;
      if ($$3 > $$6) {
         $$0.b(xa.a("commands.give.failed.toomanyitems", $$6, $$4.K()));
         return 0;
      } else {
         for (art $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$5, $$8);
               $$8 -= $$9;
               czy $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.gj().g($$10);
               if ($$11 && $$10.f()) {
                  coc $$13 = $$7.a($$4, false);
                  if ($$13 != null) {
                     $$13.u();
                  }

                  $$7.dV().a(null, $$7.dA(), $$7.dC(), $$7.dG(), awp.oj, awq.h, 0.2F, (($$7.dY().i() - $$7.dY().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.bR.d();
               } else {
                  coc $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.m();
                     $$12.b($$7.cG());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> xa.a("commands.give.success.single", $$3, $$4.K(), $$2.iterator().next().m_()), true);
         } else {
            $$0.a(() -> xa.a("commands.give.success.single", $$3, $$4.K(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
