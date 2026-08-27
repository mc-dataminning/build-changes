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

public class aiv {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> vb.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<ds> $$0, dn $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               dt.a("from", fk.a())
                  .then(
                     dt.a("to", fk.a())
                        .then(
                           ((RequiredArgumentBuilder)dt.a("biome", eq.a($$1, kc.as))
                                 .executes($$0x -> a((ds)$$0x.getSource(), fk.a($$0x, "from"), fk.a($$0x, "to"), eq.a($$0x, "biome", kc.as), $$0xx -> true)))
                              .then(
                                 dt.a("replace")
                                    .then(
                                       dt.a("filter", et.a($$1, kc.as))
                                          .executes(
                                             $$0x -> a(
                                                   (ds)$$0x.getSource(),
                                                   fk.a($$0x, "from"),
                                                   fk.a($$0x, "to"),
                                                   eq.a($$0x, "biome", kc.as),
                                                   et.a($$0x, "filter", kc.as)::test
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
      return iq.c(iq.a($$0));
   }

   private static hv a(hv $$0) {
      return new hv(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static cua a(MutableInt $$0, dkl $$1, dyg $$2, ie<ctx> $$3, Predicate<ie<ctx>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = iq.c($$5);
         int $$10 = iq.c($$6);
         int $$11 = iq.c($$7);
         ie<ctx> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.c($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   private static int a(ds $$0, hv $$1, hv $$2, ie.c<ctx> $$3, Predicate<ie<ctx>> $$4) throws CommandSyntaxException {
      hv $$5 = a($$1);
      hv $$6 = a($$2);
      dyg $$7 = dyg.a($$5, $$6);
      int $$8 = $$7.d() * $$7.e() * $$7.f();
      int $$9 = $$0.e().Y().c(csu.z);
      if ($$8 > $$9) {
         throw b.create($$9, $$8);
      } else {
         amp $$10 = $$0.e();
         List<dkl> $$11 = new ArrayList<>();

         for (int $$12 = ix.a($$7.j()); $$12 <= ix.a($$7.m()); $$12++) {
            for (int $$13 = ix.a($$7.h()); $$13 <= ix.a($$7.k()); $$13++) {
               dkl $$14 = $$10.a($$13, $$12, dkq.n, false);
               if ($$14 == null) {
                  throw a.create();
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dkl $$16 : $$11) {
            $$16.a(a($$15, $$16, $$7, $$3, $$4), $$10.k().i().b());
            $$16.a(true);
         }

         $$10.k().a.a($$11);
         $$0.a(() -> vb.a("commands.fillbiome.success.count", $$15.getValue(), $$7.h(), $$7.i(), $$7.j(), $$7.k(), $$7.l(), $$7.m()), true);
         return $$15.getValue();
      }
   }
}
