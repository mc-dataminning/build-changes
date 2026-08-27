import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fnh implements ann {
   private static final dds[] a = Arrays.stream(chl.values())
      .sorted(Comparator.comparingInt(chl::a))
      .map($$0 -> new dds($$0, gu.b, csm.kP.n()))
      .toArray(dds[]::new);
   private static final dds b = new dds(gu.b, csm.kP.n());
   private final dcs c = new dcs(gu.b, csm.cv.n());
   private final dcs d = new dec(gu.b, csm.gV.n());
   private final ddf e = new ddf(gu.b, csm.fG.n());
   private final dcb f = new dcb(gu.b, csm.iJ.n());
   private final dch g = new dch(gu.b, csm.bn.n());
   private final dcx h = new dcx(gu.b, csm.mX.n());
   private final dda i = new dda(gu.b, csm.so.n());
   private fgk j;
   private fgy k;
   private Map<czn.a, fgq> l;
   private final fpt m;
   private final fho n;

   public fnh(fpt $$0, fho $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(anm $$0) {
      this.j = new fgk(this.n.a(fhr.bd));
      this.k = new fgy(this.n.a(fhr.bC));
      this.l = fqj.a(this.n);
   }

   public void a(cix $$0, ciu $$1, elf $$2, fnu $$3, int $$4, int $$5) {
      cis $$6 = $$0.d();
      if ($$6 instanceof cgq) {
         csl $$7 = ((cgq)$$6).e();
         if ($$7 instanceof cri $$8) {
            qr $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? ddv.d($$9) : null;
            fgq $$11 = this.l.get($$8.a());
            foc $$12 = fqj.a($$8.a(), $$10);
            fqj.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dez $$13 = $$7.n();
            dcl $$14;
            if ($$7 instanceof crc) {
               this.f.a($$0, ((crc)$$7).a());
               $$14 = this.f;
            } else if ($$7 instanceof cse) {
               this.g.a(((cse)$$7).a());
               $$14 = this.g;
            } else if ($$13.a(csm.mX)) {
               $$14 = this.h;
            } else if ($$13.a(csm.cv)) {
               $$14 = this.c;
            } else if ($$13.a(csm.fG)) {
               $$14 = this.e;
            } else if ($$13.a(csm.gV)) {
               $$14 = this.d;
            } else if ($$13.a(csm.so)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof czk)) {
                  return;
               }

               chl $$21 = czk.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cja.uy)) {
            boolean $$25 = cgq.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gay $$26 = $$25 ? gba.g : gba.h;
            elj $$27 = $$26.c().a(ftv.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<he<dcc>, chl>> $$28 = dcb.a(cju.d($$0), dcb.a($$0));
               fpp.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cja.uV)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            elj $$29 = ftv.c($$3, this.k.a(fgy.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
