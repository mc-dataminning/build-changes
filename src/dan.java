import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dan extends cvf {
   public static final MapCodec<dan> a = b(dan::new);
   public static final dil<dio> b = did.bf;
   public static final die c = did.w;
   public static final din d = did.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dan> a() {
      return a;
   }

   public dan(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dio.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dhn b(csg $$0, hx $$1, dhn $$2) {
      dio $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dio $$4 = $$0.a_($$1.d()).A();
         dio $$5 = $$4.e() ? dio.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dhn a(cnw $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      boolean $$6 = $$1.o() == ib.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bkv $$0, dhn $$1, csf $$2, hx $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dlx.H, $$3);
      }
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      clo $$6 = $$3.b($$4);
      if ($$6.a(ars.aG) && $$5.b() == ib.b) {
         return bjb.d;
      } else if ($$1.B) {
         return bjb.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(arf.ag);
         return bjb.b;
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cdz $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(arf.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   public boolean a(dhn $$0, csf $$1, hx $$2, int $$3, int $$4) {
      dio $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(jw.V, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ig<aqu> $$10;
      if ($$5.d()) {
         agm $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ig.a(aqu.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, aqw.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private agm a(csf $$0, hx $$1) {
      return $$0.c_($$1.c()) instanceof dgt $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c, d);
   }
}
