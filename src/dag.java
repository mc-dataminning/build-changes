import javax.annotation.Nullable;

public class dag extends czn implements beb {
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
   private static final apf k = apf.a();
   private sw l;

   public dag(gu $$0, dcb $$1) {
      super(czp.m, $$0, $$1);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (this.aa()) {
         $$0.a("CustomName", sw.a.a(this.l));
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("CustomName", 8)) {
         this.l = sw.a.a($$0.l("CustomName"));
      }
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, dag $$3) {
      $$3.g = $$3.f;
      $$3.i = $$3.h;
      byo $$4 = $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, 3.0, false);
      if ($$4 != null) {
         double $$5 = $$4.dn() - ((double)$$1.u() + 0.5);
         double $$6 = $$4.dt() - ((double)$$1.w() + 0.5);
         $$3.j = (float)apa.d($$6, $$5);
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
      $$3.f = apa.a($$3.f, 0.0F, 1.0F);
      $$3.a++;
      $$3.c = $$3.b;
      float $$9 = ($$3.d - $$3.b) * 0.4F;
      float $$10 = 0.2F;
      $$9 = apa.a($$9, -0.2F, 0.2F);
      $$3.e = $$3.e + ($$9 - $$3.e) * 0.9F;
      $$3.b = $$3.b + $$3.e;
   }

   @Override
   public sw Z() {
      return (sw)(this.l != null ? this.l : sw.c("container.enchant"));
   }

   public void a(@Nullable sw $$0) {
      this.l = $$0;
   }

   @Nullable
   @Override
   public sw ab() {
      return this.l;
   }
}
