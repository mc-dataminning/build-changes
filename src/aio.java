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

public class aio {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(uv.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> uv.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("from", fm.a())
                  .then(
                     dv.a("to", fm.a())
                        .then(
                           ((RequiredArgumentBuilder)dv.a("biome", es.a($$1, kd.ar))
                                 .executes($$0x -> a((du)$$0x.getSource(), fm.a($$0x, "from"), fm.a($$0x, "to"), es.a($$0x, "biome", kd.ar), $$0xx -> true)))
                              .then(
                                 dv.a("replace")
                                    .then(
                                       dv.a("filter", ev.a($$1, kd.ar))
                                          .executes(
                                             $$0x -> a(
                                                   (du)$$0x.getSource(),
                                                   fm.a($$0x, "from"),
                                                   fm.a($$0x, "to"),
                                                   es.a($$0x, "biome", kd.ar),
                                                   ev.a($$0x, "filter", kd.ar)::test
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
      return ir.c(ir.a($$0));
   }

   private static hx a(hx $$0) {
      return new hx(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static ctg a(MutableInt $$0, djj $$1, dxe $$2, ig<ctd> $$3, Predicate<ig<ctd>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = ir.c($$5);
         int $$10 = ir.c($$6);
         int $$11 = ir.c($$7);
         ig<ctd> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.c($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   private static int a(du $$0, hx $$1, hx $$2, ig.c<ctd> $$3, Predicate<ig<ctd>> $$4) throws CommandSyntaxException {
      hx $$5 = a($$1);
      hx $$6 = a($$2);
      dxe $$7 = dxe.a($$5, $$6);
      int $$8 = $$7.d() * $$7.e() * $$7.f();
      int $$9 = $$0.e().Y().c(csb.z);
      if ($$8 > $$9) {
         throw b.create($$9, $$8);
      } else {
         ami $$10 = $$0.e();
         List<djj> $$11 = new ArrayList<>();

         for (int $$12 = iy.a($$7.j()); $$12 <= iy.a($$7.m()); $$12++) {
            for (int $$13 = iy.a($$7.h()); $$13 <= iy.a($$7.k()); $$13++) {
               djj $$14 = $$10.a($$13, $$12, djo.n, false);
               if ($$14 == null) {
                  throw a.create();
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (djj $$16 : $$11) {
            $$16.a(a($$15, $$16, $$7, $$3, $$4), $$10.k().i().b());
            $$16.a(true);
         }

         $$10.k().a.a($$11);
         $$0.a(() -> uv.a("commands.fillbiome.success.count", $$15.getValue(), $$7.h(), $$7.i(), $$7.j(), $$7.k(), $$7.l(), $$7.m()), true);
         return $$15.getValue();
      }
   }
}
