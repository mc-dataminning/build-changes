import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class apb {
   private static final List<alc<dgh>> a = List.of(
      dgi.a, dgi.b, dgi.c, dgi.d, dgi.e, dgi.f, dgi.g, dgi.h, dgi.i, dgi.j, dgi.k, dgi.l, dgi.m, dgi.n, dgi.o, dgi.p, dgi.q, dgi.r
   );
   private static final List<alc<dgf>> b = List.of(dgg.a, dgg.b, dgg.c, dgg.d, dgg.e, dgg.f, dgg.g, dgg.h, dgg.i, dgg.j, dgg.k);
   private static final ToIntFunction<alc<dgh>> c = af.g(a);
   private static final ToIntFunction<alc<dgf>> d = af.g(b);

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ex)$$0x.getSource(), ((ex)$$0x.getSource()).h()))
      );
   }

   private static int a(ex $$0, cqi $$1) {
      dhp $$2 = $$1.dV();
      kb<dge> $$3 = kb.a();
      kf<dgh> $$4 = $$2.F_().f(me.bh);
      kf<dgf> $$5 = $$2.F_().f(me.bg);
      ju<cxu> $$6 = $$2.a(me.K);
      Map<alc<dga>, List<cxu>> $$7 = $$6.c().map(js.c::a).filter($$0x -> {
         dgc $$1x = $$0x.g().a(kx.E);
         return $$1x != null && $$1x.b().a() == bwc.a.b && $$1x.d().isPresent();
      }).collect(Collectors.groupingBy($$0x -> $$0x.g().a(kx.E).d().get()));
      $$4.s()
         .sorted(Comparator.comparing($$1x -> c.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> d.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new dge($$5.e($$4x), $$4.e($$3x))))
         );
      jj $$8 = $$1.dv().a($$1.cO(), 5);
      int $$9 = $$7.size() - 1;
      double $$10 = 3.0;
      int $$11 = 0;
      int $$12 = 0;

      for (dge $$13 : $$3) {
         for (List<cxu> $$14 : $$7.values()) {
            double $$15 = (double)$$8.u() + 0.5 - (double)($$11 % $$5.d()) * 3.0;
            double $$16 = (double)$$8.v() + 0.5 + (double)($$12 % $$9) * 3.0;
            double $$17 = (double)$$8.w() + 0.5 + (double)($$11 / $$5.d() * 10);
            cmc $$18 = new cmc($$2, $$15, $$16, $$17);
            $$18.w(180.0F);
            $$18.f(true);

            for (cxu $$19 : $$14) {
               dgc $$20 = Objects.requireNonNull($$19.g().a(kx.E));
               cxy $$21 = new cxy($$19);
               $$21.b(kx.W, $$13);
               $$18.a($$20.b(), $$21);
               if ($$21.a(cyc.oX)) {
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

      $$0.a(() -> wv.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }
}
