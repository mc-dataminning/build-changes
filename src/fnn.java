import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fnn implements anx {
   private static final deg[] a = Arrays.stream(chz.values())
      .sorted(Comparator.comparingInt(chz::a))
      .map($$0 -> new deg($$0, gw.b, cte.kP.o()))
      .toArray(deg[]::new);
   private static final deg b = new deg(gw.b, cte.kP.o());
   private final ddg c = new ddg(gw.b, cte.cv.o());
   private final ddg d = new deq(gw.b, cte.gV.o());
   private final ddt e = new ddt(gw.b, cte.fG.o());
   private final dcp f = new dcp(gw.b, cte.iJ.o());
   private final dcv g = new dcv(gw.b, cte.bn.o());
   private final ddl h = new ddl(gw.b, cte.mX.o());
   private final ddo i = new ddo(gw.b, cte.so.o());
   private fgp j;
   private fhd k;
   private Map<dac.a, fgv> l;
   private final fpz m;
   private final fht n;

   public fnn(fpz $$0, fht $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(anw $$0) {
      this.j = new fgp(this.n.a(fhw.bd));
      this.k = new fhd(this.n.a(fhw.bC));
      this.l = fqp.a(this.n);
   }

   public void a(cjl $$0, cji $$1, elj $$2, foa $$3, int $$4, int $$5) {
      cjg $$6 = $$0.d();
      if ($$6 instanceof che) {
         ctc $$7 = ((che)$$6).e();
         if ($$7 instanceof cry $$8) {
            qw $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? dej.d($$9) : null;
            fgv $$11 = this.l.get($$8.b());
            foi $$12 = fqp.a($$8.b(), $$10);
            fqp.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dfd $$13 = $$7.o();
            dcz $$14;
            if ($$7 instanceof crs) {
               this.f.a($$0, ((crs)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof csv) {
               this.g.a(((csv)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(cte.mX)) {
               $$14 = this.h;
            } else if ($$13.a(cte.cv)) {
               $$14 = this.c;
            } else if ($$13.a(cte.fG)) {
               $$14 = this.e;
            } else if ($$13.a(cte.gV)) {
               $$14 = this.d;
            } else if ($$13.a(cte.so)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof czz)) {
                  return;
               }

               chz $$21 = czz.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cjo.uy)) {
            boolean $$25 = che.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gbe $$26 = $$25 ? gbg.g : gbg.h;
            eln $$27 = $$26.c().a(fub.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<he<dcq>, chz>> $$28 = dcp.a(cki.d($$0), dcp.a($$0));
               fpv.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cjo.uV)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eln $$29 = fub.c($$3, this.k.a(fhd.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
