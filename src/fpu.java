import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fpu implements ape {
   private static final dfz[] a = Arrays.stream(cjp.values())
      .sorted(Comparator.comparingInt(cjp::a))
      .map($$0 -> new dfz($$0, ht.b, cuv.kP.o()))
      .toArray(dfz[]::new);
   private static final dfz b = new dfz(ht.b, cuv.kP.o());
   private final dey c = new dey(ht.b, cuv.cv.o());
   private final dey d = new dgj(ht.b, cuv.gV.o());
   private final dfm e = new dfm(ht.b, cuv.fG.o());
   private final deh f = new deh(ht.b, cuv.iJ.o());
   private final den g = new den(ht.b, cuv.bn.o());
   private final dfd h = new dfd(ht.b, cuv.mX.o());
   private final dfh i = new dfh(ht.b, cuv.so.o());
   private fit j;
   private fjh k;
   private Map<dbu.a, fiz> l;
   private final fsg m;
   private final fjx n;

   public fpu(fsg $$0, fjx $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(apd $$0) {
      this.j = new fit(this.n.a(fka.bd));
      this.k = new fjh(this.n.a(fka.bC));
      this.l = fsw.a(this.n);
   }

   public void a(clb $$0, cky $$1, enk $$2, fqh $$3, int $$4, int $$5) {
      ckw $$6 = $$0.d();
      if ($$6 instanceof ciu) {
         cut $$7 = ((ciu)$$6).e();
         if ($$7 instanceof ctp $$8) {
            rz $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? dgc.d($$9) : null;
            fiz $$11 = this.l.get($$8.b());
            fqp $$12 = fsw.a($$8.b(), $$10);
            fsw.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dgw $$13 = $$7.o();
            der $$14;
            if ($$7 instanceof ctj) {
               this.f.a($$0, ((ctj)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof cum) {
               this.g.a(((cum)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(cuv.mX)) {
               $$14 = this.h;
            } else if ($$13.a(cuv.cv)) {
               $$14 = this.c;
            } else if ($$13.a(cuv.fG)) {
               $$14 = this.e;
            } else if ($$13.a(cuv.gV)) {
               $$14 = this.d;
            } else if ($$13.a(cuv.so)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof dbr)) {
                  return;
               }

               cjp $$21 = dbr.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cle.uz)) {
            boolean $$25 = ciu.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gdl $$26 = $$25 ? gdn.g : gdn.h;
            eno $$27 = $$26.c().a(fwi.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<ib<dei>, cjp>> $$28 = deh.a(cly.d($$0), deh.a($$0));
               fsc.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cle.uW)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eno $$29 = fwi.c($$3, this.k.a(fjh.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
