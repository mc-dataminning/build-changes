import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class apw {
   private static final List<aly<dfz>> a = List.of(
      dga.a, dga.b, dga.c, dga.d, dga.e, dga.f, dga.g, dga.h, dga.i, dga.j, dga.k, dga.l, dga.m, dga.n, dga.o, dga.p, dga.q, dga.r
   );
   private static final List<aly<dfx>> b = List.of(dfy.a, dfy.b, dfy.c, dfy.d, dfy.e, dfy.f, dfy.g, dfy.h, dfy.i, dfy.j);
   private static final ToIntFunction<aly<dfz>> c = ae.g(a);
   private static final ToIntFunction<aly<dfx>> d = ae.g(b);

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
            .executes($$0x -> a((ew)$$0x.getSource(), ((ew)$$0x.getSource()).h()))
      );
   }

   private static int a(ew $$0, cpx $$1) {
      dhi $$2 = $$1.dW();
      jz<dfw> $$3 = jz.a();
      kd<dfz> $$4 = $$2.K_().e(mb.ba);
      kd<dfx> $$5 = $$2.K_().e(mb.aZ);
      js<cxl> $$6 = $$2.a(mb.K);
      Map<alz, List<cxl>> $$7 = $$6.c().map(jq.c::a).filter($$0x -> {
         dfu $$1x = $$0x.g().a(ku.D);
         return $$1x != null && $$1x.a().a() == bvs.a.b && $$1x.c().isPresent();
      }).collect(Collectors.groupingBy($$0x -> $$0x.g().a(ku.D).c().get()));
      $$4.s()
         .sorted(Comparator.comparing($$1x -> c.applyAsInt($$4.d($$1x).orElse(null))))
         .forEachOrdered(
            $$3x -> $$5.s()
                  .sorted(Comparator.comparing($$1xx -> d.applyAsInt($$5.d($$1xx).orElse(null))))
                  .forEachOrdered($$4x -> $$3.add(new dfw($$5.e($$4x), $$4.e($$3x))))
         );
      jh $$8 = $$1.dw().a($$1.cO(), 5);
      int $$9 = $$7.size() - 1;
      double $$10 = 3.0;
      int $$11 = 0;
      int $$12 = 0;

      for (dfw $$13 : $$3) {
         for (List<cxl> $$14 : $$7.values()) {
            double $$15 = (double)$$8.u() + 0.5 - (double)($$11 % $$5.d()) * 3.0;
            double $$16 = (double)$$8.v() + 0.5 + (double)($$12 % $$9) * 3.0;
            double $$17 = (double)$$8.w() + 0.5 + (double)($$11 / $$5.d() * 10);
            clq $$18 = new clq($$2, $$15, $$16, $$17);
            $$18.v(180.0F);
            $$18.f(true);

            for (cxl $$19 : $$14) {
               dfu $$20 = Objects.requireNonNull($$19.g().a(ku.D));
               cxp $$21 = new cxp($$19);
               $$21.b(ku.U, $$13);
               $$18.a($$20.a(), $$21);
               if ($$21.a(cxt.oK)) {
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
