import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class amq {
   public static final int a = 100;

   public static void a(CommandDispatcher<ed> $$0, dz $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("give").requires($$0x -> $$0x.c(2)))
            .then(
               ee.a("targets", eq.d())
                  .then(
                     ((RequiredArgumentBuilder)ee.a("item", gm.a($$1)).executes($$0x -> a((ed)$$0x.getSource(), gm.a($$0x, "item"), eq.f($$0x, "targets"), 1)))
                        .then(
                           ee.a("count", IntegerArgumentType.integer(1))
                              .executes(
                                 $$0x -> a((ed)$$0x.getSource(), gm.a($$0x, "item"), eq.f($$0x, "targets"), IntegerArgumentType.getInteger($$0x, "count"))
                              )
                        )
                  )
            )
      );
   }

   private static int a(ed $$0, gn $$1, Collection<aqi> $$2, int $$3) throws CommandSyntaxException {
      csz $$4 = $$1.a(1, false);
      int $$5 = $$4.i();
      int $$6 = $$5 * 100;
      if ($$3 > $$6) {
         $$0.b(wu.a("commands.give.failed.toomanyitems", $$6, $$4.E()));
         return 0;
      } else {
         for (aqi $$7 : $$2) {
            int $$8 = $$3;

            while ($$8 > 0) {
               int $$9 = Math.min($$5, $$8);
               $$8 -= $$9;
               csz $$10 = $$1.a($$9, false);
               boolean $$11 = $$7.ga().f($$10);
               if ($$11 && $$10.d()) {
                  chr $$13 = $$7.a($$4, false);
                  if ($$13 != null) {
                     $$13.B();
                  }

                  $$7.dN().a(null, $$7.ds(), $$7.du(), $$7.dy(), avc.ns, avd.h, 0.2F, (($$7.ej().i() - $$7.ej().i()) * 0.7F + 1.0F) * 2.0F);
                  $$7.cc.d();
               } else {
                  chr $$12 = $$7.a($$10, false);
                  if ($$12 != null) {
                     $$12.w();
                     $$12.b($$7.cx());
                  }
               }
            }
         }

         if ($$2.size() == 1) {
            $$0.a(() -> wu.a("commands.give.success.single", $$3, $$4.E(), $$2.iterator().next().O_()), true);
         } else {
            $$0.a(() -> wu.a("commands.give.success.single", $$3, $$4.E(), $$2.size()), true);
         }

         return $$2.size();
      }
   }
}
