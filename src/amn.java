import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class amn {
   public static final int a = 100;

   public static void a(CommandDispatcher<ec> $$0, dy $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               ed.a("targets", ep.d())
                  .then(
                     ((RequiredArgumentBuilder)ed.a("item", gj.a($$1)).executes($$0x -> a((ec)$$0x.getSource(), gj.a($$0x, "item"), ep.f($$0x, "targets"), 1)))
                        .then(
                           ed.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((ec)$$0x.getSource(), gj.a($$0x, "item"), ep.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ec $$0, gk $$1, Collection<aqf> $$2, int $$3) throws CommandSyntaxException {
      int $$4 = $$1.a().q();
      int $$5 = $$4 * 100;
      csd $$6 = $$1.a(1, false);
      if ($$3 > $$5) {
         $$0.b(ws.a("commands.give.failed.toomanyitems", $$5, $$6.E()));
         return 0;
      } else {
         for (aqf $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$4, $$8);
               $$8 -= $$9;
               csd $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.ga().e($$10);
               if ($$11 && $$10.d()) {
                  cgv $$13 = $$7.a($$6, false);
                  if ($$13 != null) {
                     $$13.B();
                  }

                  $$7.dN().a(null, $$7.ds(), $$7.du(), $$7.dy(), auz.ns, ava.h, 0.2F, (($$7.ej().i() - $$7.ej().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.cc.d();
               } else {
                  cgv $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.w();
                     $$12.b($$7.cx());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> ws.a("commands.give.success.single", $$3, $$6.E(), $$2.iterator().next().O_()), true);
         } else {
            $$0.a(() -> ws.a("commands.give.success.single", $$3, $$6.E(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
