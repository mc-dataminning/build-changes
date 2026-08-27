import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fnr implements anv {
   private static final dec[] a = Arrays.stream(cht.values())
      .sorted(Comparator.comparingInt(cht::a))
      .map($$0 -> new dec($$0, gw.b, csw.kP.n()))
      .toArray(dec[]::new);
   private static final dec b = new dec(gw.b, csw.kP.n());
   private final ddc c = new ddc(gw.b, csw.cv.n());
   private final ddc d = new dem(gw.b, csw.gV.n());
   private final ddp e = new ddp(gw.b, csw.fG.n());
   private final dcl f = new dcl(gw.b, csw.iJ.n());
   private final dcr g = new dcr(gw.b, csw.bn.n());
   private final ddh h = new ddh(gw.b, csw.mX.n());
   private final ddk i = new ddk(gw.b, csw.so.n());
   private fgu j;
   private fhi k;
   private Map<czx.a, fha> l;
   private final fqd m;
   private final fhy n;

   public fnr(fqd $$0, fhy $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(anu $$0) {
      this.j = new fgu(this.n.a(fib.bd));
      this.k = new fhi(this.n.a(fib.bC));
      this.l = fqt.a(this.n);
   }

   public void a(cjf $$0, cjc $$1, elp $$2, foe $$3, int $$4, int $$5) {
      cja $$6 = $$0.d();
      if ($$6 instanceof cgy) {
         csv $$7 = ((cgy)$$6).e();
         if ($$7 instanceof crs $$8) {
            qy $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? def.d($$9) : null;
            fha $$11 = this.l.get($$8.a());
            fom $$12 = fqt.a($$8.a(), $$10);
            fqt.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dfj $$13 = $$7.n();
            dcv $$14;
            if ($$7 instanceof crm) {
               this.f.a($$0, ((crm)$$7).a());
               $$14 = this.f;
            } else if ($$7 instanceof cso) {
               this.g.a(((cso)$$7).a());
               $$14 = this.g;
            } else if ($$13.a(csw.mX)) {
               $$14 = this.h;
            } else if ($$13.a(csw.cv)) {
               $$14 = this.c;
            } else if ($$13.a(csw.fG)) {
               $$14 = this.e;
            } else if ($$13.a(csw.gV)) {
               $$14 = this.d;
            } else if ($$13.a(csw.so)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof czu)) {
                  return;
               }

               cht $$21 = czu.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cji.uy)) {
            boolean $$25 = cgy.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gbi $$26 = $$25 ? gbk.g : gbk.h;
            elt $$27 = $$26.c().a(fuf.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<hg<dcm>, cht>> $$28 = dcl.a(ckc.d($$0), dcl.a($$0));
               fpz.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cji.uV)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            elt $$29 = fuf.c($$3, this.k.a(fhi.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
