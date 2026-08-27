import javax.annotation.Nullable;

public class dds extends dcz implements bhi {
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
   private static final ash k = ash.a();
   private tl l;

   public dds(gw $$0, dfd $$1) {
      super(ddb.m, $$0, $$1);
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      if (this.ac()) {
         $$0.a("CustomName", tl.a.a(this.l));
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.l = tl.a.a($$0.l("CustomName"));
      }
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, dds $$3) {
      $$3.g = $$3.f;
      $$3.i = $$3.h;
      cca $$4 = $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 3.0, false);
      if ($$4 != null) {
         double $$5 = $$4.dq() - ((double)$$1.u() + 0.5);
         double $$6 = $$4.dw() - ((double)$$1.w() + 0.5);
         $$3.j = (float)asb.d($$6, $$5);
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
      $$3.f = asb.a($$3.f, 0.0F, 1.0F);
      $$3.a++;
      $$3.c = $$3.b;
      float $$9 = ($$3.d - $$3.b) * 0.4F;
      float $$10 = 0.2F;
      $$9 = asb.a($$9, -0.2F, 0.2F);
      $$3.e = $$3.e + ($$9 - $$3.e) * 0.9F;
      $$3.b = $$3.b + $$3.e;
   }

   @Override
   public tl ab() {
      return (tl)(this.l != null ? this.l : tl.c("container.enchant"));
   }

   public void a(@Nullable tl $$0) {
      this.l = $$0;
   }

   @Nullable
   @Override
   public tl ad() {
      return this.l;
   }
}
