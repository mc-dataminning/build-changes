import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fsu implements aqj {
   private static final did[] a = Arrays.stream(clm.values())
      .sorted(Comparator.comparingInt(clm::a))
      .map($$0 -> new did($$0, hx.b, cws.kP.o()))
      .toArray(did[]::new);
   private static final did b = new did(hx.b, cws.kP.o());
   private final dhc c = new dhc(hx.b, cws.cv.o());
   private final dhc d = new din(hx.b, cws.gV.o());
   private final dhq e = new dhq(hx.b, cws.fG.o());
   private final dgl f = new dgl(hx.b, cws.iJ.o());
   private final dgr g = new dgr(hx.b, cws.bn.o());
   private final dhh h = new dhh(hx.b, cws.mX.o());
   private final dhl i = new dhl(hx.b, cws.tp.o());
   private flo j;
   private fmc k;
   private Map<ddr.a, flu> l;
   private final fvg m;
   private final fmt n;

   public fsu(fvg $$0, fmt $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aqi $$0) {
      this.j = new flo(this.n.a(fmw.bg));
      this.k = new fmc(this.n.a(fmw.bF));
      this.l = fvw.a(this.n);
   }

   public void a(cmy $$0, cmv $$1, eqb $$2, fth $$3, int $$4, int $$5) {
      cmt $$6 = $$0.d();
      if ($$6 instanceof ckr) {
         cwq $$7 = ((ckr)$$6).e();
         if ($$7 instanceof cvm $$8) {
            sn $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? dig.d($$9) : null;
            flu $$11 = this.l.get($$8.b());
            ftp $$12 = fvw.a($$8.b(), $$10);
            fvw.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            djh $$13 = $$7.o();
            dgv $$14;
            if ($$7 instanceof cvh) {
               this.f.a($$0, ((cvh)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof cwj) {
               this.g.a(((cwj)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(cws.mX)) {
               $$14 = this.h;
            } else if ($$13.a(cws.cv)) {
               $$14 = this.c;
            } else if ($$13.a(cws.fG)) {
               $$14 = this.e;
            } else if ($$13.a(cws.gV)) {
               $$14 = this.d;
            } else if ($$13.a(cws.tp)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof ddo)) {
                  return;
               }

               clm $$21 = ddo.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cnb.vl)) {
            boolean $$25 = ckr.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            ggq $$26 = $$25 ? ggs.g : ggs.h;
            eqf $$27 = $$26.c().a(fzl.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<ih<dgm>, clm>> $$28 = dgl.a(cnv.d($$0), dgl.a($$0));
               fvc.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cnb.vI)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eqf $$29 = fzl.c($$3, this.k.a(fmc.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
