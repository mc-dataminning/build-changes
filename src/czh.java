import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czh extends cua {
   public static final MapCodec<czh> a = b(czh::new);
   public static final dgz<dhc> b = dgr.bf;
   public static final dgs c = dgr.w;
   public static final dhb d = dgr.aR;
   public static final int e = 3;

   @Override
   public MapCodec<czh> a() {
      return a;
   }

   public czh(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dhc.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dgb b(cra $$0, ht $$1, dgb $$2) {
      dhc $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dhc $$4 = $$0.a_($$1.d()).A();
         dhc $$5 = $$4.e() ? dhc.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dgb a(cmr $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      boolean $$6 = $$1.o() == hx.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bjt $$0, dgb $$1, cqz $$2, ht $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dkl.H, $$3);
      }
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      ckj $$6 = $$3.b($$4);
      if ($$6.a(ara.aG) && $$5.b() == hx.b) {
         return bib.d;
      } else if ($$1.B) {
         return bib.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(aqn.ag);
         return bib.b;
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ccx $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(aqn.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   public boolean a(dgb $$0, cqz $$1, ht $$2, int $$3, int $$4) {
      dhc $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(js.V, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ib<aqc> $$10;
      if ($$5.d()) {
         afw $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ib.a(aqc.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, aqe.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private afw a(cqz $$0, ht $$1) {
      return $$0.c_($$1.c()) instanceof dfh $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c, d);
   }
}
