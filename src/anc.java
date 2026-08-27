import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class anc {
   public static final int a = 100;

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               ei.a("targets", eu.d())
                  .then(
                     ((RequiredArgumentBuilder)ei.a("item", gq.a($$1)).executes($$0x -> a((eh)$$0x.getSource(), gq.a($$0x, "item"), eu.f($$0x, "targets"), 1)))
                        .then(
                           ei.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((eh)$$0x.getSource(), gq.a($$0x, "item"), eu.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(eh $$0, gr $$1, Collection<aqu> $$2, int $$3) throws CommandSyntaxException {
      cuh $$4 = $$1.a(1, false);
      int $$5 = $$4.i();
      int $$6 = $$5 * 100;
      if ($$3 > $$6) {
         $$0.b(xe.a("commands.give.failed.toomanyitems", $$6, $$4.E()));
         return 0;
      } else {
         for (aqu $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$5, $$8);
               $$8 -= $$9;
               cuh $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.gl().f($$10);
               if ($$11 && $$10.d()) {
                  cig $$13 = $$7.a($$4, false);
                  if ($$13 != null) {
                     $$13.B();
                  }

                  $$7.dU().a(null, $$7.dz(), $$7.dB(), $$7.dF(), avo.nS, avq.h, 0.2F, (($$7.et().i() - $$7.et().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.cq.d();
               } else {
                  cig $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.w();
                     $$12.b($$7.cE());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> xe.a("commands.give.success.single", $$3, $$4.E(), $$2.iterator().next().P_()), true);
         } else {
            $$0.a(() -> xe.a("commands.give.success.single", $$3, $$4.E(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
