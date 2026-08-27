import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddw extends cyo {
   public static final MapCodec<ddw> a = b(ddw::new);
   public static final dmd<dmg> b = dlv.bf;
   public static final dlw c = dlv.w;
   public static final dmf d = dlv.aR;
   public static final int e = 3;

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   public ddw(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dmg.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dlf b(cvo $$0, hz $$1, dlf $$2) {
      dmg $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dmg $$4 = $$0.a_($$1.d()).A();
         dmg $$5 = $$4.e() ? dmg.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dlf a(crg $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      boolean $$6 = $$1.o() == ie.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3, hz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bno $$0, dlf $$1, cvn $$2, hz $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dpp.H, $$3);
      }
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      return $$0.a(auh.aG) && $$6.b() == ie.b ? blw.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         return blu.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(atu.ag);
         return blu.b;
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, chh $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(atu.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dlf $$0, cvn $$1, hz $$2, int $$3, int $$4) {
      dmg $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(jz.X, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ij<atj> $$10;
      if ($$5.d()) {
         aiy $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ij.a(atj.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, atl.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private aiy a(cvn $$0, hz $$1) {
      return $$0.c_($$1.c()) instanceof dke $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c, d);
   }
}
