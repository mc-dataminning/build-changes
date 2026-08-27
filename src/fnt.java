import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fnt implements anw {
   private static final dee[] a = Arrays.stream(chv.values())
      .sorted(Comparator.comparingInt(chv::a))
      .map($$0 -> new dee($$0, gw.b, csy.kP.n()))
      .toArray(dee[]::new);
   private static final dee b = new dee(gw.b, csy.kP.n());
   private final dde c = new dde(gw.b, csy.cv.n());
   private final dde d = new deo(gw.b, csy.gV.n());
   private final ddr e = new ddr(gw.b, csy.fG.n());
   private final dcn f = new dcn(gw.b, csy.iJ.n());
   private final dct g = new dct(gw.b, csy.bn.n());
   private final ddj h = new ddj(gw.b, csy.mX.n());
   private final ddm i = new ddm(gw.b, csy.so.n());
   private fgw j;
   private fhk k;
   private Map<czz.a, fhc> l;
   private final fqf m;
   private final fia n;

   public fnt(fqf $$0, fia $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(anv $$0) {
      this.j = new fgw(this.n.a(fid.bd));
      this.k = new fhk(this.n.a(fid.bC));
      this.l = fqv.a(this.n);
   }

   public void a(cjh $$0, cje $$1, elr $$2, fog $$3, int $$4, int $$5) {
      cjc $$6 = $$0.d();
      if ($$6 instanceof cha) {
         csx $$7 = ((cha)$$6).e();
         if ($$7 instanceof cru $$8) {
            qy $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? deh.d($$9) : null;
            fhc $$11 = this.l.get($$8.a());
            foo $$12 = fqv.a($$8.a(), $$10);
            fqv.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dfl $$13 = $$7.n();
            dcx $$14;
            if ($$7 instanceof cro) {
               this.f.a($$0, ((cro)$$7).a());
               $$14 = this.f;
            } else if ($$7 instanceof csq) {
               this.g.a(((csq)$$7).a());
               $$14 = this.g;
            } else if ($$13.a(csy.mX)) {
               $$14 = this.h;
            } else if ($$13.a(csy.cv)) {
               $$14 = this.c;
            } else if ($$13.a(csy.fG)) {
               $$14 = this.e;
            } else if ($$13.a(csy.gV)) {
               $$14 = this.d;
            } else if ($$13.a(csy.so)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof czw)) {
                  return;
               }

               chv $$21 = czw.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cjk.uy)) {
            boolean $$25 = cha.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gbk $$26 = $$25 ? gbm.g : gbm.h;
            elv $$27 = $$26.c().a(fuh.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<hg<dco>, chv>> $$28 = dcn.a(cke.d($$0), dcn.a($$0));
               fqb.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cjk.uV)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            elv $$29 = fuh.c($$3, this.k.a(fhk.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
