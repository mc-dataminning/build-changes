import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class fjj implements aky {
   private static final dau[] a = Arrays.stream(cen.values())
      .sorted(Comparator.comparingInt(cen::a))
      .map($$0 -> new dau($$0, gu.b, cpo.kP.n()))
      .toArray(dau[]::new);
   private static final dau b = new dau(gu.b, cpo.kP.n());
   private final czu c = new czu(gu.b, cpo.cv.n());
   private final czu d = new dbe(gu.b, cpo.gV.n());
   private final dah e = new dah(gu.b, cpo.fG.n());
   private final czd f = new czd(gu.b, cpo.iJ.n());
   private final czj g = new czj(gu.b, cpo.bn.n());
   private final czz h = new czz(gu.b, cpo.mX.n());
   private final dac i = new dac(gu.b, cpo.so.n());
   private fcw j;
   private fdk k;
   private Map<cwp.a, fdc> l;
   private final flt m;
   private final fea n;

   public fjj(flt $$0, fea $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   @Override
   public void a(akx $$0) {
      this.j = new fcw(this.n.a(fed.bd));
      this.k = new fdk(this.n.a(fed.bC));
      this.l = fmj.a(this.n);
   }

   public void a(cfz $$0, cfw $$1, eij $$2, fjx $$3, int $$4, int $$5) {
      cfu $$6 = $$0.d();
      if ($$6 instanceof cds) {
         cpn $$7 = ((cds)$$6).e();
         if ($$7 instanceof coj) {
            GameProfile $$8 = null;
            if ($$0.u()) {
               qr $$9 = $$0.v();
               if ($$9.b("SkullOwner", 10)) {
                  $$8 = rd.a($$9.p("SkullOwner"));
               } else if ($$9.b("SkullOwner", 8) && !ac.b($$9.l("SkullOwner"))) {
                  $$8 = new GameProfile(null, $$9.l("SkullOwner"));
                  $$9.r("SkullOwner");
                  dax.a($$8, $$1x -> $$9.a("SkullOwner", rd.a(new qr(), $$1x)));
               }
            }

            cwp.a $$10 = ((coj)$$7).a();
            fdc $$11 = this.l.get($$10);
            fkf $$12 = fmj.a($$10, $$8);
            fmj.a(null, 180.0F, 0.0F, $$2, $$3, $$4, $$11, $$12);
         } else {
            dcb $$13 = $$7.n();
            czn $$14;
            if ($$7 instanceof cod) {
               this.f.a($$0, ((cod)$$7).a());
               $$14 = this.f;
            } else if ($$7 instanceof cpg) {
               this.g.a(((cpg)$$7).a());
               $$14 = this.g;
            } else if ($$13.a(cpo.mX)) {
               $$14 = this.h;
            } else if ($$13.a(cpo.cv)) {
               $$14 = this.c;
            } else if ($$13.a(cpo.fG)) {
               $$14 = this.e;
            } else if ($$13.a(cpo.gV)) {
               $$14 = this.d;
            } else if ($$13.a(cpo.so)) {
               this.i.a($$0);
               $$14 = this.i;
            } else {
               if (!($$7 instanceof cwm)) {
                  return;
               }

               cen $$21 = cwm.b($$6);
               if ($$21 == null) {
                  $$14 = b;
               } else {
                  $$14 = a[$$21.a()];
               }
            }

            this.m.a($$14, $$2, $$3, $$4, $$5);
         }
      } else {
         if ($$0.a(cgc.uy)) {
            boolean $$25 = cds.a($$0) != null;
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            fwu $$26 = $$25 ? fww.g : fww.h;
            ein $$27 = $$26.c().a(fpw.c($$3, this.j.a($$26.a()), true, $$0.B()));
            this.j.c().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            if ($$25) {
               List<Pair<he<cze>, cen>> $$28 = czd.a(cgw.d($$0), czd.a($$0));
               flp.a($$2, $$3, $$4, $$5, this.j.b(), $$26, false, $$28, $$0.B());
            } else {
               this.j.b().a($$2, $$27, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            }

            $$2.b();
         } else if ($$0.a(cgc.uV)) {
            $$2.a();
            $$2.b(1.0F, -1.0F, -1.0F);
            ein $$29 = fpw.c($$3, this.k.a(fdk.a), false, $$0.B());
            this.k.a($$2, $$29, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
            $$2.b();
         }
      }
   }
}
