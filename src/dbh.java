import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbh extends cvz {
   public static final MapCodec<dbh> a = b(dbh::new);
   public static final djn<djq> b = djf.bf;
   public static final djg c = djf.w;
   public static final djp d = djf.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dbh> a() {
      return a;
   }

   public dbh(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, djq.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dip b(csz $$0, hv $$1, dip $$2) {
      djq $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         djq $$4 = $$0.a_($$1.d()).A();
         djq $$5 = $$4.e() ? djq.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dip a(coq $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      boolean $$6 = $$1.o() == ia.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable blf $$0, dip $$1, csy $$2, hv $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dmz.H, $$3);
      }
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      cmh $$6 = $$3.b($$4);
      if ($$6.a(arz.aG) && $$5.b() == ia.b) {
         return bjl.d;
      } else if ($$1.B) {
         return bjl.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(arm.ag);
         return bjl.b;
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cer $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(arm.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   public boolean a(dip $$0, csy $$1, hv $$2, int $$3, int $$4) {
      djq $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(jv.X, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ie<arb> $$10;
      if ($$5.d()) {
         agt $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ie.a(arb.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, ard.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private agt a(csy $$0, hv $$1) {
      return $$0.c_($$1.c()) instanceof dho $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c, d);
   }
}
