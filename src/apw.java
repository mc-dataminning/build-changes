import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class apw {
   private static final List<aly<dfr>> a = List.of(
      dfs.a, dfs.b, dfs.c, dfs.d, dfs.e, dfs.f, dfs.g, dfs.h, dfs.i, dfs.j, dfs.k, dfs.l, dfs.m, dfs.n, dfs.o, dfs.p, dfs.q, dfs.r
   );
   private static final List<aly<dfp>> b = List.of(dfq.a, dfq.b, dfq.c, dfq.d, dfq.e, dfq.f, dfq.g, dfq.h, dfq.i, dfq.j);
   private static final ToIntFunction<aly<dfr>> c = ae.g(a);
   private static final ToIntFunction<aly<dfp>> d = ae.g(b);

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ew)$$0x.getSource(), ((ew)$$0x.getSource()).h()))
      );
   }

   private static int a(ew $$0, cps $$1) {
      dha $$2 = $$1.dV();
      jz<dfo> $$3 = jz.a();
      kd<dfr> $$4 = $$2.K_().e(mb.aZ);
      kd<dfp> $$5 = $$2.K_().e(mb.aY);
      js<cxg> $$6 = $$2.a(mb.K);
      Map<alz, List<cxg>> $$7 = $$6.c().map(jq.c::a).filter($$0x -> {
         dfm $$1x = $$0x.g().a(ku.D);
         return $$1x != null && $$1x.a().a() == bvn.a.b && $$1x.c().isPresent();
      }).collect(Collectors.groupingBy($$0x -> $$0x.g().a(ku.D).c().get()));
      $$4.s()
         .sorted(Comparator.comparing($$1x -> c.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> d.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new dfo($$5.e($$4x), $$4.e($$3x))))
         );
      jh $$8 = $$1.dv().a($$1.cO(), 5);
      int $$9 = $$7.size() - 1;
      double $$10 = 3.0;
      int $$11 = 0;
      int $$12 = 0;

      for (dfo $$13 : $$3) {
         for (List<cxg> $$14 : $$7.values()) {
            double $$15 = (double)$$8.u() + 0.5 - (double)($$11 % $$5.d()) * 3.0;
            double $$16 = (double)$$8.v() + 0.5 + (double)($$12 % $$9) * 3.0;
            double $$17 = (double)$$8.w() + 0.5 + (double)($$11 / $$5.d() * 10);
            cll $$18 = new cll($$2, $$15, $$16, $$17);
            $$18.v(180.0F);
            $$18.f(true);

            for (cxg $$19 : $$14) {
               dfm $$20 = Objects.requireNonNull($$19.g().a(ku.D));
               cxk $$21 = new cxk($$19);
               $$21.b(ku.U, $$13);
               $$18.a($$20.a(), $$21);
               if ($$21.a(cxo.oK)) {
                  $$18.b($$13.b().a().a($$13.a()).f().f(" ").b($$13.a().a().e()));
                  $$18.p(true);
               } else {
                  $$18.k(true);
               }
            }

            $$2.b($$18);
            $$12++;
         }

         $$11++;
      }

      $$0.a(() -> xv.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
