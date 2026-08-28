import javax.annotation.Nullable;

public class duu extends dty implements bsm {
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
   private static final azh k = azh.a();
   @Nullable
   private wp l;

   public duu(ji $$0, dww $$1) {
      super(dua.n, $$0, $$1);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (this.l_()) {
         $$0.a("CustomName", wp.a.a(this.l, $$1));
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.l = a($$0.l("CustomName"), $$1);
      }
   }

   public static void a(dgh $$0, ji $$1, dww $$2, duu $$3) {
      $$3.g = $$3.f;
      $$3.i = $$3.h;
      cow $$4 = $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 3.0, false);
      if ($$4 != null) {
         double $$5 = $$4.dA() - ((double)$$1.u() + 0.5);
         double $$6 = $$4.dG() - ((double)$$1.w() + 0.5);
         $$3.j = (float)ayz.d($$6, $$5);
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
      $$3.f = ayz.a($$3.f, 0.0F, 1.0F);
      $$3.a++;
      $$3.c = $$3.b;
      float $$9 = ($$3.d - $$3.b) * 0.4F;
      float $$10 = 0.2F;
      $$9 = ayz.a($$9, -0.2F, 0.2F);
      $$3.e = $$3.e + ($$9 - $$3.e) * 0.9F;
      $$3.b = $$3.b + $$3.e;
   }

   @Override
   public wp al() {
      return (wp)(this.l != null ? this.l : wp.c("container.enchant"));
   }

   public void a(@Nullable wp $$0) {
      this.l = $$0;
   }

   @Nullable
   @Override
   public wp an() {
      return this.l;
   }

   @Override
   protected void a(dty.b $$0) {
      super.a($$0);
      this.l = $$0.a(kv.g);
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.g, this.l);
   }

   @Override
   public void a(tq $$0) {
      $$0.r("CustomName");
   }
}
