import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class frv implements apt {
   private static final dhl[] a = Arrays.stream(ckv.values())
      .sorted(Comparator.comparingInt(ckv::a))
      .map($$0 -> new dhl($$0, hv.b, cwb.kP.o()))
      .toArray(dhl[]::new);
   private static final dhl b = new dhl(hv.b, cwb.kP.o());
   private final dgk c = new dgk(hv.b, cwb.cv.o());
   private final dgk d = new dhv(hv.b, cwb.gV.o());
   private final dgy e = new dgy(hv.b, cwb.fG.o());
   private final dft f = new dft(hv.b, cwb.iJ.o());
   private final dfz g = new dfz(hv.b, cwb.bn.o());
   private final dgp h = new dgp(hv.b, cwb.mX.o());
   private final dgt i = new dgt(hv.b, cwb.tp.o());
   private fkp j;
   private fld k;
   private Map<dda.a, fkv> l;
   private final fuh m;
   private final flu n;

   public frv(fuh $$0, flu $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aps $$0) {
      this.j = new fkp(this.n.a(flx.bg));
      this.k = new fld(this.n.a(flx.bF));
      this.l = fux.a(this.n);
   }

   public void a(cmh $$0, cme $$1, epd $$2, fsi $$3, int $$4, int $$5) {
      cmc $$6 = $$0.d();
      if ($$6 instanceof cka) {
         cvz $$7 = ((cka)$$6).e();
         if ($$7 instanceof cuv $$8) {
            sj $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? dho.d($$9) : null;
            fkv $$11 = this.l.get($$8.b());
            fsq $$12 = fux.a($$8.b(), $$10);
            fux.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dip $$13 = $$7.o();
            dgd $$14;
            if ($$7 instanceof cuq) {
               this.f.a($$0, ((cuq)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof cvs) {
               this.g.a(((cvs)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(cwb.mX)) {
               $$14 = this.h;
            } else if ($$13.a(cwb.cv)) {
               $$14 = this.c;
            } else if ($$13.a(cwb.fG)) {
               $$14 = this.e;
            } else if ($$13.a(cwb.gV)) {
               $$14 = this.d;
            } else if ($$13.a(cwb.tp)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof dcx)) {
                  return;
               }

               ckv $$21 = dcx.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cmk.vl)) {
            boolean $$25 = cka.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gfs $$26 = $$25 ? gfu.g : gfu.h;
            eph $$27 = $$26.c().a(fym.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<ie<dfu>, ckv>> $$28 = dft.a(cne.d($$0), dft.a($$0));
               fud.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cmk.vI)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eph $$29 = fym.c($$3, this.k.a(fld.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
