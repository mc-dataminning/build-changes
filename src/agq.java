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

public class agq {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> te.a("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<ds> $$0, dm $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("from", fj.a())
                  .then(
                     dt.a("to", fj.a())
                        .then(
                           ((RequiredArgumentBuilder)dt.a("biome", ep.a($$1, jd.ap))
                                 .executes($$0x -> a((ds)$$0x.getSource(), fj.a($$0x, "from"), fj.a($$0x, "to"), ep.a($$0x, "biome", jd.ap), $$0xx -> true)))
                              .then(
                                 dt.a("replace")
                                    .then(
                                       dt.a("filter", es.a($$1, jd.ap))
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   fj.a($$0x, "from"),
                                                   fj.a($$0x, "to"),
                                                   ep.a($$0x, "biome", jd.ap),
                                                   es.a($$0x, "filter", jd.ap)::test
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
      return hr.c(hr.a($$0));
   }

   private static gv a(gv $$0) {
      return new gv(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static cql a(MutableInt $$0, dgu $$1, dup $$2, hf<cqi> $$3, Predicate<hf<cqi>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = hr.c($$5);
         int $$10 = hr.c($$6);
         int $$11 = hr.c($$7);
         hf<cqi> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.c($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   private static int a(ds $$0, gv $$1, gv $$2, hf.c<cqi> $$3, Predicate<hf<cqi>> $$4) throws CommandSyntaxException {
      gv $$5 = a($$1);
      gv $$6 = a($$2);
      dup $$7 = dup.a($$5, $$6);
      int $$8 = $$7.c() * $$7.d() * $$7.e();
      int $$9 = $$0.e().X().c(cpg.x);
      if ($$8 > $$9) {
         throw b.create($$9, $$8);
      } else {
         aki $$10 = $$0.e();
         List<dgu> $$11 = new ArrayList<>();

         for (int $$12 = hy.a($$7.i()); $$12 <= hy.a($$7.l()); $$12++) {
            for (int $$13 = hy.a($$7.g()); $$13 <= hy.a($$7.j()); $$13++) {
               dgu $$14 = $$10.a($$13, $$12, dgz.n, false);
               if ($$14 == null) {
                  throw a.create();
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dgu $$16 : $$11) {
            $$16.a(a($$15, $$16, $$7, $$3, $$4), $$10.k().i().b());
            $$16.a(true);
         }

         $$10.k().a.a($$11);
         $$0.a(() -> te.a("commands.fillbiome.success.count", $$15.getValue(), $$7.g(), $$7.h(), $$7.i(), $$7.j(), $$7.k(), $$7.l()), true);
         return $$15.getValue();
      }
   }
}
