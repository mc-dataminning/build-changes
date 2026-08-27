import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cyq extends cwc implements ddq {
   public static final MapCodec<cyq> a = b(cyq::new);
   public static final ahg b = new ahg("sherds");
   private static final emm d = cwq.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dkb e = djx.R;
   public static final djy c = djx.bw;
   private static final djy f = djx.C;

   @Override
   public MapCodec<cyq> a() {
      return a;
   }

   protected cyq(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ic.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == ees.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.c_($$2) instanceof dhl $$6) {
         if ($$1.B) {
            return bkb.b;
         } else {
            cmy $$8 = $$3.b($$4);
            cmy $$9 = $$6.x();
            if (!$$8.b() && ($$9.b() || cmy.c($$9, $$8) && $$9.L() < $$9.g())) {
               $$6.a(dhl.b.a);
               $$3.b(asc.c.b($$8.d()));
               cmy $$10 = $$3.f() ? $$8.c(1) : $$8.a(1);
               float $$11;
               if ($$6.ai_()) {
                  $$6.b($$10);
                  $$11 = (float)$$10.L() / (float)$$10.g();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.L() / (float)$$9.g();
               }

               $$1.a(null, $$2, ars.fV, art.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$1 instanceof and $$13) {
                  $$13.a(jx.aU, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$6.e();
            } else {
               $$1.a(null, $$2, ars.fW, art.e, 1.0F, 1.0F);
               $$6.a(dhl.b.b);
            }

            $$1.a($$3, dnr.c, $$2);
            return bkb.a;
         }
      } else {
         return bkb.d;
      }
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, @Nullable bml $$3, cmy $$4) {
      if ($$0.B) {
         $$0.a($$1, dgx.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return d;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhl($$0, $$1);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      bjx.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<cmy> a(djh $$0, ehc.a $$1) {
      dgv $$2 = $$1.b(ejh.h);
      if ($$2 instanceof dhl $$3) {
         $$1.a(b, $$1x -> $$3.m().a().map(cmt::am_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public djh a(ctp $$0, hx $$1, djh $$2, cfi $$3) {
      cmy $$4 = $$3.eT();
      djh $$5 = $$2;
      if ($$4.a(asp.aT) && !crl.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(f) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public dec m(djh $$0) {
      return $$0.c(c) ? dec.bc : dec.bb;
   }

   @Override
   public void a(cmy $$0, @Nullable csv $$1, List<vf> $$2, coq $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhl.a $$4 = dhl.a.b(ckr.a($$0));
      if (!$$4.equals(dhl.a.a)) {
         $$2.add(ve.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cmy($$1x, 1).y().e().a(n.h)));
      }
   }

   @Override
   public void a(ctp $$0, djh $$1, elp $$2, cga $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return $$0.c_($$1) instanceof dhl $$3 ? $$3.w() : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return cib.a($$1.c_($$2));
   }
}
