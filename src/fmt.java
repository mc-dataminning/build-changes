import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fmt implements anl {
   private static final ddr[] a = Arrays.stream(chk.values())
      .sorted(Comparator.comparingInt(chk::a))
      .map($$0 -> new ddr($$0, gv.b, csl.kP.n()))
      .toArray(ddr[]::new);
   private static final ddr b = new ddr(gv.b, csl.kP.n());
   private final dcr c = new dcr(gv.b, csl.cv.n());
   private final dcr d = new deb(gv.b, csl.gV.n());
   private final dde e = new dde(gv.b, csl.fG.n());
   private final dca f = new dca(gv.b, csl.iJ.n());
   private final dcg g = new dcg(gv.b, csl.bn.n());
   private final dcw h = new dcw(gv.b, csl.mX.n());
   private final dcz i = new dcz(gv.b, csl.so.n());
   private fgb j;
   private fgp k;
   private Map<czm.a, fgh> l;
   private final fpf m;
   private final fhf n;

   public fmt(fpf $$0, fhf $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(ank $$0) {
      this.j = new fgb(this.n.a(fhi.bd));
      this.k = new fgp(this.n.a(fhi.bC));
      this.l = fpv.a(this.n);
   }

   public void a(ciw $$0, cit $$1, elh $$2, fng $$3, int $$4, int $$5) {
      cir $$6 = $$0.d();
      if ($$6 instanceof cgp) {
         csk $$7 = ((cgp)$$6).e();
         if ($$7 instanceof crh $$8) {
            qs $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? ddu.d($$9) : null;
            fgh $$11 = this.l.get($$8.a());
            fno $$12 = fpv.a($$8.a(), $$10);
            fpv.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dey $$13 = $$7.n();
            dck $$14;
            if ($$7 instanceof crb) {
               this.f.a($$0, ((crb)$$7).a());
               $$14 = this.f;
            } else if ($$7 instanceof csd) {
               this.g.a(((csd)$$7).a());
               $$14 = this.g;
            } else if ($$13.a(csl.mX)) {
               $$14 = this.h;
            } else if ($$13.a(csl.cv)) {
               $$14 = this.c;
            } else if ($$13.a(csl.fG)) {
               $$14 = this.e;
            } else if ($$13.a(csl.gV)) {
               $$14 = this.d;
            } else if ($$13.a(csl.so)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof czj)) {
                  return;
               }

               chk $$21 = czj.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(ciz.uy)) {
            boolean $$25 = cgp.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gak $$26 = $$25 ? gam.g : gam.h;
            ell $$27 = $$26.c().a(fth.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<hf<dcb>, chk>> $$28 = dca.a(cjt.d($$0), dca.a($$0));
               fpb.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(ciz.uV)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            ell $$29 = fth.c($$3, this.k.a(fgp.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
