import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dea extends cys {
   public static final MapCodec<dea> a = b(dea::new);
   public static final dmh<dmk> b = dlz.bf;
   public static final dma c = dlz.w;
   public static final dmj d = dlz.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   public dea(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dmk.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dlj b(cvs $$0, hz $$1, dlj $$2) {
      dmk $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dmk $$4 = $$0.a_($$1.d()).A();
         dmk $$5 = $$4.e() ? dmk.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dlj a(crk $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      boolean $$6 = $$1.o() == ie.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bnq $$0, dlj $$1, cvr $$2, hz $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dpw.H, $$3);
      }
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      return $$0.a(aui.aG) && $$6.b() == ie.b ? bly.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(atv.ag);
         return blw.b;
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, chl $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(atv.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dlj $$0, cvr $$1, hz $$2, int $$3, int $$4) {
      dmk $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(jz.X, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ij<atk> $$10;
      if ($$5.d()) {
         aiy $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ij.a(atk.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, atm.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private aiy a(cvr $$0, hz $$1) {
      return $$0.c_($$1.c()) instanceof dki $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c, d);
   }
}
