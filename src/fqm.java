import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fqm implements apm {
   private static final dgq[] a = Arrays.stream(ckc.values())
      .sorted(Comparator.comparingInt(ckc::a))
      .map($$0 -> new dgq($$0, hx.b, cvh.kP.o()))
      .toArray(dgq[]::new);
   private static final dgq b = new dgq(hx.b, cvh.kP.o());
   private final dfp c = new dfp(hx.b, cvh.cv.o());
   private final dfp d = new dha(hx.b, cvh.gV.o());
   private final dgd e = new dgd(hx.b, cvh.fG.o());
   private final dey f = new dey(hx.b, cvh.iJ.o());
   private final dfe g = new dfe(hx.b, cvh.bn.o());
   private final dfu h = new dfu(hx.b, cvh.mX.o());
   private final dfy i = new dfy(hx.b, cvh.tp.o());
   private fjl j;
   private fjz k;
   private Map<dcg.a, fjr> l;
   private final fsy m;
   private final fkp n;

   public fqm(fsy $$0, fkp $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(apl $$0) {
      this.j = new fjl(this.n.a(fks.bd));
      this.k = new fjz(this.n.a(fks.bC));
      this.l = fto.a(this.n);
   }

   public void a(clo $$0, cll $$1, eob $$2, fqz $$3, int $$4, int $$5) {
      clj $$6 = $$0.d();
      if ($$6 instanceof cjh) {
         cvf $$7 = ((cjh)$$6).e();
         if ($$7 instanceof cub $$8) {
            sd $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? dgt.d($$9) : null;
            fjr $$11 = this.l.get($$8.b());
            frh $$12 = fto.a($$8.b(), $$10);
            fto.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dhn $$13 = $$7.o();
            dfi $$14;
            if ($$7 instanceof ctw) {
               this.f.a($$0, ((ctw)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof cuy) {
               this.g.a(((cuy)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(cvh.mX)) {
               $$14 = this.h;
            } else if ($$13.a(cvh.cv)) {
               $$14 = this.c;
            } else if ($$13.a(cvh.fG)) {
               $$14 = this.e;
            } else if ($$13.a(cvh.gV)) {
               $$14 = this.d;
            } else if ($$13.a(cvh.tp)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof dcd)) {
                  return;
               }

               ckc $$21 = dcd.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(clr.vk)) {
            boolean $$25 = cjh.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            ged $$26 = $$25 ? gef.g : gef.h;
            eof $$27 = $$26.c().a(fxa.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<ig<dez>, ckc>> $$28 = dey.a(cml.d($$0), dey.a($$0));
               fsu.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(clr.vH)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eof $$29 = fxa.c($$3, this.k.a(fjz.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
