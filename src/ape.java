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
   private static final List<alf<dic>> a = List.of(
      did.a, did.b, did.c, did.d, did.e, did.f, did.g, did.h, did.i, did.j, did.k, did.l, did.m, did.n, did.o, did.p, did.q, did.r
   );
   private static final List<alf<dia>> b = List.of(dib.a, dib.b, dib.c, dib.d, dib.e, dib.f, dib.g, dib.h, dib.i, dib.j, dib.k);
   private static final ToIntFunction<alf<dic>> c = ag.g(a);
   private static final ToIntFunction<alf<dia>> d = ag.g(b);
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> wy.b("Invalid pattern", $$0));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("spawn_armor_trims").requires($$0x -> $$0x.c(2)))
               .then(ek.a("*_lag_my_game").executes($$0x -> a((ej)$$0x.getSource(), ((ej)$$0x.getSource()).h()))))
            .then(ek.a("pattern", fj.a(mh.bl)).executes($$0x -> a((ej)$$0x.getSource(), ((ej)$$0x.getSource()).h(), fj.a($$0x, "pattern", mh.bl, e))))
      );
   }

   private static int a(ej $$0, crm $$1) {
      return a($$0, $$1, $$0.l().ba().f(mh.bl).c());
   }

   private static int a(ej $$0, crm $$1, alf<dic> $$2) {
      return a($$0, $$1, Stream.of($$0.l().ba().f(mh.bl).a($$2).orElseThrow()));
   }

   private static int a(ej $$0, crm $$1, Stream<jf.c<dic>> $$2) {
      arq $$3 = $$0.e();
      List<jf.c<dic>> $$4 = $$2.sorted(Comparator.comparing($$0x -> c.applyAsInt($$0x.h()))).toList();
      List<jf.c<dia>> $$5 = $$3.F_().f(mh.bk).c().sorted(Comparator.comparing($$0x -> d.applyAsInt($$0x.h()))).toList();
      List<jf.c<czj>> $$6 = a($$3.F_().f(mh.K));
      iv $$7 = $$1.du().a($$1.cN(), 5);
      double $$8 = 3.0;

      for (int $$9 = 0; $$9 < $$5.size(); $$9++) {
         jf.c<dia> $$10 = $$5.get($$9);

         for (int $$11 = 0; $$11 < $$4.size(); $$11++) {
            jf.c<dic> $$12 = $$4.get($$11);
            dhy $$13 = new dhy($$10, $$12);

            for (int $$14 = 0; $$14 < $$6.size(); $$14++) {
               jf.c<czj> $$15 = $$6.get($$14);
               double $$16 = (double)$$7.u() + 0.5 - (double)$$14 * 3.0;
               double $$17 = (double)$$7.v() + 0.5 + (double)$$9 * 3.0;
               double $$18 = (double)$$7.w() + 0.5 + (double)($$11 * 10);
               cng $$19 = new cng($$3, $$16, $$17, $$18);
               $$19.w(180.0F);
               $$19.f(true);
               czn $$20 = new czn($$15);
               dhw $$21 = Objects.requireNonNull($$20.a(kk.D));
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

   private static List<jf.c<czj>> a(jh<czj> $$0) {
      List<jf.c<czj>> $$1 = new ArrayList<>();
      $$0.c().forEach($$1x -> {
         dhw $$2 = ((czj)$$1x.a()).f().a(kk.D);
         if ($$2 != null && $$2.b().a() == bws.a.b && $$2.d().isPresent()) {
            $$1.add($$1x);
         }
      });
      return $$1;
   }
}
