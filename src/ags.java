import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;

public class ags {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> tf.a("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<dr> $$0, dl $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               ds.a("from", fi.a())
                  .then(
                     ds.a("to", fi.a())
                        .then(
                           ((RequiredArgumentBuilder)ds.a("biome", eo.a($$1, jc.ap))
                                 .executes($$0x -> a((dr)$$0x.getSource(), fi.a($$0x, "from"), fi.a($$0x, "to"), eo.a($$0x, "biome", jc.ap), $$0xx -> true)))
                              .then(
                                 ds.a("replace")
                                    .then(
                                       ds.a("filter", er.a($$1, jc.ap))
                                          .executes(
                                             $$0x -> a(
                                                   (dr)$$0x.getSource(),
                                                   fi.a($$0x, "from"),
                                                   fi.a($$0x, "to"),
                                                   eo.a($$0x, "biome", jc.ap),
                                                   er.a($$0x, "filter", jc.ap)::test
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(int $$0) {
      return hq.c(hq.a($$0));
   }

   private static gu a(gu $$0) {
      return new gu(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static cqm a(MutableInt $$0, dgv $$1, duq $$2, he<cqj> $$3, Predicate<he<cqj>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = hq.c($$5);
         int $$10 = hq.c($$6);
         int $$11 = hq.c($$7);
         he<cqj> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.c($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   private static int a(dr $$0, gu $$1, gu $$2, he.c<cqj> $$3, Predicate<he<cqj>> $$4) throws CommandSyntaxException {
      gu $$5 = a($$1);
      gu $$6 = a($$2);
      duq $$7 = duq.a($$5, $$6);
      int $$8 = $$7.c() * $$7.d() * $$7.e();
      int $$9 = $$0.e().X().c(cph.x);
      if ($$8 > $$9) {
         throw b.create($$9, $$8);
      } else {
         akk $$10 = $$0.e();
         List<dgv> $$11 = new ArrayList<>();

         for (int $$12 = hx.a($$7.i()); $$12 <= hx.a($$7.l()); $$12++) {
            for (int $$13 = hx.a($$7.g()); $$13 <= hx.a($$7.j()); $$13++) {
               dgv $$14 = $$10.a($$13, $$12, dha.n, false);
               if ($$14 == null) {
                  throw a.create();
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dgv $$16 : $$11) {
            $$16.a(a($$15, $$16, $$7, $$3, $$4), $$10.k().i().b());
            $$16.a(true);
         }

         $$10.k().a.a($$11);
         $$0.a(() -> tf.a("commands.fillbiome.success.count", $$15.getValue(), $$7.g(), $$7.h(), $$7.i(), $$7.j(), $$7.k(), $$7.l()), true);
         return $$15.getValue();
      }
   }
}
