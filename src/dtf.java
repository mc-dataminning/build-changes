import com.mojang.serialization.MapCodec;

public class dtf extends dou {
   public static final MapCodec<dtf> a = b(dtf::new);
   public static final ebk b = ebj.v;
   public static final ebt d = ebj.aD;

   @Override
   public MapCodec<dtf> a() {
      return a;
   }

   protected dtf(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jb.c).b(d, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$3.gj().e) {
         return bug.e;
      } else {
         $$1.a($$2, $$0.a(d), 3);
         return bug.a;
      }
   }

   @Override
   protected int h(eat $$0) {
      return $$0.c(d) * 2;
   }

   @Override
   public eat a(ddg $$0) {
      eat $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.b($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$4 == jb.a && !this.a($$1, $$5, $$6)) {
         return dmt.a.m();
      } else {
         return !$$1.w_() && $$4.o() != $$0.c(e).o() ? $$0.b(b, Boolean.valueOf(this.b($$1, $$3, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(djp $$0, iv $$1, eat $$2) {
      return this.a((dke)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$0.c(c)) {
         jb $$4 = $$0.c(e);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(d) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(lt.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(e, d, b, c);
   }
}
