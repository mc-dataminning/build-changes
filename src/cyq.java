import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyq extends cut<dgy> implements dcz {
   public static final MapCodec<cyq> b = b(cyq::new);
   public static final djj c = czu.aE;
   public static final djg d = djf.C;
   protected static final elu e = cvz.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final vb f = vb.c("container.enderchest");

   @Override
   public MapCodec<cyq> a() {
      return b;
   }

   protected cyq(dio.d $$0) {
      super($$0, () -> dgf.d);
      this.k(this.E.b().a(c, ia.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public cyg.c<? extends dgk> a(dip $$0, csy $$1, hv $$2, boolean $$3) {
      return cyg.b::b;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return e;
   }

   @Override
   public dce b_(dip $$0) {
      return dce.b;
   }

   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == eea.c));
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      ciw $$6 = $$3.gf();
      dgd $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof dgy) {
         hv $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bjl.a($$1.B);
         } else if ($$1.B) {
            return bjl.a;
         } else {
            dgy $$9 = (dgy)$$7;
            $$6.a($$9);
            $$3.a(new bju(($$1x, $$2x, $$3x) -> chr.a($$1x, $$2x, $$6), f));
            $$3.a(arm.aj);
            cdi.a($$3, true);
            return bjl.b;
         }
      } else {
         return bjl.a($$1.B);
      }
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return $$0.B ? a($$2, dgf.d, dgy::a) : null;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(jv.Z, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c, d);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(d) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      dgd $$4 = $$1.c_($$2);
      if ($$4 instanceof dgy) {
         ((dgy)$$4).c();
      }
   }
}
