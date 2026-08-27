import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fss implements aqi {
   private static final dic[] a = Arrays.stream(cll.values())
      .sorted(Comparator.comparingInt(cll::a))
      .map($$0 -> new dic($$0, hx.b, cwr.kP.o()))
      .toArray(dic[]::new);
   private static final dic b = new dic(hx.b, cwr.kP.o());
   private final dhb c = new dhb(hx.b, cwr.cv.o());
   private final dhb d = new dim(hx.b, cwr.gV.o());
   private final dhp e = new dhp(hx.b, cwr.fG.o());
   private final dgk f = new dgk(hx.b, cwr.iJ.o());
   private final dgq g = new dgq(hx.b, cwr.bn.o());
   private final dhg h = new dhg(hx.b, cwr.mX.o());
   private final dhk i = new dhk(hx.b, cwr.tp.o());
   private flm j;
   private fma k;
   private Map<ddq.a, fls> l;
   private final fve m;
   private final fmr n;

   public fss(fve $$0, fmr $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aqh $$0) {
      this.j = new flm(this.n.a(fmu.bg));
      this.k = new fma(this.n.a(fmu.bF));
      this.l = fvu.a(this.n);
   }

   public void a(cmx $$0, cmu $$1, epz $$2, ftf $$3, int $$4, int $$5) {
      cms $$6 = $$0.d();
      if ($$6 instanceof ckq) {
         cwp $$7 = ((ckq)$$6).e();
         if ($$7 instanceof cvl $$8) {
            sn $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? dif.d($$9) : null;
            fls $$11 = this.l.get($$8.b());
            ftn $$12 = fvu.a($$8.b(), $$10);
            fvu.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            djg $$13 = $$7.o();
            dgu $$14;
            if ($$7 instanceof cvg) {
               this.f.a($$0, ((cvg)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof cwi) {
               this.g.a(((cwi)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(cwr.mX)) {
               $$14 = this.h;
            } else if ($$13.a(cwr.cv)) {
               $$14 = this.c;
            } else if ($$13.a(cwr.fG)) {
               $$14 = this.e;
            } else if ($$13.a(cwr.gV)) {
               $$14 = this.d;
            } else if ($$13.a(cwr.tp)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof ddn)) {
                  return;
               }

               cll $$21 = ddn.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cna.vl)) {
            boolean $$25 = ckq.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            ggo $$26 = $$25 ? ggq.g : ggq.h;
            eqd $$27 = $$26.c().a(fzj.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<ih<dgl>, cll>> $$28 = dgk.a(cnu.d($$0), dgk.a($$0));
               fva.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cna.vI)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eqd $$29 = fzj.c($$3, this.k.a(fma.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
