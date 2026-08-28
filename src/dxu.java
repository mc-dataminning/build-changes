import javax.annotation.Nullable;

public class dxu extends dwx implements bue {
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
   private static final azv k = azv.a();
   @Nullable
   private wy l;

   public dxu(iu $$0, dzz $$1) {
      super(dwz.n, $$0, $$1);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (this.h_()) {
         $$0.a("CustomName", xa.a, $$1.a(un.a), this.l);
      }
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("CustomName")) {
         this.l = a($$0.c("CustomName"), $$1);
      }
   }

   public static void a(div $$0, iu $$1, dzz $$2, dxu $$3) {
      $$3.g = $$3.f;
      $$3.i = $$3.h;
      cqy $$4 = $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 3.0, false);
      if ($$4 != null) {
         double $$5 = $$4.dA() - ((double)$$1.u() + 0.5);
         double $$6 = $$4.dG() - ((double)$$1.w() + 0.5);
         $$3.j = (float)azm.d($$6, $$5);
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
      $$3.f = azm.a($$3.f, 0.0F, 1.0F);
      $$3.a++;
      $$3.c = $$3.b;
      float $$9 = ($$3.d - $$3.b) * 0.4F;
      float $$10 = 0.2F;
      $$9 = azm.a($$9, -0.2F, 0.2F);
      $$3.e = $$3.e + ($$9 - $$3.e) * 0.9F;
      $$3.b = $$3.b + $$3.e;
   }

   @Override
   public wy al() {
      return (wy)(this.l != null ? this.l : wy.c("container.enchant"));
   }

   public void a(@Nullable wy $$0) {
      this.l = $$0;
   }

   @Nullable
   @Override
   public wy an() {
      return this.l;
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.l = $$0.a(kj.g);
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.g, this.l);
   }

   @Override
   public void a(tz $$0) {
      $$0.r("CustomName");
   }
}
