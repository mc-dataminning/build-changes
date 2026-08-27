import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ftg implements aqk {
   private static final dil[] a = Arrays.stream(clv.values())
      .sorted(Comparator.comparingInt(clv::a))
      .map($$0 -> new dil($$0, hx.b, cxa.kP.o()))
      .toArray(dil[]::new);
   private static final dil b = new dil(hx.b, cxa.kP.o());
   private final dhk c = new dhk(hx.b, cxa.cv.o());
   private final dhk d = new div(hx.b, cxa.gV.o());
   private final dhy e = new dhy(hx.b, cxa.fG.o());
   private final dgt f = new dgt(hx.b, cxa.iJ.o());
   private final dgz g = new dgz(hx.b, cxa.bn.o());
   private final dhp h = new dhp(hx.b, cxa.mX.o());
   private final dht i = new dht(hx.b, cxa.tp.o());
   private fma j;
   private fmo k;
   private Map<ddz.a, fmg> l;
   private final fvs m;
   private final fnf n;

   public ftg(fvs $$0, fnf $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aqj $$0) {
      this.j = new fma(this.n.a(fni.bf));
      this.k = new fmo(this.n.a(fni.bE));
      this.l = fwi.a(this.n);
   }

   public void a(cng $$0, cnd $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      cnb $$6 = $$0.d();
      if ($$6 instanceof cla) {
         cwy $$7 = ((cla)$$6).e();
         if ($$7 instanceof cvu $$8) {
            so $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? dio.d($$9) : null;
            fmg $$11 = this.l.get($$8.b());
            fub $$12 = fwi.a($$8.b(), $$10);
            fwi.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            djp $$13 = $$7.o();
            dhd $$14;
            if ($$7 instanceof cvp) {
               this.f.a($$0, ((cvp)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof cwr) {
               this.g.a(((cwr)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(cxa.mX)) {
               $$14 = this.h;
            } else if ($$13.a(cxa.cv)) {
               $$14 = this.c;
            } else if ($$13.a(cxa.fG)) {
               $$14 = this.e;
            } else if ($$13.a(cxa.gV)) {
               $$14 = this.d;
            } else if ($$13.a(cxa.tp)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof ddw)) {
                  return;
               }

               clv $$21 = ddw.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cnj.vo)) {
            boolean $$25 = cla.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            ghe $$26 = $$25 ? ghg.g : ghg.h;
            eqo $$27 = $$26.c().a(fzy.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<ih<dgu>, clv>> $$28 = dgt.a(cod.d($$0), dgt.a($$0));
               fvo.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cnj.vL)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eqo $$29 = fzy.c($$3, this.k.a(fmo.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
