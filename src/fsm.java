import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fsm implements aqd {
   private static final dhw[] a = Arrays.stream(clf.values())
      .sorted(Comparator.comparingInt(clf::a))
      .map($$0 -> new dhw($$0, hx.b, cwl.kP.o()))
      .toArray(dhw[]::new);
   private static final dhw b = new dhw(hx.b, cwl.kP.o());
   private final dgv c = new dgv(hx.b, cwl.cv.o());
   private final dgv d = new dig(hx.b, cwl.gV.o());
   private final dhj e = new dhj(hx.b, cwl.fG.o());
   private final dge f = new dge(hx.b, cwl.iJ.o());
   private final dgk g = new dgk(hx.b, cwl.bn.o());
   private final dha h = new dha(hx.b, cwl.mX.o());
   private final dhe i = new dhe(hx.b, cwl.tp.o());
   private flg j;
   private flu k;
   private Map<ddk.a, flm> l;
   private final fuy m;
   private final fml n;

   public fsm(fuy $$0, fml $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aqc $$0) {
      this.j = new flg(this.n.a(fmo.bg));
      this.k = new flu(this.n.a(fmo.bF));
      this.l = fvo.a(this.n);
   }

   public void a(cmr $$0, cmo $$1, ept $$2, fsz $$3, int $$4, int $$5) {
      cmm $$6 = $$0.d();
      if ($$6 instanceof ckk) {
         cwj $$7 = ((ckk)$$6).e();
         if ($$7 instanceof cvf $$8) {
            sl $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? dhz.d($$9) : null;
            flm $$11 = this.l.get($$8.b());
            fth $$12 = fvo.a($$8.b(), $$10);
            fvo.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dja $$13 = $$7.o();
            dgo $$14;
            if ($$7 instanceof cva) {
               this.f.a($$0, ((cva)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof cwc) {
               this.g.a(((cwc)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(cwl.mX)) {
               $$14 = this.h;
            } else if ($$13.a(cwl.cv)) {
               $$14 = this.c;
            } else if ($$13.a(cwl.fG)) {
               $$14 = this.e;
            } else if ($$13.a(cwl.gV)) {
               $$14 = this.d;
            } else if ($$13.a(cwl.tp)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof ddh)) {
                  return;
               }

               clf $$21 = ddh.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cmu.vl)) {
            boolean $$25 = ckk.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            ggj $$26 = $$25 ? ggl.g : ggl.h;
            epx $$27 = $$26.c().a(fzd.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<ih<dgf>, clf>> $$28 = dge.a(cno.d($$0), dge.a($$0));
               fuu.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cmu.vI)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            epx $$29 = fzd.c($$3, this.k.a(flu.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
