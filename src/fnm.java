import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fnm implements anq {
   private static final ddx[] a = Arrays.stream(cho.values())
      .sorted(Comparator.comparingInt(cho::a))
      .map($$0 -> new ddx($$0, gw.b, csr.kP.n()))
      .toArray(ddx[]::new);
   private static final ddx b = new ddx(gw.b, csr.kP.n());
   private final dcx c = new dcx(gw.b, csr.cv.n());
   private final dcx d = new deh(gw.b, csr.gV.n());
   private final ddk e = new ddk(gw.b, csr.fG.n());
   private final dcg f = new dcg(gw.b, csr.iJ.n());
   private final dcm g = new dcm(gw.b, csr.bn.n());
   private final ddc h = new ddc(gw.b, csr.mX.n());
   private final ddf i = new ddf(gw.b, csr.so.n());
   private fgp j;
   private fhd k;
   private Map<czs.a, fgv> l;
   private final fpy m;
   private final fht n;

   public fnm(fpy $$0, fht $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(anp $$0) {
      this.j = new fgp(this.n.a(fhw.bd));
      this.k = new fhd(this.n.a(fhw.bC));
      this.l = fqo.a(this.n);
   }

   public void a(cja $$0, cix $$1, elk $$2, fnz $$3, int $$4, int $$5) {
      civ $$6 = $$0.d();
      if ($$6 instanceof cgt) {
         csq $$7 = ((cgt)$$6).e();
         if ($$7 instanceof crn $$8) {
            qu $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? dea.d($$9) : null;
            fgv $$11 = this.l.get($$8.a());
            foh $$12 = fqo.a($$8.a(), $$10);
            fqo.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dfe $$13 = $$7.n();
            dcq $$14;
            if ($$7 instanceof crh) {
               this.f.a($$0, ((crh)$$7).a());
               $$14 = this.f;
            } else if ($$7 instanceof csj) {
               this.g.a(((csj)$$7).a());
               $$14 = this.g;
            } else if ($$13.a(csr.mX)) {
               $$14 = this.h;
            } else if ($$13.a(csr.cv)) {
               $$14 = this.c;
            } else if ($$13.a(csr.fG)) {
               $$14 = this.e;
            } else if ($$13.a(csr.gV)) {
               $$14 = this.d;
            } else if ($$13.a(csr.so)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof czp)) {
                  return;
               }

               cho $$21 = czp.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cjd.uy)) {
            boolean $$25 = cgt.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gbd $$26 = $$25 ? gbf.g : gbf.h;
            elo $$27 = $$26.c().a(fua.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<hg<dch>, cho>> $$28 = dcg.a(cjx.d($$0), dcg.a($$0));
               fpu.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cjd.uV)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            elo $$29 = fua.c($$3, this.k.a(fhd.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
