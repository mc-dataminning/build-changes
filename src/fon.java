import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fon implements aou {
   private static final dfe[] a = Arrays.stream(cix.values())
      .sorted(Comparator.comparingInt(cix::a))
      .map($$0 -> new dfe($$0, ht.b, cuc.kP.o()))
      .toArray(dfe[]::new);
   private static final dfe b = new dfe(ht.b, cuc.kP.o());
   private final dee c = new dee(ht.b, cuc.cv.o());
   private final dee d = new dfo(ht.b, cuc.gV.o());
   private final der e = new der(ht.b, cuc.fG.o());
   private final ddn f = new ddn(ht.b, cuc.iJ.o());
   private final ddt g = new ddt(ht.b, cuc.bn.o());
   private final dej h = new dej(ht.b, cuc.mX.o());
   private final dem i = new dem(ht.b, cuc.so.o());
   private fho j;
   private fic k;
   private Map<dba.a, fhu> l;
   private final fqz m;
   private final fis n;

   public fon(fqz $$0, fis $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(aot $$0) {
      this.j = new fho(this.n.a(fiv.bd));
      this.k = new fic(this.n.a(fiv.bC));
      this.l = frp.a(this.n);
   }

   public void a(ckj $$0, ckg $$1, emh $$2, fpb $$3, int $$4, int $$5) {
      cke $$6 = $$0.d();
      if ($$6 instanceof cic) {
         cua $$7 = ((cic)$$6).e();
         if ($$7 instanceof csw $$8) {
            rt $$9 = $$0.v();
            GameProfile $$10 = $$9 != null ? dfh.d($$9) : null;
            fhu $$11 = this.l.get($$8.b());
            fpj $$12 = frp.a($$8.b(), $$10);
            frp.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dgb $$13 = $$7.o();
            ddx $$14;
            if ($$7 instanceof csq) {
               this.f.a($$0, ((csq)$$7).b());
               $$14 = this.f;
            } else if ($$7 instanceof ctt) {
               this.g.a(((ctt)$$7).b());
               $$14 = this.g;
            } else if ($$13.a(cuc.mX)) {
               $$14 = this.h;
            } else if ($$13.a(cuc.cv)) {
               $$14 = this.c;
            } else if ($$13.a(cuc.fG)) {
               $$14 = this.e;
            } else if ($$13.a(cuc.gV)) {
               $$14 = this.d;
            } else if ($$13.a(cuc.so)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof dax)) {
                  return;
               }

               cix $$21 = dax.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(ckm.uy)) {
            boolean $$25 = cic.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            gce $$26 = $$25 ? gcg.g : gcg.h;
            eml $$27 = $$26.c().a(fvb.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<ib<ddo>, cix>> $$28 = ddn.a(clg.d($$0), ddn.a($$0));
               fqv.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(ckm.uV)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            eml $$29 = fvb.c($$3, this.k.a(fic.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
