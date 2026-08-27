import com.mojang.serialization.MapCodec;

public class deq extends dgk implements dhc {
   public static final MapCodec<deq> b = b(deq::new);
   public static final dns c = dnr.C;
   public static final dns d = dnr.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<deq> a() {
      return b;
   }

   public deq(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dnb a(csu $$0) {
      eip $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eiq.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(c) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dnb $$0, cxb $$1, ib $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dnb $$0, cxb $$1, ib $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$1.aa() && (long)$$1.z.a(200) <= $$1.X() % 200L && $$2.v() == $$1.a(dso.a.b, $$2.u(), $$2.w()) - 1) {
         awz.a($$0.c(a).o(), $$1, $$2, 0.125, kc.aR, bmo.a(1, 2));
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(cxb $$0, dnb $$1, epp $$2, cjm $$3) {
      if ($$0.aa() && $$3 instanceof cjz && ((cjz)$$3).J()) {
         ib $$4 = $$2.a();
         if ($$0.h($$4)) {
            bpo $$5 = bpd.am.a($$0);
            if ($$5 != null) {
               $$5.e(ept.c($$4.c()));
               box $$6 = $$3.af_();
               $$5.b($$6 instanceof apg ? (apg)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, aty.zi, atz.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dnb $$0) {
      return true;
   }
}
