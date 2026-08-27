import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fmy implements ann {
   private static final ddt[] a = Arrays.stream(chm.values())
      .sorted(Comparator.comparingInt(chm::a))
      .map($$0 -> new ddt($$0, gu.b, csn.kP.n()))
      .toArray(ddt[]::new);
   private static final ddt b = new ddt(gu.b, csn.kP.n());
   private final dct c = new dct(gu.b, csn.cv.n());
   private final dct d = new ded(gu.b, csn.gV.n());
   private final ddg e = new ddg(gu.b, csn.fG.n());
   private final dcc f = new dcc(gu.b, csn.iJ.n());
   private final dci g = new dci(gu.b, csn.bn.n());
   private final dcy h = new dcy(gu.b, csn.mX.n());
   private final ddb i = new ddb(gu.b, csn.so.n());
   private fgf j;
   private fgt k;
   private Map<czo.a, fgl> l;
   private final fpk m;
   private final fhj n;

   public fmy(fpk $$0, fhj $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(anm $$0) {
      this.j = new fgf(this.n.a(fhm.bd));
      this.k = new fgt(this.n.a(fhm.bC));
      this.l = fqa.a(this.n);
   }

   public void a(ciy $$0, civ $$1, elg $$2, fnl $$3, int $$4, int $$5) {
      cit $$6 = $$0.d();
      if ($$6 instanceof cgr) {
         csm $$7 = ((cgr)$$6).e();
         if ($$7 instanceof crj $$8) {
            qr $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? ddw.d($$9) : null;
            fgl $$11 = this.l.get($$8.a());
            fnt $$12 = fqa.a($$8.a(), $$10);
            fqa.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dfa $$13 = $$7.n();
            dcm $$14;
            if ($$7 instanceof crd) {
               this.f.a($$0, ((crd)$$7).a());
               $$14 = this.f;
            } else if ($$7 instanceof csf) {
               this.g.a(((csf)$$7).a());
               $$14 = this.g;
            } else if ($$13.a(csn.mX)) {
               $$14 = this.h;
            } else if ($$13.a(csn.cv)) {
               $$14 = this.c;
            } else if ($$13.a(csn.fG)) {
               $$14 = this.e;
            } else if ($$13.a(csn.gV)) {
               $$14 = this.d;
            } else if ($$13.a(csn.so)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof czl)) {
                  return;
               }

               chm $$21 = czl.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cjb.uy)) {
            boolean $$25 = cgr.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gap $$26 = $$25 ? gar.g : gar.h;
            elk $$27 = $$26.c().a(ftm.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<he<dcd>, chm>> $$28 = dcc.a(cjv.d($$0), dcc.a($$0));
               fpg.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cjb.uV)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            elk $$29 = ftm.c($$3, this.k.a(fgt.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
