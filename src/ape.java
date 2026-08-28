import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class ape {
   private static final List<alf<dhz>> a = List.of(
      dia.a, dia.b, dia.c, dia.d, dia.e, dia.f, dia.g, dia.h, dia.i, dia.j, dia.k, dia.l, dia.m, dia.n, dia.o, dia.p, dia.q, dia.r
   );
   private static final List<alf<dhx>> b = List.of(dhy.a, dhy.b, dhy.c, dhy.d, dhy.e, dhy.f, dhy.g, dhy.h, dhy.i, dhy.j, dhy.k);
   private static final ToIntFunction<alf<dhz>> c = ag.g(a);
   private static final ToIntFunction<alf<dhx>> d = ag.g(b);
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wy.b("Invalid pattern", $$0));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
               .then(ek.a("*_lag_my_game").executes($$0x -> a((ej)$$0x.getSource(), ((ej)$$0x.getSource()).h()))))
            .then(ek.a("pattern", fj.a(mh.bl)).executes($$0x -> a((ej)$$0x.getSource(), ((ej)$$0x.getSource()).h(), fj.a($$0x, "pattern", mh.bl, e))))
      );
   }

   private static int a(ej $$0, crj $$1) {
      return a($$0, $$1, $$0.l().ba().f(mh.bl).c());
   }

   private static int a(ej $$0, crj $$1, alf<dhz> $$2) {
      return a($$0, $$1, Stream.of($$0.l().ba().f(mh.bl).a($$2).orElseThrow()));
   }

   private static int a(ej $$0, crj $$1, Stream<jf.c<dhz>> $$2) {
      arq $$3 = $$0.e();
      List<jf.c<dhz>> $$4 = $$2.sorted(Comparator.comparing($$0x -> c.applyAsInt($$0x.h()))).toList();
      List<jf.c<dhx>> $$5 = $$3.F_().f(mh.bk).c().sorted(Comparator.comparing($$0x -> d.applyAsInt($$0x.h()))).toList();
      List<jf.c<czg>> $$6 = a($$3.F_().f(mh.K));
      iv $$7 = $$1.du().a($$1.cN(), 5);
      double $$8 = 3.0;

      for (int $$9 = 0; $$9 < $$5.size(); $$9++) {
         jf.c<dhx> $$10 = $$5.get($$9);

         for (int $$11 = 0; $$11 < $$4.size(); $$11++) {
            jf.c<dhz> $$12 = $$4.get($$11);
            dhv $$13 = new dhv($$10, $$12);

            for (int $$14 = 0; $$14 < $$6.size(); $$14++) {
               jf.c<czg> $$15 = $$6.get($$14);
               double $$16 = (double)$$7.u() + 0.5 - (double)$$14 * 3.0;
               double $$17 = (double)$$7.v() + 0.5 + (double)$$9 * 3.0;
               double $$18 = (double)$$7.w() + 0.5 + (double)($$11 * 10);
               cnd $$19 = new cnd($$3, $$16, $$17, $$18);
               $$19.w(180.0F);
               $$19.f(true);
               czk $$20 = new czk($$15);
               dht $$21 = Objects.requireNonNull($$20.a(kk.D));
               $$20.b(kk.W, $$13);
               $$19.a($$21.b(), $$20);
               if ($$14 == 0) {
                  $$19.b($$13.b().a().a($$13.a()).f().f(" & ").b($$13.a().a().b()));
                  $$19.o(true);
               } else {
                  $$19.k(true);
               }

               $$3.b($$19);
            }
         }
      }

      $$0.a(() -> wy.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }

   private static List<jf.c<czg>> a(jh<czg> $$0) {
      List<jf.c<czg>> $$1 = new ArrayList<>();
      $$0.c().forEach($$1x -> {
         dht $$2 = ((czg)$$1x.a()).f().a(kk.D);
         if ($$2 != null && $$2.b().a() == bws.a.b && $$2.d().isPresent()) {
            $$1.add($$1x);
         }
      });
      return $$1;
   }
}
