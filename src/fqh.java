import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fqh implements api {
   private static final dgl[] a = Arrays.stream(cjx.values())
      .sorted(Comparator.comparingInt(cjx::a))
      .map($$0 -> new dgl($$0, ht.b, cvc.kP.o()))
      .toArray(dgl[]::new);
   private static final dgl b = new dgl(ht.b, cvc.kP.o());
   private final dfk c = new dfk(ht.b, cvc.cv.o());
   private final dfk d = new dgv(ht.b, cvc.gV.o());
   private final dfy e = new dfy(ht.b, cvc.fG.o());
   private final det f = new det(ht.b, cvc.iJ.o());
   private final dez g = new dez(ht.b, cvc.bn.o());
   private final dfp h = new dfp(ht.b, cvc.mX.o());
   private final dft i = new dft(ht.b, cvc.tp.o());
   private fjg j;
   private fju k;
   private Map<dcb.a, fjm> l;
   private final fst m;
   private final fkk n;

   public fqh(fst $$0, fkk $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aph $$0) {
      this.j = new fjg(this.n.a(fkn.bd));
      this.k = new fju(this.n.a(fkn.bC));
      this.l = ftj.a(this.n);
   }

   public void a(clj $$0, clg $$1, enw $$2, fqu $$3, int $$4, int $$5) {
      cle $$6 = $$0.d();
      if ($$6 instanceof cjc) {
         cva $$7 = ((cjc)$$6).e();
         if ($$7 instanceof ctw $$8) {
            rz $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? dgo.d($$9) : null;
            fjm $$11 = this.l.get($$8.b());
            frc $$12 = ftj.a($$8.b(), $$10);
            ftj.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dhi $$13 = $$7.o();
            dfd $$14;
            if ($$7 instanceof ctr) {
               this.f.a($$0, ((ctr)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof cut) {
               this.g.a(((cut)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(cvc.mX)) {
               $$14 = this.h;
            } else if ($$13.a(cvc.cv)) {
               $$14 = this.c;
            } else if ($$13.a(cvc.fG)) {
               $$14 = this.e;
            } else if ($$13.a(cvc.gV)) {
               $$14 = this.d;
            } else if ($$13.a(cvc.tp)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof dby)) {
                  return;
               }

               cjx $$21 = dby.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(clm.vk)) {
            boolean $$25 = cjc.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gdy $$26 = $$25 ? gea.g : gea.h;
            eoa $$27 = $$26.c().a(fwv.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<ib<deu>, cjx>> $$28 = det.a(cmg.d($$0), det.a($$0));
               fsp.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(clm.vH)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eoa $$29 = fwv.c($$3, this.k.a(fju.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
