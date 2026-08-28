import javax.annotation.Nullable;

public class dzb extends dye implements buw {
   public int a;
   public float b;
   public float c;
   public float d;
   public float e;
   public float f;
   public float g;
   public float h;
   public float i;
   public float j;
   private static final azz k = azz.a();
   @Nullable
   private xc l;

   public dzb(iw $$0, ebg $$1) {
      super(dyg.n, $$0, $$1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (this.h_()) {
         $$0.a("CustomName", xe.a, $$1.a(uo.a), this.l);
      }
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.l = a($$0.a("CustomName"), $$1);
   }

   public static void a(djz $$0, iw $$1, ebg $$2, dzb $$3) {
      $$3.g = $$3.f;
      $$3.i = $$3.h;
      crz $$4 = $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 3.0, false);
      if ($$4 != null) {
         double $$5 = $$4.dA() - ((double)$$1.u() + 0.5);
         double $$6 = $$4.dG() - ((double)$$1.w() + 0.5);
         $$3.j = (float)azq.d($$6, $$5);
         $$3.f += 0.1F;
         if ($$3.f < 0.5F || k.a(40) == 0) {
            float $$7 = $$3.d;

            do {
               $$3.d = $$3.d + (float)(k.a(4) - k.a(4));
            } while ($$7 == $$3.d);
         }
      } else {
         $$3.j += 0.02F;
         $$3.f -= 0.1F;
      }

      while ($$3.h >= (float) Math.PI) {
         $$3.h -= (float) (Math.PI * 2);
      }

      while ($$3.h < (float) -Math.PI) {
         $$3.h += (float) (Math.PI * 2);
      }

      while ($$3.j >= (float) Math.PI) {
         $$3.j -= (float) (Math.PI * 2);
      }

      while ($$3.j < (float) -Math.PI) {
         $$3.j += (float) (Math.PI * 2);
      }

      float $$8 = $$3.j - $$3.h;

      while ($$8 >= (float) Math.PI) {
         $$8 -= (float) (Math.PI * 2);
      }

      while ($$8 < (float) -Math.PI) {
         $$8 += (float) (Math.PI * 2);
      }

      $$3.h += $$8 * 0.4F;
      $$3.f = azq.a($$3.f, 0.0F, 1.0F);
      $$3.a++;
      $$3.c = $$3.b;
      float $$9 = ($$3.d - $$3.b) * 0.4F;
      float $$10 = 0.2F;
      $$9 = azq.a($$9, -0.2F, 0.2F);
      $$3.e = $$3.e + ($$9 - $$3.e) * 0.9F;
      $$3.b = $$3.b + $$3.e;
   }

   @Override
   public xc ai() {
      return (xc)(this.l != null ? this.l : xc.c("container.enchant"));
   }

   public void a(@Nullable xc $$0) {
      this.l = $$0;
   }

   @Nullable
   @Override
   public xc ak() {
      return this.l;
   }

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      this.l = $$0.a(kl.g);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(kl.g, this.l);
   }

   @Override
   public void a(ua $$0) {
      $$0.r("CustomName");
   }
}
