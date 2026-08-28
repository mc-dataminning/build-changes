import com.mojang.serialization.MapCodec;

public class dnd extends dix {
   public static final MapCodec<dnd> a = b(dnd::new);
   public static final dur b = duq.s;
   public static final dva e = duq.aA;

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   protected dnd(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(aE, jj.c).b(e, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$3.gd().e) {
         return brk.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return brk.a;
      }
   }

   @Override
   protected int h(dua $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dua a(cyw $$0) {
      dua $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1 == jj.a && !this.b($$3, $$5, $$2)) {
         return dgx.a.o();
      } else {
         return !$$3.w_() && $$1.o() != $$0.c(aE).o() ? $$0.b(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(ddv $$0, je $$1, dua $$2) {
      return this.a((dej)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$0.c(d)) {
         jj $$4 = $$0.c(aE);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(e) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(li.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(aE, e, b, d);
   }
}
