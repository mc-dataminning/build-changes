import com.mojang.serialization.MapCodec;

public class dan extends dch implements dcz {
   public static final MapCodec<dan> b = b(dan::new);
   public static final djg c = djf.C;
   public static final djg d = djf.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dan> a() {
      return b;
   }

   public dan(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ia.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eea.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(c) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dip $$0, csy $$1, hv $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dip $$0, csy $$1, hv $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$1.Z() && (long)$$1.z.a(200) <= $$1.W() % 200L && $$2.v() == $$1.a(dny.a.b, $$2.u(), $$2.w()) - 1) {
         aub.a($$0.c(a).o(), $$1, $$2, 0.125, jv.aQ, biw.a(1, 2));
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.M().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(csy $$0, dip $$1, ekx $$2, cfj $$3) {
      if ($$0.Z() && $$3 instanceof cfv && ((cfv)$$3).M()) {
         hv $$4 = $$2.a();
         if ($$0.g($$4)) {
            blu $$5 = blj.aj.a($$0);
            if ($$5 != null) {
               $$5.e(elb.c($$4.c()));
               blf $$6 = $$3.w();
               $$5.b($$6 instanceof amq ? (amq)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, arc.yK, ard.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }
}
