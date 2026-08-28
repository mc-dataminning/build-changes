import javax.annotation.Nullable;

public class dsq extends drv implements brv {
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
   private static final azn k = azn.a();
   @Nullable
   private xe l;

   public dsq(jf $$0, dus $$1) {
      super(drx.m, $$0, $$1);
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      if (this.ak()) {
         $$0.a("CustomName", xe.a.a(this.l, $$1));
      }
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.l = a($$0.l("CustomName"), $$1);
      }
   }

   public static void a(dej $$0, jf $$1, dus $$2, dsq $$3) {
      $$3.g = $$3.f;
      $$3.i = $$3.h;
      cnx $$4 = $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 3.0, false);
      if ($$4 != null) {
         double $$5 = $$4.dx() - ((double)$$1.u() + 0.5);
         double $$6 = $$4.dD() - ((double)$$1.w() + 0.5);
         $$3.j = (float)azf.d($$6, $$5);
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
      $$3.f = azf.a($$3.f, 0.0F, 1.0F);
      $$3.a++;
      $$3.c = $$3.b;
      float $$9 = ($$3.d - $$3.b) * 0.4F;
      float $$10 = 0.2F;
      $$9 = azf.a($$9, -0.2F, 0.2F);
      $$3.e = $$3.e + ($$9 - $$3.e) * 0.9F;
      $$3.b = $$3.b + $$3.e;
   }

   @Override
   public xe aj() {
      return (xe)(this.l != null ? this.l : xe.c("container.enchant"));
   }

   public void a(@Nullable xe $$0) {
      this.l = $$0;
   }

   @Nullable
   @Override
   public xe al() {
      return this.l;
   }

   @Override
   protected void a(drv.b $$0) {
      super.a($$0);
      this.l = $$0.a(ks.g);
   }

   @Override
   protected void a(ko.a $$0) {
      super.a($$0);
      $$0.a(ks.g, this.l);
   }

   @Override
   public void a(ug $$0) {
      $$0.r("CustomName");
   }
}
