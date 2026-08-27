import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dab extends cut {
   public static final MapCodec<dab> a = b(dab::new);
   public static final dhu<dhx> b = dhm.bf;
   public static final dhn c = dhm.w;
   public static final dhw d = dhm.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dab> a() {
      return a;
   }

   public dab(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dhx.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dgw b(crt $$0, ht $$1, dgw $$2) {
      dhx $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dhx $$4 = $$0.a_($$1.d()).A();
         dhx $$5 = $$4.e() ? dhx.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dgw a(cnj $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      boolean $$6 = $$1.o() == hx.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bki $$0, dgw $$1, crs $$2, ht $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dlg.H, $$3);
      }
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      clb $$6 = $$3.b($$4);
      if ($$6.a(ark.aG) && $$5.b() == hx.b) {
         return biq.d;
      } else if ($$1.B) {
         return biq.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(aqx.ag);
         return biq.b;
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cdm $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(aqx.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   public boolean a(dgw $$0, crs $$1, ht $$2, int $$3, int $$4) {
      dhx $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(js.V, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ib<aqm> $$10;
      if ($$5.d()) {
         agg $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ib.a(aqm.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, aqo.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private agg a(crs $$0, ht $$1) {
      return $$0.c_($$1.c()) instanceof dgc $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c, d);
   }
}
