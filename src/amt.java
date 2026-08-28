import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class amt {
   public static final int a = 100;

   public static void a(CommandDispatcher<eq> $$0, em $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               er.a("targets", fd.d())
                  .then(
                     ((RequiredArgumentBuilder)er.a("item", gz.a($$1)).executes($$0x -> a((eq)$$0x.getSource(), gz.a($$0x, "item"), fd.f($$0x, "targets"), 1)))
                        .then(
                           er.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((eq)$$0x.getSource(), gz.a($$0x, "item"), fd.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(eq $$0, ha $$1, Collection<aql> $$2, int $$3) throws CommandSyntaxException {
      cua $$4 = $$1.a(1, false);
      int $$5 = $$4.j();
      int $$6 = $$5 * 100;
      if ($$3 > $$6) {
         $$0.b(wu.a("commands.give.failed.toomanyitems", $$6, $$4.F()));
         return 0;
      } else {
         for (aql $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$5, $$8);
               $$8 -= $$9;
               cua $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.fY().f($$10);
               if ($$11 && $$10.e()) {
                  cir $$13 = $$7.a($$4, false);
                  if ($$13 != null) {
                     $$13.B();
                  }

                  $$7.dP().a(null, $$7.du(), $$7.dw(), $$7.dA(), avf.nC, avg.h, 0.2F, (($$7.dS().i() - $$7.dS().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.cd.d();
               } else {
                  cir $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.w();
                     $$12.b($$7.cz());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> wu.a("commands.give.success.single", $$3, $$4.F(), $$2.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wu.a("commands.give.success.single", $$3, $$4.F(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
