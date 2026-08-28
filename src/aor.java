import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class aor {
   private static final List<akt<dfr>> a = List.of(
      dfs.a, dfs.b, dfs.c, dfs.d, dfs.e, dfs.f, dfs.g, dfs.h, dfs.i, dfs.j, dfs.k, dfs.l, dfs.m, dfs.n, dfs.o, dfs.p, dfs.q, dfs.r
   );
   private static final List<akt<dfp>> b = List.of(dfq.a, dfq.b, dfq.c, dfq.d, dfq.e, dfq.f, dfq.g, dfq.h, dfq.i, dfq.j, dfq.k);
   private static final ToIntFunction<akt<dfr>> c = af.g(a);
   private static final ToIntFunction<akt<dfp>> d = af.g(b);

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ex)$$0x.getSource(), ((ex)$$0x.getSource()).h()))
      );
   }

   private static int a(ex $$0, cpr $$1) {
      dgz $$2 = $$1.dU();
      ka<dfo> $$3 = ka.a();
      ke<dfr> $$4 = $$2.F_().e(mc.bc);
      ke<dfp> $$5 = $$2.F_().e(mc.bb);
      jt<cxd> $$6 = $$2.a(mc.K);
      Map<akt<dfk>, List<cxd>> $$7 = $$6.c().map(jr.c::a).filter($$0x -> {
         dfm $$1x = $$0x.g().a(kv.E);
         return $$1x != null && $$1x.a().a() == bvj.a.b && $$1x.c().isPresent();
      }).collect(Collectors.groupingBy($$0x -> $$0x.g().a(kv.E).c().get()));
      $$4.s()
         .sorted(Comparator.comparing($$1x -> c.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> d.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new dfo($$5.e($$4x), $$4.e($$3x))))
         );
      ji $$8 = $$1.du().a($$1.cN(), 5);
      int $$9 = $$7.size() - 1;
      double $$10 = 3.0;
      int $$11 = 0;
      int $$12 = 0;

      for (dfo $$13 : $$3) {
         for (List<cxd> $$14 : $$7.values()) {
            double $$15 = (double)$$8.u() + 0.5 - (double)($$11 % $$5.d()) * 3.0;
            double $$16 = (double)$$8.v() + 0.5 + (double)($$12 % $$9) * 3.0;
            double $$17 = (double)$$8.w() + 0.5 + (double)($$11 / $$5.d() * 10);
            cll $$18 = new cll($$2, $$15, $$16, $$17);
            $$18.w(180.0F);
            $$18.f(true);

            for (cxd $$19 : $$14) {
               dfm $$20 = Objects.requireNonNull($$19.g().a(kv.E));
               cxh $$21 = new cxh($$19);
               $$21.b(kv.W, $$13);
               $$18.a($$20.a(), $$21);
               if ($$21.a(cxl.oV)) {
                  $$18.b($$13.b().a().a($$13.a()).f().f(" ").b($$13.a().a().d()));
                  $$18.o(true);
               } else {
                  $$18.k(true);
               }
            }

            $$2.b($$18);
            $$12++;
         }

         $$11++;
      }

      $$0.a(() -> wp.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
